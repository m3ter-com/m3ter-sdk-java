// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.ProductServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of Products.
 *
 * This endpoint retrieves a list of all the Products within a specified Organization. The list can
 * be paginated, and supports filtering by specific Product IDs.
 */
class ProductListPageAsync
private constructor(
    private val productsService: ProductServiceAsync,
    private val params: ProductListParams,
    private val response: ProductListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ProductListPageResponse = response

    /**
     * Delegates to [ProductListPageResponse], but gracefully handles missing data.
     *
     * @see [ProductListPageResponse.data]
     */
    fun data(): List<ProductResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ProductListPageResponse], but gracefully handles missing data.
     *
     * @see [ProductListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProductListPageAsync && productsService == other.productsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(productsService, params, response) /* spotless:on */

    override fun toString() =
        "ProductListPageAsync{productsService=$productsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<ProductListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<ProductListPageAsync>> {
        return getNextPageParams()
            .map { productsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            productsService: ProductServiceAsync,
            params: ProductListParams,
            response: ProductListPageResponse,
        ) = ProductListPageAsync(productsService, params, response)
    }

    class AutoPager(private val firstPage: ProductListPageAsync) {

        fun forEach(
            action: Predicate<ProductResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ProductListPageAsync>>.forEach(
                action: (ProductResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<ProductResponse>> {
            val values = mutableListOf<ProductResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
