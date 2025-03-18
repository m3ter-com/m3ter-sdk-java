// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceTransactionSummaryResponseTest {

    @Test
    fun create() {
        val balanceTransactionSummaryResponse =
            BalanceTransactionSummaryResponse.builder()
                .initialCreditAmount(0.0)
                .totalCreditAmount(0.0)
                .totalDebitAmount(0.0)
                .build()

        assertThat(balanceTransactionSummaryResponse.initialCreditAmount()).contains(0.0)
        assertThat(balanceTransactionSummaryResponse.totalCreditAmount()).contains(0.0)
        assertThat(balanceTransactionSummaryResponse.totalDebitAmount()).contains(0.0)
    }
}
