// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.NotificationConfigurationCreateParams
import com.m3ter.sdk.models.NotificationConfigurationDeleteParams
import com.m3ter.sdk.models.NotificationConfigurationListPage
import com.m3ter.sdk.models.NotificationConfigurationListParams
import com.m3ter.sdk.models.NotificationConfigurationResponse
import com.m3ter.sdk.models.NotificationConfigurationRetrieveParams
import com.m3ter.sdk.models.NotificationConfigurationUpdateParams

interface NotificationConfigurationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new Notification for an Event.
     *
     * This endpoint enables you to create a new Event Notification for the specified Organization.
     * You need to supply a request body with the details of the new Notification.
     */
    @JvmOverloads
    fun create(
        params: NotificationConfigurationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationConfigurationResponse

    /**
     * Retrieve the details of a specific Notification using its UUID. Includes the Event the
     * Notification is based on, and any calculation referencing the Event's field and which defines
     * further conditions that must be met to trigger the Notification when the Event occurs.
     */
    @JvmOverloads
    fun retrieve(
        params: NotificationConfigurationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationConfigurationResponse

    /**
     * Update a Notification with the given UUID.
     *
     * This endpoint modifies the configuration details of an existing Notification. You can change
     * the Event that triggers the Notification and/or update the conditions for sending the
     * Notification.
     */
    @JvmOverloads
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
    @JvmOverloads
    fun list(
        params: NotificationConfigurationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationConfigurationListPage

    /**
     * Delete the Notification with the given UUID.
     *
     * This endpoint permanently removes a specified Notification and its configuration. This action
     * cannot be undone.
     */
    @JvmOverloads
    fun delete(
        params: NotificationConfigurationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationConfigurationResponse

    /**
     * A view of [NotificationConfigurationService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/notifications/configurations`, but is otherwise the same as
         * [NotificationConfigurationService.create].
         */
        @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: NotificationConfigurationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationConfigurationResponse>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/notifications/configurations/{id}`, but is otherwise the same as
         * [NotificationConfigurationService.update].
         */
        @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: NotificationConfigurationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationConfigurationListPage>

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/notifications/configurations/{id}`, but is otherwise the same as
         * [NotificationConfigurationService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: NotificationConfigurationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationConfigurationResponse>
    }
}
