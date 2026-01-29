// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationConfigurationCreateResponseTest {

    @Test
    fun create() {
        val integrationConfigurationCreateResponse =
            IntegrationConfigurationCreateResponse.builder()
                .id("id")
                .destination("Stripe")
                .entityType("Bill")
                .authorized(true)
                .configData(
                    IntegrationConfigurationCreateResponse.ConfigData.builder()
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
                .triggerType(IntegrationConfigurationCreateResponse.TriggerType.EVENT)
                .version(0L)
                .build()

        assertThat(integrationConfigurationCreateResponse.id()).isEqualTo("id")
        assertThat(integrationConfigurationCreateResponse.destination()).isEqualTo("Stripe")
        assertThat(integrationConfigurationCreateResponse.entityType()).isEqualTo("Bill")
        assertThat(integrationConfigurationCreateResponse.authorized()).contains(true)
        assertThat(integrationConfigurationCreateResponse.configData())
            .contains(
                IntegrationConfigurationCreateResponse.ConfigData.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(integrationConfigurationCreateResponse.createdBy()).contains("createdBy")
        assertThat(integrationConfigurationCreateResponse.destinationId())
            .contains("00000000-0000-0000-0000-000000000000")
        assertThat(integrationConfigurationCreateResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integrationConfigurationCreateResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integrationConfigurationCreateResponse.enabled()).contains(true)
        assertThat(integrationConfigurationCreateResponse.entityId())
            .contains("00000000-0000-0000-0000-000000000000")
        assertThat(integrationConfigurationCreateResponse.integrationCredentialsId())
            .contains("00000000-0000-0000-0000-000000000000")
        assertThat(integrationConfigurationCreateResponse.lastModifiedBy())
            .contains("lastModifiedBy")
        assertThat(integrationConfigurationCreateResponse.name()).contains("My Integration")
        assertThat(integrationConfigurationCreateResponse.triggerType())
            .contains(IntegrationConfigurationCreateResponse.TriggerType.EVENT)
        assertThat(integrationConfigurationCreateResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integrationConfigurationCreateResponse =
            IntegrationConfigurationCreateResponse.builder()
                .id("id")
                .destination("Stripe")
                .entityType("Bill")
                .authorized(true)
                .configData(
                    IntegrationConfigurationCreateResponse.ConfigData.builder()
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
                .triggerType(IntegrationConfigurationCreateResponse.TriggerType.EVENT)
                .version(0L)
                .build()

        val roundtrippedIntegrationConfigurationCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integrationConfigurationCreateResponse),
                jacksonTypeRef<IntegrationConfigurationCreateResponse>(),
            )

        assertThat(roundtrippedIntegrationConfigurationCreateResponse)
            .isEqualTo(integrationConfigurationCreateResponse)
    }
}
