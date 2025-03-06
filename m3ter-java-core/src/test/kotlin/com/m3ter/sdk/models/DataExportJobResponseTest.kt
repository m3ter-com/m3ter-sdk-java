// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DataExportJobResponseTest {

    @Test
    fun createDataExportJobResponse() {
        val dataExportJobResponse =
            DataExportJobResponse.builder()
                .id("id")
                .version(0L)
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .scheduleId("scheduleId")
                .sourceType(DataExportJobResponse.SourceType.USAGE)
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(DataExportJobResponse.Status.PENDING)
                .build()
        assertThat(dataExportJobResponse).isNotNull
        assertThat(dataExportJobResponse.id()).isEqualTo("id")
        assertThat(dataExportJobResponse.version()).isEqualTo(0L)
        assertThat(dataExportJobResponse.dateCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataExportJobResponse.scheduleId()).contains("scheduleId")
        assertThat(dataExportJobResponse.sourceType())
            .contains(DataExportJobResponse.SourceType.USAGE)
        assertThat(dataExportJobResponse.startedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataExportJobResponse.status()).contains(DataExportJobResponse.Status.PENDING)
    }
}
