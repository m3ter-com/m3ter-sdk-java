// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableRevisionResponseTest {

    @Test
    fun create() {
        val lookupTableRevisionResponse =
            LookupTableRevisionResponse.builder()
                .id("id")
                .createdBy("createdBy")
                .customFields(
                    LookupTableRevisionResponse.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addField(
                    LookupTableRevisionResponse.Field.builder()
                        .type(LookupTableRevisionResponse.Field.Type.STRING)
                        .name("lookupfield")
                        .build()
                )
                .itemCount(0L)
                .keys(listOf("foo", "bar", "baz"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(LookupTableRevisionResponse.Status.DRAFT)
                .version(0L)
                .build()

        assertThat(lookupTableRevisionResponse.id()).isEqualTo("id")
        assertThat(lookupTableRevisionResponse.createdBy()).contains("createdBy")
        assertThat(lookupTableRevisionResponse.customFields())
            .contains(
                LookupTableRevisionResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(lookupTableRevisionResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(lookupTableRevisionResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(lookupTableRevisionResponse.fields().getOrNull())
            .containsExactly(
                LookupTableRevisionResponse.Field.builder()
                    .type(LookupTableRevisionResponse.Field.Type.STRING)
                    .name("lookupfield")
                    .build()
            )
        assertThat(lookupTableRevisionResponse.itemCount()).contains(0L)
        assertThat(lookupTableRevisionResponse.keys().getOrNull())
            .containsExactly("foo", "bar", "baz")
        assertThat(lookupTableRevisionResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(lookupTableRevisionResponse.name()).contains("name")
        assertThat(lookupTableRevisionResponse.startDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(lookupTableRevisionResponse.status())
            .contains(LookupTableRevisionResponse.Status.DRAFT)
        assertThat(lookupTableRevisionResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lookupTableRevisionResponse =
            LookupTableRevisionResponse.builder()
                .id("id")
                .createdBy("createdBy")
                .customFields(
                    LookupTableRevisionResponse.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addField(
                    LookupTableRevisionResponse.Field.builder()
                        .type(LookupTableRevisionResponse.Field.Type.STRING)
                        .name("lookupfield")
                        .build()
                )
                .itemCount(0L)
                .keys(listOf("foo", "bar", "baz"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(LookupTableRevisionResponse.Status.DRAFT)
                .version(0L)
                .build()

        val roundtrippedLookupTableRevisionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lookupTableRevisionResponse),
                jacksonTypeRef<LookupTableRevisionResponse>(),
            )

        assertThat(roundtrippedLookupTableRevisionResponse).isEqualTo(lookupTableRevisionResponse)
    }
}
