// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

import com.m3ter.sdk.core.ClientOptions
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.handlers.errorHandler
import com.m3ter.sdk.core.handlers.jsonHandler
import com.m3ter.sdk.core.handlers.withErrorHandler
import com.m3ter.sdk.core.http.HttpMethod
import com.m3ter.sdk.core.http.HttpRequest
import com.m3ter.sdk.core.http.HttpResponse.Handler
import com.m3ter.sdk.core.prepareAsync
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.Event
import com.m3ter.sdk.models.EventGetFieldsParams
import com.m3ter.sdk.models.EventGetFieldsResponse
import com.m3ter.sdk.models.EventGetTypesParams
import com.m3ter.sdk.models.EventGetTypesResponse
import com.m3ter.sdk.models.EventListPageAsync
import com.m3ter.sdk.models.EventListParams
import com.m3ter.sdk.models.EventRetrieveParams
import java.util.concurrent.CompletableFuture

class EventServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EventServiceAsync {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<Event> =
        jsonHandler<Event>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Retrieve a specific Event.
     *
     * Retrieves detailed information about the specific Event with the given UUID. An Event
     * corresponds to a unique instance of a state change within the system, classified under a
     * specific Event Type.
     */
    override fun retrieve(
        params: EventRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Event> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "events",
                    params.getPathParam(1),
                )
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<EventListPageAsync.Response> =
        jsonHandler<EventListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

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
    override fun list(
        params: EventListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "events")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { EventListPageAsync.of(this, params, it) }
            }
    }

    private val getFieldsHandler: Handler<EventGetFieldsResponse> =
        jsonHandler<EventGetFieldsResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

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
    override fun getFields(
        params: EventGetFieldsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventGetFieldsResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "events", "fields")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { getFieldsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val getTypesHandler: Handler<EventGetTypesResponse> =
        jsonHandler<EventGetTypesResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Retrieve a list of Notification Event Types.
     *
     * This endpoint retrieves a list of Event Types that can have Notification rules configured.
     */
    override fun getTypes(
        params: EventGetTypesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventGetTypesResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "events", "types")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { getTypesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
