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
import com.m3ter.models.CommitmentCreateParams
import com.m3ter.models.CommitmentDeleteParams
import com.m3ter.models.CommitmentListPage
import com.m3ter.models.CommitmentListParams
import com.m3ter.models.CommitmentResponse
import com.m3ter.models.CommitmentRetrieveParams
import com.m3ter.models.CommitmentSearchParams
import com.m3ter.models.CommitmentSearchResponse
import com.m3ter.models.CommitmentUpdateParams

class CommitmentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CommitmentService {

    private val withRawResponse: CommitmentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CommitmentService.WithRawResponse = withRawResponse

    override fun create(
        params: CommitmentCreateParams,
        requestOptions: RequestOptions,
    ): CommitmentResponse =
        // post /organizations/{orgId}/commitments
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: CommitmentRetrieveParams,
        requestOptions: RequestOptions,
    ): CommitmentResponse =
        // get /organizations/{orgId}/commitments/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: CommitmentUpdateParams,
        requestOptions: RequestOptions,
    ): CommitmentResponse =
        // put /organizations/{orgId}/commitments/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: CommitmentListParams,
        requestOptions: RequestOptions,
    ): CommitmentListPage =
        // get /organizations/{orgId}/commitments
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: CommitmentDeleteParams,
        requestOptions: RequestOptions,
    ): CommitmentResponse =
        // delete /organizations/{orgId}/commitments/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun search(
        params: CommitmentSearchParams,
        requestOptions: RequestOptions,
    ): CommitmentSearchResponse =
        // get /organizations/{orgId}/commitments/search
        withRawResponse().search(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CommitmentService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CommitmentResponse> =
            jsonHandler<CommitmentResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: CommitmentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommitmentResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "commitments",
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

        private val retrieveHandler: Handler<CommitmentResponse> =
            jsonHandler<CommitmentResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: CommitmentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommitmentResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "commitments",
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

        private val updateHandler: Handler<CommitmentResponse> =
            jsonHandler<CommitmentResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: CommitmentUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommitmentResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "commitments",
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

        private val listHandler: Handler<CommitmentListPage.Response> =
            jsonHandler<CommitmentListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CommitmentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommitmentListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "commitments",
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
                    .let { CommitmentListPage.of(CommitmentServiceImpl(clientOptions), params, it) }
            }
        }

        private val deleteHandler: Handler<CommitmentResponse> =
            jsonHandler<CommitmentResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: CommitmentDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommitmentResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "commitments",
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

        private val searchHandler: Handler<CommitmentSearchResponse> =
            jsonHandler<CommitmentSearchResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun search(
            params: CommitmentSearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommitmentSearchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "commitments",
                        "search",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { searchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
