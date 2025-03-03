// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CounterPricingTest {

    @Test
    fun createCounterPricing() {
        val counterPricing =
            CounterPricing.builder()
                .id("id")
                .version(0L)
                .accountingProductId("accountingProductId")
                .code("code")
                .counterId("counterId")
                .createdBy("createdBy")
                .cumulative(true)
                .description("description")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .planId("planId")
                .planTemplateId("planTemplateId")
                .addPricingBand(
                    CounterPricing.PricingBand.builder()
                        .fixedPrice(0.0)
                        .lowerLimit(0.0)
                        .unitPrice(0.0)
                        .id("id")
                        .creditTypeId("creditTypeId")
                        .build()
                )
                .proRateAdjustmentCredit(true)
                .proRateAdjustmentDebit(true)
                .proRateRunningTotal(true)
                .runningTotalBillInAdvance(true)
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(counterPricing).isNotNull
        assertThat(counterPricing.id()).isEqualTo("id")
        assertThat(counterPricing.version()).isEqualTo(0L)
        assertThat(counterPricing.accountingProductId()).contains("accountingProductId")
        assertThat(counterPricing.code()).contains("code")
        assertThat(counterPricing.counterId()).contains("counterId")
        assertThat(counterPricing.createdBy()).contains("createdBy")
        assertThat(counterPricing.cumulative()).contains(true)
        assertThat(counterPricing.description()).contains("description")
        assertThat(counterPricing.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(counterPricing.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(counterPricing.endDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(counterPricing.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(counterPricing.planId()).contains("planId")
        assertThat(counterPricing.planTemplateId()).contains("planTemplateId")
        assertThat(counterPricing.pricingBands().get())
            .containsExactly(
                CounterPricing.PricingBand.builder()
                    .fixedPrice(0.0)
                    .lowerLimit(0.0)
                    .unitPrice(0.0)
                    .id("id")
                    .creditTypeId("creditTypeId")
                    .build()
            )
        assertThat(counterPricing.proRateAdjustmentCredit()).contains(true)
        assertThat(counterPricing.proRateAdjustmentDebit()).contains(true)
        assertThat(counterPricing.proRateRunningTotal()).contains(true)
        assertThat(counterPricing.runningTotalBillInAdvance()).contains(true)
        assertThat(counterPricing.startDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
