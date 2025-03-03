// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.models.AggregationCreateParams
import com.m3ter.sdk.models.AggregationDeleteParams
import com.m3ter.sdk.models.AggregationListParams
import com.m3ter.sdk.models.AggregationRetrieveParams
import com.m3ter.sdk.models.AggregationUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AggregationServiceAsyncTest {

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
        val aggregationServiceAsync = client.aggregations()

        val aggregationFuture =
            aggregationServiceAsync.create(
                AggregationCreateParams.builder()
                    .orgId("orgId")
                    .aggregation(AggregationCreateParams.Aggregation.SUM)
                    .meterId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .name("x")
                    .quantityPerUnit(1.0)
                    .rounding(AggregationCreateParams.Rounding.UP)
                    .targetField("x")
                    .unit("x")
                    .accountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .code("example_code")
                    .customFields(
                        AggregationCreateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .customSql("customSql")
                    .defaultValue(0.0)
                    .addSegmentedField("string")
                    .addSegment(
                        AggregationCreateParams.Segment.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .version(0L)
                    .build()
            )

        val aggregation = aggregationFuture.get()
        aggregation.validate()
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
        val aggregationServiceAsync = client.aggregations()

        val aggregationFuture =
            aggregationServiceAsync.retrieve(
                AggregationRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val aggregation = aggregationFuture.get()
        aggregation.validate()
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
        val aggregationServiceAsync = client.aggregations()

        val aggregationFuture =
            aggregationServiceAsync.update(
                AggregationUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .aggregation(AggregationUpdateParams.Aggregation.SUM)
                    .meterId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .name("x")
                    .quantityPerUnit(1.0)
                    .rounding(AggregationUpdateParams.Rounding.UP)
                    .targetField("x")
                    .unit("x")
                    .accountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .code("example_code")
                    .customFields(
                        AggregationUpdateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .customSql("customSql")
                    .defaultValue(0.0)
                    .addSegmentedField("string")
                    .addSegment(
                        AggregationUpdateParams.Segment.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .version(0L)
                    .build()
            )

        val aggregation = aggregationFuture.get()
        aggregation.validate()
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
        val aggregationServiceAsync = client.aggregations()

        val pageFuture =
            aggregationServiceAsync.list(AggregationListParams.builder().orgId("orgId").build())

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
        val aggregationServiceAsync = client.aggregations()

        val aggregationFuture =
            aggregationServiceAsync.delete(
                AggregationDeleteParams.builder().orgId("orgId").id("id").build()
            )

        val aggregation = aggregationFuture.get()
        aggregation.validate()
    }
}
