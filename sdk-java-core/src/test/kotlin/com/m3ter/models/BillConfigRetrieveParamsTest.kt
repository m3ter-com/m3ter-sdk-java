// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillConfigRetrieveParamsTest {

    @Test
    fun create() {
        BillConfigRetrieveParams.builder().orgId("orgId").build()
    }

    @Test
    fun pathParams() {
        val params = BillConfigRetrieveParams.builder().build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
