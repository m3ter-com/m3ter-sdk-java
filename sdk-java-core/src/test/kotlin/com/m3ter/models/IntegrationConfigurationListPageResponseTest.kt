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
                        .destination("x")
                        .entityType("x")
                        .version(0L)
                        .authorized(true)
                        .configData(
                            IntegrationConfigurationListResponse.ConfigData.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .createdBy("createdBy")
                        .destinationId("destinationId")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .enabled(true)
                        .entityId("entityId")
                        .integrationCredentialsId("integrationCredentialsId")
                        .lastModifiedBy("lastModifiedBy")
                        .name("name")
                        .triggerType(IntegrationConfigurationListResponse.TriggerType.EVENT)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        assertThat(integrationConfigurationListPageResponse.data().getOrNull())
            .containsExactly(
                IntegrationConfigurationListResponse.builder()
                    .id("id")
                    .destination("x")
                    .entityType("x")
                    .version(0L)
                    .authorized(true)
                    .configData(
                        IntegrationConfigurationListResponse.ConfigData.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .createdBy("createdBy")
                    .destinationId("destinationId")
                    .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .enabled(true)
                    .entityId("entityId")
                    .integrationCredentialsId("integrationCredentialsId")
                    .lastModifiedBy("lastModifiedBy")
                    .name("name")
                    .triggerType(IntegrationConfigurationListResponse.TriggerType.EVENT)
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
                        .destination("x")
                        .entityType("x")
                        .version(0L)
                        .authorized(true)
                        .configData(
                            IntegrationConfigurationListResponse.ConfigData.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .createdBy("createdBy")
                        .destinationId("destinationId")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .enabled(true)
                        .entityId("entityId")
                        .integrationCredentialsId("integrationCredentialsId")
                        .lastModifiedBy("lastModifiedBy")
                        .name("name")
                        .triggerType(IntegrationConfigurationListResponse.TriggerType.EVENT)
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
