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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AggregationResponse
private constructor(
    private val id: JsonField<String>,
    private val accountingProductId: JsonField<String>,
    private val aggregation: JsonField<Aggregation>,
    private val code: JsonField<String>,
    private val createdBy: JsonField<String>,
    private val customFields: JsonField<CustomFields>,
    private val customSql: JsonField<String>,
    private val defaultValue: JsonField<Double>,
    private val dtCreated: JsonField<OffsetDateTime>,
    private val dtLastModified: JsonField<OffsetDateTime>,
    private val lastModifiedBy: JsonField<String>,
    private val meterId: JsonField<String>,
    private val name: JsonField<String>,
    private val quantityPerUnit: JsonField<Double>,
    private val rounding: JsonField<Rounding>,
    private val segmentedFields: JsonField<List<String>>,
    private val segments: JsonField<List<Segment>>,
    private val targetField: JsonField<String>,
    private val unit: JsonField<String>,
    private val version: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accountingProductId")
        @ExcludeMissing
        accountingProductId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("aggregation")
        @ExcludeMissing
        aggregation: JsonField<Aggregation> = JsonMissing.of(),
        @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customFields")
        @ExcludeMissing
        customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("customSql") @ExcludeMissing customSql: JsonField<String> = JsonMissing.of(),
        @JsonProperty("defaultValue")
        @ExcludeMissing
        defaultValue: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("dtCreated")
        @ExcludeMissing
        dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        lastModifiedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("meterId") @ExcludeMissing meterId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantityPerUnit")
        @ExcludeMissing
        quantityPerUnit: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rounding") @ExcludeMissing rounding: JsonField<Rounding> = JsonMissing.of(),
        @JsonProperty("segmentedFields")
        @ExcludeMissing
        segmentedFields: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("segments")
        @ExcludeMissing
        segments: JsonField<List<Segment>> = JsonMissing.of(),
        @JsonProperty("targetField")
        @ExcludeMissing
        targetField: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unit") @ExcludeMissing unit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
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
        segmentedFields,
        segments,
        targetField,
        unit,
        version,
        mutableMapOf(),
    )

    /**
     * The UUID of the entity.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountingProductId(): Optional<String> =
        accountingProductId.getOptional("accountingProductId")

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
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun aggregation(): Optional<Aggregation> = aggregation.getOptional("aggregation")

    /**
     * Code of the Aggregation. A unique short code to identify the Aggregation.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun code(): Optional<String> = code.getOptional("code")

    /**
     * The id of the user who created this aggregation.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customFields(): Optional<CustomFields> = customFields.getOptional("customFields")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customSql(): Optional<String> = customSql.getOptional("customSql")

    /**
     * Aggregation value used when no usage data is available to be aggregated. _(Optional)_.
     *
     * **Note:** Set to 0, if you expect to reference the Aggregation in a Compound Aggregation.
     * This ensures that any null values are passed in correctly to the Compound Aggregation
     * calculation with a value = 0.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultValue(): Optional<Double> = defaultValue.getOptional("defaultValue")

    /**
     * The DateTime when the aggregation was created _(in ISO 8601 format)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtCreated(): Optional<OffsetDateTime> = dtCreated.getOptional("dtCreated")

    /**
     * The DateTime when the aggregation was last modified _(in ISO 8601 format)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtLastModified(): Optional<OffsetDateTime> = dtLastModified.getOptional("dtLastModified")

    /**
     * The id of the user who last modified this aggregation.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedBy(): Optional<String> = lastModifiedBy.getOptional("lastModifiedBy")

    /**
     * The UUID of the Meter used as the source of usage data for the Aggregation.
     *
     * Each Aggregation is a child of a Meter, so the Meter must be selected.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun meterId(): Optional<String> = meterId.getOptional("meterId")

    /**
     * Descriptive name for the Aggregation.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Defines how much of a quantity equates to 1 unit. Used when setting the price per unit for
     * billing purposes - if charging for kilobytes per second (KiBy/s) at rate of $0.25 per 500
     * KiBy/s, then set quantityPerUnit to 500 and price Plan at $0.25 per unit.
     *
     * If `quantityPerUnit` is set to a value other than one, rounding is typically set to UP.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun quantityPerUnit(): Optional<Double> = quantityPerUnit.getOptional("quantityPerUnit")

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
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rounding(): Optional<Rounding> = rounding.getOptional("rounding")

    /**
     * _(Optional)_. Used when creating a segmented Aggregation, which segments the usage data
     * collected by a single Meter. Works together with `segments`.
     *
     * The `Codes` of the fields in the target Meter to use for segmentation purposes.
     *
     * String `dataFields` on the target Meter can be segmented. Any string `derivedFields` on the
     * target Meter, such as one that concatenates two string `dataFields`, can also be segmented.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun segmentedFields(): Optional<List<String>> = segmentedFields.getOptional("segmentedFields")

    /**
     * _(Optional)_. Used when creating a segmented Aggregation, which segments the usage data
     * collected by a single Meter. Works together with `segmentedFields`.
     *
     * Contains the values that are to be used as the segments, read from the fields in the meter
     * pointed at by `segmentedFields`.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun segments(): Optional<List<Segment>> = segments.getOptional("segments")

    /**
     * `Code` of the target `dataField` or `derivedField` on the Meter used as the basis for the
     * Aggregation.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun targetField(): Optional<String> = targetField.getOptional("targetField")

    /**
     * User defined or following the _Unified Code for Units of Measure_ (UCUM).
     *
     * Used as the label for billing, indicating to your customers what they are being charged for.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unit(): Optional<String> = unit.getOptional("unit")

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun version(): Optional<Long> = version.getOptional("version")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [accountingProductId].
     *
     * Unlike [accountingProductId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("accountingProductId")
    @ExcludeMissing
    fun _accountingProductId(): JsonField<String> = accountingProductId

    /**
     * Returns the raw JSON value of [aggregation].
     *
     * Unlike [aggregation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aggregation")
    @ExcludeMissing
    fun _aggregation(): JsonField<Aggregation> = aggregation

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customFields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    /**
     * Returns the raw JSON value of [customSql].
     *
     * Unlike [customSql], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customSql") @ExcludeMissing fun _customSql(): JsonField<String> = customSql

    /**
     * Returns the raw JSON value of [defaultValue].
     *
     * Unlike [defaultValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("defaultValue")
    @ExcludeMissing
    fun _defaultValue(): JsonField<Double> = defaultValue

    /**
     * Returns the raw JSON value of [dtCreated].
     *
     * Unlike [dtCreated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /**
     * Returns the raw JSON value of [dtLastModified].
     *
     * Unlike [dtLastModified], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /**
     * Returns the raw JSON value of [lastModifiedBy].
     *
     * Unlike [lastModifiedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /**
     * Returns the raw JSON value of [meterId].
     *
     * Unlike [meterId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meterId") @ExcludeMissing fun _meterId(): JsonField<String> = meterId

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [quantityPerUnit].
     *
     * Unlike [quantityPerUnit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quantityPerUnit")
    @ExcludeMissing
    fun _quantityPerUnit(): JsonField<Double> = quantityPerUnit

    /**
     * Returns the raw JSON value of [rounding].
     *
     * Unlike [rounding], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rounding") @ExcludeMissing fun _rounding(): JsonField<Rounding> = rounding

    /**
     * Returns the raw JSON value of [segmentedFields].
     *
     * Unlike [segmentedFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("segmentedFields")
    @ExcludeMissing
    fun _segmentedFields(): JsonField<List<String>> = segmentedFields

    /**
     * Returns the raw JSON value of [segments].
     *
     * Unlike [segments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("segments") @ExcludeMissing fun _segments(): JsonField<List<Segment>> = segments

    /**
     * Returns the raw JSON value of [targetField].
     *
     * Unlike [targetField], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("targetField") @ExcludeMissing fun _targetField(): JsonField<String> = targetField

    /**
     * Returns the raw JSON value of [unit].
     *
     * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

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
         * Returns a mutable builder for constructing an instance of [AggregationResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AggregationResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
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
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(aggregationResponse: AggregationResponse) = apply {
            id = aggregationResponse.id
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
            version = aggregationResponse.version
            additionalProperties = aggregationResponse.additionalProperties.toMutableMap()
        }

        /** The UUID of the entity. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun accountingProductId(accountingProductId: String) =
            accountingProductId(JsonField.of(accountingProductId))

        /**
         * Sets [Builder.accountingProductId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountingProductId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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
         * Sets [Builder.aggregation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aggregation] with a well-typed [Aggregation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun aggregation(aggregation: JsonField<Aggregation>) = apply {
            this.aggregation = aggregation
        }

        /** Code of the Aggregation. A unique short code to identify the Aggregation. */
        fun code(code: String) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** The id of the user who created this aggregation. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        /**
         * Sets [Builder.customFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
        }

        fun customSql(customSql: String) = customSql(JsonField.of(customSql))

        /**
         * Sets [Builder.customSql] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customSql] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
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
         * Sets [Builder.defaultValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultValue] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun defaultValue(defaultValue: JsonField<Double>) = apply {
            this.defaultValue = defaultValue
        }

        /** The DateTime when the aggregation was created _(in ISO 8601 format)_. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /**
         * Sets [Builder.dtCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The DateTime when the aggregation was last modified _(in ISO 8601 format)_. */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /**
         * Sets [Builder.dtLastModified] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtLastModified] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        /** The id of the user who last modified this aggregation. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /**
         * Sets [Builder.lastModifiedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastModifiedBy] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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
         * Sets [Builder.meterId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meterId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meterId(meterId: JsonField<String>) = apply { this.meterId = meterId }

        /** Descriptive name for the Aggregation. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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
         * Sets [Builder.quantityPerUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantityPerUnit] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Sets [Builder.rounding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rounding] with a well-typed [Rounding] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Sets [Builder.segmentedFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.segmentedFields] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun segmentedFields(segmentedFields: JsonField<List<String>>) = apply {
            this.segmentedFields = segmentedFields.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [segmentedFields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
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
         * Sets [Builder.segments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.segments] with a well-typed `List<Segment>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun segments(segments: JsonField<List<Segment>>) = apply {
            this.segments = segments.map { it.toMutableList() }
        }

        /**
         * Adds a single [Segment] to [segments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
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
         * Sets [Builder.targetField] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetField] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Sets [Builder.unit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unit] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun unit(unit: JsonField<String>) = apply { this.unit = unit }

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
         * Returns an immutable instance of [AggregationResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AggregationResponse =
            AggregationResponse(
                checkRequired("id", id),
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
                version,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AggregationResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        accountingProductId()
        aggregation().ifPresent { it.validate() }
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
        rounding().ifPresent { it.validate() }
        segmentedFields()
        segments().ifPresent { it.forEach { it.validate() } }
        targetField()
        unit()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (accountingProductId.asKnown().isPresent) 1 else 0) +
            (aggregation.asKnown().getOrNull()?.validity() ?: 0) +
            (if (code.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (customFields.asKnown().getOrNull()?.validity() ?: 0) +
            (if (customSql.asKnown().isPresent) 1 else 0) +
            (if (defaultValue.asKnown().isPresent) 1 else 0) +
            (if (dtCreated.asKnown().isPresent) 1 else 0) +
            (if (dtLastModified.asKnown().isPresent) 1 else 0) +
            (if (lastModifiedBy.asKnown().isPresent) 1 else 0) +
            (if (meterId.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (quantityPerUnit.asKnown().isPresent) 1 else 0) +
            (rounding.asKnown().getOrNull()?.validity() ?: 0) +
            (segmentedFields.asKnown().getOrNull()?.size ?: 0) +
            (segments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (targetField.asKnown().isPresent) 1 else 0) +
            (if (unit.asKnown().isPresent) 1 else 0) +
            (if (version.asKnown().isPresent) 1 else 0)

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

        private var validated: Boolean = false

        fun validate(): Aggregation = apply {
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

            return /* spotless:off */ other is Aggregation && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class CustomFields
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            /**
             * Returns an immutable instance of [CustomFields].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): CustomFields = apply {
            if (validated) {
                return@apply
            }

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
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

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

        private var validated: Boolean = false

        fun validate(): Rounding = apply {
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

            return /* spotless:off */ other is Rounding && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Segment
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            /**
             * Returns an immutable instance of [Segment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Segment = Segment(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Segment = apply {
            if (validated) {
                return@apply
            }

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
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

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

        return /* spotless:off */ other is AggregationResponse && id == other.id && accountingProductId == other.accountingProductId && aggregation == other.aggregation && code == other.code && createdBy == other.createdBy && customFields == other.customFields && customSql == other.customSql && defaultValue == other.defaultValue && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && lastModifiedBy == other.lastModifiedBy && meterId == other.meterId && name == other.name && quantityPerUnit == other.quantityPerUnit && rounding == other.rounding && segmentedFields == other.segmentedFields && segments == other.segments && targetField == other.targetField && unit == other.unit && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accountingProductId, aggregation, code, createdBy, customFields, customSql, defaultValue, dtCreated, dtLastModified, lastModifiedBy, meterId, name, quantityPerUnit, rounding, segmentedFields, segments, targetField, unit, version, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AggregationResponse{id=$id, accountingProductId=$accountingProductId, aggregation=$aggregation, code=$code, createdBy=$createdBy, customFields=$customFields, customSql=$customSql, defaultValue=$defaultValue, dtCreated=$dtCreated, dtLastModified=$dtLastModified, lastModifiedBy=$lastModifiedBy, meterId=$meterId, name=$name, quantityPerUnit=$quantityPerUnit, rounding=$rounding, segmentedFields=$segmentedFields, segments=$segments, targetField=$targetField, unit=$unit, version=$version, additionalProperties=$additionalProperties}"
}
