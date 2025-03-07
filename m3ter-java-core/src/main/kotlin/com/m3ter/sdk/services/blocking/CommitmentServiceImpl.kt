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
import com.m3ter.sdk.models.CommitmentCreateParams
import com.m3ter.sdk.models.CommitmentDeleteParams
import com.m3ter.sdk.models.CommitmentListPage
import com.m3ter.sdk.models.CommitmentListParams
import com.m3ter.sdk.models.CommitmentResponse
import com.m3ter.sdk.models.CommitmentRetrieveParams
import com.m3ter.sdk.models.CommitmentSearchParams
import com.m3ter.sdk.models.CommitmentSearchResponse
import com.m3ter.sdk.models.CommitmentUpdateParams

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

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CommitmentResponse> =
            jsonHandler<CommitmentResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: CommitmentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommitmentResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params.getPathParam(0), "commitments")
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
                        params.getPathParam(0),
                        "commitments",
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
                        params.getPathParam(0),
                        "commitments",
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
                    .addPathSegments("organizations", params.getPathParam(0), "commitments")
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
                        params.getPathParam(0),
                        "commitments",
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
                        params.getPathParam(0),
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
