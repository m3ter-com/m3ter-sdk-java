// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.lookupTables

import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.checkRequired
import com.m3ter.core.handlers.errorBodyHandler
import com.m3ter.core.handlers.errorHandler
import com.m3ter.core.handlers.jsonHandler
import com.m3ter.core.http.HttpMethod
import com.m3ter.core.http.HttpRequest
import com.m3ter.core.http.HttpResponse
import com.m3ter.core.http.HttpResponse.Handler
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.core.http.json
import com.m3ter.core.http.parseable
import com.m3ter.core.prepareAsync
import com.m3ter.models.LookupTableLookupTableRevisionCreateParams
import com.m3ter.models.LookupTableLookupTableRevisionDeleteParams
import com.m3ter.models.LookupTableLookupTableRevisionListPageAsync
import com.m3ter.models.LookupTableLookupTableRevisionListPageResponse
import com.m3ter.models.LookupTableLookupTableRevisionListParams
import com.m3ter.models.LookupTableLookupTableRevisionRetrieveParams
import com.m3ter.models.LookupTableLookupTableRevisionUpdateParams
import com.m3ter.models.LookupTableLookupTableRevisionUpdateStatusParams
import com.m3ter.models.LookupTableRevisionResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LookupTableRevisionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : LookupTableRevisionServiceAsync {

    private val withRawResponse: LookupTableRevisionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LookupTableRevisionServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): LookupTableRevisionServiceAsync =
        LookupTableRevisionServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: LookupTableLookupTableRevisionCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LookupTableRevisionResponse> =
        // post /organizations/{orgId}/lookuptables/{lookupTableId}/revisions
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: LookupTableLookupTableRevisionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LookupTableRevisionResponse> =
        // get /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: LookupTableLookupTableRevisionUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LookupTableRevisionResponse> =
        // put /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: LookupTableLookupTableRevisionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LookupTableLookupTableRevisionListPageAsync> =
        // get /organizations/{orgId}/lookuptables/{lookupTableId}/revisions
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: LookupTableLookupTableRevisionDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LookupTableRevisionResponse> =
        // delete /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun updateStatus(
        params: LookupTableLookupTableRevisionUpdateStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LookupTableRevisionResponse> =
        // put /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{id}/status
        withRawResponse().updateStatus(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LookupTableRevisionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LookupTableRevisionServiceAsync.WithRawResponse =
            LookupTableRevisionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<LookupTableRevisionResponse> =
            jsonHandler<LookupTableRevisionResponse>(clientOptions.jsonMapper)

        override fun create(
            params: LookupTableLookupTableRevisionCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LookupTableRevisionResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("lookupTableId", params.lookupTableId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "lookuptables",
                        params._pathParam(1),
                        "revisions",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val retrieveHandler: Handler<LookupTableRevisionResponse> =
            jsonHandler<LookupTableRevisionResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: LookupTableLookupTableRevisionRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LookupTableRevisionResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "lookuptables",
                        params._pathParam(1),
                        "revisions",
                        params._pathParam(2),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val updateHandler: Handler<LookupTableRevisionResponse> =
            jsonHandler<LookupTableRevisionResponse>(clientOptions.jsonMapper)

        override fun update(
            params: LookupTableLookupTableRevisionUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LookupTableRevisionResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "lookuptables",
                        params._pathParam(1),
                        "revisions",
                        params._pathParam(2),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val listHandler: Handler<LookupTableLookupTableRevisionListPageResponse> =
            jsonHandler<LookupTableLookupTableRevisionListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: LookupTableLookupTableRevisionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionListPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("lookupTableId", params.lookupTableId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "lookuptables",
                        params._pathParam(1),
                        "revisions",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                LookupTableLookupTableRevisionListPageAsync.builder()
                                    .service(LookupTableRevisionServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<LookupTableRevisionResponse> =
            jsonHandler<LookupTableRevisionResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: LookupTableLookupTableRevisionDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LookupTableRevisionResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "lookuptables",
                        params._pathParam(1),
                        "revisions",
                        params._pathParam(2),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val updateStatusHandler: Handler<LookupTableRevisionResponse> =
            jsonHandler<LookupTableRevisionResponse>(clientOptions.jsonMapper)

        override fun updateStatus(
            params: LookupTableLookupTableRevisionUpdateStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LookupTableRevisionResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "lookuptables",
                        params._pathParam(1),
                        "revisions",
                        params._pathParam(2),
                        "status",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateStatusHandler.handle(it) }
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
