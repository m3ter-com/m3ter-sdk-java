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
import com.m3ter.sdk.core.http.json
import com.m3ter.sdk.core.http.parseable
import com.m3ter.sdk.core.prepare
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.ScheduledEventConfigurationCreateParams
import com.m3ter.sdk.models.ScheduledEventConfigurationDeleteParams
import com.m3ter.sdk.models.ScheduledEventConfigurationListPage
import com.m3ter.sdk.models.ScheduledEventConfigurationListParams
import com.m3ter.sdk.models.ScheduledEventConfigurationResponse
import com.m3ter.sdk.models.ScheduledEventConfigurationRetrieveParams
import com.m3ter.sdk.models.ScheduledEventConfigurationUpdateParams

class ScheduledEventConfigurationServiceImpl
internal constructor(private val clientOptions: ClientOptions) :
    ScheduledEventConfigurationService {

    private val withRawResponse: ScheduledEventConfigurationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ScheduledEventConfigurationService.WithRawResponse =
        withRawResponse

    override fun create(
        params: ScheduledEventConfigurationCreateParams,
        requestOptions: RequestOptions,
    ): ScheduledEventConfigurationResponse =
        // post /organizations/{orgId}/scheduledevents/configurations
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ScheduledEventConfigurationRetrieveParams,
        requestOptions: RequestOptions,
    ): ScheduledEventConfigurationResponse =
        // get /organizations/{orgId}/scheduledevents/configurations/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ScheduledEventConfigurationUpdateParams,
        requestOptions: RequestOptions,
    ): ScheduledEventConfigurationResponse =
        // put /organizations/{orgId}/scheduledevents/configurations/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ScheduledEventConfigurationListParams,
        requestOptions: RequestOptions,
    ): ScheduledEventConfigurationListPage =
        // get /organizations/{orgId}/scheduledevents/configurations
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: ScheduledEventConfigurationDeleteParams,
        requestOptions: RequestOptions,
    ): ScheduledEventConfigurationResponse =
        // delete /organizations/{orgId}/scheduledevents/configurations/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ScheduledEventConfigurationService.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<ScheduledEventConfigurationResponse> =
            jsonHandler<ScheduledEventConfigurationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: ScheduledEventConfigurationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScheduledEventConfigurationResponse> {
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
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<ScheduledEventConfigurationResponse> =
            jsonHandler<ScheduledEventConfigurationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: ScheduledEventConfigurationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScheduledEventConfigurationResponse> {
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

        private val updateHandler: Handler<ScheduledEventConfigurationResponse> =
            jsonHandler<ScheduledEventConfigurationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: ScheduledEventConfigurationUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScheduledEventConfigurationResponse> {
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
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<ScheduledEventConfigurationListPage.Response> =
            jsonHandler<ScheduledEventConfigurationListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ScheduledEventConfigurationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScheduledEventConfigurationListPage> {
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
                    .let {
                        ScheduledEventConfigurationListPage.of(
                            ScheduledEventConfigurationServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }

        private val deleteHandler: Handler<ScheduledEventConfigurationResponse> =
            jsonHandler<ScheduledEventConfigurationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: ScheduledEventConfigurationDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScheduledEventConfigurationResponse> {
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
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
}
