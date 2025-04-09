// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.dataExports.ScheduleServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [ScheduleServiceAsync.list] */
class DataExportScheduleListPageAsync
private constructor(
    private val service: ScheduleServiceAsync,
    private val params: DataExportScheduleListParams,
    private val response: DataExportScheduleListPageResponse,
) {

    /**
     * Delegates to [DataExportScheduleListPageResponse], but gracefully handles missing data.
     *
     * @see [DataExportScheduleListPageResponse.data]
     */
    fun data(): List<DataExportScheduleListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DataExportScheduleListPageResponse], but gracefully handles missing data.
     *
     * @see [DataExportScheduleListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<DataExportScheduleListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<DataExportScheduleListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

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
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataExportScheduleListPageAsync]. */
    class Builder internal constructor() {

        private var service: ScheduleServiceAsync? = null
        private var params: DataExportScheduleListParams? = null
        private var response: DataExportScheduleListPageResponse? = null

        @JvmSynthetic
        internal fun from(dataExportScheduleListPageAsync: DataExportScheduleListPageAsync) =
            apply {
                service = dataExportScheduleListPageAsync.service
                params = dataExportScheduleListPageAsync.params
                response = dataExportScheduleListPageAsync.response
            }

        fun service(service: ScheduleServiceAsync) = apply { this.service = service }

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
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DataExportScheduleListPageAsync =
            DataExportScheduleListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: DataExportScheduleListPageAsync) {

        fun forEach(
            action: Predicate<DataExportScheduleListResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<DataExportScheduleListPageAsync>>.forEach(
                action: (DataExportScheduleListResponse) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.data().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<DataExportScheduleListResponse>> {
            val values = mutableListOf<DataExportScheduleListResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DataExportScheduleListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "DataExportScheduleListPageAsync{service=$service, params=$params, response=$response}"
}
