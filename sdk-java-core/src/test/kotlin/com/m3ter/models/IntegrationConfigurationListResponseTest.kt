// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationConfigurationListResponseTest {

    @Test
    fun create() {
        val integrationConfigurationListResponse =
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

        assertThat(integrationConfigurationListResponse.id()).isEqualTo("id")
        assertThat(integrationConfigurationListResponse.destination()).isEqualTo("Stripe")
        assertThat(integrationConfigurationListResponse.entityType()).isEqualTo("Bill")
        assertThat(integrationConfigurationListResponse.authorized()).contains(true)
        assertThat(integrationConfigurationListResponse.configData())
            .contains(
                IntegrationConfigurationListResponse.ConfigData.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(integrationConfigurationListResponse.createdBy()).contains("createdBy")
        assertThat(integrationConfigurationListResponse.destinationId())
            .contains("00000000-0000-0000-0000-000000000000")
        assertThat(integrationConfigurationListResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integrationConfigurationListResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integrationConfigurationListResponse.enabled()).contains(true)
        assertThat(integrationConfigurationListResponse.entityId())
            .contains("00000000-0000-0000-0000-000000000000")
        assertThat(integrationConfigurationListResponse.integrationCredentialsId())
            .contains("00000000-0000-0000-0000-000000000000")
        assertThat(integrationConfigurationListResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(integrationConfigurationListResponse.name()).contains("My Integration")
        assertThat(integrationConfigurationListResponse.triggerType())
            .contains(IntegrationConfigurationListResponse.TriggerType.EVENT)
        assertThat(integrationConfigurationListResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integrationConfigurationListResponse =
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

        val roundtrippedIntegrationConfigurationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integrationConfigurationListResponse),
                jacksonTypeRef<IntegrationConfigurationListResponse>(),
            )

        assertThat(roundtrippedIntegrationConfigurationListResponse)
            .isEqualTo(integrationConfigurationListResponse)
    }
}
