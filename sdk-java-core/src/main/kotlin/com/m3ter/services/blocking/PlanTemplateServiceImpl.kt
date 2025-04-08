// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.core.ClientOptions
import com.m3ter.core.JsonValue
import com.m3ter.core.RequestOptions
import com.m3ter.core.handlers.errorHandler
import com.m3ter.core.handlers.jsonHandler
import com.m3ter.core.handlers.withErrorHandler
import com.m3ter.core.http.HttpMethod
import com.m3ter.core.http.HttpRequest
import com.m3ter.core.http.HttpResponse.Handler
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.core.http.json
import com.m3ter.core.http.parseable
import com.m3ter.core.prepare
import com.m3ter.models.PlanTemplateCreateParams
import com.m3ter.models.PlanTemplateDeleteParams
import com.m3ter.models.PlanTemplateListPage
import com.m3ter.models.PlanTemplateListParams
import com.m3ter.models.PlanTemplateResponse
import com.m3ter.models.PlanTemplateRetrieveParams
import com.m3ter.models.PlanTemplateUpdateParams

class PlanTemplateServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PlanTemplateService {

    private val withRawResponse: PlanTemplateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PlanTemplateService.WithRawResponse = withRawResponse

    override fun create(
        params: PlanTemplateCreateParams,
        requestOptions: RequestOptions,
    ): PlanTemplateResponse =
        // post /organizations/{orgId}/plantemplates
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: PlanTemplateRetrieveParams,
        requestOptions: RequestOptions,
    ): PlanTemplateResponse =
        // get /organizations/{orgId}/plantemplates/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: PlanTemplateUpdateParams,
        requestOptions: RequestOptions,
    ): PlanTemplateResponse =
        // put /organizations/{orgId}/plantemplates/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: PlanTemplateListParams,
        requestOptions: RequestOptions,
    ): PlanTemplateListPage =
        // get /organizations/{orgId}/plantemplates
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: PlanTemplateDeleteParams,
        requestOptions: RequestOptions,
    ): PlanTemplateResponse =
        // delete /organizations/{orgId}/plantemplates/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlanTemplateService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<PlanTemplateResponse> =
            jsonHandler<PlanTemplateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: PlanTemplateCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanTemplateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "plantemplates",
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

        private val retrieveHandler: Handler<PlanTemplateResponse> =
            jsonHandler<PlanTemplateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: PlanTemplateRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanTemplateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "plantemplates",
                        params._pathParam(1),
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

        private val updateHandler: Handler<PlanTemplateResponse> =
            jsonHandler<PlanTemplateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: PlanTemplateUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanTemplateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "plantemplates",
                        params._pathParam(1),
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

        private val listHandler: Handler<PlanTemplateListPage.Response> =
            jsonHandler<PlanTemplateListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: PlanTemplateListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanTemplateListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "plantemplates",
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
                        PlanTemplateListPage.of(PlanTemplateServiceImpl(clientOptions), params, it)
                    }
            }
        }

        private val deleteHandler: Handler<PlanTemplateResponse> =
            jsonHandler<PlanTemplateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: PlanTemplateDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanTemplateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "plantemplates",
                        params._pathParam(1),
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
