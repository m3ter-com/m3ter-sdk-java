// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportDestinationResponseTest {

    @Test
    fun create() {
        val dataExportDestinationResponse =
            DataExportDestinationResponse.builder()
                .id("id")
                .code("code")
                .createdBy("createdBy")
                .destinationType(DataExportDestinationResponse.DestinationType.S3)
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .version(0L)
                .build()

        assertThat(dataExportDestinationResponse.id()).isEqualTo("id")
        assertThat(dataExportDestinationResponse.code()).contains("code")
        assertThat(dataExportDestinationResponse.createdBy()).contains("createdBy")
        assertThat(dataExportDestinationResponse.destinationType())
            .contains(DataExportDestinationResponse.DestinationType.S3)
        assertThat(dataExportDestinationResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataExportDestinationResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataExportDestinationResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(dataExportDestinationResponse.name()).contains("name")
        assertThat(dataExportDestinationResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportDestinationResponse =
            DataExportDestinationResponse.builder()
                .id("id")
                .code("code")
                .createdBy("createdBy")
                .destinationType(DataExportDestinationResponse.DestinationType.S3)
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .version(0L)
                .build()

        val roundtrippedDataExportDestinationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportDestinationResponse),
                jacksonTypeRef<DataExportDestinationResponse>(),
            )

        assertThat(roundtrippedDataExportDestinationResponse)
            .isEqualTo(dataExportDestinationResponse)
    }
}
