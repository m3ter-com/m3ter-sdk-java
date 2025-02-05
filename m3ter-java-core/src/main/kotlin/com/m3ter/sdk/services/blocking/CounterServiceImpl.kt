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
import com.m3ter.sdk.models.Counter
import com.m3ter.sdk.models.CounterCreateParams
import com.m3ter.sdk.models.CounterListPage
import com.m3ter.sdk.models.CounterListParams
import com.m3ter.sdk.models.CounterRetrieveParams
import com.m3ter.sdk.models.CounterUpdateParams

class CounterServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : CounterService {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Counter> =
        jsonHandler<Counter>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new Counter. */
    override fun create(params: CounterCreateParams, requestOptions: RequestOptions): Counter {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("organizations", params.getPathParam(0), "counters")
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

    private val retrieveHandler: Handler<Counter> =
        jsonHandler<Counter>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Counter for the given UUID. */
    override fun retrieve(params: CounterRetrieveParams, requestOptions: RequestOptions): Counter {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "counters",
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

    private val updateHandler: Handler<Counter> =
        jsonHandler<Counter>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update Counter for the given UUID. */
    override fun update(params: CounterUpdateParams, requestOptions: RequestOptions): Counter {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "counters",
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

    private val listHandler: Handler<CounterListPage.Response> =
        jsonHandler<CounterListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Retrieve a list of Counter entities that can be filtered by Product, Counter ID, or Codes.
     */
    override fun list(params: CounterListParams, requestOptions: RequestOptions): CounterListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "counters")
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
            .let { CounterListPage.of(this, params, it) }
    }
}
