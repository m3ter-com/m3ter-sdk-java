// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableLookupTableRevisionDataRetrieveKeyResponseTest {

    @Test
    fun create() {
        val lookupTableLookupTableRevisionDataRetrieveKeyResponse =
            LookupTableLookupTableRevisionDataRetrieveKeyResponse.builder()
                .addItem(
                    LookupTableLookupTableRevisionDataRetrieveKeyResponse.Item.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .version(0L)
                .build()

        assertThat(lookupTableLookupTableRevisionDataRetrieveKeyResponse.items())
            .containsExactly(
                LookupTableLookupTableRevisionDataRetrieveKeyResponse.Item.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(lookupTableLookupTableRevisionDataRetrieveKeyResponse.createdBy())
            .contains("createdBy")
        assertThat(lookupTableLookupTableRevisionDataRetrieveKeyResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(lookupTableLookupTableRevisionDataRetrieveKeyResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(lookupTableLookupTableRevisionDataRetrieveKeyResponse.lastModifiedBy())
            .contains("lastModifiedBy")
        assertThat(lookupTableLookupTableRevisionDataRetrieveKeyResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lookupTableLookupTableRevisionDataRetrieveKeyResponse =
            LookupTableLookupTableRevisionDataRetrieveKeyResponse.builder()
                .addItem(
                    LookupTableLookupTableRevisionDataRetrieveKeyResponse.Item.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .version(0L)
                .build()

        val roundtrippedLookupTableLookupTableRevisionDataRetrieveKeyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    lookupTableLookupTableRevisionDataRetrieveKeyResponse
                ),
                jacksonTypeRef<LookupTableLookupTableRevisionDataRetrieveKeyResponse>(),
            )

        assertThat(roundtrippedLookupTableLookupTableRevisionDataRetrieveKeyResponse)
            .isEqualTo(lookupTableLookupTableRevisionDataRetrieveKeyResponse)
    }
}
