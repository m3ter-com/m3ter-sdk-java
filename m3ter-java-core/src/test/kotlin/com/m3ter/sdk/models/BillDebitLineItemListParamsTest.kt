// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillDebitLineItemListParamsTest {

    @Test
    fun create() {
        BillDebitLineItemListParams.builder()
            .orgId("orgId")
            .billId("billId")
            .nextToken("nextToken")
            .pageSize(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BillDebitLineItemListParams.builder()
                .orgId("orgId")
                .billId("billId")
                .nextToken("nextToken")
                .pageSize(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("nextToken", "nextToken").put("pageSize", "1").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BillDebitLineItemListParams.builder().orgId("orgId").billId("billId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun getPathParam() {
        val params = BillDebitLineItemListParams.builder().orgId("orgId").billId("billId").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "billId"
        assertThat(params.getPathParam(1)).isEqualTo("billId")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
