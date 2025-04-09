// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.NotificationConfigurationService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of Event Notifications for the specified Organization.
 *
 * This endpoint retrieves a list of all Event Notifications for the Organization identified by its
 * UUID. The list can be paginated for easier management. The list also supports filtering by
 * parameters such as Notification UUID.
 */
class NotificationConfigurationListPage
private constructor(
    private val notificationConfigurationsService: NotificationConfigurationService,
    private val params: NotificationConfigurationListParams,
    private val response: NotificationConfigurationListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): NotificationConfigurationListPageResponse = response

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is NotificationConfigurationListPage && notificationConfigurationsService == other.notificationConfigurationsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(notificationConfigurationsService, params, response) /* spotless:on */

    override fun toString() =
        "NotificationConfigurationListPage{notificationConfigurationsService=$notificationConfigurationsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<NotificationConfigurationListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<NotificationConfigurationListPage> {
        return getNextPageParams().map { notificationConfigurationsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            notificationConfigurationsService: NotificationConfigurationService,
            params: NotificationConfigurationListParams,
            response: NotificationConfigurationListPageResponse,
        ) = NotificationConfigurationListPage(notificationConfigurationsService, params, response)
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
}
