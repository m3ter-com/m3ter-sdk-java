// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.BillJobCancelParams
import com.m3ter.models.BillJobCreateParams
import com.m3ter.models.BillJobListPage
import com.m3ter.models.BillJobListParams
import com.m3ter.models.BillJobRecalculateParams
import com.m3ter.models.BillJobResponse
import com.m3ter.models.BillJobRetrieveParams

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
    fun create(): BillJobResponse = create(BillJobCreateParams.none())

    /** @see [create] */
    fun create(
        params: BillJobCreateParams = BillJobCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillJobResponse

    /** @see [create] */
    fun create(params: BillJobCreateParams = BillJobCreateParams.none()): BillJobResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): BillJobResponse =
        create(BillJobCreateParams.none(), requestOptions)

    /** Retrieve a Bill Job for the given UUID. */
    fun retrieve(id: String): BillJobResponse = retrieve(id, BillJobRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: BillJobRetrieveParams = BillJobRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillJobResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: BillJobRetrieveParams = BillJobRetrieveParams.none(),
    ): BillJobResponse = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BillJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillJobResponse

    /** @see [retrieve] */
    fun retrieve(params: BillJobRetrieveParams): BillJobResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): BillJobResponse =
        retrieve(id, BillJobRetrieveParams.none(), requestOptions)

    /**
     * Retrieve a list of BillJobs.
     *
     * This endpoint retrieves a list of BillJobs for a specified organization. The list can be
     * paginated for easier management, and allows you to query and filter based on various
     * parameters, such as BillJob `status` and whether or not BillJob remains `active`.
     */
    fun list(): BillJobListPage = list(BillJobListParams.none())

    /** @see [list] */
    fun list(
        params: BillJobListParams = BillJobListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillJobListPage

    /** @see [list] */
    fun list(params: BillJobListParams = BillJobListParams.none()): BillJobListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): BillJobListPage =
        list(BillJobListParams.none(), requestOptions)

    /**
     * Cancel an ongoing BillJob for the given Organization and BillJob UUID.
     *
     * This endpoint allows you to halt the processing of a specific BillJob, which might be
     * necessary if there are changes in billing requirements or other operational considerations.
     */
    fun cancel(id: String): BillJobResponse = cancel(id, BillJobCancelParams.none())

    /** @see [cancel] */
    fun cancel(
        id: String,
        params: BillJobCancelParams = BillJobCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillJobResponse = cancel(params.toBuilder().id(id).build(), requestOptions)

    /** @see [cancel] */
    fun cancel(
        id: String,
        params: BillJobCancelParams = BillJobCancelParams.none(),
    ): BillJobResponse = cancel(id, params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(
        params: BillJobCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillJobResponse

    /** @see [cancel] */
    fun cancel(params: BillJobCancelParams): BillJobResponse = cancel(params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(id: String, requestOptions: RequestOptions): BillJobResponse =
        cancel(id, BillJobCancelParams.none(), requestOptions)

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
    fun recalculate(params: BillJobRecalculateParams): BillJobResponse =
        recalculate(params, RequestOptions.none())

    /** @see [recalculate] */
    fun recalculate(
        params: BillJobRecalculateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillJobResponse

    /** A view of [BillJobService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/billjobs`, but is otherwise
         * the same as [BillJobService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<BillJobResponse> = create(BillJobCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: BillJobCreateParams = BillJobCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillJobResponse>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: BillJobCreateParams = BillJobCreateParams.none()
        ): HttpResponseFor<BillJobResponse> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<BillJobResponse> =
            create(BillJobCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/billjobs/{id}`, but is
         * otherwise the same as [BillJobService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<BillJobResponse> =
            retrieve(id, BillJobRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BillJobRetrieveParams = BillJobRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillJobResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BillJobRetrieveParams = BillJobRetrieveParams.none(),
        ): HttpResponseFor<BillJobResponse> = retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BillJobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillJobResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: BillJobRetrieveParams): HttpResponseFor<BillJobResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<BillJobResponse> =
            retrieve(id, BillJobRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/billjobs`, but is otherwise
         * the same as [BillJobService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<BillJobListPage> = list(BillJobListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BillJobListParams = BillJobListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillJobListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BillJobListParams = BillJobListParams.none()
        ): HttpResponseFor<BillJobListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BillJobListPage> =
            list(BillJobListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/billjobs/{id}/cancel`, but
         * is otherwise the same as [BillJobService.cancel].
         */
        @MustBeClosed
        fun cancel(id: String): HttpResponseFor<BillJobResponse> =
            cancel(id, BillJobCancelParams.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            id: String,
            params: BillJobCancelParams = BillJobCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillJobResponse> =
            cancel(params.toBuilder().id(id).build(), requestOptions)

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            id: String,
            params: BillJobCancelParams = BillJobCancelParams.none(),
        ): HttpResponseFor<BillJobResponse> = cancel(id, params, RequestOptions.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            params: BillJobCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillJobResponse>

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(params: BillJobCancelParams): HttpResponseFor<BillJobResponse> =
            cancel(params, RequestOptions.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(id: String, requestOptions: RequestOptions): HttpResponseFor<BillJobResponse> =
            cancel(id, BillJobCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/billjobs/recalculate`, but
         * is otherwise the same as [BillJobService.recalculate].
         */
        @MustBeClosed
        fun recalculate(params: BillJobRecalculateParams): HttpResponseFor<BillJobResponse> =
            recalculate(params, RequestOptions.none())

        /** @see [recalculate] */
        @MustBeClosed
        fun recalculate(
            params: BillJobRecalculateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillJobResponse>
    }
}
