// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DebitReasonListPageResponseTest {

    @Test
    fun create() {
        val debitReasonListPageResponse =
            DebitReasonListPageResponse.builder()
                .addData(
                    DebitReasonResponse.builder()
                        .id("id")
                        .archived(true)
                        .code("code")
                        .createdBy("createdBy")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastModifiedBy("lastModifiedBy")
                        .name("name")
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        assertThat(debitReasonListPageResponse.data().getOrNull())
            .containsExactly(
                DebitReasonResponse.builder()
                    .id("id")
                    .archived(true)
                    .code("code")
                    .createdBy("createdBy")
                    .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastModifiedBy("lastModifiedBy")
                    .name("name")
                    .version(0L)
                    .build()
            )
        assertThat(debitReasonListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val debitReasonListPageResponse =
            DebitReasonListPageResponse.builder()
                .addData(
                    DebitReasonResponse.builder()
                        .id("id")
                        .archived(true)
                        .code("code")
                        .createdBy("createdBy")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastModifiedBy("lastModifiedBy")
                        .name("name")
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedDebitReasonListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(debitReasonListPageResponse),
                jacksonTypeRef<DebitReasonListPageResponse>(),
            )

        assertThat(roundtrippedDebitReasonListPageResponse).isEqualTo(debitReasonListPageResponse)
    }
}
