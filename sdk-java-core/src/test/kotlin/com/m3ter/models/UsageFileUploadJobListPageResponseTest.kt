// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageFileUploadJobListPageResponseTest {

    @Test
    fun create() {
        val usageFileUploadJobListPageResponse =
            UsageFileUploadJobListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        assertThat(usageFileUploadJobListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(usageFileUploadJobListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageFileUploadJobListPageResponse =
            UsageFileUploadJobListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedUsageFileUploadJobListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageFileUploadJobListPageResponse),
                jacksonTypeRef<UsageFileUploadJobListPageResponse>(),
            )

        assertThat(roundtrippedUsageFileUploadJobListPageResponse)
            .isEqualTo(usageFileUploadJobListPageResponse)
    }
}
