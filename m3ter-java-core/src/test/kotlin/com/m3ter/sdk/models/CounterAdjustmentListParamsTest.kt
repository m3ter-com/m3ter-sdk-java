// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CounterAdjustmentListParamsTest {

    @Test
    fun create() {
        CounterAdjustmentListParams.builder()
            .orgId("orgId")
            .accountId("accountId")
            .counterId("counterId")
            .date("date")
            .dateEnd("dateEnd")
            .dateStart("dateStart")
            .endDateEnd("endDateEnd")
            .endDateStart("endDateStart")
            .nextToken("nextToken")
            .pageSize(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CounterAdjustmentListParams.builder()
                .orgId("orgId")
                .accountId("accountId")
                .counterId("counterId")
                .date("date")
                .dateEnd("dateEnd")
                .dateStart("dateStart")
                .endDateEnd("endDateEnd")
                .endDateStart("endDateStart")
                .nextToken("nextToken")
                .pageSize(1L)
                .build()
        val expected = QueryParams.builder()
        expected.put("accountId", "accountId")
        expected.put("counterId", "counterId")
        expected.put("date", "date")
        expected.put("dateEnd", "dateEnd")
        expected.put("dateStart", "dateStart")
        expected.put("endDateEnd", "endDateEnd")
        expected.put("endDateStart", "endDateStart")
        expected.put("nextToken", "nextToken")
        expected.put("pageSize", "1")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CounterAdjustmentListParams.builder().orgId("orgId").build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params = CounterAdjustmentListParams.builder().orgId("orgId").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
