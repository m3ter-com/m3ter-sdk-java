// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceListParamsTest {

    @Test
    fun create() {
        BalanceListParams.builder()
            .orgId("orgId")
            .accountId("accountId")
            .endDateEnd("endDateEnd")
            .endDateStart("endDateStart")
            .nextToken("nextToken")
            .pageSize(1L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = BalanceListParams.builder().build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            BalanceListParams.builder()
                .orgId("orgId")
                .accountId("accountId")
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
                    .put("endDateEnd", "endDateEnd")
                    .put("endDateStart", "endDateStart")
                    .put("nextToken", "nextToken")
                    .put("pageSize", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BalanceListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
