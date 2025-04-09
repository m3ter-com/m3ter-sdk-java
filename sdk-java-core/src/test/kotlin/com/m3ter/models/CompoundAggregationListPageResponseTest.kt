// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompoundAggregationListPageResponseTest {

    @Test
    fun create() {
        val compoundAggregationListPageResponse =
            CompoundAggregationListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        assertThat(compoundAggregationListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(compoundAggregationListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val compoundAggregationListPageResponse =
            CompoundAggregationListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedCompoundAggregationListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(compoundAggregationListPageResponse),
                jacksonTypeRef<CompoundAggregationListPageResponse>(),
            )

        assertThat(roundtrippedCompoundAggregationListPageResponse)
            .isEqualTo(compoundAggregationListPageResponse)
    }
}
