// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.PricingServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [PricingServiceAsync.list] */
class PricingListPageAsync
private constructor(
    private val service: PricingServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PricingListParams,
    private val response: PricingListPageResponse,
) : PageAsync<PricingResponse> {

    /**
     * Delegates to [PricingListPageResponse], but gracefully handles missing data.
     *
     * @see [PricingListPageResponse.data]
     */
    fun data(): List<PricingResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PricingListPageResponse], but gracefully handles missing data.
     *
     * @see [PricingListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<PricingResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): PricingListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<PricingListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PricingResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PricingListParams = params

    /** The response that this page was parsed from. */
    fun response(): PricingListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PricingListPageAsync].
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

    /** A builder for [PricingListPageAsync]. */
    class Builder internal constructor() {

        private var service: PricingServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PricingListParams? = null
        private var response: PricingListPageResponse? = null

        @JvmSynthetic
        internal fun from(pricingListPageAsync: PricingListPageAsync) = apply {
            service = pricingListPageAsync.service
            streamHandlerExecutor = pricingListPageAsync.streamHandlerExecutor
            params = pricingListPageAsync.params
            response = pricingListPageAsync.response
        }

        fun service(service: PricingServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PricingListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PricingListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PricingListPageAsync].
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
        fun build(): PricingListPageAsync =
            PricingListPageAsync(
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

        return /* spotless:off */ other is PricingListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "PricingListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
