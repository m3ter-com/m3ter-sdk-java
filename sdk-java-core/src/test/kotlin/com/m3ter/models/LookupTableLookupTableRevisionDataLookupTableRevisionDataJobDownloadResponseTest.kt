// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponseTest {

    @Test
    fun create() {
        val lookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse =
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse.builder()
                .jobId("jobId")
                .build()

        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse.jobId()
            )
            .contains("jobId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse =
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse.builder()
                .jobId("jobId")
                .build()

        val roundtrippedLookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    lookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse
                ),
                jacksonTypeRef<
                    LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse
                >(),
            )

        assertThat(
                roundtrippedLookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse
            )
            .isEqualTo(lookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse)
    }
}
