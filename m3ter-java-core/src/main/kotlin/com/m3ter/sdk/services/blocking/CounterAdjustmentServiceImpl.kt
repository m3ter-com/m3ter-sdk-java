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
import com.m3ter.sdk.models.CounterAdjustment
import com.m3ter.sdk.models.CounterAdjustmentCreateParams
import com.m3ter.sdk.models.CounterAdjustmentDeleteParams
import com.m3ter.sdk.models.CounterAdjustmentListPage
import com.m3ter.sdk.models.CounterAdjustmentListParams
import com.m3ter.sdk.models.CounterAdjustmentRetrieveParams
import com.m3ter.sdk.models.CounterAdjustmentUpdateParams

class CounterAdjustmentServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : CounterAdjustmentService {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<CounterAdjustment> =
        jsonHandler<CounterAdjustment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new CounterAdjustment for an Account using a Counter.
     *
     * **Notes:**
     * - Use the new absolute value for the Counter for the selected date - if it was 15 and has
     *   increased to 20, enter 20; if it was 15 and has decreased to 10, enter 10. _Do not enter_
     *   the plus or minus value relative to the previous Counter value on the Account.
     * - CounterAdjustments on Accounts are supported down to a _specific day_ of granularity - you
     *   cannot create more than one CounterAdjustment for any given day using the same Counter and
     *   you'll receive an error if you try to do this.
     */
    override fun create(
        params: CounterAdjustmentCreateParams,
        requestOptions: RequestOptions
    ): CounterAdjustment {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("organizations", params.getPathParam(0), "counteradjustments")
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

    private val retrieveHandler: Handler<CounterAdjustment> =
        jsonHandler<CounterAdjustment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a CounterAdjustment for the given UUID. */
    override fun retrieve(
        params: CounterAdjustmentRetrieveParams,
        requestOptions: RequestOptions
    ): CounterAdjustment {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "counteradjustments",
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

    private val updateHandler: Handler<CounterAdjustment> =
        jsonHandler<CounterAdjustment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a CounterAdjustment for an Account. */
    override fun update(
        params: CounterAdjustmentUpdateParams,
        requestOptions: RequestOptions
    ): CounterAdjustment {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "counteradjustments",
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

    private val listHandler: Handler<CounterAdjustmentListPage.Response> =
        jsonHandler<CounterAdjustmentListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Retrieve a list of CounterAdjustments created for Accounts in your Organization. You can
     * filter the list returned by date, Account ID, or Counter ID.
     *
     * **CONSTRAINTS:**
     * - The `counterId` query parameter is always required when calling this endpoint, used either
     *   as a single query parameter or in combination with any of the other query parameters.
     * - If you want to use the `date`, `dateStart`, or `dateEnd` query parameters, you must also
     *   use the `accountId` query parameter.
     */
    override fun list(
        params: CounterAdjustmentListParams,
        requestOptions: RequestOptions
    ): CounterAdjustmentListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "counteradjustments")
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
            .let { CounterAdjustmentListPage.of(this, params, it) }
    }

    private val deleteHandler: Handler<CounterAdjustment> =
        jsonHandler<CounterAdjustment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete a CounterAdjustment for the given UUID. */
    override fun delete(
        params: CounterAdjustmentDeleteParams,
        requestOptions: RequestOptions
    ): CounterAdjustment {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "counteradjustments",
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
