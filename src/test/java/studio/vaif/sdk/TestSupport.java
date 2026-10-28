package studio.vaif.sdk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.http.WebSocket;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import org.junit.jupiter.api.function.Executable;

/** Shared fakes and assertions for the SDK tests. */
final class TestSupport {
  private TestSupport() {}

  /** A transport that records requests and answers from a queue. */
  static final class FakeTransport implements Transport {
    final List<Transport.Request> requests = new ArrayList<>();
    final Deque<Transport.Response> answers = new ArrayDeque<>();

    void answer(int status, String body) {
      answer(status, Map.of(), body);
    }

    void answer(int status, Map<String, String> headers, String body) {
      answers.add(new Transport.Response(status, headers, stream(body)));
    }

    @Override
    public Transport.Response execute(Transport.Request request) {
      requests.add(request);
      if (answers.isEmpty()) {
        throw new AssertionError("Unexpected request: " + request.getUri().getPath());
      }
      return answers.remove();
    }

    Transport.Request request(int index) {
      return requests.get(index);
    }

    Map<String, Object> jsonBody(int index) {
      return Json.object(Json.parse(requests.get(index).getBody()));
    }
  }

  /** A session store in memory that can be told to fail. */
  static final class MemoryStore implements SessionStore {
    final Map<String, Session> saved = new HashMap<>();
    boolean failSave;
    boolean failAfterSave;
    boolean failClear;

    @Override
    public Session load(String key) {
      return saved.get(key);
    }

    @Override
    public void save(String key, Session session) throws IOException {
      if (failSave) {
        throw new IOException("save failed");
      }
      saved.put(key, session);
      if (failAfterSave) {
        throw new IOException("save reported failure after writing");
      }
    }

    @Override
    public void clear(String key) throws IOException {
      if (failClear) {
        throw new IOException("clear failed");
      }
      saved.remove(key);
    }
  }

  /** A WebSocket that records the text it sends. */
  static final class FakeSocket implements WebSocket {
    final List<String> sent = new ArrayList<>();
    boolean aborted;

    @Override
    public CompletableFuture<WebSocket> sendText(CharSequence text, boolean last) {
      sent.add(text.toString());
      return CompletableFuture.completedFuture(this);
    }

    @Override
    public CompletableFuture<WebSocket> sendBinary(ByteBuffer bytes, boolean last) {
      return CompletableFuture.completedFuture(this);
    }

    @Override
    public CompletableFuture<WebSocket> sendPing(ByteBuffer bytes) {
      return CompletableFuture.completedFuture(this);
    }

    @Override
    public CompletableFuture<WebSocket> sendPong(ByteBuffer bytes) {
      return CompletableFuture.completedFuture(this);
    }

    @Override
    public CompletableFuture<WebSocket> sendClose(int status, String reason) {
      return CompletableFuture.completedFuture(this);
    }

    @Override
    public void request(long count) {}

    @Override
    public String getSubprotocol() {
      return "";
    }

    @Override
    public boolean isOutputClosed() {
      return aborted;
    }

    @Override
    public boolean isInputClosed() {
      return aborted;
    }

    @Override
    public void abort() {
      aborted = true;
    }

    Map<String, Object> sentJson(int index) {
      return Json.object(Json.parse(sent.get(index).getBytes(StandardCharsets.UTF_8)));
    }
  }

  /** A project client whose project ID needs path encoding. */
  static VaifClient client(FakeTransport transport) {
    return VaifClient.builder()
        .baseUrl("https://api.example.test")
        .projectId("p /?")
        .apiKey("service-secret")
        .transport(transport)
        .build();
  }

  static VaifException fails(String code, Executable action) {
    VaifException error = assertThrows(VaifException.class, action);
    assertEquals(code, error.getCode());
    return error;
  }

  static Transport.Response response(int status, Map<String, ?> body) {
    return new Transport.Response(status, Map.of(), new ByteArrayInputStream(Json.bytes(body)));
  }

  static ByteArrayInputStream stream(String body) {
    return new ByteArrayInputStream(body.getBytes(StandardCharsets.UTF_8));
  }
}
