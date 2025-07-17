// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.statements

import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.checkRequired
import com.m3ter.core.handlers.errorBodyHandler
import com.m3ter.core.handlers.errorHandler
import com.m3ter.core.handlers.jsonHandler
import com.m3ter.core.http.HttpMethod
import com.m3ter.core.http.HttpRequest
import com.m3ter.core.http.HttpResponse
import com.m3ter.core.http.HttpResponse.Handler
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.core.http.json
import com.m3ter.core.http.parseable
import com.m3ter.core.prepareAsync
import com.m3ter.models.StatementJobResponse
import com.m3ter.models.StatementStatementJobCancelParams
import com.m3ter.models.StatementStatementJobCreateBatchParams
import com.m3ter.models.StatementStatementJobCreateParams
import com.m3ter.models.StatementStatementJobListPageAsync
import com.m3ter.models.StatementStatementJobListPageResponse
import com.m3ter.models.StatementStatementJobListParams
import com.m3ter.models.StatementStatementJobRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class StatementJobServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    StatementJobServiceAsync {

    private val withRawResponse: StatementJobServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StatementJobServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatementJobServiceAsync =
        StatementJobServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: StatementStatementJobCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StatementJobResponse> =
        // post /organizations/{orgId}/statementjobs
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: StatementStatementJobRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StatementJobResponse> =
        // get /organizations/{orgId}/statementjobs/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: StatementStatementJobListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StatementStatementJobListPageAsync> =
        // get /organizations/{orgId}/statementjobs
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun cancel(
        params: StatementStatementJobCancelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StatementJobResponse> =
        // post /organizations/{orgId}/statementjobs/{id}/cancel
        withRawResponse().cancel(params, requestOptions).thenApply { it.parse() }

    override fun createBatch(
        params: StatementStatementJobCreateBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<StatementJobResponse>> =
        // post /organizations/{orgId}/statementjobs/batch
        withRawResponse().createBatch(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StatementJobServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StatementJobServiceAsync.WithRawResponse =
            StatementJobServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<StatementJobResponse> =
            jsonHandler<StatementJobResponse>(clientOptions.jsonMapper)

        override fun create(
            params: StatementStatementJobCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StatementJobResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<StatementJobResponse> =
            jsonHandler<StatementJobResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: StatementStatementJobRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StatementJobResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<StatementStatementJobListPageResponse> =
            jsonHandler<StatementStatementJobListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: StatementStatementJobListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StatementStatementJobListPageAsync>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                StatementStatementJobListPageAsync.builder()
                                    .service(StatementJobServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val cancelHandler: Handler<StatementJobResponse> =
            jsonHandler<StatementJobResponse>(clientOptions.jsonMapper)

        override fun cancel(
            params: StatementStatementJobCancelParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StatementJobResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { cancelHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createBatchHandler: Handler<List<StatementJobResponse>> =
            jsonHandler<List<StatementJobResponse>>(clientOptions.jsonMapper)

        override fun createBatch(
            params: StatementStatementJobCreateBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<StatementJobResponse>>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
