package studio.vaif.sdk;

/**
 * Thrown for platform account actions that only the VAIF Studio console performs: creating a
 * platform account and resetting a platform password. The code is {@code CONSOLE_ONLY}.
 */
public final class ConsoleOnlyException extends VaifException {
  private static final long serialVersionUID = 1L;

  /** Console page for the refused action. */
  private final String consoleUrl;

  /**
   * Creates the exception for a refused platform account action.
   *
   * @param signUp true for account creation, false for a password reset
   */
  public ConsoleOnlyException(boolean signUp) {
    super(
        "CONSOLE_ONLY",
        "Use the VAIF Studio console to "
            + (signUp ? "create a platform account" : "reset a platform password"));
    consoleUrl =
        signUp
            ? "https://console.vaif.studio/register"
            : "https://console.vaif.studio/forgot-password";
  }

  /**
   * Returns the console page for the refused action.
   *
   * @return the registration or password reset URL
   */
  public String getConsoleUrl() {
    return consoleUrl;
  }
}
