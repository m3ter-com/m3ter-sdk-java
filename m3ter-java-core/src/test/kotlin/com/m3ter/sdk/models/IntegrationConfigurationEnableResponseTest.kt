// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationConfigurationEnableResponseTest {

    @Test
    fun create() {
        val integrationConfigurationEnableResponse =
            IntegrationConfigurationEnableResponse.builder()
                .id("id")
                .destination("x")
                .entityType("x")
                .version(0L)
                .authorized(true)
                .configData(
                    IntegrationConfigurationEnableResponse.ConfigData.builder()
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
                .triggerType(IntegrationConfigurationEnableResponse.TriggerType.EVENT)
                .build()

        assertThat(integrationConfigurationEnableResponse.id()).isEqualTo("id")
        assertThat(integrationConfigurationEnableResponse.destination()).isEqualTo("x")
        assertThat(integrationConfigurationEnableResponse.entityType()).isEqualTo("x")
        assertThat(integrationConfigurationEnableResponse.version()).isEqualTo(0L)
        assertThat(integrationConfigurationEnableResponse.authorized()).contains(true)
        assertThat(integrationConfigurationEnableResponse.configData())
            .contains(
                IntegrationConfigurationEnableResponse.ConfigData.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(integrationConfigurationEnableResponse.createdBy()).contains("createdBy")
        assertThat(integrationConfigurationEnableResponse.destinationId()).contains("destinationId")
        assertThat(integrationConfigurationEnableResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integrationConfigurationEnableResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integrationConfigurationEnableResponse.enabled()).contains(true)
        assertThat(integrationConfigurationEnableResponse.entityId()).contains("entityId")
        assertThat(integrationConfigurationEnableResponse.integrationCredentialsId())
            .contains("integrationCredentialsId")
        assertThat(integrationConfigurationEnableResponse.lastModifiedBy())
            .contains("lastModifiedBy")
        assertThat(integrationConfigurationEnableResponse.name()).contains("name")
        assertThat(integrationConfigurationEnableResponse.triggerType())
            .contains(IntegrationConfigurationEnableResponse.TriggerType.EVENT)
    }
}
