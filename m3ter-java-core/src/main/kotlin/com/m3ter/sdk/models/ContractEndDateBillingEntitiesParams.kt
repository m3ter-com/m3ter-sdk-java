// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.m3ter.sdk.core.Enum
import com.m3ter.sdk.core.ExcludeMissing
import com.m3ter.sdk.core.JsonField
import com.m3ter.sdk.core.JsonMissing
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.core.NoAutoDetect
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkKnown
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Apply the specified end-date to billing entities associated with Accounts the Contract has been
 * added to, and apply the end-date to the Contract itself.
 *
 * **NOTES:**
 * - If you want to apply the end-date to the Contract _itself_ - the Contract `id` you use as the
 *   required PATH PARAMETER - you must also specify `CONTRACT` as a `billingEntities` option in the
 *   request body schema.
 * - Only the Contract whose id you specify for the PATH PARAMETER will be end-dated. If there are
 *   other Contracts associated with the Account, these will not be end-dated.
 * - When you successfully end-date billing entities, the version number of each entity is
 *   incremented.
 */
class ContractEndDateBillingEntitiesParams
private constructor(
    private val orgId: String,
    private val id: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    fun id(): String = id

    /**
     * Defines which billing entities associated with the Account will have the specified end-date
     * applied. For example, if you want the specified end-date to be applied to all
     * Prepayments/Commitments created for the Account use `"PREPAYMENT"`.
     */
    fun billingEntities(): List<BillingEntity> = body.billingEntities()

    /** The end date and time applied to the specified billing entities _(in ISO 8601 format)_. */
    fun endDate(): OffsetDateTime = body.endDate()

    /**
     * A Boolean TRUE/FALSE flag. For Parent Accounts, set to TRUE if you want the specified
     * end-date to be applied to any billing entities associated with Child Accounts. _(Optional)_
     */
    fun applyToChildren(): Optional<Boolean> = body.applyToChildren()

    /**
     * Defines which billing entities associated with the Account will have the specified end-date
     * applied. For example, if you want the specified end-date to be applied to all
     * Prepayments/Commitments created for the Account use `"PREPAYMENT"`.
     */
    fun _billingEntities(): JsonField<List<BillingEntity>> = body._billingEntities()

    /** The end date and time applied to the specified billing entities _(in ISO 8601 format)_. */
    fun _endDate(): JsonField<OffsetDateTime> = body._endDate()

    /**
     * A Boolean TRUE/FALSE flag. For Parent Accounts, set to TRUE if you want the specified
     * end-date to be applied to any billing entities associated with Child Accounts. _(Optional)_
     */
    fun _applyToChildren(): JsonField<Boolean> = body._applyToChildren()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> orgId
            1 -> id
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("billingEntities")
        @ExcludeMissing
        private val billingEntities: JsonField<List<BillingEntity>> = JsonMissing.of(),
        @JsonProperty("endDate")
        @ExcludeMissing
        private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("applyToChildren")
        @ExcludeMissing
        private val applyToChildren: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Defines which billing entities associated with the Account will have the specified
         * end-date applied. For example, if you want the specified end-date to be applied to all
         * Prepayments/Commitments created for the Account use `"PREPAYMENT"`.
         */
        fun billingEntities(): List<BillingEntity> = billingEntities.getRequired("billingEntities")

        /**
         * The end date and time applied to the specified billing entities _(in ISO 8601 format)_.
         */
        fun endDate(): OffsetDateTime = endDate.getRequired("endDate")

        /**
         * A Boolean TRUE/FALSE flag. For Parent Accounts, set to TRUE if you want the specified
         * end-date to be applied to any billing entities associated with Child Accounts.
         * _(Optional)_
         */
        fun applyToChildren(): Optional<Boolean> =
            Optional.ofNullable(applyToChildren.getNullable("applyToChildren"))

        /**
         * Defines which billing entities associated with the Account will have the specified
         * end-date applied. For example, if you want the specified end-date to be applied to all
         * Prepayments/Commitments created for the Account use `"PREPAYMENT"`.
         */
        @JsonProperty("billingEntities")
        @ExcludeMissing
        fun _billingEntities(): JsonField<List<BillingEntity>> = billingEntities

        /**
         * The end date and time applied to the specified billing entities _(in ISO 8601 format)_.
         */
        @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

        /**
         * A Boolean TRUE/FALSE flag. For Parent Accounts, set to TRUE if you want the specified
         * end-date to be applied to any billing entities associated with Child Accounts.
         * _(Optional)_
         */
        @JsonProperty("applyToChildren")
        @ExcludeMissing
        fun _applyToChildren(): JsonField<Boolean> = applyToChildren

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            billingEntities()
            endDate()
            applyToChildren()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var billingEntities: JsonField<MutableList<BillingEntity>>? = null
            private var endDate: JsonField<OffsetDateTime>? = null
            private var applyToChildren: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                billingEntities = body.billingEntities.map { it.toMutableList() }
                endDate = body.endDate
                applyToChildren = body.applyToChildren
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Defines which billing entities associated with the Account will have the specified
             * end-date applied. For example, if you want the specified end-date to be applied to
             * all Prepayments/Commitments created for the Account use `"PREPAYMENT"`.
             */
            fun billingEntities(billingEntities: List<BillingEntity>) =
                billingEntities(JsonField.of(billingEntities))

            /**
             * Defines which billing entities associated with the Account will have the specified
             * end-date applied. For example, if you want the specified end-date to be applied to
             * all Prepayments/Commitments created for the Account use `"PREPAYMENT"`.
             */
            fun billingEntities(billingEntities: JsonField<List<BillingEntity>>) = apply {
                this.billingEntities = billingEntities.map { it.toMutableList() }
            }

            /**
             * Defines which billing entities associated with the Account will have the specified
             * end-date applied. For example, if you want the specified end-date to be applied to
             * all Prepayments/Commitments created for the Account use `"PREPAYMENT"`.
             */
            fun addBillingEntity(billingEntity: BillingEntity) = apply {
                billingEntities =
                    (billingEntities ?: JsonField.of(mutableListOf())).also {
                        checkKnown("billingEntities", it).add(billingEntity)
                    }
            }

            /**
             * The end date and time applied to the specified billing entities _(in ISO 8601
             * format)_.
             */
            fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

            /**
             * The end date and time applied to the specified billing entities _(in ISO 8601
             * format)_.
             */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /**
             * A Boolean TRUE/FALSE flag. For Parent Accounts, set to TRUE if you want the specified
             * end-date to be applied to any billing entities associated with Child Accounts.
             * _(Optional)_
             */
            fun applyToChildren(applyToChildren: Boolean) =
                applyToChildren(JsonField.of(applyToChildren))

            /**
             * A Boolean TRUE/FALSE flag. For Parent Accounts, set to TRUE if you want the specified
             * end-date to be applied to any billing entities associated with Child Accounts.
             * _(Optional)_
             */
            fun applyToChildren(applyToChildren: JsonField<Boolean>) = apply {
                this.applyToChildren = applyToChildren
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Body =
                Body(
                    checkRequired("billingEntities", billingEntities).map { it.toImmutable() },
                    checkRequired("endDate", endDate),
                    applyToChildren,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && billingEntities == other.billingEntities && endDate == other.endDate && applyToChildren == other.applyToChildren && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(billingEntities, endDate, applyToChildren, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{billingEntities=$billingEntities, endDate=$endDate, applyToChildren=$applyToChildren, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContractEndDateBillingEntitiesParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            contractEndDateBillingEntitiesParams: ContractEndDateBillingEntitiesParams
        ) = apply {
            orgId = contractEndDateBillingEntitiesParams.orgId
            id = contractEndDateBillingEntitiesParams.id
            body = contractEndDateBillingEntitiesParams.body.toBuilder()
            additionalHeaders = contractEndDateBillingEntitiesParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                contractEndDateBillingEntitiesParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        fun id(id: String) = apply { this.id = id }

        /**
         * Defines which billing entities associated with the Account will have the specified
         * end-date applied. For example, if you want the specified end-date to be applied to all
         * Prepayments/Commitments created for the Account use `"PREPAYMENT"`.
         */
        fun billingEntities(billingEntities: List<BillingEntity>) = apply {
            body.billingEntities(billingEntities)
        }

        /**
         * Defines which billing entities associated with the Account will have the specified
         * end-date applied. For example, if you want the specified end-date to be applied to all
         * Prepayments/Commitments created for the Account use `"PREPAYMENT"`.
         */
        fun billingEntities(billingEntities: JsonField<List<BillingEntity>>) = apply {
            body.billingEntities(billingEntities)
        }

        /**
         * Defines which billing entities associated with the Account will have the specified
         * end-date applied. For example, if you want the specified end-date to be applied to all
         * Prepayments/Commitments created for the Account use `"PREPAYMENT"`.
         */
        fun addBillingEntity(billingEntity: BillingEntity) = apply {
            body.addBillingEntity(billingEntity)
        }

        /**
         * The end date and time applied to the specified billing entities _(in ISO 8601 format)_.
         */
        fun endDate(endDate: OffsetDateTime) = apply { body.endDate(endDate) }

        /**
         * The end date and time applied to the specified billing entities _(in ISO 8601 format)_.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { body.endDate(endDate) }

        /**
         * A Boolean TRUE/FALSE flag. For Parent Accounts, set to TRUE if you want the specified
         * end-date to be applied to any billing entities associated with Child Accounts.
         * _(Optional)_
         */
        fun applyToChildren(applyToChildren: Boolean) = apply {
            body.applyToChildren(applyToChildren)
        }

        /**
         * A Boolean TRUE/FALSE flag. For Parent Accounts, set to TRUE if you want the specified
         * end-date to be applied to any billing entities associated with Child Accounts.
         * _(Optional)_
         */
        fun applyToChildren(applyToChildren: JsonField<Boolean>) = apply {
            body.applyToChildren(applyToChildren)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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

        fun build(): ContractEndDateBillingEntitiesParams =
            ContractEndDateBillingEntitiesParams(
                checkRequired("orgId", orgId),
                checkRequired("id", id),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class BillingEntity @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val CONTRACT = of("CONTRACT")

            @JvmField val ACCOUNTPLAN = of("ACCOUNTPLAN")

            @JvmField val PREPAYMENT = of("PREPAYMENT")

            @JvmField val PRICINGS = of("PRICINGS")

            @JvmField val COUNTER_PRICINGS = of("COUNTER_PRICINGS")

            @JvmStatic fun of(value: String) = BillingEntity(JsonField.of(value))
        }

        /** An enum containing [BillingEntity]'s known values. */
        enum class Known {
            CONTRACT,
            ACCOUNTPLAN,
            PREPAYMENT,
            PRICINGS,
            COUNTER_PRICINGS,
        }

        /**
         * An enum containing [BillingEntity]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [BillingEntity] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CONTRACT,
            ACCOUNTPLAN,
            PREPAYMENT,
            PRICINGS,
            COUNTER_PRICINGS,
            /**
             * An enum member indicating that [BillingEntity] was instantiated with an unknown
             * value.
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
                CONTRACT -> Value.CONTRACT
                ACCOUNTPLAN -> Value.ACCOUNTPLAN
                PREPAYMENT -> Value.PREPAYMENT
                PRICINGS -> Value.PRICINGS
                COUNTER_PRICINGS -> Value.COUNTER_PRICINGS
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
                CONTRACT -> Known.CONTRACT
                ACCOUNTPLAN -> Known.ACCOUNTPLAN
                PREPAYMENT -> Known.PREPAYMENT
                PRICINGS -> Known.PRICINGS
                COUNTER_PRICINGS -> Known.COUNTER_PRICINGS
                else -> throw M3terInvalidDataException("Unknown BillingEntity: $value")
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

            return /* spotless:off */ other is BillingEntity && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractEndDateBillingEntitiesParams && orgId == other.orgId && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ContractEndDateBillingEntitiesParams{orgId=$orgId, id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
