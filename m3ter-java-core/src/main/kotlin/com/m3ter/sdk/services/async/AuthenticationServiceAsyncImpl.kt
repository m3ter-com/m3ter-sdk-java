// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

import com.m3ter.sdk.core.ClientOptions
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.handlers.errorHandler
import com.m3ter.sdk.core.handlers.jsonHandler
import com.m3ter.sdk.core.handlers.withErrorHandler
import com.m3ter.sdk.core.http.HttpMethod
import com.m3ter.sdk.core.http.HttpRequest
import com.m3ter.sdk.core.http.HttpResponse.Handler
import com.m3ter.sdk.core.json
import com.m3ter.sdk.core.prepareAsync
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.AuthenticationGetBearerTokenParams
import com.m3ter.sdk.models.AuthenticationGetBearerTokenResponse
import java.util.concurrent.CompletableFuture

class AuthenticationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : AuthenticationServiceAsync {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val getBearerTokenHandler: Handler<AuthenticationGetBearerTokenResponse> =
        jsonHandler<AuthenticationGetBearerTokenResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get authentication token */
    override fun getBearerToken(
        params: AuthenticationGetBearerTokenParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthenticationGetBearerTokenResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("oauth", "token")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { getBearerTokenHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
