// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.lookupTables

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.LookupTableLookupTableRevisionCreateParams
import com.m3ter.models.LookupTableLookupTableRevisionDeleteParams
import com.m3ter.models.LookupTableLookupTableRevisionListPage
import com.m3ter.models.LookupTableLookupTableRevisionListParams
import com.m3ter.models.LookupTableLookupTableRevisionRetrieveParams
import com.m3ter.models.LookupTableLookupTableRevisionUpdateParams
import com.m3ter.models.LookupTableLookupTableRevisionUpdateStatusParams
import com.m3ter.models.LookupTableRevisionResponse
import java.util.function.Consumer

interface LookupTableRevisionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LookupTableRevisionService

    /**
     * Create a new Revision for a Lookup Table.
     *
     * Fields and Keys for Revision schema: Use the `fields` parameter to define a Revision schema
     * containing up to 10 number or string fields. Use the `keys` parameter to specify which are
     * the key fields:
     * * At least one field must be a non-key field and at least one a key field.
     * * Up to 5 key fields can be defined.
     * * Using multiple key fields: ensure that the order in which they are defined matches the
     *   order in which you want to use them in any Lookup functions that reference the Revision's
     *   Lookup Table, because this is the order in which they will be passed into the function. The
     *   order of non-key fields is not constrained in this way.
     *
     * Revision status: when you first create a Lookup Table Revision it has DRAFT status. Use the
     * [Update LookupTableRevision Status](www.m3ter.com/docs/api#tag/LookupTableRevision/operation/UpdateLookupTableRevisionStatus)
     * call to change a Revision's status.
     */
    fun create(
        lookupTableId: String,
        params: LookupTableLookupTableRevisionCreateParams,
    ): LookupTableRevisionResponse = create(lookupTableId, params, RequestOptions.none())

    /** @see create */
    fun create(
        lookupTableId: String,
        params: LookupTableLookupTableRevisionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableRevisionResponse =
        create(params.toBuilder().lookupTableId(lookupTableId).build(), requestOptions)

    /** @see create */
    fun create(params: LookupTableLookupTableRevisionCreateParams): LookupTableRevisionResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LookupTableLookupTableRevisionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableRevisionResponse

    /** Retrieve a Lookup Table Revision for the given UUID. */
    fun retrieve(
        id: String,
        params: LookupTableLookupTableRevisionRetrieveParams,
    ): LookupTableRevisionResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LookupTableLookupTableRevisionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableRevisionResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: LookupTableLookupTableRevisionRetrieveParams
    ): LookupTableRevisionResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LookupTableLookupTableRevisionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableRevisionResponse

    /**
     * Update a Lookup Table Revision for the given UUID.
     *
     * **NOTE:** If you've already added data to a Lookup Table Revision - see the following
     * [Lookup Table Revision Data](https://www.m3ter.com/docs/api#tag/LookupTableRevisionData)
     * section - then you won't be able to change the Revision's field schema and you'll receive an
     * error if you try do this. Create a new Revision instead, or delete the data items first.
     */
    fun update(
        id: String,
        params: LookupTableLookupTableRevisionUpdateParams,
    ): LookupTableRevisionResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: LookupTableLookupTableRevisionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableRevisionResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: LookupTableLookupTableRevisionUpdateParams): LookupTableRevisionResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LookupTableLookupTableRevisionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableRevisionResponse

    /** List LookupTableRevision entities */
    fun list(lookupTableId: String): LookupTableLookupTableRevisionListPage =
        list(lookupTableId, LookupTableLookupTableRevisionListParams.none())

    /** @see list */
    fun list(
        lookupTableId: String,
        params: LookupTableLookupTableRevisionListParams =
            LookupTableLookupTableRevisionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableLookupTableRevisionListPage =
        list(params.toBuilder().lookupTableId(lookupTableId).build(), requestOptions)

    /** @see list */
    fun list(
        lookupTableId: String,
        params: LookupTableLookupTableRevisionListParams =
            LookupTableLookupTableRevisionListParams.none(),
    ): LookupTableLookupTableRevisionListPage = list(lookupTableId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: LookupTableLookupTableRevisionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableLookupTableRevisionListPage

    /** @see list */
    fun list(
        params: LookupTableLookupTableRevisionListParams
    ): LookupTableLookupTableRevisionListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        lookupTableId: String,
        requestOptions: RequestOptions,
    ): LookupTableLookupTableRevisionListPage =
        list(lookupTableId, LookupTableLookupTableRevisionListParams.none(), requestOptions)

    /** Delete the Lookup Table Revision for the given UUID. */
    fun delete(
        id: String,
        params: LookupTableLookupTableRevisionDeleteParams,
    ): LookupTableRevisionResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: LookupTableLookupTableRevisionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableRevisionResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: LookupTableLookupTableRevisionDeleteParams): LookupTableRevisionResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LookupTableLookupTableRevisionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableRevisionResponse

    /** Update the status of a Lookup Table Revision for the given UUID. */
    fun updateStatus(
        id: String,
        params: LookupTableLookupTableRevisionUpdateStatusParams,
    ): LookupTableRevisionResponse = updateStatus(id, params, RequestOptions.none())

    /** @see updateStatus */
    fun updateStatus(
        id: String,
        params: LookupTableLookupTableRevisionUpdateStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableRevisionResponse = updateStatus(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateStatus */
    fun updateStatus(
        params: LookupTableLookupTableRevisionUpdateStatusParams
    ): LookupTableRevisionResponse = updateStatus(params, RequestOptions.none())

    /** @see updateStatus */
    fun updateStatus(
        params: LookupTableLookupTableRevisionUpdateStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableRevisionResponse

    /**
     * A view of [LookupTableRevisionService] that provides access to raw HTTP responses for each
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
        ): LookupTableRevisionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions`, but is otherwise the same
         * as [LookupTableRevisionService.create].
         */
        @MustBeClosed
        fun create(
            lookupTableId: String,
            params: LookupTableLookupTableRevisionCreateParams,
        ): HttpResponseFor<LookupTableRevisionResponse> =
            create(lookupTableId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            lookupTableId: String,
            params: LookupTableLookupTableRevisionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableRevisionResponse> =
            create(params.toBuilder().lookupTableId(lookupTableId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: LookupTableLookupTableRevisionCreateParams
        ): HttpResponseFor<LookupTableRevisionResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: LookupTableLookupTableRevisionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableRevisionResponse>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{id}`, but is otherwise the
         * same as [LookupTableRevisionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LookupTableLookupTableRevisionRetrieveParams,
        ): HttpResponseFor<LookupTableRevisionResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LookupTableLookupTableRevisionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableRevisionResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: LookupTableLookupTableRevisionRetrieveParams
        ): HttpResponseFor<LookupTableRevisionResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: LookupTableLookupTableRevisionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableRevisionResponse>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{id}`, but is otherwise the
         * same as [LookupTableRevisionService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: LookupTableLookupTableRevisionUpdateParams,
        ): HttpResponseFor<LookupTableRevisionResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: LookupTableLookupTableRevisionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableRevisionResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: LookupTableLookupTableRevisionUpdateParams
        ): HttpResponseFor<LookupTableRevisionResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: LookupTableLookupTableRevisionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableRevisionResponse>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions`, but is otherwise the same
         * as [LookupTableRevisionService.list].
         */
        @MustBeClosed
        fun list(lookupTableId: String): HttpResponseFor<LookupTableLookupTableRevisionListPage> =
            list(lookupTableId, LookupTableLookupTableRevisionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            lookupTableId: String,
            params: LookupTableLookupTableRevisionListParams =
                LookupTableLookupTableRevisionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableLookupTableRevisionListPage> =
            list(params.toBuilder().lookupTableId(lookupTableId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            lookupTableId: String,
            params: LookupTableLookupTableRevisionListParams =
                LookupTableLookupTableRevisionListParams.none(),
        ): HttpResponseFor<LookupTableLookupTableRevisionListPage> =
            list(lookupTableId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: LookupTableLookupTableRevisionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableLookupTableRevisionListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: LookupTableLookupTableRevisionListParams
        ): HttpResponseFor<LookupTableLookupTableRevisionListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            lookupTableId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LookupTableLookupTableRevisionListPage> =
            list(lookupTableId, LookupTableLookupTableRevisionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{id}`, but is otherwise the
         * same as [LookupTableRevisionService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: LookupTableLookupTableRevisionDeleteParams,
        ): HttpResponseFor<LookupTableRevisionResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: LookupTableLookupTableRevisionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableRevisionResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: LookupTableLookupTableRevisionDeleteParams
        ): HttpResponseFor<LookupTableRevisionResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: LookupTableLookupTableRevisionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableRevisionResponse>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{id}/status`, but is
         * otherwise the same as [LookupTableRevisionService.updateStatus].
         */
        @MustBeClosed
        fun updateStatus(
            id: String,
            params: LookupTableLookupTableRevisionUpdateStatusParams,
        ): HttpResponseFor<LookupTableRevisionResponse> =
            updateStatus(id, params, RequestOptions.none())

        /** @see updateStatus */
        @MustBeClosed
        fun updateStatus(
            id: String,
            params: LookupTableLookupTableRevisionUpdateStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableRevisionResponse> =
            updateStatus(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateStatus */
        @MustBeClosed
        fun updateStatus(
            params: LookupTableLookupTableRevisionUpdateStatusParams
        ): HttpResponseFor<LookupTableRevisionResponse> =
            updateStatus(params, RequestOptions.none())

        /** @see updateStatus */
        @MustBeClosed
        fun updateStatus(
            params: LookupTableLookupTableRevisionUpdateStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableRevisionResponse>
    }
}
