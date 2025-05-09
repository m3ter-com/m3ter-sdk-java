// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageQueryParamsTest {

    @Test
    fun create() {
        UsageQueryParams.builder()
            .orgId("orgId")
            .addAccountId("string")
            .addAggregation(
                UsageQueryParams.Aggregation.builder()
                    .fieldCode("x")
                    .fieldType(UsageQueryParams.Aggregation.FieldType.DIMENSION)
                    .function(UsageQueryParams.Aggregation.Function.SUM)
                    .meterId("x")
                    .build()
            )
            .addDimensionFilter(
                UsageQueryParams.DimensionFilter.builder()
                    .fieldCode("x")
                    .meterId("x")
                    .addValue("string")
                    .build()
            )
            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .addGroup(
                UsageQueryParams.Group.DataExportsDataExplorerAccountGroup.builder()
                    .groupType(DataExplorerAccountGroup.GroupType.ACCOUNT)
                    .build()
            )
            .limit(1)
            .addMeterId("string")
            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun pathParams() {
        val params = UsageQueryParams.builder().build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            UsageQueryParams.builder()
                .orgId("orgId")
                .addAccountId("string")
                .addAggregation(
                    UsageQueryParams.Aggregation.builder()
                        .fieldCode("x")
                        .fieldType(UsageQueryParams.Aggregation.FieldType.DIMENSION)
                        .function(UsageQueryParams.Aggregation.Function.SUM)
                        .meterId("x")
                        .build()
                )
                .addDimensionFilter(
                    UsageQueryParams.DimensionFilter.builder()
                        .fieldCode("x")
                        .meterId("x")
                        .addValue("string")
                        .build()
                )
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addGroup(
                    UsageQueryParams.Group.DataExportsDataExplorerAccountGroup.builder()
                        .groupType(DataExplorerAccountGroup.GroupType.ACCOUNT)
                        .build()
                )
                .limit(1)
                .addMeterId("string")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertThat(body.accountIds().getOrNull()).containsExactly("string")
        assertThat(body.aggregations().getOrNull())
            .containsExactly(
                UsageQueryParams.Aggregation.builder()
                    .fieldCode("x")
                    .fieldType(UsageQueryParams.Aggregation.FieldType.DIMENSION)
                    .function(UsageQueryParams.Aggregation.Function.SUM)
                    .meterId("x")
                    .build()
            )
        assertThat(body.dimensionFilters().getOrNull())
            .containsExactly(
                UsageQueryParams.DimensionFilter.builder()
                    .fieldCode("x")
                    .meterId("x")
                    .addValue("string")
                    .build()
            )
        assertThat(body.endDate()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.groups().getOrNull())
            .containsExactly(
                UsageQueryParams.Group.ofDataExportsDataExplorerAccount(
                    UsageQueryParams.Group.DataExportsDataExplorerAccountGroup.builder()
                        .groupType(DataExplorerAccountGroup.GroupType.ACCOUNT)
                        .build()
                )
            )
        assertThat(body.limit()).contains(1)
        assertThat(body.meterIds().getOrNull()).containsExactly("string")
        assertThat(body.startDate()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UsageQueryParams.builder().build()

        val body = params._body()
    }
}
