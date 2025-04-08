// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.http.QueryParams
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
    fun pathParams() {
        val params = BillListParams.builder().build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
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
        val params = BillListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
