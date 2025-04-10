// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookListPageResponseTest {

    @Test
    fun create() {
        val webhookListPageResponse =
            WebhookListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        assertThat(webhookListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(webhookListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookListPageResponse =
            WebhookListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedWebhookListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookListPageResponse),
                jacksonTypeRef<WebhookListPageResponse>(),
            )

        assertThat(roundtrippedWebhookListPageResponse).isEqualTo(webhookListPageResponse)
    }
}
