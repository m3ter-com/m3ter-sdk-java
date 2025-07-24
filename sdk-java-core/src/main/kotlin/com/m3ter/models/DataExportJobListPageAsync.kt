// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.dataExports.JobServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see JobServiceAsync.list */
class DataExportJobListPageAsync
private constructor(
    private val service: JobServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DataExportJobListParams,
    private val response: DataExportJobListPageResponse,
) : PageAsync<DataExportJobResponse> {

    /**
     * Delegates to [DataExportJobListPageResponse], but gracefully handles missing data.
     *
     * @see DataExportJobListPageResponse.data
     */
    fun data(): List<DataExportJobResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DataExportJobListPageResponse], but gracefully handles missing data.
     *
     * @see DataExportJobListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<DataExportJobResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): DataExportJobListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<DataExportJobListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DataExportJobResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DataExportJobListParams = params

    /** The response that this page was parsed from. */
    fun response(): DataExportJobListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DataExportJobListPageAsync].
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

    /** A builder for [DataExportJobListPageAsync]. */
    class Builder internal constructor() {

        private var service: JobServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DataExportJobListParams? = null
        private var response: DataExportJobListPageResponse? = null

        @JvmSynthetic
        internal fun from(dataExportJobListPageAsync: DataExportJobListPageAsync) = apply {
            service = dataExportJobListPageAsync.service
            streamHandlerExecutor = dataExportJobListPageAsync.streamHandlerExecutor
            params = dataExportJobListPageAsync.params
            response = dataExportJobListPageAsync.response
        }

        fun service(service: JobServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DataExportJobListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DataExportJobListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DataExportJobListPageAsync].
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
        fun build(): DataExportJobListPageAsync =
            DataExportJobListPageAsync(
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

        return /* spotless:off */ other is DataExportJobListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "DataExportJobListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
