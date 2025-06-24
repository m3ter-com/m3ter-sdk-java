// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatementStatementDefinitionCreateParamsTest {

    @Test
    fun create() {
        StatementStatementDefinitionCreateParams.builder()
            .orgId("orgId")
            .aggregationFrequency(StatementStatementDefinitionCreateParams.AggregationFrequency.DAY)
            .addDimension(
                StatementStatementDefinitionCreateParams.Dimension.builder()
                    .addFilter("string")
                    .name("x")
                    .addAttribute("string")
                    .meterId("meterId")
                    .build()
            )
            .includePricePerUnit(true)
            .addMeasure(
                StatementStatementDefinitionCreateParams.Measure.builder()
                    .addAggregation(
                        StatementStatementDefinitionCreateParams.Measure.Aggregation.SUM
                    )
                    .meterId("meterId")
                    .name("name")
                    .build()
            )
            .name("name")
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            StatementStatementDefinitionCreateParams.builder()
                .aggregationFrequency(
                    StatementStatementDefinitionCreateParams.AggregationFrequency.DAY
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            StatementStatementDefinitionCreateParams.builder()
                .orgId("orgId")
                .aggregationFrequency(
                    StatementStatementDefinitionCreateParams.AggregationFrequency.DAY
                )
                .addDimension(
                    StatementStatementDefinitionCreateParams.Dimension.builder()
                        .addFilter("string")
                        .name("x")
                        .addAttribute("string")
                        .meterId("meterId")
                        .build()
                )
                .includePricePerUnit(true)
                .addMeasure(
                    StatementStatementDefinitionCreateParams.Measure.builder()
                        .addAggregation(
                            StatementStatementDefinitionCreateParams.Measure.Aggregation.SUM
                        )
                        .meterId("meterId")
                        .name("name")
                        .build()
                )
                .name("name")
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.aggregationFrequency())
            .isEqualTo(StatementStatementDefinitionCreateParams.AggregationFrequency.DAY)
        assertThat(body.dimensions().getOrNull())
            .containsExactly(
                StatementStatementDefinitionCreateParams.Dimension.builder()
                    .addFilter("string")
                    .name("x")
                    .addAttribute("string")
                    .meterId("meterId")
                    .build()
            )
        assertThat(body.includePricePerUnit()).contains(true)
        assertThat(body.measures().getOrNull())
            .containsExactly(
                StatementStatementDefinitionCreateParams.Measure.builder()
                    .addAggregation(
                        StatementStatementDefinitionCreateParams.Measure.Aggregation.SUM
                    )
                    .meterId("meterId")
                    .name("name")
                    .build()
            )
        assertThat(body.name()).contains("name")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            StatementStatementDefinitionCreateParams.builder()
                .aggregationFrequency(
                    StatementStatementDefinitionCreateParams.AggregationFrequency.DAY
                )
                .build()

        val body = params._body()

        assertThat(body.aggregationFrequency())
            .isEqualTo(StatementStatementDefinitionCreateParams.AggregationFrequency.DAY)
    }
}
