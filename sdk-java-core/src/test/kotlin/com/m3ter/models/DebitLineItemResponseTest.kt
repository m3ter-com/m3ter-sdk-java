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

        assertThat(debitLineItemResponse.id()).isEqualTo("id")
        assertThat(debitLineItemResponse.amount()).isEqualTo(0.0)
        assertThat(debitLineItemResponse.description()).isEqualTo("description")
        assertThat(debitLineItemResponse.productId()).isEqualTo("productId")
        assertThat(debitLineItemResponse.referencedBillId()).isEqualTo("referencedBillId")
        assertThat(debitLineItemResponse.referencedLineItemId()).isEqualTo("referencedLineItemId")
        assertThat(debitLineItemResponse.servicePeriodEndDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(debitLineItemResponse.servicePeriodStartDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(debitLineItemResponse.version()).isEqualTo(0L)
        assertThat(debitLineItemResponse.createdBy()).contains("createdBy")
        assertThat(debitLineItemResponse.debitReasonId()).contains("debitReasonId")
        assertThat(debitLineItemResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(debitLineItemResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(debitLineItemResponse.lastModifiedBy()).contains("lastModifiedBy")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val debitLineItemResponse =
            DebitLineItemResponse.builder()
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

        val roundtrippedDebitLineItemResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(debitLineItemResponse),
                jacksonTypeRef<DebitLineItemResponse>(),
            )

        assertThat(roundtrippedDebitLineItemResponse).isEqualTo(debitLineItemResponse)
    }
}
