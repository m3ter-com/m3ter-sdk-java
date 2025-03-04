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
import com.m3ter.sdk.core.http.parseable
import com.m3ter.sdk.core.json
import com.m3ter.sdk.core.prepare
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.Contract
import com.m3ter.sdk.models.ContractCreateParams
import com.m3ter.sdk.models.ContractDeleteParams
import com.m3ter.sdk.models.ContractEndDateBillingEntitiesParams
import com.m3ter.sdk.models.ContractEndDateBillingEntitiesResponse
import com.m3ter.sdk.models.ContractListPage
import com.m3ter.sdk.models.ContractListParams
import com.m3ter.sdk.models.ContractRetrieveParams
import com.m3ter.sdk.models.ContractUpdateParams

class ContractServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ContractService {

    private val withRawResponse: ContractService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ContractService.WithRawResponse = withRawResponse

    override fun create(params: ContractCreateParams, requestOptions: RequestOptions): Contract =
        // post /organizations/{orgId}/contracts
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ContractRetrieveParams,
        requestOptions: RequestOptions,
    ): Contract =
        // get /organizations/{orgId}/contracts/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: ContractUpdateParams, requestOptions: RequestOptions): Contract =
        // put /organizations/{orgId}/contracts/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ContractListParams,
        requestOptions: RequestOptions,
    ): ContractListPage =
        // get /organizations/{orgId}/contracts
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: ContractDeleteParams, requestOptions: RequestOptions): Contract =
        // delete /organizations/{orgId}/contracts/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun endDateBillingEntities(
        params: ContractEndDateBillingEntitiesParams,
        requestOptions: RequestOptions,
    ): ContractEndDateBillingEntitiesResponse =
        // put /organizations/{orgId}/contracts/{id}/enddatebillingentities
        withRawResponse().endDateBillingEntities(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ContractService.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Contract> =
            jsonHandler<Contract>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: ContractCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Contract> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params.getPathParam(0), "contracts")
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

        private val retrieveHandler: Handler<Contract> =
            jsonHandler<Contract>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: ContractRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Contract> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "contracts",
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

        private val updateHandler: Handler<Contract> =
            jsonHandler<Contract>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: ContractUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Contract> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "contracts",
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

        private val listHandler: Handler<ContractListPage.Response> =
            jsonHandler<ContractListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ContractListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContractListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params.getPathParam(0), "contracts")
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
                    .let { ContractListPage.of(ContractServiceImpl(clientOptions), params, it) }
            }
        }

        private val deleteHandler: Handler<Contract> =
            jsonHandler<Contract>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: ContractDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Contract> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "contracts",
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

        private val endDateBillingEntitiesHandler: Handler<ContractEndDateBillingEntitiesResponse> =
            jsonHandler<ContractEndDateBillingEntitiesResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun endDateBillingEntities(
            params: ContractEndDateBillingEntitiesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContractEndDateBillingEntitiesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "contracts",
                        params.getPathParam(1),
                        "enddatebillingentities",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { endDateBillingEntitiesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
