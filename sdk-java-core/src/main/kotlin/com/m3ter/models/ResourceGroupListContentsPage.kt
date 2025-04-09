// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.ResourceGroupService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of items for a ResourceGroup */
class ResourceGroupListContentsPage
private constructor(
    private val resourceGroupsService: ResourceGroupService,
    private val params: ResourceGroupListContentsParams,
    private val response: ResourceGroupListContentsPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ResourceGroupListContentsPageResponse = response

    /**
     * Delegates to [ResourceGroupListContentsPageResponse], but gracefully handles missing data.
     *
     * @see [ResourceGroupListContentsPageResponse.data]
     */
    fun data(): List<ResourceGroupListContentsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ResourceGroupListContentsPageResponse], but gracefully handles missing data.
     *
     * @see [ResourceGroupListContentsPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResourceGroupListContentsPage && resourceGroupsService == other.resourceGroupsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(resourceGroupsService, params, response) /* spotless:on */

    override fun toString() =
        "ResourceGroupListContentsPage{resourceGroupsService=$resourceGroupsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<ResourceGroupListContentsParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<ResourceGroupListContentsPage> {
        return getNextPageParams().map { resourceGroupsService.listContents(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            resourceGroupsService: ResourceGroupService,
            params: ResourceGroupListContentsParams,
            response: ResourceGroupListContentsPageResponse,
        ) = ResourceGroupListContentsPage(resourceGroupsService, params, response)
    }

    class AutoPager(private val firstPage: ResourceGroupListContentsPage) :
        Iterable<ResourceGroupListContentsResponse> {

        override fun iterator(): Iterator<ResourceGroupListContentsResponse> = iterator {
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

        fun stream(): Stream<ResourceGroupListContentsResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
