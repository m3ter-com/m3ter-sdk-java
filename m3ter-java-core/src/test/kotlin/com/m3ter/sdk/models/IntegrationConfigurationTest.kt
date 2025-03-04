// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IntegrationConfigurationTest {

    @Test
    fun createIntegrationConfiguration() {
        val integrationConfiguration =
            IntegrationConfiguration.builder()
                .id("id")
                .destination("destination")
                .entityId("x")
                .entityType("x")
                .status(IntegrationConfiguration.Status.WAITING)
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
        assertThat(integrationConfiguration).isNotNull
        assertThat(integrationConfiguration.id()).isEqualTo("id")
        assertThat(integrationConfiguration.destination()).isEqualTo("destination")
        assertThat(integrationConfiguration.entityId()).isEqualTo("x")
        assertThat(integrationConfiguration.entityType()).isEqualTo("x")
        assertThat(integrationConfiguration.status())
            .isEqualTo(IntegrationConfiguration.Status.WAITING)
        assertThat(integrationConfiguration.version()).isEqualTo(0L)
        assertThat(integrationConfiguration.createdBy()).contains("createdBy")
        assertThat(integrationConfiguration.dtCompleted())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integrationConfiguration.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integrationConfiguration.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integrationConfiguration.dtStarted())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integrationConfiguration.error()).contains("error")
        assertThat(integrationConfiguration.externalId()).contains("externalId")
        assertThat(integrationConfiguration.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(integrationConfiguration.url()).contains("url")
    }
}
