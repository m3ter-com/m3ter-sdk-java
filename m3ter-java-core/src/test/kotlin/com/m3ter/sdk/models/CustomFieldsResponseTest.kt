// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomFieldsResponseTest {

    @Test
    fun create() {
        val customFieldsResponse =
            CustomFieldsResponse.builder()
                .id("id")
                .version(0L)
                .account(
                    CustomFieldsResponse.Account.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .accountPlan(
                    CustomFieldsResponse.AccountPlan.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .aggregation(
                    CustomFieldsResponse.Aggregation.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .compoundAggregation(
                    CustomFieldsResponse.CompoundAggregation.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .meter(
                    CustomFieldsResponse.Meter.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .organization(
                    CustomFieldsResponse.Organization.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .plan(
                    CustomFieldsResponse.Plan.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .planTemplate(
                    CustomFieldsResponse.PlanTemplate.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .product(
                    CustomFieldsResponse.Product.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(customFieldsResponse.id()).isEqualTo("id")
        assertThat(customFieldsResponse.version()).isEqualTo(0L)
        assertThat(customFieldsResponse.account())
            .contains(
                CustomFieldsResponse.Account.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(customFieldsResponse.accountPlan())
            .contains(
                CustomFieldsResponse.AccountPlan.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(customFieldsResponse.aggregation())
            .contains(
                CustomFieldsResponse.Aggregation.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(customFieldsResponse.compoundAggregation())
            .contains(
                CustomFieldsResponse.CompoundAggregation.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(customFieldsResponse.createdBy()).contains("createdBy")
        assertThat(customFieldsResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customFieldsResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customFieldsResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(customFieldsResponse.meter())
            .contains(
                CustomFieldsResponse.Meter.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(customFieldsResponse.organization())
            .contains(
                CustomFieldsResponse.Organization.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(customFieldsResponse.plan())
            .contains(
                CustomFieldsResponse.Plan.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(customFieldsResponse.planTemplate())
            .contains(
                CustomFieldsResponse.PlanTemplate.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(customFieldsResponse.product())
            .contains(
                CustomFieldsResponse.Product.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customFieldsResponse =
            CustomFieldsResponse.builder()
                .id("id")
                .version(0L)
                .account(
                    CustomFieldsResponse.Account.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .accountPlan(
                    CustomFieldsResponse.AccountPlan.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .aggregation(
                    CustomFieldsResponse.Aggregation.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .compoundAggregation(
                    CustomFieldsResponse.CompoundAggregation.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .meter(
                    CustomFieldsResponse.Meter.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .organization(
                    CustomFieldsResponse.Organization.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .plan(
                    CustomFieldsResponse.Plan.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .planTemplate(
                    CustomFieldsResponse.PlanTemplate.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .product(
                    CustomFieldsResponse.Product.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedCustomFieldsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customFieldsResponse),
                jacksonTypeRef<CustomFieldsResponse>(),
            )

        assertThat(roundtrippedCustomFieldsResponse).isEqualTo(customFieldsResponse)
    }
}
