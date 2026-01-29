// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.lookupTables

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.LookupTableLookupTableRevisionDataArchieveParams
import com.m3ter.models.LookupTableLookupTableRevisionDataArchieveResponse
import com.m3ter.models.LookupTableLookupTableRevisionDataCopyParams
import com.m3ter.models.LookupTableLookupTableRevisionDataCopyResponse
import com.m3ter.models.LookupTableLookupTableRevisionDataDeleteKeyParams
import com.m3ter.models.LookupTableLookupTableRevisionDataDeleteKeyResponse
import com.m3ter.models.LookupTableLookupTableRevisionDataDeleteParams
import com.m3ter.models.LookupTableLookupTableRevisionDataDeleteResponse
import com.m3ter.models.LookupTableLookupTableRevisionDataGenerateDownloadUrlParams
import com.m3ter.models.LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse
import com.m3ter.models.LookupTableLookupTableRevisionDataRetrieveKeyParams
import com.m3ter.models.LookupTableLookupTableRevisionDataRetrieveKeyResponse
import com.m3ter.models.LookupTableLookupTableRevisionDataRetrieveParams
import com.m3ter.models.LookupTableLookupTableRevisionDataRetrieveResponse
import com.m3ter.models.LookupTableLookupTableRevisionDataUpdateKeyParams
import com.m3ter.models.LookupTableLookupTableRevisionDataUpdateKeyResponse
import com.m3ter.models.LookupTableLookupTableRevisionDataUpdateParams
import com.m3ter.models.LookupTableLookupTableRevisionDataUpdateResponse
import com.m3ter.services.blocking.lookupTables.lookupTableRevisionData.LookupTableRevisionDataJobService
import java.util.function.Consumer

interface LookupTableRevisionDataService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LookupTableRevisionDataService

    fun lookupTableRevisionDataJobs(): LookupTableRevisionDataJobService

    /** List Lookup Table Revision Data items for the given UUID. */
    fun retrieve(
        lookupTableRevisionId: String,
        params: LookupTableLookupTableRevisionDataRetrieveParams,
    ): LookupTableLookupTableRevisionDataRetrieveResponse =
        retrieve(lookupTableRevisionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        lookupTableRevisionId: String,
        params: LookupTableLookupTableRevisionDataRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableLookupTableRevisionDataRetrieveResponse =
        retrieve(
            params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        params: LookupTableLookupTableRevisionDataRetrieveParams
    ): LookupTableLookupTableRevisionDataRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LookupTableLookupTableRevisionDataRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableLookupTableRevisionDataRetrieveResponse

    /** Create/update the Lookup Table Revision Data for the given UUID. */
    fun update(
        lookupTableRevisionId: String,
        params: LookupTableLookupTableRevisionDataUpdateParams,
    ): LookupTableLookupTableRevisionDataUpdateResponse =
        update(lookupTableRevisionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        lookupTableRevisionId: String,
        params: LookupTableLookupTableRevisionDataUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableLookupTableRevisionDataUpdateResponse =
        update(
            params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
            requestOptions,
        )

    /** @see update */
    fun update(
        params: LookupTableLookupTableRevisionDataUpdateParams
    ): LookupTableLookupTableRevisionDataUpdateResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LookupTableLookupTableRevisionDataUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableLookupTableRevisionDataUpdateResponse

    /** Delete the Lookup Table Revision Data for the given UUID. */
    fun delete(
        lookupTableRevisionId: String,
        params: LookupTableLookupTableRevisionDataDeleteParams,
    ): LookupTableLookupTableRevisionDataDeleteResponse =
        delete(lookupTableRevisionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        lookupTableRevisionId: String,
        params: LookupTableLookupTableRevisionDataDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableLookupTableRevisionDataDeleteResponse =
        delete(
            params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
            requestOptions,
        )

    /** @see delete */
    fun delete(
        params: LookupTableLookupTableRevisionDataDeleteParams
    ): LookupTableLookupTableRevisionDataDeleteResponse = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LookupTableLookupTableRevisionDataDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableLookupTableRevisionDataDeleteResponse

    /**
     * Get a URL which you can use to download the data for the specified archived Lookup Table
     * Revision:
     * * The `contentType` request parameter is required.
     * * The returned URL is presigned - you can copy it into a browser and the data file is
     *   downloaded locally.
     * * The upload URL is time limited - the `expiry` time is given in the response and the URL is
     *   valid for ***one hour***.
     */
    fun archieve(
        lookupTableRevisionId: String,
        params: LookupTableLookupTableRevisionDataArchieveParams,
    ): LookupTableLookupTableRevisionDataArchieveResponse =
        archieve(lookupTableRevisionId, params, RequestOptions.none())

    /** @see archieve */
    fun archieve(
        lookupTableRevisionId: String,
        params: LookupTableLookupTableRevisionDataArchieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableLookupTableRevisionDataArchieveResponse =
        archieve(
            params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
            requestOptions,
        )

    /** @see archieve */
    fun archieve(
        params: LookupTableLookupTableRevisionDataArchieveParams
    ): LookupTableLookupTableRevisionDataArchieveResponse = archieve(params, RequestOptions.none())

    /** @see archieve */
    fun archieve(
        params: LookupTableLookupTableRevisionDataArchieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableLookupTableRevisionDataArchieveResponse

    /**
     * Copy the Lookup Table Revision Data from a source Revision to an optional target Revision:
     * * If you omit a target `revisionId`, then the source Revision and its Data is duplicated. The
     *   new Revision is given the source Revision's name appended with "Copy" but is assigned a new
     *   unique id.
     * * If you specify a target `revisionId` to copy the source Revision and its Data to, you must
     *   ensure that the target Revision has a Data schema that matches the source Revision's Data
     *   schema otherwise you'll receive an error
     */
    fun copy(
        lookupTableRevisionId: String,
        params: LookupTableLookupTableRevisionDataCopyParams,
    ): LookupTableLookupTableRevisionDataCopyResponse =
        copy(lookupTableRevisionId, params, RequestOptions.none())

    /** @see copy */
    fun copy(
        lookupTableRevisionId: String,
        params: LookupTableLookupTableRevisionDataCopyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableLookupTableRevisionDataCopyResponse =
        copy(
            params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
            requestOptions,
        )

    /** @see copy */
    fun copy(
        params: LookupTableLookupTableRevisionDataCopyParams
    ): LookupTableLookupTableRevisionDataCopyResponse = copy(params, RequestOptions.none())

    /** @see copy */
    fun copy(
        params: LookupTableLookupTableRevisionDataCopyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableLookupTableRevisionDataCopyResponse

    /**
     * Delete a Lookup Table Revision Data entry by lookup key.
     *
     * **NOTES:**
     * * To obtain the lookup key for a Revision's data items, use the
     *   [Get LookupTableRevisionData](https://www.m3ter.com/docs/api#tag/LookupTableRevisionData/operation/GetLookupTableRevisionData)
     *   endpoint in this section and use the `additional=lookupKey` query parameter.
     * * If the Revision's Data schema uses multiple key fields, enter these as a comma-separated
     *   list for the `lookupKey` path parameter: .../key1,key2,key3 and so on. Importantly,
     *   multiple keys must be *entered in the same order* as they are configured in the Revision's
     *   Data schema.
     */
    fun deleteKey(
        lookupKey: String,
        params: LookupTableLookupTableRevisionDataDeleteKeyParams,
    ): LookupTableLookupTableRevisionDataDeleteKeyResponse =
        deleteKey(lookupKey, params, RequestOptions.none())

    /** @see deleteKey */
    fun deleteKey(
        lookupKey: String,
        params: LookupTableLookupTableRevisionDataDeleteKeyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableLookupTableRevisionDataDeleteKeyResponse =
        deleteKey(params.toBuilder().lookupKey(lookupKey).build(), requestOptions)

    /** @see deleteKey */
    fun deleteKey(
        params: LookupTableLookupTableRevisionDataDeleteKeyParams
    ): LookupTableLookupTableRevisionDataDeleteKeyResponse =
        deleteKey(params, RequestOptions.none())

    /** @see deleteKey */
    fun deleteKey(
        params: LookupTableLookupTableRevisionDataDeleteKeyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableLookupTableRevisionDataDeleteKeyResponse

    /**
     * Generate a URL which can be used to upload a data file for creating or updating the Lookup
     * Table Revision's data:
     * * An upload URL is returned together with an UPLOAD `jobId`.
     * * You can then upload your data file using a PUT request using the returned upload URL as the
     *   endpoint. For the PUT request, map the headers returned and their values and in the request
     *   body select the specified CSV or JSONL file containing the Revision Data to upload.
     * * You can use the returned UPLOAD `jobId` with the
     *   [List LookupTableRevisionData Jobs](https://www.m3ter.com/docs/api#tag/LookupTableRevisionData/operation/ListLookupTableRevisionDataJobs)
     *   or the
     *   [Get LookupTableRevisionData Job Response](https://www.m3ter.com/docs/api#tag/LookupTableRevisionData/operation/GetLookupTableRevisionDataJobResponse)
     *   endpoints for any follow-up or troubleshooting.
     *
     * **Important:**
     * * The `contentLength` request parameter is required.
     * * The upload URL is time limited - it is valid for ***one minute***.
     */
    fun generateDownloadUrl(
        lookupTableRevisionId: String,
        params: LookupTableLookupTableRevisionDataGenerateDownloadUrlParams,
    ): LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse =
        generateDownloadUrl(lookupTableRevisionId, params, RequestOptions.none())

    /** @see generateDownloadUrl */
    fun generateDownloadUrl(
        lookupTableRevisionId: String,
        params: LookupTableLookupTableRevisionDataGenerateDownloadUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse =
        generateDownloadUrl(
            params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
            requestOptions,
        )

    /** @see generateDownloadUrl */
    fun generateDownloadUrl(
        params: LookupTableLookupTableRevisionDataGenerateDownloadUrlParams
    ): LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse =
        generateDownloadUrl(params, RequestOptions.none())

    /** @see generateDownloadUrl */
    fun generateDownloadUrl(
        params: LookupTableLookupTableRevisionDataGenerateDownloadUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse

    /**
     * Retrieve a Lookup Table Revision Data item for the given lookup key.
     *
     * **NOTES:**
     * * To obtain the lookup key for a Revision's data items, use the
     *   [Get LookupTableRevisionData](https://www.m3ter.com/docs/api#tag/LookupTableRevisionData/operation/GetLookupTableRevisionData)
     *   endpoint in this section and use the `additional=lookupKey` query parameter.
     * * If the Revision's Data schema uses multiple key fields, enter these as a comma-separated
     *   list for the `lookupKey` path parameter: .../key1,key2,key3 and so on. Importantly,
     *   multiple keys must be *entered in the same order* as they are configured in the Revision's
     *   Data schema.
     */
    fun retrieveKey(
        lookupKey: String,
        params: LookupTableLookupTableRevisionDataRetrieveKeyParams,
    ): LookupTableLookupTableRevisionDataRetrieveKeyResponse =
        retrieveKey(lookupKey, params, RequestOptions.none())

    /** @see retrieveKey */
    fun retrieveKey(
        lookupKey: String,
        params: LookupTableLookupTableRevisionDataRetrieveKeyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableLookupTableRevisionDataRetrieveKeyResponse =
        retrieveKey(params.toBuilder().lookupKey(lookupKey).build(), requestOptions)

    /** @see retrieveKey */
    fun retrieveKey(
        params: LookupTableLookupTableRevisionDataRetrieveKeyParams
    ): LookupTableLookupTableRevisionDataRetrieveKeyResponse =
        retrieveKey(params, RequestOptions.none())

    /** @see retrieveKey */
    fun retrieveKey(
        params: LookupTableLookupTableRevisionDataRetrieveKeyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableLookupTableRevisionDataRetrieveKeyResponse

    /**
     * Create/update a Lookup Table Revision Data item by lookup key.
     *
     * **NOTES:**
     * * To obtain the lookup key for a Revision's data items, use the
     *   [Get LookupTableRevisionData](https://www.m3ter.com/docs/api#tag/LookupTableRevisionData/operation/GetLookupTableRevisionData)
     *   endpoint in this section and use the `additional=lookupKey` query parameter.
     * * If the Revision's Data schema uses multiple key fields, enter these as a comma-separated
     *   list for the `lookupKey` path parameter: .../key1,key2,key3 and so on. Importantly,
     *   multiple keys must be *entered in the same order* as they are configured in the Revision's
     *   Data schema.
     */
    fun updateKey(
        lookupKey: String,
        params: LookupTableLookupTableRevisionDataUpdateKeyParams,
    ): LookupTableLookupTableRevisionDataUpdateKeyResponse =
        updateKey(lookupKey, params, RequestOptions.none())

    /** @see updateKey */
    fun updateKey(
        lookupKey: String,
        params: LookupTableLookupTableRevisionDataUpdateKeyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableLookupTableRevisionDataUpdateKeyResponse =
        updateKey(params.toBuilder().lookupKey(lookupKey).build(), requestOptions)

    /** @see updateKey */
    fun updateKey(
        params: LookupTableLookupTableRevisionDataUpdateKeyParams
    ): LookupTableLookupTableRevisionDataUpdateKeyResponse =
        updateKey(params, RequestOptions.none())

    /** @see updateKey */
    fun updateKey(
        params: LookupTableLookupTableRevisionDataUpdateKeyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupTableLookupTableRevisionDataUpdateKeyResponse

    /**
     * A view of [LookupTableRevisionDataService] that provides access to raw HTTP responses for
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
        ): LookupTableRevisionDataService.WithRawResponse

        fun lookupTableRevisionDataJobs(): LookupTableRevisionDataJobService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data`,
         * but is otherwise the same as [LookupTableRevisionDataService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataRetrieveParams,
        ): HttpResponseFor<LookupTableLookupTableRevisionDataRetrieveResponse> =
            retrieve(lookupTableRevisionId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableLookupTableRevisionDataRetrieveResponse> =
            retrieve(
                params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: LookupTableLookupTableRevisionDataRetrieveParams
        ): HttpResponseFor<LookupTableLookupTableRevisionDataRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: LookupTableLookupTableRevisionDataRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableLookupTableRevisionDataRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data`,
         * but is otherwise the same as [LookupTableRevisionDataService.update].
         */
        @MustBeClosed
        fun update(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataUpdateParams,
        ): HttpResponseFor<LookupTableLookupTableRevisionDataUpdateResponse> =
            update(lookupTableRevisionId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableLookupTableRevisionDataUpdateResponse> =
            update(
                params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
                requestOptions,
            )

        /** @see update */
        @MustBeClosed
        fun update(
            params: LookupTableLookupTableRevisionDataUpdateParams
        ): HttpResponseFor<LookupTableLookupTableRevisionDataUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: LookupTableLookupTableRevisionDataUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableLookupTableRevisionDataUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data`,
         * but is otherwise the same as [LookupTableRevisionDataService.delete].
         */
        @MustBeClosed
        fun delete(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataDeleteParams,
        ): HttpResponseFor<LookupTableLookupTableRevisionDataDeleteResponse> =
            delete(lookupTableRevisionId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableLookupTableRevisionDataDeleteResponse> =
            delete(
                params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
                requestOptions,
            )

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: LookupTableLookupTableRevisionDataDeleteParams
        ): HttpResponseFor<LookupTableLookupTableRevisionDataDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: LookupTableLookupTableRevisionDataDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableLookupTableRevisionDataDeleteResponse>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/archived`,
         * but is otherwise the same as [LookupTableRevisionDataService.archieve].
         */
        @MustBeClosed
        fun archieve(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataArchieveParams,
        ): HttpResponseFor<LookupTableLookupTableRevisionDataArchieveResponse> =
            archieve(lookupTableRevisionId, params, RequestOptions.none())

        /** @see archieve */
        @MustBeClosed
        fun archieve(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataArchieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableLookupTableRevisionDataArchieveResponse> =
            archieve(
                params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
                requestOptions,
            )

        /** @see archieve */
        @MustBeClosed
        fun archieve(
            params: LookupTableLookupTableRevisionDataArchieveParams
        ): HttpResponseFor<LookupTableLookupTableRevisionDataArchieveResponse> =
            archieve(params, RequestOptions.none())

        /** @see archieve */
        @MustBeClosed
        fun archieve(
            params: LookupTableLookupTableRevisionDataArchieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableLookupTableRevisionDataArchieveResponse>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/copy`,
         * but is otherwise the same as [LookupTableRevisionDataService.copy].
         */
        @MustBeClosed
        fun copy(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataCopyParams,
        ): HttpResponseFor<LookupTableLookupTableRevisionDataCopyResponse> =
            copy(lookupTableRevisionId, params, RequestOptions.none())

        /** @see copy */
        @MustBeClosed
        fun copy(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataCopyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableLookupTableRevisionDataCopyResponse> =
            copy(
                params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
                requestOptions,
            )

        /** @see copy */
        @MustBeClosed
        fun copy(
            params: LookupTableLookupTableRevisionDataCopyParams
        ): HttpResponseFor<LookupTableLookupTableRevisionDataCopyResponse> =
            copy(params, RequestOptions.none())

        /** @see copy */
        @MustBeClosed
        fun copy(
            params: LookupTableLookupTableRevisionDataCopyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableLookupTableRevisionDataCopyResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/{lookupKey}`,
         * but is otherwise the same as [LookupTableRevisionDataService.deleteKey].
         */
        @MustBeClosed
        fun deleteKey(
            lookupKey: String,
            params: LookupTableLookupTableRevisionDataDeleteKeyParams,
        ): HttpResponseFor<LookupTableLookupTableRevisionDataDeleteKeyResponse> =
            deleteKey(lookupKey, params, RequestOptions.none())

        /** @see deleteKey */
        @MustBeClosed
        fun deleteKey(
            lookupKey: String,
            params: LookupTableLookupTableRevisionDataDeleteKeyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableLookupTableRevisionDataDeleteKeyResponse> =
            deleteKey(params.toBuilder().lookupKey(lookupKey).build(), requestOptions)

        /** @see deleteKey */
        @MustBeClosed
        fun deleteKey(
            params: LookupTableLookupTableRevisionDataDeleteKeyParams
        ): HttpResponseFor<LookupTableLookupTableRevisionDataDeleteKeyResponse> =
            deleteKey(params, RequestOptions.none())

        /** @see deleteKey */
        @MustBeClosed
        fun deleteKey(
            params: LookupTableLookupTableRevisionDataDeleteKeyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableLookupTableRevisionDataDeleteKeyResponse>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/generateuploadurl`,
         * but is otherwise the same as [LookupTableRevisionDataService.generateDownloadUrl].
         */
        @MustBeClosed
        fun generateDownloadUrl(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataGenerateDownloadUrlParams,
        ): HttpResponseFor<LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse> =
            generateDownloadUrl(lookupTableRevisionId, params, RequestOptions.none())

        /** @see generateDownloadUrl */
        @MustBeClosed
        fun generateDownloadUrl(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataGenerateDownloadUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse> =
            generateDownloadUrl(
                params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
                requestOptions,
            )

        /** @see generateDownloadUrl */
        @MustBeClosed
        fun generateDownloadUrl(
            params: LookupTableLookupTableRevisionDataGenerateDownloadUrlParams
        ): HttpResponseFor<LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse> =
            generateDownloadUrl(params, RequestOptions.none())

        /** @see generateDownloadUrl */
        @MustBeClosed
        fun generateDownloadUrl(
            params: LookupTableLookupTableRevisionDataGenerateDownloadUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/{lookupKey}`,
         * but is otherwise the same as [LookupTableRevisionDataService.retrieveKey].
         */
        @MustBeClosed
        fun retrieveKey(
            lookupKey: String,
            params: LookupTableLookupTableRevisionDataRetrieveKeyParams,
        ): HttpResponseFor<LookupTableLookupTableRevisionDataRetrieveKeyResponse> =
            retrieveKey(lookupKey, params, RequestOptions.none())

        /** @see retrieveKey */
        @MustBeClosed
        fun retrieveKey(
            lookupKey: String,
            params: LookupTableLookupTableRevisionDataRetrieveKeyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableLookupTableRevisionDataRetrieveKeyResponse> =
            retrieveKey(params.toBuilder().lookupKey(lookupKey).build(), requestOptions)

        /** @see retrieveKey */
        @MustBeClosed
        fun retrieveKey(
            params: LookupTableLookupTableRevisionDataRetrieveKeyParams
        ): HttpResponseFor<LookupTableLookupTableRevisionDataRetrieveKeyResponse> =
            retrieveKey(params, RequestOptions.none())

        /** @see retrieveKey */
        @MustBeClosed
        fun retrieveKey(
            params: LookupTableLookupTableRevisionDataRetrieveKeyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableLookupTableRevisionDataRetrieveKeyResponse>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/{lookupKey}`,
         * but is otherwise the same as [LookupTableRevisionDataService.updateKey].
         */
        @MustBeClosed
        fun updateKey(
            lookupKey: String,
            params: LookupTableLookupTableRevisionDataUpdateKeyParams,
        ): HttpResponseFor<LookupTableLookupTableRevisionDataUpdateKeyResponse> =
            updateKey(lookupKey, params, RequestOptions.none())

        /** @see updateKey */
        @MustBeClosed
        fun updateKey(
            lookupKey: String,
            params: LookupTableLookupTableRevisionDataUpdateKeyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableLookupTableRevisionDataUpdateKeyResponse> =
            updateKey(params.toBuilder().lookupKey(lookupKey).build(), requestOptions)

        /** @see updateKey */
        @MustBeClosed
        fun updateKey(
            params: LookupTableLookupTableRevisionDataUpdateKeyParams
        ): HttpResponseFor<LookupTableLookupTableRevisionDataUpdateKeyResponse> =
            updateKey(params, RequestOptions.none())

        /** @see updateKey */
        @MustBeClosed
        fun updateKey(
            params: LookupTableLookupTableRevisionDataUpdateKeyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupTableLookupTableRevisionDataUpdateKeyResponse>
    }
}
