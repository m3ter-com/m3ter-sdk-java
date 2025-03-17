// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportJobGetDownloadUrlParamsTest {

    @Test
    fun create() {
        DataExportJobGetDownloadUrlParams.builder().orgId("orgId").jobId("jobId").build()
    }

    @Test
    fun getPathParam() {
        val params =
            DataExportJobGetDownloadUrlParams.builder().orgId("orgId").jobId("jobId").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "jobId"
        assertThat(params.getPathParam(1)).isEqualTo("jobId")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
