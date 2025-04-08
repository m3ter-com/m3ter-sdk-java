// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.dataExports

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.DataExportDestinationCreateParams
import com.m3ter.models.DataExportDestinationCreateResponse
import com.m3ter.models.DataExportDestinationDeleteParams
import com.m3ter.models.DataExportDestinationDeleteResponse
import com.m3ter.models.DataExportDestinationListPage
import com.m3ter.models.DataExportDestinationListParams
import com.m3ter.models.DataExportDestinationRetrieveParams
import com.m3ter.models.DataExportDestinationRetrieveResponse
import com.m3ter.models.DataExportDestinationUpdateParams
import com.m3ter.models.DataExportDestinationUpdateResponse

interface DestinationService {

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
    fun create(params: DataExportDestinationCreateParams): DataExportDestinationCreateResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: DataExportDestinationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportDestinationCreateResponse

    /** Retrieve an Export Destination for the given UUID. */
    fun retrieve(
        params: DataExportDestinationRetrieveParams
    ): DataExportDestinationRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DataExportDestinationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportDestinationRetrieveResponse

    /**
     * Update an Export Destination for the given UUID.
     *
     * **NOTE:** Currently, only Export Destinations using an S3 bucket on your AWS Account are
     * supported.
     */
    fun update(params: DataExportDestinationUpdateParams): DataExportDestinationUpdateResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: DataExportDestinationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportDestinationUpdateResponse

    /**
     * Retrieve a list of Export Destination entities. You can filter the list of Destinations
     * returned by UUID.
     */
    fun list(): DataExportDestinationListPage = list(DataExportDestinationListParams.none())

    /** @see [list] */
    fun list(
        params: DataExportDestinationListParams = DataExportDestinationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportDestinationListPage

    /** @see [list] */
    fun list(
        params: DataExportDestinationListParams = DataExportDestinationListParams.none()
    ): DataExportDestinationListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): DataExportDestinationListPage =
        list(DataExportDestinationListParams.none(), requestOptions)

    /**
     * Delete an Export Destination for the given UUID.
     *
     * **NOTE:** If you attempt to delete an Export Destination that is currently linked to a Data
     * Export Schedule, an error message is returned and you won't be able to delete the
     * Destination.
     */
    fun delete(params: DataExportDestinationDeleteParams): DataExportDestinationDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: DataExportDestinationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportDestinationDeleteResponse

    /**
     * A view of [DestinationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/dataexports/destinations`,
         * but is otherwise the same as [DestinationService.create].
         */
        @MustBeClosed
        fun create(
            params: DataExportDestinationCreateParams
        ): HttpResponseFor<DataExportDestinationCreateResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: DataExportDestinationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportDestinationCreateResponse>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/dataexports/destinations/{id}`, but is otherwise the same as
         * [DestinationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: DataExportDestinationRetrieveParams
        ): HttpResponseFor<DataExportDestinationRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DataExportDestinationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportDestinationRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/dataexports/destinations/{id}`, but is otherwise the same as
         * [DestinationService.update].
         */
        @MustBeClosed
        fun update(
            params: DataExportDestinationUpdateParams
        ): HttpResponseFor<DataExportDestinationUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: DataExportDestinationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportDestinationUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/dataexports/destinations`,
         * but is otherwise the same as [DestinationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<DataExportDestinationListPage> =
            list(DataExportDestinationListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DataExportDestinationListParams = DataExportDestinationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportDestinationListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DataExportDestinationListParams = DataExportDestinationListParams.none()
        ): HttpResponseFor<DataExportDestinationListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DataExportDestinationListPage> =
            list(DataExportDestinationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/dataexports/destinations/{id}`, but is otherwise the same as
         * [DestinationService.delete].
         */
        @MustBeClosed
        fun delete(
            params: DataExportDestinationDeleteParams
        ): HttpResponseFor<DataExportDestinationDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: DataExportDestinationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportDestinationDeleteResponse>
    }
}
