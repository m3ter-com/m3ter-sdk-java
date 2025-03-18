// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import kotlin.test.assertNotNull
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
        val params = BillApproveParams.builder().orgId("orgId").addBillId("string").build()

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

        assertNotNull(body)
        assertThat(body.billIds()).isEqualTo(listOf("string"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BillApproveParams.builder().orgId("orgId").addBillId("string").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.billIds()).isEqualTo(listOf("string"))
    }

    @Test
    fun getPathParam() {
        val params = BillApproveParams.builder().orgId("orgId").addBillId("string").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
