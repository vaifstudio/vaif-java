package studio.vaif.sdk;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/** An event stream returned to the caller. Transport failures surface as {@code STREAM_ERROR}. */
final class EventStream extends FilterInputStream {
  EventStream(InputStream input) {
    super(input);
  }

  @Override
  public int read() {
    try {
      return in.read();
    } catch (IOException e) {
      throw failure(e);
    }
  }

  @Override
  public int read(byte[] bytes, int offset, int length) {
    try {
      return in.read(bytes, offset, length);
    } catch (IOException e) {
      throw failure(e);
    }
  }

  @Override
  public long skip(long count) {
    try {
      return in.skip(count);
    } catch (IOException e) {
      throw failure(e);
    }
  }

  @Override
  public int available() {
    try {
      return in.available();
    } catch (IOException e) {
      throw failure(e);
    }
  }

  @Override
  public synchronized void reset() {
    try {
      in.reset();
    } catch (IOException e) {
      throw failure(e);
    }
  }

  @Override
  public void close() {
    try {
      in.close();
    } catch (IOException e) {
      throw failure(e);
    }
  }

  private static VaifException failure(IOException cause) {
    return new VaifException(
        "STREAM_ERROR", "Event stream transport failed", 0, null, null, null, cause);
  }
}
