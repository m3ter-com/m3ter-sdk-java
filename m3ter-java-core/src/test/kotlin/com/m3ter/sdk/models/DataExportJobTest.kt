// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DataExportJobTest {

    @Test
    fun createDataExportJob() {
        val dataExportJob =
            DataExportJob.builder()
                .id("id")
                .version(0L)
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .scheduleId("scheduleId")
                .sourceType(DataExportJob.SourceType.USAGE)
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(DataExportJob.Status.PENDING)
                .build()
        assertThat(dataExportJob).isNotNull
        assertThat(dataExportJob.id()).isEqualTo("id")
        assertThat(dataExportJob.version()).isEqualTo(0L)
        assertThat(dataExportJob.dateCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataExportJob.scheduleId()).contains("scheduleId")
        assertThat(dataExportJob.sourceType()).contains(DataExportJob.SourceType.USAGE)
        assertThat(dataExportJob.startedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataExportJob.status()).contains(DataExportJob.Status.PENDING)
    }
}
