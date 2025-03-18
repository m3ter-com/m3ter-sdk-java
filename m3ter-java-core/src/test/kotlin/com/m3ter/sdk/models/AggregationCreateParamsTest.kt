// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AggregationCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            AggregationCreateParams.builder()
                .orgId("orgId")
                .aggregation(AggregationCreateParams.Aggregation.SUM)
                .meterId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .name("x")
                .quantityPerUnit(1.0)
                .rounding(AggregationCreateParams.Rounding.UP)
                .targetField("x")
                .unit("x")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertNotNull(body)
        assertThat(body.aggregation()).isEqualTo(AggregationCreateParams.Aggregation.SUM)
        assertThat(body.meterId()).isEqualTo("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.quantityPerUnit()).isEqualTo(1.0)
        assertThat(body.rounding()).isEqualTo(AggregationCreateParams.Rounding.UP)
        assertThat(body.targetField()).isEqualTo("x")
        assertThat(body.unit()).isEqualTo("x")
        assertThat(body.accountingProductId()).contains("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.code()).contains("example_code")
        assertThat(body.customFields())
            .contains(
                AggregationCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.customSql()).contains("customSql")
        assertThat(body.defaultValue()).contains(0.0)
        assertThat(body.segmentedFields().getOrNull()).containsExactly("string")
        assertThat(body.segments().getOrNull())
            .containsExactly(
                AggregationCreateParams.Segment.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AggregationCreateParams.builder()
                .orgId("orgId")
                .aggregation(AggregationCreateParams.Aggregation.SUM)
                .meterId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .name("x")
                .quantityPerUnit(1.0)
                .rounding(AggregationCreateParams.Rounding.UP)
                .targetField("x")
                .unit("x")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.aggregation()).isEqualTo(AggregationCreateParams.Aggregation.SUM)
        assertThat(body.meterId()).isEqualTo("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.quantityPerUnit()).isEqualTo(1.0)
        assertThat(body.rounding()).isEqualTo(AggregationCreateParams.Rounding.UP)
        assertThat(body.targetField()).isEqualTo("x")
        assertThat(body.unit()).isEqualTo("x")
    }
}
