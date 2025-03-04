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
import com.m3ter.sdk.core.checkKnown
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class AggregationResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("accountingProductId")
    @ExcludeMissing
    private val accountingProductId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("aggregation")
    @ExcludeMissing
    private val aggregation: JsonField<Aggregation> = JsonMissing.of(),
    @JsonProperty("code") @ExcludeMissing private val code: JsonField<String> = JsonMissing.of(),
    @JsonProperty("createdBy")
    @ExcludeMissing
    private val createdBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("customFields")
    @ExcludeMissing
    private val customFields: JsonField<CustomFields> = JsonMissing.of(),
    @JsonProperty("customSql")
    @ExcludeMissing
    private val customSql: JsonField<String> = JsonMissing.of(),
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

    fun accountingProductId(): Optional<String> =
        Optional.ofNullable(accountingProductId.getNullable("accountingProductId"))

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
     * - **COUNT**. Counts the number of values. Can be applied to a **Measure**, **Income**, or
     *   **Cost** `targetField`.
     * - **LATEST**. Uses the most recent value. Can be applied to a **Measure**, **Income**, or
     *   **Cost** `targetField`. Note: Based on the timestamp (`ts`) value of usage data measurement
     *   submissions. If using this method, please ensure _distinct_ `ts` values are used for usage
     *   data measurment submissions.
     * - **MEAN**. Uses the arithmetic mean of the values. Can be applied to a **Measure**,
     *   **Income**, or **Cost** `targetField`.
     * - **UNIQUE**. Uses unique values and returns a count of the number of unique values. Can be
     *   applied to a **Metadata** `targetField`.
     */
    fun aggregation(): Optional<Aggregation> =
        Optional.ofNullable(aggregation.getNullable("aggregation"))

    /** Code of the Aggregation. A unique short code to identify the Aggregation. */
    fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

    /** The id of the user who created this aggregation. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    fun customFields(): Optional<CustomFields> =
        Optional.ofNullable(customFields.getNullable("customFields"))

    fun customSql(): Optional<String> = Optional.ofNullable(customSql.getNullable("customSql"))

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
     * Enum: ???UP??? ???DOWN??? ???NEAREST??? ???NONE???
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

    @JsonProperty("accountingProductId")
    @ExcludeMissing
    fun _accountingProductId(): JsonField<String> = accountingProductId

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
     * - **COUNT**. Counts the number of values. Can be applied to a **Measure**, **Income**, or
     *   **Cost** `targetField`.
     * - **LATEST**. Uses the most recent value. Can be applied to a **Measure**, **Income**, or
     *   **Cost** `targetField`. Note: Based on the timestamp (`ts`) value of usage data measurement
     *   submissions. If using this method, please ensure _distinct_ `ts` values are used for usage
     *   data measurment submissions.
     * - **MEAN**. Uses the arithmetic mean of the values. Can be applied to a **Measure**,
     *   **Income**, or **Cost** `targetField`.
     * - **UNIQUE**. Uses unique values and returns a count of the number of unique values. Can be
     *   applied to a **Metadata** `targetField`.
     */
    @JsonProperty("aggregation")
    @ExcludeMissing
    fun _aggregation(): JsonField<Aggregation> = aggregation

    /** Code of the Aggregation. A unique short code to identify the Aggregation. */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /** The id of the user who created this aggregation. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    @JsonProperty("customFields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    @JsonProperty("customSql") @ExcludeMissing fun _customSql(): JsonField<String> = customSql

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
     * Enum: ???UP??? ???DOWN??? ???NEAREST??? ???NONE???
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

    fun validate(): AggregationResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        version()
        accountingProductId()
        aggregation()
        code()
        createdBy()
        customFields().ifPresent { it.validate() }
        customSql()
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

        /**
         * Returns a mutable builder for constructing an instance of [AggregationResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AggregationResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var accountingProductId: JsonField<String> = JsonMissing.of()
        private var aggregation: JsonField<Aggregation> = JsonMissing.of()
        private var code: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var customSql: JsonField<String> = JsonMissing.of()
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
        internal fun from(aggregationResponse: AggregationResponse) = apply {
            id = aggregationResponse.id
            version = aggregationResponse.version
            accountingProductId = aggregationResponse.accountingProductId
            aggregation = aggregationResponse.aggregation
            code = aggregationResponse.code
            createdBy = aggregationResponse.createdBy
            customFields = aggregationResponse.customFields
            customSql = aggregationResponse.customSql
            defaultValue = aggregationResponse.defaultValue
            dtCreated = aggregationResponse.dtCreated
            dtLastModified = aggregationResponse.dtLastModified
            lastModifiedBy = aggregationResponse.lastModifiedBy
            meterId = aggregationResponse.meterId
            name = aggregationResponse.name
            quantityPerUnit = aggregationResponse.quantityPerUnit
            rounding = aggregationResponse.rounding
            segmentedFields = aggregationResponse.segmentedFields.map { it.toMutableList() }
            segments = aggregationResponse.segments.map { it.toMutableList() }
            targetField = aggregationResponse.targetField
            unit = aggregationResponse.unit
            additionalProperties = aggregationResponse.additionalProperties.toMutableMap()
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

        fun accountingProductId(accountingProductId: String) =
            accountingProductId(JsonField.of(accountingProductId))

        fun accountingProductId(accountingProductId: JsonField<String>) = apply {
            this.accountingProductId = accountingProductId
        }

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
         * - **COUNT**. Counts the number of values. Can be applied to a **Measure**, **Income**, or
         *   **Cost** `targetField`.
         * - **LATEST**. Uses the most recent value. Can be applied to a **Measure**, **Income**, or
         *   **Cost** `targetField`. Note: Based on the timestamp (`ts`) value of usage data
         *   measurement submissions. If using this method, please ensure _distinct_ `ts` values are
         *   used for usage data measurment submissions.
         * - **MEAN**. Uses the arithmetic mean of the values. Can be applied to a **Measure**,
         *   **Income**, or **Cost** `targetField`.
         * - **UNIQUE**. Uses unique values and returns a count of the number of unique values. Can
         *   be applied to a **Metadata** `targetField`.
         */
        fun aggregation(aggregation: Aggregation) = aggregation(JsonField.of(aggregation))

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
         * - **COUNT**. Counts the number of values. Can be applied to a **Measure**, **Income**, or
         *   **Cost** `targetField`.
         * - **LATEST**. Uses the most recent value. Can be applied to a **Measure**, **Income**, or
         *   **Cost** `targetField`. Note: Based on the timestamp (`ts`) value of usage data
         *   measurement submissions. If using this method, please ensure _distinct_ `ts` values are
         *   used for usage data measurment submissions.
         * - **MEAN**. Uses the arithmetic mean of the values. Can be applied to a **Measure**,
         *   **Income**, or **Cost** `targetField`.
         * - **UNIQUE**. Uses unique values and returns a count of the number of unique values. Can
         *   be applied to a **Metadata** `targetField`.
         */
        fun aggregation(aggregation: JsonField<Aggregation>) = apply {
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

        fun customSql(customSql: String) = customSql(JsonField.of(customSql))

        fun customSql(customSql: JsonField<String>) = apply { this.customSql = customSql }

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
         * Enum: ???UP??? ???DOWN??? ???NEAREST??? ???NONE???
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
         * Enum: ???UP??? ???DOWN??? ???NEAREST??? ???NONE???
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
                (segmentedFields ?: JsonField.of(mutableListOf())).also {
                    checkKnown("segmentedFields", it).add(segmentedField)
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
                (segments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("segments", it).add(segment)
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

        fun build(): AggregationResponse =
            AggregationResponse(
                checkRequired("id", id),
                checkRequired("version", version),
                accountingProductId,
                aggregation,
                code,
                createdBy,
                customFields,
                customSql,
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
     * - **COUNT**. Counts the number of values. Can be applied to a **Measure**, **Income**, or
     *   **Cost** `targetField`.
     * - **LATEST**. Uses the most recent value. Can be applied to a **Measure**, **Income**, or
     *   **Cost** `targetField`. Note: Based on the timestamp (`ts`) value of usage data measurement
     *   submissions. If using this method, please ensure _distinct_ `ts` values are used for usage
     *   data measurment submissions.
     * - **MEAN**. Uses the arithmetic mean of the values. Can be applied to a **Measure**,
     *   **Income**, or **Cost** `targetField`.
     * - **UNIQUE**. Uses unique values and returns a count of the number of unique values. Can be
     *   applied to a **Metadata** `targetField`.
     */
    class Aggregation @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val SUM = of("SUM")

            @JvmField val MIN = of("MIN")

            @JvmField val MAX = of("MAX")

            @JvmField val COUNT = of("COUNT")

            @JvmField val LATEST = of("LATEST")

            @JvmField val MEAN = of("MEAN")

            @JvmField val UNIQUE = of("UNIQUE")

            @JvmField val CUSTOM_SQL = of("CUSTOM_SQL")

            @JvmStatic fun of(value: String) = Aggregation(JsonField.of(value))
        }

        /** An enum containing [Aggregation]'s known values. */
        enum class Known {
            SUM,
            MIN,
            MAX,
            COUNT,
            LATEST,
            MEAN,
            UNIQUE,
            CUSTOM_SQL,
        }

        /**
         * An enum containing [Aggregation]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Aggregation] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SUM,
            MIN,
            MAX,
            COUNT,
            LATEST,
            MEAN,
            UNIQUE,
            CUSTOM_SQL,
            /**
             * An enum member indicating that [Aggregation] was instantiated with an unknown value.
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
                SUM -> Value.SUM
                MIN -> Value.MIN
                MAX -> Value.MAX
                COUNT -> Value.COUNT
                LATEST -> Value.LATEST
                MEAN -> Value.MEAN
                UNIQUE -> Value.UNIQUE
                CUSTOM_SQL -> Value.CUSTOM_SQL
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
                SUM -> Known.SUM
                MIN -> Known.MIN
                MAX -> Known.MAX
                COUNT -> Known.COUNT
                LATEST -> Known.LATEST
                MEAN -> Known.MEAN
                UNIQUE -> Known.UNIQUE
                CUSTOM_SQL -> Known.CUSTOM_SQL
                else -> throw M3terInvalidDataException("Unknown Aggregation: $value")
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

            return /* spotless:off */ other is Aggregation && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class CustomFields
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
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

            /** Returns a mutable builder for constructing an instance of [CustomFields]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomFields]. */
        class Builder internal constructor() {

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
     * Enum: ???UP??? ???DOWN??? ???NEAREST??? ???NONE???
     */
    class Rounding @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val UP = of("UP")

            @JvmField val DOWN = of("DOWN")

            @JvmField val NEAREST = of("NEAREST")

            @JvmField val NONE = of("NONE")

            @JvmStatic fun of(value: String) = Rounding(JsonField.of(value))
        }

        /** An enum containing [Rounding]'s known values. */
        enum class Known {
            UP,
            DOWN,
            NEAREST,
            NONE,
        }

        /**
         * An enum containing [Rounding]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Rounding] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UP,
            DOWN,
            NEAREST,
            NONE,
            /** An enum member indicating that [Rounding] was instantiated with an unknown value. */
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
                UP -> Value.UP
                DOWN -> Value.DOWN
                NEAREST -> Value.NEAREST
                NONE -> Value.NONE
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
                UP -> Known.UP
                DOWN -> Known.DOWN
                NEAREST -> Known.NEAREST
                NONE -> Known.NONE
                else -> throw M3terInvalidDataException("Unknown Rounding: $value")
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
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
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

            /** Returns a mutable builder for constructing an instance of [Segment]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Segment]. */
        class Builder internal constructor() {

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

        return /* spotless:off */ other is AggregationResponse && id == other.id && version == other.version && accountingProductId == other.accountingProductId && aggregation == other.aggregation && code == other.code && createdBy == other.createdBy && customFields == other.customFields && customSql == other.customSql && defaultValue == other.defaultValue && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && lastModifiedBy == other.lastModifiedBy && meterId == other.meterId && name == other.name && quantityPerUnit == other.quantityPerUnit && rounding == other.rounding && segmentedFields == other.segmentedFields && segments == other.segments && targetField == other.targetField && unit == other.unit && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, accountingProductId, aggregation, code, createdBy, customFields, customSql, defaultValue, dtCreated, dtLastModified, lastModifiedBy, meterId, name, quantityPerUnit, rounding, segmentedFields, segments, targetField, unit, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AggregationResponse{id=$id, version=$version, accountingProductId=$accountingProductId, aggregation=$aggregation, code=$code, createdBy=$createdBy, customFields=$customFields, customSql=$customSql, defaultValue=$defaultValue, dtCreated=$dtCreated, dtLastModified=$dtLastModified, lastModifiedBy=$lastModifiedBy, meterId=$meterId, name=$name, quantityPerUnit=$quantityPerUnit, rounding=$rounding, segmentedFields=$segmentedFields, segments=$segments, targetField=$targetField, unit=$unit, additionalProperties=$additionalProperties}"
}
