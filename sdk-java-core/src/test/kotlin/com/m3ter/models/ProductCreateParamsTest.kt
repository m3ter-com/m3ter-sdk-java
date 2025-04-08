// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductCreateParamsTest {

    @Test
    fun create() {
        ProductCreateParams.builder()
            .orgId("orgId")
            .code("JS!?Q0]r] ]\$]")
            .name("x")
            .customFields(
                ProductCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ProductCreateParams.builder().code("JS!?Q0]r] ]\$]").name("x").build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ProductCreateParams.builder()
                .orgId("orgId")
                .code("JS!?Q0]r] ]\$]")
                .name("x")
                .customFields(
                    ProductCreateParams.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.code()).isEqualTo("JS!?Q0]r] ]\$]")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.customFields())
            .contains(
                ProductCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ProductCreateParams.builder().code("JS!?Q0]r] ]\$]").name("x").build()

        val body = params._body()

        assertThat(body.code()).isEqualTo("JS!?Q0]r] ]\$]")
        assertThat(body.name()).isEqualTo("x")
    }
}
