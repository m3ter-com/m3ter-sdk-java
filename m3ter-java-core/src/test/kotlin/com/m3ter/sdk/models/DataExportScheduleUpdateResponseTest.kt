// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportScheduleUpdateResponseTest {

    @Test
    fun ofOperationalDataExportSchedule() {
        val operationalDataExportSchedule =
            OperationalDataExportScheduleResponse.builder().id("id").version(0L).build()

        val dataExportScheduleUpdateResponse =
            DataExportScheduleUpdateResponse.ofOperationalDataExportSchedule(
                operationalDataExportSchedule
            )

        assertThat(dataExportScheduleUpdateResponse.operationalDataExportSchedule())
            .contains(operationalDataExportSchedule)
        assertThat(dataExportScheduleUpdateResponse.usageDataExportSchedule()).isEmpty
    }

    @Test
    fun ofUsageDataExportSchedule() {
        val usageDataExportSchedule =
            UsageDataExportScheduleResponse.builder().id("id").version(0L).build()

        val dataExportScheduleUpdateResponse =
            DataExportScheduleUpdateResponse.ofUsageDataExportSchedule(usageDataExportSchedule)

        assertThat(dataExportScheduleUpdateResponse.operationalDataExportSchedule()).isEmpty
        assertThat(dataExportScheduleUpdateResponse.usageDataExportSchedule())
            .contains(usageDataExportSchedule)
    }
}
