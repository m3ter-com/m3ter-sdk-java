// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.bills

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
import com.m3ter.models.BillDebitLineItemCreateParams
import com.m3ter.models.BillDebitLineItemDeleteParams
import com.m3ter.models.BillDebitLineItemListPageAsync
import com.m3ter.models.BillDebitLineItemListPageResponse
import com.m3ter.models.BillDebitLineItemListParams
import com.m3ter.models.BillDebitLineItemRetrieveParams
import com.m3ter.models.BillDebitLineItemUpdateParams
import com.m3ter.models.DebitLineItemResponse
import java.util.concurrent.CompletableFuture
import kotlin.jvm.optionals.getOrNull

class DebitLineItemServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DebitLineItemServiceAsync {

    private val withRawResponse: DebitLineItemServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DebitLineItemServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: BillDebitLineItemCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DebitLineItemResponse> =
        // post /organizations/{orgId}/bills/{billId}/debitlineitems
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: BillDebitLineItemRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DebitLineItemResponse> =
        // get /organizations/{orgId}/bills/{billId}/debitlineitems/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: BillDebitLineItemUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DebitLineItemResponse> =
        // put /organizations/{orgId}/bills/{billId}/debitlineitems/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: BillDebitLineItemListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillDebitLineItemListPageAsync> =
        // get /organizations/{orgId}/bills/{billId}/debitlineitems
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: BillDebitLineItemDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DebitLineItemResponse> =
        // delete /organizations/{orgId}/bills/{billId}/debitlineitems/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DebitLineItemServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<DebitLineItemResponse> =
            jsonHandler<DebitLineItemResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: BillDebitLineItemCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DebitLineItemResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("billId", params.billId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "bills",
                        params._pathParam(1),
                        "debitlineitems",
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

        private val retrieveHandler: Handler<DebitLineItemResponse> =
            jsonHandler<DebitLineItemResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: BillDebitLineItemRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DebitLineItemResponse>> {
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
                        "debitlineitems",
                        params._pathParam(2),
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

        private val updateHandler: Handler<DebitLineItemResponse> =
            jsonHandler<DebitLineItemResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: BillDebitLineItemUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DebitLineItemResponse>> {
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
                        "debitlineitems",
                        params._pathParam(2),
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

        private val listHandler: Handler<BillDebitLineItemListPageResponse> =
            jsonHandler<BillDebitLineItemListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: BillDebitLineItemListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillDebitLineItemListPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("billId", params.billId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "bills",
                        params._pathParam(1),
                        "debitlineitems",
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
                                BillDebitLineItemListPageAsync.builder()
                                    .service(DebitLineItemServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<DebitLineItemResponse> =
            jsonHandler<DebitLineItemResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: BillDebitLineItemDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DebitLineItemResponse>> {
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
                        "debitlineitems",
                        params._pathParam(2),
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
