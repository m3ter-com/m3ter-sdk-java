// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.ScheduledEventConfigurationCreateParams
import com.m3ter.models.ScheduledEventConfigurationDeleteParams
import com.m3ter.models.ScheduledEventConfigurationListPage
import com.m3ter.models.ScheduledEventConfigurationListParams
import com.m3ter.models.ScheduledEventConfigurationResponse
import com.m3ter.models.ScheduledEventConfigurationRetrieveParams
import com.m3ter.models.ScheduledEventConfigurationUpdateParams
import java.util.function.Consumer

interface ScheduledEventConfigurationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScheduledEventConfigurationService

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
    fun retrieve(id: String): ScheduledEventConfigurationResponse =
        retrieve(id, ScheduledEventConfigurationRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: ScheduledEventConfigurationRetrieveParams =
            ScheduledEventConfigurationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduledEventConfigurationResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: ScheduledEventConfigurationRetrieveParams =
            ScheduledEventConfigurationRetrieveParams.none(),
    ): ScheduledEventConfigurationResponse = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ScheduledEventConfigurationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduledEventConfigurationResponse

    /** @see [retrieve] */
    fun retrieve(
        params: ScheduledEventConfigurationRetrieveParams
    ): ScheduledEventConfigurationResponse = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): ScheduledEventConfigurationResponse =
        retrieve(id, ScheduledEventConfigurationRetrieveParams.none(), requestOptions)

    /** Update a ScheduledEventConfiguration for the given UUID. */
    fun update(
        id: String,
        params: ScheduledEventConfigurationUpdateParams,
    ): ScheduledEventConfigurationResponse = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: ScheduledEventConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduledEventConfigurationResponse =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        params: ScheduledEventConfigurationUpdateParams
    ): ScheduledEventConfigurationResponse = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ScheduledEventConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduledEventConfigurationResponse

    /** Retrieve a list of ScheduledEventConfiguration entities */
    fun list(): ScheduledEventConfigurationListPage =
        list(ScheduledEventConfigurationListParams.none())

    /** @see [list] */
    fun list(
        params: ScheduledEventConfigurationListParams =
            ScheduledEventConfigurationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduledEventConfigurationListPage

    /** @see [list] */
    fun list(
        params: ScheduledEventConfigurationListParams = ScheduledEventConfigurationListParams.none()
    ): ScheduledEventConfigurationListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ScheduledEventConfigurationListPage =
        list(ScheduledEventConfigurationListParams.none(), requestOptions)

    /** Delete the ScheduledEventConfiguration for the given UUID. */
    fun delete(id: String): ScheduledEventConfigurationResponse =
        delete(id, ScheduledEventConfigurationDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: ScheduledEventConfigurationDeleteParams =
            ScheduledEventConfigurationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduledEventConfigurationResponse =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: ScheduledEventConfigurationDeleteParams =
            ScheduledEventConfigurationDeleteParams.none(),
    ): ScheduledEventConfigurationResponse = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ScheduledEventConfigurationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduledEventConfigurationResponse

    /** @see [delete] */
    fun delete(
        params: ScheduledEventConfigurationDeleteParams
    ): ScheduledEventConfigurationResponse = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): ScheduledEventConfigurationResponse =
        delete(id, ScheduledEventConfigurationDeleteParams.none(), requestOptions)

    /**
     * A view of [ScheduledEventConfigurationService] that provides access to raw HTTP responses for
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
        ): ScheduledEventConfigurationService.WithRawResponse

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
        fun retrieve(id: String): HttpResponseFor<ScheduledEventConfigurationResponse> =
            retrieve(id, ScheduledEventConfigurationRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ScheduledEventConfigurationRetrieveParams =
                ScheduledEventConfigurationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduledEventConfigurationResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ScheduledEventConfigurationRetrieveParams =
                ScheduledEventConfigurationRetrieveParams.none(),
        ): HttpResponseFor<ScheduledEventConfigurationResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ScheduledEventConfigurationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduledEventConfigurationResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ScheduledEventConfigurationRetrieveParams
        ): HttpResponseFor<ScheduledEventConfigurationResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScheduledEventConfigurationResponse> =
            retrieve(id, ScheduledEventConfigurationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/scheduledevents/configurations/{id}`, but is otherwise the same as
         * [ScheduledEventConfigurationService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: ScheduledEventConfigurationUpdateParams,
        ): HttpResponseFor<ScheduledEventConfigurationResponse> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: ScheduledEventConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduledEventConfigurationResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
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
        fun list(): HttpResponseFor<ScheduledEventConfigurationListPage> =
            list(ScheduledEventConfigurationListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ScheduledEventConfigurationListParams =
                ScheduledEventConfigurationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduledEventConfigurationListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ScheduledEventConfigurationListParams =
                ScheduledEventConfigurationListParams.none()
        ): HttpResponseFor<ScheduledEventConfigurationListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<ScheduledEventConfigurationListPage> =
            list(ScheduledEventConfigurationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/scheduledevents/configurations/{id}`, but is otherwise the same as
         * [ScheduledEventConfigurationService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<ScheduledEventConfigurationResponse> =
            delete(id, ScheduledEventConfigurationDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: ScheduledEventConfigurationDeleteParams =
                ScheduledEventConfigurationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduledEventConfigurationResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: ScheduledEventConfigurationDeleteParams =
                ScheduledEventConfigurationDeleteParams.none(),
        ): HttpResponseFor<ScheduledEventConfigurationResponse> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ScheduledEventConfigurationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduledEventConfigurationResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ScheduledEventConfigurationDeleteParams
        ): HttpResponseFor<ScheduledEventConfigurationResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScheduledEventConfigurationResponse> =
            delete(id, ScheduledEventConfigurationDeleteParams.none(), requestOptions)
    }
}
