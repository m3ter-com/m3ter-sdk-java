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
import com.m3ter.sdk.core.prepareAsync
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.BillLineItemListPageAsync
import com.m3ter.sdk.models.BillLineItemListParams
import com.m3ter.sdk.models.BillLineItemRetrieveParams
import com.m3ter.sdk.models.LineItem
import java.util.concurrent.CompletableFuture

class LineItemServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LineItemServiceAsync {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<LineItem> =
        jsonHandler<LineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Retrieves a specific line item within a Bill.
     *
     * This endpoint retrieves the line item given by its unique identifier (UUID) from a specific
     * Bill.
     */
    override fun retrieve(
        params: BillLineItemRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LineItem> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "bills",
                    params.getPathParam(1),
                    "lineitems",
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

    private val listHandler: Handler<BillLineItemListPageAsync.Response> =
        jsonHandler<BillLineItemListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Lists all the line items for a specific Bill.
     *
     * This endpoint retrieves a list of line items for the given Bill within the specified
     * Organization. The list can also be paginated for easier management. The line items returned
     * in the list include individual charges, discounts, or adjustments within a Bill.
     */
    override fun list(
        params: BillLineItemListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillLineItemListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "bills",
                    params.getPathParam(1),
                    "lineitems",
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
                    .let { BillLineItemListPageAsync.of(this, params, it) }
            }
    }
}
