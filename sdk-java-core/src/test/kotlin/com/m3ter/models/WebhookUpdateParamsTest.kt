// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookUpdateParamsTest {

    @Test
    fun create() {
        WebhookUpdateParams.builder()
            .orgId("orgId")
            .id("id")
            .credentials(
                M3terSignedCredentialsRequest.builder()
                    .apiKey("x")
                    .secret("x")
                    .type(M3terSignedCredentialsRequest.Type.M3TER_SIGNED_REQUEST)
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
    fun pathParams() {
        val params =
            WebhookUpdateParams.builder()
                .id("id")
                .credentials(
                    M3terSignedCredentialsRequest.builder()
                        .apiKey("x")
                        .secret("x")
                        .type(M3terSignedCredentialsRequest.Type.M3TER_SIGNED_REQUEST)
                        .build()
                )
                .description("x")
                .name("x")
                .url("x")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            WebhookUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .credentials(
                    M3terSignedCredentialsRequest.builder()
                        .apiKey("x")
                        .secret("x")
                        .type(M3terSignedCredentialsRequest.Type.M3TER_SIGNED_REQUEST)
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

        assertThat(body.credentials())
            .isEqualTo(
                M3terSignedCredentialsRequest.builder()
                    .apiKey("x")
                    .secret("x")
                    .type(M3terSignedCredentialsRequest.Type.M3TER_SIGNED_REQUEST)
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
            WebhookUpdateParams.builder()
                .id("id")
                .credentials(
                    M3terSignedCredentialsRequest.builder()
                        .apiKey("x")
                        .secret("x")
                        .type(M3terSignedCredentialsRequest.Type.M3TER_SIGNED_REQUEST)
                        .build()
                )
                .description("x")
                .name("x")
                .url("x")
                .build()

        val body = params._body()

        assertThat(body.credentials())
            .isEqualTo(
                M3terSignedCredentialsRequest.builder()
                    .apiKey("x")
                    .secret("x")
                    .type(M3terSignedCredentialsRequest.Type.M3TER_SIGNED_REQUEST)
                    .build()
            )
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.url()).isEqualTo("x")
    }
}
