// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.google.errorprone.annotations.MustBeClosed
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

interface ScheduledEventConfigurationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new ScheduledEventConfiguration. */
    fun create(
        params: ScheduledEventConfigurationCreateParams
    ): CompletableFuture<ScheduledEventConfigurationResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ScheduledEventConfigurationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledEventConfigurationResponse>

    /** Retrieve a ScheduledEventConfiguration for the given UUID. */
    fun retrieve(
        params: ScheduledEventConfigurationRetrieveParams
    ): CompletableFuture<ScheduledEventConfigurationResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ScheduledEventConfigurationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledEventConfigurationResponse>

    /** Update a ScheduledEventConfiguration for the given UUID. */
    fun update(
        params: ScheduledEventConfigurationUpdateParams
    ): CompletableFuture<ScheduledEventConfigurationResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ScheduledEventConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledEventConfigurationResponse>

    /** Retrieve a list of ScheduledEventConfiguration entities */
    fun list(
        params: ScheduledEventConfigurationListParams
    ): CompletableFuture<ScheduledEventConfigurationListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: ScheduledEventConfigurationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledEventConfigurationListPageAsync>

    /** Delete the ScheduledEventConfiguration for the given UUID. */
    fun delete(
        params: ScheduledEventConfigurationDeleteParams
    ): CompletableFuture<ScheduledEventConfigurationResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ScheduledEventConfigurationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledEventConfigurationResponse>

    /**
     * A view of [ScheduledEventConfigurationServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/scheduledevents/configurations`, but is otherwise the same as
         * [ScheduledEventConfigurationServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: ScheduledEventConfigurationCreateParams
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ScheduledEventConfigurationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/scheduledevents/configurations/{id}`, but is otherwise the same as
         * [ScheduledEventConfigurationServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ScheduledEventConfigurationRetrieveParams
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ScheduledEventConfigurationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationResponse>>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/scheduledevents/configurations/{id}`, but is otherwise the same as
         * [ScheduledEventConfigurationServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: ScheduledEventConfigurationUpdateParams
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ScheduledEventConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/scheduledevents/configurations`, but is otherwise the same as
         * [ScheduledEventConfigurationServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: ScheduledEventConfigurationListParams
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ScheduledEventConfigurationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/scheduledevents/configurations/{id}`, but is otherwise the same as
         * [ScheduledEventConfigurationServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: ScheduledEventConfigurationDeleteParams
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ScheduledEventConfigurationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationResponse>>
    }
}
