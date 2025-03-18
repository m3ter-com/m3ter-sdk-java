// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeterCreateParamsTest {

    @Test
    fun create() {
        MeterCreateParams.builder()
            .orgId("orgId")
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
                MeterCreateParams.DerivedField.builder()
                    .category(DataFieldResponse.Category.WHO)
                    .code("{1{}}_")
                    .name("x")
                    .unit("x")
                    .calculation("x")
                    .build()
            )
            .name("x")
            .customFields(
                MeterCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .groupId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MeterCreateParams.builder()
                .orgId("orgId")
                .code("JS!?Q0]r] ]\$]")
                .addDataField(
                    DataFieldResponse.builder()
                        .category(DataFieldResponse.Category.WHO)
                        .code("{1{}}_")
                        .name("x")
                        .build()
                )
                .addDerivedField(
                    MeterCreateParams.DerivedField.builder()
                        .category(DataFieldResponse.Category.WHO)
                        .code("{1{}}_")
                        .name("x")
                        .calculation("x")
                        .build()
                )
                .name("x")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MeterCreateParams.builder()
                .orgId("orgId")
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
                    MeterCreateParams.DerivedField.builder()
                        .category(DataFieldResponse.Category.WHO)
                        .code("{1{}}_")
                        .name("x")
                        .unit("x")
                        .calculation("x")
                        .build()
                )
                .name("x")
                .customFields(
                    MeterCreateParams.CustomFields.builder()
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
            .containsExactly(
                DataFieldResponse.builder()
                    .category(DataFieldResponse.Category.WHO)
                    .code("{1{}}_")
                    .name("x")
                    .unit("x")
                    .build()
            )
        assertThat(body.derivedFields())
            .containsExactly(
                MeterCreateParams.DerivedField.builder()
                    .category(DataFieldResponse.Category.WHO)
                    .code("{1{}}_")
                    .name("x")
                    .unit("x")
                    .calculation("x")
                    .build()
            )
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.customFields())
            .contains(
                MeterCreateParams.CustomFields.builder()
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
            MeterCreateParams.builder()
                .orgId("orgId")
                .code("JS!?Q0]r] ]\$]")
                .addDataField(
                    DataFieldResponse.builder()
                        .category(DataFieldResponse.Category.WHO)
                        .code("{1{}}_")
                        .name("x")
                        .build()
                )
                .addDerivedField(
                    MeterCreateParams.DerivedField.builder()
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
            .containsExactly(
                DataFieldResponse.builder()
                    .category(DataFieldResponse.Category.WHO)
                    .code("{1{}}_")
                    .name("x")
                    .build()
            )
        assertThat(body.derivedFields())
            .containsExactly(
                MeterCreateParams.DerivedField.builder()
                    .category(DataFieldResponse.Category.WHO)
                    .code("{1{}}_")
                    .name("x")
                    .calculation("x")
                    .build()
            )
        assertThat(body.name()).isEqualTo("x")
    }
}
