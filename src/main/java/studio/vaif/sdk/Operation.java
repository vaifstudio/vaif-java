package studio.vaif.sdk;

import java.util.List;

/** Route metadata for one generated API operation. */
public final class Operation {
  private final String name;
  private final String method;
  private final String path;
  private final String bodyKind;
  private final String responseKind;
  private final boolean bodyRequired;
  private final List<String> pathParams;
  private final List<String> queryParams;
  private final List<String> requiredQuery;
  private final List<String> deepObject;

  /**
   * Creates route metadata.
   *
   * @param name method name, such as {@code getProjectsByProjectId}
   * @param method HTTP method
   * @param path API path template
   * @param bodyKind request body encoding: {@code json}, {@code binary}, {@code text}, or null
   * @param responseKind response encoding: {@code json}, {@code binary}, or {@code sse}
   * @param bodyRequired whether the operation requires a body
   * @param pathParams path parameter names
   * @param queryParams accepted query parameter names
   * @param requiredQuery required query parameter names
   * @param deepObject query parameter names sent with deep-object encoding
   * @throws NullPointerException if an array or one of its elements is null
   */
  public Operation(
      String name,
      String method,
      String path,
      String bodyKind,
      String responseKind,
      boolean bodyRequired,
      String[] pathParams,
      String[] queryParams,
      String[] requiredQuery,
      String[] deepObject) {
    this.name = name;
    this.method = method;
    this.path = path;
    this.bodyKind = bodyKind;
    this.responseKind = responseKind;
    this.bodyRequired = bodyRequired;
    this.pathParams = List.of(pathParams);
    this.queryParams = List.of(queryParams);
    this.requiredQuery = List.of(requiredQuery);
    this.deepObject = List.of(deepObject);
  }

  /**
   * Returns the generated method name.
   *
   * @return the method name
   */
  public String getName() {
    return name;
  }

  /**
   * Returns the HTTP method.
   *
   * @return the HTTP method
   */
  public String getMethod() {
    return method;
  }

  /**
   * Returns the API path template, such as {@code /projects/{projectId}}.
   *
   * @return the path template
   */
  public String getPath() {
    return path;
  }

  /**
   * Returns the request body encoding.
   *
   * @return {@code json}, {@code binary}, {@code text}, or null if the operation takes no body
   */
  public String getBodyKind() {
    return bodyKind;
  }

  /**
   * Returns the response encoding.
   *
   * @return {@code json}, {@code binary}, or {@code sse}
   */
  public String getResponseKind() {
    return responseKind;
  }

  /**
   * Reports whether the operation requires a body.
   *
   * @return true if a body is required
   */
  public boolean isBodyRequired() {
    return bodyRequired;
  }

  /**
   * Returns the path parameter names.
   *
   * @return an unmodifiable list of names
   */
  public List<String> getPathParams() {
    return pathParams;
  }

  /**
   * Returns the accepted query parameter names.
   *
   * @return an unmodifiable list of names
   */
  public List<String> getQueryParams() {
    return queryParams;
  }

  /**
   * Returns the required query parameter names.
   *
   * @return an unmodifiable list of names
   */
  public List<String> getRequiredQuery() {
    return requiredQuery;
  }

  /**
   * Returns the query parameter names sent with deep-object encoding, such as {@code
   * filter[name]=value}.
   *
   * @return an unmodifiable list of names
   */
  public List<String> getDeepObject() {
    return deepObject;
  }
}
