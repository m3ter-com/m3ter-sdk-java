// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageGetFailedIngestDownloadUrlParamsTest {

    @Test
    fun create() {
        UsageGetFailedIngestDownloadUrlParams.builder().orgId("orgId").file("file").build()
    }

    @Test
    fun pathParams() {
        val params = UsageGetFailedIngestDownloadUrlParams.builder().build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            UsageGetFailedIngestDownloadUrlParams.builder().orgId("orgId").file("file").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("file", "file").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = UsageGetFailedIngestDownloadUrlParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
