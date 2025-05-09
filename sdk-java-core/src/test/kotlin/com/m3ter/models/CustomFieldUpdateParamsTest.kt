// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomFieldUpdateParamsTest {

    @Test
    fun create() {
        CustomFieldUpdateParams.builder()
            .orgId("orgId")
            .account(CustomFieldUpdateParams.Account.builder().build())
            .accountPlan(
                CustomFieldUpdateParams.AccountPlan.builder()
                    .putAdditionalProperty("New CF Test", JsonValue.from("Test Value"))
                    .build()
            )
            .aggregation(CustomFieldUpdateParams.Aggregation.builder().build())
            .compoundAggregation(CustomFieldUpdateParams.CompoundAggregation.builder().build())
            .contract(
                CustomFieldUpdateParams.Contract.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .meter(CustomFieldUpdateParams.Meter.builder().build())
            .organization(
                CustomFieldUpdateParams.Organization.builder()
                    .putAdditionalProperty("Org Example 2", JsonValue.from("Sample text 2."))
                    .putAdditionalProperty("Org Example 1", JsonValue.from("Sample text 1."))
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
    }

    @Test
    fun pathParams() {
        val params = CustomFieldUpdateParams.builder().build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CustomFieldUpdateParams.builder()
                .orgId("orgId")
                .account(CustomFieldUpdateParams.Account.builder().build())
                .accountPlan(
                    CustomFieldUpdateParams.AccountPlan.builder()
                        .putAdditionalProperty("New CF Test", JsonValue.from("Test Value"))
                        .build()
                )
                .aggregation(CustomFieldUpdateParams.Aggregation.builder().build())
                .compoundAggregation(CustomFieldUpdateParams.CompoundAggregation.builder().build())
                .contract(
                    CustomFieldUpdateParams.Contract.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .meter(CustomFieldUpdateParams.Meter.builder().build())
                .organization(
                    CustomFieldUpdateParams.Organization.builder()
                        .putAdditionalProperty("Org Example 2", JsonValue.from("Sample text 2."))
                        .putAdditionalProperty("Org Example 1", JsonValue.from("Sample text 1."))
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

        val body = params._body()

        assertThat(body.account()).contains(CustomFieldUpdateParams.Account.builder().build())
        assertThat(body.accountPlan())
            .contains(
                CustomFieldUpdateParams.AccountPlan.builder()
                    .putAdditionalProperty("New CF Test", JsonValue.from("Test Value"))
                    .build()
            )
        assertThat(body.aggregation())
            .contains(CustomFieldUpdateParams.Aggregation.builder().build())
        assertThat(body.compoundAggregation())
            .contains(CustomFieldUpdateParams.CompoundAggregation.builder().build())
        assertThat(body.contract())
            .contains(
                CustomFieldUpdateParams.Contract.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.meter()).contains(CustomFieldUpdateParams.Meter.builder().build())
        assertThat(body.organization())
            .contains(
                CustomFieldUpdateParams.Organization.builder()
                    .putAdditionalProperty("Org Example 2", JsonValue.from("Sample text 2."))
                    .putAdditionalProperty("Org Example 1", JsonValue.from("Sample text 1."))
                    .build()
            )
        assertThat(body.plan()).contains(CustomFieldUpdateParams.Plan.builder().build())
        assertThat(body.planTemplate())
            .contains(CustomFieldUpdateParams.PlanTemplate.builder().build())
        assertThat(body.product())
            .contains(
                CustomFieldUpdateParams.Product.builder()
                    .putAdditionalProperty("Product CF Example", JsonValue.from(42))
                    .build()
            )
        assertThat(body.version()).contains(6L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CustomFieldUpdateParams.builder().build()

        val body = params._body()
    }
}
