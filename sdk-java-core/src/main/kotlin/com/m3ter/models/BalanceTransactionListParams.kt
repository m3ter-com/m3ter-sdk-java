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
 * Retrieve all Transactions for a specific Balance.
 *
 * This endpoint returns a list of all Transactions associated with a specific Balance. You can
 * paginate through the Transactions by using the `pageSize` and `nextToken` parameters.
 */
class BalanceTransactionListParams
private constructor(
    private val orgId: String?,
    private val balanceId: String?,
    private val entityId: String?,
    private val entityType: EntityType?,
    private val nextToken: String?,
    private val pageSize: Int?,
    private val transactionTypeId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    fun balanceId(): Optional<String> = Optional.ofNullable(balanceId)

    fun entityId(): Optional<String> = Optional.ofNullable(entityId)

    fun entityType(): Optional<EntityType> = Optional.ofNullable(entityType)

    /**
     * `nextToken` for multi page retrievals. A token for retrieving the next page of transactions.
     * You'll get this from the response to your request.
     */
    fun nextToken(): Optional<String> = Optional.ofNullable(nextToken)

    /** The maximum number of transactions to return per page. */
    fun pageSize(): Optional<Int> = Optional.ofNullable(pageSize)

    fun transactionTypeId(): Optional<String> = Optional.ofNullable(transactionTypeId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): BalanceTransactionListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [BalanceTransactionListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BalanceTransactionListParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var balanceId: String? = null
        private var entityId: String? = null
        private var entityType: EntityType? = null
        private var nextToken: String? = null
        private var pageSize: Int? = null
        private var transactionTypeId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(balanceTransactionListParams: BalanceTransactionListParams) = apply {
            orgId = balanceTransactionListParams.orgId
            balanceId = balanceTransactionListParams.balanceId
            entityId = balanceTransactionListParams.entityId
            entityType = balanceTransactionListParams.entityType
            nextToken = balanceTransactionListParams.nextToken
            pageSize = balanceTransactionListParams.pageSize
            transactionTypeId = balanceTransactionListParams.transactionTypeId
            additionalHeaders = balanceTransactionListParams.additionalHeaders.toBuilder()
            additionalQueryParams = balanceTransactionListParams.additionalQueryParams.toBuilder()
        }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        fun balanceId(balanceId: String?) = apply { this.balanceId = balanceId }

        /** Alias for calling [Builder.balanceId] with `balanceId.orElse(null)`. */
        fun balanceId(balanceId: Optional<String>) = balanceId(balanceId.getOrNull())

        fun entityId(entityId: String?) = apply { this.entityId = entityId }

        /** Alias for calling [Builder.entityId] with `entityId.orElse(null)`. */
        fun entityId(entityId: Optional<String>) = entityId(entityId.getOrNull())

        fun entityType(entityType: EntityType?) = apply { this.entityType = entityType }

        /** Alias for calling [Builder.entityType] with `entityType.orElse(null)`. */
        fun entityType(entityType: Optional<EntityType>) = entityType(entityType.getOrNull())

        /**
         * `nextToken` for multi page retrievals. A token for retrieving the next page of
         * transactions. You'll get this from the response to your request.
         */
        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /** Alias for calling [Builder.nextToken] with `nextToken.orElse(null)`. */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.getOrNull())

        /** The maximum number of transactions to return per page. */
        fun pageSize(pageSize: Int?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Int) = pageSize(pageSize as Int?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Int>) = pageSize(pageSize.getOrNull())

        fun transactionTypeId(transactionTypeId: String?) = apply {
            this.transactionTypeId = transactionTypeId
        }

        /** Alias for calling [Builder.transactionTypeId] with `transactionTypeId.orElse(null)`. */
        fun transactionTypeId(transactionTypeId: Optional<String>) =
            transactionTypeId(transactionTypeId.getOrNull())

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
         * Returns an immutable instance of [BalanceTransactionListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BalanceTransactionListParams =
            BalanceTransactionListParams(
                orgId,
                balanceId,
                entityId,
                entityType,
                nextToken,
                pageSize,
                transactionTypeId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId ?: ""
            1 -> balanceId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                entityId?.let { put("entityId", it) }
                entityType?.let { put("entityType", it.toString()) }
                nextToken?.let { put("nextToken", it) }
                pageSize?.let { put("pageSize", it.toString()) }
                transactionTypeId?.let { put("transactionTypeId", it) }
                putAll(additionalQueryParams)
            }
            .build()

    class EntityType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val BILL = of("BILL")

            @JvmField val COMMITMENT = of("COMMITMENT")

            @JvmField val USER = of("USER")

            @JvmField val SERVICE_USER = of("SERVICE_USER")

            @JvmField val SCHEDULER = of("SCHEDULER")

            @JvmStatic fun of(value: String) = EntityType(JsonField.of(value))
        }

        /** An enum containing [EntityType]'s known values. */
        enum class Known {
            BILL,
            COMMITMENT,
            USER,
            SERVICE_USER,
            SCHEDULER,
        }

        /**
         * An enum containing [EntityType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EntityType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BILL,
            COMMITMENT,
            USER,
            SERVICE_USER,
            SCHEDULER,
            /**
             * An enum member indicating that [EntityType] was instantiated with an unknown value.
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
                BILL -> Value.BILL
                COMMITMENT -> Value.COMMITMENT
                USER -> Value.USER
                SERVICE_USER -> Value.SERVICE_USER
                SCHEDULER -> Value.SCHEDULER
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
                BILL -> Known.BILL
                COMMITMENT -> Known.COMMITMENT
                USER -> Known.USER
                SERVICE_USER -> Known.SERVICE_USER
                SCHEDULER -> Known.SCHEDULER
                else -> throw M3terInvalidDataException("Unknown EntityType: $value")
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

        fun validate(): EntityType = apply {
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

            return other is EntityType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BalanceTransactionListParams &&
            orgId == other.orgId &&
            balanceId == other.balanceId &&
            entityId == other.entityId &&
            entityType == other.entityType &&
            nextToken == other.nextToken &&
            pageSize == other.pageSize &&
            transactionTypeId == other.transactionTypeId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            orgId,
            balanceId,
            entityId,
            entityType,
            nextToken,
            pageSize,
            transactionTypeId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BalanceTransactionListParams{orgId=$orgId, balanceId=$balanceId, entityId=$entityId, entityType=$entityType, nextToken=$nextToken, pageSize=$pageSize, transactionTypeId=$transactionTypeId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
