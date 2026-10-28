package studio.vaif.sdk;

import java.io.IOException;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.http.HttpTimeoutException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.StringJoiner;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import studio.vaif.sdk.generated.Operations;

/**
 * Blocking client for the VAIF API.
 *
 * <p>A client is safe to share between threads. Use one client for each security context: a
 * service-role key, or one signed-in user. Query objects are immutable. Realtime callbacks can run
 * on WebSocket and SDK timer threads; keep them short and hand long work to an executor.
 */
public final class VaifClient {
  /** SDK release version. */
  public static final String VERSION = "1.0.0";

  private static final Set<String> CONSOLE_ONLY_PATHS =
      Set.of("/auth/signup", "/auth/forgot-password", "/auth/reset-password");
  private static final Set<String> RESTRICTED_HEADERS =
      Set.of("host", "connection", "content-length", "expect", "upgrade");
  private static final Pattern HEADER_NAME = Pattern.compile("[!#$%&'*+.^_`|~0-9A-Za-z-]+");
  private static final Pattern PROJECT_AUTH_PATH = Pattern.compile("/projects/[^/]+/auth/.*");

  private final String baseUrl;
  private final String projectId;
  private final String apiKey;
  private final String storageUrl;
  private final Supplier<String> tokenProvider;
  private final Transport transport;
  private final Duration timeout;
  private final SessionStore sessionStore;
  private boolean authOverridden;
  private String authToken;
  private final Auth auth;
  private final Storage storage;
  private final Functions functions;
  private final Operations operations;
  private final Realtime realtime;

  private VaifClient(Builder builder) {
    baseUrl = validUrl(builder.baseUrl).toString().replaceAll("/+$", "");
    projectId = builder.projectId;
    apiKey = builder.apiKey;
    storageUrl = builder.storageUrl;
    if (storageUrl != null) {
      validUrl(storageUrl);
    }
    tokenProvider = builder.tokenProvider;
    transport = builder.transport == null ? new JdkTransport() : builder.transport;
    timeout = builder.timeout;
    sessionStore = builder.sessionStore;
    auth = new Auth(this);
    storage = new Storage(this);
    functions = new Functions(this);
    operations = new Operations(this);
    realtime = new Realtime(this, builder.socketFactory);
  }

  /**
   * Creates a builder that targets {@code https://api.vaif.studio} with a 30-second timeout.
   *
   * @return a new builder
   */
  public static Builder builder() {
    return new Builder();
  }

  /**
   * Returns the sign-in, session, and user API.
   *
   * @return the authentication API
   */
  public Auth auth() {
    return auth;
  }

  /**
   * Returns the bucket, signed URL, and object transfer API.
   *
   * @return the storage API
   */
  public Storage storage() {
    return storage;
  }

  /**
   * Returns the function invocation API.
   *
   * @return the functions API
   */
  public Functions functions() {
    return functions;
  }

  /**
   * Returns the generated methods for the operations in the API contract.
   *
   * @return the generated operations
   */
  public Operations operations() {
    return operations;
  }

  /**
   * Returns the table change subscription API.
   *
   * @return the realtime API
   */
  public Realtime realtime() {
    return realtime;
  }

  /**
   * Starts a query on a table. With a project ID the query uses the project data API; without one
   * it uses the platform's generated table routes.
   *
   * @param table nonempty table name
   * @return a new query
   * @throws VaifException if the table name is not a valid path segment
   */
  public Query from(String table) {
    return new Query(this, table);
  }

  /**
   * Returns the project ID this client is scoped to.
   *
   * @return the project ID, or null for platform scope
   */
  public String getProjectId() {
    return projectId;
  }

  /**
   * Replaces managed authentication with a fixed bearer token and clears any saved session. A null
   * token sends no bearer token and also disables the builder's token supplier until {@link
   * #useConfiguredAuth()} is called.
   *
   * @param token bearer token, or null to send none
   * @throws VaifException if the session store cannot clear the saved session
   */
  public void setAuth(String token) {
    auth.useAccessToken(token);
  }

  /**
   * Clears the managed session and resumes the token supplier configured on the builder.
   *
   * @throws VaifException if the session store cannot clear the saved session
   */
  public void useConfiguredAuth() {
    auth.useAccessToken(null);
    synchronized (this) {
      authOverridden = false;
    }
  }

  /**
   * Sends a blocking API request.
   *
   * <p>A managed session is refreshed at most once, and only after the API's typed {@code 401
   * UNAUTHORIZED} answer with code {@code TOKEN_INVALID} or {@code TOKEN_EXPIRED}. The retry uses
   * only the session that the refresh installed in place of the one the request was sent with. A
   * function's own response is never retried. Platform staff routes are refused before any I/O.
   *
   * @param method HTTP method
   * @param path absolute API path that starts with one slash, without query or fragment
   * @param query query arguments; null values are omitted
   * @param body JSON value, byte array, string, or null
   * @param headers additional HTTP headers; an explicit Authorization header disables refresh
   * @param bodyKind {@code json}, {@code binary}, or {@code text}
   * @param responseKind {@code json}, {@code binary}, or {@code sse}
   * @return a JSON value, a byte array, or an event stream that the caller must close
   * @throws VaifException if validation, authentication, the API, or the transport fails
   * @throws ConsoleOnlyException if the operation requires the VAIF Studio console
   */
  public Object request(
      String method,
      String path,
      Map<String, ?> query,
      Object body,
      Map<String, String> headers,
      String bodyKind,
      String responseKind) {
    return requestObserved(method, path, query, body, headers, bodyKind, responseKind, null);
  }

  String baseUrl() {
    return baseUrl;
  }

  String storageUrl() {
    return storageUrl;
  }

  String apiKey() {
    return apiKey;
  }

  Duration timeout() {
    return timeout;
  }

  SessionStore sessionStore() {
    return sessionStore;
  }

  synchronized void installAuthToken(String token) {
    authToken = token;
    authOverridden = true;
  }

  /** Returns the bearer token for a new request. The supplier runs outside the client monitor. */
  String currentToken() {
    synchronized (this) {
      if (authOverridden) {
        return authToken;
      }
    }
    return tokenProvider == null ? null : tokenProvider.get();
  }

  /** Returns the session store key: the normalized API origin and the project scope. */
  String sessionKey() {
    URI uri = URI.create(baseUrl);
    String scheme = uri.getScheme().toLowerCase(Locale.ROOT);
    int port = uri.getPort();
    if (port == -1) {
      port = scheme.equals("https") ? 443 : 80;
    }
    String scope = projectId == null ? "platform" : "project:" + projectId;
    return scheme + "://" + uri.getHost().toLowerCase(Locale.ROOT) + ":" + port + "\n" + scope;
  }

  static URI validUrl(String value) {
    URI uri;
    try {
      uri = URI.create(value);
    } catch (RuntimeException e) {
      throw VaifException.validation("Expected an HTTP(S) URL without credentials or fragment");
    }
    String scheme = uri.getScheme() == null ? "" : uri.getScheme().toLowerCase(Locale.ROOT);
    if (!(scheme.equals("https") || scheme.equals("http"))
        || uri.getHost() == null
        || uri.getUserInfo() != null
        || uri.getFragment() != null) {
      throw VaifException.validation("Expected an HTTP(S) URL without credentials or fragment");
    }
    return uri;
  }

  static boolean loopback(String host) {
    return host != null
        && Set.of("localhost", "127.0.0.1", "::1", "[::1]").contains(host.toLowerCase(Locale.ROOT));
  }

  static URI secureUrl(String value) {
    URI uri = validUrl(value);
    if (!uri.getScheme().equalsIgnoreCase("https") && !loopback(uri.getHost())) {
      throw VaifException.validation("HTTPS is required except for localhost");
    }
    return uri;
  }

  static String segment(Object value) {
    String text = value == null ? "" : value.toString();
    if (text.isEmpty() || text.equals(".") || text.equals("..")) {
      throw VaifException.validation("Path segments must be nonempty and cannot be dot segments");
    }
    return encode(text).replace("*", "%2A");
  }

  static String query(Map<String, ?> query) {
    StringJoiner parts = new StringJoiner("&");
    for (Map.Entry<String, ?> entry : query.entrySet()) {
      Object value = entry.getValue();
      if (value == null) {
        continue;
      }
      if (value instanceof Iterable) {
        for (Object item : (Iterable<?>) value) {
          parts.add(encode(entry.getKey()) + "=" + encode(String.valueOf(item)));
        }
      } else {
        String text = value instanceof Map ? Json.stringify(value) : value.toString();
        parts.add(encode(entry.getKey()) + "=" + encode(text));
      }
    }
    return parts.length() == 0 ? "" : "?" + parts;
  }

  private static String encode(String value) {
    return URLEncoder.encode(value, StandardCharsets.UTF_8).replace("+", "%20");
  }

  /** Refuses platform staff routes and console-only account actions before any I/O. */
  static void consoleGuard(String method, String path) {
    if (staffOnly(method, path)) {
      throw new VaifException("PLATFORM_STAFF_ONLY", "This operation is limited to platform staff");
    }
    if (method.equals("POST") && CONSOLE_ONLY_PATHS.contains(path)) {
      throw new ConsoleOnlyException(path.endsWith("/signup"));
    }
  }

  /** Matches a request against the staff prefixes and the staff route templates of the contract. */
  static boolean staffOnly(String method, String path) {
    // Match the decoded path, so percent-encoding cannot hide a staff route. A path that is not a
    // valid URI (such as a generated path template) is matched as written; the request URL check
    // refuses it before any I/O.
    String decoded;
    try {
      decoded = URI.create(path).getPath();
    } catch (IllegalArgumentException e) {
      decoded = null;
    }
    if (decoded == null) {
      decoded = path;
    }
    for (String prefix : StaffOnlyRoutes.PREFIXES) {
      if (decoded.equals(prefix) || decoded.startsWith(prefix + "/")) {
        return true;
      }
    }
    String[] actual = decoded.replaceAll("/+$", "").split("/", -1);
    for (String route : StaffOnlyRoutes.ROUTES) {
      int space = route.indexOf(' ');
      if (method.equals(route.substring(0, space))
          && matchesTemplate(route.substring(space + 1).split("/", -1), actual)) {
        return true;
      }
    }
    return false;
  }

  private static boolean matchesTemplate(String[] template, String[] actual) {
    if (template.length != actual.length) {
      return false;
    }
    for (int i = 0; i < template.length; i++) {
      boolean parameter = template[i].startsWith("{") && template[i].endsWith("}");
      if (!parameter && !template[i].equals(actual[i])) {
        return false;
      }
    }
    return true;
  }

  private static void validateHeaders(Map<String, String> headers) {
    for (Map.Entry<String, String> entry : headers.entrySet()) {
      String name = entry.getKey();
      String value = entry.getValue();
      if (name == null
          || !HEADER_NAME.matcher(name).matches()
          || RESTRICTED_HEADERS.contains(name.toLowerCase(Locale.ROOT))
          || value == null
          || value.chars().anyMatch(c -> c == '\r' || c == '\n' || c == 0)) {
        throw VaifException.validation("Invalid HTTP header");
      }
    }
  }

  private static boolean hasHeader(Map<String, String> headers, String name) {
    return headers.keySet().stream().anyMatch(key -> key.equalsIgnoreCase(name));
  }

  private static boolean authRoute(String path) {
    return path.startsWith("/auth/") || PROJECT_AUTH_PATH.matcher(path).matches();
  }

  private Object requestObserved(
      String method,
      String path,
      Map<String, ?> query,
      Object body,
      Map<String, String> headers,
      String bodyKind,
      String responseKind,
      Consumer<Transport.Response> observer) {
    consoleGuard(method, path);
    if (!path.startsWith("/")
        || path.startsWith("//")
        || path.contains("?")
        || path.contains("#")) {
      throw VaifException.validation("Invalid API path");
    }
    Session started = auth.getSession();
    Map<String, String> requestHeaders = new LinkedHashMap<>(headers);
    if (!hasHeader(requestHeaders, "Authorization")) {
      String token = started == null ? currentToken() : started.getAccessToken();
      if (token != null && !token.isEmpty()) {
        requestHeaders.put("Authorization", "Bearer " + token);
      }
    }
    if (apiKey != null && !apiKey.isEmpty()) {
      requestHeaders.put("x-vaif-key", apiKey);
    }
    requestHeaders.putIfAbsent("Accept-Versions", "v1");
    byte[] bytes = encodeBody(body, bodyKind, requestHeaders);
    validateHeaders(requestHeaders);
    URI uri = validUrl(baseUrl + path + query(query));
    try {
      return execute(
          new Transport.Request(method, uri, requestHeaders, bytes, timeout),
          responseKind,
          observer);
    } catch (AuthenticationFailure error) {
      if (started == null
          || started.getRefreshToken() == null
          || authRoute(path)
          || hasHeader(headers, "Authorization")) {
        throw error;
      }
      Session current = auth.refreshCurrent(started);
      if (current == null) {
        throw error;
      }
      requestHeaders.put("Authorization", "Bearer " + current.getAccessToken());
      return execute(
          new Transport.Request(method, uri, requestHeaders, bytes, timeout),
          responseKind,
          observer);
    }
  }

  private static byte[] encodeBody(Object body, String bodyKind, Map<String, String> headers) {
    if (body == null) {
      return null;
    }
    byte[] bytes;
    String contentType;
    if ("binary".equals(bodyKind)) {
      if (!(body instanceof byte[])) {
        throw VaifException.validation("Binary body must be byte[]");
      }
      bytes = (byte[]) body;
      contentType = "application/octet-stream";
    } else if ("text".equals(bodyKind)) {
      if (!(body instanceof String)) {
        throw VaifException.validation("Text body must be String");
      }
      bytes = ((String) body).getBytes(StandardCharsets.UTF_8);
      contentType = "text/plain";
    } else {
      bytes = Json.bytes(body);
      contentType = "application/json";
    }
    if (!hasHeader(headers, "Content-Type")) {
      headers.put("Content-Type", contentType);
    }
    return bytes;
  }

  /** Sends an auth request and returns its JSON object, with a refresh cookie copied in. */
  Map<String, Object> authRequest(String path, Map<String, ?> body, Map<String, String> headers) {
    String cookieName = projectId == null ? "refresh_token" : "project_refresh_token";
    Pattern cookie = Pattern.compile("(?:^|,\\s*)" + cookieName + "=([^; ,]+)");
    String[] refresh = {null};
    Object value =
        requestObserved(
            "POST",
            path,
            Map.of(),
            body,
            headers,
            "json",
            "json",
            response -> {
              String cookies = response.header("Set-Cookie");
              if (cookies != null) {
                Matcher matcher = cookie.matcher(cookies);
                if (matcher.find()) {
                  refresh[0] = URLDecoder.decode(matcher.group(1), StandardCharsets.UTF_8);
                }
              }
            });
    Map<String, Object> result = new LinkedHashMap<>(value == null ? Map.of() : Json.object(value));
    if (!result.containsKey("refreshToken")
        && refresh[0] != null
        && !Boolean.TRUE.equals(result.get("mfaRequired"))) {
      result.put("refreshToken", refresh[0]);
    }
    return result;
  }

  Map<String, Object> json(
      String method, String path, Map<String, ?> query, Object body, Map<String, String> headers) {
    Object result = request(method, path, query, body, headers, "json", "json");
    return result == null ? Map.of() : Json.object(result);
  }

  Map<String, Object> json(String method, String path, Object body) {
    return json(method, path, Map.of(), body, Map.of());
  }

  /** Transfers bytes to or from a signed URL. Errors carry no URL, query, or response body. */
  byte[] external(String method, String url, byte[] body, Map<String, String> headers) {
    validateHeaders(headers);
    try {
      return (byte[])
          execute(
              new Transport.Request(method, secureUrl(url), headers, body, timeout),
              "binary",
              null);
    } catch (VaifException error) {
      // Signed targets and their responses may contain credentials. Keep only local metadata.
      String code = error.getCode();
      if (!List.of("NETWORK_ERROR", "TIMEOUT", "CANCELLED", "REDIRECT_REFUSED", "VALIDATION_ERROR")
          .contains(code)) {
        code = "HTTP_ERROR";
      }
      throw new VaifException(
          code, "Signed storage transfer failed", error.getStatusCode(), null, null, null, null);
    }
  }

  private Object execute(
      Transport.Request request, String kind, Consumer<Transport.Response> observer) {
    Transport.Response response = null;
    boolean callerOwns = false;
    try {
      response = transport.execute(request);
      int status = response.getStatusCode();
      if (observer != null) {
        observer.accept(response);
      }
      if (status >= 300 && status < 400) {
        throw new VaifException(
            "REDIRECT_REFUSED",
            "HTTP redirect refused",
            status,
            response.header("x-request-id"),
            null,
            null,
            null);
      }
      if (status < 200 || status >= 300) {
        throw apiError(response, status);
      }
      if ("sse".equals(kind)) {
        callerOwns = true;
        return new EventStream(response.getBody());
      }
      byte[] bytes = response.getBody().readAllBytes();
      if ("binary".equals(kind)) {
        return bytes;
      }
      return bytes.length == 0 ? null : Json.parse(bytes);
    } catch (HttpTimeoutException e) {
      throw new VaifException("TIMEOUT", "Request timed out", 0, null, null, null, e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new VaifException("CANCELLED", "Request interrupted", 0, null, null, null, e);
    } catch (IllegalArgumentException e) {
      throw VaifException.validation("Invalid HTTP request");
    } catch (IOException e) {
      throw new VaifException("NETWORK_ERROR", "Network request failed", 0, null, null, null, e);
    } finally {
      if (response != null && !callerOwns) {
        try {
          response.close();
        } catch (IOException ignored) {
          // The response has been read; a close failure does not change the result.
        }
      }
    }
  }

  private static VaifException apiError(Transport.Response response, int status)
      throws IOException {
    byte[] errorBytes = response.getBody().readNBytes(1024 * 1024);
    Object value;
    try {
      value = Json.parse(errorBytes);
    } catch (VaifException notJson) {
      value = new String(errorBytes, StandardCharsets.UTF_8);
    }
    Map<String, Object> error = value instanceof Map ? Json.object(value) : Map.of();
    String code =
        error.get("code") instanceof String
            ? (String) error.get("code")
            : error.get("error") instanceof String ? (String) error.get("error") : "HTTP_ERROR";
    String message =
        error.get("message") instanceof String
            ? (String) error.get("message")
            : "API request failed (HTTP " + status + ")";
    String requestId =
        error.get("requestId") instanceof String
            ? (String) error.get("requestId")
            : response.header("x-request-id");
    String retryAfter = response.header("retry-after");
    // Only the API's own typed auth refusal may refresh; a function's response carries a run ID.
    boolean refreshable =
        status == 401
            && List.of("TOKEN_INVALID", "TOKEN_EXPIRED").contains(code)
            && "UNAUTHORIZED".equals(error.get("error"))
            && response.header("X-Vaif-Run-Id") == null;
    VaifException failure =
        refreshable
            ? new AuthenticationFailure(
                code, message, status, requestId, error.get("details"), retryAfter)
            : new VaifException(
                code, message, status, requestId, error.get("details"), retryAfter, null);
    return failure.responseBody(value);
  }

  private static final class AuthenticationFailure extends VaifException {
    private static final long serialVersionUID = 1L;

    AuthenticationFailure(
        String code,
        String message,
        int status,
        String requestId,
        Object details,
        String retryAfter) {
      super(code, message, status, requestId, details, retryAfter, null);
    }
  }

  /** Builder for {@link VaifClient}. Each {@link #build()} call uses the current settings. */
  public static final class Builder {
    private String baseUrl = "https://api.vaif.studio";
    private String projectId;
    private String apiKey;
    private String storageUrl;
    private Supplier<String> tokenProvider;
    private Transport transport;
    private Duration timeout = Duration.ofSeconds(30);
    private SessionStore sessionStore;
    private Realtime.SocketFactory socketFactory;

    /** Creates a builder with the default API origin and timeout. */
    public Builder() {}

    /**
     * Sets the API base URL.
     *
     * @param value HTTP(S) origin with an optional path, without credentials, query, or fragment
     * @return this builder
     * @throws VaifException if the URL is invalid
     * @throws NullPointerException if value is null
     */
    public Builder baseUrl(String value) {
      Objects.requireNonNull(value, "baseUrl");
      if (validUrl(value).getQuery() != null) {
        throw VaifException.validation("Base URL cannot contain a query");
      }
      baseUrl = value;
      return this;
    }

    /**
     * Scopes the client to a project. Without a project ID the client uses platform scope.
     *
     * @param value project ID, or null for platform scope
     * @return this builder
     */
    public Builder projectId(String value) {
      projectId = value;
      return this;
    }

    /**
     * Sets the project or service-role API key, sent in the {@code x-vaif-key} header.
     *
     * @param value API key, or null to send none
     * @return this builder
     */
    public Builder apiKey(String value) {
      apiKey = value;
      return this;
    }

    /**
     * Sets the base URL for public object URLs built by {@link Storage#getPublicUrl}.
     *
     * @param value HTTP(S) base URL, or null to derive it from the API base URL
     * @return this builder
     */
    public Builder storageUrl(String value) {
      storageUrl = value;
      return this;
    }

    /**
     * Sets a fixed bearer token.
     *
     * @param value bearer token, or null to send none
     * @return this builder
     */
    public Builder accessToken(String value) {
      tokenProvider = () -> value;
      return this;
    }

    /**
     * Sets a bearer token supplier. The client calls it for each request without holding its own
     * lock.
     *
     * @param value token supplier that may return null to send no token, or null to remove it
     * @return this builder
     */
    public Builder accessToken(Supplier<String> value) {
      tokenProvider = value;
      return this;
    }

    /**
     * Sets the HTTP transport. The transport must not follow redirects.
     *
     * @param value blocking transport
     * @return this builder
     * @throws NullPointerException if value is null
     */
    public Builder transport(Transport value) {
      transport = Objects.requireNonNull(value, "transport");
      return this;
    }

    /**
     * Saves sessions so they survive a restart. Without a store, sessions live only in memory.
     * Entries are keyed by API origin and project.
     *
     * @param value session store
     * @return this builder
     * @throws NullPointerException if value is null
     */
    public Builder sessionStore(SessionStore value) {
      sessionStore = Objects.requireNonNull(value, "sessionStore");
      return this;
    }

    /**
     * Sets the WebSocket factory used by {@link Realtime}. The factory must not follow redirects.
     *
     * @param value socket factory
     * @return this builder
     * @throws NullPointerException if value is null
     */
    public Builder socketFactory(Realtime.SocketFactory value) {
      socketFactory = Objects.requireNonNull(value, "socketFactory");
      return this;
    }

    /**
     * Sets the timeout for HTTP requests, WebSocket connections, and subscription acknowledgement.
     *
     * @param value positive duration
     * @return this builder
     * @throws VaifException if the duration is null, zero, or negative
     */
    public Builder timeout(Duration value) {
      if (value == null || value.isZero() || value.isNegative()) {
        throw VaifException.validation("Timeout must be positive");
      }
      timeout = value;
      return this;
    }

    /**
     * Creates a client. When a session store is set, the saved session for this API origin and
     * project is loaded.
     *
     * @return a new client
     * @throws VaifException if a URL is invalid or the saved session cannot be loaded
     */
    public VaifClient build() {
      return new VaifClient(this);
    }
  }
}
