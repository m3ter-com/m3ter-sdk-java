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
import com.m3ter.models.StatementDefinitionResponse
import com.m3ter.models.StatementStatementDefinitionCreateParams
import com.m3ter.models.StatementStatementDefinitionDeleteParams
import com.m3ter.models.StatementStatementDefinitionListPage
import com.m3ter.models.StatementStatementDefinitionListPageResponse
import com.m3ter.models.StatementStatementDefinitionListParams
import com.m3ter.models.StatementStatementDefinitionRetrieveParams
import com.m3ter.models.StatementStatementDefinitionUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class StatementDefinitionServiceImpl
internal constructor(private val clientOptions: ClientOptions) : StatementDefinitionService {

    private val withRawResponse: StatementDefinitionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StatementDefinitionService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): StatementDefinitionService =
        StatementDefinitionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: StatementStatementDefinitionCreateParams,
        requestOptions: RequestOptions,
    ): StatementDefinitionResponse =
        // post /organizations/{orgId}/statementdefinitions
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: StatementStatementDefinitionRetrieveParams,
        requestOptions: RequestOptions,
    ): StatementDefinitionResponse =
        // get /organizations/{orgId}/statementdefinitions/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: StatementStatementDefinitionUpdateParams,
        requestOptions: RequestOptions,
    ): StatementDefinitionResponse =
        // put /organizations/{orgId}/statementdefinitions/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: StatementStatementDefinitionListParams,
        requestOptions: RequestOptions,
    ): StatementStatementDefinitionListPage =
        // get /organizations/{orgId}/statementdefinitions
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: StatementStatementDefinitionDeleteParams,
        requestOptions: RequestOptions,
    ): StatementDefinitionResponse =
        // delete /organizations/{orgId}/statementdefinitions/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StatementDefinitionService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StatementDefinitionService.WithRawResponse =
            StatementDefinitionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<StatementDefinitionResponse> =
            jsonHandler<StatementDefinitionResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: StatementStatementDefinitionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StatementDefinitionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "statementdefinitions",
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

        private val retrieveHandler: Handler<StatementDefinitionResponse> =
            jsonHandler<StatementDefinitionResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: StatementStatementDefinitionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StatementDefinitionResponse> {
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
                        "statementdefinitions",
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

        private val updateHandler: Handler<StatementDefinitionResponse> =
            jsonHandler<StatementDefinitionResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: StatementStatementDefinitionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StatementDefinitionResponse> {
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
                        "statementdefinitions",
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

        private val listHandler: Handler<StatementStatementDefinitionListPageResponse> =
            jsonHandler<StatementStatementDefinitionListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: StatementStatementDefinitionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StatementStatementDefinitionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "statementdefinitions",
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
                        StatementStatementDefinitionListPage.builder()
                            .service(StatementDefinitionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<StatementDefinitionResponse> =
            jsonHandler<StatementDefinitionResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: StatementStatementDefinitionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StatementDefinitionResponse> {
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
                        "statementdefinitions",
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
