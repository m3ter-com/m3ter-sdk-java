// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.PermissionPolicyService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see PermissionPolicyService.list */
class PermissionPolicyListPage
private constructor(
    private val service: PermissionPolicyService,
    private val params: PermissionPolicyListParams,
    private val response: PermissionPolicyListPageResponse,
) : Page<PermissionPolicyResponse> {

    /**
     * Delegates to [PermissionPolicyListPageResponse], but gracefully handles missing data.
     *
     * @see PermissionPolicyListPageResponse.data
     */
    fun data(): List<PermissionPolicyResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PermissionPolicyListPageResponse], but gracefully handles missing data.
     *
     * @see PermissionPolicyListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<PermissionPolicyResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): PermissionPolicyListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): PermissionPolicyListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PermissionPolicyResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PermissionPolicyListParams = params

    /** The response that this page was parsed from. */
    fun response(): PermissionPolicyListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PermissionPolicyListPage].
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

    /** A builder for [PermissionPolicyListPage]. */
    class Builder internal constructor() {

        private var service: PermissionPolicyService? = null
        private var params: PermissionPolicyListParams? = null
        private var response: PermissionPolicyListPageResponse? = null

        @JvmSynthetic
        internal fun from(permissionPolicyListPage: PermissionPolicyListPage) = apply {
            service = permissionPolicyListPage.service
            params = permissionPolicyListPage.params
            response = permissionPolicyListPage.response
        }

        fun service(service: PermissionPolicyService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PermissionPolicyListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PermissionPolicyListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PermissionPolicyListPage].
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
        fun build(): PermissionPolicyListPage =
            PermissionPolicyListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PermissionPolicyListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PermissionPolicyListPage{service=$service, params=$params, response=$response}"
}
