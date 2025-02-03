// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CompoundAggregationFunctionCreateParamsTest {

    @Test
    fun createCompoundAggregationCreateParams() {
        CompoundAggregationCreateParams.builder()
            .orgId("orgId")
            .calculation("x")
            .name("x")
            .quantityPerUnit(1.0)
            .rounding(CompoundAggregationCreateParams.Rounding.UP)
            .unit("x")
            .code("example_code")
            .customFields(
                CompoundAggregationCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .evaluateNullAggregations(true)
            .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .version(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            CompoundAggregationCreateParams.builder()
                .orgId("orgId")
                .calculation("x")
                .name("x")
                .quantityPerUnit(1.0)
                .rounding(CompoundAggregationCreateParams.Rounding.UP)
                .unit("x")
                .code("example_code")
                .customFields(
                    CompoundAggregationCreateParams.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .evaluateNullAggregations(true)
                .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .version(0L)
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.calculation()).isEqualTo("x")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.quantityPerUnit()).isEqualTo(1.0)
        assertThat(body.rounding()).isEqualTo(CompoundAggregationCreateParams.Rounding.UP)
        assertThat(body.unit()).isEqualTo("x")
        assertThat(body.code()).contains("example_code")
        assertThat(body.customFields())
            .contains(
                CompoundAggregationCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.evaluateNullAggregations()).contains(true)
        assertThat(body.productId()).contains("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CompoundAggregationCreateParams.builder()
                .orgId("orgId")
                .calculation("x")
                .name("x")
                .quantityPerUnit(1.0)
                .rounding(CompoundAggregationCreateParams.Rounding.UP)
                .unit("x")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.calculation()).isEqualTo("x")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.quantityPerUnit()).isEqualTo(1.0)
        assertThat(body.rounding()).isEqualTo(CompoundAggregationCreateParams.Rounding.UP)
        assertThat(body.unit()).isEqualTo("x")
    }

    @Test
    fun getPathParam() {
        val params =
            CompoundAggregationCreateParams.builder()
                .orgId("orgId")
                .calculation("x")
                .name("x")
                .quantityPerUnit(1.0)
                .rounding(CompoundAggregationCreateParams.Rounding.UP)
                .unit("x")
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
