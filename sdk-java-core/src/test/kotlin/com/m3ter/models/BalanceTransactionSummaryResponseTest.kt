// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceTransactionSummaryResponseTest {

    @Test
    fun create() {
        val balanceTransactionSummaryResponse =
            BalanceTransactionSummaryResponse.builder()
                .balanceConsumed(100.0)
                .expiredBalanceAmount(50.0)
                .initialCreditAmount(300.0)
                .rolloverConsumed(75.0)
                .totalCreditAmount(250.0)
                .totalDebitAmount(125.5)
                .build()

        assertThat(balanceTransactionSummaryResponse.balanceConsumed()).contains(100.0)
        assertThat(balanceTransactionSummaryResponse.expiredBalanceAmount()).contains(50.0)
        assertThat(balanceTransactionSummaryResponse.initialCreditAmount()).contains(300.0)
        assertThat(balanceTransactionSummaryResponse.rolloverConsumed()).contains(75.0)
        assertThat(balanceTransactionSummaryResponse.totalCreditAmount()).contains(250.0)
        assertThat(balanceTransactionSummaryResponse.totalDebitAmount()).contains(125.5)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val balanceTransactionSummaryResponse =
            BalanceTransactionSummaryResponse.builder()
                .balanceConsumed(100.0)
                .expiredBalanceAmount(50.0)
                .initialCreditAmount(300.0)
                .rolloverConsumed(75.0)
                .totalCreditAmount(250.0)
                .totalDebitAmount(125.5)
                .build()

        val roundtrippedBalanceTransactionSummaryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(balanceTransactionSummaryResponse),
                jacksonTypeRef<BalanceTransactionSummaryResponse>(),
            )

        assertThat(roundtrippedBalanceTransactionSummaryResponse)
            .isEqualTo(balanceTransactionSummaryResponse)
    }
}
