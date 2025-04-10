// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.CounterPricingService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [CounterPricingService.list] */
class CounterPricingListPage
private constructor(
    private val service: CounterPricingService,
    private val params: CounterPricingListParams,
    private val response: CounterPricingListPageResponse,
) {

    /**
     * Delegates to [CounterPricingListPageResponse], but gracefully handles missing data.
     *
     * @see [CounterPricingListPageResponse.data]
     */
    fun data(): List<CounterPricingResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CounterPricingListPageResponse], but gracefully handles missing data.
     *
     * @see [CounterPricingListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<CounterPricingListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<CounterPricingListPage> =
        getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CounterPricingListParams = params

    /** The response that this page was parsed from. */
    fun response(): CounterPricingListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CounterPricingListPage].
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

    /** A builder for [CounterPricingListPage]. */
    class Builder internal constructor() {

        private var service: CounterPricingService? = null
        private var params: CounterPricingListParams? = null
        private var response: CounterPricingListPageResponse? = null

        @JvmSynthetic
        internal fun from(counterPricingListPage: CounterPricingListPage) = apply {
            service = counterPricingListPage.service
            params = counterPricingListPage.params
            response = counterPricingListPage.response
        }

        fun service(service: CounterPricingService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CounterPricingListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CounterPricingListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CounterPricingListPage].
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
        fun build(): CounterPricingListPage =
            CounterPricingListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: CounterPricingListPage) :
        Iterable<CounterPricingResponse> {

        override fun iterator(): Iterator<CounterPricingResponse> = iterator {
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

        fun stream(): Stream<CounterPricingResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CounterPricingListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CounterPricingListPage{service=$service, params=$params, response=$response}"
}
