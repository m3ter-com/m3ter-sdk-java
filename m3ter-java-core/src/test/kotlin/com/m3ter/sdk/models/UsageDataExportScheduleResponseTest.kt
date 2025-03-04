// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UsageDataExportScheduleResponseTest {

    @Test
    fun createUsageDataExportScheduleResponse() {
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
        assertThat(usageDataExportScheduleResponse).isNotNull
        assertThat(usageDataExportScheduleResponse.id()).isEqualTo("id")
        assertThat(usageDataExportScheduleResponse.version()).isEqualTo(0L)
        assertThat(usageDataExportScheduleResponse.accountIds().get()).containsExactly("string")
        assertThat(usageDataExportScheduleResponse.aggregation())
            .contains(UsageDataExportScheduleResponse.Aggregation.SUM)
        assertThat(usageDataExportScheduleResponse.aggregationFrequency())
            .contains(UsageDataExportScheduleResponse.AggregationFrequency.ORIGINAL)
        assertThat(usageDataExportScheduleResponse.meterIds().get()).containsExactly("string")
        assertThat(usageDataExportScheduleResponse.timePeriod())
            .contains(UsageDataExportScheduleResponse.TimePeriod.TODAY)
    }
}
