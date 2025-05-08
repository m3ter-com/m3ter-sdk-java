// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.CounterService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [CounterService.list] */
class CounterListPage
private constructor(
    private val service: CounterService,
    private val params: CounterListParams,
    private val response: CounterListPageResponse,
) : Page<CounterResponse> {

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

    override fun items(): List<CounterResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): CounterListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CounterListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CounterResponse> = AutoPager.from(this)

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
