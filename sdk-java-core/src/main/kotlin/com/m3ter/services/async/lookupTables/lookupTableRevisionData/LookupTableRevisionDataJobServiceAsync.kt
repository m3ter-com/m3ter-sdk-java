// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.lookupTables.lookupTableRevisionData

import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteParams
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageAsync
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveParams
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LookupTableRevisionDataJobServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): LookupTableRevisionDataJobServiceAsync

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
    ): CompletableFuture<
        LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
    > = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<
        LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
    > = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveParams
    ): CompletableFuture<
        LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
    > = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<
        LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
    >

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
    ): CompletableFuture<
        LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageAsync
    > = list(lookupTableRevisionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        lookupTableRevisionId: String,
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<
        LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageAsync
    > =
        list(
            params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
            requestOptions,
        )

    /** @see list */
    fun list(
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams
    ): CompletableFuture<
        LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageAsync
    > = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageAsync>

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
    ): CompletableFuture<
        LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse
    > = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<
        LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse
    > = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteParams
    ): CompletableFuture<
        LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse
    > = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse>

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
    ): CompletableFuture<
        LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse
    > = download(lookupTableRevisionId, params, RequestOptions.none())

    /** @see download */
    fun download(
        lookupTableRevisionId: String,
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<
        LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse
    > =
        download(
            params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
            requestOptions,
        )

    /** @see download */
    fun download(
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams
    ): CompletableFuture<
        LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse
    > = download(params, RequestOptions.none())

    /** @see download */
    fun download(
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<
        LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse
    >

    /**
     * A view of [LookupTableRevisionDataJobServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LookupTableRevisionDataJobServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/jobs/{id}`,
         * but is otherwise the same as [LookupTableRevisionDataJobServiceAsync.retrieve].
         */
        fun retrieve(
            id: String,
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveParams,
        ): CompletableFuture<
            HttpResponseFor<
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
            >
        > = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
            >
        > = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveParams
        ): CompletableFuture<
            HttpResponseFor<
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
            >
        > = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
            >
        >

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/jobs`,
         * but is otherwise the same as [LookupTableRevisionDataJobServiceAsync.list].
         */
        fun list(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams,
        ): CompletableFuture<
            HttpResponseFor<
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageAsync
            >
        > = list(lookupTableRevisionId, params, RequestOptions.none())

        /** @see list */
        fun list(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageAsync
            >
        > =
            list(
                params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
                requestOptions,
            )

        /** @see list */
        fun list(
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams
        ): CompletableFuture<
            HttpResponseFor<
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageAsync
            >
        > = list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageAsync
            >
        >

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/jobs/{id}`,
         * but is otherwise the same as [LookupTableRevisionDataJobServiceAsync.delete].
         */
        fun delete(
            id: String,
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteParams,
        ): CompletableFuture<
            HttpResponseFor<
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse
            >
        > = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse
            >
        > = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteParams
        ): CompletableFuture<
            HttpResponseFor<
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse
            >
        > = delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse
            >
        >

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/jobs/download`,
         * but is otherwise the same as [LookupTableRevisionDataJobServiceAsync.download].
         */
        fun download(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams,
        ): CompletableFuture<
            HttpResponseFor<
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse
            >
        > = download(lookupTableRevisionId, params, RequestOptions.none())

        /** @see download */
        fun download(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse
            >
        > =
            download(
                params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
                requestOptions,
            )

        /** @see download */
        fun download(
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams
        ): CompletableFuture<
            HttpResponseFor<
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse
            >
        > = download(params, RequestOptions.none())

        /** @see download */
        fun download(
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse
            >
        >
    }
}
