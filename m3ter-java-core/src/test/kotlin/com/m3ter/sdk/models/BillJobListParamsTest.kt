// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BillJobListParamsTest {

    @Test
    fun create() {
        BillJobListParams.builder()
            .orgId("orgId")
            .active("active")
            .nextToken("nextToken")
            .pageSize(1L)
            .status("status")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BillJobListParams.builder()
                .orgId("orgId")
                .active("active")
                .nextToken("nextToken")
                .pageSize(1L)
                .status("status")
                .build()
        val expected = QueryParams.builder()
        expected.put("active", "active")
        expected.put("nextToken", "nextToken")
        expected.put("pageSize", "1")
        expected.put("status", "status")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BillJobListParams.builder().orgId("orgId").build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params = BillJobListParams.builder().orgId("orgId").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
