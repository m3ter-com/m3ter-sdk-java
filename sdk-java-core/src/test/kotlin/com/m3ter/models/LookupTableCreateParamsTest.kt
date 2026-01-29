// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableCreateParamsTest {

    @Test
    fun create() {
        LookupTableCreateParams.builder()
            .orgId("orgId")
            .lookupTableRequest(
                LookupTableRequest.builder()
                    .code("S?oC\"\$]C] ]]]]]5]")
                    .name("x")
                    .customFields(
                        LookupTableRequest.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .version(0L)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LookupTableCreateParams.builder()
                .lookupTableRequest(
                    LookupTableRequest.builder().code("S?oC\"\$]C] ]]]]]5]").name("x").build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LookupTableCreateParams.builder()
                .orgId("orgId")
                .lookupTableRequest(
                    LookupTableRequest.builder()
                        .code("S?oC\"\$]C] ]]]]]5]")
                        .name("x")
                        .customFields(
                            LookupTableRequest.CustomFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .version(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                LookupTableRequest.builder()
                    .code("S?oC\"\$]C] ]]]]]5]")
                    .name("x")
                    .customFields(
                        LookupTableRequest.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .version(0L)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LookupTableCreateParams.builder()
                .lookupTableRequest(
                    LookupTableRequest.builder().code("S?oC\"\$]C] ]]]]]5]").name("x").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(LookupTableRequest.builder().code("S?oC\"\$]C] ]]]]]5]").name("x").build())
    }
}
