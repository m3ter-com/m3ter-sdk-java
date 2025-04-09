// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.ScheduledEventConfigurationService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of ScheduledEventConfiguration entities */
class ScheduledEventConfigurationListPage
private constructor(
    private val scheduledEventConfigurationsService: ScheduledEventConfigurationService,
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

        return /* spotless:off */ other is ScheduledEventConfigurationListPage && scheduledEventConfigurationsService == other.scheduledEventConfigurationsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(scheduledEventConfigurationsService, params, response) /* spotless:on */

    override fun toString() =
        "ScheduledEventConfigurationListPage{scheduledEventConfigurationsService=$scheduledEventConfigurationsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<ScheduledEventConfigurationListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<ScheduledEventConfigurationListPage> {
        return getNextPageParams().map { scheduledEventConfigurationsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            scheduledEventConfigurationsService: ScheduledEventConfigurationService,
            params: ScheduledEventConfigurationListParams,
            response: ScheduledEventConfigurationListPageResponse,
        ) =
            ScheduledEventConfigurationListPage(
                scheduledEventConfigurationsService,
                params,
                response,
            )
    }

    class AutoPager(private val firstPage: ScheduledEventConfigurationListPage) :
        Iterable<ScheduledEventConfigurationResponse> {

        override fun iterator(): Iterator<ScheduledEventConfigurationResponse> = iterator {
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

        fun stream(): Stream<ScheduledEventConfigurationResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
