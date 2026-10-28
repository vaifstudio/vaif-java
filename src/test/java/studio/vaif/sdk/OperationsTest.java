package studio.vaif.sdk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static studio.vaif.sdk.TestSupport.client;
import static studio.vaif.sdk.TestSupport.fails;
import static studio.vaif.sdk.TestSupport.response;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.http.WebSocket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;
import studio.vaif.sdk.TestSupport.FakeTransport;
import studio.vaif.sdk.generated.Operations;

class OperationsTest {
  private static final String STAFF_ONLY = "platform staff only";

  @Test
  void surfaceCountsMatchTheContract() {
    VaifClient client = client(new FakeTransport());

    assertEquals(775, client.operations().definitions().size());
    assertEquals(168, client.operations().ungeneratedOperations().size());
    assertEquals(
        134,
        client.operations().ungeneratedOperations().stream()
            .filter(entry -> entry.getReason().equals(STAFF_ONLY))
            .count());
    assertEquals(134, StaffOnlyRoutes.ROUTES.size());
    assertEquals(List.of("/admin", "/auth/impersonate"), StaffOnlyRoutes.PREFIXES);
  }

  @Test
  void staffOnlyOperationsHaveNoMethod() {
    List<String> methods =
        Arrays.stream(Operations.class.getMethods())
            .map(Method::getName)
            .collect(Collectors.toList());

    assertFalse(methods.contains("postFlags"));
    assertFalse(methods.contains("deleteFlagsByKey"));
    assertFalse(methods.contains("postEnterpriseInvoicesByInvoiceIdPaid"));
    assertFalse(methods.contains("getAiCopilotStats"));
    assertFalse(methods.contains("getAdminUsers"));
    assertTrue(methods.contains("getProjectsByProjectId"));

    List<UngeneratedOperation> ungenerated =
        client(new FakeTransport()).operations().ungeneratedOperations();
    assertTrue(ungenerated.contains(new UngeneratedOperation("POST", "/flags", STAFF_ONLY)));
    assertTrue(
        ungenerated.contains(
            new UngeneratedOperation("POST", "/enterprise/invoices/{invoiceId}/paid", STAFF_ONLY)));
    assertTrue(ungenerated.contains(new UngeneratedOperation("GET", "/admin/users", STAFF_ONLY)));
    assertTrue(
        ungenerated.contains(
            new UngeneratedOperation("POST", "/auth/impersonate/exchange", STAFF_ONLY)));
    assertEquals(
        "POST /flags: platform staff only",
        new UngeneratedOperation("POST", "/flags", STAFF_ONLY).toString());
    for (UngeneratedOperation entry : ungenerated) {
      assertTrue(
          List.of(
                  STAFF_ONLY,
                  "retired; the API answers 410",
                  "no typed 2xx application/json response in the spec")
              .contains(entry.getReason()),
          entry.toString());
    }
  }

  @Test
  void staffRoutesAreRefusedBeforeAnyRequest() {
    FakeTransport transport = new FakeTransport();
    VaifClient client = client(transport);

    for (String path : List.of("/admin", "/admin/users", "/auth/impersonate/user", "/%61dmin/x")) {
      fails(
          "PLATFORM_STAFF_ONLY",
          () -> client.request("POST", path, Map.of(), null, Map.of(), "json", "json"));
    }
    for (String route : StaffOnlyRoutes.ROUTES) {
      int space = route.indexOf(' ');
      String path = route.substring(space + 1).replaceAll("\\{[^}]+}", "value");
      fails(
          "PLATFORM_STAFF_ONLY",
          () ->
              client.request(
                  route.substring(0, space), path, Map.of(), null, Map.of(), "json", "json"));
    }
    fails(
        "PLATFORM_STAFF_ONLY",
        () -> client.request("POST", "/%66lags", Map.of(), Map.of(), Map.of(), "json", "json"));
    assertEquals(0, transport.requests.size());

    transport.answer(200, "{\"flags\":[]}");
    client.request("GET", "/administrator", Map.of(), null, Map.of(), "json", "json");
    assertEquals(1, transport.requests.size());
  }

  @Test
  void everyGeneratedMethodSendsOneRequestOutsideTheStaffRoutes() {
    List<Transport.Request> requests = new ArrayList<>();
    VaifClient client =
        VaifClient.builder()
            .projectId("project")
            .transport(
                request -> {
                  String path = request.getUri().getPath();
                  assertFalse(VaifClient.staffOnly(request.getMethod(), path), path);
                  requests.add(request);
                  return response(200, Map.of());
                })
            .build();
    int consoleOnly = 0;
    for (Operation operation : client.operations().definitions().values()) {
      try {
        Object result = invoke(client, operation, arguments(operation));
        if (result instanceof InputStream) {
          ((InputStream) result).close();
        }
      } catch (InvocationTargetException error) {
        if (!(error.getCause() instanceof ConsoleOnlyException)) {
          throw new AssertionError(operation.getName(), error.getCause());
        }
        consoleOnly++;
      } catch (ReflectiveOperationException | IOException error) {
        throw new AssertionError(operation.getName(), error);
      }
    }
    assertEquals(3, consoleOnly);
    assertEquals(772, requests.size());
  }

  @Test
  void binaryAndEventStreamMethodsReturnRawBodies() throws Exception {
    FakeTransport transport = new FakeTransport();
    VaifClient client = client(transport);
    int checked = 0;
    for (Operation operation : client.operations().definitions().values()) {
      if (!List.of("binary", "sse").contains(operation.getResponseKind())) {
        continue;
      }
      transport.answer(200, "raw-data");
      Object result = invoke(client, operation, arguments(operation));
      if (result instanceof InputStream) {
        try (InputStream stream = (InputStream) result) {
          assertEquals("raw-data", new String(stream.readAllBytes(), StandardCharsets.UTF_8));
        }
      } else {
        assertEquals("raw-data", new String((byte[]) result, StandardCharsets.UTF_8));
      }
      checked++;
    }
    assertTrue(checked >= 2, "binary and event-stream operations: " + checked);
  }

  @Test
  void argumentsAreValidatedAndEncoded() {
    FakeTransport transport = new FakeTransport();
    VaifClient client = client(transport);
    transport.answer(200, "{\"project\":{\"id\":\"x\"}}");

    client
        .operations()
        .getProjectsByProjectId(OperationRequest.builder().path("projectId", "a/b?#").build());

    assertEquals("/projects/a%2Fb%3F%23", transport.request(0).getUri().getRawPath());
    fails(
        "VALIDATION_ERROR",
        () -> client.operations().getProjectsByProjectId(OperationRequest.empty()));
    fails(
        "VALIDATION_ERROR",
        () -> client.operations().postSchemaEngineApply(OperationRequest.empty()));
    fails(
        "VALIDATION_ERROR",
        () ->
            client
                .operations()
                .getProjectsByProjectId(
                    OperationRequest.builder().path("projectId", "..").build()));
    fails(
        "VALIDATION_ERROR",
        () ->
            client
                .operations()
                .getProjectsByProjectId(
                    OperationRequest.builder().path("projectId", "p").query("unknown", 1).build()));
    assertEquals(1, transport.requests.size());
  }

  @Test
  void rootOperationHasADescriptiveName() {
    FakeTransport transport = new FakeTransport();
    VaifClient client = client(transport);
    transport.answer(200, "{\"name\":\"VAIF API\"}");

    assertEquals(Map.of("name", "VAIF API"), client.operations().getRoot());
    assertEquals("/", transport.request(0).getUri().getRawPath());
  }

  @Test
  void publicTypesExposeNoSocketCallbacksOrUnsupportedMethods() {
    assertTrue(
        Arrays.stream(Query.class.getMethods()).noneMatch(m -> m.getName().equals("distinct")));
    assertFalse(WebSocket.Listener.class.isAssignableFrom(Realtime.Subscription.class));
  }

  private static OperationRequest arguments(Operation operation) {
    OperationRequest.Builder arguments = OperationRequest.builder();
    operation.getPathParams().forEach(name -> arguments.path(name, "value"));
    operation.getRequiredQuery().forEach(name -> arguments.query(name, "value"));
    if (operation.isBodyRequired()) {
      Object body =
          "binary".equals(operation.getBodyKind())
              ? new byte[] {1}
              : "text".equals(operation.getBodyKind()) ? "value" : Map.of();
      arguments.body(body);
    }
    return arguments.build();
  }

  private static Object invoke(VaifClient client, Operation operation, OperationRequest request)
      throws ReflectiveOperationException {
    return Operations.class
        .getMethod(operation.getName(), OperationRequest.class)
        .invoke(client.operations(), request);
  }
}
