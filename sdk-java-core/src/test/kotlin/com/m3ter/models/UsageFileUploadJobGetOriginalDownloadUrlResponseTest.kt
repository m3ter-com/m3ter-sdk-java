// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageFileUploadJobGetOriginalDownloadUrlResponseTest {

    @Test
    fun create() {
        val usageFileUploadJobGetOriginalDownloadUrlResponse =
            UsageFileUploadJobGetOriginalDownloadUrlResponse.builder()
                .headers(
                    UsageFileUploadJobGetOriginalDownloadUrlResponse.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .jobId("jobId")
                .url("url")
                .build()

        assertThat(usageFileUploadJobGetOriginalDownloadUrlResponse.headers())
            .contains(
                UsageFileUploadJobGetOriginalDownloadUrlResponse.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(usageFileUploadJobGetOriginalDownloadUrlResponse.jobId()).contains("jobId")
        assertThat(usageFileUploadJobGetOriginalDownloadUrlResponse.url()).contains("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageFileUploadJobGetOriginalDownloadUrlResponse =
            UsageFileUploadJobGetOriginalDownloadUrlResponse.builder()
                .headers(
                    UsageFileUploadJobGetOriginalDownloadUrlResponse.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .jobId("jobId")
                .url("url")
                .build()

        val roundtrippedUsageFileUploadJobGetOriginalDownloadUrlResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageFileUploadJobGetOriginalDownloadUrlResponse),
                jacksonTypeRef<UsageFileUploadJobGetOriginalDownloadUrlResponse>(),
            )

        assertThat(roundtrippedUsageFileUploadJobGetOriginalDownloadUrlResponse)
            .isEqualTo(usageFileUploadJobGetOriginalDownloadUrlResponse)
    }
}
