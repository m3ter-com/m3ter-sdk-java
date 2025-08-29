// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationConfigurationListPageResponseTest {

    @Test
    fun create() {
        val integrationConfigurationListPageResponse =
            IntegrationConfigurationListPageResponse.builder()
                .addData(
                    IntegrationConfigurationListResponse.builder()
                        .id("id")
                        .destination("Stripe")
                        .entityType("Bill")
                        .authorized(true)
                        .configData(
                            IntegrationConfigurationListResponse.ConfigData.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .createdBy("createdBy")
                        .destinationId("00000000-0000-0000-0000-000000000000")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .enabled(true)
                        .entityId("00000000-0000-0000-0000-000000000000")
                        .integrationCredentialsId("00000000-0000-0000-0000-000000000000")
                        .lastModifiedBy("lastModifiedBy")
                        .name("My Integration")
                        .triggerType(IntegrationConfigurationListResponse.TriggerType.EVENT)
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        assertThat(integrationConfigurationListPageResponse.data().getOrNull())
            .containsExactly(
                IntegrationConfigurationListResponse.builder()
                    .id("id")
                    .destination("Stripe")
                    .entityType("Bill")
                    .authorized(true)
                    .configData(
                        IntegrationConfigurationListResponse.ConfigData.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .createdBy("createdBy")
                    .destinationId("00000000-0000-0000-0000-000000000000")
                    .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .enabled(true)
                    .entityId("00000000-0000-0000-0000-000000000000")
                    .integrationCredentialsId("00000000-0000-0000-0000-000000000000")
                    .lastModifiedBy("lastModifiedBy")
                    .name("My Integration")
                    .triggerType(IntegrationConfigurationListResponse.TriggerType.EVENT)
                    .version(0L)
                    .build()
            )
        assertThat(integrationConfigurationListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integrationConfigurationListPageResponse =
            IntegrationConfigurationListPageResponse.builder()
                .addData(
                    IntegrationConfigurationListResponse.builder()
                        .id("id")
                        .destination("Stripe")
                        .entityType("Bill")
                        .authorized(true)
                        .configData(
                            IntegrationConfigurationListResponse.ConfigData.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .createdBy("createdBy")
                        .destinationId("00000000-0000-0000-0000-000000000000")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .enabled(true)
                        .entityId("00000000-0000-0000-0000-000000000000")
                        .integrationCredentialsId("00000000-0000-0000-0000-000000000000")
                        .lastModifiedBy("lastModifiedBy")
                        .name("My Integration")
                        .triggerType(IntegrationConfigurationListResponse.TriggerType.EVENT)
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedIntegrationConfigurationListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integrationConfigurationListPageResponse),
                jacksonTypeRef<IntegrationConfigurationListPageResponse>(),
            )

        assertThat(roundtrippedIntegrationConfigurationListPageResponse)
            .isEqualTo(integrationConfigurationListPageResponse)
    }
}
