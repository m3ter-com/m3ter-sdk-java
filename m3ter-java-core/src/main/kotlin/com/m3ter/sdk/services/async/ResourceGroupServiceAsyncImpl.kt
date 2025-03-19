// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

import com.m3ter.sdk.core.ClientOptions
import com.m3ter.sdk.core.JsonValue
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
import com.m3ter.sdk.models.ResourceGroupResponse
import com.m3ter.sdk.models.ResourceGroupRetrieveParams
import com.m3ter.sdk.models.ResourceGroupUpdateParams
import java.util.concurrent.CompletableFuture

class ResourceGroupServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ResourceGroupServiceAsync {

    private val withRawResponse: ResourceGroupServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ResourceGroupServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: ResourceGroupCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResourceGroupResponse> =
        // post /organizations/{orgId}/resourcegroups/{type}
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: ResourceGroupRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResourceGroupResponse> =
        // get /organizations/{orgId}/resourcegroups/{type}/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ResourceGroupUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResourceGroupResponse> =
        // put /organizations/{orgId}/resourcegroups/{type}/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ResourceGroupListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResourceGroupListPageAsync> =
        // get /organizations/{orgId}/resourcegroups/{type}
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ResourceGroupDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResourceGroupResponse> =
        // delete /organizations/{orgId}/resourcegroups/{type}/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun addResource(
        params: ResourceGroupAddResourceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResourceGroupResponse> =
        // post /organizations/{orgId}/resourcegroups/{type}/{resourceGroupId}/addresource
        withRawResponse().addResource(params, requestOptions).thenApply { it.parse() }

    override fun listContents(
        params: ResourceGroupListContentsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResourceGroupListContentsPageAsync> =
        // post /organizations/{orgId}/resourcegroups/{type}/{resourceGroupId}/contents
        withRawResponse().listContents(params, requestOptions).thenApply { it.parse() }

    override fun listPermissions(
        params: ResourceGroupListPermissionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResourceGroupListPermissionsPageAsync> =
        // get /organizations/{orgId}/resourcegroups/{type}/{resourceGroupId}/permissions
        withRawResponse().listPermissions(params, requestOptions).thenApply { it.parse() }

    override fun removeResource(
        params: ResourceGroupRemoveResourceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResourceGroupResponse> =
        // post /organizations/{orgId}/resourcegroups/{type}/{resourceGroupId}/removeresource
        withRawResponse().removeResource(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ResourceGroupServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<ResourceGroupResponse> =
            jsonHandler<ResourceGroupResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: ResourceGroupCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "resourcegroups",
                        params._pathParam(1),
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

        private val retrieveHandler: Handler<ResourceGroupResponse> =
            jsonHandler<ResourceGroupResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: ResourceGroupRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "resourcegroups",
                        params._pathParam(1),
                        params._pathParam(2),
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

        private val updateHandler: Handler<ResourceGroupResponse> =
            jsonHandler<ResourceGroupResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: ResourceGroupUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "resourcegroups",
                        params._pathParam(1),
                        params._pathParam(2),
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

        private val listHandler: Handler<ResourceGroupListPageAsync.Response> =
            jsonHandler<ResourceGroupListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ResourceGroupListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ResourceGroupListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "resourcegroups",
                        params._pathParam(1),
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
                                ResourceGroupListPageAsync.of(
                                    ResourceGroupServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val deleteHandler: Handler<ResourceGroupResponse> =
            jsonHandler<ResourceGroupResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: ResourceGroupDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "resourcegroups",
                        params._pathParam(1),
                        params._pathParam(2),
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

        private val addResourceHandler: Handler<ResourceGroupResponse> =
            jsonHandler<ResourceGroupResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun addResource(
            params: ResourceGroupAddResourceParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "resourcegroups",
                        params._pathParam(1),
                        params._pathParam(2),
                        "addresource",
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
                            .use { addResourceHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listContentsHandler: Handler<ResourceGroupListContentsPageAsync.Response> =
            jsonHandler<ResourceGroupListContentsPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listContents(
            params: ResourceGroupListContentsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ResourceGroupListContentsPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "resourcegroups",
                        params._pathParam(1),
                        params._pathParam(2),
                        "contents",
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
                            .use { listContentsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                ResourceGroupListContentsPageAsync.of(
                                    ResourceGroupServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val listPermissionsHandler:
            Handler<ResourceGroupListPermissionsPageAsync.Response> =
            jsonHandler<ResourceGroupListPermissionsPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listPermissions(
            params: ResourceGroupListPermissionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ResourceGroupListPermissionsPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "resourcegroups",
                        params._pathParam(1),
                        params._pathParam(2),
                        "permissions",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listPermissionsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                ResourceGroupListPermissionsPageAsync.of(
                                    ResourceGroupServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val removeResourceHandler: Handler<ResourceGroupResponse> =
            jsonHandler<ResourceGroupResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun removeResource(
            params: ResourceGroupRemoveResourceParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "resourcegroups",
                        params._pathParam(1),
                        params._pathParam(2),
                        "removeresource",
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
                            .use { removeResourceHandler.handle(it) }
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
