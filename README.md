# M3ter Java API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/com.m3ter/sdk-java)](https://central.sonatype.com/artifact/com.m3ter/sdk-java/0.2.0-alpha)
[![javadoc](https://javadoc.io/badge2/com.m3ter/sdk-java/0.2.0-alpha/javadoc.svg)](https://javadoc.io/doc/com.m3ter/sdk-java/0.2.0-alpha)

<!-- x-release-please-end -->

The M3ter Java SDK provides convenient access to the [M3ter REST API](https://www.m3ter.com) from applications written in Java.

It is generated with [Stainless](https://www.stainless.com/).

<!-- x-release-please-start-version -->

The REST API documentation can be found on [www.m3ter.com](https://www.m3ter.com). Javadocs are available on [javadoc.io](https://javadoc.io/doc/com.m3ter/sdk-java/0.2.0-alpha).

<!-- x-release-please-end -->

## Installation

<!-- x-release-please-start-version -->

### Gradle

```kotlin
implementation("com.m3ter:sdk-java:0.2.0-alpha")
```

### Maven

```xml
<dependency>
  <groupId>com.m3ter</groupId>
  <artifactId>sdk-java</artifactId>
  <version>0.2.0-alpha</version>
</dependency>
```

<!-- x-release-please-end -->

## Requirements

This library requires Java 8 or later.

## Usage

```java
import com.m3ter.client.M3terClient;
import com.m3ter.client.okhttp.M3terOkHttpClient;
import com.m3ter.models.ProductListPage;
import com.m3ter.models.ProductListParams;

// Configures using the `M3TER_API_KEY`, `M3TER_API_SECRET`, `M3TER_API_TOKEN`, `M3TER_ORG_ID` and `M3TER_BASE_URL` environment variables
M3terClient client = M3terOkHttpClient.fromEnv();

ProductListParams params = ProductListParams.builder()
    .orgId("My Org ID")
    .build();
ProductListPage page = client.products().list(params);
```

## Client configuration

Configure the client using environment variables:

```java
import com.m3ter.client.M3terClient;
import com.m3ter.client.okhttp.M3terOkHttpClient;

// Configures using the `M3TER_API_KEY`, `M3TER_API_SECRET`, `M3TER_API_TOKEN`, `M3TER_ORG_ID` and `M3TER_BASE_URL` environment variables
M3terClient client = M3terOkHttpClient.fromEnv();
```

Or manually:

```java
import com.m3ter.client.M3terClient;
import com.m3ter.client.okhttp.M3terOkHttpClient;

M3terClient client = M3terOkHttpClient.builder()
    .apiKey("My API Key")
    .apiSecret("My API Secret")
    .token("My Token")
    .orgId("My Org ID")
    .build();
```

Or using a combination of the two approaches:

```java
import com.m3ter.client.M3terClient;
import com.m3ter.client.okhttp.M3terOkHttpClient;

M3terClient client = M3terOkHttpClient.builder()
    // Configures using the `M3TER_API_KEY`, `M3TER_API_SECRET`, `M3TER_API_TOKEN`, `M3TER_ORG_ID` and `M3TER_BASE_URL` environment variables
    .fromEnv()
    .apiKey("My API Key")
    .build();
```

See this table for the available options:

| Setter      | Environment variable | Required | Default value             |
| ----------- | -------------------- | -------- | ------------------------- |
| `apiKey`    | `M3TER_API_KEY`      | true     | -                         |
| `apiSecret` | `M3TER_API_SECRET`   | true     | -                         |
| `token`     | `M3TER_API_TOKEN`    | false    | -                         |
| `orgId`     | `M3TER_ORG_ID`       | true     | -                         |
| `baseUrl`   | `M3TER_BASE_URL`     | true     | `"https://api.m3ter.com"` |

> [!TIP]
> Don't create more than one client in the same application. Each client has a connection pool and
> thread pools, which are more efficient to share between requests.

## Requests and responses

To send a request to the M3ter API, build an instance of some `Params` class and pass it to the corresponding client method. When the response is received, it will be deserialized into an instance of a Java class.

For example, `client.products().list(...)` should be called with an instance of `ProductListParams`, and it will return an instance of `ProductListPage`.

## Immutability

Each class in the SDK has an associated [builder](https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java) or factory method for constructing it.

Each class is [immutable](https://docs.oracle.com/javase/tutorial/essential/concurrency/immutable.html) once constructed. If the class has an associated builder, then it has a `toBuilder()` method, which can be used to convert it back to a builder for making a modified copy.

Because each class is immutable, builder modification will _never_ affect already built class instances.

## Asynchronous execution

The default client is synchronous. To switch to asynchronous execution, call the `async()` method:

```java
import com.m3ter.client.M3terClient;
import com.m3ter.client.okhttp.M3terOkHttpClient;
import com.m3ter.models.ProductListPageAsync;
import com.m3ter.models.ProductListParams;
import java.util.concurrent.CompletableFuture;

// Configures using the `M3TER_API_KEY`, `M3TER_API_SECRET`, `M3TER_API_TOKEN`, `M3TER_ORG_ID` and `M3TER_BASE_URL` environment variables
M3terClient client = M3terOkHttpClient.fromEnv();

ProductListParams params = ProductListParams.builder()
    .orgId("My Org ID")
    .build();
CompletableFuture<ProductListPageAsync> page = client.async().products().list(params);
```

Or create an asynchronous client from the beginning:

```java
import com.m3ter.client.M3terClientAsync;
import com.m3ter.client.okhttp.M3terOkHttpClientAsync;
import com.m3ter.models.ProductListPageAsync;
import com.m3ter.models.ProductListParams;
import java.util.concurrent.CompletableFuture;

// Configures using the `M3TER_API_KEY`, `M3TER_API_SECRET`, `M3TER_API_TOKEN`, `M3TER_ORG_ID` and `M3TER_BASE_URL` environment variables
M3terClientAsync client = M3terOkHttpClientAsync.fromEnv();

ProductListParams params = ProductListParams.builder()
    .orgId("My Org ID")
    .build();
CompletableFuture<ProductListPageAsync> page = client.products().list(params);
```

The asynchronous client supports the same options as the synchronous one, except most methods return `CompletableFuture`s.

## Raw responses

The SDK defines methods that deserialize responses into instances of Java classes. However, these methods don't provide access to the response headers, status code, or the raw response body.

To access this data, prefix any HTTP method call on a client or service with `withRawResponse()`:

```java
import com.m3ter.core.http.Headers;
import com.m3ter.core.http.HttpResponseFor;
import com.m3ter.models.ProductListPage;
import com.m3ter.models.ProductListParams;

ProductListParams params = ProductListParams.builder()
    .orgId("My Org ID")
    .build();
HttpResponseFor<ProductListPage> page = client.products().withRawResponse().list(params);

int statusCode = page.statusCode();
Headers headers = page.headers();
```

You can still deserialize the response into an instance of a Java class if needed:

```java
import com.m3ter.models.ProductListPage;

ProductListPage parsedPage = page.parse();
```

## Error handling

The SDK throws custom unchecked exception types:

- [`M3terServiceException`](sdk-java-core/src/main/kotlin/com/m3ter/errors/M3terServiceException.kt): Base class for HTTP errors. See this table for which exception subclass is thrown for each HTTP status code:

  | Status | Exception                                                                                                          |
  | ------ | ------------------------------------------------------------------------------------------------------------------ |
  | 400    | [`BadRequestException`](sdk-java-core/src/main/kotlin/com/m3ter/errors/BadRequestException.kt)                     |
  | 401    | [`UnauthorizedException`](sdk-java-core/src/main/kotlin/com/m3ter/errors/UnauthorizedException.kt)                 |
  | 403    | [`PermissionDeniedException`](sdk-java-core/src/main/kotlin/com/m3ter/errors/PermissionDeniedException.kt)         |
  | 404    | [`NotFoundException`](sdk-java-core/src/main/kotlin/com/m3ter/errors/NotFoundException.kt)                         |
  | 422    | [`UnprocessableEntityException`](sdk-java-core/src/main/kotlin/com/m3ter/errors/UnprocessableEntityException.kt)   |
  | 429    | [`RateLimitException`](sdk-java-core/src/main/kotlin/com/m3ter/errors/RateLimitException.kt)                       |
  | 5xx    | [`InternalServerException`](sdk-java-core/src/main/kotlin/com/m3ter/errors/InternalServerException.kt)             |
  | others | [`UnexpectedStatusCodeException`](sdk-java-core/src/main/kotlin/com/m3ter/errors/UnexpectedStatusCodeException.kt) |

- [`M3terIoException`](sdk-java-core/src/main/kotlin/com/m3ter/errors/M3terIoException.kt): I/O networking errors.

- [`M3terInvalidDataException`](sdk-java-core/src/main/kotlin/com/m3ter/errors/M3terInvalidDataException.kt): Failure to interpret successfully parsed data. For example, when accessing a property that's supposed to be required, but the API unexpectedly omitted it from the response.

- [`M3terException`](sdk-java-core/src/main/kotlin/com/m3ter/errors/M3terException.kt): Base class for all exceptions. Most errors will result in one of the previously mentioned ones, but completely generic errors may be thrown using the base class.

## Pagination

For methods that return a paginated list of results, this library provides convenient ways access the results either one page at a time, or item-by-item across all pages.

### Auto-pagination

To iterate through all results across all pages, you can use `autoPager`, which automatically handles fetching more pages for you:

### Synchronous

```java
import com.m3ter.models.ProductListPage;
import com.m3ter.models.ProductResponse;

// As an Iterable:
ProductListPage page = client.products().list(params);
for (ProductResponse product : page.autoPager()) {
    System.out.println(product);
};

// As a Stream:
client.products().list(params).autoPager().stream()
    .limit(50)
    .forEach(product -> System.out.println(product));
```

### Asynchronous

```java
// Using forEach, which returns CompletableFuture<Void>:
asyncClient.products().list(params).autoPager()
    .forEach(product -> System.out.println(product), executor);
```

### Manual pagination

If none of the above helpers meet your needs, you can also manually request pages one-by-one. A page of results has a `data()` method to fetch the list of objects, as well as top-level `response` and other methods to fetch top-level data about the page. It also has methods `hasNextPage`, `getNextPage`, and `getNextPageParams` methods to help with pagination.

```java
import com.m3ter.models.ProductListPage;
import com.m3ter.models.ProductResponse;

ProductListPage page = client.products().list(params);
while (page != null) {
    for (ProductResponse product : page.data()) {
        System.out.println(product);
    }

    page = page.getNextPage().orElse(null);
}
```

## Logging

The SDK uses the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

Enable logging by setting the `M3TER_LOG` environment variable to `info`:

```sh
$ export M3TER_LOG=info
```

Or to `debug` for more verbose logging:

```sh
$ export M3TER_LOG=debug
```

## Jackson

The SDK depends on [Jackson](https://github.com/FasterXML/jackson) for JSON serialization/deserialization. It is compatible with version 2.13.4 or higher, but depends on version 2.18.2 by default.

The SDK throws an exception if it detects an incompatible Jackson version at runtime (e.g. if the default version was overridden in your Maven or Gradle config).

If the SDK threw an exception, but you're _certain_ the version is compatible, then disable the version check using the `checkJacksonVersionCompatibility` on [`M3terOkHttpClient`](sdk-java-client-okhttp/src/main/kotlin/com/m3ter/client/okhttp/M3terOkHttpClient.kt) or [`M3terOkHttpClientAsync`](sdk-java-client-okhttp/src/main/kotlin/com/m3ter/client/okhttp/M3terOkHttpClientAsync.kt).

> [!CAUTION]
> We make no guarantee that the SDK works correctly when the Jackson version check is disabled.

## Network options

### Retries

The SDK automatically retries 2 times by default, with a short exponential backoff.

Only the following error types are retried:

- Connection errors (for example, due to a network connectivity problem)
- 408 Request Timeout
- 409 Conflict
- 429 Rate Limit
- 5xx Internal

The API may also explicitly instruct the SDK to retry or not retry a response.

To set a custom number of retries, configure the client using the `maxRetries` method:

```java
import com.m3ter.client.M3terClient;
import com.m3ter.client.okhttp.M3terOkHttpClient;

M3terClient client = M3terOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build();
```

### Timeouts

Requests time out after 1 minute by default.

To set a custom timeout, configure the method call using the `timeout` method:

```java
import com.m3ter.models.ProductListPage;
import com.m3ter.models.ProductListParams;

ProductListPage page = client.products().list(
  params, RequestOptions.builder().timeout(Duration.ofSeconds(30)).build()
);
```

Or configure the default for all method calls at the client level:

```java
import com.m3ter.client.M3terClient;
import com.m3ter.client.okhttp.M3terOkHttpClient;
import java.time.Duration;

M3terClient client = M3terOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build();
```

### Proxies

To route requests through a proxy, configure the client using the `proxy` method:

```java
import com.m3ter.client.M3terClient;
import com.m3ter.client.okhttp.M3terOkHttpClient;
import java.net.InetSocketAddress;
import java.net.Proxy;

M3terClient client = M3terOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(
      Proxy.Type.HTTP, new InetSocketAddress(
        "https://example.com", 8080
      )
    ))
    .build();
```

### Custom HTTP client

The SDK consists of three artifacts:

- `sdk-java-core`
  - Contains core SDK logic
  - Does not depend on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`M3terClient`](sdk-java-core/src/main/kotlin/com/m3ter/client/M3terClient.kt), [`M3terClientAsync`](sdk-java-core/src/main/kotlin/com/m3ter/client/M3terClientAsync.kt), [`M3terClientImpl`](sdk-java-core/src/main/kotlin/com/m3ter/client/M3terClientImpl.kt), and [`M3terClientAsyncImpl`](sdk-java-core/src/main/kotlin/com/m3ter/client/M3terClientAsyncImpl.kt), all of which can work with any HTTP client
- `sdk-java-client-okhttp`
  - Depends on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`M3terOkHttpClient`](sdk-java-client-okhttp/src/main/kotlin/com/m3ter/client/okhttp/M3terOkHttpClient.kt) and [`M3terOkHttpClientAsync`](sdk-java-client-okhttp/src/main/kotlin/com/m3ter/client/okhttp/M3terOkHttpClientAsync.kt), which provide a way to construct [`M3terClientImpl`](sdk-java-core/src/main/kotlin/com/m3ter/client/M3terClientImpl.kt) and [`M3terClientAsyncImpl`](sdk-java-core/src/main/kotlin/com/m3ter/client/M3terClientAsyncImpl.kt), respectively, using OkHttp
- `sdk-java`
  - Depends on and exposes the APIs of both `sdk-java-core` and `sdk-java-client-okhttp`
  - Does not have its own logic

This structure allows replacing the SDK's default HTTP client without pulling in unnecessary dependencies.

#### Customized [`OkHttpClient`](https://square.github.io/okhttp/3.x/okhttp/okhttp3/OkHttpClient.html)

> [!TIP]
> Try the available [network options](#network-options) before replacing the default client.

To use a customized `OkHttpClient`:

1. Replace your [`sdk-java` dependency](#installation) with `sdk-java-core`
2. Copy `sdk-java-client-okhttp`'s [`OkHttpClient`](sdk-java-client-okhttp/src/main/kotlin/com/m3ter/client/okhttp/OkHttpClient.kt) class into your code and customize it
3. Construct [`M3terClientImpl`](sdk-java-core/src/main/kotlin/com/m3ter/client/M3terClientImpl.kt) or [`M3terClientAsyncImpl`](sdk-java-core/src/main/kotlin/com/m3ter/client/M3terClientAsyncImpl.kt), similarly to [`M3terOkHttpClient`](sdk-java-client-okhttp/src/main/kotlin/com/m3ter/client/okhttp/M3terOkHttpClient.kt) or [`M3terOkHttpClientAsync`](sdk-java-client-okhttp/src/main/kotlin/com/m3ter/client/okhttp/M3terOkHttpClientAsync.kt), using your customized client

### Completely custom HTTP client

To use a completely custom HTTP client:

1. Replace your [`sdk-java` dependency](#installation) with `sdk-java-core`
2. Write a class that implements the [`HttpClient`](sdk-java-core/src/main/kotlin/com/m3ter/core/http/HttpClient.kt) interface
3. Construct [`M3terClientImpl`](sdk-java-core/src/main/kotlin/com/m3ter/client/M3terClientImpl.kt) or [`M3terClientAsyncImpl`](sdk-java-core/src/main/kotlin/com/m3ter/client/M3terClientAsyncImpl.kt), similarly to [`M3terOkHttpClient`](sdk-java-client-okhttp/src/main/kotlin/com/m3ter/client/okhttp/M3terOkHttpClient.kt) or [`M3terOkHttpClientAsync`](sdk-java-client-okhttp/src/main/kotlin/com/m3ter/client/okhttp/M3terOkHttpClientAsync.kt), using your new client class

## Undocumented API functionality

The SDK is typed for convenient usage of the documented API. However, it also supports working with undocumented or not yet supported parts of the API.

### Parameters

To set undocumented parameters, call the `putAdditionalHeader`, `putAdditionalQueryParam`, or `putAdditionalBodyProperty` methods on any `Params` class:

```java
import com.m3ter.core.JsonValue;
import com.m3ter.models.ProductListParams;

ProductListParams params = ProductListParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build();
```

These can be accessed on the built object later using the `_additionalHeaders()`, `_additionalQueryParams()`, and `_additionalBodyProperties()` methods.

To set undocumented parameters on _nested_ headers, query params, or body classes, call the `putAdditionalProperty` method on the nested class:

```java
import com.m3ter.core.JsonValue;
import com.m3ter.models.AccountCreateParams;
import com.m3ter.models.Address;

AccountCreateParams params = AccountCreateParams.builder()
    .address(Address.builder()
        .putAdditionalProperty("secretProperty", JsonValue.from("42"))
        .build())
    .build();
```

These properties can be accessed on the nested built object later using the `_additionalProperties()` method.

To set a documented parameter or property to an undocumented or not yet supported _value_, pass a [`JsonValue`](sdk-java-core/src/main/kotlin/com/m3ter/core/Values.kt) object to its setter:

```java
import com.m3ter.models.ProductListParams;

ProductListParams params = ProductListParams.builder()
    .orgId("My Org ID")
    .build();
```

The most straightforward way to create a [`JsonValue`](sdk-java-core/src/main/kotlin/com/m3ter/core/Values.kt) is using its `from(...)` method:

```java
import com.m3ter.core.JsonValue;
import java.util.List;
import java.util.Map;

// Create primitive JSON values
JsonValue nullValue = JsonValue.from(null);
JsonValue booleanValue = JsonValue.from(true);
JsonValue numberValue = JsonValue.from(42);
JsonValue stringValue = JsonValue.from("Hello World!");

// Create a JSON array value equivalent to `["Hello", "World"]`
JsonValue arrayValue = JsonValue.from(List.of(
  "Hello", "World"
));

// Create a JSON object value equivalent to `{ "a": 1, "b": 2 }`
JsonValue objectValue = JsonValue.from(Map.of(
  "a", 1,
  "b", 2
));

// Create an arbitrarily nested JSON equivalent to:
// {
//   "a": [1, 2],
//   "b": [3, 4]
// }
JsonValue complexValue = JsonValue.from(Map.of(
  "a", List.of(
    1, 2
  ),
  "b", List.of(
    3, 4
  )
));
```

Normally a `Builder` class's `build` method will throw [`IllegalStateException`](https://docs.oracle.com/javase/8/docs/api/java/lang/IllegalStateException.html) if any required parameter or property is unset.

To forcibly omit a required parameter or property, pass [`JsonMissing`](sdk-java-core/src/main/kotlin/com/m3ter/core/Values.kt):

```java
import com.m3ter.core.JsonMissing;
import com.m3ter.models.ProductListParams;

ProductListParams params = ProductListParams.builder()
    .orgId(JsonMissing.of())
    .build();
```

### Response properties

To access undocumented response properties, call the `_additionalProperties()` method:

```java
import com.m3ter.core.JsonValue;
import java.util.Map;

Map<String, JsonValue> additionalProperties = client.authentication().getBearerToken(params)._additionalProperties();
JsonValue secretPropertyValue = additionalProperties.get("secretProperty");

String result = secretPropertyValue.accept(new JsonValue.Visitor<>() {
    @Override
    public String visitNull() {
        return "It's null!";
    }

    @Override
    public String visitBoolean(boolean value) {
        return "It's a boolean!";
    }

    @Override
    public String visitNumber(Number value) {
        return "It's a number!";
    }

    // Other methods include `visitMissing`, `visitString`, `visitArray`, and `visitObject`
    // The default implementation of each unimplemented method delegates to `visitDefault`, which throws by default, but can also be overridden
});
```

To access a property's raw JSON value, which may be undocumented, call its `_` prefixed method:

```java
import com.m3ter.core.JsonField;
import com.m3ter.models.AuthenticationGetBearerTokenParams;
import java.util.Optional;

JsonField<AuthenticationGetBearerTokenParams.GrantType> grantType = client.authentication().getBearerToken(params)._grantType();

if (grantType.isMissing()) {
  // The property is absent from the JSON response
} else if (grantType.isNull()) {
  // The property was set to literal null
} else {
  // Check if value was provided as a string
  // Other methods include `asNumber()`, `asBoolean()`, etc.
  Optional<String> jsonString = grantType.asString();

  // Try to deserialize into a custom type
  MyClass myObject = grantType.asUnknown().orElseThrow().convert(MyClass.class);
}
```

### Response validation

In rare cases, the API may return a response that doesn't match the expected type. For example, the SDK may expect a property to contain a `String`, but the API could return something else.

By default, the SDK will not throw an exception in this case. It will throw [`M3terInvalidDataException`](sdk-java-core/src/main/kotlin/com/m3ter/errors/M3terInvalidDataException.kt) only if you directly access the property.

If you would prefer to check that the response is completely well-typed upfront, then either call `validate()`:

```java
import com.m3ter.models.AuthenticationGetBearerTokenResponse;

AuthenticationGetBearerTokenResponse response = client.authentication().getBearerToken(params).validate();
```

Or configure the method call to validate the response using the `responseValidation` method:

```java
import com.m3ter.models.ProductListPage;
import com.m3ter.models.ProductListParams;

ProductListPage page = client.products().list(
  params, RequestOptions.builder().responseValidation(true).build()
);
```

Or configure the default for all method calls at the client level:

```java
import com.m3ter.client.M3terClient;
import com.m3ter.client.okhttp.M3terOkHttpClient;

M3terClient client = M3terOkHttpClient.builder()
    .fromEnv()
    .responseValidation(true)
    .build();
```

## FAQ

### Why don't you use plain `enum` classes?

Java `enum` classes are not trivially [forwards compatible](https://www.stainless.com/blog/making-java-enums-forwards-compatible). Using them in the SDK could cause runtime exceptions if the API is updated to respond with a new enum value.

### Why do you represent fields using `JsonField<T>` instead of just plain `T`?

Using `JsonField<T>` enables a few features:

- Allowing usage of [undocumented API functionality](#undocumented-api-functionality)
- Lazily [validating the API response against the expected shape](#response-validation)
- Representing absent vs explicitly null values

### Why don't you use [`data` classes](https://kotlinlang.org/docs/data-classes.html)?

It is not [backwards compatible to add new fields to a data class](https://kotlinlang.org/docs/api-guidelines-backward-compatibility.html#avoid-using-data-classes-in-your-api) and we don't want to introduce a breaking change every time we add a field to a class.

### Why don't you use checked exceptions?

Checked exceptions are widely considered a mistake in the Java programming language. In fact, they were omitted from Kotlin for this reason.

Checked exceptions:

- Are verbose to handle
- Encourage error handling at the wrong level of abstraction, where nothing can be done about the error
- Are tedious to propagate due to the [function coloring problem](https://journal.stuffwithstuff.com/2015/02/01/what-color-is-your-function)
- Don't play well with lambdas (also due to the function coloring problem)

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/m3ter-com/m3ter-sdk-java/issues) with questions, bugs, or suggestions.
