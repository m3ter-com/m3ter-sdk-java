// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DataExportScheduleCreateParamsTest {

    @Test
    fun create() {
        DataExportScheduleCreateParams.builder()
            .orgId("orgId")
            .body(
                DataExportScheduleCreateParams.Body.UnionMember0.builder()
                    .addOperationalDataType(
                        DataExportScheduleCreateParams.Body.UnionMember0.OperationalDataType.BILLS
                    )
                    .sourceType(DataExportScheduleCreateParams.Body.UnionMember0.SourceType.USAGE)
                    .version(0L)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            DataExportScheduleCreateParams.builder()
                .orgId("orgId")
                .body(
                    DataExportScheduleCreateParams.Body.UnionMember0.builder()
                        .addOperationalDataType(
                            DataExportScheduleCreateParams.Body.UnionMember0.OperationalDataType
                                .BILLS
                        )
                        .sourceType(
                            DataExportScheduleCreateParams.Body.UnionMember0.SourceType.USAGE
                        )
                        .version(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                DataExportScheduleCreateParams.Body.ofUnionMember0(
                    DataExportScheduleCreateParams.Body.UnionMember0.builder()
                        .addOperationalDataType(
                            DataExportScheduleCreateParams.Body.UnionMember0.OperationalDataType
                                .BILLS
                        )
                        .sourceType(
                            DataExportScheduleCreateParams.Body.UnionMember0.SourceType.USAGE
                        )
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
                    DataExportScheduleCreateParams.Body.UnionMember0.builder()
                        .addOperationalDataType(
                            DataExportScheduleCreateParams.Body.UnionMember0.OperationalDataType
                                .BILLS
                        )
                        .sourceType(
                            DataExportScheduleCreateParams.Body.UnionMember0.SourceType.USAGE
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                DataExportScheduleCreateParams.Body.ofUnionMember0(
                    DataExportScheduleCreateParams.Body.UnionMember0.builder()
                        .addOperationalDataType(
                            DataExportScheduleCreateParams.Body.UnionMember0.OperationalDataType
                                .BILLS
                        )
                        .sourceType(
                            DataExportScheduleCreateParams.Body.UnionMember0.SourceType.USAGE
                        )
                        .build()
                )
            )
    }

    @Test
    fun getPathParam() {
        val params =
            DataExportScheduleCreateParams.builder()
                .orgId("orgId")
                .body(
                    DataExportScheduleCreateParams.Body.UnionMember0.builder()
                        .addOperationalDataType(
                            DataExportScheduleCreateParams.Body.UnionMember0.OperationalDataType
                                .BILLS
                        )
                        .sourceType(
                            DataExportScheduleCreateParams.Body.UnionMember0.SourceType.USAGE
                        )
                        .build()
                )
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
