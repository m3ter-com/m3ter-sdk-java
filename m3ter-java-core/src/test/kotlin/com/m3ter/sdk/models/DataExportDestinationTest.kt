// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DataExportDestinationTest {

    @Test
    fun createDataExportDestination() {
        val dataExportDestination =
            DataExportDestination.builder()
                .id("id")
                .version(0L)
                .code("code")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .build()
        assertThat(dataExportDestination).isNotNull
        assertThat(dataExportDestination.id()).isEqualTo("id")
        assertThat(dataExportDestination.version()).isEqualTo(0L)
        assertThat(dataExportDestination.code()).contains("code")
        assertThat(dataExportDestination.createdBy()).contains("createdBy")
        assertThat(dataExportDestination.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataExportDestination.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataExportDestination.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(dataExportDestination.name()).contains("name")
    }
}
