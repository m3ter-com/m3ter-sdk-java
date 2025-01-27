// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.models.CompoundAggregationCreateParams
import com.m3ter.sdk.models.CompoundAggregationListParams
import com.m3ter.sdk.models.CompoundAggregationRetrieveParams
import com.m3ter.sdk.models.CompoundAggregationUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CompoundAggregationServiceTest {

    @Test
    fun callCreate() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
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
                    .code("{1{}}_")
                    .customFields(
                        CompoundAggregationCreateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .evaluateNullAggregations(true)
                    .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
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
        val compoundAggregationService = client.compoundAggregations()
        val compoundAggregation =
            compoundAggregationService.retrieve(
                CompoundAggregationRetrieveParams.builder().orgId("orgId").id("id").build()
            )
        println(compoundAggregation)
        compoundAggregation.validate()
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
                    .code("{1{}}_")
                    .customFields(
                        CompoundAggregationUpdateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .evaluateNullAggregations(true)
                    .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
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
        val compoundAggregationService = client.compoundAggregations()
        val paginatedCompoundAggregationResponse =
            compoundAggregationService.list(
                CompoundAggregationListParams.builder().orgId("orgId").build()
            )
        println(paginatedCompoundAggregationResponse)
        paginatedCompoundAggregationResponse.data().forEach { it.validate() }
    }
}
