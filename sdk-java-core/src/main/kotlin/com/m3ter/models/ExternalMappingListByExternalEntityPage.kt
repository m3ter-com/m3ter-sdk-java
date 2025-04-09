// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.ExternalMappingService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of External Mapping entities for a specified external system entity.
 *
 * Use this endpoint to retrieve a list of External Mapping entities associated with a specific
 * external system entity. The list can be paginated for easier management.
 */
class ExternalMappingListByExternalEntityPage
private constructor(
    private val externalMappingsService: ExternalMappingService,
    private val params: ExternalMappingListByExternalEntityParams,
    private val response: ExternalMappingListByExternalEntityPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ExternalMappingListByExternalEntityPageResponse = response

    /**
     * Delegates to [ExternalMappingListByExternalEntityPageResponse], but gracefully handles
     * missing data.
     *
     * @see [ExternalMappingListByExternalEntityPageResponse.data]
     */
    fun data(): List<ExternalMappingResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExternalMappingListByExternalEntityPageResponse], but gracefully handles
     * missing data.
     *
     * @see [ExternalMappingListByExternalEntityPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalMappingListByExternalEntityPage && externalMappingsService == other.externalMappingsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalMappingsService, params, response) /* spotless:on */

    override fun toString() =
        "ExternalMappingListByExternalEntityPage{externalMappingsService=$externalMappingsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<ExternalMappingListByExternalEntityParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<ExternalMappingListByExternalEntityPage> {
        return getNextPageParams().map { externalMappingsService.listByExternalEntity(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            externalMappingsService: ExternalMappingService,
            params: ExternalMappingListByExternalEntityParams,
            response: ExternalMappingListByExternalEntityPageResponse,
        ) = ExternalMappingListByExternalEntityPage(externalMappingsService, params, response)
    }

    class AutoPager(private val firstPage: ExternalMappingListByExternalEntityPage) :
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
