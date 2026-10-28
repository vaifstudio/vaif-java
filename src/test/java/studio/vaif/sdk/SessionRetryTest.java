package studio.vaif.sdk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static studio.vaif.sdk.TestSupport.client;
import static studio.vaif.sdk.TestSupport.fails;
import static studio.vaif.sdk.TestSupport.response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.junit.jupiter.api.Test;
import studio.vaif.sdk.TestSupport.FakeTransport;
import studio.vaif.sdk.TestSupport.MemoryStore;

/** A request refused as expired is retried only with the session that refreshed its own. */
class SessionRetryTest {
  private static final String EXPIRED = "{\"error\":\"UNAUTHORIZED\",\"code\":\"TOKEN_EXPIRED\"}";

  @Test
  void retryUsesTheRefreshedSession() {
    FakeTransport transport = new FakeTransport();
    VaifClient client = client(transport);
    client.auth().setSession(new Session("old", "old-refresh"));
    transport.answer(401, EXPIRED);
    transport.answer(200, "{\"accessToken\":\"fresh\",\"refreshToken\":\"fresh-refresh\"}");
    transport.answer(200, "{}");

    client.from("notes").list();

    assertEquals(3, transport.requests.size());
    assertEquals("Bearer old", transport.request(0).getHeaders().get("Authorization"));
    assertEquals("old-refresh", transport.jsonBody(1).get("refreshToken"));
    assertEquals("Bearer fresh", transport.request(2).getHeaders().get("Authorization"));
    assertEquals(new Session("fresh", "fresh-refresh"), client.auth().getSession());
  }

  @Test
  void retryNeedsARefreshThatInstalledABearer() {
    for (String body : List.of("{}", "{\"mfaRequired\":true,\"challengeToken\":\"challenge\"}")) {
      FakeTransport transport = new FakeTransport();
      VaifClient client = client(transport);
      Session original = new Session("old", "old-refresh");
      client.auth().setSession(original);
      transport.answer(401, EXPIRED);
      transport.answer(200, body);

      fails("TOKEN_EXPIRED", () -> client.from("notes").list());

      assertEquals(2, transport.requests.size());
      assertEquals(original, client.auth().getSession());
    }
  }

  @Test
  void untypedRefusalDoesNotRefresh() {
    FakeTransport transport = new FakeTransport();
    VaifClient client = client(transport);
    client.auth().setSession(new Session("old", "refresh"));
    // Without "error": "UNAUTHORIZED" this is not the API's typed auth refusal.
    transport.answer(
        401, "{\"code\":\"TOKEN_INVALID\",\"message\":\"Expired\",\"requestId\":\"r\"}");

    VaifException error = fails("TOKEN_INVALID", () -> client.from("notes").list());

    assertEquals(401, error.getStatusCode());
    assertEquals("r", error.getRequestId());
    assertEquals(1, transport.requests.size());
  }

  @Test
  void explicitAuthorizationHeaderDisablesRefresh() {
    FakeTransport transport = new FakeTransport();
    VaifClient client = client(transport);
    client.auth().setSession(new Session("old", "refresh"));
    transport.answer(401, EXPIRED);

    fails(
        "TOKEN_EXPIRED",
        () ->
            client.request(
                "GET",
                "/notes",
                Map.of(),
                null,
                Map.of("Authorization", "Bearer mine"),
                "json",
                "json"));

    assertEquals(1, transport.requests.size());
    assertEquals("Bearer mine", transport.request(0).getHeaders().get("Authorization"));
  }

  @Test
  void noRetryWhenTheSessionIsReplacedBeforeRefresh() throws IOException {
    retryAfterSessionChange(true, false);
  }

  @Test
  void noRetryWhenTheSessionIsReplacedDuringRefresh() throws IOException {
    retryAfterSessionChange(true, true);
  }

  @Test
  void noRetryAfterSignOut() throws IOException {
    retryAfterSessionChange(false, false);
  }

  private static void retryAfterSessionChange(boolean replace, boolean duringRefresh)
      throws IOException {
    AtomicReference<VaifClient> reference = new AtomicReference<>();
    List<Transport.Request> requests = new ArrayList<>();
    Transport transport =
        request -> {
          requests.add(request);
          String path = request.getUri().getPath();
          if (path.endsWith("/logout")) {
            return response(200, Map.of());
          }
          if (path.endsWith("/refresh")) {
            assertEquals(
                "old-refresh", Json.object(Json.parse(request.getBody())).get("refreshToken"));
            changeSession(reference.get(), replace);
            return response(200, Map.of("accessToken", "fresh", "refreshToken", "fresh-refresh"));
          }
          assertEquals("Bearer old", request.getHeaders().get("Authorization"));
          if (requests.size() == 1) {
            if (!duringRefresh) {
              changeSession(reference.get(), replace);
            }
            return response(401, Map.of("error", "UNAUTHORIZED", "code", "TOKEN_EXPIRED"));
          }
          throw new AssertionError("A request must not be replayed after its session changes");
        };
    MemoryStore store = new MemoryStore();
    VaifClient client =
        VaifClient.builder().projectId("p").sessionStore(store).transport(transport).build();
    reference.set(client);
    client.auth().setSession(new Session("old", "old-refresh"));

    fails("TOKEN_EXPIRED", () -> client.from("notes").list());

    // The original request, the refresh when it ran, and the logout of a sign-out.
    assertEquals((duringRefresh ? 2 : 1) + (replace ? 0 : 1), requests.size());
    Session expected = replace ? new Session("other-user", "other-refresh") : null;
    assertEquals(expected, client.auth().getSession());
    assertEquals(expected, store.load(client.sessionKey()));
  }

  private static void changeSession(VaifClient client, boolean replace) {
    if (replace) {
      client.auth().setSession(new Session("other-user", "other-refresh"));
    } else {
      client.auth().signOut();
    }
  }
}
