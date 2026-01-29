// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.LookupTableCreateParams
import com.m3ter.models.LookupTableDeleteParams
import com.m3ter.models.LookupTableListPageAsync
import com.m3ter.models.LookupTableListParams
import com.m3ter.models.LookupTableRequest
import com.m3ter.models.LookupTableResponse
import com.m3ter.models.LookupTableRetrieveParams
import com.m3ter.models.LookupTableUpdateParams
import com.m3ter.services.async.lookupTables.LookupTableRevisionDataServiceAsync
import com.m3ter.services.async.lookupTables.LookupTableRevisionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LookupTableServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LookupTableServiceAsync

    fun lookupTableRevisions(): LookupTableRevisionServiceAsync

    fun lookupTableRevisionData(): LookupTableRevisionDataServiceAsync

    /** Create a new Lookup Table. */
    fun create(params: LookupTableCreateParams): CompletableFuture<LookupTableResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LookupTableCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableResponse>

    /** @see create */
    fun create(
        lookupTableRequest: LookupTableRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableResponse> =
        create(
            LookupTableCreateParams.builder().lookupTableRequest(lookupTableRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(lookupTableRequest: LookupTableRequest): CompletableFuture<LookupTableResponse> =
        create(lookupTableRequest, RequestOptions.none())

    /** Retrieve a Lookup Table by UUID. */
    fun retrieve(id: String): CompletableFuture<LookupTableResponse> =
        retrieve(id, LookupTableRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LookupTableRetrieveParams = LookupTableRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LookupTableRetrieveParams = LookupTableRetrieveParams.none(),
    ): CompletableFuture<LookupTableResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LookupTableRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableResponse>

    /** @see retrieve */
    fun retrieve(params: LookupTableRetrieveParams): CompletableFuture<LookupTableResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LookupTableResponse> =
        retrieve(id, LookupTableRetrieveParams.none(), requestOptions)

    /** Update the Lookup Table with the given UUID. */
    fun update(
        id: String,
        params: LookupTableUpdateParams,
    ): CompletableFuture<LookupTableResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: LookupTableUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: LookupTableUpdateParams): CompletableFuture<LookupTableResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LookupTableUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableResponse>

    /**
     * Retrieve a list Lookup Tables created for the Organization:
     * * Returned list can be filtered by Lookup Table `code` query parameter.
     * * If you want to include any non-default fields for the returned Lookup Tables, use the
     *   additional query parameter to specify which you want to include in the response.
     */
    fun list(): CompletableFuture<LookupTableListPageAsync> = list(LookupTableListParams.none())

    /** @see list */
    fun list(
        params: LookupTableListParams = LookupTableListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableListPageAsync>

    /** @see list */
    fun list(
        params: LookupTableListParams = LookupTableListParams.none()
    ): CompletableFuture<LookupTableListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<LookupTableListPageAsync> =
        list(LookupTableListParams.none(), requestOptions)

    /** Delete the Lookup Table with the given UUID. */
    fun delete(id: String): CompletableFuture<LookupTableResponse> =
        delete(id, LookupTableDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: LookupTableDeleteParams = LookupTableDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: LookupTableDeleteParams = LookupTableDeleteParams.none(),
    ): CompletableFuture<LookupTableResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LookupTableDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableResponse>

    /** @see delete */
    fun delete(params: LookupTableDeleteParams): CompletableFuture<LookupTableResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<LookupTableResponse> =
        delete(id, LookupTableDeleteParams.none(), requestOptions)

    /**
     * A view of [LookupTableServiceAsync] that provides access to raw HTTP responses for each
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
        ): LookupTableServiceAsync.WithRawResponse

        fun lookupTableRevisions(): LookupTableRevisionServiceAsync.WithRawResponse

        fun lookupTableRevisionData(): LookupTableRevisionDataServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/lookuptables`, but is
         * otherwise the same as [LookupTableServiceAsync.create].
         */
        fun create(
            params: LookupTableCreateParams
        ): CompletableFuture<HttpResponseFor<LookupTableResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LookupTableCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableResponse>>

        /** @see create */
        fun create(
            lookupTableRequest: LookupTableRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableResponse>> =
            create(
                LookupTableCreateParams.builder().lookupTableRequest(lookupTableRequest).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            lookupTableRequest: LookupTableRequest
        ): CompletableFuture<HttpResponseFor<LookupTableResponse>> =
            create(lookupTableRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/lookuptables/{id}`, but is
         * otherwise the same as [LookupTableServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<LookupTableResponse>> =
            retrieve(id, LookupTableRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: LookupTableRetrieveParams = LookupTableRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: LookupTableRetrieveParams = LookupTableRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: LookupTableRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableResponse>>

        /** @see retrieve */
        fun retrieve(
            params: LookupTableRetrieveParams
        ): CompletableFuture<HttpResponseFor<LookupTableResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LookupTableResponse>> =
            retrieve(id, LookupTableRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/lookuptables/{id}`, but is
         * otherwise the same as [LookupTableServiceAsync.update].
         */
        fun update(
            id: String,
            params: LookupTableUpdateParams,
        ): CompletableFuture<HttpResponseFor<LookupTableResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: LookupTableUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: LookupTableUpdateParams
        ): CompletableFuture<HttpResponseFor<LookupTableResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: LookupTableUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/lookuptables`, but is
         * otherwise the same as [LookupTableServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<LookupTableListPageAsync>> =
            list(LookupTableListParams.none())

        /** @see list */
        fun list(
            params: LookupTableListParams = LookupTableListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableListPageAsync>>

        /** @see list */
        fun list(
            params: LookupTableListParams = LookupTableListParams.none()
        ): CompletableFuture<HttpResponseFor<LookupTableListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LookupTableListPageAsync>> =
            list(LookupTableListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/lookuptables/{id}`, but is
         * otherwise the same as [LookupTableServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<LookupTableResponse>> =
            delete(id, LookupTableDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: LookupTableDeleteParams = LookupTableDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: LookupTableDeleteParams = LookupTableDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: LookupTableDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableResponse>>

        /** @see delete */
        fun delete(
            params: LookupTableDeleteParams
        ): CompletableFuture<HttpResponseFor<LookupTableResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LookupTableResponse>> =
            delete(id, LookupTableDeleteParams.none(), requestOptions)
    }
}
