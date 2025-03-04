// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UsageQueryParamsTest {

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

        assertNotNull(body)
        assertThat(body.endDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.startDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.accountIds()).contains(listOf("string"))
        assertThat(body.aggregations())
            .contains(
                listOf(
                    UsageQueryParams.Aggregation.builder()
                        .fieldCode("x")
                        .fieldType(UsageQueryParams.Aggregation.FieldType.DIMENSION)
                        .function(UsageQueryParams.Aggregation.Function.SUM)
                        .meterId("x")
                        .build()
                )
            )
        assertThat(body.dimensionFilters())
            .contains(
                listOf(
                    UsageQueryParams.DimensionFilter.builder()
                        .fieldCode("x")
                        .meterId("x")
                        .addValue("string")
                        .build()
                )
            )
        assertThat(body.groups())
            .contains(
                listOf(
                    UsageQueryParams.Group.ofDataExplorerAccount(
                        UsageQueryParams.Group.DataExplorerAccountGroup.builder()
                            .groupType(
                                UsageQueryParams.Group.DataExplorerAccountGroup.GroupType.ACCOUNT
                            )
                            .build()
                    )
                )
            )
        assertThat(body.limit()).contains(1L)
        assertThat(body.meterIds()).contains(listOf("string"))
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

        assertNotNull(body)
        assertThat(body.endDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.startDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun getPathParam() {
        val params =
            UsageQueryParams.builder()
                .orgId("orgId")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
