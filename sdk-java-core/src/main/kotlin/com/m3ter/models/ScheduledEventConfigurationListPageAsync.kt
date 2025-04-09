// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.ScheduledEventConfigurationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of ScheduledEventConfiguration entities */
class ScheduledEventConfigurationListPageAsync
private constructor(
    private val scheduledEventConfigurationsService: ScheduledEventConfigurationServiceAsync,
    private val params: ScheduledEventConfigurationListParams,
    private val response: ScheduledEventConfigurationListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ScheduledEventConfigurationListPageResponse = response

    /**
     * Delegates to [ScheduledEventConfigurationListPageResponse], but gracefully handles missing
     * data.
     *
     * @see [ScheduledEventConfigurationListPageResponse.data]
     */
    fun data(): List<ScheduledEventConfigurationResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ScheduledEventConfigurationListPageResponse], but gracefully handles missing
     * data.
     *
     * @see [ScheduledEventConfigurationListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ScheduledEventConfigurationListPageAsync && scheduledEventConfigurationsService == other.scheduledEventConfigurationsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(scheduledEventConfigurationsService, params, response) /* spotless:on */

    override fun toString() =
        "ScheduledEventConfigurationListPageAsync{scheduledEventConfigurationsService=$scheduledEventConfigurationsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<ScheduledEventConfigurationListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<ScheduledEventConfigurationListPageAsync>> {
        return getNextPageParams()
            .map { scheduledEventConfigurationsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            scheduledEventConfigurationsService: ScheduledEventConfigurationServiceAsync,
            params: ScheduledEventConfigurationListParams,
            response: ScheduledEventConfigurationListPageResponse,
        ) =
            ScheduledEventConfigurationListPageAsync(
                scheduledEventConfigurationsService,
                params,
                response,
            )
    }

    class AutoPager(private val firstPage: ScheduledEventConfigurationListPageAsync) {

        fun forEach(
            action: Predicate<ScheduledEventConfigurationResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ScheduledEventConfigurationListPageAsync>>.forEach(
                action: (ScheduledEventConfigurationResponse) -> Boolean,
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

        fun toList(
            executor: Executor
        ): CompletableFuture<List<ScheduledEventConfigurationResponse>> {
            val values = mutableListOf<ScheduledEventConfigurationResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
