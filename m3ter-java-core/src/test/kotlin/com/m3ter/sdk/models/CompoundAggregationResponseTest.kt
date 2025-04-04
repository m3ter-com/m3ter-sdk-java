// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompoundAggregationResponseTest {

    @Test
    fun create() {
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
        assertThat(compoundAggregationResponse.segments().getOrNull())
            .containsExactly(
                CompoundAggregationResponse.Segment.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(compoundAggregationResponse.unit()).contains("unit")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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

        val roundtrippedCompoundAggregationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(compoundAggregationResponse),
                jacksonTypeRef<CompoundAggregationResponse>(),
            )

        assertThat(roundtrippedCompoundAggregationResponse).isEqualTo(compoundAggregationResponse)
    }
}
