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
import com.m3ter.sdk.core.json
import com.m3ter.sdk.core.prepare
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.Balance
import com.m3ter.sdk.models.BalanceCreateParams
import com.m3ter.sdk.models.BalanceDeleteParams
import com.m3ter.sdk.models.BalanceListParams
import com.m3ter.sdk.models.BalanceListResponse
import com.m3ter.sdk.models.BalanceRetrieveParams
import com.m3ter.sdk.models.BalanceUpdateParams
import com.m3ter.sdk.services.blocking.balances.TransactionService
import com.m3ter.sdk.services.blocking.balances.TransactionServiceImpl

class BalanceServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : BalanceService {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val transactions: TransactionService by lazy { TransactionServiceImpl(clientOptions) }

    override fun transactions(): TransactionService = transactions

    private val createHandler: Handler<Balance> =
        jsonHandler<Balance>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new Balance for the given end customer Account.
     *
     * This endpoint allows you to create a new Balance for a specific end customer Account. The
     * Balance details should be provided in the request body.
     */
    override fun create(params: BalanceCreateParams, requestOptions: RequestOptions): Balance {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("organizations", params.getPathParam(0), "balances")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<Balance> =
        jsonHandler<Balance>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Retrieve a specific Balance.
     *
     * This endpoint returns the details of the specified Balance.
     */
    override fun retrieve(params: BalanceRetrieveParams, requestOptions: RequestOptions): Balance {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "balances",
                    params.getPathParam(1)
                )
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val updateHandler: Handler<Balance> =
        jsonHandler<Balance>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Update a specific Balance.
     *
     * This endpoint allows you to update the details of a specific Balance. The updated Balance
     * details should be provided in the request body.
     */
    override fun update(params: BalanceUpdateParams, requestOptions: RequestOptions): Balance {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "balances",
                    params.getPathParam(1)
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<BalanceListResponse> =
        jsonHandler<BalanceListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Retrieve a list of all Balances for your Organization.
     *
     * This endpoint returns a list of all Balances associated with your organization. You can
     * filter the Balances by the end customer's Account UUID and end dates, and paginate through
     * them using the `pageSize` and `nextToken` parameters.
     */
    override fun list(
        params: BalanceListParams,
        requestOptions: RequestOptions
    ): BalanceListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "balances")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val deleteHandler: Handler<Balance> =
        jsonHandler<Balance>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Delete a specific Balance.
     *
     * This endpoint allows you to delete a specific Balance with the given UUID.
     */
    override fun delete(params: BalanceDeleteParams, requestOptions: RequestOptions): Balance {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "balances",
                    params.getPathParam(1)
                )
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { deleteHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
