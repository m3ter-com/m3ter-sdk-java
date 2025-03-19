// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanListParamsTest {

    @Test
    fun create() {
        PlanListParams.builder()
            .orgId("orgId")
            .addAccountId("string")
            .addId("string")
            .nextToken("nextToken")
            .pageSize(1L)
            .productId("productId")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PlanListParams.builder()
                .orgId("orgId")
                .addAccountId("string")
                .addId("string")
                .nextToken("nextToken")
                .pageSize(1L)
                .productId("productId")
                .build()
        val expected = QueryParams.builder()
        expected.put("accountId", "string")
        expected.put("ids", "string")
        expected.put("nextToken", "nextToken")
        expected.put("pageSize", "1")
        expected.put("productId", "productId")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PlanListParams.builder().orgId("orgId").build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params = PlanListParams.builder().orgId("orgId").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
