// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookTest {

    @Test
    fun create() {
        val webhook =
            Webhook.builder()
                .id("id")
                .version(0L)
                .active(true)
                .code("code")
                .createdBy("createdBy")
                .credentials(
                    M3terSignedCredentialsResponse.builder()
                        .id("id")
                        .destination("x")
                        .type("x")
                        .version(0L)
                        .apiKey("apiKey")
                        .createdBy("createdBy")
                        .destinationId("destinationId")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastModifiedBy("lastModifiedBy")
                        .name("name")
                        .secret("secret")
                        .build()
                )
                .description("description")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .url("url")
                .build()

        assertThat(webhook.id()).isEqualTo("id")
        assertThat(webhook.version()).isEqualTo(0L)
        assertThat(webhook.active()).contains(true)
        assertThat(webhook.code()).contains("code")
        assertThat(webhook.createdBy()).contains("createdBy")
        assertThat(webhook.credentials())
            .contains(
                M3terSignedCredentialsResponse.builder()
                    .id("id")
                    .destination("x")
                    .type("x")
                    .version(0L)
                    .apiKey("apiKey")
                    .createdBy("createdBy")
                    .destinationId("destinationId")
                    .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastModifiedBy("lastModifiedBy")
                    .name("name")
                    .secret("secret")
                    .build()
            )
        assertThat(webhook.description()).contains("description")
        assertThat(webhook.dtCreated()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(webhook.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(webhook.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(webhook.name()).contains("name")
        assertThat(webhook.url()).contains("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhook =
            Webhook.builder()
                .id("id")
                .version(0L)
                .active(true)
                .code("code")
                .createdBy("createdBy")
                .credentials(
                    M3terSignedCredentialsResponse.builder()
                        .id("id")
                        .destination("x")
                        .type("x")
                        .version(0L)
                        .apiKey("apiKey")
                        .createdBy("createdBy")
                        .destinationId("destinationId")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastModifiedBy("lastModifiedBy")
                        .name("name")
                        .secret("secret")
                        .build()
                )
                .description("description")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .url("url")
                .build()

        val roundtrippedWebhook =
            jsonMapper.readValue(jsonMapper.writeValueAsString(webhook), jacksonTypeRef<Webhook>())

        assertThat(roundtrippedWebhook).isEqualTo(webhook)
    }
}
