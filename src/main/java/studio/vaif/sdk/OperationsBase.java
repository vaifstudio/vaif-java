package studio.vaif.sdk;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Base class that validates arguments and sends requests for generated operations. */
public abstract class OperationsBase {
  private final VaifClient client;

  /**
   * Binds the operations to a client.
   *
   * @param client client that sends each request
   * @throws NullPointerException if client is null
   */
  protected OperationsBase(VaifClient client) {
    this.client = Objects.requireNonNull(client, "client");
  }

  /**
   * Validates the arguments of an operation and sends its request.
   *
   * @param op route metadata
   * @param request arguments, or null for none
   * @return a JSON value, a byte array, or an event stream that the caller must close
   * @throws VaifException if validation, authentication, the API, or the transport fails
   * @throws ConsoleOnlyException if the operation requires the VAIF Studio console
   */
  protected Object call(Operation op, OperationRequest request) {
    // Refuse console-only and staff routes before validating arguments, as well as before I/O.
    VaifClient.consoleGuard(op.getMethod(), op.getPath());
    OperationRequest arguments = request == null ? OperationRequest.empty() : request;
    String path = op.getPath();
    for (String name : op.getPathParams()) {
      path = path.replace("{" + name + "}", VaifClient.segment(arguments.getPath().get(name)));
    }
    for (String name : arguments.getPath().keySet()) {
      if (!op.getPathParams().contains(name)) {
        throw VaifException.validation("Unknown path parameter: " + name);
      }
    }
    for (String name : op.getRequiredQuery()) {
      if (arguments.getQuery().get(name) == null) {
        throw VaifException.validation("Missing query parameter: " + name);
      }
    }
    if (op.isBodyRequired() && arguments.getBody() == null) {
      throw VaifException.validation("Request body is required");
    }
    if (op.getBodyKind() == null && arguments.getBody() != null) {
      throw VaifException.validation("Operation does not accept a body");
    }
    return client.request(
        op.getMethod(),
        path,
        query(op, arguments),
        arguments.getBody(),
        arguments.getHeaders(),
        op.getBodyKind(),
        op.getResponseKind());
  }

  private static Map<String, Object> query(Operation op, OperationRequest arguments) {
    Map<String, Object> query = new LinkedHashMap<>();
    for (Map.Entry<String, Object> entry : arguments.getQuery().entrySet()) {
      String name = entry.getKey();
      Object value = entry.getValue();
      if (!op.getQueryParams().contains(name)) {
        throw VaifException.validation("Unknown query parameter: " + name);
      }
      if (value instanceof Map) {
        for (Map.Entry<String, Object> field : Json.object(value).entrySet()) {
          query.put(name + "[" + field.getKey() + "]", field.getValue());
        }
      } else if (value instanceof List) {
        List<?> items = (List<?>) value;
        for (int i = 0; i < items.size(); i++) {
          query.put(name + "[" + i + "]", items.get(i));
        }
      } else {
        query.put(name, value);
      }
    }
    return query;
  }
}
