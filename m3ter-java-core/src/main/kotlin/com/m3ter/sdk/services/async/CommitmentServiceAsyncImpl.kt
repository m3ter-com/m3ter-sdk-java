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
import com.m3ter.sdk.models.Commitment
import com.m3ter.sdk.models.CommitmentCreateParams
import com.m3ter.sdk.models.CommitmentDeleteParams
import com.m3ter.sdk.models.CommitmentListPageAsync
import com.m3ter.sdk.models.CommitmentListParams
import com.m3ter.sdk.models.CommitmentRetrieveParams
import com.m3ter.sdk.models.CommitmentSearchParams
import com.m3ter.sdk.models.CommitmentSearchResponse
import com.m3ter.sdk.models.CommitmentUpdateParams
import java.util.concurrent.CompletableFuture

class CommitmentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CommitmentServiceAsync {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Commitment> =
        jsonHandler<Commitment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new Commitment.
     *
     * Creates a new Commitment for an Organization. The request body must include all the necessary
     * details such as the agreed amount, overage surcharge percentage, and the associated account
     * and product details.
     *
     * **Note:** If some of the agreed Commitment amount remains unpaid at the start of an
     * end-customer contract period, when you create a Commitment for an Account you can set up
     * billing for the outstanding amount in one of two ways:
     * - Select a Product _Plan to bill with_. Use the `billingPlanId` request parameter to select
     *   the Plan used for billing.
     * - Define a _schedule of billing dates_. Omit a `billingPlanId` and use the `feeDates` request
     *   parameter to define a precise schedule of bill dates and amounts.
     */
    override fun create(
        params: CommitmentCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Commitment> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("organizations", params.getPathParam(0), "commitments")
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

    private val retrieveHandler: Handler<Commitment> =
        jsonHandler<Commitment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Retrieve a specific Commitment.
     *
     * Retrieve the details of the Commitment with the given UUID. It provides comprehensive
     * information about the Commitment, such as the agreed amount, overage surcharge percentage,
     * and other related details.
     */
    override fun retrieve(
        params: CommitmentRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Commitment> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "commitments",
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

    private val updateHandler: Handler<Commitment> =
        jsonHandler<Commitment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Modify a specific Commitment.
     *
     * Update the details of the Commitment with the given UUID. Use this endpoint to adjust
     * Commitment parameters such as the fixed amount, overage surcharge percentage, or associated
     * contract details.
     */
    override fun update(
        params: CommitmentUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Commitment> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "commitments",
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

    private val listHandler: Handler<CommitmentListPageAsync.Response> =
        jsonHandler<CommitmentListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Retrieve a list of Commitments.
     *
     * Retrieves a list of all Commitments associated with an Organization. This endpoint supports
     * pagination and includes various query parameters to filter the Commitments based on Account,
     * Product, date, and end dates.
     */
    override fun list(
        params: CommitmentListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommitmentListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "commitments")
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
                    .let { CommitmentListPageAsync.of(this, params, it) }
            }
    }

    private val deleteHandler: Handler<Commitment> =
        jsonHandler<Commitment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Remove a specific Commitment.
     *
     * Deletes the Commitment with the given UUID. Use this endpoint when a Commitment is no longer
     * valid or needs to be removed from the system.
     */
    override fun delete(
        params: CommitmentDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Commitment> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "commitments",
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

    private val searchHandler: Handler<CommitmentSearchResponse> =
        jsonHandler<CommitmentSearchResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Search for commitment entities.
     *
     * This endpoint executes a search query for Commitments based on the user specified search
     * criteria. The search query is customizable, allowing for complex nested conditions and
     * sorting. The returned list of Commitments can be paginated for easier management.
     */
    override fun search(
        params: CommitmentSearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommitmentSearchResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "commitments", "search")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { searchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
