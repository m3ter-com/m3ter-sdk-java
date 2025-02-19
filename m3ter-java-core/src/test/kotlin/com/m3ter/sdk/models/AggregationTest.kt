// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AggregationTest {

    @Test
    fun createAggregation() {
        val aggregation =
            Aggregation.builder()
                .id("id")
                .version(0L)
                .accountingProductId("accountingProductId")
                .aggregation(Aggregation.InnerAggregation.SUM)
                .code("code")
                .createdBy("createdBy")
                .customFields(
                    Aggregation.CustomFields.builder()
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
                .rounding(Aggregation.Rounding.UP)
                .addSegmentedField("string")
                .addSegment(
                    Aggregation.Segment.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .targetField("targetField")
                .unit("unit")
                .build()
        assertThat(aggregation).isNotNull
        assertThat(aggregation.id()).isEqualTo("id")
        assertThat(aggregation.version()).isEqualTo(0L)
        assertThat(aggregation.accountingProductId()).contains("accountingProductId")
        assertThat(aggregation.aggregation()).contains(Aggregation.InnerAggregation.SUM)
        assertThat(aggregation.code()).contains("code")
        assertThat(aggregation.createdBy()).contains("createdBy")
        assertThat(aggregation.customFields())
            .contains(
                Aggregation.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(aggregation.customSql()).contains("customSql")
        assertThat(aggregation.defaultValue()).contains(0.0)
        assertThat(aggregation.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(aggregation.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(aggregation.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(aggregation.meterId()).contains("meterId")
        assertThat(aggregation.name()).contains("name")
        assertThat(aggregation.quantityPerUnit()).contains(0.0)
        assertThat(aggregation.rounding()).contains(Aggregation.Rounding.UP)
        assertThat(aggregation.segmentedFields().get()).containsExactly("string")
        assertThat(aggregation.segments().get())
            .containsExactly(
                Aggregation.Segment.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(aggregation.targetField()).contains("targetField")
        assertThat(aggregation.unit()).contains("unit")
    }
}
