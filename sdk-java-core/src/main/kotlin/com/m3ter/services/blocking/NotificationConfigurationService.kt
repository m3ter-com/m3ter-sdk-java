// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.NotificationConfigurationCreateParams
import com.m3ter.models.NotificationConfigurationDeleteParams
import com.m3ter.models.NotificationConfigurationListPage
import com.m3ter.models.NotificationConfigurationListParams
import com.m3ter.models.NotificationConfigurationResponse
import com.m3ter.models.NotificationConfigurationRetrieveParams
import com.m3ter.models.NotificationConfigurationUpdateParams
import java.util.function.Consumer

interface NotificationConfigurationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationConfigurationService

    /**
     * Create a new Notification for an Event.
     *
     * This endpoint enables you to create a new Event Notification for the specified Organization.
     * You need to supply a request body with the details of the new Notification.
     */
    fun create(params: NotificationConfigurationCreateParams): NotificationConfigurationResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: NotificationConfigurationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationConfigurationResponse

    /**
     * Retrieve the details of a specific Notification using its UUID. Includes the Event the
     * Notification is based on, and any calculation referencing the Event's field and which defines
     * further conditions that must be met to trigger the Notification when the Event occurs.
     */
    fun retrieve(id: String): NotificationConfigurationResponse =
        retrieve(id, NotificationConfigurationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NotificationConfigurationRetrieveParams =
            NotificationConfigurationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationConfigurationResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NotificationConfigurationRetrieveParams =
            NotificationConfigurationRetrieveParams.none(),
    ): NotificationConfigurationResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NotificationConfigurationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationConfigurationResponse

    /** @see retrieve */
    fun retrieve(
        params: NotificationConfigurationRetrieveParams
    ): NotificationConfigurationResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): NotificationConfigurationResponse =
        retrieve(id, NotificationConfigurationRetrieveParams.none(), requestOptions)

    /**
     * Update a Notification with the given UUID.
     *
     * This endpoint modifies the configuration details of an existing Notification. You can change
     * the Event that triggers the Notification and/or update the conditions for sending the
     * Notification.
     */
    fun update(
        id: String,
        params: NotificationConfigurationUpdateParams,
    ): NotificationConfigurationResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: NotificationConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationConfigurationResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: NotificationConfigurationUpdateParams): NotificationConfigurationResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: NotificationConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationConfigurationResponse

    /**
     * Retrieve a list of Event Notifications for the specified Organization.
     *
     * This endpoint retrieves a list of all Event Notifications for the Organization identified by
     * its UUID. The list can be paginated for easier management. The list also supports filtering
     * by parameters such as Notification UUID.
     */
    fun list(): NotificationConfigurationListPage = list(NotificationConfigurationListParams.none())

    /** @see list */
    fun list(
        params: NotificationConfigurationListParams = NotificationConfigurationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationConfigurationListPage

    /** @see list */
    fun list(
        params: NotificationConfigurationListParams = NotificationConfigurationListParams.none()
    ): NotificationConfigurationListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): NotificationConfigurationListPage =
        list(NotificationConfigurationListParams.none(), requestOptions)

    /**
     * Delete the Notification with the given UUID.
     *
     * This endpoint permanently removes a specified Notification and its configuration. This action
     * cannot be undone.
     */
    fun delete(id: String): NotificationConfigurationResponse =
        delete(id, NotificationConfigurationDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: NotificationConfigurationDeleteParams =
            NotificationConfigurationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationConfigurationResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: NotificationConfigurationDeleteParams = NotificationConfigurationDeleteParams.none(),
    ): NotificationConfigurationResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: NotificationConfigurationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationConfigurationResponse

    /** @see delete */
    fun delete(params: NotificationConfigurationDeleteParams): NotificationConfigurationResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): NotificationConfigurationResponse =
        delete(id, NotificationConfigurationDeleteParams.none(), requestOptions)

    /**
     * A view of [NotificationConfigurationService] that provides access to raw HTTP responses for
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
        ): NotificationConfigurationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/notifications/configurations`, but is otherwise the same as
         * [NotificationConfigurationService.create].
         */
        @MustBeClosed
        fun create(
            params: NotificationConfigurationCreateParams
        ): HttpResponseFor<NotificationConfigurationResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: NotificationConfigurationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationConfigurationResponse>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/notifications/configurations/{id}`, but is otherwise the same as
         * [NotificationConfigurationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<NotificationConfigurationResponse> =
            retrieve(id, NotificationConfigurationRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: NotificationConfigurationRetrieveParams =
                NotificationConfigurationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationConfigurationResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: NotificationConfigurationRetrieveParams =
                NotificationConfigurationRetrieveParams.none(),
        ): HttpResponseFor<NotificationConfigurationResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NotificationConfigurationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationConfigurationResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NotificationConfigurationRetrieveParams
        ): HttpResponseFor<NotificationConfigurationResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationConfigurationResponse> =
            retrieve(id, NotificationConfigurationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/notifications/configurations/{id}`, but is otherwise the same as
         * [NotificationConfigurationService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: NotificationConfigurationUpdateParams,
        ): HttpResponseFor<NotificationConfigurationResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: NotificationConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationConfigurationResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: NotificationConfigurationUpdateParams
        ): HttpResponseFor<NotificationConfigurationResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: NotificationConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationConfigurationResponse>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/notifications/configurations`, but is otherwise the same as
         * [NotificationConfigurationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<NotificationConfigurationListPage> =
            list(NotificationConfigurationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: NotificationConfigurationListParams =
                NotificationConfigurationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationConfigurationListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: NotificationConfigurationListParams = NotificationConfigurationListParams.none()
        ): HttpResponseFor<NotificationConfigurationListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<NotificationConfigurationListPage> =
            list(NotificationConfigurationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/notifications/configurations/{id}`, but is otherwise the same as
         * [NotificationConfigurationService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<NotificationConfigurationResponse> =
            delete(id, NotificationConfigurationDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: NotificationConfigurationDeleteParams =
                NotificationConfigurationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationConfigurationResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: NotificationConfigurationDeleteParams =
                NotificationConfigurationDeleteParams.none(),
        ): HttpResponseFor<NotificationConfigurationResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: NotificationConfigurationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationConfigurationResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: NotificationConfigurationDeleteParams
        ): HttpResponseFor<NotificationConfigurationResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationConfigurationResponse> =
            delete(id, NotificationConfigurationDeleteParams.none(), requestOptions)
    }
}
