// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.BillServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [BillServiceAsync.list] */
class BillListPageAsync
private constructor(
    private val service: BillServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BillListParams,
    private val response: BillListPageResponse,
) : PageAsync<BillResponse> {

    /**
     * Delegates to [BillListPageResponse], but gracefully handles missing data.
     *
     * @see [BillListPageResponse.data]
     */
    fun data(): List<BillResponse> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BillListPageResponse], but gracefully handles missing data.
     *
     * @see [BillListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<BillResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): BillListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<BillListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BillResponse> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BillListParams = params

    /** The response that this page was parsed from. */
    fun response(): BillListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BillListPageAsync].
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

    /** A builder for [BillListPageAsync]. */
    class Builder internal constructor() {

        private var service: BillServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BillListParams? = null
        private var response: BillListPageResponse? = null

        @JvmSynthetic
        internal fun from(billListPageAsync: BillListPageAsync) = apply {
            service = billListPageAsync.service
            streamHandlerExecutor = billListPageAsync.streamHandlerExecutor
            params = billListPageAsync.params
            response = billListPageAsync.response
        }

        fun service(service: BillServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BillListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BillListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BillListPageAsync].
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
        fun build(): BillListPageAsync =
            BillListPageAsync(
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

        return /* spotless:off */ other is BillListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "BillListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
