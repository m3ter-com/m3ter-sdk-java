// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OperationalDataExportScheduleResponseTest {

    @Test
    fun createOperationalDataExportScheduleResponse() {
        val operationalDataExportScheduleResponse =
            OperationalDataExportScheduleResponse.builder()
                .id("id")
                .version(0L)
                .addOperationalDataType(
                    OperationalDataExportScheduleResponse.OperationalDataType.BILLS
                )
                .build()
        assertThat(operationalDataExportScheduleResponse).isNotNull
        assertThat(operationalDataExportScheduleResponse.id()).isEqualTo("id")
        assertThat(operationalDataExportScheduleResponse.version()).isEqualTo(0L)
        assertThat(operationalDataExportScheduleResponse.operationalDataTypes().get())
            .containsExactly(OperationalDataExportScheduleResponse.OperationalDataType.BILLS)
    }
}
