// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

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
import com.m3ter.core.prepareAsync
import com.m3ter.models.ObjectUrlResponse
import com.m3ter.models.StatementCreateCsvParams
import com.m3ter.models.StatementGetCsvParams
import com.m3ter.models.StatementGetJsonParams
import com.m3ter.services.async.statements.StatementDefinitionServiceAsync
import com.m3ter.services.async.statements.StatementDefinitionServiceAsyncImpl
import com.m3ter.services.async.statements.StatementJobServiceAsync
import com.m3ter.services.async.statements.StatementJobServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import kotlin.jvm.optionals.getOrNull

class StatementServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    StatementServiceAsync {

    private val withRawResponse: StatementServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val statementJobs: StatementJobServiceAsync by lazy {
        StatementJobServiceAsyncImpl(clientOptions)
    }

    private val statementDefinitions: StatementDefinitionServiceAsync by lazy {
        StatementDefinitionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): StatementServiceAsync.WithRawResponse = withRawResponse

    override fun statementJobs(): StatementJobServiceAsync = statementJobs

    override fun statementDefinitions(): StatementDefinitionServiceAsync = statementDefinitions

    override fun createCsv(
        params: StatementCreateCsvParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ObjectUrlResponse> =
        // post /organizations/{orgId}/bills/{id}/statement/csv
        withRawResponse().createCsv(params, requestOptions).thenApply { it.parse() }

    override fun getCsv(
        params: StatementGetCsvParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ObjectUrlResponse> =
        // get /organizations/{orgId}/bills/{id}/statement/csv
        withRawResponse().getCsv(params, requestOptions).thenApply { it.parse() }

    override fun getJson(
        params: StatementGetJsonParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ObjectUrlResponse> =
        // get /organizations/{orgId}/bills/{id}/statement/json
        withRawResponse().getJson(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StatementServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val statementJobs: StatementJobServiceAsync.WithRawResponse by lazy {
            StatementJobServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val statementDefinitions: StatementDefinitionServiceAsync.WithRawResponse by lazy {
            StatementDefinitionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun statementJobs(): StatementJobServiceAsync.WithRawResponse = statementJobs

        override fun statementDefinitions(): StatementDefinitionServiceAsync.WithRawResponse =
            statementDefinitions

        private val createCsvHandler: Handler<ObjectUrlResponse> =
            jsonHandler<ObjectUrlResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun createCsv(
            params: StatementCreateCsvParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectUrlResponse>> {
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
                        "bills",
                        params._pathParam(1),
                        "statement",
                        "csv",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createCsvHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getCsvHandler: Handler<ObjectUrlResponse> =
            jsonHandler<ObjectUrlResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun getCsv(
            params: StatementGetCsvParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectUrlResponse>> {
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
                        "bills",
                        params._pathParam(1),
                        "statement",
                        "csv",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { getCsvHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getJsonHandler: Handler<ObjectUrlResponse> =
            jsonHandler<ObjectUrlResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun getJson(
            params: StatementGetJsonParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectUrlResponse>> {
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
                        "bills",
                        params._pathParam(1),
                        "statement",
                        "json",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { getJsonHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
