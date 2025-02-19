// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreditReasonUpdateParamsTest {

    @Test
    fun create() {
        CreditReasonUpdateParams.builder()
            .orgId("orgId")
            .id("id")
            .name("x")
            .archived(true)
            .code("{1{}}_")
            .version(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            CreditReasonUpdateParams.builder()
                .orgId("orgId")
                .id("id")
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
        val params = CreditReasonUpdateParams.builder().orgId("orgId").id("id").name("x").build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("x")
    }

    @Test
    fun getPathParam() {
        val params = CreditReasonUpdateParams.builder().orgId("orgId").id("id").name("x").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "id"
        assertThat(params.getPathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
