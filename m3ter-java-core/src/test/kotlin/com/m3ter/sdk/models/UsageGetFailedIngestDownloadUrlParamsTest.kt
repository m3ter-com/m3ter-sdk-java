// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UsageGetFailedIngestDownloadUrlParamsTest {

    @Test
    fun create() {
        UsageGetFailedIngestDownloadUrlParams.builder().orgId("orgId").file("file").build()
    }

    @Test
    fun queryParams() {
        val params =
            UsageGetFailedIngestDownloadUrlParams.builder().orgId("orgId").file("file").build()
        val expected = QueryParams.builder()
        expected.put("file", "file")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = UsageGetFailedIngestDownloadUrlParams.builder().orgId("orgId").build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params = UsageGetFailedIngestDownloadUrlParams.builder().orgId("orgId").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
