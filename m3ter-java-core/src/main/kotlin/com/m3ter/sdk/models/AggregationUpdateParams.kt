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
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkKnown
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update the Aggregation with the given UUID.
 *
 * **Note:** If you have created Custom Fields for an Aggregation, when you use this endpoint to
 * update the Aggregation use the `customFields` parameter to preserve those Custom Fields. If you
 * omit them from the update request, they will be lost.
 */
class AggregationUpdateParams
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
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun aggregation(): Aggregation = body.aggregation()

    /**
     * The UUID of the Meter used as the source of usage data for the Aggregation.
     *
     * Each Aggregation is a child of a Meter, so the Meter must be selected.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meterId(): String = body.meterId()

    /**
     * Descriptive name for the Aggregation.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * Defines how much of a quantity equates to 1 unit. Used when setting the price per unit for
     * billing purposes - if charging for kilobytes per second (KiBy/s) at rate of $0.25 per 500
     * KiBy/s, then set quantityPerUnit to 500 and price Plan at $0.25 per unit.
     *
     * **Note:** If `quantityPerUnit` is set to a value other than one, `rounding` is typically set
     * to `"UP"`.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun quantityPerUnit(): Double = body.quantityPerUnit()

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
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rounding(): Rounding = body.rounding()

    /**
     * `Code` of the target `dataField` or `derivedField` on the Meter used as the basis for the
     * Aggregation.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun targetField(): String = body.targetField()

    /**
     * User defined label for units shown for Bill line items, indicating to your customers what
     * they are being charged for.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun unit(): String = body.unit()

    /**
     * Optional Product ID this Aggregation should be attributed to for accounting purposes
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountingProductId(): Optional<String> = body.accountingProductId()

    /**
     * Code of the new Aggregation. A unique short code to identify the Aggregation.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun code(): Optional<String> = body.code()

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customFields(): Optional<CustomFields> = body.customFields()

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customSql(): Optional<String> = body.customSql()

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
    fun defaultValue(): Optional<Double> = body.defaultValue()

    /**
     * _(Optional)_. Used when creating a segmented Aggregation, which segments the usage data
     * collected by a single Meter. Works together with `segments`.
     *
     * Enter the `Codes` of the fields in the target Meter to use for segmentation purposes.
     *
     * String `dataFields` on the target Meter can be segmented. Any string `derivedFields` on the
     * target Meter, such as one that concatenates two string `dataFields`, can also be segmented.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun segmentedFields(): Optional<List<String>> = body.segmentedFields()

    /**
     * _(Optional)_. Used when creating a segmented Aggregation, which segments the usage data
     * collected by a single Meter. Works together with `segmentedFields`.
     *
     * Enter the values that are to be used as the segments, read from the fields in the meter
     * pointed at by `segmentedFields`.
     *
     * Note that you can use _wildcards_ or _defaults_ when setting up segment values. For more
     * details on how to do this with an example, see
     * [Using Wildcards - API Calls](https://www.m3ter.com/docs/guides/setting-up-usage-data-meters-and-aggregations/segmented-aggregations#using-wildcards---api-calls)
     * in our main User Docs.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun segments(): Optional<List<Segment>> = body.segments()

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
    fun version(): Optional<Long> = body.version()

    /**
     * Returns the raw JSON value of [aggregation].
     *
     * Unlike [aggregation], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _aggregation(): JsonField<Aggregation> = body._aggregation()

    /**
     * Returns the raw JSON value of [meterId].
     *
     * Unlike [meterId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _meterId(): JsonField<String> = body._meterId()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [quantityPerUnit].
     *
     * Unlike [quantityPerUnit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _quantityPerUnit(): JsonField<Double> = body._quantityPerUnit()

    /**
     * Returns the raw JSON value of [rounding].
     *
     * Unlike [rounding], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rounding(): JsonField<Rounding> = body._rounding()

    /**
     * Returns the raw JSON value of [targetField].
     *
     * Unlike [targetField], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _targetField(): JsonField<String> = body._targetField()

    /**
     * Returns the raw JSON value of [unit].
     *
     * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _unit(): JsonField<String> = body._unit()

    /**
     * Returns the raw JSON value of [accountingProductId].
     *
     * Unlike [accountingProductId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _accountingProductId(): JsonField<String> = body._accountingProductId()

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _code(): JsonField<String> = body._code()

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customFields(): JsonField<CustomFields> = body._customFields()

    /**
     * Returns the raw JSON value of [customSql].
     *
     * Unlike [customSql], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customSql(): JsonField<String> = body._customSql()

    /**
     * Returns the raw JSON value of [defaultValue].
     *
     * Unlike [defaultValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _defaultValue(): JsonField<Double> = body._defaultValue()

    /**
     * Returns the raw JSON value of [segmentedFields].
     *
     * Unlike [segmentedFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _segmentedFields(): JsonField<List<String>> = body._segmentedFields()

    /**
     * Returns the raw JSON value of [segments].
     *
     * Unlike [segments], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _segments(): JsonField<List<Segment>> = body._segments()

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _version(): JsonField<Long> = body._version()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AggregationUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .id()
         * .aggregation()
         * .meterId()
         * .name()
         * .quantityPerUnit()
         * .rounding()
         * .targetField()
         * .unit()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AggregationUpdateParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(aggregationUpdateParams: AggregationUpdateParams) = apply {
            orgId = aggregationUpdateParams.orgId
            id = aggregationUpdateParams.id
            body = aggregationUpdateParams.body.toBuilder()
            additionalHeaders = aggregationUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = aggregationUpdateParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        fun id(id: String) = apply { this.id = id }

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
        fun aggregation(aggregation: Aggregation) = apply { body.aggregation(aggregation) }

        /**
         * Sets [Builder.aggregation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aggregation] with a well-typed [Aggregation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun aggregation(aggregation: JsonField<Aggregation>) = apply {
            body.aggregation(aggregation)
        }

        /**
         * The UUID of the Meter used as the source of usage data for the Aggregation.
         *
         * Each Aggregation is a child of a Meter, so the Meter must be selected.
         */
        fun meterId(meterId: String) = apply { body.meterId(meterId) }

        /**
         * Sets [Builder.meterId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meterId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meterId(meterId: JsonField<String>) = apply { body.meterId(meterId) }

        /** Descriptive name for the Aggregation. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * Defines how much of a quantity equates to 1 unit. Used when setting the price per unit
         * for billing purposes - if charging for kilobytes per second (KiBy/s) at rate of $0.25 per
         * 500 KiBy/s, then set quantityPerUnit to 500 and price Plan at $0.25 per unit.
         *
         * **Note:** If `quantityPerUnit` is set to a value other than one, `rounding` is typically
         * set to `"UP"`.
         */
        fun quantityPerUnit(quantityPerUnit: Double) = apply {
            body.quantityPerUnit(quantityPerUnit)
        }

        /**
         * Sets [Builder.quantityPerUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantityPerUnit] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun quantityPerUnit(quantityPerUnit: JsonField<Double>) = apply {
            body.quantityPerUnit(quantityPerUnit)
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
        fun rounding(rounding: Rounding) = apply { body.rounding(rounding) }

        /**
         * Sets [Builder.rounding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rounding] with a well-typed [Rounding] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rounding(rounding: JsonField<Rounding>) = apply { body.rounding(rounding) }

        /**
         * `Code` of the target `dataField` or `derivedField` on the Meter used as the basis for the
         * Aggregation.
         */
        fun targetField(targetField: String) = apply { body.targetField(targetField) }

        /**
         * Sets [Builder.targetField] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetField] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun targetField(targetField: JsonField<String>) = apply { body.targetField(targetField) }

        /**
         * User defined label for units shown for Bill line items, indicating to your customers what
         * they are being charged for.
         */
        fun unit(unit: String) = apply { body.unit(unit) }

        /**
         * Sets [Builder.unit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unit] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun unit(unit: JsonField<String>) = apply { body.unit(unit) }

        /** Optional Product ID this Aggregation should be attributed to for accounting purposes */
        fun accountingProductId(accountingProductId: String) = apply {
            body.accountingProductId(accountingProductId)
        }

        /**
         * Sets [Builder.accountingProductId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountingProductId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountingProductId(accountingProductId: JsonField<String>) = apply {
            body.accountingProductId(accountingProductId)
        }

        /** Code of the new Aggregation. A unique short code to identify the Aggregation. */
        fun code(code: String) = apply { body.code(code) }

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { body.code(code) }

        fun customFields(customFields: CustomFields) = apply { body.customFields(customFields) }

        /**
         * Sets [Builder.customFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            body.customFields(customFields)
        }

        fun customSql(customSql: String) = apply { body.customSql(customSql) }

        /**
         * Sets [Builder.customSql] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customSql] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customSql(customSql: JsonField<String>) = apply { body.customSql(customSql) }

        /**
         * Aggregation value used when no usage data is available to be aggregated. _(Optional)_.
         *
         * **Note:** Set to 0, if you expect to reference the Aggregation in a Compound Aggregation.
         * This ensures that any null values are passed in correctly to the Compound Aggregation
         * calculation with a value = 0.
         */
        fun defaultValue(defaultValue: Double) = apply { body.defaultValue(defaultValue) }

        /**
         * Sets [Builder.defaultValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultValue] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun defaultValue(defaultValue: JsonField<Double>) = apply {
            body.defaultValue(defaultValue)
        }

        /**
         * _(Optional)_. Used when creating a segmented Aggregation, which segments the usage data
         * collected by a single Meter. Works together with `segments`.
         *
         * Enter the `Codes` of the fields in the target Meter to use for segmentation purposes.
         *
         * String `dataFields` on the target Meter can be segmented. Any string `derivedFields` on
         * the target Meter, such as one that concatenates two string `dataFields`, can also be
         * segmented.
         */
        fun segmentedFields(segmentedFields: List<String>) = apply {
            body.segmentedFields(segmentedFields)
        }

        /**
         * Sets [Builder.segmentedFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.segmentedFields] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun segmentedFields(segmentedFields: JsonField<List<String>>) = apply {
            body.segmentedFields(segmentedFields)
        }

        /**
         * Adds a single [String] to [segmentedFields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSegmentedField(segmentedField: String) = apply {
            body.addSegmentedField(segmentedField)
        }

        /**
         * _(Optional)_. Used when creating a segmented Aggregation, which segments the usage data
         * collected by a single Meter. Works together with `segmentedFields`.
         *
         * Enter the values that are to be used as the segments, read from the fields in the meter
         * pointed at by `segmentedFields`.
         *
         * Note that you can use _wildcards_ or _defaults_ when setting up segment values. For more
         * details on how to do this with an example, see
         * [Using Wildcards - API Calls](https://www.m3ter.com/docs/guides/setting-up-usage-data-meters-and-aggregations/segmented-aggregations#using-wildcards---api-calls)
         * in our main User Docs.
         */
        fun segments(segments: List<Segment>) = apply { body.segments(segments) }

        /**
         * Sets [Builder.segments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.segments] with a well-typed `List<Segment>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun segments(segments: JsonField<List<Segment>>) = apply { body.segments(segments) }

        /**
         * Adds a single [Segment] to [segments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSegment(segment: Segment) = apply { body.addSegment(segment) }

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        fun version(version: Long) = apply { body.version(version) }

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<Long>) = apply { body.version(version) }

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

        /**
         * Returns an immutable instance of [AggregationUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .id()
         * .aggregation()
         * .meterId()
         * .name()
         * .quantityPerUnit()
         * .rounding()
         * .targetField()
         * .unit()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AggregationUpdateParams =
            AggregationUpdateParams(
                checkRequired("orgId", orgId),
                checkRequired("id", id),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @JvmSynthetic internal fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId
            1 -> id
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val aggregation: JsonField<Aggregation>,
        private val meterId: JsonField<String>,
        private val name: JsonField<String>,
        private val quantityPerUnit: JsonField<Double>,
        private val rounding: JsonField<Rounding>,
        private val targetField: JsonField<String>,
        private val unit: JsonField<String>,
        private val accountingProductId: JsonField<String>,
        private val code: JsonField<String>,
        private val customFields: JsonField<CustomFields>,
        private val customSql: JsonField<String>,
        private val defaultValue: JsonField<Double>,
        private val segmentedFields: JsonField<List<String>>,
        private val segments: JsonField<List<Segment>>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("aggregation")
            @ExcludeMissing
            aggregation: JsonField<Aggregation> = JsonMissing.of(),
            @JsonProperty("meterId") @ExcludeMissing meterId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantityPerUnit")
            @ExcludeMissing
            quantityPerUnit: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("rounding")
            @ExcludeMissing
            rounding: JsonField<Rounding> = JsonMissing.of(),
            @JsonProperty("targetField")
            @ExcludeMissing
            targetField: JsonField<String> = JsonMissing.of(),
            @JsonProperty("unit") @ExcludeMissing unit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("accountingProductId")
            @ExcludeMissing
            accountingProductId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customFields")
            @ExcludeMissing
            customFields: JsonField<CustomFields> = JsonMissing.of(),
            @JsonProperty("customSql")
            @ExcludeMissing
            customSql: JsonField<String> = JsonMissing.of(),
            @JsonProperty("defaultValue")
            @ExcludeMissing
            defaultValue: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("segmentedFields")
            @ExcludeMissing
            segmentedFields: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("segments")
            @ExcludeMissing
            segments: JsonField<List<Segment>> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(
            aggregation,
            meterId,
            name,
            quantityPerUnit,
            rounding,
            targetField,
            unit,
            accountingProductId,
            code,
            customFields,
            customSql,
            defaultValue,
            segmentedFields,
            segments,
            version,
            mutableMapOf(),
        )

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
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun aggregation(): Aggregation = aggregation.getRequired("aggregation")

        /**
         * The UUID of the Meter used as the source of usage data for the Aggregation.
         *
         * Each Aggregation is a child of a Meter, so the Meter must be selected.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun meterId(): String = meterId.getRequired("meterId")

        /**
         * Descriptive name for the Aggregation.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Defines how much of a quantity equates to 1 unit. Used when setting the price per unit
         * for billing purposes - if charging for kilobytes per second (KiBy/s) at rate of $0.25 per
         * 500 KiBy/s, then set quantityPerUnit to 500 and price Plan at $0.25 per unit.
         *
         * **Note:** If `quantityPerUnit` is set to a value other than one, `rounding` is typically
         * set to `"UP"`.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun quantityPerUnit(): Double = quantityPerUnit.getRequired("quantityPerUnit")

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
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun rounding(): Rounding = rounding.getRequired("rounding")

        /**
         * `Code` of the target `dataField` or `derivedField` on the Meter used as the basis for the
         * Aggregation.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun targetField(): String = targetField.getRequired("targetField")

        /**
         * User defined label for units shown for Bill line items, indicating to your customers what
         * they are being charged for.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun unit(): String = unit.getRequired("unit")

        /**
         * Optional Product ID this Aggregation should be attributed to for accounting purposes
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountingProductId(): Optional<String> =
            Optional.ofNullable(accountingProductId.getNullable("accountingProductId"))

        /**
         * Code of the new Aggregation. A unique short code to identify the Aggregation.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("customFields"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customSql(): Optional<String> = Optional.ofNullable(customSql.getNullable("customSql"))

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
        fun defaultValue(): Optional<Double> =
            Optional.ofNullable(defaultValue.getNullable("defaultValue"))

        /**
         * _(Optional)_. Used when creating a segmented Aggregation, which segments the usage data
         * collected by a single Meter. Works together with `segments`.
         *
         * Enter the `Codes` of the fields in the target Meter to use for segmentation purposes.
         *
         * String `dataFields` on the target Meter can be segmented. Any string `derivedFields` on
         * the target Meter, such as one that concatenates two string `dataFields`, can also be
         * segmented.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun segmentedFields(): Optional<List<String>> =
            Optional.ofNullable(segmentedFields.getNullable("segmentedFields"))

        /**
         * _(Optional)_. Used when creating a segmented Aggregation, which segments the usage data
         * collected by a single Meter. Works together with `segmentedFields`.
         *
         * Enter the values that are to be used as the segments, read from the fields in the meter
         * pointed at by `segmentedFields`.
         *
         * Note that you can use _wildcards_ or _defaults_ when setting up segment values. For more
         * details on how to do this with an example, see
         * [Using Wildcards - API Calls](https://www.m3ter.com/docs/guides/setting-up-usage-data-meters-and-aggregations/segmented-aggregations#using-wildcards---api-calls)
         * in our main User Docs.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun segments(): Optional<List<Segment>> =
            Optional.ofNullable(segments.getNullable("segments"))

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

        /**
         * Returns the raw JSON value of [aggregation].
         *
         * Unlike [aggregation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("aggregation")
        @ExcludeMissing
        fun _aggregation(): JsonField<Aggregation> = aggregation

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
         * Unlike [quantityPerUnit], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Returns the raw JSON value of [targetField].
         *
         * Unlike [targetField], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("targetField")
        @ExcludeMissing
        fun _targetField(): JsonField<String> = targetField

        /**
         * Returns the raw JSON value of [unit].
         *
         * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

        /**
         * Returns the raw JSON value of [accountingProductId].
         *
         * Unlike [accountingProductId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("accountingProductId")
        @ExcludeMissing
        fun _accountingProductId(): JsonField<String> = accountingProductId

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [customFields].
         *
         * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [defaultValue], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("defaultValue")
        @ExcludeMissing
        fun _defaultValue(): JsonField<Double> = defaultValue

        /**
         * Returns the raw JSON value of [segmentedFields].
         *
         * Unlike [segmentedFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("segmentedFields")
        @ExcludeMissing
        fun _segmentedFields(): JsonField<List<String>> = segmentedFields

        /**
         * Returns the raw JSON value of [segments].
         *
         * Unlike [segments], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("segments")
        @ExcludeMissing
        fun _segments(): JsonField<List<Segment>> = segments

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .aggregation()
             * .meterId()
             * .name()
             * .quantityPerUnit()
             * .rounding()
             * .targetField()
             * .unit()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var aggregation: JsonField<Aggregation>? = null
            private var meterId: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var quantityPerUnit: JsonField<Double>? = null
            private var rounding: JsonField<Rounding>? = null
            private var targetField: JsonField<String>? = null
            private var unit: JsonField<String>? = null
            private var accountingProductId: JsonField<String> = JsonMissing.of()
            private var code: JsonField<String> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var customSql: JsonField<String> = JsonMissing.of()
            private var defaultValue: JsonField<Double> = JsonMissing.of()
            private var segmentedFields: JsonField<MutableList<String>>? = null
            private var segments: JsonField<MutableList<Segment>>? = null
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                aggregation = body.aggregation
                meterId = body.meterId
                name = body.name
                quantityPerUnit = body.quantityPerUnit
                rounding = body.rounding
                targetField = body.targetField
                unit = body.unit
                accountingProductId = body.accountingProductId
                code = body.code
                customFields = body.customFields
                customSql = body.customSql
                defaultValue = body.defaultValue
                segmentedFields = body.segmentedFields.map { it.toMutableList() }
                segments = body.segments.map { it.toMutableList() }
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
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
             * - **COUNT**. Counts the number of values. Can be applied to a **Measure**,
             *   **Income**, or **Cost** `targetField`.
             * - **LATEST**. Uses the most recent value. Can be applied to a **Measure**,
             *   **Income**, or **Cost** `targetField`. Note: Based on the timestamp (`ts`) value of
             *   usage data measurement submissions. If using this method, please ensure _distinct_
             *   `ts` values are used for usage data measurment submissions.
             * - **MEAN**. Uses the arithmetic mean of the values. Can be applied to a **Measure**,
             *   **Income**, or **Cost** `targetField`.
             * - **UNIQUE**. Uses unique values and returns a count of the number of unique values.
             *   Can be applied to a **Metadata** `targetField`.
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

            /**
             * The UUID of the Meter used as the source of usage data for the Aggregation.
             *
             * Each Aggregation is a child of a Meter, so the Meter must be selected.
             */
            fun meterId(meterId: String) = meterId(JsonField.of(meterId))

            /**
             * Sets [Builder.meterId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meterId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun meterId(meterId: JsonField<String>) = apply { this.meterId = meterId }

            /** Descriptive name for the Aggregation. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Defines how much of a quantity equates to 1 unit. Used when setting the price per
             * unit for billing purposes - if charging for kilobytes per second (KiBy/s) at rate of
             * $0.25 per 500 KiBy/s, then set quantityPerUnit to 500 and price Plan at $0.25 per
             * unit.
             *
             * **Note:** If `quantityPerUnit` is set to a value other than one, `rounding` is
             * typically set to `"UP"`.
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
             * Specifies how you want to deal with non-integer, fractional number Aggregation
             * values.
             *
             * **NOTES:**
             * - **NEAREST** rounds to the nearest half: 5.1 is rounded to 5, and 3.5 is rounded
             *   to 4.
             * - Also used in combination with `quantityPerUnit`. Rounds the number of units after
             *   `quantityPerUnit` is applied. If you set `quantityPerUnit` to a value other than
             *   one, you would typically set Rounding to **UP**. For example, suppose you charge by
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
             * You should usually call [Builder.rounding] with a well-typed [Rounding] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rounding(rounding: JsonField<Rounding>) = apply { this.rounding = rounding }

            /**
             * `Code` of the target `dataField` or `derivedField` on the Meter used as the basis for
             * the Aggregation.
             */
            fun targetField(targetField: String) = targetField(JsonField.of(targetField))

            /**
             * Sets [Builder.targetField] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetField] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetField(targetField: JsonField<String>) = apply {
                this.targetField = targetField
            }

            /**
             * User defined label for units shown for Bill line items, indicating to your customers
             * what they are being charged for.
             */
            fun unit(unit: String) = unit(JsonField.of(unit))

            /**
             * Sets [Builder.unit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unit] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun unit(unit: JsonField<String>) = apply { this.unit = unit }

            /**
             * Optional Product ID this Aggregation should be attributed to for accounting purposes
             */
            fun accountingProductId(accountingProductId: String) =
                accountingProductId(JsonField.of(accountingProductId))

            /**
             * Sets [Builder.accountingProductId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountingProductId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun accountingProductId(accountingProductId: JsonField<String>) = apply {
                this.accountingProductId = accountingProductId
            }

            /** Code of the new Aggregation. A unique short code to identify the Aggregation. */
            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

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
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customSql(customSql: JsonField<String>) = apply { this.customSql = customSql }

            /**
             * Aggregation value used when no usage data is available to be aggregated.
             * _(Optional)_.
             *
             * **Note:** Set to 0, if you expect to reference the Aggregation in a Compound
             * Aggregation. This ensures that any null values are passed in correctly to the
             * Compound Aggregation calculation with a value = 0.
             */
            fun defaultValue(defaultValue: Double) = defaultValue(JsonField.of(defaultValue))

            /**
             * Sets [Builder.defaultValue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultValue] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun defaultValue(defaultValue: JsonField<Double>) = apply {
                this.defaultValue = defaultValue
            }

            /**
             * _(Optional)_. Used when creating a segmented Aggregation, which segments the usage
             * data collected by a single Meter. Works together with `segments`.
             *
             * Enter the `Codes` of the fields in the target Meter to use for segmentation purposes.
             *
             * String `dataFields` on the target Meter can be segmented. Any string `derivedFields`
             * on the target Meter, such as one that concatenates two string `dataFields`, can also
             * be segmented.
             */
            fun segmentedFields(segmentedFields: List<String>) =
                segmentedFields(JsonField.of(segmentedFields))

            /**
             * Sets [Builder.segmentedFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.segmentedFields] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * _(Optional)_. Used when creating a segmented Aggregation, which segments the usage
             * data collected by a single Meter. Works together with `segmentedFields`.
             *
             * Enter the values that are to be used as the segments, read from the fields in the
             * meter pointed at by `segmentedFields`.
             *
             * Note that you can use _wildcards_ or _defaults_ when setting up segment values. For
             * more details on how to do this with an example, see
             * [Using Wildcards - API Calls](https://www.m3ter.com/docs/guides/setting-up-usage-data-meters-and-aggregations/segmented-aggregations#using-wildcards---api-calls)
             * in our main User Docs.
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
             * The version number of the entity:
             * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
             *   Create_. On initial Create, version is set at 1 and listed in the response.
             * - **Update Entity:** On Update, version is required and must match the existing
             *   version because a check is performed to ensure sequential versioning is preserved.
             *   Version is incremented by 1 and listed in the response.
             */
            fun version(version: Long) = version(JsonField.of(version))

            /**
             * Sets [Builder.version] to an arbitrary JSON value.
             *
             * You should usually call [Builder.version] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .aggregation()
             * .meterId()
             * .name()
             * .quantityPerUnit()
             * .rounding()
             * .targetField()
             * .unit()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("aggregation", aggregation),
                    checkRequired("meterId", meterId),
                    checkRequired("name", name),
                    checkRequired("quantityPerUnit", quantityPerUnit),
                    checkRequired("rounding", rounding),
                    checkRequired("targetField", targetField),
                    checkRequired("unit", unit),
                    accountingProductId,
                    code,
                    customFields,
                    customSql,
                    defaultValue,
                    (segmentedFields ?: JsonMissing.of()).map { it.toImmutable() },
                    (segments ?: JsonMissing.of()).map { it.toImmutable() },
                    version,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            aggregation().validate()
            meterId()
            name()
            quantityPerUnit()
            rounding().validate()
            targetField()
            unit()
            accountingProductId()
            code()
            customFields().ifPresent { it.validate() }
            customSql()
            defaultValue()
            segmentedFields()
            segments().ifPresent { it.forEach { it.validate() } }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (aggregation.asKnown().getOrNull()?.validity() ?: 0) +
                (if (meterId.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (quantityPerUnit.asKnown().isPresent) 1 else 0) +
                (rounding.asKnown().getOrNull()?.validity() ?: 0) +
                (if (targetField.asKnown().isPresent) 1 else 0) +
                (if (unit.asKnown().isPresent) 1 else 0) +
                (if (accountingProductId.asKnown().isPresent) 1 else 0) +
                (if (code.asKnown().isPresent) 1 else 0) +
                (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (customSql.asKnown().isPresent) 1 else 0) +
                (if (defaultValue.asKnown().isPresent) 1 else 0) +
                (segmentedFields.asKnown().getOrNull()?.size ?: 0) +
                (segments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && aggregation == other.aggregation && meterId == other.meterId && name == other.name && quantityPerUnit == other.quantityPerUnit && rounding == other.rounding && targetField == other.targetField && unit == other.unit && accountingProductId == other.accountingProductId && code == other.code && customFields == other.customFields && customSql == other.customSql && defaultValue == other.defaultValue && segmentedFields == other.segmentedFields && segments == other.segments && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(aggregation, meterId, name, quantityPerUnit, rounding, targetField, unit, accountingProductId, code, customFields, customSql, defaultValue, segmentedFields, segments, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{aggregation=$aggregation, meterId=$meterId, name=$name, quantityPerUnit=$quantityPerUnit, rounding=$rounding, targetField=$targetField, unit=$unit, accountingProductId=$accountingProductId, code=$code, customFields=$customFields, customSql=$customSql, defaultValue=$defaultValue, segmentedFields=$segmentedFields, segments=$segments, version=$version, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is AggregationUpdateParams && orgId == other.orgId && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AggregationUpdateParams{orgId=$orgId, id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
