// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.dataExports.DestinationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of Export Destination entities. You can filter the list of Destinations returned
 * by UUID.
 */
class DataExportDestinationListPageAsync
private constructor(
    private val destinationsService: DestinationServiceAsync,
    private val params: DataExportDestinationListParams,
    private val response: DataExportDestinationListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): DataExportDestinationListPageResponse = response

    /**
     * Delegates to [DataExportDestinationListPageResponse], but gracefully handles missing data.
     *
     * @see [DataExportDestinationListPageResponse.data]
     */
    fun data(): List<DataExportDestinationResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DataExportDestinationListPageResponse], but gracefully handles missing data.
     *
     * @see [DataExportDestinationListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DataExportDestinationListPageAsync && destinationsService == other.destinationsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(destinationsService, params, response) /* spotless:on */

    override fun toString() =
        "DataExportDestinationListPageAsync{destinationsService=$destinationsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<DataExportDestinationListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<DataExportDestinationListPageAsync>> {
        return getNextPageParams()
            .map { destinationsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            destinationsService: DestinationServiceAsync,
            params: DataExportDestinationListParams,
            response: DataExportDestinationListPageResponse,
        ) = DataExportDestinationListPageAsync(destinationsService, params, response)
    }

    class AutoPager(private val firstPage: DataExportDestinationListPageAsync) {

        fun forEach(
            action: Predicate<DataExportDestinationResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<DataExportDestinationListPageAsync>>.forEach(
                action: (DataExportDestinationResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<DataExportDestinationResponse>> {
            val values = mutableListOf<DataExportDestinationResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
