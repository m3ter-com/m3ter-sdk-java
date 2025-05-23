// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.m3ter.core.Enum
import com.m3ter.core.JsonField
import com.m3ter.core.Params
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import com.m3ter.errors.M3terInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Search for commitment entities.
 *
 * This endpoint executes a search query for Commitments based on the user specified search
 * criteria. The search query is customizable, allowing for complex nested conditions and sorting.
 * The returned list of Commitments can be paginated for easier management.
 */
class CommitmentSearchParams
private constructor(
    private val orgId: String?,
    private val fromDocument: Int?,
    private val operator: Operator?,
    private val pageSize: Int?,
    private val searchQuery: String?,
    private val sortBy: String?,
    private val sortOrder: SortOrder?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    /** `fromDocument` for multi page retrievals. */
    fun fromDocument(): Optional<Int> = Optional.ofNullable(fromDocument)

    /** Search Operator to be used while querying search. */
    fun operator(): Optional<Operator> = Optional.ofNullable(operator)

    /**
     * Number of Commitments to retrieve per page.
     *
     * **NOTE:** If not defined, default is 10.
     */
    fun pageSize(): Optional<Int> = Optional.ofNullable(pageSize)

    /**
     * Query for data using special syntax:
     * - Query parameters should be delimited using $ (dollar sign).
     * - Allowed comparators are:
     *     - (greater than) >
     *     - (greater than or equal to) >=
     *     - (equal to) :
     *     - (less than) <
     *     - (less than or equal to) <=
     *     - (match phrase/prefix) ~
     * - Allowed parameters: startDate, endDate, contractId, accountId, productId, productIds, id,
     *   createdBy, dtCreated, lastModifiedBy, ids.
     * - Query example:
     *     - searchQuery=startDate>2023-01-01$accountId:062085ab-a301-4f21-a081-411020864452.
     *     - This query is translated into: find commitments where the startDate is older than
     *       2023-01-01 AND the accountId is equal to 062085ab-a301-4f21-a081-411020864452.
     *
     * **Note:** Using the ~ match phrase/prefix comparator. For best results, we recommend treating
     * this as a "starts with" comparator for your search query.
     */
    fun searchQuery(): Optional<String> = Optional.ofNullable(searchQuery)

    /**
     * Name of the parameter on which sorting is performed. Use any field available on the
     * Commitment entity to sort by, such as `accountId`, `endDate`, and so on.
     */
    fun sortBy(): Optional<String> = Optional.ofNullable(sortBy)

    /** Sorting order. */
    fun sortOrder(): Optional<SortOrder> = Optional.ofNullable(sortOrder)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CommitmentSearchParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CommitmentSearchParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommitmentSearchParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var fromDocument: Int? = null
        private var operator: Operator? = null
        private var pageSize: Int? = null
        private var searchQuery: String? = null
        private var sortBy: String? = null
        private var sortOrder: SortOrder? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(commitmentSearchParams: CommitmentSearchParams) = apply {
            orgId = commitmentSearchParams.orgId
            fromDocument = commitmentSearchParams.fromDocument
            operator = commitmentSearchParams.operator
            pageSize = commitmentSearchParams.pageSize
            searchQuery = commitmentSearchParams.searchQuery
            sortBy = commitmentSearchParams.sortBy
            sortOrder = commitmentSearchParams.sortOrder
            additionalHeaders = commitmentSearchParams.additionalHeaders.toBuilder()
            additionalQueryParams = commitmentSearchParams.additionalQueryParams.toBuilder()
        }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        /** `fromDocument` for multi page retrievals. */
        fun fromDocument(fromDocument: Int?) = apply { this.fromDocument = fromDocument }

        /**
         * Alias for [Builder.fromDocument].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun fromDocument(fromDocument: Int) = fromDocument(fromDocument as Int?)

        /** Alias for calling [Builder.fromDocument] with `fromDocument.orElse(null)`. */
        fun fromDocument(fromDocument: Optional<Int>) = fromDocument(fromDocument.getOrNull())

        /** Search Operator to be used while querying search. */
        fun operator(operator: Operator?) = apply { this.operator = operator }

        /** Alias for calling [Builder.operator] with `operator.orElse(null)`. */
        fun operator(operator: Optional<Operator>) = operator(operator.getOrNull())

        /**
         * Number of Commitments to retrieve per page.
         *
         * **NOTE:** If not defined, default is 10.
         */
        fun pageSize(pageSize: Int?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Int) = pageSize(pageSize as Int?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Int>) = pageSize(pageSize.getOrNull())

        /**
         * Query for data using special syntax:
         * - Query parameters should be delimited using $ (dollar sign).
         * - Allowed comparators are:
         *     - (greater than) >
         *     - (greater than or equal to) >=
         *     - (equal to) :
         *     - (less than) <
         *     - (less than or equal to) <=
         *     - (match phrase/prefix) ~
         * - Allowed parameters: startDate, endDate, contractId, accountId, productId, productIds,
         *   id, createdBy, dtCreated, lastModifiedBy, ids.
         * - Query example:
         *     - searchQuery=startDate>2023-01-01$accountId:062085ab-a301-4f21-a081-411020864452.
         *     - This query is translated into: find commitments where the startDate is older than
         *       2023-01-01 AND the accountId is equal to 062085ab-a301-4f21-a081-411020864452.
         *
         * **Note:** Using the ~ match phrase/prefix comparator. For best results, we recommend
         * treating this as a "starts with" comparator for your search query.
         */
        fun searchQuery(searchQuery: String?) = apply { this.searchQuery = searchQuery }

        /** Alias for calling [Builder.searchQuery] with `searchQuery.orElse(null)`. */
        fun searchQuery(searchQuery: Optional<String>) = searchQuery(searchQuery.getOrNull())

        /**
         * Name of the parameter on which sorting is performed. Use any field available on the
         * Commitment entity to sort by, such as `accountId`, `endDate`, and so on.
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
         * Returns an immutable instance of [CommitmentSearchParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CommitmentSearchParams =
            CommitmentSearchParams(
                orgId,
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

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                fromDocument?.let { put("fromDocument", it.toString()) }
                operator?.let { put("operator", it.toString()) }
                pageSize?.let { put("pageSize", it.toString()) }
                searchQuery?.let { put("searchQuery", it) }
                sortBy?.let { put("sortBy", it) }
                sortOrder?.let { put("sortOrder", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

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

        private var validated: Boolean = false

        fun validate(): Operator = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: M3terInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

        private var validated: Boolean = false

        fun validate(): SortOrder = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: M3terInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

        return /* spotless:off */ other is CommitmentSearchParams && orgId == other.orgId && fromDocument == other.fromDocument && operator == other.operator && pageSize == other.pageSize && searchQuery == other.searchQuery && sortBy == other.sortBy && sortOrder == other.sortOrder && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, fromDocument, operator, pageSize, searchQuery, sortBy, sortOrder, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CommitmentSearchParams{orgId=$orgId, fromDocument=$fromDocument, operator=$operator, pageSize=$pageSize, searchQuery=$searchQuery, sortBy=$sortBy, sortOrder=$sortOrder, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
