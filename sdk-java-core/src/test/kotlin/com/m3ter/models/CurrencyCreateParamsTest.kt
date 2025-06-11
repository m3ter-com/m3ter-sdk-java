// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrencyCreateParamsTest {

    @Test
    fun create() {
        CurrencyCreateParams.builder()
            .orgId("orgId")
            .name("x")
            .archived(true)
            .code("code")
            .maxDecimalPlaces(2)
            .roundingMode(CurrencyCreateParams.RoundingMode.UP)
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = CurrencyCreateParams.builder().name("x").build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CurrencyCreateParams.builder()
                .orgId("orgId")
                .name("x")
                .archived(true)
                .code("code")
                .maxDecimalPlaces(2)
                .roundingMode(CurrencyCreateParams.RoundingMode.UP)
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
        assertThat(body.archived()).contains(true)
        assertThat(body.code()).contains("code")
        assertThat(body.maxDecimalPlaces()).contains(2)
        assertThat(body.roundingMode()).contains(CurrencyCreateParams.RoundingMode.UP)
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CurrencyCreateParams.builder().name("x").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
    }
}
