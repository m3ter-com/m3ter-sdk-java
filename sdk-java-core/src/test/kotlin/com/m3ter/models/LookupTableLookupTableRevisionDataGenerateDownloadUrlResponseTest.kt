// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableLookupTableRevisionDataGenerateDownloadUrlResponseTest {

    @Test
    fun create() {
        val lookupTableLookupTableRevisionDataGenerateDownloadUrlResponse =
            LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse.builder()
                .headers(
                    LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .jobId("jobId")
                .url("url")
                .build()

        assertThat(lookupTableLookupTableRevisionDataGenerateDownloadUrlResponse.headers())
            .contains(
                LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(lookupTableLookupTableRevisionDataGenerateDownloadUrlResponse.jobId())
            .contains("jobId")
        assertThat(lookupTableLookupTableRevisionDataGenerateDownloadUrlResponse.url())
            .contains("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lookupTableLookupTableRevisionDataGenerateDownloadUrlResponse =
            LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse.builder()
                .headers(
                    LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .jobId("jobId")
                .url("url")
                .build()

        val roundtrippedLookupTableLookupTableRevisionDataGenerateDownloadUrlResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    lookupTableLookupTableRevisionDataGenerateDownloadUrlResponse
                ),
                jacksonTypeRef<LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse>(),
            )

        assertThat(roundtrippedLookupTableLookupTableRevisionDataGenerateDownloadUrlResponse)
            .isEqualTo(lookupTableLookupTableRevisionDataGenerateDownloadUrlResponse)
    }
}
