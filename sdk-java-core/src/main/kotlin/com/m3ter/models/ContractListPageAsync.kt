// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.ContractServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ContractServiceAsync.list */
class ContractListPageAsync
private constructor(
    private val service: ContractServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ContractListParams,
    private val response: ContractListPageResponse,
) : PageAsync<ContractResponse> {

    /**
     * Delegates to [ContractListPageResponse], but gracefully handles missing data.
     *
     * @see ContractListPageResponse.data
     */
    fun data(): List<ContractResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ContractListPageResponse], but gracefully handles missing data.
     *
     * @see ContractListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<ContractResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): ContractListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ContractListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ContractResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ContractListParams = params

    /** The response that this page was parsed from. */
    fun response(): ContractListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ContractListPageAsync].
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

    /** A builder for [ContractListPageAsync]. */
    class Builder internal constructor() {

        private var service: ContractServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ContractListParams? = null
        private var response: ContractListPageResponse? = null

        @JvmSynthetic
        internal fun from(contractListPageAsync: ContractListPageAsync) = apply {
            service = contractListPageAsync.service
            streamHandlerExecutor = contractListPageAsync.streamHandlerExecutor
            params = contractListPageAsync.params
            response = contractListPageAsync.response
        }

        fun service(service: ContractServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ContractListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ContractListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ContractListPageAsync].
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
        fun build(): ContractListPageAsync =
            ContractListPageAsync(
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

        return other is ContractListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ContractListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
