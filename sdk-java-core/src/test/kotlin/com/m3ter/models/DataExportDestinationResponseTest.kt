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
                .version(0L)
                .code("code")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .build()

        assertThat(dataExportDestinationResponse.id()).isEqualTo("id")
        assertThat(dataExportDestinationResponse.version()).isEqualTo(0L)
        assertThat(dataExportDestinationResponse.code()).contains("code")
        assertThat(dataExportDestinationResponse.createdBy()).contains("createdBy")
        assertThat(dataExportDestinationResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataExportDestinationResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataExportDestinationResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(dataExportDestinationResponse.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportDestinationResponse =
            DataExportDestinationResponse.builder()
                .id("id")
                .version(0L)
                .code("code")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
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
