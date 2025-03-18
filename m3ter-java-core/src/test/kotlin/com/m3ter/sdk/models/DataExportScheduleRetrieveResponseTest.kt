// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportScheduleRetrieveResponseTest {

    @Test
    fun ofOperationalDataExportSchedule() {
        val operationalDataExportSchedule =
            OperationalDataExportScheduleResponse.builder().id("id").version(0L).build()

        val dataExportScheduleRetrieveResponse =
            DataExportScheduleRetrieveResponse.ofOperationalDataExportSchedule(
                operationalDataExportSchedule
            )

        assertThat(dataExportScheduleRetrieveResponse.operationalDataExportSchedule())
            .contains(operationalDataExportSchedule)
        assertThat(dataExportScheduleRetrieveResponse.usageDataExportSchedule()).isEmpty
    }

    @Test
    fun ofUsageDataExportSchedule() {
        val usageDataExportSchedule =
            UsageDataExportScheduleResponse.builder().id("id").version(0L).build()

        val dataExportScheduleRetrieveResponse =
            DataExportScheduleRetrieveResponse.ofUsageDataExportSchedule(usageDataExportSchedule)

        assertThat(dataExportScheduleRetrieveResponse.operationalDataExportSchedule()).isEmpty
        assertThat(dataExportScheduleRetrieveResponse.usageDataExportSchedule())
            .contains(usageDataExportSchedule)
    }
}
