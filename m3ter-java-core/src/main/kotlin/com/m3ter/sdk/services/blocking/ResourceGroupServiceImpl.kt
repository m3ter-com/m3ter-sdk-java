// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

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
import com.m3ter.sdk.core.prepare
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.ResourceGroup
import com.m3ter.sdk.models.ResourceGroupAddResourceParams
import com.m3ter.sdk.models.ResourceGroupCreateParams
import com.m3ter.sdk.models.ResourceGroupDeleteParams
import com.m3ter.sdk.models.ResourceGroupListContentsPage
import com.m3ter.sdk.models.ResourceGroupListContentsParams
import com.m3ter.sdk.models.ResourceGroupListPage
import com.m3ter.sdk.models.ResourceGroupListParams
import com.m3ter.sdk.models.ResourceGroupListPermissionsPage
import com.m3ter.sdk.models.ResourceGroupListPermissionsParams
import com.m3ter.sdk.models.ResourceGroupRemoveResourceParams
import com.m3ter.sdk.models.ResourceGroupRetrieveParams
import com.m3ter.sdk.models.ResourceGroupUpdateParams

class ResourceGroupServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ResourceGroupService {

    private val withRawResponse: ResourceGroupService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ResourceGroupService.WithRawResponse = withRawResponse

    override fun create(
        params: ResourceGroupCreateParams,
        requestOptions: RequestOptions,
    ): ResourceGroup =
        // post /organizations/{orgId}/resourcegroups/{type}
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ResourceGroupRetrieveParams,
        requestOptions: RequestOptions,
    ): ResourceGroup =
        // get /organizations/{orgId}/resourcegroups/{type}/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ResourceGroupUpdateParams,
        requestOptions: RequestOptions,
    ): ResourceGroup =
        // put /organizations/{orgId}/resourcegroups/{type}/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ResourceGroupListParams,
        requestOptions: RequestOptions,
    ): ResourceGroupListPage =
        // get /organizations/{orgId}/resourcegroups/{type}
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: ResourceGroupDeleteParams,
        requestOptions: RequestOptions,
    ): ResourceGroup =
        // delete /organizations/{orgId}/resourcegroups/{type}/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun addResource(
        params: ResourceGroupAddResourceParams,
        requestOptions: RequestOptions,
    ): ResourceGroup =
        // post /organizations/{orgId}/resourcegroups/{type}/{resourceGroupId}/addresource
        withRawResponse().addResource(params, requestOptions).parse()

    override fun listContents(
        params: ResourceGroupListContentsParams,
        requestOptions: RequestOptions,
    ): ResourceGroupListContentsPage =
        // post /organizations/{orgId}/resourcegroups/{type}/{resourceGroupId}/contents
        withRawResponse().listContents(params, requestOptions).parse()

    override fun listPermissions(
        params: ResourceGroupListPermissionsParams,
        requestOptions: RequestOptions,
    ): ResourceGroupListPermissionsPage =
        // get /organizations/{orgId}/resourcegroups/{type}/{resourceGroupId}/permissions
        withRawResponse().listPermissions(params, requestOptions).parse()

    override fun removeResource(
        params: ResourceGroupRemoveResourceParams,
        requestOptions: RequestOptions,
    ): ResourceGroup =
        // post /organizations/{orgId}/resourcegroups/{type}/{resourceGroupId}/removeresource
        withRawResponse().removeResource(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ResourceGroupService.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<ResourceGroup> =
            jsonHandler<ResourceGroup>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: ResourceGroupCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResourceGroup> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<ResourceGroup> =
            jsonHandler<ResourceGroup>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: ResourceGroupRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResourceGroup> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<ResourceGroup> =
            jsonHandler<ResourceGroup>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: ResourceGroupUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResourceGroup> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<ResourceGroupListPage.Response> =
            jsonHandler<ResourceGroupListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ResourceGroupListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResourceGroupListPage> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ResourceGroupListPage.of(
                            ResourceGroupServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }

        private val deleteHandler: Handler<ResourceGroup> =
            jsonHandler<ResourceGroup>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: ResourceGroupDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResourceGroup> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val addResourceHandler: Handler<ResourceGroup> =
            jsonHandler<ResourceGroup>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun addResource(
            params: ResourceGroupAddResourceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResourceGroup> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { addResourceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listContentsHandler: Handler<ResourceGroupListContentsPage.Response> =
            jsonHandler<ResourceGroupListContentsPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listContents(
            params: ResourceGroupListContentsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResourceGroupListContentsPage> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listContentsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ResourceGroupListContentsPage.of(
                            ResourceGroupServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }

        private val listPermissionsHandler: Handler<ResourceGroupListPermissionsPage.Response> =
            jsonHandler<ResourceGroupListPermissionsPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listPermissions(
            params: ResourceGroupListPermissionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResourceGroupListPermissionsPage> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listPermissionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ResourceGroupListPermissionsPage.of(
                            ResourceGroupServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }

        private val removeResourceHandler: Handler<ResourceGroup> =
            jsonHandler<ResourceGroup>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun removeResource(
            params: ResourceGroupRemoveResourceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResourceGroup> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
