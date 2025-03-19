// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommitmentListParamsTest {

    @Test
    fun create() {
        CommitmentListParams.builder()
            .orgId("orgId")
            .accountId("accountId")
            .contractId("contractId")
            .date("date")
            .endDateEnd("endDateEnd")
            .endDateStart("endDateStart")
            .addId("string")
            .nextToken("nextToken")
            .pageSize(1L)
            .productId("productId")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CommitmentListParams.builder()
                .orgId("orgId")
                .accountId("accountId")
                .contractId("contractId")
                .date("date")
                .endDateEnd("endDateEnd")
                .endDateStart("endDateStart")
                .addId("string")
                .nextToken("nextToken")
                .pageSize(1L)
                .productId("productId")
                .build()
        val expected = QueryParams.builder()
        expected.put("accountId", "accountId")
        expected.put("contractId", "contractId")
        expected.put("date", "date")
        expected.put("endDateEnd", "endDateEnd")
        expected.put("endDateStart", "endDateStart")
        expected.put("ids", "string")
        expected.put("nextToken", "nextToken")
        expected.put("pageSize", "1")
        expected.put("productId", "productId")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CommitmentListParams.builder().orgId("orgId").build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params = CommitmentListParams.builder().orgId("orgId").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
