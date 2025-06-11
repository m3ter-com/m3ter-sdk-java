// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatementStatementDefinitionUpdateParamsTest {

    @Test
    fun create() {
        StatementStatementDefinitionUpdateParams.builder()
            .orgId("orgId")
            .id("id")
            .aggregationFrequency(
                StatementStatementDefinitionUpdateParams.AggregationFrequency.ORIGINAL
            )
            .addDimension(
                StatementStatementDefinitionUpdateParams.Dimension.builder()
                    .addDimensionAttribute("string")
                    .dimensionName("dimensionName")
                    .build()
            )
            .includePricePerUnit(true)
            .addMeasure(
                StatementStatementDefinitionUpdateParams.Measure.builder()
                    .addAggregation(
                        StatementStatementDefinitionUpdateParams.Measure.Aggregation.SUM
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
            StatementStatementDefinitionUpdateParams.builder()
                .id("id")
                .aggregationFrequency(
                    StatementStatementDefinitionUpdateParams.AggregationFrequency.ORIGINAL
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            StatementStatementDefinitionUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .aggregationFrequency(
                    StatementStatementDefinitionUpdateParams.AggregationFrequency.ORIGINAL
                )
                .addDimension(
                    StatementStatementDefinitionUpdateParams.Dimension.builder()
                        .addDimensionAttribute("string")
                        .dimensionName("dimensionName")
                        .build()
                )
                .includePricePerUnit(true)
                .addMeasure(
                    StatementStatementDefinitionUpdateParams.Measure.builder()
                        .addAggregation(
                            StatementStatementDefinitionUpdateParams.Measure.Aggregation.SUM
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
            .isEqualTo(StatementStatementDefinitionUpdateParams.AggregationFrequency.ORIGINAL)
        assertThat(body.dimensions().getOrNull())
            .containsExactly(
                StatementStatementDefinitionUpdateParams.Dimension.builder()
                    .addDimensionAttribute("string")
                    .dimensionName("dimensionName")
                    .build()
            )
        assertThat(body.includePricePerUnit()).contains(true)
        assertThat(body.measures().getOrNull())
            .containsExactly(
                StatementStatementDefinitionUpdateParams.Measure.builder()
                    .addAggregation(
                        StatementStatementDefinitionUpdateParams.Measure.Aggregation.SUM
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
            StatementStatementDefinitionUpdateParams.builder()
                .id("id")
                .aggregationFrequency(
                    StatementStatementDefinitionUpdateParams.AggregationFrequency.ORIGINAL
                )
                .build()

        val body = params._body()

        assertThat(body.aggregationFrequency())
            .isEqualTo(StatementStatementDefinitionUpdateParams.AggregationFrequency.ORIGINAL)
    }
}
