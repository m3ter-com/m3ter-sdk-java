// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthenticationGetBearerTokenParamsTest {

    @Test
    fun createAuthenticationGetBearerTokenParams() {
        AuthenticationGetBearerTokenParams.builder()
            .grantType(AuthenticationGetBearerTokenParams.GrantType.CLIENT_CREDENTIALS)
            .scope("scope")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AuthenticationGetBearerTokenParams.builder()
                .grantType(AuthenticationGetBearerTokenParams.GrantType.CLIENT_CREDENTIALS)
                .scope("scope")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.grantType())
            .isEqualTo(AuthenticationGetBearerTokenParams.GrantType.CLIENT_CREDENTIALS)
        assertThat(body.scope()).contains("scope")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AuthenticationGetBearerTokenParams.builder()
                .grantType(AuthenticationGetBearerTokenParams.GrantType.CLIENT_CREDENTIALS)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.grantType())
            .isEqualTo(AuthenticationGetBearerTokenParams.GrantType.CLIENT_CREDENTIALS)
    }
}
