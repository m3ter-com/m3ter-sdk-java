// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreditLineItemTest {

    @Test
    fun createCreditLineItem() {
        val creditLineItem =
            CreditLineItem.builder()
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
                .creditReasonId("creditReasonId")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .build()
        assertThat(creditLineItem).isNotNull
        assertThat(creditLineItem.id()).isEqualTo("id")
        assertThat(creditLineItem.amount()).isEqualTo(0.0)
        assertThat(creditLineItem.description()).isEqualTo("description")
        assertThat(creditLineItem.productId()).isEqualTo("productId")
        assertThat(creditLineItem.referencedBillId()).isEqualTo("referencedBillId")
        assertThat(creditLineItem.referencedLineItemId()).isEqualTo("referencedLineItemId")
        assertThat(creditLineItem.servicePeriodEndDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditLineItem.servicePeriodStartDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditLineItem.version()).isEqualTo(0L)
        assertThat(creditLineItem.createdBy()).contains("createdBy")
        assertThat(creditLineItem.creditReasonId()).contains("creditReasonId")
        assertThat(creditLineItem.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditLineItem.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditLineItem.lastModifiedBy()).contains("lastModifiedBy")
    }
}
