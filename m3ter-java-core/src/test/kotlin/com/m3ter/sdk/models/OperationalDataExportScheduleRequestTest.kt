// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OperationalDataExportScheduleRequestTest {

    @Test
    fun createOperationalDataExportScheduleRequest() {
        val operationalDataExportScheduleRequest =
            OperationalDataExportScheduleRequest.builder()
                .addOperationalDataType(
                    OperationalDataExportScheduleRequest.OperationalDataType.BILLS
                )
                .sourceType(OperationalDataExportScheduleRequest.SourceType.USAGE)
                .version(0L)
                .build()
        assertThat(operationalDataExportScheduleRequest).isNotNull
        assertThat(operationalDataExportScheduleRequest.operationalDataTypes())
            .containsExactly(OperationalDataExportScheduleRequest.OperationalDataType.BILLS)
        assertThat(operationalDataExportScheduleRequest.sourceType())
            .isEqualTo(OperationalDataExportScheduleRequest.SourceType.USAGE)
        assertThat(operationalDataExportScheduleRequest.version()).contains(0L)
    }
}
