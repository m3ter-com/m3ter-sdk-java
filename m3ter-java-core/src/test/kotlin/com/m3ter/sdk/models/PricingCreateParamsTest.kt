// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PricingCreateParamsTest {

    @Test
    fun create() {
        PricingCreateParams.builder()
            .orgId("orgId")
            .addPricingBand(
                PricingCreateParams.PricingBand.builder()
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
                PricingCreateParams.OveragePricingBand.builder()
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
                PricingCreateParams.Segment.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .tiersSpanPlan(true)
            .type(PricingCreateParams.Type.DEBIT)
            .version(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            PricingCreateParams.builder()
                .orgId("orgId")
                .addPricingBand(
                    PricingCreateParams.PricingBand.builder()
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
                    PricingCreateParams.OveragePricingBand.builder()
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
                    PricingCreateParams.Segment.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .tiersSpanPlan(true)
                .type(PricingCreateParams.Type.DEBIT)
                .version(0L)
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.pricingBands())
            .isEqualTo(
                listOf(
                    PricingCreateParams.PricingBand.builder()
                        .fixedPrice(0.0)
                        .lowerLimit(0.0)
                        .unitPrice(0.0)
                        .id("id")
                        .creditTypeId("creditTypeId")
                        .build()
                )
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
        assertThat(body.overagePricingBands())
            .contains(
                listOf(
                    PricingCreateParams.OveragePricingBand.builder()
                        .fixedPrice(0.0)
                        .lowerLimit(0.0)
                        .unitPrice(0.0)
                        .id("id")
                        .creditTypeId("creditTypeId")
                        .build()
                )
            )
        assertThat(body.planId()).contains("planId")
        assertThat(body.planTemplateId()).contains("planTemplateId")
        assertThat(body.segment())
            .contains(
                PricingCreateParams.Segment.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.tiersSpanPlan()).contains(true)
        assertThat(body.type()).contains(PricingCreateParams.Type.DEBIT)
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PricingCreateParams.builder()
                .orgId("orgId")
                .addPricingBand(
                    PricingCreateParams.PricingBand.builder()
                        .fixedPrice(0.0)
                        .lowerLimit(0.0)
                        .unitPrice(0.0)
                        .build()
                )
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.pricingBands())
            .isEqualTo(
                listOf(
                    PricingCreateParams.PricingBand.builder()
                        .fixedPrice(0.0)
                        .lowerLimit(0.0)
                        .unitPrice(0.0)
                        .build()
                )
            )
        assertThat(body.startDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun getPathParam() {
        val params =
            PricingCreateParams.builder()
                .orgId("orgId")
                .addPricingBand(
                    PricingCreateParams.PricingBand.builder()
                        .fixedPrice(0.0)
                        .lowerLimit(0.0)
                        .unitPrice(0.0)
                        .build()
                )
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
