package studio.vaif.sdk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static studio.vaif.sdk.TestSupport.client;
import static studio.vaif.sdk.TestSupport.fails;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import studio.vaif.sdk.TestSupport.FakeTransport;

class ClientTest {
  @Test
  void apiErrorsCarryCodeRequestIdAndRetryAfter() {
    FakeTransport transport = new FakeTransport();
    VaifClient client = client(transport);
    transport.answer(
        429,
        Map.of("Retry-After", "Wed, 28 Oct 2026 12:00:00 GMT", "X-Request-Id", "header-id"),
        "{\"code\":\"RATE_LIMITED\",\"details\":{\"limit\":10}}");

    VaifException error = fails("RATE_LIMITED", () -> client.from("n").list());

    assertEquals(429, error.getStatusCode());
    assertEquals("header-id", error.getRequestId());
    assertEquals("Wed, 28 Oct 2026 12:00:00 GMT", error.getRetryAfter());
    assertEquals(Map.of("limit", 10), error.getDetails());
  }

  @Test
  void errorBodiesThatAreNotJsonBecomeHttpErrors() {
    FakeTransport transport = new FakeTransport();
    VaifClient client = client(transport);
    transport.answer(503, "not JSON");

    VaifException error = fails("HTTP_ERROR", () -> client.from("n").list());

    assertEquals("API request failed (HTTP 503)", error.getMessage());
    assertEquals("not JSON", error.getResponseBody());
  }

  @Test
  void redirectsAreRefused() {
    FakeTransport transport = new FakeTransport();
    VaifClient client = client(transport);
    transport.answer(302, Map.of("Location", "https://elsewhere.test/"), "");

    VaifException error = fails("REDIRECT_REFUSED", () -> client.from("n").list());

    assertEquals(302, error.getStatusCode());
    assertEquals(1, transport.requests.size());
  }

  @Test
  void malformedJsonIsRefused() {
    FakeTransport transport = new FakeTransport();
    VaifClient client = client(transport);
    transport.answer(200, "{malformed");
    fails("INVALID_JSON", () -> client.from("n").list());

    for (String text :
        List.of(
            "01",
            "[1,]",
            "{\"x\":}",
            "\"\\x\"",
            "1e",
            "1.",
            "-",
            "[",
            "{} garbage",
            "\"\\u+123\"",
            "\"\\u-12f\"")) {
      fails("INVALID_JSON", () -> Json.parse(text.getBytes(StandardCharsets.UTF_8)));
    }
  }

  @Test
  void jsonKeepsNumericPrecision() {
    Object value =
        Json.parse(
            "{\"n\":9007199254740993,\"d\":1.234567890123456789,\"s\":\"a\\n\\u263a\",\"a\":[true,null]}"
                .getBytes(StandardCharsets.UTF_8));
    Map<String, Object> object = Json.object(value);

    assertEquals(9007199254740993L, object.get("n"));
    assertEquals(
        new BigInteger("123456789012345678901234567890"),
        Json.parse("123456789012345678901234567890".getBytes(StandardCharsets.UTF_8)));
    assertEquals(new BigDecimal("1.234567890123456789"), object.get("d"));
    assertEquals("a\n\u263a", object.get("s"));
    assertEquals(value, Json.parse(Json.bytes(value)));
    fails("VALIDATION_ERROR", () -> Json.bytes(Map.of("x", Double.NaN)));
  }

  @Test
  void interruptedRequestsAreCancelledAndKeepTheInterrupt() {
    VaifClient client =
        VaifClient.builder()
            .transport(
                request -> {
                  throw new InterruptedException();
                })
            .build();

    fails("CANCELLED", () -> client.auth().getUser());

    assertTrue(Thread.interrupted());
  }

  @Test
  void invalidConfigurationIsRefused() {
    fails("VALIDATION_ERROR", () -> VaifClient.builder().baseUrl("https://user:pw@example.test"));
    fails("VALIDATION_ERROR", () -> VaifClient.builder().baseUrl("https://example.test?x=1"));
    fails("VALIDATION_ERROR", () -> VaifClient.builder().baseUrl("ftp://example.test"));
    fails("VALIDATION_ERROR", () -> VaifClient.builder().timeout(Duration.ZERO));
  }

  @Test
  void eventStreamFailuresUseStreamError() throws IOException {
    Transport broken =
        request ->
            new Transport.Response(
                200,
                Map.of(),
                new InputStream() {
                  @Override
                  public int read() throws IOException {
                    throw new IOException("connection reset");
                  }

                  @Override
                  public void close() throws IOException {
                    throw new IOException("close failed");
                  }
                });
    VaifClient client = VaifClient.builder().transport(broken).build();
    InputStream stream =
        (InputStream) client.request("POST", "/stream", Map.of(), null, Map.of(), "json", "sse");

    fails("STREAM_ERROR", stream::read);
    fails("STREAM_ERROR", stream::close);
  }

  @Test
  void invalidHeadersAreRefusedBeforeAnyRequest() {
    FakeTransport transport = new FakeTransport();
    VaifClient client = client(transport);
    for (Map<String, String> headers :
        List.of(
            Map.of("X-Test", "a\r\nX: 1"),
            Map.of("Host", "evil.test"),
            Map.of("bad name", "x"),
            Map.of("X-Test", "a\u0000b"))) {
      fails(
          "VALIDATION_ERROR",
          () -> client.request("GET", "/", Map.of(), null, headers, "json", "json"));
    }
    assertEquals(0, transport.requests.size());

    VaifClient rejecting =
        VaifClient.builder()
            .transport(
                request -> {
                  throw new IllegalArgumentException("bad request");
                })
            .build();
    fails("VALIDATION_ERROR", () -> rejecting.auth().getUser());
  }

  @Test
  void invalidPathsAreRefused() {
    FakeTransport transport = new FakeTransport();
    VaifClient client = client(transport);
    for (String path : List.of("notes", "//evil.test/x", "/x?y=1", "/x#y")) {
      fails(
          "VALIDATION_ERROR",
          () -> client.request("GET", path, Map.of(), null, Map.of(), "json", "json"));
    }
    assertEquals(0, transport.requests.size());
  }

  @Test
  void emptySuccessBodyIsNull() {
    FakeTransport transport = new FakeTransport();
    VaifClient client = client(transport);
    transport.answer(204, "");

    assertNull(client.request("DELETE", "/x", Map.of(), null, Map.of(), "json", "json"));
  }
}
