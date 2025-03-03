// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FileUploadJobTest {

    @Test
    fun createFileUploadJob() {
        val fileUploadJob =
            FileUploadJob.builder()
                .id("id")
                .contentLength(0L)
                .failedRows(0L)
                .fileName("fileName")
                .processedRows(0L)
                .status(FileUploadJob.Status.NOT_UPLOADED)
                .totalRows(0L)
                .uploadDate("uploadDate")
                .version(0L)
                .build()
        assertThat(fileUploadJob).isNotNull
        assertThat(fileUploadJob.id()).contains("id")
        assertThat(fileUploadJob.contentLength()).contains(0L)
        assertThat(fileUploadJob.failedRows()).contains(0L)
        assertThat(fileUploadJob.fileName()).contains("fileName")
        assertThat(fileUploadJob.processedRows()).contains(0L)
        assertThat(fileUploadJob.status()).contains(FileUploadJob.Status.NOT_UPLOADED)
        assertThat(fileUploadJob.totalRows()).contains(0L)
        assertThat(fileUploadJob.uploadDate()).contains("uploadDate")
        assertThat(fileUploadJob.version()).contains(0L)
    }
}
