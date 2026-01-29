// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableRevisionRequestTest {

    @Test
    fun create() {
        val lookupTableRevisionRequest =
            LookupTableRevisionRequest.builder()
                .addField(
                    LookupTableRevisionRequest.Field.builder()
                        .type(LookupTableRevisionRequest.Field.Type.STRING)
                        .name("lookupfield")
                        .build()
                )
                .addField(
                    LookupTableRevisionRequest.Field.builder()
                        .type(LookupTableRevisionRequest.Field.Type.STRING)
                        .name("lookupfield")
                        .build()
                )
                .keys(listOf("foo", "bar", "baz"))
                .name("x")
                .customFields(
                    LookupTableRevisionRequest.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version(0L)
                .build()

        assertThat(lookupTableRevisionRequest.fields())
            .containsExactly(
                LookupTableRevisionRequest.Field.builder()
                    .type(LookupTableRevisionRequest.Field.Type.STRING)
                    .name("lookupfield")
                    .build(),
                LookupTableRevisionRequest.Field.builder()
                    .type(LookupTableRevisionRequest.Field.Type.STRING)
                    .name("lookupfield")
                    .build(),
            )
        assertThat(lookupTableRevisionRequest.keys()).containsExactly("foo", "bar", "baz")
        assertThat(lookupTableRevisionRequest.name()).isEqualTo("x")
        assertThat(lookupTableRevisionRequest.customFields())
            .contains(
                LookupTableRevisionRequest.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(lookupTableRevisionRequest.startDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(lookupTableRevisionRequest.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lookupTableRevisionRequest =
            LookupTableRevisionRequest.builder()
                .addField(
                    LookupTableRevisionRequest.Field.builder()
                        .type(LookupTableRevisionRequest.Field.Type.STRING)
                        .name("lookupfield")
                        .build()
                )
                .addField(
                    LookupTableRevisionRequest.Field.builder()
                        .type(LookupTableRevisionRequest.Field.Type.STRING)
                        .name("lookupfield")
                        .build()
                )
                .keys(listOf("foo", "bar", "baz"))
                .name("x")
                .customFields(
                    LookupTableRevisionRequest.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version(0L)
                .build()

        val roundtrippedLookupTableRevisionRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lookupTableRevisionRequest),
                jacksonTypeRef<LookupTableRevisionRequest>(),
            )

        assertThat(roundtrippedLookupTableRevisionRequest).isEqualTo(lookupTableRevisionRequest)
    }
}
