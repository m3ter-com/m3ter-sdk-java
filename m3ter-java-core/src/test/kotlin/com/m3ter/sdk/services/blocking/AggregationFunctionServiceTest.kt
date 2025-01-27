// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.models.AggregationCreateParams
import com.m3ter.sdk.models.AggregationListParams
import com.m3ter.sdk.models.AggregationRetrieveParams
import com.m3ter.sdk.models.AggregationUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AggregationFunctionServiceTest {

    @Test
    fun callCreate() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .build()
        val aggregationService = client.aggregations()
        val aggregation =
            aggregationService.create(
                AggregationCreateParams.builder()
                    .orgId("orgId")
                    .aggregation(AggregationCreateParams.Aggregation.SUM)
                    .meterId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .name("x")
                    .quantityPerUnit(1.0)
                    .rounding(AggregationCreateParams.Rounding.UP)
                    .targetField("x")
                    .unit("x")
                    .code("x")
                    .customFields(
                        AggregationCreateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
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
        println(aggregation)
        aggregation.validate()
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
        val aggregationService = client.aggregations()
        val aggregation =
            aggregationService.retrieve(
                AggregationRetrieveParams.builder().orgId("orgId").id("id").build()
            )
        println(aggregation)
        aggregation.validate()
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
        val aggregationService = client.aggregations()
        val aggregation =
            aggregationService.update(
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
                    .code("x")
                    .customFields(
                        AggregationUpdateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
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
        println(aggregation)
        aggregation.validate()
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
        val aggregationService = client.aggregations()
        val paginatedAggregationResponse =
            aggregationService.list(AggregationListParams.builder().orgId("orgId").build())
        println(paginatedAggregationResponse)
        paginatedAggregationResponse.data().forEach { it.validate() }
    }
}
