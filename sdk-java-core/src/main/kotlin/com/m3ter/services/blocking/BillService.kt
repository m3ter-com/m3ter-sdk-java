// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.BillApproveParams
import com.m3ter.models.BillApproveResponse
import com.m3ter.models.BillDeleteParams
import com.m3ter.models.BillLatestByAccountParams
import com.m3ter.models.BillListPage
import com.m3ter.models.BillListParams
import com.m3ter.models.BillLockParams
import com.m3ter.models.BillResponse
import com.m3ter.models.BillRetrieveParams
import com.m3ter.models.BillSearchParams
import com.m3ter.models.BillSearchResponse
import com.m3ter.models.BillUpdateStatusParams
import com.m3ter.services.blocking.bills.CreditLineItemService
import com.m3ter.services.blocking.bills.DebitLineItemService
import com.m3ter.services.blocking.bills.LineItemService

interface BillService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun creditLineItems(): CreditLineItemService

    fun debitLineItems(): DebitLineItemService

    fun lineItems(): LineItemService

    /**
     * Retrieve the Bill with the given UUID.
     *
     * This endpoint retrieves the Bill with the given unique identifier (UUID) and specific
     * Organization.
     */
    fun retrieve(id: String): BillResponse = retrieve(id, BillRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: BillRetrieveParams = BillRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(id: String, params: BillRetrieveParams = BillRetrieveParams.none()): BillResponse =
        retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BillRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillResponse

    /** @see [retrieve] */
    fun retrieve(params: BillRetrieveParams): BillResponse = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): BillResponse =
        retrieve(id, BillRetrieveParams.none(), requestOptions)

    /**
     * Retrieve a list of Bills.
     *
     * This endpoint retrieves a list of all Bills for the given Account within the specified
     * Organization. Optional filters can be applied such as by date range, lock status, or other
     * attributes. The list can also be paginated for easier management.
     */
    fun list(): BillListPage = list(BillListParams.none())

    /** @see [list] */
    fun list(
        params: BillListParams = BillListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillListPage

    /** @see [list] */
    fun list(params: BillListParams = BillListParams.none()): BillListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): BillListPage =
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
    fun delete(id: String): BillResponse = delete(id, BillDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: BillDeleteParams = BillDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(id: String, params: BillDeleteParams = BillDeleteParams.none()): BillResponse =
        delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: BillDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillResponse

    /** @see [delete] */
    fun delete(params: BillDeleteParams): BillResponse = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): BillResponse =
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
    fun approve(params: BillApproveParams): BillApproveResponse =
        approve(params, RequestOptions.none())

    /** @see [approve] */
    fun approve(
        params: BillApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillApproveResponse

    /**
     * Retrieve the latest Bill for the given Account.
     *
     * This endpoint retrieves the latest Bill for the given Account in the specified Organization.
     * It facilitates tracking of the most recent charges and consumption details.
     */
    fun latestByAccount(accountId: String): BillResponse =
        latestByAccount(accountId, BillLatestByAccountParams.none())

    /** @see [latestByAccount] */
    fun latestByAccount(
        accountId: String,
        params: BillLatestByAccountParams = BillLatestByAccountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillResponse =
        latestByAccount(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see [latestByAccount] */
    fun latestByAccount(
        accountId: String,
        params: BillLatestByAccountParams = BillLatestByAccountParams.none(),
    ): BillResponse = latestByAccount(accountId, params, RequestOptions.none())

    /** @see [latestByAccount] */
    fun latestByAccount(
        params: BillLatestByAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillResponse

    /** @see [latestByAccount] */
    fun latestByAccount(params: BillLatestByAccountParams): BillResponse =
        latestByAccount(params, RequestOptions.none())

    /** @see [latestByAccount] */
    fun latestByAccount(accountId: String, requestOptions: RequestOptions): BillResponse =
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
    fun lock(id: String): BillResponse = lock(id, BillLockParams.none())

    /** @see [lock] */
    fun lock(
        id: String,
        params: BillLockParams = BillLockParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillResponse = lock(params.toBuilder().id(id).build(), requestOptions)

    /** @see [lock] */
    fun lock(id: String, params: BillLockParams = BillLockParams.none()): BillResponse =
        lock(id, params, RequestOptions.none())

    /** @see [lock] */
    fun lock(
        params: BillLockParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillResponse

    /** @see [lock] */
    fun lock(params: BillLockParams): BillResponse = lock(params, RequestOptions.none())

    /** @see [lock] */
    fun lock(id: String, requestOptions: RequestOptions): BillResponse =
        lock(id, BillLockParams.none(), requestOptions)

    /**
     * Search for Bill entities.
     *
     * This endpoint executes a search query for Bills based on the user specified search criteria.
     * The search query is customizable, allowing for complex nested conditions and sorting. The
     * returned list of Bills can be paginated for easier management.
     */
    fun search(): BillSearchResponse = search(BillSearchParams.none())

    /** @see [search] */
    fun search(
        params: BillSearchParams = BillSearchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillSearchResponse

    /** @see [search] */
    fun search(params: BillSearchParams = BillSearchParams.none()): BillSearchResponse =
        search(params, RequestOptions.none())

    /** @see [search] */
    fun search(requestOptions: RequestOptions): BillSearchResponse =
        search(BillSearchParams.none(), requestOptions)

    /**
     * Updates the status of a specified Bill with the given Bill ID.
     *
     * This endpoint allows you to transition a Bill's status through various stages, such as from
     * "Pending" to "Approved".
     */
    fun updateStatus(id: String, params: BillUpdateStatusParams): BillResponse =
        updateStatus(id, params, RequestOptions.none())

    /** @see [updateStatus] */
    fun updateStatus(
        id: String,
        params: BillUpdateStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillResponse = updateStatus(params.toBuilder().id(id).build(), requestOptions)

    /** @see [updateStatus] */
    fun updateStatus(params: BillUpdateStatusParams): BillResponse =
        updateStatus(params, RequestOptions.none())

    /** @see [updateStatus] */
    fun updateStatus(
        params: BillUpdateStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillResponse

    /** A view of [BillService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun creditLineItems(): CreditLineItemService.WithRawResponse

        fun debitLineItems(): DebitLineItemService.WithRawResponse

        fun lineItems(): LineItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/bills/{id}`, but is otherwise
         * the same as [BillService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<BillResponse> =
            retrieve(id, BillRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BillRetrieveParams = BillRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BillRetrieveParams = BillRetrieveParams.none(),
        ): HttpResponseFor<BillResponse> = retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BillRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: BillRetrieveParams): HttpResponseFor<BillResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<BillResponse> =
            retrieve(id, BillRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/bills`, but is otherwise the
         * same as [BillService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<BillListPage> = list(BillListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BillListParams = BillListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(params: BillListParams = BillListParams.none()): HttpResponseFor<BillListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BillListPage> =
            list(BillListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/bills/{id}`, but is
         * otherwise the same as [BillService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<BillResponse> = delete(id, BillDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: BillDeleteParams = BillDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillResponse> = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: BillDeleteParams = BillDeleteParams.none(),
        ): HttpResponseFor<BillResponse> = delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: BillDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: BillDeleteParams): HttpResponseFor<BillResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponseFor<BillResponse> =
            delete(id, BillDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/bills/approve`, but is
         * otherwise the same as [BillService.approve].
         */
        @MustBeClosed
        fun approve(params: BillApproveParams): HttpResponseFor<BillApproveResponse> =
            approve(params, RequestOptions.none())

        /** @see [approve] */
        @MustBeClosed
        fun approve(
            params: BillApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillApproveResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/bills/latest/{accountId}`,
         * but is otherwise the same as [BillService.latestByAccount].
         */
        @MustBeClosed
        fun latestByAccount(accountId: String): HttpResponseFor<BillResponse> =
            latestByAccount(accountId, BillLatestByAccountParams.none())

        /** @see [latestByAccount] */
        @MustBeClosed
        fun latestByAccount(
            accountId: String,
            params: BillLatestByAccountParams = BillLatestByAccountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillResponse> =
            latestByAccount(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see [latestByAccount] */
        @MustBeClosed
        fun latestByAccount(
            accountId: String,
            params: BillLatestByAccountParams = BillLatestByAccountParams.none(),
        ): HttpResponseFor<BillResponse> = latestByAccount(accountId, params, RequestOptions.none())

        /** @see [latestByAccount] */
        @MustBeClosed
        fun latestByAccount(
            params: BillLatestByAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillResponse>

        /** @see [latestByAccount] */
        @MustBeClosed
        fun latestByAccount(params: BillLatestByAccountParams): HttpResponseFor<BillResponse> =
            latestByAccount(params, RequestOptions.none())

        /** @see [latestByAccount] */
        @MustBeClosed
        fun latestByAccount(
            accountId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillResponse> =
            latestByAccount(accountId, BillLatestByAccountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/bills/{id}/lock`, but is
         * otherwise the same as [BillService.lock].
         */
        @MustBeClosed
        fun lock(id: String): HttpResponseFor<BillResponse> = lock(id, BillLockParams.none())

        /** @see [lock] */
        @MustBeClosed
        fun lock(
            id: String,
            params: BillLockParams = BillLockParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillResponse> = lock(params.toBuilder().id(id).build(), requestOptions)

        /** @see [lock] */
        @MustBeClosed
        fun lock(
            id: String,
            params: BillLockParams = BillLockParams.none(),
        ): HttpResponseFor<BillResponse> = lock(id, params, RequestOptions.none())

        /** @see [lock] */
        @MustBeClosed
        fun lock(
            params: BillLockParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillResponse>

        /** @see [lock] */
        @MustBeClosed
        fun lock(params: BillLockParams): HttpResponseFor<BillResponse> =
            lock(params, RequestOptions.none())

        /** @see [lock] */
        @MustBeClosed
        fun lock(id: String, requestOptions: RequestOptions): HttpResponseFor<BillResponse> =
            lock(id, BillLockParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/bills/search`, but is
         * otherwise the same as [BillService.search].
         */
        @MustBeClosed
        fun search(): HttpResponseFor<BillSearchResponse> = search(BillSearchParams.none())

        /** @see [search] */
        @MustBeClosed
        fun search(
            params: BillSearchParams = BillSearchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillSearchResponse>

        /** @see [search] */
        @MustBeClosed
        fun search(
            params: BillSearchParams = BillSearchParams.none()
        ): HttpResponseFor<BillSearchResponse> = search(params, RequestOptions.none())

        /** @see [search] */
        @MustBeClosed
        fun search(requestOptions: RequestOptions): HttpResponseFor<BillSearchResponse> =
            search(BillSearchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/bills/{id}/status`, but is
         * otherwise the same as [BillService.updateStatus].
         */
        @MustBeClosed
        fun updateStatus(
            id: String,
            params: BillUpdateStatusParams,
        ): HttpResponseFor<BillResponse> = updateStatus(id, params, RequestOptions.none())

        /** @see [updateStatus] */
        @MustBeClosed
        fun updateStatus(
            id: String,
            params: BillUpdateStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillResponse> =
            updateStatus(params.toBuilder().id(id).build(), requestOptions)

        /** @see [updateStatus] */
        @MustBeClosed
        fun updateStatus(params: BillUpdateStatusParams): HttpResponseFor<BillResponse> =
            updateStatus(params, RequestOptions.none())

        /** @see [updateStatus] */
        @MustBeClosed
        fun updateStatus(
            params: BillUpdateStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillResponse>
    }
}
