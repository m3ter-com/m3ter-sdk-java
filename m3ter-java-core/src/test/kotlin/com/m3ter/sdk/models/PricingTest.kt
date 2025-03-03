// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PricingTest {

    @Test
    fun createPricing() {
        val pricing =
            Pricing.builder()
                .id("id")
                .version(0L)
                .accountingProductId("accountingProductId")
                .aggregationId("aggregationId")
                .aggregationType(Pricing.AggregationType.SIMPLE)
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
                    Pricing.OveragePricingBand.builder()
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
                    Pricing.PricingBand.builder()
                        .fixedPrice(0.0)
                        .lowerLimit(0.0)
                        .unitPrice(0.0)
                        .id("id")
                        .creditTypeId("creditTypeId")
                        .build()
                )
                .segment(
                    Pricing.Segment.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .segmentString("segmentString")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tiersSpanPlan(true)
                .type(Pricing.Type.DEBIT)
                .build()
        assertThat(pricing).isNotNull
        assertThat(pricing.id()).isEqualTo("id")
        assertThat(pricing.version()).isEqualTo(0L)
        assertThat(pricing.accountingProductId()).contains("accountingProductId")
        assertThat(pricing.aggregationId()).contains("aggregationId")
        assertThat(pricing.aggregationType()).contains(Pricing.AggregationType.SIMPLE)
        assertThat(pricing.code()).contains("code")
        assertThat(pricing.compoundAggregationId()).contains("compoundAggregationId")
        assertThat(pricing.createdBy()).contains("createdBy")
        assertThat(pricing.cumulative()).contains(true)
        assertThat(pricing.description()).contains("description")
        assertThat(pricing.dtCreated()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pricing.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pricing.endDate()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pricing.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(pricing.minimumSpend()).contains(0.0)
        assertThat(pricing.minimumSpendBillInAdvance()).contains(true)
        assertThat(pricing.minimumSpendDescription()).contains("minimumSpendDescription")
        assertThat(pricing.overagePricingBands().get())
            .containsExactly(
                Pricing.OveragePricingBand.builder()
                    .fixedPrice(0.0)
                    .lowerLimit(0.0)
                    .unitPrice(0.0)
                    .id("id")
                    .creditTypeId("creditTypeId")
                    .build()
            )
        assertThat(pricing.planId()).contains("planId")
        assertThat(pricing.planTemplateId()).contains("planTemplateId")
        assertThat(pricing.pricingBands().get())
            .containsExactly(
                Pricing.PricingBand.builder()
                    .fixedPrice(0.0)
                    .lowerLimit(0.0)
                    .unitPrice(0.0)
                    .id("id")
                    .creditTypeId("creditTypeId")
                    .build()
            )
        assertThat(pricing.segment())
            .contains(
                Pricing.Segment.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(pricing.segmentString()).contains("segmentString")
        assertThat(pricing.startDate()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pricing.tiersSpanPlan()).contains(true)
        assertThat(pricing.type()).contains(Pricing.Type.DEBIT)
    }
}
