// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceTransactionSummaryParamsTest {

    @Test
    fun create() {
        BalanceTransactionSummaryParams.builder().orgId("orgId").balanceId("balanceId").build()
    }

    @Test
    fun getPathParam() {
        val params =
            BalanceTransactionSummaryParams.builder().orgId("orgId").balanceId("balanceId").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "balanceId"
        assertThat(params.getPathParam(1)).isEqualTo("balanceId")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
