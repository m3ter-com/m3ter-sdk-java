// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportScheduleCreateResponseTest {

    @Test
    fun ofOperationalDataExportSchedule() {
        val operationalDataExportSchedule =
            OperationalDataExportScheduleResponse.builder().id("id").version(0L).build()

        val dataExportScheduleCreateResponse =
            DataExportScheduleCreateResponse.ofOperationalDataExportSchedule(
                operationalDataExportSchedule
            )

        assertThat(dataExportScheduleCreateResponse.operationalDataExportSchedule())
            .contains(operationalDataExportSchedule)
        assertThat(dataExportScheduleCreateResponse.usageDataExportSchedule()).isEmpty
    }

    @Test
    fun ofUsageDataExportSchedule() {
        val usageDataExportSchedule =
            UsageDataExportScheduleResponse.builder().id("id").version(0L).build()

        val dataExportScheduleCreateResponse =
            DataExportScheduleCreateResponse.ofUsageDataExportSchedule(usageDataExportSchedule)

        assertThat(dataExportScheduleCreateResponse.operationalDataExportSchedule()).isEmpty
        assertThat(dataExportScheduleCreateResponse.usageDataExportSchedule())
            .contains(usageDataExportSchedule)
    }
}
