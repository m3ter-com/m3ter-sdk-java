// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatementDefinitionResponseTest {

    @Test
    fun create() {
        val statementDefinitionResponse =
            StatementDefinitionResponse.builder()
                .id("id")
                .aggregationFrequency(StatementDefinitionResponse.AggregationFrequency.DAY)
                .createdBy("createdBy")
                .addDimension(
                    StatementDefinitionResponse.Dimension.builder()
                        .addFilter("string")
                        .name("x")
                        .addAttribute("string")
                        .meterId("meterId")
                        .build()
                )
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .generateSlimStatements(true)
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
                .version(0L)
                .build()

        assertThat(statementDefinitionResponse.id()).isEqualTo("id")
        assertThat(statementDefinitionResponse.aggregationFrequency())
            .contains(StatementDefinitionResponse.AggregationFrequency.DAY)
        assertThat(statementDefinitionResponse.createdBy()).contains("createdBy")
        assertThat(statementDefinitionResponse.dimensions().getOrNull())
            .containsExactly(
                StatementDefinitionResponse.Dimension.builder()
                    .addFilter("string")
                    .name("x")
                    .addAttribute("string")
                    .meterId("meterId")
                    .build()
            )
        assertThat(statementDefinitionResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(statementDefinitionResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(statementDefinitionResponse.generateSlimStatements()).contains(true)
        assertThat(statementDefinitionResponse.includePricePerUnit()).contains(true)
        assertThat(statementDefinitionResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(statementDefinitionResponse.measures().getOrNull())
            .containsExactly(
                StatementDefinitionResponse.Measure.builder()
                    .addAggregation(StatementDefinitionResponse.Measure.Aggregation.SUM)
                    .meterId("meterId")
                    .name("name")
                    .build()
            )
        assertThat(statementDefinitionResponse.name()).contains("name")
        assertThat(statementDefinitionResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val statementDefinitionResponse =
            StatementDefinitionResponse.builder()
                .id("id")
                .aggregationFrequency(StatementDefinitionResponse.AggregationFrequency.DAY)
                .createdBy("createdBy")
                .addDimension(
                    StatementDefinitionResponse.Dimension.builder()
                        .addFilter("string")
                        .name("x")
                        .addAttribute("string")
                        .meterId("meterId")
                        .build()
                )
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .generateSlimStatements(true)
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
                .version(0L)
                .build()

        val roundtrippedStatementDefinitionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(statementDefinitionResponse),
                jacksonTypeRef<StatementDefinitionResponse>(),
            )

        assertThat(roundtrippedStatementDefinitionResponse).isEqualTo(statementDefinitionResponse)
    }
}
