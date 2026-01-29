// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableLookupTableRevisionDataArchieveResponseTest {

    @Test
    fun create() {
        val lookupTableLookupTableRevisionDataArchieveResponse =
            LookupTableLookupTableRevisionDataArchieveResponse.builder()
                .expiry(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("url")
                .build()

        assertThat(lookupTableLookupTableRevisionDataArchieveResponse.expiry())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(lookupTableLookupTableRevisionDataArchieveResponse.url()).contains("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lookupTableLookupTableRevisionDataArchieveResponse =
            LookupTableLookupTableRevisionDataArchieveResponse.builder()
                .expiry(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("url")
                .build()

        val roundtrippedLookupTableLookupTableRevisionDataArchieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lookupTableLookupTableRevisionDataArchieveResponse),
                jacksonTypeRef<LookupTableLookupTableRevisionDataArchieveResponse>(),
            )

        assertThat(roundtrippedLookupTableLookupTableRevisionDataArchieveResponse)
            .isEqualTo(lookupTableLookupTableRevisionDataArchieveResponse)
    }
}
