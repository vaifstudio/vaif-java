package studio.vaif.sdk;

import java.net.URI;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Buckets, signed URLs, and object transfers.
 *
 * <p>Signed URLs must use HTTPS, except HTTP to {@code localhost}, {@code 127.0.0.1}, or {@code
 * ::1}. Transfers to a signed URL carry no API key, bearer token, or cookie, and their errors omit
 * the URL. Signing methods take a bucket name; listing and deletion take a bucket ID.
 */
public final class Storage {
  private static final long MAX_UPLOAD_BYTES = 5L * 1024 * 1024 * 1024;
  private static final String DEFAULT_BUCKET = "default";

  private final VaifClient client;

  Storage(VaifClient client) {
    this.client = client;
  }

  /**
   * Requests a signed upload URL.
   *
   * @param key object key
   * @param sizeBytes upload size, from 1 byte through 5 GiB
   * @param bucket bucket name, or null for {@code default}
   * @param contentType media type, or null for the API default
   * @return the signing response, including {@code url}
   * @throws VaifException if an argument or the signed URL is invalid, or the request fails
   */
  public Map<String, Object> getUploadUrl(
      String key, long sizeBytes, String bucket, String contentType) {
    if (sizeBytes < 1 || sizeBytes > MAX_UPLOAD_BYTES) {
      throw VaifException.validation("Upload size must be 1 byte to 5 GiB");
    }
    Map<String, Object> result =
        client.json(
            "POST",
            "/storage/upload-url",
            Json.map(
                "key", key,
                "sizeBytes", sizeBytes,
                "bucket", bucketName(bucket),
                "contentType", contentType));
    url(result);
    return result;
  }

  /**
   * Requests a signed download URL.
   *
   * @param key object key
   * @param bucket bucket name, or null for {@code default}
   * @param expiresIn URL lifetime in seconds, at least 1
   * @return the signing response, including {@code url}
   * @throws VaifException if an argument or the signed URL is invalid, or the request fails
   */
  public Map<String, Object> getDownloadUrl(String key, String bucket, int expiresIn) {
    if (expiresIn < 1) {
      throw VaifException.validation("Signed URL lifetime must be positive");
    }
    Map<String, Object> result =
        client.json(
            "POST",
            "/storage/download-url",
            Json.map("key", key, "bucket", bucketName(bucket), "expiresIn", expiresIn));
    url(result);
    return result;
  }

  /**
   * Creates a signed download URL.
   *
   * @param key object key
   * @param bucket bucket name, or null for {@code default}
   * @param expiresIn URL lifetime in seconds, at least 1
   * @return the signed URL
   * @throws VaifException if an argument or the signed URL is invalid, or the request fails
   */
  public String createSignedUrl(String key, String bucket, int expiresIn) {
    return url(getDownloadUrl(key, bucket, expiresIn));
  }

  /**
   * Creates signed download URLs, one request per key, in order.
   *
   * @param keys object keys; a repeated key appears once in the result
   * @param bucket bucket name, or null for {@code default}
   * @param expiresIn URL lifetime in seconds, at least 1
   * @return a map from object key to signed URL, in key order
   * @throws VaifException if an argument or a signed URL is invalid, or a request fails
   */
  public Map<String, String> createSignedUrls(List<String> keys, String bucket, int expiresIn) {
    Map<String, String> out = new LinkedHashMap<>();
    for (String key : keys) {
      out.put(key, createSignedUrl(key, bucket, expiresIn));
    }
    return out;
  }

  /**
   * Uploads bytes through a signed upload URL. The bytes are held in memory.
   *
   * @param key object key
   * @param bytes object content, from 1 byte through 5 GiB
   * @param bucket bucket name, or null for {@code default}
   * @param contentType media type, or null for {@code application/octet-stream}
   * @return the key, bucket, and uploaded size
   * @throws VaifException if an argument or the signed URL is invalid, or a request fails
   * @throws NullPointerException if bytes is null
   */
  public Map<String, Object> upload(String key, byte[] bytes, String bucket, String contentType) {
    Objects.requireNonNull(bytes, "bytes");
    Map<String, Object> signed = getUploadUrl(key, bytes.length, bucket, contentType);
    String type = contentType == null ? "application/octet-stream" : contentType;
    client.external("PUT", url(signed), bytes, Map.of("Content-Type", type));
    return Json.map("key", key, "bucket", bucketName(bucket), "size", bytes.length);
  }

  /**
   * Downloads an object through a signed URL that is valid for one hour. The bytes are held in
   * memory.
   *
   * @param key object key
   * @param bucket bucket name, or null for {@code default}
   * @return the object content
   * @throws VaifException if an argument or the signed URL is invalid, or a request fails
   */
  public byte[] download(String key, String bucket) {
    return client.external("GET", createSignedUrl(key, bucket, 3600), null, Map.of());
  }

  /**
   * Lists the files in a bucket.
   *
   * @param bucketId bucket ID
   * @return the API listing response
   * @throws VaifException if the bucket ID is invalid or the request fails
   */
  public Map<String, Object> list(String bucketId) {
    return list(bucketId, Map.of());
  }

  /**
   * Lists the files in a bucket with listing options.
   *
   * @param bucketId bucket ID
   * @param options {@code prefix}, {@code maxKeys}, and {@code continuationToken} query options
   * @return the API listing response
   * @throws VaifException if the bucket ID is invalid or the request fails
   */
  public Map<String, Object> list(String bucketId, Map<String, ?> options) {
    return client.json("GET", filesPath(bucketId), options, null, Map.of());
  }

  /**
   * Deletes an object from a bucket.
   *
   * @param bucketId bucket ID
   * @param key object key
   * @return the API response
   * @throws VaifException if the bucket ID is invalid or the request fails
   */
  public Map<String, Object> delete(String bucketId, String key) {
    return client.json("DELETE", filesPath(bucketId), Map.of("key", key), null, Map.of());
  }

  /**
   * Creates a bucket in the client's project.
   *
   * @param name bucket name
   * @param isPublic whether objects can be read without authentication
   * @return the API bucket response
   * @throws VaifException if the client has no project ID ({@code PROJECT_ID_REQUIRED}), an
   *     argument is invalid, or the request fails
   */
  public Map<String, Object> createBucket(String name, boolean isPublic) {
    if (client.getProjectId() == null) {
      throw new VaifException("PROJECT_ID_REQUIRED", "Set projectId to create a bucket");
    }
    return client.json(
        "POST",
        "/storage/buckets",
        Map.of("projectId", client.getProjectId(), "name", name, "public", isPublic));
  }

  /**
   * Lists buckets, limited to the client's project when it has a project ID.
   *
   * @return the API bucket listing
   * @throws VaifException if authentication, the API, or the transport fails
   */
  public Map<String, Object> listBuckets() {
    return client.json(
        "GET", "/storage/buckets", Json.map("projectId", client.getProjectId()), null, Map.of());
  }

  /**
   * Builds the public URL of an object without contacting the API. The URL works only for a public
   * bucket.
   *
   * @param key object key; slashes separate path segments
   * @param bucket bucket name, or null for {@code default}
   * @return the encoded public URL
   * @throws VaifException if the client has no project ID ({@code PROJECT_ID_REQUIRED}) or a key
   *     segment is invalid
   */
  public String getPublicUrl(String key, String bucket) {
    if (client.getProjectId() == null) {
      throw new VaifException("PROJECT_ID_REQUIRED", "Set projectId to build public URLs");
    }
    String objectPath =
        Arrays.stream(key.split("/", -1)).map(VaifClient::segment).collect(Collectors.joining("/"));
    return publicBase().replaceAll("/+$", "")
        + "/"
        + VaifClient.segment(client.getProjectId())
        + "/"
        + VaifClient.segment(bucketName(bucket))
        + "/"
        + objectPath;
  }

  private String publicBase() {
    if (client.storageUrl() != null) {
      return client.storageUrl();
    }
    String host = URI.create(client.baseUrl()).getHost().toLowerCase(Locale.ROOT);
    if (host.matches("api\\.[a-z0-9-]+\\.vaif\\.studio")) {
      return "https://" + host.split("\\.")[1] + ".vaifusercontent.com";
    }
    if (host.equals("vaif.studio") || host.endsWith(".vaif.studio")) {
      return "https://files.vaifusercontent.com";
    }
    return client.baseUrl().replaceAll("/api$", "") + "/storage/public";
  }

  private static String filesPath(String bucketId) {
    return "/buckets/" + VaifClient.segment(bucketId) + "/files";
  }

  private static String bucketName(String bucket) {
    return bucket == null ? DEFAULT_BUCKET : bucket;
  }

  private static String url(Map<String, Object> response) {
    if (!(response.get("url") instanceof String)) {
      throw new VaifException("INVALID_RESPONSE", "Signed URL missing from storage response");
    }
    String value = (String) response.get("url");
    VaifClient.secureUrl(value);
    return value;
  }
}
