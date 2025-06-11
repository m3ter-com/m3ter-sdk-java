// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.statements

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
import com.m3ter.models.StatementJobResponse
import com.m3ter.models.StatementStatementJobCancelParams
import com.m3ter.models.StatementStatementJobCreateBatchParams
import com.m3ter.models.StatementStatementJobCreateParams
import com.m3ter.models.StatementStatementJobListPage
import com.m3ter.models.StatementStatementJobListPageResponse
import com.m3ter.models.StatementStatementJobListParams
import com.m3ter.models.StatementStatementJobRetrieveParams
import kotlin.jvm.optionals.getOrNull

class StatementJobServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StatementJobService {

    private val withRawResponse: StatementJobService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StatementJobService.WithRawResponse = withRawResponse

    override fun create(
        params: StatementStatementJobCreateParams,
        requestOptions: RequestOptions,
    ): StatementJobResponse =
        // post /organizations/{orgId}/statementjobs
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: StatementStatementJobRetrieveParams,
        requestOptions: RequestOptions,
    ): StatementJobResponse =
        // get /organizations/{orgId}/statementjobs/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: StatementStatementJobListParams,
        requestOptions: RequestOptions,
    ): StatementStatementJobListPage =
        // get /organizations/{orgId}/statementjobs
        withRawResponse().list(params, requestOptions).parse()

    override fun cancel(
        params: StatementStatementJobCancelParams,
        requestOptions: RequestOptions,
    ): StatementJobResponse =
        // post /organizations/{orgId}/statementjobs/{id}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    override fun createBatch(
        params: StatementStatementJobCreateBatchParams,
        requestOptions: RequestOptions,
    ): List<StatementJobResponse> =
        // post /organizations/{orgId}/statementjobs/batch
        withRawResponse().createBatch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StatementJobService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<StatementJobResponse> =
            jsonHandler<StatementJobResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: StatementStatementJobCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StatementJobResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "statementjobs",
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

        private val retrieveHandler: Handler<StatementJobResponse> =
            jsonHandler<StatementJobResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: StatementStatementJobRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StatementJobResponse> {
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
                        "statementjobs",
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

        private val listHandler: Handler<StatementStatementJobListPageResponse> =
            jsonHandler<StatementStatementJobListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: StatementStatementJobListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StatementStatementJobListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "statementjobs",
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
                        StatementStatementJobListPage.builder()
                            .service(StatementJobServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val cancelHandler: Handler<StatementJobResponse> =
            jsonHandler<StatementJobResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun cancel(
            params: StatementStatementJobCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StatementJobResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "statementjobs",
                        params._pathParam(1),
                        "cancel",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { cancelHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createBatchHandler: Handler<List<StatementJobResponse>> =
            jsonHandler<List<StatementJobResponse>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun createBatch(
            params: StatementStatementJobCreateBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<StatementJobResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "statementjobs",
                        "batch",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createBatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
