// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageFileUploadGenerateUploadUrlResponseTest {

    @Test
    fun create() {
        val usageFileUploadGenerateUploadUrlResponse =
            UsageFileUploadGenerateUploadUrlResponse.builder()
                .headers(
                    UsageFileUploadGenerateUploadUrlResponse.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .jobId("jobId")
                .url("url")
                .build()

        assertThat(usageFileUploadGenerateUploadUrlResponse.headers())
            .contains(
                UsageFileUploadGenerateUploadUrlResponse.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(usageFileUploadGenerateUploadUrlResponse.jobId()).contains("jobId")
        assertThat(usageFileUploadGenerateUploadUrlResponse.url()).contains("url")
    }
}
