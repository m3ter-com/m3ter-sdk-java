// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.balances

import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.checkRequired
import com.m3ter.core.handlers.errorBodyHandler
import com.m3ter.core.handlers.errorHandler
import com.m3ter.core.handlers.jsonHandler
import com.m3ter.core.http.HttpMethod
import com.m3ter.core.http.HttpRequest
import com.m3ter.core.http.HttpResponse
import com.m3ter.core.http.HttpResponse.Handler
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.core.http.json
import com.m3ter.core.http.parseable
import com.m3ter.core.prepareAsync
import com.m3ter.models.BalanceTransactionScheduleCreateParams
import com.m3ter.models.BalanceTransactionScheduleDeleteParams
import com.m3ter.models.BalanceTransactionScheduleListPageAsync
import com.m3ter.models.BalanceTransactionScheduleListPageResponse
import com.m3ter.models.BalanceTransactionScheduleListParams
import com.m3ter.models.BalanceTransactionSchedulePreviewParams
import com.m3ter.models.BalanceTransactionScheduleRetrieveParams
import com.m3ter.models.BalanceTransactionScheduleUpdateParams
import com.m3ter.models.ScheduleResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TransactionScheduleServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : TransactionScheduleServiceAsync {

    private val withRawResponse: TransactionScheduleServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TransactionScheduleServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): TransactionScheduleServiceAsync =
        TransactionScheduleServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: BalanceTransactionScheduleCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScheduleResponse> =
        // post /organizations/{orgId}/balances/{balanceId}/balancetransactionschedules
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: BalanceTransactionScheduleRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScheduleResponse> =
        // get /organizations/{orgId}/balances/{balanceId}/balancetransactionschedules/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: BalanceTransactionScheduleUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScheduleResponse> =
        // put /organizations/{orgId}/balances/{balanceId}/balancetransactionschedules/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: BalanceTransactionScheduleListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BalanceTransactionScheduleListPageAsync> =
        // get /organizations/{orgId}/balances/{balanceId}/balancetransactionschedules
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: BalanceTransactionScheduleDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScheduleResponse> =
        // delete /organizations/{orgId}/balances/{balanceId}/balancetransactionschedules/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun preview(
        params: BalanceTransactionSchedulePreviewParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScheduleResponse> =
        // post /organizations/{orgId}/balances/{balanceId}/balancetransactionschedules/preview
        withRawResponse().preview(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TransactionScheduleServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransactionScheduleServiceAsync.WithRawResponse =
            TransactionScheduleServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ScheduleResponse> =
            jsonHandler<ScheduleResponse>(clientOptions.jsonMapper)

        override fun create(
            params: BalanceTransactionScheduleCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScheduleResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("balanceId", params.balanceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "balances",
                        params._pathParam(1),
                        "balancetransactionschedules",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val retrieveHandler: Handler<ScheduleResponse> =
            jsonHandler<ScheduleResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BalanceTransactionScheduleRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScheduleResponse>> {
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
                        "balances",
                        params._pathParam(1),
                        "balancetransactionschedules",
                        params._pathParam(2),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val updateHandler: Handler<ScheduleResponse> =
            jsonHandler<ScheduleResponse>(clientOptions.jsonMapper)

        override fun update(
            params: BalanceTransactionScheduleUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScheduleResponse>> {
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
                        "balances",
                        params._pathParam(1),
                        "balancetransactionschedules",
                        params._pathParam(2),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val listHandler: Handler<BalanceTransactionScheduleListPageResponse> =
            jsonHandler<BalanceTransactionScheduleListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BalanceTransactionScheduleListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BalanceTransactionScheduleListPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("balanceId", params.balanceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "balances",
                        params._pathParam(1),
                        "balancetransactionschedules",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                BalanceTransactionScheduleListPageAsync.builder()
                                    .service(TransactionScheduleServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<ScheduleResponse> =
            jsonHandler<ScheduleResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: BalanceTransactionScheduleDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScheduleResponse>> {
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
                        "balances",
                        params._pathParam(1),
                        "balancetransactionschedules",
                        params._pathParam(2),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val previewHandler: Handler<ScheduleResponse> =
            jsonHandler<ScheduleResponse>(clientOptions.jsonMapper)

        override fun preview(
            params: BalanceTransactionSchedulePreviewParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScheduleResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("balanceId", params.balanceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "balances",
                        params._pathParam(1),
                        "balancetransactionschedules",
                        "preview",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { previewHandler.handle(it) }
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
