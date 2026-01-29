// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditLineItemResponseTest {

    @Test
    fun create() {
        val creditLineItemResponse =
            CreditLineItemResponse.builder()
                .id("id")
                .amount(0.0)
                .createdBy("createdBy")
                .creditReasonId("creditReasonId")
                .description("description")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .lineItemType(CreditLineItemResponse.LineItemType.STANDING_CHARGE)
                .productId("productId")
                .referencedBillId("referencedBillId")
                .referencedLineItemId("referencedLineItemId")
                .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version(0L)
                .build()

        assertThat(creditLineItemResponse.id()).isEqualTo("id")
        assertThat(creditLineItemResponse.amount()).contains(0.0)
        assertThat(creditLineItemResponse.createdBy()).contains("createdBy")
        assertThat(creditLineItemResponse.creditReasonId()).contains("creditReasonId")
        assertThat(creditLineItemResponse.description()).contains("description")
        assertThat(creditLineItemResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditLineItemResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditLineItemResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(creditLineItemResponse.lineItemType())
            .contains(CreditLineItemResponse.LineItemType.STANDING_CHARGE)
        assertThat(creditLineItemResponse.productId()).contains("productId")
        assertThat(creditLineItemResponse.referencedBillId()).contains("referencedBillId")
        assertThat(creditLineItemResponse.referencedLineItemId()).contains("referencedLineItemId")
        assertThat(creditLineItemResponse.servicePeriodEndDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditLineItemResponse.servicePeriodStartDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditLineItemResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditLineItemResponse =
            CreditLineItemResponse.builder()
                .id("id")
                .amount(0.0)
                .createdBy("createdBy")
                .creditReasonId("creditReasonId")
                .description("description")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .lineItemType(CreditLineItemResponse.LineItemType.STANDING_CHARGE)
                .productId("productId")
                .referencedBillId("referencedBillId")
                .referencedLineItemId("referencedLineItemId")
                .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version(0L)
                .build()

        val roundtrippedCreditLineItemResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditLineItemResponse),
                jacksonTypeRef<CreditLineItemResponse>(),
            )

        assertThat(roundtrippedCreditLineItemResponse).isEqualTo(creditLineItemResponse)
    }
}
