// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditReasonListPageResponseTest {

    @Test
    fun create() {
        val creditReasonListPageResponse =
            CreditReasonListPageResponse.builder()
                .addData(
                    CreditReasonResponse.builder()
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

        assertThat(creditReasonListPageResponse.data().getOrNull())
            .containsExactly(
                CreditReasonResponse.builder()
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
        assertThat(creditReasonListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditReasonListPageResponse =
            CreditReasonListPageResponse.builder()
                .addData(
                    CreditReasonResponse.builder()
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

        val roundtrippedCreditReasonListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditReasonListPageResponse),
                jacksonTypeRef<CreditReasonListPageResponse>(),
            )

        assertThat(roundtrippedCreditReasonListPageResponse).isEqualTo(creditReasonListPageResponse)
    }
}
