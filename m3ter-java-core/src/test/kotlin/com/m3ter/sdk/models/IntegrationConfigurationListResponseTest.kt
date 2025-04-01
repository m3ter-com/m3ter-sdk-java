// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationConfigurationListResponseTest {

    @Test
    fun create() {
        val integrationConfigurationListResponse =
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

        assertThat(integrationConfigurationListResponse.id()).isEqualTo("id")
        assertThat(integrationConfigurationListResponse.destination()).isEqualTo("x")
        assertThat(integrationConfigurationListResponse.entityType()).isEqualTo("x")
        assertThat(integrationConfigurationListResponse.version()).isEqualTo(0L)
        assertThat(integrationConfigurationListResponse.authorized()).contains(true)
        assertThat(integrationConfigurationListResponse.configData())
            .contains(
                IntegrationConfigurationListResponse.ConfigData.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(integrationConfigurationListResponse.createdBy()).contains("createdBy")
        assertThat(integrationConfigurationListResponse.destinationId()).contains("destinationId")
        assertThat(integrationConfigurationListResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integrationConfigurationListResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integrationConfigurationListResponse.enabled()).contains(true)
        assertThat(integrationConfigurationListResponse.entityId()).contains("entityId")
        assertThat(integrationConfigurationListResponse.integrationCredentialsId())
            .contains("integrationCredentialsId")
        assertThat(integrationConfigurationListResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(integrationConfigurationListResponse.name()).contains("name")
        assertThat(integrationConfigurationListResponse.triggerType())
            .contains(IntegrationConfigurationListResponse.TriggerType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integrationConfigurationListResponse =
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

        val roundtrippedIntegrationConfigurationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integrationConfigurationListResponse),
                jacksonTypeRef<IntegrationConfigurationListResponse>(),
            )

        assertThat(roundtrippedIntegrationConfigurationListResponse)
            .isEqualTo(integrationConfigurationListResponse)
    }
}
