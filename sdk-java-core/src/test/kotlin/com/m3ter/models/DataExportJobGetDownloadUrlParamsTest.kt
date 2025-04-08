// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportJobGetDownloadUrlParamsTest {

    @Test
    fun create() {
        DataExportJobGetDownloadUrlParams.builder().orgId("orgId").jobId("jobId").build()
    }

    @Test
    fun pathParams() {
        val params = DataExportJobGetDownloadUrlParams.builder().jobId("jobId").build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("jobId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
