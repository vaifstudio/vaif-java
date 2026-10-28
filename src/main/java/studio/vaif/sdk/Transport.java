package studio.vaif.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.Duration;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Sends HTTP requests for a {@link VaifClient}. The default is {@link JdkTransport}.
 *
 * <p>An implementation must not follow redirects: the client refuses every 3xx response, so
 * credentials never reach another origin.
 */
@FunctionalInterface
public interface Transport {
  /**
   * Sends one request and returns the response without following redirects.
   *
   * @param request request to send
   * @return the response; the client closes its body, except for event streams it returns
   * @throws IOException if sending the request or receiving the response fails
   * @throws InterruptedException if the calling thread is interrupted
   */
  Response execute(Request request) throws IOException, InterruptedException;

  /** An HTTP request. Headers and body bytes are copied on construction. */
  final class Request {
    private final String method;
    private final URI uri;
    private final Map<String, String> headers;
    private final byte[] body;
    private final Duration timeout;

    /**
     * Creates a request.
     *
     * @param method HTTP method
     * @param uri absolute target URI
     * @param headers HTTP headers, which can include credentials for the API origin
     * @param body request body, or null for none
     * @param timeout request timeout
     * @throws NullPointerException if headers is null
     */
    public Request(
        String method, URI uri, Map<String, String> headers, byte[] body, Duration timeout) {
      this.method = method;
      this.uri = uri;
      this.headers = Collections.unmodifiableMap(new LinkedHashMap<>(headers));
      this.body = body == null ? null : body.clone();
      this.timeout = timeout;
    }

    /**
     * Returns the HTTP method.
     *
     * @return the method, such as {@code GET}
     */
    public String getMethod() {
      return method;
    }

    /**
     * Returns the target URI.
     *
     * @return the absolute URI
     */
    public URI getUri() {
      return uri;
    }

    /**
     * Returns the request headers.
     *
     * @return an unmodifiable header map
     */
    public Map<String, String> getHeaders() {
      return headers;
    }

    /**
     * Returns a copy of the request body.
     *
     * @return the body bytes, or null for no body
     */
    public byte[] getBody() {
      return body == null ? null : body.clone();
    }

    /**
     * Returns the time the transport may spend on this request.
     *
     * @return the timeout
     */
    public Duration getTimeout() {
      return timeout;
    }
  }

  /** An HTTP response. The client closes its body, except for event streams it returns. */
  final class Response implements AutoCloseable {
    private final int status;
    private final Map<String, String> headers;
    private final InputStream body;

    /**
     * Creates a response.
     *
     * @param status HTTP status code
     * @param headers response headers; repeated headers are joined with commas
     * @param body response body stream
     * @throws NullPointerException if headers or body is null
     */
    public Response(int status, Map<String, String> headers, InputStream body) {
      this.status = status;
      this.headers = Collections.unmodifiableMap(new LinkedHashMap<>(headers));
      this.body = Objects.requireNonNull(body, "body");
    }

    /**
     * Returns the HTTP status code.
     *
     * @return the status code
     */
    public int getStatusCode() {
      return status;
    }

    /**
     * Returns the response headers.
     *
     * @return an unmodifiable header map
     */
    public Map<String, String> getHeaders() {
      return headers;
    }

    /**
     * Returns a header value, matching the name without regard to case.
     *
     * @param name header name
     * @return the header value, or null if the header is absent
     */
    public String header(String name) {
      return headers.entrySet().stream()
          .filter(entry -> entry.getKey().equalsIgnoreCase(name))
          .map(Map.Entry::getValue)
          .findFirst()
          .orElse(null);
    }

    /**
     * Returns the response body stream.
     *
     * @return the body stream
     */
    public InputStream getBody() {
      return body;
    }

    /**
     * Closes the response body stream.
     *
     * @throws IOException if closing the stream fails
     */
    @Override
    public void close() throws IOException {
      body.close();
    }
  }
}
