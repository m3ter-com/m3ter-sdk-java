// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.m3ter.core.ExcludeMissing
import com.m3ter.core.JsonField
import com.m3ter.core.JsonMissing
import com.m3ter.core.JsonValue
import com.m3ter.core.checkRequired
import com.m3ter.errors.M3terInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class DerivedField
private constructor(
    private val category: JsonField<DataField.Category>,
    private val code: JsonField<String>,
    private val name: JsonField<String>,
    private val unit: JsonField<String>,
    private val calculation: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("category")
        @ExcludeMissing
        category: JsonField<DataField.Category> = JsonMissing.of(),
        @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unit") @ExcludeMissing unit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("calculation")
        @ExcludeMissing
        calculation: JsonField<String> = JsonMissing.of(),
    ) : this(category, code, name, unit, calculation, mutableMapOf())

    fun toDataField(): DataField =
        DataField.builder().category(category).code(code).name(name).unit(unit).build()

    /**
     * The type of field (WHO, WHAT, WHERE, MEASURE, METADATA, INCOME, COST, OTHER).
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun category(): DataField.Category = category.getRequired("category")

    /**
     * Short code to identify the field
     *
     * **NOTE:** Code has a maximum length of 80 characters and can only contain letters, numbers,
     * underscore, and the dollar character, and must not start with a number.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun code(): String = code.getRequired("code")

    /**
     * Descriptive name of the field.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The units to measure the data with. Should conform to _Unified Code for Units of Measure_
     * (UCUM). Required only for numeric field categories.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unit(): Optional<String> = unit.getOptional("unit")

    /**
     * The calculation used to transform the value of submitted `dataFields` in usage data.
     * Calculation can reference `dataFields`, `customFields`, or system `Timestamp` fields.
     * _(Example: datafieldms datafieldgb)_
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun calculation(): String = calculation.getRequired("calculation")

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category")
    @ExcludeMissing
    fun _category(): JsonField<DataField.Category> = category

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [unit].
     *
     * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

    /**
     * Returns the raw JSON value of [calculation].
     *
     * Unlike [calculation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("calculation") @ExcludeMissing fun _calculation(): JsonField<String> = calculation

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
         * Returns a mutable builder for constructing an instance of [DerivedField].
         *
         * The following fields are required:
         * ```java
         * .category()
         * .code()
         * .name()
         * .calculation()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DerivedField]. */
    class Builder internal constructor() {

        private var category: JsonField<DataField.Category>? = null
        private var code: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var unit: JsonField<String> = JsonMissing.of()
        private var calculation: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(derivedField: DerivedField) = apply {
            category = derivedField.category
            code = derivedField.code
            name = derivedField.name
            unit = derivedField.unit
            calculation = derivedField.calculation
            additionalProperties = derivedField.additionalProperties.toMutableMap()
        }

        /** The type of field (WHO, WHAT, WHERE, MEASURE, METADATA, INCOME, COST, OTHER). */
        fun category(category: DataField.Category) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [DataField.Category] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun category(category: JsonField<DataField.Category>) = apply { this.category = category }

        /**
         * Short code to identify the field
         *
         * **NOTE:** Code has a maximum length of 80 characters and can only contain letters,
         * numbers, underscore, and the dollar character, and must not start with a number.
         */
        fun code(code: String) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** Descriptive name of the field. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * The units to measure the data with. Should conform to _Unified Code for Units of Measure_
         * (UCUM). Required only for numeric field categories.
         */
        fun unit(unit: String) = unit(JsonField.of(unit))

        /**
         * Sets [Builder.unit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unit] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun unit(unit: JsonField<String>) = apply { this.unit = unit }

        /**
         * The calculation used to transform the value of submitted `dataFields` in usage data.
         * Calculation can reference `dataFields`, `customFields`, or system `Timestamp` fields.
         * _(Example: datafieldms datafieldgb)_
         */
        fun calculation(calculation: String) = calculation(JsonField.of(calculation))

        /**
         * Sets [Builder.calculation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.calculation] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun calculation(calculation: JsonField<String>) = apply { this.calculation = calculation }

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
         * Returns an immutable instance of [DerivedField].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .category()
         * .code()
         * .name()
         * .calculation()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DerivedField =
            DerivedField(
                checkRequired("category", category),
                checkRequired("code", code),
                checkRequired("name", name),
                unit,
                checkRequired("calculation", calculation),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DerivedField = apply {
        if (validated) {
            return@apply
        }

        category().validate()
        code()
        name()
        unit()
        calculation()
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
        (category.asKnown().getOrNull()?.validity() ?: 0) +
            (if (code.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (unit.asKnown().isPresent) 1 else 0) +
            (if (calculation.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DerivedField &&
            category == other.category &&
            code == other.code &&
            name == other.name &&
            unit == other.unit &&
            calculation == other.calculation &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(category, code, name, unit, calculation, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DerivedField{category=$category, code=$code, name=$name, unit=$unit, calculation=$calculation, additionalProperties=$additionalProperties}"
}
