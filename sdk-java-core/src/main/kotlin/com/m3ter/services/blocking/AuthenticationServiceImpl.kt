// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

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
import com.m3ter.core.prepare
import com.m3ter.models.AuthenticationGetBearerTokenParams
import com.m3ter.models.AuthenticationGetBearerTokenResponse

class AuthenticationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AuthenticationService {

    private val withRawResponse: AuthenticationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AuthenticationService.WithRawResponse = withRawResponse

    override fun getBearerToken(
        params: AuthenticationGetBearerTokenParams,
        requestOptions: RequestOptions,
    ): AuthenticationGetBearerTokenResponse =
        // post /oauth/token
        withRawResponse().getBearerToken(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AuthenticationService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val getBearerTokenHandler: Handler<AuthenticationGetBearerTokenResponse> =
            jsonHandler<AuthenticationGetBearerTokenResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun getBearerToken(
            params: AuthenticationGetBearerTokenParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthenticationGetBearerTokenResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("oauth", "token")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
