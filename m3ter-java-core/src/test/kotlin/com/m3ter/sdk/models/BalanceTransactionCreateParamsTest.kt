// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceTransactionCreateParamsTest {

    @Test
    fun create() {
        BalanceTransactionCreateParams.builder()
            .orgId("orgId")
            .balanceId("balanceId")
            .amount(0.0)
            .appliedDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .currencyPaid("currencyPaid")
            .description("description")
            .paid(0.0)
            .transactionDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .transactionTypeId("transactionTypeId")
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BalanceTransactionCreateParams.builder()
                .orgId("orgId")
                .balanceId("balanceId")
                .amount(0.0)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        assertThat(params._pathParam(1)).isEqualTo("balanceId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BalanceTransactionCreateParams.builder()
                .orgId("orgId")
                .balanceId("balanceId")
                .amount(0.0)
                .appliedDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currencyPaid("currencyPaid")
                .description("description")
                .paid(0.0)
                .transactionDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .transactionTypeId("transactionTypeId")
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(0.0)
        assertThat(body.appliedDate()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.currencyPaid()).contains("currencyPaid")
        assertThat(body.description()).contains("description")
        assertThat(body.paid()).contains(0.0)
        assertThat(body.transactionDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.transactionTypeId()).contains("transactionTypeId")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BalanceTransactionCreateParams.builder()
                .orgId("orgId")
                .balanceId("balanceId")
                .amount(0.0)
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(0.0)
    }
}
