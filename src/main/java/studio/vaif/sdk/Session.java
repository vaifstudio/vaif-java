package studio.vaif.sdk;

import java.util.Objects;

/** An access token and its refresh token. Both are secrets; {@link #toString()} omits them. */
public final class Session {
  private final String accessToken;
  private final String refreshToken;

  /**
   * Creates a session.
   *
   * @param accessToken access token
   * @param refreshToken refresh token, or null if the session cannot be refreshed
   * @throws VaifException if accessToken is null or empty
   */
  public Session(String accessToken, String refreshToken) {
    if (accessToken == null || accessToken.isEmpty()) {
      throw VaifException.validation("Access token is required");
    }
    this.accessToken = accessToken;
    this.refreshToken = refreshToken;
  }

  /**
   * Returns the access token.
   *
   * @return the access token
   */
  public String getAccessToken() {
    return accessToken;
  }

  /**
   * Returns the refresh token.
   *
   * @return the refresh token, or null if the session cannot be refreshed
   */
  public String getRefreshToken() {
    return refreshToken;
  }

  /**
   * Compares both tokens.
   *
   * @param other object to compare, including null
   * @return true if the other object is a session with equal tokens
   */
  @Override
  public boolean equals(Object other) {
    if (!(other instanceof Session)) {
      return false;
    }
    Session that = (Session) other;
    return accessToken.equals(that.accessToken) && Objects.equals(refreshToken, that.refreshToken);
  }

  /**
   * Computes a hash from both tokens.
   *
   * @return the hash code
   */
  @Override
  public int hashCode() {
    return Objects.hash(accessToken, refreshToken);
  }

  /**
   * Returns a representation without the tokens.
   *
   * @return {@code Session[redacted]}
   */
  @Override
  public String toString() {
    return "Session[redacted]";
  }
}
