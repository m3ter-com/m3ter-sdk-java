// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.balances

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.models.BalanceTransactionCreateParams
import com.m3ter.models.BalanceTransactionSummaryParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TransactionServiceTest {

    @Test
    fun create() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val transactionService = client.balances().transactions()

        val transactionResponse =
            transactionService.create(
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

        transactionResponse.validate()
    }

    @Test
    fun list() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val transactionService = client.balances().transactions()

        val page = transactionService.list("balanceId")

        page.response().validate()
    }

    @Test
    fun summary() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val transactionService = client.balances().transactions()

        val response =
            transactionService.summary(
                BalanceTransactionSummaryParams.builder()
                    .orgId("orgId")
                    .balanceId("balanceId")
                    .build()
            )

        response.validate()
    }
}
