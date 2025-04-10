// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeterListPageResponseTest {

    @Test
    fun create() {
        val meterListPageResponse =
            MeterListPageResponse.builder()
                .addData(
                    MeterResponse.builder()
                        .id("id")
                        .version(0L)
                        .code("code")
                        .createdBy("createdBy")
                        .customFields(
                            MeterResponse.CustomFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addDataField(
                            DataField.builder()
                                .category(DataField.Category.WHO)
                                .code("{1{}}_")
                                .name("x")
                                .unit("x")
                                .build()
                        )
                        .addDerivedField(
                            DerivedField.builder()
                                .category(DataField.Category.WHO)
                                .code("{1{}}_")
                                .name("x")
                                .unit("x")
                                .calculation("x")
                                .build()
                        )
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .groupId("groupId")
                        .lastModifiedBy("lastModifiedBy")
                        .name("name")
                        .productId("productId")
                        .build()
                )
                .nextToken("nextToken")
                .build()

        assertThat(meterListPageResponse.data().getOrNull())
            .containsExactly(
                MeterResponse.builder()
                    .id("id")
                    .version(0L)
                    .code("code")
                    .createdBy("createdBy")
                    .customFields(
                        MeterResponse.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addDataField(
                        DataField.builder()
                            .category(DataField.Category.WHO)
                            .code("{1{}}_")
                            .name("x")
                            .unit("x")
                            .build()
                    )
                    .addDerivedField(
                        DerivedField.builder()
                            .category(DataField.Category.WHO)
                            .code("{1{}}_")
                            .name("x")
                            .unit("x")
                            .calculation("x")
                            .build()
                    )
                    .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .groupId("groupId")
                    .lastModifiedBy("lastModifiedBy")
                    .name("name")
                    .productId("productId")
                    .build()
            )
        assertThat(meterListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meterListPageResponse =
            MeterListPageResponse.builder()
                .addData(
                    MeterResponse.builder()
                        .id("id")
                        .version(0L)
                        .code("code")
                        .createdBy("createdBy")
                        .customFields(
                            MeterResponse.CustomFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addDataField(
                            DataField.builder()
                                .category(DataField.Category.WHO)
                                .code("{1{}}_")
                                .name("x")
                                .unit("x")
                                .build()
                        )
                        .addDerivedField(
                            DerivedField.builder()
                                .category(DataField.Category.WHO)
                                .code("{1{}}_")
                                .name("x")
                                .unit("x")
                                .calculation("x")
                                .build()
                        )
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .groupId("groupId")
                        .lastModifiedBy("lastModifiedBy")
                        .name("name")
                        .productId("productId")
                        .build()
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedMeterListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(meterListPageResponse),
                jacksonTypeRef<MeterListPageResponse>(),
            )

        assertThat(roundtrippedMeterListPageResponse).isEqualTo(meterListPageResponse)
    }
}
