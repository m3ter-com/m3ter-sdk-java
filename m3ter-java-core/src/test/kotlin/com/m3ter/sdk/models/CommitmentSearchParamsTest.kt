// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CommitmentSearchParamsTest {

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
        val expected = QueryParams.builder()
        expected.put("fromDocument", "0")
        expected.put("operator", CommitmentSearchParams.Operator.AND.toString())
        expected.put("pageSize", "1")
        expected.put("searchQuery", "searchQuery")
        expected.put("sortBy", "sortBy")
        expected.put("sortOrder", CommitmentSearchParams.SortOrder.ASC.toString())
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CommitmentSearchParams.builder().orgId("orgId").build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params = CommitmentSearchParams.builder().orgId("orgId").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
