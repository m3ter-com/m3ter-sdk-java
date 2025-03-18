// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountSearchParamsTest {

    @Test
    fun create() {
        AccountSearchParams.builder()
            .orgId("orgId")
            .fromDocument(0L)
            .operator(AccountSearchParams.Operator.AND)
            .pageSize(1L)
            .searchQuery("searchQuery")
            .sortBy("sortBy")
            .sortOrder(AccountSearchParams.SortOrder.ASC)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AccountSearchParams.builder()
                .orgId("orgId")
                .fromDocument(0L)
                .operator(AccountSearchParams.Operator.AND)
                .pageSize(1L)
                .searchQuery("searchQuery")
                .sortBy("sortBy")
                .sortOrder(AccountSearchParams.SortOrder.ASC)
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
        val params = AccountSearchParams.builder().orgId("orgId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun getPathParam() {
        val params = AccountSearchParams.builder().orgId("orgId").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
