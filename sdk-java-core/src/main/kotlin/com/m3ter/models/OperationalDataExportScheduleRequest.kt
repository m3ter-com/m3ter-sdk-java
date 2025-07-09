// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.m3ter.core.Enum
import com.m3ter.core.ExcludeMissing
import com.m3ter.core.JsonField
import com.m3ter.core.JsonMissing
import com.m3ter.core.JsonValue
import com.m3ter.core.checkKnown
import com.m3ter.core.checkRequired
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class OperationalDataExportScheduleRequest
private constructor(
    private val operationalDataTypes: JsonField<List<OperationalDataType>>,
    private val sourceType: JsonField<SourceType>,
    private val version: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("operationalDataTypes")
        @ExcludeMissing
        operationalDataTypes: JsonField<List<OperationalDataType>> = JsonMissing.of(),
        @JsonProperty("sourceType")
        @ExcludeMissing
        sourceType: JsonField<SourceType> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
    ) : this(operationalDataTypes, sourceType, version, mutableMapOf())

    /**
     * A list of the entities whose operational data is included in the data export.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operationalDataTypes(): List<OperationalDataType> =
        operationalDataTypes.getRequired("operationalDataTypes")

    /**
     * The type of data to export. Possible values are: OPERATIONAL
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceType(): SourceType = sourceType.getRequired("sourceType")

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun version(): Optional<Long> = version.getOptional("version")

    /**
     * Returns the raw JSON value of [operationalDataTypes].
     *
     * Unlike [operationalDataTypes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("operationalDataTypes")
    @ExcludeMissing
    fun _operationalDataTypes(): JsonField<List<OperationalDataType>> = operationalDataTypes

    /**
     * Returns the raw JSON value of [sourceType].
     *
     * Unlike [sourceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceType")
    @ExcludeMissing
    fun _sourceType(): JsonField<SourceType> = sourceType

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [OperationalDataExportScheduleRequest].
         *
         * The following fields are required:
         * ```java
         * .operationalDataTypes()
         * .sourceType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OperationalDataExportScheduleRequest]. */
    class Builder internal constructor() {

        private var operationalDataTypes: JsonField<MutableList<OperationalDataType>>? = null
        private var sourceType: JsonField<SourceType>? = null
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            operationalDataExportScheduleRequest: OperationalDataExportScheduleRequest
        ) = apply {
            operationalDataTypes =
                operationalDataExportScheduleRequest.operationalDataTypes.map { it.toMutableList() }
            sourceType = operationalDataExportScheduleRequest.sourceType
            version = operationalDataExportScheduleRequest.version
            additionalProperties =
                operationalDataExportScheduleRequest.additionalProperties.toMutableMap()
        }

        /** A list of the entities whose operational data is included in the data export. */
        fun operationalDataTypes(operationalDataTypes: List<OperationalDataType>) =
            operationalDataTypes(JsonField.of(operationalDataTypes))

        /**
         * Sets [Builder.operationalDataTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operationalDataTypes] with a well-typed
         * `List<OperationalDataType>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun operationalDataTypes(operationalDataTypes: JsonField<List<OperationalDataType>>) =
            apply {
                this.operationalDataTypes = operationalDataTypes.map { it.toMutableList() }
            }

        /**
         * Adds a single [OperationalDataType] to [operationalDataTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOperationalDataType(operationalDataType: OperationalDataType) = apply {
            operationalDataTypes =
                (operationalDataTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("operationalDataTypes", it).add(operationalDataType)
                }
        }

        /** The type of data to export. Possible values are: OPERATIONAL */
        fun sourceType(sourceType: SourceType) = sourceType(JsonField.of(sourceType))

        /**
         * Sets [Builder.sourceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceType] with a well-typed [SourceType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceType(sourceType: JsonField<SourceType>) = apply { this.sourceType = sourceType }

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        fun version(version: Long) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<Long>) = apply { this.version = version }

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

        /**
         * Returns an immutable instance of [OperationalDataExportScheduleRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .operationalDataTypes()
         * .sourceType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OperationalDataExportScheduleRequest =
            OperationalDataExportScheduleRequest(
                checkRequired("operationalDataTypes", operationalDataTypes).map {
                    it.toImmutable()
                },
                checkRequired("sourceType", sourceType),
                version,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OperationalDataExportScheduleRequest = apply {
        if (validated) {
            return@apply
        }

        operationalDataTypes().forEach { it.validate() }
        sourceType().validate()
        version()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (operationalDataTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (sourceType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (version.asKnown().isPresent) 1 else 0)

    class OperationalDataType
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val BILLS = of("BILLS")

            @JvmField val COMMITMENTS = of("COMMITMENTS")

            @JvmField val ACCOUNTS = of("ACCOUNTS")

            @JvmField val BALANCES = of("BALANCES")

            @JvmField val CONTRACTS = of("CONTRACTS")

            @JvmField val ACCOUNT_PLANS = of("ACCOUNT_PLANS")

            @JvmField val AGGREGATIONS = of("AGGREGATIONS")

            @JvmField val PLANS = of("PLANS")

            @JvmField val PRICING = of("PRICING")

            @JvmField val PRICING_BANDS = of("PRICING_BANDS")

            @JvmField val BILL_LINE_ITEMS = of("BILL_LINE_ITEMS")

            @JvmField val METERS = of("METERS")

            @JvmField val PRODUCTS = of("PRODUCTS")

            @JvmField val COMPOUND_AGGREGATIONS = of("COMPOUND_AGGREGATIONS")

            @JvmField val PLAN_GROUPS = of("PLAN_GROUPS")

            @JvmField val PLAN_GROUP_LINKS = of("PLAN_GROUP_LINKS")

            @JvmField val PLAN_TEMPLATES = of("PLAN_TEMPLATES")

            @JvmField val BALANCE_TRANSACTIONS = of("BALANCE_TRANSACTIONS")

            @JvmField val TRANSACTION_TYPES = of("TRANSACTION_TYPES")

            @JvmStatic fun of(value: String) = OperationalDataType(JsonField.of(value))
        }

        /** An enum containing [OperationalDataType]'s known values. */
        enum class Known {
            BILLS,
            COMMITMENTS,
            ACCOUNTS,
            BALANCES,
            CONTRACTS,
            ACCOUNT_PLANS,
            AGGREGATIONS,
            PLANS,
            PRICING,
            PRICING_BANDS,
            BILL_LINE_ITEMS,
            METERS,
            PRODUCTS,
            COMPOUND_AGGREGATIONS,
            PLAN_GROUPS,
            PLAN_GROUP_LINKS,
            PLAN_TEMPLATES,
            BALANCE_TRANSACTIONS,
            TRANSACTION_TYPES,
        }

        /**
         * An enum containing [OperationalDataType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [OperationalDataType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BILLS,
            COMMITMENTS,
            ACCOUNTS,
            BALANCES,
            CONTRACTS,
            ACCOUNT_PLANS,
            AGGREGATIONS,
            PLANS,
            PRICING,
            PRICING_BANDS,
            BILL_LINE_ITEMS,
            METERS,
            PRODUCTS,
            COMPOUND_AGGREGATIONS,
            PLAN_GROUPS,
            PLAN_GROUP_LINKS,
            PLAN_TEMPLATES,
            BALANCE_TRANSACTIONS,
            TRANSACTION_TYPES,
            /**
             * An enum member indicating that [OperationalDataType] was instantiated with an unknown
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
                BILLS -> Value.BILLS
                COMMITMENTS -> Value.COMMITMENTS
                ACCOUNTS -> Value.ACCOUNTS
                BALANCES -> Value.BALANCES
                CONTRACTS -> Value.CONTRACTS
                ACCOUNT_PLANS -> Value.ACCOUNT_PLANS
                AGGREGATIONS -> Value.AGGREGATIONS
                PLANS -> Value.PLANS
                PRICING -> Value.PRICING
                PRICING_BANDS -> Value.PRICING_BANDS
                BILL_LINE_ITEMS -> Value.BILL_LINE_ITEMS
                METERS -> Value.METERS
                PRODUCTS -> Value.PRODUCTS
                COMPOUND_AGGREGATIONS -> Value.COMPOUND_AGGREGATIONS
                PLAN_GROUPS -> Value.PLAN_GROUPS
                PLAN_GROUP_LINKS -> Value.PLAN_GROUP_LINKS
                PLAN_TEMPLATES -> Value.PLAN_TEMPLATES
                BALANCE_TRANSACTIONS -> Value.BALANCE_TRANSACTIONS
                TRANSACTION_TYPES -> Value.TRANSACTION_TYPES
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
                BILLS -> Known.BILLS
                COMMITMENTS -> Known.COMMITMENTS
                ACCOUNTS -> Known.ACCOUNTS
                BALANCES -> Known.BALANCES
                CONTRACTS -> Known.CONTRACTS
                ACCOUNT_PLANS -> Known.ACCOUNT_PLANS
                AGGREGATIONS -> Known.AGGREGATIONS
                PLANS -> Known.PLANS
                PRICING -> Known.PRICING
                PRICING_BANDS -> Known.PRICING_BANDS
                BILL_LINE_ITEMS -> Known.BILL_LINE_ITEMS
                METERS -> Known.METERS
                PRODUCTS -> Known.PRODUCTS
                COMPOUND_AGGREGATIONS -> Known.COMPOUND_AGGREGATIONS
                PLAN_GROUPS -> Known.PLAN_GROUPS
                PLAN_GROUP_LINKS -> Known.PLAN_GROUP_LINKS
                PLAN_TEMPLATES -> Known.PLAN_TEMPLATES
                BALANCE_TRANSACTIONS -> Known.BALANCE_TRANSACTIONS
                TRANSACTION_TYPES -> Known.TRANSACTION_TYPES
                else -> throw M3terInvalidDataException("Unknown OperationalDataType: $value")
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

        fun validate(): OperationalDataType = apply {
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

            return /* spotless:off */ other is OperationalDataType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The type of data to export. Possible values are: OPERATIONAL */
    class SourceType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val OPERATIONAL = of("OPERATIONAL")

            @JvmStatic fun of(value: String) = SourceType(JsonField.of(value))
        }

        /** An enum containing [SourceType]'s known values. */
        enum class Known {
            OPERATIONAL
        }

        /**
         * An enum containing [SourceType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SourceType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OPERATIONAL,
            /**
             * An enum member indicating that [SourceType] was instantiated with an unknown value.
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
                OPERATIONAL -> Value.OPERATIONAL
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
                OPERATIONAL -> Known.OPERATIONAL
                else -> throw M3terInvalidDataException("Unknown SourceType: $value")
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

        fun validate(): SourceType = apply {
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

            return /* spotless:off */ other is SourceType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OperationalDataExportScheduleRequest && operationalDataTypes == other.operationalDataTypes && sourceType == other.sourceType && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(operationalDataTypes, sourceType, version, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OperationalDataExportScheduleRequest{operationalDataTypes=$operationalDataTypes, sourceType=$sourceType, version=$version, additionalProperties=$additionalProperties}"
}
