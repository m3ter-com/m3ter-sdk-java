// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.CounterAdjustmentCreateParams
import com.m3ter.models.CounterAdjustmentDeleteParams
import com.m3ter.models.CounterAdjustmentListPageAsync
import com.m3ter.models.CounterAdjustmentListParams
import com.m3ter.models.CounterAdjustmentResponse
import com.m3ter.models.CounterAdjustmentRetrieveParams
import com.m3ter.models.CounterAdjustmentUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CounterAdjustmentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CounterAdjustmentServiceAsync

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
    fun create(
        params: CounterAdjustmentCreateParams
    ): CompletableFuture<CounterAdjustmentResponse> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CounterAdjustmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterAdjustmentResponse>

    /** Retrieve a CounterAdjustment for the given UUID. */
    fun retrieve(id: String): CompletableFuture<CounterAdjustmentResponse> =
        retrieve(id, CounterAdjustmentRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: CounterAdjustmentRetrieveParams = CounterAdjustmentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterAdjustmentResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: CounterAdjustmentRetrieveParams = CounterAdjustmentRetrieveParams.none(),
    ): CompletableFuture<CounterAdjustmentResponse> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CounterAdjustmentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterAdjustmentResponse>

    /** @see [retrieve] */
    fun retrieve(
        params: CounterAdjustmentRetrieveParams
    ): CompletableFuture<CounterAdjustmentResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CounterAdjustmentResponse> =
        retrieve(id, CounterAdjustmentRetrieveParams.none(), requestOptions)

    /** Update a CounterAdjustment for an Account. */
    fun update(
        id: String,
        params: CounterAdjustmentUpdateParams,
    ): CompletableFuture<CounterAdjustmentResponse> = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: CounterAdjustmentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterAdjustmentResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        params: CounterAdjustmentUpdateParams
    ): CompletableFuture<CounterAdjustmentResponse> = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: CounterAdjustmentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterAdjustmentResponse>

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
    fun list(): CompletableFuture<CounterAdjustmentListPageAsync> =
        list(CounterAdjustmentListParams.none())

    /** @see [list] */
    fun list(
        params: CounterAdjustmentListParams = CounterAdjustmentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterAdjustmentListPageAsync>

    /** @see [list] */
    fun list(
        params: CounterAdjustmentListParams = CounterAdjustmentListParams.none()
    ): CompletableFuture<CounterAdjustmentListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<CounterAdjustmentListPageAsync> =
        list(CounterAdjustmentListParams.none(), requestOptions)

    /** Delete a CounterAdjustment for the given UUID. */
    fun delete(id: String): CompletableFuture<CounterAdjustmentResponse> =
        delete(id, CounterAdjustmentDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: CounterAdjustmentDeleteParams = CounterAdjustmentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterAdjustmentResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: CounterAdjustmentDeleteParams = CounterAdjustmentDeleteParams.none(),
    ): CompletableFuture<CounterAdjustmentResponse> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: CounterAdjustmentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterAdjustmentResponse>

    /** @see [delete] */
    fun delete(
        params: CounterAdjustmentDeleteParams
    ): CompletableFuture<CounterAdjustmentResponse> = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CounterAdjustmentResponse> =
        delete(id, CounterAdjustmentDeleteParams.none(), requestOptions)

    /**
     * A view of [CounterAdjustmentServiceAsync] that provides access to raw HTTP responses for each
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
        ): CounterAdjustmentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/counteradjustments`, but is
         * otherwise the same as [CounterAdjustmentServiceAsync.create].
         */
        fun create(
            params: CounterAdjustmentCreateParams
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: CounterAdjustmentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/counteradjustments/{id}`, but
         * is otherwise the same as [CounterAdjustmentServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<CounterAdjustmentResponse>> =
            retrieve(id, CounterAdjustmentRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: CounterAdjustmentRetrieveParams = CounterAdjustmentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: CounterAdjustmentRetrieveParams = CounterAdjustmentRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: CounterAdjustmentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: CounterAdjustmentRetrieveParams
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentResponse>> =
            retrieve(id, CounterAdjustmentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/counteradjustments/{id}`, but
         * is otherwise the same as [CounterAdjustmentServiceAsync.update].
         */
        fun update(
            id: String,
            params: CounterAdjustmentUpdateParams,
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentResponse>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            id: String,
            params: CounterAdjustmentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        fun update(
            params: CounterAdjustmentUpdateParams
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: CounterAdjustmentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/counteradjustments`, but is
         * otherwise the same as [CounterAdjustmentServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CounterAdjustmentListPageAsync>> =
            list(CounterAdjustmentListParams.none())

        /** @see [list] */
        fun list(
            params: CounterAdjustmentListParams = CounterAdjustmentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentListPageAsync>>

        /** @see [list] */
        fun list(
            params: CounterAdjustmentListParams = CounterAdjustmentListParams.none()
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentListPageAsync>> =
            list(CounterAdjustmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/counteradjustments/{id}`,
         * but is otherwise the same as [CounterAdjustmentServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<CounterAdjustmentResponse>> =
            delete(id, CounterAdjustmentDeleteParams.none())

        /** @see [delete] */
        fun delete(
            id: String,
            params: CounterAdjustmentDeleteParams = CounterAdjustmentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            id: String,
            params: CounterAdjustmentDeleteParams = CounterAdjustmentDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: CounterAdjustmentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentResponse>>

        /** @see [delete] */
        fun delete(
            params: CounterAdjustmentDeleteParams
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentResponse>> =
            delete(id, CounterAdjustmentDeleteParams.none(), requestOptions)
    }
}
