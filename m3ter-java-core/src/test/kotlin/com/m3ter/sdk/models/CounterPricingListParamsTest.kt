// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CounterPricingListParamsTest {

    @Test
    fun create() {
        CounterPricingListParams.builder()
            .orgId("orgId")
            .date("date")
            .addId("string")
            .nextToken("nextToken")
            .pageSize(1L)
            .planId("planId")
            .planTemplateId("planTemplateId")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CounterPricingListParams.builder()
                .orgId("orgId")
                .date("date")
                .addId("string")
                .nextToken("nextToken")
                .pageSize(1L)
                .planId("planId")
                .planTemplateId("planTemplateId")
                .build()
        val expected = QueryParams.builder()
        expected.put("date", "date")
        expected.put("ids", "string")
        expected.put("nextToken", "nextToken")
        expected.put("pageSize", "1")
        expected.put("planId", "planId")
        expected.put("planTemplateId", "planTemplateId")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CounterPricingListParams.builder().orgId("orgId").build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params = CounterPricingListParams.builder().orgId("orgId").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
