// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.dataExports

import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.DataExportScheduleCreateParams
import com.m3ter.models.DataExportScheduleCreateResponse
import com.m3ter.models.DataExportScheduleDeleteParams
import com.m3ter.models.DataExportScheduleDeleteResponse
import com.m3ter.models.DataExportScheduleListPageAsync
import com.m3ter.models.DataExportScheduleListParams
import com.m3ter.models.DataExportScheduleRetrieveParams
import com.m3ter.models.DataExportScheduleRetrieveResponse
import com.m3ter.models.DataExportScheduleUpdateParams
import com.m3ter.models.DataExportScheduleUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ScheduleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScheduleServiceAsync

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
    fun create(
        params: DataExportScheduleCreateParams
    ): CompletableFuture<DataExportScheduleCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DataExportScheduleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportScheduleCreateResponse>

    /**
     * Retrieve a Data Export Schedule for the given UUID. Each Schedule can be configured for
     * exporting *only one* of either Usage or Operational data.
     */
    fun retrieve(id: String): CompletableFuture<DataExportScheduleRetrieveResponse> =
        retrieve(id, DataExportScheduleRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DataExportScheduleRetrieveParams = DataExportScheduleRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportScheduleRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DataExportScheduleRetrieveParams = DataExportScheduleRetrieveParams.none(),
    ): CompletableFuture<DataExportScheduleRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DataExportScheduleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportScheduleRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: DataExportScheduleRetrieveParams
    ): CompletableFuture<DataExportScheduleRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataExportScheduleRetrieveResponse> =
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
    ): CompletableFuture<DataExportScheduleUpdateResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: DataExportScheduleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportScheduleUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: DataExportScheduleUpdateParams
    ): CompletableFuture<DataExportScheduleUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DataExportScheduleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportScheduleUpdateResponse>

    /**
     * Retrieve a list of Data Export Schedules created for your Organization. You can filter the
     * response by Schedules `ids`.
     *
     * The response will contain an array for both the operational and usage Data Export Schedules
     * in your Organization.
     */
    fun list(): CompletableFuture<DataExportScheduleListPageAsync> =
        list(DataExportScheduleListParams.none())

    /** @see list */
    fun list(
        params: DataExportScheduleListParams = DataExportScheduleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportScheduleListPageAsync>

    /** @see list */
    fun list(
        params: DataExportScheduleListParams = DataExportScheduleListParams.none()
    ): CompletableFuture<DataExportScheduleListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<DataExportScheduleListPageAsync> =
        list(DataExportScheduleListParams.none(), requestOptions)

    /**
     * Delete the Data Export Schedule for the given UUID. Each Schedule can be configured for
     * exporting *only one* of either Usage or Operational data.
     */
    fun delete(id: String): CompletableFuture<DataExportScheduleDeleteResponse> =
        delete(id, DataExportScheduleDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: DataExportScheduleDeleteParams = DataExportScheduleDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportScheduleDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: DataExportScheduleDeleteParams = DataExportScheduleDeleteParams.none(),
    ): CompletableFuture<DataExportScheduleDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DataExportScheduleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportScheduleDeleteResponse>

    /** @see delete */
    fun delete(
        params: DataExportScheduleDeleteParams
    ): CompletableFuture<DataExportScheduleDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataExportScheduleDeleteResponse> =
        delete(id, DataExportScheduleDeleteParams.none(), requestOptions)

    /**
     * A view of [ScheduleServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ScheduleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/dataexports/schedules`, but
         * is otherwise the same as [ScheduleServiceAsync.create].
         */
        fun create(
            params: DataExportScheduleCreateParams
        ): CompletableFuture<HttpResponseFor<DataExportScheduleCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DataExportScheduleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataExportScheduleCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/dataexports/schedules/{id}`,
         * but is otherwise the same as [ScheduleServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<DataExportScheduleRetrieveResponse>> =
            retrieve(id, DataExportScheduleRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: DataExportScheduleRetrieveParams = DataExportScheduleRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataExportScheduleRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: DataExportScheduleRetrieveParams = DataExportScheduleRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<DataExportScheduleRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DataExportScheduleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataExportScheduleRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: DataExportScheduleRetrieveParams
        ): CompletableFuture<HttpResponseFor<DataExportScheduleRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DataExportScheduleRetrieveResponse>> =
            retrieve(id, DataExportScheduleRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/dataexports/schedules/{id}`,
         * but is otherwise the same as [ScheduleServiceAsync.update].
         */
        fun update(
            id: String,
            params: DataExportScheduleUpdateParams,
        ): CompletableFuture<HttpResponseFor<DataExportScheduleUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: DataExportScheduleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataExportScheduleUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: DataExportScheduleUpdateParams
        ): CompletableFuture<HttpResponseFor<DataExportScheduleUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: DataExportScheduleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataExportScheduleUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/dataexports/schedules`, but
         * is otherwise the same as [ScheduleServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DataExportScheduleListPageAsync>> =
            list(DataExportScheduleListParams.none())

        /** @see list */
        fun list(
            params: DataExportScheduleListParams = DataExportScheduleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataExportScheduleListPageAsync>>

        /** @see list */
        fun list(
            params: DataExportScheduleListParams = DataExportScheduleListParams.none()
        ): CompletableFuture<HttpResponseFor<DataExportScheduleListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DataExportScheduleListPageAsync>> =
            list(DataExportScheduleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/dataexports/schedules/{id}`, but is otherwise the same as
         * [ScheduleServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<DataExportScheduleDeleteResponse>> =
            delete(id, DataExportScheduleDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: DataExportScheduleDeleteParams = DataExportScheduleDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataExportScheduleDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: DataExportScheduleDeleteParams = DataExportScheduleDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<DataExportScheduleDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DataExportScheduleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataExportScheduleDeleteResponse>>

        /** @see delete */
        fun delete(
            params: DataExportScheduleDeleteParams
        ): CompletableFuture<HttpResponseFor<DataExportScheduleDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DataExportScheduleDeleteResponse>> =
            delete(id, DataExportScheduleDeleteParams.none(), requestOptions)
    }
}
