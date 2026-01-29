// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.m3ter.core.Enum
import com.m3ter.core.JsonField
import com.m3ter.core.Params
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.time.LocalDate
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of Charge entities */
class ChargeListParams
private constructor(
    private val orgId: String?,
    private val accountId: String?,
    private val billDate: LocalDate?,
    private val entityId: String?,
    private val entityType: EntityType?,
    private val ids: List<String>?,
    private val nextToken: String?,
    private val pageSize: Int?,
    private val scheduleId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    /** List Charge items for the Account UUID */
    fun accountId(): Optional<String> = Optional.ofNullable(accountId)

    /** List Charge items for the Bill Date */
    fun billDate(): Optional<LocalDate> = Optional.ofNullable(billDate)

    /** List Charge items for the Entity UUID */
    fun entityId(): Optional<String> = Optional.ofNullable(entityId)

    /** List Charge items for the EntityType */
    fun entityType(): Optional<EntityType> = Optional.ofNullable(entityType)

    /** List of Charge UUIDs to retrieve */
    fun ids(): Optional<List<String>> = Optional.ofNullable(ids)

    /** nextToken for multi page retrievals */
    fun nextToken(): Optional<String> = Optional.ofNullable(nextToken)

    /** Number of Charges to retrieve per page */
    fun pageSize(): Optional<Int> = Optional.ofNullable(pageSize)

    /** List Charge items for the Schedule UUID */
    fun scheduleId(): Optional<String> = Optional.ofNullable(scheduleId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ChargeListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ChargeListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChargeListParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var accountId: String? = null
        private var billDate: LocalDate? = null
        private var entityId: String? = null
        private var entityType: EntityType? = null
        private var ids: MutableList<String>? = null
        private var nextToken: String? = null
        private var pageSize: Int? = null
        private var scheduleId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(chargeListParams: ChargeListParams) = apply {
            orgId = chargeListParams.orgId
            accountId = chargeListParams.accountId
            billDate = chargeListParams.billDate
            entityId = chargeListParams.entityId
            entityType = chargeListParams.entityType
            ids = chargeListParams.ids?.toMutableList()
            nextToken = chargeListParams.nextToken
            pageSize = chargeListParams.pageSize
            scheduleId = chargeListParams.scheduleId
            additionalHeaders = chargeListParams.additionalHeaders.toBuilder()
            additionalQueryParams = chargeListParams.additionalQueryParams.toBuilder()
        }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        /** List Charge items for the Account UUID */
        fun accountId(accountId: String?) = apply { this.accountId = accountId }

        /** Alias for calling [Builder.accountId] with `accountId.orElse(null)`. */
        fun accountId(accountId: Optional<String>) = accountId(accountId.getOrNull())

        /** List Charge items for the Bill Date */
        fun billDate(billDate: LocalDate?) = apply { this.billDate = billDate }

        /** Alias for calling [Builder.billDate] with `billDate.orElse(null)`. */
        fun billDate(billDate: Optional<LocalDate>) = billDate(billDate.getOrNull())

        /** List Charge items for the Entity UUID */
        fun entityId(entityId: String?) = apply { this.entityId = entityId }

        /** Alias for calling [Builder.entityId] with `entityId.orElse(null)`. */
        fun entityId(entityId: Optional<String>) = entityId(entityId.getOrNull())

        /** List Charge items for the EntityType */
        fun entityType(entityType: EntityType?) = apply { this.entityType = entityType }

        /** Alias for calling [Builder.entityType] with `entityType.orElse(null)`. */
        fun entityType(entityType: Optional<EntityType>) = entityType(entityType.getOrNull())

        /** List of Charge UUIDs to retrieve */
        fun ids(ids: List<String>?) = apply { this.ids = ids?.toMutableList() }

        /** Alias for calling [Builder.ids] with `ids.orElse(null)`. */
        fun ids(ids: Optional<List<String>>) = ids(ids.getOrNull())

        /**
         * Adds a single [String] to [ids].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addId(id: String) = apply { ids = (ids ?: mutableListOf()).apply { add(id) } }

        /** nextToken for multi page retrievals */
        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /** Alias for calling [Builder.nextToken] with `nextToken.orElse(null)`. */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.getOrNull())

        /** Number of Charges to retrieve per page */
        fun pageSize(pageSize: Int?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Int) = pageSize(pageSize as Int?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Int>) = pageSize(pageSize.getOrNull())

        /** List Charge items for the Schedule UUID */
        fun scheduleId(scheduleId: String?) = apply { this.scheduleId = scheduleId }

        /** Alias for calling [Builder.scheduleId] with `scheduleId.orElse(null)`. */
        fun scheduleId(scheduleId: Optional<String>) = scheduleId(scheduleId.getOrNull())

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
         * Returns an immutable instance of [ChargeListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ChargeListParams =
            ChargeListParams(
                orgId,
                accountId,
                billDate,
                entityId,
                entityType,
                ids?.toImmutable(),
                nextToken,
                pageSize,
                scheduleId,
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
                accountId?.let { put("accountId", it) }
                billDate?.let { put("billDate", it.toString()) }
                entityId?.let { put("entityId", it) }
                entityType?.let { put("entityType", it.toString()) }
                ids?.let { put("ids", it.joinToString(",")) }
                nextToken?.let { put("nextToken", it) }
                pageSize?.let { put("pageSize", it.toString()) }
                scheduleId?.let { put("scheduleId", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** List Charge items for the EntityType */
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

            @JvmField val AD_HOC = of("AD_HOC")

            @JvmField val BALANCE = of("BALANCE")

            @JvmStatic fun of(value: String) = EntityType(JsonField.of(value))
        }

        /** An enum containing [EntityType]'s known values. */
        enum class Known {
            AD_HOC,
            BALANCE,
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
            AD_HOC,
            BALANCE,
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
                AD_HOC -> Value.AD_HOC
                BALANCE -> Value.BALANCE
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
                AD_HOC -> Known.AD_HOC
                BALANCE -> Known.BALANCE
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

        return other is ChargeListParams &&
            orgId == other.orgId &&
            accountId == other.accountId &&
            billDate == other.billDate &&
            entityId == other.entityId &&
            entityType == other.entityType &&
            ids == other.ids &&
            nextToken == other.nextToken &&
            pageSize == other.pageSize &&
            scheduleId == other.scheduleId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            orgId,
            accountId,
            billDate,
            entityId,
            entityType,
            ids,
            nextToken,
            pageSize,
            scheduleId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ChargeListParams{orgId=$orgId, accountId=$accountId, billDate=$billDate, entityId=$entityId, entityType=$entityType, ids=$ids, nextToken=$nextToken, pageSize=$pageSize, scheduleId=$scheduleId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
