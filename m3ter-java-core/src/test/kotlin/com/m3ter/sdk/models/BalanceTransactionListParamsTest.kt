// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BalanceTransactionListParamsTest {

    @Test
    fun create() {
        BalanceTransactionListParams.builder()
            .orgId("orgId")
            .balanceId("balanceId")
            .nextToken("nextToken")
            .pageSize(1L)
            .transactionTypeId("transactionTypeId")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BalanceTransactionListParams.builder()
                .orgId("orgId")
                .balanceId("balanceId")
                .nextToken("nextToken")
                .pageSize(1L)
                .transactionTypeId("transactionTypeId")
                .build()
        val expected = QueryParams.builder()
        expected.put("nextToken", "nextToken")
        expected.put("pageSize", "1")
        expected.put("transactionTypeId", "transactionTypeId")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            BalanceTransactionListParams.builder().orgId("orgId").balanceId("balanceId").build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            BalanceTransactionListParams.builder().orgId("orgId").balanceId("balanceId").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "balanceId"
        assertThat(params.getPathParam(1)).isEqualTo("balanceId")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
