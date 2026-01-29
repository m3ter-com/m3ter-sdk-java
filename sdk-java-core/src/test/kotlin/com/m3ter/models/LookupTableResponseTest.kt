// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableResponseTest {

    @Test
    fun create() {
        val lookupTableResponse =
            LookupTableResponse.builder()
                .id("id")
                .activeRevision(
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
                )
                .code("code")
                .createdBy("createdBy")
                .customFields(
                    LookupTableResponse.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .version(0L)
                .build()

        assertThat(lookupTableResponse.id()).isEqualTo("id")
        assertThat(lookupTableResponse.activeRevision())
            .contains(
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
            )
        assertThat(lookupTableResponse.code()).contains("code")
        assertThat(lookupTableResponse.createdBy()).contains("createdBy")
        assertThat(lookupTableResponse.customFields())
            .contains(
                LookupTableResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(lookupTableResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(lookupTableResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(lookupTableResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(lookupTableResponse.name()).contains("name")
        assertThat(lookupTableResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lookupTableResponse =
            LookupTableResponse.builder()
                .id("id")
                .activeRevision(
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
                )
                .code("code")
                .createdBy("createdBy")
                .customFields(
                    LookupTableResponse.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .version(0L)
                .build()

        val roundtrippedLookupTableResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lookupTableResponse),
                jacksonTypeRef<LookupTableResponse>(),
            )

        assertThat(roundtrippedLookupTableResponse).isEqualTo(lookupTableResponse)
    }
}
