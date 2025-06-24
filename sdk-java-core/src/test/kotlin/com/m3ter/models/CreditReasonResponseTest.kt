// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditReasonResponseTest {

    @Test
    fun create() {
        val creditReasonResponse =
            CreditReasonResponse.builder()
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

        assertThat(creditReasonResponse.id()).isEqualTo("id")
        assertThat(creditReasonResponse.archived()).contains(true)
        assertThat(creditReasonResponse.code()).contains("code")
        assertThat(creditReasonResponse.createdBy()).contains("createdBy")
        assertThat(creditReasonResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditReasonResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditReasonResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(creditReasonResponse.name()).contains("name")
        assertThat(creditReasonResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditReasonResponse =
            CreditReasonResponse.builder()
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

        val roundtrippedCreditReasonResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditReasonResponse),
                jacksonTypeRef<CreditReasonResponse>(),
            )

        assertThat(roundtrippedCreditReasonResponse).isEqualTo(creditReasonResponse)
    }
}
