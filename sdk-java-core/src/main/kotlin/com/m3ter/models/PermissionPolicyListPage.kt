// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.PermissionPolicyService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of PermissionPolicy entities */
class PermissionPolicyListPage
private constructor(
    private val permissionPoliciesService: PermissionPolicyService,
    private val params: PermissionPolicyListParams,
    private val response: PermissionPolicyListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): PermissionPolicyListPageResponse = response

    /**
     * Delegates to [PermissionPolicyListPageResponse], but gracefully handles missing data.
     *
     * @see [PermissionPolicyListPageResponse.data]
     */
    fun data(): List<PermissionPolicyResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PermissionPolicyListPageResponse], but gracefully handles missing data.
     *
     * @see [PermissionPolicyListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PermissionPolicyListPage && permissionPoliciesService == other.permissionPoliciesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(permissionPoliciesService, params, response) /* spotless:on */

    override fun toString() =
        "PermissionPolicyListPage{permissionPoliciesService=$permissionPoliciesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<PermissionPolicyListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<PermissionPolicyListPage> {
        return getNextPageParams().map { permissionPoliciesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            permissionPoliciesService: PermissionPolicyService,
            params: PermissionPolicyListParams,
            response: PermissionPolicyListPageResponse,
        ) = PermissionPolicyListPage(permissionPoliciesService, params, response)
    }

    class AutoPager(private val firstPage: PermissionPolicyListPage) :
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
