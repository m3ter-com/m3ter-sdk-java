// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomFieldsTest {

    @Test
    fun createCustomFields() {
        val customFields =
            CustomFields.builder()
                .id("id")
                .version(0L)
                .account(
                    CustomFields.Account.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .accountPlan(
                    CustomFields.AccountPlan.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .aggregation(
                    CustomFields.Aggregation.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .compoundAggregation(
                    CustomFields.CompoundAggregation.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .meter(
                    CustomFields.Meter.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .organization(
                    CustomFields.Organization.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .plan(
                    CustomFields.Plan.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .planTemplate(
                    CustomFields.PlanTemplate.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .product(
                    CustomFields.Product.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()
        assertThat(customFields).isNotNull
        assertThat(customFields.id()).isEqualTo("id")
        assertThat(customFields.version()).isEqualTo(0L)
        assertThat(customFields.account())
            .contains(
                CustomFields.Account.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(customFields.accountPlan())
            .contains(
                CustomFields.AccountPlan.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(customFields.aggregation())
            .contains(
                CustomFields.Aggregation.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(customFields.compoundAggregation())
            .contains(
                CustomFields.CompoundAggregation.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(customFields.createdBy()).contains("createdBy")
        assertThat(customFields.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customFields.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customFields.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(customFields.meter())
            .contains(
                CustomFields.Meter.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(customFields.organization())
            .contains(
                CustomFields.Organization.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(customFields.plan())
            .contains(
                CustomFields.Plan.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(customFields.planTemplate())
            .contains(
                CustomFields.PlanTemplate.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(customFields.product())
            .contains(
                CustomFields.Product.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }
}
