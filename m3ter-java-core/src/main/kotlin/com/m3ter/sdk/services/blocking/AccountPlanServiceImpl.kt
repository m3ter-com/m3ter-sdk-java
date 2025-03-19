// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.core.ClientOptions
import com.m3ter.sdk.core.JsonValue
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
import com.m3ter.sdk.models.AccountPlanCreateParams
import com.m3ter.sdk.models.AccountPlanDeleteParams
import com.m3ter.sdk.models.AccountPlanListPage
import com.m3ter.sdk.models.AccountPlanListParams
import com.m3ter.sdk.models.AccountPlanResponse
import com.m3ter.sdk.models.AccountPlanRetrieveParams
import com.m3ter.sdk.models.AccountPlanUpdateParams

class AccountPlanServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountPlanService {

    private val withRawResponse: AccountPlanService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccountPlanService.WithRawResponse = withRawResponse

    override fun create(
        params: AccountPlanCreateParams,
        requestOptions: RequestOptions,
    ): AccountPlanResponse =
        // post /organizations/{orgId}/accountplans
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AccountPlanRetrieveParams,
        requestOptions: RequestOptions,
    ): AccountPlanResponse =
        // get /organizations/{orgId}/accountplans/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: AccountPlanUpdateParams,
        requestOptions: RequestOptions,
    ): AccountPlanResponse =
        // put /organizations/{orgId}/accountplans/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: AccountPlanListParams,
        requestOptions: RequestOptions,
    ): AccountPlanListPage =
        // get /organizations/{orgId}/accountplans
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: AccountPlanDeleteParams,
        requestOptions: RequestOptions,
    ): AccountPlanResponse =
        // delete /organizations/{orgId}/accountplans/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountPlanService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<AccountPlanResponse> =
            jsonHandler<AccountPlanResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: AccountPlanCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountPlanResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params._pathParam(0), "accountplans")
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

        private val retrieveHandler: Handler<AccountPlanResponse> =
            jsonHandler<AccountPlanResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: AccountPlanRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountPlanResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "accountplans",
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

        private val updateHandler: Handler<AccountPlanResponse> =
            jsonHandler<AccountPlanResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: AccountPlanUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountPlanResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "accountplans",
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

        private val listHandler: Handler<AccountPlanListPage.Response> =
            jsonHandler<AccountPlanListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: AccountPlanListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountPlanListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params._pathParam(0), "accountplans")
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
                        AccountPlanListPage.of(AccountPlanServiceImpl(clientOptions), params, it)
                    }
            }
        }

        private val deleteHandler: Handler<AccountPlanResponse> =
            jsonHandler<AccountPlanResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: AccountPlanDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountPlanResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "accountplans",
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
