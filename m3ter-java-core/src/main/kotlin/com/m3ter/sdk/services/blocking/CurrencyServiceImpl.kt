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
import com.m3ter.sdk.models.Currency
import com.m3ter.sdk.models.CurrencyCreateParams
import com.m3ter.sdk.models.CurrencyDeleteParams
import com.m3ter.sdk.models.CurrencyListParams
import com.m3ter.sdk.models.CurrencyListResponse
import com.m3ter.sdk.models.CurrencyRetrieveParams
import com.m3ter.sdk.models.CurrencyUpdateParams

class CurrencyServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : CurrencyService {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Currency> =
        jsonHandler<Currency>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Creates a new Currency for the specified Organization.
     *
     * Used to create a Currency that your Organization will start to use.
     */
    override fun create(params: CurrencyCreateParams, requestOptions: RequestOptions): Currency {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("organizations", params.getPathParam(0), "picklists", "currency")
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

    private val retrieveHandler: Handler<Currency> =
        jsonHandler<Currency>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Retrieve the specified Currency with the given UUID. Used to obtain the details of a
     * specified existing Currency in your Organization.
     */
    override fun retrieve(
        params: CurrencyRetrieveParams,
        requestOptions: RequestOptions
    ): Currency {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "picklists",
                    "currency",
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

    private val updateHandler: Handler<Currency> =
        jsonHandler<Currency>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Update a Currency with the given UUID.
     *
     * Used to update the attributes of the specified Currency for the specified Organization.
     */
    override fun update(params: CurrencyUpdateParams, requestOptions: RequestOptions): Currency {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "picklists",
                    "currency",
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

    private val listHandler: Handler<CurrencyListResponse> =
        jsonHandler<CurrencyListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Retrieve a list of Currencies.
     *
     * Retrieves a list of Currencies for the specified Organization. This endpoint supports
     * pagination and includes various query parameters to filter the Currencies based on Currency
     * ID, and short codes.
     */
    override fun list(
        params: CurrencyListParams,
        requestOptions: RequestOptions
    ): CurrencyListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "picklists", "currency")
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

    private val deleteHandler: Handler<Currency> =
        jsonHandler<Currency>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Delete the Currency with the given UUID.
     *
     * Used to remove an existing Currency from your Organization that is no longer required.
     */
    override fun delete(params: CurrencyDeleteParams, requestOptions: RequestOptions): Currency {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "picklists",
                    "currency",
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
