// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.ScheduledEventConfigurationCreateParams
import com.m3ter.sdk.models.ScheduledEventConfigurationDeleteParams
import com.m3ter.sdk.models.ScheduledEventConfigurationListPageAsync
import com.m3ter.sdk.models.ScheduledEventConfigurationListParams
import com.m3ter.sdk.models.ScheduledEventConfigurationResponse
import com.m3ter.sdk.models.ScheduledEventConfigurationRetrieveParams
import com.m3ter.sdk.models.ScheduledEventConfigurationUpdateParams
import java.util.concurrent.CompletableFuture

interface ScheduledEventConfigurationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new ScheduledEventConfiguration. */
    @JvmOverloads
    fun create(
        params: ScheduledEventConfigurationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledEventConfigurationResponse>

    /** Retrieve a ScheduledEventConfiguration for the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: ScheduledEventConfigurationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledEventConfigurationResponse>

    /** Update a ScheduledEventConfiguration for the given UUID. */
    @JvmOverloads
    fun update(
        params: ScheduledEventConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledEventConfigurationResponse>

    /** Retrieve a list of ScheduledEventConfiguration entities */
    @JvmOverloads
    fun list(
        params: ScheduledEventConfigurationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledEventConfigurationListPageAsync>

    /** Delete the ScheduledEventConfiguration for the given UUID. */
    @JvmOverloads
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
        @JvmOverloads
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
        @JvmOverloads
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
        @JvmOverloads
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
        @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: ScheduledEventConfigurationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledEventConfigurationResponse>>
    }
}
