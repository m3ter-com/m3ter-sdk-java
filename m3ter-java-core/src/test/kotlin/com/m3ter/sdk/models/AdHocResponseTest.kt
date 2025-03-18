// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdHocResponseTest {

    @Test
    fun create() {
        val adHocResponse = AdHocResponse.builder().jobId("jobId").build()

        assertThat(adHocResponse.jobId()).contains("jobId")
    }
}
