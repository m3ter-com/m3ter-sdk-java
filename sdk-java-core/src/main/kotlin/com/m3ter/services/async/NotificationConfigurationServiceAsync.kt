// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.NotificationConfigurationCreateParams
import com.m3ter.models.NotificationConfigurationDeleteParams
import com.m3ter.models.NotificationConfigurationListPageAsync
import com.m3ter.models.NotificationConfigurationListParams
import com.m3ter.models.NotificationConfigurationResponse
import com.m3ter.models.NotificationConfigurationRetrieveParams
import com.m3ter.models.NotificationConfigurationUpdateParams
import java.util.concurrent.CompletableFuture

interface NotificationConfigurationServiceAsync {

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
    fun create(
        params: NotificationConfigurationCreateParams
    ): CompletableFuture<NotificationConfigurationResponse> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: NotificationConfigurationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationConfigurationResponse>

    /**
     * Retrieve the details of a specific Notification using its UUID. Includes the Event the
     * Notification is based on, and any calculation referencing the Event's field and which defines
     * further conditions that must be met to trigger the Notification when the Event occurs.
     */
    fun retrieve(id: String): CompletableFuture<NotificationConfigurationResponse> =
        retrieve(id, NotificationConfigurationRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: NotificationConfigurationRetrieveParams =
            NotificationConfigurationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationConfigurationResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: NotificationConfigurationRetrieveParams =
            NotificationConfigurationRetrieveParams.none(),
    ): CompletableFuture<NotificationConfigurationResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: NotificationConfigurationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationConfigurationResponse>

    /** @see [retrieve] */
    fun retrieve(
        params: NotificationConfigurationRetrieveParams
    ): CompletableFuture<NotificationConfigurationResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationConfigurationResponse> =
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
    ): CompletableFuture<NotificationConfigurationResponse> =
        update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: NotificationConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationConfigurationResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        params: NotificationConfigurationUpdateParams
    ): CompletableFuture<NotificationConfigurationResponse> = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: NotificationConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationConfigurationResponse>

    /**
     * Retrieve a list of Event Notifications for the specified Organization.
     *
     * This endpoint retrieves a list of all Event Notifications for the Organization identified by
     * its UUID. The list can be paginated for easier management. The list also supports filtering
     * by parameters such as Notification UUID.
     */
    fun list(): CompletableFuture<NotificationConfigurationListPageAsync> =
        list(NotificationConfigurationListParams.none())

    /** @see [list] */
    fun list(
        params: NotificationConfigurationListParams = NotificationConfigurationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationConfigurationListPageAsync>

    /** @see [list] */
    fun list(
        params: NotificationConfigurationListParams = NotificationConfigurationListParams.none()
    ): CompletableFuture<NotificationConfigurationListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<NotificationConfigurationListPageAsync> =
        list(NotificationConfigurationListParams.none(), requestOptions)

    /**
     * Delete the Notification with the given UUID.
     *
     * This endpoint permanently removes a specified Notification and its configuration. This action
     * cannot be undone.
     */
    fun delete(id: String): CompletableFuture<NotificationConfigurationResponse> =
        delete(id, NotificationConfigurationDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: NotificationConfigurationDeleteParams =
            NotificationConfigurationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationConfigurationResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: NotificationConfigurationDeleteParams = NotificationConfigurationDeleteParams.none(),
    ): CompletableFuture<NotificationConfigurationResponse> =
        delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: NotificationConfigurationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationConfigurationResponse>

    /** @see [delete] */
    fun delete(
        params: NotificationConfigurationDeleteParams
    ): CompletableFuture<NotificationConfigurationResponse> = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationConfigurationResponse> =
        delete(id, NotificationConfigurationDeleteParams.none(), requestOptions)

    /**
     * A view of [NotificationConfigurationServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/notifications/configurations`, but is otherwise the same as
         * [NotificationConfigurationServiceAsync.create].
         */
        fun create(
            params: NotificationConfigurationCreateParams
        ): CompletableFuture<HttpResponseFor<NotificationConfigurationResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: NotificationConfigurationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationConfigurationResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/notifications/configurations/{id}`, but is otherwise the same as
         * [NotificationConfigurationServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<NotificationConfigurationResponse>> =
            retrieve(id, NotificationConfigurationRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: NotificationConfigurationRetrieveParams =
                NotificationConfigurationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationConfigurationResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: NotificationConfigurationRetrieveParams =
                NotificationConfigurationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<NotificationConfigurationResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: NotificationConfigurationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationConfigurationResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: NotificationConfigurationRetrieveParams
        ): CompletableFuture<HttpResponseFor<NotificationConfigurationResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationConfigurationResponse>> =
            retrieve(id, NotificationConfigurationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/notifications/configurations/{id}`, but is otherwise the same as
         * [NotificationConfigurationServiceAsync.update].
         */
        fun update(
            id: String,
            params: NotificationConfigurationUpdateParams,
        ): CompletableFuture<HttpResponseFor<NotificationConfigurationResponse>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            id: String,
            params: NotificationConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationConfigurationResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        fun update(
            params: NotificationConfigurationUpdateParams
        ): CompletableFuture<HttpResponseFor<NotificationConfigurationResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: NotificationConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationConfigurationResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/notifications/configurations`, but is otherwise the same as
         * [NotificationConfigurationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<NotificationConfigurationListPageAsync>> =
            list(NotificationConfigurationListParams.none())

        /** @see [list] */
        fun list(
            params: NotificationConfigurationListParams =
                NotificationConfigurationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationConfigurationListPageAsync>>

        /** @see [list] */
        fun list(
            params: NotificationConfigurationListParams = NotificationConfigurationListParams.none()
        ): CompletableFuture<HttpResponseFor<NotificationConfigurationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<NotificationConfigurationListPageAsync>> =
            list(NotificationConfigurationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/notifications/configurations/{id}`, but is otherwise the same as
         * [NotificationConfigurationServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<NotificationConfigurationResponse>> =
            delete(id, NotificationConfigurationDeleteParams.none())

        /** @see [delete] */
        fun delete(
            id: String,
            params: NotificationConfigurationDeleteParams =
                NotificationConfigurationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationConfigurationResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            id: String,
            params: NotificationConfigurationDeleteParams =
                NotificationConfigurationDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<NotificationConfigurationResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: NotificationConfigurationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationConfigurationResponse>>

        /** @see [delete] */
        fun delete(
            params: NotificationConfigurationDeleteParams
        ): CompletableFuture<HttpResponseFor<NotificationConfigurationResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationConfigurationResponse>> =
            delete(id, NotificationConfigurationDeleteParams.none(), requestOptions)
    }
}
