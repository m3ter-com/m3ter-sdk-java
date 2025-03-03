// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomFieldUpdateParamsTest {

    @Test
    fun create() {
        CustomFieldUpdateParams.builder()
            .orgId("orgId")
            .account(CustomFieldUpdateParams.Account.builder().build())
            .accountPlan(
                CustomFieldUpdateParams.AccountPlan.builder()
                    .putAdditionalProperty("New CF Test", JsonValue.from("bar"))
                    .build()
            )
            .aggregation(CustomFieldUpdateParams.Aggregation.builder().build())
            .compoundAggregation(CustomFieldUpdateParams.CompoundAggregation.builder().build())
            .meter(CustomFieldUpdateParams.Meter.builder().build())
            .organization(
                CustomFieldUpdateParams.Organization.builder()
                    .putAdditionalProperty("Org Example 2", JsonValue.from("bar"))
                    .putAdditionalProperty("Org Example 1", JsonValue.from("bar"))
                    .build()
            )
            .plan(CustomFieldUpdateParams.Plan.builder().build())
            .planTemplate(CustomFieldUpdateParams.PlanTemplate.builder().build())
            .product(
                CustomFieldUpdateParams.Product.builder()
                    .putAdditionalProperty("Product CF Example", JsonValue.from("bar"))
                    .build()
            )
            .version(6L)
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomFieldUpdateParams.builder()
                .orgId("orgId")
                .account(CustomFieldUpdateParams.Account.builder().build())
                .accountPlan(
                    CustomFieldUpdateParams.AccountPlan.builder()
                        .putAdditionalProperty("New CF Test", JsonValue.from("bar"))
                        .build()
                )
                .aggregation(CustomFieldUpdateParams.Aggregation.builder().build())
                .compoundAggregation(CustomFieldUpdateParams.CompoundAggregation.builder().build())
                .meter(CustomFieldUpdateParams.Meter.builder().build())
                .organization(
                    CustomFieldUpdateParams.Organization.builder()
                        .putAdditionalProperty("Org Example 2", JsonValue.from("bar"))
                        .putAdditionalProperty("Org Example 1", JsonValue.from("bar"))
                        .build()
                )
                .plan(CustomFieldUpdateParams.Plan.builder().build())
                .planTemplate(CustomFieldUpdateParams.PlanTemplate.builder().build())
                .product(
                    CustomFieldUpdateParams.Product.builder()
                        .putAdditionalProperty("Product CF Example", JsonValue.from("bar"))
                        .build()
                )
                .version(6L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.account()).contains(CustomFieldUpdateParams.Account.builder().build())
        assertThat(body.accountPlan())
            .contains(
                CustomFieldUpdateParams.AccountPlan.builder()
                    .putAdditionalProperty("New CF Test", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.aggregation())
            .contains(CustomFieldUpdateParams.Aggregation.builder().build())
        assertThat(body.compoundAggregation())
            .contains(CustomFieldUpdateParams.CompoundAggregation.builder().build())
        assertThat(body.meter()).contains(CustomFieldUpdateParams.Meter.builder().build())
        assertThat(body.organization())
            .contains(
                CustomFieldUpdateParams.Organization.builder()
                    .putAdditionalProperty("Org Example 2", JsonValue.from("bar"))
                    .putAdditionalProperty("Org Example 1", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.plan()).contains(CustomFieldUpdateParams.Plan.builder().build())
        assertThat(body.planTemplate())
            .contains(CustomFieldUpdateParams.PlanTemplate.builder().build())
        assertThat(body.product())
            .contains(
                CustomFieldUpdateParams.Product.builder()
                    .putAdditionalProperty("Product CF Example", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.version()).contains(6L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CustomFieldUpdateParams.builder().orgId("orgId").build()

        val body = params._body()

        assertNotNull(body)
    }

    @Test
    fun getPathParam() {
        val params = CustomFieldUpdateParams.builder().orgId("orgId").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
