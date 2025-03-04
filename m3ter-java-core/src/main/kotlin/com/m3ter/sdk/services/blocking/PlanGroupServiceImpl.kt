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
import com.m3ter.sdk.core.json
import com.m3ter.sdk.core.prepare
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.PlanGroup
import com.m3ter.sdk.models.PlanGroupCreateParams
import com.m3ter.sdk.models.PlanGroupDeleteParams
import com.m3ter.sdk.models.PlanGroupListPage
import com.m3ter.sdk.models.PlanGroupListParams
import com.m3ter.sdk.models.PlanGroupRetrieveParams
import com.m3ter.sdk.models.PlanGroupUpdateParams

class PlanGroupServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PlanGroupService {

    private val withRawResponse: PlanGroupService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PlanGroupService.WithRawResponse = withRawResponse

    override fun create(params: PlanGroupCreateParams, requestOptions: RequestOptions): PlanGroup =
        // post /organizations/{orgId}/plangroups
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: PlanGroupRetrieveParams,
        requestOptions: RequestOptions,
    ): PlanGroup =
        // get /organizations/{orgId}/plangroups/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: PlanGroupUpdateParams, requestOptions: RequestOptions): PlanGroup =
        // put /organizations/{orgId}/plangroups/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: PlanGroupListParams,
        requestOptions: RequestOptions,
    ): PlanGroupListPage =
        // get /organizations/{orgId}/plangroups
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: PlanGroupDeleteParams, requestOptions: RequestOptions): PlanGroup =
        // delete /organizations/{orgId}/plangroups/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlanGroupService.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<PlanGroup> =
            jsonHandler<PlanGroup>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: PlanGroupCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanGroup> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params.getPathParam(0), "plangroups")
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

        private val retrieveHandler: Handler<PlanGroup> =
            jsonHandler<PlanGroup>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: PlanGroupRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanGroup> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "plangroups",
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

        private val updateHandler: Handler<PlanGroup> =
            jsonHandler<PlanGroup>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: PlanGroupUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanGroup> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "plangroups",
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

        private val listHandler: Handler<PlanGroupListPage.Response> =
            jsonHandler<PlanGroupListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: PlanGroupListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanGroupListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params.getPathParam(0), "plangroups")
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
                    .let { PlanGroupListPage.of(PlanGroupServiceImpl(clientOptions), params, it) }
            }
        }

        private val deleteHandler: Handler<PlanGroup> =
            jsonHandler<PlanGroup>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: PlanGroupDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanGroup> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "plangroups",
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
