// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CounterListPageResponseTest {

    @Test
    fun create() {
        val counterListPageResponse =
            CounterListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        assertThat(counterListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(counterListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val counterListPageResponse =
            CounterListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedCounterListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(counterListPageResponse),
                jacksonTypeRef<CounterListPageResponse>(),
            )

        assertThat(roundtrippedCounterListPageResponse).isEqualTo(counterListPageResponse)
    }
}
