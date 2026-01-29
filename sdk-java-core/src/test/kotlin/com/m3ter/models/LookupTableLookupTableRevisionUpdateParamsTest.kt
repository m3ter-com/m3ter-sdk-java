// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableLookupTableRevisionUpdateParamsTest {

    @Test
    fun create() {
        LookupTableLookupTableRevisionUpdateParams.builder()
            .orgId("orgId")
            .lookupTableId("lookupTableId")
            .id("id")
            .lookupTableRevisionRequest(
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LookupTableLookupTableRevisionUpdateParams.builder()
                .lookupTableId("lookupTableId")
                .id("id")
                .lookupTableRevisionRequest(
                    LookupTableRevisionRequest.builder()
                        .addField(
                            LookupTableRevisionRequest.Field.builder()
                                .type(LookupTableRevisionRequest.Field.Type.STRING)
                                .build()
                        )
                        .addField(
                            LookupTableRevisionRequest.Field.builder()
                                .type(LookupTableRevisionRequest.Field.Type.STRING)
                                .build()
                        )
                        .keys(listOf("foo", "bar", "baz"))
                        .name("x")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("lookupTableId")
        assertThat(params._pathParam(2)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LookupTableLookupTableRevisionUpdateParams.builder()
                .orgId("orgId")
                .lookupTableId("lookupTableId")
                .id("id")
                .lookupTableRevisionRequest(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LookupTableLookupTableRevisionUpdateParams.builder()
                .lookupTableId("lookupTableId")
                .id("id")
                .lookupTableRevisionRequest(
                    LookupTableRevisionRequest.builder()
                        .addField(
                            LookupTableRevisionRequest.Field.builder()
                                .type(LookupTableRevisionRequest.Field.Type.STRING)
                                .build()
                        )
                        .addField(
                            LookupTableRevisionRequest.Field.builder()
                                .type(LookupTableRevisionRequest.Field.Type.STRING)
                                .build()
                        )
                        .keys(listOf("foo", "bar", "baz"))
                        .name("x")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                LookupTableRevisionRequest.builder()
                    .addField(
                        LookupTableRevisionRequest.Field.builder()
                            .type(LookupTableRevisionRequest.Field.Type.STRING)
                            .build()
                    )
                    .addField(
                        LookupTableRevisionRequest.Field.builder()
                            .type(LookupTableRevisionRequest.Field.Type.STRING)
                            .build()
                    )
                    .keys(listOf("foo", "bar", "baz"))
                    .name("x")
                    .build()
            )
    }
}
