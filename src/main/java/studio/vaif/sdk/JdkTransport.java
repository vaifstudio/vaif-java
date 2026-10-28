package studio.vaif.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.Map;

/** The default transport: the JDK HTTP client, with redirects disabled and no cookie store. */
public final class JdkTransport implements Transport {
  private final HttpClient client;

  /** Creates a transport with redirects disabled and a 30-second connection timeout. */
  public JdkTransport() {
    client =
        HttpClient.newBuilder()
            .followRedirects(HttpClient.Redirect.NEVER)
            .connectTimeout(Duration.ofSeconds(30))
            .build();
  }

  /**
   * Sends one request with redirects disabled.
   *
   * @param request request to send
   * @return the response, with repeated headers joined by commas
   * @throws IOException if sending the request or receiving the response fails
   * @throws InterruptedException if the calling thread is interrupted
   */
  @Override
  public Response execute(Request request) throws IOException, InterruptedException {
    HttpRequest.Builder builder =
        HttpRequest.newBuilder(request.getUri()).timeout(request.getTimeout());
    request.getHeaders().forEach(builder::header);
    byte[] body = request.getBody();
    builder.method(
        request.getMethod(),
        body == null
            ? HttpRequest.BodyPublishers.noBody()
            : HttpRequest.BodyPublishers.ofByteArray(body));
    HttpResponse<InputStream> response =
        client.send(builder.build(), HttpResponse.BodyHandlers.ofInputStream());
    Map<String, String> headers = new LinkedHashMap<>();
    response.headers().map().forEach((name, values) -> headers.put(name, String.join(",", values)));
    return new Response(response.statusCode(), headers, response.body());
  }
}
