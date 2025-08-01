// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportJobResponseTest {

    @Test
    fun create() {
        val dataExportJobResponse =
            DataExportJobResponse.builder()
                .id("id")
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .scheduleId("scheduleId")
                .sourceType(DataExportJobResponse.SourceType.USAGE)
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(DataExportJobResponse.Status.PENDING)
                .version(0L)
                .build()

        assertThat(dataExportJobResponse.id()).isEqualTo("id")
        assertThat(dataExportJobResponse.dateCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataExportJobResponse.scheduleId()).contains("scheduleId")
        assertThat(dataExportJobResponse.sourceType())
            .contains(DataExportJobResponse.SourceType.USAGE)
        assertThat(dataExportJobResponse.startedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataExportJobResponse.status()).contains(DataExportJobResponse.Status.PENDING)
        assertThat(dataExportJobResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportJobResponse =
            DataExportJobResponse.builder()
                .id("id")
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .scheduleId("scheduleId")
                .sourceType(DataExportJobResponse.SourceType.USAGE)
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(DataExportJobResponse.Status.PENDING)
                .version(0L)
                .build()

        val roundtrippedDataExportJobResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportJobResponse),
                jacksonTypeRef<DataExportJobResponse>(),
            )

        assertThat(roundtrippedDataExportJobResponse).isEqualTo(dataExportJobResponse)
    }
}
