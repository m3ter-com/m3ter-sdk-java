// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableLookupTableRevisionListPageResponseTest {

    @Test
    fun create() {
        val lookupTableLookupTableRevisionListPageResponse =
            LookupTableLookupTableRevisionListPageResponse.builder()
                .addData(
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
                .nextToken("nextToken")
                .build()

        assertThat(lookupTableLookupTableRevisionListPageResponse.data().getOrNull())
            .containsExactly(
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
        assertThat(lookupTableLookupTableRevisionListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lookupTableLookupTableRevisionListPageResponse =
            LookupTableLookupTableRevisionListPageResponse.builder()
                .addData(
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
                .nextToken("nextToken")
                .build()

        val roundtrippedLookupTableLookupTableRevisionListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lookupTableLookupTableRevisionListPageResponse),
                jacksonTypeRef<LookupTableLookupTableRevisionListPageResponse>(),
            )

        assertThat(roundtrippedLookupTableLookupTableRevisionListPageResponse)
            .isEqualTo(lookupTableLookupTableRevisionListPageResponse)
    }
}
