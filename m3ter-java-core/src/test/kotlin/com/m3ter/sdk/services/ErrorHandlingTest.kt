// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.m3ter.sdk.client.M3terClient
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.jsonMapper
import com.m3ter.sdk.errors.BadRequestException
import com.m3ter.sdk.errors.InternalServerException
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.errors.M3terException
import com.m3ter.sdk.errors.NotFoundException
import com.m3ter.sdk.errors.PermissionDeniedException
import com.m3ter.sdk.errors.RateLimitException
import com.m3ter.sdk.errors.UnauthorizedException
import com.m3ter.sdk.errors.UnexpectedStatusCodeException
import com.m3ter.sdk.errors.UnprocessableEntityException
import com.m3ter.sdk.models.Product
import com.m3ter.sdk.models.ProductListPage
import com.m3ter.sdk.models.ProductListParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.assertj.core.api.InstanceOfAssertFactories
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ErrorHandlingTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private val M3TER_ERROR: M3terError =
        M3terError.builder().putAdditionalProperty("key", JsonValue.from("value")).build()

    private lateinit var client: M3terClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            M3terOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .build()
    }

    @Test
    fun productsList200() {
        val service = client.products()

        val params =
            ProductListParams.builder()
                .orgId("orgId")
                .addId("string")
                .nextToken("nextToken")
                .pageSize(1L)
                .build()

        val expected =
            ProductListPage.of(
                service,
                params,
                Product.builder()
                    .id("id")
                    .version(0L)
                    .code("code")
                    .createdBy("createdBy")
                    .customFields(
                        Product.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastModifiedBy("lastModifiedBy")
                    .name("name")
                    .build(),
            )

        stubFor(get(anyUrl()).willReturn(ok().withBody(toJson(expected.response()))))

        assertThat(client.products().list(params).response()).isEqualTo(expected.response())
    }

    @Test
    fun productsList400() {
        val params =
            ProductListParams.builder()
                .orgId("orgId")
                .addId("string")
                .nextToken("nextToken")
                .pageSize(1L)
                .build()

        stubFor(
            get(anyUrl())
                .willReturn(status(400).withHeader("Foo", "Bar").withBody(toJson(M3TER_ERROR)))
        )

        assertThatThrownBy({ client.products().list(params) })
            .satisfies({ e ->
                assertBadRequest(e, Headers.builder().put("Foo", "Bar").build(), M3TER_ERROR)
            })
    }

    @Test
    fun productsList401() {
        val params =
            ProductListParams.builder()
                .orgId("orgId")
                .addId("string")
                .nextToken("nextToken")
                .pageSize(1L)
                .build()

        stubFor(
            get(anyUrl())
                .willReturn(status(401).withHeader("Foo", "Bar").withBody(toJson(M3TER_ERROR)))
        )

        assertThatThrownBy({ client.products().list(params) })
            .satisfies({ e ->
                assertUnauthorized(e, Headers.builder().put("Foo", "Bar").build(), M3TER_ERROR)
            })
    }

    @Test
    fun productsList403() {
        val params =
            ProductListParams.builder()
                .orgId("orgId")
                .addId("string")
                .nextToken("nextToken")
                .pageSize(1L)
                .build()

        stubFor(
            get(anyUrl())
                .willReturn(status(403).withHeader("Foo", "Bar").withBody(toJson(M3TER_ERROR)))
        )

        assertThatThrownBy({ client.products().list(params) })
            .satisfies({ e ->
                assertPermissionDenied(e, Headers.builder().put("Foo", "Bar").build(), M3TER_ERROR)
            })
    }

    @Test
    fun productsList404() {
        val params =
            ProductListParams.builder()
                .orgId("orgId")
                .addId("string")
                .nextToken("nextToken")
                .pageSize(1L)
                .build()

        stubFor(
            get(anyUrl())
                .willReturn(status(404).withHeader("Foo", "Bar").withBody(toJson(M3TER_ERROR)))
        )

        assertThatThrownBy({ client.products().list(params) })
            .satisfies({ e ->
                assertNotFound(e, Headers.builder().put("Foo", "Bar").build(), M3TER_ERROR)
            })
    }

    @Test
    fun productsList422() {
        val params =
            ProductListParams.builder()
                .orgId("orgId")
                .addId("string")
                .nextToken("nextToken")
                .pageSize(1L)
                .build()

        stubFor(
            get(anyUrl())
                .willReturn(status(422).withHeader("Foo", "Bar").withBody(toJson(M3TER_ERROR)))
        )

        assertThatThrownBy({ client.products().list(params) })
            .satisfies({ e ->
                assertUnprocessableEntity(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    M3TER_ERROR,
                )
            })
    }

    @Test
    fun productsList429() {
        val params =
            ProductListParams.builder()
                .orgId("orgId")
                .addId("string")
                .nextToken("nextToken")
                .pageSize(1L)
                .build()

        stubFor(
            get(anyUrl())
                .willReturn(status(429).withHeader("Foo", "Bar").withBody(toJson(M3TER_ERROR)))
        )

        assertThatThrownBy({ client.products().list(params) })
            .satisfies({ e ->
                assertRateLimit(e, Headers.builder().put("Foo", "Bar").build(), M3TER_ERROR)
            })
    }

    @Test
    fun productsList500() {
        val params =
            ProductListParams.builder()
                .orgId("orgId")
                .addId("string")
                .nextToken("nextToken")
                .pageSize(1L)
                .build()

        stubFor(
            get(anyUrl())
                .willReturn(status(500).withHeader("Foo", "Bar").withBody(toJson(M3TER_ERROR)))
        )

        assertThatThrownBy({ client.products().list(params) })
            .satisfies({ e ->
                assertInternalServer(e, Headers.builder().put("Foo", "Bar").build(), M3TER_ERROR)
            })
    }

    @Test
    fun unexpectedStatusCode() {
        val params =
            ProductListParams.builder()
                .orgId("orgId")
                .addId("string")
                .nextToken("nextToken")
                .pageSize(1L)
                .build()

        stubFor(
            get(anyUrl())
                .willReturn(status(999).withHeader("Foo", "Bar").withBody(toJson(M3TER_ERROR)))
        )

        assertThatThrownBy({ client.products().list(params) })
            .satisfies({ e ->
                assertUnexpectedStatusCodeException(
                    e,
                    999,
                    Headers.builder().put("Foo", "Bar").build(),
                    toJson(M3TER_ERROR),
                )
            })
    }

    @Test
    fun invalidBody() {
        val params =
            ProductListParams.builder()
                .orgId("orgId")
                .addId("string")
                .nextToken("nextToken")
                .pageSize(1L)
                .build()

        stubFor(get(anyUrl()).willReturn(status(200).withBody("Not JSON")))

        assertThatThrownBy({ client.products().list(params) })
            .satisfies({ e ->
                assertThat(e)
                    .isInstanceOf(M3terException::class.java)
                    .hasMessage("Error reading response")
            })
    }

    @Test
    fun invalidErrorBody() {
        val params =
            ProductListParams.builder()
                .orgId("orgId")
                .addId("string")
                .nextToken("nextToken")
                .pageSize(1L)
                .build()

        stubFor(get(anyUrl()).willReturn(status(400).withBody("Not JSON")))

        assertThatThrownBy({ client.products().list(params) })
            .satisfies({ e ->
                assertBadRequest(e, Headers.builder().build(), M3terError.builder().build())
            })
    }

    private fun <T> toJson(body: T): ByteArray {
        return JSON_MAPPER.writeValueAsBytes(body)
    }

    private fun assertUnexpectedStatusCodeException(
        throwable: Throwable,
        statusCode: Int,
        headers: Headers,
        responseBody: ByteArray,
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnexpectedStatusCodeException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(statusCode)
                assertThat(e.body()).isEqualTo(String(responseBody))
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertBadRequest(throwable: Throwable, headers: Headers, error: M3terError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(BadRequestException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(400)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertUnauthorized(throwable: Throwable, headers: Headers, error: M3terError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(UnauthorizedException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(401)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertPermissionDenied(throwable: Throwable, headers: Headers, error: M3terError) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(PermissionDeniedException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(403)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertNotFound(throwable: Throwable, headers: Headers, error: M3terError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(NotFoundException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(404)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertUnprocessableEntity(
        throwable: Throwable,
        headers: Headers,
        error: M3terError,
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnprocessableEntityException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(422)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertRateLimit(throwable: Throwable, headers: Headers, error: M3terError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(RateLimitException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(429)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertInternalServer(throwable: Throwable, headers: Headers, error: M3terError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(InternalServerException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(500)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
