// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
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
}
