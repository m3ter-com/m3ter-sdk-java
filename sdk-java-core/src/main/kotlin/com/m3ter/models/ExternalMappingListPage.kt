// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.ExternalMappingService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of all External Mapping entities.
 *
 * This endpoint retrieves a list of all External Mapping entities for a specific Organization. The
 * list can be paginated for better management, and supports filtering using the external system.
 */
class ExternalMappingListPage
private constructor(
    private val externalMappingsService: ExternalMappingService,
    private val params: ExternalMappingListParams,
    private val response: ExternalMappingListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ExternalMappingListPageResponse = response

    /**
     * Delegates to [ExternalMappingListPageResponse], but gracefully handles missing data.
     *
     * @see [ExternalMappingListPageResponse.data]
     */
    fun data(): List<ExternalMappingResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExternalMappingListPageResponse], but gracefully handles missing data.
     *
     * @see [ExternalMappingListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalMappingListPage && externalMappingsService == other.externalMappingsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalMappingsService, params, response) /* spotless:on */

    override fun toString() =
        "ExternalMappingListPage{externalMappingsService=$externalMappingsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<ExternalMappingListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<ExternalMappingListPage> {
        return getNextPageParams().map { externalMappingsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            externalMappingsService: ExternalMappingService,
            params: ExternalMappingListParams,
            response: ExternalMappingListPageResponse,
        ) = ExternalMappingListPage(externalMappingsService, params, response)
    }

    class AutoPager(private val firstPage: ExternalMappingListPage) :
        Iterable<ExternalMappingResponse> {

        override fun iterator(): Iterator<ExternalMappingResponse> = iterator {
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

        fun stream(): Stream<ExternalMappingResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
