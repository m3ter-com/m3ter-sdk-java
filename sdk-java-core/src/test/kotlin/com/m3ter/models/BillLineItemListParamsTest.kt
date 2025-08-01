// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillLineItemListParamsTest {

    @Test
    fun create() {
        BillLineItemListParams.builder()
            .orgId("orgId")
            .billId("billId")
            .addAdditional("string")
            .nextToken("nextToken")
            .pageSize(1)
            .build()
    }

    @Test
    fun pathParams() {
        val params = BillLineItemListParams.builder().billId("billId").build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("billId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            BillLineItemListParams.builder()
                .orgId("orgId")
                .billId("billId")
                .addAdditional("string")
                .nextToken("nextToken")
                .pageSize(1)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("additional", listOf("string").joinToString(","))
                    .put("nextToken", "nextToken")
                    .put("pageSize", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BillLineItemListParams.builder().billId("billId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
