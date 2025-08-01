// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.CurrencyServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see CurrencyServiceAsync.list */
class CurrencyListPageAsync
private constructor(
    private val service: CurrencyServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CurrencyListParams,
    private val response: CurrencyListPageResponse,
) : PageAsync<CurrencyResponse> {

    /**
     * Delegates to [CurrencyListPageResponse], but gracefully handles missing data.
     *
     * @see CurrencyListPageResponse.data
     */
    fun data(): List<CurrencyResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CurrencyListPageResponse], but gracefully handles missing data.
     *
     * @see CurrencyListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<CurrencyResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): CurrencyListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CurrencyListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CurrencyResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CurrencyListParams = params

    /** The response that this page was parsed from. */
    fun response(): CurrencyListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CurrencyListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CurrencyListPageAsync]. */
    class Builder internal constructor() {

        private var service: CurrencyServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CurrencyListParams? = null
        private var response: CurrencyListPageResponse? = null

        @JvmSynthetic
        internal fun from(currencyListPageAsync: CurrencyListPageAsync) = apply {
            service = currencyListPageAsync.service
            streamHandlerExecutor = currencyListPageAsync.streamHandlerExecutor
            params = currencyListPageAsync.params
            response = currencyListPageAsync.response
        }

        fun service(service: CurrencyServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CurrencyListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CurrencyListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CurrencyListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CurrencyListPageAsync =
            CurrencyListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CurrencyListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "CurrencyListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
