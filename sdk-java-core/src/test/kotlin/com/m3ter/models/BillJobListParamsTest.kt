// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillJobListParamsTest {

    @Test
    fun create() {
        BillJobListParams.builder()
            .orgId("orgId")
            .active("active")
            .nextToken("nextToken")
            .pageSize(1)
            .status("status")
            .build()
    }

    @Test
    fun pathParams() {
        val params = BillJobListParams.builder().build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            BillJobListParams.builder()
                .orgId("orgId")
                .active("active")
                .nextToken("nextToken")
                .pageSize(1)
                .status("status")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("active", "active")
                    .put("nextToken", "nextToken")
                    .put("pageSize", "1")
                    .put("status", "status")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BillJobListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
