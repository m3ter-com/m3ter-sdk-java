// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.EventGetFieldsParams
import com.m3ter.models.EventGetFieldsResponse
import com.m3ter.models.EventGetTypesParams
import com.m3ter.models.EventGetTypesResponse
import com.m3ter.models.EventListPageAsync
import com.m3ter.models.EventListParams
import com.m3ter.models.EventResponse
import com.m3ter.models.EventRetrieveParams
import java.util.concurrent.CompletableFuture

interface EventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Retrieve a specific Event.
     *
     * Retrieves detailed information about the specific Event with the given UUID. An Event
     * corresponds to a unique instance of a state change within the system, classified under a
     * specific Event Type.
     */
    fun retrieve(id: String): CompletableFuture<EventResponse> =
        retrieve(id, EventRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: EventRetrieveParams = EventRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: EventRetrieveParams = EventRetrieveParams.none(),
    ): CompletableFuture<EventResponse> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: EventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventResponse>

    /** @see [retrieve] */
    fun retrieve(params: EventRetrieveParams): CompletableFuture<EventResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<EventResponse> =
        retrieve(id, EventRetrieveParams.none(), requestOptions)

    /**
     * List all Events.
     *
     * Retrieve a list of all Events, with options to filter the returned list based on various
     * criteria. Each Event represents a unique instance of a state change within the system,
     * classified under a specific kind of Event.
     *
     * **NOTES:** You can:
     * - Use `eventName` as a valid Query parameter to filter the list of Events returned. For
     *   example: `.../organizations/{orgId}/events?eventName=configuration.commitment.created`
     * - Use the
     *   [List Notification Events](https://www.m3ter.com/docs/api#tag/Events/operation/ListEventTypes)
     *   endpoint in this section. The response lists the valid Query parameters.
     */
    fun list(): CompletableFuture<EventListPageAsync> = list(EventListParams.none())

    /** @see [list] */
    fun list(
        params: EventListParams = EventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventListPageAsync>

    /** @see [list] */
    fun list(
        params: EventListParams = EventListParams.none()
    ): CompletableFuture<EventListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<EventListPageAsync> =
        list(EventListParams.none(), requestOptions)

    /**
     * List Event Fields.
     *
     * Retrieves a list of Fields for a specific Event Type. These Fields are dynamic and forward
     * compatibile, enabling calculation operations on the Event schema.
     *
     * **Notes:**
     * - In many of the Response schema for this call, such as when you retrieve the Fields for a
     *   `configuration.commitment.created` Event Type, `new` represents the attributes the newly
     *   created object has. The Response to a call to retrieve the Fields for a
     *   `configuration.commitment.updated` Event Type will contain Field values for both the `old`
     *   and `new` objects. The Response to a call to retrieve the Fields for a
     *   `configuration.commitment.deleted` Event Type will only contain `old` Fields, for values at
     *   point of deletion. Having access to reference both `new` and `old` Field values for an
     *   object can be very useful if you want to base a Notification rule on an Event and include a
     *   calculation in the rule that, for example, compares `new` values with `old` - for example,
     *   trigger a Notification only when a Commitment has been updated and the `new` value for the
     *   `amount` is at least $1,000 greater than the `old` value.
     * - Some Event types will show `customFields` even though the specific billing or configuration
     *   object the Event is for does not yet have the custom fields functionality implemented. For
     *   these Events, their `customFields` values will not be populated until such time as the
     *   custom fields functionality is implemented for them
     */
    fun getFields(): CompletableFuture<EventGetFieldsResponse> =
        getFields(EventGetFieldsParams.none())

    /** @see [getFields] */
    fun getFields(
        params: EventGetFieldsParams = EventGetFieldsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventGetFieldsResponse>

    /** @see [getFields] */
    fun getFields(
        params: EventGetFieldsParams = EventGetFieldsParams.none()
    ): CompletableFuture<EventGetFieldsResponse> = getFields(params, RequestOptions.none())

    /** @see [getFields] */
    fun getFields(requestOptions: RequestOptions): CompletableFuture<EventGetFieldsResponse> =
        getFields(EventGetFieldsParams.none(), requestOptions)

    /**
     * Retrieve a list of Notification Event Types.
     *
     * This endpoint retrieves a list of Event Types that can have Notification rules configured.
     */
    fun getTypes(): CompletableFuture<EventGetTypesResponse> = getTypes(EventGetTypesParams.none())

    /** @see [getTypes] */
    fun getTypes(
        params: EventGetTypesParams = EventGetTypesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventGetTypesResponse>

    /** @see [getTypes] */
    fun getTypes(
        params: EventGetTypesParams = EventGetTypesParams.none()
    ): CompletableFuture<EventGetTypesResponse> = getTypes(params, RequestOptions.none())

    /** @see [getTypes] */
    fun getTypes(requestOptions: RequestOptions): CompletableFuture<EventGetTypesResponse> =
        getTypes(EventGetTypesParams.none(), requestOptions)

    /** A view of [EventServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/events/{id}`, but is
         * otherwise the same as [EventServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<EventResponse>> =
            retrieve(id, EventRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EventRetrieveParams = EventRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EventRetrieveParams = EventRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EventResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: EventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventResponse>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: EventRetrieveParams
        ): CompletableFuture<HttpResponseFor<EventResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventResponse>> =
            retrieve(id, EventRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/events`, but is otherwise the
         * same as [EventServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<EventListPageAsync>> =
            list(EventListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: EventListParams = EventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: EventListParams = EventListParams.none()
        ): CompletableFuture<HttpResponseFor<EventListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EventListPageAsync>> =
            list(EventListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/events/fields`, but is
         * otherwise the same as [EventServiceAsync.getFields].
         */
        @MustBeClosed
        fun getFields(): CompletableFuture<HttpResponseFor<EventGetFieldsResponse>> =
            getFields(EventGetFieldsParams.none())

        /** @see [getFields] */
        @MustBeClosed
        fun getFields(
            params: EventGetFieldsParams = EventGetFieldsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventGetFieldsResponse>>

        /** @see [getFields] */
        @MustBeClosed
        fun getFields(
            params: EventGetFieldsParams = EventGetFieldsParams.none()
        ): CompletableFuture<HttpResponseFor<EventGetFieldsResponse>> =
            getFields(params, RequestOptions.none())

        /** @see [getFields] */
        @MustBeClosed
        fun getFields(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EventGetFieldsResponse>> =
            getFields(EventGetFieldsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/events/types`, but is
         * otherwise the same as [EventServiceAsync.getTypes].
         */
        @MustBeClosed
        fun getTypes(): CompletableFuture<HttpResponseFor<EventGetTypesResponse>> =
            getTypes(EventGetTypesParams.none())

        /** @see [getTypes] */
        @MustBeClosed
        fun getTypes(
            params: EventGetTypesParams = EventGetTypesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventGetTypesResponse>>

        /** @see [getTypes] */
        @MustBeClosed
        fun getTypes(
            params: EventGetTypesParams = EventGetTypesParams.none()
        ): CompletableFuture<HttpResponseFor<EventGetTypesResponse>> =
            getTypes(params, RequestOptions.none())

        /** @see [getTypes] */
        @MustBeClosed
        fun getTypes(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EventGetTypesResponse>> =
            getTypes(EventGetTypesParams.none(), requestOptions)
    }
}
