package studio.vaif.sdk;

import java.io.IOException;

/**
 * Saves the managed session so it survives a restart. Each key identifies one API origin and
 * project; do not share a key between independent users.
 */
public interface SessionStore {
  /**
   * Loads the session saved under a key.
   *
   * @param key key that identifies the API origin and project
   * @return the saved session, or null if there is none
   * @throws IOException if the store cannot read the session
   */
  Session load(String key) throws IOException;

  /**
   * Saves a session under a key, replacing any saved session.
   *
   * @param key key that identifies the API origin and project
   * @param session session to save
   * @throws IOException if the store cannot save the session
   */
  void save(String key, Session session) throws IOException;

  /**
   * Removes the session saved under a key. Removing a missing entry succeeds.
   *
   * @param key key that identifies the API origin and project
   * @throws IOException if the store cannot remove the session
   */
  void clear(String key) throws IOException;
}
