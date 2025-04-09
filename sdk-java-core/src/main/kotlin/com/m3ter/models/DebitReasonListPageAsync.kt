// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.DebitReasonServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of the Debit Reason entities created for your Organization. You can filter the
 * list returned for the call by Debit Reason ID, Debit Reason short code, or by Archive status.
 */
class DebitReasonListPageAsync
private constructor(
    private val debitReasonsService: DebitReasonServiceAsync,
    private val params: DebitReasonListParams,
    private val response: DebitReasonListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): DebitReasonListPageResponse = response

    /**
     * Delegates to [DebitReasonListPageResponse], but gracefully handles missing data.
     *
     * @see [DebitReasonListPageResponse.data]
     */
    fun data(): List<DebitReasonResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DebitReasonListPageResponse], but gracefully handles missing data.
     *
     * @see [DebitReasonListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DebitReasonListPageAsync && debitReasonsService == other.debitReasonsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(debitReasonsService, params, response) /* spotless:on */

    override fun toString() =
        "DebitReasonListPageAsync{debitReasonsService=$debitReasonsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<DebitReasonListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<DebitReasonListPageAsync>> {
        return getNextPageParams()
            .map { debitReasonsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            debitReasonsService: DebitReasonServiceAsync,
            params: DebitReasonListParams,
            response: DebitReasonListPageResponse,
        ) = DebitReasonListPageAsync(debitReasonsService, params, response)
    }

    class AutoPager(private val firstPage: DebitReasonListPageAsync) {

        fun forEach(
            action: Predicate<DebitReasonResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<DebitReasonListPageAsync>>.forEach(
                action: (DebitReasonResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<DebitReasonResponse>> {
            val values = mutableListOf<DebitReasonResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
