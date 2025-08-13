// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.TransactionTypeServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see TransactionTypeServiceAsync.list */
class TransactionTypeListPageAsync
private constructor(
    private val service: TransactionTypeServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TransactionTypeListParams,
    private val response: TransactionTypeListPageResponse,
) : PageAsync<TransactionTypeResponse> {

    /**
     * Delegates to [TransactionTypeListPageResponse], but gracefully handles missing data.
     *
     * @see TransactionTypeListPageResponse.data
     */
    fun data(): List<TransactionTypeResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TransactionTypeListPageResponse], but gracefully handles missing data.
     *
     * @see TransactionTypeListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<TransactionTypeResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): TransactionTypeListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<TransactionTypeListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<TransactionTypeResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TransactionTypeListParams = params

    /** The response that this page was parsed from. */
    fun response(): TransactionTypeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TransactionTypeListPageAsync].
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

    /** A builder for [TransactionTypeListPageAsync]. */
    class Builder internal constructor() {

        private var service: TransactionTypeServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TransactionTypeListParams? = null
        private var response: TransactionTypeListPageResponse? = null

        @JvmSynthetic
        internal fun from(transactionTypeListPageAsync: TransactionTypeListPageAsync) = apply {
            service = transactionTypeListPageAsync.service
            streamHandlerExecutor = transactionTypeListPageAsync.streamHandlerExecutor
            params = transactionTypeListPageAsync.params
            response = transactionTypeListPageAsync.response
        }

        fun service(service: TransactionTypeServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TransactionTypeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TransactionTypeListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TransactionTypeListPageAsync].
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
        fun build(): TransactionTypeListPageAsync =
            TransactionTypeListPageAsync(
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

        return other is TransactionTypeListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "TransactionTypeListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
