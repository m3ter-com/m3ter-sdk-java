// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.ContractService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieves a list of Contracts by Organization ID. Supports pagination and includes various query
 * parameters to filter the Contracts returned based on Contract IDs or short codes.
 */
class ContractListPage
private constructor(
    private val contractsService: ContractService,
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

        return /* spotless:off */ other is ContractListPage && contractsService == other.contractsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(contractsService, params, response) /* spotless:on */

    override fun toString() =
        "ContractListPage{contractsService=$contractsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<ContractListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<ContractListPage> {
        return getNextPageParams().map { contractsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            contractsService: ContractService,
            params: ContractListParams,
            response: ContractListPageResponse,
        ) = ContractListPage(contractsService, params, response)
    }

    class AutoPager(private val firstPage: ContractListPage) : Iterable<ContractResponse> {

        override fun iterator(): Iterator<ContractResponse> = iterator {
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

        fun stream(): Stream<ContractResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
