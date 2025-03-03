// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BillLatestByAccountParamsTest {

    @Test
    fun create() {
        BillLatestByAccountParams.builder().orgId("orgId").accountId("accountId").build()
    }

    @Test
    fun getPathParam() {
        val params =
            BillLatestByAccountParams.builder().orgId("orgId").accountId("accountId").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "accountId"
        assertThat(params.getPathParam(1)).isEqualTo("accountId")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
