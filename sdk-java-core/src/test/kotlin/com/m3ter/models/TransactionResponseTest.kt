// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionResponseTest {

    @Test
    fun create() {
        val transactionResponse =
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

        assertThat(transactionResponse.id()).isEqualTo("id")
        assertThat(transactionResponse.version()).isEqualTo(0L)
        assertThat(transactionResponse.amount()).contains(0.0)
        assertThat(transactionResponse.appliedDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transactionResponse.createdBy()).contains("createdBy")
        assertThat(transactionResponse.currencyPaid()).contains("currencyPaid")
        assertThat(transactionResponse.description()).contains("description")
        assertThat(transactionResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transactionResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transactionResponse.entityId()).contains("entityId")
        assertThat(transactionResponse.entityType()).contains(TransactionResponse.EntityType.BILL)
        assertThat(transactionResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(transactionResponse.paid()).contains(0.0)
        assertThat(transactionResponse.transactionDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transactionResponse.transactionTypeId()).contains("transactionTypeId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionResponse =
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

        val roundtrippedTransactionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionResponse),
                jacksonTypeRef<TransactionResponse>(),
            )

        assertThat(roundtrippedTransactionResponse).isEqualTo(transactionResponse)
    }
}
