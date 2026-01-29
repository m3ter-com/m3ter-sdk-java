// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.lookupTables

import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.LookupTableLookupTableRevisionCreateParams
import com.m3ter.models.LookupTableLookupTableRevisionDeleteParams
import com.m3ter.models.LookupTableLookupTableRevisionListPageAsync
import com.m3ter.models.LookupTableLookupTableRevisionListParams
import com.m3ter.models.LookupTableLookupTableRevisionRetrieveParams
import com.m3ter.models.LookupTableLookupTableRevisionUpdateParams
import com.m3ter.models.LookupTableLookupTableRevisionUpdateStatusParams
import com.m3ter.models.LookupTableRevisionResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LookupTableRevisionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LookupTableRevisionServiceAsync

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
    ): CompletableFuture<LookupTableRevisionResponse> =
        create(lookupTableId, params, RequestOptions.none())

    /** @see create */
    fun create(
        lookupTableId: String,
        params: LookupTableLookupTableRevisionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableRevisionResponse> =
        create(params.toBuilder().lookupTableId(lookupTableId).build(), requestOptions)

    /** @see create */
    fun create(
        params: LookupTableLookupTableRevisionCreateParams
    ): CompletableFuture<LookupTableRevisionResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LookupTableLookupTableRevisionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableRevisionResponse>

    /** Retrieve a Lookup Table Revision for the given UUID. */
    fun retrieve(
        id: String,
        params: LookupTableLookupTableRevisionRetrieveParams,
    ): CompletableFuture<LookupTableRevisionResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LookupTableLookupTableRevisionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableRevisionResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: LookupTableLookupTableRevisionRetrieveParams
    ): CompletableFuture<LookupTableRevisionResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LookupTableLookupTableRevisionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableRevisionResponse>

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
    ): CompletableFuture<LookupTableRevisionResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: LookupTableLookupTableRevisionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableRevisionResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: LookupTableLookupTableRevisionUpdateParams
    ): CompletableFuture<LookupTableRevisionResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LookupTableLookupTableRevisionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableRevisionResponse>

    /** List LookupTableRevision entities */
    fun list(
        lookupTableId: String
    ): CompletableFuture<LookupTableLookupTableRevisionListPageAsync> =
        list(lookupTableId, LookupTableLookupTableRevisionListParams.none())

    /** @see list */
    fun list(
        lookupTableId: String,
        params: LookupTableLookupTableRevisionListParams =
            LookupTableLookupTableRevisionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableLookupTableRevisionListPageAsync> =
        list(params.toBuilder().lookupTableId(lookupTableId).build(), requestOptions)

    /** @see list */
    fun list(
        lookupTableId: String,
        params: LookupTableLookupTableRevisionListParams =
            LookupTableLookupTableRevisionListParams.none(),
    ): CompletableFuture<LookupTableLookupTableRevisionListPageAsync> =
        list(lookupTableId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: LookupTableLookupTableRevisionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableLookupTableRevisionListPageAsync>

    /** @see list */
    fun list(
        params: LookupTableLookupTableRevisionListParams
    ): CompletableFuture<LookupTableLookupTableRevisionListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        lookupTableId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LookupTableLookupTableRevisionListPageAsync> =
        list(lookupTableId, LookupTableLookupTableRevisionListParams.none(), requestOptions)

    /** Delete the Lookup Table Revision for the given UUID. */
    fun delete(
        id: String,
        params: LookupTableLookupTableRevisionDeleteParams,
    ): CompletableFuture<LookupTableRevisionResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: LookupTableLookupTableRevisionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableRevisionResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: LookupTableLookupTableRevisionDeleteParams
    ): CompletableFuture<LookupTableRevisionResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LookupTableLookupTableRevisionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableRevisionResponse>

    /** Update the status of a Lookup Table Revision for the given UUID. */
    fun updateStatus(
        id: String,
        params: LookupTableLookupTableRevisionUpdateStatusParams,
    ): CompletableFuture<LookupTableRevisionResponse> =
        updateStatus(id, params, RequestOptions.none())

    /** @see updateStatus */
    fun updateStatus(
        id: String,
        params: LookupTableLookupTableRevisionUpdateStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableRevisionResponse> =
        updateStatus(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateStatus */
    fun updateStatus(
        params: LookupTableLookupTableRevisionUpdateStatusParams
    ): CompletableFuture<LookupTableRevisionResponse> = updateStatus(params, RequestOptions.none())

    /** @see updateStatus */
    fun updateStatus(
        params: LookupTableLookupTableRevisionUpdateStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableRevisionResponse>

    /**
     * A view of [LookupTableRevisionServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LookupTableRevisionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions`, but is otherwise the same
         * as [LookupTableRevisionServiceAsync.create].
         */
        fun create(
            lookupTableId: String,
            params: LookupTableLookupTableRevisionCreateParams,
        ): CompletableFuture<HttpResponseFor<LookupTableRevisionResponse>> =
            create(lookupTableId, params, RequestOptions.none())

        /** @see create */
        fun create(
            lookupTableId: String,
            params: LookupTableLookupTableRevisionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableRevisionResponse>> =
            create(params.toBuilder().lookupTableId(lookupTableId).build(), requestOptions)

        /** @see create */
        fun create(
            params: LookupTableLookupTableRevisionCreateParams
        ): CompletableFuture<HttpResponseFor<LookupTableRevisionResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LookupTableLookupTableRevisionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableRevisionResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{id}`, but is otherwise the
         * same as [LookupTableRevisionServiceAsync.retrieve].
         */
        fun retrieve(
            id: String,
            params: LookupTableLookupTableRevisionRetrieveParams,
        ): CompletableFuture<HttpResponseFor<LookupTableRevisionResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: LookupTableLookupTableRevisionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableRevisionResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: LookupTableLookupTableRevisionRetrieveParams
        ): CompletableFuture<HttpResponseFor<LookupTableRevisionResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: LookupTableLookupTableRevisionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableRevisionResponse>>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{id}`, but is otherwise the
         * same as [LookupTableRevisionServiceAsync.update].
         */
        fun update(
            id: String,
            params: LookupTableLookupTableRevisionUpdateParams,
        ): CompletableFuture<HttpResponseFor<LookupTableRevisionResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: LookupTableLookupTableRevisionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableRevisionResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: LookupTableLookupTableRevisionUpdateParams
        ): CompletableFuture<HttpResponseFor<LookupTableRevisionResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: LookupTableLookupTableRevisionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableRevisionResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions`, but is otherwise the same
         * as [LookupTableRevisionServiceAsync.list].
         */
        fun list(
            lookupTableId: String
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionListPageAsync>> =
            list(lookupTableId, LookupTableLookupTableRevisionListParams.none())

        /** @see list */
        fun list(
            lookupTableId: String,
            params: LookupTableLookupTableRevisionListParams =
                LookupTableLookupTableRevisionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionListPageAsync>> =
            list(params.toBuilder().lookupTableId(lookupTableId).build(), requestOptions)

        /** @see list */
        fun list(
            lookupTableId: String,
            params: LookupTableLookupTableRevisionListParams =
                LookupTableLookupTableRevisionListParams.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionListPageAsync>> =
            list(lookupTableId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: LookupTableLookupTableRevisionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionListPageAsync>>

        /** @see list */
        fun list(
            params: LookupTableLookupTableRevisionListParams
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            lookupTableId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionListPageAsync>> =
            list(lookupTableId, LookupTableLookupTableRevisionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{id}`, but is otherwise the
         * same as [LookupTableRevisionServiceAsync.delete].
         */
        fun delete(
            id: String,
            params: LookupTableLookupTableRevisionDeleteParams,
        ): CompletableFuture<HttpResponseFor<LookupTableRevisionResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            params: LookupTableLookupTableRevisionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableRevisionResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: LookupTableLookupTableRevisionDeleteParams
        ): CompletableFuture<HttpResponseFor<LookupTableRevisionResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: LookupTableLookupTableRevisionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableRevisionResponse>>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{id}/status`, but is
         * otherwise the same as [LookupTableRevisionServiceAsync.updateStatus].
         */
        fun updateStatus(
            id: String,
            params: LookupTableLookupTableRevisionUpdateStatusParams,
        ): CompletableFuture<HttpResponseFor<LookupTableRevisionResponse>> =
            updateStatus(id, params, RequestOptions.none())

        /** @see updateStatus */
        fun updateStatus(
            id: String,
            params: LookupTableLookupTableRevisionUpdateStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableRevisionResponse>> =
            updateStatus(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateStatus */
        fun updateStatus(
            params: LookupTableLookupTableRevisionUpdateStatusParams
        ): CompletableFuture<HttpResponseFor<LookupTableRevisionResponse>> =
            updateStatus(params, RequestOptions.none())

        /** @see updateStatus */
        fun updateStatus(
            params: LookupTableLookupTableRevisionUpdateStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableRevisionResponse>>
    }
}
