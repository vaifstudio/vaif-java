// GENERATED FILE — do not edit by hand.
// Source: VAIF OpenAPI contract sha256:615e77b7a0789543; 775 operations generated, 168 not generated.
// Maintainers regenerate this file from the API contract. See CONTRIBUTING.md.
package studio.vaif.sdk.generated;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import studio.vaif.sdk.ConsoleOnlyException;
import studio.vaif.sdk.Operation;
import studio.vaif.sdk.OperationRequest;
import studio.vaif.sdk.OperationsBase;
import studio.vaif.sdk.UngeneratedOperation;
import studio.vaif.sdk.VaifClient;
import studio.vaif.sdk.VaifException;

/**
 * Blocking methods for the operations in the VAIF API contract.
 *
 * <p>Each method sends one request through the owning {@link VaifClient}, which applies its
 * authentication, timeout, and error handling. JSON responses use {@code Map}, {@code List},
 * {@code String}, {@code Boolean}, {@code Integer}, {@code Long}, {@code BigInteger},
 * {@code BigDecimal}, or null.
 */
public final class Operations extends OperationsBase {
  private static final Map<String, Operation> DEFINITIONS = createDefinitions();

  private static final List<UngeneratedOperation> UNGENERATED =
      List.of(
          new UngeneratedOperation("GET", "/admin/admins", "platform staff only"),
          new UngeneratedOperation("POST", "/admin/admins", "platform staff only"),
          new UngeneratedOperation("DELETE", "/admin/admins/{id}", "platform staff only"),
          new UngeneratedOperation("PUT", "/admin/admins/{id}", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/ai-workspace/overview", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/ai-workspace/sessions", "platform staff only"),
          new UngeneratedOperation("DELETE", "/admin/ai-workspace/sessions/{sessionId}", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/ai-workspace/sessions/{sessionId}", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/ai/backends", "platform staff only"),
          new UngeneratedOperation("DELETE", "/admin/ai/backends/{backendId}", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/ai/backends/{backendId}", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/ai/context-snapshots", "platform staff only"),
          new UngeneratedOperation("DELETE", "/admin/ai/context-snapshots/{snapshotId}", "platform staff only"),
          new UngeneratedOperation("POST", "/admin/ai/context-snapshots/{snapshotId}/invalidate", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/ai/models", "platform staff only"),
          new UngeneratedOperation("POST", "/admin/ai/models", "platform staff only"),
          new UngeneratedOperation("DELETE", "/admin/ai/models/{modelId}", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/ai/models/{modelId}", "platform staff only"),
          new UngeneratedOperation("PATCH", "/admin/ai/models/{modelId}", "platform staff only"),
          new UngeneratedOperation("POST", "/admin/ai/models/{modelId}/toggle", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/ai/prompt-templates", "platform staff only"),
          new UngeneratedOperation("POST", "/admin/ai/prompt-templates", "platform staff only"),
          new UngeneratedOperation("DELETE", "/admin/ai/prompt-templates/{templateId}", "platform staff only"),
          new UngeneratedOperation("PATCH", "/admin/ai/prompt-templates/{templateId}", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/ai/workspace/sessions", "platform staff only"),
          new UngeneratedOperation("DELETE", "/admin/ai/workspace/sessions/{sessionId}", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/ai/workspace/sessions/{sessionId}", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/copilot/classification-feedback", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/copilot/memories", "platform staff only"),
          new UngeneratedOperation("DELETE", "/admin/copilot/memories/{memoryId}", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/copilot/memories/{memoryId}", "platform staff only"),
          new UngeneratedOperation("PATCH", "/admin/copilot/memories/{memoryId}", "platform staff only"),
          new UngeneratedOperation("POST", "/admin/copilot/memories/cleanup", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/copilot/memories/stats", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/copilot/overview", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/copilot/sessions", "platform staff only"),
          new UngeneratedOperation("DELETE", "/admin/copilot/sessions/{sessionId}", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/copilot/sessions/{sessionId}", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/copilot/training-data/export", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/copilot/training-data/stats", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/dlq", "platform staff only"),
          new UngeneratedOperation("DELETE", "/admin/dlq/{messageId}", "platform staff only"),
          new UngeneratedOperation("POST", "/admin/dlq/{messageId}/retry", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/enterprise/contracts/{contractId}/billing-schedule", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/enterprise/contracts/{contractId}/invoices", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/enterprise/contracts/{contractId}/support-terms", "platform staff only"),
          new UngeneratedOperation("PUT", "/admin/enterprise/contracts/{contractId}/support-terms", "platform staff only"),
          new UngeneratedOperation("PATCH", "/admin/enterprise/contracts/{id}/commitment", "platform staff only"),
          new UngeneratedOperation("PATCH", "/admin/enterprise/inquiries/{inquiryId}", "platform staff only"),
          new UngeneratedOperation("POST", "/admin/enterprise/invoice-runs", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/enterprise/orgs/{orgId}/account", "platform staff only"),
          new UngeneratedOperation("POST", "/admin/enterprise/orgs/{orgId}/tenant/welcome", "platform staff only"),
          new UngeneratedOperation("DELETE", "/admin/errors", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/errors", "platform staff only"),
          new UngeneratedOperation("DELETE", "/admin/errors/{errorId}", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/errors/{errorId}", "platform staff only"),
          new UngeneratedOperation("PUT", "/admin/errors/{errorId}/resolve", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/errors/stats", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/health/components", "platform staff only"),
          new UngeneratedOperation("PATCH", "/admin/health/components/{componentName}", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/hosting/services", "platform staff only"),
          new UngeneratedOperation("DELETE", "/admin/hosting/services/{id}", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/hosting/services/{id}", "platform staff only"),
          new UngeneratedOperation("POST", "/admin/hosting/services/{id}/deploy", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/hosting/services/{id}/logs", "platform staff only"),
          new UngeneratedOperation("POST", "/admin/hosting/services/{id}/rollback", "platform staff only"),
          new UngeneratedOperation("POST", "/admin/hosting/services/{id}/stop", "platform staff only"),
          new UngeneratedOperation("POST", "/admin/hosting/services/{id}/suspend", "platform staff only"),
          new UngeneratedOperation("POST", "/admin/hosting/services/{id}/unsuspend", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/incidents", "platform staff only"),
          new UngeneratedOperation("POST", "/admin/incidents", "platform staff only"),
          new UngeneratedOperation("DELETE", "/admin/incidents/{incidentId}", "platform staff only"),
          new UngeneratedOperation("POST", "/admin/incidents/{incidentId}/ack", "platform staff only"),
          new UngeneratedOperation("POST", "/admin/incidents/{incidentId}/resolve", "platform staff only"),
          new UngeneratedOperation("POST", "/admin/incidents/bulk", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/organizations", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/organizations/{orgId}", "platform staff only"),
          new UngeneratedOperation("PATCH", "/admin/organizations/{orgId}", "platform staff only"),
          new UngeneratedOperation("DELETE", "/admin/organizations/{orgId}/members/{userId}", "platform staff only"),
          new UngeneratedOperation("POST", "/admin/organizations/{orgId}/transfer", "platform staff only"),
          new UngeneratedOperation("POST", "/admin/organizations/{orgId}/transfers/{id}/resend", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/overview", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/projects", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/projects/{projectId}", "platform staff only"),
          new UngeneratedOperation("PATCH", "/admin/projects/{projectId}", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/queues", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/rbac/users", "platform staff only"),
          new UngeneratedOperation("POST", "/admin/rbac/users", "platform staff only"),
          new UngeneratedOperation("DELETE", "/admin/rbac/users/{userId}/roles/{roleId}", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/regions", "platform staff only"),
          new UngeneratedOperation("PATCH", "/admin/regions/{regionKey}", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/resources/project/{projectId}", "platform staff only"),
          new UngeneratedOperation("POST", "/admin/resources/project/{projectId}/db", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/roles", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/settings", "platform staff only"),
          new UngeneratedOperation("PUT", "/admin/settings/{key}", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/support/orgs/{orgId}/tickets/{number}", "platform staff only"),
          new UngeneratedOperation("PATCH", "/admin/support/orgs/{orgId}/tickets/{number}", "platform staff only"),
          new UngeneratedOperation("POST", "/admin/support/orgs/{orgId}/tickets/{number}/messages", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/support/sla-report", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/support/tickets", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/system/info", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/users", "platform staff only"),
          new UngeneratedOperation("GET", "/admin/users/{userId}", "platform staff only"),
          new UngeneratedOperation("PATCH", "/admin/users/{userId}/admin", "platform staff only"),
          new UngeneratedOperation("PATCH", "/admin/users/{userId}/status", "platform staff only"),
          new UngeneratedOperation("POST", "/ai/copilot/deploy", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("POST", "/ai/copilot/deploy/{deployId}/rollback", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("POST", "/ai/copilot/editor/chat", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("POST", "/ai/copilot/export/docker", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("POST", "/ai/copilot/export/terraform/aws", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("POST", "/ai/copilot/export/terraform/gcp", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("POST", "/ai/copilot/export/zip", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("POST", "/ai/copilot/generation/resume", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("GET", "/ai/copilot/job/{jobId}/events", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("POST", "/ai/copilot/session/{sessionId}/workspace/approve-scripts", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("POST", "/ai/copilot/session/{sessionId}/workspace/preview/{target}/open", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("POST", "/ai/copilot/session/{sessionId}/workspace/preview/reset", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("GET", "/ai/copilot/stats", "platform staff only"),
          new UngeneratedOperation("POST", "/auth/impersonate/exchange", "platform staff only"),
          new UngeneratedOperation("POST", "/auth/impersonate/token", "platform staff only"),
          new UngeneratedOperation("GET", "/auth/oauth/{provider}", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("GET", "/auth/oauth/{provider}/callback", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("POST", "/auth/saml/acs/{id}", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("POST", "/auth/sso/callback", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("POST", "/auth/sso/start", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("GET", "/billing/org/{orgId}/invoices/{invoiceId}/pdf", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("POST", "/blueprint/frontend-beta", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("POST", "/docs/ai-answer", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("POST", "/docs/api-endpoints", "platform staff only"),
          new UngeneratedOperation("DELETE", "/docs/api-endpoints/{id}", "platform staff only"),
          new UngeneratedOperation("PATCH", "/docs/api-endpoints/{id}", "platform staff only"),
          new UngeneratedOperation("POST", "/docs/changelog", "platform staff only"),
          new UngeneratedOperation("DELETE", "/docs/changelog/{id}", "platform staff only"),
          new UngeneratedOperation("PATCH", "/docs/changelog/{id}", "platform staff only"),
          new UngeneratedOperation("POST", "/docs/examples", "platform staff only"),
          new UngeneratedOperation("DELETE", "/docs/examples/{id}", "platform staff only"),
          new UngeneratedOperation("PATCH", "/docs/examples/{id}", "platform staff only"),
          new UngeneratedOperation("POST", "/docs/sdk-examples", "platform staff only"),
          new UngeneratedOperation("DELETE", "/docs/sdk-examples/{id}", "platform staff only"),
          new UngeneratedOperation("POST", "/docs/sdks", "platform staff only"),
          new UngeneratedOperation("DELETE", "/docs/sdks/{id}", "platform staff only"),
          new UngeneratedOperation("PATCH", "/docs/sdks/{id}", "platform staff only"),
          new UngeneratedOperation("POST", "/docs/v2/pages", "platform staff only"),
          new UngeneratedOperation("DELETE", "/docs/v2/pages/{id}", "platform staff only"),
          new UngeneratedOperation("PATCH", "/docs/v2/pages/{id}", "platform staff only"),
          new UngeneratedOperation("POST", "/enterprise/contracts", "platform staff only"),
          new UngeneratedOperation("POST", "/enterprise/contracts/{contractId}/invoice", "platform staff only"),
          new UngeneratedOperation("POST", "/enterprise/invoices/{invoiceId}/paid", "platform staff only"),
          new UngeneratedOperation("POST", "/enterprise/invoices/{invoiceId}/send", "platform staff only"),
          new UngeneratedOperation("GET", "/enterprise/subdomain/{subdomain}", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("GET", "/flags", "platform staff only"),
          new UngeneratedOperation("POST", "/flags", "platform staff only"),
          new UngeneratedOperation("DELETE", "/flags/{key}", "platform staff only"),
          new UngeneratedOperation("PUT", "/flags/{key}", "platform staff only"),
          new UngeneratedOperation("GET", "/github/oauth/callback", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("GET", "/logs/project/{projectId}/stream", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("GET", "/mcp/oauth/authorize", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("GET", "/openapi.json", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("GET", "/openapi/full", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("GET", "/projects/{projectId}/auth/magic/consume", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("GET", "/projects/{projectId}/auth/oauth/{provider}/callback", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("POST", "/projects/{projectId}/environments/{envId}/domains", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("POST", "/projects/{projectId}/infrastructure/restores", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("POST", "/projects/{projectId}/terminal/exec", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("GET", "/projects/{projectId}/terminal/sessions", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("GET", "/saml/{id}/metadata", "no typed 2xx application/json response in the spec"),
          new UngeneratedOperation("POST", "/services/{serviceId}/start", "no typed 2xx application/json response in the spec"));

  /**
   * Creates the operations for a client.
   *
   * @param client client that sends each request
   * @throws NullPointerException if client is null
   */
  public Operations(VaifClient client) {
    super(client);
  }

  /**
   * Returns the route metadata of every generated operation.
   *
   * @return unmodifiable map from method name to route metadata
   */
  public Map<String, Operation> definitions() {
    return DEFINITIONS;
  }

  /**
   * Returns the contract operations that have no generated method, with the reason for each.
   *
   * @return unmodifiable list ordered by path, then method
   */
  public List<UngeneratedOperation> ungeneratedOperations() {
    return UNGENERATED;
  }

  private static Map<String, Operation> createDefinitions() {
    Map<String, Operation> out = new LinkedHashMap<>();
    definitions0(out);
    definitions1(out);
    definitions2(out);
    definitions3(out);
    definitions4(out);
    definitions5(out);
    definitions6(out);
    definitions7(out);
    return Collections.unmodifiableMap(out);
  }

  private static void definitions0(Map<String, Operation> out) {
    out.put(
        "deleteAiCopilotSessionBySessionId",
        new Operation(
            "deleteAiCopilotSessionBySessionId",
            "DELETE",
            "/ai/copilot/session/{sessionId}",
            null,
            "json",
            false,
            new String[] {"sessionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteAlertRulesByRuleId",
        new Operation(
            "deleteAlertRulesByRuleId",
            "DELETE",
            "/alert-rules/{ruleId}",
            null,
            "json",
            false,
            new String[] {"ruleId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteAuthMeLinkedAccountsByProvider",
        new Operation(
            "deleteAuthMeLinkedAccountsByProvider",
            "DELETE",
            "/auth/me/linked-accounts/{provider}",
            null,
            "json",
            false,
            new String[] {"provider"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteAuthSessionsById",
        new Operation(
            "deleteAuthSessionsById",
            "DELETE",
            "/auth/sessions/{id}",
            null,
            "json",
            false,
            new String[] {"id"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteBillingOrgByOrgIdAddonsByAddonId",
        new Operation(
            "deleteBillingOrgByOrgIdAddonsByAddonId",
            "DELETE",
            "/billing/org/{orgId}/addons/{addonId}",
            null,
            "json",
            false,
            new String[] {"orgId", "addonId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteBillingOrgByOrgIdContactsByContactId",
        new Operation(
            "deleteBillingOrgByOrgIdContactsByContactId",
            "DELETE",
            "/billing/org/{orgId}/contacts/{contactId}",
            null,
            "json",
            false,
            new String[] {"orgId", "contactId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteBillingOrgByOrgIdUsageAlertsByAlertId",
        new Operation(
            "deleteBillingOrgByOrgIdUsageAlertsByAlertId",
            "DELETE",
            "/billing/org/{orgId}/usage-alerts/{alertId}",
            null,
            "json",
            false,
            new String[] {"orgId", "alertId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteBucketsByBucketId",
        new Operation(
            "deleteBucketsByBucketId",
            "DELETE",
            "/buckets/{bucketId}",
            null,
            "json",
            false,
            new String[] {"bucketId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteBucketsByBucketIdFiles",
        new Operation(
            "deleteBucketsByBucketIdFiles",
            "DELETE",
            "/buckets/{bucketId}/files",
            null,
            "json",
            false,
            new String[] {"bucketId"},
            new String[] {"key"},
            new String[] {"key"},
            new String[0]));
    out.put(
        "deleteDatabaseExtensionsProjectByProjectIdByExtensionId",
        new Operation(
            "deleteDatabaseExtensionsProjectByProjectIdByExtensionId",
            "DELETE",
            "/database/extensions/project/{projectId}/{extensionId}",
            null,
            "json",
            false,
            new String[] {"projectId", "extensionId"},
            new String[] {"envId"},
            new String[0],
            new String[0]));
    out.put(
        "deleteDatabaseWrappersProjectByProjectIdByWrapperId",
        new Operation(
            "deleteDatabaseWrappersProjectByProjectIdByWrapperId",
            "DELETE",
            "/database/wrappers/project/{projectId}/{wrapperId}",
            null,
            "json",
            false,
            new String[] {"projectId", "wrapperId"},
            new String[] {"envId"},
            new String[0],
            new String[0]));
    out.put(
        "deleteFunctionsByFunctionId",
        new Operation(
            "deleteFunctionsByFunctionId",
            "DELETE",
            "/functions/{functionId}",
            null,
            "json",
            false,
            new String[] {"functionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteFunctionsByFunctionIdSchedule",
        new Operation(
            "deleteFunctionsByFunctionIdSchedule",
            "DELETE",
            "/functions/{functionId}/schedule",
            null,
            "json",
            false,
            new String[] {"functionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteFunctionsSecretsBySecretId",
        new Operation(
            "deleteFunctionsSecretsBySecretId",
            "DELETE",
            "/functions/secrets/{secretId}",
            null,
            "json",
            false,
            new String[] {"secretId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteFunctionsTriggersByTriggerId",
        new Operation(
            "deleteFunctionsTriggersByTriggerId",
            "DELETE",
            "/functions/triggers/{triggerId}",
            null,
            "json",
            false,
            new String[] {"triggerId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteGeneratedByTableBulk",
        new Operation(
            "deleteGeneratedByTableBulk",
            "DELETE",
            "/generated/{table}/bulk",
            null,
            "json",
            false,
            new String[] {"table"},
            new String[] {"where", "filter", "whereField", "whereValue", "ids"},
            new String[0],
            new String[] {"filter"}));
    out.put(
        "deleteGeneratedByTableById",
        new Operation(
            "deleteGeneratedByTableById",
            "DELETE",
            "/generated/{table}/{id}",
            null,
            "json",
            false,
            new String[] {"table", "id"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteIntegrationsSubscriptionsById",
        new Operation(
            "deleteIntegrationsSubscriptionsById",
            "DELETE",
            "/integrations/subscriptions/{id}",
            null,
            "json",
            false,
            new String[] {"id"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteMcpConnectionsById",
        new Operation(
            "deleteMcpConnectionsById",
            "DELETE",
            "/mcp/connections/{id}",
            null,
            "json",
            false,
            new String[] {"id"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteMongodbByCollectionIndexesByIndexName",
        new Operation(
            "deleteMongodbByCollectionIndexesByIndexName",
            "DELETE",
            "/mongodb/{collection}/indexes/{indexName}",
            null,
            "json",
            false,
            new String[] {"collection", "indexName"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteMongodbCollectionsByName",
        new Operation(
            "deleteMongodbCollectionsByName",
            "DELETE",
            "/mongodb/collections/{name}",
            null,
            "json",
            false,
            new String[] {"name"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteOauthOrgByOrgIdProviderByProvider",
        new Operation(
            "deleteOauthOrgByOrgIdProviderByProvider",
            "DELETE",
            "/oauth/org/{orgId}/provider/{provider}",
            null,
            "json",
            false,
            new String[] {"orgId", "provider"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteOrgsByOrgIdInvitesByInviteId",
        new Operation(
            "deleteOrgsByOrgIdInvitesByInviteId",
            "DELETE",
            "/orgs/{orgId}/invites/{inviteId}",
            null,
            "json",
            false,
            new String[] {"orgId", "inviteId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteOrgsByOrgIdLeaveRequestsMine",
        new Operation(
            "deleteOrgsByOrgIdLeaveRequestsMine",
            "DELETE",
            "/orgs/{orgId}/leave-requests/mine",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteOrgsByOrgIdMembersByUserId",
        new Operation(
            "deleteOrgsByOrgIdMembersByUserId",
            "DELETE",
            "/orgs/{orgId}/members/{userId}",
            null,
            "json",
            false,
            new String[] {"orgId", "userId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteOrgsByOrgIdTransfersById",
        new Operation(
            "deleteOrgsByOrgIdTransfersById",
            "DELETE",
            "/orgs/{orgId}/transfers/{id}",
            null,
            "json",
            false,
            new String[] {"orgId", "id"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteProjectsByProjectId",
        new Operation(
            "deleteProjectsByProjectId",
            "DELETE",
            "/projects/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteProjectsByProjectIdAuthOauthAppsByProvider",
        new Operation(
            "deleteProjectsByProjectIdAuthOauthAppsByProvider",
            "DELETE",
            "/projects/{projectId}/auth/oauth-apps/{provider}",
            null,
            "json",
            false,
            new String[] {"projectId", "provider"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteProjectsByProjectIdAuthSessions",
        new Operation(
            "deleteProjectsByProjectIdAuthSessions",
            "DELETE",
            "/projects/{projectId}/auth/sessions",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteProjectsByProjectIdAuthSessionsById",
        new Operation(
            "deleteProjectsByProjectIdAuthSessionsById",
            "DELETE",
            "/projects/{projectId}/auth/sessions/{id}",
            null,
            "json",
            false,
            new String[] {"projectId", "id"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteProjectsByProjectIdBranchesByBranchName",
        new Operation(
            "deleteProjectsByProjectIdBranchesByBranchName",
            "DELETE",
            "/projects/{projectId}/branches/{branchName}",
            null,
            "json",
            false,
            new String[] {"projectId", "branchName"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteProjectsByProjectIdDatabaseDedicated",
        new Operation(
            "deleteProjectsByProjectIdDatabaseDedicated",
            "DELETE",
            "/projects/{projectId}/database/dedicated",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteProjectsByProjectIdEnvVarsByEnvVarId",
        new Operation(
            "deleteProjectsByProjectIdEnvVarsByEnvVarId",
            "DELETE",
            "/projects/{projectId}/env-vars/{envVarId}",
            null,
            "json",
            false,
            new String[] {"projectId", "envVarId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteProjectsByProjectIdEnvironmentsByEnvId",
        new Operation(
            "deleteProjectsByProjectIdEnvironmentsByEnvId",
            "DELETE",
            "/projects/{projectId}/environments/{envId}",
            null,
            "json",
            false,
            new String[] {"projectId", "envId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteProjectsByProjectIdEnvironmentsByEnvIdDomainsByDomainId",
        new Operation(
            "deleteProjectsByProjectIdEnvironmentsByEnvIdDomainsByDomainId",
            "DELETE",
            "/projects/{projectId}/environments/{envId}/domains/{domainId}",
            null,
            "json",
            false,
            new String[] {"projectId", "envId", "domainId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteProjectsByProjectIdGithubDisconnect",
        new Operation(
            "deleteProjectsByProjectIdGithubDisconnect",
            "DELETE",
            "/projects/{projectId}/github/disconnect",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteProjectsByProjectIdInfrastructureByInstanceId",
        new Operation(
            "deleteProjectsByProjectIdInfrastructureByInstanceId",
            "DELETE",
            "/projects/{projectId}/infrastructure/{instanceId}",
            "json",
            "json",
            false,
            new String[] {"projectId", "instanceId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteProjectsByProjectIdMembersByUserId",
        new Operation(
            "deleteProjectsByProjectIdMembersByUserId",
            "DELETE",
            "/projects/{projectId}/members/{userId}",
            null,
            "json",
            false,
            new String[] {"projectId", "userId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteProjectsByProjectIdUsersByUserId",
        new Operation(
            "deleteProjectsByProjectIdUsersByUserId",
            "DELETE",
            "/projects/{projectId}/users/{userId}",
            null,
            "json",
            false,
            new String[] {"projectId", "userId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteProjectsByProjectIdUsersByUserIdSessionsBySessionId",
        new Operation(
            "deleteProjectsByProjectIdUsersByUserIdSessionsBySessionId",
            "DELETE",
            "/projects/{projectId}/users/{userId}/sessions/{sessionId}",
            null,
            "json",
            false,
            new String[] {"projectId", "userId", "sessionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteRlsPoliciesByPolicyId",
        new Operation(
            "deleteRlsPoliciesByPolicyId",
            "DELETE",
            "/rls/policies/{policyId}",
            null,
            "json",
            false,
            new String[] {"policyId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteSchemaEngineSnippetsByProjectIdBySnippetId",
        new Operation(
            "deleteSchemaEngineSnippetsByProjectIdBySnippetId",
            "DELETE",
            "/schema-engine/snippets/{projectId}/{snippetId}",
            null,
            "json",
            false,
            new String[] {"projectId", "snippetId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteServicesByServiceId",
        new Operation(
            "deleteServicesByServiceId",
            "DELETE",
            "/services/{serviceId}",
            null,
            "json",
            false,
            new String[] {"serviceId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteServicesByServiceIdDomainsByDomainId",
        new Operation(
            "deleteServicesByServiceIdDomainsByDomainId",
            "DELETE",
            "/services/{serviceId}/domains/{domainId}",
            null,
            "json",
            false,
            new String[] {"serviceId", "domainId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteServicesByServiceIdGitConnect",
        new Operation(
            "deleteServicesByServiceIdGitConnect",
            "DELETE",
            "/services/{serviceId}/git/connect",
            null,
            "json",
            false,
            new String[] {"serviceId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteSsoOrgByOrgIdConnectionsByConnectionId",
        new Operation(
            "deleteSsoOrgByOrgIdConnectionsByConnectionId",
            "DELETE",
            "/sso/org/{orgId}/connections/{connectionId}",
            null,
            "json",
            false,
            new String[] {"orgId", "connectionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteSsoOrgByOrgIdConnectionsByConnectionIdCertificatesByCertId",
        new Operation(
            "deleteSsoOrgByOrgIdConnectionsByConnectionIdCertificatesByCertId",
            "DELETE",
            "/sso/org/{orgId}/connections/{connectionId}/certificates/{certId}",
            null,
            "json",
            false,
            new String[] {"orgId", "connectionId", "certId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteSsoOrgByOrgIdConnectionsByConnectionIdIdentitiesByUserId",
        new Operation(
            "deleteSsoOrgByOrgIdConnectionsByConnectionIdIdentitiesByUserId",
            "DELETE",
            "/sso/org/{orgId}/connections/{connectionId}/identities/{userId}",
            null,
            "json",
            false,
            new String[] {"orgId", "connectionId", "userId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteSsoOrgByOrgIdConnectionsByConnectionIdScimTokensByTokenId",
        new Operation(
            "deleteSsoOrgByOrgIdConnectionsByConnectionIdScimTokensByTokenId",
            "DELETE",
            "/sso/org/{orgId}/connections/{connectionId}/scim/tokens/{tokenId}",
            null,
            "json",
            false,
            new String[] {"orgId", "connectionId", "tokenId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteSsoOrgByOrgIdOutsideMembersAllowByAllowId",
        new Operation(
            "deleteSsoOrgByOrgIdOutsideMembersAllowByAllowId",
            "DELETE",
            "/sso/org/{orgId}/outside-members/allow/{allowId}",
            null,
            "json",
            false,
            new String[] {"orgId", "allowId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteSsoOrgByOrgIdSecurityContact",
        new Operation(
            "deleteSsoOrgByOrgIdSecurityContact",
            "DELETE",
            "/sso/org/{orgId}/security-contact",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteStorageBucketsByBucketIdPoliciesByPolicyId",
        new Operation(
            "deleteStorageBucketsByBucketIdPoliciesByPolicyId",
            "DELETE",
            "/storage/buckets/{bucketId}/policies/{policyId}",
            null,
            "json",
            false,
            new String[] {"bucketId", "policyId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteTemplatesById",
        new Operation(
            "deleteTemplatesById",
            "DELETE",
            "/templates/{id}",
            null,
            "json",
            false,
            new String[] {"id"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "deleteV1DataByProjectIdByTableBulk",
        new Operation(
            "deleteV1DataByProjectIdByTableBulk",
            "DELETE",
            "/v1/data/{projectId}/{table}/bulk",
            null,
            "json",
            false,
            new String[] {"projectId", "table"},
            new String[] {"where", "filter", "whereField", "whereValue", "ids"},
            new String[0],
            new String[] {"filter"}));
    out.put(
        "deleteV1DataByProjectIdByTableById",
        new Operation(
            "deleteV1DataByProjectIdByTableById",
            "DELETE",
            "/v1/data/{projectId}/{table}/{id}",
            null,
            "json",
            false,
            new String[] {"projectId", "table", "id"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getRoot",
        new Operation(
            "getRoot",
            "GET",
            "/",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getActivationOrgByOrgId",
        new Operation(
            "getActivationOrgByOrgId",
            "GET",
            "/activation/org/{orgId}",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAiCopilotAutocomplete",
        new Operation(
            "getAiCopilotAutocomplete",
            "GET",
            "/ai/copilot/autocomplete",
            null,
            "json",
            false,
            new String[0],
            new String[] {"projectId", "q", "kinds", "envId", "limit"},
            new String[] {"projectId"},
            new String[0]));
    out.put(
        "getAiCopilotContextSummaryByProjectId",
        new Operation(
            "getAiCopilotContextSummaryByProjectId",
            "GET",
            "/ai/copilot/context-summary/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAiCopilotCreditStatusByProjectId",
        new Operation(
            "getAiCopilotCreditStatusByProjectId",
            "GET",
            "/ai/copilot/credit-status/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAiCopilotDeployByDeployId",
        new Operation(
            "getAiCopilotDeployByDeployId",
            "GET",
            "/ai/copilot/deploy/{deployId}",
            null,
            "json",
            false,
            new String[] {"deployId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAiCopilotDeployHistoryByProjectId",
        new Operation(
            "getAiCopilotDeployHistoryByProjectId",
            "GET",
            "/ai/copilot/deploy/history/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"limit", "offset", "status"},
            new String[0],
            new String[0]));
    out.put(
        "getAiCopilotExecutionByExecutionId",
        new Operation(
            "getAiCopilotExecutionByExecutionId",
            "GET",
            "/ai/copilot/execution/{executionId}",
            null,
            "json",
            false,
            new String[] {"executionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAiCopilotExecutionsBySessionId",
        new Operation(
            "getAiCopilotExecutionsBySessionId",
            "GET",
            "/ai/copilot/executions/{sessionId}",
            null,
            "json",
            false,
            new String[] {"sessionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAiCopilotGitBranchesBySessionId",
        new Operation(
            "getAiCopilotGitBranchesBySessionId",
            "GET",
            "/ai/copilot/git/branches/{sessionId}",
            null,
            "json",
            false,
            new String[] {"sessionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAiCopilotGitFilesBySessionId",
        new Operation(
            "getAiCopilotGitFilesBySessionId",
            "GET",
            "/ai/copilot/git/files/{sessionId}",
            null,
            "json",
            false,
            new String[] {"sessionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAiCopilotGitLogBySessionId",
        new Operation(
            "getAiCopilotGitLogBySessionId",
            "GET",
            "/ai/copilot/git/log/{sessionId}",
            null,
            "json",
            false,
            new String[] {"sessionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAiCopilotGitStatusBySessionId",
        new Operation(
            "getAiCopilotGitStatusBySessionId",
            "GET",
            "/ai/copilot/git/status/{sessionId}",
            null,
            "json",
            false,
            new String[] {"sessionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAiCopilotJobByJobId",
        new Operation(
            "getAiCopilotJobByJobId",
            "GET",
            "/ai/copilot/job/{jobId}",
            null,
            "json",
            false,
            new String[] {"jobId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAiCopilotManifestByManifestId",
        new Operation(
            "getAiCopilotManifestByManifestId",
            "GET",
            "/ai/copilot/manifest/{manifestId}",
            null,
            "json",
            false,
            new String[] {"manifestId"},
            new String[] {"projectId"},
            new String[0],
            new String[0]));
    out.put(
        "getAiCopilotMetricsByProjectId",
        new Operation(
            "getAiCopilotMetricsByProjectId",
            "GET",
            "/ai/copilot/metrics/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"range"},
            new String[0],
            new String[0]));
    out.put(
        "getAiCopilotMetricsOrgByOrgId",
        new Operation(
            "getAiCopilotMetricsOrgByOrgId",
            "GET",
            "/ai/copilot/metrics/org/{orgId}",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[] {"range"},
            new String[0],
            new String[0]));
    out.put(
        "getAiCopilotModelsByProjectId",
        new Operation(
            "getAiCopilotModelsByProjectId",
            "GET",
            "/ai/copilot/models/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAiCopilotSessionBySessionId",
        new Operation(
            "getAiCopilotSessionBySessionId",
            "GET",
            "/ai/copilot/session/{sessionId}",
            null,
            "json",
            false,
            new String[] {"sessionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAiCopilotSessionBySessionIdEditorFiles",
        new Operation(
            "getAiCopilotSessionBySessionIdEditorFiles",
            "GET",
            "/ai/copilot/session/{sessionId}/editor-files",
            null,
            "json",
            false,
            new String[] {"sessionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAiCopilotSessionBySessionIdWorkspaceExport",
        new Operation(
            "getAiCopilotSessionBySessionIdWorkspaceExport",
            "GET",
            "/ai/copilot/session/{sessionId}/workspace/export",
            null,
            "json",
            false,
            new String[] {"sessionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAiCopilotSessionBySessionIdWorkspaceStatus",
        new Operation(
            "getAiCopilotSessionBySessionIdWorkspaceStatus",
            "GET",
            "/ai/copilot/session/{sessionId}/workspace/status",
            null,
            "json",
            false,
            new String[] {"sessionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAiCopilotSessionBySessionIdWorkspaceTypes",
        new Operation(
            "getAiCopilotSessionBySessionIdWorkspaceTypes",
            "GET",
            "/ai/copilot/session/{sessionId}/workspace/types",
            null,
            "json",
            false,
            new String[] {"sessionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAiCopilotSessionsByProjectId",
        new Operation(
            "getAiCopilotSessionsByProjectId",
            "GET",
            "/ai/copilot/sessions/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAiCopilotUsageByProjectId",
        new Operation(
            "getAiCopilotUsageByProjectId",
            "GET",
            "/ai/copilot/usage/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAiCopilotUsageOrgByOrgId",
        new Operation(
            "getAiCopilotUsageOrgByOrgId",
            "GET",
            "/ai/copilot/usage-org/{orgId}",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAiCopilotVersionByVersionId",
        new Operation(
            "getAiCopilotVersionByVersionId",
            "GET",
            "/ai/copilot/version/{versionId}",
            null,
            "json",
            false,
            new String[] {"versionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAiCopilotVersionByVersionIdDiffByCompareVersionId",
        new Operation(
            "getAiCopilotVersionByVersionIdDiffByCompareVersionId",
            "GET",
            "/ai/copilot/version/{versionId}/diff/{compareVersionId}",
            null,
            "json",
            false,
            new String[] {"versionId", "compareVersionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAiCopilotVersionsBySessionId",
        new Operation(
            "getAiCopilotVersionsBySessionId",
            "GET",
            "/ai/copilot/versions/{sessionId}",
            null,
            "json",
            false,
            new String[] {"sessionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAiUsageOrgByOrgIdBreakdown",
        new Operation(
            "getAiUsageOrgByOrgIdBreakdown",
            "GET",
            "/ai-usage/org/{orgId}/breakdown",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAiUsageOrgByOrgIdExhaustionEvents",
        new Operation(
            "getAiUsageOrgByOrgIdExhaustionEvents",
            "GET",
            "/ai-usage/org/{orgId}/exhaustion-events",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[] {"limit"},
            new String[0],
            new String[0]));
    out.put(
        "getAiUsageOrgByOrgIdHistory",
        new Operation(
            "getAiUsageOrgByOrgIdHistory",
            "GET",
            "/ai-usage/org/{orgId}/history",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[] {"days"},
            new String[0],
            new String[0]));
    out.put(
        "getAiUsageOrgByOrgIdRecent",
        new Operation(
            "getAiUsageOrgByOrgIdRecent",
            "GET",
            "/ai-usage/org/{orgId}/recent",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[] {"limit", "offset"},
            new String[0],
            new String[0]));
    out.put(
        "getAiUsageOrgByOrgIdRollups",
        new Operation(
            "getAiUsageOrgByOrgIdRollups",
            "GET",
            "/ai-usage/org/{orgId}/rollups",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[] {"limit"},
            new String[0],
            new String[0]));
    out.put(
        "getAiUsageOrgByOrgIdSummary",
        new Operation(
            "getAiUsageOrgByOrgIdSummary",
            "GET",
            "/ai-usage/org/{orgId}/summary",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAiUsageOrgByOrgIdVerament",
        new Operation(
            "getAiUsageOrgByOrgIdVerament",
            "GET",
            "/ai-usage/org/{orgId}/verament",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[] {"period"},
            new String[0],
            new String[0]));
    out.put(
        "getAlertRulesProjectByProjectId",
        new Operation(
            "getAlertRulesProjectByProjectId",
            "GET",
            "/alert-rules/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAnnouncements",
        new Operation(
            "getAnnouncements",
            "GET",
            "/announcements",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAuditOrgByOrgId",
        new Operation(
            "getAuditOrgByOrgId",
            "GET",
            "/audit/org/{orgId}",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[] {"projectId", "actorId", "action", "q", "since", "until", "before", "limit"},
            new String[0],
            new String[0]));
    out.put(
        "getAuditProjectByProjectId",
        new Operation(
            "getAuditProjectByProjectId",
            "GET",
            "/audit/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAuthMe",
        new Operation(
            "getAuthMe",
            "GET",
            "/auth/me",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAuthMeAdmin",
        new Operation(
            "getAuthMeAdmin",
            "GET",
            "/auth/me/admin",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAuthMeContext",
        new Operation(
            "getAuthMeContext",
            "GET",
            "/auth/me/context",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAuthMeLinkedAccounts",
        new Operation(
            "getAuthMeLinkedAccounts",
            "GET",
            "/auth/me/linked-accounts",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAuthMfaStatus",
        new Operation(
            "getAuthMfaStatus",
            "GET",
            "/auth/mfa/status",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
  }

  private static void definitions1(Map<String, Operation> out) {
    out.put(
        "getAuthOauthProviders",
        new Operation(
            "getAuthOauthProviders",
            "GET",
            "/auth/oauth/providers",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAuthSession",
        new Operation(
            "getAuthSession",
            "GET",
            "/auth/session",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAuthSessions",
        new Operation(
            "getAuthSessions",
            "GET",
            "/auth/sessions",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getAuthTenantSession",
        new Operation(
            "getAuthTenantSession",
            "GET",
            "/auth/tenant/session",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getBillingAddonsCatalog",
        new Operation(
            "getBillingAddonsCatalog",
            "GET",
            "/billing/addons/catalog",
            null,
            "json",
            false,
            new String[0],
            new String[] {"orgId"},
            new String[0],
            new String[0]));
    out.put(
        "getBillingCheckoutVerifyBySessionId",
        new Operation(
            "getBillingCheckoutVerifyBySessionId",
            "GET",
            "/billing/checkout/verify/{sessionId}",
            null,
            "json",
            false,
            new String[] {"sessionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getBillingCreditsPackages",
        new Operation(
            "getBillingCreditsPackages",
            "GET",
            "/billing/credits/packages",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getBillingCreditsRates",
        new Operation(
            "getBillingCreditsRates",
            "GET",
            "/billing/credits/rates",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getBillingFoundersWall",
        new Operation(
            "getBillingFoundersWall",
            "GET",
            "/billing/founders/wall",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getBillingOrgByOrgIdAddons",
        new Operation(
            "getBillingOrgByOrgIdAddons",
            "GET",
            "/billing/org/{orgId}/addons",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getBillingOrgByOrgIdCardCheck",
        new Operation(
            "getBillingOrgByOrgIdCardCheck",
            "GET",
            "/billing/org/{orgId}/card-check",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getBillingOrgByOrgIdContacts",
        new Operation(
            "getBillingOrgByOrgIdContacts",
            "GET",
            "/billing/org/{orgId}/contacts",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getBillingOrgByOrgIdCostBreakdown",
        new Operation(
            "getBillingOrgByOrgIdCostBreakdown",
            "GET",
            "/billing/org/{orgId}/cost-breakdown",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getBillingOrgByOrgIdCreditsAutoTopup",
        new Operation(
            "getBillingOrgByOrgIdCreditsAutoTopup",
            "GET",
            "/billing/org/{orgId}/credits/auto-topup",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getBillingOrgByOrgIdCreditsTransactions",
        new Operation(
            "getBillingOrgByOrgIdCreditsTransactions",
            "GET",
            "/billing/org/{orgId}/credits/transactions",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[] {"type", "period", "before", "limit"},
            new String[0],
            new String[0]));
    out.put(
        "getBillingOrgByOrgIdFounder",
        new Operation(
            "getBillingOrgByOrgIdFounder",
            "GET",
            "/billing/org/{orgId}/founder",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getBillingOrgByOrgIdHosting",
        new Operation(
            "getBillingOrgByOrgIdHosting",
            "GET",
            "/billing/org/{orgId}/hosting",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getBillingOrgByOrgIdInfrastructure",
        new Operation(
            "getBillingOrgByOrgIdInfrastructure",
            "GET",
            "/billing/org/{orgId}/infrastructure",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getBillingOrgByOrgIdInvoices",
        new Operation(
            "getBillingOrgByOrgIdInvoices",
            "GET",
            "/billing/org/{orgId}/invoices",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[] {"q", "status", "since", "until", "startingAfter", "limit"},
            new String[0],
            new String[0]));
    out.put(
        "getBillingOrgByOrgIdOverages",
        new Operation(
            "getBillingOrgByOrgIdOverages",
            "GET",
            "/billing/org/{orgId}/overages",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getBillingOrgByOrgIdOveragesHistory",
        new Operation(
            "getBillingOrgByOrgIdOveragesHistory",
            "GET",
            "/billing/org/{orgId}/overages/history",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[] {"limit"},
            new String[0],
            new String[0]));
    out.put(
        "getBillingOrgByOrgIdSubscription",
        new Operation(
            "getBillingOrgByOrgIdSubscription",
            "GET",
            "/billing/org/{orgId}/subscription",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getBillingOrgByOrgIdSummary",
        new Operation(
            "getBillingOrgByOrgIdSummary",
            "GET",
            "/billing/org/{orgId}/summary",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getBillingOrgByOrgIdTaxInfo",
        new Operation(
            "getBillingOrgByOrgIdTaxInfo",
            "GET",
            "/billing/org/{orgId}/tax-info",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getBillingOrgByOrgIdUsage",
        new Operation(
            "getBillingOrgByOrgIdUsage",
            "GET",
            "/billing/org/{orgId}/usage",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getBillingOrgByOrgIdUsageAlerts",
        new Operation(
            "getBillingOrgByOrgIdUsageAlerts",
            "GET",
            "/billing/org/{orgId}/usage-alerts",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getBillingOrgByOrgIdUsageAlertsConfigured",
        new Operation(
            "getBillingOrgByOrgIdUsageAlertsConfigured",
            "GET",
            "/billing/org/{orgId}/usage-alerts/configured",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getBillingOrgByOrgIdUsageAlertsHistory",
        new Operation(
            "getBillingOrgByOrgIdUsageAlertsHistory",
            "GET",
            "/billing/org/{orgId}/usage-alerts/history",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[] {"limit", "before"},
            new String[0],
            new String[0]));
    out.put(
        "getBillingOrgByOrgIdUsageHistory",
        new Operation(
            "getBillingOrgByOrgIdUsageHistory",
            "GET",
            "/billing/org/{orgId}/usage/history",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[] {"months"},
            new String[0],
            new String[0]));
    out.put(
        "getBillingOrgByOrgIdUsageRealtime",
        new Operation(
            "getBillingOrgByOrgIdUsageRealtime",
            "GET",
            "/billing/org/{orgId}/usage/realtime",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getBillingPlans",
        new Operation(
            "getBillingPlans",
            "GET",
            "/billing/plans",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getBootstrap",
        new Operation(
            "getBootstrap",
            "GET",
            "/bootstrap",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getBucketsByBucketId",
        new Operation(
            "getBucketsByBucketId",
            "GET",
            "/buckets/{bucketId}",
            null,
            "json",
            false,
            new String[] {"bucketId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getBucketsByBucketIdFiles",
        new Operation(
            "getBucketsByBucketIdFiles",
            "GET",
            "/buckets/{bucketId}/files",
            null,
            "json",
            false,
            new String[] {"bucketId"},
            new String[] {"prefix", "maxKeys", "continuationToken"},
            new String[0],
            new String[0]));
    out.put(
        "getBucketsProjectByProjectId",
        new Operation(
            "getBucketsProjectByProjectId",
            "GET",
            "/buckets/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"envId"},
            new String[0],
            new String[0]));
    out.put(
        "getCmsCareers",
        new Operation(
            "getCmsCareers",
            "GET",
            "/cms/careers",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getCmsFaqsByPageSlug",
        new Operation(
            "getCmsFaqsByPageSlug",
            "GET",
            "/cms/faqs/{pageSlug}",
            null,
            "json",
            false,
            new String[] {"pageSlug"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getCmsPagesBySlug",
        new Operation(
            "getCmsPagesBySlug",
            "GET",
            "/cms/pages/{slug}",
            null,
            "json",
            false,
            new String[] {"slug"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getCmsPartners",
        new Operation(
            "getCmsPartners",
            "GET",
            "/cms/partners",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getCmsTeam",
        new Operation(
            "getCmsTeam",
            "GET",
            "/cms/team",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getCmsTestimonials",
        new Operation(
            "getCmsTestimonials",
            "GET",
            "/cms/testimonials",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getCreditsOrgByOrgId",
        new Operation(
            "getCreditsOrgByOrgId",
            "GET",
            "/credits/org/{orgId}",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getCreditsOrgByOrgIdBalance",
        new Operation(
            "getCreditsOrgByOrgIdBalance",
            "GET",
            "/credits/org/{orgId}/balance",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getDatabaseConnectorByProjectIdTables",
        new Operation(
            "getDatabaseConnectorByProjectIdTables",
            "GET",
            "/database/connector/{projectId}/tables",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"wrapperId"},
            new String[0],
            new String[0]));
    out.put(
        "getDatabaseExtensionsAvailable",
        new Operation(
            "getDatabaseExtensionsAvailable",
            "GET",
            "/database/extensions/available",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getDatabaseExtensionsProjectByProjectId",
        new Operation(
            "getDatabaseExtensionsProjectByProjectId",
            "GET",
            "/database/extensions/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"envId"},
            new String[0],
            new String[0]));
    out.put(
        "getDatabaseTiers",
        new Operation(
            "getDatabaseTiers",
            "GET",
            "/database/tiers",
            null,
            "json",
            false,
            new String[0],
            new String[] {"orgId"},
            new String[0],
            new String[0]));
    out.put(
        "getDatabaseWrappersAvailable",
        new Operation(
            "getDatabaseWrappersAvailable",
            "GET",
            "/database/wrappers/available",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getDatabaseWrappersProjectByProjectId",
        new Operation(
            "getDatabaseWrappersProjectByProjectId",
            "GET",
            "/database/wrappers/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"envId"},
            new String[0],
            new String[0]));
    out.put(
        "getDeploymentsByDeploymentId",
        new Operation(
            "getDeploymentsByDeploymentId",
            "GET",
            "/deployments/{deploymentId}",
            null,
            "json",
            false,
            new String[] {"deploymentId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getDeploymentsByDeploymentIdSteps",
        new Operation(
            "getDeploymentsByDeploymentIdSteps",
            "GET",
            "/deployments/{deploymentId}/steps",
            null,
            "json",
            false,
            new String[] {"deploymentId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getDeploymentsProjectByProjectId",
        new Operation(
            "getDeploymentsProjectByProjectId",
            "GET",
            "/deployments/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"env", "limit", "offset"},
            new String[0],
            new String[0]));
    out.put(
        "getDeploymentsProjectByProjectIdStats",
        new Operation(
            "getDeploymentsProjectByProjectIdStats",
            "GET",
            "/deployments/project/{projectId}/stats",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getDeploymentsTokensProjectByProjectId",
        new Operation(
            "getDeploymentsTokensProjectByProjectId",
            "GET",
            "/deployments/tokens/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"envId"},
            new String[0],
            new String[0]));
    out.put(
        "getDocsAiSearch",
        new Operation(
            "getDocsAiSearch",
            "GET",
            "/docs/ai-search",
            null,
            "json",
            false,
            new String[0],
            new String[] {"q"},
            new String[0],
            new String[0]));
    out.put(
        "getDocsApiEndpoints",
        new Operation(
            "getDocsApiEndpoints",
            "GET",
            "/docs/api-endpoints",
            null,
            "json",
            false,
            new String[0],
            new String[] {"category"},
            new String[0],
            new String[0]));
    out.put(
        "getDocsApiEndpointsById",
        new Operation(
            "getDocsApiEndpointsById",
            "GET",
            "/docs/api-endpoints/{id}",
            null,
            "json",
            false,
            new String[] {"id"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getDocsCategories",
        new Operation(
            "getDocsCategories",
            "GET",
            "/docs/categories",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getDocsChangelog",
        new Operation(
            "getDocsChangelog",
            "GET",
            "/docs/changelog",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getDocsChangelogById",
        new Operation(
            "getDocsChangelogById",
            "GET",
            "/docs/changelog/{id}",
            null,
            "json",
            false,
            new String[] {"id"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getDocsExamples",
        new Operation(
            "getDocsExamples",
            "GET",
            "/docs/examples",
            null,
            "json",
            false,
            new String[0],
            new String[] {"featured"},
            new String[0],
            new String[0]));
    out.put(
        "getDocsExamplesBySlug",
        new Operation(
            "getDocsExamplesBySlug",
            "GET",
            "/docs/examples/{slug}",
            null,
            "json",
            false,
            new String[] {"slug"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getDocsProjectByProjectIdQuickstart",
        new Operation(
            "getDocsProjectByProjectIdQuickstart",
            "GET",
            "/docs/project/{projectId}/quickstart",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getDocsSdks",
        new Operation(
            "getDocsSdks",
            "GET",
            "/docs/sdks",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getDocsSdksByPlatform",
        new Operation(
            "getDocsSdksByPlatform",
            "GET",
            "/docs/sdks/{platform}",
            null,
            "json",
            false,
            new String[] {"platform"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getDocsSdksBySdkIdExamples",
        new Operation(
            "getDocsSdksBySdkIdExamples",
            "GET",
            "/docs/sdks/{sdkId}/examples",
            null,
            "json",
            false,
            new String[] {"sdkId"},
            new String[] {"topic"},
            new String[0],
            new String[0]));
    out.put(
        "getDocsSearch",
        new Operation(
            "getDocsSearch",
            "GET",
            "/docs/search",
            null,
            "json",
            false,
            new String[0],
            new String[] {"q"},
            new String[0],
            new String[0]));
    out.put(
        "getDocsV2Pages",
        new Operation(
            "getDocsV2Pages",
            "GET",
            "/docs/v2/pages",
            null,
            "json",
            false,
            new String[0],
            new String[] {"category", "search"},
            new String[0],
            new String[0]));
    out.put(
        "getDocsV2PagesBySlug",
        new Operation(
            "getDocsV2PagesBySlug",
            "GET",
            "/docs/v2/pages/{slug}",
            null,
            "json",
            false,
            new String[] {"slug"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getEarlyByNumber",
        new Operation(
            "getEarlyByNumber",
            "GET",
            "/early/{number}",
            null,
            "json",
            false,
            new String[] {"number"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getEarlyWall",
        new Operation(
            "getEarlyWall",
            "GET",
            "/early/wall",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getEnterpriseOrgByOrgIdContract",
        new Operation(
            "getEnterpriseOrgByOrgIdContract",
            "GET",
            "/enterprise/org/{orgId}/contract",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getEnterpriseOrgByOrgIdInvoices",
        new Operation(
            "getEnterpriseOrgByOrgIdInvoices",
            "GET",
            "/enterprise/org/{orgId}/invoices",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getEnterpriseOrgByOrgIdOnboarding",
        new Operation(
            "getEnterpriseOrgByOrgIdOnboarding",
            "GET",
            "/enterprise/org/{orgId}/onboarding",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getEnterpriseOrgByOrgIdSpend",
        new Operation(
            "getEnterpriseOrgByOrgIdSpend",
            "GET",
            "/enterprise/org/{orgId}/spend",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getEnterpriseOrgByOrgIdUsage",
        new Operation(
            "getEnterpriseOrgByOrgIdUsage",
            "GET",
            "/enterprise/org/{orgId}/usage",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getEnterpriseOrgByOrgIdUsageHistory",
        new Operation(
            "getEnterpriseOrgByOrgIdUsageHistory",
            "GET",
            "/enterprise/org/{orgId}/usage/history",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[] {"days"},
            new String[0],
            new String[0]));
    out.put(
        "getEnterpriseOrgByOrgIdUsageProjects",
        new Operation(
            "getEnterpriseOrgByOrgIdUsageProjects",
            "GET",
            "/enterprise/org/{orgId}/usage/projects",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getEnterprisePricing",
        new Operation(
            "getEnterprisePricing",
            "GET",
            "/enterprise/pricing",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getEnterpriseQuotesByQuoteId",
        new Operation(
            "getEnterpriseQuotesByQuoteId",
            "GET",
            "/enterprise/quotes/{quoteId}",
            null,
            "json",
            false,
            new String[] {"quoteId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getEntitlementsOrgByOrgId",
        new Operation(
            "getEntitlementsOrgByOrgId",
            "GET",
            "/entitlements/org/{orgId}",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getFunctionsByFunctionId",
        new Operation(
            "getFunctionsByFunctionId",
            "GET",
            "/functions/{functionId}",
            null,
            "json",
            false,
            new String[] {"functionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getFunctionsByFunctionIdDeployStatus",
        new Operation(
            "getFunctionsByFunctionIdDeployStatus",
            "GET",
            "/functions/{functionId}/deploy-status",
            null,
            "json",
            false,
            new String[] {"functionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getFunctionsByFunctionIdInvocations",
        new Operation(
            "getFunctionsByFunctionIdInvocations",
            "GET",
            "/functions/{functionId}/invocations",
            null,
            "json",
            false,
            new String[] {"functionId"},
            new String[] {"limit", "offset"},
            new String[0],
            new String[0]));
    out.put(
        "getFunctionsByFunctionIdLogs",
        new Operation(
            "getFunctionsByFunctionIdLogs",
            "GET",
            "/functions/{functionId}/logs",
            null,
            "json",
            false,
            new String[] {"functionId"},
            new String[] {"limit", "status", "since", "until", "executionId", "level", "q", "before"},
            new String[0],
            new String[0]));
    out.put(
        "getFunctionsByFunctionIdMetrics",
        new Operation(
            "getFunctionsByFunctionIdMetrics",
            "GET",
            "/functions/{functionId}/metrics",
            null,
            "json",
            false,
            new String[] {"functionId"},
            new String[] {"period"},
            new String[0],
            new String[0]));
    out.put(
        "getFunctionsByFunctionIdSchedule",
        new Operation(
            "getFunctionsByFunctionIdSchedule",
            "GET",
            "/functions/{functionId}/schedule",
            null,
            "json",
            false,
            new String[] {"functionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getFunctionsByFunctionIdTriggers",
        new Operation(
            "getFunctionsByFunctionIdTriggers",
            "GET",
            "/functions/{functionId}/triggers",
            null,
            "json",
            false,
            new String[] {"functionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getFunctionsInvocations",
        new Operation(
            "getFunctionsInvocations",
            "GET",
            "/functions/invocations",
            null,
            "json",
            false,
            new String[0],
            new String[] {"functionId", "projectId", "envId", "status", "since", "until", "limit", "offset"},
            new String[0],
            new String[0]));
    out.put(
        "getFunctionsInvocationsFunctionByFunctionId",
        new Operation(
            "getFunctionsInvocationsFunctionByFunctionId",
            "GET",
            "/functions/invocations/function/{functionId}",
            null,
            "json",
            false,
            new String[] {"functionId"},
            new String[] {"limit"},
            new String[0],
            new String[0]));
    out.put(
        "getFunctionsProjectByProjectId",
        new Operation(
            "getFunctionsProjectByProjectId",
            "GET",
            "/functions/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"envId", "enabled"},
            new String[0],
            new String[0]));
    out.put(
        "getFunctionsProjectByProjectIdNameByFunctionName",
        new Operation(
            "getFunctionsProjectByProjectIdNameByFunctionName",
            "GET",
            "/functions/project/{projectId}/name/{functionName}",
            null,
            "json",
            false,
            new String[] {"projectId", "functionName"},
            new String[] {"envId"},
            new String[0],
            new String[0]));
    out.put(
        "getFunctionsProjectByProjectIdSummary",
        new Operation(
            "getFunctionsProjectByProjectIdSummary",
            "GET",
            "/functions/project/{projectId}/summary",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"envId", "period"},
            new String[0],
            new String[0]));
    out.put(
        "getFunctionsSchedulePreview",
        new Operation(
            "getFunctionsSchedulePreview",
            "GET",
            "/functions/schedule/preview",
            null,
            "json",
            false,
            new String[0],
            new String[] {"cron"},
            new String[0],
            new String[0]));
    out.put(
        "getFunctionsSecretsProjectByProjectId",
        new Operation(
            "getFunctionsSecretsProjectByProjectId",
            "GET",
            "/functions/secrets/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"envId"},
            new String[0],
            new String[0]));
    out.put(
        "getGeneratedByTable",
        new Operation(
            "getGeneratedByTable",
            "GET",
            "/generated/{table}",
            null,
            "json",
            false,
            new String[] {"table"},
            new String[] {"where", "filter", "whereField", "whereValue", "limit", "offset", "select", "orderBy", "orderDir", "order_by", "order_dir", "include", "filter[or]"},
            new String[0],
            new String[] {"filter", "filter[or]"}));
    out.put(
        "getGeneratedByTableAggregate",
        new Operation(
            "getGeneratedByTableAggregate",
            "GET",
            "/generated/{table}/aggregate",
            null,
            "json",
            false,
            new String[] {"table"},
            new String[] {"fn", "column", "group_by", "where", "filter", "whereField", "whereValue"},
            new String[] {"fn"},
            new String[] {"filter"}));
    out.put(
        "getGeneratedByTableById",
        new Operation(
            "getGeneratedByTableById",
            "GET",
            "/generated/{table}/{id}",
            null,
            "json",
            false,
            new String[] {"table", "id"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getGeneratedByTableSearch",
        new Operation(
            "getGeneratedByTableSearch",
            "GET",
            "/generated/{table}/search",
            null,
            "json",
            false,
            new String[] {"table"},
            new String[] {"q", "fields", "limit", "offset"},
            new String[] {"q"},
            new String[0]));
    out.put(
        "getGithubOauthAuthorize",
        new Operation(
            "getGithubOauthAuthorize",
            "GET",
            "/github/oauth/authorize",
            null,
            "json",
            false,
            new String[0],
            new String[] {"projectId"},
            new String[0],
            new String[0]));
  }

  private static void definitions2(Map<String, Operation> out) {
    out.put(
        "getIncidentsProjectByProjectId",
        new Operation(
            "getIncidentsProjectByProjectId",
            "GET",
            "/incidents/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"status", "since"},
            new String[0],
            new String[0]));
    out.put(
        "getInfrastructureSizes",
        new Operation(
            "getInfrastructureSizes",
            "GET",
            "/infrastructure/sizes",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getIntegrationsAnalyticsProjectByProjectIdEvents",
        new Operation(
            "getIntegrationsAnalyticsProjectByProjectIdEvents",
            "GET",
            "/integrations/analytics/project/{projectId}/events",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getIntegrationsAnalyticsProjectByProjectIdStats",
        new Operation(
            "getIntegrationsAnalyticsProjectByProjectIdStats",
            "GET",
            "/integrations/analytics/project/{projectId}/stats",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getIntegrationsDeliveriesEventByEventId",
        new Operation(
            "getIntegrationsDeliveriesEventByEventId",
            "GET",
            "/integrations/deliveries/event/{eventId}",
            null,
            "json",
            false,
            new String[] {"eventId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getIntegrationsDeliveriesProjectByProjectId",
        new Operation(
            "getIntegrationsDeliveriesProjectByProjectId",
            "GET",
            "/integrations/deliveries/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"status", "subscriptionId", "type", "q", "since", "until", "limit", "offset", "envId"},
            new String[0],
            new String[0]));
    out.put(
        "getIntegrationsDeliveriesProjectByProjectIdSummary",
        new Operation(
            "getIntegrationsDeliveriesProjectByProjectIdSummary",
            "GET",
            "/integrations/deliveries/project/{projectId}/summary",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"envId"},
            new String[0],
            new String[0]));
    out.put(
        "getIntegrationsDeliveriesSubscriptionBySubscriptionId",
        new Operation(
            "getIntegrationsDeliveriesSubscriptionBySubscriptionId",
            "GET",
            "/integrations/deliveries/subscription/{subscriptionId}",
            null,
            "json",
            false,
            new String[] {"subscriptionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getIntegrationsDlqProjectByProjectId",
        new Operation(
            "getIntegrationsDlqProjectByProjectId",
            "GET",
            "/integrations/dlq/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getIntegrationsEvents",
        new Operation(
            "getIntegrationsEvents",
            "GET",
            "/integrations/events",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getIntegrationsSubscriptionsProjectByProjectId",
        new Operation(
            "getIntegrationsSubscriptionsProjectByProjectId",
            "GET",
            "/integrations/subscriptions/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getJobsDlqProjectByProjectId",
        new Operation(
            "getJobsDlqProjectByProjectId",
            "GET",
            "/jobs/dlq/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getJobsWebhooksDeliveryByDeliveryId",
        new Operation(
            "getJobsWebhooksDeliveryByDeliveryId",
            "GET",
            "/jobs/webhooks/delivery/{deliveryId}",
            null,
            "json",
            false,
            new String[] {"deliveryId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getJobsWebhooksProjectByProjectId",
        new Operation(
            "getJobsWebhooksProjectByProjectId",
            "GET",
            "/jobs/webhooks/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getLogsProjectByProjectId",
        new Operation(
            "getLogsProjectByProjectId",
            "GET",
            "/logs/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"limit", "level"},
            new String[0],
            new String[0]));
    out.put(
        "getLogsProjectByProjectIdFeed",
        new Operation(
            "getLogsProjectByProjectIdFeed",
            "GET",
            "/logs/project/{projectId}/feed",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"envId", "since", "until", "level", "source", "q", "request", "before", "after", "limit"},
            new String[0],
            new String[0]));
    out.put(
        "getMaintenance",
        new Operation(
            "getMaintenance",
            "GET",
            "/maintenance",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getMcpConnections",
        new Operation(
            "getMcpConnections",
            "GET",
            "/mcp/connections",
            null,
            "json",
            false,
            new String[0],
            new String[] {"status"},
            new String[0],
            new String[0]));
    out.put(
        "getMcpOauthRequestsByRequestId",
        new Operation(
            "getMcpOauthRequestsByRequestId",
            "GET",
            "/mcp/oauth/requests/{requestId}",
            null,
            "json",
            false,
            new String[] {"requestId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getMcpSession",
        new Operation(
            "getMcpSession",
            "GET",
            "/mcp/session",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getMeBadges",
        new Operation(
            "getMeBadges",
            "GET",
            "/me/badges",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getMeCreator",
        new Operation(
            "getMeCreator",
            "GET",
            "/me/creator",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getMetricsOrgByOrgId",
        new Operation(
            "getMetricsOrgByOrgId",
            "GET",
            "/metrics/org/{orgId}",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[] {"range", "env"},
            new String[0],
            new String[0]));
    out.put(
        "getMetricsProjectByProjectId",
        new Operation(
            "getMetricsProjectByProjectId",
            "GET",
            "/metrics/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"range", "env"},
            new String[0],
            new String[0]));
    out.put(
        "getMetricsProjectByProjectIdOverview",
        new Operation(
            "getMetricsProjectByProjectIdOverview",
            "GET",
            "/metrics/project/{projectId}/overview",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getMetricsProjectByProjectIdReport",
        new Operation(
            "getMetricsProjectByProjectIdReport",
            "GET",
            "/metrics/project/{projectId}/report",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"envId", "period"},
            new String[0],
            new String[0]));
    out.put(
        "getMongodbByCollectionEstimatedCount",
        new Operation(
            "getMongodbByCollectionEstimatedCount",
            "GET",
            "/mongodb/{collection}/estimatedCount",
            null,
            "json",
            false,
            new String[] {"collection"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getMongodbByCollectionFindByIdById",
        new Operation(
            "getMongodbByCollectionFindByIdById",
            "GET",
            "/mongodb/{collection}/findById/{id}",
            null,
            "json",
            false,
            new String[] {"collection", "id"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getMongodbByCollectionIndexes",
        new Operation(
            "getMongodbByCollectionIndexes",
            "GET",
            "/mongodb/{collection}/indexes",
            null,
            "json",
            false,
            new String[] {"collection"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getMongodbCollections",
        new Operation(
            "getMongodbCollections",
            "GET",
            "/mongodb/collections",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getOauthOrgByOrgId",
        new Operation(
            "getOauthOrgByOrgId",
            "GET",
            "/oauth/org/{orgId}",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getOauthOrgByOrgIdProviderByProviderAuthorize",
        new Operation(
            "getOauthOrgByOrgIdProviderByProviderAuthorize",
            "GET",
            "/oauth/org/{orgId}/provider/{provider}/authorize",
            null,
            "json",
            false,
            new String[] {"orgId", "provider"},
            new String[] {"scopes"},
            new String[0],
            new String[0]));
    out.put(
        "getOnboardingOrgByOrgId",
        new Operation(
            "getOnboardingOrgByOrgId",
            "GET",
            "/onboarding/org/{orgId}",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getOpenapiProjectByProjectId",
        new Operation(
            "getOpenapiProjectByProjectId",
            "GET",
            "/openapi/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"envId"},
            new String[0],
            new String[0]));
    out.put(
        "getOpenapiYaml",
        new Operation(
            "getOpenapiYaml",
            "GET",
            "/openapi.yaml",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getOrgs",
        new Operation(
            "getOrgs",
            "GET",
            "/orgs",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getOrgsByOrgIdAccessMatrix",
        new Operation(
            "getOrgsByOrgIdAccessMatrix",
            "GET",
            "/orgs/{orgId}/access-matrix",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[] {"q", "orgRole", "withoutMfa", "cursor", "limit"},
            new String[0],
            new String[0]));
    out.put(
        "getOrgsByOrgIdBlueprintDefaults",
        new Operation(
            "getOrgsByOrgIdBlueprintDefaults",
            "GET",
            "/orgs/{orgId}/blueprint-defaults",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getOrgsByOrgIdChangeRequests",
        new Operation(
            "getOrgsByOrgIdChangeRequests",
            "GET",
            "/orgs/{orgId}/change-requests",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[] {"limit"},
            new String[0],
            new String[0]));
    out.put(
        "getOrgsByOrgIdDataRegion",
        new Operation(
            "getOrgsByOrgIdDataRegion",
            "GET",
            "/orgs/{orgId}/data-region",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getOrgsByOrgIdIdentitySummary",
        new Operation(
            "getOrgsByOrgIdIdentitySummary",
            "GET",
            "/orgs/{orgId}/identity/summary",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getOrgsByOrgIdInvites",
        new Operation(
            "getOrgsByOrgIdInvites",
            "GET",
            "/orgs/{orgId}/invites",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getOrgsByOrgIdLeaveRequests",
        new Operation(
            "getOrgsByOrgIdLeaveRequests",
            "GET",
            "/orgs/{orgId}/leave-requests",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getOrgsByOrgIdLeaveRequestsMine",
        new Operation(
            "getOrgsByOrgIdLeaveRequestsMine",
            "GET",
            "/orgs/{orgId}/leave-requests/mine",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getOrgsByOrgIdManagedDomains",
        new Operation(
            "getOrgsByOrgIdManagedDomains",
            "GET",
            "/orgs/{orgId}/managed-domains",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getOrgsByOrgIdManagedSummary",
        new Operation(
            "getOrgsByOrgIdManagedSummary",
            "GET",
            "/orgs/{orgId}/managed-summary",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[] {"limit"},
            new String[0],
            new String[0]));
    out.put(
        "getOrgsByOrgIdMembers",
        new Operation(
            "getOrgsByOrgIdMembers",
            "GET",
            "/orgs/{orgId}/members",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getOrgsByOrgIdMembership",
        new Operation(
            "getOrgsByOrgIdMembership",
            "GET",
            "/orgs/{orgId}/membership",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getOrgsByOrgIdProfile",
        new Operation(
            "getOrgsByOrgIdProfile",
            "GET",
            "/orgs/{orgId}/profile",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getOrgsByOrgIdRoles",
        new Operation(
            "getOrgsByOrgIdRoles",
            "GET",
            "/orgs/{orgId}/roles",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getOrgsByOrgIdSecurity",
        new Operation(
            "getOrgsByOrgIdSecurity",
            "GET",
            "/orgs/{orgId}/security",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getOrgsByOrgIdSecurityPosture",
        new Operation(
            "getOrgsByOrgIdSecurityPosture",
            "GET",
            "/orgs/{orgId}/security/posture",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getOrgsByOrgIdSupportSlaReport",
        new Operation(
            "getOrgsByOrgIdSupportSlaReport",
            "GET",
            "/orgs/{orgId}/support/sla-report",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[] {"month", "format"},
            new String[0],
            new String[0]));
    out.put(
        "getOrgsByOrgIdSupportSummary",
        new Operation(
            "getOrgsByOrgIdSupportSummary",
            "GET",
            "/orgs/{orgId}/support/summary",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getOrgsByOrgIdSupportTerms",
        new Operation(
            "getOrgsByOrgIdSupportTerms",
            "GET",
            "/orgs/{orgId}/support/terms",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getOrgsByOrgIdSupportTickets",
        new Operation(
            "getOrgsByOrgIdSupportTickets",
            "GET",
            "/orgs/{orgId}/support/tickets",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[] {"status", "priority", "cursor"},
            new String[0],
            new String[0]));
    out.put(
        "getOrgsByOrgIdSupportTicketsByNumber",
        new Operation(
            "getOrgsByOrgIdSupportTicketsByNumber",
            "GET",
            "/orgs/{orgId}/support/tickets/{number}",
            null,
            "json",
            false,
            new String[] {"orgId", "number"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getOrgsByOrgIdTransfers",
        new Operation(
            "getOrgsByOrgIdTransfers",
            "GET",
            "/orgs/{orgId}/transfers",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getOrgsInvitesLookup",
        new Operation(
            "getOrgsInvitesLookup",
            "GET",
            "/orgs/invites/lookup",
            null,
            "json",
            false,
            new String[0],
            new String[] {"token"},
            new String[0],
            new String[0]));
    out.put(
        "getOrgsTransfersPreview",
        new Operation(
            "getOrgsTransfersPreview",
            "GET",
            "/orgs/transfers/preview",
            null,
            "json",
            false,
            new String[0],
            new String[] {"token"},
            new String[0],
            new String[0]));
    out.put(
        "getPlansByPlanId",
        new Operation(
            "getPlansByPlanId",
            "GET",
            "/plans/{planId}",
            null,
            "json",
            false,
            new String[] {"planId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getPlansOrgByOrgId",
        new Operation(
            "getPlansOrgByOrgId",
            "GET",
            "/plans/org/{orgId}",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getPricingAiFeatures",
        new Operation(
            "getPricingAiFeatures",
            "GET",
            "/pricing/ai-features",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getPricingCompare",
        new Operation(
            "getPricingCompare",
            "GET",
            "/pricing/compare",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getPricingEnterprise",
        new Operation(
            "getPricingEnterprise",
            "GET",
            "/pricing/enterprise",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getPricingPlans",
        new Operation(
            "getPricingPlans",
            "GET",
            "/pricing/plans",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getPricingPlansByPlan",
        new Operation(
            "getPricingPlansByPlan",
            "GET",
            "/pricing/plans/{plan}",
            null,
            "json",
            false,
            new String[] {"plan"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjects",
        new Operation(
            "getProjects",
            "GET",
            "/projects",
            null,
            "json",
            false,
            new String[0],
            new String[] {"orgId"},
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByIdInsights",
        new Operation(
            "getProjectsByIdInsights",
            "GET",
            "/projects/{id}/insights",
            null,
            "json",
            false,
            new String[] {"id"},
            new String[] {"refresh"},
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectId",
        new Operation(
            "getProjectsByProjectId",
            "GET",
            "/projects/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdApiKeys",
        new Operation(
            "getProjectsByProjectIdApiKeys",
            "GET",
            "/projects/{projectId}/api-keys",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdAuthActivity",
        new Operation(
            "getProjectsByProjectIdAuthActivity",
            "GET",
            "/projects/{projectId}/auth/activity",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"userId", "action", "limit", "offset"},
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdAuthMe",
        new Operation(
            "getProjectsByProjectIdAuthMe",
            "GET",
            "/projects/{projectId}/auth/me",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdAuthOauthApps",
        new Operation(
            "getProjectsByProjectIdAuthOauthApps",
            "GET",
            "/projects/{projectId}/auth/oauth-apps",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdAuthOauthProviders",
        new Operation(
            "getProjectsByProjectIdAuthOauthProviders",
            "GET",
            "/projects/{projectId}/auth/oauth/providers",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdAuthSessions",
        new Operation(
            "getProjectsByProjectIdAuthSessions",
            "GET",
            "/projects/{projectId}/auth/sessions",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdAuthSettings",
        new Operation(
            "getProjectsByProjectIdAuthSettings",
            "GET",
            "/projects/{projectId}/auth/settings",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdBranches",
        new Operation(
            "getProjectsByProjectIdBranches",
            "GET",
            "/projects/{projectId}/branches",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdBranchesByBranchNameUrl",
        new Operation(
            "getProjectsByProjectIdBranchesByBranchNameUrl",
            "GET",
            "/projects/{projectId}/branches/{branchName}/url",
            null,
            "json",
            false,
            new String[] {"projectId", "branchName"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdDatabaseDedicated",
        new Operation(
            "getProjectsByProjectIdDatabaseDedicated",
            "GET",
            "/projects/{projectId}/database/dedicated",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdDatabaseDedicatedConnection",
        new Operation(
            "getProjectsByProjectIdDatabaseDedicatedConnection",
            "GET",
            "/projects/{projectId}/database/dedicated/connection",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdDatabaseDedicatedStatus",
        new Operation(
            "getProjectsByProjectIdDatabaseDedicatedStatus",
            "GET",
            "/projects/{projectId}/database/dedicated/status",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdDeletionPreview",
        new Operation(
            "getProjectsByProjectIdDeletionPreview",
            "GET",
            "/projects/{projectId}/deletion-preview",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdEnvVars",
        new Operation(
            "getProjectsByProjectIdEnvVars",
            "GET",
            "/projects/{projectId}/env-vars",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"envId"},
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdEnvironments",
        new Operation(
            "getProjectsByProjectIdEnvironments",
            "GET",
            "/projects/{projectId}/environments",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdEnvironmentsByEnvIdDomainStatus",
        new Operation(
            "getProjectsByProjectIdEnvironmentsByEnvIdDomainStatus",
            "GET",
            "/projects/{projectId}/environments/{envId}/domain-status",
            null,
            "json",
            false,
            new String[] {"projectId", "envId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdEnvironmentsByEnvIdDomainVerification",
        new Operation(
            "getProjectsByProjectIdEnvironmentsByEnvIdDomainVerification",
            "GET",
            "/projects/{projectId}/environments/{envId}/domain-verification",
            null,
            "json",
            false,
            new String[] {"projectId", "envId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdEnvironmentsByEnvIdDomains",
        new Operation(
            "getProjectsByProjectIdEnvironmentsByEnvIdDomains",
            "GET",
            "/projects/{projectId}/environments/{envId}/domains",
            null,
            "json",
            false,
            new String[] {"projectId", "envId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdEnvironmentsPromotionOrder",
        new Operation(
            "getProjectsByProjectIdEnvironmentsPromotionOrder",
            "GET",
            "/projects/{projectId}/environments/promotion-order",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdFrontend",
        new Operation(
            "getProjectsByProjectIdFrontend",
            "GET",
            "/projects/{projectId}/frontend",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdGettingStarted",
        new Operation(
            "getProjectsByProjectIdGettingStarted",
            "GET",
            "/projects/{projectId}/getting-started",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdGithubBranches",
        new Operation(
            "getProjectsByProjectIdGithubBranches",
            "GET",
            "/projects/{projectId}/github/branches",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"repo"},
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdGithubRepos",
        new Operation(
            "getProjectsByProjectIdGithubRepos",
            "GET",
            "/projects/{projectId}/github/repos",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdGithubStatus",
        new Operation(
            "getProjectsByProjectIdGithubStatus",
            "GET",
            "/projects/{projectId}/github/status",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdGithubTrackedRepos",
        new Operation(
            "getProjectsByProjectIdGithubTrackedRepos",
            "GET",
            "/projects/{projectId}/github/tracked-repos",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdInfrastructure",
        new Operation(
            "getProjectsByProjectIdInfrastructure",
            "GET",
            "/projects/{projectId}/infrastructure",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdInfrastructureByInstanceIdMetrics",
        new Operation(
            "getProjectsByProjectIdInfrastructureByInstanceIdMetrics",
            "GET",
            "/projects/{projectId}/infrastructure/{instanceId}/metrics",
            null,
            "json",
            false,
            new String[] {"projectId", "instanceId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdInfrastructureByInstanceIdReplicas",
        new Operation(
            "getProjectsByProjectIdInfrastructureByInstanceIdReplicas",
            "GET",
            "/projects/{projectId}/infrastructure/{instanceId}/replicas",
            null,
            "json",
            false,
            new String[] {"projectId", "instanceId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdInfrastructureByInstanceIdUpgradeOptions",
        new Operation(
            "getProjectsByProjectIdInfrastructureByInstanceIdUpgradeOptions",
            "GET",
            "/projects/{projectId}/infrastructure/{instanceId}/upgrade-options",
            null,
            "json",
            false,
            new String[] {"projectId", "instanceId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdInfrastructureMigrationProgress",
        new Operation(
            "getProjectsByProjectIdInfrastructureMigrationProgress",
            "GET",
            "/projects/{projectId}/infrastructure/migration/progress",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
  }

  private static void definitions3(Map<String, Operation> out) {
    out.put(
        "getProjectsByProjectIdInfrastructureMigrationStatus",
        new Operation(
            "getProjectsByProjectIdInfrastructureMigrationStatus",
            "GET",
            "/projects/{projectId}/infrastructure/migration-status",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdInfrastructureRestores",
        new Operation(
            "getProjectsByProjectIdInfrastructureRestores",
            "GET",
            "/projects/{projectId}/infrastructure/restores",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdMembers",
        new Operation(
            "getProjectsByProjectIdMembers",
            "GET",
            "/projects/{projectId}/members",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdPromotions",
        new Operation(
            "getProjectsByProjectIdPromotions",
            "GET",
            "/projects/{projectId}/promotions",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdPromotionsDiff",
        new Operation(
            "getProjectsByProjectIdPromotionsDiff",
            "GET",
            "/projects/{projectId}/promotions/diff",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"from", "to"},
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdRegion",
        new Operation(
            "getProjectsByProjectIdRegion",
            "GET",
            "/projects/{projectId}/region",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdSecurityAdvisor",
        new Operation(
            "getProjectsByProjectIdSecurityAdvisor",
            "GET",
            "/projects/{projectId}/security/advisor",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"envId"},
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdSettings",
        new Operation(
            "getProjectsByProjectIdSettings",
            "GET",
            "/projects/{projectId}/settings",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdSettingsAddons",
        new Operation(
            "getProjectsByProjectIdSettingsAddons",
            "GET",
            "/projects/{projectId}/settings/addons",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdSettingsApi",
        new Operation(
            "getProjectsByProjectIdSettingsApi",
            "GET",
            "/projects/{projectId}/settings/api",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdSettingsCompute",
        new Operation(
            "getProjectsByProjectIdSettingsCompute",
            "GET",
            "/projects/{projectId}/settings/compute",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdSettingsJwt",
        new Operation(
            "getProjectsByProjectIdSettingsJwt",
            "GET",
            "/projects/{projectId}/settings/jwt",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdStorageSettings",
        new Operation(
            "getProjectsByProjectIdStorageSettings",
            "GET",
            "/projects/{projectId}/storage/settings",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdUsers",
        new Operation(
            "getProjectsByProjectIdUsers",
            "GET",
            "/projects/{projectId}/users",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdUsersByUserId",
        new Operation(
            "getProjectsByProjectIdUsersByUserId",
            "GET",
            "/projects/{projectId}/users/{userId}",
            null,
            "json",
            false,
            new String[] {"projectId", "userId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdUsersByUserIdSessions",
        new Operation(
            "getProjectsByProjectIdUsersByUserIdSessions",
            "GET",
            "/projects/{projectId}/users/{userId}/sessions",
            null,
            "json",
            false,
            new String[] {"projectId", "userId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsByProjectIdUsersStats",
        new Operation(
            "getProjectsByProjectIdUsersStats",
            "GET",
            "/projects/{projectId}/users/stats",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getProjectsSlugAvailable",
        new Operation(
            "getProjectsSlugAvailable",
            "GET",
            "/projects/slug-available",
            null,
            "json",
            false,
            new String[0],
            new String[] {"orgId", "slug"},
            new String[] {"orgId", "slug"},
            new String[0]));
    out.put(
        "getQuickstartProjectByProjectId",
        new Operation(
            "getQuickstartProjectByProjectId",
            "GET",
            "/quickstart/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"platform", "env"},
            new String[0],
            new String[0]));
    out.put(
        "getQuickstartProjectByProjectIdJson",
        new Operation(
            "getQuickstartProjectByProjectIdJson",
            "GET",
            "/quickstart/project/{projectId}/json",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"platform", "env"},
            new String[0],
            new String[0]));
    out.put(
        "getRealtimeConnectionsProjectByProjectId",
        new Operation(
            "getRealtimeConnectionsProjectByProjectId",
            "GET",
            "/realtime/connections/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getRealtimeEventsProjectByProjectId",
        new Operation(
            "getRealtimeEventsProjectByProjectId",
            "GET",
            "/realtime/events/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"source", "level", "table", "type", "q"},
            new String[0],
            new String[0]));
    out.put(
        "getRealtimeStatsProjectByProjectId",
        new Operation(
            "getRealtimeStatsProjectByProjectId",
            "GET",
            "/realtime/stats/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getRealtimeStatusProjectByProjectId",
        new Operation(
            "getRealtimeStatusProjectByProjectId",
            "GET",
            "/realtime/status/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"envId"},
            new String[0],
            new String[0]));
    out.put(
        "getRealtimeSubscriptionsProjectByProjectId",
        new Operation(
            "getRealtimeSubscriptionsProjectByProjectId",
            "GET",
            "/realtime/subscriptions/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getRefundsById",
        new Operation(
            "getRefundsById",
            "GET",
            "/refunds/{id}",
            null,
            "json",
            false,
            new String[] {"id"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getRefundsOrgByOrgId",
        new Operation(
            "getRefundsOrgByOrgId",
            "GET",
            "/refunds/org/{orgId}",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getRegions",
        new Operation(
            "getRegions",
            "GET",
            "/regions",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getRegionsAll",
        new Operation(
            "getRegionsAll",
            "GET",
            "/regions/all",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getRegionsByKey",
        new Operation(
            "getRegionsByKey",
            "GET",
            "/regions/{key}",
            null,
            "json",
            false,
            new String[] {"key"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getRegionsByKeyMetrics",
        new Operation(
            "getRegionsByKeyMetrics",
            "GET",
            "/regions/{key}/metrics",
            null,
            "json",
            false,
            new String[] {"key"},
            new String[] {"hours"},
            new String[0],
            new String[0]));
    out.put(
        "getRegionsHealth",
        new Operation(
            "getRegionsHealth",
            "GET",
            "/regions/health",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getRlsPoliciesByProjectId",
        new Operation(
            "getRlsPoliciesByProjectId",
            "GET",
            "/rls/policies/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getSchemaEngineByProjectIdChanges",
        new Operation(
            "getSchemaEngineByProjectIdChanges",
            "GET",
            "/schema-engine/{projectId}/changes",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"limit"},
            new String[0],
            new String[0]));
    out.put(
        "getSchemaEngineEditorSessionsByProjectIdCapabilities",
        new Operation(
            "getSchemaEngineEditorSessionsByProjectIdCapabilities",
            "GET",
            "/schema-engine/editor-sessions/{projectId}/capabilities",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getSchemaEngineIntrospectByProjectId",
        new Operation(
            "getSchemaEngineIntrospectByProjectId",
            "GET",
            "/schema-engine/introspect/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"envId"},
            new String[0],
            new String[0]));
    out.put(
        "getSchemaEngineMigrationsByProjectIdByMigrationIdDiff",
        new Operation(
            "getSchemaEngineMigrationsByProjectIdByMigrationIdDiff",
            "GET",
            "/schema-engine/migrations/{projectId}/{migrationId}/diff",
            null,
            "json",
            false,
            new String[] {"projectId", "migrationId"},
            new String[] {"envId"},
            new String[0],
            new String[0]));
    out.put(
        "getSchemaEngineMigrationsProjectByProjectId",
        new Operation(
            "getSchemaEngineMigrationsProjectByProjectId",
            "GET",
            "/schema-engine/migrations/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"envId", "limit", "offset"},
            new String[0],
            new String[0]));
    out.put(
        "getSchemaEngineSnapshotsProjectByProjectId",
        new Operation(
            "getSchemaEngineSnapshotsProjectByProjectId",
            "GET",
            "/schema-engine/snapshots/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"limit"},
            new String[0],
            new String[0]));
    out.put(
        "getSchemaEngineSnippetsByProjectId",
        new Operation(
            "getSchemaEngineSnippetsByProjectId",
            "GET",
            "/schema-engine/snippets/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getSchemasProjectByProjectId",
        new Operation(
            "getSchemasProjectByProjectId",
            "GET",
            "/schemas/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getSecurityAuditByProjectId",
        new Operation(
            "getSecurityAuditByProjectId",
            "GET",
            "/security/audit/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"limit", "offset"},
            new String[0],
            new String[0]));
    out.put(
        "getSecurityOverviewByProjectId",
        new Operation(
            "getSecurityOverviewByProjectId",
            "GET",
            "/security/overview/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getSecurityVariablesProjectByProjectId",
        new Operation(
            "getSecurityVariablesProjectByProjectId",
            "GET",
            "/security/variables/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"envId"},
            new String[0],
            new String[0]));
    out.put(
        "getServicesByServiceId",
        new Operation(
            "getServicesByServiceId",
            "GET",
            "/services/{serviceId}",
            null,
            "json",
            false,
            new String[] {"serviceId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getServicesByServiceIdDeploymentsByDeploymentIdBuildLogs",
        new Operation(
            "getServicesByServiceIdDeploymentsByDeploymentIdBuildLogs",
            "GET",
            "/services/{serviceId}/deployments/{deploymentId}/build-logs",
            null,
            "json",
            false,
            new String[] {"serviceId", "deploymentId"},
            new String[] {"limit"},
            new String[0],
            new String[0]));
    out.put(
        "getServicesByServiceIdDeploymentsByDeploymentIdStatus",
        new Operation(
            "getServicesByServiceIdDeploymentsByDeploymentIdStatus",
            "GET",
            "/services/{serviceId}/deployments/{deploymentId}/status",
            null,
            "json",
            false,
            new String[] {"serviceId", "deploymentId"},
            new String[] {"projectId", "env"},
            new String[0],
            new String[0]));
    out.put(
        "getServicesByServiceIdDomains",
        new Operation(
            "getServicesByServiceIdDomains",
            "GET",
            "/services/{serviceId}/domains",
            null,
            "json",
            false,
            new String[] {"serviceId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getServicesByServiceIdGitConnect",
        new Operation(
            "getServicesByServiceIdGitConnect",
            "GET",
            "/services/{serviceId}/git/connect",
            null,
            "json",
            false,
            new String[] {"serviceId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getServicesByServiceIdLogs",
        new Operation(
            "getServicesByServiceIdLogs",
            "GET",
            "/services/{serviceId}/logs",
            null,
            "json",
            false,
            new String[] {"serviceId"},
            new String[] {"limit"},
            new String[0],
            new String[0]));
    out.put(
        "getServicesByServiceIdStatus",
        new Operation(
            "getServicesByServiceIdStatus",
            "GET",
            "/services/{serviceId}/status",
            null,
            "json",
            false,
            new String[] {"serviceId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getServicesProjectByProjectId",
        new Operation(
            "getServicesProjectByProjectId",
            "GET",
            "/services/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getServicesProjectByProjectIdSummary",
        new Operation(
            "getServicesProjectByProjectIdSummary",
            "GET",
            "/services/project/{projectId}/summary",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"envId"},
            new String[0],
            new String[0]));
    out.put(
        "getSsoMePausedAccess",
        new Operation(
            "getSsoMePausedAccess",
            "GET",
            "/sso/me/paused-access",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getSsoOrgByOrgId",
        new Operation(
            "getSsoOrgByOrgId",
            "GET",
            "/sso/org/{orgId}",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getSsoOrgByOrgIdConnectionsByConnectionIdBreakGlass",
        new Operation(
            "getSsoOrgByOrgIdConnectionsByConnectionIdBreakGlass",
            "GET",
            "/sso/org/{orgId}/connections/{connectionId}/break-glass",
            null,
            "json",
            false,
            new String[] {"orgId", "connectionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getSsoOrgByOrgIdConnectionsByConnectionIdCertificates",
        new Operation(
            "getSsoOrgByOrgIdConnectionsByConnectionIdCertificates",
            "GET",
            "/sso/org/{orgId}/connections/{connectionId}/certificates",
            null,
            "json",
            false,
            new String[] {"orgId", "connectionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getSsoOrgByOrgIdConnectionsByConnectionIdGroupMappings",
        new Operation(
            "getSsoOrgByOrgIdConnectionsByConnectionIdGroupMappings",
            "GET",
            "/sso/org/{orgId}/connections/{connectionId}/group-mappings",
            null,
            "json",
            false,
            new String[] {"orgId", "connectionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getSsoOrgByOrgIdConnectionsByConnectionIdRequire",
        new Operation(
            "getSsoOrgByOrgIdConnectionsByConnectionIdRequire",
            "GET",
            "/sso/org/{orgId}/connections/{connectionId}/require",
            null,
            "json",
            false,
            new String[] {"orgId", "connectionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getSsoOrgByOrgIdConnectionsByConnectionIdScimReconciliation",
        new Operation(
            "getSsoOrgByOrgIdConnectionsByConnectionIdScimReconciliation",
            "GET",
            "/sso/org/{orgId}/connections/{connectionId}/scim/reconciliation",
            null,
            "json",
            false,
            new String[] {"orgId", "connectionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getSsoOrgByOrgIdConnectionsByConnectionIdScimTokens",
        new Operation(
            "getSsoOrgByOrgIdConnectionsByConnectionIdScimTokens",
            "GET",
            "/sso/org/{orgId}/connections/{connectionId}/scim/tokens",
            null,
            "json",
            false,
            new String[] {"orgId", "connectionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getSsoOrgByOrgIdOutsideMembers",
        new Operation(
            "getSsoOrgByOrgIdOutsideMembers",
            "GET",
            "/sso/org/{orgId}/outside-members",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getSsoOrgByOrgIdOutsideMembersBlocked",
        new Operation(
            "getSsoOrgByOrgIdOutsideMembersBlocked",
            "GET",
            "/sso/org/{orgId}/outside-members/blocked",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getSsoOrgByOrgIdSecurityContact",
        new Operation(
            "getSsoOrgByOrgIdSecurityContact",
            "GET",
            "/sso/org/{orgId}/security-contact",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getStatus",
        new Operation(
            "getStatus",
            "GET",
            "/status",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getStatusAtom",
        new Operation(
            "getStatusAtom",
            "GET",
            "/status/atom",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getStatusIncidents",
        new Operation(
            "getStatusIncidents",
            "GET",
            "/status/incidents",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getStatusRss",
        new Operation(
            "getStatusRss",
            "GET",
            "/status/rss",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getStatusSubscribersCount",
        new Operation(
            "getStatusSubscribersCount",
            "GET",
            "/status/subscribers/count",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getStatusUnsubscribeByToken",
        new Operation(
            "getStatusUnsubscribeByToken",
            "GET",
            "/status/unsubscribe/{token}",
            null,
            "json",
            false,
            new String[] {"token"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getStatusUptimeByComponentId",
        new Operation(
            "getStatusUptimeByComponentId",
            "GET",
            "/status/uptime/{componentId}",
            null,
            "json",
            false,
            new String[] {"componentId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getStorageBuckets",
        new Operation(
            "getStorageBuckets",
            "GET",
            "/storage/buckets",
            null,
            "json",
            false,
            new String[0],
            new String[] {"projectId", "envId", "limit", "offset"},
            new String[0],
            new String[0]));
    out.put(
        "getStorageBucketsByBucketIdPolicies",
        new Operation(
            "getStorageBucketsByBucketIdPolicies",
            "GET",
            "/storage/buckets/{bucketId}/policies",
            null,
            "json",
            false,
            new String[] {"bucketId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getStorageDownload",
        new Operation(
            "getStorageDownload",
            "GET",
            "/storage/download",
            null,
            "binary",
            false,
            new String[0],
            new String[] {"bucket", "key", "expiresIn"},
            new String[] {"key"},
            new String[0]));
    out.put(
        "getStorageFilesByBucketIdMetadata",
        new Operation(
            "getStorageFilesByBucketIdMetadata",
            "GET",
            "/storage/files/{bucketId}/metadata",
            null,
            "json",
            false,
            new String[] {"bucketId"},
            new String[] {"key"},
            new String[] {"key"},
            new String[0]));
    out.put(
        "getStorageMultipartListPending",
        new Operation(
            "getStorageMultipartListPending",
            "GET",
            "/storage/multipart/list-pending",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getStorageUsageProjectByProjectId",
        new Operation(
            "getStorageUsageProjectByProjectId",
            "GET",
            "/storage/usage/project/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"envId"},
            new String[0],
            new String[0]));
    out.put(
        "getTemplates",
        new Operation(
            "getTemplates",
            "GET",
            "/templates",
            null,
            "json",
            false,
            new String[0],
            new String[] {"visibility", "category", "orgId"},
            new String[0],
            new String[0]));
    out.put(
        "getTemplatesBySlug",
        new Operation(
            "getTemplatesBySlug",
            "GET",
            "/templates/{slug}",
            null,
            "json",
            false,
            new String[] {"slug"},
            new String[] {"orgId", "visibility"},
            new String[0],
            new String[0]));
    out.put(
        "getTemplatesInstalls",
        new Operation(
            "getTemplatesInstalls",
            "GET",
            "/templates/installs",
            null,
            "json",
            false,
            new String[0],
            new String[] {"projectId", "envId"},
            new String[] {"projectId"},
            new String[0]));
    out.put(
        "getTenantBranding",
        new Operation(
            "getTenantBranding",
            "GET",
            "/tenant/branding",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getUsersMe",
        new Operation(
            "getUsersMe",
            "GET",
            "/users/me",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getUsersMePreferences",
        new Operation(
            "getUsersMePreferences",
            "GET",
            "/users/me/preferences",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getV1DataByProjectIdByTable",
        new Operation(
            "getV1DataByProjectIdByTable",
            "GET",
            "/v1/data/{projectId}/{table}",
            null,
            "json",
            false,
            new String[] {"projectId", "table"},
            new String[] {"where", "filter", "whereField", "whereValue", "limit", "offset", "select", "orderBy", "orderDir", "order_by", "order_dir", "include", "filter[or]"},
            new String[0],
            new String[] {"filter", "filter[or]"}));
    out.put(
        "getV1DataByProjectIdByTableAggregate",
        new Operation(
            "getV1DataByProjectIdByTableAggregate",
            "GET",
            "/v1/data/{projectId}/{table}/aggregate",
            null,
            "json",
            false,
            new String[] {"projectId", "table"},
            new String[] {"fn", "column", "group_by", "where", "filter", "whereField", "whereValue"},
            new String[] {"fn"},
            new String[] {"filter"}));
    out.put(
        "getV1DataByProjectIdByTableById",
        new Operation(
            "getV1DataByProjectIdByTableById",
            "GET",
            "/v1/data/{projectId}/{table}/{id}",
            null,
            "json",
            false,
            new String[] {"projectId", "table", "id"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getV1DataByProjectIdByTableSearch",
        new Operation(
            "getV1DataByProjectIdByTableSearch",
            "GET",
            "/v1/data/{projectId}/{table}/search",
            null,
            "json",
            false,
            new String[] {"projectId", "table"},
            new String[] {"q", "fields", "limit", "offset"},
            new String[] {"q"},
            new String[0]));
    out.put(
        "getV1Health",
        new Operation(
            "getV1Health",
            "GET",
            "/v1/health",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getV1Project",
        new Operation(
            "getV1Project",
            "GET",
            "/v1/project",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "getWellKnownOauthAuthorizationServer",
        new Operation(
            "getWellKnownOauthAuthorizationServer",
            "GET",
            "/.well-known/oauth-authorization-server",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchAiCopilotSessionBySessionId",
        new Operation(
            "patchAiCopilotSessionBySessionId",
            "PATCH",
            "/ai/copilot/session/{sessionId}",
            "json",
            "json",
            true,
            new String[] {"sessionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchAuthMe",
        new Operation(
            "patchAuthMe",
            "PATCH",
            "/auth/me",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchBillingOrgByOrgIdAddonsByAddonId",
        new Operation(
            "patchBillingOrgByOrgIdAddonsByAddonId",
            "PATCH",
            "/billing/org/{orgId}/addons/{addonId}",
            "json",
            "json",
            false,
            new String[] {"orgId", "addonId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchBillingOrgByOrgIdContactsByContactId",
        new Operation(
            "patchBillingOrgByOrgIdContactsByContactId",
            "PATCH",
            "/billing/org/{orgId}/contacts/{contactId}",
            "json",
            "json",
            true,
            new String[] {"orgId", "contactId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchBillingOrgByOrgIdUsageAlertsByAlertId",
        new Operation(
            "patchBillingOrgByOrgIdUsageAlertsByAlertId",
            "PATCH",
            "/billing/org/{orgId}/usage-alerts/{alertId}",
            "json",
            "json",
            true,
            new String[] {"orgId", "alertId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchDatabaseWrappersProjectByProjectIdByWrapperId",
        new Operation(
            "patchDatabaseWrappersProjectByProjectIdByWrapperId",
            "PATCH",
            "/database/wrappers/project/{projectId}/{wrapperId}",
            "json",
            "json",
            true,
            new String[] {"projectId", "wrapperId"},
            new String[] {"envId"},
            new String[0],
            new String[0]));
    out.put(
        "patchEnterpriseOrgByOrgIdOnboarding",
        new Operation(
            "patchEnterpriseOrgByOrgIdOnboarding",
            "PATCH",
            "/enterprise/org/{orgId}/onboarding",
            "json",
            "json",
            true,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchFunctionsByFunctionId",
        new Operation(
            "patchFunctionsByFunctionId",
            "PATCH",
            "/functions/{functionId}",
            "json",
            "json",
            true,
            new String[] {"functionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchFunctionsTriggersByTriggerId",
        new Operation(
            "patchFunctionsTriggersByTriggerId",
            "PATCH",
            "/functions/triggers/{triggerId}",
            "json",
            "json",
            true,
            new String[] {"triggerId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchGeneratedByTableBulk",
        new Operation(
            "patchGeneratedByTableBulk",
            "PATCH",
            "/generated/{table}/bulk",
            "json",
            "json",
            true,
            new String[] {"table"},
            new String[0],
            new String[0],
            new String[0]));
  }

  private static void definitions4(Map<String, Operation> out) {
    out.put(
        "patchGeneratedByTableById",
        new Operation(
            "patchGeneratedByTableById",
            "PATCH",
            "/generated/{table}/{id}",
            "json",
            "json",
            true,
            new String[] {"table", "id"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchIntegrationsSubscriptionsById",
        new Operation(
            "patchIntegrationsSubscriptionsById",
            "PATCH",
            "/integrations/subscriptions/{id}",
            "json",
            "json",
            true,
            new String[] {"id"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchOauthOrgByOrgIdProviderByProvider",
        new Operation(
            "patchOauthOrgByOrgIdProviderByProvider",
            "PATCH",
            "/oauth/org/{orgId}/provider/{provider}",
            "json",
            "json",
            true,
            new String[] {"orgId", "provider"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchOrgsByOrgId",
        new Operation(
            "patchOrgsByOrgId",
            "PATCH",
            "/orgs/{orgId}",
            "json",
            "json",
            true,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchOrgsByOrgIdBlueprintDefaults",
        new Operation(
            "patchOrgsByOrgIdBlueprintDefaults",
            "PATCH",
            "/orgs/{orgId}/blueprint-defaults",
            "json",
            "json",
            true,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchOrgsByOrgIdDataRegion",
        new Operation(
            "patchOrgsByOrgIdDataRegion",
            "PATCH",
            "/orgs/{orgId}/data-region",
            "json",
            "json",
            true,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchOrgsByOrgIdMembersByUserIdRole",
        new Operation(
            "patchOrgsByOrgIdMembersByUserIdRole",
            "PATCH",
            "/orgs/{orgId}/members/{userId}/role",
            "json",
            "json",
            true,
            new String[] {"orgId", "userId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchOrgsByOrgIdMembersRoles",
        new Operation(
            "patchOrgsByOrgIdMembersRoles",
            "PATCH",
            "/orgs/{orgId}/members/roles",
            "json",
            "json",
            true,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchOrgsByOrgIdProfile",
        new Operation(
            "patchOrgsByOrgIdProfile",
            "PATCH",
            "/orgs/{orgId}/profile",
            "json",
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchOrgsByOrgIdSecurity",
        new Operation(
            "patchOrgsByOrgIdSecurity",
            "PATCH",
            "/orgs/{orgId}/security",
            "json",
            "json",
            true,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchProjectsByProjectId",
        new Operation(
            "patchProjectsByProjectId",
            "PATCH",
            "/projects/{projectId}",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchProjectsByProjectIdApiKeysByKeyId",
        new Operation(
            "patchProjectsByProjectIdApiKeysByKeyId",
            "PATCH",
            "/projects/{projectId}/api-keys/{keyId}",
            "json",
            "json",
            true,
            new String[] {"projectId", "keyId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchProjectsByProjectIdAuthSettings",
        new Operation(
            "patchProjectsByProjectIdAuthSettings",
            "PATCH",
            "/projects/{projectId}/auth/settings",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchProjectsByProjectIdEnvVarsByEnvVarId",
        new Operation(
            "patchProjectsByProjectIdEnvVarsByEnvVarId",
            "PATCH",
            "/projects/{projectId}/env-vars/{envVarId}",
            "json",
            "json",
            false,
            new String[] {"projectId", "envVarId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchProjectsByProjectIdEnvironmentsByEnvId",
        new Operation(
            "patchProjectsByProjectIdEnvironmentsByEnvId",
            "PATCH",
            "/projects/{projectId}/environments/{envId}",
            "json",
            "json",
            false,
            new String[] {"projectId", "envId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchProjectsByProjectIdSettingsAddons",
        new Operation(
            "patchProjectsByProjectIdSettingsAddons",
            "PATCH",
            "/projects/{projectId}/settings/addons",
            "json",
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchProjectsByProjectIdSettingsApi",
        new Operation(
            "patchProjectsByProjectIdSettingsApi",
            "PATCH",
            "/projects/{projectId}/settings/api",
            "json",
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchProjectsByProjectIdSettingsCompute",
        new Operation(
            "patchProjectsByProjectIdSettingsCompute",
            "PATCH",
            "/projects/{projectId}/settings/compute",
            "json",
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchProjectsByProjectIdSettingsJwt",
        new Operation(
            "patchProjectsByProjectIdSettingsJwt",
            "PATCH",
            "/projects/{projectId}/settings/jwt",
            "json",
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchProjectsByProjectIdStorageSettings",
        new Operation(
            "patchProjectsByProjectIdStorageSettings",
            "PATCH",
            "/projects/{projectId}/storage/settings",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchProjectsByProjectIdUsersByUserId",
        new Operation(
            "patchProjectsByProjectIdUsersByUserId",
            "PATCH",
            "/projects/{projectId}/users/{userId}",
            "json",
            "json",
            true,
            new String[] {"projectId", "userId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchRegionsByKey",
        new Operation(
            "patchRegionsByKey",
            "PATCH",
            "/regions/{key}",
            "json",
            "json",
            false,
            new String[] {"key"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchRlsPoliciesByPolicyId",
        new Operation(
            "patchRlsPoliciesByPolicyId",
            "PATCH",
            "/rls/policies/{policyId}",
            "json",
            "json",
            false,
            new String[] {"policyId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchSchemaEngineSnippetsByProjectIdBySnippetId",
        new Operation(
            "patchSchemaEngineSnippetsByProjectIdBySnippetId",
            "PATCH",
            "/schema-engine/snippets/{projectId}/{snippetId}",
            "json",
            "json",
            true,
            new String[] {"projectId", "snippetId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchServicesByServiceIdHostname",
        new Operation(
            "patchServicesByServiceIdHostname",
            "PATCH",
            "/services/{serviceId}/hostname",
            "json",
            "json",
            true,
            new String[] {"serviceId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchServicesByServiceIdRuntimeClass",
        new Operation(
            "patchServicesByServiceIdRuntimeClass",
            "PATCH",
            "/services/{serviceId}/runtime-class",
            "json",
            "json",
            true,
            new String[] {"serviceId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchSsoOrgByOrgIdConnectionsByConnectionId",
        new Operation(
            "patchSsoOrgByOrgIdConnectionsByConnectionId",
            "PATCH",
            "/sso/org/{orgId}/connections/{connectionId}",
            "json",
            "json",
            false,
            new String[] {"orgId", "connectionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchStorageFilesByBucketIdMetadata",
        new Operation(
            "patchStorageFilesByBucketIdMetadata",
            "PATCH",
            "/storage/files/{bucketId}/metadata",
            "json",
            "json",
            false,
            new String[] {"bucketId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchUsersMe",
        new Operation(
            "patchUsersMe",
            "PATCH",
            "/users/me",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchUsersMePreferences",
        new Operation(
            "patchUsersMePreferences",
            "PATCH",
            "/users/me/preferences",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchV1DataByProjectIdByTableBulk",
        new Operation(
            "patchV1DataByProjectIdByTableBulk",
            "PATCH",
            "/v1/data/{projectId}/{table}/bulk",
            "json",
            "json",
            true,
            new String[] {"projectId", "table"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "patchV1DataByProjectIdByTableById",
        new Operation(
            "patchV1DataByProjectIdByTableById",
            "PATCH",
            "/v1/data/{projectId}/{table}/{id}",
            "json",
            "json",
            true,
            new String[] {"projectId", "table", "id"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotAlertRuleSuggestion",
        new Operation(
            "postAiCopilotAlertRuleSuggestion",
            "POST",
            "/ai/copilot/alert-rule-suggestion",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotAlertRuleSuggestionEstimate",
        new Operation(
            "postAiCopilotAlertRuleSuggestionEstimate",
            "POST",
            "/ai/copilot/alert-rule-suggestion/estimate",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotChat",
        new Operation(
            "postAiCopilotChat",
            "POST",
            "/ai/copilot/chat",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotChatStream",
        new Operation(
            "postAiCopilotChatStream",
            "POST",
            "/ai/copilot/chat/stream",
            null,
            "sse",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotExecute",
        new Operation(
            "postAiCopilotExecute",
            "POST",
            "/ai/copilot/execute",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotExecutionByExecutionIdPause",
        new Operation(
            "postAiCopilotExecutionByExecutionIdPause",
            "POST",
            "/ai/copilot/execution/{executionId}/pause",
            null,
            "json",
            false,
            new String[] {"executionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotExecutionByExecutionIdResume",
        new Operation(
            "postAiCopilotExecutionByExecutionIdResume",
            "POST",
            "/ai/copilot/execution/{executionId}/resume",
            "json",
            "json",
            true,
            new String[] {"executionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotExecutionByExecutionIdRollback",
        new Operation(
            "postAiCopilotExecutionByExecutionIdRollback",
            "POST",
            "/ai/copilot/execution/{executionId}/rollback",
            "json",
            "json",
            true,
            new String[] {"executionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotExportByVersionId",
        new Operation(
            "postAiCopilotExportByVersionId",
            "POST",
            "/ai/copilot/export/{versionId}",
            "json",
            "json",
            false,
            new String[] {"versionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotExportGithub",
        new Operation(
            "postAiCopilotExportGithub",
            "POST",
            "/ai/copilot/export/github",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotFeedback",
        new Operation(
            "postAiCopilotFeedback",
            "POST",
            "/ai/copilot/feedback",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotGenerationByManifestIdCancel",
        new Operation(
            "postAiCopilotGenerationByManifestIdCancel",
            "POST",
            "/ai/copilot/generation/{manifestId}/cancel",
            "json",
            "json",
            false,
            new String[] {"manifestId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotGitBranch",
        new Operation(
            "postAiCopilotGitBranch",
            "POST",
            "/ai/copilot/git/branch",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotGitClone",
        new Operation(
            "postAiCopilotGitClone",
            "POST",
            "/ai/copilot/git/clone",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotGitCommit",
        new Operation(
            "postAiCopilotGitCommit",
            "POST",
            "/ai/copilot/git/commit",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotGitInit",
        new Operation(
            "postAiCopilotGitInit",
            "POST",
            "/ai/copilot/git/init",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotGitPull",
        new Operation(
            "postAiCopilotGitPull",
            "POST",
            "/ai/copilot/git/pull",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotGitPush",
        new Operation(
            "postAiCopilotGitPush",
            "POST",
            "/ai/copilot/git/push",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotGitWrite",
        new Operation(
            "postAiCopilotGitWrite",
            "POST",
            "/ai/copilot/git/write",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotJob",
        new Operation(
            "postAiCopilotJob",
            "POST",
            "/ai/copilot/job",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotJobByJobIdCancel",
        new Operation(
            "postAiCopilotJobByJobIdCancel",
            "POST",
            "/ai/copilot/job/{jobId}/cancel",
            null,
            "json",
            false,
            new String[] {"jobId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotJobByJobIdRetry",
        new Operation(
            "postAiCopilotJobByJobIdRetry",
            "POST",
            "/ai/copilot/job/{jobId}/retry",
            "json",
            "json",
            false,
            new String[] {"jobId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotManifestByManifestIdPause",
        new Operation(
            "postAiCopilotManifestByManifestIdPause",
            "POST",
            "/ai/copilot/manifest/{manifestId}/pause",
            "json",
            "json",
            false,
            new String[] {"manifestId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotMemoriesByMemoryIdPromote",
        new Operation(
            "postAiCopilotMemoriesByMemoryIdPromote",
            "POST",
            "/ai/copilot/memories/{memoryId}/promote",
            null,
            "json",
            false,
            new String[] {"memoryId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotRateByMessageId",
        new Operation(
            "postAiCopilotRateByMessageId",
            "POST",
            "/ai/copilot/rate/{messageId}",
            "json",
            "json",
            true,
            new String[] {"messageId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotSessionBySessionIdArtifactBody",
        new Operation(
            "postAiCopilotSessionBySessionIdArtifactBody",
            "POST",
            "/ai/copilot/session/{sessionId}/artifact-body",
            "json",
            "json",
            true,
            new String[] {"sessionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotSessionBySessionIdBrainstormStop",
        new Operation(
            "postAiCopilotSessionBySessionIdBrainstormStop",
            "POST",
            "/ai/copilot/session/{sessionId}/brainstorm/stop",
            null,
            "json",
            false,
            new String[] {"sessionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotSessionBySessionIdWorkspaceEnv",
        new Operation(
            "postAiCopilotSessionBySessionIdWorkspaceEnv",
            "POST",
            "/ai/copilot/session/{sessionId}/workspace/env",
            null,
            "json",
            false,
            new String[] {"sessionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotSessionBySessionIdWorkspaceFix",
        new Operation(
            "postAiCopilotSessionBySessionIdWorkspaceFix",
            "POST",
            "/ai/copilot/session/{sessionId}/workspace/fix",
            "json",
            "json",
            true,
            new String[] {"sessionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotSessionBySessionIdWorkspaceHeartbeat",
        new Operation(
            "postAiCopilotSessionBySessionIdWorkspaceHeartbeat",
            "POST",
            "/ai/copilot/session/{sessionId}/workspace/heartbeat",
            null,
            "json",
            false,
            new String[] {"sessionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotSessionBySessionIdWorkspaceInstall",
        new Operation(
            "postAiCopilotSessionBySessionIdWorkspaceInstall",
            "POST",
            "/ai/copilot/session/{sessionId}/workspace/install",
            null,
            "json",
            false,
            new String[] {"sessionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotSessionBySessionIdWorkspacePrepare",
        new Operation(
            "postAiCopilotSessionBySessionIdWorkspacePrepare",
            "POST",
            "/ai/copilot/session/{sessionId}/workspace/prepare",
            "json",
            "json",
            true,
            new String[] {"sessionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotSessionBySessionIdWorkspaceRelease",
        new Operation(
            "postAiCopilotSessionBySessionIdWorkspaceRelease",
            "POST",
            "/ai/copilot/session/{sessionId}/workspace/release",
            null,
            "json",
            false,
            new String[] {"sessionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotSessionBySessionIdWorkspaceRepairsApply",
        new Operation(
            "postAiCopilotSessionBySessionIdWorkspaceRepairsApply",
            "POST",
            "/ai/copilot/session/{sessionId}/workspace/repairs/apply",
            null,
            "json",
            false,
            new String[] {"sessionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotSessionBySessionIdWorkspaceRestore",
        new Operation(
            "postAiCopilotSessionBySessionIdWorkspaceRestore",
            "POST",
            "/ai/copilot/session/{sessionId}/workspace/restore",
            "json",
            "json",
            true,
            new String[] {"sessionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotSessionBySessionIdWorkspaceRun",
        new Operation(
            "postAiCopilotSessionBySessionIdWorkspaceRun",
            "POST",
            "/ai/copilot/session/{sessionId}/workspace/run",
            null,
            "json",
            false,
            new String[] {"sessionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotSessionBySessionIdWorkspaceStop",
        new Operation(
            "postAiCopilotSessionBySessionIdWorkspaceStop",
            "POST",
            "/ai/copilot/session/{sessionId}/workspace/stop",
            null,
            "json",
            false,
            new String[] {"sessionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotSessions",
        new Operation(
            "postAiCopilotSessions",
            "POST",
            "/ai/copilot/sessions",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotTableFilters",
        new Operation(
            "postAiCopilotTableFilters",
            "POST",
            "/ai/copilot/table-filters",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotTableFiltersEstimate",
        new Operation(
            "postAiCopilotTableFiltersEstimate",
            "POST",
            "/ai/copilot/table-filters/estimate",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAiCopilotTrainingConsentBySessionId",
        new Operation(
            "postAiCopilotTrainingConsentBySessionId",
            "POST",
            "/ai/copilot/training-consent/{sessionId}",
            "json",
            "json",
            true,
            new String[] {"sessionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAlertRulesProjectByProjectId",
        new Operation(
            "postAlertRulesProjectByProjectId",
            "POST",
            "/alert-rules/project/{projectId}",
            "json",
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthAccountSetup",
        new Operation(
            "postAuthAccountSetup",
            "POST",
            "/auth/account-setup",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthAccountSetupCheck",
        new Operation(
            "postAuthAccountSetupCheck",
            "POST",
            "/auth/account-setup/check",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthCliAuthorize",
        new Operation(
            "postAuthCliAuthorize",
            "POST",
            "/auth/cli/authorize",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthCliCallback",
        new Operation(
            "postAuthCliCallback",
            "POST",
            "/auth/cli/callback",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthCliDeny",
        new Operation(
            "postAuthCliDeny",
            "POST",
            "/auth/cli/deny",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthCliLogin",
        new Operation(
            "postAuthCliLogin",
            "POST",
            "/auth/cli/login",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthCliRequestsCheck",
        new Operation(
            "postAuthCliRequestsCheck",
            "POST",
            "/auth/cli/requests/check",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthCliToken",
        new Operation(
            "postAuthCliToken",
            "POST",
            "/auth/cli/token",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthForgotPassword",
        new Operation(
            "postAuthForgotPassword",
            "POST",
            "/auth/forgot-password",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthLogin",
        new Operation(
            "postAuthLogin",
            "POST",
            "/auth/login",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthLogout",
        new Operation(
            "postAuthLogout",
            "POST",
            "/auth/logout",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthLogoutAll",
        new Operation(
            "postAuthLogoutAll",
            "POST",
            "/auth/logout-all",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthMeLinkedAccountsByProviderStart",
        new Operation(
            "postAuthMeLinkedAccountsByProviderStart",
            "POST",
            "/auth/me/linked-accounts/{provider}/start",
            null,
            "json",
            false,
            new String[] {"provider"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthMfaDisable",
        new Operation(
            "postAuthMfaDisable",
            "POST",
            "/auth/mfa/disable",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthMfaEnrollConfirm",
        new Operation(
            "postAuthMfaEnrollConfirm",
            "POST",
            "/auth/mfa/enroll-confirm",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthMfaEnrollStart",
        new Operation(
            "postAuthMfaEnrollStart",
            "POST",
            "/auth/mfa/enroll-start",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthMfaRegenerateCodes",
        new Operation(
            "postAuthMfaRegenerateCodes",
            "POST",
            "/auth/mfa/regenerate-codes",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthMfaVerify",
        new Operation(
            "postAuthMfaVerify",
            "POST",
            "/auth/mfa/verify",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthReauthenticate",
        new Operation(
            "postAuthReauthenticate",
            "POST",
            "/auth/reauthenticate",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthRefresh",
        new Operation(
            "postAuthRefresh",
            "POST",
            "/auth/refresh",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthResetPassword",
        new Operation(
            "postAuthResetPassword",
            "POST",
            "/auth/reset-password",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthResetPasswordCheck",
        new Operation(
            "postAuthResetPasswordCheck",
            "POST",
            "/auth/reset-password/check",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthSessionDevice",
        new Operation(
            "postAuthSessionDevice",
            "POST",
            "/auth/session/device",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthSessionToken",
        new Operation(
            "postAuthSessionToken",
            "POST",
            "/auth/session/token",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthSignup",
        new Operation(
            "postAuthSignup",
            "POST",
            "/auth/signup",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthSsoRestart",
        new Operation(
            "postAuthSsoRestart",
            "POST",
            "/auth/sso/restart",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
  }

  private static void definitions5(Map<String, Operation> out) {
    out.put(
        "postAuthTenantHandoff",
        new Operation(
            "postAuthTenantHandoff",
            "POST",
            "/auth/tenant/handoff",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthTenantLogin",
        new Operation(
            "postAuthTenantLogin",
            "POST",
            "/auth/tenant/login",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthTenantLogout",
        new Operation(
            "postAuthTenantLogout",
            "POST",
            "/auth/tenant/logout",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthTenantMfaVerify",
        new Operation(
            "postAuthTenantMfaVerify",
            "POST",
            "/auth/tenant/mfa/verify",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthTenantRefresh",
        new Operation(
            "postAuthTenantRefresh",
            "POST",
            "/auth/tenant/refresh",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthTenantSsoStart",
        new Operation(
            "postAuthTenantSsoStart",
            "POST",
            "/auth/tenant/sso/start",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthVerifyEmailConfirm",
        new Operation(
            "postAuthVerifyEmailConfirm",
            "POST",
            "/auth/verify-email/confirm",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthVerifyEmailResend",
        new Operation(
            "postAuthVerifyEmailResend",
            "POST",
            "/auth/verify-email/resend",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postAuthVerifyEmailSend",
        new Operation(
            "postAuthVerifyEmailSend",
            "POST",
            "/auth/verify-email/send",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postBillingCheckout",
        new Operation(
            "postBillingCheckout",
            "POST",
            "/billing/checkout",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postBillingEnterpriseInquiry",
        new Operation(
            "postBillingEnterpriseInquiry",
            "POST",
            "/billing/enterprise/inquiry",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postBillingHostingCheckout",
        new Operation(
            "postBillingHostingCheckout",
            "POST",
            "/billing/hosting/checkout",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postBillingOrgByOrgIdAddons",
        new Operation(
            "postBillingOrgByOrgIdAddons",
            "POST",
            "/billing/org/{orgId}/addons",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postBillingOrgByOrgIdAddonsByAddonIdPreview",
        new Operation(
            "postBillingOrgByOrgIdAddonsByAddonIdPreview",
            "POST",
            "/billing/org/{orgId}/addons/{addonId}/preview",
            "json",
            "json",
            false,
            new String[] {"orgId", "addonId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postBillingOrgByOrgIdAddonsPreview",
        new Operation(
            "postBillingOrgByOrgIdAddonsPreview",
            "POST",
            "/billing/org/{orgId}/addons/preview",
            "json",
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postBillingOrgByOrgIdCancel",
        new Operation(
            "postBillingOrgByOrgIdCancel",
            "POST",
            "/billing/org/{orgId}/cancel",
            "json",
            "json",
            true,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postBillingOrgByOrgIdCardCheckConfirm",
        new Operation(
            "postBillingOrgByOrgIdCardCheckConfirm",
            "POST",
            "/billing/org/{orgId}/card-check/confirm",
            "json",
            "json",
            true,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postBillingOrgByOrgIdCardCheckSession",
        new Operation(
            "postBillingOrgByOrgIdCardCheckSession",
            "POST",
            "/billing/org/{orgId}/card-check/session",
            "json",
            "json",
            true,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postBillingOrgByOrgIdChangePlan",
        new Operation(
            "postBillingOrgByOrgIdChangePlan",
            "POST",
            "/billing/org/{orgId}/change-plan",
            "json",
            "json",
            true,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postBillingOrgByOrgIdChangePlanPreview",
        new Operation(
            "postBillingOrgByOrgIdChangePlanPreview",
            "POST",
            "/billing/org/{orgId}/change-plan/preview",
            "json",
            "json",
            true,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postBillingOrgByOrgIdContacts",
        new Operation(
            "postBillingOrgByOrgIdContacts",
            "POST",
            "/billing/org/{orgId}/contacts",
            "json",
            "json",
            true,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postBillingOrgByOrgIdCreditsPurchase",
        new Operation(
            "postBillingOrgByOrgIdCreditsPurchase",
            "POST",
            "/billing/org/{orgId}/credits/purchase",
            "json",
            "json",
            true,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postBillingOrgByOrgIdPause",
        new Operation(
            "postBillingOrgByOrgIdPause",
            "POST",
            "/billing/org/{orgId}/pause",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postBillingOrgByOrgIdPortal",
        new Operation(
            "postBillingOrgByOrgIdPortal",
            "POST",
            "/billing/org/{orgId}/portal",
            "json",
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postBillingOrgByOrgIdReactivate",
        new Operation(
            "postBillingOrgByOrgIdReactivate",
            "POST",
            "/billing/org/{orgId}/reactivate",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postBillingOrgByOrgIdResume",
        new Operation(
            "postBillingOrgByOrgIdResume",
            "POST",
            "/billing/org/{orgId}/resume",
            null,
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postBillingOrgByOrgIdUsageAlerts",
        new Operation(
            "postBillingOrgByOrgIdUsageAlerts",
            "POST",
            "/billing/org/{orgId}/usage-alerts",
            "json",
            "json",
            true,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postBillingPromoCodesValidate",
        new Operation(
            "postBillingPromoCodesValidate",
            "POST",
            "/billing/promo-codes/validate",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postBillingRedeemPromo",
        new Operation(
            "postBillingRedeemPromo",
            "POST",
            "/billing/redeem-promo",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postBillingWebhook",
        new Operation(
            "postBillingWebhook",
            "POST",
            "/billing/webhook",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postBucketsByBucketIdSignedUrl",
        new Operation(
            "postBucketsByBucketIdSignedUrl",
            "POST",
            "/buckets/{bucketId}/signed-url",
            "json",
            "json",
            false,
            new String[] {"bucketId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postBucketsByBucketIdUpload",
        new Operation(
            "postBucketsByBucketIdUpload",
            "POST",
            "/buckets/{bucketId}/upload",
            "binary",
            "json",
            true,
            new String[] {"bucketId"},
            new String[] {"key", "contentType"},
            new String[] {"key"},
            new String[0]));
    out.put(
        "postBucketsByBucketIdUploadUrl",
        new Operation(
            "postBucketsByBucketIdUploadUrl",
            "POST",
            "/buckets/{bucketId}/upload-url",
            "json",
            "json",
            false,
            new String[] {"bucketId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postContact",
        new Operation(
            "postContact",
            "POST",
            "/contact",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postDatabaseConnectorByProjectIdQuery",
        new Operation(
            "postDatabaseConnectorByProjectIdQuery",
            "POST",
            "/database/connector/{projectId}/query",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postDatabaseConnectorByProjectIdTest",
        new Operation(
            "postDatabaseConnectorByProjectIdTest",
            "POST",
            "/database/connector/{projectId}/test",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postDatabaseExtensionsProjectByProjectIdInstall",
        new Operation(
            "postDatabaseExtensionsProjectByProjectIdInstall",
            "POST",
            "/database/extensions/project/{projectId}/install",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postDatabaseWrappersProjectByProjectIdInstall",
        new Operation(
            "postDatabaseWrappersProjectByProjectIdInstall",
            "POST",
            "/database/wrappers/project/{projectId}/install",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postDeploymentsByDeploymentIdRollback",
        new Operation(
            "postDeploymentsByDeploymentIdRollback",
            "POST",
            "/deployments/{deploymentId}/rollback",
            null,
            "json",
            false,
            new String[] {"deploymentId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postDeploymentsPromote",
        new Operation(
            "postDeploymentsPromote",
            "POST",
            "/deployments/promote",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postDeploymentsTokens",
        new Operation(
            "postDeploymentsTokens",
            "POST",
            "/deployments/tokens",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postDeploymentsTokensByTokenIdRevoke",
        new Operation(
            "postDeploymentsTokensByTokenIdRevoke",
            "POST",
            "/deployments/tokens/{tokenId}/revoke",
            null,
            "json",
            false,
            new String[] {"tokenId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postDeploymentsTrigger",
        new Operation(
            "postDeploymentsTrigger",
            "POST",
            "/deployments/trigger",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postDocsFeedback",
        new Operation(
            "postDocsFeedback",
            "POST",
            "/docs/feedback",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postDocsSearchClick",
        new Operation(
            "postDocsSearchClick",
            "POST",
            "/docs/search-click",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postEnterpriseInquire",
        new Operation(
            "postEnterpriseInquire",
            "POST",
            "/enterprise/inquire",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postEnterpriseQuotesByQuoteIdAccept",
        new Operation(
            "postEnterpriseQuotesByQuoteIdAccept",
            "POST",
            "/enterprise/quotes/{quoteId}/accept",
            null,
            "json",
            false,
            new String[] {"quoteId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postEntitlementsOrgByOrgIdCheck",
        new Operation(
            "postEntitlementsOrgByOrgIdCheck",
            "POST",
            "/entitlements/org/{orgId}/check",
            "json",
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postFunctions",
        new Operation(
            "postFunctions",
            "POST",
            "/functions",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postFunctionsByFunctionIdOrNameInvoke",
        new Operation(
            "postFunctionsByFunctionIdOrNameInvoke",
            "POST",
            "/functions/{functionIdOrName}/invoke",
            "json",
            "json",
            false,
            new String[] {"functionIdOrName"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postFunctionsByFunctionIdTriggers",
        new Operation(
            "postFunctionsByFunctionIdTriggers",
            "POST",
            "/functions/{functionId}/triggers",
            "json",
            "json",
            true,
            new String[] {"functionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postFunctionsSecrets",
        new Operation(
            "postFunctionsSecrets",
            "POST",
            "/functions/secrets",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postGeneratedByTable",
        new Operation(
            "postGeneratedByTable",
            "POST",
            "/generated/{table}",
            "json",
            "json",
            true,
            new String[] {"table"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postGeneratedByTableBulk",
        new Operation(
            "postGeneratedByTableBulk",
            "POST",
            "/generated/{table}/bulk",
            "json",
            "json",
            true,
            new String[] {"table"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postGeneratedByTableQuery",
        new Operation(
            "postGeneratedByTableQuery",
            "POST",
            "/generated/{table}/query",
            "json",
            "json",
            true,
            new String[] {"table"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postIncidents",
        new Operation(
            "postIncidents",
            "POST",
            "/incidents",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postIncidentsBulk",
        new Operation(
            "postIncidentsBulk",
            "POST",
            "/incidents/bulk",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postIncidentsByIncidentIdAck",
        new Operation(
            "postIncidentsByIncidentIdAck",
            "POST",
            "/incidents/{incidentId}/ack",
            null,
            "json",
            false,
            new String[] {"incidentId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postIncidentsByIncidentIdResolve",
        new Operation(
            "postIncidentsByIncidentIdResolve",
            "POST",
            "/incidents/{incidentId}/resolve",
            null,
            "json",
            false,
            new String[] {"incidentId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postInfrastructurePollStatus",
        new Operation(
            "postInfrastructurePollStatus",
            "POST",
            "/infrastructure/poll-status",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postIntegrationsDeliveriesByDeliveryIdRetry",
        new Operation(
            "postIntegrationsDeliveriesByDeliveryIdRetry",
            "POST",
            "/integrations/deliveries/{deliveryId}/retry",
            "json",
            "json",
            false,
            new String[] {"deliveryId"},
            new String[] {"not", "allowProduction"},
            new String[0],
            new String[0]));
    out.put(
        "postIntegrationsSubscriptions",
        new Operation(
            "postIntegrationsSubscriptions",
            "POST",
            "/integrations/subscriptions",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postIntegrationsSubscriptionsByIdTest",
        new Operation(
            "postIntegrationsSubscriptionsByIdTest",
            "POST",
            "/integrations/subscriptions/{id}/test",
            null,
            "json",
            false,
            new String[] {"id"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMcpAudit",
        new Operation(
            "postMcpAudit",
            "POST",
            "/mcp/audit",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMcpOauthRegister",
        new Operation(
            "postMcpOauthRegister",
            "POST",
            "/mcp/oauth/register",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMcpOauthRequestsByRequestIdApprove",
        new Operation(
            "postMcpOauthRequestsByRequestIdApprove",
            "POST",
            "/mcp/oauth/requests/{requestId}/approve",
            "json",
            "json",
            true,
            new String[] {"requestId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMcpOauthRequestsByRequestIdDeny",
        new Operation(
            "postMcpOauthRequestsByRequestIdDeny",
            "POST",
            "/mcp/oauth/requests/{requestId}/deny",
            null,
            "json",
            false,
            new String[] {"requestId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMcpOauthRevoke",
        new Operation(
            "postMcpOauthRevoke",
            "POST",
            "/mcp/oauth/revoke",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMcpOauthToken",
        new Operation(
            "postMcpOauthToken",
            "POST",
            "/mcp/oauth/token",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMeEarlyWelcomeSeen",
        new Operation(
            "postMeEarlyWelcomeSeen",
            "POST",
            "/me/early/welcome-seen",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMongodbByCollectionAggregate",
        new Operation(
            "postMongodbByCollectionAggregate",
            "POST",
            "/mongodb/{collection}/aggregate",
            "json",
            "json",
            false,
            new String[] {"collection"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMongodbByCollectionAggregateCursor",
        new Operation(
            "postMongodbByCollectionAggregateCursor",
            "POST",
            "/mongodb/{collection}/aggregate/cursor",
            "json",
            "json",
            false,
            new String[] {"collection"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMongodbByCollectionBulkWrite",
        new Operation(
            "postMongodbByCollectionBulkWrite",
            "POST",
            "/mongodb/{collection}/bulkWrite",
            "json",
            "json",
            false,
            new String[] {"collection"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMongodbByCollectionCount",
        new Operation(
            "postMongodbByCollectionCount",
            "POST",
            "/mongodb/{collection}/count",
            "json",
            "json",
            false,
            new String[] {"collection"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMongodbByCollectionCursorByCursorIdClose",
        new Operation(
            "postMongodbByCollectionCursorByCursorIdClose",
            "POST",
            "/mongodb/{collection}/cursor/{cursorId}/close",
            null,
            "json",
            false,
            new String[] {"collection", "cursorId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMongodbByCollectionCursorByCursorIdNext",
        new Operation(
            "postMongodbByCollectionCursorByCursorIdNext",
            "POST",
            "/mongodb/{collection}/cursor/{cursorId}/next",
            null,
            "json",
            false,
            new String[] {"collection", "cursorId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMongodbByCollectionDeleteMany",
        new Operation(
            "postMongodbByCollectionDeleteMany",
            "POST",
            "/mongodb/{collection}/deleteMany",
            "json",
            "json",
            false,
            new String[] {"collection"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMongodbByCollectionDeleteOne",
        new Operation(
            "postMongodbByCollectionDeleteOne",
            "POST",
            "/mongodb/{collection}/deleteOne",
            "json",
            "json",
            false,
            new String[] {"collection"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMongodbByCollectionDistinct",
        new Operation(
            "postMongodbByCollectionDistinct",
            "POST",
            "/mongodb/{collection}/distinct",
            "json",
            "json",
            false,
            new String[] {"collection"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMongodbByCollectionFind",
        new Operation(
            "postMongodbByCollectionFind",
            "POST",
            "/mongodb/{collection}/find",
            "json",
            "json",
            false,
            new String[] {"collection"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMongodbByCollectionFindCursor",
        new Operation(
            "postMongodbByCollectionFindCursor",
            "POST",
            "/mongodb/{collection}/find/cursor",
            "json",
            "json",
            false,
            new String[] {"collection"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMongodbByCollectionFindOne",
        new Operation(
            "postMongodbByCollectionFindOne",
            "POST",
            "/mongodb/{collection}/findOne",
            "json",
            "json",
            false,
            new String[] {"collection"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMongodbByCollectionFindOneAndDelete",
        new Operation(
            "postMongodbByCollectionFindOneAndDelete",
            "POST",
            "/mongodb/{collection}/findOneAndDelete",
            "json",
            "json",
            false,
            new String[] {"collection"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMongodbByCollectionFindOneAndReplace",
        new Operation(
            "postMongodbByCollectionFindOneAndReplace",
            "POST",
            "/mongodb/{collection}/findOneAndReplace",
            "json",
            "json",
            false,
            new String[] {"collection"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMongodbByCollectionFindOneAndUpdate",
        new Operation(
            "postMongodbByCollectionFindOneAndUpdate",
            "POST",
            "/mongodb/{collection}/findOneAndUpdate",
            "json",
            "json",
            false,
            new String[] {"collection"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMongodbByCollectionIndexes",
        new Operation(
            "postMongodbByCollectionIndexes",
            "POST",
            "/mongodb/{collection}/indexes",
            "json",
            "json",
            false,
            new String[] {"collection"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMongodbByCollectionInsertMany",
        new Operation(
            "postMongodbByCollectionInsertMany",
            "POST",
            "/mongodb/{collection}/insertMany",
            "json",
            "json",
            false,
            new String[] {"collection"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMongodbByCollectionInsertOne",
        new Operation(
            "postMongodbByCollectionInsertOne",
            "POST",
            "/mongodb/{collection}/insertOne",
            "json",
            "json",
            false,
            new String[] {"collection"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMongodbByCollectionReplaceOne",
        new Operation(
            "postMongodbByCollectionReplaceOne",
            "POST",
            "/mongodb/{collection}/replaceOne",
            "json",
            "json",
            false,
            new String[] {"collection"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMongodbByCollectionUpdateMany",
        new Operation(
            "postMongodbByCollectionUpdateMany",
            "POST",
            "/mongodb/{collection}/updateMany",
            "json",
            "json",
            false,
            new String[] {"collection"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMongodbByCollectionUpdateOne",
        new Operation(
            "postMongodbByCollectionUpdateOne",
            "POST",
            "/mongodb/{collection}/updateOne",
            "json",
            "json",
            false,
            new String[] {"collection"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMongodbCollections",
        new Operation(
            "postMongodbCollections",
            "POST",
            "/mongodb/collections",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMongodbCollectionsByNameRename",
        new Operation(
            "postMongodbCollectionsByNameRename",
            "POST",
            "/mongodb/collections/{name}/rename",
            "json",
            "json",
            false,
            new String[] {"name"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postMongodbCommand",
        new Operation(
            "postMongodbCommand",
            "POST",
            "/mongodb/command",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postOauthCallback",
        new Operation(
            "postOauthCallback",
            "POST",
            "/oauth/callback",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postOauthOrgByOrgIdConfigure",
        new Operation(
            "postOauthOrgByOrgIdConfigure",
            "POST",
            "/oauth/org/{orgId}/configure",
            "json",
            "json",
            true,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postOauthOrgByOrgIdProviderByProviderRefresh",
        new Operation(
            "postOauthOrgByOrgIdProviderByProviderRefresh",
            "POST",
            "/oauth/org/{orgId}/provider/{provider}/refresh",
            "json",
            "json",
            false,
            new String[] {"orgId", "provider"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postOnboardingOrgByOrgIdAutoSetup",
        new Operation(
            "postOnboardingOrgByOrgIdAutoSetup",
            "POST",
            "/onboarding/org/{orgId}/auto-setup",
            "json",
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postOnboardingOrgByOrgIdCompleteStep",
        new Operation(
            "postOnboardingOrgByOrgIdCompleteStep",
            "POST",
            "/onboarding/org/{orgId}/complete-step",
            "json",
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postOrgs",
        new Operation(
            "postOrgs",
            "POST",
            "/orgs",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
  }

  private static void definitions6(Map<String, Operation> out) {
    out.put(
        "postOrgsByOrgIdChangeRequests",
        new Operation(
            "postOrgsByOrgIdChangeRequests",
            "POST",
            "/orgs/{orgId}/change-requests",
            "json",
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postOrgsByOrgIdInvitesByInviteIdResend",
        new Operation(
            "postOrgsByOrgIdInvitesByInviteIdResend",
            "POST",
            "/orgs/{orgId}/invites/{inviteId}/resend",
            null,
            "json",
            false,
            new String[] {"orgId", "inviteId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postOrgsByOrgIdLeaveRequests",
        new Operation(
            "postOrgsByOrgIdLeaveRequests",
            "POST",
            "/orgs/{orgId}/leave-requests",
            "json",
            "json",
            true,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postOrgsByOrgIdLeaveRequestsByRequestIdApprove",
        new Operation(
            "postOrgsByOrgIdLeaveRequestsByRequestIdApprove",
            "POST",
            "/orgs/{orgId}/leave-requests/{requestId}/approve",
            "json",
            "json",
            true,
            new String[] {"orgId", "requestId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postOrgsByOrgIdLeaveRequestsByRequestIdDecline",
        new Operation(
            "postOrgsByOrgIdLeaveRequestsByRequestIdDecline",
            "POST",
            "/orgs/{orgId}/leave-requests/{requestId}/decline",
            "json",
            "json",
            true,
            new String[] {"orgId", "requestId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postOrgsByOrgIdMembersInvite",
        new Operation(
            "postOrgsByOrgIdMembersInvite",
            "POST",
            "/orgs/{orgId}/members/invite",
            "json",
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postOrgsByOrgIdSupportTickets",
        new Operation(
            "postOrgsByOrgIdSupportTickets",
            "POST",
            "/orgs/{orgId}/support/tickets",
            "json",
            "json",
            true,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postOrgsByOrgIdSupportTicketsByNumberMessages",
        new Operation(
            "postOrgsByOrgIdSupportTicketsByNumberMessages",
            "POST",
            "/orgs/{orgId}/support/tickets/{number}/messages",
            "json",
            "json",
            true,
            new String[] {"orgId", "number"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postOrgsByOrgIdSupportTicketsByNumberReopen",
        new Operation(
            "postOrgsByOrgIdSupportTicketsByNumberReopen",
            "POST",
            "/orgs/{orgId}/support/tickets/{number}/reopen",
            null,
            "json",
            false,
            new String[] {"orgId", "number"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postOrgsByOrgIdSupportTicketsByNumberResolve",
        new Operation(
            "postOrgsByOrgIdSupportTicketsByNumberResolve",
            "POST",
            "/orgs/{orgId}/support/tickets/{number}/resolve",
            null,
            "json",
            false,
            new String[] {"orgId", "number"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postOrgsByOrgIdTransfer",
        new Operation(
            "postOrgsByOrgIdTransfer",
            "POST",
            "/orgs/{orgId}/transfer",
            "json",
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postOrgsByOrgIdTransfersByIdResend",
        new Operation(
            "postOrgsByOrgIdTransfersByIdResend",
            "POST",
            "/orgs/{orgId}/transfers/{id}/resend",
            null,
            "json",
            false,
            new String[] {"orgId", "id"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postOrgsFirst",
        new Operation(
            "postOrgsFirst",
            "POST",
            "/orgs/first",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postOrgsInvitesAccept",
        new Operation(
            "postOrgsInvitesAccept",
            "POST",
            "/orgs/invites/accept",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postOrgsInvitesDecline",
        new Operation(
            "postOrgsInvitesDecline",
            "POST",
            "/orgs/invites/decline",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postOrgsTransfersAccept",
        new Operation(
            "postOrgsTransfersAccept",
            "POST",
            "/orgs/transfers/accept",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postOrgsTransfersDecline",
        new Operation(
            "postOrgsTransfersDecline",
            "POST",
            "/orgs/transfers/decline",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postPlansApply",
        new Operation(
            "postPlansApply",
            "POST",
            "/plans/apply",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postPlansSave",
        new Operation(
            "postPlansSave",
            "POST",
            "/plans/save",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjects",
        new Operation(
            "postProjects",
            "POST",
            "/projects",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdApiKeys",
        new Operation(
            "postProjectsByProjectIdApiKeys",
            "POST",
            "/projects/{projectId}/api-keys",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdApiKeysByKeyIdReveal",
        new Operation(
            "postProjectsByProjectIdApiKeysByKeyIdReveal",
            "POST",
            "/projects/{projectId}/api-keys/{keyId}/reveal",
            null,
            "json",
            false,
            new String[] {"projectId", "keyId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdApiKeysByKeyIdRevoke",
        new Operation(
            "postProjectsByProjectIdApiKeysByKeyIdRevoke",
            "POST",
            "/projects/{projectId}/api-keys/{keyId}/revoke",
            null,
            "json",
            false,
            new String[] {"projectId", "keyId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdApiKeysByKeyIdRotate",
        new Operation(
            "postProjectsByProjectIdApiKeysByKeyIdRotate",
            "POST",
            "/projects/{projectId}/api-keys/{keyId}/rotate",
            null,
            "json",
            false,
            new String[] {"projectId", "keyId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdApiKeysSplit",
        new Operation(
            "postProjectsByProjectIdApiKeysSplit",
            "POST",
            "/projects/{projectId}/api-keys/split",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdAuthForgotPassword",
        new Operation(
            "postProjectsByProjectIdAuthForgotPassword",
            "POST",
            "/projects/{projectId}/auth/forgot-password",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdAuthLogin",
        new Operation(
            "postProjectsByProjectIdAuthLogin",
            "POST",
            "/projects/{projectId}/auth/login",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdAuthLogout",
        new Operation(
            "postProjectsByProjectIdAuthLogout",
            "POST",
            "/projects/{projectId}/auth/logout",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdAuthMagicSend",
        new Operation(
            "postProjectsByProjectIdAuthMagicSend",
            "POST",
            "/projects/{projectId}/auth/magic/send",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdAuthMfaDisable",
        new Operation(
            "postProjectsByProjectIdAuthMfaDisable",
            "POST",
            "/projects/{projectId}/auth/mfa/disable",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdAuthMfaEnrollConfirm",
        new Operation(
            "postProjectsByProjectIdAuthMfaEnrollConfirm",
            "POST",
            "/projects/{projectId}/auth/mfa/enroll-confirm",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdAuthMfaEnrollStart",
        new Operation(
            "postProjectsByProjectIdAuthMfaEnrollStart",
            "POST",
            "/projects/{projectId}/auth/mfa/enroll-start",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdAuthMfaRegenerateCodes",
        new Operation(
            "postProjectsByProjectIdAuthMfaRegenerateCodes",
            "POST",
            "/projects/{projectId}/auth/mfa/regenerate-codes",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdAuthMfaVerify",
        new Operation(
            "postProjectsByProjectIdAuthMfaVerify",
            "POST",
            "/projects/{projectId}/auth/mfa/verify",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdAuthOauthByProviderStart",
        new Operation(
            "postProjectsByProjectIdAuthOauthByProviderStart",
            "POST",
            "/projects/{projectId}/auth/oauth/{provider}/start",
            "json",
            "json",
            true,
            new String[] {"projectId", "provider"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdAuthOauthToken",
        new Operation(
            "postProjectsByProjectIdAuthOauthToken",
            "POST",
            "/projects/{projectId}/auth/oauth/token",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdAuthRefresh",
        new Operation(
            "postProjectsByProjectIdAuthRefresh",
            "POST",
            "/projects/{projectId}/auth/refresh",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdAuthResetPassword",
        new Operation(
            "postProjectsByProjectIdAuthResetPassword",
            "POST",
            "/projects/{projectId}/auth/reset-password",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdAuthSignup",
        new Operation(
            "postProjectsByProjectIdAuthSignup",
            "POST",
            "/projects/{projectId}/auth/signup",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdAuthSyncUsers",
        new Operation(
            "postProjectsByProjectIdAuthSyncUsers",
            "POST",
            "/projects/{projectId}/auth/sync-users",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdAuthVerifyEmailConfirm",
        new Operation(
            "postProjectsByProjectIdAuthVerifyEmailConfirm",
            "POST",
            "/projects/{projectId}/auth/verify-email/confirm",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdAuthVerifyEmailSend",
        new Operation(
            "postProjectsByProjectIdAuthVerifyEmailSend",
            "POST",
            "/projects/{projectId}/auth/verify-email/send",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdBranches",
        new Operation(
            "postProjectsByProjectIdBranches",
            "POST",
            "/projects/{projectId}/branches",
            "json",
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdDatabaseDedicated",
        new Operation(
            "postProjectsByProjectIdDatabaseDedicated",
            "POST",
            "/projects/{projectId}/database/dedicated",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdDatabaseDedicatedRestart",
        new Operation(
            "postProjectsByProjectIdDatabaseDedicatedRestart",
            "POST",
            "/projects/{projectId}/database/dedicated/restart",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdDbReset",
        new Operation(
            "postProjectsByProjectIdDbReset",
            "POST",
            "/projects/{projectId}/db/reset",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdEnvVars",
        new Operation(
            "postProjectsByProjectIdEnvVars",
            "POST",
            "/projects/{projectId}/env-vars",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdEnvironments",
        new Operation(
            "postProjectsByProjectIdEnvironments",
            "POST",
            "/projects/{projectId}/environments",
            "json",
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdEnvironmentsBackfillUrls",
        new Operation(
            "postProjectsByProjectIdEnvironmentsBackfillUrls",
            "POST",
            "/projects/{projectId}/environments/backfill-urls",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdEnvironmentsBootstrap",
        new Operation(
            "postProjectsByProjectIdEnvironmentsBootstrap",
            "POST",
            "/projects/{projectId}/environments/bootstrap",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdEnvironmentsByEnvIdDomainsByDomainIdVerify",
        new Operation(
            "postProjectsByProjectIdEnvironmentsByEnvIdDomainsByDomainIdVerify",
            "POST",
            "/projects/{projectId}/environments/{envId}/domains/{domainId}/verify",
            null,
            "json",
            false,
            new String[] {"projectId", "envId", "domainId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdEnvironmentsByEnvIdProvisionSsl",
        new Operation(
            "postProjectsByProjectIdEnvironmentsByEnvIdProvisionSsl",
            "POST",
            "/projects/{projectId}/environments/{envId}/provision-ssl",
            null,
            "json",
            false,
            new String[] {"projectId", "envId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdEnvironmentsByEnvIdVerifyCname",
        new Operation(
            "postProjectsByProjectIdEnvironmentsByEnvIdVerifyCname",
            "POST",
            "/projects/{projectId}/environments/{envId}/verify-cname",
            null,
            "json",
            false,
            new String[] {"projectId", "envId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdEnvironmentsByEnvIdVerifyDomain",
        new Operation(
            "postProjectsByProjectIdEnvironmentsByEnvIdVerifyDomain",
            "POST",
            "/projects/{projectId}/environments/{envId}/verify-domain",
            null,
            "json",
            false,
            new String[] {"projectId", "envId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdGithubBranch",
        new Operation(
            "postProjectsByProjectIdGithubBranch",
            "POST",
            "/projects/{projectId}/github/branch",
            "json",
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdGithubConnect",
        new Operation(
            "postProjectsByProjectIdGithubConnect",
            "POST",
            "/projects/{projectId}/github/connect",
            "json",
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdGithubPull",
        new Operation(
            "postProjectsByProjectIdGithubPull",
            "POST",
            "/projects/{projectId}/github/pull",
            "json",
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdGithubPush",
        new Operation(
            "postProjectsByProjectIdGithubPush",
            "POST",
            "/projects/{projectId}/github/push",
            "json",
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdInfrastructureByInstanceIdMigrateNow",
        new Operation(
            "postProjectsByProjectIdInfrastructureByInstanceIdMigrateNow",
            "POST",
            "/projects/{projectId}/infrastructure/{instanceId}/migrate-now",
            null,
            "json",
            false,
            new String[] {"projectId", "instanceId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdInfrastructureByInstanceIdReplica",
        new Operation(
            "postProjectsByProjectIdInfrastructureByInstanceIdReplica",
            "POST",
            "/projects/{projectId}/infrastructure/{instanceId}/replica",
            null,
            "json",
            false,
            new String[] {"projectId", "instanceId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdInfrastructureByInstanceIdReplicaPreview",
        new Operation(
            "postProjectsByProjectIdInfrastructureByInstanceIdReplicaPreview",
            "POST",
            "/projects/{projectId}/infrastructure/{instanceId}/replica-preview",
            null,
            "json",
            false,
            new String[] {"projectId", "instanceId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdInfrastructureByInstanceIdResize",
        new Operation(
            "postProjectsByProjectIdInfrastructureByInstanceIdResize",
            "POST",
            "/projects/{projectId}/infrastructure/{instanceId}/resize",
            "json",
            "json",
            false,
            new String[] {"projectId", "instanceId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdInfrastructureByInstanceIdResizeCustom",
        new Operation(
            "postProjectsByProjectIdInfrastructureByInstanceIdResizeCustom",
            "POST",
            "/projects/{projectId}/infrastructure/{instanceId}/resize-custom",
            "json",
            "json",
            false,
            new String[] {"projectId", "instanceId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdInfrastructureByInstanceIdStart",
        new Operation(
            "postProjectsByProjectIdInfrastructureByInstanceIdStart",
            "POST",
            "/projects/{projectId}/infrastructure/{instanceId}/start",
            null,
            "json",
            false,
            new String[] {"projectId", "instanceId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdInfrastructureByInstanceIdStop",
        new Operation(
            "postProjectsByProjectIdInfrastructureByInstanceIdStop",
            "POST",
            "/projects/{projectId}/infrastructure/{instanceId}/stop",
            null,
            "json",
            false,
            new String[] {"projectId", "instanceId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdInfrastructureByInstanceIdSwitch",
        new Operation(
            "postProjectsByProjectIdInfrastructureByInstanceIdSwitch",
            "POST",
            "/projects/{projectId}/infrastructure/{instanceId}/switch",
            "json",
            "json",
            false,
            new String[] {"projectId", "instanceId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdInfrastructureIncludedRetry",
        new Operation(
            "postProjectsByProjectIdInfrastructureIncludedRetry",
            "POST",
            "/projects/{projectId}/infrastructure/included/retry",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdInfrastructureMigrationRetry",
        new Operation(
            "postProjectsByProjectIdInfrastructureMigrationRetry",
            "POST",
            "/projects/{projectId}/infrastructure/migration/retry",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdInfrastructureMigrationRollback",
        new Operation(
            "postProjectsByProjectIdInfrastructureMigrationRollback",
            "POST",
            "/projects/{projectId}/infrastructure/migration/rollback",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdInfrastructureProvision",
        new Operation(
            "postProjectsByProjectIdInfrastructureProvision",
            "POST",
            "/projects/{projectId}/infrastructure/provision",
            "json",
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdInfrastructureProvisionCustom",
        new Operation(
            "postProjectsByProjectIdInfrastructureProvisionCustom",
            "POST",
            "/projects/{projectId}/infrastructure/provision-custom",
            "json",
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdInfrastructureProvisionPreview",
        new Operation(
            "postProjectsByProjectIdInfrastructureProvisionPreview",
            "POST",
            "/projects/{projectId}/infrastructure/provision-preview",
            "json",
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdInfrastructureRestoresPreview",
        new Operation(
            "postProjectsByProjectIdInfrastructureRestoresPreview",
            "POST",
            "/projects/{projectId}/infrastructure/restores/preview",
            "json",
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdMembers",
        new Operation(
            "postProjectsByProjectIdMembers",
            "POST",
            "/projects/{projectId}/members",
            "json",
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdPromotions",
        new Operation(
            "postProjectsByProjectIdPromotions",
            "POST",
            "/projects/{projectId}/promotions",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdRegion",
        new Operation(
            "postProjectsByProjectIdRegion",
            "POST",
            "/projects/{projectId}/region",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdSettingsJwtRotate",
        new Operation(
            "postProjectsByProjectIdSettingsJwtRotate",
            "POST",
            "/projects/{projectId}/settings/jwt/rotate",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdUsers",
        new Operation(
            "postProjectsByProjectIdUsers",
            "POST",
            "/projects/{projectId}/users",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdUsersByUserIdBan",
        new Operation(
            "postProjectsByProjectIdUsersByUserIdBan",
            "POST",
            "/projects/{projectId}/users/{userId}/ban",
            "json",
            "json",
            true,
            new String[] {"projectId", "userId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdUsersByUserIdSendMagicLink",
        new Operation(
            "postProjectsByProjectIdUsersByUserIdSendMagicLink",
            "POST",
            "/projects/{projectId}/users/{userId}/send-magic-link",
            "json",
            "json",
            false,
            new String[] {"projectId", "userId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdUsersByUserIdSessionsRevokeAll",
        new Operation(
            "postProjectsByProjectIdUsersByUserIdSessionsRevokeAll",
            "POST",
            "/projects/{projectId}/users/{userId}/sessions/revoke-all",
            null,
            "json",
            false,
            new String[] {"projectId", "userId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postProjectsByProjectIdUsersByUserIdUnban",
        new Operation(
            "postProjectsByProjectIdUsersByUserIdUnban",
            "POST",
            "/projects/{projectId}/users/{userId}/unban",
            null,
            "json",
            false,
            new String[] {"projectId", "userId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postRealtimeConsoleToken",
        new Operation(
            "postRealtimeConsoleToken",
            "POST",
            "/realtime/console-token",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postRealtimeEnableAll",
        new Operation(
            "postRealtimeEnableAll",
            "POST",
            "/realtime/enable-all",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postRealtimeInstall",
        new Operation(
            "postRealtimeInstall",
            "POST",
            "/realtime/install",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postRealtimeToken",
        new Operation(
            "postRealtimeToken",
            "POST",
            "/realtime/token",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postRealtimeUninstall",
        new Operation(
            "postRealtimeUninstall",
            "POST",
            "/realtime/uninstall",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postRegions",
        new Operation(
            "postRegions",
            "POST",
            "/regions",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postRegionsHealthCheck",
        new Operation(
            "postRegionsHealthCheck",
            "POST",
            "/regions/health/check",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postRlsPoliciesByPolicyIdToggle",
        new Operation(
            "postRlsPoliciesByPolicyIdToggle",
            "POST",
            "/rls/policies/{policyId}/toggle",
            null,
            "json",
            false,
            new String[] {"policyId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postRlsPoliciesByProjectId",
        new Operation(
            "postRlsPoliciesByProjectId",
            "POST",
            "/rls/policies/{projectId}",
            "json",
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postSchemaEngineAnalyzeByProjectId",
        new Operation(
            "postSchemaEngineAnalyzeByProjectId",
            "POST",
            "/schema-engine/analyze/{projectId}",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[] {"envId"},
            new String[0],
            new String[0]));
    out.put(
        "postSchemaEngineApply",
        new Operation(
            "postSchemaEngineApply",
            "POST",
            "/schema-engine/apply",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postSchemaEngineEditorSessionsByProjectId",
        new Operation(
            "postSchemaEngineEditorSessionsByProjectId",
            "POST",
            "/schema-engine/editor-sessions/{projectId}",
            null,
            "json",
            false,
            new String[] {"projectId"},
            new String[] {"envId"},
            new String[0],
            new String[0]));
    out.put(
        "postSchemaEngineEditorSessionsByProjectIdClose",
        new Operation(
            "postSchemaEngineEditorSessionsByProjectIdClose",
            "POST",
            "/schema-engine/editor-sessions/{projectId}/close",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[] {"envId"},
            new String[0],
            new String[0]));
    out.put(
        "postSchemaEngineMigrationsByProjectIdByMigrationIdRollback",
        new Operation(
            "postSchemaEngineMigrationsByProjectIdByMigrationIdRollback",
            "POST",
            "/schema-engine/migrations/{projectId}/{migrationId}/rollback",
            "json",
            "json",
            false,
            new String[] {"projectId", "migrationId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postSchemaEnginePreview",
        new Operation(
            "postSchemaEnginePreview",
            "POST",
            "/schema-engine/preview",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postSchemaEnginePushByProjectId",
        new Operation(
            "postSchemaEnginePushByProjectId",
            "POST",
            "/schema-engine/push/{projectId}",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[] {"envId"},
            new String[0],
            new String[0]));
    out.put(
        "postSchemaEngineQueryByProjectId",
        new Operation(
            "postSchemaEngineQueryByProjectId",
            "POST",
            "/schema-engine/query/{projectId}",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[] {"envId"},
            new String[0],
            new String[0]));
    out.put(
        "postSchemaEngineSnippetsByProjectId",
        new Operation(
            "postSchemaEngineSnippetsByProjectId",
            "POST",
            "/schema-engine/snippets/{projectId}",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
  }

  private static void definitions7(Map<String, Operation> out) {
    out.put(
        "postSchemas",
        new Operation(
            "postSchemas",
            "POST",
            "/schemas",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postServices",
        new Operation(
            "postServices",
            "POST",
            "/services",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postServicesByServiceIdDeploy",
        new Operation(
            "postServicesByServiceIdDeploy",
            "POST",
            "/services/{serviceId}/deploy",
            "json",
            "json",
            false,
            new String[] {"serviceId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postServicesByServiceIdDomains",
        new Operation(
            "postServicesByServiceIdDomains",
            "POST",
            "/services/{serviceId}/domains",
            "json",
            "json",
            true,
            new String[] {"serviceId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postServicesByServiceIdDomainsByDomainIdVerify",
        new Operation(
            "postServicesByServiceIdDomainsByDomainIdVerify",
            "POST",
            "/services/{serviceId}/domains/{domainId}/verify",
            null,
            "json",
            false,
            new String[] {"serviceId", "domainId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postServicesByServiceIdGitConnect",
        new Operation(
            "postServicesByServiceIdGitConnect",
            "POST",
            "/services/{serviceId}/git/connect",
            "json",
            "json",
            true,
            new String[] {"serviceId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postServicesByServiceIdPromote",
        new Operation(
            "postServicesByServiceIdPromote",
            "POST",
            "/services/{serviceId}/promote",
            "json",
            "json",
            true,
            new String[] {"serviceId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postServicesByServiceIdRollback",
        new Operation(
            "postServicesByServiceIdRollback",
            "POST",
            "/services/{serviceId}/rollback",
            "json",
            "json",
            true,
            new String[] {"serviceId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postServicesByServiceIdStop",
        new Operation(
            "postServicesByServiceIdStop",
            "POST",
            "/services/{serviceId}/stop",
            null,
            "json",
            false,
            new String[] {"serviceId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postSsoOrgByOrgIdConfigure",
        new Operation(
            "postSsoOrgByOrgIdConfigure",
            "POST",
            "/sso/org/{orgId}/configure",
            "json",
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postSsoOrgByOrgIdConnectionsByConnectionIdCertificates",
        new Operation(
            "postSsoOrgByOrgIdConnectionsByConnectionIdCertificates",
            "POST",
            "/sso/org/{orgId}/connections/{connectionId}/certificates",
            "json",
            "json",
            false,
            new String[] {"orgId", "connectionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postSsoOrgByOrgIdConnectionsByConnectionIdCertificatesByCertIdPromote",
        new Operation(
            "postSsoOrgByOrgIdConnectionsByConnectionIdCertificatesByCertIdPromote",
            "POST",
            "/sso/org/{orgId}/connections/{connectionId}/certificates/{certId}/promote",
            null,
            "json",
            false,
            new String[] {"orgId", "connectionId", "certId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postSsoOrgByOrgIdConnectionsByConnectionIdDisable",
        new Operation(
            "postSsoOrgByOrgIdConnectionsByConnectionIdDisable",
            "POST",
            "/sso/org/{orgId}/connections/{connectionId}/disable",
            null,
            "json",
            false,
            new String[] {"orgId", "connectionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postSsoOrgByOrgIdConnectionsByConnectionIdEnable",
        new Operation(
            "postSsoOrgByOrgIdConnectionsByConnectionIdEnable",
            "POST",
            "/sso/org/{orgId}/connections/{connectionId}/enable",
            null,
            "json",
            false,
            new String[] {"orgId", "connectionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postSsoOrgByOrgIdConnectionsByConnectionIdMetadataImport",
        new Operation(
            "postSsoOrgByOrgIdConnectionsByConnectionIdMetadataImport",
            "POST",
            "/sso/org/{orgId}/connections/{connectionId}/metadata/import",
            "json",
            "json",
            false,
            new String[] {"orgId", "connectionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postSsoOrgByOrgIdConnectionsByConnectionIdReleaseAccount",
        new Operation(
            "postSsoOrgByOrgIdConnectionsByConnectionIdReleaseAccount",
            "POST",
            "/sso/org/{orgId}/connections/{connectionId}/release-account",
            "json",
            "json",
            false,
            new String[] {"orgId", "connectionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postSsoOrgByOrgIdConnectionsByConnectionIdScimTokens",
        new Operation(
            "postSsoOrgByOrgIdConnectionsByConnectionIdScimTokens",
            "POST",
            "/sso/org/{orgId}/connections/{connectionId}/scim/tokens",
            null,
            "json",
            false,
            new String[] {"orgId", "connectionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postSsoOrgByOrgIdConnectionsByConnectionIdTest",
        new Operation(
            "postSsoOrgByOrgIdConnectionsByConnectionIdTest",
            "POST",
            "/sso/org/{orgId}/connections/{connectionId}/test",
            null,
            "json",
            false,
            new String[] {"orgId", "connectionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postSsoOrgByOrgIdConnectionsByConnectionIdVerifyDomain",
        new Operation(
            "postSsoOrgByOrgIdConnectionsByConnectionIdVerifyDomain",
            "POST",
            "/sso/org/{orgId}/connections/{connectionId}/verify-domain",
            null,
            "json",
            false,
            new String[] {"orgId", "connectionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postSsoOrgByOrgIdOutsideMembersBlockedByUserIdRestore",
        new Operation(
            "postSsoOrgByOrgIdOutsideMembersBlockedByUserIdRestore",
            "POST",
            "/sso/org/{orgId}/outside-members/blocked/{userId}/restore",
            null,
            "json",
            false,
            new String[] {"orgId", "userId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postStatusSubscribe",
        new Operation(
            "postStatusSubscribe",
            "POST",
            "/status/subscribe",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postStorageBuckets",
        new Operation(
            "postStorageBuckets",
            "POST",
            "/storage/buckets",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postStorageBucketsByBucketIdPolicies",
        new Operation(
            "postStorageBucketsByBucketIdPolicies",
            "POST",
            "/storage/buckets/{bucketId}/policies",
            "json",
            "json",
            false,
            new String[] {"bucketId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postStorageBucketsByBucketIdPoliciesByPolicyIdToggle",
        new Operation(
            "postStorageBucketsByBucketIdPoliciesByPolicyIdToggle",
            "POST",
            "/storage/buckets/{bucketId}/policies/{policyId}/toggle",
            null,
            "json",
            false,
            new String[] {"bucketId", "policyId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postStorageBucketsByBucketIdPoliciesSimulate",
        new Operation(
            "postStorageBucketsByBucketIdPoliciesSimulate",
            "POST",
            "/storage/buckets/{bucketId}/policies/simulate",
            "json",
            "json",
            false,
            new String[] {"bucketId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postStorageDownloadUrl",
        new Operation(
            "postStorageDownloadUrl",
            "POST",
            "/storage/download-url",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postStorageFilesCopy",
        new Operation(
            "postStorageFilesCopy",
            "POST",
            "/storage/files/copy",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postStorageFilesDeleteBatch",
        new Operation(
            "postStorageFilesDeleteBatch",
            "POST",
            "/storage/files/delete-batch",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postStorageFilesMove",
        new Operation(
            "postStorageFilesMove",
            "POST",
            "/storage/files/move",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postStorageMultipartByUploadIdAbort",
        new Operation(
            "postStorageMultipartByUploadIdAbort",
            "POST",
            "/storage/multipart/{uploadId}/abort",
            "json",
            "json",
            true,
            new String[] {"uploadId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postStorageMultipartByUploadIdComplete",
        new Operation(
            "postStorageMultipartByUploadIdComplete",
            "POST",
            "/storage/multipart/{uploadId}/complete",
            "json",
            "json",
            true,
            new String[] {"uploadId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postStorageMultipartByUploadIdPartUrl",
        new Operation(
            "postStorageMultipartByUploadIdPartUrl",
            "POST",
            "/storage/multipart/{uploadId}/part-url",
            "json",
            "json",
            true,
            new String[] {"uploadId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postStorageMultipartCreate",
        new Operation(
            "postStorageMultipartCreate",
            "POST",
            "/storage/multipart/create",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postStorageMultipartResume",
        new Operation(
            "postStorageMultipartResume",
            "POST",
            "/storage/multipart/resume",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postStorageUpload",
        new Operation(
            "postStorageUpload",
            "POST",
            "/storage/upload",
            null,
            "json",
            false,
            new String[0],
            new String[] {"bucket", "key"},
            new String[] {"key"},
            new String[0]));
    out.put(
        "postStorageUploadBase64",
        new Operation(
            "postStorageUploadBase64",
            "POST",
            "/storage/upload-base64",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postStorageUploadFromUrl",
        new Operation(
            "postStorageUploadFromUrl",
            "POST",
            "/storage/upload-from-url",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postStorageUploadUrl",
        new Operation(
            "postStorageUploadUrl",
            "POST",
            "/storage/upload-url",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postTemplates",
        new Operation(
            "postTemplates",
            "POST",
            "/templates",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postTemplatesCreateProject",
        new Operation(
            "postTemplatesCreateProject",
            "POST",
            "/templates/create-project",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postTemplatesFromProject",
        new Operation(
            "postTemplatesFromProject",
            "POST",
            "/templates/from-project",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postTemplatesFromProjectPreview",
        new Operation(
            "postTemplatesFromProjectPreview",
            "POST",
            "/templates/from-project/preview",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postTemplatesInstallApply",
        new Operation(
            "postTemplatesInstallApply",
            "POST",
            "/templates/install/apply",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postTemplatesInstallByInstallIdRollback",
        new Operation(
            "postTemplatesInstallByInstallIdRollback",
            "POST",
            "/templates/install/{installId}/rollback",
            null,
            "json",
            false,
            new String[] {"installId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postTemplatesInstallPreview",
        new Operation(
            "postTemplatesInstallPreview",
            "POST",
            "/templates/install/preview",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postUsersMeChangePassword",
        new Operation(
            "postUsersMeChangePassword",
            "POST",
            "/users/me/change-password",
            "json",
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postUsersMeRequestAccountDelete",
        new Operation(
            "postUsersMeRequestAccountDelete",
            "POST",
            "/users/me/request-account-delete",
            null,
            "json",
            false,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postV1DataByProjectIdByTable",
        new Operation(
            "postV1DataByProjectIdByTable",
            "POST",
            "/v1/data/{projectId}/{table}",
            "json",
            "json",
            true,
            new String[] {"projectId", "table"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postV1DataByProjectIdByTableBulk",
        new Operation(
            "postV1DataByProjectIdByTableBulk",
            "POST",
            "/v1/data/{projectId}/{table}/bulk",
            "json",
            "json",
            true,
            new String[] {"projectId", "table"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postV1DataByProjectIdByTableQuery",
        new Operation(
            "postV1DataByProjectIdByTableQuery",
            "POST",
            "/v1/data/{projectId}/{table}/query",
            "json",
            "json",
            true,
            new String[] {"projectId", "table"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "postWebhooksGithub",
        new Operation(
            "postWebhooksGithub",
            "POST",
            "/webhooks/github",
            "json",
            "json",
            false,
            new String[0],
            new String[] {"src"},
            new String[0],
            new String[0]));
    out.put(
        "putAiCopilotSessionBySessionIdEditorFiles",
        new Operation(
            "putAiCopilotSessionBySessionIdEditorFiles",
            "PUT",
            "/ai/copilot/session/{sessionId}/editor-files",
            "json",
            "json",
            true,
            new String[] {"sessionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "putAlertRulesByRuleId",
        new Operation(
            "putAlertRulesByRuleId",
            "PUT",
            "/alert-rules/{ruleId}",
            "json",
            "json",
            false,
            new String[] {"ruleId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "putBillingOrgByOrgIdCreditsAutoTopup",
        new Operation(
            "putBillingOrgByOrgIdCreditsAutoTopup",
            "PUT",
            "/billing/org/{orgId}/credits/auto-topup",
            "json",
            "json",
            true,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "putBillingOrgByOrgIdFounderWall",
        new Operation(
            "putBillingOrgByOrgIdFounderWall",
            "PUT",
            "/billing/org/{orgId}/founder/wall",
            "json",
            "json",
            true,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "putBillingOrgByOrgIdTaxInfo",
        new Operation(
            "putBillingOrgByOrgIdTaxInfo",
            "PUT",
            "/billing/org/{orgId}/tax-info",
            "json",
            "json",
            true,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "putBucketsByBucketId",
        new Operation(
            "putBucketsByBucketId",
            "PUT",
            "/buckets/{bucketId}",
            "json",
            "json",
            true,
            new String[] {"bucketId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "putFunctionsByFunctionIdSchedule",
        new Operation(
            "putFunctionsByFunctionIdSchedule",
            "PUT",
            "/functions/{functionId}/schedule",
            "json",
            "json",
            true,
            new String[] {"functionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "putFunctionsByFunctionIdSource",
        new Operation(
            "putFunctionsByFunctionIdSource",
            "PUT",
            "/functions/{functionId}/source",
            "json",
            "json",
            true,
            new String[] {"functionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "putFunctionsSecretsBySecretId",
        new Operation(
            "putFunctionsSecretsBySecretId",
            "PUT",
            "/functions/secrets/{secretId}",
            "json",
            "json",
            true,
            new String[] {"secretId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "putMeConsoleLook",
        new Operation(
            "putMeConsoleLook",
            "PUT",
            "/me/console-look",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "putMeEarlyWall",
        new Operation(
            "putMeEarlyWall",
            "PUT",
            "/me/early/wall",
            "json",
            "json",
            true,
            new String[0],
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "putProjectsByProjectIdAuthOauthAppsByProvider",
        new Operation(
            "putProjectsByProjectIdAuthOauthAppsByProvider",
            "PUT",
            "/projects/{projectId}/auth/oauth-apps/{provider}",
            "json",
            "json",
            true,
            new String[] {"projectId", "provider"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "putProjectsByProjectIdEnvironmentsPromotionOrder",
        new Operation(
            "putProjectsByProjectIdEnvironmentsPromotionOrder",
            "PUT",
            "/projects/{projectId}/environments/promotion-order",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "putProjectsByProjectIdFrontend",
        new Operation(
            "putProjectsByProjectIdFrontend",
            "PUT",
            "/projects/{projectId}/frontend",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "putProjectsByProjectIdGettingStartedHidden",
        new Operation(
            "putProjectsByProjectIdGettingStartedHidden",
            "PUT",
            "/projects/{projectId}/getting-started/hidden",
            "json",
            "json",
            false,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "putProjectsByProjectIdMembers",
        new Operation(
            "putProjectsByProjectIdMembers",
            "PUT",
            "/projects/{projectId}/members",
            "json",
            "json",
            true,
            new String[] {"projectId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "putProjectsByProjectIdMembersByUserId",
        new Operation(
            "putProjectsByProjectIdMembersByUserId",
            "PUT",
            "/projects/{projectId}/members/{userId}",
            "json",
            "json",
            false,
            new String[] {"projectId", "userId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "putSsoOrgByOrgIdConnectionsByConnectionIdBreakGlass",
        new Operation(
            "putSsoOrgByOrgIdConnectionsByConnectionIdBreakGlass",
            "PUT",
            "/sso/org/{orgId}/connections/{connectionId}/break-glass",
            "json",
            "json",
            false,
            new String[] {"orgId", "connectionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "putSsoOrgByOrgIdConnectionsByConnectionIdGroupMappings",
        new Operation(
            "putSsoOrgByOrgIdConnectionsByConnectionIdGroupMappings",
            "PUT",
            "/sso/org/{orgId}/connections/{connectionId}/group-mappings",
            "json",
            "json",
            false,
            new String[] {"orgId", "connectionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "putSsoOrgByOrgIdConnectionsByConnectionIdRequire",
        new Operation(
            "putSsoOrgByOrgIdConnectionsByConnectionIdRequire",
            "PUT",
            "/sso/org/{orgId}/connections/{connectionId}/require",
            "json",
            "json",
            false,
            new String[] {"orgId", "connectionId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "putSsoOrgByOrgIdOutsideMembersAllow",
        new Operation(
            "putSsoOrgByOrgIdOutsideMembersAllow",
            "PUT",
            "/sso/org/{orgId}/outside-members/allow",
            "json",
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "putSsoOrgByOrgIdOutsideMembersPolicy",
        new Operation(
            "putSsoOrgByOrgIdOutsideMembersPolicy",
            "PUT",
            "/sso/org/{orgId}/outside-members/policy",
            "json",
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "putSsoOrgByOrgIdSecurityContact",
        new Operation(
            "putSsoOrgByOrgIdSecurityContact",
            "PUT",
            "/sso/org/{orgId}/security-contact",
            "json",
            "json",
            false,
            new String[] {"orgId"},
            new String[0],
            new String[0],
            new String[0]));
    out.put(
        "putStorageBucketsByBucketIdPoliciesByPolicyId",
        new Operation(
            "putStorageBucketsByBucketIdPoliciesByPolicyId",
            "PUT",
            "/storage/buckets/{bucketId}/policies/{policyId}",
            "json",
            "json",
            false,
            new String[] {"bucketId", "policyId"},
            new String[0],
            new String[0],
            new String[0]));
  }

  /**
   * Sends a blocking DELETE request to {@code /ai/copilot/session/{sessionId}}.
   *
   * <p>Required path parameters: sessionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteAiCopilotSessionBySessionId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteAiCopilotSessionBySessionId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /alert-rules/{ruleId}}.
   *
   * <p>Required path parameters: ruleId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteAlertRulesByRuleId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteAlertRulesByRuleId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /auth/me/linked-accounts/{provider}}.
   *
   * <p>Required path parameters: provider. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteAuthMeLinkedAccountsByProvider(OperationRequest request) {
    return call(DEFINITIONS.get("deleteAuthMeLinkedAccountsByProvider"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /auth/sessions/{id}}.
   *
   * <p>Required path parameters: id. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteAuthSessionsById(OperationRequest request) {
    return call(DEFINITIONS.get("deleteAuthSessionsById"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /billing/org/{orgId}/addons/{addonId}}.
   *
   * <p>Required path parameters: orgId, addonId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteBillingOrgByOrgIdAddonsByAddonId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteBillingOrgByOrgIdAddonsByAddonId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /billing/org/{orgId}/contacts/{contactId}}.
   *
   * <p>Required path parameters: orgId, contactId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteBillingOrgByOrgIdContactsByContactId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteBillingOrgByOrgIdContactsByContactId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /billing/org/{orgId}/usage-alerts/{alertId}}.
   *
   * <p>Required path parameters: orgId, alertId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteBillingOrgByOrgIdUsageAlertsByAlertId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteBillingOrgByOrgIdUsageAlertsByAlertId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /buckets/{bucketId}}.
   *
   * <p>Required path parameters: bucketId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteBucketsByBucketId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteBucketsByBucketId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /buckets/{bucketId}/files}.
   *
   * <p>Required path parameters: bucketId. Query parameters: key (required). Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteBucketsByBucketIdFiles(OperationRequest request) {
    return call(DEFINITIONS.get("deleteBucketsByBucketIdFiles"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /database/extensions/project/{projectId}/{extensionId}}.
   *
   * <p>Required path parameters: projectId, extensionId. Query parameters: envId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteDatabaseExtensionsProjectByProjectIdByExtensionId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteDatabaseExtensionsProjectByProjectIdByExtensionId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /database/wrappers/project/{projectId}/{wrapperId}}.
   *
   * <p>Required path parameters: projectId, wrapperId. Query parameters: envId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteDatabaseWrappersProjectByProjectIdByWrapperId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteDatabaseWrappersProjectByProjectIdByWrapperId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /functions/{functionId}}.
   *
   * <p>Required path parameters: functionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteFunctionsByFunctionId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteFunctionsByFunctionId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /functions/{functionId}/schedule}.
   *
   * <p>Required path parameters: functionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteFunctionsByFunctionIdSchedule(OperationRequest request) {
    return call(DEFINITIONS.get("deleteFunctionsByFunctionIdSchedule"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /functions/secrets/{secretId}}.
   *
   * <p>Required path parameters: secretId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteFunctionsSecretsBySecretId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteFunctionsSecretsBySecretId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /functions/triggers/{triggerId}}.
   *
   * <p>Required path parameters: triggerId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteFunctionsTriggersByTriggerId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteFunctionsTriggersByTriggerId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /generated/{table}/bulk}.
   *
   * <p>Required path parameters: table. Query parameters: where, filter, whereField, whereValue, ids. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteGeneratedByTableBulk(OperationRequest request) {
    return call(DEFINITIONS.get("deleteGeneratedByTableBulk"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /generated/{table}/{id}}.
   *
   * <p>Required path parameters: table, id. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteGeneratedByTableById(OperationRequest request) {
    return call(DEFINITIONS.get("deleteGeneratedByTableById"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /integrations/subscriptions/{id}}.
   *
   * <p>Required path parameters: id. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteIntegrationsSubscriptionsById(OperationRequest request) {
    return call(DEFINITIONS.get("deleteIntegrationsSubscriptionsById"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /mcp/connections/{id}}.
   *
   * <p>Required path parameters: id. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteMcpConnectionsById(OperationRequest request) {
    return call(DEFINITIONS.get("deleteMcpConnectionsById"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /mongodb/{collection}/indexes/{indexName}}.
   *
   * <p>Required path parameters: collection, indexName. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteMongodbByCollectionIndexesByIndexName(OperationRequest request) {
    return call(DEFINITIONS.get("deleteMongodbByCollectionIndexesByIndexName"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /mongodb/collections/{name}}.
   *
   * <p>Required path parameters: name. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteMongodbCollectionsByName(OperationRequest request) {
    return call(DEFINITIONS.get("deleteMongodbCollectionsByName"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /oauth/org/{orgId}/provider/{provider}}.
   *
   * <p>Required path parameters: orgId, provider. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteOauthOrgByOrgIdProviderByProvider(OperationRequest request) {
    return call(DEFINITIONS.get("deleteOauthOrgByOrgIdProviderByProvider"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /orgs/{orgId}/invites/{inviteId}}.
   *
   * <p>Required path parameters: orgId, inviteId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteOrgsByOrgIdInvitesByInviteId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteOrgsByOrgIdInvitesByInviteId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /orgs/{orgId}/leave-requests/mine}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteOrgsByOrgIdLeaveRequestsMine(OperationRequest request) {
    return call(DEFINITIONS.get("deleteOrgsByOrgIdLeaveRequestsMine"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /orgs/{orgId}/members/{userId}}.
   *
   * <p>Required path parameters: orgId, userId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteOrgsByOrgIdMembersByUserId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteOrgsByOrgIdMembersByUserId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /orgs/{orgId}/transfers/{id}}.
   *
   * <p>Required path parameters: orgId, id. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteOrgsByOrgIdTransfersById(OperationRequest request) {
    return call(DEFINITIONS.get("deleteOrgsByOrgIdTransfersById"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /projects/{projectId}}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteProjectsByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteProjectsByProjectId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /projects/{projectId}/auth/oauth-apps/{provider}}.
   *
   * <p>Required path parameters: projectId, provider. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteProjectsByProjectIdAuthOauthAppsByProvider(OperationRequest request) {
    return call(DEFINITIONS.get("deleteProjectsByProjectIdAuthOauthAppsByProvider"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /projects/{projectId}/auth/sessions}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteProjectsByProjectIdAuthSessions(OperationRequest request) {
    return call(DEFINITIONS.get("deleteProjectsByProjectIdAuthSessions"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /projects/{projectId}/auth/sessions/{id}}.
   *
   * <p>Required path parameters: projectId, id. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteProjectsByProjectIdAuthSessionsById(OperationRequest request) {
    return call(DEFINITIONS.get("deleteProjectsByProjectIdAuthSessionsById"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /projects/{projectId}/branches/{branchName}}.
   *
   * <p>Required path parameters: projectId, branchName. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteProjectsByProjectIdBranchesByBranchName(OperationRequest request) {
    return call(DEFINITIONS.get("deleteProjectsByProjectIdBranchesByBranchName"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /projects/{projectId}/database/dedicated}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteProjectsByProjectIdDatabaseDedicated(OperationRequest request) {
    return call(DEFINITIONS.get("deleteProjectsByProjectIdDatabaseDedicated"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /projects/{projectId}/env-vars/{envVarId}}.
   *
   * <p>Required path parameters: projectId, envVarId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteProjectsByProjectIdEnvVarsByEnvVarId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteProjectsByProjectIdEnvVarsByEnvVarId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /projects/{projectId}/environments/{envId}}.
   *
   * <p>Required path parameters: projectId, envId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteProjectsByProjectIdEnvironmentsByEnvId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteProjectsByProjectIdEnvironmentsByEnvId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /projects/{projectId}/environments/{envId}/domains/{domainId}}.
   *
   * <p>Required path parameters: projectId, envId, domainId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteProjectsByProjectIdEnvironmentsByEnvIdDomainsByDomainId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteProjectsByProjectIdEnvironmentsByEnvIdDomainsByDomainId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /projects/{projectId}/github/disconnect}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteProjectsByProjectIdGithubDisconnect(OperationRequest request) {
    return call(DEFINITIONS.get("deleteProjectsByProjectIdGithubDisconnect"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /projects/{projectId}/infrastructure/{instanceId}}.
   *
   * <p>Required path parameters: projectId, instanceId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteProjectsByProjectIdInfrastructureByInstanceId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteProjectsByProjectIdInfrastructureByInstanceId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /projects/{projectId}/members/{userId}}.
   *
   * <p>Required path parameters: projectId, userId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteProjectsByProjectIdMembersByUserId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteProjectsByProjectIdMembersByUserId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /projects/{projectId}/users/{userId}}.
   *
   * <p>Required path parameters: projectId, userId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteProjectsByProjectIdUsersByUserId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteProjectsByProjectIdUsersByUserId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /projects/{projectId}/users/{userId}/sessions/{sessionId}}.
   *
   * <p>Required path parameters: projectId, userId, sessionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteProjectsByProjectIdUsersByUserIdSessionsBySessionId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteProjectsByProjectIdUsersByUserIdSessionsBySessionId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /rls/policies/{policyId}}.
   *
   * <p>Required path parameters: policyId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteRlsPoliciesByPolicyId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteRlsPoliciesByPolicyId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /schema-engine/snippets/{projectId}/{snippetId}}.
   *
   * <p>Required path parameters: projectId, snippetId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteSchemaEngineSnippetsByProjectIdBySnippetId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteSchemaEngineSnippetsByProjectIdBySnippetId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /services/{serviceId}}.
   *
   * <p>Required path parameters: serviceId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteServicesByServiceId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteServicesByServiceId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /services/{serviceId}/domains/{domainId}}.
   *
   * <p>Required path parameters: serviceId, domainId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteServicesByServiceIdDomainsByDomainId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteServicesByServiceIdDomainsByDomainId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /services/{serviceId}/git/connect}.
   *
   * <p>Required path parameters: serviceId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteServicesByServiceIdGitConnect(OperationRequest request) {
    return call(DEFINITIONS.get("deleteServicesByServiceIdGitConnect"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /sso/org/{orgId}/connections/{connectionId}}.
   *
   * <p>Required path parameters: orgId, connectionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteSsoOrgByOrgIdConnectionsByConnectionId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteSsoOrgByOrgIdConnectionsByConnectionId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /sso/org/{orgId}/connections/{connectionId}/certificates/{certId}}.
   *
   * <p>Required path parameters: orgId, connectionId, certId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteSsoOrgByOrgIdConnectionsByConnectionIdCertificatesByCertId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteSsoOrgByOrgIdConnectionsByConnectionIdCertificatesByCertId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /sso/org/{orgId}/connections/{connectionId}/identities/{userId}}.
   *
   * <p>Required path parameters: orgId, connectionId, userId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteSsoOrgByOrgIdConnectionsByConnectionIdIdentitiesByUserId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteSsoOrgByOrgIdConnectionsByConnectionIdIdentitiesByUserId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /sso/org/{orgId}/connections/{connectionId}/scim/tokens/{tokenId}}.
   *
   * <p>Required path parameters: orgId, connectionId, tokenId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteSsoOrgByOrgIdConnectionsByConnectionIdScimTokensByTokenId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteSsoOrgByOrgIdConnectionsByConnectionIdScimTokensByTokenId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /sso/org/{orgId}/outside-members/allow/{allowId}}.
   *
   * <p>Required path parameters: orgId, allowId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteSsoOrgByOrgIdOutsideMembersAllowByAllowId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteSsoOrgByOrgIdOutsideMembersAllowByAllowId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /sso/org/{orgId}/security-contact}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteSsoOrgByOrgIdSecurityContact(OperationRequest request) {
    return call(DEFINITIONS.get("deleteSsoOrgByOrgIdSecurityContact"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /storage/buckets/{bucketId}/policies/{policyId}}.
   *
   * <p>Required path parameters: bucketId, policyId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteStorageBucketsByBucketIdPoliciesByPolicyId(OperationRequest request) {
    return call(DEFINITIONS.get("deleteStorageBucketsByBucketIdPoliciesByPolicyId"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /templates/{id}}.
   *
   * <p>Required path parameters: id. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteTemplatesById(OperationRequest request) {
    return call(DEFINITIONS.get("deleteTemplatesById"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /v1/data/{projectId}/{table}/bulk}.
   *
   * <p>Required path parameters: projectId, table. Query parameters: where, filter, whereField, whereValue, ids. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteV1DataByProjectIdByTableBulk(OperationRequest request) {
    return call(DEFINITIONS.get("deleteV1DataByProjectIdByTableBulk"), request);
  }

  /**
   * Sends a blocking DELETE request to {@code /v1/data/{projectId}/{table}/{id}}.
   *
   * <p>Required path parameters: projectId, table, id. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object deleteV1DataByProjectIdByTableById(OperationRequest request) {
    return call(DEFINITIONS.get("deleteV1DataByProjectIdByTableById"), request);
  }

  /**
   * Sends a blocking GET request to {@code /}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getRoot(OperationRequest request) {
    return call(DEFINITIONS.get("getRoot"), request);
  }

  /**
   * Sends a blocking GET request to {@code /}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getRoot() {
    return getRoot(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /activation/org/{orgId}}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getActivationOrgByOrgId(OperationRequest request) {
    return call(DEFINITIONS.get("getActivationOrgByOrgId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai/copilot/autocomplete}.
   *
   * <p>Query parameters: projectId (required), q, kinds, envId, limit. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiCopilotAutocomplete(OperationRequest request) {
    return call(DEFINITIONS.get("getAiCopilotAutocomplete"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai/copilot/context-summary/{projectId}}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiCopilotContextSummaryByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getAiCopilotContextSummaryByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai/copilot/credit-status/{projectId}}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiCopilotCreditStatusByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getAiCopilotCreditStatusByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai/copilot/deploy/{deployId}}.
   *
   * <p>Required path parameters: deployId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiCopilotDeployByDeployId(OperationRequest request) {
    return call(DEFINITIONS.get("getAiCopilotDeployByDeployId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai/copilot/deploy/history/{projectId}}.
   *
   * <p>Required path parameters: projectId. Query parameters: limit, offset, status. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiCopilotDeployHistoryByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getAiCopilotDeployHistoryByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai/copilot/execution/{executionId}}.
   *
   * <p>Required path parameters: executionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiCopilotExecutionByExecutionId(OperationRequest request) {
    return call(DEFINITIONS.get("getAiCopilotExecutionByExecutionId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai/copilot/executions/{sessionId}}.
   *
   * <p>Required path parameters: sessionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiCopilotExecutionsBySessionId(OperationRequest request) {
    return call(DEFINITIONS.get("getAiCopilotExecutionsBySessionId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai/copilot/git/branches/{sessionId}}.
   *
   * <p>Required path parameters: sessionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiCopilotGitBranchesBySessionId(OperationRequest request) {
    return call(DEFINITIONS.get("getAiCopilotGitBranchesBySessionId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai/copilot/git/files/{sessionId}}.
   *
   * <p>Required path parameters: sessionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiCopilotGitFilesBySessionId(OperationRequest request) {
    return call(DEFINITIONS.get("getAiCopilotGitFilesBySessionId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai/copilot/git/log/{sessionId}}.
   *
   * <p>Required path parameters: sessionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiCopilotGitLogBySessionId(OperationRequest request) {
    return call(DEFINITIONS.get("getAiCopilotGitLogBySessionId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai/copilot/git/status/{sessionId}}.
   *
   * <p>Required path parameters: sessionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiCopilotGitStatusBySessionId(OperationRequest request) {
    return call(DEFINITIONS.get("getAiCopilotGitStatusBySessionId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai/copilot/job/{jobId}}.
   *
   * <p>Required path parameters: jobId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiCopilotJobByJobId(OperationRequest request) {
    return call(DEFINITIONS.get("getAiCopilotJobByJobId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai/copilot/manifest/{manifestId}}.
   *
   * <p>Required path parameters: manifestId. Query parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiCopilotManifestByManifestId(OperationRequest request) {
    return call(DEFINITIONS.get("getAiCopilotManifestByManifestId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai/copilot/metrics/{projectId}}.
   *
   * <p>Required path parameters: projectId. Query parameters: range. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiCopilotMetricsByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getAiCopilotMetricsByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai/copilot/metrics/org/{orgId}}.
   *
   * <p>Required path parameters: orgId. Query parameters: range. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiCopilotMetricsOrgByOrgId(OperationRequest request) {
    return call(DEFINITIONS.get("getAiCopilotMetricsOrgByOrgId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai/copilot/models/{projectId}}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiCopilotModelsByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getAiCopilotModelsByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai/copilot/session/{sessionId}}.
   *
   * <p>Required path parameters: sessionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiCopilotSessionBySessionId(OperationRequest request) {
    return call(DEFINITIONS.get("getAiCopilotSessionBySessionId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai/copilot/session/{sessionId}/editor-files}.
   *
   * <p>Required path parameters: sessionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiCopilotSessionBySessionIdEditorFiles(OperationRequest request) {
    return call(DEFINITIONS.get("getAiCopilotSessionBySessionIdEditorFiles"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai/copilot/session/{sessionId}/workspace/export}.
   *
   * <p>Required path parameters: sessionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiCopilotSessionBySessionIdWorkspaceExport(OperationRequest request) {
    return call(DEFINITIONS.get("getAiCopilotSessionBySessionIdWorkspaceExport"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai/copilot/session/{sessionId}/workspace/status}.
   *
   * <p>Required path parameters: sessionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiCopilotSessionBySessionIdWorkspaceStatus(OperationRequest request) {
    return call(DEFINITIONS.get("getAiCopilotSessionBySessionIdWorkspaceStatus"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai/copilot/session/{sessionId}/workspace/types}.
   *
   * <p>Required path parameters: sessionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiCopilotSessionBySessionIdWorkspaceTypes(OperationRequest request) {
    return call(DEFINITIONS.get("getAiCopilotSessionBySessionIdWorkspaceTypes"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai/copilot/sessions/{projectId}}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiCopilotSessionsByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getAiCopilotSessionsByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai/copilot/usage/{projectId}}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiCopilotUsageByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getAiCopilotUsageByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai/copilot/usage-org/{orgId}}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiCopilotUsageOrgByOrgId(OperationRequest request) {
    return call(DEFINITIONS.get("getAiCopilotUsageOrgByOrgId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai/copilot/version/{versionId}}.
   *
   * <p>Required path parameters: versionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiCopilotVersionByVersionId(OperationRequest request) {
    return call(DEFINITIONS.get("getAiCopilotVersionByVersionId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai/copilot/version/{versionId}/diff/{compareVersionId}}.
   *
   * <p>Required path parameters: versionId, compareVersionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiCopilotVersionByVersionIdDiffByCompareVersionId(OperationRequest request) {
    return call(DEFINITIONS.get("getAiCopilotVersionByVersionIdDiffByCompareVersionId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai/copilot/versions/{sessionId}}.
   *
   * <p>Required path parameters: sessionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiCopilotVersionsBySessionId(OperationRequest request) {
    return call(DEFINITIONS.get("getAiCopilotVersionsBySessionId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai-usage/org/{orgId}/breakdown}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiUsageOrgByOrgIdBreakdown(OperationRequest request) {
    return call(DEFINITIONS.get("getAiUsageOrgByOrgIdBreakdown"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai-usage/org/{orgId}/exhaustion-events}.
   *
   * <p>Required path parameters: orgId. Query parameters: limit. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiUsageOrgByOrgIdExhaustionEvents(OperationRequest request) {
    return call(DEFINITIONS.get("getAiUsageOrgByOrgIdExhaustionEvents"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai-usage/org/{orgId}/history}.
   *
   * <p>Required path parameters: orgId. Query parameters: days. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiUsageOrgByOrgIdHistory(OperationRequest request) {
    return call(DEFINITIONS.get("getAiUsageOrgByOrgIdHistory"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai-usage/org/{orgId}/recent}.
   *
   * <p>Required path parameters: orgId. Query parameters: limit, offset. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiUsageOrgByOrgIdRecent(OperationRequest request) {
    return call(DEFINITIONS.get("getAiUsageOrgByOrgIdRecent"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai-usage/org/{orgId}/rollups}.
   *
   * <p>Required path parameters: orgId. Query parameters: limit. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiUsageOrgByOrgIdRollups(OperationRequest request) {
    return call(DEFINITIONS.get("getAiUsageOrgByOrgIdRollups"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai-usage/org/{orgId}/summary}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiUsageOrgByOrgIdSummary(OperationRequest request) {
    return call(DEFINITIONS.get("getAiUsageOrgByOrgIdSummary"), request);
  }

  /**
   * Sends a blocking GET request to {@code /ai-usage/org/{orgId}/verament}.
   *
   * <p>Required path parameters: orgId. Query parameters: period. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAiUsageOrgByOrgIdVerament(OperationRequest request) {
    return call(DEFINITIONS.get("getAiUsageOrgByOrgIdVerament"), request);
  }

  /**
   * Sends a blocking GET request to {@code /alert-rules/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAlertRulesProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getAlertRulesProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /announcements}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAnnouncements(OperationRequest request) {
    return call(DEFINITIONS.get("getAnnouncements"), request);
  }

  /**
   * Sends a blocking GET request to {@code /announcements}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getAnnouncements() {
    return getAnnouncements(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /audit/org/{orgId}}.
   *
   * <p>Required path parameters: orgId. Query parameters: projectId, actorId, action, q, since, until, before, limit. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAuditOrgByOrgId(OperationRequest request) {
    return call(DEFINITIONS.get("getAuditOrgByOrgId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /audit/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAuditProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getAuditProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /auth/me}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAuthMe(OperationRequest request) {
    return call(DEFINITIONS.get("getAuthMe"), request);
  }

  /**
   * Sends a blocking GET request to {@code /auth/me}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getAuthMe() {
    return getAuthMe(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /auth/me/admin}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAuthMeAdmin(OperationRequest request) {
    return call(DEFINITIONS.get("getAuthMeAdmin"), request);
  }

  /**
   * Sends a blocking GET request to {@code /auth/me/admin}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getAuthMeAdmin() {
    return getAuthMeAdmin(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /auth/me/context}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAuthMeContext(OperationRequest request) {
    return call(DEFINITIONS.get("getAuthMeContext"), request);
  }

  /**
   * Sends a blocking GET request to {@code /auth/me/context}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getAuthMeContext() {
    return getAuthMeContext(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /auth/me/linked-accounts}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAuthMeLinkedAccounts(OperationRequest request) {
    return call(DEFINITIONS.get("getAuthMeLinkedAccounts"), request);
  }

  /**
   * Sends a blocking GET request to {@code /auth/me/linked-accounts}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getAuthMeLinkedAccounts() {
    return getAuthMeLinkedAccounts(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /auth/mfa/status}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAuthMfaStatus(OperationRequest request) {
    return call(DEFINITIONS.get("getAuthMfaStatus"), request);
  }

  /**
   * Sends a blocking GET request to {@code /auth/mfa/status}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getAuthMfaStatus() {
    return getAuthMfaStatus(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /auth/oauth/providers}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAuthOauthProviders(OperationRequest request) {
    return call(DEFINITIONS.get("getAuthOauthProviders"), request);
  }

  /**
   * Sends a blocking GET request to {@code /auth/oauth/providers}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getAuthOauthProviders() {
    return getAuthOauthProviders(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /auth/session}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAuthSession(OperationRequest request) {
    return call(DEFINITIONS.get("getAuthSession"), request);
  }

  /**
   * Sends a blocking GET request to {@code /auth/session}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getAuthSession() {
    return getAuthSession(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /auth/sessions}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAuthSessions(OperationRequest request) {
    return call(DEFINITIONS.get("getAuthSessions"), request);
  }

  /**
   * Sends a blocking GET request to {@code /auth/sessions}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getAuthSessions() {
    return getAuthSessions(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /auth/tenant/session}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getAuthTenantSession(OperationRequest request) {
    return call(DEFINITIONS.get("getAuthTenantSession"), request);
  }

  /**
   * Sends a blocking GET request to {@code /auth/tenant/session}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getAuthTenantSession() {
    return getAuthTenantSession(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /billing/addons/catalog}.
   *
   * <p>Query parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBillingAddonsCatalog(OperationRequest request) {
    return call(DEFINITIONS.get("getBillingAddonsCatalog"), request);
  }

  /**
   * Sends a blocking GET request to {@code /billing/addons/catalog}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getBillingAddonsCatalog() {
    return getBillingAddonsCatalog(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /billing/checkout/verify/{sessionId}}.
   *
   * <p>Required path parameters: sessionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBillingCheckoutVerifyBySessionId(OperationRequest request) {
    return call(DEFINITIONS.get("getBillingCheckoutVerifyBySessionId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /billing/credits/packages}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBillingCreditsPackages(OperationRequest request) {
    return call(DEFINITIONS.get("getBillingCreditsPackages"), request);
  }

  /**
   * Sends a blocking GET request to {@code /billing/credits/packages}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getBillingCreditsPackages() {
    return getBillingCreditsPackages(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /billing/credits/rates}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBillingCreditsRates(OperationRequest request) {
    return call(DEFINITIONS.get("getBillingCreditsRates"), request);
  }

  /**
   * Sends a blocking GET request to {@code /billing/credits/rates}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getBillingCreditsRates() {
    return getBillingCreditsRates(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /billing/founders/wall}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBillingFoundersWall(OperationRequest request) {
    return call(DEFINITIONS.get("getBillingFoundersWall"), request);
  }

  /**
   * Sends a blocking GET request to {@code /billing/founders/wall}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getBillingFoundersWall() {
    return getBillingFoundersWall(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /billing/org/{orgId}/addons}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBillingOrgByOrgIdAddons(OperationRequest request) {
    return call(DEFINITIONS.get("getBillingOrgByOrgIdAddons"), request);
  }

  /**
   * Sends a blocking GET request to {@code /billing/org/{orgId}/card-check}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBillingOrgByOrgIdCardCheck(OperationRequest request) {
    return call(DEFINITIONS.get("getBillingOrgByOrgIdCardCheck"), request);
  }

  /**
   * Sends a blocking GET request to {@code /billing/org/{orgId}/contacts}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBillingOrgByOrgIdContacts(OperationRequest request) {
    return call(DEFINITIONS.get("getBillingOrgByOrgIdContacts"), request);
  }

  /**
   * Sends a blocking GET request to {@code /billing/org/{orgId}/cost-breakdown}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBillingOrgByOrgIdCostBreakdown(OperationRequest request) {
    return call(DEFINITIONS.get("getBillingOrgByOrgIdCostBreakdown"), request);
  }

  /**
   * Sends a blocking GET request to {@code /billing/org/{orgId}/credits/auto-topup}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBillingOrgByOrgIdCreditsAutoTopup(OperationRequest request) {
    return call(DEFINITIONS.get("getBillingOrgByOrgIdCreditsAutoTopup"), request);
  }

  /**
   * Sends a blocking GET request to {@code /billing/org/{orgId}/credits/transactions}.
   *
   * <p>Required path parameters: orgId. Query parameters: type, period, before, limit. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBillingOrgByOrgIdCreditsTransactions(OperationRequest request) {
    return call(DEFINITIONS.get("getBillingOrgByOrgIdCreditsTransactions"), request);
  }

  /**
   * Sends a blocking GET request to {@code /billing/org/{orgId}/founder}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBillingOrgByOrgIdFounder(OperationRequest request) {
    return call(DEFINITIONS.get("getBillingOrgByOrgIdFounder"), request);
  }

  /**
   * Sends a blocking GET request to {@code /billing/org/{orgId}/hosting}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBillingOrgByOrgIdHosting(OperationRequest request) {
    return call(DEFINITIONS.get("getBillingOrgByOrgIdHosting"), request);
  }

  /**
   * Sends a blocking GET request to {@code /billing/org/{orgId}/infrastructure}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBillingOrgByOrgIdInfrastructure(OperationRequest request) {
    return call(DEFINITIONS.get("getBillingOrgByOrgIdInfrastructure"), request);
  }

  /**
   * Sends a blocking GET request to {@code /billing/org/{orgId}/invoices}.
   *
   * <p>Required path parameters: orgId. Query parameters: q, status, since, until, startingAfter, limit. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBillingOrgByOrgIdInvoices(OperationRequest request) {
    return call(DEFINITIONS.get("getBillingOrgByOrgIdInvoices"), request);
  }

  /**
   * Sends a blocking GET request to {@code /billing/org/{orgId}/overages}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBillingOrgByOrgIdOverages(OperationRequest request) {
    return call(DEFINITIONS.get("getBillingOrgByOrgIdOverages"), request);
  }

  /**
   * Sends a blocking GET request to {@code /billing/org/{orgId}/overages/history}.
   *
   * <p>Required path parameters: orgId. Query parameters: limit. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBillingOrgByOrgIdOveragesHistory(OperationRequest request) {
    return call(DEFINITIONS.get("getBillingOrgByOrgIdOveragesHistory"), request);
  }

  /**
   * Sends a blocking GET request to {@code /billing/org/{orgId}/subscription}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBillingOrgByOrgIdSubscription(OperationRequest request) {
    return call(DEFINITIONS.get("getBillingOrgByOrgIdSubscription"), request);
  }

  /**
   * Sends a blocking GET request to {@code /billing/org/{orgId}/summary}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBillingOrgByOrgIdSummary(OperationRequest request) {
    return call(DEFINITIONS.get("getBillingOrgByOrgIdSummary"), request);
  }

  /**
   * Sends a blocking GET request to {@code /billing/org/{orgId}/tax-info}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBillingOrgByOrgIdTaxInfo(OperationRequest request) {
    return call(DEFINITIONS.get("getBillingOrgByOrgIdTaxInfo"), request);
  }

  /**
   * Sends a blocking GET request to {@code /billing/org/{orgId}/usage}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBillingOrgByOrgIdUsage(OperationRequest request) {
    return call(DEFINITIONS.get("getBillingOrgByOrgIdUsage"), request);
  }

  /**
   * Sends a blocking GET request to {@code /billing/org/{orgId}/usage-alerts}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBillingOrgByOrgIdUsageAlerts(OperationRequest request) {
    return call(DEFINITIONS.get("getBillingOrgByOrgIdUsageAlerts"), request);
  }

  /**
   * Sends a blocking GET request to {@code /billing/org/{orgId}/usage-alerts/configured}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBillingOrgByOrgIdUsageAlertsConfigured(OperationRequest request) {
    return call(DEFINITIONS.get("getBillingOrgByOrgIdUsageAlertsConfigured"), request);
  }

  /**
   * Sends a blocking GET request to {@code /billing/org/{orgId}/usage-alerts/history}.
   *
   * <p>Required path parameters: orgId. Query parameters: limit, before. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBillingOrgByOrgIdUsageAlertsHistory(OperationRequest request) {
    return call(DEFINITIONS.get("getBillingOrgByOrgIdUsageAlertsHistory"), request);
  }

  /**
   * Sends a blocking GET request to {@code /billing/org/{orgId}/usage/history}.
   *
   * <p>Required path parameters: orgId. Query parameters: months. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBillingOrgByOrgIdUsageHistory(OperationRequest request) {
    return call(DEFINITIONS.get("getBillingOrgByOrgIdUsageHistory"), request);
  }

  /**
   * Sends a blocking GET request to {@code /billing/org/{orgId}/usage/realtime}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBillingOrgByOrgIdUsageRealtime(OperationRequest request) {
    return call(DEFINITIONS.get("getBillingOrgByOrgIdUsageRealtime"), request);
  }

  /**
   * Sends a blocking GET request to {@code /billing/plans}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBillingPlans(OperationRequest request) {
    return call(DEFINITIONS.get("getBillingPlans"), request);
  }

  /**
   * Sends a blocking GET request to {@code /billing/plans}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getBillingPlans() {
    return getBillingPlans(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /bootstrap}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBootstrap(OperationRequest request) {
    return call(DEFINITIONS.get("getBootstrap"), request);
  }

  /**
   * Sends a blocking GET request to {@code /bootstrap}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getBootstrap() {
    return getBootstrap(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /buckets/{bucketId}}.
   *
   * <p>Required path parameters: bucketId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBucketsByBucketId(OperationRequest request) {
    return call(DEFINITIONS.get("getBucketsByBucketId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /buckets/{bucketId}/files}.
   *
   * <p>Required path parameters: bucketId. Query parameters: prefix, maxKeys, continuationToken. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBucketsByBucketIdFiles(OperationRequest request) {
    return call(DEFINITIONS.get("getBucketsByBucketIdFiles"), request);
  }

  /**
   * Sends a blocking GET request to {@code /buckets/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Query parameters: envId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getBucketsProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getBucketsProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /cms/careers}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getCmsCareers(OperationRequest request) {
    return call(DEFINITIONS.get("getCmsCareers"), request);
  }

  /**
   * Sends a blocking GET request to {@code /cms/careers}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getCmsCareers() {
    return getCmsCareers(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /cms/faqs/{pageSlug}}.
   *
   * <p>Required path parameters: pageSlug. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getCmsFaqsByPageSlug(OperationRequest request) {
    return call(DEFINITIONS.get("getCmsFaqsByPageSlug"), request);
  }

  /**
   * Sends a blocking GET request to {@code /cms/pages/{slug}}.
   *
   * <p>Required path parameters: slug. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getCmsPagesBySlug(OperationRequest request) {
    return call(DEFINITIONS.get("getCmsPagesBySlug"), request);
  }

  /**
   * Sends a blocking GET request to {@code /cms/partners}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getCmsPartners(OperationRequest request) {
    return call(DEFINITIONS.get("getCmsPartners"), request);
  }

  /**
   * Sends a blocking GET request to {@code /cms/partners}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getCmsPartners() {
    return getCmsPartners(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /cms/team}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getCmsTeam(OperationRequest request) {
    return call(DEFINITIONS.get("getCmsTeam"), request);
  }

  /**
   * Sends a blocking GET request to {@code /cms/team}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getCmsTeam() {
    return getCmsTeam(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /cms/testimonials}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getCmsTestimonials(OperationRequest request) {
    return call(DEFINITIONS.get("getCmsTestimonials"), request);
  }

  /**
   * Sends a blocking GET request to {@code /cms/testimonials}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getCmsTestimonials() {
    return getCmsTestimonials(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /credits/org/{orgId}}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getCreditsOrgByOrgId(OperationRequest request) {
    return call(DEFINITIONS.get("getCreditsOrgByOrgId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /credits/org/{orgId}/balance}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getCreditsOrgByOrgIdBalance(OperationRequest request) {
    return call(DEFINITIONS.get("getCreditsOrgByOrgIdBalance"), request);
  }

  /**
   * Sends a blocking GET request to {@code /database/connector/{projectId}/tables}.
   *
   * <p>Required path parameters: projectId. Query parameters: wrapperId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getDatabaseConnectorByProjectIdTables(OperationRequest request) {
    return call(DEFINITIONS.get("getDatabaseConnectorByProjectIdTables"), request);
  }

  /**
   * Sends a blocking GET request to {@code /database/extensions/available}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getDatabaseExtensionsAvailable(OperationRequest request) {
    return call(DEFINITIONS.get("getDatabaseExtensionsAvailable"), request);
  }

  /**
   * Sends a blocking GET request to {@code /database/extensions/available}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getDatabaseExtensionsAvailable() {
    return getDatabaseExtensionsAvailable(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /database/extensions/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Query parameters: envId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getDatabaseExtensionsProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getDatabaseExtensionsProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /database/tiers}.
   *
   * <p>Query parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getDatabaseTiers(OperationRequest request) {
    return call(DEFINITIONS.get("getDatabaseTiers"), request);
  }

  /**
   * Sends a blocking GET request to {@code /database/tiers}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getDatabaseTiers() {
    return getDatabaseTiers(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /database/wrappers/available}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getDatabaseWrappersAvailable(OperationRequest request) {
    return call(DEFINITIONS.get("getDatabaseWrappersAvailable"), request);
  }

  /**
   * Sends a blocking GET request to {@code /database/wrappers/available}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getDatabaseWrappersAvailable() {
    return getDatabaseWrappersAvailable(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /database/wrappers/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Query parameters: envId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getDatabaseWrappersProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getDatabaseWrappersProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /deployments/{deploymentId}}.
   *
   * <p>Required path parameters: deploymentId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getDeploymentsByDeploymentId(OperationRequest request) {
    return call(DEFINITIONS.get("getDeploymentsByDeploymentId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /deployments/{deploymentId}/steps}.
   *
   * <p>Required path parameters: deploymentId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getDeploymentsByDeploymentIdSteps(OperationRequest request) {
    return call(DEFINITIONS.get("getDeploymentsByDeploymentIdSteps"), request);
  }

  /**
   * Sends a blocking GET request to {@code /deployments/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Query parameters: env, limit, offset. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getDeploymentsProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getDeploymentsProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /deployments/project/{projectId}/stats}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getDeploymentsProjectByProjectIdStats(OperationRequest request) {
    return call(DEFINITIONS.get("getDeploymentsProjectByProjectIdStats"), request);
  }

  /**
   * Sends a blocking GET request to {@code /deployments/tokens/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Query parameters: envId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getDeploymentsTokensProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getDeploymentsTokensProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /docs/ai-search}.
   *
   * <p>Query parameters: q. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getDocsAiSearch(OperationRequest request) {
    return call(DEFINITIONS.get("getDocsAiSearch"), request);
  }

  /**
   * Sends a blocking GET request to {@code /docs/ai-search}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getDocsAiSearch() {
    return getDocsAiSearch(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /docs/api-endpoints}.
   *
   * <p>Query parameters: category. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getDocsApiEndpoints(OperationRequest request) {
    return call(DEFINITIONS.get("getDocsApiEndpoints"), request);
  }

  /**
   * Sends a blocking GET request to {@code /docs/api-endpoints}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getDocsApiEndpoints() {
    return getDocsApiEndpoints(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /docs/api-endpoints/{id}}.
   *
   * <p>Required path parameters: id. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getDocsApiEndpointsById(OperationRequest request) {
    return call(DEFINITIONS.get("getDocsApiEndpointsById"), request);
  }

  /**
   * Sends a blocking GET request to {@code /docs/categories}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getDocsCategories(OperationRequest request) {
    return call(DEFINITIONS.get("getDocsCategories"), request);
  }

  /**
   * Sends a blocking GET request to {@code /docs/categories}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getDocsCategories() {
    return getDocsCategories(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /docs/changelog}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getDocsChangelog(OperationRequest request) {
    return call(DEFINITIONS.get("getDocsChangelog"), request);
  }

  /**
   * Sends a blocking GET request to {@code /docs/changelog}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getDocsChangelog() {
    return getDocsChangelog(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /docs/changelog/{id}}.
   *
   * <p>Required path parameters: id. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getDocsChangelogById(OperationRequest request) {
    return call(DEFINITIONS.get("getDocsChangelogById"), request);
  }

  /**
   * Sends a blocking GET request to {@code /docs/examples}.
   *
   * <p>Query parameters: featured. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getDocsExamples(OperationRequest request) {
    return call(DEFINITIONS.get("getDocsExamples"), request);
  }

  /**
   * Sends a blocking GET request to {@code /docs/examples}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getDocsExamples() {
    return getDocsExamples(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /docs/examples/{slug}}.
   *
   * <p>Required path parameters: slug. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getDocsExamplesBySlug(OperationRequest request) {
    return call(DEFINITIONS.get("getDocsExamplesBySlug"), request);
  }

  /**
   * Sends a blocking GET request to {@code /docs/project/{projectId}/quickstart}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getDocsProjectByProjectIdQuickstart(OperationRequest request) {
    return call(DEFINITIONS.get("getDocsProjectByProjectIdQuickstart"), request);
  }

  /**
   * Sends a blocking GET request to {@code /docs/sdks}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getDocsSdks(OperationRequest request) {
    return call(DEFINITIONS.get("getDocsSdks"), request);
  }

  /**
   * Sends a blocking GET request to {@code /docs/sdks}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getDocsSdks() {
    return getDocsSdks(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /docs/sdks/{platform}}.
   *
   * <p>Required path parameters: platform. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getDocsSdksByPlatform(OperationRequest request) {
    return call(DEFINITIONS.get("getDocsSdksByPlatform"), request);
  }

  /**
   * Sends a blocking GET request to {@code /docs/sdks/{sdkId}/examples}.
   *
   * <p>Required path parameters: sdkId. Query parameters: topic. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getDocsSdksBySdkIdExamples(OperationRequest request) {
    return call(DEFINITIONS.get("getDocsSdksBySdkIdExamples"), request);
  }

  /**
   * Sends a blocking GET request to {@code /docs/search}.
   *
   * <p>Query parameters: q. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getDocsSearch(OperationRequest request) {
    return call(DEFINITIONS.get("getDocsSearch"), request);
  }

  /**
   * Sends a blocking GET request to {@code /docs/search}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getDocsSearch() {
    return getDocsSearch(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /docs/v2/pages}.
   *
   * <p>Query parameters: category, search. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getDocsV2Pages(OperationRequest request) {
    return call(DEFINITIONS.get("getDocsV2Pages"), request);
  }

  /**
   * Sends a blocking GET request to {@code /docs/v2/pages}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getDocsV2Pages() {
    return getDocsV2Pages(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /docs/v2/pages/{slug}}.
   *
   * <p>Required path parameters: slug. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getDocsV2PagesBySlug(OperationRequest request) {
    return call(DEFINITIONS.get("getDocsV2PagesBySlug"), request);
  }

  /**
   * Sends a blocking GET request to {@code /early/{number}}.
   *
   * <p>Required path parameters: number. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getEarlyByNumber(OperationRequest request) {
    return call(DEFINITIONS.get("getEarlyByNumber"), request);
  }

  /**
   * Sends a blocking GET request to {@code /early/wall}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getEarlyWall(OperationRequest request) {
    return call(DEFINITIONS.get("getEarlyWall"), request);
  }

  /**
   * Sends a blocking GET request to {@code /early/wall}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getEarlyWall() {
    return getEarlyWall(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /enterprise/org/{orgId}/contract}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getEnterpriseOrgByOrgIdContract(OperationRequest request) {
    return call(DEFINITIONS.get("getEnterpriseOrgByOrgIdContract"), request);
  }

  /**
   * Sends a blocking GET request to {@code /enterprise/org/{orgId}/invoices}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getEnterpriseOrgByOrgIdInvoices(OperationRequest request) {
    return call(DEFINITIONS.get("getEnterpriseOrgByOrgIdInvoices"), request);
  }

  /**
   * Sends a blocking GET request to {@code /enterprise/org/{orgId}/onboarding}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getEnterpriseOrgByOrgIdOnboarding(OperationRequest request) {
    return call(DEFINITIONS.get("getEnterpriseOrgByOrgIdOnboarding"), request);
  }

  /**
   * Sends a blocking GET request to {@code /enterprise/org/{orgId}/spend}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getEnterpriseOrgByOrgIdSpend(OperationRequest request) {
    return call(DEFINITIONS.get("getEnterpriseOrgByOrgIdSpend"), request);
  }

  /**
   * Sends a blocking GET request to {@code /enterprise/org/{orgId}/usage}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getEnterpriseOrgByOrgIdUsage(OperationRequest request) {
    return call(DEFINITIONS.get("getEnterpriseOrgByOrgIdUsage"), request);
  }

  /**
   * Sends a blocking GET request to {@code /enterprise/org/{orgId}/usage/history}.
   *
   * <p>Required path parameters: orgId. Query parameters: days. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getEnterpriseOrgByOrgIdUsageHistory(OperationRequest request) {
    return call(DEFINITIONS.get("getEnterpriseOrgByOrgIdUsageHistory"), request);
  }

  /**
   * Sends a blocking GET request to {@code /enterprise/org/{orgId}/usage/projects}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getEnterpriseOrgByOrgIdUsageProjects(OperationRequest request) {
    return call(DEFINITIONS.get("getEnterpriseOrgByOrgIdUsageProjects"), request);
  }

  /**
   * Sends a blocking GET request to {@code /enterprise/pricing}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getEnterprisePricing(OperationRequest request) {
    return call(DEFINITIONS.get("getEnterprisePricing"), request);
  }

  /**
   * Sends a blocking GET request to {@code /enterprise/pricing}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getEnterprisePricing() {
    return getEnterprisePricing(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /enterprise/quotes/{quoteId}}.
   *
   * <p>Required path parameters: quoteId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getEnterpriseQuotesByQuoteId(OperationRequest request) {
    return call(DEFINITIONS.get("getEnterpriseQuotesByQuoteId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /entitlements/org/{orgId}}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getEntitlementsOrgByOrgId(OperationRequest request) {
    return call(DEFINITIONS.get("getEntitlementsOrgByOrgId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /functions/{functionId}}.
   *
   * <p>Required path parameters: functionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getFunctionsByFunctionId(OperationRequest request) {
    return call(DEFINITIONS.get("getFunctionsByFunctionId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /functions/{functionId}/deploy-status}.
   *
   * <p>Required path parameters: functionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getFunctionsByFunctionIdDeployStatus(OperationRequest request) {
    return call(DEFINITIONS.get("getFunctionsByFunctionIdDeployStatus"), request);
  }

  /**
   * Sends a blocking GET request to {@code /functions/{functionId}/invocations}.
   *
   * <p>Required path parameters: functionId. Query parameters: limit, offset. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getFunctionsByFunctionIdInvocations(OperationRequest request) {
    return call(DEFINITIONS.get("getFunctionsByFunctionIdInvocations"), request);
  }

  /**
   * Sends a blocking GET request to {@code /functions/{functionId}/logs}.
   *
   * <p>Required path parameters: functionId. Query parameters: limit, status, since, until, executionId, level, q, before. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getFunctionsByFunctionIdLogs(OperationRequest request) {
    return call(DEFINITIONS.get("getFunctionsByFunctionIdLogs"), request);
  }

  /**
   * Sends a blocking GET request to {@code /functions/{functionId}/metrics}.
   *
   * <p>Required path parameters: functionId. Query parameters: period. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getFunctionsByFunctionIdMetrics(OperationRequest request) {
    return call(DEFINITIONS.get("getFunctionsByFunctionIdMetrics"), request);
  }

  /**
   * Sends a blocking GET request to {@code /functions/{functionId}/schedule}.
   *
   * <p>Required path parameters: functionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getFunctionsByFunctionIdSchedule(OperationRequest request) {
    return call(DEFINITIONS.get("getFunctionsByFunctionIdSchedule"), request);
  }

  /**
   * Sends a blocking GET request to {@code /functions/{functionId}/triggers}.
   *
   * <p>Required path parameters: functionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getFunctionsByFunctionIdTriggers(OperationRequest request) {
    return call(DEFINITIONS.get("getFunctionsByFunctionIdTriggers"), request);
  }

  /**
   * Sends a blocking GET request to {@code /functions/invocations}.
   *
   * <p>Query parameters: functionId, projectId, envId, status, since, until, limit, offset. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getFunctionsInvocations(OperationRequest request) {
    return call(DEFINITIONS.get("getFunctionsInvocations"), request);
  }

  /**
   * Sends a blocking GET request to {@code /functions/invocations}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getFunctionsInvocations() {
    return getFunctionsInvocations(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /functions/invocations/function/{functionId}}.
   *
   * <p>Required path parameters: functionId. Query parameters: limit. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getFunctionsInvocationsFunctionByFunctionId(OperationRequest request) {
    return call(DEFINITIONS.get("getFunctionsInvocationsFunctionByFunctionId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /functions/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Query parameters: envId, enabled. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getFunctionsProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getFunctionsProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /functions/project/{projectId}/name/{functionName}}.
   *
   * <p>Required path parameters: projectId, functionName. Query parameters: envId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getFunctionsProjectByProjectIdNameByFunctionName(OperationRequest request) {
    return call(DEFINITIONS.get("getFunctionsProjectByProjectIdNameByFunctionName"), request);
  }

  /**
   * Sends a blocking GET request to {@code /functions/project/{projectId}/summary}.
   *
   * <p>Required path parameters: projectId. Query parameters: envId, period. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getFunctionsProjectByProjectIdSummary(OperationRequest request) {
    return call(DEFINITIONS.get("getFunctionsProjectByProjectIdSummary"), request);
  }

  /**
   * Sends a blocking GET request to {@code /functions/schedule/preview}.
   *
   * <p>Query parameters: cron. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getFunctionsSchedulePreview(OperationRequest request) {
    return call(DEFINITIONS.get("getFunctionsSchedulePreview"), request);
  }

  /**
   * Sends a blocking GET request to {@code /functions/schedule/preview}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getFunctionsSchedulePreview() {
    return getFunctionsSchedulePreview(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /functions/secrets/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Query parameters: envId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getFunctionsSecretsProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getFunctionsSecretsProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /generated/{table}}.
   *
   * <p>Required path parameters: table. Query parameters: where, filter, whereField, whereValue, limit, offset, select, orderBy, orderDir, order_by, order_dir, include, filter[or]. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getGeneratedByTable(OperationRequest request) {
    return call(DEFINITIONS.get("getGeneratedByTable"), request);
  }

  /**
   * Sends a blocking GET request to {@code /generated/{table}/aggregate}.
   *
   * <p>Required path parameters: table. Query parameters: fn (required), column, group_by, where, filter, whereField, whereValue. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getGeneratedByTableAggregate(OperationRequest request) {
    return call(DEFINITIONS.get("getGeneratedByTableAggregate"), request);
  }

  /**
   * Sends a blocking GET request to {@code /generated/{table}/{id}}.
   *
   * <p>Required path parameters: table, id. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getGeneratedByTableById(OperationRequest request) {
    return call(DEFINITIONS.get("getGeneratedByTableById"), request);
  }

  /**
   * Sends a blocking GET request to {@code /generated/{table}/search}.
   *
   * <p>Required path parameters: table. Query parameters: q (required), fields, limit, offset. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getGeneratedByTableSearch(OperationRequest request) {
    return call(DEFINITIONS.get("getGeneratedByTableSearch"), request);
  }

  /**
   * Sends a blocking GET request to {@code /github/oauth/authorize}.
   *
   * <p>Query parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getGithubOauthAuthorize(OperationRequest request) {
    return call(DEFINITIONS.get("getGithubOauthAuthorize"), request);
  }

  /**
   * Sends a blocking GET request to {@code /github/oauth/authorize}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getGithubOauthAuthorize() {
    return getGithubOauthAuthorize(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /incidents/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Query parameters: status, since. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getIncidentsProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getIncidentsProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /infrastructure/sizes}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getInfrastructureSizes(OperationRequest request) {
    return call(DEFINITIONS.get("getInfrastructureSizes"), request);
  }

  /**
   * Sends a blocking GET request to {@code /infrastructure/sizes}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getInfrastructureSizes() {
    return getInfrastructureSizes(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /integrations/analytics/project/{projectId}/events}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getIntegrationsAnalyticsProjectByProjectIdEvents(OperationRequest request) {
    return call(DEFINITIONS.get("getIntegrationsAnalyticsProjectByProjectIdEvents"), request);
  }

  /**
   * Sends a blocking GET request to {@code /integrations/analytics/project/{projectId}/stats}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getIntegrationsAnalyticsProjectByProjectIdStats(OperationRequest request) {
    return call(DEFINITIONS.get("getIntegrationsAnalyticsProjectByProjectIdStats"), request);
  }

  /**
   * Sends a blocking GET request to {@code /integrations/deliveries/event/{eventId}}.
   *
   * <p>Required path parameters: eventId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getIntegrationsDeliveriesEventByEventId(OperationRequest request) {
    return call(DEFINITIONS.get("getIntegrationsDeliveriesEventByEventId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /integrations/deliveries/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Query parameters: status, subscriptionId, type, q, since, until, limit, offset, envId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getIntegrationsDeliveriesProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getIntegrationsDeliveriesProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /integrations/deliveries/project/{projectId}/summary}.
   *
   * <p>Required path parameters: projectId. Query parameters: envId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getIntegrationsDeliveriesProjectByProjectIdSummary(OperationRequest request) {
    return call(DEFINITIONS.get("getIntegrationsDeliveriesProjectByProjectIdSummary"), request);
  }

  /**
   * Sends a blocking GET request to {@code /integrations/deliveries/subscription/{subscriptionId}}.
   *
   * <p>Required path parameters: subscriptionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getIntegrationsDeliveriesSubscriptionBySubscriptionId(OperationRequest request) {
    return call(DEFINITIONS.get("getIntegrationsDeliveriesSubscriptionBySubscriptionId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /integrations/dlq/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getIntegrationsDlqProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getIntegrationsDlqProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /integrations/events}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getIntegrationsEvents(OperationRequest request) {
    return call(DEFINITIONS.get("getIntegrationsEvents"), request);
  }

  /**
   * Sends a blocking GET request to {@code /integrations/events}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getIntegrationsEvents() {
    return getIntegrationsEvents(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /integrations/subscriptions/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getIntegrationsSubscriptionsProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getIntegrationsSubscriptionsProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /jobs/dlq/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getJobsDlqProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getJobsDlqProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /jobs/webhooks/delivery/{deliveryId}}.
   *
   * <p>Required path parameters: deliveryId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getJobsWebhooksDeliveryByDeliveryId(OperationRequest request) {
    return call(DEFINITIONS.get("getJobsWebhooksDeliveryByDeliveryId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /jobs/webhooks/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getJobsWebhooksProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getJobsWebhooksProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /logs/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Query parameters: limit, level. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getLogsProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getLogsProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /logs/project/{projectId}/feed}.
   *
   * <p>Required path parameters: projectId. Query parameters: envId, since, until, level, source, q, request, before, after, limit. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getLogsProjectByProjectIdFeed(OperationRequest request) {
    return call(DEFINITIONS.get("getLogsProjectByProjectIdFeed"), request);
  }

  /**
   * Sends a blocking GET request to {@code /maintenance}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getMaintenance(OperationRequest request) {
    return call(DEFINITIONS.get("getMaintenance"), request);
  }

  /**
   * Sends a blocking GET request to {@code /maintenance}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getMaintenance() {
    return getMaintenance(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /mcp/connections}.
   *
   * <p>Query parameters: status. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getMcpConnections(OperationRequest request) {
    return call(DEFINITIONS.get("getMcpConnections"), request);
  }

  /**
   * Sends a blocking GET request to {@code /mcp/connections}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getMcpConnections() {
    return getMcpConnections(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /mcp/oauth/requests/{requestId}}.
   *
   * <p>Required path parameters: requestId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getMcpOauthRequestsByRequestId(OperationRequest request) {
    return call(DEFINITIONS.get("getMcpOauthRequestsByRequestId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /mcp/session}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getMcpSession(OperationRequest request) {
    return call(DEFINITIONS.get("getMcpSession"), request);
  }

  /**
   * Sends a blocking GET request to {@code /mcp/session}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getMcpSession() {
    return getMcpSession(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /me/badges}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getMeBadges(OperationRequest request) {
    return call(DEFINITIONS.get("getMeBadges"), request);
  }

  /**
   * Sends a blocking GET request to {@code /me/badges}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getMeBadges() {
    return getMeBadges(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /me/creator}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getMeCreator(OperationRequest request) {
    return call(DEFINITIONS.get("getMeCreator"), request);
  }

  /**
   * Sends a blocking GET request to {@code /me/creator}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getMeCreator() {
    return getMeCreator(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /metrics/org/{orgId}}.
   *
   * <p>Required path parameters: orgId. Query parameters: range, env. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getMetricsOrgByOrgId(OperationRequest request) {
    return call(DEFINITIONS.get("getMetricsOrgByOrgId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /metrics/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Query parameters: range, env. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getMetricsProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getMetricsProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /metrics/project/{projectId}/overview}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getMetricsProjectByProjectIdOverview(OperationRequest request) {
    return call(DEFINITIONS.get("getMetricsProjectByProjectIdOverview"), request);
  }

  /**
   * Sends a blocking GET request to {@code /metrics/project/{projectId}/report}.
   *
   * <p>Required path parameters: projectId. Query parameters: envId, period. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getMetricsProjectByProjectIdReport(OperationRequest request) {
    return call(DEFINITIONS.get("getMetricsProjectByProjectIdReport"), request);
  }

  /**
   * Sends a blocking GET request to {@code /mongodb/{collection}/estimatedCount}.
   *
   * <p>Required path parameters: collection. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getMongodbByCollectionEstimatedCount(OperationRequest request) {
    return call(DEFINITIONS.get("getMongodbByCollectionEstimatedCount"), request);
  }

  /**
   * Sends a blocking GET request to {@code /mongodb/{collection}/findById/{id}}.
   *
   * <p>Required path parameters: collection, id. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getMongodbByCollectionFindByIdById(OperationRequest request) {
    return call(DEFINITIONS.get("getMongodbByCollectionFindByIdById"), request);
  }

  /**
   * Sends a blocking GET request to {@code /mongodb/{collection}/indexes}.
   *
   * <p>Required path parameters: collection. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getMongodbByCollectionIndexes(OperationRequest request) {
    return call(DEFINITIONS.get("getMongodbByCollectionIndexes"), request);
  }

  /**
   * Sends a blocking GET request to {@code /mongodb/collections}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getMongodbCollections(OperationRequest request) {
    return call(DEFINITIONS.get("getMongodbCollections"), request);
  }

  /**
   * Sends a blocking GET request to {@code /mongodb/collections}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getMongodbCollections() {
    return getMongodbCollections(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /oauth/org/{orgId}}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOauthOrgByOrgId(OperationRequest request) {
    return call(DEFINITIONS.get("getOauthOrgByOrgId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /oauth/org/{orgId}/provider/{provider}/authorize}.
   *
   * <p>Required path parameters: orgId, provider. Query parameters: scopes. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOauthOrgByOrgIdProviderByProviderAuthorize(OperationRequest request) {
    return call(DEFINITIONS.get("getOauthOrgByOrgIdProviderByProviderAuthorize"), request);
  }

  /**
   * Sends a blocking GET request to {@code /onboarding/org/{orgId}}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOnboardingOrgByOrgId(OperationRequest request) {
    return call(DEFINITIONS.get("getOnboardingOrgByOrgId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /openapi/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Query parameters: envId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOpenapiProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getOpenapiProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /openapi.yaml}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOpenapiYaml(OperationRequest request) {
    return call(DEFINITIONS.get("getOpenapiYaml"), request);
  }

  /**
   * Sends a blocking GET request to {@code /openapi.yaml}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getOpenapiYaml() {
    return getOpenapiYaml(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /orgs}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOrgs(OperationRequest request) {
    return call(DEFINITIONS.get("getOrgs"), request);
  }

  /**
   * Sends a blocking GET request to {@code /orgs}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getOrgs() {
    return getOrgs(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /orgs/{orgId}/access-matrix}.
   *
   * <p>Required path parameters: orgId. Query parameters: q, orgRole, withoutMfa, cursor, limit. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOrgsByOrgIdAccessMatrix(OperationRequest request) {
    return call(DEFINITIONS.get("getOrgsByOrgIdAccessMatrix"), request);
  }

  /**
   * Sends a blocking GET request to {@code /orgs/{orgId}/blueprint-defaults}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOrgsByOrgIdBlueprintDefaults(OperationRequest request) {
    return call(DEFINITIONS.get("getOrgsByOrgIdBlueprintDefaults"), request);
  }

  /**
   * Sends a blocking GET request to {@code /orgs/{orgId}/change-requests}.
   *
   * <p>Required path parameters: orgId. Query parameters: limit. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOrgsByOrgIdChangeRequests(OperationRequest request) {
    return call(DEFINITIONS.get("getOrgsByOrgIdChangeRequests"), request);
  }

  /**
   * Sends a blocking GET request to {@code /orgs/{orgId}/data-region}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOrgsByOrgIdDataRegion(OperationRequest request) {
    return call(DEFINITIONS.get("getOrgsByOrgIdDataRegion"), request);
  }

  /**
   * Sends a blocking GET request to {@code /orgs/{orgId}/identity/summary}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOrgsByOrgIdIdentitySummary(OperationRequest request) {
    return call(DEFINITIONS.get("getOrgsByOrgIdIdentitySummary"), request);
  }

  /**
   * Sends a blocking GET request to {@code /orgs/{orgId}/invites}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOrgsByOrgIdInvites(OperationRequest request) {
    return call(DEFINITIONS.get("getOrgsByOrgIdInvites"), request);
  }

  /**
   * Sends a blocking GET request to {@code /orgs/{orgId}/leave-requests}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOrgsByOrgIdLeaveRequests(OperationRequest request) {
    return call(DEFINITIONS.get("getOrgsByOrgIdLeaveRequests"), request);
  }

  /**
   * Sends a blocking GET request to {@code /orgs/{orgId}/leave-requests/mine}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOrgsByOrgIdLeaveRequestsMine(OperationRequest request) {
    return call(DEFINITIONS.get("getOrgsByOrgIdLeaveRequestsMine"), request);
  }

  /**
   * Sends a blocking GET request to {@code /orgs/{orgId}/managed-domains}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOrgsByOrgIdManagedDomains(OperationRequest request) {
    return call(DEFINITIONS.get("getOrgsByOrgIdManagedDomains"), request);
  }

  /**
   * Sends a blocking GET request to {@code /orgs/{orgId}/managed-summary}.
   *
   * <p>Required path parameters: orgId. Query parameters: limit. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOrgsByOrgIdManagedSummary(OperationRequest request) {
    return call(DEFINITIONS.get("getOrgsByOrgIdManagedSummary"), request);
  }

  /**
   * Sends a blocking GET request to {@code /orgs/{orgId}/members}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOrgsByOrgIdMembers(OperationRequest request) {
    return call(DEFINITIONS.get("getOrgsByOrgIdMembers"), request);
  }

  /**
   * Sends a blocking GET request to {@code /orgs/{orgId}/membership}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOrgsByOrgIdMembership(OperationRequest request) {
    return call(DEFINITIONS.get("getOrgsByOrgIdMembership"), request);
  }

  /**
   * Sends a blocking GET request to {@code /orgs/{orgId}/profile}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOrgsByOrgIdProfile(OperationRequest request) {
    return call(DEFINITIONS.get("getOrgsByOrgIdProfile"), request);
  }

  /**
   * Sends a blocking GET request to {@code /orgs/{orgId}/roles}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOrgsByOrgIdRoles(OperationRequest request) {
    return call(DEFINITIONS.get("getOrgsByOrgIdRoles"), request);
  }

  /**
   * Sends a blocking GET request to {@code /orgs/{orgId}/security}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOrgsByOrgIdSecurity(OperationRequest request) {
    return call(DEFINITIONS.get("getOrgsByOrgIdSecurity"), request);
  }

  /**
   * Sends a blocking GET request to {@code /orgs/{orgId}/security/posture}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOrgsByOrgIdSecurityPosture(OperationRequest request) {
    return call(DEFINITIONS.get("getOrgsByOrgIdSecurityPosture"), request);
  }

  /**
   * Sends a blocking GET request to {@code /orgs/{orgId}/support/sla-report}.
   *
   * <p>Required path parameters: orgId. Query parameters: month, format. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOrgsByOrgIdSupportSlaReport(OperationRequest request) {
    return call(DEFINITIONS.get("getOrgsByOrgIdSupportSlaReport"), request);
  }

  /**
   * Sends a blocking GET request to {@code /orgs/{orgId}/support/summary}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOrgsByOrgIdSupportSummary(OperationRequest request) {
    return call(DEFINITIONS.get("getOrgsByOrgIdSupportSummary"), request);
  }

  /**
   * Sends a blocking GET request to {@code /orgs/{orgId}/support/terms}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOrgsByOrgIdSupportTerms(OperationRequest request) {
    return call(DEFINITIONS.get("getOrgsByOrgIdSupportTerms"), request);
  }

  /**
   * Sends a blocking GET request to {@code /orgs/{orgId}/support/tickets}.
   *
   * <p>Required path parameters: orgId. Query parameters: status, priority, cursor. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOrgsByOrgIdSupportTickets(OperationRequest request) {
    return call(DEFINITIONS.get("getOrgsByOrgIdSupportTickets"), request);
  }

  /**
   * Sends a blocking GET request to {@code /orgs/{orgId}/support/tickets/{number}}.
   *
   * <p>Required path parameters: orgId, number. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOrgsByOrgIdSupportTicketsByNumber(OperationRequest request) {
    return call(DEFINITIONS.get("getOrgsByOrgIdSupportTicketsByNumber"), request);
  }

  /**
   * Sends a blocking GET request to {@code /orgs/{orgId}/transfers}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOrgsByOrgIdTransfers(OperationRequest request) {
    return call(DEFINITIONS.get("getOrgsByOrgIdTransfers"), request);
  }

  /**
   * Sends a blocking GET request to {@code /orgs/invites/lookup}.
   *
   * <p>Query parameters: token. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOrgsInvitesLookup(OperationRequest request) {
    return call(DEFINITIONS.get("getOrgsInvitesLookup"), request);
  }

  /**
   * Sends a blocking GET request to {@code /orgs/invites/lookup}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getOrgsInvitesLookup() {
    return getOrgsInvitesLookup(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /orgs/transfers/preview}.
   *
   * <p>Query parameters: token. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getOrgsTransfersPreview(OperationRequest request) {
    return call(DEFINITIONS.get("getOrgsTransfersPreview"), request);
  }

  /**
   * Sends a blocking GET request to {@code /orgs/transfers/preview}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getOrgsTransfersPreview() {
    return getOrgsTransfersPreview(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /plans/{planId}}.
   *
   * <p>Required path parameters: planId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getPlansByPlanId(OperationRequest request) {
    return call(DEFINITIONS.get("getPlansByPlanId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /plans/org/{orgId}}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getPlansOrgByOrgId(OperationRequest request) {
    return call(DEFINITIONS.get("getPlansOrgByOrgId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /pricing/ai-features}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getPricingAiFeatures(OperationRequest request) {
    return call(DEFINITIONS.get("getPricingAiFeatures"), request);
  }

  /**
   * Sends a blocking GET request to {@code /pricing/ai-features}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getPricingAiFeatures() {
    return getPricingAiFeatures(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /pricing/compare}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getPricingCompare(OperationRequest request) {
    return call(DEFINITIONS.get("getPricingCompare"), request);
  }

  /**
   * Sends a blocking GET request to {@code /pricing/compare}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getPricingCompare() {
    return getPricingCompare(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /pricing/enterprise}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getPricingEnterprise(OperationRequest request) {
    return call(DEFINITIONS.get("getPricingEnterprise"), request);
  }

  /**
   * Sends a blocking GET request to {@code /pricing/enterprise}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getPricingEnterprise() {
    return getPricingEnterprise(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /pricing/plans}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getPricingPlans(OperationRequest request) {
    return call(DEFINITIONS.get("getPricingPlans"), request);
  }

  /**
   * Sends a blocking GET request to {@code /pricing/plans}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getPricingPlans() {
    return getPricingPlans(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /pricing/plans/{plan}}.
   *
   * <p>Required path parameters: plan. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getPricingPlansByPlan(OperationRequest request) {
    return call(DEFINITIONS.get("getPricingPlansByPlan"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects}.
   *
   * <p>Query parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjects(OperationRequest request) {
    return call(DEFINITIONS.get("getProjects"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getProjects() {
    return getProjects(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /projects/{id}/insights}.
   *
   * <p>Required path parameters: id. Query parameters: refresh. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByIdInsights(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByIdInsights"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/api-keys}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdApiKeys(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdApiKeys"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/auth/activity}.
   *
   * <p>Required path parameters: projectId. Query parameters: userId, action, limit, offset. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdAuthActivity(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdAuthActivity"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/auth/me}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdAuthMe(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdAuthMe"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/auth/oauth-apps}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdAuthOauthApps(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdAuthOauthApps"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/auth/oauth/providers}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdAuthOauthProviders(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdAuthOauthProviders"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/auth/sessions}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdAuthSessions(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdAuthSessions"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/auth/settings}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdAuthSettings(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdAuthSettings"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/branches}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdBranches(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdBranches"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/branches/{branchName}/url}.
   *
   * <p>Required path parameters: projectId, branchName. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdBranchesByBranchNameUrl(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdBranchesByBranchNameUrl"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/database/dedicated}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdDatabaseDedicated(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdDatabaseDedicated"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/database/dedicated/connection}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdDatabaseDedicatedConnection(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdDatabaseDedicatedConnection"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/database/dedicated/status}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdDatabaseDedicatedStatus(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdDatabaseDedicatedStatus"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/deletion-preview}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdDeletionPreview(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdDeletionPreview"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/env-vars}.
   *
   * <p>Required path parameters: projectId. Query parameters: envId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdEnvVars(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdEnvVars"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/environments}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdEnvironments(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdEnvironments"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/environments/{envId}/domain-status}.
   *
   * <p>Required path parameters: projectId, envId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdEnvironmentsByEnvIdDomainStatus(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdEnvironmentsByEnvIdDomainStatus"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/environments/{envId}/domain-verification}.
   *
   * <p>Required path parameters: projectId, envId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdEnvironmentsByEnvIdDomainVerification(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdEnvironmentsByEnvIdDomainVerification"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/environments/{envId}/domains}.
   *
   * <p>Required path parameters: projectId, envId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdEnvironmentsByEnvIdDomains(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdEnvironmentsByEnvIdDomains"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/environments/promotion-order}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdEnvironmentsPromotionOrder(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdEnvironmentsPromotionOrder"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/frontend}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdFrontend(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdFrontend"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/getting-started}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdGettingStarted(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdGettingStarted"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/github/branches}.
   *
   * <p>Required path parameters: projectId. Query parameters: repo. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdGithubBranches(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdGithubBranches"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/github/repos}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdGithubRepos(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdGithubRepos"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/github/status}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdGithubStatus(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdGithubStatus"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/github/tracked-repos}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdGithubTrackedRepos(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdGithubTrackedRepos"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/infrastructure}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdInfrastructure(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdInfrastructure"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/infrastructure/{instanceId}/metrics}.
   *
   * <p>Required path parameters: projectId, instanceId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdInfrastructureByInstanceIdMetrics(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdInfrastructureByInstanceIdMetrics"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/infrastructure/{instanceId}/replicas}.
   *
   * <p>Required path parameters: projectId, instanceId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdInfrastructureByInstanceIdReplicas(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdInfrastructureByInstanceIdReplicas"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/infrastructure/{instanceId}/upgrade-options}.
   *
   * <p>Required path parameters: projectId, instanceId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdInfrastructureByInstanceIdUpgradeOptions(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdInfrastructureByInstanceIdUpgradeOptions"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/infrastructure/migration/progress}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdInfrastructureMigrationProgress(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdInfrastructureMigrationProgress"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/infrastructure/migration-status}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdInfrastructureMigrationStatus(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdInfrastructureMigrationStatus"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/infrastructure/restores}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdInfrastructureRestores(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdInfrastructureRestores"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/members}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdMembers(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdMembers"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/promotions}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdPromotions(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdPromotions"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/promotions/diff}.
   *
   * <p>Required path parameters: projectId. Query parameters: from, to. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdPromotionsDiff(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdPromotionsDiff"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/region}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdRegion(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdRegion"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/security/advisor}.
   *
   * <p>Required path parameters: projectId. Query parameters: envId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdSecurityAdvisor(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdSecurityAdvisor"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/settings}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdSettings(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdSettings"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/settings/addons}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdSettingsAddons(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdSettingsAddons"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/settings/api}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdSettingsApi(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdSettingsApi"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/settings/compute}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdSettingsCompute(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdSettingsCompute"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/settings/jwt}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdSettingsJwt(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdSettingsJwt"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/storage/settings}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdStorageSettings(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdStorageSettings"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/users}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdUsers(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdUsers"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/users/{userId}}.
   *
   * <p>Required path parameters: projectId, userId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdUsersByUserId(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdUsersByUserId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/users/{userId}/sessions}.
   *
   * <p>Required path parameters: projectId, userId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdUsersByUserIdSessions(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdUsersByUserIdSessions"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/{projectId}/users/stats}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsByProjectIdUsersStats(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsByProjectIdUsersStats"), request);
  }

  /**
   * Sends a blocking GET request to {@code /projects/slug-available}.
   *
   * <p>Query parameters: orgId (required), slug (required). Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getProjectsSlugAvailable(OperationRequest request) {
    return call(DEFINITIONS.get("getProjectsSlugAvailable"), request);
  }

  /**
   * Sends a blocking GET request to {@code /quickstart/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Query parameters: platform, env. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getQuickstartProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getQuickstartProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /quickstart/project/{projectId}/json}.
   *
   * <p>Required path parameters: projectId. Query parameters: platform, env. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getQuickstartProjectByProjectIdJson(OperationRequest request) {
    return call(DEFINITIONS.get("getQuickstartProjectByProjectIdJson"), request);
  }

  /**
   * Sends a blocking GET request to {@code /realtime/connections/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getRealtimeConnectionsProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getRealtimeConnectionsProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /realtime/events/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Query parameters: source, level, table, type, q. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getRealtimeEventsProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getRealtimeEventsProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /realtime/stats/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getRealtimeStatsProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getRealtimeStatsProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /realtime/status/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Query parameters: envId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getRealtimeStatusProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getRealtimeStatusProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /realtime/subscriptions/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getRealtimeSubscriptionsProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getRealtimeSubscriptionsProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /refunds/{id}}.
   *
   * <p>Required path parameters: id. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getRefundsById(OperationRequest request) {
    return call(DEFINITIONS.get("getRefundsById"), request);
  }

  /**
   * Sends a blocking GET request to {@code /refunds/org/{orgId}}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getRefundsOrgByOrgId(OperationRequest request) {
    return call(DEFINITIONS.get("getRefundsOrgByOrgId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /regions}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getRegions(OperationRequest request) {
    return call(DEFINITIONS.get("getRegions"), request);
  }

  /**
   * Sends a blocking GET request to {@code /regions}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getRegions() {
    return getRegions(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /regions/all}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getRegionsAll(OperationRequest request) {
    return call(DEFINITIONS.get("getRegionsAll"), request);
  }

  /**
   * Sends a blocking GET request to {@code /regions/all}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getRegionsAll() {
    return getRegionsAll(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /regions/{key}}.
   *
   * <p>Required path parameters: key. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getRegionsByKey(OperationRequest request) {
    return call(DEFINITIONS.get("getRegionsByKey"), request);
  }

  /**
   * Sends a blocking GET request to {@code /regions/{key}/metrics}.
   *
   * <p>Required path parameters: key. Query parameters: hours. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getRegionsByKeyMetrics(OperationRequest request) {
    return call(DEFINITIONS.get("getRegionsByKeyMetrics"), request);
  }

  /**
   * Sends a blocking GET request to {@code /regions/health}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getRegionsHealth(OperationRequest request) {
    return call(DEFINITIONS.get("getRegionsHealth"), request);
  }

  /**
   * Sends a blocking GET request to {@code /regions/health}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getRegionsHealth() {
    return getRegionsHealth(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /rls/policies/{projectId}}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getRlsPoliciesByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getRlsPoliciesByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /schema-engine/{projectId}/changes}.
   *
   * <p>Required path parameters: projectId. Query parameters: limit. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getSchemaEngineByProjectIdChanges(OperationRequest request) {
    return call(DEFINITIONS.get("getSchemaEngineByProjectIdChanges"), request);
  }

  /**
   * Sends a blocking GET request to {@code /schema-engine/editor-sessions/{projectId}/capabilities}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getSchemaEngineEditorSessionsByProjectIdCapabilities(OperationRequest request) {
    return call(DEFINITIONS.get("getSchemaEngineEditorSessionsByProjectIdCapabilities"), request);
  }

  /**
   * Sends a blocking GET request to {@code /schema-engine/introspect/{projectId}}.
   *
   * <p>Required path parameters: projectId. Query parameters: envId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getSchemaEngineIntrospectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getSchemaEngineIntrospectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /schema-engine/migrations/{projectId}/{migrationId}/diff}.
   *
   * <p>Required path parameters: projectId, migrationId. Query parameters: envId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getSchemaEngineMigrationsByProjectIdByMigrationIdDiff(OperationRequest request) {
    return call(DEFINITIONS.get("getSchemaEngineMigrationsByProjectIdByMigrationIdDiff"), request);
  }

  /**
   * Sends a blocking GET request to {@code /schema-engine/migrations/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Query parameters: envId, limit, offset. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getSchemaEngineMigrationsProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getSchemaEngineMigrationsProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /schema-engine/snapshots/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Query parameters: limit. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getSchemaEngineSnapshotsProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getSchemaEngineSnapshotsProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /schema-engine/snippets/{projectId}}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getSchemaEngineSnippetsByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getSchemaEngineSnippetsByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /schemas/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getSchemasProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getSchemasProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /security/audit/{projectId}}.
   *
   * <p>Required path parameters: projectId. Query parameters: limit, offset. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getSecurityAuditByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getSecurityAuditByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /security/overview/{projectId}}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getSecurityOverviewByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getSecurityOverviewByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /security/variables/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Query parameters: envId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getSecurityVariablesProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getSecurityVariablesProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /services/{serviceId}}.
   *
   * <p>Required path parameters: serviceId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getServicesByServiceId(OperationRequest request) {
    return call(DEFINITIONS.get("getServicesByServiceId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /services/{serviceId}/deployments/{deploymentId}/build-logs}.
   *
   * <p>Required path parameters: serviceId, deploymentId. Query parameters: limit. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getServicesByServiceIdDeploymentsByDeploymentIdBuildLogs(OperationRequest request) {
    return call(DEFINITIONS.get("getServicesByServiceIdDeploymentsByDeploymentIdBuildLogs"), request);
  }

  /**
   * Sends a blocking GET request to {@code /services/{serviceId}/deployments/{deploymentId}/status}.
   *
   * <p>Required path parameters: serviceId, deploymentId. Query parameters: projectId, env. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getServicesByServiceIdDeploymentsByDeploymentIdStatus(OperationRequest request) {
    return call(DEFINITIONS.get("getServicesByServiceIdDeploymentsByDeploymentIdStatus"), request);
  }

  /**
   * Sends a blocking GET request to {@code /services/{serviceId}/domains}.
   *
   * <p>Required path parameters: serviceId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getServicesByServiceIdDomains(OperationRequest request) {
    return call(DEFINITIONS.get("getServicesByServiceIdDomains"), request);
  }

  /**
   * Sends a blocking GET request to {@code /services/{serviceId}/git/connect}.
   *
   * <p>Required path parameters: serviceId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getServicesByServiceIdGitConnect(OperationRequest request) {
    return call(DEFINITIONS.get("getServicesByServiceIdGitConnect"), request);
  }

  /**
   * Sends a blocking GET request to {@code /services/{serviceId}/logs}.
   *
   * <p>Required path parameters: serviceId. Query parameters: limit. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getServicesByServiceIdLogs(OperationRequest request) {
    return call(DEFINITIONS.get("getServicesByServiceIdLogs"), request);
  }

  /**
   * Sends a blocking GET request to {@code /services/{serviceId}/status}.
   *
   * <p>Required path parameters: serviceId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getServicesByServiceIdStatus(OperationRequest request) {
    return call(DEFINITIONS.get("getServicesByServiceIdStatus"), request);
  }

  /**
   * Sends a blocking GET request to {@code /services/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getServicesProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getServicesProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /services/project/{projectId}/summary}.
   *
   * <p>Required path parameters: projectId. Query parameters: envId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getServicesProjectByProjectIdSummary(OperationRequest request) {
    return call(DEFINITIONS.get("getServicesProjectByProjectIdSummary"), request);
  }

  /**
   * Sends a blocking GET request to {@code /sso/me/paused-access}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getSsoMePausedAccess(OperationRequest request) {
    return call(DEFINITIONS.get("getSsoMePausedAccess"), request);
  }

  /**
   * Sends a blocking GET request to {@code /sso/me/paused-access}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getSsoMePausedAccess() {
    return getSsoMePausedAccess(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /sso/org/{orgId}}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getSsoOrgByOrgId(OperationRequest request) {
    return call(DEFINITIONS.get("getSsoOrgByOrgId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /sso/org/{orgId}/connections/{connectionId}/break-glass}.
   *
   * <p>Required path parameters: orgId, connectionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getSsoOrgByOrgIdConnectionsByConnectionIdBreakGlass(OperationRequest request) {
    return call(DEFINITIONS.get("getSsoOrgByOrgIdConnectionsByConnectionIdBreakGlass"), request);
  }

  /**
   * Sends a blocking GET request to {@code /sso/org/{orgId}/connections/{connectionId}/certificates}.
   *
   * <p>Required path parameters: orgId, connectionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getSsoOrgByOrgIdConnectionsByConnectionIdCertificates(OperationRequest request) {
    return call(DEFINITIONS.get("getSsoOrgByOrgIdConnectionsByConnectionIdCertificates"), request);
  }

  /**
   * Sends a blocking GET request to {@code /sso/org/{orgId}/connections/{connectionId}/group-mappings}.
   *
   * <p>Required path parameters: orgId, connectionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getSsoOrgByOrgIdConnectionsByConnectionIdGroupMappings(OperationRequest request) {
    return call(DEFINITIONS.get("getSsoOrgByOrgIdConnectionsByConnectionIdGroupMappings"), request);
  }

  /**
   * Sends a blocking GET request to {@code /sso/org/{orgId}/connections/{connectionId}/require}.
   *
   * <p>Required path parameters: orgId, connectionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getSsoOrgByOrgIdConnectionsByConnectionIdRequire(OperationRequest request) {
    return call(DEFINITIONS.get("getSsoOrgByOrgIdConnectionsByConnectionIdRequire"), request);
  }

  /**
   * Sends a blocking GET request to {@code /sso/org/{orgId}/connections/{connectionId}/scim/reconciliation}.
   *
   * <p>Required path parameters: orgId, connectionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getSsoOrgByOrgIdConnectionsByConnectionIdScimReconciliation(OperationRequest request) {
    return call(DEFINITIONS.get("getSsoOrgByOrgIdConnectionsByConnectionIdScimReconciliation"), request);
  }

  /**
   * Sends a blocking GET request to {@code /sso/org/{orgId}/connections/{connectionId}/scim/tokens}.
   *
   * <p>Required path parameters: orgId, connectionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getSsoOrgByOrgIdConnectionsByConnectionIdScimTokens(OperationRequest request) {
    return call(DEFINITIONS.get("getSsoOrgByOrgIdConnectionsByConnectionIdScimTokens"), request);
  }

  /**
   * Sends a blocking GET request to {@code /sso/org/{orgId}/outside-members}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getSsoOrgByOrgIdOutsideMembers(OperationRequest request) {
    return call(DEFINITIONS.get("getSsoOrgByOrgIdOutsideMembers"), request);
  }

  /**
   * Sends a blocking GET request to {@code /sso/org/{orgId}/outside-members/blocked}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getSsoOrgByOrgIdOutsideMembersBlocked(OperationRequest request) {
    return call(DEFINITIONS.get("getSsoOrgByOrgIdOutsideMembersBlocked"), request);
  }

  /**
   * Sends a blocking GET request to {@code /sso/org/{orgId}/security-contact}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getSsoOrgByOrgIdSecurityContact(OperationRequest request) {
    return call(DEFINITIONS.get("getSsoOrgByOrgIdSecurityContact"), request);
  }

  /**
   * Sends a blocking GET request to {@code /status}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getStatus(OperationRequest request) {
    return call(DEFINITIONS.get("getStatus"), request);
  }

  /**
   * Sends a blocking GET request to {@code /status}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getStatus() {
    return getStatus(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /status/atom}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getStatusAtom(OperationRequest request) {
    return call(DEFINITIONS.get("getStatusAtom"), request);
  }

  /**
   * Sends a blocking GET request to {@code /status/atom}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getStatusAtom() {
    return getStatusAtom(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /status/incidents}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getStatusIncidents(OperationRequest request) {
    return call(DEFINITIONS.get("getStatusIncidents"), request);
  }

  /**
   * Sends a blocking GET request to {@code /status/incidents}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getStatusIncidents() {
    return getStatusIncidents(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /status/rss}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getStatusRss(OperationRequest request) {
    return call(DEFINITIONS.get("getStatusRss"), request);
  }

  /**
   * Sends a blocking GET request to {@code /status/rss}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getStatusRss() {
    return getStatusRss(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /status/subscribers/count}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getStatusSubscribersCount(OperationRequest request) {
    return call(DEFINITIONS.get("getStatusSubscribersCount"), request);
  }

  /**
   * Sends a blocking GET request to {@code /status/subscribers/count}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getStatusSubscribersCount() {
    return getStatusSubscribersCount(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /status/unsubscribe/{token}}.
   *
   * <p>Required path parameters: token. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getStatusUnsubscribeByToken(OperationRequest request) {
    return call(DEFINITIONS.get("getStatusUnsubscribeByToken"), request);
  }

  /**
   * Sends a blocking GET request to {@code /status/uptime/{componentId}}.
   *
   * <p>Required path parameters: componentId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getStatusUptimeByComponentId(OperationRequest request) {
    return call(DEFINITIONS.get("getStatusUptimeByComponentId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /storage/buckets}.
   *
   * <p>Query parameters: projectId, envId, limit, offset. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getStorageBuckets(OperationRequest request) {
    return call(DEFINITIONS.get("getStorageBuckets"), request);
  }

  /**
   * Sends a blocking GET request to {@code /storage/buckets}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getStorageBuckets() {
    return getStorageBuckets(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /storage/buckets/{bucketId}/policies}.
   *
   * <p>Required path parameters: bucketId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getStorageBucketsByBucketIdPolicies(OperationRequest request) {
    return call(DEFINITIONS.get("getStorageBucketsByBucketIdPolicies"), request);
  }

  /**
   * Sends a blocking GET request to {@code /storage/download}.
   *
   * <p>Query parameters: bucket, key (required), expiresIn. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the response bytes
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public byte[] getStorageDownload(OperationRequest request) {
    return (byte[]) call(DEFINITIONS.get("getStorageDownload"), request);
  }

  /**
   * Sends a blocking GET request to {@code /storage/files/{bucketId}/metadata}.
   *
   * <p>Required path parameters: bucketId. Query parameters: key (required). Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getStorageFilesByBucketIdMetadata(OperationRequest request) {
    return call(DEFINITIONS.get("getStorageFilesByBucketIdMetadata"), request);
  }

  /**
   * Sends a blocking GET request to {@code /storage/multipart/list-pending}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getStorageMultipartListPending(OperationRequest request) {
    return call(DEFINITIONS.get("getStorageMultipartListPending"), request);
  }

  /**
   * Sends a blocking GET request to {@code /storage/multipart/list-pending}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getStorageMultipartListPending() {
    return getStorageMultipartListPending(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /storage/usage/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Query parameters: envId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getStorageUsageProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("getStorageUsageProjectByProjectId"), request);
  }

  /**
   * Sends a blocking GET request to {@code /templates}.
   *
   * <p>Query parameters: visibility, category, orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getTemplates(OperationRequest request) {
    return call(DEFINITIONS.get("getTemplates"), request);
  }

  /**
   * Sends a blocking GET request to {@code /templates}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getTemplates() {
    return getTemplates(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /templates/{slug}}.
   *
   * <p>Required path parameters: slug. Query parameters: orgId, visibility. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getTemplatesBySlug(OperationRequest request) {
    return call(DEFINITIONS.get("getTemplatesBySlug"), request);
  }

  /**
   * Sends a blocking GET request to {@code /templates/installs}.
   *
   * <p>Query parameters: projectId (required), envId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getTemplatesInstalls(OperationRequest request) {
    return call(DEFINITIONS.get("getTemplatesInstalls"), request);
  }

  /**
   * Sends a blocking GET request to {@code /tenant/branding}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getTenantBranding(OperationRequest request) {
    return call(DEFINITIONS.get("getTenantBranding"), request);
  }

  /**
   * Sends a blocking GET request to {@code /tenant/branding}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getTenantBranding() {
    return getTenantBranding(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /users/me}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getUsersMe(OperationRequest request) {
    return call(DEFINITIONS.get("getUsersMe"), request);
  }

  /**
   * Sends a blocking GET request to {@code /users/me}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getUsersMe() {
    return getUsersMe(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /users/me/preferences}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getUsersMePreferences(OperationRequest request) {
    return call(DEFINITIONS.get("getUsersMePreferences"), request);
  }

  /**
   * Sends a blocking GET request to {@code /users/me/preferences}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getUsersMePreferences() {
    return getUsersMePreferences(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /v1/data/{projectId}/{table}}.
   *
   * <p>Required path parameters: projectId, table. Query parameters: where, filter, whereField, whereValue, limit, offset, select, orderBy, orderDir, order_by, order_dir, include, filter[or]. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getV1DataByProjectIdByTable(OperationRequest request) {
    return call(DEFINITIONS.get("getV1DataByProjectIdByTable"), request);
  }

  /**
   * Sends a blocking GET request to {@code /v1/data/{projectId}/{table}/aggregate}.
   *
   * <p>Required path parameters: projectId, table. Query parameters: fn (required), column, group_by, where, filter, whereField, whereValue. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getV1DataByProjectIdByTableAggregate(OperationRequest request) {
    return call(DEFINITIONS.get("getV1DataByProjectIdByTableAggregate"), request);
  }

  /**
   * Sends a blocking GET request to {@code /v1/data/{projectId}/{table}/{id}}.
   *
   * <p>Required path parameters: projectId, table, id. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getV1DataByProjectIdByTableById(OperationRequest request) {
    return call(DEFINITIONS.get("getV1DataByProjectIdByTableById"), request);
  }

  /**
   * Sends a blocking GET request to {@code /v1/data/{projectId}/{table}/search}.
   *
   * <p>Required path parameters: projectId, table. Query parameters: q (required), fields, limit, offset. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getV1DataByProjectIdByTableSearch(OperationRequest request) {
    return call(DEFINITIONS.get("getV1DataByProjectIdByTableSearch"), request);
  }

  /**
   * Sends a blocking GET request to {@code /v1/health}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getV1Health(OperationRequest request) {
    return call(DEFINITIONS.get("getV1Health"), request);
  }

  /**
   * Sends a blocking GET request to {@code /v1/health}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getV1Health() {
    return getV1Health(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /v1/project}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getV1Project(OperationRequest request) {
    return call(DEFINITIONS.get("getV1Project"), request);
  }

  /**
   * Sends a blocking GET request to {@code /v1/project}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getV1Project() {
    return getV1Project(OperationRequest.empty());
  }

  /**
   * Sends a blocking GET request to {@code /.well-known/oauth-authorization-server}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object getWellKnownOauthAuthorizationServer(OperationRequest request) {
    return call(DEFINITIONS.get("getWellKnownOauthAuthorizationServer"), request);
  }

  /**
   * Sends a blocking GET request to {@code /.well-known/oauth-authorization-server}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object getWellKnownOauthAuthorizationServer() {
    return getWellKnownOauthAuthorizationServer(OperationRequest.empty());
  }

  /**
   * Sends a blocking PATCH request to {@code /ai/copilot/session/{sessionId}}.
   *
   * <p>Required path parameters: sessionId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchAiCopilotSessionBySessionId(OperationRequest request) {
    return call(DEFINITIONS.get("patchAiCopilotSessionBySessionId"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /auth/me}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchAuthMe(OperationRequest request) {
    return call(DEFINITIONS.get("patchAuthMe"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /billing/org/{orgId}/addons/{addonId}}.
   *
   * <p>Required path parameters: orgId, addonId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchBillingOrgByOrgIdAddonsByAddonId(OperationRequest request) {
    return call(DEFINITIONS.get("patchBillingOrgByOrgIdAddonsByAddonId"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /billing/org/{orgId}/contacts/{contactId}}.
   *
   * <p>Required path parameters: orgId, contactId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchBillingOrgByOrgIdContactsByContactId(OperationRequest request) {
    return call(DEFINITIONS.get("patchBillingOrgByOrgIdContactsByContactId"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /billing/org/{orgId}/usage-alerts/{alertId}}.
   *
   * <p>Required path parameters: orgId, alertId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchBillingOrgByOrgIdUsageAlertsByAlertId(OperationRequest request) {
    return call(DEFINITIONS.get("patchBillingOrgByOrgIdUsageAlertsByAlertId"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /database/wrappers/project/{projectId}/{wrapperId}}.
   *
   * <p>Required path parameters: projectId, wrapperId. Query parameters: envId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchDatabaseWrappersProjectByProjectIdByWrapperId(OperationRequest request) {
    return call(DEFINITIONS.get("patchDatabaseWrappersProjectByProjectIdByWrapperId"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /enterprise/org/{orgId}/onboarding}.
   *
   * <p>Required path parameters: orgId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchEnterpriseOrgByOrgIdOnboarding(OperationRequest request) {
    return call(DEFINITIONS.get("patchEnterpriseOrgByOrgIdOnboarding"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /functions/{functionId}}.
   *
   * <p>Required path parameters: functionId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchFunctionsByFunctionId(OperationRequest request) {
    return call(DEFINITIONS.get("patchFunctionsByFunctionId"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /functions/triggers/{triggerId}}.
   *
   * <p>Required path parameters: triggerId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchFunctionsTriggersByTriggerId(OperationRequest request) {
    return call(DEFINITIONS.get("patchFunctionsTriggersByTriggerId"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /generated/{table}/bulk}.
   *
   * <p>Required path parameters: table. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchGeneratedByTableBulk(OperationRequest request) {
    return call(DEFINITIONS.get("patchGeneratedByTableBulk"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /generated/{table}/{id}}.
   *
   * <p>Required path parameters: table, id. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchGeneratedByTableById(OperationRequest request) {
    return call(DEFINITIONS.get("patchGeneratedByTableById"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /integrations/subscriptions/{id}}.
   *
   * <p>Required path parameters: id. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchIntegrationsSubscriptionsById(OperationRequest request) {
    return call(DEFINITIONS.get("patchIntegrationsSubscriptionsById"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /oauth/org/{orgId}/provider/{provider}}.
   *
   * <p>Required path parameters: orgId, provider. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchOauthOrgByOrgIdProviderByProvider(OperationRequest request) {
    return call(DEFINITIONS.get("patchOauthOrgByOrgIdProviderByProvider"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /orgs/{orgId}}.
   *
   * <p>Required path parameters: orgId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchOrgsByOrgId(OperationRequest request) {
    return call(DEFINITIONS.get("patchOrgsByOrgId"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /orgs/{orgId}/blueprint-defaults}.
   *
   * <p>Required path parameters: orgId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchOrgsByOrgIdBlueprintDefaults(OperationRequest request) {
    return call(DEFINITIONS.get("patchOrgsByOrgIdBlueprintDefaults"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /orgs/{orgId}/data-region}.
   *
   * <p>Required path parameters: orgId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchOrgsByOrgIdDataRegion(OperationRequest request) {
    return call(DEFINITIONS.get("patchOrgsByOrgIdDataRegion"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /orgs/{orgId}/members/{userId}/role}.
   *
   * <p>Required path parameters: orgId, userId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchOrgsByOrgIdMembersByUserIdRole(OperationRequest request) {
    return call(DEFINITIONS.get("patchOrgsByOrgIdMembersByUserIdRole"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /orgs/{orgId}/members/roles}.
   *
   * <p>Required path parameters: orgId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchOrgsByOrgIdMembersRoles(OperationRequest request) {
    return call(DEFINITIONS.get("patchOrgsByOrgIdMembersRoles"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /orgs/{orgId}/profile}.
   *
   * <p>Required path parameters: orgId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchOrgsByOrgIdProfile(OperationRequest request) {
    return call(DEFINITIONS.get("patchOrgsByOrgIdProfile"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /orgs/{orgId}/security}.
   *
   * <p>Required path parameters: orgId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchOrgsByOrgIdSecurity(OperationRequest request) {
    return call(DEFINITIONS.get("patchOrgsByOrgIdSecurity"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /projects/{projectId}}.
   *
   * <p>Required path parameters: projectId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchProjectsByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("patchProjectsByProjectId"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /projects/{projectId}/api-keys/{keyId}}.
   *
   * <p>Required path parameters: projectId, keyId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchProjectsByProjectIdApiKeysByKeyId(OperationRequest request) {
    return call(DEFINITIONS.get("patchProjectsByProjectIdApiKeysByKeyId"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /projects/{projectId}/auth/settings}.
   *
   * <p>Required path parameters: projectId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchProjectsByProjectIdAuthSettings(OperationRequest request) {
    return call(DEFINITIONS.get("patchProjectsByProjectIdAuthSettings"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /projects/{projectId}/env-vars/{envVarId}}.
   *
   * <p>Required path parameters: projectId, envVarId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchProjectsByProjectIdEnvVarsByEnvVarId(OperationRequest request) {
    return call(DEFINITIONS.get("patchProjectsByProjectIdEnvVarsByEnvVarId"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /projects/{projectId}/environments/{envId}}.
   *
   * <p>Required path parameters: projectId, envId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchProjectsByProjectIdEnvironmentsByEnvId(OperationRequest request) {
    return call(DEFINITIONS.get("patchProjectsByProjectIdEnvironmentsByEnvId"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /projects/{projectId}/settings/addons}.
   *
   * <p>Required path parameters: projectId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchProjectsByProjectIdSettingsAddons(OperationRequest request) {
    return call(DEFINITIONS.get("patchProjectsByProjectIdSettingsAddons"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /projects/{projectId}/settings/api}.
   *
   * <p>Required path parameters: projectId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchProjectsByProjectIdSettingsApi(OperationRequest request) {
    return call(DEFINITIONS.get("patchProjectsByProjectIdSettingsApi"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /projects/{projectId}/settings/compute}.
   *
   * <p>Required path parameters: projectId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchProjectsByProjectIdSettingsCompute(OperationRequest request) {
    return call(DEFINITIONS.get("patchProjectsByProjectIdSettingsCompute"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /projects/{projectId}/settings/jwt}.
   *
   * <p>Required path parameters: projectId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchProjectsByProjectIdSettingsJwt(OperationRequest request) {
    return call(DEFINITIONS.get("patchProjectsByProjectIdSettingsJwt"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /projects/{projectId}/storage/settings}.
   *
   * <p>Required path parameters: projectId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchProjectsByProjectIdStorageSettings(OperationRequest request) {
    return call(DEFINITIONS.get("patchProjectsByProjectIdStorageSettings"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /projects/{projectId}/users/{userId}}.
   *
   * <p>Required path parameters: projectId, userId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchProjectsByProjectIdUsersByUserId(OperationRequest request) {
    return call(DEFINITIONS.get("patchProjectsByProjectIdUsersByUserId"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /regions/{key}}.
   *
   * <p>Required path parameters: key. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchRegionsByKey(OperationRequest request) {
    return call(DEFINITIONS.get("patchRegionsByKey"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /rls/policies/{policyId}}.
   *
   * <p>Required path parameters: policyId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchRlsPoliciesByPolicyId(OperationRequest request) {
    return call(DEFINITIONS.get("patchRlsPoliciesByPolicyId"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /schema-engine/snippets/{projectId}/{snippetId}}.
   *
   * <p>Required path parameters: projectId, snippetId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchSchemaEngineSnippetsByProjectIdBySnippetId(OperationRequest request) {
    return call(DEFINITIONS.get("patchSchemaEngineSnippetsByProjectIdBySnippetId"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /services/{serviceId}/hostname}.
   *
   * <p>Required path parameters: serviceId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchServicesByServiceIdHostname(OperationRequest request) {
    return call(DEFINITIONS.get("patchServicesByServiceIdHostname"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /services/{serviceId}/runtime-class}.
   *
   * <p>Required path parameters: serviceId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchServicesByServiceIdRuntimeClass(OperationRequest request) {
    return call(DEFINITIONS.get("patchServicesByServiceIdRuntimeClass"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /sso/org/{orgId}/connections/{connectionId}}.
   *
   * <p>Required path parameters: orgId, connectionId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchSsoOrgByOrgIdConnectionsByConnectionId(OperationRequest request) {
    return call(DEFINITIONS.get("patchSsoOrgByOrgIdConnectionsByConnectionId"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /storage/files/{bucketId}/metadata}.
   *
   * <p>Required path parameters: bucketId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchStorageFilesByBucketIdMetadata(OperationRequest request) {
    return call(DEFINITIONS.get("patchStorageFilesByBucketIdMetadata"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /users/me}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchUsersMe(OperationRequest request) {
    return call(DEFINITIONS.get("patchUsersMe"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /users/me}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object patchUsersMe() {
    return patchUsersMe(OperationRequest.empty());
  }

  /**
   * Sends a blocking PATCH request to {@code /users/me/preferences}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchUsersMePreferences(OperationRequest request) {
    return call(DEFINITIONS.get("patchUsersMePreferences"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /users/me/preferences}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object patchUsersMePreferences() {
    return patchUsersMePreferences(OperationRequest.empty());
  }

  /**
   * Sends a blocking PATCH request to {@code /v1/data/{projectId}/{table}/bulk}.
   *
   * <p>Required path parameters: projectId, table. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchV1DataByProjectIdByTableBulk(OperationRequest request) {
    return call(DEFINITIONS.get("patchV1DataByProjectIdByTableBulk"), request);
  }

  /**
   * Sends a blocking PATCH request to {@code /v1/data/{projectId}/{table}/{id}}.
   *
   * <p>Required path parameters: projectId, table, id. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object patchV1DataByProjectIdByTableById(OperationRequest request) {
    return call(DEFINITIONS.get("patchV1DataByProjectIdByTableById"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/alert-rule-suggestion}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotAlertRuleSuggestion(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotAlertRuleSuggestion"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/alert-rule-suggestion/estimate}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotAlertRuleSuggestionEstimate(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotAlertRuleSuggestionEstimate"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/chat}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotChat(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotChat"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/chat/stream}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the event stream, which the caller must close
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public java.io.InputStream postAiCopilotChatStream(OperationRequest request) {
    return (java.io.InputStream) call(DEFINITIONS.get("postAiCopilotChatStream"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/chat/stream}. Sends no arguments.
   *
   * @return the event stream, which the caller must close
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public java.io.InputStream postAiCopilotChatStream() {
    return postAiCopilotChatStream(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/execute}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotExecute(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotExecute"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/execution/{executionId}/pause}.
   *
   * <p>Required path parameters: executionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotExecutionByExecutionIdPause(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotExecutionByExecutionIdPause"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/execution/{executionId}/resume}.
   *
   * <p>Required path parameters: executionId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotExecutionByExecutionIdResume(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotExecutionByExecutionIdResume"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/execution/{executionId}/rollback}.
   *
   * <p>Required path parameters: executionId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotExecutionByExecutionIdRollback(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotExecutionByExecutionIdRollback"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/export/{versionId}}.
   *
   * <p>Required path parameters: versionId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotExportByVersionId(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotExportByVersionId"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/export/github}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotExportGithub(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotExportGithub"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/export/github}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postAiCopilotExportGithub() {
    return postAiCopilotExportGithub(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/feedback}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotFeedback(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotFeedback"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/generation/{manifestId}/cancel}.
   *
   * <p>Required path parameters: manifestId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotGenerationByManifestIdCancel(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotGenerationByManifestIdCancel"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/git/branch}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotGitBranch(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotGitBranch"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/git/branch}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postAiCopilotGitBranch() {
    return postAiCopilotGitBranch(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/git/clone}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotGitClone(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotGitClone"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/git/clone}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postAiCopilotGitClone() {
    return postAiCopilotGitClone(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/git/commit}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotGitCommit(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotGitCommit"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/git/commit}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postAiCopilotGitCommit() {
    return postAiCopilotGitCommit(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/git/init}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotGitInit(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotGitInit"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/git/init}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postAiCopilotGitInit() {
    return postAiCopilotGitInit(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/git/pull}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotGitPull(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotGitPull"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/git/pull}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postAiCopilotGitPull() {
    return postAiCopilotGitPull(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/git/push}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotGitPush(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotGitPush"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/git/push}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postAiCopilotGitPush() {
    return postAiCopilotGitPush(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/git/write}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotGitWrite(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotGitWrite"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/git/write}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postAiCopilotGitWrite() {
    return postAiCopilotGitWrite(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/job}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotJob(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotJob"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/job/{jobId}/cancel}.
   *
   * <p>Required path parameters: jobId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotJobByJobIdCancel(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotJobByJobIdCancel"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/job/{jobId}/retry}.
   *
   * <p>Required path parameters: jobId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotJobByJobIdRetry(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotJobByJobIdRetry"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/manifest/{manifestId}/pause}.
   *
   * <p>Required path parameters: manifestId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotManifestByManifestIdPause(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotManifestByManifestIdPause"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/memories/{memoryId}/promote}.
   *
   * <p>Required path parameters: memoryId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotMemoriesByMemoryIdPromote(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotMemoriesByMemoryIdPromote"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/rate/{messageId}}.
   *
   * <p>Required path parameters: messageId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotRateByMessageId(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotRateByMessageId"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/session/{sessionId}/artifact-body}.
   *
   * <p>Required path parameters: sessionId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotSessionBySessionIdArtifactBody(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotSessionBySessionIdArtifactBody"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/session/{sessionId}/brainstorm/stop}.
   *
   * <p>Required path parameters: sessionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotSessionBySessionIdBrainstormStop(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotSessionBySessionIdBrainstormStop"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/session/{sessionId}/workspace/env}.
   *
   * <p>Required path parameters: sessionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotSessionBySessionIdWorkspaceEnv(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotSessionBySessionIdWorkspaceEnv"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/session/{sessionId}/workspace/fix}.
   *
   * <p>Required path parameters: sessionId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotSessionBySessionIdWorkspaceFix(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotSessionBySessionIdWorkspaceFix"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/session/{sessionId}/workspace/heartbeat}.
   *
   * <p>Required path parameters: sessionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotSessionBySessionIdWorkspaceHeartbeat(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotSessionBySessionIdWorkspaceHeartbeat"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/session/{sessionId}/workspace/install}.
   *
   * <p>Required path parameters: sessionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotSessionBySessionIdWorkspaceInstall(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotSessionBySessionIdWorkspaceInstall"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/session/{sessionId}/workspace/prepare}.
   *
   * <p>Required path parameters: sessionId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotSessionBySessionIdWorkspacePrepare(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotSessionBySessionIdWorkspacePrepare"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/session/{sessionId}/workspace/release}.
   *
   * <p>Required path parameters: sessionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotSessionBySessionIdWorkspaceRelease(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotSessionBySessionIdWorkspaceRelease"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/session/{sessionId}/workspace/repairs/apply}.
   *
   * <p>Required path parameters: sessionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotSessionBySessionIdWorkspaceRepairsApply(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotSessionBySessionIdWorkspaceRepairsApply"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/session/{sessionId}/workspace/restore}.
   *
   * <p>Required path parameters: sessionId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotSessionBySessionIdWorkspaceRestore(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotSessionBySessionIdWorkspaceRestore"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/session/{sessionId}/workspace/run}.
   *
   * <p>Required path parameters: sessionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotSessionBySessionIdWorkspaceRun(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotSessionBySessionIdWorkspaceRun"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/session/{sessionId}/workspace/stop}.
   *
   * <p>Required path parameters: sessionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotSessionBySessionIdWorkspaceStop(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotSessionBySessionIdWorkspaceStop"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/sessions}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotSessions(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotSessions"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/table-filters}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotTableFilters(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotTableFilters"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/table-filters/estimate}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotTableFiltersEstimate(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotTableFiltersEstimate"), request);
  }

  /**
   * Sends a blocking POST request to {@code /ai/copilot/training-consent/{sessionId}}.
   *
   * <p>Required path parameters: sessionId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAiCopilotTrainingConsentBySessionId(OperationRequest request) {
    return call(DEFINITIONS.get("postAiCopilotTrainingConsentBySessionId"), request);
  }

  /**
   * Sends a blocking POST request to {@code /alert-rules/project/{projectId}}.
   *
   * <p>Required path parameters: projectId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAlertRulesProjectByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("postAlertRulesProjectByProjectId"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/account-setup}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthAccountSetup(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthAccountSetup"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/account-setup}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postAuthAccountSetup() {
    return postAuthAccountSetup(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /auth/account-setup/check}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthAccountSetupCheck(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthAccountSetupCheck"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/account-setup/check}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postAuthAccountSetupCheck() {
    return postAuthAccountSetupCheck(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /auth/cli/authorize}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthCliAuthorize(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthCliAuthorize"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/cli/authorize}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postAuthCliAuthorize() {
    return postAuthCliAuthorize(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /auth/cli/callback}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthCliCallback(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthCliCallback"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/cli/deny}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthCliDeny(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthCliDeny"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/cli/login}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthCliLogin(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthCliLogin"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/cli/requests/check}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthCliRequestsCheck(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthCliRequestsCheck"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/cli/token}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthCliToken(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthCliToken"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/forgot-password}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   * @throws ConsoleOnlyException always; this platform operation requires the console
   */
  public Object postAuthForgotPassword(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthForgotPassword"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/login}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthLogin(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthLogin"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/logout}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthLogout(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthLogout"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/logout}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postAuthLogout() {
    return postAuthLogout(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /auth/logout-all}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthLogoutAll(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthLogoutAll"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/logout-all}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postAuthLogoutAll() {
    return postAuthLogoutAll(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /auth/me/linked-accounts/{provider}/start}.
   *
   * <p>Required path parameters: provider. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthMeLinkedAccountsByProviderStart(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthMeLinkedAccountsByProviderStart"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/mfa/disable}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthMfaDisable(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthMfaDisable"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/mfa/disable}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postAuthMfaDisable() {
    return postAuthMfaDisable(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /auth/mfa/enroll-confirm}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthMfaEnrollConfirm(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthMfaEnrollConfirm"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/mfa/enroll-confirm}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postAuthMfaEnrollConfirm() {
    return postAuthMfaEnrollConfirm(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /auth/mfa/enroll-start}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthMfaEnrollStart(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthMfaEnrollStart"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/mfa/enroll-start}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postAuthMfaEnrollStart() {
    return postAuthMfaEnrollStart(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /auth/mfa/regenerate-codes}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthMfaRegenerateCodes(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthMfaRegenerateCodes"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/mfa/regenerate-codes}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postAuthMfaRegenerateCodes() {
    return postAuthMfaRegenerateCodes(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /auth/mfa/verify}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthMfaVerify(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthMfaVerify"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/mfa/verify}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postAuthMfaVerify() {
    return postAuthMfaVerify(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /auth/reauthenticate}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthReauthenticate(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthReauthenticate"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/refresh}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthRefresh(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthRefresh"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/refresh}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postAuthRefresh() {
    return postAuthRefresh(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /auth/reset-password}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   * @throws ConsoleOnlyException always; this platform operation requires the console
   */
  public Object postAuthResetPassword(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthResetPassword"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/reset-password/check}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthResetPasswordCheck(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthResetPasswordCheck"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/session/device}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthSessionDevice(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthSessionDevice"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/session/token}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthSessionToken(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthSessionToken"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/session/token}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postAuthSessionToken() {
    return postAuthSessionToken(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /auth/signup}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   * @throws ConsoleOnlyException always; this platform operation requires the console
   */
  public Object postAuthSignup(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthSignup"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/sso/restart}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthSsoRestart(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthSsoRestart"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/sso/restart}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postAuthSsoRestart() {
    return postAuthSsoRestart(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /auth/tenant/handoff}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthTenantHandoff(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthTenantHandoff"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/tenant/login}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthTenantLogin(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthTenantLogin"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/tenant/logout}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthTenantLogout(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthTenantLogout"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/tenant/logout}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postAuthTenantLogout() {
    return postAuthTenantLogout(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /auth/tenant/mfa/verify}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthTenantMfaVerify(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthTenantMfaVerify"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/tenant/refresh}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthTenantRefresh(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthTenantRefresh"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/tenant/refresh}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postAuthTenantRefresh() {
    return postAuthTenantRefresh(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /auth/tenant/sso/start}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthTenantSsoStart(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthTenantSsoStart"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/verify-email/confirm}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthVerifyEmailConfirm(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthVerifyEmailConfirm"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/verify-email/resend}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthVerifyEmailResend(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthVerifyEmailResend"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/verify-email/send}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postAuthVerifyEmailSend(OperationRequest request) {
    return call(DEFINITIONS.get("postAuthVerifyEmailSend"), request);
  }

  /**
   * Sends a blocking POST request to {@code /auth/verify-email/send}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postAuthVerifyEmailSend() {
    return postAuthVerifyEmailSend(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /billing/checkout}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postBillingCheckout(OperationRequest request) {
    return call(DEFINITIONS.get("postBillingCheckout"), request);
  }

  /**
   * Sends a blocking POST request to {@code /billing/enterprise/inquiry}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postBillingEnterpriseInquiry(OperationRequest request) {
    return call(DEFINITIONS.get("postBillingEnterpriseInquiry"), request);
  }

  /**
   * Sends a blocking POST request to {@code /billing/hosting/checkout}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postBillingHostingCheckout(OperationRequest request) {
    return call(DEFINITIONS.get("postBillingHostingCheckout"), request);
  }

  /**
   * Sends a blocking POST request to {@code /billing/org/{orgId}/addons}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postBillingOrgByOrgIdAddons(OperationRequest request) {
    return call(DEFINITIONS.get("postBillingOrgByOrgIdAddons"), request);
  }

  /**
   * Sends a blocking POST request to {@code /billing/org/{orgId}/addons/{addonId}/preview}.
   *
   * <p>Required path parameters: orgId, addonId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postBillingOrgByOrgIdAddonsByAddonIdPreview(OperationRequest request) {
    return call(DEFINITIONS.get("postBillingOrgByOrgIdAddonsByAddonIdPreview"), request);
  }

  /**
   * Sends a blocking POST request to {@code /billing/org/{orgId}/addons/preview}.
   *
   * <p>Required path parameters: orgId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postBillingOrgByOrgIdAddonsPreview(OperationRequest request) {
    return call(DEFINITIONS.get("postBillingOrgByOrgIdAddonsPreview"), request);
  }

  /**
   * Sends a blocking POST request to {@code /billing/org/{orgId}/cancel}.
   *
   * <p>Required path parameters: orgId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postBillingOrgByOrgIdCancel(OperationRequest request) {
    return call(DEFINITIONS.get("postBillingOrgByOrgIdCancel"), request);
  }

  /**
   * Sends a blocking POST request to {@code /billing/org/{orgId}/card-check/confirm}.
   *
   * <p>Required path parameters: orgId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postBillingOrgByOrgIdCardCheckConfirm(OperationRequest request) {
    return call(DEFINITIONS.get("postBillingOrgByOrgIdCardCheckConfirm"), request);
  }

  /**
   * Sends a blocking POST request to {@code /billing/org/{orgId}/card-check/session}.
   *
   * <p>Required path parameters: orgId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postBillingOrgByOrgIdCardCheckSession(OperationRequest request) {
    return call(DEFINITIONS.get("postBillingOrgByOrgIdCardCheckSession"), request);
  }

  /**
   * Sends a blocking POST request to {@code /billing/org/{orgId}/change-plan}.
   *
   * <p>Required path parameters: orgId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postBillingOrgByOrgIdChangePlan(OperationRequest request) {
    return call(DEFINITIONS.get("postBillingOrgByOrgIdChangePlan"), request);
  }

  /**
   * Sends a blocking POST request to {@code /billing/org/{orgId}/change-plan/preview}.
   *
   * <p>Required path parameters: orgId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postBillingOrgByOrgIdChangePlanPreview(OperationRequest request) {
    return call(DEFINITIONS.get("postBillingOrgByOrgIdChangePlanPreview"), request);
  }

  /**
   * Sends a blocking POST request to {@code /billing/org/{orgId}/contacts}.
   *
   * <p>Required path parameters: orgId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postBillingOrgByOrgIdContacts(OperationRequest request) {
    return call(DEFINITIONS.get("postBillingOrgByOrgIdContacts"), request);
  }

  /**
   * Sends a blocking POST request to {@code /billing/org/{orgId}/credits/purchase}.
   *
   * <p>Required path parameters: orgId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postBillingOrgByOrgIdCreditsPurchase(OperationRequest request) {
    return call(DEFINITIONS.get("postBillingOrgByOrgIdCreditsPurchase"), request);
  }

  /**
   * Sends a blocking POST request to {@code /billing/org/{orgId}/pause}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postBillingOrgByOrgIdPause(OperationRequest request) {
    return call(DEFINITIONS.get("postBillingOrgByOrgIdPause"), request);
  }

  /**
   * Sends a blocking POST request to {@code /billing/org/{orgId}/portal}.
   *
   * <p>Required path parameters: orgId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postBillingOrgByOrgIdPortal(OperationRequest request) {
    return call(DEFINITIONS.get("postBillingOrgByOrgIdPortal"), request);
  }

  /**
   * Sends a blocking POST request to {@code /billing/org/{orgId}/reactivate}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postBillingOrgByOrgIdReactivate(OperationRequest request) {
    return call(DEFINITIONS.get("postBillingOrgByOrgIdReactivate"), request);
  }

  /**
   * Sends a blocking POST request to {@code /billing/org/{orgId}/resume}.
   *
   * <p>Required path parameters: orgId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postBillingOrgByOrgIdResume(OperationRequest request) {
    return call(DEFINITIONS.get("postBillingOrgByOrgIdResume"), request);
  }

  /**
   * Sends a blocking POST request to {@code /billing/org/{orgId}/usage-alerts}.
   *
   * <p>Required path parameters: orgId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postBillingOrgByOrgIdUsageAlerts(OperationRequest request) {
    return call(DEFINITIONS.get("postBillingOrgByOrgIdUsageAlerts"), request);
  }

  /**
   * Sends a blocking POST request to {@code /billing/promo-codes/validate}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postBillingPromoCodesValidate(OperationRequest request) {
    return call(DEFINITIONS.get("postBillingPromoCodesValidate"), request);
  }

  /**
   * Sends a blocking POST request to {@code /billing/redeem-promo}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postBillingRedeemPromo(OperationRequest request) {
    return call(DEFINITIONS.get("postBillingRedeemPromo"), request);
  }

  /**
   * Sends a blocking POST request to {@code /billing/webhook}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postBillingWebhook(OperationRequest request) {
    return call(DEFINITIONS.get("postBillingWebhook"), request);
  }

  /**
   * Sends a blocking POST request to {@code /billing/webhook}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postBillingWebhook() {
    return postBillingWebhook(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /buckets/{bucketId}/signed-url}.
   *
   * <p>Required path parameters: bucketId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postBucketsByBucketIdSignedUrl(OperationRequest request) {
    return call(DEFINITIONS.get("postBucketsByBucketIdSignedUrl"), request);
  }

  /**
   * Sends a blocking POST request to {@code /buckets/{bucketId}/upload}.
   *
   * <p>Required path parameters: bucketId. Query parameters: key (required), contentType. Requires a binary body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postBucketsByBucketIdUpload(OperationRequest request) {
    return call(DEFINITIONS.get("postBucketsByBucketIdUpload"), request);
  }

  /**
   * Sends a blocking POST request to {@code /buckets/{bucketId}/upload-url}.
   *
   * <p>Required path parameters: bucketId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postBucketsByBucketIdUploadUrl(OperationRequest request) {
    return call(DEFINITIONS.get("postBucketsByBucketIdUploadUrl"), request);
  }

  /**
   * Sends a blocking POST request to {@code /contact}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postContact(OperationRequest request) {
    return call(DEFINITIONS.get("postContact"), request);
  }

  /**
   * Sends a blocking POST request to {@code /database/connector/{projectId}/query}.
   *
   * <p>Required path parameters: projectId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postDatabaseConnectorByProjectIdQuery(OperationRequest request) {
    return call(DEFINITIONS.get("postDatabaseConnectorByProjectIdQuery"), request);
  }

  /**
   * Sends a blocking POST request to {@code /database/connector/{projectId}/test}.
   *
   * <p>Required path parameters: projectId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postDatabaseConnectorByProjectIdTest(OperationRequest request) {
    return call(DEFINITIONS.get("postDatabaseConnectorByProjectIdTest"), request);
  }

  /**
   * Sends a blocking POST request to {@code /database/extensions/project/{projectId}/install}.
   *
   * <p>Required path parameters: projectId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postDatabaseExtensionsProjectByProjectIdInstall(OperationRequest request) {
    return call(DEFINITIONS.get("postDatabaseExtensionsProjectByProjectIdInstall"), request);
  }

  /**
   * Sends a blocking POST request to {@code /database/wrappers/project/{projectId}/install}.
   *
   * <p>Required path parameters: projectId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postDatabaseWrappersProjectByProjectIdInstall(OperationRequest request) {
    return call(DEFINITIONS.get("postDatabaseWrappersProjectByProjectIdInstall"), request);
  }

  /**
   * Sends a blocking POST request to {@code /deployments/{deploymentId}/rollback}.
   *
   * <p>Required path parameters: deploymentId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postDeploymentsByDeploymentIdRollback(OperationRequest request) {
    return call(DEFINITIONS.get("postDeploymentsByDeploymentIdRollback"), request);
  }

  /**
   * Sends a blocking POST request to {@code /deployments/promote}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postDeploymentsPromote(OperationRequest request) {
    return call(DEFINITIONS.get("postDeploymentsPromote"), request);
  }

  /**
   * Sends a blocking POST request to {@code /deployments/tokens}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postDeploymentsTokens(OperationRequest request) {
    return call(DEFINITIONS.get("postDeploymentsTokens"), request);
  }

  /**
   * Sends a blocking POST request to {@code /deployments/tokens/{tokenId}/revoke}.
   *
   * <p>Required path parameters: tokenId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postDeploymentsTokensByTokenIdRevoke(OperationRequest request) {
    return call(DEFINITIONS.get("postDeploymentsTokensByTokenIdRevoke"), request);
  }

  /**
   * Sends a blocking POST request to {@code /deployments/trigger}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postDeploymentsTrigger(OperationRequest request) {
    return call(DEFINITIONS.get("postDeploymentsTrigger"), request);
  }

  /**
   * Sends a blocking POST request to {@code /deployments/trigger}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postDeploymentsTrigger() {
    return postDeploymentsTrigger(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /docs/feedback}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postDocsFeedback(OperationRequest request) {
    return call(DEFINITIONS.get("postDocsFeedback"), request);
  }

  /**
   * Sends a blocking POST request to {@code /docs/feedback}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postDocsFeedback() {
    return postDocsFeedback(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /docs/search-click}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postDocsSearchClick(OperationRequest request) {
    return call(DEFINITIONS.get("postDocsSearchClick"), request);
  }

  /**
   * Sends a blocking POST request to {@code /docs/search-click}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postDocsSearchClick() {
    return postDocsSearchClick(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /enterprise/inquire}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postEnterpriseInquire(OperationRequest request) {
    return call(DEFINITIONS.get("postEnterpriseInquire"), request);
  }

  /**
   * Sends a blocking POST request to {@code /enterprise/quotes/{quoteId}/accept}.
   *
   * <p>Required path parameters: quoteId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postEnterpriseQuotesByQuoteIdAccept(OperationRequest request) {
    return call(DEFINITIONS.get("postEnterpriseQuotesByQuoteIdAccept"), request);
  }

  /**
   * Sends a blocking POST request to {@code /entitlements/org/{orgId}/check}.
   *
   * <p>Required path parameters: orgId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postEntitlementsOrgByOrgIdCheck(OperationRequest request) {
    return call(DEFINITIONS.get("postEntitlementsOrgByOrgIdCheck"), request);
  }

  /**
   * Sends a blocking POST request to {@code /functions}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postFunctions(OperationRequest request) {
    return call(DEFINITIONS.get("postFunctions"), request);
  }

  /**
   * Sends a blocking POST request to {@code /functions/{functionIdOrName}/invoke}.
   *
   * <p>Required path parameters: functionIdOrName. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postFunctionsByFunctionIdOrNameInvoke(OperationRequest request) {
    return call(DEFINITIONS.get("postFunctionsByFunctionIdOrNameInvoke"), request);
  }

  /**
   * Sends a blocking POST request to {@code /functions/{functionId}/triggers}.
   *
   * <p>Required path parameters: functionId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postFunctionsByFunctionIdTriggers(OperationRequest request) {
    return call(DEFINITIONS.get("postFunctionsByFunctionIdTriggers"), request);
  }

  /**
   * Sends a blocking POST request to {@code /functions/secrets}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postFunctionsSecrets(OperationRequest request) {
    return call(DEFINITIONS.get("postFunctionsSecrets"), request);
  }

  /**
   * Sends a blocking POST request to {@code /generated/{table}}.
   *
   * <p>Required path parameters: table. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postGeneratedByTable(OperationRequest request) {
    return call(DEFINITIONS.get("postGeneratedByTable"), request);
  }

  /**
   * Sends a blocking POST request to {@code /generated/{table}/bulk}.
   *
   * <p>Required path parameters: table. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postGeneratedByTableBulk(OperationRequest request) {
    return call(DEFINITIONS.get("postGeneratedByTableBulk"), request);
  }

  /**
   * Sends a blocking POST request to {@code /generated/{table}/query}.
   *
   * <p>Required path parameters: table. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postGeneratedByTableQuery(OperationRequest request) {
    return call(DEFINITIONS.get("postGeneratedByTableQuery"), request);
  }

  /**
   * Sends a blocking POST request to {@code /incidents}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postIncidents(OperationRequest request) {
    return call(DEFINITIONS.get("postIncidents"), request);
  }

  /**
   * Sends a blocking POST request to {@code /incidents/bulk}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postIncidentsBulk(OperationRequest request) {
    return call(DEFINITIONS.get("postIncidentsBulk"), request);
  }

  /**
   * Sends a blocking POST request to {@code /incidents/{incidentId}/ack}.
   *
   * <p>Required path parameters: incidentId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postIncidentsByIncidentIdAck(OperationRequest request) {
    return call(DEFINITIONS.get("postIncidentsByIncidentIdAck"), request);
  }

  /**
   * Sends a blocking POST request to {@code /incidents/{incidentId}/resolve}.
   *
   * <p>Required path parameters: incidentId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postIncidentsByIncidentIdResolve(OperationRequest request) {
    return call(DEFINITIONS.get("postIncidentsByIncidentIdResolve"), request);
  }

  /**
   * Sends a blocking POST request to {@code /infrastructure/poll-status}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postInfrastructurePollStatus(OperationRequest request) {
    return call(DEFINITIONS.get("postInfrastructurePollStatus"), request);
  }

  /**
   * Sends a blocking POST request to {@code /infrastructure/poll-status}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postInfrastructurePollStatus() {
    return postInfrastructurePollStatus(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /integrations/deliveries/{deliveryId}/retry}.
   *
   * <p>Required path parameters: deliveryId. Query parameters: not, allowProduction. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postIntegrationsDeliveriesByDeliveryIdRetry(OperationRequest request) {
    return call(DEFINITIONS.get("postIntegrationsDeliveriesByDeliveryIdRetry"), request);
  }

  /**
   * Sends a blocking POST request to {@code /integrations/subscriptions}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postIntegrationsSubscriptions(OperationRequest request) {
    return call(DEFINITIONS.get("postIntegrationsSubscriptions"), request);
  }

  /**
   * Sends a blocking POST request to {@code /integrations/subscriptions/{id}/test}.
   *
   * <p>Required path parameters: id. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postIntegrationsSubscriptionsByIdTest(OperationRequest request) {
    return call(DEFINITIONS.get("postIntegrationsSubscriptionsByIdTest"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mcp/audit}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMcpAudit(OperationRequest request) {
    return call(DEFINITIONS.get("postMcpAudit"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mcp/oauth/register}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMcpOauthRegister(OperationRequest request) {
    return call(DEFINITIONS.get("postMcpOauthRegister"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mcp/oauth/requests/{requestId}/approve}.
   *
   * <p>Required path parameters: requestId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMcpOauthRequestsByRequestIdApprove(OperationRequest request) {
    return call(DEFINITIONS.get("postMcpOauthRequestsByRequestIdApprove"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mcp/oauth/requests/{requestId}/deny}.
   *
   * <p>Required path parameters: requestId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMcpOauthRequestsByRequestIdDeny(OperationRequest request) {
    return call(DEFINITIONS.get("postMcpOauthRequestsByRequestIdDeny"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mcp/oauth/revoke}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMcpOauthRevoke(OperationRequest request) {
    return call(DEFINITIONS.get("postMcpOauthRevoke"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mcp/oauth/token}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMcpOauthToken(OperationRequest request) {
    return call(DEFINITIONS.get("postMcpOauthToken"), request);
  }

  /**
   * Sends a blocking POST request to {@code /me/early/welcome-seen}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMeEarlyWelcomeSeen(OperationRequest request) {
    return call(DEFINITIONS.get("postMeEarlyWelcomeSeen"), request);
  }

  /**
   * Sends a blocking POST request to {@code /me/early/welcome-seen}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postMeEarlyWelcomeSeen() {
    return postMeEarlyWelcomeSeen(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /mongodb/{collection}/aggregate}.
   *
   * <p>Required path parameters: collection. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMongodbByCollectionAggregate(OperationRequest request) {
    return call(DEFINITIONS.get("postMongodbByCollectionAggregate"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mongodb/{collection}/aggregate/cursor}.
   *
   * <p>Required path parameters: collection. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMongodbByCollectionAggregateCursor(OperationRequest request) {
    return call(DEFINITIONS.get("postMongodbByCollectionAggregateCursor"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mongodb/{collection}/bulkWrite}.
   *
   * <p>Required path parameters: collection. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMongodbByCollectionBulkWrite(OperationRequest request) {
    return call(DEFINITIONS.get("postMongodbByCollectionBulkWrite"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mongodb/{collection}/count}.
   *
   * <p>Required path parameters: collection. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMongodbByCollectionCount(OperationRequest request) {
    return call(DEFINITIONS.get("postMongodbByCollectionCount"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mongodb/{collection}/cursor/{cursorId}/close}.
   *
   * <p>Required path parameters: collection, cursorId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMongodbByCollectionCursorByCursorIdClose(OperationRequest request) {
    return call(DEFINITIONS.get("postMongodbByCollectionCursorByCursorIdClose"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mongodb/{collection}/cursor/{cursorId}/next}.
   *
   * <p>Required path parameters: collection, cursorId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMongodbByCollectionCursorByCursorIdNext(OperationRequest request) {
    return call(DEFINITIONS.get("postMongodbByCollectionCursorByCursorIdNext"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mongodb/{collection}/deleteMany}.
   *
   * <p>Required path parameters: collection. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMongodbByCollectionDeleteMany(OperationRequest request) {
    return call(DEFINITIONS.get("postMongodbByCollectionDeleteMany"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mongodb/{collection}/deleteOne}.
   *
   * <p>Required path parameters: collection. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMongodbByCollectionDeleteOne(OperationRequest request) {
    return call(DEFINITIONS.get("postMongodbByCollectionDeleteOne"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mongodb/{collection}/distinct}.
   *
   * <p>Required path parameters: collection. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMongodbByCollectionDistinct(OperationRequest request) {
    return call(DEFINITIONS.get("postMongodbByCollectionDistinct"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mongodb/{collection}/find}.
   *
   * <p>Required path parameters: collection. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMongodbByCollectionFind(OperationRequest request) {
    return call(DEFINITIONS.get("postMongodbByCollectionFind"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mongodb/{collection}/find/cursor}.
   *
   * <p>Required path parameters: collection. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMongodbByCollectionFindCursor(OperationRequest request) {
    return call(DEFINITIONS.get("postMongodbByCollectionFindCursor"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mongodb/{collection}/findOne}.
   *
   * <p>Required path parameters: collection. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMongodbByCollectionFindOne(OperationRequest request) {
    return call(DEFINITIONS.get("postMongodbByCollectionFindOne"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mongodb/{collection}/findOneAndDelete}.
   *
   * <p>Required path parameters: collection. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMongodbByCollectionFindOneAndDelete(OperationRequest request) {
    return call(DEFINITIONS.get("postMongodbByCollectionFindOneAndDelete"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mongodb/{collection}/findOneAndReplace}.
   *
   * <p>Required path parameters: collection. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMongodbByCollectionFindOneAndReplace(OperationRequest request) {
    return call(DEFINITIONS.get("postMongodbByCollectionFindOneAndReplace"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mongodb/{collection}/findOneAndUpdate}.
   *
   * <p>Required path parameters: collection. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMongodbByCollectionFindOneAndUpdate(OperationRequest request) {
    return call(DEFINITIONS.get("postMongodbByCollectionFindOneAndUpdate"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mongodb/{collection}/indexes}.
   *
   * <p>Required path parameters: collection. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMongodbByCollectionIndexes(OperationRequest request) {
    return call(DEFINITIONS.get("postMongodbByCollectionIndexes"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mongodb/{collection}/insertMany}.
   *
   * <p>Required path parameters: collection. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMongodbByCollectionInsertMany(OperationRequest request) {
    return call(DEFINITIONS.get("postMongodbByCollectionInsertMany"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mongodb/{collection}/insertOne}.
   *
   * <p>Required path parameters: collection. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMongodbByCollectionInsertOne(OperationRequest request) {
    return call(DEFINITIONS.get("postMongodbByCollectionInsertOne"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mongodb/{collection}/replaceOne}.
   *
   * <p>Required path parameters: collection. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMongodbByCollectionReplaceOne(OperationRequest request) {
    return call(DEFINITIONS.get("postMongodbByCollectionReplaceOne"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mongodb/{collection}/updateMany}.
   *
   * <p>Required path parameters: collection. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMongodbByCollectionUpdateMany(OperationRequest request) {
    return call(DEFINITIONS.get("postMongodbByCollectionUpdateMany"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mongodb/{collection}/updateOne}.
   *
   * <p>Required path parameters: collection. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMongodbByCollectionUpdateOne(OperationRequest request) {
    return call(DEFINITIONS.get("postMongodbByCollectionUpdateOne"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mongodb/collections}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMongodbCollections(OperationRequest request) {
    return call(DEFINITIONS.get("postMongodbCollections"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mongodb/collections}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postMongodbCollections() {
    return postMongodbCollections(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /mongodb/collections/{name}/rename}.
   *
   * <p>Required path parameters: name. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMongodbCollectionsByNameRename(OperationRequest request) {
    return call(DEFINITIONS.get("postMongodbCollectionsByNameRename"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mongodb/command}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postMongodbCommand(OperationRequest request) {
    return call(DEFINITIONS.get("postMongodbCommand"), request);
  }

  /**
   * Sends a blocking POST request to {@code /mongodb/command}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postMongodbCommand() {
    return postMongodbCommand(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /oauth/callback}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postOauthCallback(OperationRequest request) {
    return call(DEFINITIONS.get("postOauthCallback"), request);
  }

  /**
   * Sends a blocking POST request to {@code /oauth/org/{orgId}/configure}.
   *
   * <p>Required path parameters: orgId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postOauthOrgByOrgIdConfigure(OperationRequest request) {
    return call(DEFINITIONS.get("postOauthOrgByOrgIdConfigure"), request);
  }

  /**
   * Sends a blocking POST request to {@code /oauth/org/{orgId}/provider/{provider}/refresh}.
   *
   * <p>Required path parameters: orgId, provider. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postOauthOrgByOrgIdProviderByProviderRefresh(OperationRequest request) {
    return call(DEFINITIONS.get("postOauthOrgByOrgIdProviderByProviderRefresh"), request);
  }

  /**
   * Sends a blocking POST request to {@code /onboarding/org/{orgId}/auto-setup}.
   *
   * <p>Required path parameters: orgId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postOnboardingOrgByOrgIdAutoSetup(OperationRequest request) {
    return call(DEFINITIONS.get("postOnboardingOrgByOrgIdAutoSetup"), request);
  }

  /**
   * Sends a blocking POST request to {@code /onboarding/org/{orgId}/complete-step}.
   *
   * <p>Required path parameters: orgId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postOnboardingOrgByOrgIdCompleteStep(OperationRequest request) {
    return call(DEFINITIONS.get("postOnboardingOrgByOrgIdCompleteStep"), request);
  }

  /**
   * Sends a blocking POST request to {@code /orgs}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postOrgs(OperationRequest request) {
    return call(DEFINITIONS.get("postOrgs"), request);
  }

  /**
   * Sends a blocking POST request to {@code /orgs}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postOrgs() {
    return postOrgs(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /orgs/{orgId}/change-requests}.
   *
   * <p>Required path parameters: orgId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postOrgsByOrgIdChangeRequests(OperationRequest request) {
    return call(DEFINITIONS.get("postOrgsByOrgIdChangeRequests"), request);
  }

  /**
   * Sends a blocking POST request to {@code /orgs/{orgId}/invites/{inviteId}/resend}.
   *
   * <p>Required path parameters: orgId, inviteId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postOrgsByOrgIdInvitesByInviteIdResend(OperationRequest request) {
    return call(DEFINITIONS.get("postOrgsByOrgIdInvitesByInviteIdResend"), request);
  }

  /**
   * Sends a blocking POST request to {@code /orgs/{orgId}/leave-requests}.
   *
   * <p>Required path parameters: orgId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postOrgsByOrgIdLeaveRequests(OperationRequest request) {
    return call(DEFINITIONS.get("postOrgsByOrgIdLeaveRequests"), request);
  }

  /**
   * Sends a blocking POST request to {@code /orgs/{orgId}/leave-requests/{requestId}/approve}.
   *
   * <p>Required path parameters: orgId, requestId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postOrgsByOrgIdLeaveRequestsByRequestIdApprove(OperationRequest request) {
    return call(DEFINITIONS.get("postOrgsByOrgIdLeaveRequestsByRequestIdApprove"), request);
  }

  /**
   * Sends a blocking POST request to {@code /orgs/{orgId}/leave-requests/{requestId}/decline}.
   *
   * <p>Required path parameters: orgId, requestId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postOrgsByOrgIdLeaveRequestsByRequestIdDecline(OperationRequest request) {
    return call(DEFINITIONS.get("postOrgsByOrgIdLeaveRequestsByRequestIdDecline"), request);
  }

  /**
   * Sends a blocking POST request to {@code /orgs/{orgId}/members/invite}.
   *
   * <p>Required path parameters: orgId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postOrgsByOrgIdMembersInvite(OperationRequest request) {
    return call(DEFINITIONS.get("postOrgsByOrgIdMembersInvite"), request);
  }

  /**
   * Sends a blocking POST request to {@code /orgs/{orgId}/support/tickets}.
   *
   * <p>Required path parameters: orgId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postOrgsByOrgIdSupportTickets(OperationRequest request) {
    return call(DEFINITIONS.get("postOrgsByOrgIdSupportTickets"), request);
  }

  /**
   * Sends a blocking POST request to {@code /orgs/{orgId}/support/tickets/{number}/messages}.
   *
   * <p>Required path parameters: orgId, number. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postOrgsByOrgIdSupportTicketsByNumberMessages(OperationRequest request) {
    return call(DEFINITIONS.get("postOrgsByOrgIdSupportTicketsByNumberMessages"), request);
  }

  /**
   * Sends a blocking POST request to {@code /orgs/{orgId}/support/tickets/{number}/reopen}.
   *
   * <p>Required path parameters: orgId, number. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postOrgsByOrgIdSupportTicketsByNumberReopen(OperationRequest request) {
    return call(DEFINITIONS.get("postOrgsByOrgIdSupportTicketsByNumberReopen"), request);
  }

  /**
   * Sends a blocking POST request to {@code /orgs/{orgId}/support/tickets/{number}/resolve}.
   *
   * <p>Required path parameters: orgId, number. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postOrgsByOrgIdSupportTicketsByNumberResolve(OperationRequest request) {
    return call(DEFINITIONS.get("postOrgsByOrgIdSupportTicketsByNumberResolve"), request);
  }

  /**
   * Sends a blocking POST request to {@code /orgs/{orgId}/transfer}.
   *
   * <p>Required path parameters: orgId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postOrgsByOrgIdTransfer(OperationRequest request) {
    return call(DEFINITIONS.get("postOrgsByOrgIdTransfer"), request);
  }

  /**
   * Sends a blocking POST request to {@code /orgs/{orgId}/transfers/{id}/resend}.
   *
   * <p>Required path parameters: orgId, id. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postOrgsByOrgIdTransfersByIdResend(OperationRequest request) {
    return call(DEFINITIONS.get("postOrgsByOrgIdTransfersByIdResend"), request);
  }

  /**
   * Sends a blocking POST request to {@code /orgs/first}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postOrgsFirst(OperationRequest request) {
    return call(DEFINITIONS.get("postOrgsFirst"), request);
  }

  /**
   * Sends a blocking POST request to {@code /orgs/first}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postOrgsFirst() {
    return postOrgsFirst(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /orgs/invites/accept}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postOrgsInvitesAccept(OperationRequest request) {
    return call(DEFINITIONS.get("postOrgsInvitesAccept"), request);
  }

  /**
   * Sends a blocking POST request to {@code /orgs/invites/accept}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postOrgsInvitesAccept() {
    return postOrgsInvitesAccept(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /orgs/invites/decline}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postOrgsInvitesDecline(OperationRequest request) {
    return call(DEFINITIONS.get("postOrgsInvitesDecline"), request);
  }

  /**
   * Sends a blocking POST request to {@code /orgs/invites/decline}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postOrgsInvitesDecline() {
    return postOrgsInvitesDecline(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /orgs/transfers/accept}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postOrgsTransfersAccept(OperationRequest request) {
    return call(DEFINITIONS.get("postOrgsTransfersAccept"), request);
  }

  /**
   * Sends a blocking POST request to {@code /orgs/transfers/accept}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postOrgsTransfersAccept() {
    return postOrgsTransfersAccept(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /orgs/transfers/decline}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postOrgsTransfersDecline(OperationRequest request) {
    return call(DEFINITIONS.get("postOrgsTransfersDecline"), request);
  }

  /**
   * Sends a blocking POST request to {@code /orgs/transfers/decline}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postOrgsTransfersDecline() {
    return postOrgsTransfersDecline(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /plans/apply}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postPlansApply(OperationRequest request) {
    return call(DEFINITIONS.get("postPlansApply"), request);
  }

  /**
   * Sends a blocking POST request to {@code /plans/save}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postPlansSave(OperationRequest request) {
    return call(DEFINITIONS.get("postPlansSave"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjects(OperationRequest request) {
    return call(DEFINITIONS.get("postProjects"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/api-keys}.
   *
   * <p>Required path parameters: projectId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdApiKeys(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdApiKeys"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/api-keys/{keyId}/reveal}.
   *
   * <p>Required path parameters: projectId, keyId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdApiKeysByKeyIdReveal(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdApiKeysByKeyIdReveal"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/api-keys/{keyId}/revoke}.
   *
   * <p>Required path parameters: projectId, keyId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdApiKeysByKeyIdRevoke(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdApiKeysByKeyIdRevoke"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/api-keys/{keyId}/rotate}.
   *
   * <p>Required path parameters: projectId, keyId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdApiKeysByKeyIdRotate(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdApiKeysByKeyIdRotate"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/api-keys/split}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdApiKeysSplit(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdApiKeysSplit"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/auth/forgot-password}.
   *
   * <p>Required path parameters: projectId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdAuthForgotPassword(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdAuthForgotPassword"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/auth/login}.
   *
   * <p>Required path parameters: projectId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdAuthLogin(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdAuthLogin"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/auth/logout}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdAuthLogout(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdAuthLogout"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/auth/magic/send}.
   *
   * <p>Required path parameters: projectId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdAuthMagicSend(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdAuthMagicSend"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/auth/mfa/disable}.
   *
   * <p>Required path parameters: projectId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdAuthMfaDisable(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdAuthMfaDisable"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/auth/mfa/enroll-confirm}.
   *
   * <p>Required path parameters: projectId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdAuthMfaEnrollConfirm(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdAuthMfaEnrollConfirm"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/auth/mfa/enroll-start}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdAuthMfaEnrollStart(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdAuthMfaEnrollStart"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/auth/mfa/regenerate-codes}.
   *
   * <p>Required path parameters: projectId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdAuthMfaRegenerateCodes(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdAuthMfaRegenerateCodes"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/auth/mfa/verify}.
   *
   * <p>Required path parameters: projectId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdAuthMfaVerify(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdAuthMfaVerify"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/auth/oauth/{provider}/start}.
   *
   * <p>Required path parameters: projectId, provider. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdAuthOauthByProviderStart(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdAuthOauthByProviderStart"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/auth/oauth/token}.
   *
   * <p>Required path parameters: projectId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdAuthOauthToken(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdAuthOauthToken"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/auth/refresh}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdAuthRefresh(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdAuthRefresh"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/auth/reset-password}.
   *
   * <p>Required path parameters: projectId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdAuthResetPassword(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdAuthResetPassword"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/auth/signup}.
   *
   * <p>Required path parameters: projectId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdAuthSignup(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdAuthSignup"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/auth/sync-users}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdAuthSyncUsers(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdAuthSyncUsers"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/auth/verify-email/confirm}.
   *
   * <p>Required path parameters: projectId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdAuthVerifyEmailConfirm(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdAuthVerifyEmailConfirm"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/auth/verify-email/send}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdAuthVerifyEmailSend(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdAuthVerifyEmailSend"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/branches}.
   *
   * <p>Required path parameters: projectId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdBranches(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdBranches"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/database/dedicated}.
   *
   * <p>Required path parameters: projectId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdDatabaseDedicated(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdDatabaseDedicated"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/database/dedicated/restart}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdDatabaseDedicatedRestart(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdDatabaseDedicatedRestart"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/db/reset}.
   *
   * <p>Required path parameters: projectId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdDbReset(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdDbReset"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/env-vars}.
   *
   * <p>Required path parameters: projectId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdEnvVars(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdEnvVars"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/environments}.
   *
   * <p>Required path parameters: projectId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdEnvironments(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdEnvironments"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/environments/backfill-urls}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdEnvironmentsBackfillUrls(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdEnvironmentsBackfillUrls"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/environments/bootstrap}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdEnvironmentsBootstrap(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdEnvironmentsBootstrap"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/environments/{envId}/domains/{domainId}/verify}.
   *
   * <p>Required path parameters: projectId, envId, domainId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdEnvironmentsByEnvIdDomainsByDomainIdVerify(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdEnvironmentsByEnvIdDomainsByDomainIdVerify"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/environments/{envId}/provision-ssl}.
   *
   * <p>Required path parameters: projectId, envId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdEnvironmentsByEnvIdProvisionSsl(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdEnvironmentsByEnvIdProvisionSsl"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/environments/{envId}/verify-cname}.
   *
   * <p>Required path parameters: projectId, envId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdEnvironmentsByEnvIdVerifyCname(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdEnvironmentsByEnvIdVerifyCname"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/environments/{envId}/verify-domain}.
   *
   * <p>Required path parameters: projectId, envId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdEnvironmentsByEnvIdVerifyDomain(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdEnvironmentsByEnvIdVerifyDomain"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/github/branch}.
   *
   * <p>Required path parameters: projectId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdGithubBranch(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdGithubBranch"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/github/connect}.
   *
   * <p>Required path parameters: projectId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdGithubConnect(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdGithubConnect"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/github/pull}.
   *
   * <p>Required path parameters: projectId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdGithubPull(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdGithubPull"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/github/push}.
   *
   * <p>Required path parameters: projectId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdGithubPush(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdGithubPush"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/infrastructure/{instanceId}/migrate-now}.
   *
   * <p>Required path parameters: projectId, instanceId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdInfrastructureByInstanceIdMigrateNow(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdInfrastructureByInstanceIdMigrateNow"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/infrastructure/{instanceId}/replica}.
   *
   * <p>Required path parameters: projectId, instanceId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdInfrastructureByInstanceIdReplica(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdInfrastructureByInstanceIdReplica"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/infrastructure/{instanceId}/replica-preview}.
   *
   * <p>Required path parameters: projectId, instanceId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdInfrastructureByInstanceIdReplicaPreview(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdInfrastructureByInstanceIdReplicaPreview"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/infrastructure/{instanceId}/resize}.
   *
   * <p>Required path parameters: projectId, instanceId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdInfrastructureByInstanceIdResize(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdInfrastructureByInstanceIdResize"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/infrastructure/{instanceId}/resize-custom}.
   *
   * <p>Required path parameters: projectId, instanceId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdInfrastructureByInstanceIdResizeCustom(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdInfrastructureByInstanceIdResizeCustom"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/infrastructure/{instanceId}/start}.
   *
   * <p>Required path parameters: projectId, instanceId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdInfrastructureByInstanceIdStart(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdInfrastructureByInstanceIdStart"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/infrastructure/{instanceId}/stop}.
   *
   * <p>Required path parameters: projectId, instanceId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdInfrastructureByInstanceIdStop(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdInfrastructureByInstanceIdStop"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/infrastructure/{instanceId}/switch}.
   *
   * <p>Required path parameters: projectId, instanceId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdInfrastructureByInstanceIdSwitch(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdInfrastructureByInstanceIdSwitch"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/infrastructure/included/retry}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdInfrastructureIncludedRetry(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdInfrastructureIncludedRetry"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/infrastructure/migration/retry}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdInfrastructureMigrationRetry(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdInfrastructureMigrationRetry"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/infrastructure/migration/rollback}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdInfrastructureMigrationRollback(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdInfrastructureMigrationRollback"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/infrastructure/provision}.
   *
   * <p>Required path parameters: projectId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdInfrastructureProvision(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdInfrastructureProvision"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/infrastructure/provision-custom}.
   *
   * <p>Required path parameters: projectId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdInfrastructureProvisionCustom(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdInfrastructureProvisionCustom"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/infrastructure/provision-preview}.
   *
   * <p>Required path parameters: projectId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdInfrastructureProvisionPreview(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdInfrastructureProvisionPreview"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/infrastructure/restores/preview}.
   *
   * <p>Required path parameters: projectId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdInfrastructureRestoresPreview(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdInfrastructureRestoresPreview"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/members}.
   *
   * <p>Required path parameters: projectId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdMembers(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdMembers"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/promotions}.
   *
   * <p>Required path parameters: projectId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdPromotions(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdPromotions"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/region}.
   *
   * <p>Required path parameters: projectId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdRegion(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdRegion"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/settings/jwt/rotate}.
   *
   * <p>Required path parameters: projectId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdSettingsJwtRotate(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdSettingsJwtRotate"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/users}.
   *
   * <p>Required path parameters: projectId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdUsers(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdUsers"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/users/{userId}/ban}.
   *
   * <p>Required path parameters: projectId, userId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdUsersByUserIdBan(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdUsersByUserIdBan"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/users/{userId}/send-magic-link}.
   *
   * <p>Required path parameters: projectId, userId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdUsersByUserIdSendMagicLink(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdUsersByUserIdSendMagicLink"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/users/{userId}/sessions/revoke-all}.
   *
   * <p>Required path parameters: projectId, userId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdUsersByUserIdSessionsRevokeAll(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdUsersByUserIdSessionsRevokeAll"), request);
  }

  /**
   * Sends a blocking POST request to {@code /projects/{projectId}/users/{userId}/unban}.
   *
   * <p>Required path parameters: projectId, userId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postProjectsByProjectIdUsersByUserIdUnban(OperationRequest request) {
    return call(DEFINITIONS.get("postProjectsByProjectIdUsersByUserIdUnban"), request);
  }

  /**
   * Sends a blocking POST request to {@code /realtime/console-token}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postRealtimeConsoleToken(OperationRequest request) {
    return call(DEFINITIONS.get("postRealtimeConsoleToken"), request);
  }

  /**
   * Sends a blocking POST request to {@code /realtime/console-token}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postRealtimeConsoleToken() {
    return postRealtimeConsoleToken(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /realtime/enable-all}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postRealtimeEnableAll(OperationRequest request) {
    return call(DEFINITIONS.get("postRealtimeEnableAll"), request);
  }

  /**
   * Sends a blocking POST request to {@code /realtime/enable-all}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postRealtimeEnableAll() {
    return postRealtimeEnableAll(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /realtime/install}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postRealtimeInstall(OperationRequest request) {
    return call(DEFINITIONS.get("postRealtimeInstall"), request);
  }

  /**
   * Sends a blocking POST request to {@code /realtime/install}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postRealtimeInstall() {
    return postRealtimeInstall(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /realtime/token}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postRealtimeToken(OperationRequest request) {
    return call(DEFINITIONS.get("postRealtimeToken"), request);
  }

  /**
   * Sends a blocking POST request to {@code /realtime/token}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postRealtimeToken() {
    return postRealtimeToken(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /realtime/uninstall}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postRealtimeUninstall(OperationRequest request) {
    return call(DEFINITIONS.get("postRealtimeUninstall"), request);
  }

  /**
   * Sends a blocking POST request to {@code /realtime/uninstall}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postRealtimeUninstall() {
    return postRealtimeUninstall(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /regions}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postRegions(OperationRequest request) {
    return call(DEFINITIONS.get("postRegions"), request);
  }

  /**
   * Sends a blocking POST request to {@code /regions}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postRegions() {
    return postRegions(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /regions/health/check}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postRegionsHealthCheck(OperationRequest request) {
    return call(DEFINITIONS.get("postRegionsHealthCheck"), request);
  }

  /**
   * Sends a blocking POST request to {@code /regions/health/check}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postRegionsHealthCheck() {
    return postRegionsHealthCheck(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /rls/policies/{policyId}/toggle}.
   *
   * <p>Required path parameters: policyId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postRlsPoliciesByPolicyIdToggle(OperationRequest request) {
    return call(DEFINITIONS.get("postRlsPoliciesByPolicyIdToggle"), request);
  }

  /**
   * Sends a blocking POST request to {@code /rls/policies/{projectId}}.
   *
   * <p>Required path parameters: projectId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postRlsPoliciesByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("postRlsPoliciesByProjectId"), request);
  }

  /**
   * Sends a blocking POST request to {@code /schema-engine/analyze/{projectId}}.
   *
   * <p>Required path parameters: projectId. Query parameters: envId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postSchemaEngineAnalyzeByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("postSchemaEngineAnalyzeByProjectId"), request);
  }

  /**
   * Sends a blocking POST request to {@code /schema-engine/apply}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postSchemaEngineApply(OperationRequest request) {
    return call(DEFINITIONS.get("postSchemaEngineApply"), request);
  }

  /**
   * Sends a blocking POST request to {@code /schema-engine/editor-sessions/{projectId}}.
   *
   * <p>Required path parameters: projectId. Query parameters: envId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postSchemaEngineEditorSessionsByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("postSchemaEngineEditorSessionsByProjectId"), request);
  }

  /**
   * Sends a blocking POST request to {@code /schema-engine/editor-sessions/{projectId}/close}.
   *
   * <p>Required path parameters: projectId. Query parameters: envId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postSchemaEngineEditorSessionsByProjectIdClose(OperationRequest request) {
    return call(DEFINITIONS.get("postSchemaEngineEditorSessionsByProjectIdClose"), request);
  }

  /**
   * Sends a blocking POST request to {@code /schema-engine/migrations/{projectId}/{migrationId}/rollback}.
   *
   * <p>Required path parameters: projectId, migrationId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postSchemaEngineMigrationsByProjectIdByMigrationIdRollback(OperationRequest request) {
    return call(DEFINITIONS.get("postSchemaEngineMigrationsByProjectIdByMigrationIdRollback"), request);
  }

  /**
   * Sends a blocking POST request to {@code /schema-engine/preview}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postSchemaEnginePreview(OperationRequest request) {
    return call(DEFINITIONS.get("postSchemaEnginePreview"), request);
  }

  /**
   * Sends a blocking POST request to {@code /schema-engine/push/{projectId}}.
   *
   * <p>Required path parameters: projectId. Query parameters: envId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postSchemaEnginePushByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("postSchemaEnginePushByProjectId"), request);
  }

  /**
   * Sends a blocking POST request to {@code /schema-engine/query/{projectId}}.
   *
   * <p>Required path parameters: projectId. Query parameters: envId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postSchemaEngineQueryByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("postSchemaEngineQueryByProjectId"), request);
  }

  /**
   * Sends a blocking POST request to {@code /schema-engine/snippets/{projectId}}.
   *
   * <p>Required path parameters: projectId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postSchemaEngineSnippetsByProjectId(OperationRequest request) {
    return call(DEFINITIONS.get("postSchemaEngineSnippetsByProjectId"), request);
  }

  /**
   * Sends a blocking POST request to {@code /schemas}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postSchemas(OperationRequest request) {
    return call(DEFINITIONS.get("postSchemas"), request);
  }

  /**
   * Sends a blocking POST request to {@code /services}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postServices(OperationRequest request) {
    return call(DEFINITIONS.get("postServices"), request);
  }

  /**
   * Sends a blocking POST request to {@code /services/{serviceId}/deploy}.
   *
   * <p>Required path parameters: serviceId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postServicesByServiceIdDeploy(OperationRequest request) {
    return call(DEFINITIONS.get("postServicesByServiceIdDeploy"), request);
  }

  /**
   * Sends a blocking POST request to {@code /services/{serviceId}/domains}.
   *
   * <p>Required path parameters: serviceId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postServicesByServiceIdDomains(OperationRequest request) {
    return call(DEFINITIONS.get("postServicesByServiceIdDomains"), request);
  }

  /**
   * Sends a blocking POST request to {@code /services/{serviceId}/domains/{domainId}/verify}.
   *
   * <p>Required path parameters: serviceId, domainId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postServicesByServiceIdDomainsByDomainIdVerify(OperationRequest request) {
    return call(DEFINITIONS.get("postServicesByServiceIdDomainsByDomainIdVerify"), request);
  }

  /**
   * Sends a blocking POST request to {@code /services/{serviceId}/git/connect}.
   *
   * <p>Required path parameters: serviceId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postServicesByServiceIdGitConnect(OperationRequest request) {
    return call(DEFINITIONS.get("postServicesByServiceIdGitConnect"), request);
  }

  /**
   * Sends a blocking POST request to {@code /services/{serviceId}/promote}.
   *
   * <p>Required path parameters: serviceId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postServicesByServiceIdPromote(OperationRequest request) {
    return call(DEFINITIONS.get("postServicesByServiceIdPromote"), request);
  }

  /**
   * Sends a blocking POST request to {@code /services/{serviceId}/rollback}.
   *
   * <p>Required path parameters: serviceId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postServicesByServiceIdRollback(OperationRequest request) {
    return call(DEFINITIONS.get("postServicesByServiceIdRollback"), request);
  }

  /**
   * Sends a blocking POST request to {@code /services/{serviceId}/stop}.
   *
   * <p>Required path parameters: serviceId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postServicesByServiceIdStop(OperationRequest request) {
    return call(DEFINITIONS.get("postServicesByServiceIdStop"), request);
  }

  /**
   * Sends a blocking POST request to {@code /sso/org/{orgId}/configure}.
   *
   * <p>Required path parameters: orgId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postSsoOrgByOrgIdConfigure(OperationRequest request) {
    return call(DEFINITIONS.get("postSsoOrgByOrgIdConfigure"), request);
  }

  /**
   * Sends a blocking POST request to {@code /sso/org/{orgId}/connections/{connectionId}/certificates}.
   *
   * <p>Required path parameters: orgId, connectionId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postSsoOrgByOrgIdConnectionsByConnectionIdCertificates(OperationRequest request) {
    return call(DEFINITIONS.get("postSsoOrgByOrgIdConnectionsByConnectionIdCertificates"), request);
  }

  /**
   * Sends a blocking POST request to {@code /sso/org/{orgId}/connections/{connectionId}/certificates/{certId}/promote}.
   *
   * <p>Required path parameters: orgId, connectionId, certId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postSsoOrgByOrgIdConnectionsByConnectionIdCertificatesByCertIdPromote(OperationRequest request) {
    return call(DEFINITIONS.get("postSsoOrgByOrgIdConnectionsByConnectionIdCertificatesByCertIdPromote"), request);
  }

  /**
   * Sends a blocking POST request to {@code /sso/org/{orgId}/connections/{connectionId}/disable}.
   *
   * <p>Required path parameters: orgId, connectionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postSsoOrgByOrgIdConnectionsByConnectionIdDisable(OperationRequest request) {
    return call(DEFINITIONS.get("postSsoOrgByOrgIdConnectionsByConnectionIdDisable"), request);
  }

  /**
   * Sends a blocking POST request to {@code /sso/org/{orgId}/connections/{connectionId}/enable}.
   *
   * <p>Required path parameters: orgId, connectionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postSsoOrgByOrgIdConnectionsByConnectionIdEnable(OperationRequest request) {
    return call(DEFINITIONS.get("postSsoOrgByOrgIdConnectionsByConnectionIdEnable"), request);
  }

  /**
   * Sends a blocking POST request to {@code /sso/org/{orgId}/connections/{connectionId}/metadata/import}.
   *
   * <p>Required path parameters: orgId, connectionId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postSsoOrgByOrgIdConnectionsByConnectionIdMetadataImport(OperationRequest request) {
    return call(DEFINITIONS.get("postSsoOrgByOrgIdConnectionsByConnectionIdMetadataImport"), request);
  }

  /**
   * Sends a blocking POST request to {@code /sso/org/{orgId}/connections/{connectionId}/release-account}.
   *
   * <p>Required path parameters: orgId, connectionId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postSsoOrgByOrgIdConnectionsByConnectionIdReleaseAccount(OperationRequest request) {
    return call(DEFINITIONS.get("postSsoOrgByOrgIdConnectionsByConnectionIdReleaseAccount"), request);
  }

  /**
   * Sends a blocking POST request to {@code /sso/org/{orgId}/connections/{connectionId}/scim/tokens}.
   *
   * <p>Required path parameters: orgId, connectionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postSsoOrgByOrgIdConnectionsByConnectionIdScimTokens(OperationRequest request) {
    return call(DEFINITIONS.get("postSsoOrgByOrgIdConnectionsByConnectionIdScimTokens"), request);
  }

  /**
   * Sends a blocking POST request to {@code /sso/org/{orgId}/connections/{connectionId}/test}.
   *
   * <p>Required path parameters: orgId, connectionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postSsoOrgByOrgIdConnectionsByConnectionIdTest(OperationRequest request) {
    return call(DEFINITIONS.get("postSsoOrgByOrgIdConnectionsByConnectionIdTest"), request);
  }

  /**
   * Sends a blocking POST request to {@code /sso/org/{orgId}/connections/{connectionId}/verify-domain}.
   *
   * <p>Required path parameters: orgId, connectionId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postSsoOrgByOrgIdConnectionsByConnectionIdVerifyDomain(OperationRequest request) {
    return call(DEFINITIONS.get("postSsoOrgByOrgIdConnectionsByConnectionIdVerifyDomain"), request);
  }

  /**
   * Sends a blocking POST request to {@code /sso/org/{orgId}/outside-members/blocked/{userId}/restore}.
   *
   * <p>Required path parameters: orgId, userId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postSsoOrgByOrgIdOutsideMembersBlockedByUserIdRestore(OperationRequest request) {
    return call(DEFINITIONS.get("postSsoOrgByOrgIdOutsideMembersBlockedByUserIdRestore"), request);
  }

  /**
   * Sends a blocking POST request to {@code /status/subscribe}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postStatusSubscribe(OperationRequest request) {
    return call(DEFINITIONS.get("postStatusSubscribe"), request);
  }

  /**
   * Sends a blocking POST request to {@code /storage/buckets}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postStorageBuckets(OperationRequest request) {
    return call(DEFINITIONS.get("postStorageBuckets"), request);
  }

  /**
   * Sends a blocking POST request to {@code /storage/buckets/{bucketId}/policies}.
   *
   * <p>Required path parameters: bucketId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postStorageBucketsByBucketIdPolicies(OperationRequest request) {
    return call(DEFINITIONS.get("postStorageBucketsByBucketIdPolicies"), request);
  }

  /**
   * Sends a blocking POST request to {@code /storage/buckets/{bucketId}/policies/{policyId}/toggle}.
   *
   * <p>Required path parameters: bucketId, policyId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postStorageBucketsByBucketIdPoliciesByPolicyIdToggle(OperationRequest request) {
    return call(DEFINITIONS.get("postStorageBucketsByBucketIdPoliciesByPolicyIdToggle"), request);
  }

  /**
   * Sends a blocking POST request to {@code /storage/buckets/{bucketId}/policies/simulate}.
   *
   * <p>Required path parameters: bucketId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postStorageBucketsByBucketIdPoliciesSimulate(OperationRequest request) {
    return call(DEFINITIONS.get("postStorageBucketsByBucketIdPoliciesSimulate"), request);
  }

  /**
   * Sends a blocking POST request to {@code /storage/download-url}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postStorageDownloadUrl(OperationRequest request) {
    return call(DEFINITIONS.get("postStorageDownloadUrl"), request);
  }

  /**
   * Sends a blocking POST request to {@code /storage/files/copy}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postStorageFilesCopy(OperationRequest request) {
    return call(DEFINITIONS.get("postStorageFilesCopy"), request);
  }

  /**
   * Sends a blocking POST request to {@code /storage/files/copy}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postStorageFilesCopy() {
    return postStorageFilesCopy(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /storage/files/delete-batch}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postStorageFilesDeleteBatch(OperationRequest request) {
    return call(DEFINITIONS.get("postStorageFilesDeleteBatch"), request);
  }

  /**
   * Sends a blocking POST request to {@code /storage/files/delete-batch}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postStorageFilesDeleteBatch() {
    return postStorageFilesDeleteBatch(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /storage/files/move}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postStorageFilesMove(OperationRequest request) {
    return call(DEFINITIONS.get("postStorageFilesMove"), request);
  }

  /**
   * Sends a blocking POST request to {@code /storage/files/move}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postStorageFilesMove() {
    return postStorageFilesMove(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /storage/multipart/{uploadId}/abort}.
   *
   * <p>Required path parameters: uploadId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postStorageMultipartByUploadIdAbort(OperationRequest request) {
    return call(DEFINITIONS.get("postStorageMultipartByUploadIdAbort"), request);
  }

  /**
   * Sends a blocking POST request to {@code /storage/multipart/{uploadId}/complete}.
   *
   * <p>Required path parameters: uploadId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postStorageMultipartByUploadIdComplete(OperationRequest request) {
    return call(DEFINITIONS.get("postStorageMultipartByUploadIdComplete"), request);
  }

  /**
   * Sends a blocking POST request to {@code /storage/multipart/{uploadId}/part-url}.
   *
   * <p>Required path parameters: uploadId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postStorageMultipartByUploadIdPartUrl(OperationRequest request) {
    return call(DEFINITIONS.get("postStorageMultipartByUploadIdPartUrl"), request);
  }

  /**
   * Sends a blocking POST request to {@code /storage/multipart/create}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postStorageMultipartCreate(OperationRequest request) {
    return call(DEFINITIONS.get("postStorageMultipartCreate"), request);
  }

  /**
   * Sends a blocking POST request to {@code /storage/multipart/resume}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postStorageMultipartResume(OperationRequest request) {
    return call(DEFINITIONS.get("postStorageMultipartResume"), request);
  }

  /**
   * Sends a blocking POST request to {@code /storage/upload}.
   *
   * <p>Query parameters: bucket, key (required). Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postStorageUpload(OperationRequest request) {
    return call(DEFINITIONS.get("postStorageUpload"), request);
  }

  /**
   * Sends a blocking POST request to {@code /storage/upload-base64}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postStorageUploadBase64(OperationRequest request) {
    return call(DEFINITIONS.get("postStorageUploadBase64"), request);
  }

  /**
   * Sends a blocking POST request to {@code /storage/upload-from-url}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postStorageUploadFromUrl(OperationRequest request) {
    return call(DEFINITIONS.get("postStorageUploadFromUrl"), request);
  }

  /**
   * Sends a blocking POST request to {@code /storage/upload-from-url}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postStorageUploadFromUrl() {
    return postStorageUploadFromUrl(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /storage/upload-url}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postStorageUploadUrl(OperationRequest request) {
    return call(DEFINITIONS.get("postStorageUploadUrl"), request);
  }

  /**
   * Sends a blocking POST request to {@code /templates}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postTemplates(OperationRequest request) {
    return call(DEFINITIONS.get("postTemplates"), request);
  }

  /**
   * Sends a blocking POST request to {@code /templates}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postTemplates() {
    return postTemplates(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /templates/create-project}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postTemplatesCreateProject(OperationRequest request) {
    return call(DEFINITIONS.get("postTemplatesCreateProject"), request);
  }

  /**
   * Sends a blocking POST request to {@code /templates/create-project}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postTemplatesCreateProject() {
    return postTemplatesCreateProject(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /templates/from-project}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postTemplatesFromProject(OperationRequest request) {
    return call(DEFINITIONS.get("postTemplatesFromProject"), request);
  }

  /**
   * Sends a blocking POST request to {@code /templates/from-project}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postTemplatesFromProject() {
    return postTemplatesFromProject(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /templates/from-project/preview}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postTemplatesFromProjectPreview(OperationRequest request) {
    return call(DEFINITIONS.get("postTemplatesFromProjectPreview"), request);
  }

  /**
   * Sends a blocking POST request to {@code /templates/from-project/preview}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postTemplatesFromProjectPreview() {
    return postTemplatesFromProjectPreview(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /templates/install/apply}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postTemplatesInstallApply(OperationRequest request) {
    return call(DEFINITIONS.get("postTemplatesInstallApply"), request);
  }

  /**
   * Sends a blocking POST request to {@code /templates/install/apply}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postTemplatesInstallApply() {
    return postTemplatesInstallApply(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /templates/install/{installId}/rollback}.
   *
   * <p>Required path parameters: installId. Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postTemplatesInstallByInstallIdRollback(OperationRequest request) {
    return call(DEFINITIONS.get("postTemplatesInstallByInstallIdRollback"), request);
  }

  /**
   * Sends a blocking POST request to {@code /templates/install/preview}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postTemplatesInstallPreview(OperationRequest request) {
    return call(DEFINITIONS.get("postTemplatesInstallPreview"), request);
  }

  /**
   * Sends a blocking POST request to {@code /templates/install/preview}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postTemplatesInstallPreview() {
    return postTemplatesInstallPreview(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /users/me/change-password}.
   *
   * <p>Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postUsersMeChangePassword(OperationRequest request) {
    return call(DEFINITIONS.get("postUsersMeChangePassword"), request);
  }

  /**
   * Sends a blocking POST request to {@code /users/me/change-password}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postUsersMeChangePassword() {
    return postUsersMeChangePassword(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /users/me/request-account-delete}.
   *
   * <p>Takes no body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postUsersMeRequestAccountDelete(OperationRequest request) {
    return call(DEFINITIONS.get("postUsersMeRequestAccountDelete"), request);
  }

  /**
   * Sends a blocking POST request to {@code /users/me/request-account-delete}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postUsersMeRequestAccountDelete() {
    return postUsersMeRequestAccountDelete(OperationRequest.empty());
  }

  /**
   * Sends a blocking POST request to {@code /v1/data/{projectId}/{table}}.
   *
   * <p>Required path parameters: projectId, table. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postV1DataByProjectIdByTable(OperationRequest request) {
    return call(DEFINITIONS.get("postV1DataByProjectIdByTable"), request);
  }

  /**
   * Sends a blocking POST request to {@code /v1/data/{projectId}/{table}/bulk}.
   *
   * <p>Required path parameters: projectId, table. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postV1DataByProjectIdByTableBulk(OperationRequest request) {
    return call(DEFINITIONS.get("postV1DataByProjectIdByTableBulk"), request);
  }

  /**
   * Sends a blocking POST request to {@code /v1/data/{projectId}/{table}/query}.
   *
   * <p>Required path parameters: projectId, table. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postV1DataByProjectIdByTableQuery(OperationRequest request) {
    return call(DEFINITIONS.get("postV1DataByProjectIdByTableQuery"), request);
  }

  /**
   * Sends a blocking POST request to {@code /webhooks/github}.
   *
   * <p>Query parameters: src. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object postWebhooksGithub(OperationRequest request) {
    return call(DEFINITIONS.get("postWebhooksGithub"), request);
  }

  /**
   * Sends a blocking POST request to {@code /webhooks/github}. Sends no arguments.
   *
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Object postWebhooksGithub() {
    return postWebhooksGithub(OperationRequest.empty());
  }

  /**
   * Sends a blocking PUT request to {@code /ai/copilot/session/{sessionId}/editor-files}.
   *
   * <p>Required path parameters: sessionId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object putAiCopilotSessionBySessionIdEditorFiles(OperationRequest request) {
    return call(DEFINITIONS.get("putAiCopilotSessionBySessionIdEditorFiles"), request);
  }

  /**
   * Sends a blocking PUT request to {@code /alert-rules/{ruleId}}.
   *
   * <p>Required path parameters: ruleId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object putAlertRulesByRuleId(OperationRequest request) {
    return call(DEFINITIONS.get("putAlertRulesByRuleId"), request);
  }

  /**
   * Sends a blocking PUT request to {@code /billing/org/{orgId}/credits/auto-topup}.
   *
   * <p>Required path parameters: orgId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object putBillingOrgByOrgIdCreditsAutoTopup(OperationRequest request) {
    return call(DEFINITIONS.get("putBillingOrgByOrgIdCreditsAutoTopup"), request);
  }

  /**
   * Sends a blocking PUT request to {@code /billing/org/{orgId}/founder/wall}.
   *
   * <p>Required path parameters: orgId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object putBillingOrgByOrgIdFounderWall(OperationRequest request) {
    return call(DEFINITIONS.get("putBillingOrgByOrgIdFounderWall"), request);
  }

  /**
   * Sends a blocking PUT request to {@code /billing/org/{orgId}/tax-info}.
   *
   * <p>Required path parameters: orgId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object putBillingOrgByOrgIdTaxInfo(OperationRequest request) {
    return call(DEFINITIONS.get("putBillingOrgByOrgIdTaxInfo"), request);
  }

  /**
   * Sends a blocking PUT request to {@code /buckets/{bucketId}}.
   *
   * <p>Required path parameters: bucketId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object putBucketsByBucketId(OperationRequest request) {
    return call(DEFINITIONS.get("putBucketsByBucketId"), request);
  }

  /**
   * Sends a blocking PUT request to {@code /functions/{functionId}/schedule}.
   *
   * <p>Required path parameters: functionId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object putFunctionsByFunctionIdSchedule(OperationRequest request) {
    return call(DEFINITIONS.get("putFunctionsByFunctionIdSchedule"), request);
  }

  /**
   * Sends a blocking PUT request to {@code /functions/{functionId}/source}.
   *
   * <p>Required path parameters: functionId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object putFunctionsByFunctionIdSource(OperationRequest request) {
    return call(DEFINITIONS.get("putFunctionsByFunctionIdSource"), request);
  }

  /**
   * Sends a blocking PUT request to {@code /functions/secrets/{secretId}}.
   *
   * <p>Required path parameters: secretId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object putFunctionsSecretsBySecretId(OperationRequest request) {
    return call(DEFINITIONS.get("putFunctionsSecretsBySecretId"), request);
  }

  /**
   * Sends a blocking PUT request to {@code /me/console-look}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object putMeConsoleLook(OperationRequest request) {
    return call(DEFINITIONS.get("putMeConsoleLook"), request);
  }

  /**
   * Sends a blocking PUT request to {@code /me/early/wall}.
   *
   * <p>Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object putMeEarlyWall(OperationRequest request) {
    return call(DEFINITIONS.get("putMeEarlyWall"), request);
  }

  /**
   * Sends a blocking PUT request to {@code /projects/{projectId}/auth/oauth-apps/{provider}}.
   *
   * <p>Required path parameters: projectId, provider. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object putProjectsByProjectIdAuthOauthAppsByProvider(OperationRequest request) {
    return call(DEFINITIONS.get("putProjectsByProjectIdAuthOauthAppsByProvider"), request);
  }

  /**
   * Sends a blocking PUT request to {@code /projects/{projectId}/environments/promotion-order}.
   *
   * <p>Required path parameters: projectId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object putProjectsByProjectIdEnvironmentsPromotionOrder(OperationRequest request) {
    return call(DEFINITIONS.get("putProjectsByProjectIdEnvironmentsPromotionOrder"), request);
  }

  /**
   * Sends a blocking PUT request to {@code /projects/{projectId}/frontend}.
   *
   * <p>Required path parameters: projectId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object putProjectsByProjectIdFrontend(OperationRequest request) {
    return call(DEFINITIONS.get("putProjectsByProjectIdFrontend"), request);
  }

  /**
   * Sends a blocking PUT request to {@code /projects/{projectId}/getting-started/hidden}.
   *
   * <p>Required path parameters: projectId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object putProjectsByProjectIdGettingStartedHidden(OperationRequest request) {
    return call(DEFINITIONS.get("putProjectsByProjectIdGettingStartedHidden"), request);
  }

  /**
   * Sends a blocking PUT request to {@code /projects/{projectId}/members}.
   *
   * <p>Required path parameters: projectId. Requires a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object putProjectsByProjectIdMembers(OperationRequest request) {
    return call(DEFINITIONS.get("putProjectsByProjectIdMembers"), request);
  }

  /**
   * Sends a blocking PUT request to {@code /projects/{projectId}/members/{userId}}.
   *
   * <p>Required path parameters: projectId, userId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object putProjectsByProjectIdMembersByUserId(OperationRequest request) {
    return call(DEFINITIONS.get("putProjectsByProjectIdMembersByUserId"), request);
  }

  /**
   * Sends a blocking PUT request to {@code /sso/org/{orgId}/connections/{connectionId}/break-glass}.
   *
   * <p>Required path parameters: orgId, connectionId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object putSsoOrgByOrgIdConnectionsByConnectionIdBreakGlass(OperationRequest request) {
    return call(DEFINITIONS.get("putSsoOrgByOrgIdConnectionsByConnectionIdBreakGlass"), request);
  }

  /**
   * Sends a blocking PUT request to {@code /sso/org/{orgId}/connections/{connectionId}/group-mappings}.
   *
   * <p>Required path parameters: orgId, connectionId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object putSsoOrgByOrgIdConnectionsByConnectionIdGroupMappings(OperationRequest request) {
    return call(DEFINITIONS.get("putSsoOrgByOrgIdConnectionsByConnectionIdGroupMappings"), request);
  }

  /**
   * Sends a blocking PUT request to {@code /sso/org/{orgId}/connections/{connectionId}/require}.
   *
   * <p>Required path parameters: orgId, connectionId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object putSsoOrgByOrgIdConnectionsByConnectionIdRequire(OperationRequest request) {
    return call(DEFINITIONS.get("putSsoOrgByOrgIdConnectionsByConnectionIdRequire"), request);
  }

  /**
   * Sends a blocking PUT request to {@code /sso/org/{orgId}/outside-members/allow}.
   *
   * <p>Required path parameters: orgId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object putSsoOrgByOrgIdOutsideMembersAllow(OperationRequest request) {
    return call(DEFINITIONS.get("putSsoOrgByOrgIdOutsideMembersAllow"), request);
  }

  /**
   * Sends a blocking PUT request to {@code /sso/org/{orgId}/outside-members/policy}.
   *
   * <p>Required path parameters: orgId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object putSsoOrgByOrgIdOutsideMembersPolicy(OperationRequest request) {
    return call(DEFINITIONS.get("putSsoOrgByOrgIdOutsideMembersPolicy"), request);
  }

  /**
   * Sends a blocking PUT request to {@code /sso/org/{orgId}/security-contact}.
   *
   * <p>Required path parameters: orgId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object putSsoOrgByOrgIdSecurityContact(OperationRequest request) {
    return call(DEFINITIONS.get("putSsoOrgByOrgIdSecurityContact"), request);
  }

  /**
   * Sends a blocking PUT request to {@code /storage/buckets/{bucketId}/policies/{policyId}}.
   *
   * <p>Required path parameters: bucketId, policyId. Accepts a json body.
   *
   * @param request path, query, header, and body arguments; null sends an empty request
   * @return the JSON response as Java values, or null for an empty response
   * @throws VaifException if validation, authentication, the API, or the transport fails
   */
  public Object putStorageBucketsByBucketIdPoliciesByPolicyId(OperationRequest request) {
    return call(DEFINITIONS.get("putStorageBucketsByBucketIdPoliciesByPolicyId"), request);
  }
}
