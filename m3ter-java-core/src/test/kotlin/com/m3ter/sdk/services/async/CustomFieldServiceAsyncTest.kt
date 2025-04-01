// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.models.CustomFieldRetrieveParams
import com.m3ter.sdk.models.CustomFieldUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CustomFieldServiceAsyncTest {

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
        val customFieldServiceAsync = client.customFields()

        val customFieldsResponseFuture =
            customFieldServiceAsync.retrieve(
                CustomFieldRetrieveParams.builder().orgId("orgId").build()
            )

        val customFieldsResponse = customFieldsResponseFuture.get()
        customFieldsResponse.validate()
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
        val customFieldServiceAsync = client.customFields()

        val customFieldsResponseFuture =
            customFieldServiceAsync.update(
                CustomFieldUpdateParams.builder()
                    .orgId("orgId")
                    .account(CustomFieldUpdateParams.Account.builder().build())
                    .accountPlan(
                        CustomFieldUpdateParams.AccountPlan.builder()
                            .putAdditionalProperty("New CF Test", JsonValue.from("Test Value"))
                            .build()
                    )
                    .aggregation(CustomFieldUpdateParams.Aggregation.builder().build())
                    .compoundAggregation(
                        CustomFieldUpdateParams.CompoundAggregation.builder().build()
                    )
                    .meter(CustomFieldUpdateParams.Meter.builder().build())
                    .organization(
                        CustomFieldUpdateParams.Organization.builder()
                            .putAdditionalProperty(
                                "Org Example 2",
                                JsonValue.from("Sample text 2."),
                            )
                            .putAdditionalProperty(
                                "Org Example 1",
                                JsonValue.from("Sample text 1."),
                            )
                            .build()
                    )
                    .plan(CustomFieldUpdateParams.Plan.builder().build())
                    .planTemplate(CustomFieldUpdateParams.PlanTemplate.builder().build())
                    .product(
                        CustomFieldUpdateParams.Product.builder()
                            .putAdditionalProperty("Product CF Example", JsonValue.from(42))
                            .build()
                    )
                    .version(6L)
                    .build()
            )

        val customFieldsResponse = customFieldsResponseFuture.get()
        customFieldsResponse.validate()
    }
}
