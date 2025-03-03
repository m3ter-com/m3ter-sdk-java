// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DataExportScheduleUpdateParamsTest {

    @Test
    fun create() {
        DataExportScheduleUpdateParams.builder()
            .orgId("orgId")
            .id("id")
            .body(
                DataExportScheduleUpdateParams.Body.UnionMember0.builder()
                    .addOperationalDataType(
                        DataExportScheduleUpdateParams.Body.UnionMember0.OperationalDataType.BILLS
                    )
                    .sourceType(DataExportScheduleUpdateParams.Body.UnionMember0.SourceType.USAGE)
                    .version(0L)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            DataExportScheduleUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .body(
                    DataExportScheduleUpdateParams.Body.UnionMember0.builder()
                        .addOperationalDataType(
                            DataExportScheduleUpdateParams.Body.UnionMember0.OperationalDataType
                                .BILLS
                        )
                        .sourceType(
                            DataExportScheduleUpdateParams.Body.UnionMember0.SourceType.USAGE
                        )
                        .version(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                DataExportScheduleUpdateParams.Body.ofUnionMember0(
                    DataExportScheduleUpdateParams.Body.UnionMember0.builder()
                        .addOperationalDataType(
                            DataExportScheduleUpdateParams.Body.UnionMember0.OperationalDataType
                                .BILLS
                        )
                        .sourceType(
                            DataExportScheduleUpdateParams.Body.UnionMember0.SourceType.USAGE
                        )
                        .version(0L)
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DataExportScheduleUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .body(
                    DataExportScheduleUpdateParams.Body.UnionMember0.builder()
                        .addOperationalDataType(
                            DataExportScheduleUpdateParams.Body.UnionMember0.OperationalDataType
                                .BILLS
                        )
                        .sourceType(
                            DataExportScheduleUpdateParams.Body.UnionMember0.SourceType.USAGE
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                DataExportScheduleUpdateParams.Body.ofUnionMember0(
                    DataExportScheduleUpdateParams.Body.UnionMember0.builder()
                        .addOperationalDataType(
                            DataExportScheduleUpdateParams.Body.UnionMember0.OperationalDataType
                                .BILLS
                        )
                        .sourceType(
                            DataExportScheduleUpdateParams.Body.UnionMember0.SourceType.USAGE
                        )
                        .build()
                )
            )
    }

    @Test
    fun getPathParam() {
        val params =
            DataExportScheduleUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .body(
                    DataExportScheduleUpdateParams.Body.UnionMember0.builder()
                        .addOperationalDataType(
                            DataExportScheduleUpdateParams.Body.UnionMember0.OperationalDataType
                                .BILLS
                        )
                        .sourceType(
                            DataExportScheduleUpdateParams.Body.UnionMember0.SourceType.USAGE
                        )
                        .build()
                )
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "id"
        assertThat(params.getPathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
