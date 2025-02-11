# M3ter Java API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/com.m3ter.sdk/m3ter-java)](https://central.sonatype.com/artifact/com.m3ter.sdk/m3ter-java/0.1.0-alpha.2)

<!-- x-release-please-end -->

The M3ter Java SDK provides convenient access to the M3ter REST API from applications written in Java.

It is generated with [Stainless](https://www.stainlessapi.com/).

The REST API documentation can be found on [www.m3ter.com](https://www.m3ter.com).

## Installation

<!-- x-release-please-start-version -->

### Gradle

```kotlin
implementation("com.m3ter.sdk:m3ter-java:0.1.0-alpha.2")
```

### Maven

```xml
<dependency>
    <groupId>com.m3ter.sdk</groupId>
    <artifactId>m3ter-java</artifactId>
    <version>0.1.0-alpha.2</version>
</dependency>
```

<!-- x-release-please-end -->

## Requirements

This library requires Java 8 or later.

## Usage

### Configure the client

Use `M3terOkHttpClient.builder()` to configure the client. At a minimum you need to set `.apiKey()` and `.apiSecret()`:

```java
import com.m3ter.sdk.client.M3terClient;
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient;

M3terClient client = M3terOkHttpClient.builder()
    .apiKey("My API Key")
    .apiSecret("My API Secret")
    .build();
```

Alternately, set the environment with `M3TER_API_KEY`, `M3TER_API_SECRET` or `M3TER_API_TOKEN`, and use `M3terOkHttpClient.fromEnv()` to read from the environment.

```java
import com.m3ter.sdk.client.M3terClient;
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient;

M3terClient client = M3terOkHttpClient.fromEnv();

// Note: you can also call fromEnv() from the client builder, for example if you need to set additional properties
M3terClient client = M3terOkHttpClient.builder()
    .fromEnv()
    // ... set properties on the builder
    .build();
```

| Property  | Environment variable | Required | Default value |
| --------- | -------------------- | -------- | ------------- |
| apiKey    | `M3TER_API_KEY`      | true     | —             |
| apiSecret | `M3TER_API_SECRET`   | true     | —             |
| token     | `M3TER_API_TOKEN`    | false    | —             |

Read the documentation for more configuration options.

---

### Example: creating a resource

To create a new product, first use the `ProductListParams` builder to specify attributes, then pass that to the `list` method of the `products` service.

```java
import com.m3ter.sdk.models.ProductListParams;
import com.m3ter.sdk.models.ProductListResponse;

ProductListParams params = ProductListParams.builder()
    .orgId("ORG_ID")
    .build();
ProductListResponse product = client.products().list(params);
```

---

## Requests

### Parameters and bodies

To make a request to the M3ter API, you generally build an instance of the appropriate `Params` class.

See [Undocumented request params](#undocumented-request-params) for how to send arbitrary parameters.

## Responses

### Response validation

When receiving a response, the M3ter Java SDK will deserialize it into instances of the typed model classes. In rare cases, the API may return a response property that doesn't match the expected Java type. If you directly access the mistaken property, the SDK will throw an unchecked `M3terInvalidDataException` at runtime. If you would prefer to check in advance that that response is completely well-typed, call `.validate()` on the returned model.

```java
import com.m3ter.sdk.models.ProductListResponse;

ProductListResponse product = client.products().list().validate();
```

### Response properties as JSON

In rare cases, you may want to access the underlying JSON value for a response property rather than using the typed version provided by this SDK. Each model property has a corresponding JSON version, with an underscore before the method name, which returns a `JsonField` value.

```java
import com.m3ter.sdk.core.JsonField;
import java.util.Optional;

JsonField field = responseObj._field();

if (field.isMissing()) {
  // Value was not specified in the JSON response
} else if (field.isNull()) {
  // Value was provided as a literal null
} else {
  // See if value was provided as a string
  Optional<String> jsonString = field.asString();

  // If the value given by the API did not match the shape that the SDK expects
  // you can deserialise into a custom type
  MyClass myObj = responseObj._field().asUnknown().orElseThrow().convert(MyClass.class);
}
```

### Additional model properties

Sometimes, the server response may include additional properties that are not yet available in this library's types. You can access them using the model's `_additionalProperties` method:

```java
import com.m3ter.sdk.core.JsonValue;

JsonValue secret = authenticationGetBearerTokenResponse._additionalProperties().get("secret_field");
```

---

---

## Error handling

This library throws exceptions in a single hierarchy for easy handling:

- **`M3terException`** - Base exception for all exceptions

- **`M3terServiceException`** - HTTP errors with a well-formed response body we were able to parse. The exception message and the `.debuggingRequestId()` will be set by the server.

  | 400    | BadRequestException           |
  | ------ | ----------------------------- |
  | 401    | AuthenticationException       |
  | 403    | PermissionDeniedException     |
  | 404    | NotFoundException             |
  | 422    | UnprocessableEntityException  |
  | 429    | RateLimitException            |
  | 5xx    | InternalServerException       |
  | others | UnexpectedStatusCodeException |

- **`M3terIoException`** - I/O networking errors
- **`M3terInvalidDataException`** - any other exceptions on the client side, e.g.:
  - We failed to serialize the request body
  - We failed to parse the response body (has access to response code and body)

## Network options

### Retries

Requests that experience certain errors are automatically retried 2 times by default, with a short exponential backoff. Connection errors (for example, due to a network connectivity problem), 408 Request Timeout, 409 Conflict, 429 Rate Limit, and >=500 Internal errors will all be retried by default. You can provide a `maxRetries` on the client builder to configure this:

```java
import com.m3ter.sdk.client.M3terClient;
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient;

M3terClient client = M3terOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build();
```

### Timeouts

Requests time out after 1 minute by default. You can configure this on the client builder:

```java
import com.m3ter.sdk.client.M3terClient;
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient;
import java.time.Duration;

M3terClient client = M3terOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build();
```

### Proxies

Requests can be routed through a proxy. You can configure this on the client builder:

```java
import com.m3ter.sdk.client.M3terClient;
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient;
import java.net.InetSocketAddress;
import java.net.Proxy;

M3terClient client = M3terOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("example.com", 8080)))
    .build();
```

## Making custom/undocumented requests

This library is typed for convenient access to the documented API. If you need to access undocumented params or response properties, the library can still be used.

### Undocumented request params

In [Example: creating a resource](#example-creating-a-resource) above, we used the `ProductListParams.builder()` to pass to the `list` method of the `products` service.

Sometimes, the API may support other properties that are not yet supported in the Java SDK types. In that case, you can attach them using raw setters:

```java
import com.m3ter.sdk.core.JsonValue;
import com.m3ter.sdk.models.ProductListParams;

ProductListParams params = ProductListParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build();
```

You can also use the `putAdditionalProperty` method on nested headers, query params, or body objects.

### Undocumented response properties

To access undocumented response properties, you can use `res._additionalProperties()` on a response object to get a map of untyped fields of type `Map<String, JsonValue>`. You can then access fields like `res._additionalProperties().get("secret_prop").asString()` or use other helpers defined on the `JsonValue` class to extract it to a desired type.

## Logging

We use the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

You can enable logging by setting the environment variable `M3TER_LOG` to `info`.

```sh
$ export M3TER_LOG=info
```

Or to `debug` for more verbose logging.

```sh
$ export M3TER_LOG=debug
```

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/m3ter-com/m3ter-sdk-java/issues) with questions, bugs, or suggestions.
