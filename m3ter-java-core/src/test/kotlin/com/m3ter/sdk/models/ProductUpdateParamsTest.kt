// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductUpdateParamsTest {

    @Test
    fun create() {
        ProductUpdateParams.builder()
            .orgId("orgId")
            .id("id")
            .code("JS!?Q0]r] ]\$]")
            .name("x")
            .customFields(
                ProductUpdateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .version(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            ProductUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .code("JS!?Q0]r] ]\$]")
                .name("x")
                .customFields(
                    ProductUpdateParams.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .version(0L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.code()).isEqualTo("JS!?Q0]r] ]\$]")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.customFields())
            .contains(
                ProductUpdateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ProductUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .code("JS!?Q0]r] ]\$]")
                .name("x")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.code()).isEqualTo("JS!?Q0]r] ]\$]")
        assertThat(body.name()).isEqualTo("x")
    }

    @Test
    fun getPathParam() {
        val params =
            ProductUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .code("JS!?Q0]r] ]\$]")
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
