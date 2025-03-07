// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.EventGetFieldsParams
import com.m3ter.sdk.models.EventGetFieldsResponse
import com.m3ter.sdk.models.EventGetTypesParams
import com.m3ter.sdk.models.EventGetTypesResponse
import com.m3ter.sdk.models.EventListPageAsync
import com.m3ter.sdk.models.EventListParams
import com.m3ter.sdk.models.EventResponse
import com.m3ter.sdk.models.EventRetrieveParams
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
    @JvmOverloads
    fun retrieve(
        params: EventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventResponse>

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
    @JvmOverloads
    fun list(
        params: EventListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventListPageAsync>

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
    @JvmOverloads
    fun getFields(
        params: EventGetFieldsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventGetFieldsResponse>

    /**
     * Retrieve a list of Notification Event Types.
     *
     * This endpoint retrieves a list of Event Types that can have Notification rules configured.
     */
    @JvmOverloads
    fun getTypes(
        params: EventGetTypesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventGetTypesResponse>

    /** A view of [EventServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/events/{id}`, but is
         * otherwise the same as [EventServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: EventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/events`, but is otherwise the
         * same as [EventServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: EventListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/events/fields`, but is
         * otherwise the same as [EventServiceAsync.getFields].
         */
        @JvmOverloads
        @MustBeClosed
        fun getFields(
            params: EventGetFieldsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventGetFieldsResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/events/types`, but is
         * otherwise the same as [EventServiceAsync.getTypes].
         */
        @JvmOverloads
        @MustBeClosed
        fun getTypes(
            params: EventGetTypesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventGetTypesResponse>>
    }
}
