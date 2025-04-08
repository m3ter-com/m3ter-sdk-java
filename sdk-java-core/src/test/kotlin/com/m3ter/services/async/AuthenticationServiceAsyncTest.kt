// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.models.AuthenticationGetBearerTokenParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AuthenticationServiceAsyncTest {

    @Test
    fun getBearerToken() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val authenticationServiceAsync = client.authentication()

        val responseFuture =
            authenticationServiceAsync.getBearerToken(
                AuthenticationGetBearerTokenParams.builder()
                    .grantType(AuthenticationGetBearerTokenParams.GrantType.CLIENT_CREDENTIALS)
                    .scope("scope")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
