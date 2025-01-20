// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CounterTest {

    @Test
    fun createCounter() {
        val counter =
            Counter.builder()
                .id("id")
                .version(0L)
                .code("code")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .productId("productId")
                .unit("unit")
                .build()
        assertThat(counter).isNotNull
        assertThat(counter.id()).isEqualTo("id")
        assertThat(counter.version()).isEqualTo(0L)
        assertThat(counter.code()).contains("code")
        assertThat(counter.createdBy()).contains("createdBy")
        assertThat(counter.dtCreated()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(counter.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(counter.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(counter.name()).contains("name")
        assertThat(counter.productId()).contains("productId")
        assertThat(counter.unit()).contains("unit")
    }
}
