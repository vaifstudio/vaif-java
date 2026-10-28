package studio.vaif.sdk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static studio.vaif.sdk.TestSupport.client;
import static studio.vaif.sdk.TestSupport.fails;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import studio.vaif.sdk.TestSupport.FakeTransport;

class DataTest {
  private static String query(FakeTransport transport, int index) {
    String raw = transport.request(index).getUri().getRawQuery();
    return raw == null ? null : URLDecoder.decode(raw, StandardCharsets.UTF_8);
  }

  @Test
  void queryChainBuildsTheWireRequest() {
    FakeTransport transport = new FakeTransport();
    Query base = client(transport).from("notes /?");
    transport.answer(200, "{\"data\":[],\"count\":0}");

    base.eq("owner_id", "u")
        .gte("age", 18)
        .select("id", "body")
        .include("owner")
        .orderBy("age", false)
        .orderBy("id")
        .range(2, 4)
        .list();

    assertEquals("/v1/data/p%20%2F%3F/notes%20%2F%3F", transport.request(0).getUri().getRawPath());
    assertEquals(
        "select=id,body&include=owner&orderBy=age,id&orderDir=desc,asc&offset=2&limit=3"
            + "&where=[{\"field\":\"owner_id\",\"operator\":\"eq\",\"value\":\"u\"},"
            + "{\"field\":\"age\",\"operator\":\"gte\",\"value\":18}]",
        query(transport, 0));

    transport.answer(200, "{\"data\":[]}");
    base.list();
    assertNull(transport.request(1).getUri().getRawQuery());
  }

  @Test
  void platformScopeQueriesUseGeneratedTables() {
    FakeTransport transport = new FakeTransport();
    VaifClient platform = VaifClient.builder().transport(transport).build();
    transport.answer(200, "{\"data\":[]}");

    platform.from("notes").list();

    assertEquals("/generated/notes", transport.request(0).getUri().getRawPath());
  }

  @Test
  void paginationReportsPageInfo() {
    FakeTransport transport = new FakeTransport();
    Query query = client(transport).from("n");
    transport.answer(200, "{\"data\":[{\"id\":1}],\"total\":21}");

    Map<String, Object> page = query.paginate(2, 10);

    assertEquals(
        Map.of(
            "total",
            21,
            "page",
            2,
            "pageSize",
            10,
            "pageCount",
            3L,
            "hasNextPage",
            true,
            "hasPrevPage",
            true),
        page.get("pageInfo"));
    assertEquals("offset=10&limit=10&includeCount=true", query(transport, 0));
    fails("VALIDATION_ERROR", () -> query.paginate(Integer.MAX_VALUE, 20));
    fails("VALIDATION_ERROR", () -> query.paginate(0, 20));
  }

  @Test
  void firstAndFirstOrFail() {
    FakeTransport transport = new FakeTransport();
    Query query = client(transport).from("n");
    transport.answer(200, "{\"data\":[]}");
    assertNull(query.first());
    assertEquals("limit=1", query(transport, 0));

    transport.answer(200, "{\"data\":[]}");
    fails("NOT_FOUND", query::firstOrFail);
  }

  @Test
  void crudRequests() {
    FakeTransport transport = new FakeTransport();
    Query query = client(transport).from("notes");

    transport.answer(200, "{\"data\":{\"id\":\"r\",\"body\":\"hello\"}}");
    assertEquals(Map.of("id", "r", "body", "hello"), query.insert(Map.of("body", "hello")));

    transport.answer(200, "{\"data\":{\"id\":\"a/b\"}}");
    query.get("a/b");
    assertEquals("/v1/data/p%20%2F%3F/notes/a%2Fb", transport.request(1).getUri().getRawPath());

    transport.answer(200, "{\"data\":{}}");
    query.update("r", Map.of("body", "edit"));
    assertEquals("PATCH", transport.request(2).getMethod());
    assertEquals(Map.of("body", "edit"), transport.jsonBody(2));

    transport.answer(204, "");
    query.delete("r");
    assertEquals("DELETE", transport.request(3).getMethod());

    transport.answer(200, "{\"count\":2,\"data\":[]}");
    query.insertMany(List.of(Map.of("body", "a"), Map.of("body", "b")));
    assertEquals(
        "[{\"body\":\"a\"},{\"body\":\"b\"}]",
        new String(transport.request(4).getBody(), StandardCharsets.UTF_8));

    transport.answer(200, "{\"data\":{}}");
    query.upsert(Map.of("body", "a"), List.of("id"));
    assertEquals(
        Map.of("body", "a", "_upsert", true, "_conflict_columns", List.of("id")),
        transport.jsonBody(5));
  }

  @Test
  void bulkWritesAcceptAndEqualityFiltersOnly() {
    FakeTransport transport = new FakeTransport();
    Query query = client(transport).from("notes");

    fails("VALIDATION_ERROR", () -> query.gt("age", 1).deleteMany());
    fails(
        "VALIDATION_ERROR",
        () ->
            query
                .where(Map.of("OR", List.of(Map.of("field", "a", "value", 1))))
                .updateMany(Map.of("x", 1)));
    fails(
        "VALIDATION_ERROR",
        () ->
            query
                .where(
                    Map.of(
                        "AND",
                        List.of(Map.of("field", "owner", "value", "u")),
                        "field",
                        "private",
                        "value",
                        true))
                .deleteMany());
    fails(
        "VALIDATION_ERROR",
        () ->
            query
                .where(Map.of("field", "owner", "value", "u", "unknown", true))
                .updateMany(Map.of("body", "x")));
    assertEquals(0, transport.requests.size());

    transport.answer(200, "{}");
    query.eq("owner", "u").updateMany(Map.of("body", "b"));
    assertEquals(
        Map.of("data", Map.of("body", "b"), "filter", Map.of("owner", "u")), transport.jsonBody(0));

    transport.answer(200, "{\"deleted\":2}");
    assertEquals(2L, query.eq("owner", "u").deleteMany());
    assertEquals("filter[owner]=u", query(transport, 1));
  }

  @Test
  void aggregatesUseEqualityFilters() {
    FakeTransport transport = new FakeTransport();
    Query query = client(transport).from("n");
    transport.answer(200, "{\"data\":[{\"value\":3}]}");

    assertEquals(3L, query.eq("owner", "u").count());

    assertEquals("/v1/data/p%20%2F%3F/n/aggregate", transport.request(0).getUri().getRawPath());
    assertEquals("filter[owner]=u&fn=count", query(transport, 0));
    fails("VALIDATION_ERROR", () -> query.neq("owner", "u").count());
    fails("VALIDATION_ERROR", () -> query.aggregate("median", "age"));
  }

  @Test
  void predicatesAreCopied() {
    FakeTransport transport = new FakeTransport();
    Map<String, Object> filter = new LinkedHashMap<>();
    filter.put("field", "a");
    filter.put("value", 1);
    Query query = client(transport).from("n").where(filter);
    filter.put("value", 2);
    transport.answer(200, "{\"data\":[]}");

    query.list();

    assertEquals("where=[{\"field\":\"a\",\"value\":1}]", query(transport, 0));
  }
}
