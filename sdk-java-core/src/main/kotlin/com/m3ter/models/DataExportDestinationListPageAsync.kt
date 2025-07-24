// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.dataExports.DestinationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see DestinationServiceAsync.list */
class DataExportDestinationListPageAsync
private constructor(
    private val service: DestinationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DataExportDestinationListParams,
    private val response: DataExportDestinationListPageResponse,
) : PageAsync<DataExportDestinationResponse> {

    /**
     * Delegates to [DataExportDestinationListPageResponse], but gracefully handles missing data.
     *
     * @see DataExportDestinationListPageResponse.data
     */
    fun data(): List<DataExportDestinationResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DataExportDestinationListPageResponse], but gracefully handles missing data.
     *
     * @see DataExportDestinationListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<DataExportDestinationResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): DataExportDestinationListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<DataExportDestinationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DataExportDestinationResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DataExportDestinationListParams = params

    /** The response that this page was parsed from. */
    fun response(): DataExportDestinationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DataExportDestinationListPageAsync].
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

    /** A builder for [DataExportDestinationListPageAsync]. */
    class Builder internal constructor() {

        private var service: DestinationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DataExportDestinationListParams? = null
        private var response: DataExportDestinationListPageResponse? = null

        @JvmSynthetic
        internal fun from(dataExportDestinationListPageAsync: DataExportDestinationListPageAsync) =
            apply {
                service = dataExportDestinationListPageAsync.service
                streamHandlerExecutor = dataExportDestinationListPageAsync.streamHandlerExecutor
                params = dataExportDestinationListPageAsync.params
                response = dataExportDestinationListPageAsync.response
            }

        fun service(service: DestinationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DataExportDestinationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DataExportDestinationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [DataExportDestinationListPageAsync].
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
        fun build(): DataExportDestinationListPageAsync =
            DataExportDestinationListPageAsync(
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

        return /* spotless:off */ other is DataExportDestinationListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "DataExportDestinationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
