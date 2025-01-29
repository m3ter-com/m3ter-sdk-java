// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CounterUpdateParamsTest {

    @Test
    fun createCounterUpdateParams() {
        CounterUpdateParams.builder().orgId("orgId").id("id").version(0L).build()
    }

    @Test
    fun body() {
        val params = CounterUpdateParams.builder().orgId("orgId").id("id").version(0L).build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CounterUpdateParams.builder().orgId("orgId").id("id").build()
        val body = params._body()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = CounterUpdateParams.builder().orgId("orgId").id("id").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "id"
        assertThat(params.getPathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
