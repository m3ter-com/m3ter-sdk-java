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
import com.m3ter.sdk.models.CreditReason
import com.m3ter.sdk.models.CreditReasonCreateParams
import com.m3ter.sdk.models.CreditReasonDeleteParams
import com.m3ter.sdk.models.CreditReasonListPageAsync
import com.m3ter.sdk.models.CreditReasonListParams
import com.m3ter.sdk.models.CreditReasonRetrieveParams
import com.m3ter.sdk.models.CreditReasonUpdateParams
import java.util.concurrent.CompletableFuture

class CreditReasonServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CreditReasonServiceAsync {

    private val withRawResponse: CreditReasonServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CreditReasonServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: CreditReasonCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditReason> =
        // post /organizations/{orgId}/picklists/creditreasons
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: CreditReasonRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditReason> =
        // get /organizations/{orgId}/picklists/creditreasons/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CreditReasonUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditReason> =
        // put /organizations/{orgId}/picklists/creditreasons/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CreditReasonListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditReasonListPageAsync> =
        // get /organizations/{orgId}/picklists/creditreasons
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: CreditReasonDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditReason> =
        // delete /organizations/{orgId}/picklists/creditreasons/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CreditReasonServiceAsync.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CreditReason> =
            jsonHandler<CreditReason>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: CreditReasonCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditReason>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "picklists",
                        "creditreasons",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<CreditReason> =
            jsonHandler<CreditReason>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: CreditReasonRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditReason>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "picklists",
                        "creditreasons",
                        params.getPathParam(1),
                    )
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

        private val updateHandler: Handler<CreditReason> =
            jsonHandler<CreditReason>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: CreditReasonUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditReason>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "picklists",
                        "creditreasons",
                        params.getPathParam(1),
                    )
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

        private val listHandler: Handler<CreditReasonListPageAsync.Response> =
            jsonHandler<CreditReasonListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CreditReasonListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditReasonListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "picklists",
                        "creditreasons",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                CreditReasonListPageAsync.of(
                                    CreditReasonServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val deleteHandler: Handler<CreditReason> =
            jsonHandler<CreditReason>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: CreditReasonDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditReason>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "picklists",
                        "creditreasons",
                        params.getPathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { deleteHandler.handle(it) }
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
