// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationConfigurationResponseTest {

    @Test
    fun create() {
        val integrationConfigurationResponse =
            IntegrationConfigurationResponse.builder()
                .id("id")
                .destination("destination")
                .entityId("x")
                .entityType("x")
                .status(IntegrationConfigurationResponse.Status.WAITING)
                .createdBy("createdBy")
                .destinationId("destinationId")
                .dtCompleted(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtStarted(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .error("error")
                .externalId("externalId")
                .lastModifiedBy("lastModifiedBy")
                .parentIntegrationRunId("parentIntegrationRunId")
                .url("url")
                .version(0L)
                .build()

        assertThat(integrationConfigurationResponse.id()).isEqualTo("id")
        assertThat(integrationConfigurationResponse.destination()).isEqualTo("destination")
        assertThat(integrationConfigurationResponse.entityId()).isEqualTo("x")
        assertThat(integrationConfigurationResponse.entityType()).isEqualTo("x")
        assertThat(integrationConfigurationResponse.status())
            .isEqualTo(IntegrationConfigurationResponse.Status.WAITING)
        assertThat(integrationConfigurationResponse.createdBy()).contains("createdBy")
        assertThat(integrationConfigurationResponse.destinationId()).contains("destinationId")
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
        assertThat(integrationConfigurationResponse.parentIntegrationRunId())
            .contains("parentIntegrationRunId")
        assertThat(integrationConfigurationResponse.url()).contains("url")
        assertThat(integrationConfigurationResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integrationConfigurationResponse =
            IntegrationConfigurationResponse.builder()
                .id("id")
                .destination("destination")
                .entityId("x")
                .entityType("x")
                .status(IntegrationConfigurationResponse.Status.WAITING)
                .createdBy("createdBy")
                .destinationId("destinationId")
                .dtCompleted(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtStarted(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .error("error")
                .externalId("externalId")
                .lastModifiedBy("lastModifiedBy")
                .parentIntegrationRunId("parentIntegrationRunId")
                .url("url")
                .version(0L)
                .build()

        val roundtrippedIntegrationConfigurationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integrationConfigurationResponse),
                jacksonTypeRef<IntegrationConfigurationResponse>(),
            )

        assertThat(roundtrippedIntegrationConfigurationResponse)
            .isEqualTo(integrationConfigurationResponse)
    }
}
