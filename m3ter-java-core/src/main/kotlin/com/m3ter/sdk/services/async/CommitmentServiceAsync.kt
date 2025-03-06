// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.CommitmentCreateParams
import com.m3ter.sdk.models.CommitmentDeleteParams
import com.m3ter.sdk.models.CommitmentListPageAsync
import com.m3ter.sdk.models.CommitmentListParams
import com.m3ter.sdk.models.CommitmentResponse
import com.m3ter.sdk.models.CommitmentRetrieveParams
import com.m3ter.sdk.models.CommitmentSearchParams
import com.m3ter.sdk.models.CommitmentSearchResponse
import com.m3ter.sdk.models.CommitmentUpdateParams
import java.util.concurrent.CompletableFuture

interface CommitmentServiceAsync {

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
    @JvmOverloads
    fun create(
        params: CommitmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitmentResponse>

    /**
     * Retrieve a specific Commitment.
     *
     * Retrieve the details of the Commitment with the given UUID. It provides comprehensive
     * information about the Commitment, such as the agreed amount, overage surcharge percentage,
     * and other related details.
     */
    @JvmOverloads
    fun retrieve(
        params: CommitmentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitmentResponse>

    /**
     * Modify a specific Commitment.
     *
     * Update the details of the Commitment with the given UUID. Use this endpoint to adjust
     * Commitment parameters such as the fixed amount, overage surcharge percentage, or associated
     * contract details.
     */
    @JvmOverloads
    fun update(
        params: CommitmentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitmentResponse>

    /**
     * Retrieve a list of Commitments.
     *
     * Retrieves a list of all Commitments associated with an Organization. This endpoint supports
     * pagination and includes various query parameters to filter the Commitments based on Account,
     * Product, date, and end dates.
     */
    @JvmOverloads
    fun list(
        params: CommitmentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitmentListPageAsync>

    /**
     * Remove a specific Commitment.
     *
     * Deletes the Commitment with the given UUID. Use this endpoint when a Commitment is no longer
     * valid or needs to be removed from the system.
     */
    @JvmOverloads
    fun delete(
        params: CommitmentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitmentResponse>

    /**
     * Search for commitment entities.
     *
     * This endpoint executes a search query for Commitments based on the user specified search
     * criteria. The search query is customizable, allowing for complex nested conditions and
     * sorting. The returned list of Commitments can be paginated for easier management.
     */
    @JvmOverloads
    fun search(
        params: CommitmentSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitmentSearchResponse>

    /**
     * A view of [CommitmentServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/commitments`, but is
         * otherwise the same as [CommitmentServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: CommitmentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitmentResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/commitments/{id}`, but is
         * otherwise the same as [CommitmentServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: CommitmentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitmentResponse>>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/commitments/{id}`, but is
         * otherwise the same as [CommitmentServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: CommitmentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitmentResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/commitments`, but is
         * otherwise the same as [CommitmentServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: CommitmentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitmentListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/commitments/{id}`, but is
         * otherwise the same as [CommitmentServiceAsync.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: CommitmentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitmentResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/commitments/search`, but is
         * otherwise the same as [CommitmentServiceAsync.search].
         */
        @JvmOverloads
        @MustBeClosed
        fun search(
            params: CommitmentSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitmentSearchResponse>>
    }
}
