// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookSetActiveResponseTest {

    @Test
    fun create() {
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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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

        val roundtrippedWebhookSetActiveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookSetActiveResponse),
                jacksonTypeRef<WebhookSetActiveResponse>(),
            )

        assertThat(roundtrippedWebhookSetActiveResponse).isEqualTo(webhookSetActiveResponse)
    }
}
