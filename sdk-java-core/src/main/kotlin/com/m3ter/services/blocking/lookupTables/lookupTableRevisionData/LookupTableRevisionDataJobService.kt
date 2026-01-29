// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.lookupTables.lookupTableRevisionData

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteParams
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPage
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveParams
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
import java.util.function.Consumer

interface LookupTableRevisionDataJobService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LookupTableRevisionDataJobService

    /**
     * Get the Lookup Table Revision Data job Response for given job id.
     *
     * **NOTE:** Use the
     * [List LookupTableRevisionData Jobs](https://www.m3ter.com/docs/api#tag/LookupTableRevisionData/operation/ListLookupTableRevisionDataJobs)
     * endpoint to list the Data job Responses for a specific Revision.
     */
    fun retrieve(
        id: String,
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveParams,
    ): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveParams
    ): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse

    /**
     * List the Lookup Table Revision Data job Responses for the given Lookup Table Revision.
     *
     * There are four types of Revision Data jobs:
     * * **COPY**. Job runs when you use the
     *   [Copy LookupTableRevisionData](https://www.m3ter.com/docs/api#tag/LookupTableRevisionData/operation/CopyLookupTableRevisionData)
     *   endpoint which returns the `jobId`.
     * * **UPLOAD**. Job runs when you use the
     *   [Generate LookupTableRevisionData Upload URL](https://www.m3ter.com/docs/api#tag/LookupTableRevisionData/operation/GenerateLookupTableDataUploadUrl)
     *   endpoint which returns the `jobId`.
     * * **DOWNLOAD**. Job runs when you use the
     *   [](https://www.m3ter.com/docs/api#tag/LookupTableRevisionData/operation/TriggerLookupTableRevisionDataDownloadJob)
     *   endpoint which returns the `jobId`.
     * * **ARCHIVE**. Job runs when you either manually change a DRAFT Revision to PUBLISHED using
     *   the
     *   [Update LookupTableRevision Status](https://www.m3ter.com/docs/api#tag/LookupTableRevision/operation/UpdateLookupTableRevisionStatus)
     *   endpoint or you publish a DRAFT Revision and the existing PUBLISHED Revision is archived.
     *
     * **NOTE:** This endpoint returns the id of each Data job. You then use:
     * * The [Get LookupTableRevisionData Job Response](https://www.m3ter.com/docs/api#tag/LookupTableRevisionData/operation/GetLookupTableRevisionDataJobResponse)
     *   endpoint to retrieve a specific Data job Response.
     * * The [Delete LookupTableRevisionData Job Response](https://www.m3ter.com/docs/api#tag/LookupTableRevisionData/operation/DeleteLookupTableRevisionDataJobResponse)
     *   to delete a specific Data job Response.
     */
    fun list(
        lookupTableRevisionId: String,
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams,
    ): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPage =
        list(lookupTableRevisionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        lookupTableRevisionId: String,
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPage =
        list(
            params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
            requestOptions,
        )

    /** @see list */
    fun list(
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams
    ): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPage

    /**
     * Delete the LookupTableRevisionData Job Response for given job id.
     *
     * **NOTE:** Use the
     * [List LookupTableRevisionData Jobs](https://www.m3ter.com/docs/api#tag/LookupTableRevisionData/operation/ListLookupTableRevisionDataJobs)
     * endpoint to list the Data job Responses for a specific Revision.
     */
    fun delete(
        id: String,
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteParams,
    ): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteParams
    ): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse

    /**
     * Trigger an URL job to download the Lookup Table Revision Data. The URL download Data `jobId`
     * is returned and you can then use the
     * [List LookupTableRevisionData Jobs](https://www.m3ter.com/docs/api#tag/LookupTableRevisionData/operation/ListLookupTableRevisionDataJobs)
     * endpoint or the
     * [Get LookupTableRevisionData Job Response](https://www.m3ter.com/docs/api#tag/LookupTableRevisionData/operation/GetLookupTableRevisionDataJobResponse)
     * endpoint to retrieve the URL and perform the Revision data Download.
     */
    fun download(
        lookupTableRevisionId: String,
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams,
    ): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse =
        download(lookupTableRevisionId, params, RequestOptions.none())

    /** @see download */
    fun download(
        lookupTableRevisionId: String,
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse =
        download(
            params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
            requestOptions,
        )

    /** @see download */
    fun download(
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams
    ): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse =
        download(params, RequestOptions.none())

    /** @see download */
    fun download(
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse

    /**
     * A view of [LookupTableRevisionDataJobService] that provides access to raw HTTP responses for
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
        ): LookupTableRevisionDataJobService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/jobs/{id}`,
         * but is otherwise the same as [LookupTableRevisionDataJobService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveParams,
        ): HttpResponseFor<
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
        > = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
        > = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveParams
        ): HttpResponseFor<
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
        > = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
        >

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/jobs`,
         * but is otherwise the same as [LookupTableRevisionDataJobService.list].
         */
        @MustBeClosed
        fun list(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams,
        ): HttpResponseFor<LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPage> =
            list(lookupTableRevisionId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPage> =
            list(
                params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
                requestOptions,
            )

        /** @see list */
        @MustBeClosed
        fun list(
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams
        ): HttpResponseFor<LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPage>

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/jobs/{id}`,
         * but is otherwise the same as [LookupTableRevisionDataJobService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteParams,
        ): HttpResponseFor<
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse
        > = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse
        > = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteParams
        ): HttpResponseFor<
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse
        > = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse
        >

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/jobs/download`,
         * but is otherwise the same as [LookupTableRevisionDataJobService.download].
         */
        @MustBeClosed
        fun download(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams,
        ): HttpResponseFor<
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse
        > = download(lookupTableRevisionId, params, RequestOptions.none())

        /** @see download */
        @MustBeClosed
        fun download(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse
        > =
            download(
                params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
                requestOptions,
            )

        /** @see download */
        @MustBeClosed
        fun download(
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams
        ): HttpResponseFor<
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse
        > = download(params, RequestOptions.none())

        /** @see download */
        @MustBeClosed
        fun download(
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse
        >
    }
}
