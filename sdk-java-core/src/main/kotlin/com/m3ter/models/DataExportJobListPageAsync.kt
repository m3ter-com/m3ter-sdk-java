// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.dataExports.JobServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [JobServiceAsync.list] */
class DataExportJobListPageAsync
private constructor(
    private val service: JobServiceAsync,
    private val params: DataExportJobListParams,
    private val response: DataExportJobListPageResponse,
) {

    /**
     * Delegates to [DataExportJobListPageResponse], but gracefully handles missing data.
     *
     * @see [DataExportJobListPageResponse.data]
     */
    fun data(): List<DataExportJobResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DataExportJobListPageResponse], but gracefully handles missing data.
     *
     * @see [DataExportJobListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<DataExportJobListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<DataExportJobListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

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
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataExportJobListPageAsync]. */
    class Builder internal constructor() {

        private var service: JobServiceAsync? = null
        private var params: DataExportJobListParams? = null
        private var response: DataExportJobListPageResponse? = null

        @JvmSynthetic
        internal fun from(dataExportJobListPageAsync: DataExportJobListPageAsync) = apply {
            service = dataExportJobListPageAsync.service
            params = dataExportJobListPageAsync.params
            response = dataExportJobListPageAsync.response
        }

        fun service(service: JobServiceAsync) = apply { this.service = service }

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
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DataExportJobListPageAsync =
            DataExportJobListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: DataExportJobListPageAsync) {

        fun forEach(
            action: Predicate<DataExportJobResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<DataExportJobListPageAsync>>.forEach(
                action: (DataExportJobResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<DataExportJobResponse>> {
            val values = mutableListOf<DataExportJobResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DataExportJobListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "DataExportJobListPageAsync{service=$service, params=$params, response=$response}"
}
