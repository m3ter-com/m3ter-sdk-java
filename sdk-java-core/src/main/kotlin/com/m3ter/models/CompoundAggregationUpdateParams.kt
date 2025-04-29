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
import com.m3ter.core.Params
import com.m3ter.core.checkRequired
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update the CompoundAggregation with the given UUID.
 *
 * This endpoint allows you to update the details of a specific CompoundAggregation associated with
 * an Organization. Use it to modify details of an existing CompoundAggregation such as the
 * Calculation formula.
 *
 * **Note:** If you have created Custom Fields for a Compound Aggregation, when you use this
 * endpoint to update the Compound Aggregation use the `customFields` parameter to preserve those
 * Custom Fields. If you omit them from the update request, they will be lost.
 */
class CompoundAggregationUpdateParams
private constructor(
    private val orgId: String?,
    private val id: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    fun id(): String = id

    /**
     * String that represents the formula for the calculation. This formula determines how the
     * CompoundAggregation value is calculated. The calculation can reference simple Aggregations or
     * Custom Fields. This field is required when creating or updating a CompoundAggregation.
     *
     * **NOTE:** If a simple Aggregation referenced by a Compound Aggregation has a **Quantity per
     * unit** defined or a **Rounding** defined, these will not be factored into the value used by
     * the calculation. For example, if the simple Aggregation referenced has a base value of 100
     * and has **Quantity per unit** set at 10, the Compound Aggregation calculation _will use the
     * base value of 100 not 10_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun calculation(): String = body.calculation()

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
     * Boolean True / False flag:
     * - **TRUE** - set to TRUE if you want to allow null values from the simple Aggregations
     *   referenced in the Compound Aggregation to be passed in. Simple Aggregations based on Meter
     *   Target Fields where no usage data is available will have null values.
     * - **FALSE** Default.
     *
     * **Note:** If any of the simple Aggregations you reference in a Compound Aggregation
     * calculation might have null values, you must set their Default Value to 0. This ensures that
     * any null values passed into the Compound Aggregation are passed in correctly with value = 0.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun evaluateNullAggregations(): Optional<Boolean> = body.evaluateNullAggregations()

    /**
     * Unique identifier (UUID) of the Product the CompoundAggregation belongs to.
     *
     * **Note:** Omit this parameter if you want to create a _Global_ CompoundAggregation.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun productId(): Optional<String> = body.productId()

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
     * Returns the raw JSON value of [calculation].
     *
     * Unlike [calculation], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _calculation(): JsonField<String> = body._calculation()

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
     * Returns the raw JSON value of [evaluateNullAggregations].
     *
     * Unlike [evaluateNullAggregations], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _evaluateNullAggregations(): JsonField<Boolean> = body._evaluateNullAggregations()

    /**
     * Returns the raw JSON value of [productId].
     *
     * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _productId(): JsonField<String> = body._productId()

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
         * Returns a mutable builder for constructing an instance of
         * [CompoundAggregationUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .calculation()
         * .name()
         * .quantityPerUnit()
         * .rounding()
         * .unit()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CompoundAggregationUpdateParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(compoundAggregationUpdateParams: CompoundAggregationUpdateParams) =
            apply {
                orgId = compoundAggregationUpdateParams.orgId
                id = compoundAggregationUpdateParams.id
                body = compoundAggregationUpdateParams.body.toBuilder()
                additionalHeaders = compoundAggregationUpdateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    compoundAggregationUpdateParams.additionalQueryParams.toBuilder()
            }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        fun id(id: String) = apply { this.id = id }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [calculation]
         * - [name]
         * - [quantityPerUnit]
         * - [rounding]
         * - [unit]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * String that represents the formula for the calculation. This formula determines how the
         * CompoundAggregation value is calculated. The calculation can reference simple
         * Aggregations or Custom Fields. This field is required when creating or updating a
         * CompoundAggregation.
         *
         * **NOTE:** If a simple Aggregation referenced by a Compound Aggregation has a **Quantity
         * per unit** defined or a **Rounding** defined, these will not be factored into the value
         * used by the calculation. For example, if the simple Aggregation referenced has a base
         * value of 100 and has **Quantity per unit** set at 10, the Compound Aggregation
         * calculation _will use the base value of 100 not 10_.
         */
        fun calculation(calculation: String) = apply { body.calculation(calculation) }

        /**
         * Sets [Builder.calculation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.calculation] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun calculation(calculation: JsonField<String>) = apply { body.calculation(calculation) }

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

        /**
         * Boolean True / False flag:
         * - **TRUE** - set to TRUE if you want to allow null values from the simple Aggregations
         *   referenced in the Compound Aggregation to be passed in. Simple Aggregations based on
         *   Meter Target Fields where no usage data is available will have null values.
         * - **FALSE** Default.
         *
         * **Note:** If any of the simple Aggregations you reference in a Compound Aggregation
         * calculation might have null values, you must set their Default Value to 0. This ensures
         * that any null values passed into the Compound Aggregation are passed in correctly with
         * value = 0.
         */
        fun evaluateNullAggregations(evaluateNullAggregations: Boolean) = apply {
            body.evaluateNullAggregations(evaluateNullAggregations)
        }

        /**
         * Sets [Builder.evaluateNullAggregations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluateNullAggregations] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun evaluateNullAggregations(evaluateNullAggregations: JsonField<Boolean>) = apply {
            body.evaluateNullAggregations(evaluateNullAggregations)
        }

        /**
         * Unique identifier (UUID) of the Product the CompoundAggregation belongs to.
         *
         * **Note:** Omit this parameter if you want to create a _Global_ CompoundAggregation.
         */
        fun productId(productId: String) = apply { body.productId(productId) }

        /**
         * Sets [Builder.productId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productId(productId: JsonField<String>) = apply { body.productId(productId) }

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
         * Returns an immutable instance of [CompoundAggregationUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .calculation()
         * .name()
         * .quantityPerUnit()
         * .rounding()
         * .unit()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CompoundAggregationUpdateParams =
            CompoundAggregationUpdateParams(
                orgId,
                checkRequired("id", id),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId ?: ""
            1 -> id
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val calculation: JsonField<String>,
        private val name: JsonField<String>,
        private val quantityPerUnit: JsonField<Double>,
        private val rounding: JsonField<Rounding>,
        private val unit: JsonField<String>,
        private val accountingProductId: JsonField<String>,
        private val code: JsonField<String>,
        private val customFields: JsonField<CustomFields>,
        private val evaluateNullAggregations: JsonField<Boolean>,
        private val productId: JsonField<String>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("calculation")
            @ExcludeMissing
            calculation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantityPerUnit")
            @ExcludeMissing
            quantityPerUnit: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("rounding")
            @ExcludeMissing
            rounding: JsonField<Rounding> = JsonMissing.of(),
            @JsonProperty("unit") @ExcludeMissing unit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("accountingProductId")
            @ExcludeMissing
            accountingProductId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customFields")
            @ExcludeMissing
            customFields: JsonField<CustomFields> = JsonMissing.of(),
            @JsonProperty("evaluateNullAggregations")
            @ExcludeMissing
            evaluateNullAggregations: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("productId")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(
            calculation,
            name,
            quantityPerUnit,
            rounding,
            unit,
            accountingProductId,
            code,
            customFields,
            evaluateNullAggregations,
            productId,
            version,
            mutableMapOf(),
        )

        /**
         * String that represents the formula for the calculation. This formula determines how the
         * CompoundAggregation value is calculated. The calculation can reference simple
         * Aggregations or Custom Fields. This field is required when creating or updating a
         * CompoundAggregation.
         *
         * **NOTE:** If a simple Aggregation referenced by a Compound Aggregation has a **Quantity
         * per unit** defined or a **Rounding** defined, these will not be factored into the value
         * used by the calculation. For example, if the simple Aggregation referenced has a base
         * value of 100 and has **Quantity per unit** set at 10, the Compound Aggregation
         * calculation _will use the base value of 100 not 10_.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun calculation(): String = calculation.getRequired("calculation")

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
            accountingProductId.getOptional("accountingProductId")

        /**
         * Code of the new Aggregation. A unique short code to identify the Aggregation.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun code(): Optional<String> = code.getOptional("code")

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customFields(): Optional<CustomFields> = customFields.getOptional("customFields")

        /**
         * Boolean True / False flag:
         * - **TRUE** - set to TRUE if you want to allow null values from the simple Aggregations
         *   referenced in the Compound Aggregation to be passed in. Simple Aggregations based on
         *   Meter Target Fields where no usage data is available will have null values.
         * - **FALSE** Default.
         *
         * **Note:** If any of the simple Aggregations you reference in a Compound Aggregation
         * calculation might have null values, you must set their Default Value to 0. This ensures
         * that any null values passed into the Compound Aggregation are passed in correctly with
         * value = 0.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun evaluateNullAggregations(): Optional<Boolean> =
            evaluateNullAggregations.getOptional("evaluateNullAggregations")

        /**
         * Unique identifier (UUID) of the Product the CompoundAggregation belongs to.
         *
         * **Note:** Omit this parameter if you want to create a _Global_ CompoundAggregation.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun productId(): Optional<String> = productId.getOptional("productId")

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
        fun version(): Optional<Long> = version.getOptional("version")

        /**
         * Returns the raw JSON value of [calculation].
         *
         * Unlike [calculation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("calculation")
        @ExcludeMissing
        fun _calculation(): JsonField<String> = calculation

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
         * Returns the raw JSON value of [evaluateNullAggregations].
         *
         * Unlike [evaluateNullAggregations], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("evaluateNullAggregations")
        @ExcludeMissing
        fun _evaluateNullAggregations(): JsonField<Boolean> = evaluateNullAggregations

        /**
         * Returns the raw JSON value of [productId].
         *
         * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("productId") @ExcludeMissing fun _productId(): JsonField<String> = productId

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
             * .calculation()
             * .name()
             * .quantityPerUnit()
             * .rounding()
             * .unit()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var calculation: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var quantityPerUnit: JsonField<Double>? = null
            private var rounding: JsonField<Rounding>? = null
            private var unit: JsonField<String>? = null
            private var accountingProductId: JsonField<String> = JsonMissing.of()
            private var code: JsonField<String> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var evaluateNullAggregations: JsonField<Boolean> = JsonMissing.of()
            private var productId: JsonField<String> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                calculation = body.calculation
                name = body.name
                quantityPerUnit = body.quantityPerUnit
                rounding = body.rounding
                unit = body.unit
                accountingProductId = body.accountingProductId
                code = body.code
                customFields = body.customFields
                evaluateNullAggregations = body.evaluateNullAggregations
                productId = body.productId
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * String that represents the formula for the calculation. This formula determines how
             * the CompoundAggregation value is calculated. The calculation can reference simple
             * Aggregations or Custom Fields. This field is required when creating or updating a
             * CompoundAggregation.
             *
             * **NOTE:** If a simple Aggregation referenced by a Compound Aggregation has a
             * **Quantity per unit** defined or a **Rounding** defined, these will not be factored
             * into the value used by the calculation. For example, if the simple Aggregation
             * referenced has a base value of 100 and has **Quantity per unit** set at 10, the
             * Compound Aggregation calculation _will use the base value of 100 not 10_.
             */
            fun calculation(calculation: String) = calculation(JsonField.of(calculation))

            /**
             * Sets [Builder.calculation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.calculation] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun calculation(calculation: JsonField<String>) = apply {
                this.calculation = calculation
            }

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

            /**
             * Boolean True / False flag:
             * - **TRUE** - set to TRUE if you want to allow null values from the simple
             *   Aggregations referenced in the Compound Aggregation to be passed in. Simple
             *   Aggregations based on Meter Target Fields where no usage data is available will
             *   have null values.
             * - **FALSE** Default.
             *
             * **Note:** If any of the simple Aggregations you reference in a Compound Aggregation
             * calculation might have null values, you must set their Default Value to 0. This
             * ensures that any null values passed into the Compound Aggregation are passed in
             * correctly with value = 0.
             */
            fun evaluateNullAggregations(evaluateNullAggregations: Boolean) =
                evaluateNullAggregations(JsonField.of(evaluateNullAggregations))

            /**
             * Sets [Builder.evaluateNullAggregations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.evaluateNullAggregations] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun evaluateNullAggregations(evaluateNullAggregations: JsonField<Boolean>) = apply {
                this.evaluateNullAggregations = evaluateNullAggregations
            }

            /**
             * Unique identifier (UUID) of the Product the CompoundAggregation belongs to.
             *
             * **Note:** Omit this parameter if you want to create a _Global_ CompoundAggregation.
             */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

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
             * .calculation()
             * .name()
             * .quantityPerUnit()
             * .rounding()
             * .unit()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("calculation", calculation),
                    checkRequired("name", name),
                    checkRequired("quantityPerUnit", quantityPerUnit),
                    checkRequired("rounding", rounding),
                    checkRequired("unit", unit),
                    accountingProductId,
                    code,
                    customFields,
                    evaluateNullAggregations,
                    productId,
                    version,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            calculation()
            name()
            quantityPerUnit()
            rounding().validate()
            unit()
            accountingProductId()
            code()
            customFields().ifPresent { it.validate() }
            evaluateNullAggregations()
            productId()
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
            (if (calculation.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (quantityPerUnit.asKnown().isPresent) 1 else 0) +
                (rounding.asKnown().getOrNull()?.validity() ?: 0) +
                (if (unit.asKnown().isPresent) 1 else 0) +
                (if (accountingProductId.asKnown().isPresent) 1 else 0) +
                (if (code.asKnown().isPresent) 1 else 0) +
                (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (evaluateNullAggregations.asKnown().isPresent) 1 else 0) +
                (if (productId.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && calculation == other.calculation && name == other.name && quantityPerUnit == other.quantityPerUnit && rounding == other.rounding && unit == other.unit && accountingProductId == other.accountingProductId && code == other.code && customFields == other.customFields && evaluateNullAggregations == other.evaluateNullAggregations && productId == other.productId && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(calculation, name, quantityPerUnit, rounding, unit, accountingProductId, code, customFields, evaluateNullAggregations, productId, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{calculation=$calculation, name=$name, quantityPerUnit=$quantityPerUnit, rounding=$rounding, unit=$unit, accountingProductId=$accountingProductId, code=$code, customFields=$customFields, evaluateNullAggregations=$evaluateNullAggregations, productId=$productId, version=$version, additionalProperties=$additionalProperties}"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CompoundAggregationUpdateParams && orgId == other.orgId && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CompoundAggregationUpdateParams{orgId=$orgId, id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
