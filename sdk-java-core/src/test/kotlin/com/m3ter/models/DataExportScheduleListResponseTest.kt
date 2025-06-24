// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportScheduleListResponseTest {

    @Test
    fun create() {
        val dataExportScheduleListResponse =
            DataExportScheduleListResponse.builder()
                .id("id")
                .code("code")
                .createdBy("createdBy")
                .addDestinationId("string")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .exportFileFormat(DataExportScheduleListResponse.ExportFileFormat.CSV)
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .period(0)
                .scheduleType(DataExportScheduleListResponse.ScheduleType.HOUR)
                .sourceType(DataExportScheduleListResponse.SourceType.USAGE)
                .version(0L)
                .build()

        assertThat(dataExportScheduleListResponse.id()).isEqualTo("id")
        assertThat(dataExportScheduleListResponse.code()).contains("code")
        assertThat(dataExportScheduleListResponse.createdBy()).contains("createdBy")
        assertThat(dataExportScheduleListResponse.destinationIds().getOrNull())
            .containsExactly("string")
        assertThat(dataExportScheduleListResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataExportScheduleListResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataExportScheduleListResponse.exportFileFormat())
            .contains(DataExportScheduleListResponse.ExportFileFormat.CSV)
        assertThat(dataExportScheduleListResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(dataExportScheduleListResponse.name()).contains("name")
        assertThat(dataExportScheduleListResponse.period()).contains(0)
        assertThat(dataExportScheduleListResponse.scheduleType())
            .contains(DataExportScheduleListResponse.ScheduleType.HOUR)
        assertThat(dataExportScheduleListResponse.sourceType())
            .contains(DataExportScheduleListResponse.SourceType.USAGE)
        assertThat(dataExportScheduleListResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportScheduleListResponse =
            DataExportScheduleListResponse.builder()
                .id("id")
                .code("code")
                .createdBy("createdBy")
                .addDestinationId("string")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .exportFileFormat(DataExportScheduleListResponse.ExportFileFormat.CSV)
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .period(0)
                .scheduleType(DataExportScheduleListResponse.ScheduleType.HOUR)
                .sourceType(DataExportScheduleListResponse.SourceType.USAGE)
                .version(0L)
                .build()

        val roundtrippedDataExportScheduleListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportScheduleListResponse),
                jacksonTypeRef<DataExportScheduleListResponse>(),
            )

        assertThat(roundtrippedDataExportScheduleListResponse)
            .isEqualTo(dataExportScheduleListResponse)
    }
}
