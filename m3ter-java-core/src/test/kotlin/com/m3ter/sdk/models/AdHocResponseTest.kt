// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AdHocResponseTest {

    @Test
    fun createAdHocResponse() {
        val adHocResponse = AdHocResponse.builder().jobId("jobId").build()
        assertThat(adHocResponse).isNotNull
        assertThat(adHocResponse.jobId()).contains("jobId")
    }
}
