// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.CommitmentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [CommitmentServiceAsync.list] */
class CommitmentListPageAsync
private constructor(
    private val service: CommitmentServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CommitmentListParams,
    private val response: CommitmentListPageResponse,
) : PageAsync<CommitmentResponse> {

    /**
     * Delegates to [CommitmentListPageResponse], but gracefully handles missing data.
     *
     * @see [CommitmentListPageResponse.data]
     */
    fun data(): List<CommitmentResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CommitmentListPageResponse], but gracefully handles missing data.
     *
     * @see [CommitmentListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<CommitmentResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): CommitmentListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CommitmentListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CommitmentResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CommitmentListParams = params

    /** The response that this page was parsed from. */
    fun response(): CommitmentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CommitmentListPageAsync].
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

    /** A builder for [CommitmentListPageAsync]. */
    class Builder internal constructor() {

        private var service: CommitmentServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CommitmentListParams? = null
        private var response: CommitmentListPageResponse? = null

        @JvmSynthetic
        internal fun from(commitmentListPageAsync: CommitmentListPageAsync) = apply {
            service = commitmentListPageAsync.service
            streamHandlerExecutor = commitmentListPageAsync.streamHandlerExecutor
            params = commitmentListPageAsync.params
            response = commitmentListPageAsync.response
        }

        fun service(service: CommitmentServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CommitmentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CommitmentListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CommitmentListPageAsync].
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
        fun build(): CommitmentListPageAsync =
            CommitmentListPageAsync(
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

        return /* spotless:off */ other is CommitmentListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "CommitmentListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
