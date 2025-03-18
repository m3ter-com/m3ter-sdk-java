// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.m3ter.sdk.core.Enum
import com.m3ter.sdk.core.JsonField
import com.m3ter.sdk.core.NoAutoDetect
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of Bills.
 *
 * This endpoint retrieves a list of all Bills for the given Account within the specified
 * Organization. Optional filters can be applied such as by date range, lock status, or other
 * attributes. The list can also be paginated for easier management.
 */
class BillListParams
private constructor(
    private val orgId: String,
    private val accountId: String?,
    private val billDate: String?,
    private val billDateEnd: String?,
    private val billDateStart: String?,
    private val billingFrequency: String?,
    private val excludeLineItems: Boolean?,
    private val externalInvoiceDateEnd: String?,
    private val externalInvoiceDateStart: String?,
    private val ids: List<String>?,
    private val includeBillTotal: Boolean?,
    private val locked: Boolean?,
    private val nextToken: String?,
    private val pageSize: Long?,
    private val status: Status?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    /** Optional filter. An Account ID - returns the Bills for the single specified Account. */
    fun accountId(): Optional<String> = Optional.ofNullable(accountId)

    /** The specific date in ISO 8601 format for which you want to retrieve Bills. */
    fun billDate(): Optional<String> = Optional.ofNullable(billDate)

    /** Only include Bills with bill dates earlier than this date. */
    fun billDateEnd(): Optional<String> = Optional.ofNullable(billDateEnd)

    /** Only include Bills with bill dates equal to or later than this date. */
    fun billDateStart(): Optional<String> = Optional.ofNullable(billDateStart)

    fun billingFrequency(): Optional<String> = Optional.ofNullable(billingFrequency)

    /** Exclude Line Items */
    fun excludeLineItems(): Optional<Boolean> = Optional.ofNullable(excludeLineItems)

    /** Only include Bills with external invoice dates earlier than this date. */
    fun externalInvoiceDateEnd(): Optional<String> = Optional.ofNullable(externalInvoiceDateEnd)

    /** Only include Bills with external invoice dates equal to or later than this date. */
    fun externalInvoiceDateStart(): Optional<String> = Optional.ofNullable(externalInvoiceDateStart)

    /** Optional filter. The list of Bill IDs to retrieve. */
    fun ids(): Optional<List<String>> = Optional.ofNullable(ids)

    /** Include Bill Total */
    fun includeBillTotal(): Optional<Boolean> = Optional.ofNullable(includeBillTotal)

    /**
     * Boolean flag specifying whether to include Bills with "locked" status.
     * - **TRUE** - the list inlcudes "locked" Bills.
     * - **FALSE** - excludes "locked" Bills from the list.
     */
    fun locked(): Optional<Boolean> = Optional.ofNullable(locked)

    /**
     * The `nextToken` for multi-page retrievals. It is used to fetch the next page of Bills in a
     * paginated list.
     */
    fun nextToken(): Optional<String> = Optional.ofNullable(nextToken)

    /** Specifies the maximum number of Bills to retrieve per page. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Only include Bills having the given status */
    fun status(): Optional<Status> = Optional.ofNullable(status)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                accountId?.let { put("accountId", it) }
                billDate?.let { put("billDate", it) }
                billDateEnd?.let { put("billDateEnd", it) }
                billDateStart?.let { put("billDateStart", it) }
                billingFrequency?.let { put("billingFrequency", it) }
                excludeLineItems?.let { put("excludeLineItems", it.toString()) }
                externalInvoiceDateEnd?.let { put("externalInvoiceDateEnd", it) }
                externalInvoiceDateStart?.let { put("externalInvoiceDateStart", it) }
                ids?.let { put("ids", it.joinToString(",")) }
                includeBillTotal?.let { put("includeBillTotal", it.toString()) }
                locked?.let { put("locked", it.toString()) }
                nextToken?.let { put("nextToken", it) }
                pageSize?.let { put("pageSize", it.toString()) }
                status?.let { put("status", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BillListParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BillListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var accountId: String? = null
        private var billDate: String? = null
        private var billDateEnd: String? = null
        private var billDateStart: String? = null
        private var billingFrequency: String? = null
        private var excludeLineItems: Boolean? = null
        private var externalInvoiceDateEnd: String? = null
        private var externalInvoiceDateStart: String? = null
        private var ids: MutableList<String>? = null
        private var includeBillTotal: Boolean? = null
        private var locked: Boolean? = null
        private var nextToken: String? = null
        private var pageSize: Long? = null
        private var status: Status? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(billListParams: BillListParams) = apply {
            orgId = billListParams.orgId
            accountId = billListParams.accountId
            billDate = billListParams.billDate
            billDateEnd = billListParams.billDateEnd
            billDateStart = billListParams.billDateStart
            billingFrequency = billListParams.billingFrequency
            excludeLineItems = billListParams.excludeLineItems
            externalInvoiceDateEnd = billListParams.externalInvoiceDateEnd
            externalInvoiceDateStart = billListParams.externalInvoiceDateStart
            ids = billListParams.ids?.toMutableList()
            includeBillTotal = billListParams.includeBillTotal
            locked = billListParams.locked
            nextToken = billListParams.nextToken
            pageSize = billListParams.pageSize
            status = billListParams.status
            additionalHeaders = billListParams.additionalHeaders.toBuilder()
            additionalQueryParams = billListParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /** Optional filter. An Account ID - returns the Bills for the single specified Account. */
        fun accountId(accountId: String?) = apply { this.accountId = accountId }

        /** Alias for calling [Builder.accountId] with `accountId.orElse(null)`. */
        fun accountId(accountId: Optional<String>) = accountId(accountId.getOrNull())

        /** The specific date in ISO 8601 format for which you want to retrieve Bills. */
        fun billDate(billDate: String?) = apply { this.billDate = billDate }

        /** Alias for calling [Builder.billDate] with `billDate.orElse(null)`. */
        fun billDate(billDate: Optional<String>) = billDate(billDate.getOrNull())

        /** Only include Bills with bill dates earlier than this date. */
        fun billDateEnd(billDateEnd: String?) = apply { this.billDateEnd = billDateEnd }

        /** Alias for calling [Builder.billDateEnd] with `billDateEnd.orElse(null)`. */
        fun billDateEnd(billDateEnd: Optional<String>) = billDateEnd(billDateEnd.getOrNull())

        /** Only include Bills with bill dates equal to or later than this date. */
        fun billDateStart(billDateStart: String?) = apply { this.billDateStart = billDateStart }

        /** Alias for calling [Builder.billDateStart] with `billDateStart.orElse(null)`. */
        fun billDateStart(billDateStart: Optional<String>) =
            billDateStart(billDateStart.getOrNull())

        fun billingFrequency(billingFrequency: String?) = apply {
            this.billingFrequency = billingFrequency
        }

        /** Alias for calling [Builder.billingFrequency] with `billingFrequency.orElse(null)`. */
        fun billingFrequency(billingFrequency: Optional<String>) =
            billingFrequency(billingFrequency.getOrNull())

        /** Exclude Line Items */
        fun excludeLineItems(excludeLineItems: Boolean?) = apply {
            this.excludeLineItems = excludeLineItems
        }

        /**
         * Alias for [Builder.excludeLineItems].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun excludeLineItems(excludeLineItems: Boolean) =
            excludeLineItems(excludeLineItems as Boolean?)

        /** Alias for calling [Builder.excludeLineItems] with `excludeLineItems.orElse(null)`. */
        fun excludeLineItems(excludeLineItems: Optional<Boolean>) =
            excludeLineItems(excludeLineItems.getOrNull())

        /** Only include Bills with external invoice dates earlier than this date. */
        fun externalInvoiceDateEnd(externalInvoiceDateEnd: String?) = apply {
            this.externalInvoiceDateEnd = externalInvoiceDateEnd
        }

        /**
         * Alias for calling [Builder.externalInvoiceDateEnd] with
         * `externalInvoiceDateEnd.orElse(null)`.
         */
        fun externalInvoiceDateEnd(externalInvoiceDateEnd: Optional<String>) =
            externalInvoiceDateEnd(externalInvoiceDateEnd.getOrNull())

        /** Only include Bills with external invoice dates equal to or later than this date. */
        fun externalInvoiceDateStart(externalInvoiceDateStart: String?) = apply {
            this.externalInvoiceDateStart = externalInvoiceDateStart
        }

        /**
         * Alias for calling [Builder.externalInvoiceDateStart] with
         * `externalInvoiceDateStart.orElse(null)`.
         */
        fun externalInvoiceDateStart(externalInvoiceDateStart: Optional<String>) =
            externalInvoiceDateStart(externalInvoiceDateStart.getOrNull())

        /** Optional filter. The list of Bill IDs to retrieve. */
        fun ids(ids: List<String>?) = apply { this.ids = ids?.toMutableList() }

        /** Alias for calling [Builder.ids] with `ids.orElse(null)`. */
        fun ids(ids: Optional<List<String>>) = ids(ids.getOrNull())

        /**
         * Adds a single [String] to [ids].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addId(id: String) = apply { ids = (ids ?: mutableListOf()).apply { add(id) } }

        /** Include Bill Total */
        fun includeBillTotal(includeBillTotal: Boolean?) = apply {
            this.includeBillTotal = includeBillTotal
        }

        /**
         * Alias for [Builder.includeBillTotal].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeBillTotal(includeBillTotal: Boolean) =
            includeBillTotal(includeBillTotal as Boolean?)

        /** Alias for calling [Builder.includeBillTotal] with `includeBillTotal.orElse(null)`. */
        fun includeBillTotal(includeBillTotal: Optional<Boolean>) =
            includeBillTotal(includeBillTotal.getOrNull())

        /**
         * Boolean flag specifying whether to include Bills with "locked" status.
         * - **TRUE** - the list inlcudes "locked" Bills.
         * - **FALSE** - excludes "locked" Bills from the list.
         */
        fun locked(locked: Boolean?) = apply { this.locked = locked }

        /**
         * Alias for [Builder.locked].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun locked(locked: Boolean) = locked(locked as Boolean?)

        /** Alias for calling [Builder.locked] with `locked.orElse(null)`. */
        fun locked(locked: Optional<Boolean>) = locked(locked.getOrNull())

        /**
         * The `nextToken` for multi-page retrievals. It is used to fetch the next page of Bills in
         * a paginated list.
         */
        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /** Alias for calling [Builder.nextToken] with `nextToken.orElse(null)`. */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.getOrNull())

        /** Specifies the maximum number of Bills to retrieve per page. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /** Only include Bills having the given status */
        fun status(status: Status?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<Status>) = status(status.getOrNull())

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
         * Returns an immutable instance of [BillListParams].
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
        fun build(): BillListParams =
            BillListParams(
                checkRequired("orgId", orgId),
                accountId,
                billDate,
                billDateEnd,
                billDateStart,
                billingFrequency,
                excludeLineItems,
                externalInvoiceDateEnd,
                externalInvoiceDateStart,
                ids?.toImmutable(),
                includeBillTotal,
                locked,
                nextToken,
                pageSize,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** Only include Bills having the given status */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PENDING = of("PENDING")

            @JvmField val APPROVED = of("APPROVED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            APPROVED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            APPROVED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                APPROVED -> Value.APPROVED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws M3terInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                APPROVED -> Known.APPROVED
                else -> throw M3terInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws M3terInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { M3terInvalidDataException("Value is not a String") }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillListParams && orgId == other.orgId && accountId == other.accountId && billDate == other.billDate && billDateEnd == other.billDateEnd && billDateStart == other.billDateStart && billingFrequency == other.billingFrequency && excludeLineItems == other.excludeLineItems && externalInvoiceDateEnd == other.externalInvoiceDateEnd && externalInvoiceDateStart == other.externalInvoiceDateStart && ids == other.ids && includeBillTotal == other.includeBillTotal && locked == other.locked && nextToken == other.nextToken && pageSize == other.pageSize && status == other.status && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, accountId, billDate, billDateEnd, billDateStart, billingFrequency, excludeLineItems, externalInvoiceDateEnd, externalInvoiceDateStart, ids, includeBillTotal, locked, nextToken, pageSize, status, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BillListParams{orgId=$orgId, accountId=$accountId, billDate=$billDate, billDateEnd=$billDateEnd, billDateStart=$billDateStart, billingFrequency=$billingFrequency, excludeLineItems=$excludeLineItems, externalInvoiceDateEnd=$externalInvoiceDateEnd, externalInvoiceDateStart=$externalInvoiceDateStart, ids=$ids, includeBillTotal=$includeBillTotal, locked=$locked, nextToken=$nextToken, pageSize=$pageSize, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
