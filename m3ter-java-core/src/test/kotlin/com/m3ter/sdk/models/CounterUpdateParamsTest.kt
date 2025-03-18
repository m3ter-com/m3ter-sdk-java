// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CounterUpdateParamsTest {

    @Test
    fun create() {
        CounterUpdateParams.builder()
            .orgId("orgId")
            .id("id")
            .name("x")
            .unit("x")
            .code("JS!?Q0]r] ]\$]")
            .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CounterUpdateParams.builder().orgId("orgId").id("id").name("x").unit("x").build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        assertThat(params._pathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CounterUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .name("x")
                .unit("x")
                .code("JS!?Q0]r] ]\$]")
                .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .version(0L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.unit()).isEqualTo("x")
        assertThat(body.code()).contains("JS!?Q0]r] ]\$]")
        assertThat(body.productId()).contains("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CounterUpdateParams.builder().orgId("orgId").id("id").name("x").unit("x").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.unit()).isEqualTo("x")
    }
}
