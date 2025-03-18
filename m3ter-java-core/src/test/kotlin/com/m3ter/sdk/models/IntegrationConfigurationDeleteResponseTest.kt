// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationConfigurationDeleteResponseTest {

    @Test
    fun create() {
        val integrationConfigurationDeleteResponse =
            IntegrationConfigurationDeleteResponse.builder()
                .id("id")
                .destination("x")
                .entityType("x")
                .version(0L)
                .authorized(true)
                .configData(
                    IntegrationConfigurationDeleteResponse.ConfigData.builder()
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
                .triggerType(IntegrationConfigurationDeleteResponse.TriggerType.EVENT)
                .build()

        assertThat(integrationConfigurationDeleteResponse.id()).isEqualTo("id")
        assertThat(integrationConfigurationDeleteResponse.destination()).isEqualTo("x")
        assertThat(integrationConfigurationDeleteResponse.entityType()).isEqualTo("x")
        assertThat(integrationConfigurationDeleteResponse.version()).isEqualTo(0L)
        assertThat(integrationConfigurationDeleteResponse.authorized()).contains(true)
        assertThat(integrationConfigurationDeleteResponse.configData())
            .contains(
                IntegrationConfigurationDeleteResponse.ConfigData.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(integrationConfigurationDeleteResponse.createdBy()).contains("createdBy")
        assertThat(integrationConfigurationDeleteResponse.destinationId()).contains("destinationId")
        assertThat(integrationConfigurationDeleteResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integrationConfigurationDeleteResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integrationConfigurationDeleteResponse.enabled()).contains(true)
        assertThat(integrationConfigurationDeleteResponse.entityId()).contains("entityId")
        assertThat(integrationConfigurationDeleteResponse.integrationCredentialsId())
            .contains("integrationCredentialsId")
        assertThat(integrationConfigurationDeleteResponse.lastModifiedBy())
            .contains("lastModifiedBy")
        assertThat(integrationConfigurationDeleteResponse.name()).contains("name")
        assertThat(integrationConfigurationDeleteResponse.triggerType())
            .contains(IntegrationConfigurationDeleteResponse.TriggerType.EVENT)
    }
}
