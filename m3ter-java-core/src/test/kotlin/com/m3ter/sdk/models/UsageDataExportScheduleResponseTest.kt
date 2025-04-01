// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.sdk.core.jsonMapper
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
                .aggregation(UsageDataExportScheduleResponse.Aggregation.SUM)
                .aggregationFrequency(UsageDataExportScheduleResponse.AggregationFrequency.ORIGINAL)
                .addMeterId("string")
                .timePeriod(UsageDataExportScheduleResponse.TimePeriod.TODAY)
                .build()

        assertThat(usageDataExportScheduleResponse.id()).isEqualTo("id")
        assertThat(usageDataExportScheduleResponse.version()).isEqualTo(0L)
        assertThat(usageDataExportScheduleResponse.accountIds().getOrNull())
            .containsExactly("string")
        assertThat(usageDataExportScheduleResponse.aggregation())
            .contains(UsageDataExportScheduleResponse.Aggregation.SUM)
        assertThat(usageDataExportScheduleResponse.aggregationFrequency())
            .contains(UsageDataExportScheduleResponse.AggregationFrequency.ORIGINAL)
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
                .aggregation(UsageDataExportScheduleResponse.Aggregation.SUM)
                .aggregationFrequency(UsageDataExportScheduleResponse.AggregationFrequency.ORIGINAL)
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
