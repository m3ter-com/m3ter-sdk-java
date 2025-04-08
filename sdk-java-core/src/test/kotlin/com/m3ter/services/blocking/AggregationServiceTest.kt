// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.core.JsonValue
import com.m3ter.models.AggregationCreateParams
import com.m3ter.models.AggregationDeleteParams
import com.m3ter.models.AggregationListParams
import com.m3ter.models.AggregationRetrieveParams
import com.m3ter.models.AggregationUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AggregationFunctionServiceTest {

    @Test
    fun create() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val aggregationService = client.aggregations()

        val aggregationResponse =
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

        aggregationResponse.validate()
    }

    @Test
    fun retrieve() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val aggregationService = client.aggregations()

        val aggregationResponse =
            aggregationService.retrieve(
                AggregationRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        aggregationResponse.validate()
    }

    @Test
    fun update() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val aggregationService = client.aggregations()

        val aggregationResponse =
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

        aggregationResponse.validate()
    }

    @Test
    fun list() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val aggregationService = client.aggregations()

        val page = aggregationService.list(AggregationListParams.builder().orgId("orgId").build())

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val aggregationService = client.aggregations()

        val aggregationResponse =
            aggregationService.delete(
                AggregationDeleteParams.builder().orgId("orgId").id("id").build()
            )

        aggregationResponse.validate()
    }
}
