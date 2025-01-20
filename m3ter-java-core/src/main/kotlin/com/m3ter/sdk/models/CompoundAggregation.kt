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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class CompoundAggregation
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("calculation")
    @ExcludeMissing
    private val calculation: JsonField<String> = JsonMissing.of(),
    @JsonProperty("code") @ExcludeMissing private val code: JsonField<String> = JsonMissing.of(),
    @JsonProperty("createdBy")
    @ExcludeMissing
    private val createdBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("customFields")
    @ExcludeMissing
    private val customFields: JsonField<CustomFields> = JsonMissing.of(),
    @JsonProperty("dtCreated")
    @ExcludeMissing
    private val dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    private val dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("evaluateNullAggregations")
    @ExcludeMissing
    private val evaluateNullAggregations: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    private val lastModifiedBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("productId")
    @ExcludeMissing
    private val productId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("quantityPerUnit")
    @ExcludeMissing
    private val quantityPerUnit: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("rounding")
    @ExcludeMissing
    private val rounding: JsonField<Rounding> = JsonMissing.of(),
    @JsonProperty("segments")
    @ExcludeMissing
    private val segments: JsonField<List<Segment>> = JsonMissing.of(),
    @JsonProperty("unit") @ExcludeMissing private val unit: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The UUID of the entity. */
    fun id(): String = id.getRequired("id")

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    fun version(): Long = version.getRequired("version")

    /**
     * This field is a string that represents the formula for the calculation. This formula
     * determines how the CompoundAggregation is calculated from the underlying usage data.
     */
    fun calculation(): Optional<String> =
        Optional.ofNullable(calculation.getNullable("calculation"))

    /** Code of the Aggregation. A unique short code to identify the Aggregation. */
    fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

    /** The unique identifier (UUID) of the user who created this CompoundAggregation. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    fun customFields(): Optional<CustomFields> =
        Optional.ofNullable(customFields.getNullable("customFields"))

    /** The date and time _(in ISO-8601 format)_ when the CompoundAggregation was created. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /** The date and time _(in ISO-8601 format)_ when the CompoundAggregation was last modified. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /**
     * This is a boolean True / False flag.
     *
     * If set to TRUE, the calculation will be evaluated even if the referenced aggregation has no
     * usage data.
     */
    fun evaluateNullAggregations(): Optional<Boolean> =
        Optional.ofNullable(evaluateNullAggregations.getNullable("evaluateNullAggregations"))

    /** The unique identifier (UUID) of the user who last modified this CompoundAggregation. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /** Descriptive name for the Aggregation. */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /**
     * This field represents the unique identifier (UUID) of the Product that is associated with the
     * CompoundAggregation.
     */
    fun productId(): Optional<String> = Optional.ofNullable(productId.getNullable("productId"))

    /**
     * Defines how much of a quantity equates to 1 unit. Used when setting the price per unit for
     * billing purposes - if charging for kilobytes per second (KiBy/s) at rate of $0.25 per 500
     * KiBy/s, then set quantityPerUnit to 500 and price Plan at $0.25 per unit.
     *
     * If `quantityPerUnit` is set to a value other than one, rounding is typically set to UP.
     */
    fun quantityPerUnit(): Optional<Double> =
        Optional.ofNullable(quantityPerUnit.getNullable("quantityPerUnit"))

    /**
     * Specifies how you want to deal with non-integer, fractional number Aggregation values.
     *
     * **NOTES:**
     * - **NEAREST** rounds to the nearest half: 5.1 is rounded to 5, and 3.5 is rounded to 4.
     * - Also used in combination with `quantityPerUnit`. Rounds the number of units after
     *   `quantityPerUnit` is applied. If you set `quantityPerUnit` to a value other than one, you
     *   would typically set Rounding to **UP**. For example, suppose you charge by kilobytes per
     *   second (KiBy/s), set `quantityPerUnit` = 500, and set charge rate at $0.25 per unit used.
     *   If your customer used 48,900 KiBy/s in a billing period, the charge would be 48,900 / 500 =
     *   97.8 rounded up to 98 \* 0.25 = $2.45.
     *
     * Enum: “UP” “DOWN” “NEAREST” “NONE”
     */
    fun rounding(): Optional<Rounding> = Optional.ofNullable(rounding.getNullable("rounding"))

    /**
     * _(Optional)_. Used when creating a segmented Aggregation, which segments the usage data
     * collected by a single Meter. Works together with `segmentedFields`.
     *
     * Contains the values that are to be used as the segments, read from the fields in the meter
     * pointed at by `segmentedFields`.
     */
    fun segments(): Optional<List<Segment>> = Optional.ofNullable(segments.getNullable("segments"))

    /**
     * User defined or following the _Unified Code for Units of Measure_ (UCUM).
     *
     * Used as the label for billing, indicating to your customers what they are being charged for.
     */
    fun unit(): Optional<String> = Optional.ofNullable(unit.getNullable("unit"))

    /** The UUID of the entity. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    /**
     * This field is a string that represents the formula for the calculation. This formula
     * determines how the CompoundAggregation is calculated from the underlying usage data.
     */
    @JsonProperty("calculation") @ExcludeMissing fun _calculation(): JsonField<String> = calculation

    /** Code of the Aggregation. A unique short code to identify the Aggregation. */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /** The unique identifier (UUID) of the user who created this CompoundAggregation. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    @JsonProperty("customFields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    /** The date and time _(in ISO-8601 format)_ when the CompoundAggregation was created. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /** The date and time _(in ISO-8601 format)_ when the CompoundAggregation was last modified. */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /**
     * This is a boolean True / False flag.
     *
     * If set to TRUE, the calculation will be evaluated even if the referenced aggregation has no
     * usage data.
     */
    @JsonProperty("evaluateNullAggregations")
    @ExcludeMissing
    fun _evaluateNullAggregations(): JsonField<Boolean> = evaluateNullAggregations

    /** The unique identifier (UUID) of the user who last modified this CompoundAggregation. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /** Descriptive name for the Aggregation. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * This field represents the unique identifier (UUID) of the Product that is associated with the
     * CompoundAggregation.
     */
    @JsonProperty("productId") @ExcludeMissing fun _productId(): JsonField<String> = productId

    /**
     * Defines how much of a quantity equates to 1 unit. Used when setting the price per unit for
     * billing purposes - if charging for kilobytes per second (KiBy/s) at rate of $0.25 per 500
     * KiBy/s, then set quantityPerUnit to 500 and price Plan at $0.25 per unit.
     *
     * If `quantityPerUnit` is set to a value other than one, rounding is typically set to UP.
     */
    @JsonProperty("quantityPerUnit")
    @ExcludeMissing
    fun _quantityPerUnit(): JsonField<Double> = quantityPerUnit

    /**
     * Specifies how you want to deal with non-integer, fractional number Aggregation values.
     *
     * **NOTES:**
     * - **NEAREST** rounds to the nearest half: 5.1 is rounded to 5, and 3.5 is rounded to 4.
     * - Also used in combination with `quantityPerUnit`. Rounds the number of units after
     *   `quantityPerUnit` is applied. If you set `quantityPerUnit` to a value other than one, you
     *   would typically set Rounding to **UP**. For example, suppose you charge by kilobytes per
     *   second (KiBy/s), set `quantityPerUnit` = 500, and set charge rate at $0.25 per unit used.
     *   If your customer used 48,900 KiBy/s in a billing period, the charge would be 48,900 / 500 =
     *   97.8 rounded up to 98 \* 0.25 = $2.45.
     *
     * Enum: “UP” “DOWN” “NEAREST” “NONE”
     */
    @JsonProperty("rounding") @ExcludeMissing fun _rounding(): JsonField<Rounding> = rounding

    /**
     * _(Optional)_. Used when creating a segmented Aggregation, which segments the usage data
     * collected by a single Meter. Works together with `segmentedFields`.
     *
     * Contains the values that are to be used as the segments, read from the fields in the meter
     * pointed at by `segmentedFields`.
     */
    @JsonProperty("segments") @ExcludeMissing fun _segments(): JsonField<List<Segment>> = segments

    /**
     * User defined or following the _Unified Code for Units of Measure_ (UCUM).
     *
     * Used as the label for billing, indicating to your customers what they are being charged for.
     */
    @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CompoundAggregation = apply {
        if (validated) {
            return@apply
        }

        id()
        version()
        calculation()
        code()
        createdBy()
        customFields().ifPresent { it.validate() }
        dtCreated()
        dtLastModified()
        evaluateNullAggregations()
        lastModifiedBy()
        name()
        productId()
        quantityPerUnit()
        rounding()
        segments().ifPresent { it.forEach { it.validate() } }
        unit()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var calculation: JsonField<String> = JsonMissing.of()
        private var code: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var evaluateNullAggregations: JsonField<Boolean> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var productId: JsonField<String> = JsonMissing.of()
        private var quantityPerUnit: JsonField<Double> = JsonMissing.of()
        private var rounding: JsonField<Rounding> = JsonMissing.of()
        private var segments: JsonField<MutableList<Segment>>? = null
        private var unit: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(compoundAggregation: CompoundAggregation) = apply {
            id = compoundAggregation.id
            version = compoundAggregation.version
            calculation = compoundAggregation.calculation
            code = compoundAggregation.code
            createdBy = compoundAggregation.createdBy
            customFields = compoundAggregation.customFields
            dtCreated = compoundAggregation.dtCreated
            dtLastModified = compoundAggregation.dtLastModified
            evaluateNullAggregations = compoundAggregation.evaluateNullAggregations
            lastModifiedBy = compoundAggregation.lastModifiedBy
            name = compoundAggregation.name
            productId = compoundAggregation.productId
            quantityPerUnit = compoundAggregation.quantityPerUnit
            rounding = compoundAggregation.rounding
            segments = compoundAggregation.segments.map { it.toMutableList() }
            unit = compoundAggregation.unit
            additionalProperties = compoundAggregation.additionalProperties.toMutableMap()
        }

        /** The UUID of the entity. */
        fun id(id: String) = id(JsonField.of(id))

        /** The UUID of the entity. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The version number:
         * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
         *   response.
         * - **Update:** On successful Update, the version is incremented by 1 in the response.
         */
        fun version(version: Long) = version(JsonField.of(version))

        /**
         * The version number:
         * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
         *   response.
         * - **Update:** On successful Update, the version is incremented by 1 in the response.
         */
        fun version(version: JsonField<Long>) = apply { this.version = version }

        /**
         * This field is a string that represents the formula for the calculation. This formula
         * determines how the CompoundAggregation is calculated from the underlying usage data.
         */
        fun calculation(calculation: String) = calculation(JsonField.of(calculation))

        /**
         * This field is a string that represents the formula for the calculation. This formula
         * determines how the CompoundAggregation is calculated from the underlying usage data.
         */
        fun calculation(calculation: JsonField<String>) = apply { this.calculation = calculation }

        /** Code of the Aggregation. A unique short code to identify the Aggregation. */
        fun code(code: String) = code(JsonField.of(code))

        /** Code of the Aggregation. A unique short code to identify the Aggregation. */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** The unique identifier (UUID) of the user who created this CompoundAggregation. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The unique identifier (UUID) of the user who created this CompoundAggregation. */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
        }

        /** The date and time _(in ISO-8601 format)_ when the CompoundAggregation was created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /** The date and time _(in ISO-8601 format)_ when the CompoundAggregation was created. */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /**
         * The date and time _(in ISO-8601 format)_ when the CompoundAggregation was last modified.
         */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /**
         * The date and time _(in ISO-8601 format)_ when the CompoundAggregation was last modified.
         */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        /**
         * This is a boolean True / False flag.
         *
         * If set to TRUE, the calculation will be evaluated even if the referenced aggregation has
         * no usage data.
         */
        fun evaluateNullAggregations(evaluateNullAggregations: Boolean) =
            evaluateNullAggregations(JsonField.of(evaluateNullAggregations))

        /**
         * This is a boolean True / False flag.
         *
         * If set to TRUE, the calculation will be evaluated even if the referenced aggregation has
         * no usage data.
         */
        fun evaluateNullAggregations(evaluateNullAggregations: JsonField<Boolean>) = apply {
            this.evaluateNullAggregations = evaluateNullAggregations
        }

        /** The unique identifier (UUID) of the user who last modified this CompoundAggregation. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The unique identifier (UUID) of the user who last modified this CompoundAggregation. */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
        }

        /** Descriptive name for the Aggregation. */
        fun name(name: String) = name(JsonField.of(name))

        /** Descriptive name for the Aggregation. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * This field represents the unique identifier (UUID) of the Product that is associated with
         * the CompoundAggregation.
         */
        fun productId(productId: String) = productId(JsonField.of(productId))

        /**
         * This field represents the unique identifier (UUID) of the Product that is associated with
         * the CompoundAggregation.
         */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        /**
         * Defines how much of a quantity equates to 1 unit. Used when setting the price per unit
         * for billing purposes - if charging for kilobytes per second (KiBy/s) at rate of $0.25 per
         * 500 KiBy/s, then set quantityPerUnit to 500 and price Plan at $0.25 per unit.
         *
         * If `quantityPerUnit` is set to a value other than one, rounding is typically set to UP.
         */
        fun quantityPerUnit(quantityPerUnit: Double) =
            quantityPerUnit(JsonField.of(quantityPerUnit))

        /**
         * Defines how much of a quantity equates to 1 unit. Used when setting the price per unit
         * for billing purposes - if charging for kilobytes per second (KiBy/s) at rate of $0.25 per
         * 500 KiBy/s, then set quantityPerUnit to 500 and price Plan at $0.25 per unit.
         *
         * If `quantityPerUnit` is set to a value other than one, rounding is typically set to UP.
         */
        fun quantityPerUnit(quantityPerUnit: JsonField<Double>) = apply {
            this.quantityPerUnit = quantityPerUnit
        }

        /**
         * Specifies how you want to deal with non-integer, fractional number Aggregation values.
         *
         * **NOTES:**
         * - **NEAREST** rounds to the nearest half: 5.1 is rounded to 5, and 3.5 is rounded to 4.
         * - Also used in combination with `quantityPerUnit`. Rounds the number of units after
         *   `quantityPerUnit` is applied. If you set `quantityPerUnit` to a value other than one,
         *   you would typically set Rounding to **UP**. For example, suppose you charge by
         *   kilobytes per second (KiBy/s), set `quantityPerUnit` = 500, and set charge rate at
         *   $0.25 per unit used. If your customer used 48,900 KiBy/s in a billing period, the
         *   charge would be 48,900 / 500 = 97.8 rounded up to 98 \* 0.25 = $2.45.
         *
         * Enum: “UP” “DOWN” “NEAREST” “NONE”
         */
        fun rounding(rounding: Rounding) = rounding(JsonField.of(rounding))

        /**
         * Specifies how you want to deal with non-integer, fractional number Aggregation values.
         *
         * **NOTES:**
         * - **NEAREST** rounds to the nearest half: 5.1 is rounded to 5, and 3.5 is rounded to 4.
         * - Also used in combination with `quantityPerUnit`. Rounds the number of units after
         *   `quantityPerUnit` is applied. If you set `quantityPerUnit` to a value other than one,
         *   you would typically set Rounding to **UP**. For example, suppose you charge by
         *   kilobytes per second (KiBy/s), set `quantityPerUnit` = 500, and set charge rate at
         *   $0.25 per unit used. If your customer used 48,900 KiBy/s in a billing period, the
         *   charge would be 48,900 / 500 = 97.8 rounded up to 98 \* 0.25 = $2.45.
         *
         * Enum: “UP” “DOWN” “NEAREST” “NONE”
         */
        fun rounding(rounding: JsonField<Rounding>) = apply { this.rounding = rounding }

        /**
         * _(Optional)_. Used when creating a segmented Aggregation, which segments the usage data
         * collected by a single Meter. Works together with `segmentedFields`.
         *
         * Contains the values that are to be used as the segments, read from the fields in the
         * meter pointed at by `segmentedFields`.
         */
        fun segments(segments: List<Segment>) = segments(JsonField.of(segments))

        /**
         * _(Optional)_. Used when creating a segmented Aggregation, which segments the usage data
         * collected by a single Meter. Works together with `segmentedFields`.
         *
         * Contains the values that are to be used as the segments, read from the fields in the
         * meter pointed at by `segmentedFields`.
         */
        fun segments(segments: JsonField<List<Segment>>) = apply {
            this.segments = segments.map { it.toMutableList() }
        }

        /**
         * _(Optional)_. Used when creating a segmented Aggregation, which segments the usage data
         * collected by a single Meter. Works together with `segmentedFields`.
         *
         * Contains the values that are to be used as the segments, read from the fields in the
         * meter pointed at by `segmentedFields`.
         */
        fun addSegment(segment: Segment) = apply {
            segments =
                (segments ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(segment)
                }
        }

        /**
         * User defined or following the _Unified Code for Units of Measure_ (UCUM).
         *
         * Used as the label for billing, indicating to your customers what they are being charged
         * for.
         */
        fun unit(unit: String) = unit(JsonField.of(unit))

        /**
         * User defined or following the _Unified Code for Units of Measure_ (UCUM).
         *
         * Used as the label for billing, indicating to your customers what they are being charged
         * for.
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

        fun build(): CompoundAggregation =
            CompoundAggregation(
                checkRequired("id", id),
                checkRequired("version", version),
                calculation,
                code,
                createdBy,
                customFields,
                dtCreated,
                dtLastModified,
                evaluateNullAggregations,
                lastModifiedBy,
                name,
                productId,
                quantityPerUnit,
                rounding,
                (segments ?: JsonMissing.of()).map { it.toImmutable() },
                unit,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class CustomFields
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomFields = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customFields: CustomFields) = apply {
                additionalProperties = customFields.additionalProperties.toMutableMap()
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

            fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomFields && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }

    /**
     * Specifies how you want to deal with non-integer, fractional number Aggregation values.
     *
     * **NOTES:**
     * - **NEAREST** rounds to the nearest half: 5.1 is rounded to 5, and 3.5 is rounded to 4.
     * - Also used in combination with `quantityPerUnit`. Rounds the number of units after
     *   `quantityPerUnit` is applied. If you set `quantityPerUnit` to a value other than one, you
     *   would typically set Rounding to **UP**. For example, suppose you charge by kilobytes per
     *   second (KiBy/s), set `quantityPerUnit` = 500, and set charge rate at $0.25 per unit used.
     *   If your customer used 48,900 KiBy/s in a billing period, the charge would be 48,900 / 500 =
     *   97.8 rounded up to 98 \* 0.25 = $2.45.
     *
     * Enum: “UP” “DOWN” “NEAREST” “NONE”
     */
    class Rounding
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val UP = of("UP")

            @JvmField val DOWN = of("DOWN")

            @JvmField val NEAREST = of("NEAREST")

            @JvmField val NONE = of("NONE")

            @JvmStatic fun of(value: String) = Rounding(JsonField.of(value))
        }

        enum class Known {
            UP,
            DOWN,
            NEAREST,
            NONE,
        }

        enum class Value {
            UP,
            DOWN,
            NEAREST,
            NONE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                UP -> Value.UP
                DOWN -> Value.DOWN
                NEAREST -> Value.NEAREST
                NONE -> Value.NONE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                UP -> Known.UP
                DOWN -> Known.DOWN
                NEAREST -> Known.NEAREST
                NONE -> Known.NONE
                else -> throw M3terInvalidDataException("Unknown Rounding: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Rounding && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class Segment
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Segment = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(segment: Segment) = apply {
                additionalProperties = segment.additionalProperties.toMutableMap()
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

            fun build(): Segment = Segment(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Segment && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Segment{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CompoundAggregation && id == other.id && version == other.version && calculation == other.calculation && code == other.code && createdBy == other.createdBy && customFields == other.customFields && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && evaluateNullAggregations == other.evaluateNullAggregations && lastModifiedBy == other.lastModifiedBy && name == other.name && productId == other.productId && quantityPerUnit == other.quantityPerUnit && rounding == other.rounding && segments == other.segments && unit == other.unit && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, calculation, code, createdBy, customFields, dtCreated, dtLastModified, evaluateNullAggregations, lastModifiedBy, name, productId, quantityPerUnit, rounding, segments, unit, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CompoundAggregation{id=$id, version=$version, calculation=$calculation, code=$code, createdBy=$createdBy, customFields=$customFields, dtCreated=$dtCreated, dtLastModified=$dtLastModified, evaluateNullAggregations=$evaluateNullAggregations, lastModifiedBy=$lastModifiedBy, name=$name, productId=$productId, quantityPerUnit=$quantityPerUnit, rounding=$rounding, segments=$segments, unit=$unit, additionalProperties=$additionalProperties}"
}
