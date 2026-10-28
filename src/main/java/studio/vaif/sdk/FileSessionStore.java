package studio.vaif.sdk;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.PosixFilePermissions;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.Map;

/**
 * A session store that keeps one file per key in a private directory.
 *
 * <p>Files hold unencrypted tokens. Use a directory that only the application can read, on a
 * filesystem with POSIX permissions. To encrypt sessions, implement {@link SessionStore} on top of
 * a secret store instead.
 */
public final class FileSessionStore implements SessionStore {
  private final Path directory;

  /**
   * Creates the store and restricts the directory to its owner (mode 0700).
   *
   * @param directory directory reserved for session files; created if missing
   * @throws IOException if the directory cannot be created or restricted, or is a symbolic link
   * @throws UnsupportedOperationException if the filesystem does not support POSIX permissions
   */
  public FileSessionStore(Path directory) throws IOException {
    this.directory = directory.toAbsolutePath().normalize();
    Files.createDirectories(
        this.directory,
        PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rwx------")));
    if (Files.isSymbolicLink(this.directory)) {
      throw new IOException("Session directory cannot be a symbolic link");
    }
    Files.setPosixFilePermissions(this.directory, PosixFilePermissions.fromString("rwx------"));
  }

  /**
   * Loads the session saved under a key.
   *
   * @param key key that identifies the API origin and project
   * @return the saved session, or null if there is none
   * @throws IOException if the file cannot be read or does not hold a valid session
   */
  @Override
  public synchronized Session load(String key) throws IOException {
    Path path = file(key);
    if (!Files.exists(path, LinkOption.NOFOLLOW_LINKS)) {
      return null;
    }
    if (!Files.isRegularFile(path, LinkOption.NOFOLLOW_LINKS)) {
      throw new IOException("Invalid session file");
    }
    try {
      Map<String, Object> value = Json.object(Json.parse(Files.readAllBytes(path)));
      Object access = value.get("accessToken");
      Object refresh = value.get("refreshToken");
      if (!(access instanceof String) || (refresh != null && !(refresh instanceof String))) {
        throw new IOException("Invalid session file");
      }
      return new Session((String) access, (String) refresh);
    } catch (VaifException e) {
      throw new IOException("Invalid session file", e);
    }
  }

  /**
   * Saves a session under a key. The file is written with mode 0600 and moved into place
   * atomically.
   *
   * @param key key that identifies the API origin and project
   * @param session session to save
   * @throws IOException if the session cannot be saved
   */
  @Override
  public synchronized void save(String key, Session session) throws IOException {
    Path temporary =
        Files.createTempFile(
            directory,
            ".session-",
            ".tmp",
            PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rw-------")));
    try {
      Files.write(
          temporary,
          Json.bytes(
              Json.map(
                  "accessToken", session.getAccessToken(),
                  "refreshToken", session.getRefreshToken())));
      Files.move(
          temporary,
          file(key),
          StandardCopyOption.ATOMIC_MOVE,
          StandardCopyOption.REPLACE_EXISTING);
    } finally {
      Files.deleteIfExists(temporary);
    }
  }

  /**
   * Removes the session saved under a key. Removing a missing entry succeeds.
   *
   * @param key key that identifies the API origin and project
   * @throws IOException if the file cannot be removed
   */
  @Override
  public synchronized void clear(String key) throws IOException {
    Files.deleteIfExists(file(key));
  }

  private Path file(String key) {
    try {
      byte[] digest =
          MessageDigest.getInstance("SHA-256").digest(key.getBytes(StandardCharsets.UTF_8));
      StringBuilder name = new StringBuilder();
      for (byte b : digest) {
        name.append(String.format(Locale.ROOT, "%02x", b & 0xff));
      }
      return directory.resolve(name + ".json");
    } catch (NoSuchAlgorithmException e) {
      throw new IllegalStateException("SHA-256 is unavailable", e);
    }
  }
}
