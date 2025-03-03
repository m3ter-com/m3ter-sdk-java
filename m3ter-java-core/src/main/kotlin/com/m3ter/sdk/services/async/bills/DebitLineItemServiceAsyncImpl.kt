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
import com.m3ter.sdk.core.json
import com.m3ter.sdk.core.prepareAsync
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.BillDebitLineItemCreateParams
import com.m3ter.sdk.models.BillDebitLineItemDeleteParams
import com.m3ter.sdk.models.BillDebitLineItemListPageAsync
import com.m3ter.sdk.models.BillDebitLineItemListParams
import com.m3ter.sdk.models.BillDebitLineItemRetrieveParams
import com.m3ter.sdk.models.BillDebitLineItemUpdateParams
import com.m3ter.sdk.models.DebitLineItem
import java.util.concurrent.CompletableFuture

class DebitLineItemServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DebitLineItemServiceAsync {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<DebitLineItem> =
        jsonHandler<DebitLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new Debit line item for the given bill.
     *
     * When creating Debit line items for Bills, use the Debit Reasons created for your
     * Organization. See [DebitReason](https://www.m3ter.com/docs/api#tag/DebitReason).
     */
    override fun create(
        params: BillDebitLineItemCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DebitLineItem> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "bills",
                    params.getPathParam(1),
                    "debitlineitems",
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val retrieveHandler: Handler<DebitLineItem> =
        jsonHandler<DebitLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve the Debit line item with the given UUID. */
    override fun retrieve(
        params: BillDebitLineItemRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DebitLineItem> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "bills",
                    params.getPathParam(1),
                    "debitlineitems",
                    params.getPathParam(2),
                )
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val updateHandler: Handler<DebitLineItem> =
        jsonHandler<DebitLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update the Debit line item with the given UUID. */
    override fun update(
        params: BillDebitLineItemUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DebitLineItem> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "bills",
                    params.getPathParam(1),
                    "debitlineitems",
                    params.getPathParam(2),
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<BillDebitLineItemListPageAsync.Response> =
        jsonHandler<BillDebitLineItemListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List the Debit line items for the given bill. */
    override fun list(
        params: BillDebitLineItemListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillDebitLineItemListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "bills",
                    params.getPathParam(1),
                    "debitlineitems",
                )
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { BillDebitLineItemListPageAsync.of(this, params, it) }
            }
    }

    private val deleteHandler: Handler<DebitLineItem> =
        jsonHandler<DebitLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete the Debit line item with the given UUID. */
    override fun delete(
        params: BillDebitLineItemDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DebitLineItem> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "bills",
                    params.getPathParam(1),
                    "debitlineitems",
                    params.getPathParam(2),
                )
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
