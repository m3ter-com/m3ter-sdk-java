// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

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
import com.m3ter.sdk.core.prepareAsync
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.AccountPlan
import com.m3ter.sdk.models.AccountPlanCreateParams
import com.m3ter.sdk.models.AccountPlanDeleteParams
import com.m3ter.sdk.models.AccountPlanListPageAsync
import com.m3ter.sdk.models.AccountPlanListParams
import com.m3ter.sdk.models.AccountPlanRetrieveParams
import com.m3ter.sdk.models.AccountPlanUpdateParams
import java.util.concurrent.CompletableFuture

class AccountPlanServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountPlanServiceAsync {

    private val withRawResponse: AccountPlanServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccountPlanServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: AccountPlanCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountPlan> =
        // post /organizations/{orgId}/accountplans
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: AccountPlanRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountPlan> =
        // get /organizations/{orgId}/accountplans/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: AccountPlanUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountPlan> =
        // put /organizations/{orgId}/accountplans/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: AccountPlanListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountPlanListPageAsync> =
        // get /organizations/{orgId}/accountplans
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: AccountPlanDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountPlan> =
        // delete /organizations/{orgId}/accountplans/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountPlanServiceAsync.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<AccountPlan> =
            jsonHandler<AccountPlan>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: AccountPlanCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountPlan>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params.getPathParam(0), "accountplans")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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

        private val retrieveHandler: Handler<AccountPlan> =
            jsonHandler<AccountPlan>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: AccountPlanRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountPlan>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "accountplans",
                        params.getPathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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

        private val updateHandler: Handler<AccountPlan> =
            jsonHandler<AccountPlan>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: AccountPlanUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountPlan>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "accountplans",
                        params.getPathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<AccountPlanListPageAsync.Response> =
            jsonHandler<AccountPlanListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: AccountPlanListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountPlanListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params.getPathParam(0), "accountplans")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                AccountPlanListPageAsync.of(
                                    AccountPlanServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val deleteHandler: Handler<AccountPlan> =
            jsonHandler<AccountPlan>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: AccountPlanDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountPlan>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "accountplans",
                        params.getPathParam(1),
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
}
