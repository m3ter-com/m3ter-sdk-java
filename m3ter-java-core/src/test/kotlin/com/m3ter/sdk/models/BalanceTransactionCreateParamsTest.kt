// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BalanceTransactionCreateParamsTest {

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

        assertThat(body).isNotNull
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

        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(0.0)
    }

    @Test
    fun getPathParam() {
        val params =
            BalanceTransactionCreateParams.builder()
                .orgId("orgId")
                .balanceId("balanceId")
                .amount(0.0)
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "balanceId"
        assertThat(params.getPathParam(1)).isEqualTo("balanceId")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
