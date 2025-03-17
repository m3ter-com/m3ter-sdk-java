// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookUpdateResponseTest {

    @Test
    fun createWebhookUpdateResponse() {
        val webhookUpdateResponse =
            WebhookUpdateResponse.builder()
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
        assertThat(webhookUpdateResponse).isNotNull
        assertThat(webhookUpdateResponse.credentials())
            .isEqualTo(
                M3terSignedCredentialsRequest.builder()
                    .apiKey("x")
                    .secret("x")
                    .type(M3terSignedCredentialsRequest.Type.M3_TER_SIGNED_REQUEST)
                    .empty(true)
                    .version(0L)
                    .build()
            )
        assertThat(webhookUpdateResponse.description()).isEqualTo("x")
        assertThat(webhookUpdateResponse.name()).isEqualTo("x")
        assertThat(webhookUpdateResponse.url()).isEqualTo("x")
        assertThat(webhookUpdateResponse.active()).contains(true)
        assertThat(webhookUpdateResponse.code()).contains("code")
        assertThat(webhookUpdateResponse.version()).contains(0L)
    }
}
