// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportJobGetDownloadUrlResponseTest {

    @Test
    fun create() {
        val dataExportJobGetDownloadUrlResponse =
            DataExportJobGetDownloadUrlResponse.builder()
                .expirationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("url")
                .build()

        assertThat(dataExportJobGetDownloadUrlResponse.expirationTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataExportJobGetDownloadUrlResponse.url()).contains("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportJobGetDownloadUrlResponse =
            DataExportJobGetDownloadUrlResponse.builder()
                .expirationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("url")
                .build()

        val roundtrippedDataExportJobGetDownloadUrlResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportJobGetDownloadUrlResponse),
                jacksonTypeRef<DataExportJobGetDownloadUrlResponse>(),
            )

        assertThat(roundtrippedDataExportJobGetDownloadUrlResponse)
            .isEqualTo(dataExportJobGetDownloadUrlResponse)
    }
}
