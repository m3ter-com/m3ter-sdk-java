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
import com.m3ter.sdk.models.Pricing
import com.m3ter.sdk.models.PricingCreateParams
import com.m3ter.sdk.models.PricingDeleteParams
import com.m3ter.sdk.models.PricingListPage
import com.m3ter.sdk.models.PricingListParams
import com.m3ter.sdk.models.PricingRetrieveParams
import com.m3ter.sdk.models.PricingUpdateParams

class PricingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PricingService {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Pricing> =
        jsonHandler<Pricing>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new Pricing.
     *
     * **Note:** Either `planId` or `planTemplateId` request parameters are required for this call
     * to be valid. If you omit both, then you will receive a validation error.
     */
    override fun create(params: PricingCreateParams, requestOptions: RequestOptions): Pricing {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("organizations", params.getPathParam(0), "pricings")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<Pricing> =
        jsonHandler<Pricing>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve the Pricing with the given UUID. */
    override fun retrieve(params: PricingRetrieveParams, requestOptions: RequestOptions): Pricing {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "pricings",
                    params.getPathParam(1),
                )
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val updateHandler: Handler<Pricing> =
        jsonHandler<Pricing>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Update Pricing for the given UUID.
     *
     * **Note:** Either `planId` or `planTemplateId` request parameters are required for this call
     * to be valid. If you omit both, then you will receive a validation error.
     */
    override fun update(params: PricingUpdateParams, requestOptions: RequestOptions): Pricing {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "pricings",
                    params.getPathParam(1),
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<PricingListPage.Response> =
        jsonHandler<PricingListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve a list of Pricings filtered by date, Plan ID, PlanTemplate ID, or Pricing ID. */
    override fun list(params: PricingListParams, requestOptions: RequestOptions): PricingListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "pricings")
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
            .let { PricingListPage.of(this, params, it) }
    }

    private val deleteHandler: Handler<Pricing> =
        jsonHandler<Pricing>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete the Pricing with the given UUID. */
    override fun delete(params: PricingDeleteParams, requestOptions: RequestOptions): Pricing {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "pricings",
                    params.getPathParam(1),
                )
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { deleteHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }
}
