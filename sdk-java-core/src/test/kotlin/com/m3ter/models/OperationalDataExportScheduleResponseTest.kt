// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OperationalDataExportScheduleResponseTest {

    @Test
    fun create() {
        val operationalDataExportScheduleResponse =
            OperationalDataExportScheduleResponse.builder()
                .id("id")
                .version(0L)
                .addOperationalDataType(
                    OperationalDataExportScheduleResponse.OperationalDataType.BILLS
                )
                .build()

        assertThat(operationalDataExportScheduleResponse.id()).isEqualTo("id")
        assertThat(operationalDataExportScheduleResponse.version()).isEqualTo(0L)
        assertThat(operationalDataExportScheduleResponse.operationalDataTypes().getOrNull())
            .containsExactly(OperationalDataExportScheduleResponse.OperationalDataType.BILLS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val operationalDataExportScheduleResponse =
            OperationalDataExportScheduleResponse.builder()
                .id("id")
                .version(0L)
                .addOperationalDataType(
                    OperationalDataExportScheduleResponse.OperationalDataType.BILLS
                )
                .build()

        val roundtrippedOperationalDataExportScheduleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(operationalDataExportScheduleResponse),
                jacksonTypeRef<OperationalDataExportScheduleResponse>(),
            )

        assertThat(roundtrippedOperationalDataExportScheduleResponse)
            .isEqualTo(operationalDataExportScheduleResponse)
    }
}
