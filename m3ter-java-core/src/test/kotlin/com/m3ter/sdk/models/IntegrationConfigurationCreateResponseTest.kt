// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationConfigurationCreateResponseTest {

    @Test
    fun create() {
        val integrationConfigurationCreateResponse =
            IntegrationConfigurationCreateResponse.builder()
                .id("id")
                .destination("x")
                .entityType("x")
                .version(0L)
                .authorized(true)
                .configData(
                    IntegrationConfigurationCreateResponse.ConfigData.builder()
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
                .triggerType(IntegrationConfigurationCreateResponse.TriggerType.EVENT)
                .build()

        assertThat(integrationConfigurationCreateResponse.id()).isEqualTo("id")
        assertThat(integrationConfigurationCreateResponse.destination()).isEqualTo("x")
        assertThat(integrationConfigurationCreateResponse.entityType()).isEqualTo("x")
        assertThat(integrationConfigurationCreateResponse.version()).isEqualTo(0L)
        assertThat(integrationConfigurationCreateResponse.authorized()).contains(true)
        assertThat(integrationConfigurationCreateResponse.configData())
            .contains(
                IntegrationConfigurationCreateResponse.ConfigData.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(integrationConfigurationCreateResponse.createdBy()).contains("createdBy")
        assertThat(integrationConfigurationCreateResponse.destinationId()).contains("destinationId")
        assertThat(integrationConfigurationCreateResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integrationConfigurationCreateResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integrationConfigurationCreateResponse.enabled()).contains(true)
        assertThat(integrationConfigurationCreateResponse.entityId()).contains("entityId")
        assertThat(integrationConfigurationCreateResponse.integrationCredentialsId())
            .contains("integrationCredentialsId")
        assertThat(integrationConfigurationCreateResponse.lastModifiedBy())
            .contains("lastModifiedBy")
        assertThat(integrationConfigurationCreateResponse.name()).contains("name")
        assertThat(integrationConfigurationCreateResponse.triggerType())
            .contains(IntegrationConfigurationCreateResponse.TriggerType.EVENT)
    }
}
