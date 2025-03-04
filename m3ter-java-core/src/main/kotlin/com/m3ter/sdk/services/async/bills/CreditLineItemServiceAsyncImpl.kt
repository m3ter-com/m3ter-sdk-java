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

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<CreditLineItem> =
        jsonHandler<CreditLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new Credit line item for the given Bill.
     *
     * When creating Credit line items for Bills, use the Credit Reasons created for your
     * Organization. See [CreditReason](https://www.m3ter.com/docs/api#tag/CreditReason).
     */
    override fun create(
        params: BillCreditLineItemCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditLineItem> {
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
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val retrieveHandler: Handler<CreditLineItem> =
        jsonHandler<CreditLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve the Credit line item with the given UUID. */
    override fun retrieve(
        params: BillCreditLineItemRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditLineItem> {
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
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val updateHandler: Handler<CreditLineItem> =
        jsonHandler<CreditLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update the Credit line item with the given UUID. */
    override fun update(
        params: BillCreditLineItemUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditLineItem> {
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
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<BillCreditLineItemListPageAsync.Response> =
        jsonHandler<BillCreditLineItemListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List the Credit line items for the given Bill. */
    override fun list(
        params: BillCreditLineItemListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillCreditLineItemListPageAsync> {
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
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let { BillCreditLineItemListPageAsync.of(this, params, it) }
            }
    }

    private val deleteHandler: Handler<CreditLineItem> =
        jsonHandler<CreditLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete the Credit line item with the given UUID. */
    override fun delete(
        params: BillCreditLineItemDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditLineItem> {
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
