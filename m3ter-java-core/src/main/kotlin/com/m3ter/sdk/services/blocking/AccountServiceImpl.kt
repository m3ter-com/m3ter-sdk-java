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
import com.m3ter.sdk.models.AccountCreateParams
import com.m3ter.sdk.models.AccountDeleteParams
import com.m3ter.sdk.models.AccountEndDateBillingEntitiesParams
import com.m3ter.sdk.models.AccountEndDateBillingEntitiesResponse
import com.m3ter.sdk.models.AccountGetChildrenParams
import com.m3ter.sdk.models.AccountListPage
import com.m3ter.sdk.models.AccountListParams
import com.m3ter.sdk.models.AccountResponse
import com.m3ter.sdk.models.AccountRetrieveParams
import com.m3ter.sdk.models.AccountSearchParams
import com.m3ter.sdk.models.AccountSearchResponse
import com.m3ter.sdk.models.AccountUpdateParams

class AccountServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountService {

    private val withRawResponse: AccountService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccountService.WithRawResponse = withRawResponse

    override fun create(
        params: AccountCreateParams,
        requestOptions: RequestOptions,
    ): AccountResponse =
        // post /organizations/{orgId}/accounts
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions,
    ): AccountResponse =
        // get /organizations/{orgId}/accounts/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: AccountUpdateParams,
        requestOptions: RequestOptions,
    ): AccountResponse =
        // put /organizations/{orgId}/accounts/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: AccountListParams, requestOptions: RequestOptions): AccountListPage =
        // get /organizations/{orgId}/accounts
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: AccountDeleteParams,
        requestOptions: RequestOptions,
    ): AccountResponse =
        // delete /organizations/{orgId}/accounts/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun endDateBillingEntities(
        params: AccountEndDateBillingEntitiesParams,
        requestOptions: RequestOptions,
    ): AccountEndDateBillingEntitiesResponse =
        // put /organizations/{orgId}/accounts/{id}/enddatebillingentities
        withRawResponse().endDateBillingEntities(params, requestOptions).parse()

    override fun getChildren(
        params: AccountGetChildrenParams,
        requestOptions: RequestOptions,
    ): AccountResponse =
        // get /organizations/{orgId}/accounts/{id}/children
        withRawResponse().getChildren(params, requestOptions).parse()

    override fun search(
        params: AccountSearchParams,
        requestOptions: RequestOptions,
    ): AccountSearchResponse =
        // get /organizations/{orgId}/accounts/search
        withRawResponse().search(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountService.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<AccountResponse> =
            jsonHandler<AccountResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: AccountCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params.getPathParam(0), "accounts")
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

        private val retrieveHandler: Handler<AccountResponse> =
            jsonHandler<AccountResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "accounts",
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

        private val updateHandler: Handler<AccountResponse> =
            jsonHandler<AccountResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: AccountUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "accounts",
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

        private val listHandler: Handler<AccountListPage.Response> =
            jsonHandler<AccountListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: AccountListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params.getPathParam(0), "accounts")
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
                    .let { AccountListPage.of(AccountServiceImpl(clientOptions), params, it) }
            }
        }

        private val deleteHandler: Handler<AccountResponse> =
            jsonHandler<AccountResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: AccountDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "accounts",
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

        private val endDateBillingEntitiesHandler: Handler<AccountEndDateBillingEntitiesResponse> =
            jsonHandler<AccountEndDateBillingEntitiesResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun endDateBillingEntities(
            params: AccountEndDateBillingEntitiesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountEndDateBillingEntitiesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "accounts",
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

        private val getChildrenHandler: Handler<AccountResponse> =
            jsonHandler<AccountResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun getChildren(
            params: AccountGetChildrenParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "accounts",
                        params.getPathParam(1),
                        "children",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { getChildrenHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val searchHandler: Handler<AccountSearchResponse> =
            jsonHandler<AccountSearchResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun search(
            params: AccountSearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountSearchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params.getPathParam(0), "accounts", "search")
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
