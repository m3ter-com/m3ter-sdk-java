// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PricingResponseTest {

    @Test
    fun create() {
        val pricingResponse =
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

        assertThat(pricingResponse.id()).isEqualTo("id")
        assertThat(pricingResponse.accountingProductId()).contains("accountingProductId")
        assertThat(pricingResponse.aggregationId()).contains("aggregationId")
        assertThat(pricingResponse.aggregationType())
            .contains(PricingResponse.AggregationType.SIMPLE)
        assertThat(pricingResponse.code()).contains("code")
        assertThat(pricingResponse.compoundAggregationId()).contains("compoundAggregationId")
        assertThat(pricingResponse.createdBy()).contains("createdBy")
        assertThat(pricingResponse.cumulative()).contains(true)
        assertThat(pricingResponse.description()).contains("description")
        assertThat(pricingResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pricingResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pricingResponse.endDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pricingResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(pricingResponse.minimumSpend()).contains(0.0)
        assertThat(pricingResponse.minimumSpendBillInAdvance()).contains(true)
        assertThat(pricingResponse.minimumSpendDescription()).contains("minimumSpendDescription")
        assertThat(pricingResponse.overagePricingBands().getOrNull())
            .containsExactly(
                PricingBand.builder()
                    .fixedPrice(0.0)
                    .lowerLimit(0.0)
                    .unitPrice(0.0)
                    .id("id")
                    .creditTypeId("creditTypeId")
                    .build()
            )
        assertThat(pricingResponse.planId()).contains("planId")
        assertThat(pricingResponse.planTemplateId()).contains("planTemplateId")
        assertThat(pricingResponse.pricingBands().getOrNull())
            .containsExactly(
                PricingBand.builder()
                    .fixedPrice(0.0)
                    .lowerLimit(0.0)
                    .unitPrice(0.0)
                    .id("id")
                    .creditTypeId("creditTypeId")
                    .build()
            )
        assertThat(pricingResponse.segment())
            .contains(
                PricingResponse.Segment.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(pricingResponse.segmentString()).contains("segmentString")
        assertThat(pricingResponse.startDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pricingResponse.tiersSpanPlan()).contains(true)
        assertThat(pricingResponse.type()).contains(PricingResponse.Type.DEBIT)
        assertThat(pricingResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pricingResponse =
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

        val roundtrippedPricingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pricingResponse),
                jacksonTypeRef<PricingResponse>(),
            )

        assertThat(roundtrippedPricingResponse).isEqualTo(pricingResponse)
    }
}
