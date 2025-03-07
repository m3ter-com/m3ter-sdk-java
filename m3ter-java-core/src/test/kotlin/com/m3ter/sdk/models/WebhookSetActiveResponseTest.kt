// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WebhookSetActiveResponseTest {

    @Test
    fun createWebhookSetActiveResponse() {
        val webhookSetActiveResponse =
            WebhookSetActiveResponse.builder()
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
        assertThat(webhookSetActiveResponse).isNotNull
        assertThat(webhookSetActiveResponse.credentials())
            .isEqualTo(
                M3terSignedCredentialsRequest.builder()
                    .apiKey("x")
                    .secret("x")
                    .type(M3terSignedCredentialsRequest.Type.M3_TER_SIGNED_REQUEST)
                    .empty(true)
                    .version(0L)
                    .build()
            )
        assertThat(webhookSetActiveResponse.description()).isEqualTo("x")
        assertThat(webhookSetActiveResponse.name()).isEqualTo("x")
        assertThat(webhookSetActiveResponse.url()).isEqualTo("x")
        assertThat(webhookSetActiveResponse.active()).contains(true)
        assertThat(webhookSetActiveResponse.code()).contains("code")
        assertThat(webhookSetActiveResponse.version()).contains(0L)
    }
}
