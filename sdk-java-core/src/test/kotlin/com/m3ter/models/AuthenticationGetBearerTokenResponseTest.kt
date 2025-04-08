// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthenticationGetBearerTokenResponseTest {

    @Test
    fun create() {
        val authenticationGetBearerTokenResponse =
            AuthenticationGetBearerTokenResponse.builder()
                .accessToken(
                    "eyJ0eXAiOiJKV1QiLCJwdCI6InNlcnZpY2UiLCJhbGciOiJSUzI1NiIsImtpZCI6InNlcnZpY2VVc2VyXzgxYzQ5YTU0LWRmY2QtNGRhNS1iYmYzLWQyODg1ZWMwMjVkZCJ9.eyJzdWIiOiIyOTA2ZDE4Zi1lNzFiLTRlMTAtOWJkNi1mZDA3YjUyNjM4ZjIiLCJwZXJtaXNzaW9ucyI6eyJNRUFTVVJFTUVOVFMjTUVBU1VSRU1FTlRTX1VQTE9BRCNJVEVNIyoiOnRydWV9LCJpc3MiOiJodHRwczpcL1wvbTN0ZXIuY29tXC9vYXV0aDIiLCJleHAiOjE2ODA1NDU3NTAsImlhdCI6MTY4MDUyNzc1MCwib3JnSWQiOiI4MWM0OWE1NC1kZmNkLTRkYTUtYmJmMy1kMjg4NWVjMDI1ZGQifQ.EwB-H4u7jKP5Ew8g0KwkPOBJPvuzDpayzWwyfm-kLPLPm9X3b3etQi1y3btKADYLy8WU452IbRFKgkhGBXrFN5rFR7mXLc1SUR-fU-anUNKCX-QPNrCzUyI2P1icQA2KFdvnYjJfLp5-gtCJWoX-Mf09-CFNPKC7sx0cVbro1Zd4axn6KpYi_48fufRYgoprwriYgpzkvG1Tq9SZtGU3vWex0eWFRKqHur6QwdxQzi_HM08kOb3puWqTio-7r3_sMOLkGitsg0teyJ-A-gYmOayZ4I2Nad7pmciLRh70kJYpR3L1yc82MPBIaJIYRxfWcOTnY8Opyv7ZlGm-hn2lUA"
                )
                .expiresIn(18000L)
                .scope("scope")
                .tokenType("Bearer")
                .build()

        assertThat(authenticationGetBearerTokenResponse.accessToken())
            .isEqualTo(
                "eyJ0eXAiOiJKV1QiLCJwdCI6InNlcnZpY2UiLCJhbGciOiJSUzI1NiIsImtpZCI6InNlcnZpY2VVc2VyXzgxYzQ5YTU0LWRmY2QtNGRhNS1iYmYzLWQyODg1ZWMwMjVkZCJ9.eyJzdWIiOiIyOTA2ZDE4Zi1lNzFiLTRlMTAtOWJkNi1mZDA3YjUyNjM4ZjIiLCJwZXJtaXNzaW9ucyI6eyJNRUFTVVJFTUVOVFMjTUVBU1VSRU1FTlRTX1VQTE9BRCNJVEVNIyoiOnRydWV9LCJpc3MiOiJodHRwczpcL1wvbTN0ZXIuY29tXC9vYXV0aDIiLCJleHAiOjE2ODA1NDU3NTAsImlhdCI6MTY4MDUyNzc1MCwib3JnSWQiOiI4MWM0OWE1NC1kZmNkLTRkYTUtYmJmMy1kMjg4NWVjMDI1ZGQifQ.EwB-H4u7jKP5Ew8g0KwkPOBJPvuzDpayzWwyfm-kLPLPm9X3b3etQi1y3btKADYLy8WU452IbRFKgkhGBXrFN5rFR7mXLc1SUR-fU-anUNKCX-QPNrCzUyI2P1icQA2KFdvnYjJfLp5-gtCJWoX-Mf09-CFNPKC7sx0cVbro1Zd4axn6KpYi_48fufRYgoprwriYgpzkvG1Tq9SZtGU3vWex0eWFRKqHur6QwdxQzi_HM08kOb3puWqTio-7r3_sMOLkGitsg0teyJ-A-gYmOayZ4I2Nad7pmciLRh70kJYpR3L1yc82MPBIaJIYRxfWcOTnY8Opyv7ZlGm-hn2lUA"
            )
        assertThat(authenticationGetBearerTokenResponse.expiresIn()).isEqualTo(18000L)
        assertThat(authenticationGetBearerTokenResponse.scope()).contains("scope")
        assertThat(authenticationGetBearerTokenResponse.tokenType()).contains("Bearer")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authenticationGetBearerTokenResponse =
            AuthenticationGetBearerTokenResponse.builder()
                .accessToken(
                    "eyJ0eXAiOiJKV1QiLCJwdCI6InNlcnZpY2UiLCJhbGciOiJSUzI1NiIsImtpZCI6InNlcnZpY2VVc2VyXzgxYzQ5YTU0LWRmY2QtNGRhNS1iYmYzLWQyODg1ZWMwMjVkZCJ9.eyJzdWIiOiIyOTA2ZDE4Zi1lNzFiLTRlMTAtOWJkNi1mZDA3YjUyNjM4ZjIiLCJwZXJtaXNzaW9ucyI6eyJNRUFTVVJFTUVOVFMjTUVBU1VSRU1FTlRTX1VQTE9BRCNJVEVNIyoiOnRydWV9LCJpc3MiOiJodHRwczpcL1wvbTN0ZXIuY29tXC9vYXV0aDIiLCJleHAiOjE2ODA1NDU3NTAsImlhdCI6MTY4MDUyNzc1MCwib3JnSWQiOiI4MWM0OWE1NC1kZmNkLTRkYTUtYmJmMy1kMjg4NWVjMDI1ZGQifQ.EwB-H4u7jKP5Ew8g0KwkPOBJPvuzDpayzWwyfm-kLPLPm9X3b3etQi1y3btKADYLy8WU452IbRFKgkhGBXrFN5rFR7mXLc1SUR-fU-anUNKCX-QPNrCzUyI2P1icQA2KFdvnYjJfLp5-gtCJWoX-Mf09-CFNPKC7sx0cVbro1Zd4axn6KpYi_48fufRYgoprwriYgpzkvG1Tq9SZtGU3vWex0eWFRKqHur6QwdxQzi_HM08kOb3puWqTio-7r3_sMOLkGitsg0teyJ-A-gYmOayZ4I2Nad7pmciLRh70kJYpR3L1yc82MPBIaJIYRxfWcOTnY8Opyv7ZlGm-hn2lUA"
                )
                .expiresIn(18000L)
                .scope("scope")
                .tokenType("Bearer")
                .build()

        val roundtrippedAuthenticationGetBearerTokenResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authenticationGetBearerTokenResponse),
                jacksonTypeRef<AuthenticationGetBearerTokenResponse>(),
            )

        assertThat(roundtrippedAuthenticationGetBearerTokenResponse)
            .isEqualTo(authenticationGetBearerTokenResponse)
    }
}
