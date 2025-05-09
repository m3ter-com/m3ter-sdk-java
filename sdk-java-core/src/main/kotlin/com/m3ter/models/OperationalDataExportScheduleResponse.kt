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

class OperationalDataExportScheduleResponse
private constructor(
    private val id: JsonField<String>,
    private val version: JsonField<Long>,
    private val operationalDataTypes: JsonField<List<OperationalDataType>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("operationalDataTypes")
        @ExcludeMissing
        operationalDataTypes: JsonField<List<OperationalDataType>> = JsonMissing.of(),
    ) : this(id, version, operationalDataTypes, mutableMapOf())

    /**
     * The id of the schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun version(): Long = version.getRequired("version")

    /**
     * A list of the entities whose operational data is included in the data export.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun operationalDataTypes(): Optional<List<OperationalDataType>> =
        operationalDataTypes.getOptional("operationalDataTypes")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    /**
     * Returns the raw JSON value of [operationalDataTypes].
     *
     * Unlike [operationalDataTypes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("operationalDataTypes")
    @ExcludeMissing
    fun _operationalDataTypes(): JsonField<List<OperationalDataType>> = operationalDataTypes

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
         * [OperationalDataExportScheduleResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OperationalDataExportScheduleResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var operationalDataTypes: JsonField<MutableList<OperationalDataType>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            operationalDataExportScheduleResponse: OperationalDataExportScheduleResponse
        ) = apply {
            id = operationalDataExportScheduleResponse.id
            version = operationalDataExportScheduleResponse.version
            operationalDataTypes =
                operationalDataExportScheduleResponse.operationalDataTypes.map {
                    it.toMutableList()
                }
            additionalProperties =
                operationalDataExportScheduleResponse.additionalProperties.toMutableMap()
        }

        /** The id of the schedule. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The version number:
         * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
         *   response.
         * - **Update:** On successful Update, the version is incremented by 1 in the response.
         */
        fun version(version: Long) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<Long>) = apply { this.version = version }

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
         * Returns an immutable instance of [OperationalDataExportScheduleResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .version()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OperationalDataExportScheduleResponse =
            OperationalDataExportScheduleResponse(
                checkRequired("id", id),
                checkRequired("version", version),
                (operationalDataTypes ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OperationalDataExportScheduleResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        version()
        operationalDataTypes().ifPresent { it.forEach { it.validate() } }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (version.asKnown().isPresent) 1 else 0) +
            (operationalDataTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OperationalDataExportScheduleResponse && id == other.id && version == other.version && operationalDataTypes == other.operationalDataTypes && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, operationalDataTypes, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OperationalDataExportScheduleResponse{id=$id, version=$version, operationalDataTypes=$operationalDataTypes, additionalProperties=$additionalProperties}"
}
