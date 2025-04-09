// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceTransactionListPageResponseTest {

    @Test
    fun create() {
        val balanceTransactionListPageResponse =
            BalanceTransactionListPageResponse.builder()
                .addData(
                    TransactionResponse.builder()
                        .id("id")
                        .version(0L)
                        .amount(0.0)
                        .appliedDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdBy("createdBy")
                        .currencyPaid("currencyPaid")
                        .description("description")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .entityId("entityId")
                        .entityType(TransactionResponse.EntityType.BILL)
                        .lastModifiedBy("lastModifiedBy")
                        .paid(0.0)
                        .transactionDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transactionTypeId("transactionTypeId")
                        .build()
                )
                .nextToken("nextToken")
                .build()

        assertThat(balanceTransactionListPageResponse.data().getOrNull())
            .containsExactly(
                TransactionResponse.builder()
                    .id("id")
                    .version(0L)
                    .amount(0.0)
                    .appliedDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdBy("createdBy")
                    .currencyPaid("currencyPaid")
                    .description("description")
                    .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .entityId("entityId")
                    .entityType(TransactionResponse.EntityType.BILL)
                    .lastModifiedBy("lastModifiedBy")
                    .paid(0.0)
                    .transactionDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .transactionTypeId("transactionTypeId")
                    .build()
            )
        assertThat(balanceTransactionListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val balanceTransactionListPageResponse =
            BalanceTransactionListPageResponse.builder()
                .addData(
                    TransactionResponse.builder()
                        .id("id")
                        .version(0L)
                        .amount(0.0)
                        .appliedDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdBy("createdBy")
                        .currencyPaid("currencyPaid")
                        .description("description")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .entityId("entityId")
                        .entityType(TransactionResponse.EntityType.BILL)
                        .lastModifiedBy("lastModifiedBy")
                        .paid(0.0)
                        .transactionDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transactionTypeId("transactionTypeId")
                        .build()
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedBalanceTransactionListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(balanceTransactionListPageResponse),
                jacksonTypeRef<BalanceTransactionListPageResponse>(),
            )

        assertThat(roundtrippedBalanceTransactionListPageResponse)
            .isEqualTo(balanceTransactionListPageResponse)
    }
}
