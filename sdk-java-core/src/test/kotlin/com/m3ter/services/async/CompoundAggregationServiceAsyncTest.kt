// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.core.JsonValue
import com.m3ter.models.CompoundAggregationCreateParams
import com.m3ter.models.CompoundAggregationDeleteParams
import com.m3ter.models.CompoundAggregationRetrieveParams
import com.m3ter.models.CompoundAggregationUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CompoundAggregationServiceAsyncTest {

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
        val compoundAggregationServiceAsync = client.compoundAggregations()

        val aggregationResponseFuture =
            compoundAggregationServiceAsync.create(
                CompoundAggregationCreateParams.builder()
                    .orgId("orgId")
                    .calculation("x")
                    .name("x")
                    .quantityPerUnit(1.0)
                    .rounding(CompoundAggregationCreateParams.Rounding.UP)
                    .unit("x")
                    .accountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .code("example_code")
                    .customFields(
                        CompoundAggregationCreateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .evaluateNullAggregations(true)
                    .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .version(0L)
                    .build()
            )

        val aggregationResponse = aggregationResponseFuture.get()
        aggregationResponse.validate()
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
        val compoundAggregationServiceAsync = client.compoundAggregations()

        val compoundAggregationResponseFuture =
            compoundAggregationServiceAsync.retrieve(
                CompoundAggregationRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val compoundAggregationResponse = compoundAggregationResponseFuture.get()
        compoundAggregationResponse.validate()
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
        val compoundAggregationServiceAsync = client.compoundAggregations()

        val aggregationResponseFuture =
            compoundAggregationServiceAsync.update(
                CompoundAggregationUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .calculation("x")
                    .name("x")
                    .quantityPerUnit(1.0)
                    .rounding(CompoundAggregationUpdateParams.Rounding.UP)
                    .unit("x")
                    .accountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .code("example_code")
                    .customFields(
                        CompoundAggregationUpdateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .evaluateNullAggregations(true)
                    .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .version(0L)
                    .build()
            )

        val aggregationResponse = aggregationResponseFuture.get()
        aggregationResponse.validate()
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
        val compoundAggregationServiceAsync = client.compoundAggregations()

        val pageFuture = compoundAggregationServiceAsync.list()

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
        val compoundAggregationServiceAsync = client.compoundAggregations()

        val compoundAggregationResponseFuture =
            compoundAggregationServiceAsync.delete(
                CompoundAggregationDeleteParams.builder().orgId("orgId").id("id").build()
            )

        val compoundAggregationResponse = compoundAggregationResponseFuture.get()
        compoundAggregationResponse.validate()
    }
}
