// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.CompoundAggregationService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [CompoundAggregationService.list] */
class CompoundAggregationListPage
private constructor(
    private val service: CompoundAggregationService,
    private val params: CompoundAggregationListParams,
    private val response: CompoundAggregationListPageResponse,
) {

    /**
     * Delegates to [CompoundAggregationListPageResponse], but gracefully handles missing data.
     *
     * @see [CompoundAggregationListPageResponse.data]
     */
    fun data(): List<CompoundAggregationResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CompoundAggregationListPageResponse], but gracefully handles missing data.
     *
     * @see [CompoundAggregationListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<CompoundAggregationListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<CompoundAggregationListPage> =
        getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CompoundAggregationListParams = params

    /** The response that this page was parsed from. */
    fun response(): CompoundAggregationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CompoundAggregationListPage].
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

    /** A builder for [CompoundAggregationListPage]. */
    class Builder internal constructor() {

        private var service: CompoundAggregationService? = null
        private var params: CompoundAggregationListParams? = null
        private var response: CompoundAggregationListPageResponse? = null

        @JvmSynthetic
        internal fun from(compoundAggregationListPage: CompoundAggregationListPage) = apply {
            service = compoundAggregationListPage.service
            params = compoundAggregationListPage.params
            response = compoundAggregationListPage.response
        }

        fun service(service: CompoundAggregationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CompoundAggregationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CompoundAggregationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CompoundAggregationListPage].
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
        fun build(): CompoundAggregationListPage =
            CompoundAggregationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: CompoundAggregationListPage) :
        Iterable<CompoundAggregationResponse> {

        override fun iterator(): Iterator<CompoundAggregationResponse> = iterator {
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

        fun stream(): Stream<CompoundAggregationResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CompoundAggregationListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CompoundAggregationListPage{service=$service, params=$params, response=$response}"
}
