// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.dataExports.JobServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of Export Job entities. */
class DataExportJobListPageAsync
private constructor(
    private val jobsService: JobServiceAsync,
    private val params: DataExportJobListParams,
    private val response: DataExportJobListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): DataExportJobListPageResponse = response

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DataExportJobListPageAsync && jobsService == other.jobsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(jobsService, params, response) /* spotless:on */

    override fun toString() =
        "DataExportJobListPageAsync{jobsService=$jobsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<DataExportJobListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<DataExportJobListPageAsync>> {
        return getNextPageParams()
            .map { jobsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            jobsService: JobServiceAsync,
            params: DataExportJobListParams,
            response: DataExportJobListPageResponse,
        ) = DataExportJobListPageAsync(jobsService, params, response)
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
}
