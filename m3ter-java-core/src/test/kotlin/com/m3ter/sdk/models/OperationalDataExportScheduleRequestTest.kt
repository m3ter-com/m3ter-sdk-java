// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OperationalDataExportScheduleRequestTest {

    @Test
    fun create() {
        val operationalDataExportScheduleRequest =
            OperationalDataExportScheduleRequest.builder()
                .addOperationalDataType(
                    OperationalDataExportScheduleRequest.OperationalDataType.BILLS
                )
                .sourceType(OperationalDataExportScheduleRequest.SourceType.USAGE)
                .version(0L)
                .build()

        assertThat(operationalDataExportScheduleRequest.operationalDataTypes())
            .containsExactly(OperationalDataExportScheduleRequest.OperationalDataType.BILLS)
        assertThat(operationalDataExportScheduleRequest.sourceType())
            .isEqualTo(OperationalDataExportScheduleRequest.SourceType.USAGE)
        assertThat(operationalDataExportScheduleRequest.version()).contains(0L)
    }
}
