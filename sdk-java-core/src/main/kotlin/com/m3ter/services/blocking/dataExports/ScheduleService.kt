// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.dataExports

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
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
import java.util.function.Consumer

interface ScheduleService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScheduleService

    /**
     * Create a new Data Export Schedule. Each Schedule can be configured for exporting *only one*
     * of either Usage or Operational data:
     *
     * **Operational Data Exports**.
     * * Use the `operationalDataTypes` parameter to specify the entities whose operational data you
     *   want to include in the export each time the Export Schedule runs.
     * * For each of the entity types you select, each time the Export Schedule runs a separate file
     *   is compiled containing the operational data for all entities of that type that exist in
     *   your Organization
     *
     * **Usage Data Exports**.
     * * Select the Meters and Accounts whose usage data you want to include in the export each time
     *   the Export Schedule runs.
     * * You can use the `dimensionFilters` parameter to filter the usage data returned for export
     *   by adding specific values of non-numeric Dimension data fields on included Meters. Only the
     *   data collected for the values you've added for the selected Dimension fields will be
     *   included in the export.
     * * You can use the `aggregations` to apply aggregation methods the usage data returned for
     *   export. This restricts the range of usage data returned for export to only the data
     *   collected by aggregated fields on selected Meters. Nothing is returned for any
     *   non-aggregated fields on Meters. The usage data for Meter fields is returned as the values
     *   resulting from applying the selected aggregation method. See the
     *   [Aggregations for Queries - Options and Consequences](https://www.m3ter.com/docs/guides/data-explorer/usage-data-explorer-v2#aggregations-for-queries---understanding-options-and-consequences)
     *   for more details.
     * * If you've applied `aggregations` to the usage returned for export, you can then use the
     *   `groups` parameter to group the data by *Account*, *Dimension*, or *Time*.
     *
     * Request and Response schema:
     * * Use the selector under the `sourceType` parameter to expose the relevant request and
     *   response schema for the source data type.
     *
     * Request and Response samples:
     * * Use the **Example** selector to show the relevant request and response samples for source
     *   data type.
     */
    fun create(params: DataExportScheduleCreateParams): DataExportScheduleCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DataExportScheduleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportScheduleCreateResponse

    /**
     * Retrieve a Data Export Schedule for the given UUID. Each Schedule can be configured for
     * exporting *only one* of either Usage or Operational data.
     */
    fun retrieve(id: String): DataExportScheduleRetrieveResponse =
        retrieve(id, DataExportScheduleRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DataExportScheduleRetrieveParams = DataExportScheduleRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportScheduleRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DataExportScheduleRetrieveParams = DataExportScheduleRetrieveParams.none(),
    ): DataExportScheduleRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DataExportScheduleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportScheduleRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: DataExportScheduleRetrieveParams): DataExportScheduleRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): DataExportScheduleRetrieveResponse =
        retrieve(id, DataExportScheduleRetrieveParams.none(), requestOptions)

    /**
     * Update a Data Export Schedule for the given UUID. Each Schedule can be configured for
     * exporting *only one* of either Usage or Operational data:
     *
     * **Operational Data Exports**.
     * * Use the `operationalDataTypes` parameter to specify the entities whose operational data you
     *   want to include in the export each time the Export Schedule runs.
     * * For each of the entity types you select, each time the Export Schedule runs a separate file
     *   is compiled containing the operational data for all entities of that type that exist in
     *   your Organization
     *
     * **Usage Data Exports**.
     * * Select the Meters and Accounts whose usage data you want to include in the export each time
     *   the Export Schedule runs.
     * * You can use the `dimensionFilters` parameter to filter the usage data returned for export
     *   by adding specific values of non-numeric Dimension data fields on included Meters. Only the
     *   data collected for the values you've added for the selected Dimension fields will be
     *   included in the export.
     * * You can use the `aggregations` to apply aggregation methods the usage data returned for
     *   export. This restricts the range of usage data returned for export to only the data
     *   collected by aggregated fields on selected Meters. Nothing is returned for any
     *   non-aggregated fields on Meters. The usage data for Meter fields is returned as the values
     *   resulting from applying the selected aggregation method. See the
     *   [Aggregations for Queries - Options and Consequences](https://www.m3ter.com/docs/guides/data-explorer/usage-data-explorer-v2#aggregations-for-queries---understanding-options-and-consequences)
     *   for more details.
     * * If you've applied `aggregations` to the usage returned for export, you can then use the
     *   `groups` parameter to group the data by *Account*, *Dimension*, or *Time*.
     */
    fun update(
        id: String,
        params: DataExportScheduleUpdateParams,
    ): DataExportScheduleUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: DataExportScheduleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportScheduleUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: DataExportScheduleUpdateParams): DataExportScheduleUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
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

    /** @see list */
    fun list(
        params: DataExportScheduleListParams = DataExportScheduleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportScheduleListPage

    /** @see list */
    fun list(
        params: DataExportScheduleListParams = DataExportScheduleListParams.none()
    ): DataExportScheduleListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): DataExportScheduleListPage =
        list(DataExportScheduleListParams.none(), requestOptions)

    /**
     * Delete the Data Export Schedule for the given UUID. Each Schedule can be configured for
     * exporting *only one* of either Usage or Operational data.
     */
    fun delete(id: String): DataExportScheduleDeleteResponse =
        delete(id, DataExportScheduleDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: DataExportScheduleDeleteParams = DataExportScheduleDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportScheduleDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: DataExportScheduleDeleteParams = DataExportScheduleDeleteParams.none(),
    ): DataExportScheduleDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DataExportScheduleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportScheduleDeleteResponse

    /** @see delete */
    fun delete(params: DataExportScheduleDeleteParams): DataExportScheduleDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): DataExportScheduleDeleteResponse =
        delete(id, DataExportScheduleDeleteParams.none(), requestOptions)

    /** A view of [ScheduleService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScheduleService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/dataexports/schedules`, but
         * is otherwise the same as [ScheduleService.create].
         */
        @MustBeClosed
        fun create(
            params: DataExportScheduleCreateParams
        ): HttpResponseFor<DataExportScheduleCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
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

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DataExportScheduleRetrieveParams = DataExportScheduleRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportScheduleRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DataExportScheduleRetrieveParams = DataExportScheduleRetrieveParams.none(),
        ): HttpResponseFor<DataExportScheduleRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DataExportScheduleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportScheduleRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DataExportScheduleRetrieveParams
        ): HttpResponseFor<DataExportScheduleRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
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

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: DataExportScheduleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportScheduleUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: DataExportScheduleUpdateParams
        ): HttpResponseFor<DataExportScheduleUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
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

        /** @see list */
        @MustBeClosed
        fun list(
            params: DataExportScheduleListParams = DataExportScheduleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportScheduleListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DataExportScheduleListParams = DataExportScheduleListParams.none()
        ): HttpResponseFor<DataExportScheduleListPage> = list(params, RequestOptions.none())

        /** @see list */
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

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: DataExportScheduleDeleteParams = DataExportScheduleDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportScheduleDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: DataExportScheduleDeleteParams = DataExportScheduleDeleteParams.none(),
        ): HttpResponseFor<DataExportScheduleDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DataExportScheduleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportScheduleDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DataExportScheduleDeleteParams
        ): HttpResponseFor<DataExportScheduleDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataExportScheduleDeleteResponse> =
            delete(id, DataExportScheduleDeleteParams.none(), requestOptions)
    }
}
