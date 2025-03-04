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
import com.m3ter.sdk.core.http.parseable
import com.m3ter.sdk.core.json
import com.m3ter.sdk.core.prepareAsync
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.IntegrationConfiguration
import com.m3ter.sdk.models.IntegrationConfigurationCreateParams
import com.m3ter.sdk.models.IntegrationConfigurationCreateResponse
import com.m3ter.sdk.models.IntegrationConfigurationDeleteParams
import com.m3ter.sdk.models.IntegrationConfigurationDeleteResponse
import com.m3ter.sdk.models.IntegrationConfigurationEnableParams
import com.m3ter.sdk.models.IntegrationConfigurationEnableResponse
import com.m3ter.sdk.models.IntegrationConfigurationGetByEntityParams
import com.m3ter.sdk.models.IntegrationConfigurationListPageAsync
import com.m3ter.sdk.models.IntegrationConfigurationListParams
import com.m3ter.sdk.models.IntegrationConfigurationRetrieveParams
import com.m3ter.sdk.models.IntegrationConfigurationUpdateParams
import com.m3ter.sdk.models.IntegrationConfigurationUpdateResponse
import java.util.concurrent.CompletableFuture

class IntegrationConfigurationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    IntegrationConfigurationServiceAsync {

    private val withRawResponse: IntegrationConfigurationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IntegrationConfigurationServiceAsync.WithRawResponse =
        withRawResponse

    override fun create(
        params: IntegrationConfigurationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegrationConfigurationCreateResponse> =
        // post /organizations/{orgId}/integrationconfigs
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: IntegrationConfigurationRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegrationConfiguration> =
        // get /organizations/{orgId}/integrationconfigs/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: IntegrationConfigurationUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegrationConfigurationUpdateResponse> =
        // put /organizations/{orgId}/integrationconfigs/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: IntegrationConfigurationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegrationConfigurationListPageAsync> =
        // get /organizations/{orgId}/integrationconfigs
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: IntegrationConfigurationDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegrationConfigurationDeleteResponse> =
        // delete /organizations/{orgId}/integrationconfigs/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun enable(
        params: IntegrationConfigurationEnableParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegrationConfigurationEnableResponse> =
        // post /organizations/{orgId}/integrationconfigs/{id}/enable
        withRawResponse().enable(params, requestOptions).thenApply { it.parse() }

    override fun getByEntity(
        params: IntegrationConfigurationGetByEntityParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegrationConfiguration> =
        // get /organizations/{orgId}/integrationconfigs/entity/{entityType}
        withRawResponse().getByEntity(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IntegrationConfigurationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<IntegrationConfigurationCreateResponse> =
            jsonHandler<IntegrationConfigurationCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: IntegrationConfigurationCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params.getPathParam(0), "integrationconfigs")
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

        private val retrieveHandler: Handler<IntegrationConfiguration> =
            jsonHandler<IntegrationConfiguration>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: IntegrationConfigurationRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegrationConfiguration>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "integrationconfigs",
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

        private val updateHandler: Handler<IntegrationConfigurationUpdateResponse> =
            jsonHandler<IntegrationConfigurationUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: IntegrationConfigurationUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationUpdateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "integrationconfigs",
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

        private val listHandler: Handler<IntegrationConfigurationListPageAsync.Response> =
            jsonHandler<IntegrationConfigurationListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: IntegrationConfigurationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params.getPathParam(0), "integrationconfigs")
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
                                IntegrationConfigurationListPageAsync.of(
                                    IntegrationConfigurationServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val deleteHandler: Handler<IntegrationConfigurationDeleteResponse> =
            jsonHandler<IntegrationConfigurationDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: IntegrationConfigurationDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationDeleteResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "integrationconfigs",
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

        private val enableHandler: Handler<IntegrationConfigurationEnableResponse> =
            jsonHandler<IntegrationConfigurationEnableResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun enable(
            params: IntegrationConfigurationEnableParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationEnableResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "integrationconfigs",
                        params.getPathParam(1),
                        "enable",
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
                            .use { enableHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getByEntityHandler: Handler<IntegrationConfiguration> =
            jsonHandler<IntegrationConfiguration>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun getByEntity(
            params: IntegrationConfigurationGetByEntityParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegrationConfiguration>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "integrationconfigs",
                        "entity",
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
                            .use { getByEntityHandler.handle(it) }
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
