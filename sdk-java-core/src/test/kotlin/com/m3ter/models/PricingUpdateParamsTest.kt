// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.JsonValue
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PricingUpdateParamsTest {

    @Test
    fun create() {
        PricingUpdateParams.builder()
            .orgId("orgId")
            .id("id")
            .addPricingBand(
                PricingBand.builder()
                    .fixedPrice(0.0)
                    .lowerLimit(0.0)
                    .unitPrice(0.0)
                    .id("id")
                    .creditTypeId("creditTypeId")
                    .build()
            )
            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .accountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .aggregationId("aggregationId")
            .code("JS!?Q0]r] ]\$]")
            .compoundAggregationId("compoundAggregationId")
            .cumulative(true)
            .description("description")
            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
            .segment(
                PricingUpdateParams.Segment.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .tiersSpanPlan(true)
            .type(PricingUpdateParams.Type.DEBIT)
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PricingUpdateParams.builder()
                .id("id")
                .addPricingBand(
                    PricingBand.builder().fixedPrice(0.0).lowerLimit(0.0).unitPrice(0.0).build()
                )
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PricingUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .addPricingBand(
                    PricingBand.builder()
                        .fixedPrice(0.0)
                        .lowerLimit(0.0)
                        .unitPrice(0.0)
                        .id("id")
                        .creditTypeId("creditTypeId")
                        .build()
                )
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .accountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .aggregationId("aggregationId")
                .code("JS!?Q0]r] ]\$]")
                .compoundAggregationId("compoundAggregationId")
                .cumulative(true)
                .description("description")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                .segment(
                    PricingUpdateParams.Segment.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .tiersSpanPlan(true)
                .type(PricingUpdateParams.Type.DEBIT)
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.pricingBands())
            .containsExactly(
                PricingBand.builder()
                    .fixedPrice(0.0)
                    .lowerLimit(0.0)
                    .unitPrice(0.0)
                    .id("id")
                    .creditTypeId("creditTypeId")
                    .build()
            )
        assertThat(body.startDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.accountingProductId()).contains("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.aggregationId()).contains("aggregationId")
        assertThat(body.code()).contains("JS!?Q0]r] ]\$]")
        assertThat(body.compoundAggregationId()).contains("compoundAggregationId")
        assertThat(body.cumulative()).contains(true)
        assertThat(body.description()).contains("description")
        assertThat(body.endDate()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.minimumSpend()).contains(0.0)
        assertThat(body.minimumSpendBillInAdvance()).contains(true)
        assertThat(body.minimumSpendDescription()).contains("minimumSpendDescription")
        assertThat(body.overagePricingBands().getOrNull())
            .containsExactly(
                PricingBand.builder()
                    .fixedPrice(0.0)
                    .lowerLimit(0.0)
                    .unitPrice(0.0)
                    .id("id")
                    .creditTypeId("creditTypeId")
                    .build()
            )
        assertThat(body.planId()).contains("planId")
        assertThat(body.planTemplateId()).contains("planTemplateId")
        assertThat(body.segment())
            .contains(
                PricingUpdateParams.Segment.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.tiersSpanPlan()).contains(true)
        assertThat(body.type()).contains(PricingUpdateParams.Type.DEBIT)
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PricingUpdateParams.builder()
                .id("id")
                .addPricingBand(
                    PricingBand.builder().fixedPrice(0.0).lowerLimit(0.0).unitPrice(0.0).build()
                )
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertThat(body.pricingBands())
            .containsExactly(
                PricingBand.builder().fixedPrice(0.0).lowerLimit(0.0).unitPrice(0.0).build()
            )
        assertThat(body.startDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
