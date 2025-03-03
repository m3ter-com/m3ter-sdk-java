// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CurrencyCreateParamsTest {

    @Test
    fun create() {
        CurrencyCreateParams.builder()
            .orgId("orgId")
            .name("x")
            .archived(true)
            .code("code")
            .maxDecimalPlaces(0L)
            .roundingMode(CurrencyCreateParams.RoundingMode.UP)
            .version(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            CurrencyCreateParams.builder()
                .orgId("orgId")
                .name("x")
                .archived(true)
                .code("code")
                .maxDecimalPlaces(0L)
                .roundingMode(CurrencyCreateParams.RoundingMode.UP)
                .version(0L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.archived()).contains(true)
        assertThat(body.code()).contains("code")
        assertThat(body.maxDecimalPlaces()).contains(0L)
        assertThat(body.roundingMode()).contains(CurrencyCreateParams.RoundingMode.UP)
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CurrencyCreateParams.builder().orgId("orgId").name("x").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("x")
    }

    @Test
    fun getPathParam() {
        val params = CurrencyCreateParams.builder().orgId("orgId").name("x").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
