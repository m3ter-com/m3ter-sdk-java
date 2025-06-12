// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.AuthenticationGetBearerTokenParams
import com.m3ter.models.AuthenticationGetBearerTokenResponse
import java.util.function.Consumer

interface AuthenticationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuthenticationService

    /** Get authentication token */
    fun getBearerToken(
        params: AuthenticationGetBearerTokenParams
    ): AuthenticationGetBearerTokenResponse = getBearerToken(params, RequestOptions.none())

    /** @see [getBearerToken] */
    fun getBearerToken(
        params: AuthenticationGetBearerTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthenticationGetBearerTokenResponse

    /**
     * A view of [AuthenticationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AuthenticationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /oauth/token`, but is otherwise the same as
         * [AuthenticationService.getBearerToken].
         */
        @MustBeClosed
        fun getBearerToken(
            params: AuthenticationGetBearerTokenParams
        ): HttpResponseFor<AuthenticationGetBearerTokenResponse> =
            getBearerToken(params, RequestOptions.none())

        /** @see [getBearerToken] */
        @MustBeClosed
        fun getBearerToken(
            params: AuthenticationGetBearerTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthenticationGetBearerTokenResponse>
    }
}
