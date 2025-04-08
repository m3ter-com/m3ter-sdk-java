// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionTypeResponseTest {

    @Test
    fun create() {
        val transactionTypeResponse =
            TransactionTypeResponse.builder()
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

        assertThat(transactionTypeResponse.id()).isEqualTo("id")
        assertThat(transactionTypeResponse.version()).isEqualTo(0L)
        assertThat(transactionTypeResponse.archived()).contains(true)
        assertThat(transactionTypeResponse.code()).contains("code")
        assertThat(transactionTypeResponse.createdBy()).contains("createdBy")
        assertThat(transactionTypeResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transactionTypeResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transactionTypeResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(transactionTypeResponse.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionTypeResponse =
            TransactionTypeResponse.builder()
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

        val roundtrippedTransactionTypeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionTypeResponse),
                jacksonTypeRef<TransactionTypeResponse>(),
            )

        assertThat(roundtrippedTransactionTypeResponse).isEqualTo(transactionTypeResponse)
    }
}
