// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.core.ClientOptions
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.handlers.errorHandler
import com.m3ter.sdk.core.handlers.jsonHandler
import com.m3ter.sdk.core.handlers.withErrorHandler
import com.m3ter.sdk.core.http.HttpMethod
import com.m3ter.sdk.core.http.HttpRequest
import com.m3ter.sdk.core.http.HttpResponse.Handler
import com.m3ter.sdk.core.json
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.AuthenticationGetBearerTokenParams
import com.m3ter.sdk.models.AuthenticationGetBearerTokenResponse

class AuthenticationServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : AuthenticationService {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val getBearerTokenHandler: Handler<AuthenticationGetBearerTokenResponse> =
        jsonHandler<AuthenticationGetBearerTokenResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get authentication token */
    override fun getBearerToken(
        params: AuthenticationGetBearerTokenParams,
        requestOptions: RequestOptions
    ): AuthenticationGetBearerTokenResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("oauth", "token")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { getBearerTokenHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
