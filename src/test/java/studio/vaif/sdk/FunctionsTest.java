package studio.vaif.sdk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static studio.vaif.sdk.TestSupport.client;
import static studio.vaif.sdk.TestSupport.fails;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import studio.vaif.sdk.TestSupport.FakeTransport;

class FunctionsTest {
  private static final String EXPIRED = "{\"error\":\"UNAUTHORIZED\",\"code\":\"TOKEN_EXPIRED\"}";

  @Test
  void aFunctionsOwn401IsReturnedNotRetried() {
    FakeTransport transport = new FakeTransport();
    VaifClient client = client(transport);
    client.auth().setSession(new Session("old", "refresh"));
    transport.answer(401, Map.of("X-Vaif-Run-Id", "run"), EXPIRED);

    fails("TOKEN_EXPIRED", () -> client.functions().invoke("f", Map.of()));

    assertEquals(1, transport.requests.size());
    assertEquals(new Session("old", "refresh"), client.auth().getSession());
  }

  @Test
  void anApiAuthRefusalBeforeInvocationRefreshesOnce() {
    FakeTransport transport = new FakeTransport();
    VaifClient client = client(transport);
    client.auth().setSession(new Session("old", "refresh"));
    transport.answer(401, EXPIRED);
    transport.answer(200, "{\"accessToken\":\"fresh\",\"refreshToken\":\"next\"}");
    transport.answer(200, "{}");

    client.functions().invoke("f", Map.of());

    assertEquals(3, transport.requests.size());
    assertEquals("refresh", transport.jsonBody(1).get("refreshToken"));
    assertEquals("Bearer fresh", transport.request(2).getHeaders().get("Authorization"));
  }

  @Test
  void functionResponsesKeepTheirJson() {
    FakeTransport transport = new FakeTransport();
    VaifClient client = client(transport);
    client.auth().setSession(new Session("old", "refresh"));

    transport.answer(200, "[1,2]");
    assertEquals(List.of(1, 2), client.functions().invokeValue("f", Map.of()));

    transport.answer(200, "{\"data\":{\"message\":\"hi\"}}");
    assertEquals(
        Map.of("data", Map.of("message", "hi")), client.functions().invoke("hello/world", null));
    assertEquals("/functions/hello%2Fworld/invoke", transport.request(1).getUri().getRawPath());
    assertEquals(Map.of(), transport.jsonBody(1));

    transport.answer(401, "{\"message\":\"function refused\",\"data\":42}");
    VaifException error = fails("HTTP_ERROR", () -> client.functions().invokeValue("f", Map.of()));
    assertEquals(Map.of("message", "function refused", "data", 42), error.getResponseBody());
    assertEquals(3, transport.requests.size());
  }
}
