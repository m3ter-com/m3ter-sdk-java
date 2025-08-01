// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.CounterAdjustmentCreateParams
import com.m3ter.models.CounterAdjustmentDeleteParams
import com.m3ter.models.CounterAdjustmentListPage
import com.m3ter.models.CounterAdjustmentListParams
import com.m3ter.models.CounterAdjustmentResponse
import com.m3ter.models.CounterAdjustmentRetrieveParams
import com.m3ter.models.CounterAdjustmentUpdateParams
import java.util.function.Consumer

interface CounterAdjustmentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CounterAdjustmentService

    /**
     * Create a new CounterAdjustment for an Account using a Counter.
     *
     * **Notes:**
     * - Use the new absolute value for the Counter for the selected date - if it was 15 and has
     *   increased to 20, enter 20; if it was 15 and has decreased to 10, enter 10. _Do not enter_
     *   the plus or minus value relative to the previous Counter value on the Account.
     * - CounterAdjustments on Accounts are supported down to a _specific day_ of granularity - you
     *   cannot create more than one CounterAdjustment for any given day using the same Counter and
     *   you'll receive an error if you try to do this.
     */
    fun create(params: CounterAdjustmentCreateParams): CounterAdjustmentResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CounterAdjustmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterAdjustmentResponse

    /** Retrieve a CounterAdjustment for the given UUID. */
    fun retrieve(id: String): CounterAdjustmentResponse =
        retrieve(id, CounterAdjustmentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CounterAdjustmentRetrieveParams = CounterAdjustmentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterAdjustmentResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CounterAdjustmentRetrieveParams = CounterAdjustmentRetrieveParams.none(),
    ): CounterAdjustmentResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CounterAdjustmentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterAdjustmentResponse

    /** @see retrieve */
    fun retrieve(params: CounterAdjustmentRetrieveParams): CounterAdjustmentResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CounterAdjustmentResponse =
        retrieve(id, CounterAdjustmentRetrieveParams.none(), requestOptions)

    /** Update a CounterAdjustment for an Account. */
    fun update(id: String, params: CounterAdjustmentUpdateParams): CounterAdjustmentResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: CounterAdjustmentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterAdjustmentResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: CounterAdjustmentUpdateParams): CounterAdjustmentResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CounterAdjustmentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterAdjustmentResponse

    /**
     * Retrieve a list of CounterAdjustments created for Accounts in your Organization. You can
     * filter the list returned by date, Account ID, or Counter ID.
     *
     * **CONSTRAINTS:**
     * - The `counterId` query parameter is always required when calling this endpoint, used either
     *   as a single query parameter or in combination with any of the other query parameters.
     * - If you want to use the `date`, `dateStart`, or `dateEnd` query parameters, you must also
     *   use the `accountId` query parameter.
     */
    fun list(): CounterAdjustmentListPage = list(CounterAdjustmentListParams.none())

    /** @see list */
    fun list(
        params: CounterAdjustmentListParams = CounterAdjustmentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterAdjustmentListPage

    /** @see list */
    fun list(
        params: CounterAdjustmentListParams = CounterAdjustmentListParams.none()
    ): CounterAdjustmentListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CounterAdjustmentListPage =
        list(CounterAdjustmentListParams.none(), requestOptions)

    /** Delete a CounterAdjustment for the given UUID. */
    fun delete(id: String): CounterAdjustmentResponse =
        delete(id, CounterAdjustmentDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: CounterAdjustmentDeleteParams = CounterAdjustmentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterAdjustmentResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: CounterAdjustmentDeleteParams = CounterAdjustmentDeleteParams.none(),
    ): CounterAdjustmentResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CounterAdjustmentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterAdjustmentResponse

    /** @see delete */
    fun delete(params: CounterAdjustmentDeleteParams): CounterAdjustmentResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CounterAdjustmentResponse =
        delete(id, CounterAdjustmentDeleteParams.none(), requestOptions)

    /**
     * A view of [CounterAdjustmentService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CounterAdjustmentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/counteradjustments`, but is
         * otherwise the same as [CounterAdjustmentService.create].
         */
        @MustBeClosed
        fun create(
            params: CounterAdjustmentCreateParams
        ): HttpResponseFor<CounterAdjustmentResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CounterAdjustmentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterAdjustmentResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/counteradjustments/{id}`, but
         * is otherwise the same as [CounterAdjustmentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<CounterAdjustmentResponse> =
            retrieve(id, CounterAdjustmentRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CounterAdjustmentRetrieveParams = CounterAdjustmentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterAdjustmentResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CounterAdjustmentRetrieveParams = CounterAdjustmentRetrieveParams.none(),
        ): HttpResponseFor<CounterAdjustmentResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CounterAdjustmentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterAdjustmentResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CounterAdjustmentRetrieveParams
        ): HttpResponseFor<CounterAdjustmentResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CounterAdjustmentResponse> =
            retrieve(id, CounterAdjustmentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/counteradjustments/{id}`, but
         * is otherwise the same as [CounterAdjustmentService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: CounterAdjustmentUpdateParams,
        ): HttpResponseFor<CounterAdjustmentResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: CounterAdjustmentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterAdjustmentResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: CounterAdjustmentUpdateParams
        ): HttpResponseFor<CounterAdjustmentResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CounterAdjustmentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterAdjustmentResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/counteradjustments`, but is
         * otherwise the same as [CounterAdjustmentService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CounterAdjustmentListPage> =
            list(CounterAdjustmentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CounterAdjustmentListParams = CounterAdjustmentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterAdjustmentListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CounterAdjustmentListParams = CounterAdjustmentListParams.none()
        ): HttpResponseFor<CounterAdjustmentListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CounterAdjustmentListPage> =
            list(CounterAdjustmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/counteradjustments/{id}`,
         * but is otherwise the same as [CounterAdjustmentService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<CounterAdjustmentResponse> =
            delete(id, CounterAdjustmentDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: CounterAdjustmentDeleteParams = CounterAdjustmentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterAdjustmentResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: CounterAdjustmentDeleteParams = CounterAdjustmentDeleteParams.none(),
        ): HttpResponseFor<CounterAdjustmentResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CounterAdjustmentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterAdjustmentResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CounterAdjustmentDeleteParams
        ): HttpResponseFor<CounterAdjustmentResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CounterAdjustmentResponse> =
            delete(id, CounterAdjustmentDeleteParams.none(), requestOptions)
    }
}
