// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.ContractServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieves a list of Contracts by Organization ID. Supports pagination and includes various query
 * parameters to filter the Contracts returned based on Contract IDs or short codes.
 */
class ContractListPageAsync
private constructor(
    private val contractsService: ContractServiceAsync,
    private val params: ContractListParams,
    private val response: ContractListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ContractListPageResponse = response

    /**
     * Delegates to [ContractListPageResponse], but gracefully handles missing data.
     *
     * @see [ContractListPageResponse.data]
     */
    fun data(): List<ContractResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ContractListPageResponse], but gracefully handles missing data.
     *
     * @see [ContractListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractListPageAsync && contractsService == other.contractsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(contractsService, params, response) /* spotless:on */

    override fun toString() =
        "ContractListPageAsync{contractsService=$contractsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<ContractListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<ContractListPageAsync>> {
        return getNextPageParams()
            .map { contractsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            contractsService: ContractServiceAsync,
            params: ContractListParams,
            response: ContractListPageResponse,
        ) = ContractListPageAsync(contractsService, params, response)
    }

    class AutoPager(private val firstPage: ContractListPageAsync) {

        fun forEach(
            action: Predicate<ContractResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ContractListPageAsync>>.forEach(
                action: (ContractResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<ContractResponse>> {
            val values = mutableListOf<ContractResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
