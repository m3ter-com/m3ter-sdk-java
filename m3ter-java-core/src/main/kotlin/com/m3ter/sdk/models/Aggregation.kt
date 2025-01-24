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
class Aggregation
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("aggregation")
    @ExcludeMissing
    private val aggregation: JsonField<InnerAggregation> = JsonMissing.of(),
    @JsonProperty("code") @ExcludeMissing private val code: JsonField<String> = JsonMissing.of(),
    @JsonProperty("createdBy")
    @ExcludeMissing
    private val createdBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("customFields")
    @ExcludeMissing
    private val customFields: JsonField<CustomFields> = JsonMissing.of(),
    @JsonProperty("defaultValue")
    @ExcludeMissing
    private val defaultValue: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("dtCreated")
    @ExcludeMissing
    private val dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    private val dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    private val lastModifiedBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("meterId")
    @ExcludeMissing
    private val meterId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("quantityPerUnit")
    @ExcludeMissing
    private val quantityPerUnit: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("rounding")
    @ExcludeMissing
    private val rounding: JsonField<Rounding> = JsonMissing.of(),
    @JsonProperty("segmentedFields")
    @ExcludeMissing
    private val segmentedFields: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("segments")
    @ExcludeMissing
    private val segments: JsonField<List<Segment>> = JsonMissing.of(),
    @JsonProperty("targetField")
    @ExcludeMissing
    private val targetField: JsonField<String> = JsonMissing.of(),
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
     * Specifies the computation method applied to usage data collected in `targetField`.
     * Aggregation unit value depends on the **Category** configured for the selected targetField.
     *
     * Enum:
     * - **SUM**. Adds the values. Can be applied to a **Measure**, **Income**, or **Cost**
     *   `targetField`.
     * - **MIN**. Uses the minimum value. Can be applied to a **Measure**, **Income**, or **Cost**
     *   `targetField`.
     * - **MAX**. Uses the maximum value. Can be applied to a **Measure**, **Income**, or **Cost**
     *   `targetField`.
     * - **COUNT**. Counts the number of values. Can be applied to a **Who**, **What**, **Where**,
     *   **Measure**, **Income**, **Cost** or **Other** `targetField`.
     * - **LATEST**. Uses the most recent value. Can be applied to a **Measure**, **Income**, or
     *   **Cost** `targetField`.
     * - **MEAN**. Uses the arithmetic mean of the values. Can be applied to a **Measure**,
     *   **Income**, or **Cost** `targetField`.
     * - **UNIQUE**. Uses unique values and returns a count of the number of unique values. Can be
     *   applied to a **Metadata** `targetField`.
     */
    fun aggregation(): Optional<InnerAggregation> =
        Optional.ofNullable(aggregation.getNullable("aggregation"))

    /** Code of the Aggregation. A unique short code to identify the Aggregation. */
    fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

    /** The id of the user who created this aggregation. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    fun customFields(): Optional<CustomFields> =
        Optional.ofNullable(customFields.getNullable("customFields"))

    /**
     * Aggregation value used when no usage data is available to be aggregated. _(Optional)_.
     *
     * **Note:** Set to 0, if you expect to reference the Aggregation in a Compound Aggregation.
     * This ensures that any null values are passed in correctly to the Compound Aggregation
     * calculation with a value = 0.
     */
    fun defaultValue(): Optional<Double> =
        Optional.ofNullable(defaultValue.getNullable("defaultValue"))

    /** The DateTime when the aggregation was created _(in ISO 8601 format)_. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /** The DateTime when the aggregation was last modified _(in ISO 8601 format)_. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /** The id of the user who last modified this aggregation. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /**
     * The UUID of the Meter used as the source of usage data for the Aggregation.
     *
     * Each Aggregation is a child of a Meter, so the Meter must be selected.
     */
    fun meterId(): Optional<String> = Optional.ofNullable(meterId.getNullable("meterId"))

    /** Descriptive name for the Aggregation. */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

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
     * collected by a single Meter. Works together with `segments`.
     *
     * The `Codes` of the fields in the target Meter to use for segmentation purposes.
     *
     * String `dataFields` on the target Meter can be segmented. Any string `derivedFields` on the
     * target Meter, such as one that concatenates two string `dataFields`, can also be segmented.
     */
    fun segmentedFields(): Optional<List<String>> =
        Optional.ofNullable(segmentedFields.getNullable("segmentedFields"))

    /**
     * _(Optional)_. Used when creating a segmented Aggregation, which segments the usage data
     * collected by a single Meter. Works together with `segmentedFields`.
     *
     * Contains the values that are to be used as the segments, read from the fields in the meter
     * pointed at by `segmentedFields`.
     */
    fun segments(): Optional<List<Segment>> = Optional.ofNullable(segments.getNullable("segments"))

    /**
     * `Code` of the target `dataField` or `derivedField` on the Meter used as the basis for the
     * Aggregation.
     */
    fun targetField(): Optional<String> =
        Optional.ofNullable(targetField.getNullable("targetField"))

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
     * Specifies the computation method applied to usage data collected in `targetField`.
     * Aggregation unit value depends on the **Category** configured for the selected targetField.
     *
     * Enum:
     * - **SUM**. Adds the values. Can be applied to a **Measure**, **Income**, or **Cost**
     *   `targetField`.
     * - **MIN**. Uses the minimum value. Can be applied to a **Measure**, **Income**, or **Cost**
     *   `targetField`.
     * - **MAX**. Uses the maximum value. Can be applied to a **Measure**, **Income**, or **Cost**
     *   `targetField`.
     * - **COUNT**. Counts the number of values. Can be applied to a **Who**, **What**, **Where**,
     *   **Measure**, **Income**, **Cost** or **Other** `targetField`.
     * - **LATEST**. Uses the most recent value. Can be applied to a **Measure**, **Income**, or
     *   **Cost** `targetField`.
     * - **MEAN**. Uses the arithmetic mean of the values. Can be applied to a **Measure**,
     *   **Income**, or **Cost** `targetField`.
     * - **UNIQUE**. Uses unique values and returns a count of the number of unique values. Can be
     *   applied to a **Metadata** `targetField`.
     */
    @JsonProperty("aggregation")
    @ExcludeMissing
    fun _aggregation(): JsonField<InnerAggregation> = aggregation

    /** Code of the Aggregation. A unique short code to identify the Aggregation. */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /** The id of the user who created this aggregation. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    @JsonProperty("customFields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    /**
     * Aggregation value used when no usage data is available to be aggregated. _(Optional)_.
     *
     * **Note:** Set to 0, if you expect to reference the Aggregation in a Compound Aggregation.
     * This ensures that any null values are passed in correctly to the Compound Aggregation
     * calculation with a value = 0.
     */
    @JsonProperty("defaultValue")
    @ExcludeMissing
    fun _defaultValue(): JsonField<Double> = defaultValue

    /** The DateTime when the aggregation was created _(in ISO 8601 format)_. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /** The DateTime when the aggregation was last modified _(in ISO 8601 format)_. */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /** The id of the user who last modified this aggregation. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /**
     * The UUID of the Meter used as the source of usage data for the Aggregation.
     *
     * Each Aggregation is a child of a Meter, so the Meter must be selected.
     */
    @JsonProperty("meterId") @ExcludeMissing fun _meterId(): JsonField<String> = meterId

    /** Descriptive name for the Aggregation. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
     * collected by a single Meter. Works together with `segments`.
     *
     * The `Codes` of the fields in the target Meter to use for segmentation purposes.
     *
     * String `dataFields` on the target Meter can be segmented. Any string `derivedFields` on the
     * target Meter, such as one that concatenates two string `dataFields`, can also be segmented.
     */
    @JsonProperty("segmentedFields")
    @ExcludeMissing
    fun _segmentedFields(): JsonField<List<String>> = segmentedFields

    /**
     * _(Optional)_. Used when creating a segmented Aggregation, which segments the usage data
     * collected by a single Meter. Works together with `segmentedFields`.
     *
     * Contains the values that are to be used as the segments, read from the fields in the meter
     * pointed at by `segmentedFields`.
     */
    @JsonProperty("segments") @ExcludeMissing fun _segments(): JsonField<List<Segment>> = segments

    /**
     * `Code` of the target `dataField` or `derivedField` on the Meter used as the basis for the
     * Aggregation.
     */
    @JsonProperty("targetField") @ExcludeMissing fun _targetField(): JsonField<String> = targetField

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

    fun validate(): Aggregation = apply {
        if (validated) {
            return@apply
        }

        id()
        version()
        aggregation()
        code()
        createdBy()
        customFields().ifPresent { it.validate() }
        defaultValue()
        dtCreated()
        dtLastModified()
        lastModifiedBy()
        meterId()
        name()
        quantityPerUnit()
        rounding()
        segmentedFields()
        segments().ifPresent { it.forEach { it.validate() } }
        targetField()
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
        private var aggregation: JsonField<InnerAggregation> = JsonMissing.of()
        private var code: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var defaultValue: JsonField<Double> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var meterId: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var quantityPerUnit: JsonField<Double> = JsonMissing.of()
        private var rounding: JsonField<Rounding> = JsonMissing.of()
        private var segmentedFields: JsonField<MutableList<String>>? = null
        private var segments: JsonField<MutableList<Segment>>? = null
        private var targetField: JsonField<String> = JsonMissing.of()
        private var unit: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(aggregation: Aggregation) = apply {
            id = aggregation.id
            version = aggregation.version
            this.aggregation = aggregation.aggregation
            code = aggregation.code
            createdBy = aggregation.createdBy
            customFields = aggregation.customFields
            defaultValue = aggregation.defaultValue
            dtCreated = aggregation.dtCreated
            dtLastModified = aggregation.dtLastModified
            lastModifiedBy = aggregation.lastModifiedBy
            meterId = aggregation.meterId
            name = aggregation.name
            quantityPerUnit = aggregation.quantityPerUnit
            rounding = aggregation.rounding
            segmentedFields = aggregation.segmentedFields.map { it.toMutableList() }
            segments = aggregation.segments.map { it.toMutableList() }
            targetField = aggregation.targetField
            unit = aggregation.unit
            additionalProperties = aggregation.additionalProperties.toMutableMap()
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
         * Specifies the computation method applied to usage data collected in `targetField`.
         * Aggregation unit value depends on the **Category** configured for the selected
         * targetField.
         *
         * Enum:
         * - **SUM**. Adds the values. Can be applied to a **Measure**, **Income**, or **Cost**
         *   `targetField`.
         * - **MIN**. Uses the minimum value. Can be applied to a **Measure**, **Income**, or
         *   **Cost** `targetField`.
         * - **MAX**. Uses the maximum value. Can be applied to a **Measure**, **Income**, or
         *   **Cost** `targetField`.
         * - **COUNT**. Counts the number of values. Can be applied to a **Who**, **What**,
         *   **Where**, **Measure**, **Income**, **Cost** or **Other** `targetField`.
         * - **LATEST**. Uses the most recent value. Can be applied to a **Measure**, **Income**, or
         *   **Cost** `targetField`.
         * - **MEAN**. Uses the arithmetic mean of the values. Can be applied to a **Measure**,
         *   **Income**, or **Cost** `targetField`.
         * - **UNIQUE**. Uses unique values and returns a count of the number of unique values. Can
         *   be applied to a **Metadata** `targetField`.
         */
        fun aggregation(aggregation: InnerAggregation) = aggregation(JsonField.of(aggregation))

        /**
         * Specifies the computation method applied to usage data collected in `targetField`.
         * Aggregation unit value depends on the **Category** configured for the selected
         * targetField.
         *
         * Enum:
         * - **SUM**. Adds the values. Can be applied to a **Measure**, **Income**, or **Cost**
         *   `targetField`.
         * - **MIN**. Uses the minimum value. Can be applied to a **Measure**, **Income**, or
         *   **Cost** `targetField`.
         * - **MAX**. Uses the maximum value. Can be applied to a **Measure**, **Income**, or
         *   **Cost** `targetField`.
         * - **COUNT**. Counts the number of values. Can be applied to a **Who**, **What**,
         *   **Where**, **Measure**, **Income**, **Cost** or **Other** `targetField`.
         * - **LATEST**. Uses the most recent value. Can be applied to a **Measure**, **Income**, or
         *   **Cost** `targetField`.
         * - **MEAN**. Uses the arithmetic mean of the values. Can be applied to a **Measure**,
         *   **Income**, or **Cost** `targetField`.
         * - **UNIQUE**. Uses unique values and returns a count of the number of unique values. Can
         *   be applied to a **Metadata** `targetField`.
         */
        fun aggregation(aggregation: JsonField<InnerAggregation>) = apply {
            this.aggregation = aggregation
        }

        /** Code of the Aggregation. A unique short code to identify the Aggregation. */
        fun code(code: String) = code(JsonField.of(code))

        /** Code of the Aggregation. A unique short code to identify the Aggregation. */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** The id of the user who created this aggregation. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The id of the user who created this aggregation. */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
        }

        /**
         * Aggregation value used when no usage data is available to be aggregated. _(Optional)_.
         *
         * **Note:** Set to 0, if you expect to reference the Aggregation in a Compound Aggregation.
         * This ensures that any null values are passed in correctly to the Compound Aggregation
         * calculation with a value = 0.
         */
        fun defaultValue(defaultValue: Double) = defaultValue(JsonField.of(defaultValue))

        /**
         * Aggregation value used when no usage data is available to be aggregated. _(Optional)_.
         *
         * **Note:** Set to 0, if you expect to reference the Aggregation in a Compound Aggregation.
         * This ensures that any null values are passed in correctly to the Compound Aggregation
         * calculation with a value = 0.
         */
        fun defaultValue(defaultValue: JsonField<Double>) = apply {
            this.defaultValue = defaultValue
        }

        /** The DateTime when the aggregation was created _(in ISO 8601 format)_. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /** The DateTime when the aggregation was created _(in ISO 8601 format)_. */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The DateTime when the aggregation was last modified _(in ISO 8601 format)_. */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /** The DateTime when the aggregation was last modified _(in ISO 8601 format)_. */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        /** The id of the user who last modified this aggregation. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The id of the user who last modified this aggregation. */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
        }

        /**
         * The UUID of the Meter used as the source of usage data for the Aggregation.
         *
         * Each Aggregation is a child of a Meter, so the Meter must be selected.
         */
        fun meterId(meterId: String) = meterId(JsonField.of(meterId))

        /**
         * The UUID of the Meter used as the source of usage data for the Aggregation.
         *
         * Each Aggregation is a child of a Meter, so the Meter must be selected.
         */
        fun meterId(meterId: JsonField<String>) = apply { this.meterId = meterId }

        /** Descriptive name for the Aggregation. */
        fun name(name: String) = name(JsonField.of(name))

        /** Descriptive name for the Aggregation. */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * collected by a single Meter. Works together with `segments`.
         *
         * The `Codes` of the fields in the target Meter to use for segmentation purposes.
         *
         * String `dataFields` on the target Meter can be segmented. Any string `derivedFields` on
         * the target Meter, such as one that concatenates two string `dataFields`, can also be
         * segmented.
         */
        fun segmentedFields(segmentedFields: List<String>) =
            segmentedFields(JsonField.of(segmentedFields))

        /**
         * _(Optional)_. Used when creating a segmented Aggregation, which segments the usage data
         * collected by a single Meter. Works together with `segments`.
         *
         * The `Codes` of the fields in the target Meter to use for segmentation purposes.
         *
         * String `dataFields` on the target Meter can be segmented. Any string `derivedFields` on
         * the target Meter, such as one that concatenates two string `dataFields`, can also be
         * segmented.
         */
        fun segmentedFields(segmentedFields: JsonField<List<String>>) = apply {
            this.segmentedFields = segmentedFields.map { it.toMutableList() }
        }

        /**
         * _(Optional)_. Used when creating a segmented Aggregation, which segments the usage data
         * collected by a single Meter. Works together with `segments`.
         *
         * The `Codes` of the fields in the target Meter to use for segmentation purposes.
         *
         * String `dataFields` on the target Meter can be segmented. Any string `derivedFields` on
         * the target Meter, such as one that concatenates two string `dataFields`, can also be
         * segmented.
         */
        fun addSegmentedField(segmentedField: String) = apply {
            segmentedFields =
                (segmentedFields ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(segmentedField)
                }
        }

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
         * `Code` of the target `dataField` or `derivedField` on the Meter used as the basis for the
         * Aggregation.
         */
        fun targetField(targetField: String) = targetField(JsonField.of(targetField))

        /**
         * `Code` of the target `dataField` or `derivedField` on the Meter used as the basis for the
         * Aggregation.
         */
        fun targetField(targetField: JsonField<String>) = apply { this.targetField = targetField }

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

        fun build(): Aggregation =
            Aggregation(
                checkRequired("id", id),
                checkRequired("version", version),
                aggregation,
                code,
                createdBy,
                customFields,
                defaultValue,
                dtCreated,
                dtLastModified,
                lastModifiedBy,
                meterId,
                name,
                quantityPerUnit,
                rounding,
                (segmentedFields ?: JsonMissing.of()).map { it.toImmutable() },
                (segments ?: JsonMissing.of()).map { it.toImmutable() },
                targetField,
                unit,
                additionalProperties.toImmutable(),
            )
    }

    /**
     * Specifies the computation method applied to usage data collected in `targetField`.
     * Aggregation unit value depends on the **Category** configured for the selected targetField.
     *
     * Enum:
     * - **SUM**. Adds the values. Can be applied to a **Measure**, **Income**, or **Cost**
     *   `targetField`.
     * - **MIN**. Uses the minimum value. Can be applied to a **Measure**, **Income**, or **Cost**
     *   `targetField`.
     * - **MAX**. Uses the maximum value. Can be applied to a **Measure**, **Income**, or **Cost**
     *   `targetField`.
     * - **COUNT**. Counts the number of values. Can be applied to a **Who**, **What**, **Where**,
     *   **Measure**, **Income**, **Cost** or **Other** `targetField`.
     * - **LATEST**. Uses the most recent value. Can be applied to a **Measure**, **Income**, or
     *   **Cost** `targetField`.
     * - **MEAN**. Uses the arithmetic mean of the values. Can be applied to a **Measure**,
     *   **Income**, or **Cost** `targetField`.
     * - **UNIQUE**. Uses unique values and returns a count of the number of unique values. Can be
     *   applied to a **Metadata** `targetField`.
     */
    class InnerAggregation
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val SUM = of("SUM")

            @JvmField val MIN = of("MIN")

            @JvmField val MAX = of("MAX")

            @JvmField val COUNT = of("COUNT")

            @JvmField val LATEST = of("LATEST")

            @JvmField val MEAN = of("MEAN")

            @JvmField val UNIQUE = of("UNIQUE")

            @JvmStatic fun of(value: String) = InnerAggregation(JsonField.of(value))
        }

        enum class Known {
            SUM,
            MIN,
            MAX,
            COUNT,
            LATEST,
            MEAN,
            UNIQUE,
        }

        enum class Value {
            SUM,
            MIN,
            MAX,
            COUNT,
            LATEST,
            MEAN,
            UNIQUE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                SUM -> Value.SUM
                MIN -> Value.MIN
                MAX -> Value.MAX
                COUNT -> Value.COUNT
                LATEST -> Value.LATEST
                MEAN -> Value.MEAN
                UNIQUE -> Value.UNIQUE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                SUM -> Known.SUM
                MIN -> Known.MIN
                MAX -> Known.MAX
                COUNT -> Known.COUNT
                LATEST -> Known.LATEST
                MEAN -> Known.MEAN
                UNIQUE -> Known.UNIQUE
                else -> throw M3terInvalidDataException("Unknown InnerAggregation: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InnerAggregation && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

        return /* spotless:off */ other is Aggregation && id == other.id && version == other.version && aggregation == other.aggregation && code == other.code && createdBy == other.createdBy && customFields == other.customFields && defaultValue == other.defaultValue && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && lastModifiedBy == other.lastModifiedBy && meterId == other.meterId && name == other.name && quantityPerUnit == other.quantityPerUnit && rounding == other.rounding && segmentedFields == other.segmentedFields && segments == other.segments && targetField == other.targetField && unit == other.unit && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, aggregation, code, createdBy, customFields, defaultValue, dtCreated, dtLastModified, lastModifiedBy, meterId, name, quantityPerUnit, rounding, segmentedFields, segments, targetField, unit, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Aggregation{id=$id, version=$version, aggregation=$aggregation, code=$code, createdBy=$createdBy, customFields=$customFields, defaultValue=$defaultValue, dtCreated=$dtCreated, dtLastModified=$dtLastModified, lastModifiedBy=$lastModifiedBy, meterId=$meterId, name=$name, quantityPerUnit=$quantityPerUnit, rounding=$rounding, segmentedFields=$segmentedFields, segments=$segments, targetField=$targetField, unit=$unit, additionalProperties=$additionalProperties}"
}
