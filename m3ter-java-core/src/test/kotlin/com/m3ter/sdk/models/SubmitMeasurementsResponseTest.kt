// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubmitMeasurementsResponseTest {

    @Test
    fun create() {
        val submitMeasurementsResponse =
            SubmitMeasurementsResponse.builder().result("accepted").build()

        assertThat(submitMeasurementsResponse.result()).contains("accepted")
    }
}
