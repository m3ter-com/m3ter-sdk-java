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
import com.m3ter.models.BillApproveParams
import com.m3ter.models.BillApproveResponse
import com.m3ter.models.BillDeleteParams
import com.m3ter.models.BillLatestByAccountParams
import com.m3ter.models.BillListPageAsync
import com.m3ter.models.BillListPageResponse
import com.m3ter.models.BillListParams
import com.m3ter.models.BillLockParams
import com.m3ter.models.BillResponse
import com.m3ter.models.BillRetrieveParams
import com.m3ter.models.BillSearchParams
import com.m3ter.models.BillSearchResponse
import com.m3ter.models.BillUpdateStatusParams
import com.m3ter.services.async.bills.CreditLineItemServiceAsync
import com.m3ter.services.async.bills.CreditLineItemServiceAsyncImpl
import com.m3ter.services.async.bills.DebitLineItemServiceAsync
import com.m3ter.services.async.bills.DebitLineItemServiceAsyncImpl
import com.m3ter.services.async.bills.LineItemServiceAsync
import com.m3ter.services.async.bills.LineItemServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import kotlin.jvm.optionals.getOrNull

class BillServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BillServiceAsync {

    private val withRawResponse: BillServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val creditLineItems: CreditLineItemServiceAsync by lazy {
        CreditLineItemServiceAsyncImpl(clientOptions)
    }

    private val debitLineItems: DebitLineItemServiceAsync by lazy {
        DebitLineItemServiceAsyncImpl(clientOptions)
    }

    private val lineItems: LineItemServiceAsync by lazy { LineItemServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): BillServiceAsync.WithRawResponse = withRawResponse

    override fun creditLineItems(): CreditLineItemServiceAsync = creditLineItems

    override fun debitLineItems(): DebitLineItemServiceAsync = debitLineItems

    override fun lineItems(): LineItemServiceAsync = lineItems

    override fun retrieve(
        params: BillRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillResponse> =
        // get /organizations/{orgId}/bills/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: BillListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillListPageAsync> =
        // get /organizations/{orgId}/bills
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: BillDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillResponse> =
        // delete /organizations/{orgId}/bills/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun approve(
        params: BillApproveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillApproveResponse> =
        // post /organizations/{orgId}/bills/approve
        withRawResponse().approve(params, requestOptions).thenApply { it.parse() }

    override fun latestByAccount(
        params: BillLatestByAccountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillResponse> =
        // get /organizations/{orgId}/bills/latest/{accountId}
        withRawResponse().latestByAccount(params, requestOptions).thenApply { it.parse() }

    override fun lock(
        params: BillLockParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillResponse> =
        // put /organizations/{orgId}/bills/{id}/lock
        withRawResponse().lock(params, requestOptions).thenApply { it.parse() }

    override fun search(
        params: BillSearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillSearchResponse> =
        // get /organizations/{orgId}/bills/search
        withRawResponse().search(params, requestOptions).thenApply { it.parse() }

    override fun updateStatus(
        params: BillUpdateStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillResponse> =
        // put /organizations/{orgId}/bills/{id}/status
        withRawResponse().updateStatus(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BillServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val creditLineItems: CreditLineItemServiceAsync.WithRawResponse by lazy {
            CreditLineItemServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val debitLineItems: DebitLineItemServiceAsync.WithRawResponse by lazy {
            DebitLineItemServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val lineItems: LineItemServiceAsync.WithRawResponse by lazy {
            LineItemServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun creditLineItems(): CreditLineItemServiceAsync.WithRawResponse = creditLineItems

        override fun debitLineItems(): DebitLineItemServiceAsync.WithRawResponse = debitLineItems

        override fun lineItems(): LineItemServiceAsync.WithRawResponse = lineItems

        private val retrieveHandler: Handler<BillResponse> =
            jsonHandler<BillResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: BillRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "bills",
                        params._pathParam(1),
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

        private val listHandler: Handler<BillListPageResponse> =
            jsonHandler<BillListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: BillListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "bills",
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
                                BillListPageAsync.builder()
                                    .service(BillServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<BillResponse> =
            jsonHandler<BillResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: BillDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "bills",
                        params._pathParam(1),
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

        private val approveHandler: Handler<BillApproveResponse> =
            jsonHandler<BillApproveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun approve(
            params: BillApproveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillApproveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "bills",
                        "approve",
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
                            .use { approveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val latestByAccountHandler: Handler<BillResponse> =
            jsonHandler<BillResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun latestByAccount(
            params: BillLatestByAccountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "bills",
                        "latest",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { latestByAccountHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val lockHandler: Handler<BillResponse> =
            jsonHandler<BillResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun lock(
            params: BillLockParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "bills",
                        params._pathParam(1),
                        "lock",
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
                            .use { lockHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val searchHandler: Handler<BillSearchResponse> =
            jsonHandler<BillSearchResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun search(
            params: BillSearchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillSearchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "bills",
                        "search",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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

        private val updateStatusHandler: Handler<BillResponse> =
            jsonHandler<BillResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun updateStatus(
            params: BillUpdateStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "bills",
                        params._pathParam(1),
                        "status",
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
                            .use { updateStatusHandler.handle(it) }
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
