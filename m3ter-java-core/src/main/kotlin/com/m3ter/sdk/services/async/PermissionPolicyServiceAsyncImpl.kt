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
import com.m3ter.sdk.models.PermissionPolicy
import com.m3ter.sdk.models.PermissionPolicyAddToServiceUserParams
import com.m3ter.sdk.models.PermissionPolicyAddToServiceUserResponse
import com.m3ter.sdk.models.PermissionPolicyAddToSupportUserParams
import com.m3ter.sdk.models.PermissionPolicyAddToSupportUserResponse
import com.m3ter.sdk.models.PermissionPolicyAddToUserGroupParams
import com.m3ter.sdk.models.PermissionPolicyAddToUserGroupResponse
import com.m3ter.sdk.models.PermissionPolicyAddToUserParams
import com.m3ter.sdk.models.PermissionPolicyAddToUserResponse
import com.m3ter.sdk.models.PermissionPolicyCreateParams
import com.m3ter.sdk.models.PermissionPolicyDeleteParams
import com.m3ter.sdk.models.PermissionPolicyListPageAsync
import com.m3ter.sdk.models.PermissionPolicyListParams
import com.m3ter.sdk.models.PermissionPolicyRemoveFromServiceUserParams
import com.m3ter.sdk.models.PermissionPolicyRemoveFromServiceUserResponse
import com.m3ter.sdk.models.PermissionPolicyRemoveFromSupportUserParams
import com.m3ter.sdk.models.PermissionPolicyRemoveFromSupportUserResponse
import com.m3ter.sdk.models.PermissionPolicyRemoveFromUserGroupParams
import com.m3ter.sdk.models.PermissionPolicyRemoveFromUserGroupResponse
import com.m3ter.sdk.models.PermissionPolicyRemoveFromUserParams
import com.m3ter.sdk.models.PermissionPolicyRemoveFromUserResponse
import com.m3ter.sdk.models.PermissionPolicyRetrieveParams
import com.m3ter.sdk.models.PermissionPolicyUpdateParams
import java.util.concurrent.CompletableFuture

class PermissionPolicyServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : PermissionPolicyServiceAsync {

    private val withRawResponse: PermissionPolicyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PermissionPolicyServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: PermissionPolicyCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicy> =
        // post /organizations/{orgId}/permissionpolicies
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: PermissionPolicyRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicy> =
        // get /organizations/{orgId}/permissionpolicies/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: PermissionPolicyUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicy> =
        // put /organizations/{orgId}/permissionpolicies/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: PermissionPolicyListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicyListPageAsync> =
        // get /organizations/{orgId}/permissionpolicies
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: PermissionPolicyDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicy> =
        // delete /organizations/{orgId}/permissionpolicies/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun addToServiceUser(
        params: PermissionPolicyAddToServiceUserParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicyAddToServiceUserResponse> =
        // post /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/addtoserviceuser
        withRawResponse().addToServiceUser(params, requestOptions).thenApply { it.parse() }

    override fun addToSupportUser(
        params: PermissionPolicyAddToSupportUserParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicyAddToSupportUserResponse> =
        // post /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/addtosupportusers
        withRawResponse().addToSupportUser(params, requestOptions).thenApply { it.parse() }

    override fun addToUser(
        params: PermissionPolicyAddToUserParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicyAddToUserResponse> =
        // post /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/addtouser
        withRawResponse().addToUser(params, requestOptions).thenApply { it.parse() }

    override fun addToUserGroup(
        params: PermissionPolicyAddToUserGroupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicyAddToUserGroupResponse> =
        // post /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/addtousergroup
        withRawResponse().addToUserGroup(params, requestOptions).thenApply { it.parse() }

    override fun removeFromServiceUser(
        params: PermissionPolicyRemoveFromServiceUserParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicyRemoveFromServiceUserResponse> =
        // post /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/removefromserviceuser
        withRawResponse().removeFromServiceUser(params, requestOptions).thenApply { it.parse() }

    override fun removeFromSupportUser(
        params: PermissionPolicyRemoveFromSupportUserParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicyRemoveFromSupportUserResponse> =
        // post
        // /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/removefromsupportusers
        withRawResponse().removeFromSupportUser(params, requestOptions).thenApply { it.parse() }

    override fun removeFromUser(
        params: PermissionPolicyRemoveFromUserParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicyRemoveFromUserResponse> =
        // post /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/removefromuser
        withRawResponse().removeFromUser(params, requestOptions).thenApply { it.parse() }

    override fun removeFromUserGroup(
        params: PermissionPolicyRemoveFromUserGroupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicyRemoveFromUserGroupResponse> =
        // post /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/removefromusergroup
        withRawResponse().removeFromUserGroup(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PermissionPolicyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<PermissionPolicy> =
            jsonHandler<PermissionPolicy>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: PermissionPolicyCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PermissionPolicy>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params.getPathParam(0), "permissionpolicies")
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

        private val retrieveHandler: Handler<PermissionPolicy> =
            jsonHandler<PermissionPolicy>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: PermissionPolicyRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PermissionPolicy>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "permissionpolicies",
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

        private val updateHandler: Handler<PermissionPolicy> =
            jsonHandler<PermissionPolicy>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: PermissionPolicyUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PermissionPolicy>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "permissionpolicies",
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

        private val listHandler: Handler<PermissionPolicyListPageAsync.Response> =
            jsonHandler<PermissionPolicyListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: PermissionPolicyListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PermissionPolicyListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params.getPathParam(0), "permissionpolicies")
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
                                PermissionPolicyListPageAsync.of(
                                    PermissionPolicyServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val deleteHandler: Handler<PermissionPolicy> =
            jsonHandler<PermissionPolicy>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: PermissionPolicyDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PermissionPolicy>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "permissionpolicies",
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

        private val addToServiceUserHandler: Handler<PermissionPolicyAddToServiceUserResponse> =
            jsonHandler<PermissionPolicyAddToServiceUserResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun addToServiceUser(
            params: PermissionPolicyAddToServiceUserParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToServiceUserResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "permissionpolicies",
                        params.getPathParam(1),
                        "addtoserviceuser",
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
                            .use { addToServiceUserHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val addToSupportUserHandler: Handler<PermissionPolicyAddToSupportUserResponse> =
            jsonHandler<PermissionPolicyAddToSupportUserResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun addToSupportUser(
            params: PermissionPolicyAddToSupportUserParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToSupportUserResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "permissionpolicies",
                        params.getPathParam(1),
                        "addtosupportusers",
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
                            .use { addToSupportUserHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val addToUserHandler: Handler<PermissionPolicyAddToUserResponse> =
            jsonHandler<PermissionPolicyAddToUserResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun addToUser(
            params: PermissionPolicyAddToUserParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToUserResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "permissionpolicies",
                        params.getPathParam(1),
                        "addtouser",
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
                            .use { addToUserHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val addToUserGroupHandler: Handler<PermissionPolicyAddToUserGroupResponse> =
            jsonHandler<PermissionPolicyAddToUserGroupResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun addToUserGroup(
            params: PermissionPolicyAddToUserGroupParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToUserGroupResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "permissionpolicies",
                        params.getPathParam(1),
                        "addtousergroup",
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
                            .use { addToUserGroupHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val removeFromServiceUserHandler:
            Handler<PermissionPolicyRemoveFromServiceUserResponse> =
            jsonHandler<PermissionPolicyRemoveFromServiceUserResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun removeFromServiceUser(
            params: PermissionPolicyRemoveFromServiceUserParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromServiceUserResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "permissionpolicies",
                        params.getPathParam(1),
                        "removefromserviceuser",
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
                            .use { removeFromServiceUserHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val removeFromSupportUserHandler:
            Handler<PermissionPolicyRemoveFromSupportUserResponse> =
            jsonHandler<PermissionPolicyRemoveFromSupportUserResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun removeFromSupportUser(
            params: PermissionPolicyRemoveFromSupportUserParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromSupportUserResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "permissionpolicies",
                        params.getPathParam(1),
                        "removefromsupportusers",
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
                            .use { removeFromSupportUserHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val removeFromUserHandler: Handler<PermissionPolicyRemoveFromUserResponse> =
            jsonHandler<PermissionPolicyRemoveFromUserResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun removeFromUser(
            params: PermissionPolicyRemoveFromUserParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromUserResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "permissionpolicies",
                        params.getPathParam(1),
                        "removefromuser",
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
                            .use { removeFromUserHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val removeFromUserGroupHandler:
            Handler<PermissionPolicyRemoveFromUserGroupResponse> =
            jsonHandler<PermissionPolicyRemoveFromUserGroupResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun removeFromUserGroup(
            params: PermissionPolicyRemoveFromUserGroupParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromUserGroupResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "permissionpolicies",
                        params.getPathParam(1),
                        "removefromusergroup",
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
                            .use { removeFromUserGroupHandler.handle(it) }
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
