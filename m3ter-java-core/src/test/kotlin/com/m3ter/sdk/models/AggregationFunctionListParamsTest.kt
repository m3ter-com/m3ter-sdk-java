// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AggregationListParamsTest {

    @Test
    fun create() {
        AggregationListParams.builder()
            .orgId("orgId")
            .addCode("string")
            .addId("string")
            .nextToken("nextToken")
            .pageSize(1L)
            .addProductId("string")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AggregationListParams.builder()
                .orgId("orgId")
                .addCode("string")
                .addId("string")
                .nextToken("nextToken")
                .pageSize(1L)
                .addProductId("string")
                .build()
        val expected = QueryParams.builder()
        expected.put("codes", "string")
        expected.put("ids", "string")
        expected.put("nextToken", "nextToken")
        expected.put("pageSize", "1")
        expected.put("productId", "string")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AggregationListParams.builder().orgId("orgId").build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params = AggregationListParams.builder().orgId("orgId").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
