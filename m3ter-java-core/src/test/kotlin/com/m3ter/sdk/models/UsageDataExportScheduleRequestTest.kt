// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageDataExportScheduleRequestTest {

    @Test
    fun createUsageDataExportScheduleRequest() {
        val usageDataExportScheduleRequest =
            UsageDataExportScheduleRequest.builder()
                .aggregationFrequency(UsageDataExportScheduleRequest.AggregationFrequency.ORIGINAL)
                .sourceType(UsageDataExportScheduleRequest.SourceType.USAGE)
                .timePeriod(UsageDataExportScheduleRequest.TimePeriod.TODAY)
                .addAccountId("string")
                .aggregation(UsageDataExportScheduleRequest.Aggregation.SUM)
                .addMeterId("string")
                .version(0L)
                .build()
        assertThat(usageDataExportScheduleRequest).isNotNull
        assertThat(usageDataExportScheduleRequest.aggregationFrequency())
            .isEqualTo(UsageDataExportScheduleRequest.AggregationFrequency.ORIGINAL)
        assertThat(usageDataExportScheduleRequest.sourceType())
            .isEqualTo(UsageDataExportScheduleRequest.SourceType.USAGE)
        assertThat(usageDataExportScheduleRequest.timePeriod())
            .isEqualTo(UsageDataExportScheduleRequest.TimePeriod.TODAY)
        assertThat(usageDataExportScheduleRequest.accountIds().get()).containsExactly("string")
        assertThat(usageDataExportScheduleRequest.aggregation())
            .contains(UsageDataExportScheduleRequest.Aggregation.SUM)
        assertThat(usageDataExportScheduleRequest.meterIds().get()).containsExactly("string")
        assertThat(usageDataExportScheduleRequest.version()).contains(0L)
    }
}
