// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.BillJob
import com.m3ter.sdk.models.BillJobCancelParams
import com.m3ter.sdk.models.BillJobCreateParams
import com.m3ter.sdk.models.BillJobListPage
import com.m3ter.sdk.models.BillJobListParams
import com.m3ter.sdk.models.BillJobRecalculateParams
import com.m3ter.sdk.models.BillJobRetrieveParams

interface BillJobService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new BillJob to handle asynchronous bill calculations for a specific Organization.
     *
     * This operation allows you to initiate the processing of bills according to specified
     * parameters. For example, create a BillJob to run only those bills where `billingFrequency` is
     * `MONTHLY`. Note that if you want to run a BillJob for all billing frequencies, simply omit
     * the `billingFrequency` request parameter.
     *
     * Once created, the BillJob's progress can be monitored:
     * - In the Running Tasks panel in the m3ter Console - for more details, see
     *   [Running Bills Manually](https://www.m3ter.com/docs/guides/billing-and-usage-data/running-viewing-and-managing-bills/running-bills-and-viewing-bill-details#running-bills-manually)
     * - Queried using the
     *   [List BillJobs](https://www.m3ter.com/docs/api#tag/BillJob/operation/ListBillJobs)
     *   operation.
     *
     * **NOTES:**
     * - **Consolidated bills**. If you've already run billing with the Consolidate bills option
     *   disabled for your Organization but you then enable it, subsequent Bills for specific bill
     *   dates will now start afresh and not update earlier non-consolidated Bills for the same bill
     *   date. To avoid any billing conflicts, you might want to archive these earlier versions or
     *   delete them entirely.
     * - **Maximum concurrent BillJobs**. If you already have 10 BillJobs currently running, and try
     *   to create another one, you'll get an HTTP 429 response (Too many requests). When one of the
     *   existing BillJobs has completed, you'll be able to submit another job
     */
    @JvmOverloads
    fun create(
        params: BillJobCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillJob

    /** Retrieve a Bill Job for the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: BillJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillJob

    /**
     * Retrieve a list of BillJobs.
     *
     * This endpoint retrieves a list of BillJobs for a specified organization. The list can be
     * paginated for easier management, and allows you to query and filter based on various
     * parameters, such as BillJob `status` and whether or not BillJob remains `active`.
     */
    @JvmOverloads
    fun list(
        params: BillJobListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillJobListPage

    /**
     * Cancel an ongoing BillJob for the given Organization and BillJob UUID.
     *
     * This endpoint allows you to halt the processing of a specific BillJob, which might be
     * necessary if there are changes in billing requirements or other operational considerations.
     */
    @JvmOverloads
    fun cancel(
        params: BillJobCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillJob

    /**
     * Create a new BillJob specifically to recalculate existing bills for a given Organization.
     *
     * This operation is essential when adjustments or corrections are required in previously
     * calculated bills. The recalculated bills when the BillJob is complete can be checked in the
     * m3ter Console Bill Management page or queried by using the
     * [List Bills](https://www.m3ter.com/docs/api#tag/Bill/operation/ListBills) operation.
     *
     * **NOTE:**
     * - **Response Schema**. The response schema for this call is dynamic. This means that the
     *   response might not contain all of the parameters listed. If set to null,the parameter is
     *   hidden to help simplify the output as well as to reduce its size and improve performance.
     */
    @JvmOverloads
    fun recalculate(
        params: BillJobRecalculateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillJob

    /** A view of [BillJobService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/billjobs`, but is otherwise
         * the same as [BillJobService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: BillJobCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillJob>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/billjobs/{id}`, but is
         * otherwise the same as [BillJobService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: BillJobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillJob>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/billjobs`, but is otherwise
         * the same as [BillJobService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: BillJobListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillJobListPage>

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/billjobs/{id}/cancel`, but
         * is otherwise the same as [BillJobService.cancel].
         */
        @JvmOverloads
        @MustBeClosed
        fun cancel(
            params: BillJobCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillJob>

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/billjobs/recalculate`, but
         * is otherwise the same as [BillJobService.recalculate].
         */
        @JvmOverloads
        @MustBeClosed
        fun recalculate(
            params: BillJobRecalculateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillJob>
    }
}
