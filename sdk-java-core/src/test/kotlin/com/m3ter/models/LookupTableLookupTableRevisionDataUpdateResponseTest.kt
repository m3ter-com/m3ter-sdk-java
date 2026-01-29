// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableLookupTableRevisionDataUpdateResponseTest {

    @Test
    fun create() {
        val lookupTableLookupTableRevisionDataUpdateResponse =
            LookupTableLookupTableRevisionDataUpdateResponse.builder()
                .addItem(
                    LookupTableLookupTableRevisionDataUpdateResponse.Item.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .version(0L)
                .build()

        assertThat(lookupTableLookupTableRevisionDataUpdateResponse.items())
            .containsExactly(
                LookupTableLookupTableRevisionDataUpdateResponse.Item.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(lookupTableLookupTableRevisionDataUpdateResponse.createdBy())
            .contains("createdBy")
        assertThat(lookupTableLookupTableRevisionDataUpdateResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(lookupTableLookupTableRevisionDataUpdateResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(lookupTableLookupTableRevisionDataUpdateResponse.lastModifiedBy())
            .contains("lastModifiedBy")
        assertThat(lookupTableLookupTableRevisionDataUpdateResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lookupTableLookupTableRevisionDataUpdateResponse =
            LookupTableLookupTableRevisionDataUpdateResponse.builder()
                .addItem(
                    LookupTableLookupTableRevisionDataUpdateResponse.Item.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .version(0L)
                .build()

        val roundtrippedLookupTableLookupTableRevisionDataUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lookupTableLookupTableRevisionDataUpdateResponse),
                jacksonTypeRef<LookupTableLookupTableRevisionDataUpdateResponse>(),
            )

        assertThat(roundtrippedLookupTableLookupTableRevisionDataUpdateResponse)
            .isEqualTo(lookupTableLookupTableRevisionDataUpdateResponse)
    }
}
