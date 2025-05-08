// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.ResourceGroupService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [ResourceGroupService.listPermissions] */
class ResourceGroupListPermissionsPage
private constructor(
    private val service: ResourceGroupService,
    private val params: ResourceGroupListPermissionsParams,
    private val response: ResourceGroupListPermissionsPageResponse,
) : Page<PermissionPolicyResponse> {

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

    override fun items(): List<PermissionPolicyResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): ResourceGroupListPermissionsParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): ResourceGroupListPermissionsPage =
        service.listPermissions(nextPageParams())

    fun autoPager(): AutoPager<PermissionPolicyResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ResourceGroupListPermissionsParams = params

    /** The response that this page was parsed from. */
    fun response(): ResourceGroupListPermissionsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ResourceGroupListPermissionsPage].
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

    /** A builder for [ResourceGroupListPermissionsPage]. */
    class Builder internal constructor() {

        private var service: ResourceGroupService? = null
        private var params: ResourceGroupListPermissionsParams? = null
        private var response: ResourceGroupListPermissionsPageResponse? = null

        @JvmSynthetic
        internal fun from(resourceGroupListPermissionsPage: ResourceGroupListPermissionsPage) =
            apply {
                service = resourceGroupListPermissionsPage.service
                params = resourceGroupListPermissionsPage.params
                response = resourceGroupListPermissionsPage.response
            }

        fun service(service: ResourceGroupService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ResourceGroupListPermissionsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ResourceGroupListPermissionsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ResourceGroupListPermissionsPage].
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
        fun build(): ResourceGroupListPermissionsPage =
            ResourceGroupListPermissionsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResourceGroupListPermissionsPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ResourceGroupListPermissionsPage{service=$service, params=$params, response=$response}"
}
