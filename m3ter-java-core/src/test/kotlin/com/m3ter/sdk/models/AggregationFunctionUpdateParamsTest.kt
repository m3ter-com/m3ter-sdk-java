// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AggregationFunctionUpdateParamsTest {

    @Test
    fun createAggregationUpdateParams() {
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
            .code("{1{}}_")
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
    }

    @Test
    fun body() {
        val params =
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
                .code("{1{}}_")
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
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.aggregation()).isEqualTo(AggregationUpdateParams.Aggregation.SUM)
        assertThat(body.meterId()).isEqualTo("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.quantityPerUnit()).isEqualTo(1.0)
        assertThat(body.rounding()).isEqualTo(AggregationUpdateParams.Rounding.UP)
        assertThat(body.targetField()).isEqualTo("x")
        assertThat(body.unit()).isEqualTo("x")
        assertThat(body.code()).contains("{1{}}_")
        assertThat(body.customFields())
            .contains(
                AggregationUpdateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.defaultValue()).contains(0.0)
        assertThat(body.segmentedFields()).contains(listOf("string"))
        assertThat(body.segments())
            .contains(
                listOf(
                    AggregationUpdateParams.Segment.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
            )
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
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
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.aggregation()).isEqualTo(AggregationUpdateParams.Aggregation.SUM)
        assertThat(body.meterId()).isEqualTo("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.quantityPerUnit()).isEqualTo(1.0)
        assertThat(body.rounding()).isEqualTo(AggregationUpdateParams.Rounding.UP)
        assertThat(body.targetField()).isEqualTo("x")
        assertThat(body.unit()).isEqualTo("x")
    }

    @Test
    fun getPathParam() {
        val params =
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
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "id"
        assertThat(params.getPathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
