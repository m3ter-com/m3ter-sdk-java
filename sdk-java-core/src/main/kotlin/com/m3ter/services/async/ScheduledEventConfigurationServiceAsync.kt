// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.ScheduledEventConfigurationCreateParams
import com.m3ter.models.ScheduledEventConfigurationDeleteParams
import com.m3ter.models.ScheduledEventConfigurationListPageAsync
import com.m3ter.models.ScheduledEventConfigurationListParams
import com.m3ter.models.ScheduledEventConfigurationResponse
import com.m3ter.models.ScheduledEventConfigurationRetrieveParams
import com.m3ter.models.ScheduledEventConfigurationUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ScheduledEventConfigurationServiceAsync {

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
    ): ScheduledEventConfigurationServiceAsync

    /** Create a new ScheduledEventConfiguration. */
    fun create(
        params: ScheduledEventConfigurationCreateParams
    ): CompletableFuture<ScheduledEventConfigurationResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ScheduledEventConfigurationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledEventConfigurationResponse>

    /** Retrieve a ScheduledEventConfiguration for the given UUID. */
    fun retrieve(id: String): CompletableFuture<ScheduledEventConfigurationResponse> =
        retrieve(id, ScheduledEventConfigurationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ScheduledEventConfigurationRetrieveParams =
            ScheduledEventConfigurationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledEventConfigurationResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ScheduledEventConfigurationRetrieveParams =
            ScheduledEventConfigurationRetrieveParams.none(),
    ): CompletableFuture<ScheduledEventConfigurationResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ScheduledEventConfigurationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledEventConfigurationResponse>

    /** @see retrieve */
    fun retrieve(
        params: ScheduledEventConfigurationRetrieveParams
    ): CompletableFuture<ScheduledEventConfigurationResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScheduledEventConfigurationResponse> =
        retrieve(id, ScheduledEventConfigurationRetrieveParams.none(), requestOptions)

    /** Update a ScheduledEventConfiguration for the given UUID. */
    fun update(
        id: String,
        params: ScheduledEventConfigurationUpdateParams,
    ): CompletableFuture<ScheduledEventConfigurationResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: ScheduledEventConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledEventConfigurationResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: ScheduledEventConfigurationUpdateParams
    ): CompletableFuture<ScheduledEventConfigurationResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ScheduledEventConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledEventConfigurationResponse>

    /** Retrieve a list of ScheduledEventConfiguration entities */
    fun list(): CompletableFuture<ScheduledEventConfigurationListPageAsync> =
        list(ScheduledEventConfigurationListParams.none())

    /** @see list */
    fun list(
        params: ScheduledEventConfigurationListParams =
            ScheduledEventConfigurationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledEventConfigurationListPageAsync>

    /** @see list */
    fun list(
        params: ScheduledEventConfigurationListParams = ScheduledEventConfigurationListParams.none()
    ): CompletableFuture<ScheduledEventConfigurationListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<ScheduledEventConfigurationListPageAsync> =
        list(ScheduledEventConfigurationListParams.none(), requestOptions)

    /** Delete the ScheduledEventConfiguration for the given UUID. */
    fun delete(id: String): CompletableFuture<ScheduledEventConfigurationResponse> =
        delete(id, ScheduledEventConfigurationDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: ScheduledEventConfigurationDeleteParams =
            ScheduledEventConfigurationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledEventConfigurationResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: ScheduledEventConfigurationDeleteParams =
            ScheduledEventConfigurationDeleteParams.none(),
    ): CompletableFuture<ScheduledEventConfigurationResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ScheduledEventConfigurationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledEventConfigurationResponse>

    /** @see delete */
    fun delete(
        params: ScheduledEventConfigurationDeleteParams
    ): CompletableFuture<ScheduledEventConfigurationResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScheduledEventConfigurationResponse> =
        delete(id, ScheduledEventConfigurationDeleteParams.none(), requestOptions)

    /**
     * A view of [ScheduledEventConfigurationServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ScheduledEventConfigurationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/scheduledevents/configurations`, but is otherwise the same as
         * [ScheduledEventConfigurationServiceAsync.create].
         */
        fun create(
            params: ScheduledEventConfigurationCreateParams
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ScheduledEventConfigurationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/scheduledevents/configurations/{id}`, but is otherwise the same as
         * [ScheduledEventConfigurationServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationResponse>> =
            retrieve(id, ScheduledEventConfigurationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ScheduledEventConfigurationRetrieveParams =
                ScheduledEventConfigurationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ScheduledEventConfigurationRetrieveParams =
                ScheduledEventConfigurationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ScheduledEventConfigurationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ScheduledEventConfigurationRetrieveParams
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationResponse>> =
            retrieve(id, ScheduledEventConfigurationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/scheduledevents/configurations/{id}`, but is otherwise the same as
         * [ScheduledEventConfigurationServiceAsync.update].
         */
        fun update(
            id: String,
            params: ScheduledEventConfigurationUpdateParams,
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: ScheduledEventConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: ScheduledEventConfigurationUpdateParams
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ScheduledEventConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/scheduledevents/configurations`, but is otherwise the same as
         * [ScheduledEventConfigurationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationListPageAsync>> =
            list(ScheduledEventConfigurationListParams.none())

        /** @see list */
        fun list(
            params: ScheduledEventConfigurationListParams =
                ScheduledEventConfigurationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationListPageAsync>>

        /** @see list */
        fun list(
            params: ScheduledEventConfigurationListParams =
                ScheduledEventConfigurationListParams.none()
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationListPageAsync>> =
            list(ScheduledEventConfigurationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/scheduledevents/configurations/{id}`, but is otherwise the same as
         * [ScheduledEventConfigurationServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationResponse>> =
            delete(id, ScheduledEventConfigurationDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: ScheduledEventConfigurationDeleteParams =
                ScheduledEventConfigurationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: ScheduledEventConfigurationDeleteParams =
                ScheduledEventConfigurationDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ScheduledEventConfigurationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationResponse>>

        /** @see delete */
        fun delete(
            params: ScheduledEventConfigurationDeleteParams
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationResponse>> =
            delete(id, ScheduledEventConfigurationDeleteParams.none(), requestOptions)
    }
}
