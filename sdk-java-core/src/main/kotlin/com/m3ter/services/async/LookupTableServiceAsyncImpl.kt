// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

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
import com.m3ter.models.LookupTableCreateParams
import com.m3ter.models.LookupTableDeleteParams
import com.m3ter.models.LookupTableListPageAsync
import com.m3ter.models.LookupTableListPageResponse
import com.m3ter.models.LookupTableListParams
import com.m3ter.models.LookupTableResponse
import com.m3ter.models.LookupTableRetrieveParams
import com.m3ter.models.LookupTableUpdateParams
import com.m3ter.services.async.lookupTables.LookupTableRevisionDataServiceAsync
import com.m3ter.services.async.lookupTables.LookupTableRevisionDataServiceAsyncImpl
import com.m3ter.services.async.lookupTables.LookupTableRevisionServiceAsync
import com.m3ter.services.async.lookupTables.LookupTableRevisionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LookupTableServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LookupTableServiceAsync {

    private val withRawResponse: LookupTableServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val lookupTableRevisions: LookupTableRevisionServiceAsync by lazy {
        LookupTableRevisionServiceAsyncImpl(clientOptions)
    }

    private val lookupTableRevisionData: LookupTableRevisionDataServiceAsync by lazy {
        LookupTableRevisionDataServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): LookupTableServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LookupTableServiceAsync =
        LookupTableServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun lookupTableRevisions(): LookupTableRevisionServiceAsync = lookupTableRevisions

    override fun lookupTableRevisionData(): LookupTableRevisionDataServiceAsync =
        lookupTableRevisionData

    override fun create(
        params: LookupTableCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LookupTableResponse> =
        // post /organizations/{orgId}/lookuptables
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: LookupTableRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LookupTableResponse> =
        // get /organizations/{orgId}/lookuptables/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: LookupTableUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LookupTableResponse> =
        // put /organizations/{orgId}/lookuptables/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: LookupTableListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LookupTableListPageAsync> =
        // get /organizations/{orgId}/lookuptables
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: LookupTableDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LookupTableResponse> =
        // delete /organizations/{orgId}/lookuptables/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LookupTableServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val lookupTableRevisions: LookupTableRevisionServiceAsync.WithRawResponse by lazy {
            LookupTableRevisionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val lookupTableRevisionData:
            LookupTableRevisionDataServiceAsync.WithRawResponse by lazy {
            LookupTableRevisionDataServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LookupTableServiceAsync.WithRawResponse =
            LookupTableServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun lookupTableRevisions(): LookupTableRevisionServiceAsync.WithRawResponse =
            lookupTableRevisions

        override fun lookupTableRevisionData():
            LookupTableRevisionDataServiceAsync.WithRawResponse = lookupTableRevisionData

        private val createHandler: Handler<LookupTableResponse> =
            jsonHandler<LookupTableResponse>(clientOptions.jsonMapper)

        override fun create(
            params: LookupTableCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LookupTableResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "lookuptables",
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

        private val retrieveHandler: Handler<LookupTableResponse> =
            jsonHandler<LookupTableResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: LookupTableRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LookupTableResponse>> {
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

        private val updateHandler: Handler<LookupTableResponse> =
            jsonHandler<LookupTableResponse>(clientOptions.jsonMapper)

        override fun update(
            params: LookupTableUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LookupTableResponse>> {
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

        private val listHandler: Handler<LookupTableListPageResponse> =
            jsonHandler<LookupTableListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: LookupTableListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LookupTableListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "lookuptables",
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
                                LookupTableListPageAsync.builder()
                                    .service(LookupTableServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<LookupTableResponse> =
            jsonHandler<LookupTableResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: LookupTableDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LookupTableResponse>> {
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
    }
}
