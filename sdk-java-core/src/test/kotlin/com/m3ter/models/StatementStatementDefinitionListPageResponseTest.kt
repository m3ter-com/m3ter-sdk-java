// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatementStatementDefinitionListPageResponseTest {

    @Test
    fun create() {
        val statementStatementDefinitionListPageResponse =
            StatementStatementDefinitionListPageResponse.builder()
                .addData(
                    StatementDefinitionResponse.builder()
                        .id("id")
                        .version(0L)
                        .aggregationFrequency(
                            StatementDefinitionResponse.AggregationFrequency.ORIGINAL
                        )
                        .createdBy("createdBy")
                        .addDimension(
                            StatementDefinitionResponse.Dimension.builder()
                                .addDimensionAttribute("string")
                                .dimensionName("dimensionName")
                                .build()
                        )
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .includePricePerUnit(true)
                        .lastModifiedBy("lastModifiedBy")
                        .addMeasure(
                            StatementDefinitionResponse.Measure.builder()
                                .addAggregation(StatementDefinitionResponse.Measure.Aggregation.SUM)
                                .meterId("meterId")
                                .name("name")
                                .build()
                        )
                        .name("name")
                        .build()
                )
                .nextToken("nextToken")
                .build()

        assertThat(statementStatementDefinitionListPageResponse.data().getOrNull())
            .containsExactly(
                StatementDefinitionResponse.builder()
                    .id("id")
                    .version(0L)
                    .aggregationFrequency(StatementDefinitionResponse.AggregationFrequency.ORIGINAL)
                    .createdBy("createdBy")
                    .addDimension(
                        StatementDefinitionResponse.Dimension.builder()
                            .addDimensionAttribute("string")
                            .dimensionName("dimensionName")
                            .build()
                    )
                    .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .includePricePerUnit(true)
                    .lastModifiedBy("lastModifiedBy")
                    .addMeasure(
                        StatementDefinitionResponse.Measure.builder()
                            .addAggregation(StatementDefinitionResponse.Measure.Aggregation.SUM)
                            .meterId("meterId")
                            .name("name")
                            .build()
                    )
                    .name("name")
                    .build()
            )
        assertThat(statementStatementDefinitionListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val statementStatementDefinitionListPageResponse =
            StatementStatementDefinitionListPageResponse.builder()
                .addData(
                    StatementDefinitionResponse.builder()
                        .id("id")
                        .version(0L)
                        .aggregationFrequency(
                            StatementDefinitionResponse.AggregationFrequency.ORIGINAL
                        )
                        .createdBy("createdBy")
                        .addDimension(
                            StatementDefinitionResponse.Dimension.builder()
                                .addDimensionAttribute("string")
                                .dimensionName("dimensionName")
                                .build()
                        )
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .includePricePerUnit(true)
                        .lastModifiedBy("lastModifiedBy")
                        .addMeasure(
                            StatementDefinitionResponse.Measure.builder()
                                .addAggregation(StatementDefinitionResponse.Measure.Aggregation.SUM)
                                .meterId("meterId")
                                .name("name")
                                .build()
                        )
                        .name("name")
                        .build()
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedStatementStatementDefinitionListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(statementStatementDefinitionListPageResponse),
                jacksonTypeRef<StatementStatementDefinitionListPageResponse>(),
            )

        assertThat(roundtrippedStatementStatementDefinitionListPageResponse)
            .isEqualTo(statementStatementDefinitionListPageResponse)
    }
}
