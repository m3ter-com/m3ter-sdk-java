// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.models.CompoundAggregationCreateParams
import com.m3ter.sdk.models.CompoundAggregationDeleteParams
import com.m3ter.sdk.models.CompoundAggregationListParams
import com.m3ter.sdk.models.CompoundAggregationRetrieveParams
import com.m3ter.sdk.models.CompoundAggregationUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CompoundAggregationServiceTest {

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
        val compoundAggregationService = client.compoundAggregations()

        val aggregation =
            compoundAggregationService.create(
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

        aggregation.validate()
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
        val compoundAggregationService = client.compoundAggregations()

        val compoundAggregation =
            compoundAggregationService.retrieve(
                CompoundAggregationRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        compoundAggregation.validate()
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
        val compoundAggregationService = client.compoundAggregations()

        val aggregation =
            compoundAggregationService.update(
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

        aggregation.validate()
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
        val compoundAggregationService = client.compoundAggregations()

        val page =
            compoundAggregationService.list(
                CompoundAggregationListParams.builder().orgId("orgId").build()
            )

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
        val compoundAggregationService = client.compoundAggregations()

        val compoundAggregation =
            compoundAggregationService.delete(
                CompoundAggregationDeleteParams.builder().orgId("orgId").id("id").build()
            )

        compoundAggregation.validate()
    }
}
