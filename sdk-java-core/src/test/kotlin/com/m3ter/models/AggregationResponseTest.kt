// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AggregationResponseTest {

    @Test
    fun create() {
        val aggregationResponse =
            AggregationResponse.builder()
                .id("id")
                .version(0L)
                .accountingProductId("accountingProductId")
                .aggregation(AggregationResponse.Aggregation.SUM)
                .code("code")
                .createdBy("createdBy")
                .customFields(
                    AggregationResponse.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .customSql("customSql")
                .defaultValue(0.0)
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .meterId("meterId")
                .name("name")
                .quantityPerUnit(0.0)
                .rounding(AggregationResponse.Rounding.UP)
                .addSegmentedField("string")
                .addSegment(
                    AggregationResponse.Segment.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .targetField("targetField")
                .unit("unit")
                .build()

        assertThat(aggregationResponse.id()).isEqualTo("id")
        assertThat(aggregationResponse.version()).isEqualTo(0L)
        assertThat(aggregationResponse.accountingProductId()).contains("accountingProductId")
        assertThat(aggregationResponse.aggregation()).contains(AggregationResponse.Aggregation.SUM)
        assertThat(aggregationResponse.code()).contains("code")
        assertThat(aggregationResponse.createdBy()).contains("createdBy")
        assertThat(aggregationResponse.customFields())
            .contains(
                AggregationResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(aggregationResponse.customSql()).contains("customSql")
        assertThat(aggregationResponse.defaultValue()).contains(0.0)
        assertThat(aggregationResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(aggregationResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(aggregationResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(aggregationResponse.meterId()).contains("meterId")
        assertThat(aggregationResponse.name()).contains("name")
        assertThat(aggregationResponse.quantityPerUnit()).contains(0.0)
        assertThat(aggregationResponse.rounding()).contains(AggregationResponse.Rounding.UP)
        assertThat(aggregationResponse.segmentedFields().getOrNull()).containsExactly("string")
        assertThat(aggregationResponse.segments().getOrNull())
            .containsExactly(
                AggregationResponse.Segment.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(aggregationResponse.targetField()).contains("targetField")
        assertThat(aggregationResponse.unit()).contains("unit")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aggregationResponse =
            AggregationResponse.builder()
                .id("id")
                .version(0L)
                .accountingProductId("accountingProductId")
                .aggregation(AggregationResponse.Aggregation.SUM)
                .code("code")
                .createdBy("createdBy")
                .customFields(
                    AggregationResponse.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .customSql("customSql")
                .defaultValue(0.0)
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .meterId("meterId")
                .name("name")
                .quantityPerUnit(0.0)
                .rounding(AggregationResponse.Rounding.UP)
                .addSegmentedField("string")
                .addSegment(
                    AggregationResponse.Segment.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .targetField("targetField")
                .unit("unit")
                .build()

        val roundtrippedAggregationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aggregationResponse),
                jacksonTypeRef<AggregationResponse>(),
            )

        assertThat(roundtrippedAggregationResponse).isEqualTo(aggregationResponse)
    }
}
