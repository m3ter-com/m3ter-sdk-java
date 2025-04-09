// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.dataExports.ScheduleServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of Data Export Schedules created for your Organization. You can filter the
 * response by Schedules `ids`.
 *
 * The response will contain an array for both the operational and usage Data Export Schedules in
 * your Organization.
 */
class DataExportScheduleListPageAsync
private constructor(
    private val schedulesService: ScheduleServiceAsync,
    private val params: DataExportScheduleListParams,
    private val response: DataExportScheduleListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): DataExportScheduleListPageResponse = response

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DataExportScheduleListPageAsync && schedulesService == other.schedulesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(schedulesService, params, response) /* spotless:on */

    override fun toString() =
        "DataExportScheduleListPageAsync{schedulesService=$schedulesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<DataExportScheduleListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<DataExportScheduleListPageAsync>> {
        return getNextPageParams()
            .map { schedulesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            schedulesService: ScheduleServiceAsync,
            params: DataExportScheduleListParams,
            response: DataExportScheduleListPageResponse,
        ) = DataExportScheduleListPageAsync(schedulesService, params, response)
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
}
