// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.NotificationConfigurationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [NotificationConfigurationService.list] */
class NotificationConfigurationListPage
private constructor(
    private val service: NotificationConfigurationService,
    private val params: NotificationConfigurationListParams,
    private val response: NotificationConfigurationListPageResponse,
) : Page<NotificationConfigurationResponse> {

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

    override fun items(): List<NotificationConfigurationResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): NotificationConfigurationListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): NotificationConfigurationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<NotificationConfigurationResponse> = AutoPager.from(this)

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
