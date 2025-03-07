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
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.core.http.parseable
import com.m3ter.sdk.core.prepare
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.EventGetFieldsParams
import com.m3ter.sdk.models.EventGetFieldsResponse
import com.m3ter.sdk.models.EventGetTypesParams
import com.m3ter.sdk.models.EventGetTypesResponse
import com.m3ter.sdk.models.EventListPage
import com.m3ter.sdk.models.EventListParams
import com.m3ter.sdk.models.EventResponse
import com.m3ter.sdk.models.EventRetrieveParams

class EventServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EventService {

    private val withRawResponse: EventService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EventService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: EventRetrieveParams,
        requestOptions: RequestOptions,
    ): EventResponse =
        // get /organizations/{orgId}/events/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: EventListParams, requestOptions: RequestOptions): EventListPage =
        // get /organizations/{orgId}/events
        withRawResponse().list(params, requestOptions).parse()

    override fun getFields(
        params: EventGetFieldsParams,
        requestOptions: RequestOptions,
    ): EventGetFieldsResponse =
        // get /organizations/{orgId}/events/fields
        withRawResponse().getFields(params, requestOptions).parse()

    override fun getTypes(
        params: EventGetTypesParams,
        requestOptions: RequestOptions,
    ): EventGetTypesResponse =
        // get /organizations/{orgId}/events/types
        withRawResponse().getTypes(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EventService.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<EventResponse> =
            jsonHandler<EventResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: EventRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "events",
                        params.getPathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<EventListPage.Response> =
            jsonHandler<EventListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: EventListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params.getPathParam(0), "events")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let { EventListPage.of(EventServiceImpl(clientOptions), params, it) }
            }
        }

        private val getFieldsHandler: Handler<EventGetFieldsResponse> =
            jsonHandler<EventGetFieldsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun getFields(
            params: EventGetFieldsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventGetFieldsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params.getPathParam(0), "events", "fields")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { getFieldsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getTypesHandler: Handler<EventGetTypesResponse> =
            jsonHandler<EventGetTypesResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun getTypes(
            params: EventGetTypesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventGetTypesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params.getPathParam(0), "events", "types")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { getTypesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
