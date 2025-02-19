// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreditReasonCreateParamsTest {

    @Test
    fun create() {
        CreditReasonCreateParams.builder()
            .orgId("orgId")
            .name("x")
            .archived(true)
            .code("{1{}}_")
            .version(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            CreditReasonCreateParams.builder()
                .orgId("orgId")
                .name("x")
                .archived(true)
                .code("{1{}}_")
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.archived()).contains(true)
        assertThat(body.code()).contains("{1{}}_")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CreditReasonCreateParams.builder().orgId("orgId").name("x").build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("x")
    }

    @Test
    fun getPathParam() {
        val params = CreditReasonCreateParams.builder().orgId("orgId").name("x").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
