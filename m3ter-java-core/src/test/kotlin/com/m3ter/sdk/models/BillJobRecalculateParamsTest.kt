// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BillJobRecalculateParamsTest {

    @Test
    fun create() {
        BillJobRecalculateParams.builder().orgId("orgId").addBillId("string").version(0L).build()
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

        assertNotNull(body)
        assertThat(body.billIds()).isEqualTo(listOf("string"))
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BillJobRecalculateParams.builder().orgId("orgId").addBillId("string").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.billIds()).isEqualTo(listOf("string"))
    }

    @Test
    fun getPathParam() {
        val params = BillJobRecalculateParams.builder().orgId("orgId").addBillId("string").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
