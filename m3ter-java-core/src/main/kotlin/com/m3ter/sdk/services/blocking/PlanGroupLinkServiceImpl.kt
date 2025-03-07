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
import com.m3ter.sdk.models.PlanGroupLinkCreateParams
import com.m3ter.sdk.models.PlanGroupLinkDeleteParams
import com.m3ter.sdk.models.PlanGroupLinkListPage
import com.m3ter.sdk.models.PlanGroupLinkListParams
import com.m3ter.sdk.models.PlanGroupLinkResponse
import com.m3ter.sdk.models.PlanGroupLinkRetrieveParams
import com.m3ter.sdk.models.PlanGroupLinkUpdateParams

class PlanGroupLinkServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PlanGroupLinkService {

    private val withRawResponse: PlanGroupLinkService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PlanGroupLinkService.WithRawResponse = withRawResponse

    override fun create(
        params: PlanGroupLinkCreateParams,
        requestOptions: RequestOptions,
    ): PlanGroupLinkResponse =
        // post /organizations/{orgId}/plangrouplinks
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: PlanGroupLinkRetrieveParams,
        requestOptions: RequestOptions,
    ): PlanGroupLinkResponse =
        // get /organizations/{orgId}/plangrouplinks/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: PlanGroupLinkUpdateParams,
        requestOptions: RequestOptions,
    ): PlanGroupLinkResponse =
        // put /organizations/{orgId}/plangrouplinks/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: PlanGroupLinkListParams,
        requestOptions: RequestOptions,
    ): PlanGroupLinkListPage =
        // get /organizations/{orgId}/plangrouplinks
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: PlanGroupLinkDeleteParams,
        requestOptions: RequestOptions,
    ): PlanGroupLinkResponse =
        // delete /organizations/{orgId}/plangrouplinks/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlanGroupLinkService.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<PlanGroupLinkResponse> =
            jsonHandler<PlanGroupLinkResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: PlanGroupLinkCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanGroupLinkResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params.getPathParam(0), "plangrouplinks")
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

        private val retrieveHandler: Handler<PlanGroupLinkResponse> =
            jsonHandler<PlanGroupLinkResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: PlanGroupLinkRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanGroupLinkResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "plangrouplinks",
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

        private val updateHandler: Handler<PlanGroupLinkResponse> =
            jsonHandler<PlanGroupLinkResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: PlanGroupLinkUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanGroupLinkResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "plangrouplinks",
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

        private val listHandler: Handler<PlanGroupLinkListPage.Response> =
            jsonHandler<PlanGroupLinkListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: PlanGroupLinkListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanGroupLinkListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params.getPathParam(0), "plangrouplinks")
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
                        PlanGroupLinkListPage.of(
                            PlanGroupLinkServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }

        private val deleteHandler: Handler<PlanGroupLinkResponse> =
            jsonHandler<PlanGroupLinkResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: PlanGroupLinkDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanGroupLinkResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "plangrouplinks",
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
