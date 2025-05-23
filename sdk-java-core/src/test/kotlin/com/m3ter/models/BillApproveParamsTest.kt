// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillApproveParamsTest {

    @Test
    fun create() {
        BillApproveParams.builder()
            .orgId("orgId")
            .accountIds("accountIds")
            .externalInvoiceDateEnd("externalInvoiceDateEnd")
            .externalInvoiceDateStart("externalInvoiceDateStart")
            .addBillId("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params = BillApproveParams.builder().addBillId("string").build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            BillApproveParams.builder()
                .orgId("orgId")
                .accountIds("accountIds")
                .externalInvoiceDateEnd("externalInvoiceDateEnd")
                .externalInvoiceDateStart("externalInvoiceDateStart")
                .addBillId("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("accountIds", "accountIds")
                    .put("externalInvoiceDateEnd", "externalInvoiceDateEnd")
                    .put("externalInvoiceDateStart", "externalInvoiceDateStart")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BillApproveParams.builder().addBillId("string").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            BillApproveParams.builder()
                .orgId("orgId")
                .accountIds("accountIds")
                .externalInvoiceDateEnd("externalInvoiceDateEnd")
                .externalInvoiceDateStart("externalInvoiceDateStart")
                .addBillId("string")
                .build()

        val body = params._body()

        assertThat(body.billIds()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BillApproveParams.builder().addBillId("string").build()

        val body = params._body()

        assertThat(body.billIds()).containsExactly("string")
    }
}
