// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.core.ClientOptions
import com.m3ter.core.JsonValue
import com.m3ter.core.RequestOptions
import com.m3ter.core.checkRequired
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
import com.m3ter.models.PlanGroupLinkCreateParams
import com.m3ter.models.PlanGroupLinkDeleteParams
import com.m3ter.models.PlanGroupLinkListPage
import com.m3ter.models.PlanGroupLinkListPageResponse
import com.m3ter.models.PlanGroupLinkListParams
import com.m3ter.models.PlanGroupLinkResponse
import com.m3ter.models.PlanGroupLinkRetrieveParams
import com.m3ter.models.PlanGroupLinkUpdateParams
import kotlin.jvm.optionals.getOrNull

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

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

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
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "plangrouplinks",
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

        private val retrieveHandler: Handler<PlanGroupLinkResponse> =
            jsonHandler<PlanGroupLinkResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: PlanGroupLinkRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanGroupLinkResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "plangrouplinks",
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

        private val updateHandler: Handler<PlanGroupLinkResponse> =
            jsonHandler<PlanGroupLinkResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: PlanGroupLinkUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanGroupLinkResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "plangrouplinks",
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

        private val listHandler: Handler<PlanGroupLinkListPageResponse> =
            jsonHandler<PlanGroupLinkListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: PlanGroupLinkListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanGroupLinkListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "plangrouplinks",
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
                        PlanGroupLinkListPage.builder()
                            .service(PlanGroupLinkServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
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
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "plangrouplinks",
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
