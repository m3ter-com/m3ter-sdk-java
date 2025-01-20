// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CounterCreateParamsTest {

    @Test
    fun createCounterCreateParams() {
        CounterCreateParams.builder().orgId("orgId").version(0L).build()
    }

    @Test
    fun getBody() {
        val params = CounterCreateParams.builder().orgId("orgId").version(0L).build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = CounterCreateParams.builder().orgId("orgId").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = CounterCreateParams.builder().orgId("orgId").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
