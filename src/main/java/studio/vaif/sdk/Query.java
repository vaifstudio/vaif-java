package studio.vaif.sdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * An immutable query on one table. Each filter, projection, or ordering method returns a new query;
 * a query sends no request until a terminal method such as {@link #list()} is called.
 *
 * <p>List results keep the API's response envelope ({@code data}, {@code count}, and {@code
 * hasMore}). Bulk writes and aggregates accept AND equality filters only and refuse other
 * predicates before sending a request.
 */
public final class Query {
  private static final List<String> OPERATORS =
      List.of(
          "eq",
          "neq",
          "gt",
          "gte",
          "lt",
          "lte",
          "like",
          "ilike",
          "in",
          "nin",
          "is",
          "contains",
          "containedBy",
          "overlaps");
  private static final List<String> AGGREGATES = List.of("count", "sum", "avg", "min", "max");

  private final VaifClient client;
  private final String path;
  private final List<Map<String, Object>> filters;
  private final Map<String, Object> options;

  Query(VaifClient client, String table) {
    this(client, tablePath(client, table), List.of(), Map.of());
  }

  private Query(
      VaifClient client,
      String path,
      List<Map<String, Object>> filters,
      Map<String, Object> options) {
    this.client = client;
    this.path = path;
    this.filters = filters;
    this.options = options;
  }

  private static String tablePath(VaifClient client, String table) {
    String base =
        client.getProjectId() == null
            ? "/generated/"
            : "/v1/data/" + VaifClient.segment(client.getProjectId()) + "/";
    return base + VaifClient.segment(table);
  }

  /**
   * Adds a predicate, combined with AND. The predicate is copied, so later changes to the map do
   * not affect this query.
   *
   * @param filter API predicate object, which can nest {@code AND}, {@code OR}, and {@code NOT}
   * @return a new query with the predicate
   * @throws VaifException if the predicate cannot be represented as JSON
   */
  public Query where(Map<String, ?> filter) {
    List<Map<String, Object>> next = new ArrayList<>(filters);
    next.add(Json.object(Json.parse(Json.bytes(filter))));
    return new Query(client, path, List.copyOf(next), options);
  }

  /**
   * Adds a field comparison, combined with AND.
   *
   * @param field column name
   * @param operator {@code eq}, {@code neq}, {@code gt}, {@code gte}, {@code lt}, {@code lte},
   *     {@code like}, {@code ilike}, {@code in}, {@code nin}, {@code is}, {@code contains}, {@code
   *     containedBy}, or {@code overlaps}
   * @param value comparison value as a JSON-compatible Java value, including null
   * @return a new query with the predicate
   * @throws VaifException if the operator is unsupported or the value cannot be represented as JSON
   */
  public Query filter(String field, String operator, Object value) {
    if (!OPERATORS.contains(operator)) {
      throw VaifException.validation("Unsupported filter operator");
    }
    Map<String, Object> predicate = new LinkedHashMap<>();
    predicate.put("field", field);
    predicate.put("operator", operator);
    predicate.put("value", value);
    return where(predicate);
  }

  /**
   * Keeps rows whose column equals a value.
   *
   * @param field column name
   * @param value comparison value
   * @return a new query with the predicate
   * @throws VaifException if the value cannot be represented as JSON
   */
  public Query eq(String field, Object value) {
    return filter(field, "eq", value);
  }

  /**
   * Keeps rows whose column does not equal a value.
   *
   * @param field column name
   * @param value comparison value
   * @return a new query with the predicate
   * @throws VaifException if the value cannot be represented as JSON
   */
  public Query neq(String field, Object value) {
    return filter(field, "neq", value);
  }

  /**
   * Keeps rows whose column is greater than a value.
   *
   * @param field column name
   * @param value comparison value
   * @return a new query with the predicate
   * @throws VaifException if the value cannot be represented as JSON
   */
  public Query gt(String field, Object value) {
    return filter(field, "gt", value);
  }

  /**
   * Keeps rows whose column is greater than or equal to a value.
   *
   * @param field column name
   * @param value comparison value
   * @return a new query with the predicate
   * @throws VaifException if the value cannot be represented as JSON
   */
  public Query gte(String field, Object value) {
    return filter(field, "gte", value);
  }

  /**
   * Keeps rows whose column is less than a value.
   *
   * @param field column name
   * @param value comparison value
   * @return a new query with the predicate
   * @throws VaifException if the value cannot be represented as JSON
   */
  public Query lt(String field, Object value) {
    return filter(field, "lt", value);
  }

  /**
   * Keeps rows whose column is less than or equal to a value.
   *
   * @param field column name
   * @param value comparison value
   * @return a new query with the predicate
   * @throws VaifException if the value cannot be represented as JSON
   */
  public Query lte(String field, Object value) {
    return filter(field, "lte", value);
  }

  /**
   * Keeps rows whose column matches a SQL {@code LIKE} pattern.
   *
   * @param field column name
   * @param pattern pattern, where {@code %} matches any sequence and {@code _} one character
   * @return a new query with the predicate
   */
  public Query like(String field, String pattern) {
    return filter(field, "like", pattern);
  }

  /**
   * Keeps rows whose column matches a SQL {@code LIKE} pattern, ignoring case.
   *
   * @param field column name
   * @param pattern pattern, where {@code %} matches any sequence and {@code _} one character
   * @return a new query with the predicate
   */
  public Query ilike(String field, String pattern) {
    return filter(field, "ilike", pattern);
  }

  /**
   * Keeps rows whose column equals one of several values.
   *
   * @param field column name
   * @param values values to match
   * @return a new query with the predicate
   * @throws VaifException if a value cannot be represented as JSON
   */
  public Query in(String field, List<?> values) {
    return filter(field, "in", values);
  }

  /**
   * Selects the columns to return.
   *
   * @param columns column names
   * @return a new query with the projection
   */
  public Query select(String... columns) {
    return option("select", String.join(",", columns));
  }

  /**
   * Includes related records in each row.
   *
   * @param relations relation names
   * @return a new query with the relations
   */
  public Query include(String... relations) {
    return option("include", String.join(",", relations));
  }

  /**
   * Adds a sort column after any earlier ones.
   *
   * @param field column name
   * @param ascending true for ascending order, false for descending order
   * @return a new query with the ordering
   */
  public Query orderBy(String field, boolean ascending) {
    String columns = (String) options.get("orderBy");
    String directions = (String) options.get("orderDir");
    String direction = ascending ? "asc" : "desc";
    return option("orderBy", columns == null ? field : columns + "," + field)
        .option("orderDir", directions == null ? direction : directions + "," + direction);
  }

  /**
   * Adds an ascending sort column after any earlier ones.
   *
   * @param field column name
   * @return a new query with the ordering
   */
  public Query orderBy(String field) {
    return orderBy(field, true);
  }

  /**
   * Sets the maximum number of rows to return.
   *
   * @param count row count, at least 1
   * @return a new query with the limit
   * @throws VaifException if count is less than 1
   */
  public Query limit(int count) {
    if (count < 1) {
      throw VaifException.validation("Limit must be positive");
    }
    return option("limit", count);
  }

  /**
   * Sets the number of rows to skip.
   *
   * @param count rows to skip, at least 0
   * @return a new query with the offset
   * @throws VaifException if count is negative
   */
  public Query offset(int count) {
    if (count < 0) {
      throw VaifException.validation("Offset cannot be negative");
    }
    return option("offset", count);
  }

  /**
   * Selects an inclusive, zero-based range of rows.
   *
   * @param first index of the first row, at least 0
   * @param lastInclusive index of the last row, at least {@code first}
   * @return a new query with the offset and limit
   * @throws VaifException if the range is invalid or longer than {@code Integer.MAX_VALUE} rows
   */
  public Query range(int first, int lastInclusive) {
    if (first < 0
        || lastInclusive < first
        || (long) lastInclusive - first + 1 > Integer.MAX_VALUE) {
      throw VaifException.validation("Invalid range");
    }
    return offset(first).limit(lastInclusive - first + 1);
  }

  /**
   * Returns the matching rows.
   *
   * @return the API response envelope with {@code data}, {@code count}, and {@code hasMore}
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Map<String, Object> list() {
    return client.json("GET", path, params(), null, Map.of());
  }

  /**
   * Returns the first matching row.
   *
   * @return the first row, or null if no row matches
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Map<String, Object> first() {
    Object rows = limit(1).list().get("data");
    return rows instanceof List && !((List<?>) rows).isEmpty()
        ? Json.object(((List<?>) rows).get(0))
        : null;
  }

  /**
   * Returns the first matching row, or fails if there is none.
   *
   * @return the first row
   * @throws VaifException if no row matches ({@code NOT_FOUND}) or the request fails
   */
  public Map<String, Object> firstOrFail() {
    Map<String, Object> row = first();
    if (row == null) {
      throw new VaifException("NOT_FOUND", "No row matches the query");
    }
    return row;
  }

  /**
   * Returns one page of rows with the total count.
   *
   * @param page page number, starting at 1
   * @param pageSize rows per page, at least 1
   * @return a map with {@code data} and {@code pageInfo}; {@code pageInfo} holds {@code total},
   *     {@code page}, {@code pageSize}, {@code pageCount}, {@code hasNextPage}, and {@code
   *     hasPrevPage}
   * @throws VaifException if the page arguments are invalid or the request fails
   */
  public Map<String, Object> paginate(int page, int pageSize) {
    if (page < 1 || pageSize < 1 || (long) (page - 1) * pageSize > Integer.MAX_VALUE) {
      throw VaifException.validation("Invalid page or page size");
    }
    Map<String, Object> response =
        offset((page - 1) * pageSize).limit(pageSize).option("includeCount", true).list();
    Object data = response.getOrDefault("data", List.of());
    if (!(data instanceof List)) {
      throw new VaifException("INVALID_RESPONSE", "Expected a data list");
    }
    Object reported = response.get("total");
    long total =
        reported instanceof Number ? ((Number) reported).longValue() : ((List<?>) data).size();
    long pageCount = (total + pageSize - 1) / pageSize;
    Map<String, Object> pageInfo = new LinkedHashMap<>();
    pageInfo.put("total", reported instanceof Number ? reported : total);
    pageInfo.put("page", page);
    pageInfo.put("pageSize", pageSize);
    pageInfo.put("pageCount", pageCount);
    pageInfo.put("hasNextPage", page < pageCount);
    pageInfo.put("hasPrevPage", page > 1);
    return Map.of("data", data, "pageInfo", Collections.unmodifiableMap(pageInfo));
  }

  /**
   * Returns a row by ID. The query's projection and relations apply; its filters are not sent.
   *
   * @param id row ID
   * @return the row, unwrapped from {@code data} when present
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Map<String, Object> get(String id) {
    Map<String, Object> query = new LinkedHashMap<>();
    for (String key : List.of("select", "include")) {
      if (options.containsKey(key)) {
        query.put(key, options.get(key));
      }
    }
    return row(client.json("GET", rowPath(id), query, null, Map.of()));
  }

  /**
   * Inserts a row.
   *
   * @param values column values
   * @return the inserted row, unwrapped from {@code data} when present
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Map<String, Object> insert(Map<String, ?> values) {
    return row(client.json("POST", path, values));
  }

  /**
   * Inserts a row. Same as {@link #insert(Map)}.
   *
   * @param values column values
   * @return the inserted row, unwrapped from {@code data} when present
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Map<String, Object> create(Map<String, ?> values) {
    return insert(values);
  }

  /**
   * Updates a row by ID. The query's filters are not sent.
   *
   * @param id row ID
   * @param values column values to change
   * @return the updated row, unwrapped from {@code data} when present
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Map<String, Object> update(String id, Map<String, ?> values) {
    return row(client.json("PATCH", rowPath(id), values));
  }

  /**
   * Deletes a row by ID. The query's filters are not sent.
   *
   * @param id row ID
   * @return the API response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Map<String, Object> delete(String id) {
    return client.json("DELETE", rowPath(id), null);
  }

  /**
   * Inserts several rows in one request.
   *
   * @param values rows to insert
   * @return the API response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Map<String, Object> insertMany(List<? extends Map<String, ?>> values) {
    return client.json("POST", path + "/bulk", values);
  }

  /**
   * Inserts a row, or updates the existing row that has the same values in the conflict columns.
   *
   * @param values column values
   * @param conflictColumns columns that identify an existing row; at least one
   * @return the written row, unwrapped from {@code data} when present
   * @throws VaifException if no conflict column is given or the request fails
   */
  public Map<String, Object> upsert(Map<String, ?> values, List<String> conflictColumns) {
    if (conflictColumns == null || conflictColumns.isEmpty()) {
      throw VaifException.validation("Upsert needs conflict columns");
    }
    Map<String, Object> body = new LinkedHashMap<>(values);
    body.put("_upsert", true);
    body.put("_conflict_columns", conflictColumns);
    return row(client.json("POST", path, body));
  }

  /**
   * Updates every row that matches the query's AND equality filters.
   *
   * @param values column values to change
   * @return the API response
   * @throws VaifException if a filter is not an AND equality or the request fails
   */
  public Map<String, Object> updateMany(Map<String, ?> values) {
    return client.json(
        "PATCH", path + "/bulk", Map.of("data", values, "filter", equalityFilters()));
  }

  /**
   * Deletes every row that matches the query's AND equality filters. A query without filters
   * deletes every row the API allows.
   *
   * @return the number of deleted rows, or 0 if the API does not report it
   * @throws VaifException if a filter is not an AND equality or the request fails
   */
  public long deleteMany() {
    Map<String, Object> response =
        client.json("DELETE", path + "/bulk", filterParams(), null, Map.of());
    Object value = response.getOrDefault("deleted", response.getOrDefault("count", 0));
    return number(value).longValue();
  }

  /**
   * Computes an aggregate over the rows that match the query's AND equality filters.
   *
   * @param function {@code count}, {@code sum}, {@code avg}, {@code min}, or {@code max}
   * @param column column to aggregate, or null to count rows
   * @return the aggregate value, or null if the API returns none
   * @throws VaifException if the function or a filter is unsupported, or the request fails
   */
  public Object aggregate(String function, String column) {
    if (!AGGREGATES.contains(function)) {
      throw VaifException.validation("Unsupported aggregate");
    }
    Map<String, Object> query = filterParams();
    query.put("fn", function);
    if (column != null) {
      query.put("column", column);
    }
    Object rows = client.json("GET", path + "/aggregate", query, null, Map.of()).get("data");
    return rows instanceof List && !((List<?>) rows).isEmpty()
        ? Json.object(((List<?>) rows).get(0)).get("value")
        : null;
  }

  /**
   * Counts the rows that match the query's AND equality filters.
   *
   * @return the row count, or 0 if the API returns none
   * @throws VaifException if a filter is unsupported or the request fails
   */
  public long count() {
    Object value = aggregate("count", null);
    return value == null ? 0 : number(value).longValue();
  }

  /**
   * Sums a column over the rows that match the query's AND equality filters.
   *
   * @param column column to sum
   * @return the sum, or null if the API returns none
   * @throws VaifException if a filter is unsupported or the request fails
   */
  public Object sum(String column) {
    return aggregate("sum", column);
  }

  /**
   * Averages a column over the rows that match the query's AND equality filters.
   *
   * @param column column to average
   * @return the average, or null if the API returns none
   * @throws VaifException if a filter is unsupported or the request fails
   */
  public Object avg(String column) {
    return aggregate("avg", column);
  }

  /**
   * Returns the smallest value of a column among the rows that match the AND equality filters.
   *
   * @param column column to examine
   * @return the minimum, or null if the API returns none
   * @throws VaifException if a filter is unsupported or the request fails
   */
  public Object min(String column) {
    return aggregate("min", column);
  }

  /**
   * Returns the largest value of a column among the rows that match the AND equality filters.
   *
   * @param column column to examine
   * @return the maximum, or null if the API returns none
   * @throws VaifException if a filter is unsupported or the request fails
   */
  public Object max(String column) {
    return aggregate("max", column);
  }

  private Query option(String key, Object value) {
    Map<String, Object> next = new LinkedHashMap<>(options);
    next.put(key, value);
    return new Query(client, path, filters, next);
  }

  private String rowPath(String id) {
    return path + "/" + VaifClient.segment(id);
  }

  private Map<String, Object> params() {
    Map<String, Object> query = new LinkedHashMap<>(options);
    if (!filters.isEmpty()) {
      query.put("where", Json.stringify(filters));
    }
    return query;
  }

  private Map<String, Object> filterParams() {
    Map<String, Object> out = new LinkedHashMap<>();
    equalityFilters().forEach((field, value) -> out.put("filter[" + field + "]", value));
    return out;
  }

  private Map<String, String> equalityFilters() {
    Map<String, String> out = new LinkedHashMap<>();
    for (Map<String, Object> predicate : filters) {
      flatten(predicate, out);
    }
    return out;
  }

  private static void flatten(Map<String, Object> predicate, Map<String, String> out) {
    if (predicate.containsKey("OR") || predicate.containsKey("NOT")) {
      throw VaifException.validation(
          "Bulk writes and aggregates support AND equality filters only");
    }
    if (predicate.containsKey("AND")) {
      if (predicate.size() != 1) {
        throw VaifException.validation(
            "AND cannot contain additional predicates at the same level");
      }
      if (!(predicate.get("AND") instanceof List)) {
        throw VaifException.validation("AND must be a list");
      }
      for (Object item : (List<?>) predicate.get("AND")) {
        flatten(Json.object(item), out);
      }
      return;
    }
    if (!Set.of("field", "operator", "value").containsAll(predicate.keySet())) {
      throw VaifException.validation("Unsupported equality predicate fields");
    }
    if ((predicate.containsKey("operator") && !"eq".equals(predicate.get("operator")))
        || !(predicate.get("field") instanceof String)
        || !predicate.containsKey("value")) {
      throw VaifException.validation("Bulk writes and aggregates support equality filters only");
    }
    Object value = predicate.get("value");
    if (!(value instanceof String || value instanceof Number || value instanceof Boolean)) {
      throw VaifException.validation("Equality filters need scalar non-null values");
    }
    String field = (String) predicate.get("field");
    String text = value.toString();
    if (out.containsKey(field) && !out.get(field).equals(text)) {
      throw VaifException.validation("Conflicting equality filters cannot be represented");
    }
    out.put(field, text);
  }

  private static Number number(Object value) {
    if (!(value instanceof Number)) {
      throw new VaifException("INVALID_RESPONSE", "Expected a number");
    }
    return (Number) value;
  }

  private static Map<String, Object> row(Map<String, Object> envelope) {
    return envelope.get("data") instanceof Map ? Json.object(envelope.get("data")) : envelope;
  }
}
