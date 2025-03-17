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
        val expected = QueryParams.builder()
        expected.put("accountId", "accountId")
        expected.put("billDate", "billDate")
        expected.put("billDateEnd", "billDateEnd")
        expected.put("billDateStart", "billDateStart")
        expected.put("billingFrequency", "billingFrequency")
        expected.put("excludeLineItems", "true")
        expected.put("externalInvoiceDateEnd", "externalInvoiceDateEnd")
        expected.put("externalInvoiceDateStart", "externalInvoiceDateStart")
        expected.put("ids", "string")
        expected.put("includeBillTotal", "true")
        expected.put("locked", "true")
        expected.put("nextToken", "nextToken")
        expected.put("pageSize", "1")
        expected.put("status", BillListParams.Status.PENDING.toString())
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BillListParams.builder().orgId("orgId").build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
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
