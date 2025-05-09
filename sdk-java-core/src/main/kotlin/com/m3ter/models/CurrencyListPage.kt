// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.CurrencyService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [CurrencyService.list] */
class CurrencyListPage
private constructor(
    private val service: CurrencyService,
    private val params: CurrencyListParams,
    private val response: CurrencyListPageResponse,
) : Page<CurrencyResponse> {

    /**
     * Delegates to [CurrencyListPageResponse], but gracefully handles missing data.
     *
     * @see [CurrencyListPageResponse.data]
     */
    fun data(): List<CurrencyResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CurrencyListPageResponse], but gracefully handles missing data.
     *
     * @see [CurrencyListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<CurrencyResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): CurrencyListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CurrencyListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CurrencyResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CurrencyListParams = params

    /** The response that this page was parsed from. */
    fun response(): CurrencyListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CurrencyListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CurrencyListPage]. */
    class Builder internal constructor() {

        private var service: CurrencyService? = null
        private var params: CurrencyListParams? = null
        private var response: CurrencyListPageResponse? = null

        @JvmSynthetic
        internal fun from(currencyListPage: CurrencyListPage) = apply {
            service = currencyListPage.service
            params = currencyListPage.params
            response = currencyListPage.response
        }

        fun service(service: CurrencyService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CurrencyListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CurrencyListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CurrencyListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CurrencyListPage =
            CurrencyListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CurrencyListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CurrencyListPage{service=$service, params=$params, response=$response}"
}
