// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceTransactionSummaryParamsTest {

    @Test
    fun create() {
        BalanceTransactionSummaryParams.builder().orgId("orgId").balanceId("balanceId").build()
    }

    @Test
    fun pathParams() {
        val params =
            BalanceTransactionSummaryParams.builder().orgId("orgId").balanceId("balanceId").build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        assertThat(params._pathParam(1)).isEqualTo("balanceId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
