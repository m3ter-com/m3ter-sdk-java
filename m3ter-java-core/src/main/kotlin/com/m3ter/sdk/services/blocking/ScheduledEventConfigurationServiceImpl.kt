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
import com.m3ter.sdk.models.ScheduledEventConfiguration
import com.m3ter.sdk.models.ScheduledEventConfigurationCreateParams
import com.m3ter.sdk.models.ScheduledEventConfigurationDeleteParams
import com.m3ter.sdk.models.ScheduledEventConfigurationListPage
import com.m3ter.sdk.models.ScheduledEventConfigurationListParams
import com.m3ter.sdk.models.ScheduledEventConfigurationRetrieveParams
import com.m3ter.sdk.models.ScheduledEventConfigurationUpdateParams

class ScheduledEventConfigurationServiceImpl
internal constructor(private val clientOptions: ClientOptions) :
    ScheduledEventConfigurationService {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ScheduledEventConfiguration> =
        jsonHandler<ScheduledEventConfiguration>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create a new ScheduledEventConfiguration. */
    override fun create(
        params: ScheduledEventConfigurationCreateParams,
        requestOptions: RequestOptions,
    ): ScheduledEventConfiguration {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "scheduledevents",
                    "configurations",
                )
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

    private val retrieveHandler: Handler<ScheduledEventConfiguration> =
        jsonHandler<ScheduledEventConfiguration>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve a ScheduledEventConfiguration for the given UUID. */
    override fun retrieve(
        params: ScheduledEventConfigurationRetrieveParams,
        requestOptions: RequestOptions,
    ): ScheduledEventConfiguration {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "scheduledevents",
                    "configurations",
                    params.getPathParam(1),
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

    private val updateHandler: Handler<ScheduledEventConfiguration> =
        jsonHandler<ScheduledEventConfiguration>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Update a ScheduledEventConfiguration for the given UUID. */
    override fun update(
        params: ScheduledEventConfigurationUpdateParams,
        requestOptions: RequestOptions,
    ): ScheduledEventConfiguration {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "scheduledevents",
                    "configurations",
                    params.getPathParam(1),
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

    private val listHandler: Handler<ScheduledEventConfigurationListPage.Response> =
        jsonHandler<ScheduledEventConfigurationListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve a list of ScheduledEventConfiguration entities */
    override fun list(
        params: ScheduledEventConfigurationListParams,
        requestOptions: RequestOptions,
    ): ScheduledEventConfigurationListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "scheduledevents",
                    "configurations",
                )
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
            .let { ScheduledEventConfigurationListPage.of(this, params, it) }
    }

    private val deleteHandler: Handler<ScheduledEventConfiguration> =
        jsonHandler<ScheduledEventConfiguration>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Delete the ScheduledEventConfiguration for the given UUID. */
    override fun delete(
        params: ScheduledEventConfigurationDeleteParams,
        requestOptions: RequestOptions,
    ): ScheduledEventConfiguration {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "scheduledevents",
                    "configurations",
                    params.getPathParam(1),
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
