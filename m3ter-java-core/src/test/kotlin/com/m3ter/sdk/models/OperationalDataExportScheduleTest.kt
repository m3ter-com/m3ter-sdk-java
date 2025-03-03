// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OperationalDataExportScheduleTest {

    @Test
    fun createOperationalDataExportSchedule() {
        val operationalDataExportSchedule =
            OperationalDataExportSchedule.builder()
                .id("id")
                .version(0L)
                .addOperationalDataType(OperationalDataExportSchedule.OperationalDataType.BILLS)
                .build()
        assertThat(operationalDataExportSchedule).isNotNull
        assertThat(operationalDataExportSchedule.id()).isEqualTo("id")
        assertThat(operationalDataExportSchedule.version()).isEqualTo(0L)
        assertThat(operationalDataExportSchedule.operationalDataTypes().get())
            .containsExactly(OperationalDataExportSchedule.OperationalDataType.BILLS)
    }
}
