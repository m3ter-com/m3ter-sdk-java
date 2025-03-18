// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportJobListParamsTest {

    @Test
    fun create() {
        DataExportJobListParams.builder()
            .orgId("orgId")
            .dateCreatedEnd("dateCreatedEnd")
            .dateCreatedStart("dateCreatedStart")
            .addId("string")
            .nextToken("nextToken")
            .pageSize(1L)
            .scheduleId("scheduleId")
            .status(DataExportJobListParams.Status.PENDING)
            .build()
    }

    @Test
    fun pathParams() {
        val params = DataExportJobListParams.builder().orgId("orgId").build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            DataExportJobListParams.builder()
                .orgId("orgId")
                .dateCreatedEnd("dateCreatedEnd")
                .dateCreatedStart("dateCreatedStart")
                .addId("string")
                .nextToken("nextToken")
                .pageSize(1L)
                .scheduleId("scheduleId")
                .status(DataExportJobListParams.Status.PENDING)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("dateCreatedEnd", "dateCreatedEnd")
                    .put("dateCreatedStart", "dateCreatedStart")
                    .put("ids", listOf("string").joinToString(","))
                    .put("nextToken", "nextToken")
                    .put("pageSize", "1")
                    .put("scheduleId", "scheduleId")
                    .put("status", "PENDING")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DataExportJobListParams.builder().orgId("orgId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
