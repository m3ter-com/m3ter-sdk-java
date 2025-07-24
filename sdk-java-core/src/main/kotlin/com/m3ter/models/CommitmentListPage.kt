// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.CommitmentService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see CommitmentService.list */
class CommitmentListPage
private constructor(
    private val service: CommitmentService,
    private val params: CommitmentListParams,
    private val response: CommitmentListPageResponse,
) : Page<CommitmentResponse> {

    /**
     * Delegates to [CommitmentListPageResponse], but gracefully handles missing data.
     *
     * @see CommitmentListPageResponse.data
     */
    fun data(): List<CommitmentResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CommitmentListPageResponse], but gracefully handles missing data.
     *
     * @see CommitmentListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<CommitmentResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): CommitmentListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CommitmentListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CommitmentResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CommitmentListParams = params

    /** The response that this page was parsed from. */
    fun response(): CommitmentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CommitmentListPage].
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

    /** A builder for [CommitmentListPage]. */
    class Builder internal constructor() {

        private var service: CommitmentService? = null
        private var params: CommitmentListParams? = null
        private var response: CommitmentListPageResponse? = null

        @JvmSynthetic
        internal fun from(commitmentListPage: CommitmentListPage) = apply {
            service = commitmentListPage.service
            params = commitmentListPage.params
            response = commitmentListPage.response
        }

        fun service(service: CommitmentService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CommitmentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CommitmentListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CommitmentListPage].
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
        fun build(): CommitmentListPage =
            CommitmentListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CommitmentListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CommitmentListPage{service=$service, params=$params, response=$response}"
}
