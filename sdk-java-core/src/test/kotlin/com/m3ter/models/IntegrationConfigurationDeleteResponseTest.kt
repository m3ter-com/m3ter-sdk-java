// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationConfigurationDeleteResponseTest {

    @Test
    fun create() {
        val integrationConfigurationDeleteResponse =
            IntegrationConfigurationDeleteResponse.builder()
                .id("id")
                .destination("Stripe")
                .entityType("Bill")
                .authorized(true)
                .configData(
                    IntegrationConfigurationDeleteResponse.ConfigData.builder()
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
                .triggerType(IntegrationConfigurationDeleteResponse.TriggerType.EVENT)
                .version(0L)
                .build()

        assertThat(integrationConfigurationDeleteResponse.id()).isEqualTo("id")
        assertThat(integrationConfigurationDeleteResponse.destination()).isEqualTo("Stripe")
        assertThat(integrationConfigurationDeleteResponse.entityType()).isEqualTo("Bill")
        assertThat(integrationConfigurationDeleteResponse.authorized()).contains(true)
        assertThat(integrationConfigurationDeleteResponse.configData())
            .contains(
                IntegrationConfigurationDeleteResponse.ConfigData.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(integrationConfigurationDeleteResponse.createdBy()).contains("createdBy")
        assertThat(integrationConfigurationDeleteResponse.destinationId())
            .contains("00000000-0000-0000-0000-000000000000")
        assertThat(integrationConfigurationDeleteResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integrationConfigurationDeleteResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integrationConfigurationDeleteResponse.enabled()).contains(true)
        assertThat(integrationConfigurationDeleteResponse.entityId())
            .contains("00000000-0000-0000-0000-000000000000")
        assertThat(integrationConfigurationDeleteResponse.integrationCredentialsId())
            .contains("00000000-0000-0000-0000-000000000000")
        assertThat(integrationConfigurationDeleteResponse.lastModifiedBy())
            .contains("lastModifiedBy")
        assertThat(integrationConfigurationDeleteResponse.name()).contains("My Integration")
        assertThat(integrationConfigurationDeleteResponse.triggerType())
            .contains(IntegrationConfigurationDeleteResponse.TriggerType.EVENT)
        assertThat(integrationConfigurationDeleteResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integrationConfigurationDeleteResponse =
            IntegrationConfigurationDeleteResponse.builder()
                .id("id")
                .destination("Stripe")
                .entityType("Bill")
                .authorized(true)
                .configData(
                    IntegrationConfigurationDeleteResponse.ConfigData.builder()
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
                .triggerType(IntegrationConfigurationDeleteResponse.TriggerType.EVENT)
                .version(0L)
                .build()

        val roundtrippedIntegrationConfigurationDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integrationConfigurationDeleteResponse),
                jacksonTypeRef<IntegrationConfigurationDeleteResponse>(),
            )

        assertThat(roundtrippedIntegrationConfigurationDeleteResponse)
            .isEqualTo(integrationConfigurationDeleteResponse)
    }
}
