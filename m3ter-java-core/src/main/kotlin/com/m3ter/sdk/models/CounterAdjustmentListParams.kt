// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.NoAutoDetect
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of CounterAdjustments created for Accounts in your Organization. You can filter
 * the list returned by date, Account ID, or Counter ID.
 *
 * **CONSTRAINTS:**
 * - The `counterId` query parameter is always required when calling this endpoint, used either as a
 *   single query parameter or in combination with any of the other query parameters.
 * - If you want to use the `date`, `dateStart`, or `dateEnd` query parameters, you must also use
 *   the `accountId` query parameter.
 */
class CounterAdjustmentListParams
private constructor(
    private val orgId: String,
    private val accountId: String?,
    private val counterId: String?,
    private val date: String?,
    private val dateEnd: String?,
    private val dateStart: String?,
    private val endDateEnd: String?,
    private val endDateStart: String?,
    private val nextToken: String?,
    private val pageSize: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    /** List CounterAdjustment items for the Account UUID. */
    fun accountId(): Optional<String> = Optional.ofNullable(accountId)

    /** List CounterAdjustment items for the Counter UUID. */
    fun counterId(): Optional<String> = Optional.ofNullable(counterId)

    /** List CounterAdjustment items for the given date. */
    fun date(): Optional<String> = Optional.ofNullable(date)

    fun dateEnd(): Optional<String> = Optional.ofNullable(dateEnd)

    fun dateStart(): Optional<String> = Optional.ofNullable(dateStart)

    /** Only include CounterAdjustments with end dates earlier than this date. */
    fun endDateEnd(): Optional<String> = Optional.ofNullable(endDateEnd)

    /** Only include CounterAdjustments with end dates equal to or later than this date. */
    fun endDateStart(): Optional<String> = Optional.ofNullable(endDateStart)

    /** nextToken for multi page retrievals. */
    fun nextToken(): Optional<String> = Optional.ofNullable(nextToken)

    /** Number of CounterAdjustments to retrieve per page */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.accountId?.let { queryParams.put("accountId", listOf(it.toString())) }
        this.counterId?.let { queryParams.put("counterId", listOf(it.toString())) }
        this.date?.let { queryParams.put("date", listOf(it.toString())) }
        this.dateEnd?.let { queryParams.put("dateEnd", listOf(it.toString())) }
        this.dateStart?.let { queryParams.put("dateStart", listOf(it.toString())) }
        this.endDateEnd?.let { queryParams.put("endDateEnd", listOf(it.toString())) }
        this.endDateStart?.let { queryParams.put("endDateStart", listOf(it.toString())) }
        this.nextToken?.let { queryParams.put("nextToken", listOf(it.toString())) }
        this.pageSize?.let { queryParams.put("pageSize", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> orgId
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CounterAdjustmentListParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CounterAdjustmentListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var accountId: String? = null
        private var counterId: String? = null
        private var date: String? = null
        private var dateEnd: String? = null
        private var dateStart: String? = null
        private var endDateEnd: String? = null
        private var endDateStart: String? = null
        private var nextToken: String? = null
        private var pageSize: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(counterAdjustmentListParams: CounterAdjustmentListParams) = apply {
            orgId = counterAdjustmentListParams.orgId
            accountId = counterAdjustmentListParams.accountId
            counterId = counterAdjustmentListParams.counterId
            date = counterAdjustmentListParams.date
            dateEnd = counterAdjustmentListParams.dateEnd
            dateStart = counterAdjustmentListParams.dateStart
            endDateEnd = counterAdjustmentListParams.endDateEnd
            endDateStart = counterAdjustmentListParams.endDateStart
            nextToken = counterAdjustmentListParams.nextToken
            pageSize = counterAdjustmentListParams.pageSize
            additionalHeaders = counterAdjustmentListParams.additionalHeaders.toBuilder()
            additionalQueryParams = counterAdjustmentListParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /** List CounterAdjustment items for the Account UUID. */
        fun accountId(accountId: String?) = apply { this.accountId = accountId }

        /** Alias for calling [Builder.accountId] with `accountId.orElse(null)`. */
        fun accountId(accountId: Optional<String>) = accountId(accountId.getOrNull())

        /** List CounterAdjustment items for the Counter UUID. */
        fun counterId(counterId: String?) = apply { this.counterId = counterId }

        /** Alias for calling [Builder.counterId] with `counterId.orElse(null)`. */
        fun counterId(counterId: Optional<String>) = counterId(counterId.getOrNull())

        /** List CounterAdjustment items for the given date. */
        fun date(date: String?) = apply { this.date = date }

        /** Alias for calling [Builder.date] with `date.orElse(null)`. */
        fun date(date: Optional<String>) = date(date.getOrNull())

        fun dateEnd(dateEnd: String?) = apply { this.dateEnd = dateEnd }

        /** Alias for calling [Builder.dateEnd] with `dateEnd.orElse(null)`. */
        fun dateEnd(dateEnd: Optional<String>) = dateEnd(dateEnd.getOrNull())

        fun dateStart(dateStart: String?) = apply { this.dateStart = dateStart }

        /** Alias for calling [Builder.dateStart] with `dateStart.orElse(null)`. */
        fun dateStart(dateStart: Optional<String>) = dateStart(dateStart.getOrNull())

        /** Only include CounterAdjustments with end dates earlier than this date. */
        fun endDateEnd(endDateEnd: String?) = apply { this.endDateEnd = endDateEnd }

        /** Alias for calling [Builder.endDateEnd] with `endDateEnd.orElse(null)`. */
        fun endDateEnd(endDateEnd: Optional<String>) = endDateEnd(endDateEnd.getOrNull())

        /** Only include CounterAdjustments with end dates equal to or later than this date. */
        fun endDateStart(endDateStart: String?) = apply { this.endDateStart = endDateStart }

        /** Alias for calling [Builder.endDateStart] with `endDateStart.orElse(null)`. */
        fun endDateStart(endDateStart: Optional<String>) = endDateStart(endDateStart.getOrNull())

        /** nextToken for multi page retrievals. */
        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /** Alias for calling [Builder.nextToken] with `nextToken.orElse(null)`. */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.getOrNull())

        /** Number of CounterAdjustments to retrieve per page */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [CounterAdjustmentListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CounterAdjustmentListParams =
            CounterAdjustmentListParams(
                checkRequired("orgId", orgId),
                accountId,
                counterId,
                date,
                dateEnd,
                dateStart,
                endDateEnd,
                endDateStart,
                nextToken,
                pageSize,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CounterAdjustmentListParams && orgId == other.orgId && accountId == other.accountId && counterId == other.counterId && date == other.date && dateEnd == other.dateEnd && dateStart == other.dateStart && endDateEnd == other.endDateEnd && endDateStart == other.endDateStart && nextToken == other.nextToken && pageSize == other.pageSize && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, accountId, counterId, date, dateEnd, dateStart, endDateEnd, endDateStart, nextToken, pageSize, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CounterAdjustmentListParams{orgId=$orgId, accountId=$accountId, counterId=$counterId, date=$date, dateEnd=$dateEnd, dateStart=$dateStart, endDateEnd=$endDateEnd, endDateStart=$endDateStart, nextToken=$nextToken, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
