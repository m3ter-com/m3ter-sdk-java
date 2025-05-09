// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageDataExportScheduleRequestTest {

    @Test
    fun create() {
        val usageDataExportScheduleRequest =
            UsageDataExportScheduleRequest.builder()
                .sourceType(UsageDataExportScheduleRequest.SourceType.USAGE)
                .timePeriod(UsageDataExportScheduleRequest.TimePeriod.TODAY)
                .addAccountId("string")
                .addAggregation(
                    UsageDataExportScheduleRequest.Aggregation.builder()
                        .fieldCode("x")
                        .fieldType(UsageDataExportScheduleRequest.Aggregation.FieldType.DIMENSION)
                        .function(UsageDataExportScheduleRequest.Aggregation.Function.SUM)
                        .meterId("x")
                        .build()
                )
                .addDimensionFilter(
                    UsageDataExportScheduleRequest.DimensionFilter.builder()
                        .fieldCode("x")
                        .meterId("x")
                        .addValue("string")
                        .build()
                )
                .addGroup(
                    UsageDataExportScheduleRequest.Group.DataExportsDataExplorerAccountGroup
                        .builder()
                        .groupType(DataExplorerAccountGroup.GroupType.ACCOUNT)
                        .build()
                )
                .addMeterId("string")
                .version(0L)
                .build()

        assertThat(usageDataExportScheduleRequest.sourceType())
            .isEqualTo(UsageDataExportScheduleRequest.SourceType.USAGE)
        assertThat(usageDataExportScheduleRequest.timePeriod())
            .isEqualTo(UsageDataExportScheduleRequest.TimePeriod.TODAY)
        assertThat(usageDataExportScheduleRequest.accountIds().getOrNull())
            .containsExactly("string")
        assertThat(usageDataExportScheduleRequest.aggregations().getOrNull())
            .containsExactly(
                UsageDataExportScheduleRequest.Aggregation.builder()
                    .fieldCode("x")
                    .fieldType(UsageDataExportScheduleRequest.Aggregation.FieldType.DIMENSION)
                    .function(UsageDataExportScheduleRequest.Aggregation.Function.SUM)
                    .meterId("x")
                    .build()
            )
        assertThat(usageDataExportScheduleRequest.dimensionFilters().getOrNull())
            .containsExactly(
                UsageDataExportScheduleRequest.DimensionFilter.builder()
                    .fieldCode("x")
                    .meterId("x")
                    .addValue("string")
                    .build()
            )
        assertThat(usageDataExportScheduleRequest.groups().getOrNull())
            .containsExactly(
                UsageDataExportScheduleRequest.Group.ofDataExportsDataExplorerAccount(
                    UsageDataExportScheduleRequest.Group.DataExportsDataExplorerAccountGroup
                        .builder()
                        .groupType(DataExplorerAccountGroup.GroupType.ACCOUNT)
                        .build()
                )
            )
        assertThat(usageDataExportScheduleRequest.meterIds().getOrNull()).containsExactly("string")
        assertThat(usageDataExportScheduleRequest.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageDataExportScheduleRequest =
            UsageDataExportScheduleRequest.builder()
                .sourceType(UsageDataExportScheduleRequest.SourceType.USAGE)
                .timePeriod(UsageDataExportScheduleRequest.TimePeriod.TODAY)
                .addAccountId("string")
                .addAggregation(
                    UsageDataExportScheduleRequest.Aggregation.builder()
                        .fieldCode("x")
                        .fieldType(UsageDataExportScheduleRequest.Aggregation.FieldType.DIMENSION)
                        .function(UsageDataExportScheduleRequest.Aggregation.Function.SUM)
                        .meterId("x")
                        .build()
                )
                .addDimensionFilter(
                    UsageDataExportScheduleRequest.DimensionFilter.builder()
                        .fieldCode("x")
                        .meterId("x")
                        .addValue("string")
                        .build()
                )
                .addGroup(
                    UsageDataExportScheduleRequest.Group.DataExportsDataExplorerAccountGroup
                        .builder()
                        .groupType(DataExplorerAccountGroup.GroupType.ACCOUNT)
                        .build()
                )
                .addMeterId("string")
                .version(0L)
                .build()

        val roundtrippedUsageDataExportScheduleRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageDataExportScheduleRequest),
                jacksonTypeRef<UsageDataExportScheduleRequest>(),
            )

        assertThat(roundtrippedUsageDataExportScheduleRequest)
            .isEqualTo(usageDataExportScheduleRequest)
    }
}
