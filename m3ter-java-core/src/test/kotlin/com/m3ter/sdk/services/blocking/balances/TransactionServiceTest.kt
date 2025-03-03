// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking.balances

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.models.BalanceTransactionCreateParams
import com.m3ter.sdk.models.BalanceTransactionListParams
import com.m3ter.sdk.models.BalanceTransactionSummaryParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TransactionServiceTest {

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

        val transaction =
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

        transaction.validate()
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

        val page =
            transactionService.list(
                BalanceTransactionListParams.builder().orgId("orgId").balanceId("balanceId").build()
            )

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
