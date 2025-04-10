// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AggregationListPageResponseTest {

    @Test
    fun create() {
        val aggregationListPageResponse =
            AggregationListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        assertThat(aggregationListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(aggregationListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aggregationListPageResponse =
            AggregationListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedAggregationListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aggregationListPageResponse),
                jacksonTypeRef<AggregationListPageResponse>(),
            )

        assertThat(roundtrippedAggregationListPageResponse).isEqualTo(aggregationListPageResponse)
    }
}
