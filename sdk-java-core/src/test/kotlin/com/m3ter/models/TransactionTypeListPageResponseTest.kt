// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionTypeListPageResponseTest {

    @Test
    fun create() {
        val transactionTypeListPageResponse =
            TransactionTypeListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        assertThat(transactionTypeListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(transactionTypeListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionTypeListPageResponse =
            TransactionTypeListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedTransactionTypeListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionTypeListPageResponse),
                jacksonTypeRef<TransactionTypeListPageResponse>(),
            )

        assertThat(roundtrippedTransactionTypeListPageResponse)
            .isEqualTo(transactionTypeListPageResponse)
    }
}
