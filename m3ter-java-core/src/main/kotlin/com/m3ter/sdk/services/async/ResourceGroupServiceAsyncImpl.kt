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
import com.m3ter.sdk.models.ResourceGroup
import com.m3ter.sdk.models.ResourceGroupAddResourceParams
import com.m3ter.sdk.models.ResourceGroupCreateParams
import com.m3ter.sdk.models.ResourceGroupDeleteParams
import com.m3ter.sdk.models.ResourceGroupListContentsPageAsync
import com.m3ter.sdk.models.ResourceGroupListContentsParams
import com.m3ter.sdk.models.ResourceGroupListPageAsync
import com.m3ter.sdk.models.ResourceGroupListParams
import com.m3ter.sdk.models.ResourceGroupListPermissionsPageAsync
import com.m3ter.sdk.models.ResourceGroupListPermissionsParams
import com.m3ter.sdk.models.ResourceGroupRemoveResourceParams
import com.m3ter.sdk.models.ResourceGroupRetrieveParams
import com.m3ter.sdk.models.ResourceGroupUpdateParams
import java.util.concurrent.CompletableFuture

class ResourceGroupServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ResourceGroupServiceAsync {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ResourceGroup> =
        jsonHandler<ResourceGroup>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a ResourceGroup for the UUID */
    override fun create(
        params: ResourceGroupCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResourceGroup> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "resourcegroups",
                    params.getPathParam(1),
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

    private val retrieveHandler: Handler<ResourceGroup> =
        jsonHandler<ResourceGroup>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve the ResourceGroup for the UUID */
    override fun retrieve(
        params: ResourceGroupRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResourceGroup> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "resourcegroups",
                    params.getPathParam(1),
                    params.getPathParam(2),
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

    private val updateHandler: Handler<ResourceGroup> =
        jsonHandler<ResourceGroup>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update the ResourceGroup for the UUID */
    override fun update(
        params: ResourceGroupUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResourceGroup> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "resourcegroups",
                    params.getPathParam(1),
                    params.getPathParam(2),
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

    private val listHandler: Handler<ResourceGroupListPageAsync.Response> =
        jsonHandler<ResourceGroupListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve a list of ResourceGroup entities */
    override fun list(
        params: ResourceGroupListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResourceGroupListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "resourcegroups",
                    params.getPathParam(1),
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
                    .let { ResourceGroupListPageAsync.of(this, params, it) }
            }
    }

    private val deleteHandler: Handler<ResourceGroup> =
        jsonHandler<ResourceGroup>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete a ResourceGroup for the UUID */
    override fun delete(
        params: ResourceGroupDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResourceGroup> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "resourcegroups",
                    params.getPathParam(1),
                    params.getPathParam(2),
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

    private val addResourceHandler: Handler<ResourceGroup> =
        jsonHandler<ResourceGroup>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Add an item to a ResourceGroup. */
    override fun addResource(
        params: ResourceGroupAddResourceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResourceGroup> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "resourcegroups",
                    params.getPathParam(1),
                    params.getPathParam(2),
                    "addresource",
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { addResourceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val listContentsHandler: Handler<ResourceGroupListContentsPageAsync.Response> =
        jsonHandler<ResourceGroupListContentsPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve a list of items for a ResourceGroup */
    override fun listContents(
        params: ResourceGroupListContentsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResourceGroupListContentsPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "resourcegroups",
                    params.getPathParam(1),
                    params.getPathParam(2),
                    "contents",
                )
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listContentsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { ResourceGroupListContentsPageAsync.of(this, params, it) }
            }
    }

    private val listPermissionsHandler: Handler<ResourceGroupListPermissionsPageAsync.Response> =
        jsonHandler<ResourceGroupListPermissionsPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve a list of permission policies for a ResourceGroup */
    override fun listPermissions(
        params: ResourceGroupListPermissionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResourceGroupListPermissionsPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "resourcegroups",
                    params.getPathParam(1),
                    params.getPathParam(2),
                    "permissions",
                )
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listPermissionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { ResourceGroupListPermissionsPageAsync.of(this, params, it) }
            }
    }

    private val removeResourceHandler: Handler<ResourceGroup> =
        jsonHandler<ResourceGroup>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Remove an item from a ResourceGroup. */
    override fun removeResource(
        params: ResourceGroupRemoveResourceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResourceGroup> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "resourcegroups",
                    params.getPathParam(1),
                    params.getPathParam(2),
                    "removeresource",
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { removeResourceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
