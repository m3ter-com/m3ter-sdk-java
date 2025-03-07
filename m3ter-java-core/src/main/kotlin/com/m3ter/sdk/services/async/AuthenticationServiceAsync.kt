// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.AuthenticationGetBearerTokenParams
import com.m3ter.sdk.models.AuthenticationGetBearerTokenResponse
import java.util.concurrent.CompletableFuture

interface AuthenticationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get authentication token */
    @JvmOverloads
    fun getBearerToken(
        params: AuthenticationGetBearerTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthenticationGetBearerTokenResponse>

    /**
     * A view of [AuthenticationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /oauth/token`, but is otherwise the same as
         * [AuthenticationServiceAsync.getBearerToken].
         */
        @JvmOverloads
        @MustBeClosed
        fun getBearerToken(
            params: AuthenticationGetBearerTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthenticationGetBearerTokenResponse>>
    }
}
