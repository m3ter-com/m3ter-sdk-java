// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillCreditLineItemListPageResponseTest {

    @Test
    fun create() {
        val billCreditLineItemListPageResponse =
            BillCreditLineItemListPageResponse.builder()
                .addData(
                    CreditLineItemResponse.builder()
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
                )
                .nextToken("nextToken")
                .build()

        assertThat(billCreditLineItemListPageResponse.data().getOrNull())
            .containsExactly(
                CreditLineItemResponse.builder()
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
            )
        assertThat(billCreditLineItemListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val billCreditLineItemListPageResponse =
            BillCreditLineItemListPageResponse.builder()
                .addData(
                    CreditLineItemResponse.builder()
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
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedBillCreditLineItemListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billCreditLineItemListPageResponse),
                jacksonTypeRef<BillCreditLineItemListPageResponse>(),
            )

        assertThat(roundtrippedBillCreditLineItemListPageResponse)
            .isEqualTo(billCreditLineItemListPageResponse)
    }
}
