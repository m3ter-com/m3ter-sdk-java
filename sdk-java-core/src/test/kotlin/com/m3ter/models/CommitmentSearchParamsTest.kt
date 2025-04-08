// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommitmentSearchParamsTest {

    @Test
    fun create() {
        CommitmentSearchParams.builder()
            .orgId("orgId")
            .fromDocument(0L)
            .operator(CommitmentSearchParams.Operator.AND)
            .pageSize(1L)
            .searchQuery("searchQuery")
            .sortBy("sortBy")
            .sortOrder(CommitmentSearchParams.SortOrder.ASC)
            .build()
    }

    @Test
    fun pathParams() {
        val params = CommitmentSearchParams.builder().orgId("orgId").build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CommitmentSearchParams.builder()
                .orgId("orgId")
                .fromDocument(0L)
                .operator(CommitmentSearchParams.Operator.AND)
                .pageSize(1L)
                .searchQuery("searchQuery")
                .sortBy("sortBy")
                .sortOrder(CommitmentSearchParams.SortOrder.ASC)
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
        val params = CommitmentSearchParams.builder().orgId("orgId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
