package studio.vaif.sdk;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/** The API's answer to a sign-in, sign-up, MFA, or refresh request: tokens or an MFA challenge. */
public final class AuthResult {
  private final Map<String, Object> value;

  AuthResult(Map<String, Object> value) {
    this.value = Collections.unmodifiableMap(new LinkedHashMap<>(value));
  }

  /**
   * Returns the access token.
   *
   * @return the access token, or null for an MFA challenge or a response without one
   */
  public String getAccessToken() {
    return string("accessToken");
  }

  /**
   * Returns the refresh token. Refresh tokens rotate; each refresh returns a replacement.
   *
   * @return the refresh token, or null if the response has none
   */
  public String getRefreshToken() {
    return string("refreshToken");
  }

  /**
   * Returns the token that {@link Auth#verifyMfa} needs to complete an MFA challenge.
   *
   * @return the challenge token, or null if the response is not a challenge
   */
  public String getChallengeToken() {
    return string("challengeToken");
  }

  /**
   * Reports whether the API requires a second factor before it issues tokens.
   *
   * @return true for an MFA challenge
   */
  public boolean isMfaRequired() {
    return Boolean.TRUE.equals(value.get("mfaRequired"));
  }

  /**
   * Returns the access token lifetime.
   *
   * @return the lifetime in seconds, or null if the response has none
   */
  public Long getExpiresIn() {
    Object expiresIn = value.get("expiresIn");
    return expiresIn instanceof Number ? ((Number) expiresIn).longValue() : null;
  }

  /**
   * Returns the user object from the response.
   *
   * @return the user, or an empty map if the response has none
   */
  public Map<String, Object> getUser() {
    return value.get("user") instanceof Map ? Json.object(value.get("user")) : Map.of();
  }

  /**
   * Returns the complete response.
   *
   * @return an unmodifiable shallow copy of the response object
   */
  public Map<String, Object> asMap() {
    return value;
  }

  private String string(String key) {
    return value.get(key) instanceof String ? (String) value.get(key) : null;
  }
}
