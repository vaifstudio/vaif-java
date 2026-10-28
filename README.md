# VAIF Studio Java SDK

<!-- BEGIN GENERATED SDK STATUS: notice:java -->
> `studio.vaif:vaif-java` 1.0.0 is the version in this repository, has not been tagged yet and is not on Maven Central yet. The hosted API (`https://api.vaif.studio`) and console are not available yet.
<!-- END GENERATED SDK STATUS: notice:java -->

Java client for VAIF Studio server applications. Calls are blocking, and JSON
values use Java collections and scalars. The SDK has no third-party runtime
dependencies. Source and issues:
[vaifstudio/vaif-java](https://github.com/vaifstudio/vaif-java).

The examples need a running API deployment and its base URL.

## Requirements

Java 11 or later. CI builds and tests the SDK on Java 11, 17, and 21. A source
build compiles for Java 11 on any of them; the formatting check and strict
Javadoc warnings run on JDK 17 and later.

## Installation

The planned Maven Central coordinates are `studio.vaif:vaif-java:1.0.0`. After
the release, Gradle projects add:

```groovy
repositories { mavenCentral() }
dependencies { implementation 'studio.vaif:vaif-java:1.0.0' }
```

The JAR declares the automatic module name `studio.vaif.sdk`. On the module
path, add `requires studio.vaif.sdk;` to `module-info.java`.

To build from a source checkout:

```sh
./gradlew --no-daemon build
./gradlew publishToMavenLocal
```

The first command runs the tests and writes the main, sources, and Javadoc JARs
to `build/libs/`. The second installs the build in your local Maven repository.

## Quick start

```java
import java.util.Map;
import studio.vaif.sdk.VaifClient;

class Example {
  public static void main(String[] args) {
    VaifClient client =
        VaifClient.builder()
            .baseUrl(System.getenv("VAIF_API_URL"))
            .projectId(System.getenv("VAIF_PROJECT_ID"))
            .apiKey(System.getenv("VAIF_SERVICE_ROLE_KEY"))
            .build();
    Map<String, Object> notes =
        client
            .from("notes")
            .eq("published", true)
            .select("id", "body")
            .orderBy("created_at", false)
            .range(0, 19)
            .list();
    System.out.println(notes.get("data"));
  }
}
```

The `notes` table must exist in the project. Keep service-role keys in server
configuration; the client sends the key in the `x-vaif-key` header. Building a
client or a query sends no request. A client with a session store reads the
saved session while it is built.

The examples below assume `import studio.vaif.sdk.*;` and `import java.util.*;`.

## Configuration

`VaifClient.builder()` accepts `baseUrl`, `projectId`, `apiKey`, `accessToken`,
`storageUrl`, `timeout`, `sessionStore`, `transport`, and `socketFactory`. The
base URL defaults to `https://api.vaif.studio`, and the timeout to 30 seconds.
The base URL must use HTTPS; HTTP is accepted only for `localhost`, `127.0.0.1`
and `::1`, and any other HTTP base URL throws `VALIDATION_ERROR`.

```java
static VaifClient configured(String projectId, java.util.function.Supplier<String> tokens) {
  return VaifClient.builder()
      .projectId(projectId)
      .accessToken(tokens)
      .timeout(java.time.Duration.ofSeconds(10))
      .build();
}
```

A `VaifClient` is safe to share between threads. Use one client per security
context: one for the service-role key, and one for each signed-in user. Query
objects are immutable. Realtime callbacks can run on WebSocket and SDK timer
threads, so keep them short and hand long work to an executor.

The client refuses HTTP redirects. A custom `Transport` or `SocketFactory` must
also refuse redirects so that credentials never reach another origin.

## Auth

With a project ID, auth methods act on the project's app users and need the
project's API key. A successful sign-in, sign-up, MFA verification, or refresh
installs the returned session. An MFA challenge installs nothing.

```java
static void signIn(VaifClient user, String email, String password, String mfaCode) {
  AuthResult result = user.auth().signIn(email, password);
  if (result.isMfaRequired()) {
    result = user.auth().verifyMfa(result.getChallengeToken(), mfaCode);
  }
  Map<String, Object> profile = user.auth().getUser();
  System.out.println(profile.get("email"));
  user.auth().signOut();
}
```

Refresh tokens rotate. Call `refresh(refreshToken)` to refresh explicitly. A
managed session is refreshed at most once per request, and only after the API
answers `401 UNAUTHORIZED` with code `TOKEN_INVALID` or `TOKEN_EXPIRED`. There is
no background refresh. Requests to auth routes and requests with an explicit
`Authorization` header are never refreshed. A function's own response, which
carries the `X-Vaif-Run-Id` header, is never refreshed or replayed.

When several threads share an expired session, one refresh runs and each
request is retried once with the refreshed session. A request is not retried
when its session was replaced or signed out while it was in flight. A refresh
that finishes after the session was replaced installs nothing.

`signOut()` waits for a refresh in progress, clears the session, and revokes it
on the server. If the access token has expired, revocation uses the refresh
token. If the session store cannot clear the saved session, sign-out still
attempts revocation and then throws `SESSION_STORAGE_ERROR`.

By default, sessions live only in memory. Set a `sessionStore` to keep the
session across restarts; entries are keyed by API origin and project ID.
`FileSessionStore` keeps one file per key in a directory restricted to its
owner. It needs a POSIX filesystem and stores tokens unencrypted. To encrypt
sessions, implement `SessionStore` on top of your secret store. If a new
session cannot be saved, the client is left without a session and the store
holds none.

```java
static VaifClient persistentUser(
    String projectId, String projectKey, java.nio.file.Path privateDirectory)
    throws java.io.IOException {
  return VaifClient.builder()
      .projectId(projectId)
      .apiKey(projectKey)
      .sessionStore(new FileSessionStore(privateDirectory))
      .build();
}
```

For credentials managed elsewhere, use `.accessToken(token)` or
`.accessToken(Supplier<String>)`; the supplier runs for each request.
`setAuth(token)` replaces the managed session and clears any saved session.
`setAuth(null)` sends no bearer token, and `useConfiguredAuth()` restores the
builder's token supplier.

Without a project ID, auth methods act on the VAIF Studio platform account.
Platform sign-in uses the API's sign-in route for non-browser clients, which
returns a refresh token. Creating a platform account and resetting a platform
password happen in the console: `signUp`, `requestPasswordReset`, and
`confirmPasswordReset` throw `ConsoleOnlyException` (code `CONSOLE_ONLY`)
before any request, and `getConsoleUrl()` returns the console page.

## Data

Queries are immutable. They support field filters, nested AND/OR/NOT
predicates, column selection, relations, ordering, ranges, pagination, CRUD,
bulk writes, upsert, and count, sum, avg, min, and max aggregates.

```java
static void data(VaifClient client) {
  Map<String, Object> row = client.from("notes").insert(Map.of("body", "Hello"));
  String id = (String) row.get("id");
  client.from("notes").update(id, Map.of("body", "Updated"));
  Map<String, Object> page = client.from("notes").orderBy("id").paginate(1, 20);
  System.out.println(page.get("pageInfo"));
  client.from("notes").delete(id);
}
```

Bulk writes and aggregates accept AND equality filters only; other predicates
fail before a request is sent. A bulk write without filters affects every row
the API allows. With a project ID, queries use the project data API
(`/v1/data/{projectId}/{table}`). Without one, they use the platform's table
routes (`/generated/{table}`).

## Storage

Signing methods take a bucket name, a null bucket means `default`, and
listing and deletion take a bucket ID. Signed URLs must use HTTPS, except HTTP
to `localhost`, `127.0.0.1`, or `::1`. Transfers to a signed URL carry no API
key, bearer token, or cookie, and their errors never include the URL. Uploads
are limited to 5 GiB.

```java
static void storage(VaifClient client, String bucketId) {
  byte[] content = "Hello".getBytes(java.nio.charset.StandardCharsets.UTF_8);
  client.storage().upload("hello.txt", content, "assets", "text/plain");
  byte[] downloaded = client.storage().download("hello.txt", "assets");
  String signed = client.storage().createSignedUrl("hello.txt", "assets", 3600);
  String publicUrl = client.storage().getPublicUrl("hello.txt", "assets");
  Map<String, Object> files = client.storage().list(bucketId);
  System.out.println(downloaded.length + " " + signed + " " + publicUrl + " " + files);
}
```

Transfers hold the bytes in memory. Multipart and streaming uploads have no
helper; use their generated operations. Public URLs use the API environment's
content host, or the `storageUrl` set on the builder.

## Functions

Invoke a function by ID or name with any JSON-compatible Java value. `invoke`
returns a JSON object; `invokeValue` returns any JSON value. A non-2xx response
throws `VaifException`, and `getResponseBody()` returns the function's body.

```java
static void functions(VaifClient client) {
  Map<String, Object> response = client.functions().invoke("hello_world", Map.of());
  Object value = client.functions().invokeValue("hello_world", Map.of("name", "Ada"));
  System.out.println(response + " " + value);
}
```

The SDK does not retry function failures, including a function's own 401. The
single refresh described under Auth applies only when the API refuses the
request before the function runs.

## Realtime

Subscribe to table changes over WebSocket. Credentials travel in the first
message, never in the URL. `https` becomes `wss` in any letter case; `http`
becomes `ws` only for `localhost`, `127.0.0.1`, and `::1`.

```java
static void realtime(VaifClient client) {
  try (Realtime.Subscription subscription =
      client
          .realtime()
          .subscribe(
              "notes",
              event -> System.out.println(event.get("op")),
              error -> System.err.println(error.getCode()))) {
    subscription.ready().join();
    // Keep the subscription open while the application needs events.
  }
}
```

`ready()` completes when the server acknowledges the subscription. The event
callback receives the acknowledgement and each matching change. The second
`subscribe` overload takes equality filters and the columns to include. The SDK
sends heartbeats and refuses messages longer than 1,048,576 characters. A
failure ends the subscription, reaches the error callback, and completes a
pending `ready()` exceptionally. Subscriptions do not reconnect; create a new
one after a failure or a credential change.

## Generated operations

`client.operations()` has a named method for each of the 775 customer
operations in the API contract.

```java
static void operations(VaifClient client, String projectId) {
  Object project =
      client
          .operations()
          .getProjectsByProjectId(OperationRequest.builder().path("projectId", projectId).build());
  System.out.println(project);
  for (UngeneratedOperation omitted : client.operations().ungeneratedOperations()) {
    System.out.println(omitted.getMethod() + " " + omitted.getPath() + ": " + omitted.getReason());
  }
}
```

Arguments are path, query, and header maps plus a body. JSON responses use
`Map`, `List`, `String`, `Boolean`, `Integer`, `Long`, `BigInteger`,
`BigDecimal`, or null, so integer and decimal precision is kept. Binary
operations return `byte[]`, and event-stream operations return an
`InputStream` that the caller must close. `definitions()` returns each
operation's route metadata.

`ungeneratedOperations()` lists the 168 contract operations without a method
and the reason for each. 134 are reserved for platform staff, and the client
refuses them before any I/O with `PLATFORM_STAFF_ONLY`, including through
`request(...)`. The others have no typed success response in the contract.

## Errors

```java
static void errors(VaifClient client) {
  try {
    client.from("notes").list();
  } catch (VaifException error) {
    System.err.println(error.getCode() + " " + error.getStatusCode() + " " + error.getRequestId());
  }
}
```

`VaifException` carries the error code, HTTP status, request ID, details,
response body, and raw `Retry-After` value. For an API error, the code is the
API's own, such as `TOKEN_EXPIRED` or `RATE_LIMITED`. The SDK does not retry
rate-limited requests. The SDK's own codes are:

| Code | Meaning |
| --- | --- |
| `VALIDATION_ERROR` | An argument, URL, header, or JSON value is invalid. No request was sent. |
| `NETWORK_ERROR` | The request could not be sent or the response could not be read. |
| `TIMEOUT` | The request timed out. |
| `CANCELLED` | The calling thread was interrupted, or a subscription was closed. The interrupt flag is kept. |
| `REDIRECT_REFUSED` | The server answered with a redirect. |
| `HTTP_ERROR` | The server answered with an error and no error code. |
| `INVALID_JSON` | The response is not valid UTF-8 JSON. |
| `INVALID_RESPONSE` | The response does not have the expected shape. |
| `SESSION_STORAGE_ERROR` | The session store failed to load, save, or clear a session. |
| `SESSION_CHANGED` | The session changed before an explicit refresh was sent. |
| `PROJECT_ID_REQUIRED` | The operation needs a client with a project ID. |
| `NOT_FOUND` | `firstOrFail()` found no matching row. |
| `CONSOLE_ONLY` | The platform account action requires the console. |
| `PLATFORM_STAFF_ONLY` | The route is reserved for platform staff. No request was sent. |
| `STREAM_ERROR` | Reading or closing an event stream failed. |
| `REALTIME_ERROR` | The WebSocket failed, or the server refused the subscription. |
| `REALTIME_TIMEOUT` | The acknowledgement or a heartbeat reply did not arrive in time. |
| `REALTIME_CLOSED` | The server closed the WebSocket; `getStatusCode()` is the close code. |
| `REALTIME_OVERFLOW` | A realtime message exceeded the size limit. |

`getStatusCode()` returns 0 when no HTTP response was received. A realtime
error message from the server keeps the server's code. Messages, details,
response bodies, and causes can contain request data; do not log them
unfiltered, and never log credentials or signed URLs.

## Versioning and support

Versions follow semantic versioning. After 1.0.0 is released, incompatible API
changes require a new major version. Security fixes are released for the
latest minor version. See [CHANGELOG.md](CHANGELOG.md) and the
[GitHub releases](https://github.com/vaifstudio/vaif-java/releases).

Report bugs in [GitHub issues](https://github.com/vaifstudio/vaif-java/issues).
Include the SDK version, Java version, error code, request ID, and a
reproduction without credentials or customer data. For account support,
contact support@vaif.studio.

## Security

Report vulnerabilities privately to security@vaif.studio; see
[SECURITY.md](SECURITY.md). The SDK has no third-party runtime dependencies.
CI scans the locked build and test dependencies with OSV-Scanner and fails on
any known vulnerability.

## License

Copyright (c) 2026 VAIF Studio LLC. Licensed under the [MIT License](LICENSE).
