// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrencyConversionTest {

    @Test
    fun create() {
        val currencyConversion =
            CurrencyConversion.builder().from("EUR").to("USD").multiplier(1.12).build()

        assertThat(currencyConversion.from()).isEqualTo("EUR")
        assertThat(currencyConversion.to()).isEqualTo("USD")
        assertThat(currencyConversion.multiplier()).contains(1.12)
    }
}
