package studio.vaif.sdk;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * The SDK's JSON codec. Objects become {@code LinkedHashMap}, arrays {@code ArrayList}. Integers
 * become {@code Integer}, {@code Long}, or {@code BigInteger}; decimals become {@code BigDecimal},
 * so no precision is lost.
 */
final class Json {
  private static final int MAX_DEPTH = 128;

  private Json() {}

  static byte[] bytes(Object value) {
    return stringify(value).getBytes(StandardCharsets.UTF_8);
  }

  static String stringify(Object value) {
    StringBuilder out = new StringBuilder();
    write(value, out, 0);
    return out.toString();
  }

  static Object parse(byte[] bytes) {
    String text;
    try {
      text =
          StandardCharsets.UTF_8
              .newDecoder()
              .onMalformedInput(CodingErrorAction.REPORT)
              .decode(ByteBuffer.wrap(bytes))
              .toString();
    } catch (CharacterCodingException e) {
      throw new VaifException("INVALID_JSON", "Response is not UTF-8 JSON");
    }
    Parser parser = new Parser(text);
    Object result = parser.value(0);
    parser.space();
    if (parser.at != text.length()) {
      throw parser.invalid();
    }
    return result;
  }

  @SuppressWarnings("unchecked")
  static Map<String, Object> object(Object value) {
    if (!(value instanceof Map)) {
      throw new VaifException("INVALID_RESPONSE", "Expected a JSON object");
    }
    return (Map<String, Object>) value;
  }

  /** Builds an object from key-value pairs, leaving out null values. */
  static Map<String, Object> map(Object... pairs) {
    Map<String, Object> out = new LinkedHashMap<>();
    for (int i = 0; i < pairs.length; i += 2) {
      if (pairs[i + 1] != null) {
        out.put((String) pairs[i], pairs[i + 1]);
      }
    }
    return out;
  }

  private static void write(Object value, StringBuilder out, int depth) {
    if (depth > MAX_DEPTH) {
      throw VaifException.validation("JSON nesting exceeds " + MAX_DEPTH);
    }
    if (value == null) {
      out.append("null");
    } else if (value instanceof String || value instanceof Character) {
      quote(value.toString(), out);
    } else if (value instanceof Boolean) {
      out.append(value);
    } else if (value instanceof Number) {
      writeNumber((Number) value, out);
    } else if (value instanceof Map) {
      out.append('{');
      boolean first = true;
      for (Map.Entry<?, ?> entry : ((Map<?, ?>) value).entrySet()) {
        if (!(entry.getKey() instanceof String)) {
          throw VaifException.validation("JSON object keys must be strings");
        }
        if (!first) {
          out.append(',');
        }
        first = false;
        quote((String) entry.getKey(), out);
        out.append(':');
        write(entry.getValue(), out, depth + 1);
      }
      out.append('}');
    } else if (value instanceof Iterable) {
      out.append('[');
      boolean first = true;
      for (Object item : (Iterable<?>) value) {
        if (!first) {
          out.append(',');
        }
        first = false;
        write(item, out, depth + 1);
      }
      out.append(']');
    } else if (value instanceof Object[]) {
      write(Arrays.asList((Object[]) value), out, depth + 1);
    } else {
      throw VaifException.validation("Use Java maps, lists and JSON scalar values");
    }
  }

  private static void writeNumber(Number value, StringBuilder out) {
    if (!(value instanceof Byte
        || value instanceof Short
        || value instanceof Integer
        || value instanceof Long
        || value instanceof BigInteger
        || value instanceof BigDecimal
        || value instanceof Float
        || value instanceof Double)) {
      throw VaifException.validation("Unsupported JSON number type");
    }
    if ((value instanceof Double && !Double.isFinite((Double) value))
        || (value instanceof Float && !Float.isFinite((Float) value))) {
      throw VaifException.validation("JSON numbers must be finite");
    }
    out.append(value);
  }

  private static void quote(String value, StringBuilder out) {
    out.append('"');
    for (int i = 0; i < value.length(); i++) {
      char c = value.charAt(i);
      switch (c) {
        case '"':
          out.append("\\\"");
          break;
        case '\\':
          out.append("\\\\");
          break;
        case '\b':
          out.append("\\b");
          break;
        case '\f':
          out.append("\\f");
          break;
        case '\n':
          out.append("\\n");
          break;
        case '\r':
          out.append("\\r");
          break;
        case '\t':
          out.append("\\t");
          break;
        default:
          if (c < 32 || Character.isSurrogate(c)) {
            out.append(String.format(Locale.ROOT, "\\u%04x", (int) c));
          } else {
            out.append(c);
          }
      }
    }
    out.append('"');
  }

  private static final class Parser {
    final String text;
    int at;

    Parser(String text) {
      this.text = text;
    }

    VaifException invalid() {
      return new VaifException("INVALID_JSON", "Invalid JSON at character " + at);
    }

    void space() {
      while (at < text.length() && " \t\n\r".indexOf(text.charAt(at)) >= 0) {
        at++;
      }
    }

    boolean eat(char c) {
      space();
      if (at < text.length() && text.charAt(at) == c) {
        at++;
        return true;
      }
      return false;
    }

    Object value(int depth) {
      if (depth > MAX_DEPTH) {
        throw invalid();
      }
      space();
      if (at >= text.length()) {
        throw invalid();
      }
      char c = text.charAt(at);
      if (c == '"') {
        return string();
      }
      if (c == '{') {
        return object(depth);
      }
      if (c == '[') {
        return array(depth);
      }
      for (String literal : List.of("true", "false", "null")) {
        if (text.startsWith(literal, at)) {
          at += literal.length();
          return literal.equals("null") ? null : Boolean.valueOf(literal);
        }
      }
      return number();
    }

    Map<String, Object> object(int depth) {
      at++;
      Map<String, Object> result = new LinkedHashMap<>();
      if (eat('}')) {
        return result;
      }
      do {
        space();
        String key = string();
        if (!eat(':')) {
          throw invalid();
        }
        result.put(key, value(depth + 1));
      } while (eat(','));
      if (!eat('}')) {
        throw invalid();
      }
      return result;
    }

    List<Object> array(int depth) {
      at++;
      List<Object> result = new ArrayList<>();
      if (eat(']')) {
        return result;
      }
      do {
        result.add(value(depth + 1));
      } while (eat(','));
      if (!eat(']')) {
        throw invalid();
      }
      return result;
    }

    Object number() {
      int start = at;
      if (text.charAt(at) == '-') {
        at++;
      }
      if (at >= text.length()) {
        throw invalid();
      }
      if (text.charAt(at) == '0') {
        at++;
      } else {
        if (!digit() || text.charAt(at) == '0') {
          throw invalid();
        }
        skipDigits();
      }
      boolean decimal = false;
      if (at < text.length() && text.charAt(at) == '.') {
        decimal = true;
        at++;
        if (!digit()) {
          throw invalid();
        }
        skipDigits();
      }
      if (at < text.length() && (text.charAt(at) == 'e' || text.charAt(at) == 'E')) {
        decimal = true;
        at++;
        if (at < text.length() && (text.charAt(at) == '+' || text.charAt(at) == '-')) {
          at++;
        }
        if (!digit()) {
          throw invalid();
        }
        skipDigits();
      }
      String number = text.substring(start, at);
      try {
        if (decimal) {
          return new BigDecimal(number);
        }
        BigInteger integer = new BigInteger(number);
        if (integer.bitLength() < 32) {
          return integer.intValue();
        }
        return integer.bitLength() < 64 ? (Object) integer.longValue() : integer;
      } catch (NumberFormatException e) {
        throw invalid();
      }
    }

    boolean digit() {
      return at < text.length() && text.charAt(at) >= '0' && text.charAt(at) <= '9';
    }

    void skipDigits() {
      while (digit()) {
        at++;
      }
    }

    String string() {
      if (at >= text.length() || text.charAt(at++) != '"') {
        throw invalid();
      }
      StringBuilder out = new StringBuilder();
      while (at < text.length()) {
        char c = text.charAt(at++);
        if (c == '"') {
          return out.toString();
        }
        if (c < 32) {
          throw invalid();
        }
        if (c != '\\') {
          out.append(c);
          continue;
        }
        if (at >= text.length()) {
          throw invalid();
        }
        escape(text.charAt(at++), out);
      }
      throw invalid();
    }

    private void escape(char c, StringBuilder out) {
      switch (c) {
        case '"':
        case '\\':
        case '/':
          out.append(c);
          break;
        case 'b':
          out.append('\b');
          break;
        case 'f':
          out.append('\f');
          break;
        case 'n':
          out.append('\n');
          break;
        case 'r':
          out.append('\r');
          break;
        case 't':
          out.append('\t');
          break;
        case 'u':
          if (at + 4 > text.length()) {
            throw invalid();
          }
          int code = 0;
          for (int i = 0; i < 4; i++) {
            int digit = Character.digit(text.charAt(at + i), 16);
            if (digit < 0) {
              throw invalid();
            }
            code = code * 16 + digit;
          }
          out.append((char) code);
          at += 4;
          break;
        default:
          throw invalid();
      }
    }
  }
}
