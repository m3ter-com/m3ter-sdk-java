// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UsageDataExportScheduleTest {

    @Test
    fun createUsageDataExportSchedule() {
        val usageDataExportSchedule =
            UsageDataExportSchedule.builder()
                .id("id")
                .version(0L)
                .addAccountId("string")
                .aggregation(UsageDataExportSchedule.Aggregation.SUM)
                .aggregationFrequency(UsageDataExportSchedule.AggregationFrequency.ORIGINAL)
                .addMeterId("string")
                .timePeriod(UsageDataExportSchedule.TimePeriod.TODAY)
                .build()
        assertThat(usageDataExportSchedule).isNotNull
        assertThat(usageDataExportSchedule.id()).isEqualTo("id")
        assertThat(usageDataExportSchedule.version()).isEqualTo(0L)
        assertThat(usageDataExportSchedule.accountIds().get()).containsExactly("string")
        assertThat(usageDataExportSchedule.aggregation())
            .contains(UsageDataExportSchedule.Aggregation.SUM)
        assertThat(usageDataExportSchedule.aggregationFrequency())
            .contains(UsageDataExportSchedule.AggregationFrequency.ORIGINAL)
        assertThat(usageDataExportSchedule.meterIds().get()).containsExactly("string")
        assertThat(usageDataExportSchedule.timePeriod())
            .contains(UsageDataExportSchedule.TimePeriod.TODAY)
    }
}
