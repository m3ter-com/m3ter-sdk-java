// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationConfigurationUpdateResponseTest {

    @Test
    fun create() {
        val integrationConfigurationUpdateResponse =
            IntegrationConfigurationUpdateResponse.builder()
                .id("id")
                .destination("Stripe")
                .entityType("Bill")
                .authorized(true)
                .configData(
                    IntegrationConfigurationUpdateResponse.ConfigData.builder()
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
                .triggerType(IntegrationConfigurationUpdateResponse.TriggerType.EVENT)
                .version(0L)
                .build()

        assertThat(integrationConfigurationUpdateResponse.id()).isEqualTo("id")
        assertThat(integrationConfigurationUpdateResponse.destination()).isEqualTo("Stripe")
        assertThat(integrationConfigurationUpdateResponse.entityType()).isEqualTo("Bill")
        assertThat(integrationConfigurationUpdateResponse.authorized()).contains(true)
        assertThat(integrationConfigurationUpdateResponse.configData())
            .contains(
                IntegrationConfigurationUpdateResponse.ConfigData.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(integrationConfigurationUpdateResponse.createdBy()).contains("createdBy")
        assertThat(integrationConfigurationUpdateResponse.destinationId())
            .contains("00000000-0000-0000-0000-000000000000")
        assertThat(integrationConfigurationUpdateResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integrationConfigurationUpdateResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integrationConfigurationUpdateResponse.enabled()).contains(true)
        assertThat(integrationConfigurationUpdateResponse.entityId())
            .contains("00000000-0000-0000-0000-000000000000")
        assertThat(integrationConfigurationUpdateResponse.integrationCredentialsId())
            .contains("00000000-0000-0000-0000-000000000000")
        assertThat(integrationConfigurationUpdateResponse.lastModifiedBy())
            .contains("lastModifiedBy")
        assertThat(integrationConfigurationUpdateResponse.name()).contains("My Integration")
        assertThat(integrationConfigurationUpdateResponse.triggerType())
            .contains(IntegrationConfigurationUpdateResponse.TriggerType.EVENT)
        assertThat(integrationConfigurationUpdateResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integrationConfigurationUpdateResponse =
            IntegrationConfigurationUpdateResponse.builder()
                .id("id")
                .destination("Stripe")
                .entityType("Bill")
                .authorized(true)
                .configData(
                    IntegrationConfigurationUpdateResponse.ConfigData.builder()
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
                .triggerType(IntegrationConfigurationUpdateResponse.TriggerType.EVENT)
                .version(0L)
                .build()

        val roundtrippedIntegrationConfigurationUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integrationConfigurationUpdateResponse),
                jacksonTypeRef<IntegrationConfigurationUpdateResponse>(),
            )

        assertThat(roundtrippedIntegrationConfigurationUpdateResponse)
            .isEqualTo(integrationConfigurationUpdateResponse)
    }
}
