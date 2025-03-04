// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async.bills

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
import com.m3ter.sdk.models.BillCreditLineItemCreateParams
import com.m3ter.sdk.models.BillCreditLineItemDeleteParams
import com.m3ter.sdk.models.BillCreditLineItemListPageAsync
import com.m3ter.sdk.models.BillCreditLineItemListParams
import com.m3ter.sdk.models.BillCreditLineItemRetrieveParams
import com.m3ter.sdk.models.BillCreditLineItemUpdateParams
import com.m3ter.sdk.models.CreditLineItem
import java.util.concurrent.CompletableFuture

class CreditLineItemServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : CreditLineItemServiceAsync {

    private val withRawResponse: CreditLineItemServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CreditLineItemServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: BillCreditLineItemCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditLineItem> =
        // post /organizations/{orgId}/bills/{billId}/creditlineitems
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: BillCreditLineItemRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditLineItem> =
        // get /organizations/{orgId}/bills/{billId}/creditlineitems/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: BillCreditLineItemUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditLineItem> =
        // put /organizations/{orgId}/bills/{billId}/creditlineitems/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: BillCreditLineItemListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillCreditLineItemListPageAsync> =
        // get /organizations/{orgId}/bills/{billId}/creditlineitems
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: BillCreditLineItemDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditLineItem> =
        // delete /organizations/{orgId}/bills/{billId}/creditlineitems/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CreditLineItemServiceAsync.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CreditLineItem> =
            jsonHandler<CreditLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: BillCreditLineItemCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditLineItem>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "bills",
                        params.getPathParam(1),
                        "creditlineitems",
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
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<CreditLineItem> =
            jsonHandler<CreditLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: BillCreditLineItemRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditLineItem>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "bills",
                        params.getPathParam(1),
                        "creditlineitems",
                        params.getPathParam(2),
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

        private val updateHandler: Handler<CreditLineItem> =
            jsonHandler<CreditLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: BillCreditLineItemUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditLineItem>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "bills",
                        params.getPathParam(1),
                        "creditlineitems",
                        params.getPathParam(2),
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

        private val listHandler: Handler<BillCreditLineItemListPageAsync.Response> =
            jsonHandler<BillCreditLineItemListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: BillCreditLineItemListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillCreditLineItemListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "bills",
                        params.getPathParam(1),
                        "creditlineitems",
                    )
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
                                BillCreditLineItemListPageAsync.of(
                                    CreditLineItemServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val deleteHandler: Handler<CreditLineItem> =
            jsonHandler<CreditLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: BillCreditLineItemDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditLineItem>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "bills",
                        params.getPathParam(1),
                        "creditlineitems",
                        params.getPathParam(2),
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
