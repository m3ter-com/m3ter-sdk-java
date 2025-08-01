// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PricingListPageResponseTest {

    @Test
    fun create() {
        val pricingListPageResponse =
            PricingListPageResponse.builder()
                .addData(
                    PricingResponse.builder()
                        .id("id")
                        .accountingProductId("accountingProductId")
                        .aggregationId("aggregationId")
                        .aggregationType(PricingResponse.AggregationType.SIMPLE)
                        .code("code")
                        .compoundAggregationId("compoundAggregationId")
                        .createdBy("createdBy")
                        .cumulative(true)
                        .description("description")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastModifiedBy("lastModifiedBy")
                        .minimumSpend(0.0)
                        .minimumSpendBillInAdvance(true)
                        .minimumSpendDescription("minimumSpendDescription")
                        .addOveragePricingBand(
                            PricingBand.builder()
                                .fixedPrice(0.0)
                                .lowerLimit(0.0)
                                .unitPrice(0.0)
                                .id("id")
                                .creditTypeId("creditTypeId")
                                .build()
                        )
                        .planId("planId")
                        .planTemplateId("planTemplateId")
                        .addPricingBand(
                            PricingBand.builder()
                                .fixedPrice(0.0)
                                .lowerLimit(0.0)
                                .unitPrice(0.0)
                                .id("id")
                                .creditTypeId("creditTypeId")
                                .build()
                        )
                        .segment(
                            PricingResponse.Segment.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .segmentString("segmentString")
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .tiersSpanPlan(true)
                        .type(PricingResponse.Type.DEBIT)
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        assertThat(pricingListPageResponse.data().getOrNull())
            .containsExactly(
                PricingResponse.builder()
                    .id("id")
                    .accountingProductId("accountingProductId")
                    .aggregationId("aggregationId")
                    .aggregationType(PricingResponse.AggregationType.SIMPLE)
                    .code("code")
                    .compoundAggregationId("compoundAggregationId")
                    .createdBy("createdBy")
                    .cumulative(true)
                    .description("description")
                    .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastModifiedBy("lastModifiedBy")
                    .minimumSpend(0.0)
                    .minimumSpendBillInAdvance(true)
                    .minimumSpendDescription("minimumSpendDescription")
                    .addOveragePricingBand(
                        PricingBand.builder()
                            .fixedPrice(0.0)
                            .lowerLimit(0.0)
                            .unitPrice(0.0)
                            .id("id")
                            .creditTypeId("creditTypeId")
                            .build()
                    )
                    .planId("planId")
                    .planTemplateId("planTemplateId")
                    .addPricingBand(
                        PricingBand.builder()
                            .fixedPrice(0.0)
                            .lowerLimit(0.0)
                            .unitPrice(0.0)
                            .id("id")
                            .creditTypeId("creditTypeId")
                            .build()
                    )
                    .segment(
                        PricingResponse.Segment.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .segmentString("segmentString")
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .tiersSpanPlan(true)
                    .type(PricingResponse.Type.DEBIT)
                    .version(0L)
                    .build()
            )
        assertThat(pricingListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pricingListPageResponse =
            PricingListPageResponse.builder()
                .addData(
                    PricingResponse.builder()
                        .id("id")
                        .accountingProductId("accountingProductId")
                        .aggregationId("aggregationId")
                        .aggregationType(PricingResponse.AggregationType.SIMPLE)
                        .code("code")
                        .compoundAggregationId("compoundAggregationId")
                        .createdBy("createdBy")
                        .cumulative(true)
                        .description("description")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastModifiedBy("lastModifiedBy")
                        .minimumSpend(0.0)
                        .minimumSpendBillInAdvance(true)
                        .minimumSpendDescription("minimumSpendDescription")
                        .addOveragePricingBand(
                            PricingBand.builder()
                                .fixedPrice(0.0)
                                .lowerLimit(0.0)
                                .unitPrice(0.0)
                                .id("id")
                                .creditTypeId("creditTypeId")
                                .build()
                        )
                        .planId("planId")
                        .planTemplateId("planTemplateId")
                        .addPricingBand(
                            PricingBand.builder()
                                .fixedPrice(0.0)
                                .lowerLimit(0.0)
                                .unitPrice(0.0)
                                .id("id")
                                .creditTypeId("creditTypeId")
                                .build()
                        )
                        .segment(
                            PricingResponse.Segment.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .segmentString("segmentString")
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .tiersSpanPlan(true)
                        .type(PricingResponse.Type.DEBIT)
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedPricingListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pricingListPageResponse),
                jacksonTypeRef<PricingListPageResponse>(),
            )

        assertThat(roundtrippedPricingListPageResponse).isEqualTo(pricingListPageResponse)
    }
}
