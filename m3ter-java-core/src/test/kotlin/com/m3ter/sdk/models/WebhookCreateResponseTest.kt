// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookCreateResponseTest {

    @Test
    fun create() {
        val webhookCreateResponse =
            WebhookCreateResponse.builder()
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

        assertThat(webhookCreateResponse.credentials())
            .isEqualTo(
                M3terSignedCredentialsRequest.builder()
                    .apiKey("x")
                    .secret("x")
                    .type(M3terSignedCredentialsRequest.Type.M3_TER_SIGNED_REQUEST)
                    .empty(true)
                    .version(0L)
                    .build()
            )
        assertThat(webhookCreateResponse.description()).isEqualTo("x")
        assertThat(webhookCreateResponse.name()).isEqualTo("x")
        assertThat(webhookCreateResponse.url()).isEqualTo("x")
        assertThat(webhookCreateResponse.active()).contains(true)
        assertThat(webhookCreateResponse.code()).contains("code")
        assertThat(webhookCreateResponse.version()).contains(0L)
    }
}
