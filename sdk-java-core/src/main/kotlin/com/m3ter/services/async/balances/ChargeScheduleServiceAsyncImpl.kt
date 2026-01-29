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
import com.m3ter.models.BalanceChargeScheduleCreateParams
import com.m3ter.models.BalanceChargeScheduleCreateResponse
import com.m3ter.models.BalanceChargeScheduleDeleteParams
import com.m3ter.models.BalanceChargeScheduleDeleteResponse
import com.m3ter.models.BalanceChargeScheduleListPageAsync
import com.m3ter.models.BalanceChargeScheduleListPageResponse
import com.m3ter.models.BalanceChargeScheduleListParams
import com.m3ter.models.BalanceChargeSchedulePreviewParams
import com.m3ter.models.BalanceChargeSchedulePreviewResponse
import com.m3ter.models.BalanceChargeScheduleRetrieveParams
import com.m3ter.models.BalanceChargeScheduleRetrieveResponse
import com.m3ter.models.BalanceChargeScheduleUpdateParams
import com.m3ter.models.BalanceChargeScheduleUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ChargeScheduleServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ChargeScheduleServiceAsync {

    private val withRawResponse: ChargeScheduleServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ChargeScheduleServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ChargeScheduleServiceAsync =
        ChargeScheduleServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: BalanceChargeScheduleCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BalanceChargeScheduleCreateResponse> =
        // post /organizations/{orgId}/balances/{balanceId}/balancechargeschedules
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: BalanceChargeScheduleRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BalanceChargeScheduleRetrieveResponse> =
        // get /organizations/{orgId}/balances/{balanceId}/balancechargeschedules/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: BalanceChargeScheduleUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BalanceChargeScheduleUpdateResponse> =
        // put /organizations/{orgId}/balances/{balanceId}/balancechargeschedules/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: BalanceChargeScheduleListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BalanceChargeScheduleListPageAsync> =
        // get /organizations/{orgId}/balances/{balanceId}/balancechargeschedules
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: BalanceChargeScheduleDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BalanceChargeScheduleDeleteResponse> =
        // delete /organizations/{orgId}/balances/{balanceId}/balancechargeschedules/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun preview(
        params: BalanceChargeSchedulePreviewParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BalanceChargeSchedulePreviewResponse> =
        // post /organizations/{orgId}/balances/{balanceId}/balancechargeschedules/preview
        withRawResponse().preview(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChargeScheduleServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChargeScheduleServiceAsync.WithRawResponse =
            ChargeScheduleServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<BalanceChargeScheduleCreateResponse> =
            jsonHandler<BalanceChargeScheduleCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: BalanceChargeScheduleCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BalanceChargeScheduleCreateResponse>> {
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
                        "balancechargeschedules",
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

        private val retrieveHandler: Handler<BalanceChargeScheduleRetrieveResponse> =
            jsonHandler<BalanceChargeScheduleRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BalanceChargeScheduleRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BalanceChargeScheduleRetrieveResponse>> {
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
                        "balancechargeschedules",
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

        private val updateHandler: Handler<BalanceChargeScheduleUpdateResponse> =
            jsonHandler<BalanceChargeScheduleUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: BalanceChargeScheduleUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BalanceChargeScheduleUpdateResponse>> {
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
                        "balancechargeschedules",
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

        private val listHandler: Handler<BalanceChargeScheduleListPageResponse> =
            jsonHandler<BalanceChargeScheduleListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BalanceChargeScheduleListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BalanceChargeScheduleListPageAsync>> {
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
                        "balancechargeschedules",
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
                                BalanceChargeScheduleListPageAsync.builder()
                                    .service(ChargeScheduleServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<BalanceChargeScheduleDeleteResponse> =
            jsonHandler<BalanceChargeScheduleDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: BalanceChargeScheduleDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BalanceChargeScheduleDeleteResponse>> {
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
                        "balancechargeschedules",
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

        private val previewHandler: Handler<BalanceChargeSchedulePreviewResponse> =
            jsonHandler<BalanceChargeSchedulePreviewResponse>(clientOptions.jsonMapper)

        override fun preview(
            params: BalanceChargeSchedulePreviewParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BalanceChargeSchedulePreviewResponse>> {
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
                        "balancechargeschedules",
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
