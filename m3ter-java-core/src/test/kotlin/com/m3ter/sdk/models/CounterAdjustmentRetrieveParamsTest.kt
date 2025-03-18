// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CounterAdjustmentRetrieveParamsTest {

    @Test
    fun create() {
        CounterAdjustmentRetrieveParams.builder().orgId("orgId").id("id").build()
    }

    @Test
    fun pathParams() {
        val params = CounterAdjustmentRetrieveParams.builder().orgId("orgId").id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        assertThat(params._pathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
