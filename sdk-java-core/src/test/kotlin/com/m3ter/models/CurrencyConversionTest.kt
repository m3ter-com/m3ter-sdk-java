// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val currencyConversion =
            CurrencyConversion.builder().from("EUR").to("USD").multiplier(1.12).build()

        val roundtrippedCurrencyConversion =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(currencyConversion),
                jacksonTypeRef<CurrencyConversion>(),
            )

        assertThat(roundtrippedCurrencyConversion).isEqualTo(currencyConversion)
    }
}
