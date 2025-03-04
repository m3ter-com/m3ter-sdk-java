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
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class DataField
@JsonCreator
private constructor(
    @JsonProperty("category")
    @ExcludeMissing
    private val category: JsonField<Category> = JsonMissing.of(),
    @JsonProperty("code") @ExcludeMissing private val code: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("unit") @ExcludeMissing private val unit: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The type of field (WHO, WHAT, WHERE, MEASURE, METADATA, INCOME, COST, OTHER). */
    fun category(): Category = category.getRequired("category")

    /**
     * Short code to identify the field
     *
     * **NOTE:** Code has a maximum length of 80 characters and can only contain letters, numbers,
     * underscore, and the dollar character, and must not start with a number.
     */
    fun code(): String = code.getRequired("code")

    /** Descriptive name of the field. */
    fun name(): String = name.getRequired("name")

    /**
     * The units to measure the data with. Should conform to _Unified Code for Units of Measure_
     * (UCUM). Required only for numeric field categories.
     */
    fun unit(): Optional<String> = Optional.ofNullable(unit.getNullable("unit"))

    /** The type of field (WHO, WHAT, WHERE, MEASURE, METADATA, INCOME, COST, OTHER). */
    @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

    /**
     * Short code to identify the field
     *
     * **NOTE:** Code has a maximum length of 80 characters and can only contain letters, numbers,
     * underscore, and the dollar character, and must not start with a number.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /** Descriptive name of the field. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * The units to measure the data with. Should conform to _Unified Code for Units of Measure_
     * (UCUM). Required only for numeric field categories.
     */
    @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): DataField = apply {
        if (validated) {
            return@apply
        }

        category()
        code()
        name()
        unit()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataField]. */
    class Builder internal constructor() {

        private var category: JsonField<Category>? = null
        private var code: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var unit: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dataField: DataField) = apply {
            category = dataField.category
            code = dataField.code
            name = dataField.name
            unit = dataField.unit
            additionalProperties = dataField.additionalProperties.toMutableMap()
        }

        /** The type of field (WHO, WHAT, WHERE, MEASURE, METADATA, INCOME, COST, OTHER). */
        fun category(category: Category) = category(JsonField.of(category))

        /** The type of field (WHO, WHAT, WHERE, MEASURE, METADATA, INCOME, COST, OTHER). */
        fun category(category: JsonField<Category>) = apply { this.category = category }

        /**
         * Short code to identify the field
         *
         * **NOTE:** Code has a maximum length of 80 characters and can only contain letters,
         * numbers, underscore, and the dollar character, and must not start with a number.
         */
        fun code(code: String) = code(JsonField.of(code))

        /**
         * Short code to identify the field
         *
         * **NOTE:** Code has a maximum length of 80 characters and can only contain letters,
         * numbers, underscore, and the dollar character, and must not start with a number.
         */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** Descriptive name of the field. */
        fun name(name: String) = name(JsonField.of(name))

        /** Descriptive name of the field. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * The units to measure the data with. Should conform to _Unified Code for Units of Measure_
         * (UCUM). Required only for numeric field categories.
         */
        fun unit(unit: String) = unit(JsonField.of(unit))

        /**
         * The units to measure the data with. Should conform to _Unified Code for Units of Measure_
         * (UCUM). Required only for numeric field categories.
         */
        fun unit(unit: JsonField<String>) = apply { this.unit = unit }

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

        fun build(): DataField =
            DataField(
                checkRequired("category", category),
                checkRequired("code", code),
                checkRequired("name", name),
                unit,
                additionalProperties.toImmutable(),
            )
    }

    /** The type of field (WHO, WHAT, WHERE, MEASURE, METADATA, INCOME, COST, OTHER). */
    class Category @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val WHO = of("WHO")

            @JvmField val WHERE = of("WHERE")

            @JvmField val WHAT = of("WHAT")

            @JvmField val OTHER = of("OTHER")

            @JvmField val METADATA = of("METADATA")

            @JvmField val MEASURE = of("MEASURE")

            @JvmField val INCOME = of("INCOME")

            @JvmField val COST = of("COST")

            @JvmStatic fun of(value: String) = Category(JsonField.of(value))
        }

        /** An enum containing [Category]'s known values. */
        enum class Known {
            WHO,
            WHERE,
            WHAT,
            OTHER,
            METADATA,
            MEASURE,
            INCOME,
            COST,
        }

        /**
         * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Category] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            WHO,
            WHERE,
            WHAT,
            OTHER,
            METADATA,
            MEASURE,
            INCOME,
            COST,
            /** An enum member indicating that [Category] was instantiated with an unknown value. */
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
                WHO -> Value.WHO
                WHERE -> Value.WHERE
                WHAT -> Value.WHAT
                OTHER -> Value.OTHER
                METADATA -> Value.METADATA
                MEASURE -> Value.MEASURE
                INCOME -> Value.INCOME
                COST -> Value.COST
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
                WHO -> Known.WHO
                WHERE -> Known.WHERE
                WHAT -> Known.WHAT
                OTHER -> Known.OTHER
                METADATA -> Known.METADATA
                MEASURE -> Known.MEASURE
                INCOME -> Known.INCOME
                COST -> Known.COST
                else -> throw M3terInvalidDataException("Unknown Category: $value")
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

            return /* spotless:off */ other is Category && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DataField && category == other.category && code == other.code && name == other.name && unit == other.unit && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(category, code, name, unit, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DataField{category=$category, code=$code, name=$name, unit=$unit, additionalProperties=$additionalProperties}"
}
