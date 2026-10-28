package studio.vaif.sdk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static studio.vaif.sdk.TestSupport.client;
import static studio.vaif.sdk.TestSupport.fails;
import static studio.vaif.sdk.TestSupport.response;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.junit.jupiter.api.Test;
import studio.vaif.sdk.TestSupport.FakeTransport;
import studio.vaif.sdk.TestSupport.MemoryStore;

class AuthTest {
  private static final String EXPIRED = "{\"error\":\"UNAUTHORIZED\",\"code\":\"TOKEN_EXPIRED\"}";

  @Test
  void platformConsoleActionsAreRefusedBeforeAnyRequest() {
    FakeTransport transport = new FakeTransport();
    VaifClient platform = VaifClient.builder().transport(transport).build();
    OperationRequest body = OperationRequest.builder().body(Map.of()).build();

    ConsoleOnlyException signUp =
        (ConsoleOnlyException) fails("CONSOLE_ONLY", () -> platform.auth().signUp("e", "pw"));
    assertEquals("https://console.vaif.studio/register", signUp.getConsoleUrl());
    fails("CONSOLE_ONLY", () -> platform.auth().requestPasswordReset("e"));
    fails("CONSOLE_ONLY", () -> platform.auth().confirmPasswordReset("t", "pw"));
    fails("CONSOLE_ONLY", () -> platform.operations().postAuthSignup(body));
    fails("CONSOLE_ONLY", () -> platform.operations().postAuthForgotPassword(body));
    fails("CONSOLE_ONLY", () -> platform.operations().postAuthResetPassword(body));
    assertEquals(0, transport.requests.size());
  }

  @Test
  void signInInstallsTheSessionAndSendsItsBearer() {
    FakeTransport transport = new FakeTransport();
    VaifClient client = client(transport);
    transport.answer(
        200,
        "{\"accessToken\":\"user\",\"refreshToken\":\"refresh\",\"expiresIn\":3600,"
            + "\"user\":{\"id\":\"u\"}}");

    AuthResult result = client.auth().signIn("u@example.test", "pw");

    assertEquals("user", result.getAccessToken());
    assertEquals("refresh", result.getRefreshToken());
    assertEquals(3600L, result.getExpiresIn());
    assertEquals(Map.of("id", "u"), result.getUser());
    assertEquals(new Session("user", "refresh"), client.auth().getSession());
    assertEquals("/projects/p%20%2F%3F/auth/login", transport.request(0).getUri().getRawPath());
    assertEquals("body", transport.request(0).getHeaders().get("X-Vaif-Refresh-Mode"));

    transport.answer(200, "{\"data\":[]}");
    client.from("notes").list();
    assertEquals("Bearer user", transport.request(1).getHeaders().get("Authorization"));
    assertEquals("service-secret", transport.request(1).getHeaders().get("x-vaif-key"));

    transport.answer(200, "{}");
    client.setAuth(null);
    client.from("notes").list();
    assertFalse(transport.request(2).getHeaders().containsKey("Authorization"));
  }

  @Test
  void tokenSupplierRunsForEachRequestUntilAuthIsSet() {
    FakeTransport transport = new FakeTransport();
    AtomicInteger calls = new AtomicInteger();
    VaifClient client =
        VaifClient.builder()
            .transport(transport)
            .accessToken(() -> "t" + calls.incrementAndGet())
            .build();

    transport.answer(200, "{}");
    client.auth().getUser();
    transport.answer(200, "{}");
    client.auth().getUser();
    assertEquals("Bearer t1", transport.request(0).getHeaders().get("Authorization"));
    assertEquals("Bearer t2", transport.request(1).getHeaders().get("Authorization"));

    client.setAuth(null);
    transport.answer(200, "{}");
    client.auth().getUser();
    assertEquals(2, calls.get());
    assertFalse(transport.request(2).getHeaders().containsKey("Authorization"));

    client.useConfiguredAuth();
    transport.answer(200, "{}");
    client.auth().getUser();
    assertEquals("Bearer t3", transport.request(3).getHeaders().get("Authorization"));
  }

  @Test
  void tokenSupplierRunsOutsideTheClientMonitor() {
    FakeTransport transport = new FakeTransport();
    AtomicReference<VaifClient> reference = new AtomicReference<>();
    VaifClient client =
        VaifClient.builder()
            .transport(transport)
            .accessToken(
                () -> {
                  assertFalse(Thread.holdsLock(reference.get()));
                  return "external";
                })
            .build();
    reference.set(client);
    transport.answer(200, "{}");
    client.auth().getUser();
    assertEquals("Bearer external", transport.request(0).getHeaders().get("Authorization"));
  }

  @Test
  void mfaChallengeInstallsNothingUntilVerified() {
    FakeTransport transport = new FakeTransport();
    VaifClient client = client(transport);
    transport.answer(200, "{\"mfaRequired\":true,\"challengeToken\":\"challenge\"}");

    AuthResult challenge = client.auth().signIn("e", "pw");
    assertTrue(challenge.isMfaRequired());
    assertNull(challenge.getAccessToken());
    assertNull(client.auth().getSession());

    transport.answer(200, "{\"accessToken\":\"user\",\"refreshToken\":\"r2\"}");
    client.auth().verifyMfa(challenge.getChallengeToken(), "123456");
    assertEquals(Map.of("challengeToken", "challenge", "code", "123456"), transport.jsonBody(1));
    assertEquals(new Session("user", "r2"), client.auth().getSession());

    transport.answer(200, "{\"accessToken\":\"next\",\"refreshToken\":\"r3\"}");
    client.auth().refresh("r2");
    assertEquals("body", transport.request(2).getHeaders().get("X-Vaif-Refresh-Mode"));
    assertEquals("r2", transport.jsonBody(2).get("refreshToken"));
    assertEquals(new Session("next", "r3"), client.auth().getSession());

    transport.answer(204, "");
    client.auth().signOut("r3");
    assertEquals("/projects/p%20%2F%3F/auth/logout", transport.request(3).getUri().getRawPath());
    assertEquals("Bearer next", transport.request(3).getHeaders().get("Authorization"));
    assertEquals("r3", transport.jsonBody(3).get("refreshToken"));
    assertNull(client.auth().getSession());
  }

  @Test
  void sessionsArePersistedPerOriginAndProject() throws IOException {
    MemoryStore store = new MemoryStore();
    FakeTransport transport = new FakeTransport();
    VaifClient client =
        VaifClient.builder()
            .baseUrl("https://one.example.test")
            .projectId("p")
            .sessionStore(store)
            .transport(transport)
            .build();
    client.auth().setSession(new Session("old", "refresh"));

    assertEquals("https://one.example.test:443\nproject:p", client.sessionKey());
    assertEquals(
        new Session("old", "refresh"),
        VaifClient.builder()
            .baseUrl("HTTPS://ONE.example.test:443")
            .projectId("p")
            .sessionStore(store)
            .build()
            .auth()
            .getSession());
    assertNull(
        VaifClient.builder()
            .baseUrl("https://two.example.test")
            .projectId("p")
            .sessionStore(store)
            .build()
            .auth()
            .getSession());
    assertNull(
        VaifClient.builder()
            .baseUrl("https://one.example.test")
            .projectId("other")
            .sessionStore(store)
            .build()
            .auth()
            .getSession());
  }

  @Test
  void aSessionThatCannotBeSavedLeavesNoRestorableSession() throws IOException {
    MemoryStore store = new MemoryStore();
    FakeTransport transport = new FakeTransport();
    VaifClient client =
        VaifClient.builder().projectId("p").sessionStore(store).transport(transport).build();
    client.auth().setSession(new Session("old", "refresh"));

    store.failSave = true;
    fails("SESSION_STORAGE_ERROR", () -> client.auth().setSession(new Session("new", "next")));
    assertNull(client.auth().getSession());
    assertNull(store.load(client.sessionKey()));

    store.failSave = false;
    store.failAfterSave = true;
    fails("SESSION_STORAGE_ERROR", () -> client.auth().setSession(new Session("partial", "write")));
    assertNull(client.auth().getSession());
    assertNull(store.load(client.sessionKey()));

    store.failAfterSave = false;
    client.auth().setSession(new Session("old-again", "refresh-again"));
    store.failSave = true;
    transport.answer(200, "{\"accessToken\":\"new-login\",\"refreshToken\":\"new-refresh\"}");
    fails("SESSION_STORAGE_ERROR", () -> client.auth().signIn("user@example.test", "password"));
    assertNull(client.auth().getSession());
    assertNull(store.load(client.sessionKey()));
  }

  @Test
  void signOutRevokesWithTheRefreshTokenAndReportsStorageFailure() throws IOException {
    MemoryStore store = new MemoryStore();
    FakeTransport transport = new FakeTransport();
    VaifClient client =
        VaifClient.builder().projectId("p").sessionStore(store).transport(transport).build();
    client.auth().setSession(new Session("expired-access", "refresh-secret"));

    transport.answer(200, "{}");
    client.auth().signOut();
    assertEquals("refresh-secret", transport.jsonBody(0).get("refreshToken"));
    assertEquals("Bearer expired-access", transport.request(0).getHeaders().get("Authorization"));
    assertNull(client.auth().getSession());
    assertNull(store.load(client.sessionKey()));

    client.auth().setSession(new Session("access", "refresh"));
    store.failClear = true;
    transport.answer(200, "{}");
    fails("SESSION_STORAGE_ERROR", () -> client.auth().signOut());
    assertEquals(2, transport.requests.size());
    assertEquals("refresh", transport.jsonBody(1).get("refreshToken"));
    assertNull(client.auth().getSession());
  }

  @Test
  void signOutWithoutAnAccessTokenSendsNoAuthorizationHeader() {
    FakeTransport transport = new FakeTransport();
    VaifClient client = client(transport);
    transport.answer(200, "{}");

    client.auth().signOut("refresh-only");

    assertFalse(transport.request(0).getHeaders().containsKey("Authorization"));
    assertEquals("refresh-only", transport.jsonBody(0).get("refreshToken"));
  }

  @Test
  void refreshFinishingAfterReplacementInstallsNothing() throws Exception {
    CountDownLatch started = new CountDownLatch(1);
    CountDownLatch finish = new CountDownLatch(1);
    MemoryStore store = new MemoryStore();
    Transport transport =
        request -> {
          started.countDown();
          if (!finish.await(5, TimeUnit.SECONDS)) {
            throw new IOException("test timeout");
          }
          return response(200, Map.of("accessToken", "late", "refreshToken", "late-refresh"));
        };
    VaifClient client =
        VaifClient.builder().projectId("p").sessionStore(store).transport(transport).build();
    client.auth().setSession(new Session("old", "old-refresh"));
    CompletableFuture<AuthResult> refresh =
        CompletableFuture.supplyAsync(() -> client.auth().refresh("old-refresh"));
    try {
      assertTrue(started.await(5, TimeUnit.SECONDS));
      client.auth().setSession(new Session("replacement", "replacement-refresh"));
      finish.countDown();
      assertEquals("late", refresh.get(5, TimeUnit.SECONDS).getAccessToken());
      assertEquals(new Session("replacement", "replacement-refresh"), client.auth().getSession());
      assertEquals(
          new Session("replacement", "replacement-refresh"), store.load(client.sessionKey()));
    } finally {
      finish.countDown();
    }
  }

  @Test
  void concurrentRequestsShareOneRefreshAndBothRetry() throws Exception {
    CountDownLatch refused = new CountDownLatch(2);
    AtomicInteger refreshes = new AtomicInteger();
    AtomicInteger retries = new AtomicInteger();
    VaifClient client =
        VaifClient.builder()
            .projectId("p")
            .transport(
                request -> {
                  if (request.getUri().getPath().equals("/projects/p/auth/refresh")) {
                    refreshes.incrementAndGet();
                    assertEquals(
                        "r1", Json.object(Json.parse(request.getBody())).get("refreshToken"));
                    return response(200, Map.of("accessToken", "a2", "refreshToken", "r2"));
                  }
                  if ("Bearer a1".equals(request.getHeaders().get("Authorization"))) {
                    refused.countDown();
                    assertTrue(refused.await(5, TimeUnit.SECONDS));
                    return response(401, Map.of("error", "UNAUTHORIZED", "code", "TOKEN_EXPIRED"));
                  }
                  assertEquals("Bearer a2", request.getHeaders().get("Authorization"));
                  retries.incrementAndGet();
                  return response(200, Map.of());
                })
            .build();
    client.auth().setSession(new Session("a1", "r1"));
    ExecutorService pool = Executors.newFixedThreadPool(2);
    try {
      Future<?> one = pool.submit(() -> client.from("notes").list());
      Future<?> two = pool.submit(() -> client.from("notes").list());
      one.get(5, TimeUnit.SECONDS);
      two.get(5, TimeUnit.SECONDS);
      assertEquals(1, refreshes.get());
      assertEquals(2, retries.get());
      assertEquals(new Session("a2", "r2"), client.auth().getSession());
    } finally {
      pool.shutdownNow();
    }
  }

  @Test
  void signOutWaitsForARefreshAndRevokesItsResult() throws Exception {
    CountDownLatch started = new CountDownLatch(1);
    CountDownLatch finish = new CountDownLatch(1);
    AtomicReference<Transport.Request> logout = new AtomicReference<>();
    VaifClient client =
        VaifClient.builder()
            .projectId("p")
            .transport(
                request -> {
                  if (request.getUri().getPath().endsWith("/refresh")) {
                    started.countDown();
                    assertTrue(finish.await(5, TimeUnit.SECONDS));
                    return response(
                        200, Map.of("accessToken", "late", "refreshToken", "late-refresh"));
                  }
                  logout.set(request);
                  return response(200, Map.of());
                })
            .build();
    client.auth().setSession(new Session("old", "old-refresh"));
    ExecutorService pool = Executors.newFixedThreadPool(2);
    try {
      Future<?> refresh = pool.submit(() -> client.auth().refresh("old-refresh"));
      assertTrue(started.await(5, TimeUnit.SECONDS));
      Future<?> signOut = pool.submit(() -> client.auth().signOut());
      // Sign-out must not capture the credentials the refresh is rotating.
      Thread.sleep(100);
      assertNull(logout.get());
      finish.countDown();
      refresh.get(5, TimeUnit.SECONDS);
      signOut.get(5, TimeUnit.SECONDS);
      assertEquals(
          "late-refresh", Json.object(Json.parse(logout.get().getBody())).get("refreshToken"));
      assertEquals("Bearer late", logout.get().getHeaders().get("Authorization"));
      assertNull(client.auth().getSession());
    } finally {
      finish.countDown();
      pool.shutdownNow();
    }
  }

  @Test
  void platformSessionsUseTheNonBrowserContract() {
    FakeTransport transport = new FakeTransport();
    VaifClient platform = VaifClient.builder().transport(transport).build();

    transport.answer(
        200,
        "{\"ok\":true,\"accessToken\":\"cli-access\",\"refreshToken\":\"cli-refresh\","
            + "\"expiresIn\":2592000,\"user\":{\"id\":\"u\"}}");
    assertEquals("cli-refresh", platform.auth().signIn("e", "pw").getRefreshToken());
    assertEquals("/auth/cli/login", transport.request(0).getUri().getPath());
    assertFalse(transport.request(0).getHeaders().containsKey("X-Vaif-Refresh-Mode"));

    transport.answer(
        200,
        Map.of("Set-Cookie", "refresh_token=; Max-Age=0, refresh_token=rotated; HttpOnly; Path=/"),
        "{\"ok\":true,\"accessToken\":\"fresh\",\"expiresIn\":900,\"user\":{\"id\":\"u\"}}");
    platform.auth().refresh("cli-refresh");
    assertEquals("/auth/refresh", transport.request(1).getUri().getPath());
    assertEquals("refresh_token=cli-refresh", transport.request(1).getHeaders().get("Cookie"));
    assertEquals(new Session("fresh", "rotated"), platform.auth().getSession());

    transport.answer(200, "{}");
    platform.auth().signOut();
    assertEquals("/auth/logout", transport.request(2).getUri().getPath());
    assertEquals("refresh_token=rotated", transport.request(2).getHeaders().get("Cookie"));
    assertEquals("Bearer fresh", transport.request(2).getHeaders().get("Authorization"));

    transport.answer(200, "{\"mfaRequired\":true,\"challengeToken\":\"cli-challenge\"}");
    assertTrue(platform.auth().signIn("e", "pw").isMfaRequired());
    transport.answer(
        200, "{\"ok\":true,\"accessToken\":\"mfa-access\",\"refreshToken\":\"mfa-refresh\"}");
    platform.auth().verifyMfa("cli-challenge", "123456");
    assertEquals("/auth/mfa/verify", transport.request(4).getUri().getPath());
    assertEquals(new Session("mfa-access", "mfa-refresh"), platform.auth().getSession());
  }

  @Test
  void resourcesNamedAuthStillRefresh() {
    for (boolean function : List.of(false, true)) {
      FakeTransport transport = new FakeTransport();
      VaifClient client = client(transport);
      client.auth().setSession(new Session("old", "refresh"));
      transport.answer(401, EXPIRED);
      transport.answer(200, "{\"accessToken\":\"fresh\",\"refreshToken\":\"next\"}");
      transport.answer(200, "{}");

      if (function) {
        client.functions().invoke("auth", Map.of());
      } else {
        client.from("auth").get("1");
      }

      assertEquals(3, transport.requests.size());
      assertEquals(
          function ? "/functions/auth/invoke" : "/v1/data/p%20%2F%3F/auth/1",
          transport.request(0).getUri().getRawPath());
      assertEquals("Bearer fresh", transport.request(2).getHeaders().get("Authorization"));
    }
  }

  @Test
  void authRoutesNeverRefresh() {
    FakeTransport transport = new FakeTransport();
    VaifClient client = client(transport);
    client.auth().setSession(new Session("old", "refresh"));
    transport.answer(401, EXPIRED);

    fails("TOKEN_EXPIRED", () -> client.auth().getUser());

    assertEquals(1, transport.requests.size());
    assertEquals("/projects/p%20%2F%3F/auth/me", transport.request(0).getUri().getRawPath());
  }
}
