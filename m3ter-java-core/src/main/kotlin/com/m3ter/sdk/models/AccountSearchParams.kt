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
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Search for Account entities.
 *
 * This endpoint executes a search query for Accounts based on the user specified search criteria.
 * The search query is customizable, allowing for complex nested conditions and sorting. The
 * returned list of Accounts can be paginated for easier management.
 */
class AccountSearchParams
private constructor(
    private val orgId: String,
    private val fromDocument: Long?,
    private val operator: Operator?,
    private val pageSize: Long?,
    private val searchQuery: String?,
    private val sortBy: String?,
    private val sortOrder: SortOrder?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    /** `fromDocument` for multi page retrievals. */
    fun fromDocument(): Optional<Long> = Optional.ofNullable(fromDocument)

    /** Search Operator to be used while querying search. */
    fun operator(): Optional<Operator> = Optional.ofNullable(operator)

    /**
     * Number of Accounts to retrieve per page.
     *
     * **NOTE:** If not defined, default is 10.
     */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Query for data using special syntax:
     * - Query parameters should be delimited using the $ (dollar sign).
     * - Allowed comparators are:
     *     - (greater than) >
     *     - (greater than or equal to) >=
     *     - (equal to) :
     *     - (less than) <
     *     - (less than or equal to) <=
     *     - (match phrase/prefix) ~
     * - Allowed parameters are: name, code, currency, purchaseOrderNumber, parentAccountId, codes,
     *   id, createdBy, dtCreated, lastModifiedBy, ids.
     * - Query example:
     *     - searchQuery=name~Premium On$currency:USD.
     *     - This query is translated into: find accounts whose name contains the phrase/prefix
     *       'Premium On' AND the account currency is USD.
     *
     * **Note:** Using the ~ match phrase/prefix comparator. For best results, we recommend treating
     * this as a "starts with" comparator for your search query.
     */
    fun searchQuery(): Optional<String> = Optional.ofNullable(searchQuery)

    /**
     * Name of the parameter on which sorting is performed. Use any field available on the Account
     * entity to sort by, such as `name`, `code`, and so on.
     */
    fun sortBy(): Optional<String> = Optional.ofNullable(sortBy)

    /** Sorting order. */
    fun sortOrder(): Optional<SortOrder> = Optional.ofNullable(sortOrder)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                fromDocument?.let { put("fromDocument", it.toString()) }
                operator?.let { put("operator", it.asString()) }
                pageSize?.let { put("pageSize", it.toString()) }
                searchQuery?.let { put("searchQuery", it) }
                sortBy?.let { put("sortBy", it) }
                sortOrder?.let { put("sortOrder", it.asString()) }
                putAll(additionalQueryParams)
            }
            .build()

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> orgId
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountSearchParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountSearchParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var fromDocument: Long? = null
        private var operator: Operator? = null
        private var pageSize: Long? = null
        private var searchQuery: String? = null
        private var sortBy: String? = null
        private var sortOrder: SortOrder? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(accountSearchParams: AccountSearchParams) = apply {
            orgId = accountSearchParams.orgId
            fromDocument = accountSearchParams.fromDocument
            operator = accountSearchParams.operator
            pageSize = accountSearchParams.pageSize
            searchQuery = accountSearchParams.searchQuery
            sortBy = accountSearchParams.sortBy
            sortOrder = accountSearchParams.sortOrder
            additionalHeaders = accountSearchParams.additionalHeaders.toBuilder()
            additionalQueryParams = accountSearchParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /** `fromDocument` for multi page retrievals. */
        fun fromDocument(fromDocument: Long?) = apply { this.fromDocument = fromDocument }

        /**
         * Alias for [Builder.fromDocument].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun fromDocument(fromDocument: Long) = fromDocument(fromDocument as Long?)

        /** Alias for calling [Builder.fromDocument] with `fromDocument.orElse(null)`. */
        fun fromDocument(fromDocument: Optional<Long>) = fromDocument(fromDocument.getOrNull())

        /** Search Operator to be used while querying search. */
        fun operator(operator: Operator?) = apply { this.operator = operator }

        /** Alias for calling [Builder.operator] with `operator.orElse(null)`. */
        fun operator(operator: Optional<Operator>) = operator(operator.getOrNull())

        /**
         * Number of Accounts to retrieve per page.
         *
         * **NOTE:** If not defined, default is 10.
         */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /**
         * Query for data using special syntax:
         * - Query parameters should be delimited using the $ (dollar sign).
         * - Allowed comparators are:
         *     - (greater than) >
         *     - (greater than or equal to) >=
         *     - (equal to) :
         *     - (less than) <
         *     - (less than or equal to) <=
         *     - (match phrase/prefix) ~
         * - Allowed parameters are: name, code, currency, purchaseOrderNumber, parentAccountId,
         *   codes, id, createdBy, dtCreated, lastModifiedBy, ids.
         * - Query example:
         *     - searchQuery=name~Premium On$currency:USD.
         *     - This query is translated into: find accounts whose name contains the phrase/prefix
         *       'Premium On' AND the account currency is USD.
         *
         * **Note:** Using the ~ match phrase/prefix comparator. For best results, we recommend
         * treating this as a "starts with" comparator for your search query.
         */
        fun searchQuery(searchQuery: String?) = apply { this.searchQuery = searchQuery }

        /** Alias for calling [Builder.searchQuery] with `searchQuery.orElse(null)`. */
        fun searchQuery(searchQuery: Optional<String>) = searchQuery(searchQuery.getOrNull())

        /**
         * Name of the parameter on which sorting is performed. Use any field available on the
         * Account entity to sort by, such as `name`, `code`, and so on.
         */
        fun sortBy(sortBy: String?) = apply { this.sortBy = sortBy }

        /** Alias for calling [Builder.sortBy] with `sortBy.orElse(null)`. */
        fun sortBy(sortBy: Optional<String>) = sortBy(sortBy.getOrNull())

        /** Sorting order. */
        fun sortOrder(sortOrder: SortOrder?) = apply { this.sortOrder = sortOrder }

        /** Alias for calling [Builder.sortOrder] with `sortOrder.orElse(null)`. */
        fun sortOrder(sortOrder: Optional<SortOrder>) = sortOrder(sortOrder.getOrNull())

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
         * Returns an immutable instance of [AccountSearchParams].
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
        fun build(): AccountSearchParams =
            AccountSearchParams(
                checkRequired("orgId", orgId),
                fromDocument,
                operator,
                pageSize,
                searchQuery,
                sortBy,
                sortOrder,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** Search Operator to be used while querying search. */
    class Operator @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AND = of("AND")

            @JvmField val OR = of("OR")

            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
        }

        /** An enum containing [Operator]'s known values. */
        enum class Known {
            AND,
            OR,
        }

        /**
         * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Operator] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AND,
            OR,
            /** An enum member indicating that [Operator] was instantiated with an unknown value. */
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
                AND -> Value.AND
                OR -> Value.OR
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
                AND -> Known.AND
                OR -> Known.OR
                else -> throw M3terInvalidDataException("Unknown Operator: $value")
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

            return /* spotless:off */ other is Operator && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Sorting order. */
    class SortOrder @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ASC = of("ASC")

            @JvmField val DESC = of("DESC")

            @JvmStatic fun of(value: String) = SortOrder(JsonField.of(value))
        }

        /** An enum containing [SortOrder]'s known values. */
        enum class Known {
            ASC,
            DESC,
        }

        /**
         * An enum containing [SortOrder]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SortOrder] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ASC,
            DESC,
            /**
             * An enum member indicating that [SortOrder] was instantiated with an unknown value.
             */
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
                ASC -> Value.ASC
                DESC -> Value.DESC
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
                ASC -> Known.ASC
                DESC -> Known.DESC
                else -> throw M3terInvalidDataException("Unknown SortOrder: $value")
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

            return /* spotless:off */ other is SortOrder && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountSearchParams && orgId == other.orgId && fromDocument == other.fromDocument && operator == other.operator && pageSize == other.pageSize && searchQuery == other.searchQuery && sortBy == other.sortBy && sortOrder == other.sortOrder && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, fromDocument, operator, pageSize, searchQuery, sortBy, sortOrder, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AccountSearchParams{orgId=$orgId, fromDocument=$fromDocument, operator=$operator, pageSize=$pageSize, searchQuery=$searchQuery, sortBy=$sortBy, sortOrder=$sortOrder, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
