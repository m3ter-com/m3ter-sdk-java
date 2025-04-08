// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.core.ClientOptions
import com.m3ter.core.JsonValue
import com.m3ter.core.RequestOptions
import com.m3ter.core.handlers.errorHandler
import com.m3ter.core.handlers.jsonHandler
import com.m3ter.core.handlers.withErrorHandler
import com.m3ter.core.http.HttpMethod
import com.m3ter.core.http.HttpRequest
import com.m3ter.core.http.HttpResponse.Handler
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.core.http.json
import com.m3ter.core.http.parseable
import com.m3ter.core.prepareAsync
import com.m3ter.models.AuthenticationGetBearerTokenParams
import com.m3ter.models.AuthenticationGetBearerTokenResponse
import java.util.concurrent.CompletableFuture

class AuthenticationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : AuthenticationServiceAsync {

    private val withRawResponse: AuthenticationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AuthenticationServiceAsync.WithRawResponse = withRawResponse

    override fun getBearerToken(
        params: AuthenticationGetBearerTokenParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthenticationGetBearerTokenResponse> =
        // post /oauth/token
        withRawResponse().getBearerToken(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AuthenticationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val getBearerTokenHandler: Handler<AuthenticationGetBearerTokenResponse> =
            jsonHandler<AuthenticationGetBearerTokenResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun getBearerToken(
            params: AuthenticationGetBearerTokenParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AuthenticationGetBearerTokenResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("oauth", "token")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { getBearerTokenHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
