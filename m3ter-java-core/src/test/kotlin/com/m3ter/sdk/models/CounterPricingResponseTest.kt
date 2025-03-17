// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CounterPricingResponseTest {

    @Test
    fun createCounterPricingResponse() {
        val counterPricingResponse =
            CounterPricingResponse.builder()
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
                    PricingBand.builder()
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
        assertThat(counterPricingResponse).isNotNull
        assertThat(counterPricingResponse.id()).isEqualTo("id")
        assertThat(counterPricingResponse.version()).isEqualTo(0L)
        assertThat(counterPricingResponse.accountingProductId()).contains("accountingProductId")
        assertThat(counterPricingResponse.code()).contains("code")
        assertThat(counterPricingResponse.counterId()).contains("counterId")
        assertThat(counterPricingResponse.createdBy()).contains("createdBy")
        assertThat(counterPricingResponse.cumulative()).contains(true)
        assertThat(counterPricingResponse.description()).contains("description")
        assertThat(counterPricingResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(counterPricingResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(counterPricingResponse.endDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(counterPricingResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(counterPricingResponse.planId()).contains("planId")
        assertThat(counterPricingResponse.planTemplateId()).contains("planTemplateId")
        assertThat(counterPricingResponse.pricingBands().get())
            .containsExactly(
                PricingBand.builder()
                    .fixedPrice(0.0)
                    .lowerLimit(0.0)
                    .unitPrice(0.0)
                    .id("id")
                    .creditTypeId("creditTypeId")
                    .build()
            )
        assertThat(counterPricingResponse.proRateAdjustmentCredit()).contains(true)
        assertThat(counterPricingResponse.proRateAdjustmentDebit()).contains(true)
        assertThat(counterPricingResponse.proRateRunningTotal()).contains(true)
        assertThat(counterPricingResponse.runningTotalBillInAdvance()).contains(true)
        assertThat(counterPricingResponse.startDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
