// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.ScheduledEventConfigurationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ScheduledEventConfigurationService.list */
class ScheduledEventConfigurationListPage
private constructor(
    private val service: ScheduledEventConfigurationService,
    private val params: ScheduledEventConfigurationListParams,
    private val response: ScheduledEventConfigurationListPageResponse,
) : Page<ScheduledEventConfigurationResponse> {

    /**
     * Delegates to [ScheduledEventConfigurationListPageResponse], but gracefully handles missing
     * data.
     *
     * @see ScheduledEventConfigurationListPageResponse.data
     */
    fun data(): List<ScheduledEventConfigurationResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ScheduledEventConfigurationListPageResponse], but gracefully handles missing
     * data.
     *
     * @see ScheduledEventConfigurationListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<ScheduledEventConfigurationResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): ScheduledEventConfigurationListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): ScheduledEventConfigurationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ScheduledEventConfigurationResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ScheduledEventConfigurationListParams = params

    /** The response that this page was parsed from. */
    fun response(): ScheduledEventConfigurationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ScheduledEventConfigurationListPage].
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

    /** A builder for [ScheduledEventConfigurationListPage]. */
    class Builder internal constructor() {

        private var service: ScheduledEventConfigurationService? = null
        private var params: ScheduledEventConfigurationListParams? = null
        private var response: ScheduledEventConfigurationListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            scheduledEventConfigurationListPage: ScheduledEventConfigurationListPage
        ) = apply {
            service = scheduledEventConfigurationListPage.service
            params = scheduledEventConfigurationListPage.params
            response = scheduledEventConfigurationListPage.response
        }

        fun service(service: ScheduledEventConfigurationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ScheduledEventConfigurationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ScheduledEventConfigurationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ScheduledEventConfigurationListPage].
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
        fun build(): ScheduledEventConfigurationListPage =
            ScheduledEventConfigurationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScheduledEventConfigurationListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ScheduledEventConfigurationListPage{service=$service, params=$params, response=$response}"
}
