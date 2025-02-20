// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.models.AuthenticationGetBearerTokenParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AuthenticationServiceTest {

    @Test
    fun callGetBearerToken() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val authenticationService = client.authentication()
        val authenticationGetBearerTokenResponse =
            authenticationService.getBearerToken(
                AuthenticationGetBearerTokenParams.builder()
                    .grantType(AuthenticationGetBearerTokenParams.GrantType.CLIENT_CREDENTIALS)
                    .scope("scope")
                    .build()
            )
        println(authenticationGetBearerTokenResponse)
        authenticationGetBearerTokenResponse.validate()
    }
}
