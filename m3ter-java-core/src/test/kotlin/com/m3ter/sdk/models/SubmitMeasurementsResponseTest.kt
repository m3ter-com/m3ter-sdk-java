// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubmitMeasurementsResponseTest {

    @Test
    fun create() {
        val submitMeasurementsResponse =
            SubmitMeasurementsResponse.builder().result("accepted").build()

        assertThat(submitMeasurementsResponse.result()).contains("accepted")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val submitMeasurementsResponse =
            SubmitMeasurementsResponse.builder().result("accepted").build()

        val roundtrippedSubmitMeasurementsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(submitMeasurementsResponse),
                jacksonTypeRef<SubmitMeasurementsResponse>(),
            )

        assertThat(roundtrippedSubmitMeasurementsResponse).isEqualTo(submitMeasurementsResponse)
    }
}
