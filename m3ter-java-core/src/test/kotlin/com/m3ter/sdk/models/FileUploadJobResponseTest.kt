// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileUploadJobResponseTest {

    @Test
    fun create() {
        val fileUploadJobResponse =
            FileUploadJobResponse.builder()
                .id("id")
                .contentLength(0L)
                .failedRows(0L)
                .fileName("fileName")
                .processedRows(0L)
                .status(FileUploadJobResponse.Status.NOT_UPLOADED)
                .totalRows(0L)
                .uploadDate("uploadDate")
                .version(0L)
                .build()

        assertThat(fileUploadJobResponse.id()).contains("id")
        assertThat(fileUploadJobResponse.contentLength()).contains(0L)
        assertThat(fileUploadJobResponse.failedRows()).contains(0L)
        assertThat(fileUploadJobResponse.fileName()).contains("fileName")
        assertThat(fileUploadJobResponse.processedRows()).contains(0L)
        assertThat(fileUploadJobResponse.status())
            .contains(FileUploadJobResponse.Status.NOT_UPLOADED)
        assertThat(fileUploadJobResponse.totalRows()).contains(0L)
        assertThat(fileUploadJobResponse.uploadDate()).contains("uploadDate")
        assertThat(fileUploadJobResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileUploadJobResponse =
            FileUploadJobResponse.builder()
                .id("id")
                .contentLength(0L)
                .failedRows(0L)
                .fileName("fileName")
                .processedRows(0L)
                .status(FileUploadJobResponse.Status.NOT_UPLOADED)
                .totalRows(0L)
                .uploadDate("uploadDate")
                .version(0L)
                .build()

        val roundtrippedFileUploadJobResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileUploadJobResponse),
                jacksonTypeRef<FileUploadJobResponse>(),
            )

        assertThat(roundtrippedFileUploadJobResponse).isEqualTo(fileUploadJobResponse)
    }
}
