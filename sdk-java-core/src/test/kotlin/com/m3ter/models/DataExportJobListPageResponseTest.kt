// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportJobListPageResponseTest {

    @Test
    fun create() {
        val dataExportJobListPageResponse =
            DataExportJobListPageResponse.builder()
                .addData(
                    DataExportJobResponse.builder()
                        .id("id")
                        .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .scheduleId("scheduleId")
                        .sourceType(DataExportJobResponse.SourceType.USAGE)
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(DataExportJobResponse.Status.PENDING)
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        assertThat(dataExportJobListPageResponse.data().getOrNull())
            .containsExactly(
                DataExportJobResponse.builder()
                    .id("id")
                    .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .scheduleId("scheduleId")
                    .sourceType(DataExportJobResponse.SourceType.USAGE)
                    .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(DataExportJobResponse.Status.PENDING)
                    .version(0L)
                    .build()
            )
        assertThat(dataExportJobListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportJobListPageResponse =
            DataExportJobListPageResponse.builder()
                .addData(
                    DataExportJobResponse.builder()
                        .id("id")
                        .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .scheduleId("scheduleId")
                        .sourceType(DataExportJobResponse.SourceType.USAGE)
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(DataExportJobResponse.Status.PENDING)
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedDataExportJobListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportJobListPageResponse),
                jacksonTypeRef<DataExportJobListPageResponse>(),
            )

        assertThat(roundtrippedDataExportJobListPageResponse)
            .isEqualTo(dataExportJobListPageResponse)
    }
}
