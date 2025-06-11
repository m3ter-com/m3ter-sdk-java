// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageDataExportScheduleResponseTest {

    @Test
    fun create() {
        val usageDataExportScheduleResponse =
            UsageDataExportScheduleResponse.builder()
                .id("id")
                .version(0L)
                .addAccountId("string")
                .addAggregation(
                    UsageDataExportScheduleResponse.Aggregation.builder()
                        .fieldCode("x")
                        .fieldType(UsageDataExportScheduleResponse.Aggregation.FieldType.DIMENSION)
                        .function(UsageDataExportScheduleResponse.Aggregation.Function.SUM)
                        .meterId("x")
                        .build()
                )
                .addDimensionFilter(
                    UsageDataExportScheduleResponse.DimensionFilter.builder()
                        .fieldCode("x")
                        .meterId("x")
                        .addValue("string")
                        .build()
                )
                .addGroup(
                    DataExplorerGroup.builder()
                        .groupType(DataExplorerGroup.GroupType.ACCOUNT)
                        .build()
                )
                .addMeterId("string")
                .timePeriod(UsageDataExportScheduleResponse.TimePeriod.TODAY)
                .build()

        assertThat(usageDataExportScheduleResponse.id()).isEqualTo("id")
        assertThat(usageDataExportScheduleResponse.version()).isEqualTo(0L)
        assertThat(usageDataExportScheduleResponse.accountIds().getOrNull())
            .containsExactly("string")
        assertThat(usageDataExportScheduleResponse.aggregations().getOrNull())
            .containsExactly(
                UsageDataExportScheduleResponse.Aggregation.builder()
                    .fieldCode("x")
                    .fieldType(UsageDataExportScheduleResponse.Aggregation.FieldType.DIMENSION)
                    .function(UsageDataExportScheduleResponse.Aggregation.Function.SUM)
                    .meterId("x")
                    .build()
            )
        assertThat(usageDataExportScheduleResponse.dimensionFilters().getOrNull())
            .containsExactly(
                UsageDataExportScheduleResponse.DimensionFilter.builder()
                    .fieldCode("x")
                    .meterId("x")
                    .addValue("string")
                    .build()
            )
        assertThat(usageDataExportScheduleResponse.groups().getOrNull())
            .containsExactly(
                DataExplorerGroup.builder().groupType(DataExplorerGroup.GroupType.ACCOUNT).build()
            )
        assertThat(usageDataExportScheduleResponse.meterIds().getOrNull()).containsExactly("string")
        assertThat(usageDataExportScheduleResponse.timePeriod())
            .contains(UsageDataExportScheduleResponse.TimePeriod.TODAY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageDataExportScheduleResponse =
            UsageDataExportScheduleResponse.builder()
                .id("id")
                .version(0L)
                .addAccountId("string")
                .addAggregation(
                    UsageDataExportScheduleResponse.Aggregation.builder()
                        .fieldCode("x")
                        .fieldType(UsageDataExportScheduleResponse.Aggregation.FieldType.DIMENSION)
                        .function(UsageDataExportScheduleResponse.Aggregation.Function.SUM)
                        .meterId("x")
                        .build()
                )
                .addDimensionFilter(
                    UsageDataExportScheduleResponse.DimensionFilter.builder()
                        .fieldCode("x")
                        .meterId("x")
                        .addValue("string")
                        .build()
                )
                .addGroup(
                    DataExplorerGroup.builder()
                        .groupType(DataExplorerGroup.GroupType.ACCOUNT)
                        .build()
                )
                .addMeterId("string")
                .timePeriod(UsageDataExportScheduleResponse.TimePeriod.TODAY)
                .build()

        val roundtrippedUsageDataExportScheduleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageDataExportScheduleResponse),
                jacksonTypeRef<UsageDataExportScheduleResponse>(),
            )

        assertThat(roundtrippedUsageDataExportScheduleResponse)
            .isEqualTo(usageDataExportScheduleResponse)
    }
}
