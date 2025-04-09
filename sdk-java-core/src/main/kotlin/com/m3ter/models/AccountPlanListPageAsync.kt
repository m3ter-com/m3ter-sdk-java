// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.AccountPlanServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of AccountPlan and AccountPlanGroup entities for the specified Organization.
 *
 * This endpoint retrieves a list of AccountPlans and AccountPlanGroups for a specific Organization.
 * The list can be paginated for easier management, and supports filtering with various parameters.
 *
 * **NOTE:** You cannot use the `product` query parameter as a single filter condition, but must
 * always use it in combination with the `account` query parameter.
 */
class AccountPlanListPageAsync
private constructor(
    private val accountPlansService: AccountPlanServiceAsync,
    private val params: AccountPlanListParams,
    private val response: AccountPlanListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): AccountPlanListPageResponse = response

    /**
     * Delegates to [AccountPlanListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountPlanListPageResponse.data]
     */
    fun data(): List<AccountPlanResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccountPlanListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountPlanListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountPlanListPageAsync && accountPlansService == other.accountPlansService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountPlansService, params, response) /* spotless:on */

    override fun toString() =
        "AccountPlanListPageAsync{accountPlansService=$accountPlansService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<AccountPlanListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<AccountPlanListPageAsync>> {
        return getNextPageParams()
            .map { accountPlansService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            accountPlansService: AccountPlanServiceAsync,
            params: AccountPlanListParams,
            response: AccountPlanListPageResponse,
        ) = AccountPlanListPageAsync(accountPlansService, params, response)
    }

    class AutoPager(private val firstPage: AccountPlanListPageAsync) {

        fun forEach(
            action: Predicate<AccountPlanResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<AccountPlanListPageAsync>>.forEach(
                action: (AccountPlanResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<AccountPlanResponse>> {
            val values = mutableListOf<AccountPlanResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
