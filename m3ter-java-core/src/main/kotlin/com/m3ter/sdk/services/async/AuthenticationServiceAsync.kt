// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.AuthenticationGetBearerTokenParams
import com.m3ter.sdk.models.AuthenticationGetBearerTokenResponse
import java.util.concurrent.CompletableFuture

interface AuthenticationServiceAsync {

    /** Get authentication token */
    @JvmOverloads
    fun getBearerToken(
        params: AuthenticationGetBearerTokenParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AuthenticationGetBearerTokenResponse>
}
