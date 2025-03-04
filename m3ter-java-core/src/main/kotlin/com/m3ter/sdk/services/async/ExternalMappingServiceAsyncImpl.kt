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
import com.m3ter.sdk.models.ExternalMapping
import com.m3ter.sdk.models.ExternalMappingCreateParams
import com.m3ter.sdk.models.ExternalMappingDeleteParams
import com.m3ter.sdk.models.ExternalMappingListByExternalEntityPageAsync
import com.m3ter.sdk.models.ExternalMappingListByExternalEntityParams
import com.m3ter.sdk.models.ExternalMappingListByM3terEntityPageAsync
import com.m3ter.sdk.models.ExternalMappingListByM3terEntityParams
import com.m3ter.sdk.models.ExternalMappingListPageAsync
import com.m3ter.sdk.models.ExternalMappingListParams
import com.m3ter.sdk.models.ExternalMappingRetrieveParams
import com.m3ter.sdk.models.ExternalMappingUpdateParams
import java.util.concurrent.CompletableFuture

class ExternalMappingServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ExternalMappingServiceAsync {

    private val withRawResponse: ExternalMappingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExternalMappingServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: ExternalMappingCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalMapping> =
        // post /organizations/{orgId}/externalmappings
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: ExternalMappingRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalMapping> =
        // get /organizations/{orgId}/externalmappings/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ExternalMappingUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalMapping> =
        // put /organizations/{orgId}/externalmappings/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ExternalMappingListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalMappingListPageAsync> =
        // get /organizations/{orgId}/externalmappings
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ExternalMappingDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalMapping> =
        // delete /organizations/{orgId}/externalmappings/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun listByExternalEntity(
        params: ExternalMappingListByExternalEntityParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalMappingListByExternalEntityPageAsync> =
        // get
        // /organizations/{orgId}/externalmappings/externalid/{system}/{externalTable}/{externalId}
        withRawResponse().listByExternalEntity(params, requestOptions).thenApply { it.parse() }

    override fun listByM3terEntity(
        params: ExternalMappingListByM3terEntityParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalMappingListByM3terEntityPageAsync> =
        // get /organizations/{orgId}/externalmappings/external/{entity}/{m3terId}
        withRawResponse().listByM3terEntity(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExternalMappingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<ExternalMapping> =
            jsonHandler<ExternalMapping>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: ExternalMappingCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalMapping>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params.getPathParam(0), "externalmappings")
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

        private val retrieveHandler: Handler<ExternalMapping> =
            jsonHandler<ExternalMapping>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: ExternalMappingRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalMapping>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "externalmappings",
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

        private val updateHandler: Handler<ExternalMapping> =
            jsonHandler<ExternalMapping>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: ExternalMappingUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalMapping>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "externalmappings",
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

        private val listHandler: Handler<ExternalMappingListPageAsync.Response> =
            jsonHandler<ExternalMappingListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ExternalMappingListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalMappingListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params.getPathParam(0), "externalmappings")
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
                                ExternalMappingListPageAsync.of(
                                    ExternalMappingServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val deleteHandler: Handler<ExternalMapping> =
            jsonHandler<ExternalMapping>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: ExternalMappingDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalMapping>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "externalmappings",
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

        private val listByExternalEntityHandler:
            Handler<ExternalMappingListByExternalEntityPageAsync.Response> =
            jsonHandler<ExternalMappingListByExternalEntityPageAsync.Response>(
                    clientOptions.jsonMapper
                )
                .withErrorHandler(errorHandler)

        override fun listByExternalEntity(
            params: ExternalMappingListByExternalEntityParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalMappingListByExternalEntityPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "externalmappings",
                        "externalid",
                        params.getPathParam(1),
                        params.getPathParam(2),
                        params.getPathParam(3),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listByExternalEntityHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                ExternalMappingListByExternalEntityPageAsync.of(
                                    ExternalMappingServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val listByM3terEntityHandler:
            Handler<ExternalMappingListByM3terEntityPageAsync.Response> =
            jsonHandler<ExternalMappingListByM3terEntityPageAsync.Response>(
                    clientOptions.jsonMapper
                )
                .withErrorHandler(errorHandler)

        override fun listByM3terEntity(
            params: ExternalMappingListByM3terEntityParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalMappingListByM3terEntityPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "externalmappings",
                        "external",
                        params.getPathParam(1),
                        params.getPathParam(2),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listByM3terEntityHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                ExternalMappingListByM3terEntityPageAsync.of(
                                    ExternalMappingServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }
    }
}
