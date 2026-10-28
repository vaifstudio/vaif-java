package studio.vaif.sdk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class FileSessionStoreTest {
  @TempDir Path directory;

  @Test
  void sessionsSurviveARestartPerOrigin() throws IOException {
    FileSessionStore store = new FileSessionStore(directory.resolve("sessions"));
    VaifClient one =
        VaifClient.builder().baseUrl("https://one.test").projectId("p").sessionStore(store).build();

    one.auth().setSession(new Session("secret", "refresh"));

    assertEquals(
        new Session("secret", "refresh"),
        VaifClient.builder()
            .baseUrl("https://one.test")
            .projectId("p")
            .sessionStore(store)
            .build()
            .auth()
            .getSession());
    assertNull(
        VaifClient.builder()
            .baseUrl("https://two.test")
            .projectId("p")
            .sessionStore(store)
            .build()
            .auth()
            .getSession());
    assertEquals(
        "rwx------",
        PosixFilePermissions.toString(
            Files.getPosixFilePermissions(directory.resolve("sessions"))));
    try (Stream<Path> files = Files.list(directory.resolve("sessions"))) {
      Path file = files.findFirst().orElseThrow();
      assertEquals("rw-------", PosixFilePermissions.toString(Files.getPosixFilePermissions(file)));
    }

    one.setAuth(null);
    assertNull(store.load(one.sessionKey()));
  }

  @Test
  void invalidSessionFilesAreIoErrors() throws IOException {
    FileSessionStore store = new FileSessionStore(directory);
    for (String content :
        List.of(
            "{\"accessToken\":42,\"refreshToken\":true}",
            "[\"not an object\"]",
            "{\"accessToken\":\"\"}",
            "not json")) {
      store.save("key", new Session("a", "r"));
      try (Stream<Path> files = Files.list(directory)) {
        Files.writeString(files.findFirst().orElseThrow(), content);
      }

      IOException error = assertThrows(IOException.class, () -> store.load("key"));

      assertEquals("Invalid session file", error.getMessage());
      store.clear("key");
    }
  }
}
