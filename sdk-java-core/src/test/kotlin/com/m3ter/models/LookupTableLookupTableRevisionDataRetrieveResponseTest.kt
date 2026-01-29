// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableLookupTableRevisionDataRetrieveResponseTest {

    @Test
    fun create() {
        val lookupTableLookupTableRevisionDataRetrieveResponse =
            LookupTableLookupTableRevisionDataRetrieveResponse.builder()
                .addItem(
                    LookupTableLookupTableRevisionDataRetrieveResponse.Item.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .version(0L)
                .build()

        assertThat(lookupTableLookupTableRevisionDataRetrieveResponse.items())
            .containsExactly(
                LookupTableLookupTableRevisionDataRetrieveResponse.Item.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(lookupTableLookupTableRevisionDataRetrieveResponse.createdBy())
            .contains("createdBy")
        assertThat(lookupTableLookupTableRevisionDataRetrieveResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(lookupTableLookupTableRevisionDataRetrieveResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(lookupTableLookupTableRevisionDataRetrieveResponse.lastModifiedBy())
            .contains("lastModifiedBy")
        assertThat(lookupTableLookupTableRevisionDataRetrieveResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lookupTableLookupTableRevisionDataRetrieveResponse =
            LookupTableLookupTableRevisionDataRetrieveResponse.builder()
                .addItem(
                    LookupTableLookupTableRevisionDataRetrieveResponse.Item.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .version(0L)
                .build()

        val roundtrippedLookupTableLookupTableRevisionDataRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lookupTableLookupTableRevisionDataRetrieveResponse),
                jacksonTypeRef<LookupTableLookupTableRevisionDataRetrieveResponse>(),
            )

        assertThat(roundtrippedLookupTableLookupTableRevisionDataRetrieveResponse)
            .isEqualTo(lookupTableLookupTableRevisionDataRetrieveResponse)
    }
}
