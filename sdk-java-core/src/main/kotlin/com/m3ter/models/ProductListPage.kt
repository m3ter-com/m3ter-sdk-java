// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.ProductService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of Products.
 *
 * This endpoint retrieves a list of all the Products within a specified Organization. The list can
 * be paginated, and supports filtering by specific Product IDs.
 */
class ProductListPage
private constructor(
    private val productsService: ProductService,
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

        return /* spotless:off */ other is ProductListPage && productsService == other.productsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(productsService, params, response) /* spotless:on */

    override fun toString() =
        "ProductListPage{productsService=$productsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<ProductListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<ProductListPage> {
        return getNextPageParams().map { productsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            productsService: ProductService,
            params: ProductListParams,
            response: ProductListPageResponse,
        ) = ProductListPage(productsService, params, response)
    }

    class AutoPager(private val firstPage: ProductListPage) : Iterable<ProductResponse> {

        override fun iterator(): Iterator<ProductResponse> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<ProductResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
