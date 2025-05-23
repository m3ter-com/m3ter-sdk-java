// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthenticationGetBearerTokenParamsTest {

    @Test
    fun create() {
        AuthenticationGetBearerTokenParams.builder()
            .grantType(AuthenticationGetBearerTokenParams.GrantType.CLIENT_CREDENTIALS)
            .scope("scope")
            .build()
    }

    @Test
    fun body() {
        val params =
            AuthenticationGetBearerTokenParams.builder()
                .grantType(AuthenticationGetBearerTokenParams.GrantType.CLIENT_CREDENTIALS)
                .scope("scope")
                .build()

        val body = params._body()

        assertThat(body.grantType())
            .isEqualTo(AuthenticationGetBearerTokenParams.GrantType.CLIENT_CREDENTIALS)
        assertThat(body.scope()).contains("scope")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AuthenticationGetBearerTokenParams.builder()
                .grantType(AuthenticationGetBearerTokenParams.GrantType.CLIENT_CREDENTIALS)
                .build()

        val body = params._body()

        assertThat(body.grantType())
            .isEqualTo(AuthenticationGetBearerTokenParams.GrantType.CLIENT_CREDENTIALS)
    }
}
