// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationConfigurationEnableResponseTest {

    @Test
    fun create() {
        val integrationConfigurationEnableResponse =
            IntegrationConfigurationEnableResponse.builder()
                .id("id")
                .destination("Stripe")
                .entityType("Bill")
                .authorized(true)
                .configData(
                    IntegrationConfigurationEnableResponse.ConfigData.builder()
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
                .triggerType(IntegrationConfigurationEnableResponse.TriggerType.EVENT)
                .version(0L)
                .build()

        assertThat(integrationConfigurationEnableResponse.id()).isEqualTo("id")
        assertThat(integrationConfigurationEnableResponse.destination()).isEqualTo("Stripe")
        assertThat(integrationConfigurationEnableResponse.entityType()).isEqualTo("Bill")
        assertThat(integrationConfigurationEnableResponse.authorized()).contains(true)
        assertThat(integrationConfigurationEnableResponse.configData())
            .contains(
                IntegrationConfigurationEnableResponse.ConfigData.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(integrationConfigurationEnableResponse.createdBy()).contains("createdBy")
        assertThat(integrationConfigurationEnableResponse.destinationId())
            .contains("00000000-0000-0000-0000-000000000000")
        assertThat(integrationConfigurationEnableResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integrationConfigurationEnableResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integrationConfigurationEnableResponse.enabled()).contains(true)
        assertThat(integrationConfigurationEnableResponse.entityId())
            .contains("00000000-0000-0000-0000-000000000000")
        assertThat(integrationConfigurationEnableResponse.integrationCredentialsId())
            .contains("00000000-0000-0000-0000-000000000000")
        assertThat(integrationConfigurationEnableResponse.lastModifiedBy())
            .contains("lastModifiedBy")
        assertThat(integrationConfigurationEnableResponse.name()).contains("My Integration")
        assertThat(integrationConfigurationEnableResponse.triggerType())
            .contains(IntegrationConfigurationEnableResponse.TriggerType.EVENT)
        assertThat(integrationConfigurationEnableResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integrationConfigurationEnableResponse =
            IntegrationConfigurationEnableResponse.builder()
                .id("id")
                .destination("Stripe")
                .entityType("Bill")
                .authorized(true)
                .configData(
                    IntegrationConfigurationEnableResponse.ConfigData.builder()
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
                .triggerType(IntegrationConfigurationEnableResponse.TriggerType.EVENT)
                .version(0L)
                .build()

        val roundtrippedIntegrationConfigurationEnableResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integrationConfigurationEnableResponse),
                jacksonTypeRef<IntegrationConfigurationEnableResponse>(),
            )

        assertThat(roundtrippedIntegrationConfigurationEnableResponse)
            .isEqualTo(integrationConfigurationEnableResponse)
    }
}
