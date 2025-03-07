// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IntegrationConfigurationResponseTest {

    @Test
    fun createIntegrationConfigurationResponse() {
        val integrationConfigurationResponse =
            IntegrationConfigurationResponse.builder()
                .id("id")
                .destination("destination")
                .entityId("x")
                .entityType("x")
                .status(IntegrationConfigurationResponse.Status.WAITING)
                .version(0L)
                .createdBy("createdBy")
                .dtCompleted(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtStarted(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .error("error")
                .externalId("externalId")
                .lastModifiedBy("lastModifiedBy")
                .url("url")
                .build()
        assertThat(integrationConfigurationResponse).isNotNull
        assertThat(integrationConfigurationResponse.id()).isEqualTo("id")
        assertThat(integrationConfigurationResponse.destination()).isEqualTo("destination")
        assertThat(integrationConfigurationResponse.entityId()).isEqualTo("x")
        assertThat(integrationConfigurationResponse.entityType()).isEqualTo("x")
        assertThat(integrationConfigurationResponse.status())
            .isEqualTo(IntegrationConfigurationResponse.Status.WAITING)
        assertThat(integrationConfigurationResponse.version()).isEqualTo(0L)
        assertThat(integrationConfigurationResponse.createdBy()).contains("createdBy")
        assertThat(integrationConfigurationResponse.dtCompleted())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integrationConfigurationResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integrationConfigurationResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integrationConfigurationResponse.dtStarted())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integrationConfigurationResponse.error()).contains("error")
        assertThat(integrationConfigurationResponse.externalId()).contains("externalId")
        assertThat(integrationConfigurationResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(integrationConfigurationResponse.url()).contains("url")
    }
}
