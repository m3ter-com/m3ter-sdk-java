// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.NotificationConfigurationService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [NotificationConfigurationService.list] */
class NotificationConfigurationListPage
private constructor(
    private val service: NotificationConfigurationService,
    private val params: NotificationConfigurationListParams,
    private val response: NotificationConfigurationListPageResponse,
) {

    /**
     * Delegates to [NotificationConfigurationListPageResponse], but gracefully handles missing
     * data.
     *
     * @see [NotificationConfigurationListPageResponse.data]
     */
    fun data(): List<NotificationConfigurationResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [NotificationConfigurationListPageResponse], but gracefully handles missing
     * data.
     *
     * @see [NotificationConfigurationListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<NotificationConfigurationListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<NotificationConfigurationListPage> =
        getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): NotificationConfigurationListParams = params

    /** The response that this page was parsed from. */
    fun response(): NotificationConfigurationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [NotificationConfigurationListPage].
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

    /** A builder for [NotificationConfigurationListPage]. */
    class Builder internal constructor() {

        private var service: NotificationConfigurationService? = null
        private var params: NotificationConfigurationListParams? = null
        private var response: NotificationConfigurationListPageResponse? = null

        @JvmSynthetic
        internal fun from(notificationConfigurationListPage: NotificationConfigurationListPage) =
            apply {
                service = notificationConfigurationListPage.service
                params = notificationConfigurationListPage.params
                response = notificationConfigurationListPage.response
            }

        fun service(service: NotificationConfigurationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: NotificationConfigurationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NotificationConfigurationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [NotificationConfigurationListPage].
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
        fun build(): NotificationConfigurationListPage =
            NotificationConfigurationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: NotificationConfigurationListPage) :
        Iterable<NotificationConfigurationResponse> {

        override fun iterator(): Iterator<NotificationConfigurationResponse> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<NotificationConfigurationResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is NotificationConfigurationListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "NotificationConfigurationListPage{service=$service, params=$params, response=$response}"
}
