package studio.vaif.sdk;

import java.util.Objects;

/** An operation in the API contract that has no generated method, with the reason. */
public final class UngeneratedOperation {
  private final String method;
  private final String path;
  private final String reason;

  /**
   * Creates an ungenerated operation entry.
   *
   * @param method HTTP method, such as {@code GET}
   * @param path API path template, such as {@code /admin/users}
   * @param reason why no method is generated, such as {@code platform staff only}
   * @throws NullPointerException if an argument is null
   */
  public UngeneratedOperation(String method, String path, String reason) {
    this.method = Objects.requireNonNull(method, "method");
    this.path = Objects.requireNonNull(path, "path");
    this.reason = Objects.requireNonNull(reason, "reason");
  }

  /**
   * Returns the HTTP method.
   *
   * @return the HTTP method
   */
  public String getMethod() {
    return method;
  }

  /**
   * Returns the API path template.
   *
   * @return the path template
   */
  public String getPath() {
    return path;
  }

  /**
   * Returns why the operation has no generated method.
   *
   * @return the reason
   */
  public String getReason() {
    return reason;
  }

  /**
   * Compares method, path, and reason.
   *
   * @param other object to compare, including null
   * @return true if the other object is an equal entry
   */
  @Override
  public boolean equals(Object other) {
    if (!(other instanceof UngeneratedOperation)) {
      return false;
    }
    UngeneratedOperation that = (UngeneratedOperation) other;
    return method.equals(that.method) && path.equals(that.path) && reason.equals(that.reason);
  }

  /**
   * Computes a hash from method, path, and reason.
   *
   * @return the hash code
   */
  @Override
  public int hashCode() {
    return Objects.hash(method, path, reason);
  }

  /**
   * Returns the entry as {@code METHOD path: reason}.
   *
   * @return the formatted entry
   */
  @Override
  public String toString() {
    return method + " " + path + ": " + reason;
  }
}
