// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CounterCreateParamsTest {

    @Test
    fun create() {
        CounterCreateParams.builder()
            .orgId("orgId")
            .name("x")
            .unit("x")
            .code("JS!?Q0]r] ]\$]")
            .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = CounterCreateParams.builder().orgId("orgId").name("x").unit("x").build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CounterCreateParams.builder()
                .orgId("orgId")
                .name("x")
                .unit("x")
                .code("JS!?Q0]r] ]\$]")
                .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
        assertThat(body.unit()).isEqualTo("x")
        assertThat(body.code()).contains("JS!?Q0]r] ]\$]")
        assertThat(body.productId()).contains("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CounterCreateParams.builder().orgId("orgId").name("x").unit("x").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
        assertThat(body.unit()).isEqualTo("x")
    }
}
