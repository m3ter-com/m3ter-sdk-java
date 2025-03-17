// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountPlanListParamsTest {

    @Test
    fun create() {
        AccountPlanListParams.builder()
            .orgId("orgId")
            .account("account")
            .contract("contract")
            .date("date")
            .addId("string")
            .includeall(true)
            .nextToken("nextToken")
            .pageSize(1L)
            .plan("plan")
            .product("product")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AccountPlanListParams.builder()
                .orgId("orgId")
                .account("account")
                .contract("contract")
                .date("date")
                .addId("string")
                .includeall(true)
                .nextToken("nextToken")
                .pageSize(1L)
                .plan("plan")
                .product("product")
                .build()
        val expected = QueryParams.builder()
        expected.put("account", "account")
        expected.put("contract", "contract")
        expected.put("date", "date")
        expected.put("ids", "string")
        expected.put("includeall", "true")
        expected.put("nextToken", "nextToken")
        expected.put("pageSize", "1")
        expected.put("plan", "plan")
        expected.put("product", "product")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AccountPlanListParams.builder().orgId("orgId").build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params = AccountPlanListParams.builder().orgId("orgId").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
