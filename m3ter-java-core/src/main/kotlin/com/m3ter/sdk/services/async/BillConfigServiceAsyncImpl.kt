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
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.core.http.json
import com.m3ter.sdk.core.http.parseable
import com.m3ter.sdk.core.prepareAsync
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.BillConfig
import com.m3ter.sdk.models.BillConfigRetrieveParams
import com.m3ter.sdk.models.BillConfigUpdateParams
import java.util.concurrent.CompletableFuture

class BillConfigServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BillConfigServiceAsync {

    private val withRawResponse: BillConfigServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BillConfigServiceAsync.WithRawResponse = withRawResponse

    override fun retrieve(
        params: BillConfigRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillConfig> =
        // get /organizations/{orgId}/billconfig
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: BillConfigUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillConfig> =
        // put /organizations/{orgId}/billconfig
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BillConfigServiceAsync.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<BillConfig> =
            jsonHandler<BillConfig>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: BillConfigRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillConfig>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params.getPathParam(0), "billconfig")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<BillConfig> =
            jsonHandler<BillConfig>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: BillConfigUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillConfig>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("organizations", params.getPathParam(0), "billconfig")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { updateHandler.handle(it) }
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
