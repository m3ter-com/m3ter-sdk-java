// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.lookupTables

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
import com.m3ter.services.async.lookupTables.lookupTableRevisionData.LookupTableRevisionDataJobServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LookupTableRevisionDataServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LookupTableRevisionDataServiceAsync

    fun lookupTableRevisionDataJobs(): LookupTableRevisionDataJobServiceAsync

    /** List Lookup Table Revision Data items for the given UUID. */
    fun retrieve(
        lookupTableRevisionId: String,
        params: LookupTableLookupTableRevisionDataRetrieveParams,
    ): CompletableFuture<LookupTableLookupTableRevisionDataRetrieveResponse> =
        retrieve(lookupTableRevisionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        lookupTableRevisionId: String,
        params: LookupTableLookupTableRevisionDataRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableLookupTableRevisionDataRetrieveResponse> =
        retrieve(
            params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        params: LookupTableLookupTableRevisionDataRetrieveParams
    ): CompletableFuture<LookupTableLookupTableRevisionDataRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LookupTableLookupTableRevisionDataRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableLookupTableRevisionDataRetrieveResponse>

    /** Create/update the Lookup Table Revision Data for the given UUID. */
    fun update(
        lookupTableRevisionId: String,
        params: LookupTableLookupTableRevisionDataUpdateParams,
    ): CompletableFuture<LookupTableLookupTableRevisionDataUpdateResponse> =
        update(lookupTableRevisionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        lookupTableRevisionId: String,
        params: LookupTableLookupTableRevisionDataUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableLookupTableRevisionDataUpdateResponse> =
        update(
            params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
            requestOptions,
        )

    /** @see update */
    fun update(
        params: LookupTableLookupTableRevisionDataUpdateParams
    ): CompletableFuture<LookupTableLookupTableRevisionDataUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LookupTableLookupTableRevisionDataUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableLookupTableRevisionDataUpdateResponse>

    /** Delete the Lookup Table Revision Data for the given UUID. */
    fun delete(
        lookupTableRevisionId: String,
        params: LookupTableLookupTableRevisionDataDeleteParams,
    ): CompletableFuture<LookupTableLookupTableRevisionDataDeleteResponse> =
        delete(lookupTableRevisionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        lookupTableRevisionId: String,
        params: LookupTableLookupTableRevisionDataDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableLookupTableRevisionDataDeleteResponse> =
        delete(
            params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
            requestOptions,
        )

    /** @see delete */
    fun delete(
        params: LookupTableLookupTableRevisionDataDeleteParams
    ): CompletableFuture<LookupTableLookupTableRevisionDataDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LookupTableLookupTableRevisionDataDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableLookupTableRevisionDataDeleteResponse>

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
    ): CompletableFuture<LookupTableLookupTableRevisionDataArchieveResponse> =
        archieve(lookupTableRevisionId, params, RequestOptions.none())

    /** @see archieve */
    fun archieve(
        lookupTableRevisionId: String,
        params: LookupTableLookupTableRevisionDataArchieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableLookupTableRevisionDataArchieveResponse> =
        archieve(
            params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
            requestOptions,
        )

    /** @see archieve */
    fun archieve(
        params: LookupTableLookupTableRevisionDataArchieveParams
    ): CompletableFuture<LookupTableLookupTableRevisionDataArchieveResponse> =
        archieve(params, RequestOptions.none())

    /** @see archieve */
    fun archieve(
        params: LookupTableLookupTableRevisionDataArchieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableLookupTableRevisionDataArchieveResponse>

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
    ): CompletableFuture<LookupTableLookupTableRevisionDataCopyResponse> =
        copy(lookupTableRevisionId, params, RequestOptions.none())

    /** @see copy */
    fun copy(
        lookupTableRevisionId: String,
        params: LookupTableLookupTableRevisionDataCopyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableLookupTableRevisionDataCopyResponse> =
        copy(
            params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
            requestOptions,
        )

    /** @see copy */
    fun copy(
        params: LookupTableLookupTableRevisionDataCopyParams
    ): CompletableFuture<LookupTableLookupTableRevisionDataCopyResponse> =
        copy(params, RequestOptions.none())

    /** @see copy */
    fun copy(
        params: LookupTableLookupTableRevisionDataCopyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableLookupTableRevisionDataCopyResponse>

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
    ): CompletableFuture<LookupTableLookupTableRevisionDataDeleteKeyResponse> =
        deleteKey(lookupKey, params, RequestOptions.none())

    /** @see deleteKey */
    fun deleteKey(
        lookupKey: String,
        params: LookupTableLookupTableRevisionDataDeleteKeyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableLookupTableRevisionDataDeleteKeyResponse> =
        deleteKey(params.toBuilder().lookupKey(lookupKey).build(), requestOptions)

    /** @see deleteKey */
    fun deleteKey(
        params: LookupTableLookupTableRevisionDataDeleteKeyParams
    ): CompletableFuture<LookupTableLookupTableRevisionDataDeleteKeyResponse> =
        deleteKey(params, RequestOptions.none())

    /** @see deleteKey */
    fun deleteKey(
        params: LookupTableLookupTableRevisionDataDeleteKeyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableLookupTableRevisionDataDeleteKeyResponse>

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
    ): CompletableFuture<LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse> =
        generateDownloadUrl(lookupTableRevisionId, params, RequestOptions.none())

    /** @see generateDownloadUrl */
    fun generateDownloadUrl(
        lookupTableRevisionId: String,
        params: LookupTableLookupTableRevisionDataGenerateDownloadUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse> =
        generateDownloadUrl(
            params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
            requestOptions,
        )

    /** @see generateDownloadUrl */
    fun generateDownloadUrl(
        params: LookupTableLookupTableRevisionDataGenerateDownloadUrlParams
    ): CompletableFuture<LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse> =
        generateDownloadUrl(params, RequestOptions.none())

    /** @see generateDownloadUrl */
    fun generateDownloadUrl(
        params: LookupTableLookupTableRevisionDataGenerateDownloadUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse>

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
    ): CompletableFuture<LookupTableLookupTableRevisionDataRetrieveKeyResponse> =
        retrieveKey(lookupKey, params, RequestOptions.none())

    /** @see retrieveKey */
    fun retrieveKey(
        lookupKey: String,
        params: LookupTableLookupTableRevisionDataRetrieveKeyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableLookupTableRevisionDataRetrieveKeyResponse> =
        retrieveKey(params.toBuilder().lookupKey(lookupKey).build(), requestOptions)

    /** @see retrieveKey */
    fun retrieveKey(
        params: LookupTableLookupTableRevisionDataRetrieveKeyParams
    ): CompletableFuture<LookupTableLookupTableRevisionDataRetrieveKeyResponse> =
        retrieveKey(params, RequestOptions.none())

    /** @see retrieveKey */
    fun retrieveKey(
        params: LookupTableLookupTableRevisionDataRetrieveKeyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableLookupTableRevisionDataRetrieveKeyResponse>

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
    ): CompletableFuture<LookupTableLookupTableRevisionDataUpdateKeyResponse> =
        updateKey(lookupKey, params, RequestOptions.none())

    /** @see updateKey */
    fun updateKey(
        lookupKey: String,
        params: LookupTableLookupTableRevisionDataUpdateKeyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableLookupTableRevisionDataUpdateKeyResponse> =
        updateKey(params.toBuilder().lookupKey(lookupKey).build(), requestOptions)

    /** @see updateKey */
    fun updateKey(
        params: LookupTableLookupTableRevisionDataUpdateKeyParams
    ): CompletableFuture<LookupTableLookupTableRevisionDataUpdateKeyResponse> =
        updateKey(params, RequestOptions.none())

    /** @see updateKey */
    fun updateKey(
        params: LookupTableLookupTableRevisionDataUpdateKeyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupTableLookupTableRevisionDataUpdateKeyResponse>

    /**
     * A view of [LookupTableRevisionDataServiceAsync] that provides access to raw HTTP responses
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
        ): LookupTableRevisionDataServiceAsync.WithRawResponse

        fun lookupTableRevisionDataJobs(): LookupTableRevisionDataJobServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data`,
         * but is otherwise the same as [LookupTableRevisionDataServiceAsync.retrieve].
         */
        fun retrieve(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataRetrieveParams,
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataRetrieveResponse>> =
            retrieve(lookupTableRevisionId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataRetrieveResponse>> =
            retrieve(
                params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            params: LookupTableLookupTableRevisionDataRetrieveParams
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: LookupTableLookupTableRevisionDataRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data`,
         * but is otherwise the same as [LookupTableRevisionDataServiceAsync.update].
         */
        fun update(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataUpdateParams,
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataUpdateResponse>> =
            update(lookupTableRevisionId, params, RequestOptions.none())

        /** @see update */
        fun update(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataUpdateResponse>> =
            update(
                params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
                requestOptions,
            )

        /** @see update */
        fun update(
            params: LookupTableLookupTableRevisionDataUpdateParams
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: LookupTableLookupTableRevisionDataUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataUpdateResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data`,
         * but is otherwise the same as [LookupTableRevisionDataServiceAsync.delete].
         */
        fun delete(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataDeleteParams,
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataDeleteResponse>> =
            delete(lookupTableRevisionId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataDeleteResponse>> =
            delete(
                params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
                requestOptions,
            )

        /** @see delete */
        fun delete(
            params: LookupTableLookupTableRevisionDataDeleteParams
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: LookupTableLookupTableRevisionDataDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataDeleteResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/archived`,
         * but is otherwise the same as [LookupTableRevisionDataServiceAsync.archieve].
         */
        fun archieve(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataArchieveParams,
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataArchieveResponse>> =
            archieve(lookupTableRevisionId, params, RequestOptions.none())

        /** @see archieve */
        fun archieve(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataArchieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataArchieveResponse>> =
            archieve(
                params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
                requestOptions,
            )

        /** @see archieve */
        fun archieve(
            params: LookupTableLookupTableRevisionDataArchieveParams
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataArchieveResponse>> =
            archieve(params, RequestOptions.none())

        /** @see archieve */
        fun archieve(
            params: LookupTableLookupTableRevisionDataArchieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataArchieveResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/copy`,
         * but is otherwise the same as [LookupTableRevisionDataServiceAsync.copy].
         */
        fun copy(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataCopyParams,
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataCopyResponse>> =
            copy(lookupTableRevisionId, params, RequestOptions.none())

        /** @see copy */
        fun copy(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataCopyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataCopyResponse>> =
            copy(
                params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
                requestOptions,
            )

        /** @see copy */
        fun copy(
            params: LookupTableLookupTableRevisionDataCopyParams
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataCopyResponse>> =
            copy(params, RequestOptions.none())

        /** @see copy */
        fun copy(
            params: LookupTableLookupTableRevisionDataCopyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataCopyResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/{lookupKey}`,
         * but is otherwise the same as [LookupTableRevisionDataServiceAsync.deleteKey].
         */
        fun deleteKey(
            lookupKey: String,
            params: LookupTableLookupTableRevisionDataDeleteKeyParams,
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataDeleteKeyResponse>> =
            deleteKey(lookupKey, params, RequestOptions.none())

        /** @see deleteKey */
        fun deleteKey(
            lookupKey: String,
            params: LookupTableLookupTableRevisionDataDeleteKeyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataDeleteKeyResponse>> =
            deleteKey(params.toBuilder().lookupKey(lookupKey).build(), requestOptions)

        /** @see deleteKey */
        fun deleteKey(
            params: LookupTableLookupTableRevisionDataDeleteKeyParams
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataDeleteKeyResponse>> =
            deleteKey(params, RequestOptions.none())

        /** @see deleteKey */
        fun deleteKey(
            params: LookupTableLookupTableRevisionDataDeleteKeyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataDeleteKeyResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/generateuploadurl`,
         * but is otherwise the same as [LookupTableRevisionDataServiceAsync.generateDownloadUrl].
         */
        fun generateDownloadUrl(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataGenerateDownloadUrlParams,
        ): CompletableFuture<
            HttpResponseFor<LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse>
        > = generateDownloadUrl(lookupTableRevisionId, params, RequestOptions.none())

        /** @see generateDownloadUrl */
        fun generateDownloadUrl(
            lookupTableRevisionId: String,
            params: LookupTableLookupTableRevisionDataGenerateDownloadUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse>
        > =
            generateDownloadUrl(
                params.toBuilder().lookupTableRevisionId(lookupTableRevisionId).build(),
                requestOptions,
            )

        /** @see generateDownloadUrl */
        fun generateDownloadUrl(
            params: LookupTableLookupTableRevisionDataGenerateDownloadUrlParams
        ): CompletableFuture<
            HttpResponseFor<LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse>
        > = generateDownloadUrl(params, RequestOptions.none())

        /** @see generateDownloadUrl */
        fun generateDownloadUrl(
            params: LookupTableLookupTableRevisionDataGenerateDownloadUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse>
        >

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/{lookupKey}`,
         * but is otherwise the same as [LookupTableRevisionDataServiceAsync.retrieveKey].
         */
        fun retrieveKey(
            lookupKey: String,
            params: LookupTableLookupTableRevisionDataRetrieveKeyParams,
        ): CompletableFuture<
            HttpResponseFor<LookupTableLookupTableRevisionDataRetrieveKeyResponse>
        > = retrieveKey(lookupKey, params, RequestOptions.none())

        /** @see retrieveKey */
        fun retrieveKey(
            lookupKey: String,
            params: LookupTableLookupTableRevisionDataRetrieveKeyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<LookupTableLookupTableRevisionDataRetrieveKeyResponse>
        > = retrieveKey(params.toBuilder().lookupKey(lookupKey).build(), requestOptions)

        /** @see retrieveKey */
        fun retrieveKey(
            params: LookupTableLookupTableRevisionDataRetrieveKeyParams
        ): CompletableFuture<
            HttpResponseFor<LookupTableLookupTableRevisionDataRetrieveKeyResponse>
        > = retrieveKey(params, RequestOptions.none())

        /** @see retrieveKey */
        fun retrieveKey(
            params: LookupTableLookupTableRevisionDataRetrieveKeyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataRetrieveKeyResponse>>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/{lookupKey}`,
         * but is otherwise the same as [LookupTableRevisionDataServiceAsync.updateKey].
         */
        fun updateKey(
            lookupKey: String,
            params: LookupTableLookupTableRevisionDataUpdateKeyParams,
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataUpdateKeyResponse>> =
            updateKey(lookupKey, params, RequestOptions.none())

        /** @see updateKey */
        fun updateKey(
            lookupKey: String,
            params: LookupTableLookupTableRevisionDataUpdateKeyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataUpdateKeyResponse>> =
            updateKey(params.toBuilder().lookupKey(lookupKey).build(), requestOptions)

        /** @see updateKey */
        fun updateKey(
            params: LookupTableLookupTableRevisionDataUpdateKeyParams
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataUpdateKeyResponse>> =
            updateKey(params, RequestOptions.none())

        /** @see updateKey */
        fun updateKey(
            params: LookupTableLookupTableRevisionDataUpdateKeyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataUpdateKeyResponse>>
    }
}
