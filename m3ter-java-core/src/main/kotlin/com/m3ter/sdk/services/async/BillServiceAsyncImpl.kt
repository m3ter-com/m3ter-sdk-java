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
import com.m3ter.sdk.models.Bill
import com.m3ter.sdk.models.BillApproveParams
import com.m3ter.sdk.models.BillApproveResponse
import com.m3ter.sdk.models.BillDeleteParams
import com.m3ter.sdk.models.BillLatestByAccountParams
import com.m3ter.sdk.models.BillListPageAsync
import com.m3ter.sdk.models.BillListParams
import com.m3ter.sdk.models.BillLockParams
import com.m3ter.sdk.models.BillRetrieveParams
import com.m3ter.sdk.models.BillSearchParams
import com.m3ter.sdk.models.BillSearchResponse
import com.m3ter.sdk.models.BillUpdateStatusParams
import com.m3ter.sdk.services.async.bills.CreditLineItemServiceAsync
import com.m3ter.sdk.services.async.bills.CreditLineItemServiceAsyncImpl
import com.m3ter.sdk.services.async.bills.DebitLineItemServiceAsync
import com.m3ter.sdk.services.async.bills.DebitLineItemServiceAsyncImpl
import com.m3ter.sdk.services.async.bills.LineItemServiceAsync
import com.m3ter.sdk.services.async.bills.LineItemServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class BillServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BillServiceAsync {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val creditLineItems: CreditLineItemServiceAsync by lazy {
        CreditLineItemServiceAsyncImpl(clientOptions)
    }

    private val debitLineItems: DebitLineItemServiceAsync by lazy {
        DebitLineItemServiceAsyncImpl(clientOptions)
    }

    private val lineItems: LineItemServiceAsync by lazy { LineItemServiceAsyncImpl(clientOptions) }

    override fun creditLineItems(): CreditLineItemServiceAsync = creditLineItems

    override fun debitLineItems(): DebitLineItemServiceAsync = debitLineItems

    override fun lineItems(): LineItemServiceAsync = lineItems

    private val retrieveHandler: Handler<Bill> =
        jsonHandler<Bill>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Retrieve the Bill with the given UUID.
     *
     * This endpoint retrieves the Bill with the given unique identifier (UUID) and specific
     * Organization.
     */
    override fun retrieve(
        params: BillRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Bill> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "bills",
                    params.getPathParam(1),
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

    private val listHandler: Handler<BillListPageAsync.Response> =
        jsonHandler<BillListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Retrieve a list of Bills.
     *
     * This endpoint retrieves a list of all Bills for the given Account within the specified
     * Organization. Optional filters can be applied such as by date range, lock status, or other
     * attributes. The list can also be paginated for easier management.
     */
    override fun list(
        params: BillListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "bills")
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
                    .let { BillListPageAsync.of(this, params, it) }
            }
    }

    private val deleteHandler: Handler<Bill> =
        jsonHandler<Bill>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Delete the Bill with the given UUID.
     *
     * This endpoint deletes the specified Bill with the given unique identifier. Use with caution
     * since deleted Bills cannot be recovered. Suitable for removing incorrect or obsolete Bills,
     * and for Bills that have not been sent to customers. Where end-customer invoices for Bills
     * have been sent to customers, Bills should not be deleted to ensure you have an audit trail of
     * how the invoice was created.
     */
    override fun delete(
        params: BillDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Bill> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "bills",
                    params.getPathParam(1),
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

    private val approveHandler: Handler<BillApproveResponse> =
        jsonHandler<BillApproveResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Approve multiple Bills for the specified Organization based on the given criteria.
     *
     * This endpoint allows you to change currently _Pending_ Bills to _Approved_ status for further
     * processing.
     *
     * Query Parameters:
     * - Use `accountIds` to approve Bills for specifed Accounts.
     *
     * Request Body Schema Parameter:
     * - Use `billIds` to specify a collection of Bills for batch approval.
     *
     * **Important!** If you use the `billIds` Request Body Schema parameter, any Query parameters
     * you might have also used are ignored when the call is processed.
     */
    override fun approve(
        params: BillApproveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillApproveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("organizations", params.getPathParam(0), "bills", "approve")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { approveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val latestByAccountHandler: Handler<Bill> =
        jsonHandler<Bill>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Retrieve the latest Bill for the given Account.
     *
     * This endpoint retrieves the latest Bill for the given Account in the specified Organization.
     * It facilitates tracking of the most recent charges and consumption details.
     */
    override fun latestByAccount(
        params: BillLatestByAccountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Bill> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "bills",
                    "latest",
                    params.getPathParam(1),
                )
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { latestByAccountHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val lockHandler: Handler<Bill> =
        jsonHandler<Bill>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Lock the specific Bill identified by the given UUID. Once a Bill is locked, no further
     * changes can be made to it.
     *
     * **NOTE:** You cannot lock a Bill whose current status is `PENDING`. You will receive an error
     * message if you try to do this. You must first use the
     * [Approve Bills](https://www.m3ter.com/docs/api#tag/Bill/operation/ApproveBills) call to
     * approve a Bill before you can lock it.
     */
    override fun lock(
        params: BillLockParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Bill> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "bills",
                    params.getPathParam(1),
                    "lock",
                )
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { lockHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val searchHandler: Handler<BillSearchResponse> =
        jsonHandler<BillSearchResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Search for Bill entities.
     *
     * This endpoint executes a search query for Bills based on the user specified search criteria.
     * The search query is customizable, allowing for complex nested conditions and sorting. The
     * returned list of Bills can be paginated for easier management.
     */
    override fun search(
        params: BillSearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillSearchResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "bills", "search")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { searchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val updateStatusHandler: Handler<Bill> =
        jsonHandler<Bill>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Updates the status of a specified Bill with the given Bill ID.
     *
     * This endpoint allows you to transition a Bill's status through various stages, such as from
     * "Pending" to "Approved".
     */
    override fun updateStatus(
        params: BillUpdateStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Bill> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "bills",
                    params.getPathParam(1),
                    "status",
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { updateStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
