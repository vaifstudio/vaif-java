package studio.vaif.sdk;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Sign-in, session, and user operations.
 *
 * <p>With a project ID these operations act on the project's app users. Without one they act on the
 * VAIF Studio platform account. Methods that return tokens install them as the managed session only
 * if no other session change happened while the request was in flight.
 */
public final class Auth {
  private final VaifClient client;
  private final Object refreshLock = new Object();
  private Session session;
  private long generation;
  private Session refreshedFrom;
  private Session refreshedTo;

  Auth(VaifClient client) {
    this.client = client;
    if (client.sessionStore() != null) {
      try {
        session = client.sessionStore().load(client.sessionKey());
        if (session != null) {
          client.installAuthToken(session.getAccessToken());
        }
      } catch (IOException | RuntimeException e) {
        throw storageError(e);
      }
    }
  }

  private static VaifException storageError(Exception cause) {
    return new VaifException(
        "SESSION_STORAGE_ERROR", "Session storage operation failed", 0, null, null, null, cause);
  }

  /**
   * Returns the managed session without contacting the API.
   *
   * @return the managed session, or null if there is none
   */
  public synchronized Session getSession() {
    return session;
  }

  /**
   * Installs a session as the managed session and saves it to the session store, if one is set. The
   * saved entry is removed before the new one is written, so a failed save leaves no session that a
   * later client could restore.
   *
   * @param value session to install
   * @throws VaifException if the session store fails; the client is then left without a session
   * @throws NullPointerException if value is null
   */
  public synchronized void setSession(Session value) {
    Objects.requireNonNull(value, "session");
    resetSession();
    try {
      if (client.sessionStore() != null) {
        client.sessionStore().clear(client.sessionKey());
        client.sessionStore().save(client.sessionKey(), value);
      }
      session = value;
      client.installAuthToken(value.getAccessToken());
    } catch (IOException | RuntimeException e) {
      // A partially successful save must not become a restorable session.
      try {
        if (client.sessionStore() != null) {
          client.sessionStore().clear(client.sessionKey());
        }
      } catch (IOException | RuntimeException cleanup) {
        e.addSuppressed(cleanup);
      }
      throw storageError(e);
    }
  }

  /**
   * Creates a project app-user account.
   *
   * @param email user email address
   * @param password user password
   * @return the token response, or an MFA challenge
   * @throws VaifException if validation, authentication, the API, or the transport fails
   * @throws ConsoleOnlyException if the client has no project ID; platform accounts are created in
   *     the console
   */
  public AuthResult signUp(String email, String password) {
    return signUp(email, password, Map.of());
  }

  /**
   * Creates a project app-user account with additional sign-up fields.
   *
   * @param email user email address
   * @param password user password
   * @param options additional API fields; the email and password arguments take precedence
   * @return the token response, or an MFA challenge
   * @throws VaifException if validation, authentication, the API, or the transport fails
   * @throws ConsoleOnlyException if the client has no project ID; platform accounts are created in
   *     the console
   */
  public AuthResult signUp(String email, String password, Map<String, ?> options) {
    requireProject(true);
    return tokens("/signup", credentials(email, password, options));
  }

  /**
   * Signs in with email and password. Platform sign-in uses the API's non-browser sign-in route,
   * which returns a refresh token.
   *
   * @param email user email address
   * @param password user password
   * @return the token response, or an MFA challenge
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public AuthResult signIn(String email, String password) {
    return signIn(email, password, Map.of());
  }

  /**
   * Signs in with email and password and additional API fields.
   *
   * @param email user email address
   * @param password user password
   * @param options additional API fields; the email and password arguments take precedence
   * @return the token response, or an MFA challenge
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public AuthResult signIn(String email, String password, Map<String, ?> options) {
    String route = client.getProjectId() == null ? "/cli/login" : "/login";
    return tokens(route, credentials(email, password, options));
  }

  /**
   * Completes an MFA challenge returned by sign-in or sign-up.
   *
   * @param challengeToken challenge token from {@link AuthResult#getChallengeToken()}
   * @param code one-time verification code
   * @return the token response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public AuthResult verifyMfa(String challengeToken, String code) {
    return tokens("/mfa/verify", Map.of("challengeToken", challengeToken, "code", code));
  }

  /**
   * Exchanges a refresh token for new credentials. Refresh tokens rotate: the response carries the
   * replacement. Refreshes run one at a time per client.
   *
   * @param refreshToken refresh token to exchange
   * @return the token response; it is installed only if the managed session did not change
   * @throws VaifException if the token is empty, the session changes before the request is sent
   *     ({@code SESSION_CHANGED}), the session store fails, or the request fails
   */
  public AuthResult refresh(String refreshToken) {
    if (refreshToken == null || refreshToken.isEmpty()) {
      throw VaifException.validation("Refresh token is required");
    }
    long expected;
    Session started;
    synchronized (this) {
      expected = generation;
      started = session;
    }
    synchronized (refreshLock) {
      return exchangeRefresh(refreshToken, expected, started).response;
    }
  }

  /**
   * Signs out the managed session. Equivalent to {@code signOut(null)}.
   *
   * @throws VaifException if clearing the session store or the revocation request fails
   */
  public void signOut() {
    signOut(null);
  }

  /**
   * Clears the managed session and revokes it on the server, including after its access token has
   * expired. A refresh in progress finishes first, so the credentials it issues are the ones
   * revoked. Revocation is attempted even if clearing the session store fails.
   *
   * @param refreshToken refresh token to revoke, or null to use the managed session's
   * @throws VaifException if clearing the session store ({@code SESSION_STORAGE_ERROR}) or the
   *     revocation request fails; if both fail, the revocation error is suppressed on the storage
   *     error
   */
  public void signOut(String refreshToken) {
    synchronized (refreshLock) {
      String access;
      String refresh = refreshToken;
      VaifException clearing = null;
      synchronized (this) {
        access = client.currentToken();
        if (refresh == null && session != null) {
          refresh = session.getRefreshToken();
        }
        resetSession();
        try {
          if (client.sessionStore() != null) {
            client.sessionStore().clear(client.sessionKey());
          }
        } catch (IOException | RuntimeException e) {
          clearing = storageError(e);
        }
      }
      try {
        if (access != null || refresh != null) {
          Map<String, String> headers = new LinkedHashMap<>();
          if (access != null) {
            headers.put("Authorization", "Bearer " + access);
          }
          if (client.getProjectId() == null && refresh != null) {
            headers.put("Cookie", "refresh_token=" + VaifClient.segment(refresh));
          }
          client.json(
              "POST", prefix() + "/logout", Map.of(), Json.map("refreshToken", refresh), headers);
        }
      } catch (VaifException remote) {
        if (clearing == null) {
          throw remote;
        }
        clearing.addSuppressed(remote);
      }
      if (clearing != null) {
        throw clearing;
      }
    }
  }

  /**
   * Returns the signed-in user.
   *
   * @return the user object, unwrapped from the response's {@code user} field when present
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Map<String, Object> getUser() {
    Map<String, Object> response = client.json("GET", prefix() + "/me", null);
    return response.get("user") instanceof Map ? Json.object(response.get("user")) : response;
  }

  /**
   * Sends a project app-user password reset email.
   *
   * @param email app-user email address
   * @return the API response
   * @throws VaifException if validation, the API, or the transport fails
   * @throws ConsoleOnlyException if the client has no project ID; platform passwords are reset in
   *     the console
   */
  public Map<String, Object> requestPasswordReset(String email) {
    requireProject(false);
    return client.json("POST", prefix() + "/forgot-password", Map.of("email", email));
  }

  /**
   * Sets a new project app-user password with a reset token.
   *
   * @param token password reset token from the reset email
   * @param password new password
   * @return the API response
   * @throws VaifException if validation, the API, or the transport fails
   * @throws ConsoleOnlyException if the client has no project ID; platform passwords are reset in
   *     the console
   */
  public Map<String, Object> confirmPasswordReset(String token, String password) {
    requireProject(false);
    return client.json(
        "POST", prefix() + "/reset-password", Map.of("token", token, "password", password));
  }

  /** Replaces managed authentication with a fixed token and clears the saved session. */
  synchronized void useAccessToken(String token) {
    resetSession();
    try {
      if (client.sessionStore() != null) {
        client.sessionStore().clear(client.sessionKey());
      }
    } catch (IOException | RuntimeException e) {
      throw storageError(e);
    }
    client.installAuthToken(token);
  }

  /**
   * Refreshes the session a request was sent with, after the API refused it as expired or invalid.
   * Returns the session to retry with: the one installed by the refresh of {@code expected},
   * whether this call or a concurrent one ran it. Returns null when the session was replaced or
   * signed out instead, so the request is not replayed for a different session.
   */
  Session refreshCurrent(Session expected) {
    synchronized (refreshLock) {
      long before;
      synchronized (this) {
        if (session != expected) {
          return refreshedFrom == expected && session == refreshedTo ? session : null;
        }
        before = generation;
      }
      RefreshResult refreshed = exchangeRefresh(expected.getRefreshToken(), before, expected);
      synchronized (this) {
        return refreshed.installed != null && session == refreshed.installed
            ? refreshed.installed
            : null;
      }
    }
  }

  // The caller holds refreshLock.
  private RefreshResult exchangeRefresh(String refreshToken, long expected, Session started) {
    synchronized (this) {
      if (expected != generation || started != session) {
        throw new VaifException("SESSION_CHANGED", "Session changed before refresh");
      }
    }
    Map<String, String> headers =
        client.getProjectId() == null
            ? Map.of("Cookie", "refresh_token=" + VaifClient.segment(refreshToken))
            : Map.of("X-Vaif-Refresh-Mode", "body");
    AuthResult result =
        new AuthResult(
            client.authRequest(
                prefix() + "/refresh", Json.map("refreshToken", refreshToken), headers));
    // A refresh inside the API's reuse grace window does not rotate the refresh token.
    if (result.getAccessToken() != null && result.getRefreshToken() == null) {
      Map<String, Object> value = new LinkedHashMap<>(result.asMap());
      value.put("refreshToken", refreshToken);
      result = new AuthResult(value);
    }
    Session installed;
    synchronized (this) {
      installed = installIfCurrent(expected, result);
      if (installed != null) {
        refreshedFrom = started;
        refreshedTo = installed;
      }
    }
    return new RefreshResult(result, installed);
  }

  private AuthResult tokens(String suffix, Map<String, ?> body) {
    // App-user requests ask for the refresh token in the body instead of a cookie.
    Map<String, String> headers =
        client.getProjectId() == null ? Map.of() : Map.of("X-Vaif-Refresh-Mode", "body");
    long expected;
    synchronized (this) {
      expected = generation;
    }
    AuthResult result = new AuthResult(client.authRequest(prefix() + suffix, body, headers));
    installIfCurrent(expected, result);
    return result;
  }

  private synchronized Session installIfCurrent(long expected, AuthResult result) {
    if (generation != expected || result.getAccessToken() == null || result.isMfaRequired()) {
      return null;
    }
    Session installed = new Session(result.getAccessToken(), result.getRefreshToken());
    setSession(installed);
    return installed;
  }

  // The caller holds this monitor. Every session change starts a new generation.
  private void resetSession() {
    generation++;
    refreshedFrom = null;
    refreshedTo = null;
    session = null;
    client.installAuthToken(null);
  }

  private String prefix() {
    return client.getProjectId() == null
        ? "/auth"
        : "/projects/" + VaifClient.segment(client.getProjectId()) + "/auth";
  }

  private void requireProject(boolean signUp) {
    if (client.getProjectId() == null) {
      throw new ConsoleOnlyException(signUp);
    }
  }

  private static Map<String, Object> credentials(
      String email, String password, Map<String, ?> options) {
    Map<String, Object> body = new LinkedHashMap<>(options);
    body.put("email", email);
    body.put("password", password);
    return body;
  }

  private static final class RefreshResult {
    final AuthResult response;
    final Session installed;

    RefreshResult(AuthResult response, Session installed) {
      this.response = response;
      this.installed = installed;
    }
  }
}
