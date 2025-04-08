// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DebitReasonUpdateParamsTest {

    @Test
    fun create() {
        DebitReasonUpdateParams.builder()
            .orgId("orgId")
            .id("id")
            .name("x")
            .archived(true)
            .code("code")
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = DebitReasonUpdateParams.builder().id("id").name("x").build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DebitReasonUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .name("x")
                .archived(true)
                .code("code")
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
        assertThat(body.archived()).contains(true)
        assertThat(body.code()).contains("code")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = DebitReasonUpdateParams.builder().id("id").name("x").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
    }
}
