// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DebitLineItemTest {

    @Test
    fun createDebitLineItem() {
        val debitLineItem =
            DebitLineItem.builder()
                .id("id")
                .amount(0.0)
                .description("description")
                .productId("productId")
                .referencedBillId("referencedBillId")
                .referencedLineItemId("referencedLineItemId")
                .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version(0L)
                .createdBy("createdBy")
                .debitReasonId("debitReasonId")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .build()
        assertThat(debitLineItem).isNotNull
        assertThat(debitLineItem.id()).isEqualTo("id")
        assertThat(debitLineItem.amount()).isEqualTo(0.0)
        assertThat(debitLineItem.description()).isEqualTo("description")
        assertThat(debitLineItem.productId()).isEqualTo("productId")
        assertThat(debitLineItem.referencedBillId()).isEqualTo("referencedBillId")
        assertThat(debitLineItem.referencedLineItemId()).isEqualTo("referencedLineItemId")
        assertThat(debitLineItem.servicePeriodEndDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(debitLineItem.servicePeriodStartDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(debitLineItem.version()).isEqualTo(0L)
        assertThat(debitLineItem.createdBy()).contains("createdBy")
        assertThat(debitLineItem.debitReasonId()).contains("debitReasonId")
        assertThat(debitLineItem.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(debitLineItem.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(debitLineItem.lastModifiedBy()).contains("lastModifiedBy")
    }
}
