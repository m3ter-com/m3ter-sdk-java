// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillListParamsTest {

    @Test
    fun create() {
        BillListParams.builder()
            .orgId("orgId")
            .accountId("accountId")
            .billDate("billDate")
            .billDateEnd("billDateEnd")
            .billDateStart("billDateStart")
            .billingFrequency("billingFrequency")
            .excludeLineItems(true)
            .externalInvoiceDateEnd("externalInvoiceDateEnd")
            .externalInvoiceDateStart("externalInvoiceDateStart")
            .addId("string")
            .includeBillTotal(true)
            .locked(true)
            .nextToken("nextToken")
            .pageSize(1L)
            .status(BillListParams.Status.PENDING)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BillListParams.builder()
                .orgId("orgId")
                .accountId("accountId")
                .billDate("billDate")
                .billDateEnd("billDateEnd")
                .billDateStart("billDateStart")
                .billingFrequency("billingFrequency")
                .excludeLineItems(true)
                .externalInvoiceDateEnd("externalInvoiceDateEnd")
                .externalInvoiceDateStart("externalInvoiceDateStart")
                .addId("string")
                .includeBillTotal(true)
                .locked(true)
                .nextToken("nextToken")
                .pageSize(1L)
                .status(BillListParams.Status.PENDING)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("accountId", "accountId")
                    .put("billDate", "billDate")
                    .put("billDateEnd", "billDateEnd")
                    .put("billDateStart", "billDateStart")
                    .put("billingFrequency", "billingFrequency")
                    .put("excludeLineItems", "true")
                    .put("externalInvoiceDateEnd", "externalInvoiceDateEnd")
                    .put("externalInvoiceDateStart", "externalInvoiceDateStart")
                    .put("ids", listOf("string").joinToString(","))
                    .put("includeBillTotal", "true")
                    .put("locked", "true")
                    .put("nextToken", "nextToken")
                    .put("pageSize", "1")
                    .put("status", "PENDING")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BillListParams.builder().orgId("orgId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun getPathParam() {
        val params = BillListParams.builder().orgId("orgId").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
