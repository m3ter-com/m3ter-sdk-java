// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.ResourceGroupService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ResourceGroupService.list */
class ResourceGroupListPage
private constructor(
    private val service: ResourceGroupService,
    private val params: ResourceGroupListParams,
    private val response: ResourceGroupListPageResponse,
) : Page<ResourceGroupResponse> {

    /**
     * Delegates to [ResourceGroupListPageResponse], but gracefully handles missing data.
     *
     * @see ResourceGroupListPageResponse.data
     */
    fun data(): List<ResourceGroupResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ResourceGroupListPageResponse], but gracefully handles missing data.
     *
     * @see ResourceGroupListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<ResourceGroupResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): ResourceGroupListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): ResourceGroupListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ResourceGroupResponse> = AutoPager.from(this)

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
