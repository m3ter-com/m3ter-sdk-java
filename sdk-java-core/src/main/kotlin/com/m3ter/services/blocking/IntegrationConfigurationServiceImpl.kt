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
import com.m3ter.models.IntegrationConfigurationCreateParams
import com.m3ter.models.IntegrationConfigurationCreateResponse
import com.m3ter.models.IntegrationConfigurationDeleteParams
import com.m3ter.models.IntegrationConfigurationDeleteResponse
import com.m3ter.models.IntegrationConfigurationEnableParams
import com.m3ter.models.IntegrationConfigurationEnableResponse
import com.m3ter.models.IntegrationConfigurationGetByEntityParams
import com.m3ter.models.IntegrationConfigurationListPage
import com.m3ter.models.IntegrationConfigurationListPageResponse
import com.m3ter.models.IntegrationConfigurationListParams
import com.m3ter.models.IntegrationConfigurationResponse
import com.m3ter.models.IntegrationConfigurationRetrieveParams
import com.m3ter.models.IntegrationConfigurationUpdateParams
import com.m3ter.models.IntegrationConfigurationUpdateResponse

class IntegrationConfigurationServiceImpl
internal constructor(private val clientOptions: ClientOptions) : IntegrationConfigurationService {

    private val withRawResponse: IntegrationConfigurationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IntegrationConfigurationService.WithRawResponse =
        withRawResponse

    override fun create(
        params: IntegrationConfigurationCreateParams,
        requestOptions: RequestOptions,
    ): IntegrationConfigurationCreateResponse =
        // post /organizations/{orgId}/integrationconfigs
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: IntegrationConfigurationRetrieveParams,
        requestOptions: RequestOptions,
    ): IntegrationConfigurationResponse =
        // get /organizations/{orgId}/integrationconfigs/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: IntegrationConfigurationUpdateParams,
        requestOptions: RequestOptions,
    ): IntegrationConfigurationUpdateResponse =
        // put /organizations/{orgId}/integrationconfigs/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: IntegrationConfigurationListParams,
        requestOptions: RequestOptions,
    ): IntegrationConfigurationListPage =
        // get /organizations/{orgId}/integrationconfigs
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: IntegrationConfigurationDeleteParams,
        requestOptions: RequestOptions,
    ): IntegrationConfigurationDeleteResponse =
        // delete /organizations/{orgId}/integrationconfigs/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun enable(
        params: IntegrationConfigurationEnableParams,
        requestOptions: RequestOptions,
    ): IntegrationConfigurationEnableResponse =
        // post /organizations/{orgId}/integrationconfigs/{id}/enable
        withRawResponse().enable(params, requestOptions).parse()

    override fun getByEntity(
        params: IntegrationConfigurationGetByEntityParams,
        requestOptions: RequestOptions,
    ): IntegrationConfigurationResponse =
        // get /organizations/{orgId}/integrationconfigs/entity/{entityType}
        withRawResponse().getByEntity(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IntegrationConfigurationService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<IntegrationConfigurationCreateResponse> =
            jsonHandler<IntegrationConfigurationCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: IntegrationConfigurationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntegrationConfigurationCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "integrationconfigs",
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

        private val retrieveHandler: Handler<IntegrationConfigurationResponse> =
            jsonHandler<IntegrationConfigurationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: IntegrationConfigurationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntegrationConfigurationResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "integrationconfigs",
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

        private val updateHandler: Handler<IntegrationConfigurationUpdateResponse> =
            jsonHandler<IntegrationConfigurationUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: IntegrationConfigurationUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntegrationConfigurationUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "integrationconfigs",
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

        private val listHandler: Handler<IntegrationConfigurationListPageResponse> =
            jsonHandler<IntegrationConfigurationListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: IntegrationConfigurationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntegrationConfigurationListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "integrationconfigs",
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
                        IntegrationConfigurationListPage.builder()
                            .service(IntegrationConfigurationServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<IntegrationConfigurationDeleteResponse> =
            jsonHandler<IntegrationConfigurationDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: IntegrationConfigurationDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntegrationConfigurationDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "integrationconfigs",
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

        private val enableHandler: Handler<IntegrationConfigurationEnableResponse> =
            jsonHandler<IntegrationConfigurationEnableResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun enable(
            params: IntegrationConfigurationEnableParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntegrationConfigurationEnableResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "integrationconfigs",
                        params._pathParam(1),
                        "enable",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { enableHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getByEntityHandler: Handler<IntegrationConfigurationResponse> =
            jsonHandler<IntegrationConfigurationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun getByEntity(
            params: IntegrationConfigurationGetByEntityParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntegrationConfigurationResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "integrationconfigs",
                        "entity",
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { getByEntityHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
