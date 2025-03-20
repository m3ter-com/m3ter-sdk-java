// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrencyUpdateParamsTest {

    @Test
    fun create() {
        CurrencyUpdateParams.builder()
            .orgId("orgId")
            .id("id")
            .name("x")
            .archived(true)
            .code("code")
            .maxDecimalPlaces(0L)
            .roundingMode(CurrencyUpdateParams.RoundingMode.UP)
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = CurrencyUpdateParams.builder().orgId("orgId").id("id").name("x").build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        assertThat(params._pathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CurrencyUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .name("x")
                .archived(true)
                .code("code")
                .maxDecimalPlaces(0L)
                .roundingMode(CurrencyUpdateParams.RoundingMode.UP)
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
        assertThat(body.archived()).contains(true)
        assertThat(body.code()).contains("code")
        assertThat(body.maxDecimalPlaces()).contains(0L)
        assertThat(body.roundingMode()).contains(CurrencyUpdateParams.RoundingMode.UP)
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CurrencyUpdateParams.builder().orgId("orgId").id("id").name("x").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
    }
}
