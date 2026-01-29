// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.LookupTableCreateParams
import com.m3ter.models.LookupTableDeleteParams
import com.m3ter.models.LookupTableListPage
import com.m3ter.models.LookupTableListParams
import com.m3ter.models.LookupTableRequest
import com.m3ter.models.LookupTableResponse
import com.m3ter.models.LookupTableRetrieveParams
import com.m3ter.models.LookupTableUpdateParams
import com.m3ter.services.blocking.lookupTables.LookupTableRevisionDataService
import com.m3ter.services.blocking.lookupTables.LookupTableRevisionService
import java.util.function.Consumer

interface LookupTableService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LookupTableService

    fun lookupTableRevisions(): LookupTableRevisionService

    fun lookupTableRevisionData(): LookupTableRevisionDataService

    /** Create a new Lookup Table. */
    fun create(params: LookupTableCreateParams): LookupTableResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LookupTableCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableResponse

    /** @see create */
    fun create(
        lookupTableRequest: LookupTableRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableResponse =
        create(
            LookupTableCreateParams.builder().lookupTableRequest(lookupTableRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(lookupTableRequest: LookupTableRequest): LookupTableResponse =
        create(lookupTableRequest, RequestOptions.none())

    /** Retrieve a Lookup Table by UUID. */
    fun retrieve(id: String): LookupTableResponse = retrieve(id, LookupTableRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LookupTableRetrieveParams = LookupTableRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LookupTableRetrieveParams = LookupTableRetrieveParams.none(),
    ): LookupTableResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LookupTableRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableResponse

    /** @see retrieve */
    fun retrieve(params: LookupTableRetrieveParams): LookupTableResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): LookupTableResponse =
        retrieve(id, LookupTableRetrieveParams.none(), requestOptions)

    /** Update the Lookup Table with the given UUID. */
    fun update(id: String, params: LookupTableUpdateParams): LookupTableResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: LookupTableUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: LookupTableUpdateParams): LookupTableResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LookupTableUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableResponse

    /**
     * Retrieve a list Lookup Tables created for the Organization:
     * * Returned list can be filtered by Lookup Table `code` query parameter.
     * * If you want to include any non-default fields for the returned Lookup Tables, use the
     *   additional query parameter to specify which you want to include in the response.
     */
    fun list(): LookupTableListPage = list(LookupTableListParams.none())

    /** @see list */
    fun list(
        params: LookupTableListParams = LookupTableListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableListPage

    /** @see list */
    fun list(params: LookupTableListParams = LookupTableListParams.none()): LookupTableListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): LookupTableListPage =
        list(LookupTableListParams.none(), requestOptions)

    /** Delete the Lookup Table with the given UUID. */
    fun delete(id: String): LookupTableResponse = delete(id, LookupTableDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: LookupTableDeleteParams = LookupTableDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: LookupTableDeleteParams = LookupTableDeleteParams.none(),
    ): LookupTableResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LookupTableDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableResponse

    /** @see delete */
    fun delete(params: LookupTableDeleteParams): LookupTableResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): LookupTableResponse =
        delete(id, LookupTableDeleteParams.none(), requestOptions)

    /**
     * A view of [LookupTableService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LookupTableService.WithRawResponse

        fun lookupTableRevisions(): LookupTableRevisionService.WithRawResponse

        fun lookupTableRevisionData(): LookupTableRevisionDataService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/lookuptables`, but is
         * otherwise the same as [LookupTableService.create].
         */
        @MustBeClosed
        fun create(params: LookupTableCreateParams): HttpResponseFor<LookupTableResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: LookupTableCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            lookupTableRequest: LookupTableRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableResponse> =
            create(
                LookupTableCreateParams.builder().lookupTableRequest(lookupTableRequest).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(lookupTableRequest: LookupTableRequest): HttpResponseFor<LookupTableResponse> =
            create(lookupTableRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/lookuptables/{id}`, but is
         * otherwise the same as [LookupTableService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<LookupTableResponse> =
            retrieve(id, LookupTableRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LookupTableRetrieveParams = LookupTableRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LookupTableRetrieveParams = LookupTableRetrieveParams.none(),
        ): HttpResponseFor<LookupTableResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: LookupTableRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: LookupTableRetrieveParams): HttpResponseFor<LookupTableResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LookupTableResponse> =
            retrieve(id, LookupTableRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/lookuptables/{id}`, but is
         * otherwise the same as [LookupTableService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: LookupTableUpdateParams,
        ): HttpResponseFor<LookupTableResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: LookupTableUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: LookupTableUpdateParams): HttpResponseFor<LookupTableResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: LookupTableUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/lookuptables`, but is
         * otherwise the same as [LookupTableService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<LookupTableListPage> = list(LookupTableListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: LookupTableListParams = LookupTableListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: LookupTableListParams = LookupTableListParams.none()
        ): HttpResponseFor<LookupTableListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LookupTableListPage> =
            list(LookupTableListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/lookuptables/{id}`, but is
         * otherwise the same as [LookupTableService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<LookupTableResponse> =
            delete(id, LookupTableDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: LookupTableDeleteParams = LookupTableDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: LookupTableDeleteParams = LookupTableDeleteParams.none(),
        ): HttpResponseFor<LookupTableResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: LookupTableDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: LookupTableDeleteParams): HttpResponseFor<LookupTableResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LookupTableResponse> =
            delete(id, LookupTableDeleteParams.none(), requestOptions)
    }
}
