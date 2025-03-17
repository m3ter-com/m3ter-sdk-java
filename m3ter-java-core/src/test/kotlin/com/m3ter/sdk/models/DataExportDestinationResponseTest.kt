// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportDestinationResponseTest {

    @Test
    fun createDataExportDestinationResponse() {
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
        assertThat(dataExportDestinationResponse).isNotNull
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
}
