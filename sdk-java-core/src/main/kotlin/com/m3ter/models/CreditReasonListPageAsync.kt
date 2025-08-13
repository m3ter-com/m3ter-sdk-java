// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.CreditReasonServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see CreditReasonServiceAsync.list */
class CreditReasonListPageAsync
private constructor(
    private val service: CreditReasonServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CreditReasonListParams,
    private val response: CreditReasonListPageResponse,
) : PageAsync<CreditReasonResponse> {

    /**
     * Delegates to [CreditReasonListPageResponse], but gracefully handles missing data.
     *
     * @see CreditReasonListPageResponse.data
     */
    fun data(): List<CreditReasonResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CreditReasonListPageResponse], but gracefully handles missing data.
     *
     * @see CreditReasonListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<CreditReasonResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): CreditReasonListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CreditReasonListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CreditReasonResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CreditReasonListParams = params

    /** The response that this page was parsed from. */
    fun response(): CreditReasonListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CreditReasonListPageAsync].
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

    /** A builder for [CreditReasonListPageAsync]. */
    class Builder internal constructor() {

        private var service: CreditReasonServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CreditReasonListParams? = null
        private var response: CreditReasonListPageResponse? = null

        @JvmSynthetic
        internal fun from(creditReasonListPageAsync: CreditReasonListPageAsync) = apply {
            service = creditReasonListPageAsync.service
            streamHandlerExecutor = creditReasonListPageAsync.streamHandlerExecutor
            params = creditReasonListPageAsync.params
            response = creditReasonListPageAsync.response
        }

        fun service(service: CreditReasonServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CreditReasonListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CreditReasonListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CreditReasonListPageAsync].
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
        fun build(): CreditReasonListPageAsync =
            CreditReasonListPageAsync(
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

        return other is CreditReasonListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CreditReasonListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
