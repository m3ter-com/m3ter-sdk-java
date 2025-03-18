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
    fun pathParams() {
        val params = AccountPlanListParams.builder().orgId("orgId").build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account", "account")
                    .put("contract", "contract")
                    .put("date", "date")
                    .put("ids", listOf("string").joinToString(","))
                    .put("includeall", "true")
                    .put("nextToken", "nextToken")
                    .put("pageSize", "1")
                    .put("plan", "plan")
                    .put("product", "product")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AccountPlanListParams.builder().orgId("orgId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
