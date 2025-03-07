// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CompoundAggregationResponseTest {

    @Test
    fun createCompoundAggregationResponse() {
        val compoundAggregationResponse =
            CompoundAggregationResponse.builder()
                .id("id")
                .version(0L)
                .accountingProductId("accountingProductId")
                .calculation("calculation")
                .code("code")
                .createdBy("createdBy")
                .customFields(
                    CompoundAggregationResponse.CustomFields.builder()
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
                .rounding(CompoundAggregationResponse.Rounding.UP)
                .addSegment(
                    CompoundAggregationResponse.Segment.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .unit("unit")
                .build()
        assertThat(compoundAggregationResponse).isNotNull
        assertThat(compoundAggregationResponse.id()).isEqualTo("id")
        assertThat(compoundAggregationResponse.version()).isEqualTo(0L)
        assertThat(compoundAggregationResponse.accountingProductId())
            .contains("accountingProductId")
        assertThat(compoundAggregationResponse.calculation()).contains("calculation")
        assertThat(compoundAggregationResponse.code()).contains("code")
        assertThat(compoundAggregationResponse.createdBy()).contains("createdBy")
        assertThat(compoundAggregationResponse.customFields())
            .contains(
                CompoundAggregationResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(compoundAggregationResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(compoundAggregationResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(compoundAggregationResponse.evaluateNullAggregations()).contains(true)
        assertThat(compoundAggregationResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(compoundAggregationResponse.name()).contains("name")
        assertThat(compoundAggregationResponse.productId()).contains("productId")
        assertThat(compoundAggregationResponse.quantityPerUnit()).contains(0.0)
        assertThat(compoundAggregationResponse.rounding())
            .contains(CompoundAggregationResponse.Rounding.UP)
        assertThat(compoundAggregationResponse.segments().get())
            .containsExactly(
                CompoundAggregationResponse.Segment.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(compoundAggregationResponse.unit()).contains("unit")
    }
}
