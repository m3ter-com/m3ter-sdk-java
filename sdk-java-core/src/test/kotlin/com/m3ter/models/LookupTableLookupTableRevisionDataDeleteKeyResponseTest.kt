// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableLookupTableRevisionDataDeleteKeyResponseTest {

    @Test
    fun create() {
        val lookupTableLookupTableRevisionDataDeleteKeyResponse =
            LookupTableLookupTableRevisionDataDeleteKeyResponse.builder()
                .addItem(
                    LookupTableLookupTableRevisionDataDeleteKeyResponse.Item.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .version(0L)
                .build()

        assertThat(lookupTableLookupTableRevisionDataDeleteKeyResponse.items())
            .containsExactly(
                LookupTableLookupTableRevisionDataDeleteKeyResponse.Item.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(lookupTableLookupTableRevisionDataDeleteKeyResponse.createdBy())
            .contains("createdBy")
        assertThat(lookupTableLookupTableRevisionDataDeleteKeyResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(lookupTableLookupTableRevisionDataDeleteKeyResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(lookupTableLookupTableRevisionDataDeleteKeyResponse.lastModifiedBy())
            .contains("lastModifiedBy")
        assertThat(lookupTableLookupTableRevisionDataDeleteKeyResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lookupTableLookupTableRevisionDataDeleteKeyResponse =
            LookupTableLookupTableRevisionDataDeleteKeyResponse.builder()
                .addItem(
                    LookupTableLookupTableRevisionDataDeleteKeyResponse.Item.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .version(0L)
                .build()

        val roundtrippedLookupTableLookupTableRevisionDataDeleteKeyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lookupTableLookupTableRevisionDataDeleteKeyResponse),
                jacksonTypeRef<LookupTableLookupTableRevisionDataDeleteKeyResponse>(),
            )

        assertThat(roundtrippedLookupTableLookupTableRevisionDataDeleteKeyResponse)
            .isEqualTo(lookupTableLookupTableRevisionDataDeleteKeyResponse)
    }
}
