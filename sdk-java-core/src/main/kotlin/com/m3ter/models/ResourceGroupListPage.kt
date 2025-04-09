// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.ResourceGroupService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [ResourceGroupService.list] */
class ResourceGroupListPage
private constructor(
    private val service: ResourceGroupService,
    private val params: ResourceGroupListParams,
    private val response: ResourceGroupListPageResponse,
) {

    /**
     * Delegates to [ResourceGroupListPageResponse], but gracefully handles missing data.
     *
     * @see [ResourceGroupListPageResponse.data]
     */
    fun data(): List<ResourceGroupResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ResourceGroupListPageResponse], but gracefully handles missing data.
     *
     * @see [ResourceGroupListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<ResourceGroupListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<ResourceGroupListPage> =
        getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ResourceGroupListParams = params

    /** The response that this page was parsed from. */
    fun response(): ResourceGroupListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ResourceGroupListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ResourceGroupListPage]. */
    class Builder internal constructor() {

        private var service: ResourceGroupService? = null
        private var params: ResourceGroupListParams? = null
        private var response: ResourceGroupListPageResponse? = null

        @JvmSynthetic
        internal fun from(resourceGroupListPage: ResourceGroupListPage) = apply {
            service = resourceGroupListPage.service
            params = resourceGroupListPage.params
            response = resourceGroupListPage.response
        }

        fun service(service: ResourceGroupService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ResourceGroupListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ResourceGroupListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ResourceGroupListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ResourceGroupListPage =
            ResourceGroupListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: ResourceGroupListPage) :
        Iterable<ResourceGroupResponse> {

        override fun iterator(): Iterator<ResourceGroupResponse> = iterator {
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

        fun stream(): Stream<ResourceGroupResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResourceGroupListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ResourceGroupListPage{service=$service, params=$params, response=$response}"
}
