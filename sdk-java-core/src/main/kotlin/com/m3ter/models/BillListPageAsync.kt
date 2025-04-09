// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.BillServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of Bills.
 *
 * This endpoint retrieves a list of all Bills for the given Account within the specified
 * Organization. Optional filters can be applied such as by date range, lock status, or other
 * attributes. The list can also be paginated for easier management.
 */
class BillListPageAsync
private constructor(
    private val billsService: BillServiceAsync,
    private val params: BillListParams,
    private val response: BillListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): BillListPageResponse = response

    /**
     * Delegates to [BillListPageResponse], but gracefully handles missing data.
     *
     * @see [BillListPageResponse.data]
     */
    fun data(): List<BillResponse> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BillListPageResponse], but gracefully handles missing data.
     *
     * @see [BillListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillListPageAsync && billsService == other.billsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(billsService, params, response) /* spotless:on */

    override fun toString() =
        "BillListPageAsync{billsService=$billsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<BillListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<BillListPageAsync>> {
        return getNextPageParams()
            .map { billsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            billsService: BillServiceAsync,
            params: BillListParams,
            response: BillListPageResponse,
        ) = BillListPageAsync(billsService, params, response)
    }

    class AutoPager(private val firstPage: BillListPageAsync) {

        fun forEach(action: Predicate<BillResponse>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<BillListPageAsync>>.forEach(
                action: (BillResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<BillResponse>> {
            val values = mutableListOf<BillResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
