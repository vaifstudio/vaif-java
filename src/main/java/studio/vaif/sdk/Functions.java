package studio.vaif.sdk;

import java.util.Map;

/**
 * Invokes server functions by ID or name.
 *
 * <p>The SDK never retries a function's own response, including its HTTP 401. A non-2xx response
 * throws {@link VaifException}; the function's body is available from {@link
 * VaifException#getResponseBody()}.
 */
public final class Functions {
  private final VaifClient client;

  Functions(VaifClient client) {
    this.client = client;
  }

  /**
   * Invokes a function that returns a JSON object.
   *
   * @param idOrName function ID or name
   * @param input JSON input as Java values; null sends an empty object
   * @return the response object, or an empty map for an empty response
   * @throws VaifException if validation, the API, the function, or the transport fails, or the
   *     response is not a JSON object ({@code INVALID_RESPONSE})
   */
  public Map<String, Object> invoke(String idOrName, Object input) {
    return invoke(idOrName, input, Map.of(), Map.of());
  }

  /**
   * Invokes a function that returns a JSON object, with query options and headers.
   *
   * @param idOrName function ID or name
   * @param input JSON input as Java values; null sends an empty object
   * @param options query options, such as {@code version} and {@code includeLogs}
   * @param headers additional request headers
   * @return the response object, or an empty map for an empty response
   * @throws VaifException if validation, the API, the function, or the transport fails, or the
   *     response is not a JSON object ({@code INVALID_RESPONSE})
   */
  public Map<String, Object> invoke(
      String idOrName, Object input, Map<String, ?> options, Map<String, String> headers) {
    Object value = invokeValue(idOrName, input, options, headers);
    return value == null ? Map.of() : Json.object(value);
  }

  /**
   * Invokes a function and returns any JSON value.
   *
   * @param idOrName function ID or name
   * @param input JSON input as Java values; null sends an empty object
   * @return the response as a map, list, scalar, or null
   * @throws VaifException if validation, the API, the function, or the transport fails
   */
  public Object invokeValue(String idOrName, Object input) {
    return invokeValue(idOrName, input, Map.of(), Map.of());
  }

  /**
   * Invokes a function and returns any JSON value, with query options and headers.
   *
   * @param idOrName function ID or name
   * @param input JSON input as Java values; null sends an empty object
   * @param options query options, such as {@code version} and {@code includeLogs}
   * @param headers additional request headers
   * @return the response as a map, list, scalar, or null
   * @throws VaifException if validation, the API, the function, or the transport fails
   */
  public Object invokeValue(
      String idOrName, Object input, Map<String, ?> options, Map<String, String> headers) {
    String path = "/functions/" + VaifClient.segment(idOrName) + "/invoke";
    return client.request(
        "POST", path, options, input == null ? Map.of() : input, headers, "json", "json");
  }
}
