// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.models.CounterPricingCreateParams
import com.m3ter.sdk.models.CounterPricingDeleteParams
import com.m3ter.sdk.models.CounterPricingListParams
import com.m3ter.sdk.models.CounterPricingRetrieveParams
import com.m3ter.sdk.models.CounterPricingUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CounterPricingServiceTest {

    @Test
    fun callCreate() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .build()
        val counterPricingService = client.counterPricings()
        val counterPricing =
            counterPricingService.create(
                CounterPricingCreateParams.builder()
                    .orgId("orgId")
                    .counterId("x")
                    .addPricingBand(
                        CounterPricingCreateParams.PricingBand.builder()
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
            )
        println(counterPricing)
        counterPricing.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .build()
        val counterPricingService = client.counterPricings()
        val counterPricing =
            counterPricingService.retrieve(
                CounterPricingRetrieveParams.builder().orgId("orgId").id("id").build()
            )
        println(counterPricing)
        counterPricing.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .build()
        val counterPricingService = client.counterPricings()
        val counterPricing =
            counterPricingService.update(
                CounterPricingUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .counterId("x")
                    .addPricingBand(
                        CounterPricingUpdateParams.PricingBand.builder()
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
            )
        println(counterPricing)
        counterPricing.validate()
    }

    @Test
    fun callList() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .build()
        val counterPricingService = client.counterPricings()
        val paginatedDataCounterPricingResponse =
            counterPricingService.list(CounterPricingListParams.builder().orgId("orgId").build())
        println(paginatedDataCounterPricingResponse)
        paginatedDataCounterPricingResponse.data().forEach { it.validate() }
    }

    @Test
    fun callDelete() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .build()
        val counterPricingService = client.counterPricings()
        val counterPricing =
            counterPricingService.delete(
                CounterPricingDeleteParams.builder().orgId("orgId").id("id").build()
            )
        println(counterPricing)
        counterPricing.validate()
    }
}
