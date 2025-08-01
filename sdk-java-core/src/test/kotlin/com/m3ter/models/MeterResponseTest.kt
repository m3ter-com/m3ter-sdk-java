// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeterResponseTest {

    @Test
    fun create() {
        val meterResponse =
            MeterResponse.builder()
                .id("id")
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
                .version(0L)
                .build()

        assertThat(meterResponse.id()).isEqualTo("id")
        assertThat(meterResponse.code()).contains("code")
        assertThat(meterResponse.createdBy()).contains("createdBy")
        assertThat(meterResponse.customFields())
            .contains(
                MeterResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(meterResponse.dataFields().getOrNull())
            .containsExactly(
                DataField.builder()
                    .category(DataField.Category.WHO)
                    .code("{1{}}_")
                    .name("x")
                    .unit("x")
                    .build()
            )
        assertThat(meterResponse.derivedFields().getOrNull())
            .containsExactly(
                DerivedField.builder()
                    .category(DataField.Category.WHO)
                    .code("{1{}}_")
                    .name("x")
                    .unit("x")
                    .calculation("x")
                    .build()
            )
        assertThat(meterResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(meterResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(meterResponse.groupId()).contains("groupId")
        assertThat(meterResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(meterResponse.name()).contains("name")
        assertThat(meterResponse.productId()).contains("productId")
        assertThat(meterResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meterResponse =
            MeterResponse.builder()
                .id("id")
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
                .version(0L)
                .build()

        val roundtrippedMeterResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(meterResponse),
                jacksonTypeRef<MeterResponse>(),
            )

        assertThat(roundtrippedMeterResponse).isEqualTo(meterResponse)
    }
}
