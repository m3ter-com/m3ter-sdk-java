// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.ScheduledEventConfigurationCreateParams
import com.m3ter.models.ScheduledEventConfigurationDeleteParams
import com.m3ter.models.ScheduledEventConfigurationListPage
import com.m3ter.models.ScheduledEventConfigurationListParams
import com.m3ter.models.ScheduledEventConfigurationResponse
import com.m3ter.models.ScheduledEventConfigurationRetrieveParams
import com.m3ter.models.ScheduledEventConfigurationUpdateParams

interface ScheduledEventConfigurationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new ScheduledEventConfiguration. */
    fun create(
        params: ScheduledEventConfigurationCreateParams
    ): ScheduledEventConfigurationResponse = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ScheduledEventConfigurationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduledEventConfigurationResponse

    /** Retrieve a ScheduledEventConfiguration for the given UUID. */
    fun retrieve(
        params: ScheduledEventConfigurationRetrieveParams
    ): ScheduledEventConfigurationResponse = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ScheduledEventConfigurationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduledEventConfigurationResponse

    /** Update a ScheduledEventConfiguration for the given UUID. */
    fun update(
        params: ScheduledEventConfigurationUpdateParams
    ): ScheduledEventConfigurationResponse = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ScheduledEventConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduledEventConfigurationResponse

    /** Retrieve a list of ScheduledEventConfiguration entities */
    fun list(params: ScheduledEventConfigurationListParams): ScheduledEventConfigurationListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: ScheduledEventConfigurationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduledEventConfigurationListPage

    /** Delete the ScheduledEventConfiguration for the given UUID. */
    fun delete(
        params: ScheduledEventConfigurationDeleteParams
    ): ScheduledEventConfigurationResponse = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ScheduledEventConfigurationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduledEventConfigurationResponse

    /**
     * A view of [ScheduledEventConfigurationService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/scheduledevents/configurations`, but is otherwise the same as
         * [ScheduledEventConfigurationService.create].
         */
        @MustBeClosed
        fun create(
            params: ScheduledEventConfigurationCreateParams
        ): HttpResponseFor<ScheduledEventConfigurationResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ScheduledEventConfigurationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduledEventConfigurationResponse>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/scheduledevents/configurations/{id}`, but is otherwise the same as
         * [ScheduledEventConfigurationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ScheduledEventConfigurationRetrieveParams
        ): HttpResponseFor<ScheduledEventConfigurationResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ScheduledEventConfigurationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduledEventConfigurationResponse>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/scheduledevents/configurations/{id}`, but is otherwise the same as
         * [ScheduledEventConfigurationService.update].
         */
        @MustBeClosed
        fun update(
            params: ScheduledEventConfigurationUpdateParams
        ): HttpResponseFor<ScheduledEventConfigurationResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ScheduledEventConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduledEventConfigurationResponse>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/scheduledevents/configurations`, but is otherwise the same as
         * [ScheduledEventConfigurationService.list].
         */
        @MustBeClosed
        fun list(
            params: ScheduledEventConfigurationListParams
        ): HttpResponseFor<ScheduledEventConfigurationListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ScheduledEventConfigurationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduledEventConfigurationListPage>

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/scheduledevents/configurations/{id}`, but is otherwise the same as
         * [ScheduledEventConfigurationService.delete].
         */
        @MustBeClosed
        fun delete(
            params: ScheduledEventConfigurationDeleteParams
        ): HttpResponseFor<ScheduledEventConfigurationResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ScheduledEventConfigurationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduledEventConfigurationResponse>
    }
}
