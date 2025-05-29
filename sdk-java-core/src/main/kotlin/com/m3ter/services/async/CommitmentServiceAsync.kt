// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.CommitmentCreateParams
import com.m3ter.models.CommitmentDeleteParams
import com.m3ter.models.CommitmentListPageAsync
import com.m3ter.models.CommitmentListParams
import com.m3ter.models.CommitmentResponse
import com.m3ter.models.CommitmentRetrieveParams
import com.m3ter.models.CommitmentSearchParams
import com.m3ter.models.CommitmentSearchResponse
import com.m3ter.models.CommitmentUpdateParams
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
    fun create(params: CommitmentCreateParams): CompletableFuture<CommitmentResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
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
    fun retrieve(id: String): CompletableFuture<CommitmentResponse> =
        retrieve(id, CommitmentRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: CommitmentRetrieveParams = CommitmentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitmentResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: CommitmentRetrieveParams = CommitmentRetrieveParams.none(),
    ): CompletableFuture<CommitmentResponse> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CommitmentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitmentResponse>

    /** @see [retrieve] */
    fun retrieve(params: CommitmentRetrieveParams): CompletableFuture<CommitmentResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommitmentResponse> =
        retrieve(id, CommitmentRetrieveParams.none(), requestOptions)

    /**
     * Modify a specific Commitment.
     *
     * Update the details of the Commitment with the given UUID. Use this endpoint to adjust
     * Commitment parameters such as the fixed amount, overage surcharge percentage, or associated
     * contract details.
     */
    fun update(id: String, params: CommitmentUpdateParams): CompletableFuture<CommitmentResponse> =
        update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: CommitmentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitmentResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(params: CommitmentUpdateParams): CompletableFuture<CommitmentResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
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
    fun list(): CompletableFuture<CommitmentListPageAsync> = list(CommitmentListParams.none())

    /** @see [list] */
    fun list(
        params: CommitmentListParams = CommitmentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitmentListPageAsync>

    /** @see [list] */
    fun list(
        params: CommitmentListParams = CommitmentListParams.none()
    ): CompletableFuture<CommitmentListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<CommitmentListPageAsync> =
        list(CommitmentListParams.none(), requestOptions)

    /**
     * Remove a specific Commitment.
     *
     * Deletes the Commitment with the given UUID. Use this endpoint when a Commitment is no longer
     * valid or needs to be removed from the system.
     */
    fun delete(id: String): CompletableFuture<CommitmentResponse> =
        delete(id, CommitmentDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: CommitmentDeleteParams = CommitmentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitmentResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: CommitmentDeleteParams = CommitmentDeleteParams.none(),
    ): CompletableFuture<CommitmentResponse> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: CommitmentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitmentResponse>

    /** @see [delete] */
    fun delete(params: CommitmentDeleteParams): CompletableFuture<CommitmentResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<CommitmentResponse> =
        delete(id, CommitmentDeleteParams.none(), requestOptions)

    /**
     * Search for commitment entities.
     *
     * This endpoint executes a search query for Commitments based on the user specified search
     * criteria. The search query is customizable, allowing for complex nested conditions and
     * sorting. The returned list of Commitments can be paginated for easier management.
     */
    fun search(): CompletableFuture<CommitmentSearchResponse> =
        search(CommitmentSearchParams.none())

    /** @see [search] */
    fun search(
        params: CommitmentSearchParams = CommitmentSearchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitmentSearchResponse>

    /** @see [search] */
    fun search(
        params: CommitmentSearchParams = CommitmentSearchParams.none()
    ): CompletableFuture<CommitmentSearchResponse> = search(params, RequestOptions.none())

    /** @see [search] */
    fun search(requestOptions: RequestOptions): CompletableFuture<CommitmentSearchResponse> =
        search(CommitmentSearchParams.none(), requestOptions)

    /**
     * A view of [CommitmentServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/commitments`, but is
         * otherwise the same as [CommitmentServiceAsync.create].
         */
        fun create(
            params: CommitmentCreateParams
        ): CompletableFuture<HttpResponseFor<CommitmentResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: CommitmentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitmentResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/commitments/{id}`, but is
         * otherwise the same as [CommitmentServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<CommitmentResponse>> =
            retrieve(id, CommitmentRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: CommitmentRetrieveParams = CommitmentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitmentResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: CommitmentRetrieveParams = CommitmentRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CommitmentResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: CommitmentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitmentResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: CommitmentRetrieveParams
        ): CompletableFuture<HttpResponseFor<CommitmentResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommitmentResponse>> =
            retrieve(id, CommitmentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/commitments/{id}`, but is
         * otherwise the same as [CommitmentServiceAsync.update].
         */
        fun update(
            id: String,
            params: CommitmentUpdateParams,
        ): CompletableFuture<HttpResponseFor<CommitmentResponse>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            id: String,
            params: CommitmentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitmentResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        fun update(
            params: CommitmentUpdateParams
        ): CompletableFuture<HttpResponseFor<CommitmentResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: CommitmentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitmentResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/commitments`, but is
         * otherwise the same as [CommitmentServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CommitmentListPageAsync>> =
            list(CommitmentListParams.none())

        /** @see [list] */
        fun list(
            params: CommitmentListParams = CommitmentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitmentListPageAsync>>

        /** @see [list] */
        fun list(
            params: CommitmentListParams = CommitmentListParams.none()
        ): CompletableFuture<HttpResponseFor<CommitmentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CommitmentListPageAsync>> =
            list(CommitmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/commitments/{id}`, but is
         * otherwise the same as [CommitmentServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<CommitmentResponse>> =
            delete(id, CommitmentDeleteParams.none())

        /** @see [delete] */
        fun delete(
            id: String,
            params: CommitmentDeleteParams = CommitmentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitmentResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            id: String,
            params: CommitmentDeleteParams = CommitmentDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<CommitmentResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: CommitmentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitmentResponse>>

        /** @see [delete] */
        fun delete(
            params: CommitmentDeleteParams
        ): CompletableFuture<HttpResponseFor<CommitmentResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommitmentResponse>> =
            delete(id, CommitmentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/commitments/search`, but is
         * otherwise the same as [CommitmentServiceAsync.search].
         */
        fun search(): CompletableFuture<HttpResponseFor<CommitmentSearchResponse>> =
            search(CommitmentSearchParams.none())

        /** @see [search] */
        fun search(
            params: CommitmentSearchParams = CommitmentSearchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitmentSearchResponse>>

        /** @see [search] */
        fun search(
            params: CommitmentSearchParams = CommitmentSearchParams.none()
        ): CompletableFuture<HttpResponseFor<CommitmentSearchResponse>> =
            search(params, RequestOptions.none())

        /** @see [search] */
        fun search(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CommitmentSearchResponse>> =
            search(CommitmentSearchParams.none(), requestOptions)
    }
}
