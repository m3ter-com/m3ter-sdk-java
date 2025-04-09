// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.NotificationConfigurationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of Event Notifications for the specified Organization.
 *
 * This endpoint retrieves a list of all Event Notifications for the Organization identified by its
 * UUID. The list can be paginated for easier management. The list also supports filtering by
 * parameters such as Notification UUID.
 */
class NotificationConfigurationListPageAsync
private constructor(
    private val notificationConfigurationsService: NotificationConfigurationServiceAsync,
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

        return /* spotless:off */ other is NotificationConfigurationListPageAsync && notificationConfigurationsService == other.notificationConfigurationsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(notificationConfigurationsService, params, response) /* spotless:on */

    override fun toString() =
        "NotificationConfigurationListPageAsync{notificationConfigurationsService=$notificationConfigurationsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<NotificationConfigurationListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<NotificationConfigurationListPageAsync>> {
        return getNextPageParams()
            .map { notificationConfigurationsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            notificationConfigurationsService: NotificationConfigurationServiceAsync,
            params: NotificationConfigurationListParams,
            response: NotificationConfigurationListPageResponse,
        ) =
            NotificationConfigurationListPageAsync(
                notificationConfigurationsService,
                params,
                response,
            )
    }

    class AutoPager(private val firstPage: NotificationConfigurationListPageAsync) {

        fun forEach(
            action: Predicate<NotificationConfigurationResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<NotificationConfigurationListPageAsync>>.forEach(
                action: (NotificationConfigurationResponse) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.data().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<NotificationConfigurationResponse>> {
            val values = mutableListOf<NotificationConfigurationResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
