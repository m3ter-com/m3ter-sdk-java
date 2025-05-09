// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DebitReasonResponseTest {

    @Test
    fun create() {
        val debitReasonResponse =
            DebitReasonResponse.builder()
                .id("id")
                .version(0L)
                .archived(true)
                .code("code")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .build()

        assertThat(debitReasonResponse.id()).isEqualTo("id")
        assertThat(debitReasonResponse.version()).isEqualTo(0L)
        assertThat(debitReasonResponse.archived()).contains(true)
        assertThat(debitReasonResponse.code()).contains("code")
        assertThat(debitReasonResponse.createdBy()).contains("createdBy")
        assertThat(debitReasonResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(debitReasonResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(debitReasonResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(debitReasonResponse.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val debitReasonResponse =
            DebitReasonResponse.builder()
                .id("id")
                .version(0L)
                .archived(true)
                .code("code")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .build()

        val roundtrippedDebitReasonResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(debitReasonResponse),
                jacksonTypeRef<DebitReasonResponse>(),
            )

        assertThat(roundtrippedDebitReasonResponse).isEqualTo(debitReasonResponse)
    }
}
