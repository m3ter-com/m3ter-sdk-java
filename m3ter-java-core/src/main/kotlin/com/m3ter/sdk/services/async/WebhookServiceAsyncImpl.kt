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
import com.m3ter.sdk.models.Webhook
import com.m3ter.sdk.models.WebhookCreateParams
import com.m3ter.sdk.models.WebhookCreateResponse
import com.m3ter.sdk.models.WebhookDeleteParams
import com.m3ter.sdk.models.WebhookListPageAsync
import com.m3ter.sdk.models.WebhookListParams
import com.m3ter.sdk.models.WebhookRetrieveParams
import com.m3ter.sdk.models.WebhookSetActiveParams
import com.m3ter.sdk.models.WebhookSetActiveResponse
import com.m3ter.sdk.models.WebhookUpdateParams
import com.m3ter.sdk.models.WebhookUpdateResponse
import java.util.concurrent.CompletableFuture

class WebhookServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WebhookServiceAsync {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<WebhookCreateResponse> =
        jsonHandler<WebhookCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint creates a new webhook destination. A webhook destination is a URL where webhook
     * payloads will be sent.
     */
    override fun create(
        params: WebhookCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "integrationdestinations",
                    "webhooks",
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

    private val retrieveHandler: Handler<Webhook> =
        jsonHandler<Webhook>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve the webhook Destination for the UUID. */
    override fun retrieve(
        params: WebhookRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Webhook> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "integrationdestinations",
                    "webhooks",
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

    private val updateHandler: Handler<WebhookUpdateResponse> =
        jsonHandler<WebhookUpdateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a destination to be used for a webhook. */
    override fun update(
        params: WebhookUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookUpdateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "integrationdestinations",
                    "webhooks",
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

    private val listHandler: Handler<WebhookListPageAsync.Response> =
        jsonHandler<WebhookListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve a list of all Destinations created in the Organization. */
    override fun list(
        params: WebhookListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "integrationdestinations",
                    "webhooks",
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
                    .let { WebhookListPageAsync.of(this, params, it) }
            }
    }

    private val deleteHandler: Handler<Webhook> =
        jsonHandler<Webhook>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** This endpoint deletes a specific webhook destination identified by its UUID. */
    override fun delete(
        params: WebhookDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Webhook> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "integrationdestinations",
                    "webhooks",
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

    private val setActiveHandler: Handler<WebhookSetActiveResponse> =
        jsonHandler<WebhookSetActiveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Set the `active` status on a webhook integration destination.
     *
     * Use this endpoint to activate or deactivate a webhook integration destination. It toggles the
     * `active` status of the specific wehbook destination with the given ID.
     */
    override fun setActive(
        params: WebhookSetActiveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookSetActiveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "integrationdestinations",
                    "webhooks",
                    params.getPathParam(1),
                    "active",
                )
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { setActiveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
