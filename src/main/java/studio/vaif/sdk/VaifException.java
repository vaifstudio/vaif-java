package studio.vaif.sdk;

/**
 * A failure reported by the API or detected by the SDK.
 *
 * <p>{@link #getCode()} identifies the failure. API failures carry the API's code and HTTP status.
 * SDK failures use the SDK's codes and status 0 when no response was received. Messages, details,
 * response bodies, and causes can contain request data; do not log them unfiltered. The SDK does
 * not retry rate-limited requests; use {@link #getRetryAfter()} to schedule a retry.
 */
public class VaifException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  /** SDK or API error code. */
  private final String code;

  /** HTTP status, or 0 if no response was received. */
  private final int statusCode;

  /** Request ID for support, if the API sent one. */
  private final String requestId;

  /** Structured error details from the API. Not serialized. */
  private final transient Object details;

  /** Raw Retry-After header value. */
  private final String retryAfter;

  /** Parsed API error response. Not serialized. */
  private transient Object responseBody;

  /**
   * Creates a failure with no HTTP response.
   *
   * @param code error code
   * @param message description of the failure; do not include credentials
   */
  public VaifException(String code, String message) {
    this(code, message, 0, null, null, null, null);
  }

  /**
   * Creates a failure with full metadata.
   *
   * @param code error code
   * @param message description of the failure; do not include credentials
   * @param statusCode HTTP status, or 0 if no response was received
   * @param requestId request ID, or null
   * @param details API error details, or null
   * @param retryAfter raw Retry-After header value, or null
   * @param cause underlying failure, or null
   */
  public VaifException(
      String code,
      String message,
      int statusCode,
      String requestId,
      Object details,
      String retryAfter,
      Throwable cause) {
    super(message, cause);
    this.code = code;
    this.statusCode = statusCode;
    this.requestId = requestId;
    this.details = details;
    this.retryAfter = retryAfter;
  }

  /**
   * Returns the SDK or API error code, such as {@code TOKEN_EXPIRED} or {@code NETWORK_ERROR}.
   *
   * @return the error code
   */
  public String getCode() {
    return code;
  }

  /**
   * Returns the HTTP status code.
   *
   * @return the status code, or 0 if no response was received
   */
  public int getStatusCode() {
    return statusCode;
  }

  /**
   * Returns the request ID to quote to support.
   *
   * @return the request ID, or null if the API sent none
   */
  public String getRequestId() {
    return requestId;
  }

  /**
   * Returns the structured error details from the API.
   *
   * @return the details as Java values, or null if the API sent none
   */
  public Object getDetails() {
    return details;
  }

  /**
   * Returns the API error response.
   *
   * @return the parsed JSON body, the raw text of a non-JSON body, or null without a response
   */
  public Object getResponseBody() {
    return responseBody;
  }

  /**
   * Returns the raw Retry-After header value.
   *
   * @return seconds or an HTTP date, or null if the header was absent
   */
  public String getRetryAfter() {
    return retryAfter;
  }

  VaifException responseBody(Object value) {
    responseBody = value;
    return this;
  }

  static VaifException validation(String message) {
    return new VaifException("VALIDATION_ERROR", message);
  }
}
