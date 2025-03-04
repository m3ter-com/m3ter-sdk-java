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
import com.m3ter.sdk.core.json
import com.m3ter.sdk.core.prepareAsync
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.DebitReason
import com.m3ter.sdk.models.DebitReasonCreateParams
import com.m3ter.sdk.models.DebitReasonDeleteParams
import com.m3ter.sdk.models.DebitReasonListPageAsync
import com.m3ter.sdk.models.DebitReasonListParams
import com.m3ter.sdk.models.DebitReasonRetrieveParams
import com.m3ter.sdk.models.DebitReasonUpdateParams
import java.util.concurrent.CompletableFuture

class DebitReasonServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DebitReasonServiceAsync {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<DebitReason> =
        jsonHandler<DebitReason>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new Debit Reason for your Organization. When you've created a Debit Reason, it
     * becomes available as a debit type for adding Debit line items to Bills. See
     * [Debits](https://www.m3ter.com/docs/api#tag/Debits).
     */
    override fun create(
        params: DebitReasonCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DebitReason> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "picklists",
                    "debitreasons",
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

    private val retrieveHandler: Handler<DebitReason> =
        jsonHandler<DebitReason>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve the Debit Reason with the given UUID. */
    override fun retrieve(
        params: DebitReasonRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DebitReason> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "picklists",
                    "debitreasons",
                    params.getPathParam(1),
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

    private val updateHandler: Handler<DebitReason> =
        jsonHandler<DebitReason>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update the Debit Reason with the given UUID. */
    override fun update(
        params: DebitReasonUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DebitReason> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "picklists",
                    "debitreasons",
                    params.getPathParam(1),
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

    private val listHandler: Handler<DebitReasonListPageAsync.Response> =
        jsonHandler<DebitReasonListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Retrieve a list of the Debit Reason entities created for your Organization. You can filter
     * the list returned for the call by Debit Reason ID, Debit Reason short code, or by Archive
     * status.
     */
    override fun list(
        params: DebitReasonListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DebitReasonListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "picklists",
                    "debitreasons",
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
                    .let { DebitReasonListPageAsync.of(this, params, it) }
            }
    }

    private val deleteHandler: Handler<DebitReason> =
        jsonHandler<DebitReason>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete the Debit Reason with the given UUID. */
    override fun delete(
        params: DebitReasonDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DebitReason> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "picklists",
                    "debitreasons",
                    params.getPathParam(1),
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
