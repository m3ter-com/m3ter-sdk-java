// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableLookupTableRevisionDataCopyResponseTest {

    @Test
    fun create() {
        val lookupTableLookupTableRevisionDataCopyResponse =
            LookupTableLookupTableRevisionDataCopyResponse.builder()
                .jobId("jobId")
                .revisionId("revisionId")
                .build()

        assertThat(lookupTableLookupTableRevisionDataCopyResponse.jobId()).contains("jobId")
        assertThat(lookupTableLookupTableRevisionDataCopyResponse.revisionId())
            .contains("revisionId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lookupTableLookupTableRevisionDataCopyResponse =
            LookupTableLookupTableRevisionDataCopyResponse.builder()
                .jobId("jobId")
                .revisionId("revisionId")
                .build()

        val roundtrippedLookupTableLookupTableRevisionDataCopyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lookupTableLookupTableRevisionDataCopyResponse),
                jacksonTypeRef<LookupTableLookupTableRevisionDataCopyResponse>(),
            )

        assertThat(roundtrippedLookupTableLookupTableRevisionDataCopyResponse)
            .isEqualTo(lookupTableLookupTableRevisionDataCopyResponse)
    }
}
