// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookCreateParamsTest {

    @Test
    fun create() {
        WebhookCreateParams.builder()
            .orgId("orgId")
            .credentials(
                M3terSignedCredentialsRequest.builder()
                    .apiKey("x")
                    .secret("x")
                    .type(M3terSignedCredentialsRequest.Type.M3_TER_SIGNED_REQUEST)
                    .empty(true)
                    .version(0L)
                    .build()
            )
            .description("x")
            .name("x")
            .url("x")
            .active(true)
            .code("code")
            .version(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            WebhookCreateParams.builder()
                .orgId("orgId")
                .credentials(
                    M3terSignedCredentialsRequest.builder()
                        .apiKey("x")
                        .secret("x")
                        .type(M3terSignedCredentialsRequest.Type.M3_TER_SIGNED_REQUEST)
                        .empty(true)
                        .version(0L)
                        .build()
                )
                .description("x")
                .name("x")
                .url("x")
                .active(true)
                .code("code")
                .version(0L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.credentials())
            .isEqualTo(
                M3terSignedCredentialsRequest.builder()
                    .apiKey("x")
                    .secret("x")
                    .type(M3terSignedCredentialsRequest.Type.M3_TER_SIGNED_REQUEST)
                    .empty(true)
                    .version(0L)
                    .build()
            )
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.url()).isEqualTo("x")
        assertThat(body.active()).contains(true)
        assertThat(body.code()).contains("code")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WebhookCreateParams.builder()
                .orgId("orgId")
                .credentials(
                    M3terSignedCredentialsRequest.builder()
                        .apiKey("x")
                        .secret("x")
                        .type(M3terSignedCredentialsRequest.Type.M3_TER_SIGNED_REQUEST)
                        .build()
                )
                .description("x")
                .name("x")
                .url("x")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.credentials())
            .isEqualTo(
                M3terSignedCredentialsRequest.builder()
                    .apiKey("x")
                    .secret("x")
                    .type(M3terSignedCredentialsRequest.Type.M3_TER_SIGNED_REQUEST)
                    .build()
            )
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.url()).isEqualTo("x")
    }

    @Test
    fun getPathParam() {
        val params =
            WebhookCreateParams.builder()
                .orgId("orgId")
                .credentials(
                    M3terSignedCredentialsRequest.builder()
                        .apiKey("x")
                        .secret("x")
                        .type(M3terSignedCredentialsRequest.Type.M3_TER_SIGNED_REQUEST)
                        .build()
                )
                .description("x")
                .name("x")
                .url("x")
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
