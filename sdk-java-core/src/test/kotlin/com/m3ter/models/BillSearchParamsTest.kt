// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillSearchParamsTest {

    @Test
    fun create() {
        BillSearchParams.builder()
            .orgId("orgId")
            .fromDocument(0)
            .operator(BillSearchParams.Operator.AND)
            .pageSize(1)
            .searchQuery("searchQuery")
            .sortBy("sortBy")
            .sortOrder(BillSearchParams.SortOrder.ASC)
            .build()
    }

    @Test
    fun pathParams() {
        val params = BillSearchParams.builder().build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            BillSearchParams.builder()
                .orgId("orgId")
                .fromDocument(0)
                .operator(BillSearchParams.Operator.AND)
                .pageSize(1)
                .searchQuery("searchQuery")
                .sortBy("sortBy")
                .sortOrder(BillSearchParams.SortOrder.ASC)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("fromDocument", "0")
                    .put("operator", "AND")
                    .put("pageSize", "1")
                    .put("searchQuery", "searchQuery")
                    .put("sortBy", "sortBy")
                    .put("sortOrder", "ASC")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BillSearchParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
