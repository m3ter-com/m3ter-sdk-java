// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MeterTest {

    @Test
    fun createMeter() {
        val meter =
            Meter.builder()
                .id("id")
                .version(0L)
                .code("code")
                .createdBy("createdBy")
                .customFields(
                    Meter.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .addDataField(
                    Meter.DataField.builder()
                        .category(Meter.DataField.Category.WHO)
                        .code("{1{}}_")
                        .name("x")
                        .unit("x")
                        .build()
                )
                .addDerivedField(
                    Meter.DerivedField.builder()
                        .calculation("x")
                        .category(Meter.DerivedField.Category.WHO)
                        .code("{1{}}_")
                        .name("x")
                        .unit("x")
                        .build()
                )
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .groupId("groupId")
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .productId("productId")
                .build()
        assertThat(meter).isNotNull
        assertThat(meter.id()).isEqualTo("id")
        assertThat(meter.version()).isEqualTo(0L)
        assertThat(meter.code()).contains("code")
        assertThat(meter.createdBy()).contains("createdBy")
        assertThat(meter.customFields())
            .contains(
                Meter.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(meter.dataFields().get())
            .containsExactly(
                Meter.DataField.builder()
                    .category(Meter.DataField.Category.WHO)
                    .code("{1{}}_")
                    .name("x")
                    .unit("x")
                    .build()
            )
        assertThat(meter.derivedFields().get())
            .containsExactly(
                Meter.DerivedField.builder()
                    .calculation("x")
                    .category(Meter.DerivedField.Category.WHO)
                    .code("{1{}}_")
                    .name("x")
                    .unit("x")
                    .build()
            )
        assertThat(meter.dtCreated()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(meter.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(meter.groupId()).contains("groupId")
        assertThat(meter.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(meter.name()).contains("name")
        assertThat(meter.productId()).contains("productId")
    }
}
