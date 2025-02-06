// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionTest {

    @Test
    fun createTransaction() {
        val transaction =
            Transaction.builder()
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
                .entityType(Transaction.EntityType.BILL)
                .lastModifiedBy("lastModifiedBy")
                .paid(0.0)
                .transactionDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .transactionTypeId("transactionTypeId")
                .build()
        assertThat(transaction).isNotNull
        assertThat(transaction.id()).isEqualTo("id")
        assertThat(transaction.version()).isEqualTo(0L)
        assertThat(transaction.amount()).contains(0.0)
        assertThat(transaction.appliedDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transaction.createdBy()).contains("createdBy")
        assertThat(transaction.currencyPaid()).contains("currencyPaid")
        assertThat(transaction.description()).contains("description")
        assertThat(transaction.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transaction.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transaction.entityId()).contains("entityId")
        assertThat(transaction.entityType()).contains(Transaction.EntityType.BILL)
        assertThat(transaction.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(transaction.paid()).contains(0.0)
        assertThat(transaction.transactionDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transaction.transactionTypeId()).contains("transactionTypeId")
    }
}
