// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.PlanGroupCreateParams
import com.m3ter.models.PlanGroupDeleteParams
import com.m3ter.models.PlanGroupListPageAsync
import com.m3ter.models.PlanGroupListParams
import com.m3ter.models.PlanGroupResponse
import com.m3ter.models.PlanGroupRetrieveParams
import com.m3ter.models.PlanGroupUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PlanGroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlanGroupServiceAsync

    /**
     * Create a new PlanGroup. This endpoint creates a new PlanGroup within the specified
     * organization.
     */
    fun create(params: PlanGroupCreateParams): CompletableFuture<PlanGroupResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PlanGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanGroupResponse>

    /**
     * Retrieve a specific PlanGroup with the given UUID.
     *
     * This endpoint retrieves detailed information about a specific PlanGroup identified by the
     * given UUID within a specific organization.
     */
    fun retrieve(id: String): CompletableFuture<PlanGroupResponse> =
        retrieve(id, PlanGroupRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PlanGroupRetrieveParams = PlanGroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanGroupResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PlanGroupRetrieveParams = PlanGroupRetrieveParams.none(),
    ): CompletableFuture<PlanGroupResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PlanGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanGroupResponse>

    /** @see retrieve */
    fun retrieve(params: PlanGroupRetrieveParams): CompletableFuture<PlanGroupResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<PlanGroupResponse> =
        retrieve(id, PlanGroupRetrieveParams.none(), requestOptions)

    /**
     * Update the PlanGroup with the given UUID.
     *
     * This endpoint updates the details of a specific PlanGroup identified by the given UUID within
     * a specific organization. This allows modifications to existing PlanGroup attributes.
     *
     * **Note:** If you have created Custom Fields for a PlanGroup, when you use this endpoint to
     * update the PlanGroup use the `customFields` parameter to preserve those Custom Fields. If you
     * omit them from the update request, they will be lost.
     */
    fun update(id: String, params: PlanGroupUpdateParams): CompletableFuture<PlanGroupResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: PlanGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanGroupResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: PlanGroupUpdateParams): CompletableFuture<PlanGroupResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PlanGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanGroupResponse>

    /**
     * Retrieve a list of PlanGroups.
     *
     * Retrieves a list of PlanGroups within the specified organization. You can optionally filter
     * by Account IDs or PlanGroup IDs, and also paginate the results for easier management.
     */
    fun list(): CompletableFuture<PlanGroupListPageAsync> = list(PlanGroupListParams.none())

    /** @see list */
    fun list(
        params: PlanGroupListParams = PlanGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanGroupListPageAsync>

    /** @see list */
    fun list(
        params: PlanGroupListParams = PlanGroupListParams.none()
    ): CompletableFuture<PlanGroupListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PlanGroupListPageAsync> =
        list(PlanGroupListParams.none(), requestOptions)

    /**
     * Delete a PlanGroup with the given UUID.
     *
     * This endpoint deletes the PlanGroup identified by the given UUID within a specific
     * organization. This operation is irreversible and removes the PlanGroup along with any
     * associated settings.
     */
    fun delete(id: String): CompletableFuture<PlanGroupResponse> =
        delete(id, PlanGroupDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: PlanGroupDeleteParams = PlanGroupDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanGroupResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: PlanGroupDeleteParams = PlanGroupDeleteParams.none(),
    ): CompletableFuture<PlanGroupResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PlanGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanGroupResponse>

    /** @see delete */
    fun delete(params: PlanGroupDeleteParams): CompletableFuture<PlanGroupResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<PlanGroupResponse> =
        delete(id, PlanGroupDeleteParams.none(), requestOptions)

    /**
     * A view of [PlanGroupServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PlanGroupServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/plangroups`, but is
         * otherwise the same as [PlanGroupServiceAsync.create].
         */
        fun create(
            params: PlanGroupCreateParams
        ): CompletableFuture<HttpResponseFor<PlanGroupResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PlanGroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanGroupResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/plangroups/{id}`, but is
         * otherwise the same as [PlanGroupServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<PlanGroupResponse>> =
            retrieve(id, PlanGroupRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: PlanGroupRetrieveParams = PlanGroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanGroupResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: PlanGroupRetrieveParams = PlanGroupRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PlanGroupResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PlanGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanGroupResponse>>

        /** @see retrieve */
        fun retrieve(
            params: PlanGroupRetrieveParams
        ): CompletableFuture<HttpResponseFor<PlanGroupResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanGroupResponse>> =
            retrieve(id, PlanGroupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/plangroups/{id}`, but is
         * otherwise the same as [PlanGroupServiceAsync.update].
         */
        fun update(
            id: String,
            params: PlanGroupUpdateParams,
        ): CompletableFuture<HttpResponseFor<PlanGroupResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: PlanGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanGroupResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: PlanGroupUpdateParams
        ): CompletableFuture<HttpResponseFor<PlanGroupResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PlanGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanGroupResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/plangroups`, but is otherwise
         * the same as [PlanGroupServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PlanGroupListPageAsync>> =
            list(PlanGroupListParams.none())

        /** @see list */
        fun list(
            params: PlanGroupListParams = PlanGroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanGroupListPageAsync>>

        /** @see list */
        fun list(
            params: PlanGroupListParams = PlanGroupListParams.none()
        ): CompletableFuture<HttpResponseFor<PlanGroupListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PlanGroupListPageAsync>> =
            list(PlanGroupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/plangroups/{id}`, but is
         * otherwise the same as [PlanGroupServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<PlanGroupResponse>> =
            delete(id, PlanGroupDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: PlanGroupDeleteParams = PlanGroupDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanGroupResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: PlanGroupDeleteParams = PlanGroupDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<PlanGroupResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PlanGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanGroupResponse>>

        /** @see delete */
        fun delete(
            params: PlanGroupDeleteParams
        ): CompletableFuture<HttpResponseFor<PlanGroupResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanGroupResponse>> =
            delete(id, PlanGroupDeleteParams.none(), requestOptions)
    }
}
