// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.CreditReasonServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of the Credit Reason entities created for your Organization. You can filter the
 * list returned for the call by Credit Reason ID, Credit Reason short code, or by Archive status.
 */
class CreditReasonListPageAsync
private constructor(
    private val creditReasonsService: CreditReasonServiceAsync,
    private val params: CreditReasonListParams,
    private val response: CreditReasonListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CreditReasonListPageResponse = response

    /**
     * Delegates to [CreditReasonListPageResponse], but gracefully handles missing data.
     *
     * @see [CreditReasonListPageResponse.data]
     */
    fun data(): List<CreditReasonResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CreditReasonListPageResponse], but gracefully handles missing data.
     *
     * @see [CreditReasonListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditReasonListPageAsync && creditReasonsService == other.creditReasonsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(creditReasonsService, params, response) /* spotless:on */

    override fun toString() =
        "CreditReasonListPageAsync{creditReasonsService=$creditReasonsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<CreditReasonListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<CreditReasonListPageAsync>> {
        return getNextPageParams()
            .map { creditReasonsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            creditReasonsService: CreditReasonServiceAsync,
            params: CreditReasonListParams,
            response: CreditReasonListPageResponse,
        ) = CreditReasonListPageAsync(creditReasonsService, params, response)
    }

    class AutoPager(private val firstPage: CreditReasonListPageAsync) {

        fun forEach(
            action: Predicate<CreditReasonResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CreditReasonListPageAsync>>.forEach(
                action: (CreditReasonResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<CreditReasonResponse>> {
            val values = mutableListOf<CreditReasonResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
