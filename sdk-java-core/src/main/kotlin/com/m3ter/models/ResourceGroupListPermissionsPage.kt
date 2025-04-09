// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.ResourceGroupService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of permission policies for a ResourceGroup */
class ResourceGroupListPermissionsPage
private constructor(
    private val resourceGroupsService: ResourceGroupService,
    private val params: ResourceGroupListPermissionsParams,
    private val response: ResourceGroupListPermissionsPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ResourceGroupListPermissionsPageResponse = response

    /**
     * Delegates to [ResourceGroupListPermissionsPageResponse], but gracefully handles missing data.
     *
     * @see [ResourceGroupListPermissionsPageResponse.data]
     */
    fun data(): List<PermissionPolicyResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ResourceGroupListPermissionsPageResponse], but gracefully handles missing data.
     *
     * @see [ResourceGroupListPermissionsPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResourceGroupListPermissionsPage && resourceGroupsService == other.resourceGroupsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(resourceGroupsService, params, response) /* spotless:on */

    override fun toString() =
        "ResourceGroupListPermissionsPage{resourceGroupsService=$resourceGroupsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<ResourceGroupListPermissionsParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<ResourceGroupListPermissionsPage> {
        return getNextPageParams().map { resourceGroupsService.listPermissions(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            resourceGroupsService: ResourceGroupService,
            params: ResourceGroupListPermissionsParams,
            response: ResourceGroupListPermissionsPageResponse,
        ) = ResourceGroupListPermissionsPage(resourceGroupsService, params, response)
    }

    class AutoPager(private val firstPage: ResourceGroupListPermissionsPage) :
        Iterable<PermissionPolicyResponse> {

        override fun iterator(): Iterator<PermissionPolicyResponse> = iterator {
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

        fun stream(): Stream<PermissionPolicyResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
