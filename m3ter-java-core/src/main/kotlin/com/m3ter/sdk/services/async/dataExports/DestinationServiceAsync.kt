// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async.dataExports

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.DataExportDestinationCreateParams
import com.m3ter.sdk.models.DataExportDestinationCreateResponse
import com.m3ter.sdk.models.DataExportDestinationDeleteParams
import com.m3ter.sdk.models.DataExportDestinationDeleteResponse
import com.m3ter.sdk.models.DataExportDestinationListPageAsync
import com.m3ter.sdk.models.DataExportDestinationListParams
import com.m3ter.sdk.models.DataExportDestinationRetrieveParams
import com.m3ter.sdk.models.DataExportDestinationRetrieveResponse
import com.m3ter.sdk.models.DataExportDestinationUpdateParams
import com.m3ter.sdk.models.DataExportDestinationUpdateResponse
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
    fun retrieve(
        params: DataExportDestinationRetrieveParams
    ): CompletableFuture<DataExportDestinationRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DataExportDestinationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportDestinationRetrieveResponse>

    /**
     * Update an Export Destination for the given UUID.
     *
     * **NOTE:** Currently, only Export Destinations using an S3 bucket on your AWS Account are
     * supported.
     */
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
    fun list(
        params: DataExportDestinationListParams
    ): CompletableFuture<DataExportDestinationListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: DataExportDestinationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportDestinationListPageAsync>

    /**
     * Delete an Export Destination for the given UUID.
     *
     * **NOTE:** If you attempt to delete an Export Destination that is currently linked to a Data
     * Export Schedule, an error message is returned and you won't be able to delete the
     * Destination.
     */
    fun delete(
        params: DataExportDestinationDeleteParams
    ): CompletableFuture<DataExportDestinationDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: DataExportDestinationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportDestinationDeleteResponse>

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
            params: DataExportDestinationRetrieveParams
        ): CompletableFuture<HttpResponseFor<DataExportDestinationRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DataExportDestinationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataExportDestinationRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/dataexports/destinations/{id}`, but is otherwise the same as
         * [DestinationServiceAsync.update].
         */
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
        fun list(
            params: DataExportDestinationListParams
        ): CompletableFuture<HttpResponseFor<DataExportDestinationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DataExportDestinationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataExportDestinationListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/dataexports/destinations/{id}`, but is otherwise the same as
         * [DestinationServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: DataExportDestinationDeleteParams
        ): CompletableFuture<HttpResponseFor<DataExportDestinationDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: DataExportDestinationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataExportDestinationDeleteResponse>>
    }
}
