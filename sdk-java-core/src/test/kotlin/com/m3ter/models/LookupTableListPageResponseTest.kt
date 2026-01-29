// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableListPageResponseTest {

    @Test
    fun create() {
        val lookupTableListPageResponse =
            LookupTableListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        assertThat(lookupTableListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(lookupTableListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lookupTableListPageResponse =
            LookupTableListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedLookupTableListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lookupTableListPageResponse),
                jacksonTypeRef<LookupTableListPageResponse>(),
            )

        assertThat(roundtrippedLookupTableListPageResponse).isEqualTo(lookupTableListPageResponse)
    }
}
