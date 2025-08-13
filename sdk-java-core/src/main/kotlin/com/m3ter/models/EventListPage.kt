// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.EventService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see EventService.list */
class EventListPage
private constructor(
    private val service: EventService,
    private val params: EventListParams,
    private val response: EventListPageResponse,
) : Page<EventResponse> {

    /**
     * Delegates to [EventListPageResponse], but gracefully handles missing data.
     *
     * @see EventListPageResponse.data
     */
    fun data(): List<EventResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EventListPageResponse], but gracefully handles missing data.
     *
     * @see EventListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<EventResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): EventListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): EventListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EventResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EventListParams = params

    /** The response that this page was parsed from. */
    fun response(): EventListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EventListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventListPage]. */
    class Builder internal constructor() {

        private var service: EventService? = null
        private var params: EventListParams? = null
        private var response: EventListPageResponse? = null

        @JvmSynthetic
        internal fun from(eventListPage: EventListPage) = apply {
            service = eventListPage.service
            params = eventListPage.params
            response = eventListPage.response
        }

        fun service(service: EventService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EventListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EventListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EventListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EventListPage =
            EventListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "EventListPage{service=$service, params=$params, response=$response}"
}
