// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportScheduleUpdateParamsTest {

    @Test
    fun create() {
        DataExportScheduleUpdateParams.builder()
            .orgId("orgId")
            .id("id")
            .body(
                OperationalDataExportScheduleRequest.builder()
                    .addOperationalDataType(
                        OperationalDataExportScheduleRequest.OperationalDataType.BILLS
                    )
                    .sourceType(OperationalDataExportScheduleRequest.SourceType.OPERATIONAL)
                    .version(0L)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DataExportScheduleUpdateParams.builder()
                .id("id")
                .body(
                    OperationalDataExportScheduleRequest.builder()
                        .addOperationalDataType(
                            OperationalDataExportScheduleRequest.OperationalDataType.BILLS
                        )
                        .sourceType(OperationalDataExportScheduleRequest.SourceType.OPERATIONAL)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DataExportScheduleUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .body(
                    OperationalDataExportScheduleRequest.builder()
                        .addOperationalDataType(
                            OperationalDataExportScheduleRequest.OperationalDataType.BILLS
                        )
                        .sourceType(OperationalDataExportScheduleRequest.SourceType.OPERATIONAL)
                        .version(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                DataExportScheduleUpdateParams.Body.ofOperationalDataExportScheduleRequest(
                    OperationalDataExportScheduleRequest.builder()
                        .addOperationalDataType(
                            OperationalDataExportScheduleRequest.OperationalDataType.BILLS
                        )
                        .sourceType(OperationalDataExportScheduleRequest.SourceType.OPERATIONAL)
                        .version(0L)
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DataExportScheduleUpdateParams.builder()
                .id("id")
                .body(
                    OperationalDataExportScheduleRequest.builder()
                        .addOperationalDataType(
                            OperationalDataExportScheduleRequest.OperationalDataType.BILLS
                        )
                        .sourceType(OperationalDataExportScheduleRequest.SourceType.OPERATIONAL)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                DataExportScheduleUpdateParams.Body.ofOperationalDataExportScheduleRequest(
                    OperationalDataExportScheduleRequest.builder()
                        .addOperationalDataType(
                            OperationalDataExportScheduleRequest.OperationalDataType.BILLS
                        )
                        .sourceType(OperationalDataExportScheduleRequest.SourceType.OPERATIONAL)
                        .build()
                )
            )
    }
}
