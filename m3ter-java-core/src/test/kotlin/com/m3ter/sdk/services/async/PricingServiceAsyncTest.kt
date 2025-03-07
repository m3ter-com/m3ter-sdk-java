// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.models.PricingBand
import com.m3ter.sdk.models.PricingCreateParams
import com.m3ter.sdk.models.PricingDeleteParams
import com.m3ter.sdk.models.PricingListParams
import com.m3ter.sdk.models.PricingRetrieveParams
import com.m3ter.sdk.models.PricingUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PricingServiceAsyncTest {

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
        val pricingServiceAsync = client.pricings()

        val pricingResponseFuture =
            pricingServiceAsync.create(
                PricingCreateParams.builder()
                    .orgId("orgId")
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
                        PricingCreateParams.Segment.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .tiersSpanPlan(true)
                    .type(PricingCreateParams.Type.DEBIT)
                    .version(0L)
                    .build()
            )

        val pricingResponse = pricingResponseFuture.get()
        pricingResponse.validate()
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
        val pricingServiceAsync = client.pricings()

        val pricingResponseFuture =
            pricingServiceAsync.retrieve(
                PricingRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val pricingResponse = pricingResponseFuture.get()
        pricingResponse.validate()
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
        val pricingServiceAsync = client.pricings()

        val pricingResponseFuture =
            pricingServiceAsync.update(
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
            )

        val pricingResponse = pricingResponseFuture.get()
        pricingResponse.validate()
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
        val pricingServiceAsync = client.pricings()

        val pageFuture =
            pricingServiceAsync.list(PricingListParams.builder().orgId("orgId").build())

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
        val pricingServiceAsync = client.pricings()

        val pricingResponseFuture =
            pricingServiceAsync.delete(
                PricingDeleteParams.builder().orgId("orgId").id("id").build()
            )

        val pricingResponse = pricingResponseFuture.get()
        pricingResponse.validate()
    }
}
