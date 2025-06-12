// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.BillApproveParams
import com.m3ter.models.BillApproveResponse
import com.m3ter.models.BillDeleteParams
import com.m3ter.models.BillLatestByAccountParams
import com.m3ter.models.BillListPageAsync
import com.m3ter.models.BillListParams
import com.m3ter.models.BillLockParams
import com.m3ter.models.BillResponse
import com.m3ter.models.BillRetrieveParams
import com.m3ter.models.BillSearchParams
import com.m3ter.models.BillSearchResponse
import com.m3ter.models.BillUpdateStatusParams
import com.m3ter.services.async.bills.CreditLineItemServiceAsync
import com.m3ter.services.async.bills.DebitLineItemServiceAsync
import com.m3ter.services.async.bills.LineItemServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BillServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BillServiceAsync

    fun creditLineItems(): CreditLineItemServiceAsync

    fun debitLineItems(): DebitLineItemServiceAsync

    fun lineItems(): LineItemServiceAsync

    /**
     * Retrieve the Bill with the given UUID.
     *
     * This endpoint retrieves the Bill with the given unique identifier (UUID) and specific
     * Organization.
     */
    fun retrieve(id: String): CompletableFuture<BillResponse> =
        retrieve(id, BillRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: BillRetrieveParams = BillRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillResponse> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: BillRetrieveParams = BillRetrieveParams.none(),
    ): CompletableFuture<BillResponse> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BillRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillResponse>

    /** @see [retrieve] */
    fun retrieve(params: BillRetrieveParams): CompletableFuture<BillResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<BillResponse> =
        retrieve(id, BillRetrieveParams.none(), requestOptions)

    /**
     * Retrieve a list of Bills.
     *
     * This endpoint retrieves a list of all Bills for the given Account within the specified
     * Organization. Optional filters can be applied such as by date range, lock status, or other
     * attributes. The list can also be paginated for easier management.
     */
    fun list(): CompletableFuture<BillListPageAsync> = list(BillListParams.none())

    /** @see [list] */
    fun list(
        params: BillListParams = BillListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillListPageAsync>

    /** @see [list] */
    fun list(params: BillListParams = BillListParams.none()): CompletableFuture<BillListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<BillListPageAsync> =
        list(BillListParams.none(), requestOptions)

    /**
     * Delete the Bill with the given UUID.
     *
     * This endpoint deletes the specified Bill with the given unique identifier. Use with caution
     * since deleted Bills cannot be recovered. Suitable for removing incorrect or obsolete Bills,
     * and for Bills that have not been sent to customers. Where end-customer invoices for Bills
     * have been sent to customers, Bills should not be deleted to ensure you have an audit trail of
     * how the invoice was created.
     */
    fun delete(id: String): CompletableFuture<BillResponse> = delete(id, BillDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: BillDeleteParams = BillDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillResponse> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: BillDeleteParams = BillDeleteParams.none(),
    ): CompletableFuture<BillResponse> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: BillDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillResponse>

    /** @see [delete] */
    fun delete(params: BillDeleteParams): CompletableFuture<BillResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<BillResponse> =
        delete(id, BillDeleteParams.none(), requestOptions)

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
    fun approve(params: BillApproveParams): CompletableFuture<BillApproveResponse> =
        approve(params, RequestOptions.none())

    /** @see [approve] */
    fun approve(
        params: BillApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillApproveResponse>

    /**
     * Retrieve the latest Bill for the given Account.
     *
     * This endpoint retrieves the latest Bill for the given Account in the specified Organization.
     * It facilitates tracking of the most recent charges and consumption details.
     */
    fun latestByAccount(accountId: String): CompletableFuture<BillResponse> =
        latestByAccount(accountId, BillLatestByAccountParams.none())

    /** @see [latestByAccount] */
    fun latestByAccount(
        accountId: String,
        params: BillLatestByAccountParams = BillLatestByAccountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillResponse> =
        latestByAccount(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see [latestByAccount] */
    fun latestByAccount(
        accountId: String,
        params: BillLatestByAccountParams = BillLatestByAccountParams.none(),
    ): CompletableFuture<BillResponse> = latestByAccount(accountId, params, RequestOptions.none())

    /** @see [latestByAccount] */
    fun latestByAccount(
        params: BillLatestByAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillResponse>

    /** @see [latestByAccount] */
    fun latestByAccount(params: BillLatestByAccountParams): CompletableFuture<BillResponse> =
        latestByAccount(params, RequestOptions.none())

    /** @see [latestByAccount] */
    fun latestByAccount(
        accountId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillResponse> =
        latestByAccount(accountId, BillLatestByAccountParams.none(), requestOptions)

    /**
     * Lock the specific Bill identified by the given UUID. Once a Bill is locked, no further
     * changes can be made to it.
     *
     * **NOTE:** You cannot lock a Bill whose current status is `PENDING`. You will receive an error
     * message if you try to do this. You must first use the
     * [Approve Bills](https://www.m3ter.com/docs/api#tag/Bill/operation/ApproveBills) call to
     * approve a Bill before you can lock it.
     */
    fun lock(id: String): CompletableFuture<BillResponse> = lock(id, BillLockParams.none())

    /** @see [lock] */
    fun lock(
        id: String,
        params: BillLockParams = BillLockParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillResponse> = lock(params.toBuilder().id(id).build(), requestOptions)

    /** @see [lock] */
    fun lock(
        id: String,
        params: BillLockParams = BillLockParams.none(),
    ): CompletableFuture<BillResponse> = lock(id, params, RequestOptions.none())

    /** @see [lock] */
    fun lock(
        params: BillLockParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillResponse>

    /** @see [lock] */
    fun lock(params: BillLockParams): CompletableFuture<BillResponse> =
        lock(params, RequestOptions.none())

    /** @see [lock] */
    fun lock(id: String, requestOptions: RequestOptions): CompletableFuture<BillResponse> =
        lock(id, BillLockParams.none(), requestOptions)

    /**
     * Search for Bill entities.
     *
     * This endpoint executes a search query for Bills based on the user specified search criteria.
     * The search query is customizable, allowing for complex nested conditions and sorting. The
     * returned list of Bills can be paginated for easier management.
     */
    fun search(): CompletableFuture<BillSearchResponse> = search(BillSearchParams.none())

    /** @see [search] */
    fun search(
        params: BillSearchParams = BillSearchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillSearchResponse>

    /** @see [search] */
    fun search(
        params: BillSearchParams = BillSearchParams.none()
    ): CompletableFuture<BillSearchResponse> = search(params, RequestOptions.none())

    /** @see [search] */
    fun search(requestOptions: RequestOptions): CompletableFuture<BillSearchResponse> =
        search(BillSearchParams.none(), requestOptions)

    /**
     * Updates the status of a specified Bill with the given Bill ID.
     *
     * This endpoint allows you to transition a Bill's status through various stages, such as from
     * "Pending" to "Approved".
     */
    fun updateStatus(id: String, params: BillUpdateStatusParams): CompletableFuture<BillResponse> =
        updateStatus(id, params, RequestOptions.none())

    /** @see [updateStatus] */
    fun updateStatus(
        id: String,
        params: BillUpdateStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillResponse> =
        updateStatus(params.toBuilder().id(id).build(), requestOptions)

    /** @see [updateStatus] */
    fun updateStatus(params: BillUpdateStatusParams): CompletableFuture<BillResponse> =
        updateStatus(params, RequestOptions.none())

    /** @see [updateStatus] */
    fun updateStatus(
        params: BillUpdateStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillResponse>

    /** A view of [BillServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BillServiceAsync.WithRawResponse

        fun creditLineItems(): CreditLineItemServiceAsync.WithRawResponse

        fun debitLineItems(): DebitLineItemServiceAsync.WithRawResponse

        fun lineItems(): LineItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/bills/{id}`, but is otherwise
         * the same as [BillServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<BillResponse>> =
            retrieve(id, BillRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: BillRetrieveParams = BillRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: BillRetrieveParams = BillRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<BillResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: BillRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillResponse>>

        /** @see [retrieve] */
        fun retrieve(params: BillRetrieveParams): CompletableFuture<HttpResponseFor<BillResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillResponse>> =
            retrieve(id, BillRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/bills`, but is otherwise the
         * same as [BillServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BillListPageAsync>> =
            list(BillListParams.none())

        /** @see [list] */
        fun list(
            params: BillListParams = BillListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillListPageAsync>>

        /** @see [list] */
        fun list(
            params: BillListParams = BillListParams.none()
        ): CompletableFuture<HttpResponseFor<BillListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BillListPageAsync>> =
            list(BillListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/bills/{id}`, but is
         * otherwise the same as [BillServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<BillResponse>> =
            delete(id, BillDeleteParams.none())

        /** @see [delete] */
        fun delete(
            id: String,
            params: BillDeleteParams = BillDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            id: String,
            params: BillDeleteParams = BillDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<BillResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: BillDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillResponse>>

        /** @see [delete] */
        fun delete(params: BillDeleteParams): CompletableFuture<HttpResponseFor<BillResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillResponse>> =
            delete(id, BillDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/bills/approve`, but is
         * otherwise the same as [BillServiceAsync.approve].
         */
        fun approve(
            params: BillApproveParams
        ): CompletableFuture<HttpResponseFor<BillApproveResponse>> =
            approve(params, RequestOptions.none())

        /** @see [approve] */
        fun approve(
            params: BillApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillApproveResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/bills/latest/{accountId}`,
         * but is otherwise the same as [BillServiceAsync.latestByAccount].
         */
        fun latestByAccount(accountId: String): CompletableFuture<HttpResponseFor<BillResponse>> =
            latestByAccount(accountId, BillLatestByAccountParams.none())

        /** @see [latestByAccount] */
        fun latestByAccount(
            accountId: String,
            params: BillLatestByAccountParams = BillLatestByAccountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillResponse>> =
            latestByAccount(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see [latestByAccount] */
        fun latestByAccount(
            accountId: String,
            params: BillLatestByAccountParams = BillLatestByAccountParams.none(),
        ): CompletableFuture<HttpResponseFor<BillResponse>> =
            latestByAccount(accountId, params, RequestOptions.none())

        /** @see [latestByAccount] */
        fun latestByAccount(
            params: BillLatestByAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillResponse>>

        /** @see [latestByAccount] */
        fun latestByAccount(
            params: BillLatestByAccountParams
        ): CompletableFuture<HttpResponseFor<BillResponse>> =
            latestByAccount(params, RequestOptions.none())

        /** @see [latestByAccount] */
        fun latestByAccount(
            accountId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillResponse>> =
            latestByAccount(accountId, BillLatestByAccountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/bills/{id}/lock`, but is
         * otherwise the same as [BillServiceAsync.lock].
         */
        fun lock(id: String): CompletableFuture<HttpResponseFor<BillResponse>> =
            lock(id, BillLockParams.none())

        /** @see [lock] */
        fun lock(
            id: String,
            params: BillLockParams = BillLockParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillResponse>> =
            lock(params.toBuilder().id(id).build(), requestOptions)

        /** @see [lock] */
        fun lock(
            id: String,
            params: BillLockParams = BillLockParams.none(),
        ): CompletableFuture<HttpResponseFor<BillResponse>> =
            lock(id, params, RequestOptions.none())

        /** @see [lock] */
        fun lock(
            params: BillLockParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillResponse>>

        /** @see [lock] */
        fun lock(params: BillLockParams): CompletableFuture<HttpResponseFor<BillResponse>> =
            lock(params, RequestOptions.none())

        /** @see [lock] */
        fun lock(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillResponse>> =
            lock(id, BillLockParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/bills/search`, but is
         * otherwise the same as [BillServiceAsync.search].
         */
        fun search(): CompletableFuture<HttpResponseFor<BillSearchResponse>> =
            search(BillSearchParams.none())

        /** @see [search] */
        fun search(
            params: BillSearchParams = BillSearchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillSearchResponse>>

        /** @see [search] */
        fun search(
            params: BillSearchParams = BillSearchParams.none()
        ): CompletableFuture<HttpResponseFor<BillSearchResponse>> =
            search(params, RequestOptions.none())

        /** @see [search] */
        fun search(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BillSearchResponse>> =
            search(BillSearchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/bills/{id}/status`, but is
         * otherwise the same as [BillServiceAsync.updateStatus].
         */
        fun updateStatus(
            id: String,
            params: BillUpdateStatusParams,
        ): CompletableFuture<HttpResponseFor<BillResponse>> =
            updateStatus(id, params, RequestOptions.none())

        /** @see [updateStatus] */
        fun updateStatus(
            id: String,
            params: BillUpdateStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillResponse>> =
            updateStatus(params.toBuilder().id(id).build(), requestOptions)

        /** @see [updateStatus] */
        fun updateStatus(
            params: BillUpdateStatusParams
        ): CompletableFuture<HttpResponseFor<BillResponse>> =
            updateStatus(params, RequestOptions.none())

        /** @see [updateStatus] */
        fun updateStatus(
            params: BillUpdateStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillResponse>>
    }
}
