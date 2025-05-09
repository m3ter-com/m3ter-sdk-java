// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdHocUsageDataRequestTest {

    @Test
    fun create() {
        val adHocUsageDataRequest =
            AdHocUsageDataRequest.builder()
                .sourceType(AdHocUsageDataRequest.SourceType.USAGE)
                .addAccountId("string")
                .addAggregation(
                    AdHocUsageDataRequest.Aggregation.builder()
                        .fieldCode("x")
                        .fieldType(AdHocUsageDataRequest.Aggregation.FieldType.DIMENSION)
                        .function(AdHocUsageDataRequest.Aggregation.Function.SUM)
                        .meterId("x")
                        .build()
                )
                .addDimensionFilter(
                    AdHocUsageDataRequest.DimensionFilter.builder()
                        .fieldCode("x")
                        .meterId("x")
                        .addValue("string")
                        .build()
                )
                .addGroup(
                    AdHocUsageDataRequest.Group.DataExportsDataExplorerAccountGroup.builder()
                        .groupType(DataExplorerAccountGroup.GroupType.ACCOUNT)
                        .build()
                )
                .addMeterId("string")
                .version(0L)
                .build()

        assertThat(adHocUsageDataRequest.sourceType())
            .isEqualTo(AdHocUsageDataRequest.SourceType.USAGE)
        assertThat(adHocUsageDataRequest.accountIds().getOrNull()).containsExactly("string")
        assertThat(adHocUsageDataRequest.aggregations().getOrNull())
            .containsExactly(
                AdHocUsageDataRequest.Aggregation.builder()
                    .fieldCode("x")
                    .fieldType(AdHocUsageDataRequest.Aggregation.FieldType.DIMENSION)
                    .function(AdHocUsageDataRequest.Aggregation.Function.SUM)
                    .meterId("x")
                    .build()
            )
        assertThat(adHocUsageDataRequest.dimensionFilters().getOrNull())
            .containsExactly(
                AdHocUsageDataRequest.DimensionFilter.builder()
                    .fieldCode("x")
                    .meterId("x")
                    .addValue("string")
                    .build()
            )
        assertThat(adHocUsageDataRequest.groups().getOrNull())
            .containsExactly(
                AdHocUsageDataRequest.Group.ofDataExportsDataExplorerAccount(
                    AdHocUsageDataRequest.Group.DataExportsDataExplorerAccountGroup.builder()
                        .groupType(DataExplorerAccountGroup.GroupType.ACCOUNT)
                        .build()
                )
            )
        assertThat(adHocUsageDataRequest.meterIds().getOrNull()).containsExactly("string")
        assertThat(adHocUsageDataRequest.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val adHocUsageDataRequest =
            AdHocUsageDataRequest.builder()
                .sourceType(AdHocUsageDataRequest.SourceType.USAGE)
                .addAccountId("string")
                .addAggregation(
                    AdHocUsageDataRequest.Aggregation.builder()
                        .fieldCode("x")
                        .fieldType(AdHocUsageDataRequest.Aggregation.FieldType.DIMENSION)
                        .function(AdHocUsageDataRequest.Aggregation.Function.SUM)
                        .meterId("x")
                        .build()
                )
                .addDimensionFilter(
                    AdHocUsageDataRequest.DimensionFilter.builder()
                        .fieldCode("x")
                        .meterId("x")
                        .addValue("string")
                        .build()
                )
                .addGroup(
                    AdHocUsageDataRequest.Group.DataExportsDataExplorerAccountGroup.builder()
                        .groupType(DataExplorerAccountGroup.GroupType.ACCOUNT)
                        .build()
                )
                .addMeterId("string")
                .version(0L)
                .build()

        val roundtrippedAdHocUsageDataRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(adHocUsageDataRequest),
                jacksonTypeRef<AdHocUsageDataRequest>(),
            )

        assertThat(roundtrippedAdHocUsageDataRequest).isEqualTo(adHocUsageDataRequest)
    }
}
