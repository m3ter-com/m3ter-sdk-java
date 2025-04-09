// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.MeterServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of Meters that can be filtered by Product, Meter ID, or Meter short code. */
class MeterListPageAsync
private constructor(
    private val metersService: MeterServiceAsync,
    private val params: MeterListParams,
    private val response: MeterListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): MeterListPageResponse = response

    /**
     * Delegates to [MeterListPageResponse], but gracefully handles missing data.
     *
     * @see [MeterListPageResponse.data]
     */
    fun data(): List<MeterResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MeterListPageResponse], but gracefully handles missing data.
     *
     * @see [MeterListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MeterListPageAsync && metersService == other.metersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(metersService, params, response) /* spotless:on */

    override fun toString() =
        "MeterListPageAsync{metersService=$metersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<MeterListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<MeterListPageAsync>> {
        return getNextPageParams()
            .map { metersService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            metersService: MeterServiceAsync,
            params: MeterListParams,
            response: MeterListPageResponse,
        ) = MeterListPageAsync(metersService, params, response)
    }

    class AutoPager(private val firstPage: MeterListPageAsync) {

        fun forEach(action: Predicate<MeterResponse>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<MeterListPageAsync>>.forEach(
                action: (MeterResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<MeterResponse>> {
            val values = mutableListOf<MeterResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
