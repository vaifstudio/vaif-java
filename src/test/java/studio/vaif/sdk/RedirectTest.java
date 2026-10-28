package studio.vaif.sdk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static studio.vaif.sdk.TestSupport.fails;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.Test;

/** Runs the default JDK transport against two loopback servers. */
class RedirectTest {
  @Test
  void credentialsNeverFollowARedirect() throws IOException {
    AtomicInteger targetRequests = new AtomicInteger();
    HttpServer target = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
    HttpServer origin = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
    try {
      target.createContext(
          "/",
          exchange -> {
            targetRequests.incrementAndGet();
            exchange.sendResponseHeaders(200, -1);
            exchange.close();
          });
      origin.createContext(
          "/",
          exchange -> {
            exchange
                .getResponseHeaders()
                .set("Location", "http://127.0.0.1:" + target.getAddress().getPort() + "/stolen");
            exchange.sendResponseHeaders(307, -1);
            exchange.close();
          });
      target.start();
      origin.start();
      VaifClient client =
          VaifClient.builder()
              .baseUrl("http://127.0.0.1:" + origin.getAddress().getPort())
              .apiKey("apikey-secret")
              .accessToken("bearer-secret")
              .build();

      fails(
          "REDIRECT_REFUSED",
          () ->
              client.request(
                  "GET",
                  "/redirect",
                  Map.of(),
                  null,
                  Map.of("apikey", "explicit-apikey"),
                  "json",
                  "json"));

      assertEquals(0, targetRequests.get());
    } finally {
      origin.stop(0);
      target.stop(0);
    }
  }
}
