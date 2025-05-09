// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.ExternalMappingService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [ExternalMappingService.list] */
class ExternalMappingListPage
private constructor(
    private val service: ExternalMappingService,
    private val params: ExternalMappingListParams,
    private val response: ExternalMappingListPageResponse,
) : Page<ExternalMappingResponse> {

    /**
     * Delegates to [ExternalMappingListPageResponse], but gracefully handles missing data.
     *
     * @see [ExternalMappingListPageResponse.data]
     */
    fun data(): List<ExternalMappingResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExternalMappingListPageResponse], but gracefully handles missing data.
     *
     * @see [ExternalMappingListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<ExternalMappingResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): ExternalMappingListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): ExternalMappingListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ExternalMappingResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ExternalMappingListParams = params

    /** The response that this page was parsed from. */
    fun response(): ExternalMappingListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExternalMappingListPage].
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

    /** A builder for [ExternalMappingListPage]. */
    class Builder internal constructor() {

        private var service: ExternalMappingService? = null
        private var params: ExternalMappingListParams? = null
        private var response: ExternalMappingListPageResponse? = null

        @JvmSynthetic
        internal fun from(externalMappingListPage: ExternalMappingListPage) = apply {
            service = externalMappingListPage.service
            params = externalMappingListPage.params
            response = externalMappingListPage.response
        }

        fun service(service: ExternalMappingService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ExternalMappingListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExternalMappingListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ExternalMappingListPage].
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
        fun build(): ExternalMappingListPage =
            ExternalMappingListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalMappingListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ExternalMappingListPage{service=$service, params=$params, response=$response}"
}
