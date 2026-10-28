package studio.vaif.sdk;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.WebSocket;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/**
 * Table change subscriptions over the API's WebSocket endpoint.
 *
 * <p>Credentials travel in the first WebSocket message, never in the URL. A subscription does not
 * reconnect; create a new one after a failure. Callbacks can run on WebSocket and SDK timer
 * threads.
 */
public final class Realtime {
  private static final int MAX_MESSAGE_CHARS = 1024 * 1024;

  /**
   * Opens WebSocket connections for {@link Realtime}. Implementations must not follow redirects.
   */
  @FunctionalInterface
  public interface SocketFactory {
    /**
     * Opens a WebSocket connection without following redirects.
     *
     * @param uri {@code ws} or {@code wss} endpoint
     * @param listener the SDK's listener for the socket's events
     * @return a future that completes with the socket, or exceptionally if the connection fails
     */
    CompletableFuture<WebSocket> open(URI uri, WebSocket.Listener listener);
  }

  private final VaifClient client;
  private final SocketFactory factory;

  Realtime(VaifClient client, SocketFactory factory) {
    this.client = client;
    if (factory != null) {
      this.factory = factory;
      return;
    }
    // One HTTP client for every subscription of this client; each one holds a selector thread.
    HttpClient http =
        HttpClient.newBuilder()
            .followRedirects(HttpClient.Redirect.NEVER)
            .connectTimeout(client.timeout())
            .build();
    this.factory =
        (uri, listener) ->
            http.newWebSocketBuilder().connectTimeout(client.timeout()).buildAsync(uri, listener);
  }

  /**
   * Returns the WebSocket endpoint for an API base URL. {@code https} becomes {@code wss} in any
   * letter case. {@code http} becomes {@code ws} only for {@code localhost}, {@code 127.0.0.1}, and
   * {@code ::1}; any other URL is refused.
   *
   * @param baseUrl API base URL without credentials, query, or fragment
   * @return the realtime endpoint
   * @throws VaifException if the URL is invalid or is plain HTTP to a host other than loopback
   */
  public static URI websocketUrl(String baseUrl) {
    URI uri = VaifClient.secureUrl(baseUrl);
    if (uri.getQuery() != null) {
      throw VaifException.validation("Realtime base URL cannot contain a query");
    }
    String scheme = uri.getScheme().equalsIgnoreCase("https") ? "wss" : "ws";
    String rest = uri.toString().substring(uri.toString().indexOf(':') + 1).replaceAll("/+$", "");
    return URI.create(scheme + ":" + rest + "/realtime/ws");
  }

  /**
   * Subscribes to every change of a table.
   *
   * @param table table name: letters, digits, and underscores, not starting with a digit
   * @param events receives the subscription acknowledgement and each matching change
   * @param errors receives the failure that ends the subscription
   * @return the subscription; close it to release its socket and timer
   * @throws VaifException if the table name is invalid
   * @throws NullPointerException if a callback is null
   */
  public Subscription subscribe(
      String table, Consumer<Map<String, Object>> events, Consumer<VaifException> errors) {
    return subscribe(table, Map.of(), List.of(), events, errors);
  }

  /**
   * Subscribes to the changes of a table that match equality filters, with selected columns.
   *
   * @param table table name: letters, digits, and underscores, not starting with a digit
   * @param equalityFilters column names and the values they must equal
   * @param columns columns to include in each change; empty includes all columns
   * @param events receives the subscription acknowledgement and each matching change
   * @param errors receives the failure that ends the subscription
   * @return the subscription; close it to release its socket and timer
   * @throws VaifException if a table or column name is invalid
   * @throws NullPointerException if an argument is null
   */
  public Subscription subscribe(
      String table,
      Map<String, ?> equalityFilters,
      List<String> columns,
      Consumer<Map<String, Object>> events,
      Consumer<VaifException> errors) {
    identifier(table);
    List<String> query = new ArrayList<>();
    equalityFilters.forEach(
        (column, value) -> {
          identifier(column);
          query.add(
              column + ".eq=" + URLEncoder.encode(String.valueOf(value), StandardCharsets.UTF_8));
        });
    columns.forEach(Realtime::identifier);
    if (!columns.isEmpty()) {
      query.add("columns=" + String.join(",", columns));
    }
    String channel = "table:" + table + (query.isEmpty() ? "" : "?" + String.join("&", query));
    Subscription subscription =
        new Subscription(channel, Objects.requireNonNull(events), Objects.requireNonNull(errors));
    try {
      CompletableFuture<WebSocket> pending =
          factory.open(websocketUrl(client.baseUrl()), subscription.listener);
      subscription.timer.schedule(
          () -> {
            if (!subscription.ready.isDone()) {
              subscription.fail(
                  new VaifException("REALTIME_TIMEOUT", "Realtime subscription timed out"));
            }
          },
          client.timeout().toMillis(),
          TimeUnit.MILLISECONDS);
      pending.whenComplete(
          (socket, error) -> {
            if (error != null) {
              subscription.fail(transportError(error));
            } else if (subscription.closed.get()) {
              socket.abort();
            }
          });
    } catch (RuntimeException e) {
      subscription.fail(e instanceof VaifException ? (VaifException) e : transportError(e));
    }
    return subscription;
  }

  private static void identifier(String value) {
    if (value == null || !value.matches("[A-Za-z_][A-Za-z0-9_]*")) {
      throw VaifException.validation("Invalid realtime identifier");
    }
  }

  private static VaifException transportError(Throwable cause) {
    return new VaifException(
        "REALTIME_ERROR", "Realtime transport failed", 0, null, null, null, cause);
  }

  /**
   * One table subscription. {@link #ready()} completes when the server acknowledges it. Close it
   * when it is no longer needed.
   */
  public final class Subscription implements AutoCloseable {
    private final WebSocket.Listener listener = new Listener();
    private final String channel;
    private final Consumer<Map<String, Object>> events;
    private final Consumer<VaifException> errors;
    private final CompletableFuture<Void> ready = new CompletableFuture<>();
    private final AtomicBoolean closed = new AtomicBoolean();
    private final StringBuilder fragments = new StringBuilder();
    private final ScheduledExecutorService timer =
        Executors.newSingleThreadScheduledExecutor(
            task -> {
              Thread thread = new Thread(task, "vaif-realtime");
              thread.setDaemon(true);
              return thread;
            });
    private volatile WebSocket socket;
    private volatile boolean awaitingHeartbeat;
    private boolean welcomed;
    private boolean subscribed;

    Subscription(
        String channel, Consumer<Map<String, Object>> events, Consumer<VaifException> errors) {
      this.channel = channel;
      this.events = events;
      this.errors = errors;
    }

    /**
     * Returns a future that completes when the server acknowledges the subscription.
     *
     * @return the acknowledgement future; it completes exceptionally with {@link VaifException} if
     *     the subscription fails or is closed first
     */
    public CompletableFuture<Void> ready() {
      return ready;
    }

    /**
     * Closes the socket and the heartbeat timer. A pending {@link #ready()} completes exceptionally
     * with {@code CANCELLED}. Later calls have no effect.
     */
    @Override
    public void close() {
      if (closed.compareAndSet(false, true)) {
        timer.shutdownNow();
        if (socket != null) {
          socket.abort();
        }
        ready.completeExceptionally(new VaifException("CANCELLED", "Realtime subscription closed"));
      }
    }

    private void send(Map<String, Object> value) {
      if (closed.get()) {
        return;
      }
      try {
        socket
            .sendText(Json.stringify(value), true)
            .whenComplete(
                (unused, error) -> {
                  if (error != null) {
                    fail(transportError(error));
                  }
                });
      } catch (RuntimeException e) {
        fail(transportError(e));
      }
    }

    private void fail(VaifException error) {
      if (closed.compareAndSet(false, true)) {
        timer.shutdownNow();
        if (socket != null) {
          socket.abort();
        }
        ready.completeExceptionally(error);
        try {
          errors.accept(error);
        } catch (RuntimeException ignored) {
          // An application callback must not throw into the socket's threads.
        }
      }
    }

    private void handle(Map<String, Object> frame) {
      awaitingHeartbeat = false;
      Object type = frame.get("type");
      if ("welcome".equals(type) && !welcomed) {
        welcomed = true;
        send(Map.of("type", "subscribe", "channel", channel));
        Object requested = frame.get("heartbeatIntervalMs");
        long interval = requested instanceof Number ? ((Number) requested).longValue() : 25_000;
        if (interval < 1_000 || interval > 300_000) {
          throw new VaifException("INVALID_RESPONSE", "Invalid realtime heartbeat interval");
        }
        timer.scheduleAtFixedRate(this::heartbeat, interval, interval, TimeUnit.MILLISECONDS);
      } else if ("subscribed".equals(type) && welcomed && channel.equals(frame.get("channel"))) {
        if (Boolean.FALSE.equals(frame.get("ok"))) {
          throw new VaifException("REALTIME_ERROR", "Realtime subscription refused");
        }
        subscribed = true;
        ready.complete(null);
        events.accept(Collections.unmodifiableMap(frame));
      } else if ("error".equals(type)) {
        Object code = frame.get("code");
        throw new VaifException(
            code instanceof String ? (String) code : "REALTIME_ERROR", "Realtime request refused");
      } else if ("db_change".equals(type) && subscribed) {
        Object channels = frame.get("channels");
        if (channels instanceof List && ((List<?>) channels).contains(channel)) {
          events.accept(Collections.unmodifiableMap(frame));
        }
      }
    }

    private void heartbeat() {
      if (awaitingHeartbeat) {
        fail(new VaifException("REALTIME_TIMEOUT", "Realtime heartbeat timed out"));
      } else {
        awaitingHeartbeat = true;
        send(Map.of("type", "ping"));
      }
    }

    /** Receives socket events. Kept private so the callbacks are not part of the public API. */
    private final class Listener implements WebSocket.Listener {
      @Override
      public void onOpen(WebSocket webSocket) {
        socket = webSocket;
        if (closed.get()) {
          webSocket.abort();
          return;
        }
        try {
          send(
              Json.map(
                  "type", "auth", "apiKey", client.apiKey(), "accessToken", client.currentToken()));
          webSocket.request(1);
        } catch (RuntimeException e) {
          fail(transportError(e));
        }
      }

      @Override
      public CompletionStage<?> onText(WebSocket webSocket, CharSequence data, boolean last) {
        if (closed.get()) {
          return null;
        }
        try {
          if (fragments.length() + data.length() > MAX_MESSAGE_CHARS) {
            throw new VaifException(
                "REALTIME_OVERFLOW", "Realtime message exceeds 1,048,576 characters");
          }
          fragments.append(data);
          if (last) {
            String message = fragments.toString();
            fragments.setLength(0);
            handle(Json.object(Json.parse(message.getBytes(StandardCharsets.UTF_8))));
          }
          webSocket.request(1);
        } catch (RuntimeException e) {
          fail(e instanceof VaifException ? (VaifException) e : transportError(e));
        }
        return null;
      }

      @Override
      public CompletionStage<?> onBinary(WebSocket webSocket, ByteBuffer data, boolean last) {
        fail(new VaifException("INVALID_RESPONSE", "Expected a text realtime frame"));
        return null;
      }

      @Override
      public CompletionStage<?> onClose(WebSocket webSocket, int status, String reason) {
        fail(
            new VaifException(
                "REALTIME_CLOSED", "Realtime connection closed", status, null, null, null, null));
        return null;
      }

      @Override
      public void onError(WebSocket webSocket, Throwable error) {
        fail(transportError(error));
      }
    }
  }
}
