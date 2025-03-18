// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceTransactionListParamsTest {

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
    fun pathParams() {
        val params =
            BalanceTransactionListParams.builder().orgId("orgId").balanceId("balanceId").build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        assertThat(params._pathParam(1)).isEqualTo("balanceId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("nextToken", "nextToken")
                    .put("pageSize", "1")
                    .put("transactionTypeId", "transactionTypeId")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            BalanceTransactionListParams.builder().orgId("orgId").balanceId("balanceId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
