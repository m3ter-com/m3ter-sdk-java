// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportScheduleDeleteResponseTest {

    @Test
    fun ofOperationalDataExportSchedule() {
        val operationalDataExportSchedule =
            OperationalDataExportScheduleResponse.builder().id("id").version(0L).build()

        val dataExportScheduleDeleteResponse =
            DataExportScheduleDeleteResponse.ofOperationalDataExportSchedule(
                operationalDataExportSchedule
            )

        assertThat(dataExportScheduleDeleteResponse.operationalDataExportSchedule())
            .contains(operationalDataExportSchedule)
        assertThat(dataExportScheduleDeleteResponse.usageDataExportSchedule()).isEmpty
    }

    @Test
    fun ofUsageDataExportSchedule() {
        val usageDataExportSchedule =
            UsageDataExportScheduleResponse.builder().id("id").version(0L).build()

        val dataExportScheduleDeleteResponse =
            DataExportScheduleDeleteResponse.ofUsageDataExportSchedule(usageDataExportSchedule)

        assertThat(dataExportScheduleDeleteResponse.operationalDataExportSchedule()).isEmpty
        assertThat(dataExportScheduleDeleteResponse.usageDataExportSchedule())
            .contains(usageDataExportSchedule)
    }
}
