// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillDebitLineItemListPageResponseTest {

    @Test
    fun create() {
        val billDebitLineItemListPageResponse =
            BillDebitLineItemListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        assertThat(billDebitLineItemListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(billDebitLineItemListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val billDebitLineItemListPageResponse =
            BillDebitLineItemListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedBillDebitLineItemListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billDebitLineItemListPageResponse),
                jacksonTypeRef<BillDebitLineItemListPageResponse>(),
            )

        assertThat(roundtrippedBillDebitLineItemListPageResponse)
            .isEqualTo(billDebitLineItemListPageResponse)
    }
}
