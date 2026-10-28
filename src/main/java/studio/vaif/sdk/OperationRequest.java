package studio.vaif.sdk;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/** Path, query, header, and body arguments for a generated operation. */
public final class OperationRequest {
  private final Map<String, Object> path;
  private final Map<String, Object> query;
  private final Map<String, String> headers;
  private final Object body;

  private OperationRequest(Builder builder) {
    path = Collections.unmodifiableMap(new LinkedHashMap<>(builder.path));
    query = Collections.unmodifiableMap(new LinkedHashMap<>(builder.query));
    headers = Collections.unmodifiableMap(new LinkedHashMap<>(builder.headers));
    body = builder.body;
  }

  /**
   * Creates a builder with no arguments.
   *
   * @return a new builder
   */
  public static Builder builder() {
    return new Builder();
  }

  /**
   * Returns a request with no arguments.
   *
   * @return an empty request
   */
  public static OperationRequest empty() {
    return builder().build();
  }

  /**
   * Returns the path arguments.
   *
   * @return an unmodifiable map from parameter name to value
   */
  public Map<String, Object> getPath() {
    return path;
  }

  /**
   * Returns the query arguments.
   *
   * @return an unmodifiable map from parameter name to value
   */
  public Map<String, Object> getQuery() {
    return query;
  }

  /**
   * Returns the additional request headers.
   *
   * @return an unmodifiable map from header name to value
   */
  public Map<String, String> getHeaders() {
    return headers;
  }

  /**
   * Returns the request body.
   *
   * @return the body, or null if there is none
   */
  public Object getBody() {
    return body;
  }

  /** Builder for {@link OperationRequest}. Arguments are validated when the operation is called. */
  public static final class Builder {
    private final Map<String, Object> path = new LinkedHashMap<>();
    private final Map<String, Object> query = new LinkedHashMap<>();
    private final Map<String, String> headers = new LinkedHashMap<>();
    private Object body;

    /** Creates a builder with no arguments. */
    public Builder() {}

    /**
     * Sets a path argument, replacing any earlier value.
     *
     * @param name path parameter name
     * @param value value; it is encoded as one path segment
     * @return this builder
     */
    public Builder path(String name, Object value) {
      path.put(name, value);
      return this;
    }

    /**
     * Sets a query argument, replacing any earlier value. A map value is sent with deep-object
     * encoding and a list value as indexed entries.
     *
     * @param name query parameter name
     * @param value value, or null to omit it
     * @return this builder
     */
    public Builder query(String name, Object value) {
      query.put(name, value);
      return this;
    }

    /**
     * Sets a request header, replacing any earlier value.
     *
     * @param name header name
     * @param value header value
     * @return this builder
     */
    public Builder header(String name, String value) {
      headers.put(name, value);
      return this;
    }

    /**
     * Sets the request body.
     *
     * @param value JSON-compatible Java value, a byte array for a binary body, a string for a text
     *     body, or null for no body
     * @return this builder
     */
    public Builder body(Object value) {
      body = value;
      return this;
    }

    /**
     * Creates the request. The argument maps are copied; the body and nested values are not.
     *
     * @return a new request
     */
    public OperationRequest build() {
      return new OperationRequest(this);
    }
  }
}
