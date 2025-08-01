// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrencyListPageResponseTest {

    @Test
    fun create() {
        val currencyListPageResponse =
            CurrencyListPageResponse.builder()
                .addData(
                    CurrencyResponse.builder()
                        .id("id")
                        .archived(true)
                        .code("code")
                        .createdBy("createdBy")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastModifiedBy("lastModifiedBy")
                        .maxDecimalPlaces(0)
                        .name("name")
                        .roundingMode(CurrencyResponse.RoundingMode.UP)
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        assertThat(currencyListPageResponse.data().getOrNull())
            .containsExactly(
                CurrencyResponse.builder()
                    .id("id")
                    .archived(true)
                    .code("code")
                    .createdBy("createdBy")
                    .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastModifiedBy("lastModifiedBy")
                    .maxDecimalPlaces(0)
                    .name("name")
                    .roundingMode(CurrencyResponse.RoundingMode.UP)
                    .version(0L)
                    .build()
            )
        assertThat(currencyListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val currencyListPageResponse =
            CurrencyListPageResponse.builder()
                .addData(
                    CurrencyResponse.builder()
                        .id("id")
                        .archived(true)
                        .code("code")
                        .createdBy("createdBy")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastModifiedBy("lastModifiedBy")
                        .maxDecimalPlaces(0)
                        .name("name")
                        .roundingMode(CurrencyResponse.RoundingMode.UP)
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedCurrencyListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(currencyListPageResponse),
                jacksonTypeRef<CurrencyListPageResponse>(),
            )

        assertThat(roundtrippedCurrencyListPageResponse).isEqualTo(currencyListPageResponse)
    }
}
