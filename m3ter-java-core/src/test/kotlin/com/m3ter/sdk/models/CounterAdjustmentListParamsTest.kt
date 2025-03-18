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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("accountId", "accountId")
                    .put("counterId", "counterId")
                    .put("date", "date")
                    .put("dateEnd", "dateEnd")
                    .put("dateStart", "dateStart")
                    .put("endDateEnd", "endDateEnd")
                    .put("endDateStart", "endDateStart")
                    .put("nextToken", "nextToken")
                    .put("pageSize", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CounterAdjustmentListParams.builder().orgId("orgId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
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
