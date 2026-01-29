// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportScheduleListPageResponseTest {

    @Test
    fun create() {
        val dataExportScheduleListPageResponse =
            DataExportScheduleListPageResponse.builder()
                .addData(
                    DataExportScheduleListResponse.builder()
                        .id("id")
                        .code("code")
                        .createdBy("createdBy")
                        .cronExpression("cronExpression")
                        .addDestinationId("string")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .exportFileFormat(DataExportScheduleListResponse.ExportFileFormat.CSV)
                        .lastModifiedBy("lastModifiedBy")
                        .name("name")
                        .offset(0)
                        .period(0)
                        .scheduleType(DataExportScheduleListResponse.ScheduleType.HOUR)
                        .sourceType(DataExportScheduleListResponse.SourceType.USAGE)
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        assertThat(dataExportScheduleListPageResponse.data().getOrNull())
            .containsExactly(
                DataExportScheduleListResponse.builder()
                    .id("id")
                    .code("code")
                    .createdBy("createdBy")
                    .cronExpression("cronExpression")
                    .addDestinationId("string")
                    .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .exportFileFormat(DataExportScheduleListResponse.ExportFileFormat.CSV)
                    .lastModifiedBy("lastModifiedBy")
                    .name("name")
                    .offset(0)
                    .period(0)
                    .scheduleType(DataExportScheduleListResponse.ScheduleType.HOUR)
                    .sourceType(DataExportScheduleListResponse.SourceType.USAGE)
                    .version(0L)
                    .build()
            )
        assertThat(dataExportScheduleListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportScheduleListPageResponse =
            DataExportScheduleListPageResponse.builder()
                .addData(
                    DataExportScheduleListResponse.builder()
                        .id("id")
                        .code("code")
                        .createdBy("createdBy")
                        .cronExpression("cronExpression")
                        .addDestinationId("string")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .exportFileFormat(DataExportScheduleListResponse.ExportFileFormat.CSV)
                        .lastModifiedBy("lastModifiedBy")
                        .name("name")
                        .offset(0)
                        .period(0)
                        .scheduleType(DataExportScheduleListResponse.ScheduleType.HOUR)
                        .sourceType(DataExportScheduleListResponse.SourceType.USAGE)
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedDataExportScheduleListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportScheduleListPageResponse),
                jacksonTypeRef<DataExportScheduleListPageResponse>(),
            )

        assertThat(roundtrippedDataExportScheduleListPageResponse)
            .isEqualTo(dataExportScheduleListPageResponse)
    }
}
