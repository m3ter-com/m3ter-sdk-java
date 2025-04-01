// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageQueryParamsTest {

    @Test
    fun create() {
        UsageQueryParams.builder()
            .orgId("orgId")
            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
            .addGroup(
                UsageQueryParams.Group.DataExplorerAccountGroup.builder()
                    .groupType(UsageQueryParams.Group.DataExplorerAccountGroup.GroupType.ACCOUNT)
                    .build()
            )
            .limit(1L)
            .addMeterId("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            UsageQueryParams.builder()
                .orgId("orgId")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            UsageQueryParams.builder()
                .orgId("orgId")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                .addGroup(
                    UsageQueryParams.Group.DataExplorerAccountGroup.builder()
                        .groupType(
                            UsageQueryParams.Group.DataExplorerAccountGroup.GroupType.ACCOUNT
                        )
                        .build()
                )
                .limit(1L)
                .addMeterId("string")
                .build()

        val body = params._body()

        assertThat(body.endDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.startDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        assertThat(body.groups().getOrNull())
            .containsExactly(
                UsageQueryParams.Group.ofDataExplorerAccount(
                    UsageQueryParams.Group.DataExplorerAccountGroup.builder()
                        .groupType(
                            UsageQueryParams.Group.DataExplorerAccountGroup.GroupType.ACCOUNT
                        )
                        .build()
                )
            )
        assertThat(body.limit()).contains(1L)
        assertThat(body.meterIds().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UsageQueryParams.builder()
                .orgId("orgId")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertThat(body.endDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.startDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
