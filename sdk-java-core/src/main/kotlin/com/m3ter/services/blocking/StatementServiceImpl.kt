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
import com.m3ter.models.ObjectUrlResponse
import com.m3ter.models.StatementCreateCsvParams
import com.m3ter.models.StatementGetCsvParams
import com.m3ter.models.StatementGetJsonParams
import com.m3ter.services.blocking.statements.StatementDefinitionService
import com.m3ter.services.blocking.statements.StatementDefinitionServiceImpl
import com.m3ter.services.blocking.statements.StatementJobService
import com.m3ter.services.blocking.statements.StatementJobServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class StatementServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StatementService {

    private val withRawResponse: StatementService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val statementJobs: StatementJobService by lazy {
        StatementJobServiceImpl(clientOptions)
    }

    private val statementDefinitions: StatementDefinitionService by lazy {
        StatementDefinitionServiceImpl(clientOptions)
    }

    override fun withRawResponse(): StatementService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatementService =
        StatementServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun statementJobs(): StatementJobService = statementJobs

    override fun statementDefinitions(): StatementDefinitionService = statementDefinitions

    override fun createCsv(
        params: StatementCreateCsvParams,
        requestOptions: RequestOptions,
    ): ObjectUrlResponse =
        // post /organizations/{orgId}/bills/{id}/statement/csv
        withRawResponse().createCsv(params, requestOptions).parse()

    override fun getCsv(
        params: StatementGetCsvParams,
        requestOptions: RequestOptions,
    ): ObjectUrlResponse =
        // get /organizations/{orgId}/bills/{id}/statement/csv
        withRawResponse().getCsv(params, requestOptions).parse()

    override fun getJson(
        params: StatementGetJsonParams,
        requestOptions: RequestOptions,
    ): ObjectUrlResponse =
        // get /organizations/{orgId}/bills/{id}/statement/json
        withRawResponse().getJson(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StatementService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val statementJobs: StatementJobService.WithRawResponse by lazy {
            StatementJobServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val statementDefinitions: StatementDefinitionService.WithRawResponse by lazy {
            StatementDefinitionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StatementService.WithRawResponse =
            StatementServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun statementJobs(): StatementJobService.WithRawResponse = statementJobs

        override fun statementDefinitions(): StatementDefinitionService.WithRawResponse =
            statementDefinitions

        private val createCsvHandler: Handler<ObjectUrlResponse> =
            jsonHandler<ObjectUrlResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun createCsv(
            params: StatementCreateCsvParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectUrlResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createCsvHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getCsvHandler: Handler<ObjectUrlResponse> =
            jsonHandler<ObjectUrlResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun getCsv(
            params: StatementGetCsvParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectUrlResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { getCsvHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getJsonHandler: Handler<ObjectUrlResponse> =
            jsonHandler<ObjectUrlResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun getJson(
            params: StatementGetJsonParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectUrlResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
