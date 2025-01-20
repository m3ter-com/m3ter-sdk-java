// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProductListParamsTest {

    @Test
    fun createProductListParams() {
        ProductListParams.builder()
            .orgId("orgId")
            .addId("string")
            .nextToken("nextToken")
            .pageSize(1L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ProductListParams.builder()
                .orgId("orgId")
                .addId("string")
                .nextToken("nextToken")
                .pageSize(1L)
                .build()
        val expected = QueryParams.builder()
        expected.put("ids", "string")
        expected.put("nextToken", "nextToken")
        expected.put("pageSize", "1")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ProductListParams.builder().orgId("orgId").build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params = ProductListParams.builder().orgId("orgId").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
