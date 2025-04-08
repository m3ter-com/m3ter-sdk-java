// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.balances

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.models.BalanceTransactionCreateParams
import com.m3ter.models.BalanceTransactionListParams
import com.m3ter.models.BalanceTransactionSummaryParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TransactionServiceAsyncTest {

    @Test
    fun create() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val transactionServiceAsync = client.balances().transactions()

        val transactionResponseFuture =
            transactionServiceAsync.create(
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
            )

        val transactionResponse = transactionResponseFuture.get()
        transactionResponse.validate()
    }

    @Test
    fun list() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val transactionServiceAsync = client.balances().transactions()

        val pageFuture =
            transactionServiceAsync.list(
                BalanceTransactionListParams.builder().orgId("orgId").balanceId("balanceId").build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun summary() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val transactionServiceAsync = client.balances().transactions()

        val responseFuture =
            transactionServiceAsync.summary(
                BalanceTransactionSummaryParams.builder()
                    .orgId("orgId")
                    .balanceId("balanceId")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
