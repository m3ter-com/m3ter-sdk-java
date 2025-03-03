// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CurrencyTest {

    @Test
    fun createCurrency() {
        val currency =
            Currency.builder()
                .id("id")
                .version(0L)
                .archived(true)
                .code("code")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .maxDecimalPlaces(0L)
                .name("name")
                .roundingMode(Currency.RoundingMode.UP)
                .build()
        assertThat(currency).isNotNull
        assertThat(currency.id()).isEqualTo("id")
        assertThat(currency.version()).isEqualTo(0L)
        assertThat(currency.archived()).contains(true)
        assertThat(currency.code()).contains("code")
        assertThat(currency.createdBy()).contains("createdBy")
        assertThat(currency.dtCreated()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(currency.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(currency.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(currency.maxDecimalPlaces()).contains(0L)
        assertThat(currency.name()).contains("name")
        assertThat(currency.roundingMode()).contains(Currency.RoundingMode.UP)
    }
}
