// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DataExportCreateAdhocParamsTest {

    @Test
    fun create() {
        DataExportCreateAdhocParams.builder()
            .forAdHocOperationalDataRequest(
                AdHocOperationalDataRequest.builder()
                    .operationalDataTypes(
                        listOf(AdHocOperationalDataRequest.OperationalDataType.BILLS)
                    )
                    .sourceType(AdHocOperationalDataRequest.SourceType.USAGE)
                    .version(0L)
                    .build()
            )
            .orgId("orgId")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            DataExportCreateAdhocParams.builder()
                .forAdHocOperationalDataRequest(
                    AdHocOperationalDataRequest.builder()
                        .operationalDataTypes(
                            listOf(AdHocOperationalDataRequest.OperationalDataType.BILLS)
                        )
                        .sourceType(AdHocOperationalDataRequest.SourceType.USAGE)
                        .build()
                )
                .orgId("orgId")
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
