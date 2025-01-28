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
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.util.Objects
import java.util.Optional

/** Create a new Aggregation. */
class AggregationCreateParams
private constructor(
    private val orgId: String,
    private val body: AggregationCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun orgId(): String = orgId

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
    fun aggregation(): Aggregation = body.aggregation()

    /**
     * The UUID of the Meter used as the source of usage data for the Aggregation.
     *
     * Each Aggregation is a child of a Meter, so the Meter must be selected.
     */
    fun meterId(): String = body.meterId()

    /** Descriptive name for the Aggregation. */
    fun name(): String = body.name()

    /**
     * Defines how much of a quantity equates to 1 unit. Used when setting the price per unit for
     * billing purposes - if charging for kilobytes per second (KiBy/s) at rate of $0.25 per 500
     * KiBy/s, then set quantityPerUnit to 500 and price Plan at $0.25 per unit.
     *
     * **Note:** If `quantityPerUnit` is set to a value other than one, `rounding` is typically set
     * to `"UP"`.
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
     * Enum: “UP” “DOWN” “NEAREST” “NONE”
     */
    fun rounding(): Rounding = body.rounding()

    /**
     * `Code` of the target `dataField` or `derivedField` on the Meter used as the basis for the
     * Aggregation.
     */
    fun targetField(): String = body.targetField()

    /**
     * User defined label for units shown for Bill line items, indicating to your customers what
     * they are being charged for.
     */
    fun unit(): String = body.unit()

    /** Code of the new Aggregation. A unique short code to identify the Aggregation. */
    fun code(): Optional<String> = body.code()

    fun customFields(): Optional<CustomFields> = body.customFields()

    /**
     * Aggregation value used when no usage data is available to be aggregated. _(Optional)_.
     *
     * **Note:** Set to 0, if you expect to reference the Aggregation in a Compound Aggregation.
     * This ensures that any null values are passed in correctly to the Compound Aggregation
     * calculation with a value = 0.
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
     */
    fun segments(): Optional<List<Segment>> = body.segments()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     */
    fun version(): Optional<Long> = body.version()

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
    fun _aggregation(): JsonField<Aggregation> = body._aggregation()

    /**
     * The UUID of the Meter used as the source of usage data for the Aggregation.
     *
     * Each Aggregation is a child of a Meter, so the Meter must be selected.
     */
    fun _meterId(): JsonField<String> = body._meterId()

    /** Descriptive name for the Aggregation. */
    fun _name(): JsonField<String> = body._name()

    /**
     * Defines how much of a quantity equates to 1 unit. Used when setting the price per unit for
     * billing purposes - if charging for kilobytes per second (KiBy/s) at rate of $0.25 per 500
     * KiBy/s, then set quantityPerUnit to 500 and price Plan at $0.25 per unit.
     *
     * **Note:** If `quantityPerUnit` is set to a value other than one, `rounding` is typically set
     * to `"UP"`.
     */
    fun _quantityPerUnit(): JsonField<Double> = body._quantityPerUnit()

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
    fun _rounding(): JsonField<Rounding> = body._rounding()

    /**
     * `Code` of the target `dataField` or `derivedField` on the Meter used as the basis for the
     * Aggregation.
     */
    fun _targetField(): JsonField<String> = body._targetField()

    /**
     * User defined label for units shown for Bill line items, indicating to your customers what
     * they are being charged for.
     */
    fun _unit(): JsonField<String> = body._unit()

    /** Code of the new Aggregation. A unique short code to identify the Aggregation. */
    fun _code(): JsonField<String> = body._code()

    fun _customFields(): JsonField<CustomFields> = body._customFields()

    /**
     * Aggregation value used when no usage data is available to be aggregated. _(Optional)_.
     *
     * **Note:** Set to 0, if you expect to reference the Aggregation in a Compound Aggregation.
     * This ensures that any null values are passed in correctly to the Compound Aggregation
     * calculation with a value = 0.
     */
    fun _defaultValue(): JsonField<Double> = body._defaultValue()

    /**
     * _(Optional)_. Used when creating a segmented Aggregation, which segments the usage data
     * collected by a single Meter. Works together with `segments`.
     *
     * Enter the `Codes` of the fields in the target Meter to use for segmentation purposes.
     *
     * String `dataFields` on the target Meter can be segmented. Any string `derivedFields` on the
     * target Meter, such as one that concatenates two string `dataFields`, can also be segmented.
     */
    fun _segmentedFields(): JsonField<List<String>> = body._segmentedFields()

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
    fun _segments(): JsonField<List<Segment>> = body._segments()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     */
    fun _version(): JsonField<Long> = body._version()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): AggregationCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> orgId
            else -> ""
        }
    }

    @NoAutoDetect
    class AggregationCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("aggregation")
        @ExcludeMissing
        private val aggregation: JsonField<Aggregation> = JsonMissing.of(),
        @JsonProperty("meterId")
        @ExcludeMissing
        private val meterId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantityPerUnit")
        @ExcludeMissing
        private val quantityPerUnit: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rounding")
        @ExcludeMissing
        private val rounding: JsonField<Rounding> = JsonMissing.of(),
        @JsonProperty("targetField")
        @ExcludeMissing
        private val targetField: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unit")
        @ExcludeMissing
        private val unit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("code")
        @ExcludeMissing
        private val code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customFields")
        @ExcludeMissing
        private val customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("defaultValue")
        @ExcludeMissing
        private val defaultValue: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("segmentedFields")
        @ExcludeMissing
        private val segmentedFields: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("segments")
        @ExcludeMissing
        private val segments: JsonField<List<Segment>> = JsonMissing.of(),
        @JsonProperty("version")
        @ExcludeMissing
        private val version: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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
        fun aggregation(): Aggregation = aggregation.getRequired("aggregation")

        /**
         * The UUID of the Meter used as the source of usage data for the Aggregation.
         *
         * Each Aggregation is a child of a Meter, so the Meter must be selected.
         */
        fun meterId(): String = meterId.getRequired("meterId")

        /** Descriptive name for the Aggregation. */
        fun name(): String = name.getRequired("name")

        /**
         * Defines how much of a quantity equates to 1 unit. Used when setting the price per unit
         * for billing purposes - if charging for kilobytes per second (KiBy/s) at rate of $0.25 per
         * 500 KiBy/s, then set quantityPerUnit to 500 and price Plan at $0.25 per unit.
         *
         * **Note:** If `quantityPerUnit` is set to a value other than one, `rounding` is typically
         * set to `"UP"`.
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
         * Enum: “UP” “DOWN” “NEAREST” “NONE”
         */
        fun rounding(): Rounding = rounding.getRequired("rounding")

        /**
         * `Code` of the target `dataField` or `derivedField` on the Meter used as the basis for the
         * Aggregation.
         */
        fun targetField(): String = targetField.getRequired("targetField")

        /**
         * User defined label for units shown for Bill line items, indicating to your customers what
         * they are being charged for.
         */
        fun unit(): String = unit.getRequired("unit")

        /** Code of the new Aggregation. A unique short code to identify the Aggregation. */
        fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

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
         */
        fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

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
        @JsonProperty("aggregation")
        @ExcludeMissing
        fun _aggregation(): JsonField<Aggregation> = aggregation

        /**
         * The UUID of the Meter used as the source of usage data for the Aggregation.
         *
         * Each Aggregation is a child of a Meter, so the Meter must be selected.
         */
        @JsonProperty("meterId") @ExcludeMissing fun _meterId(): JsonField<String> = meterId

        /** Descriptive name for the Aggregation. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Defines how much of a quantity equates to 1 unit. Used when setting the price per unit
         * for billing purposes - if charging for kilobytes per second (KiBy/s) at rate of $0.25 per
         * 500 KiBy/s, then set quantityPerUnit to 500 and price Plan at $0.25 per unit.
         *
         * **Note:** If `quantityPerUnit` is set to a value other than one, `rounding` is typically
         * set to `"UP"`.
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
         *   `quantityPerUnit` is applied. If you set `quantityPerUnit` to a value other than one,
         *   you would typically set Rounding to **UP**. For example, suppose you charge by
         *   kilobytes per second (KiBy/s), set `quantityPerUnit` = 500, and set charge rate at
         *   $0.25 per unit used. If your customer used 48,900 KiBy/s in a billing period, the
         *   charge would be 48,900 / 500 = 97.8 rounded up to 98 \* 0.25 = $2.45.
         *
         * Enum: “UP” “DOWN” “NEAREST” “NONE”
         */
        @JsonProperty("rounding") @ExcludeMissing fun _rounding(): JsonField<Rounding> = rounding

        /**
         * `Code` of the target `dataField` or `derivedField` on the Meter used as the basis for the
         * Aggregation.
         */
        @JsonProperty("targetField")
        @ExcludeMissing
        fun _targetField(): JsonField<String> = targetField

        /**
         * User defined label for units shown for Bill line items, indicating to your customers what
         * they are being charged for.
         */
        @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

        /** Code of the new Aggregation. A unique short code to identify the Aggregation. */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

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
        @JsonProperty("segmentedFields")
        @ExcludeMissing
        fun _segmentedFields(): JsonField<List<String>> = segmentedFields

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
        @JsonProperty("segments")
        @ExcludeMissing
        fun _segments(): JsonField<List<Segment>> = segments

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AggregationCreateBody = apply {
            if (validated) {
                return@apply
            }

            aggregation()
            meterId()
            name()
            quantityPerUnit()
            rounding()
            targetField()
            unit()
            code()
            customFields().ifPresent { it.validate() }
            defaultValue()
            segmentedFields()
            segments().ifPresent { it.forEach { it.validate() } }
            version()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AggregationCreateBody]. */
        class Builder internal constructor() {

            private var aggregation: JsonField<Aggregation>? = null
            private var meterId: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var quantityPerUnit: JsonField<Double>? = null
            private var rounding: JsonField<Rounding>? = null
            private var targetField: JsonField<String>? = null
            private var unit: JsonField<String>? = null
            private var code: JsonField<String> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var defaultValue: JsonField<Double> = JsonMissing.of()
            private var segmentedFields: JsonField<MutableList<String>>? = null
            private var segments: JsonField<MutableList<Segment>>? = null
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(aggregationCreateBody: AggregationCreateBody) = apply {
                aggregation = aggregationCreateBody.aggregation
                meterId = aggregationCreateBody.meterId
                name = aggregationCreateBody.name
                quantityPerUnit = aggregationCreateBody.quantityPerUnit
                rounding = aggregationCreateBody.rounding
                targetField = aggregationCreateBody.targetField
                unit = aggregationCreateBody.unit
                code = aggregationCreateBody.code
                customFields = aggregationCreateBody.customFields
                defaultValue = aggregationCreateBody.defaultValue
                segmentedFields = aggregationCreateBody.segmentedFields.map { it.toMutableList() }
                segments = aggregationCreateBody.segments.map { it.toMutableList() }
                version = aggregationCreateBody.version
                additionalProperties = aggregationCreateBody.additionalProperties.toMutableMap()
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
             * - **COUNT**. Counts the number of values. Can be applied to a **Who**, **What**,
             *   **Where**, **Measure**, **Income**, **Cost** or **Other** `targetField`.
             * - **LATEST**. Uses the most recent value. Can be applied to a **Measure**,
             *   **Income**, or **Cost** `targetField`.
             * - **MEAN**. Uses the arithmetic mean of the values. Can be applied to a **Measure**,
             *   **Income**, or **Cost** `targetField`.
             * - **UNIQUE**. Uses unique values and returns a count of the number of unique values.
             *   Can be applied to a **Metadata** `targetField`.
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
             * - **COUNT**. Counts the number of values. Can be applied to a **Who**, **What**,
             *   **Where**, **Measure**, **Income**, **Cost** or **Other** `targetField`.
             * - **LATEST**. Uses the most recent value. Can be applied to a **Measure**,
             *   **Income**, or **Cost** `targetField`.
             * - **MEAN**. Uses the arithmetic mean of the values. Can be applied to a **Measure**,
             *   **Income**, or **Cost** `targetField`.
             * - **UNIQUE**. Uses unique values and returns a count of the number of unique values.
             *   Can be applied to a **Metadata** `targetField`.
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
             * Defines how much of a quantity equates to 1 unit. Used when setting the price per
             * unit for billing purposes - if charging for kilobytes per second (KiBy/s) at rate of
             * $0.25 per 500 KiBy/s, then set quantityPerUnit to 500 and price Plan at $0.25 per
             * unit.
             *
             * **Note:** If `quantityPerUnit` is set to a value other than one, `rounding` is
             * typically set to `"UP"`.
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
             * Enum: “UP” “DOWN” “NEAREST” “NONE”
             */
            fun rounding(rounding: Rounding) = rounding(JsonField.of(rounding))

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
             * Enum: “UP” “DOWN” “NEAREST” “NONE”
             */
            fun rounding(rounding: JsonField<Rounding>) = apply { this.rounding = rounding }

            /**
             * `Code` of the target `dataField` or `derivedField` on the Meter used as the basis for
             * the Aggregation.
             */
            fun targetField(targetField: String) = targetField(JsonField.of(targetField))

            /**
             * `Code` of the target `dataField` or `derivedField` on the Meter used as the basis for
             * the Aggregation.
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
             * User defined label for units shown for Bill line items, indicating to your customers
             * what they are being charged for.
             */
            fun unit(unit: JsonField<String>) = apply { this.unit = unit }

            /** Code of the new Aggregation. A unique short code to identify the Aggregation. */
            fun code(code: String) = code(JsonField.of(code))

            /** Code of the new Aggregation. A unique short code to identify the Aggregation. */
            fun code(code: JsonField<String>) = apply { this.code = code }

            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

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
             * Aggregation value used when no usage data is available to be aggregated.
             * _(Optional)_.
             *
             * **Note:** Set to 0, if you expect to reference the Aggregation in a Compound
             * Aggregation. This ensures that any null values are passed in correctly to the
             * Compound Aggregation calculation with a value = 0.
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
             * _(Optional)_. Used when creating a segmented Aggregation, which segments the usage
             * data collected by a single Meter. Works together with `segments`.
             *
             * Enter the `Codes` of the fields in the target Meter to use for segmentation purposes.
             *
             * String `dataFields` on the target Meter can be segmented. Any string `derivedFields`
             * on the target Meter, such as one that concatenates two string `dataFields`, can also
             * be segmented.
             */
            fun segmentedFields(segmentedFields: JsonField<List<String>>) = apply {
                this.segmentedFields = segmentedFields.map { it.toMutableList() }
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
            fun segments(segments: JsonField<List<Segment>>) = apply {
                this.segments = segments.map { it.toMutableList() }
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
             * The version number of the entity:
             * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
             *   Create_. On initial Create, version is set at 1 and listed in the response.
             * - **Update Entity:** On Update, version is required and must match the existing
             *   version because a check is performed to ensure sequential versioning is preserved.
             *   Version is incremented by 1 and listed in the response.
             */
            fun version(version: Long) = version(JsonField.of(version))

            /**
             * The version number of the entity:
             * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
             *   Create_. On initial Create, version is set at 1 and listed in the response.
             * - **Update Entity:** On Update, version is required and must match the existing
             *   version because a check is performed to ensure sequential versioning is preserved.
             *   Version is incremented by 1 and listed in the response.
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

            fun build(): AggregationCreateBody =
                AggregationCreateBody(
                    checkRequired("aggregation", aggregation),
                    checkRequired("meterId", meterId),
                    checkRequired("name", name),
                    checkRequired("quantityPerUnit", quantityPerUnit),
                    checkRequired("rounding", rounding),
                    checkRequired("targetField", targetField),
                    checkRequired("unit", unit),
                    code,
                    customFields,
                    defaultValue,
                    (segmentedFields ?: JsonMissing.of()).map { it.toImmutable() },
                    (segments ?: JsonMissing.of()).map { it.toImmutable() },
                    version,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AggregationCreateBody && aggregation == other.aggregation && meterId == other.meterId && name == other.name && quantityPerUnit == other.quantityPerUnit && rounding == other.rounding && targetField == other.targetField && unit == other.unit && code == other.code && customFields == other.customFields && defaultValue == other.defaultValue && segmentedFields == other.segmentedFields && segments == other.segments && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(aggregation, meterId, name, quantityPerUnit, rounding, targetField, unit, code, customFields, defaultValue, segmentedFields, segments, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AggregationCreateBody{aggregation=$aggregation, meterId=$meterId, name=$name, quantityPerUnit=$quantityPerUnit, rounding=$rounding, targetField=$targetField, unit=$unit, code=$code, customFields=$customFields, defaultValue=$defaultValue, segmentedFields=$segmentedFields, segments=$segments, version=$version, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AggregationCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var body: AggregationCreateBody.Builder = AggregationCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(aggregationCreateParams: AggregationCreateParams) = apply {
            orgId = aggregationCreateParams.orgId
            body = aggregationCreateParams.body.toBuilder()
            additionalHeaders = aggregationCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = aggregationCreateParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

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
        fun aggregation(aggregation: Aggregation) = apply { body.aggregation(aggregation) }

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
         * The UUID of the Meter used as the source of usage data for the Aggregation.
         *
         * Each Aggregation is a child of a Meter, so the Meter must be selected.
         */
        fun meterId(meterId: JsonField<String>) = apply { body.meterId(meterId) }

        /** Descriptive name for the Aggregation. */
        fun name(name: String) = apply { body.name(name) }

        /** Descriptive name for the Aggregation. */
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
         * Defines how much of a quantity equates to 1 unit. Used when setting the price per unit
         * for billing purposes - if charging for kilobytes per second (KiBy/s) at rate of $0.25 per
         * 500 KiBy/s, then set quantityPerUnit to 500 and price Plan at $0.25 per unit.
         *
         * **Note:** If `quantityPerUnit` is set to a value other than one, `rounding` is typically
         * set to `"UP"`.
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
         * Enum: “UP” “DOWN” “NEAREST” “NONE”
         */
        fun rounding(rounding: Rounding) = apply { body.rounding(rounding) }

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
        fun rounding(rounding: JsonField<Rounding>) = apply { body.rounding(rounding) }

        /**
         * `Code` of the target `dataField` or `derivedField` on the Meter used as the basis for the
         * Aggregation.
         */
        fun targetField(targetField: String) = apply { body.targetField(targetField) }

        /**
         * `Code` of the target `dataField` or `derivedField` on the Meter used as the basis for the
         * Aggregation.
         */
        fun targetField(targetField: JsonField<String>) = apply { body.targetField(targetField) }

        /**
         * User defined label for units shown for Bill line items, indicating to your customers what
         * they are being charged for.
         */
        fun unit(unit: String) = apply { body.unit(unit) }

        /**
         * User defined label for units shown for Bill line items, indicating to your customers what
         * they are being charged for.
         */
        fun unit(unit: JsonField<String>) = apply { body.unit(unit) }

        /** Code of the new Aggregation. A unique short code to identify the Aggregation. */
        fun code(code: String) = apply { body.code(code) }

        /** Code of the new Aggregation. A unique short code to identify the Aggregation. */
        fun code(code: JsonField<String>) = apply { body.code(code) }

        fun customFields(customFields: CustomFields) = apply { body.customFields(customFields) }

        fun customFields(customFields: JsonField<CustomFields>) = apply {
            body.customFields(customFields)
        }

        /**
         * Aggregation value used when no usage data is available to be aggregated. _(Optional)_.
         *
         * **Note:** Set to 0, if you expect to reference the Aggregation in a Compound Aggregation.
         * This ensures that any null values are passed in correctly to the Compound Aggregation
         * calculation with a value = 0.
         */
        fun defaultValue(defaultValue: Double) = apply { body.defaultValue(defaultValue) }

        /**
         * Aggregation value used when no usage data is available to be aggregated. _(Optional)_.
         *
         * **Note:** Set to 0, if you expect to reference the Aggregation in a Compound Aggregation.
         * This ensures that any null values are passed in correctly to the Compound Aggregation
         * calculation with a value = 0.
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
         * _(Optional)_. Used when creating a segmented Aggregation, which segments the usage data
         * collected by a single Meter. Works together with `segments`.
         *
         * Enter the `Codes` of the fields in the target Meter to use for segmentation purposes.
         *
         * String `dataFields` on the target Meter can be segmented. Any string `derivedFields` on
         * the target Meter, such as one that concatenates two string `dataFields`, can also be
         * segmented.
         */
        fun segmentedFields(segmentedFields: JsonField<List<String>>) = apply {
            body.segmentedFields(segmentedFields)
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
        fun segments(segments: JsonField<List<Segment>>) = apply { body.segments(segments) }

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
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
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

        fun build(): AggregationCreateParams =
            AggregationCreateParams(
                checkRequired("orgId", orgId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
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
    class Aggregation
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

        fun asString(): String = _value().asStringOrThrow()

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
     * Enum: “UP” “DOWN” “NEAREST” “NONE”
     */
    class Rounding
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

        return /* spotless:off */ other is AggregationCreateParams && orgId == other.orgId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AggregationCreateParams{orgId=$orgId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
