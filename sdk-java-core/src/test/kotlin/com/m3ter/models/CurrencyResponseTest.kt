// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrencyResponseTest {

    @Test
    fun create() {
        val currencyResponse =
            CurrencyResponse.builder()
                .id("id")
                .version(0L)
                .archived(true)
                .code("code")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .maxDecimalPlaces(0)
                .name("name")
                .roundingMode(CurrencyResponse.RoundingMode.UP)
                .build()

        assertThat(currencyResponse.id()).isEqualTo("id")
        assertThat(currencyResponse.version()).isEqualTo(0L)
        assertThat(currencyResponse.archived()).contains(true)
        assertThat(currencyResponse.code()).contains("code")
        assertThat(currencyResponse.createdBy()).contains("createdBy")
        assertThat(currencyResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(currencyResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(currencyResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(currencyResponse.maxDecimalPlaces()).contains(0)
        assertThat(currencyResponse.name()).contains("name")
        assertThat(currencyResponse.roundingMode()).contains(CurrencyResponse.RoundingMode.UP)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val currencyResponse =
            CurrencyResponse.builder()
                .id("id")
                .version(0L)
                .archived(true)
                .code("code")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .maxDecimalPlaces(0)
                .name("name")
                .roundingMode(CurrencyResponse.RoundingMode.UP)
                .build()

        val roundtrippedCurrencyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(currencyResponse),
                jacksonTypeRef<CurrencyResponse>(),
            )

        assertThat(roundtrippedCurrencyResponse).isEqualTo(currencyResponse)
    }
}
