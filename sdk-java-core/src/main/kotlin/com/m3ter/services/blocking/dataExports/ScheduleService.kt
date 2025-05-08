// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.dataExports

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.DataExportScheduleCreateParams
import com.m3ter.models.DataExportScheduleCreateResponse
import com.m3ter.models.DataExportScheduleDeleteParams
import com.m3ter.models.DataExportScheduleDeleteResponse
import com.m3ter.models.DataExportScheduleListPage
import com.m3ter.models.DataExportScheduleListParams
import com.m3ter.models.DataExportScheduleRetrieveParams
import com.m3ter.models.DataExportScheduleRetrieveResponse
import com.m3ter.models.DataExportScheduleUpdateParams
import com.m3ter.models.DataExportScheduleUpdateResponse

interface ScheduleService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new Data Export Schedule. Each Schedule can be configured for exporting _only one_
     * of either Usage or Operational data:
     *
     * **Operational Data Exports**.
     * - Use the `operationalDataTypes` parameter to specify the entities whose operational data you
     *   want to include in the export each time the Export Schedule runs.
     * - For each of the entity types you select, each time the Export Schedule runs a separate file
     *   is compiled containing the operational data for all entities of that type that exist in
     *   your Organization
     *
     * **Usage Data Exports**.
     * - Select the Meters and Accounts whose usage data you want to include in the export each time
     *   the Export Schedule runs.
     * - If _don't want to aggregate_ the usage data collected by the selected Meters, use
     *   **ORIGINAL** for `aggregationFrequency`, which is the _default_. This means the raw usage
     *   data collected by any type of Data Fields and the values for any Derived Fields on the
     *   selected Meters will be included in the export.
     * - If you _do want to aggregate_ the usage data collected by the selected Meters, use one of
     *   the other options for `aggregationFrequency`: **HOUR**, **DAY**, **WEEK**, or **MONTH**.
     *   You _must_ then also specified an `aggregation` method to be used on the usage data before
     *   export. Importantly, if you do aggregate usage data, only the usage data collected by any
     *   numeric Data Fields on the selected Meters - those of type **MEASURE**, **INCOME**, or
     *   **COST** - will be included in the export each time the Export Schedule runs.
     */
    fun create(params: DataExportScheduleCreateParams): DataExportScheduleCreateResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: DataExportScheduleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportScheduleCreateResponse

    /**
     * Retrieve a Data Export Schedule for the given UUID. Each Schedule can be configured for
     * exporting _only one_ of either Usage or Operational data.
     */
    fun retrieve(id: String): DataExportScheduleRetrieveResponse =
        retrieve(id, DataExportScheduleRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: DataExportScheduleRetrieveParams = DataExportScheduleRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportScheduleRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: DataExportScheduleRetrieveParams = DataExportScheduleRetrieveParams.none(),
    ): DataExportScheduleRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DataExportScheduleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportScheduleRetrieveResponse

    /** @see [retrieve] */
    fun retrieve(params: DataExportScheduleRetrieveParams): DataExportScheduleRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): DataExportScheduleRetrieveResponse =
        retrieve(id, DataExportScheduleRetrieveParams.none(), requestOptions)

    /**
     * Update a Data Export Schedule for the given UUID. Each Schedule can be configured for
     * exporting _only one_ of either Usage or Operational data:
     *
     * **Operational Data Exports**.
     * - Use the `operationalDataTypes` parameter to specify the entities whose operational data you
     *   want to include in the export each time the Export Schedule runs.
     * - For each of the entity types you select, each time the Export Schedule runs a separate file
     *   is compiled containing the operational data for all entities of that type that exist in
     *   your Organization
     *
     * **Usage Data Exports**.
     * - Select the Meters and Accounts whose usage data you want to include in the export each time
     *   the Export Schedule runs.
     * - If _don't want to aggregate_ the usage data collected by the selected Meters, use
     *   **ORIGINAL** for `aggregationFrequency`, which is the _default_. This means the raw usage
     *   data collected by any type of Data Fields and the values for any Derived Fields on the
     *   selected Meters will be included in the export.
     * - If you _do want to aggregate_ the usage data collected by the selected Meters, use one of
     *   the other options for `aggregationFrequency`: **HOUR**, **DAY**, **WEEK**, or **MONTH**.
     *   You _must_ then also specified an `aggregation` method to be used on the usage data before
     *   export. Importantly, if you do aggregate usage data, only the usage data collected by any
     *   numeric Data Fields on the selected Meters - those of type **MEASURE**, **INCOME**, or
     *   **COST** - will be included in the export each time the Export Schedule runs.
     */
    fun update(
        id: String,
        params: DataExportScheduleUpdateParams,
    ): DataExportScheduleUpdateResponse = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: DataExportScheduleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportScheduleUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(params: DataExportScheduleUpdateParams): DataExportScheduleUpdateResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: DataExportScheduleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportScheduleUpdateResponse

    /**
     * Retrieve a list of Data Export Schedules created for your Organization. You can filter the
     * response by Schedules `ids`.
     *
     * The response will contain an array for both the operational and usage Data Export Schedules
     * in your Organization.
     */
    fun list(): DataExportScheduleListPage = list(DataExportScheduleListParams.none())

    /** @see [list] */
    fun list(
        params: DataExportScheduleListParams = DataExportScheduleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportScheduleListPage

    /** @see [list] */
    fun list(
        params: DataExportScheduleListParams = DataExportScheduleListParams.none()
    ): DataExportScheduleListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): DataExportScheduleListPage =
        list(DataExportScheduleListParams.none(), requestOptions)

    /**
     * Delete the Data Export Schedule for the given UUID. Each Schedule can be configured for
     * exporting _only one_ of either Usage or Operational data.
     */
    fun delete(id: String): DataExportScheduleDeleteResponse =
        delete(id, DataExportScheduleDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: DataExportScheduleDeleteParams = DataExportScheduleDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportScheduleDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: DataExportScheduleDeleteParams = DataExportScheduleDeleteParams.none(),
    ): DataExportScheduleDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: DataExportScheduleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportScheduleDeleteResponse

    /** @see [delete] */
    fun delete(params: DataExportScheduleDeleteParams): DataExportScheduleDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): DataExportScheduleDeleteResponse =
        delete(id, DataExportScheduleDeleteParams.none(), requestOptions)

    /** A view of [ScheduleService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/dataexports/schedules`, but
         * is otherwise the same as [ScheduleService.create].
         */
        @MustBeClosed
        fun create(
            params: DataExportScheduleCreateParams
        ): HttpResponseFor<DataExportScheduleCreateResponse> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: DataExportScheduleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportScheduleCreateResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/dataexports/schedules/{id}`,
         * but is otherwise the same as [ScheduleService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<DataExportScheduleRetrieveResponse> =
            retrieve(id, DataExportScheduleRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DataExportScheduleRetrieveParams = DataExportScheduleRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportScheduleRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DataExportScheduleRetrieveParams = DataExportScheduleRetrieveParams.none(),
        ): HttpResponseFor<DataExportScheduleRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DataExportScheduleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportScheduleRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DataExportScheduleRetrieveParams
        ): HttpResponseFor<DataExportScheduleRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataExportScheduleRetrieveResponse> =
            retrieve(id, DataExportScheduleRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/dataexports/schedules/{id}`,
         * but is otherwise the same as [ScheduleService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: DataExportScheduleUpdateParams,
        ): HttpResponseFor<DataExportScheduleUpdateResponse> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: DataExportScheduleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportScheduleUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: DataExportScheduleUpdateParams
        ): HttpResponseFor<DataExportScheduleUpdateResponse> = update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: DataExportScheduleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportScheduleUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/dataexports/schedules`, but
         * is otherwise the same as [ScheduleService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<DataExportScheduleListPage> =
            list(DataExportScheduleListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DataExportScheduleListParams = DataExportScheduleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportScheduleListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DataExportScheduleListParams = DataExportScheduleListParams.none()
        ): HttpResponseFor<DataExportScheduleListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DataExportScheduleListPage> =
            list(DataExportScheduleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/dataexports/schedules/{id}`, but is otherwise the same as
         * [ScheduleService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<DataExportScheduleDeleteResponse> =
            delete(id, DataExportScheduleDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: DataExportScheduleDeleteParams = DataExportScheduleDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportScheduleDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: DataExportScheduleDeleteParams = DataExportScheduleDeleteParams.none(),
        ): HttpResponseFor<DataExportScheduleDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: DataExportScheduleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportScheduleDeleteResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: DataExportScheduleDeleteParams
        ): HttpResponseFor<DataExportScheduleDeleteResponse> = delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataExportScheduleDeleteResponse> =
            delete(id, DataExportScheduleDeleteParams.none(), requestOptions)
    }
}
