// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.dataExports

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.DataExportDestinationCreateParams
import com.m3ter.models.DataExportDestinationCreateResponse
import com.m3ter.models.DataExportDestinationDeleteParams
import com.m3ter.models.DataExportDestinationDeleteResponse
import com.m3ter.models.DataExportDestinationListPageAsync
import com.m3ter.models.DataExportDestinationListParams
import com.m3ter.models.DataExportDestinationRetrieveParams
import com.m3ter.models.DataExportDestinationRetrieveResponse
import com.m3ter.models.DataExportDestinationUpdateParams
import com.m3ter.models.DataExportDestinationUpdateResponse
import java.util.concurrent.CompletableFuture

interface DestinationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new Export Destination to use for your Data Export Schedules or Ad-Hoc Data Exports.
     *
     * **NOTE:** Currently, you can only create Export Destinations using an S3 bucket on your AWS
     * Account.
     */
    fun create(
        params: DataExportDestinationCreateParams
    ): CompletableFuture<DataExportDestinationCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: DataExportDestinationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportDestinationCreateResponse>

    /** Retrieve an Export Destination for the given UUID. */
    fun retrieve(id: String): CompletableFuture<DataExportDestinationRetrieveResponse> =
        retrieve(id, DataExportDestinationRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: DataExportDestinationRetrieveParams = DataExportDestinationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportDestinationRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: DataExportDestinationRetrieveParams = DataExportDestinationRetrieveParams.none(),
    ): CompletableFuture<DataExportDestinationRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DataExportDestinationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportDestinationRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(
        params: DataExportDestinationRetrieveParams
    ): CompletableFuture<DataExportDestinationRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataExportDestinationRetrieveResponse> =
        retrieve(id, DataExportDestinationRetrieveParams.none(), requestOptions)

    /**
     * Update an Export Destination for the given UUID.
     *
     * **NOTE:** Currently, only Export Destinations using an S3 bucket on your AWS Account are
     * supported.
     */
    fun update(
        id: String,
        params: DataExportDestinationUpdateParams,
    ): CompletableFuture<DataExportDestinationUpdateResponse> =
        update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: DataExportDestinationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportDestinationUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        params: DataExportDestinationUpdateParams
    ): CompletableFuture<DataExportDestinationUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: DataExportDestinationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportDestinationUpdateResponse>

    /**
     * Retrieve a list of Export Destination entities. You can filter the list of Destinations
     * returned by UUID.
     */
    fun list(): CompletableFuture<DataExportDestinationListPageAsync> =
        list(DataExportDestinationListParams.none())

    /** @see [list] */
    fun list(
        params: DataExportDestinationListParams = DataExportDestinationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportDestinationListPageAsync>

    /** @see [list] */
    fun list(
        params: DataExportDestinationListParams = DataExportDestinationListParams.none()
    ): CompletableFuture<DataExportDestinationListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<DataExportDestinationListPageAsync> =
        list(DataExportDestinationListParams.none(), requestOptions)

    /**
     * Delete an Export Destination for the given UUID.
     *
     * **NOTE:** If you attempt to delete an Export Destination that is currently linked to a Data
     * Export Schedule, an error message is returned and you won't be able to delete the
     * Destination.
     */
    fun delete(id: String): CompletableFuture<DataExportDestinationDeleteResponse> =
        delete(id, DataExportDestinationDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: DataExportDestinationDeleteParams = DataExportDestinationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportDestinationDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: DataExportDestinationDeleteParams = DataExportDestinationDeleteParams.none(),
    ): CompletableFuture<DataExportDestinationDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: DataExportDestinationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportDestinationDeleteResponse>

    /** @see [delete] */
    fun delete(
        params: DataExportDestinationDeleteParams
    ): CompletableFuture<DataExportDestinationDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataExportDestinationDeleteResponse> =
        delete(id, DataExportDestinationDeleteParams.none(), requestOptions)

    /**
     * A view of [DestinationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/dataexports/destinations`,
         * but is otherwise the same as [DestinationServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: DataExportDestinationCreateParams
        ): CompletableFuture<HttpResponseFor<DataExportDestinationCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: DataExportDestinationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataExportDestinationCreateResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/dataexports/destinations/{id}`, but is otherwise the same as
         * [DestinationServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<DataExportDestinationRetrieveResponse>> =
            retrieve(id, DataExportDestinationRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DataExportDestinationRetrieveParams =
                DataExportDestinationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataExportDestinationRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DataExportDestinationRetrieveParams = DataExportDestinationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<DataExportDestinationRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DataExportDestinationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataExportDestinationRetrieveResponse>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DataExportDestinationRetrieveParams
        ): CompletableFuture<HttpResponseFor<DataExportDestinationRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DataExportDestinationRetrieveResponse>> =
            retrieve(id, DataExportDestinationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/dataexports/destinations/{id}`, but is otherwise the same as
         * [DestinationServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: DataExportDestinationUpdateParams,
        ): CompletableFuture<HttpResponseFor<DataExportDestinationUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: DataExportDestinationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataExportDestinationUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: DataExportDestinationUpdateParams
        ): CompletableFuture<HttpResponseFor<DataExportDestinationUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: DataExportDestinationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataExportDestinationUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/dataexports/destinations`,
         * but is otherwise the same as [DestinationServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<DataExportDestinationListPageAsync>> =
            list(DataExportDestinationListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DataExportDestinationListParams = DataExportDestinationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataExportDestinationListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DataExportDestinationListParams = DataExportDestinationListParams.none()
        ): CompletableFuture<HttpResponseFor<DataExportDestinationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DataExportDestinationListPageAsync>> =
            list(DataExportDestinationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/dataexports/destinations/{id}`, but is otherwise the same as
         * [DestinationServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<DataExportDestinationDeleteResponse>> =
            delete(id, DataExportDestinationDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: DataExportDestinationDeleteParams = DataExportDestinationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataExportDestinationDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: DataExportDestinationDeleteParams = DataExportDestinationDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<DataExportDestinationDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: DataExportDestinationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataExportDestinationDeleteResponse>>

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: DataExportDestinationDeleteParams
        ): CompletableFuture<HttpResponseFor<DataExportDestinationDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DataExportDestinationDeleteResponse>> =
            delete(id, DataExportDestinationDeleteParams.none(), requestOptions)
    }
}
