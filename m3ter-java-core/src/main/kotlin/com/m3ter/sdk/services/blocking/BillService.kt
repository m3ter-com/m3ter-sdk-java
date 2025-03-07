// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.BillApproveParams
import com.m3ter.sdk.models.BillApproveResponse
import com.m3ter.sdk.models.BillDeleteParams
import com.m3ter.sdk.models.BillLatestByAccountParams
import com.m3ter.sdk.models.BillListPage
import com.m3ter.sdk.models.BillListParams
import com.m3ter.sdk.models.BillLockParams
import com.m3ter.sdk.models.BillResponse
import com.m3ter.sdk.models.BillRetrieveParams
import com.m3ter.sdk.models.BillSearchParams
import com.m3ter.sdk.models.BillSearchResponse
import com.m3ter.sdk.models.BillUpdateStatusParams
import com.m3ter.sdk.services.blocking.bills.CreditLineItemService
import com.m3ter.sdk.services.blocking.bills.DebitLineItemService
import com.m3ter.sdk.services.blocking.bills.LineItemService

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
    @JvmOverloads
    fun retrieve(
        params: BillRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillResponse

    /**
     * Retrieve a list of Bills.
     *
     * This endpoint retrieves a list of all Bills for the given Account within the specified
     * Organization. Optional filters can be applied such as by date range, lock status, or other
     * attributes. The list can also be paginated for easier management.
     */
    @JvmOverloads
    fun list(
        params: BillListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillListPage

    /**
     * Delete the Bill with the given UUID.
     *
     * This endpoint deletes the specified Bill with the given unique identifier. Use with caution
     * since deleted Bills cannot be recovered. Suitable for removing incorrect or obsolete Bills,
     * and for Bills that have not been sent to customers. Where end-customer invoices for Bills
     * have been sent to customers, Bills should not be deleted to ensure you have an audit trail of
     * how the invoice was created.
     */
    @JvmOverloads
    fun delete(
        params: BillDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillResponse

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
    @JvmOverloads
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
    @JvmOverloads
    fun latestByAccount(
        params: BillLatestByAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillResponse

    /**
     * Lock the specific Bill identified by the given UUID. Once a Bill is locked, no further
     * changes can be made to it.
     *
     * **NOTE:** You cannot lock a Bill whose current status is `PENDING`. You will receive an error
     * message if you try to do this. You must first use the
     * [Approve Bills](https://www.m3ter.com/docs/api#tag/Bill/operation/ApproveBills) call to
     * approve a Bill before you can lock it.
     */
    @JvmOverloads
    fun lock(
        params: BillLockParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillResponse

    /**
     * Search for Bill entities.
     *
     * This endpoint executes a search query for Bills based on the user specified search criteria.
     * The search query is customizable, allowing for complex nested conditions and sorting. The
     * returned list of Bills can be paginated for easier management.
     */
    @JvmOverloads
    fun search(
        params: BillSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillSearchResponse

    /**
     * Updates the status of a specified Bill with the given Bill ID.
     *
     * This endpoint allows you to transition a Bill's status through various stages, such as from
     * "Pending" to "Approved".
     */
    @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: BillRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/bills`, but is otherwise the
         * same as [BillService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: BillListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillListPage>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/bills/{id}`, but is
         * otherwise the same as [BillService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: BillDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillResponse>

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/bills/approve`, but is
         * otherwise the same as [BillService.approve].
         */
        @JvmOverloads
        @MustBeClosed
        fun approve(
            params: BillApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillApproveResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/bills/latest/{accountId}`,
         * but is otherwise the same as [BillService.latestByAccount].
         */
        @JvmOverloads
        @MustBeClosed
        fun latestByAccount(
            params: BillLatestByAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillResponse>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/bills/{id}/lock`, but is
         * otherwise the same as [BillService.lock].
         */
        @JvmOverloads
        @MustBeClosed
        fun lock(
            params: BillLockParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/bills/search`, but is
         * otherwise the same as [BillService.search].
         */
        @JvmOverloads
        @MustBeClosed
        fun search(
            params: BillSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillSearchResponse>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/bills/{id}/status`, but is
         * otherwise the same as [BillService.updateStatus].
         */
        @JvmOverloads
        @MustBeClosed
        fun updateStatus(
            params: BillUpdateStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillResponse>
    }
}
