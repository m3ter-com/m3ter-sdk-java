// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillLatestByAccountParamsTest {

    @Test
    fun create() {
        BillLatestByAccountParams.builder().orgId("orgId").accountId("accountId").build()
    }

    @Test
    fun pathParams() {
        val params = BillLatestByAccountParams.builder().accountId("accountId").build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("accountId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
