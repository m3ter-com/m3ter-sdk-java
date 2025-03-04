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

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<PermissionPolicy> =
        jsonHandler<PermissionPolicy>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new Permission Policy
     *
     * **NOTE:** When you set up a policy statement for this call using the `permissionPolicy`
     * request parameter to specify the `effect`, `action`, and `resource`, you must use all lower
     * case and the format as shown in this example for a Permission Policy statement that grants
     * full CRUD access to all meters:
     * ```
     * "permissionPolicy" : [
     * 	{
     * 		"effect" : "allow",
     * 		"action" : [
     * 		"config:create",
     * 		"config:delete",
     * 		"config:retrieve",
     * 		"config:update"
     * 		]
     * 		"resource" : [
     * 		"config:meter&#47;*"
     * 		]
     * 	}
     * ]
     * ```
     *
     * For more details and further examples, see
     * [Understanding, Creating, and Managing Permission Policies](https://www.m3ter.com/docs/guides/organization-and-access-management/creating-and-managing-permissions#permission-policy-statements---available-actions-and-resources)
     * in our main Documentation.
     */
    override fun create(
        params: PermissionPolicyCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicy> {
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
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val retrieveHandler: Handler<PermissionPolicy> =
        jsonHandler<PermissionPolicy>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve the permission policy for the UUID */
    override fun retrieve(
        params: PermissionPolicyRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicy> {
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
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val updateHandler: Handler<PermissionPolicy> =
        jsonHandler<PermissionPolicy>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Update a Permission Policy for the UUID
     *
     * **NOTE:** When you set up a policy statement for this call to specify the `effect`, `action`,
     * and `resource`, you must use all lower case and the format as shown in this example - a
     * Permission Policy statement that grants full CRUD access to all meters:
     * ```
     * "permissionPolicy" : [
     * 	{
     * 		"effect" : "allow",
     * 		"action" : [
     * 		"config:create",
     * 		"config:delete",
     * 		"config:retrieve",
     * 		"config:update"
     * 		]
     * 		"resource" : [
     * 		"config:meter&#47;*"
     * 		]
     * 	}
     * ]
     * ```
     *
     * For more details and further examples, see
     * [Understanding, Creating, and Managing Permission Policies](https://www.m3ter.com/docs/guides/organization-and-access-management/creating-and-managing-permissions#permission-policy-statements---available-actions-and-resources)
     * in our main Documentation.
     */
    override fun update(
        params: PermissionPolicyUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicy> {
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
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<PermissionPolicyListPageAsync.Response> =
        jsonHandler<PermissionPolicyListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve a list of PermissionPolicy entities */
    override fun list(
        params: PermissionPolicyListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicyListPageAsync> {
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
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let { PermissionPolicyListPageAsync.of(this, params, it) }
            }
    }

    private val deleteHandler: Handler<PermissionPolicy> =
        jsonHandler<PermissionPolicy>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete the PermissionPolicy for the UUID */
    override fun delete(
        params: PermissionPolicyDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicy> {
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
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val addToServiceUserHandler: Handler<PermissionPolicyAddToServiceUserResponse> =
        jsonHandler<PermissionPolicyAddToServiceUserResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Add a permission policy to a service user. */
    override fun addToServiceUser(
        params: PermissionPolicyAddToServiceUserParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicyAddToServiceUserResponse> {
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
                response
                    .use { addToServiceUserHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val addToSupportUserHandler: Handler<PermissionPolicyAddToSupportUserResponse> =
        jsonHandler<PermissionPolicyAddToSupportUserResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Add a permission policy to support users for an organization. */
    override fun addToSupportUser(
        params: PermissionPolicyAddToSupportUserParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicyAddToSupportUserResponse> {
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
                response
                    .use { addToSupportUserHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val addToUserHandler: Handler<PermissionPolicyAddToUserResponse> =
        jsonHandler<PermissionPolicyAddToUserResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Add a permission policy to a user. */
    override fun addToUser(
        params: PermissionPolicyAddToUserParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicyAddToUserResponse> {
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
                response
                    .use { addToUserHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val addToUserGroupHandler: Handler<PermissionPolicyAddToUserGroupResponse> =
        jsonHandler<PermissionPolicyAddToUserGroupResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Add a permission Policy to a user group */
    override fun addToUserGroup(
        params: PermissionPolicyAddToUserGroupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicyAddToUserGroupResponse> {
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
                response
                    .use { addToUserGroupHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val removeFromServiceUserHandler:
        Handler<PermissionPolicyRemoveFromServiceUserResponse> =
        jsonHandler<PermissionPolicyRemoveFromServiceUserResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Remove a permission policy from a service user. */
    override fun removeFromServiceUser(
        params: PermissionPolicyRemoveFromServiceUserParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicyRemoveFromServiceUserResponse> {
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
                response
                    .use { removeFromServiceUserHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val removeFromSupportUserHandler:
        Handler<PermissionPolicyRemoveFromSupportUserResponse> =
        jsonHandler<PermissionPolicyRemoveFromSupportUserResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Remove a permission policy from support users for an organization. */
    override fun removeFromSupportUser(
        params: PermissionPolicyRemoveFromSupportUserParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicyRemoveFromSupportUserResponse> {
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
                response
                    .use { removeFromSupportUserHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val removeFromUserHandler: Handler<PermissionPolicyRemoveFromUserResponse> =
        jsonHandler<PermissionPolicyRemoveFromUserResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Remove a permission policy from a user. */
    override fun removeFromUser(
        params: PermissionPolicyRemoveFromUserParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicyRemoveFromUserResponse> {
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
                response
                    .use { removeFromUserHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val removeFromUserGroupHandler: Handler<PermissionPolicyRemoveFromUserGroupResponse> =
        jsonHandler<PermissionPolicyRemoveFromUserGroupResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Remove a permission policy from a user group. */
    override fun removeFromUserGroup(
        params: PermissionPolicyRemoveFromUserGroupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicyRemoveFromUserGroupResponse> {
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
