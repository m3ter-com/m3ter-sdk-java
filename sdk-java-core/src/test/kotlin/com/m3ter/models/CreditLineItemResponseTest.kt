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
                .description("description")
                .productId("productId")
                .referencedBillId("referencedBillId")
                .referencedLineItemId("referencedLineItemId")
                .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("createdBy")
                .creditReasonId("creditReasonId")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .version(0L)
                .build()

        assertThat(creditLineItemResponse.id()).isEqualTo("id")
        assertThat(creditLineItemResponse.amount()).isEqualTo(0.0)
        assertThat(creditLineItemResponse.description()).isEqualTo("description")
        assertThat(creditLineItemResponse.productId()).isEqualTo("productId")
        assertThat(creditLineItemResponse.referencedBillId()).isEqualTo("referencedBillId")
        assertThat(creditLineItemResponse.referencedLineItemId()).isEqualTo("referencedLineItemId")
        assertThat(creditLineItemResponse.servicePeriodEndDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditLineItemResponse.servicePeriodStartDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditLineItemResponse.createdBy()).contains("createdBy")
        assertThat(creditLineItemResponse.creditReasonId()).contains("creditReasonId")
        assertThat(creditLineItemResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditLineItemResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditLineItemResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(creditLineItemResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditLineItemResponse =
            CreditLineItemResponse.builder()
                .id("id")
                .amount(0.0)
                .description("description")
                .productId("productId")
                .referencedBillId("referencedBillId")
                .referencedLineItemId("referencedLineItemId")
                .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("createdBy")
                .creditReasonId("creditReasonId")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
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
