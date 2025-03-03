// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.sdk.models.CounterPricingCreateParams
import com.m3ter.sdk.models.CounterPricingDeleteParams
import com.m3ter.sdk.models.CounterPricingListParams
import com.m3ter.sdk.models.CounterPricingRetrieveParams
import com.m3ter.sdk.models.CounterPricingUpdateParams
import com.m3ter.sdk.models.PricingBand
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CounterPricingServiceAsyncTest {

    @Test
    fun create() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val counterPricingServiceAsync = client.counterPricings()

        val counterPricingFuture =
            counterPricingServiceAsync.create(
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
            )

        val counterPricing = counterPricingFuture.get()
        counterPricing.validate()
    }

    @Test
    fun retrieve() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val counterPricingServiceAsync = client.counterPricings()

        val counterPricingFuture =
            counterPricingServiceAsync.retrieve(
                CounterPricingRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val counterPricing = counterPricingFuture.get()
        counterPricing.validate()
    }

    @Test
    fun update() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val counterPricingServiceAsync = client.counterPricings()

        val counterPricingFuture =
            counterPricingServiceAsync.update(
                CounterPricingUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
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
            )

        val counterPricing = counterPricingFuture.get()
        counterPricing.validate()
    }

    @Test
    fun list() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val counterPricingServiceAsync = client.counterPricings()

        val pageFuture =
            counterPricingServiceAsync.list(
                CounterPricingListParams.builder().orgId("orgId").build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val counterPricingServiceAsync = client.counterPricings()

        val counterPricingFuture =
            counterPricingServiceAsync.delete(
                CounterPricingDeleteParams.builder().orgId("orgId").id("id").build()
            )

        val counterPricing = counterPricingFuture.get()
        counterPricing.validate()
    }
}
