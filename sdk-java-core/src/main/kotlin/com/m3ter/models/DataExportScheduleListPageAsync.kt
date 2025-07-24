// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.dataExports.ScheduleServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ScheduleServiceAsync.list */
class DataExportScheduleListPageAsync
private constructor(
    private val service: ScheduleServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DataExportScheduleListParams,
    private val response: DataExportScheduleListPageResponse,
) : PageAsync<DataExportScheduleListResponse> {

    /**
     * Delegates to [DataExportScheduleListPageResponse], but gracefully handles missing data.
     *
     * @see DataExportScheduleListPageResponse.data
     */
    fun data(): List<DataExportScheduleListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DataExportScheduleListPageResponse], but gracefully handles missing data.
     *
     * @see DataExportScheduleListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<DataExportScheduleListResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): DataExportScheduleListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<DataExportScheduleListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DataExportScheduleListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DataExportScheduleListParams = params

    /** The response that this page was parsed from. */
    fun response(): DataExportScheduleListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DataExportScheduleListPageAsync].
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

    /** A builder for [DataExportScheduleListPageAsync]. */
    class Builder internal constructor() {

        private var service: ScheduleServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DataExportScheduleListParams? = null
        private var response: DataExportScheduleListPageResponse? = null

        @JvmSynthetic
        internal fun from(dataExportScheduleListPageAsync: DataExportScheduleListPageAsync) =
            apply {
                service = dataExportScheduleListPageAsync.service
                streamHandlerExecutor = dataExportScheduleListPageAsync.streamHandlerExecutor
                params = dataExportScheduleListPageAsync.params
                response = dataExportScheduleListPageAsync.response
            }

        fun service(service: ScheduleServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DataExportScheduleListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DataExportScheduleListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [DataExportScheduleListPageAsync].
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
        fun build(): DataExportScheduleListPageAsync =
            DataExportScheduleListPageAsync(
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

        return /* spotless:off */ other is DataExportScheduleListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "DataExportScheduleListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
