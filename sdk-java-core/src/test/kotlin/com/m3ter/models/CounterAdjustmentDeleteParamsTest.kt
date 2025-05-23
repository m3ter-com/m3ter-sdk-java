// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CounterAdjustmentDeleteParamsTest {

    @Test
    fun create() {
        CounterAdjustmentDeleteParams.builder().orgId("orgId").id("id").build()
    }

    @Test
    fun pathParams() {
        val params = CounterAdjustmentDeleteParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
