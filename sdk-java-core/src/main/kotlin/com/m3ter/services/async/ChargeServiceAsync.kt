// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.ChargeCreateParams
import com.m3ter.models.ChargeCreateResponse
import com.m3ter.models.ChargeDeleteParams
import com.m3ter.models.ChargeDeleteResponse
import com.m3ter.models.ChargeListPageAsync
import com.m3ter.models.ChargeListParams
import com.m3ter.models.ChargeRetrieveParams
import com.m3ter.models.ChargeRetrieveResponse
import com.m3ter.models.ChargeUpdateParams
import com.m3ter.models.ChargeUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ChargeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChargeServiceAsync

    /**
     * Create a new Charge.
     *
     * **NOTES:**
     * * To create an ad-hoc Charge on an Account, use the `accountId` request parameter.
     * * To create a balance fee Charge for a Balance, use the `entityId` request parameter to
     *   specify which Balance on an Account the Charge is for.
     * * To define the value of the Charge amount that is billed, you can simply specify an `amount`
     *   or use a number of `units` together with a `unitPrice` for a calculated value = units x
     *   unit price. But you cannot specify *both an amount and units/unit price*.
     */
    fun create(params: ChargeCreateParams): CompletableFuture<ChargeCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ChargeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChargeCreateResponse>

    /** Retrieve a Charge for the given UUID. */
    fun retrieve(id: String): CompletableFuture<ChargeRetrieveResponse> =
        retrieve(id, ChargeRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ChargeRetrieveParams = ChargeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChargeRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ChargeRetrieveParams = ChargeRetrieveParams.none(),
    ): CompletableFuture<ChargeRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ChargeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChargeRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: ChargeRetrieveParams): CompletableFuture<ChargeRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChargeRetrieveResponse> =
        retrieve(id, ChargeRetrieveParams.none(), requestOptions)

    /**
     * Update a Charge for the given UUID.
     *
     * **NOTE:** When you update a Charge on an Account, you can provide either a Charge `amount` or
     * Charge `units` together with a `unitPrice`, but *not both*.
     */
    fun update(id: String, params: ChargeUpdateParams): CompletableFuture<ChargeUpdateResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: ChargeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChargeUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: ChargeUpdateParams): CompletableFuture<ChargeUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ChargeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChargeUpdateResponse>

    /** Retrieve a list of Charge entities */
    fun list(): CompletableFuture<ChargeListPageAsync> = list(ChargeListParams.none())

    /** @see list */
    fun list(
        params: ChargeListParams = ChargeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChargeListPageAsync>

    /** @see list */
    fun list(
        params: ChargeListParams = ChargeListParams.none()
    ): CompletableFuture<ChargeListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ChargeListPageAsync> =
        list(ChargeListParams.none(), requestOptions)

    /** Delete the Charge for the given UUID. */
    fun delete(id: String): CompletableFuture<ChargeDeleteResponse> =
        delete(id, ChargeDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: ChargeDeleteParams = ChargeDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChargeDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: ChargeDeleteParams = ChargeDeleteParams.none(),
    ): CompletableFuture<ChargeDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ChargeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChargeDeleteResponse>

    /** @see delete */
    fun delete(params: ChargeDeleteParams): CompletableFuture<ChargeDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChargeDeleteResponse> =
        delete(id, ChargeDeleteParams.none(), requestOptions)

    /**
     * A view of [ChargeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChargeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/charges`, but is otherwise
         * the same as [ChargeServiceAsync.create].
         */
        fun create(
            params: ChargeCreateParams
        ): CompletableFuture<HttpResponseFor<ChargeCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ChargeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChargeCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/charges/{id}`, but is
         * otherwise the same as [ChargeServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<ChargeRetrieveResponse>> =
            retrieve(id, ChargeRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ChargeRetrieveParams = ChargeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChargeRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ChargeRetrieveParams = ChargeRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ChargeRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ChargeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChargeRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ChargeRetrieveParams
        ): CompletableFuture<HttpResponseFor<ChargeRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChargeRetrieveResponse>> =
            retrieve(id, ChargeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/charges/{id}`, but is
         * otherwise the same as [ChargeServiceAsync.update].
         */
        fun update(
            id: String,
            params: ChargeUpdateParams,
        ): CompletableFuture<HttpResponseFor<ChargeUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: ChargeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChargeUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: ChargeUpdateParams
        ): CompletableFuture<HttpResponseFor<ChargeUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ChargeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChargeUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/charges`, but is otherwise
         * the same as [ChargeServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ChargeListPageAsync>> =
            list(ChargeListParams.none())

        /** @see list */
        fun list(
            params: ChargeListParams = ChargeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChargeListPageAsync>>

        /** @see list */
        fun list(
            params: ChargeListParams = ChargeListParams.none()
        ): CompletableFuture<HttpResponseFor<ChargeListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ChargeListPageAsync>> =
            list(ChargeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/charges/{id}`, but is
         * otherwise the same as [ChargeServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<ChargeDeleteResponse>> =
            delete(id, ChargeDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: ChargeDeleteParams = ChargeDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChargeDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: ChargeDeleteParams = ChargeDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ChargeDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ChargeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChargeDeleteResponse>>

        /** @see delete */
        fun delete(
            params: ChargeDeleteParams
        ): CompletableFuture<HttpResponseFor<ChargeDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChargeDeleteResponse>> =
            delete(id, ChargeDeleteParams.none(), requestOptions)
    }
}
