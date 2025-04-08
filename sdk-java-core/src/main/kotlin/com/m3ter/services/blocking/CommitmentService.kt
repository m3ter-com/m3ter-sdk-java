// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.CommitmentCreateParams
import com.m3ter.models.CommitmentDeleteParams
import com.m3ter.models.CommitmentListPage
import com.m3ter.models.CommitmentListParams
import com.m3ter.models.CommitmentResponse
import com.m3ter.models.CommitmentRetrieveParams
import com.m3ter.models.CommitmentSearchParams
import com.m3ter.models.CommitmentSearchResponse
import com.m3ter.models.CommitmentUpdateParams

interface CommitmentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new Commitment.
     *
     * Creates a new Commitment for an Organization. The request body must include all the necessary
     * details such as the agreed amount, overage surcharge percentage, and the associated account
     * and product details.
     *
     * **Note:** If some of the agreed Commitment amount remains unpaid at the start of an
     * end-customer contract period, when you create a Commitment for an Account you can set up
     * billing for the outstanding amount in one of two ways:
     * - Select a Product _Plan to bill with_. Use the `billingPlanId` request parameter to select
     *   the Plan used for billing.
     * - Define a _schedule of billing dates_. Omit a `billingPlanId` and use the `feeDates` request
     *   parameter to define a precise schedule of bill dates and amounts.
     */
    fun create(params: CommitmentCreateParams): CommitmentResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CommitmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommitmentResponse

    /**
     * Retrieve a specific Commitment.
     *
     * Retrieve the details of the Commitment with the given UUID. It provides comprehensive
     * information about the Commitment, such as the agreed amount, overage surcharge percentage,
     * and other related details.
     */
    fun retrieve(params: CommitmentRetrieveParams): CommitmentResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CommitmentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommitmentResponse

    /**
     * Modify a specific Commitment.
     *
     * Update the details of the Commitment with the given UUID. Use this endpoint to adjust
     * Commitment parameters such as the fixed amount, overage surcharge percentage, or associated
     * contract details.
     */
    fun update(params: CommitmentUpdateParams): CommitmentResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: CommitmentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommitmentResponse

    /**
     * Retrieve a list of Commitments.
     *
     * Retrieves a list of all Commitments associated with an Organization. This endpoint supports
     * pagination and includes various query parameters to filter the Commitments based on Account,
     * Product, date, and end dates.
     */
    fun list(): CommitmentListPage = list(CommitmentListParams.none())

    /** @see [list] */
    fun list(
        params: CommitmentListParams = CommitmentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommitmentListPage

    /** @see [list] */
    fun list(params: CommitmentListParams = CommitmentListParams.none()): CommitmentListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CommitmentListPage =
        list(CommitmentListParams.none(), requestOptions)

    /**
     * Remove a specific Commitment.
     *
     * Deletes the Commitment with the given UUID. Use this endpoint when a Commitment is no longer
     * valid or needs to be removed from the system.
     */
    fun delete(params: CommitmentDeleteParams): CommitmentResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: CommitmentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommitmentResponse

    /**
     * Search for commitment entities.
     *
     * This endpoint executes a search query for Commitments based on the user specified search
     * criteria. The search query is customizable, allowing for complex nested conditions and
     * sorting. The returned list of Commitments can be paginated for easier management.
     */
    fun search(): CommitmentSearchResponse = search(CommitmentSearchParams.none())

    /** @see [search] */
    fun search(
        params: CommitmentSearchParams = CommitmentSearchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommitmentSearchResponse

    /** @see [search] */
    fun search(
        params: CommitmentSearchParams = CommitmentSearchParams.none()
    ): CommitmentSearchResponse = search(params, RequestOptions.none())

    /** @see [search] */
    fun search(requestOptions: RequestOptions): CommitmentSearchResponse =
        search(CommitmentSearchParams.none(), requestOptions)

    /** A view of [CommitmentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/commitments`, but is
         * otherwise the same as [CommitmentService.create].
         */
        @MustBeClosed
        fun create(params: CommitmentCreateParams): HttpResponseFor<CommitmentResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CommitmentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommitmentResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/commitments/{id}`, but is
         * otherwise the same as [CommitmentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: CommitmentRetrieveParams): HttpResponseFor<CommitmentResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CommitmentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommitmentResponse>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/commitments/{id}`, but is
         * otherwise the same as [CommitmentService.update].
         */
        @MustBeClosed
        fun update(params: CommitmentUpdateParams): HttpResponseFor<CommitmentResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: CommitmentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommitmentResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/commitments`, but is
         * otherwise the same as [CommitmentService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CommitmentListPage> = list(CommitmentListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CommitmentListParams = CommitmentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommitmentListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CommitmentListParams = CommitmentListParams.none()
        ): HttpResponseFor<CommitmentListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CommitmentListPage> =
            list(CommitmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/commitments/{id}`, but is
         * otherwise the same as [CommitmentService.delete].
         */
        @MustBeClosed
        fun delete(params: CommitmentDeleteParams): HttpResponseFor<CommitmentResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: CommitmentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommitmentResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/commitments/search`, but is
         * otherwise the same as [CommitmentService.search].
         */
        @MustBeClosed
        fun search(): HttpResponseFor<CommitmentSearchResponse> =
            search(CommitmentSearchParams.none())

        /** @see [search] */
        @MustBeClosed
        fun search(
            params: CommitmentSearchParams = CommitmentSearchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommitmentSearchResponse>

        /** @see [search] */
        @MustBeClosed
        fun search(
            params: CommitmentSearchParams = CommitmentSearchParams.none()
        ): HttpResponseFor<CommitmentSearchResponse> = search(params, RequestOptions.none())

        /** @see [search] */
        @MustBeClosed
        fun search(requestOptions: RequestOptions): HttpResponseFor<CommitmentSearchResponse> =
            search(CommitmentSearchParams.none(), requestOptions)
    }
}
