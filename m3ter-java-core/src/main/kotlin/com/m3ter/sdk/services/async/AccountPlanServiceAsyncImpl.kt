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
import com.m3ter.sdk.models.AccountPlan
import com.m3ter.sdk.models.AccountPlanCreateParams
import com.m3ter.sdk.models.AccountPlanDeleteParams
import com.m3ter.sdk.models.AccountPlanListPageAsync
import com.m3ter.sdk.models.AccountPlanListParams
import com.m3ter.sdk.models.AccountPlanRetrieveParams
import com.m3ter.sdk.models.AccountPlanUpdateParams
import java.util.concurrent.CompletableFuture

class AccountPlanServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountPlanServiceAsync {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AccountPlan> =
        jsonHandler<AccountPlan>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new AccountPlan or AccountPlanGroup.
     *
     * This endpoint creates a new AccountPlan or AccountPlanGroup for a specific Account in your
     * Organization. The details of the new AccountPlan or AccountPlanGroup should be supplied in
     * the request body.
     *
     * **Note:** You cannot use this call to create _both_ an AccountPlan and AccountPlanGroup for
     * an Account at the same time. If you want to create both for an Account, you must submit two
     * separate calls.
     */
    override fun create(
        params: AccountPlanCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountPlan> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("organizations", params.getPathParam(0), "accountplans")
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

    private val retrieveHandler: Handler<AccountPlan> =
        jsonHandler<AccountPlan>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve the AccountPlan or AccountPlanGroup details corresponding to the given UUID. */
    override fun retrieve(
        params: AccountPlanRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountPlan> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "accountplans",
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

    private val updateHandler: Handler<AccountPlan> =
        jsonHandler<AccountPlan>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Update the AccountPlan or AccountPlanGroup with the given UUID.
     *
     * This endpoint updates a new AccountPlan or AccountPlanGroup for a specific Account in your
     * Organization. The updated information should be provided in the request body.
     *
     * **Notes:**
     * - You cannot use this call to update _both_ an AccountPlan and AccountPlanGroup for an
     *   Account at the same time. If you want to update an AccounPlan and an AccountPlanGroup
     *   attached to an Account, you must submit two separate calls.
     * - If you have created Custom Fields for an AccountPlan, when you use this endpoint to update
     *   the AccountPlan use the `customFields` parameter to preserve those Custom Fields. If you
     *   omit them from the update request, they will be lost.
     */
    override fun update(
        params: AccountPlanUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountPlan> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "accountplans",
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

    private val listHandler: Handler<AccountPlanListPageAsync.Response> =
        jsonHandler<AccountPlanListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Retrieve a list of AccountPlan and AccountPlanGroup entities for the specified Organization.
     *
     * This endpoint retrieves a list of AccountPlans and AccountPlanGroups for a specific
     * Organization. The list can be paginated for easier management, and supports filtering with
     * various parameters.
     *
     * **NOTE:** You cannot use the `product` query parameter as a single filter condition, but must
     * always use it in combination with the `account` query parameter.
     */
    override fun list(
        params: AccountPlanListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountPlanListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "accountplans")
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
                    .let { AccountPlanListPageAsync.of(this, params, it) }
            }
    }

    private val deleteHandler: Handler<AccountPlan> =
        jsonHandler<AccountPlan>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Delete the AccountPlan or AccountPlanGroup with the given UUID.
     *
     * This endpoint deletes an AccountPlan or AccountPlanGroup that has been attached to a specific
     * Account in your Organization.
     */
    override fun delete(
        params: AccountPlanDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountPlan> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "accountplans",
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
