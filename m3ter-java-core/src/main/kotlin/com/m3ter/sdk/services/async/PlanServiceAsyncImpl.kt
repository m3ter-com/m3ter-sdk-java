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
import com.m3ter.sdk.models.Plan
import com.m3ter.sdk.models.PlanCreateParams
import com.m3ter.sdk.models.PlanDeleteParams
import com.m3ter.sdk.models.PlanListPageAsync
import com.m3ter.sdk.models.PlanListParams
import com.m3ter.sdk.models.PlanRetrieveParams
import com.m3ter.sdk.models.PlanUpdateParams
import java.util.concurrent.CompletableFuture

class PlanServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PlanServiceAsync {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Plan> =
        jsonHandler<Plan>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new Plan. */
    override fun create(
        params: PlanCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Plan> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("organizations", params.getPathParam(0), "plans")
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

    private val retrieveHandler: Handler<Plan> =
        jsonHandler<Plan>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve the Plan with the given UUID. */
    override fun retrieve(
        params: PlanRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Plan> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "plans",
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

    private val updateHandler: Handler<Plan> =
        jsonHandler<Plan>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Update the Plan with the given UUID.
     *
     * **Note:** If you have created Custom Fields for a Plan, when you use this endpoint to update
     * the Plan use the `customFields` parameter to preserve those Custom Fields. If you omit them
     * from the update request, they will be lost.
     */
    override fun update(
        params: PlanUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Plan> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "plans",
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

    private val listHandler: Handler<PlanListPageAsync.Response> =
        jsonHandler<PlanListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve a list of Plans that can be filtered by Product, Account, or Plan ID. */
    override fun list(
        params: PlanListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlanListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "plans")
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
                    .let { PlanListPageAsync.of(this, params, it) }
            }
    }

    private val deleteHandler: Handler<Plan> =
        jsonHandler<Plan>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete the Plan with the given UUID. */
    override fun delete(
        params: PlanDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Plan> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "plans",
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
}
