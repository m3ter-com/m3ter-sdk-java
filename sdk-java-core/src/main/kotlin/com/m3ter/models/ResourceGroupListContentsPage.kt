// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.ResourceGroupService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [ResourceGroupService.listContents] */
class ResourceGroupListContentsPage
private constructor(
    private val service: ResourceGroupService,
    private val params: ResourceGroupListContentsParams,
    private val response: ResourceGroupListContentsPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<ResourceGroupListContentsParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<ResourceGroupListContentsPage> =
        getNextPageParams().map { service.listContents(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ResourceGroupListContentsParams = params

    /** The response that this page was parsed from. */
    fun response(): ResourceGroupListContentsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ResourceGroupListContentsPage].
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

    /** A builder for [ResourceGroupListContentsPage]. */
    class Builder internal constructor() {

        private var service: ResourceGroupService? = null
        private var params: ResourceGroupListContentsParams? = null
        private var response: ResourceGroupListContentsPageResponse? = null

        @JvmSynthetic
        internal fun from(resourceGroupListContentsPage: ResourceGroupListContentsPage) = apply {
            service = resourceGroupListContentsPage.service
            params = resourceGroupListContentsPage.params
            response = resourceGroupListContentsPage.response
        }

        fun service(service: ResourceGroupService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ResourceGroupListContentsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ResourceGroupListContentsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ResourceGroupListContentsPage].
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
        fun build(): ResourceGroupListContentsPage =
            ResourceGroupListContentsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResourceGroupListContentsPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ResourceGroupListContentsPage{service=$service, params=$params, response=$response}"
}
