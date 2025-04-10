// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.CounterService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [CounterService.list] */
class CounterListPage
private constructor(
    private val service: CounterService,
    private val params: CounterListParams,
    private val response: CounterListPageResponse,
) {

    /**
     * Delegates to [CounterListPageResponse], but gracefully handles missing data.
     *
     * @see [CounterListPageResponse.data]
     */
    fun data(): List<CounterResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CounterListPageResponse], but gracefully handles missing data.
     *
     * @see [CounterListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<CounterListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<CounterListPage> = getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CounterListParams = params

    /** The response that this page was parsed from. */
    fun response(): CounterListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CounterListPage].
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

    /** A builder for [CounterListPage]. */
    class Builder internal constructor() {

        private var service: CounterService? = null
        private var params: CounterListParams? = null
        private var response: CounterListPageResponse? = null

        @JvmSynthetic
        internal fun from(counterListPage: CounterListPage) = apply {
            service = counterListPage.service
            params = counterListPage.params
            response = counterListPage.response
        }

        fun service(service: CounterService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CounterListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CounterListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CounterListPage].
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
        fun build(): CounterListPage =
            CounterListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: CounterListPage) : Iterable<CounterResponse> {

        override fun iterator(): Iterator<CounterResponse> = iterator {
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

        fun stream(): Stream<CounterResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CounterListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CounterListPage{service=$service, params=$params, response=$response}"
}
