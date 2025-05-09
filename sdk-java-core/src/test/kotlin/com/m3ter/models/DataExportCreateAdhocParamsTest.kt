// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportCreateAdhocParamsTest {

    @Test
    fun create() {
        DataExportCreateAdhocParams.builder()
            .orgId("orgId")
            .body(
                AdHocOperationalDataRequest.builder()
                    .addOperationalDataType(AdHocOperationalDataRequest.OperationalDataType.BILLS)
                    .sourceType(AdHocOperationalDataRequest.SourceType.OPERATIONAL)
                    .version(0L)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DataExportCreateAdhocParams.builder()
                .body(
                    AdHocOperationalDataRequest.builder()
                        .addOperationalDataType(
                            AdHocOperationalDataRequest.OperationalDataType.BILLS
                        )
                        .sourceType(AdHocOperationalDataRequest.SourceType.OPERATIONAL)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DataExportCreateAdhocParams.builder()
                .orgId("orgId")
                .body(
                    AdHocOperationalDataRequest.builder()
                        .addOperationalDataType(
                            AdHocOperationalDataRequest.OperationalDataType.BILLS
                        )
                        .sourceType(AdHocOperationalDataRequest.SourceType.OPERATIONAL)
                        .version(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                DataExportCreateAdhocParams.Body.ofAdHocOperationalDataRequest(
                    AdHocOperationalDataRequest.builder()
                        .addOperationalDataType(
                            AdHocOperationalDataRequest.OperationalDataType.BILLS
                        )
                        .sourceType(AdHocOperationalDataRequest.SourceType.OPERATIONAL)
                        .version(0L)
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DataExportCreateAdhocParams.builder()
                .body(
                    AdHocOperationalDataRequest.builder()
                        .addOperationalDataType(
                            AdHocOperationalDataRequest.OperationalDataType.BILLS
                        )
                        .sourceType(AdHocOperationalDataRequest.SourceType.OPERATIONAL)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                DataExportCreateAdhocParams.Body.ofAdHocOperationalDataRequest(
                    AdHocOperationalDataRequest.builder()
                        .addOperationalDataType(
                            AdHocOperationalDataRequest.OperationalDataType.BILLS
                        )
                        .sourceType(AdHocOperationalDataRequest.SourceType.OPERATIONAL)
                        .build()
                )
            )
    }
}
