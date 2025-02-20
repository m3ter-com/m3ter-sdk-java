// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DataExportCreateAdhocParamsTest {

    @Test
    fun create() {
        DataExportCreateAdhocParams.builder()
            .orgId("orgId")
            .body(
                AdHocOperationalDataRequest.builder()
                    .addOperationalDataType(AdHocOperationalDataRequest.OperationalDataType.BILLS)
                    .sourceType(AdHocOperationalDataRequest.SourceType.USAGE)
                    .version(0L)
                    .build()
            )
            .build()
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
                        .sourceType(AdHocOperationalDataRequest.SourceType.USAGE)
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
                        .sourceType(AdHocOperationalDataRequest.SourceType.USAGE)
                        .version(0L)
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DataExportCreateAdhocParams.builder()
                .orgId("orgId")
                .body(
                    AdHocOperationalDataRequest.builder()
                        .addOperationalDataType(
                            AdHocOperationalDataRequest.OperationalDataType.BILLS
                        )
                        .sourceType(AdHocOperationalDataRequest.SourceType.USAGE)
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
                        .sourceType(AdHocOperationalDataRequest.SourceType.USAGE)
                        .build()
                )
            )
    }

    @Test
    fun getPathParam() {
        val params =
            DataExportCreateAdhocParams.builder()
                .orgId("orgId")
                .body(
                    AdHocOperationalDataRequest.builder()
                        .addOperationalDataType(
                            AdHocOperationalDataRequest.OperationalDataType.BILLS
                        )
                        .sourceType(AdHocOperationalDataRequest.SourceType.USAGE)
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
