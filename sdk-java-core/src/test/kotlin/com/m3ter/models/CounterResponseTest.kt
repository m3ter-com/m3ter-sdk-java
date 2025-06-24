// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CounterResponseTest {

    @Test
    fun create() {
        val counterResponse =
            CounterResponse.builder()
                .id("id")
                .code("code")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .productId("productId")
                .unit("unit")
                .version(0L)
                .build()

        assertThat(counterResponse.id()).isEqualTo("id")
        assertThat(counterResponse.code()).contains("code")
        assertThat(counterResponse.createdBy()).contains("createdBy")
        assertThat(counterResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(counterResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(counterResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(counterResponse.name()).contains("name")
        assertThat(counterResponse.productId()).contains("productId")
        assertThat(counterResponse.unit()).contains("unit")
        assertThat(counterResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val counterResponse =
            CounterResponse.builder()
                .id("id")
                .code("code")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .productId("productId")
                .unit("unit")
                .version(0L)
                .build()

        val roundtrippedCounterResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(counterResponse),
                jacksonTypeRef<CounterResponse>(),
            )

        assertThat(roundtrippedCounterResponse).isEqualTo(counterResponse)
    }
}
