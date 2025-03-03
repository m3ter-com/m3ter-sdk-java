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
import com.m3ter.sdk.core.json
import com.m3ter.sdk.core.prepareAsync
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.ScheduledEventConfiguration
import com.m3ter.sdk.models.ScheduledEventConfigurationCreateParams
import com.m3ter.sdk.models.ScheduledEventConfigurationDeleteParams
import com.m3ter.sdk.models.ScheduledEventConfigurationListPageAsync
import com.m3ter.sdk.models.ScheduledEventConfigurationListParams
import com.m3ter.sdk.models.ScheduledEventConfigurationRetrieveParams
import com.m3ter.sdk.models.ScheduledEventConfigurationUpdateParams
import java.util.concurrent.CompletableFuture

class ScheduledEventConfigurationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    ScheduledEventConfigurationServiceAsync {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ScheduledEventConfiguration> =
        jsonHandler<ScheduledEventConfiguration>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create a new ScheduledEventConfiguration. */
    override fun create(
        params: ScheduledEventConfigurationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScheduledEventConfiguration> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "scheduledevents",
                    "configurations",
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val retrieveHandler: Handler<ScheduledEventConfiguration> =
        jsonHandler<ScheduledEventConfiguration>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve a ScheduledEventConfiguration for the given UUID. */
    override fun retrieve(
        params: ScheduledEventConfigurationRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScheduledEventConfiguration> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "scheduledevents",
                    "configurations",
                    params.getPathParam(1),
                )
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val updateHandler: Handler<ScheduledEventConfiguration> =
        jsonHandler<ScheduledEventConfiguration>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Update a ScheduledEventConfiguration for the given UUID. */
    override fun update(
        params: ScheduledEventConfigurationUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScheduledEventConfiguration> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "scheduledevents",
                    "configurations",
                    params.getPathParam(1),
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<ScheduledEventConfigurationListPageAsync.Response> =
        jsonHandler<ScheduledEventConfigurationListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve a list of ScheduledEventConfiguration entities */
    override fun list(
        params: ScheduledEventConfigurationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScheduledEventConfigurationListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "scheduledevents",
                    "configurations",
                )
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { ScheduledEventConfigurationListPageAsync.of(this, params, it) }
            }
    }

    private val deleteHandler: Handler<ScheduledEventConfiguration> =
        jsonHandler<ScheduledEventConfiguration>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Delete the ScheduledEventConfiguration for the given UUID. */
    override fun delete(
        params: ScheduledEventConfigurationDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScheduledEventConfiguration> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "scheduledevents",
                    "configurations",
                    params.getPathParam(1),
                )
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
