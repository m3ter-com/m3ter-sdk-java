// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CounterPricingListPageResponseTest {

    @Test
    fun create() {
        val counterPricingListPageResponse =
            CounterPricingListPageResponse.builder()
                .addData(
                    CounterPricingResponse.builder()
                        .id("id")
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
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        assertThat(counterPricingListPageResponse.data().getOrNull())
            .containsExactly(
                CounterPricingResponse.builder()
                    .id("id")
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
                    .version(0L)
                    .build()
            )
        assertThat(counterPricingListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val counterPricingListPageResponse =
            CounterPricingListPageResponse.builder()
                .addData(
                    CounterPricingResponse.builder()
                        .id("id")
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
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedCounterPricingListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(counterPricingListPageResponse),
                jacksonTypeRef<CounterPricingListPageResponse>(),
            )

        assertThat(roundtrippedCounterPricingListPageResponse)
            .isEqualTo(counterPricingListPageResponse)
    }
}
