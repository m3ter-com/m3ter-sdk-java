// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportJobGetDownloadUrlResponseTest {

    @Test
    fun createDataExportJobGetDownloadUrlResponse() {
        val dataExportJobGetDownloadUrlResponse =
            DataExportJobGetDownloadUrlResponse.builder()
                .expirationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("url")
                .build()
        assertThat(dataExportJobGetDownloadUrlResponse).isNotNull
        assertThat(dataExportJobGetDownloadUrlResponse.expirationTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataExportJobGetDownloadUrlResponse.url()).contains("url")
    }
}
