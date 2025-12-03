// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DebitLineItemResponseTest {

    @Test
    fun create() {
        val debitLineItemResponse =
            DebitLineItemResponse.builder()
                .id("id")
                .amount(0.0)
                .createdBy("createdBy")
                .debitReasonId("debitReasonId")
                .description("description")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .lineItemType(DebitLineItemResponse.LineItemType.STANDING_CHARGE)
                .productId("productId")
                .referencedBillId("referencedBillId")
                .referencedLineItemId("referencedLineItemId")
                .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version(0L)
                .build()

        assertThat(debitLineItemResponse.id()).isEqualTo("id")
        assertThat(debitLineItemResponse.amount()).contains(0.0)
        assertThat(debitLineItemResponse.createdBy()).contains("createdBy")
        assertThat(debitLineItemResponse.debitReasonId()).contains("debitReasonId")
        assertThat(debitLineItemResponse.description()).contains("description")
        assertThat(debitLineItemResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(debitLineItemResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(debitLineItemResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(debitLineItemResponse.lineItemType())
            .contains(DebitLineItemResponse.LineItemType.STANDING_CHARGE)
        assertThat(debitLineItemResponse.productId()).contains("productId")
        assertThat(debitLineItemResponse.referencedBillId()).contains("referencedBillId")
        assertThat(debitLineItemResponse.referencedLineItemId()).contains("referencedLineItemId")
        assertThat(debitLineItemResponse.servicePeriodEndDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(debitLineItemResponse.servicePeriodStartDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(debitLineItemResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val debitLineItemResponse =
            DebitLineItemResponse.builder()
                .id("id")
                .amount(0.0)
                .createdBy("createdBy")
                .debitReasonId("debitReasonId")
                .description("description")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .lineItemType(DebitLineItemResponse.LineItemType.STANDING_CHARGE)
                .productId("productId")
                .referencedBillId("referencedBillId")
                .referencedLineItemId("referencedLineItemId")
                .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version(0L)
                .build()

        val roundtrippedDebitLineItemResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(debitLineItemResponse),
                jacksonTypeRef<DebitLineItemResponse>(),
            )

        assertThat(roundtrippedDebitLineItemResponse).isEqualTo(debitLineItemResponse)
    }
}
