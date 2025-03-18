// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationConfigurationUpdateResponseTest {

    @Test
    fun create() {
        val integrationConfigurationUpdateResponse =
            IntegrationConfigurationUpdateResponse.builder()
                .id("id")
                .destination("x")
                .entityType("x")
                .version(0L)
                .authorized(true)
                .configData(
                    IntegrationConfigurationUpdateResponse.ConfigData.builder()
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
                .triggerType(IntegrationConfigurationUpdateResponse.TriggerType.EVENT)
                .build()

        assertThat(integrationConfigurationUpdateResponse.id()).isEqualTo("id")
        assertThat(integrationConfigurationUpdateResponse.destination()).isEqualTo("x")
        assertThat(integrationConfigurationUpdateResponse.entityType()).isEqualTo("x")
        assertThat(integrationConfigurationUpdateResponse.version()).isEqualTo(0L)
        assertThat(integrationConfigurationUpdateResponse.authorized()).contains(true)
        assertThat(integrationConfigurationUpdateResponse.configData())
            .contains(
                IntegrationConfigurationUpdateResponse.ConfigData.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(integrationConfigurationUpdateResponse.createdBy()).contains("createdBy")
        assertThat(integrationConfigurationUpdateResponse.destinationId()).contains("destinationId")
        assertThat(integrationConfigurationUpdateResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integrationConfigurationUpdateResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integrationConfigurationUpdateResponse.enabled()).contains(true)
        assertThat(integrationConfigurationUpdateResponse.entityId()).contains("entityId")
        assertThat(integrationConfigurationUpdateResponse.integrationCredentialsId())
            .contains("integrationCredentialsId")
        assertThat(integrationConfigurationUpdateResponse.lastModifiedBy())
            .contains("lastModifiedBy")
        assertThat(integrationConfigurationUpdateResponse.name()).contains("name")
        assertThat(integrationConfigurationUpdateResponse.triggerType())
            .contains(IntegrationConfigurationUpdateResponse.TriggerType.EVENT)
    }
}
