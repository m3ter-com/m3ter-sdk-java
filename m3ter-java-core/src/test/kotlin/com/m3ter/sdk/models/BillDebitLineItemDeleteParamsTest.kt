// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillDebitLineItemDeleteParamsTest {

    @Test
    fun create() {
        BillDebitLineItemDeleteParams.builder().orgId("orgId").billId("billId").id("id").build()
    }

    @Test
    fun pathParams() {
        val params =
            BillDebitLineItemDeleteParams.builder().orgId("orgId").billId("billId").id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        assertThat(params._pathParam(1)).isEqualTo("billId")
        assertThat(params._pathParam(2)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }
}
