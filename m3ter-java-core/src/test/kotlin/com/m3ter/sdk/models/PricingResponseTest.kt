// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PricingResponseTest {

    @Test
    fun createPricingResponse() {
        val pricingResponse =
            PricingResponse.builder()
                .id("id")
                .version(0L)
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
                .build()
        assertThat(pricingResponse).isNotNull
        assertThat(pricingResponse.id()).isEqualTo("id")
        assertThat(pricingResponse.version()).isEqualTo(0L)
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
        assertThat(pricingResponse.overagePricingBands().get())
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
        assertThat(pricingResponse.pricingBands().get())
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
    }
}
