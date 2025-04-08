// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CounterPricingCreateParamsTest {

    @Test
    fun create() {
        CounterPricingCreateParams.builder()
            .orgId("orgId")
            .counterId("x")
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
            .code("JS!?Q0]r] ]\$]")
            .cumulative(true)
            .description("description")
            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .planId("planId")
            .planTemplateId("planTemplateId")
            .proRateAdjustmentCredit(true)
            .proRateAdjustmentDebit(true)
            .proRateRunningTotal(true)
            .runningTotalBillInAdvance(true)
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CounterPricingCreateParams.builder()
                .orgId("orgId")
                .counterId("x")
                .addPricingBand(
                    PricingBand.builder().fixedPrice(0.0).lowerLimit(0.0).unitPrice(0.0).build()
                )
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CounterPricingCreateParams.builder()
                .orgId("orgId")
                .counterId("x")
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
                .code("JS!?Q0]r] ]\$]")
                .cumulative(true)
                .description("description")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .planId("planId")
                .planTemplateId("planTemplateId")
                .proRateAdjustmentCredit(true)
                .proRateAdjustmentDebit(true)
                .proRateRunningTotal(true)
                .runningTotalBillInAdvance(true)
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.counterId()).isEqualTo("x")
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
        assertThat(body.code()).contains("JS!?Q0]r] ]\$]")
        assertThat(body.cumulative()).contains(true)
        assertThat(body.description()).contains("description")
        assertThat(body.endDate()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.planId()).contains("planId")
        assertThat(body.planTemplateId()).contains("planTemplateId")
        assertThat(body.proRateAdjustmentCredit()).contains(true)
        assertThat(body.proRateAdjustmentDebit()).contains(true)
        assertThat(body.proRateRunningTotal()).contains(true)
        assertThat(body.runningTotalBillInAdvance()).contains(true)
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CounterPricingCreateParams.builder()
                .orgId("orgId")
                .counterId("x")
                .addPricingBand(
                    PricingBand.builder().fixedPrice(0.0).lowerLimit(0.0).unitPrice(0.0).build()
                )
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertThat(body.counterId()).isEqualTo("x")
        assertThat(body.pricingBands())
            .containsExactly(
                PricingBand.builder().fixedPrice(0.0).lowerLimit(0.0).unitPrice(0.0).build()
            )
        assertThat(body.startDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
