// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdHocResponseTest {

    @Test
    fun create() {
        val adHocResponse = AdHocResponse.builder().jobId("jobId").build()

        assertThat(adHocResponse.jobId()).contains("jobId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val adHocResponse = AdHocResponse.builder().jobId("jobId").build()

        val roundtrippedAdHocResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(adHocResponse),
                jacksonTypeRef<AdHocResponse>(),
            )

        assertThat(roundtrippedAdHocResponse).isEqualTo(adHocResponse)
    }
}
