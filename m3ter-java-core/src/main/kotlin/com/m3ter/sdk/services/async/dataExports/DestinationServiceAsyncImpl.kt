// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async.dataExports

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
import com.m3ter.sdk.models.DataExportDestinationCreateParams
import com.m3ter.sdk.models.DataExportDestinationCreateResponse
import com.m3ter.sdk.models.DataExportDestinationDeleteParams
import com.m3ter.sdk.models.DataExportDestinationDeleteResponse
import com.m3ter.sdk.models.DataExportDestinationListPageAsync
import com.m3ter.sdk.models.DataExportDestinationListParams
import com.m3ter.sdk.models.DataExportDestinationRetrieveParams
import com.m3ter.sdk.models.DataExportDestinationRetrieveResponse
import com.m3ter.sdk.models.DataExportDestinationUpdateParams
import com.m3ter.sdk.models.DataExportDestinationUpdateResponse
import java.util.concurrent.CompletableFuture

class DestinationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DestinationServiceAsync {

    private val withRawResponse: DestinationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DestinationServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: DataExportDestinationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataExportDestinationCreateResponse> =
        // post /organizations/{orgId}/dataexports/destinations
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: DataExportDestinationRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataExportDestinationRetrieveResponse> =
        // get /organizations/{orgId}/dataexports/destinations/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: DataExportDestinationUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataExportDestinationUpdateResponse> =
        // put /organizations/{orgId}/dataexports/destinations/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: DataExportDestinationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataExportDestinationListPageAsync> =
        // get /organizations/{orgId}/dataexports/destinations
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: DataExportDestinationDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataExportDestinationDeleteResponse> =
        // delete /organizations/{orgId}/dataexports/destinations/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DestinationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<DataExportDestinationCreateResponse> =
            jsonHandler<DataExportDestinationCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: DataExportDestinationCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DataExportDestinationCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "dataexports",
                        "destinations",
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

        private val retrieveHandler: Handler<DataExportDestinationRetrieveResponse> =
            jsonHandler<DataExportDestinationRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: DataExportDestinationRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DataExportDestinationRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "dataexports",
                        "destinations",
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

        private val updateHandler: Handler<DataExportDestinationUpdateResponse> =
            jsonHandler<DataExportDestinationUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: DataExportDestinationUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DataExportDestinationUpdateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "dataexports",
                        "destinations",
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

        private val listHandler: Handler<DataExportDestinationListPageAsync.Response> =
            jsonHandler<DataExportDestinationListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: DataExportDestinationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DataExportDestinationListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "dataexports",
                        "destinations",
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
                                DataExportDestinationListPageAsync.of(
                                    DestinationServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val deleteHandler: Handler<DataExportDestinationDeleteResponse> =
            jsonHandler<DataExportDestinationDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: DataExportDestinationDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DataExportDestinationDeleteResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "dataexports",
                        "destinations",
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
