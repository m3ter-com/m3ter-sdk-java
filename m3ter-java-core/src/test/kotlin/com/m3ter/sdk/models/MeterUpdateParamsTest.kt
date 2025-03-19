// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeterUpdateParamsTest {

    @Test
    fun create() {
        MeterUpdateParams.builder()
            .orgId("orgId")
            .id("id")
            .code("JS!?Q0]r] ]\$]")
            .addDataField(
                DataFieldResponse.builder()
                    .category(DataFieldResponse.Category.WHO)
                    .code("{1{}}_")
                    .name("x")
                    .unit("x")
                    .build()
            )
            .addDerivedField(
                MeterUpdateParams.DerivedField.builder()
                    .category(DataFieldResponse.Category.WHO)
                    .code("{1{}}_")
                    .name("x")
                    .unit("x")
                    .calculation("x")
                    .build()
            )
            .name("x")
            .customFields(
                MeterUpdateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .groupId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .version(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            MeterUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .code("JS!?Q0]r] ]\$]")
                .addDataField(
                    DataFieldResponse.builder()
                        .category(DataFieldResponse.Category.WHO)
                        .code("{1{}}_")
                        .name("x")
                        .unit("x")
                        .build()
                )
                .addDerivedField(
                    MeterUpdateParams.DerivedField.builder()
                        .category(DataFieldResponse.Category.WHO)
                        .code("{1{}}_")
                        .name("x")
                        .unit("x")
                        .calculation("x")
                        .build()
                )
                .name("x")
                .customFields(
                    MeterUpdateParams.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .groupId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .version(0L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.code()).isEqualTo("JS!?Q0]r] ]\$]")
        assertThat(body.dataFields())
            .isEqualTo(
                listOf(
                    DataFieldResponse.builder()
                        .category(DataFieldResponse.Category.WHO)
                        .code("{1{}}_")
                        .name("x")
                        .unit("x")
                        .build()
                )
            )
        assertThat(body.derivedFields())
            .isEqualTo(
                listOf(
                    MeterUpdateParams.DerivedField.builder()
                        .category(DataFieldResponse.Category.WHO)
                        .code("{1{}}_")
                        .name("x")
                        .unit("x")
                        .calculation("x")
                        .build()
                )
            )
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.customFields())
            .contains(
                MeterUpdateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.groupId()).contains("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.productId()).contains("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MeterUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .code("JS!?Q0]r] ]\$]")
                .addDataField(
                    DataFieldResponse.builder()
                        .category(DataFieldResponse.Category.WHO)
                        .code("{1{}}_")
                        .name("x")
                        .build()
                )
                .addDerivedField(
                    MeterUpdateParams.DerivedField.builder()
                        .category(DataFieldResponse.Category.WHO)
                        .code("{1{}}_")
                        .name("x")
                        .calculation("x")
                        .build()
                )
                .name("x")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.code()).isEqualTo("JS!?Q0]r] ]\$]")
        assertThat(body.dataFields())
            .isEqualTo(
                listOf(
                    DataFieldResponse.builder()
                        .category(DataFieldResponse.Category.WHO)
                        .code("{1{}}_")
                        .name("x")
                        .build()
                )
            )
        assertThat(body.derivedFields())
            .isEqualTo(
                listOf(
                    MeterUpdateParams.DerivedField.builder()
                        .category(DataFieldResponse.Category.WHO)
                        .code("{1{}}_")
                        .name("x")
                        .calculation("x")
                        .build()
                )
            )
        assertThat(body.name()).isEqualTo("x")
    }

    @Test
    fun getPathParam() {
        val params =
            MeterUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .code("JS!?Q0]r] ]\$]")
                .addDataField(
                    DataFieldResponse.builder()
                        .category(DataFieldResponse.Category.WHO)
                        .code("{1{}}_")
                        .name("x")
                        .build()
                )
                .addDerivedField(
                    MeterUpdateParams.DerivedField.builder()
                        .category(DataFieldResponse.Category.WHO)
                        .code("{1{}}_")
                        .name("x")
                        .calculation("x")
                        .build()
                )
                .name("x")
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "id"
        assertThat(params.getPathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
