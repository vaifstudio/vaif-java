# Changelog

## 1.0.0 (unreleased)

Version 1.0.0 has not been tagged or published. The hosted API and console are
not available yet.

### Client and configuration

- Blocking client for Java 11 and later, built on the JDK HTTP client, with no
  third-party runtime dependencies.
- Thread-safe `VaifClient` configured through a builder: base URL, project ID,
  API key, bearer token or token supplier, timeout, session store, transport,
  and WebSocket factory.
- The base URL must use HTTPS. HTTP is accepted only for `localhost`,
  `127.0.0.1` and `::1`; any other HTTP base URL throws `VALIDATION_ERROR`, so
  the API key and bearer token never travel in cleartext.
- Redirects are refused, so API keys and bearer tokens never reach another
  origin.

### Auth and sessions

- App-user sign-up, sign-in, MFA verification, refresh, sign-out, user lookup,
  and password reset; platform account sign-in, MFA verification, refresh, and
  sign-out.
- A managed session refreshes once after the API's typed `TOKEN_INVALID` or
  `TOKEN_EXPIRED` refusal. Concurrent requests share one refresh, and a
  request is never replayed for a session that replaced or signed out its own.
- Sign-out waits for a refresh in progress and revokes the session on the
  server, using the refresh token when the access token has expired.
- Optional session persistence keyed by API origin and project, with
  `FileSessionStore` for private POSIX directories. A session that cannot be
  saved leaves no older session restorable.

### Data

- Immutable queries with filters, nested predicates, selection, relations,
  ordering, ranges, and pagination.
- CRUD, bulk insert, update, and delete, upsert, and count, sum, avg, min, and
  max aggregates. Bulk writes and aggregates refuse unsupported predicates
  before sending a request.

### Storage

- Signed upload and download URLs, byte transfers, signed URL batches, bucket
  creation and listing, file listing and deletion, and public object URLs.
- Signed URLs must use HTTPS except to loopback hosts. Transfers carry no API
  credentials, and their errors omit the URL.

### Functions

- Invocation by ID or name, returning a JSON object or any JSON value. A
  function's own responses, including its 401, are never retried.

### Realtime

- WebSocket table subscriptions with equality filters and column selection,
  acknowledgement, heartbeats, and a message size limit. Credentials travel in
  the first message. Insecure WebSocket URLs are refused except to loopback
  hosts.

### Generated operations

- Named blocking methods for the 775 customer operations in the API contract,
  with route metadata. `ungeneratedOperations()` lists the 168 operations
  without a method and why: 134 are reserved for platform staff, and the
  client refuses them before any I/O.

### Errors

- `VaifException` carries the API or SDK error code, HTTP status, request ID,
  details, response body, and `Retry-After` value. Transport, event-stream,
  and realtime failures use the SDK's own codes.
