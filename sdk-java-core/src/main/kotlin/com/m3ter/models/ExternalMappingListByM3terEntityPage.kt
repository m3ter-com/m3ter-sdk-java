// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.ExternalMappingService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of External Mapping entities for a specified m3ter entity.
 *
 * Use this endpoint to retrieve a list of External Mapping entities associated with a specific
 * m3ter entity. The list can be paginated for easier management.
 */
class ExternalMappingListByM3terEntityPage
private constructor(
    private val externalMappingsService: ExternalMappingService,
    private val params: ExternalMappingListByM3terEntityParams,
    private val response: ExternalMappingListByM3terEntityPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ExternalMappingListByM3terEntityPageResponse = response

    /**
     * Delegates to [ExternalMappingListByM3terEntityPageResponse], but gracefully handles missing
     * data.
     *
     * @see [ExternalMappingListByM3terEntityPageResponse.data]
     */
    fun data(): List<ExternalMappingResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExternalMappingListByM3terEntityPageResponse], but gracefully handles missing
     * data.
     *
     * @see [ExternalMappingListByM3terEntityPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalMappingListByM3terEntityPage && externalMappingsService == other.externalMappingsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalMappingsService, params, response) /* spotless:on */

    override fun toString() =
        "ExternalMappingListByM3terEntityPage{externalMappingsService=$externalMappingsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<ExternalMappingListByM3terEntityParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<ExternalMappingListByM3terEntityPage> {
        return getNextPageParams().map { externalMappingsService.listByM3terEntity(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            externalMappingsService: ExternalMappingService,
            params: ExternalMappingListByM3terEntityParams,
            response: ExternalMappingListByM3terEntityPageResponse,
        ) = ExternalMappingListByM3terEntityPage(externalMappingsService, params, response)
    }

    class AutoPager(private val firstPage: ExternalMappingListByM3terEntityPage) :
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
