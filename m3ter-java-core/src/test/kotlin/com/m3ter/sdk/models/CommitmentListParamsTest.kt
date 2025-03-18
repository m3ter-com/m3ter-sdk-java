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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("accountId", "accountId")
                    .put("contractId", "contractId")
                    .put("date", "date")
                    .put("endDateEnd", "endDateEnd")
                    .put("endDateStart", "endDateStart")
                    .put("ids", listOf("string").joinToString(","))
                    .put("nextToken", "nextToken")
                    .put("pageSize", "1")
                    .put("productId", "productId")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CommitmentListParams.builder().orgId("orgId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
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
