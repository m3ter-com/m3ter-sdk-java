// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DataExportJobListParamsTest {

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
        val expected = QueryParams.builder()
        expected.put("dateCreatedEnd", "dateCreatedEnd")
        expected.put("dateCreatedStart", "dateCreatedStart")
        expected.put("ids", "string")
        expected.put("nextToken", "nextToken")
        expected.put("pageSize", "1")
        expected.put("scheduleId", "scheduleId")
        expected.put("status", DataExportJobListParams.Status.PENDING.toString())
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DataExportJobListParams.builder().orgId("orgId").build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params = DataExportJobListParams.builder().orgId("orgId").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
