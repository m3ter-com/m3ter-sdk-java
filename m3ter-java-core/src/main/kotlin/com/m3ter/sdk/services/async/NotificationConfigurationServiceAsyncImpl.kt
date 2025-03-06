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
import com.m3ter.sdk.models.NotificationConfigurationCreateParams
import com.m3ter.sdk.models.NotificationConfigurationDeleteParams
import com.m3ter.sdk.models.NotificationConfigurationListPageAsync
import com.m3ter.sdk.models.NotificationConfigurationListParams
import com.m3ter.sdk.models.NotificationConfigurationResponse
import com.m3ter.sdk.models.NotificationConfigurationRetrieveParams
import com.m3ter.sdk.models.NotificationConfigurationUpdateParams
import java.util.concurrent.CompletableFuture

class NotificationConfigurationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    NotificationConfigurationServiceAsync {

    private val withRawResponse: NotificationConfigurationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NotificationConfigurationServiceAsync.WithRawResponse =
        withRawResponse

    override fun create(
        params: NotificationConfigurationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationConfigurationResponse> =
        // post /organizations/{orgId}/notifications/configurations
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: NotificationConfigurationRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationConfigurationResponse> =
        // get /organizations/{orgId}/notifications/configurations/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: NotificationConfigurationUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationConfigurationResponse> =
        // put /organizations/{orgId}/notifications/configurations/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: NotificationConfigurationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationConfigurationListPageAsync> =
        // get /organizations/{orgId}/notifications/configurations
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: NotificationConfigurationDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationConfigurationResponse> =
        // delete /organizations/{orgId}/notifications/configurations/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NotificationConfigurationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<NotificationConfigurationResponse> =
            jsonHandler<NotificationConfigurationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: NotificationConfigurationCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationConfigurationResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "notifications",
                        "configurations",
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

        private val retrieveHandler: Handler<NotificationConfigurationResponse> =
            jsonHandler<NotificationConfigurationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: NotificationConfigurationRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationConfigurationResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "notifications",
                        "configurations",
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

        private val updateHandler: Handler<NotificationConfigurationResponse> =
            jsonHandler<NotificationConfigurationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: NotificationConfigurationUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationConfigurationResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "notifications",
                        "configurations",
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

        private val listHandler: Handler<NotificationConfigurationListPageAsync.Response> =
            jsonHandler<NotificationConfigurationListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: NotificationConfigurationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationConfigurationListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "notifications",
                        "configurations",
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
                                NotificationConfigurationListPageAsync.of(
                                    NotificationConfigurationServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val deleteHandler: Handler<NotificationConfigurationResponse> =
            jsonHandler<NotificationConfigurationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: NotificationConfigurationDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationConfigurationResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "notifications",
                        "configurations",
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
