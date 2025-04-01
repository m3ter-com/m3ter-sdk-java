// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportScheduleCreateParamsTest {

    @Test
    fun create() {
        DataExportScheduleCreateParams.builder()
            .orgId("orgId")
            .body(
                OperationalDataExportScheduleRequest.builder()
                    .addOperationalDataType(
                        OperationalDataExportScheduleRequest.OperationalDataType.BILLS
                    )
                    .sourceType(OperationalDataExportScheduleRequest.SourceType.USAGE)
                    .version(0L)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DataExportScheduleCreateParams.builder()
                .orgId("orgId")
                .body(
                    OperationalDataExportScheduleRequest.builder()
                        .addOperationalDataType(
                            OperationalDataExportScheduleRequest.OperationalDataType.BILLS
                        )
                        .sourceType(OperationalDataExportScheduleRequest.SourceType.USAGE)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DataExportScheduleCreateParams.builder()
                .orgId("orgId")
                .body(
                    OperationalDataExportScheduleRequest.builder()
                        .addOperationalDataType(
                            OperationalDataExportScheduleRequest.OperationalDataType.BILLS
                        )
                        .sourceType(OperationalDataExportScheduleRequest.SourceType.USAGE)
                        .version(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                DataExportScheduleCreateParams.Body.ofOperationalDataExportScheduleRequest(
                    OperationalDataExportScheduleRequest.builder()
                        .addOperationalDataType(
                            OperationalDataExportScheduleRequest.OperationalDataType.BILLS
                        )
                        .sourceType(OperationalDataExportScheduleRequest.SourceType.USAGE)
                        .version(0L)
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DataExportScheduleCreateParams.builder()
                .orgId("orgId")
                .body(
                    OperationalDataExportScheduleRequest.builder()
                        .addOperationalDataType(
                            OperationalDataExportScheduleRequest.OperationalDataType.BILLS
                        )
                        .sourceType(OperationalDataExportScheduleRequest.SourceType.USAGE)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                DataExportScheduleCreateParams.Body.ofOperationalDataExportScheduleRequest(
                    OperationalDataExportScheduleRequest.builder()
                        .addOperationalDataType(
                            OperationalDataExportScheduleRequest.OperationalDataType.BILLS
                        )
                        .sourceType(OperationalDataExportScheduleRequest.SourceType.USAGE)
                        .build()
                )
            )
    }
}
