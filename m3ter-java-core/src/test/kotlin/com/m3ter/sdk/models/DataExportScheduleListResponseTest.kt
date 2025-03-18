// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

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
                .version(0L)
                .code("code")
                .createdBy("createdBy")
                .addDestinationId("string")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .exportFileFormat(DataExportScheduleListResponse.ExportFileFormat.CSV)
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .period(0L)
                .scheduleType(DataExportScheduleListResponse.ScheduleType.HOURLY)
                .sourceType(DataExportScheduleListResponse.SourceType.USAGE)
                .build()

        assertThat(dataExportScheduleListResponse.id()).isEqualTo("id")
        assertThat(dataExportScheduleListResponse.version()).isEqualTo(0L)
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
        assertThat(dataExportScheduleListResponse.period()).contains(0L)
        assertThat(dataExportScheduleListResponse.scheduleType())
            .contains(DataExportScheduleListResponse.ScheduleType.HOURLY)
        assertThat(dataExportScheduleListResponse.sourceType())
            .contains(DataExportScheduleListResponse.SourceType.USAGE)
    }
}
