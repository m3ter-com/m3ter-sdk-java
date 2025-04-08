// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillJobRecalculateParamsTest {

    @Test
    fun create() {
        BillJobRecalculateParams.builder().orgId("orgId").addBillId("string").version(0L).build()
    }

    @Test
    fun pathParams() {
        val params = BillJobRecalculateParams.builder().addBillId("string").build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BillJobRecalculateParams.builder()
                .orgId("orgId")
                .addBillId("string")
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.billIds()).containsExactly("string")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BillJobRecalculateParams.builder().addBillId("string").build()

        val body = params._body()

        assertThat(body.billIds()).containsExactly("string")
    }
}
