// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CompoundAggregationTest {

    @Test
    fun createCompoundAggregation() {
        val compoundAggregation =
            CompoundAggregation.builder()
                .id("id")
                .version(0L)
                .calculation("calculation")
                .code("code")
                .createdBy("createdBy")
                .customFields(
                    CompoundAggregation.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .evaluateNullAggregations(true)
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .productId("productId")
                .quantityPerUnit(0.0)
                .rounding(CompoundAggregation.Rounding.UP)
                .addSegment(
                    CompoundAggregation.Segment.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .unit("unit")
                .build()
        assertThat(compoundAggregation).isNotNull
        assertThat(compoundAggregation.id()).isEqualTo("id")
        assertThat(compoundAggregation.version()).isEqualTo(0L)
        assertThat(compoundAggregation.calculation()).contains("calculation")
        assertThat(compoundAggregation.code()).contains("code")
        assertThat(compoundAggregation.createdBy()).contains("createdBy")
        assertThat(compoundAggregation.customFields())
            .contains(
                CompoundAggregation.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(compoundAggregation.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(compoundAggregation.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(compoundAggregation.evaluateNullAggregations()).contains(true)
        assertThat(compoundAggregation.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(compoundAggregation.name()).contains("name")
        assertThat(compoundAggregation.productId()).contains("productId")
        assertThat(compoundAggregation.quantityPerUnit()).contains(0.0)
        assertThat(compoundAggregation.rounding()).contains(CompoundAggregation.Rounding.UP)
        assertThat(compoundAggregation.segments().get())
            .containsExactly(
                CompoundAggregation.Segment.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(compoundAggregation.unit()).contains("unit")
    }
}
