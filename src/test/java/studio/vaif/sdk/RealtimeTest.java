package studio.vaif.sdk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static studio.vaif.sdk.TestSupport.fails;

import java.io.IOException;
import java.net.URI;
import java.net.http.WebSocket;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.atomic.AtomicReference;
import org.junit.jupiter.api.Test;
import studio.vaif.sdk.TestSupport.FakeSocket;

class RealtimeTest {
  @Test
  void websocketUrlsUpgradeOnlySecureOrLoopbackOrigins() {
    assertEquals(
        "wss://example.test/realtime/ws", Realtime.websocketUrl("HTTPS://example.test").toString());
    for (String host : List.of("localhost", "127.0.0.1", "[::1]")) {
      assertEquals(
          "ws://" + host + ":8080/realtime/ws",
          Realtime.websocketUrl("HTTP://" + host + ":8080").toString());
    }
    for (String invalid :
        List.of(
            "ftp://example.test",
            "ws://localhost",
            "http://example.test",
            "http://localhost.evil",
            "https://user:pw@example.test",
            "https://example.test?token=secret")) {
      fails("VALIDATION_ERROR", () -> Realtime.websocketUrl(invalid));
    }
  }

  @Test
  void subscriptionAuthenticatesInTheFirstMessageAndFiltersChanges() {
    AtomicReference<WebSocket.Listener> listener = new AtomicReference<>();
    AtomicReference<URI> url = new AtomicReference<>();
    FakeSocket socket = new FakeSocket();
    List<Map<String, Object>> events = new ArrayList<>();
    List<VaifException> errors = new ArrayList<>();
    VaifClient client =
        VaifClient.builder()
            .baseUrl("HTTPS://example.test/api")
            .apiKey("secret")
            .accessToken("access")
            .socketFactory(
                (uri, l) -> {
                  url.set(uri);
                  listener.set(l);
                  l.onOpen(socket);
                  return CompletableFuture.completedFuture(socket);
                })
            .build();

    try (Realtime.Subscription subscription =
        client
            .realtime()
            .subscribe(
                "notes", Map.of("owner_id", "a & b"), List.of("id"), events::add, errors::add)) {
      assertEquals("wss://example.test/api/realtime/ws", url.get().toString());
      assertEquals(
          Map.of("type", "auth", "apiKey", "secret", "accessToken", "access"), socket.sentJson(0));
      assertFalse(subscription.ready().isDone());

      listener.get().onText(socket, "{\"type\":\"welcome\"}", true);
      String channel = "table:notes?owner_id.eq=a+%26+b&columns=id";
      assertEquals(Map.of("type", "subscribe", "channel", channel), socket.sentJson(1));

      listener
          .get()
          .onText(socket, Json.stringify(Map.of("type", "subscribed", "channel", channel)), true);
      subscription.ready().join();
      listener
          .get()
          .onText(
              socket,
              Json.stringify(Map.of("type", "db_change", "channels", List.of("table:other"))),
              true);
      assertEquals(1, events.size());
      listener
          .get()
          .onText(
              socket,
              Json.stringify(
                  Map.of("type", "db_change", "channels", List.of(channel), "op", "INSERT")),
              true);
      assertEquals(2, events.size());
      assertEquals("INSERT", events.get(1).get("op"));
      assertEquals(0, errors.size());
    }
    assertTrue(socket.aborted);
  }

  @Test
  void failuresUseRealtimeErrorCodes() {
    List<VaifException> errors = new ArrayList<>();
    VaifClient refused =
        VaifClient.builder()
            .socketFactory(
                (uri, l) -> CompletableFuture.failedFuture(new IOException("transport failure")))
            .build();
    try (Realtime.Subscription subscription =
        refused.realtime().subscribe("notes", event -> {}, errors::add)) {
      CompletionException failure =
          assertThrows(CompletionException.class, () -> subscription.ready().join());
      assertEquals("REALTIME_ERROR", ((VaifException) failure.getCause()).getCode());
      assertEquals("REALTIME_ERROR", errors.get(0).getCode());
    }

    for (String kind : List.of("error", "close", "server", "overflow")) {
      AtomicReference<WebSocket.Listener> listener = new AtomicReference<>();
      FakeSocket socket = new FakeSocket();
      errors.clear();
      VaifClient client =
          VaifClient.builder()
              .socketFactory(
                  (uri, l) -> {
                    listener.set(l);
                    l.onOpen(socket);
                    return CompletableFuture.completedFuture(socket);
                  })
              .build();
      try (Realtime.Subscription subscription =
          client.realtime().subscribe("notes", event -> {}, errors::add)) {
        if (kind.equals("error")) {
          listener.get().onError(socket, new IllegalStateException("transport"));
        } else if (kind.equals("close")) {
          listener.get().onClose(socket, 1011, "server restart");
        } else if (kind.equals("server")) {
          listener.get().onText(socket, "{\"type\":\"error\",\"code\":\"FORBIDDEN\"}", true);
        } else {
          listener.get().onText(socket, "x".repeat(1024 * 1024 + 1), false);
        }
        String expected =
            Map.of(
                    "error", "REALTIME_ERROR",
                    "close", "REALTIME_CLOSED",
                    "server", "FORBIDDEN",
                    "overflow", "REALTIME_OVERFLOW")
                .get(kind);
        assertEquals(expected, errors.get(0).getCode());
        assertTrue(subscription.ready().isCompletedExceptionally());
        assertTrue(socket.aborted);
      }
    }
  }

  @Test
  void closingCancelsAPendingAcknowledgement() {
    FakeSocket socket = new FakeSocket();
    VaifClient client =
        VaifClient.builder()
            .socketFactory(
                (uri, l) -> {
                  l.onOpen(socket);
                  return CompletableFuture.completedFuture(socket);
                })
            .build();
    Realtime.Subscription subscription =
        client.realtime().subscribe("notes", event -> {}, error -> {});

    subscription.close();

    CompletionException failure =
        assertThrows(CompletionException.class, () -> subscription.ready().join());
    assertEquals("CANCELLED", ((VaifException) failure.getCause()).getCode());
    fails(
        "VALIDATION_ERROR", () -> client.realtime().subscribe("1notes", event -> {}, error -> {}));
  }
}
