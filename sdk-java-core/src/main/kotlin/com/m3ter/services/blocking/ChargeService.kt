// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.ChargeCreateParams
import com.m3ter.models.ChargeCreateResponse
import com.m3ter.models.ChargeDeleteParams
import com.m3ter.models.ChargeDeleteResponse
import com.m3ter.models.ChargeListPage
import com.m3ter.models.ChargeListParams
import com.m3ter.models.ChargeRetrieveParams
import com.m3ter.models.ChargeRetrieveResponse
import com.m3ter.models.ChargeUpdateParams
import com.m3ter.models.ChargeUpdateResponse
import java.util.function.Consumer

interface ChargeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChargeService

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
    fun create(params: ChargeCreateParams): ChargeCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ChargeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChargeCreateResponse

    /** Retrieve a Charge for the given UUID. */
    fun retrieve(id: String): ChargeRetrieveResponse = retrieve(id, ChargeRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ChargeRetrieveParams = ChargeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChargeRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ChargeRetrieveParams = ChargeRetrieveParams.none(),
    ): ChargeRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ChargeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChargeRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ChargeRetrieveParams): ChargeRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): ChargeRetrieveResponse =
        retrieve(id, ChargeRetrieveParams.none(), requestOptions)

    /**
     * Update a Charge for the given UUID.
     *
     * **NOTE:** When you update a Charge on an Account, you can provide either a Charge `amount` or
     * Charge `units` together with a `unitPrice`, but *not both*.
     */
    fun update(id: String, params: ChargeUpdateParams): ChargeUpdateResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: ChargeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChargeUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: ChargeUpdateParams): ChargeUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ChargeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChargeUpdateResponse

    /** Retrieve a list of Charge entities */
    fun list(): ChargeListPage = list(ChargeListParams.none())

    /** @see list */
    fun list(
        params: ChargeListParams = ChargeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChargeListPage

    /** @see list */
    fun list(params: ChargeListParams = ChargeListParams.none()): ChargeListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ChargeListPage =
        list(ChargeListParams.none(), requestOptions)

    /** Delete the Charge for the given UUID. */
    fun delete(id: String): ChargeDeleteResponse = delete(id, ChargeDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: ChargeDeleteParams = ChargeDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChargeDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: ChargeDeleteParams = ChargeDeleteParams.none(),
    ): ChargeDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ChargeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChargeDeleteResponse

    /** @see delete */
    fun delete(params: ChargeDeleteParams): ChargeDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): ChargeDeleteResponse =
        delete(id, ChargeDeleteParams.none(), requestOptions)

    /** A view of [ChargeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChargeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/charges`, but is otherwise
         * the same as [ChargeService.create].
         */
        @MustBeClosed
        fun create(params: ChargeCreateParams): HttpResponseFor<ChargeCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ChargeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChargeCreateResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/charges/{id}`, but is
         * otherwise the same as [ChargeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<ChargeRetrieveResponse> =
            retrieve(id, ChargeRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ChargeRetrieveParams = ChargeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChargeRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ChargeRetrieveParams = ChargeRetrieveParams.none(),
        ): HttpResponseFor<ChargeRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ChargeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChargeRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ChargeRetrieveParams): HttpResponseFor<ChargeRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChargeRetrieveResponse> =
            retrieve(id, ChargeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/charges/{id}`, but is
         * otherwise the same as [ChargeService.update].
         */
        @MustBeClosed
        fun update(id: String, params: ChargeUpdateParams): HttpResponseFor<ChargeUpdateResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: ChargeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChargeUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ChargeUpdateParams): HttpResponseFor<ChargeUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ChargeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChargeUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/charges`, but is otherwise
         * the same as [ChargeService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ChargeListPage> = list(ChargeListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ChargeListParams = ChargeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChargeListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ChargeListParams = ChargeListParams.none()
        ): HttpResponseFor<ChargeListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ChargeListPage> =
            list(ChargeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/charges/{id}`, but is
         * otherwise the same as [ChargeService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<ChargeDeleteResponse> =
            delete(id, ChargeDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: ChargeDeleteParams = ChargeDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChargeDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: ChargeDeleteParams = ChargeDeleteParams.none(),
        ): HttpResponseFor<ChargeDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ChargeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChargeDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: ChargeDeleteParams): HttpResponseFor<ChargeDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChargeDeleteResponse> =
            delete(id, ChargeDeleteParams.none(), requestOptions)
    }
}
