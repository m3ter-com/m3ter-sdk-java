// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FileUploadJobResponseTest {

    @Test
    fun createFileUploadJobResponse() {
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
        assertThat(fileUploadJobResponse).isNotNull
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
}
