package studio.vaif.sdk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static studio.vaif.sdk.TestSupport.client;
import static studio.vaif.sdk.TestSupport.fails;
import static studio.vaif.sdk.TestSupport.response;
import static studio.vaif.sdk.TestSupport.stream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import studio.vaif.sdk.TestSupport.FakeTransport;

class StorageTest {
  @Test
  void signedTransfersCarryNoApiCredentials() {
    FakeTransport transport = new FakeTransport();
    VaifClient client = client(transport);
    transport.answer(200, "{\"url\":\"https://objects.example.test/file?sig=secret\"}");
    transport.answer(200, "");

    Map<String, Object> result =
        client
            .storage()
            .upload("a.txt", "bytes".getBytes(StandardCharsets.UTF_8), "assets", "text/plain");

    assertEquals(Map.of("key", "a.txt", "bucket", "assets", "size", 5), result);
    assertEquals(
        Map.of("key", "a.txt", "sizeBytes", 5, "bucket", "assets", "contentType", "text/plain"),
        transport.jsonBody(0));
    Transport.Request put = transport.request(1);
    assertEquals("PUT", put.getMethod());
    assertEquals("https://objects.example.test/file?sig=secret", put.getUri().toString());
    assertEquals(Map.of("Content-Type", "text/plain"), put.getHeaders());
    assertEquals("bytes", new String(put.getBody(), StandardCharsets.UTF_8));

    transport.answer(200, "{\"url\":\"https://objects.example.test/file\"}");
    transport.answer(200, "payload");
    assertEquals(
        "payload",
        new String(client.storage().download("a.txt", "assets"), StandardCharsets.UTF_8));
    assertEquals(
        Map.of("key", "a.txt", "bucket", "assets", "expiresIn", 3600), transport.jsonBody(2));
    assertEquals(Map.of(), transport.request(3).getHeaders());

    fails("VALIDATION_ERROR", () -> client.storage().getUploadUrl("a", 0, "assets", "text/plain"));
  }

  @Test
  void signedUrlsRequireHttpsExceptLoopback() {
    FakeTransport transport = new FakeTransport();
    VaifClient client = client(transport);
    transport.answer(200, "{\"url\":\"http://objects.example.test/file\"}");
    fails("VALIDATION_ERROR", () -> client.storage().createSignedUrl("x", "assets", 60));

    transport.answer(200, "{\"url\":\"http://objects.example.test/upload\"}");
    fails(
        "VALIDATION_ERROR",
        () -> client.storage().upload("x", new byte[] {1}, "assets", "text/plain"));
    assertEquals(2, transport.requests.size());

    for (String host : List.of("localhost", "127.0.0.1", "[::1]")) {
      transport.answer(200, "{\"url\":\"http://" + host + ":9000/file\"}");
      assertEquals(
          "http://" + host + ":9000/file", client.storage().createSignedUrl("x", "assets", 60));
    }
  }

  @Test
  void signedUrlsAreRequestedInKeyBucketLifetimeOrder() {
    FakeTransport transport = new FakeTransport();
    VaifClient client = client(transport);
    transport.answer(200, "{\"url\":\"https://objects.example.test/a\"}");
    transport.answer(200, "{\"url\":\"https://objects.example.test/b\"}");

    assertEquals(
        Map.of("a", "https://objects.example.test/a", "b", "https://objects.example.test/b"),
        client.storage().createSignedUrls(List.of("a", "b"), null, 60));
    assertEquals(Map.of("key", "a", "bucket", "default", "expiresIn", 60), transport.jsonBody(0));
  }

  @Test
  void signedTransferErrorsNeverExposeTheQuery() {
    for (String expected : List.of("HTTP_ERROR", "REDIRECT_REFUSED", "NETWORK_ERROR")) {
      VaifClient client =
          VaifClient.builder()
              .transport(
                  request -> {
                    if (request.getUri().getPath().equals("/storage/download-url")) {
                      return response(
                          200,
                          Map.of(
                              "url", "https://objects.example.test/f?X-Amz-Signature=SIGSECRET"));
                    }
                    if (expected.equals("NETWORK_ERROR")) {
                      throw new IOException(
                          "connect failed"
                              + " https://objects.example.test/f?X-Amz-Signature=SIGSECRET");
                    }
                    return new Transport.Response(
                        expected.equals("HTTP_ERROR") ? 403 : 307,
                        Map.of("Location", "https://evil.test/?X-Amz-Signature=SIGSECRET"),
                        stream("<Error>SIGSECRET</Error>"));
                  })
              .build();

      VaifException error = fails(expected, () -> client.storage().download("f", "assets"));

      assertEquals("Signed storage transfer failed", error.getMessage());
      for (Throwable t = error; t != null; t = t.getCause()) {
        assertFalse(String.valueOf(t).contains("SIGSECRET"), String.valueOf(t));
      }
      assertFalse(String.valueOf(error.getResponseBody()).contains("SIGSECRET"));
    }
  }

  @Test
  void publicUrlsUseTheEnvironmentContentHost() {
    VaifClient staging =
        VaifClient.builder().projectId("p").baseUrl("https://api.stage.vaif.studio").build();
    assertEquals(
        "https://stage.vaifusercontent.com/p/assets/a%20b/x%3F",
        staging.storage().getPublicUrl("a b/x?", "assets"));

    VaifClient custom =
        VaifClient.builder()
            .projectId("p")
            .baseUrl("https://api.example.test")
            .storageUrl("https://cdn.example.test/")
            .build();
    assertEquals("https://cdn.example.test/p/default/a", custom.storage().getPublicUrl("a", null));

    fails(
        "PROJECT_ID_REQUIRED",
        () -> VaifClient.builder().build().storage().getPublicUrl("a", null));
  }
}
