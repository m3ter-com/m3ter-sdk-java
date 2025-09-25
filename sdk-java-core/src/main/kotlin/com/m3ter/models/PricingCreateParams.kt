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
import com.m3ter.core.checkKnown
import com.m3ter.core.checkRequired
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create a new Pricing.
 *
 * **Note:** Either `planId` or `planTemplateId` request parameters are required for this call to be
 * valid. If you omit both, then you will receive a validation error.
 */
class PricingCreateParams
private constructor(
    private val orgId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pricingBands(): List<PricingBand> = body.pricingBands()

    /**
     * The start date *(in ISO-8601 format)* for when the Pricing starts to be active for the Plan
     * of Plan Template.*(Required)*
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startDate(): OffsetDateTime = body.startDate()

    /**
     * Optional Product ID this Pricing should be attributed to for accounting purposes
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountingProductId(): Optional<String> = body.accountingProductId()

    /**
     * UUID of the Aggregation used to create the Pricing. Use this when creating a Pricing for a
     * segmented aggregation.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun aggregationId(): Optional<String> = body.aggregationId()

    /**
     * Unique short code for the Pricing.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun code(): Optional<String> = body.code()

    /**
     * UUID of the Compound Aggregation used to create the Pricing.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun compoundAggregationId(): Optional<String> = body.compoundAggregationId()

    /**
     * Controls whether or not charge rates under a set of pricing bands configured for a Pricing
     * are applied according to each separate band or at the highest band reached.
     *
     * *(Optional)*. The default value is **FALSE**.
     * * When TRUE, at billing charge rates are applied according to each separate band.
     * * When FALSE, at billing charge rates are applied according to highest band reached.
     *
     * **NOTE:** Use the `cumulative` parameter to create the type of Pricing you require. For
     * example, for Tiered Pricing set to **TRUE**; for Volume Pricing, set to **FALSE**.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cumulative(): Optional<Boolean> = body.cumulative()

    /**
     * Displayed on Bill line items.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * The end date *(in ISO-8601 format)* for when the Pricing ceases to be active for the Plan or
     * Plan Template.
     *
     * *(Optional)* If not specified, the Pricing remains active indefinitely.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endDate(): Optional<OffsetDateTime> = body.endDate()

    /**
     * The minimum spend amount per billing cycle for end customer Accounts on a Plan to which the
     * Pricing is applied.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minimumSpend(): Optional<Double> = body.minimumSpend()

    /**
     * The default value is **FALSE**.
     * * When TRUE, minimum spend is billed at the start of each billing period.
     * * When FALSE, minimum spend is billed at the end of each billing period.
     *
     * *(Optional)*. Overrides the setting at Organization level for minimum spend billing in
     * arrears/in advance.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minimumSpendBillInAdvance(): Optional<Boolean> = body.minimumSpendBillInAdvance()

    /**
     * Minimum spend description *(displayed on the bill line item)*.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minimumSpendDescription(): Optional<String> = body.minimumSpendDescription()

    /**
     * Specify Prepayment/Balance overage pricing in pricing bands for the case of a **Tiered**
     * pricing structure.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overagePricingBands(): Optional<List<PricingBand>> = body.overagePricingBands()

    /**
     * UUID of the Plan the Pricing is created for.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun planId(): Optional<String> = body.planId()

    /**
     * UUID of the Plan Template the Pricing is created for.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun planTemplateId(): Optional<String> = body.planTemplateId()

    /**
     * Specifies the segment value which you are defining a Pricing for using this call:
     * - For each segment value defined on a Segmented Aggregation you must create a separate
     *   Pricing and use the appropriate `aggregationId` parameter for the call.
     * - If you specify a segment value that has not been defined for the Aggregation, you'll
     *   receive an error.
     * - If you've defined segment values for the Aggregation using a single wildcard or multiple
     *   wildcards, you can create Pricing for these wildcard segment values also.
     *
     * For more details on creating Pricings for segment values on a Segmented Aggregation using
     * this call, together with some examples, see the
     * [Using API Call to Create Segmented Pricings](https://www.m3ter.com/docs/guides/plans-and-pricing/pricing-plans/pricing-plans-using-segmented-aggregations#using-api-call-to-create-a-segmented-pricing)
     * in our User Documentation.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun segment(): Optional<Segment> = body.segment()

    /**
     * The default value is **FALSE**.
     * * If TRUE, usage accumulates over the entire period the priced Plan is active for the
     *   account, and is not reset for pricing band rates at the start of each billing period.
     * * If FALSE, usage does not accumulate, and is reset for pricing bands at the start of each
     *   billing period.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tiersSpanPlan(): Optional<Boolean> = body.tiersSpanPlan()

    /**
     * * **DEBIT**. Default setting. The amount calculated using the Pricing is added to the bill as
     *   a debit.
     * * **PRODUCT_CREDIT**. The amount calculated using the Pricing is added to the bill as a
     *   credit *(negative amount)*. To prevent negative billing, the bill will be capped at the
     *   total of other line items for the same Product.
     * * **GLOBAL_CREDIT**. The amount calculated using the Pricing is added to the bill as a credit
     *   *(negative amount)*. To prevent negative billing, the bill will be capped at the total of
     *   other line items for the entire bill, which might include other Products the Account
     *   consumes.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = body.type()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - *do not use for Create*.
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
     * Returns the raw JSON value of [pricingBands].
     *
     * Unlike [pricingBands], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pricingBands(): JsonField<List<PricingBand>> = body._pricingBands()

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startDate(): JsonField<OffsetDateTime> = body._startDate()

    /**
     * Returns the raw JSON value of [accountingProductId].
     *
     * Unlike [accountingProductId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _accountingProductId(): JsonField<String> = body._accountingProductId()

    /**
     * Returns the raw JSON value of [aggregationId].
     *
     * Unlike [aggregationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _aggregationId(): JsonField<String> = body._aggregationId()

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _code(): JsonField<String> = body._code()

    /**
     * Returns the raw JSON value of [compoundAggregationId].
     *
     * Unlike [compoundAggregationId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _compoundAggregationId(): JsonField<String> = body._compoundAggregationId()

    /**
     * Returns the raw JSON value of [cumulative].
     *
     * Unlike [cumulative], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cumulative(): JsonField<Boolean> = body._cumulative()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endDate(): JsonField<OffsetDateTime> = body._endDate()

    /**
     * Returns the raw JSON value of [minimumSpend].
     *
     * Unlike [minimumSpend], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _minimumSpend(): JsonField<Double> = body._minimumSpend()

    /**
     * Returns the raw JSON value of [minimumSpendBillInAdvance].
     *
     * Unlike [minimumSpendBillInAdvance], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _minimumSpendBillInAdvance(): JsonField<Boolean> = body._minimumSpendBillInAdvance()

    /**
     * Returns the raw JSON value of [minimumSpendDescription].
     *
     * Unlike [minimumSpendDescription], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _minimumSpendDescription(): JsonField<String> = body._minimumSpendDescription()

    /**
     * Returns the raw JSON value of [overagePricingBands].
     *
     * Unlike [overagePricingBands], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _overagePricingBands(): JsonField<List<PricingBand>> = body._overagePricingBands()

    /**
     * Returns the raw JSON value of [planId].
     *
     * Unlike [planId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _planId(): JsonField<String> = body._planId()

    /**
     * Returns the raw JSON value of [planTemplateId].
     *
     * Unlike [planTemplateId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _planTemplateId(): JsonField<String> = body._planTemplateId()

    /**
     * Returns the raw JSON value of [segment].
     *
     * Unlike [segment], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _segment(): JsonField<Segment> = body._segment()

    /**
     * Returns the raw JSON value of [tiersSpanPlan].
     *
     * Unlike [tiersSpanPlan], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tiersSpanPlan(): JsonField<Boolean> = body._tiersSpanPlan()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<Type> = body._type()

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _version(): JsonField<Long> = body._version()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PricingCreateParams].
         *
         * The following fields are required:
         * ```java
         * .pricingBands()
         * .startDate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PricingCreateParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(pricingCreateParams: PricingCreateParams) = apply {
            orgId = pricingCreateParams.orgId
            body = pricingCreateParams.body.toBuilder()
            additionalHeaders = pricingCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = pricingCreateParams.additionalQueryParams.toBuilder()
        }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [pricingBands]
         * - [startDate]
         * - [accountingProductId]
         * - [aggregationId]
         * - [code]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun pricingBands(pricingBands: List<PricingBand>) = apply {
            body.pricingBands(pricingBands)
        }

        /**
         * Sets [Builder.pricingBands] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pricingBands] with a well-typed `List<PricingBand>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun pricingBands(pricingBands: JsonField<List<PricingBand>>) = apply {
            body.pricingBands(pricingBands)
        }

        /**
         * Adds a single [PricingBand] to [pricingBands].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPricingBand(pricingBand: PricingBand) = apply { body.addPricingBand(pricingBand) }

        /**
         * The start date *(in ISO-8601 format)* for when the Pricing starts to be active for the
         * Plan of Plan Template.*(Required)*
         */
        fun startDate(startDate: OffsetDateTime) = apply { body.startDate(startDate) }

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { body.startDate(startDate) }

        /** Optional Product ID this Pricing should be attributed to for accounting purposes */
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

        /**
         * UUID of the Aggregation used to create the Pricing. Use this when creating a Pricing for
         * a segmented aggregation.
         */
        fun aggregationId(aggregationId: String) = apply { body.aggregationId(aggregationId) }

        /**
         * Sets [Builder.aggregationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aggregationId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun aggregationId(aggregationId: JsonField<String>) = apply {
            body.aggregationId(aggregationId)
        }

        /** Unique short code for the Pricing. */
        fun code(code: String) = apply { body.code(code) }

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { body.code(code) }

        /** UUID of the Compound Aggregation used to create the Pricing. */
        fun compoundAggregationId(compoundAggregationId: String) = apply {
            body.compoundAggregationId(compoundAggregationId)
        }

        /**
         * Sets [Builder.compoundAggregationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.compoundAggregationId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun compoundAggregationId(compoundAggregationId: JsonField<String>) = apply {
            body.compoundAggregationId(compoundAggregationId)
        }

        /**
         * Controls whether or not charge rates under a set of pricing bands configured for a
         * Pricing are applied according to each separate band or at the highest band reached.
         *
         * *(Optional)*. The default value is **FALSE**.
         * * When TRUE, at billing charge rates are applied according to each separate band.
         * * When FALSE, at billing charge rates are applied according to highest band reached.
         *
         * **NOTE:** Use the `cumulative` parameter to create the type of Pricing you require. For
         * example, for Tiered Pricing set to **TRUE**; for Volume Pricing, set to **FALSE**.
         */
        fun cumulative(cumulative: Boolean) = apply { body.cumulative(cumulative) }

        /**
         * Sets [Builder.cumulative] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cumulative] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cumulative(cumulative: JsonField<Boolean>) = apply { body.cumulative(cumulative) }

        /** Displayed on Bill line items. */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * The end date *(in ISO-8601 format)* for when the Pricing ceases to be active for the Plan
         * or Plan Template.
         *
         * *(Optional)* If not specified, the Pricing remains active indefinitely.
         */
        fun endDate(endDate: OffsetDateTime) = apply { body.endDate(endDate) }

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { body.endDate(endDate) }

        /**
         * The minimum spend amount per billing cycle for end customer Accounts on a Plan to which
         * the Pricing is applied.
         */
        fun minimumSpend(minimumSpend: Double) = apply { body.minimumSpend(minimumSpend) }

        /**
         * Sets [Builder.minimumSpend] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimumSpend] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minimumSpend(minimumSpend: JsonField<Double>) = apply {
            body.minimumSpend(minimumSpend)
        }

        /**
         * The default value is **FALSE**.
         * * When TRUE, minimum spend is billed at the start of each billing period.
         * * When FALSE, minimum spend is billed at the end of each billing period.
         *
         * *(Optional)*. Overrides the setting at Organization level for minimum spend billing in
         * arrears/in advance.
         */
        fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: Boolean) = apply {
            body.minimumSpendBillInAdvance(minimumSpendBillInAdvance)
        }

        /**
         * Sets [Builder.minimumSpendBillInAdvance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimumSpendBillInAdvance] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: JsonField<Boolean>) = apply {
            body.minimumSpendBillInAdvance(minimumSpendBillInAdvance)
        }

        /** Minimum spend description *(displayed on the bill line item)*. */
        fun minimumSpendDescription(minimumSpendDescription: String) = apply {
            body.minimumSpendDescription(minimumSpendDescription)
        }

        /**
         * Sets [Builder.minimumSpendDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimumSpendDescription] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun minimumSpendDescription(minimumSpendDescription: JsonField<String>) = apply {
            body.minimumSpendDescription(minimumSpendDescription)
        }

        /**
         * Specify Prepayment/Balance overage pricing in pricing bands for the case of a **Tiered**
         * pricing structure.
         */
        fun overagePricingBands(overagePricingBands: List<PricingBand>) = apply {
            body.overagePricingBands(overagePricingBands)
        }

        /**
         * Sets [Builder.overagePricingBands] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overagePricingBands] with a well-typed
         * `List<PricingBand>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun overagePricingBands(overagePricingBands: JsonField<List<PricingBand>>) = apply {
            body.overagePricingBands(overagePricingBands)
        }

        /**
         * Adds a single [PricingBand] to [overagePricingBands].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOveragePricingBand(overagePricingBand: PricingBand) = apply {
            body.addOveragePricingBand(overagePricingBand)
        }

        /** UUID of the Plan the Pricing is created for. */
        fun planId(planId: String) = apply { body.planId(planId) }

        /**
         * Sets [Builder.planId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun planId(planId: JsonField<String>) = apply { body.planId(planId) }

        /** UUID of the Plan Template the Pricing is created for. */
        fun planTemplateId(planTemplateId: String) = apply { body.planTemplateId(planTemplateId) }

        /**
         * Sets [Builder.planTemplateId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planTemplateId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun planTemplateId(planTemplateId: JsonField<String>) = apply {
            body.planTemplateId(planTemplateId)
        }

        /**
         * Specifies the segment value which you are defining a Pricing for using this call:
         * - For each segment value defined on a Segmented Aggregation you must create a separate
         *   Pricing and use the appropriate `aggregationId` parameter for the call.
         * - If you specify a segment value that has not been defined for the Aggregation, you'll
         *   receive an error.
         * - If you've defined segment values for the Aggregation using a single wildcard or
         *   multiple wildcards, you can create Pricing for these wildcard segment values also.
         *
         * For more details on creating Pricings for segment values on a Segmented Aggregation using
         * this call, together with some examples, see the
         * [Using API Call to Create Segmented Pricings](https://www.m3ter.com/docs/guides/plans-and-pricing/pricing-plans/pricing-plans-using-segmented-aggregations#using-api-call-to-create-a-segmented-pricing)
         * in our User Documentation.
         */
        fun segment(segment: Segment) = apply { body.segment(segment) }

        /**
         * Sets [Builder.segment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.segment] with a well-typed [Segment] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun segment(segment: JsonField<Segment>) = apply { body.segment(segment) }

        /**
         * The default value is **FALSE**.
         * * If TRUE, usage accumulates over the entire period the priced Plan is active for the
         *   account, and is not reset for pricing band rates at the start of each billing period.
         * * If FALSE, usage does not accumulate, and is reset for pricing bands at the start of
         *   each billing period.
         */
        fun tiersSpanPlan(tiersSpanPlan: Boolean) = apply { body.tiersSpanPlan(tiersSpanPlan) }

        /**
         * Sets [Builder.tiersSpanPlan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tiersSpanPlan] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tiersSpanPlan(tiersSpanPlan: JsonField<Boolean>) = apply {
            body.tiersSpanPlan(tiersSpanPlan)
        }

        /**
         * * **DEBIT**. Default setting. The amount calculated using the Pricing is added to the
         *   bill as a debit.
         * * **PRODUCT_CREDIT**. The amount calculated using the Pricing is added to the bill as a
         *   credit *(negative amount)*. To prevent negative billing, the bill will be capped at the
         *   total of other line items for the same Product.
         * * **GLOBAL_CREDIT**. The amount calculated using the Pricing is added to the bill as a
         *   credit *(negative amount)*. To prevent negative billing, the bill will be capped at the
         *   total of other line items for the entire bill, which might include other Products the
         *   Account consumes.
         */
        fun type(type: Type) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { body.type(type) }

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - *do not use for
         *   Create*. On initial Create, version is set at 1 and listed in the response.
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
         * Returns an immutable instance of [PricingCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .pricingBands()
         * .startDate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PricingCreateParams =
            PricingCreateParams(
                orgId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val pricingBands: JsonField<List<PricingBand>>,
        private val startDate: JsonField<OffsetDateTime>,
        private val accountingProductId: JsonField<String>,
        private val aggregationId: JsonField<String>,
        private val code: JsonField<String>,
        private val compoundAggregationId: JsonField<String>,
        private val cumulative: JsonField<Boolean>,
        private val description: JsonField<String>,
        private val endDate: JsonField<OffsetDateTime>,
        private val minimumSpend: JsonField<Double>,
        private val minimumSpendBillInAdvance: JsonField<Boolean>,
        private val minimumSpendDescription: JsonField<String>,
        private val overagePricingBands: JsonField<List<PricingBand>>,
        private val planId: JsonField<String>,
        private val planTemplateId: JsonField<String>,
        private val segment: JsonField<Segment>,
        private val tiersSpanPlan: JsonField<Boolean>,
        private val type: JsonField<Type>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("pricingBands")
            @ExcludeMissing
            pricingBands: JsonField<List<PricingBand>> = JsonMissing.of(),
            @JsonProperty("startDate")
            @ExcludeMissing
            startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("accountingProductId")
            @ExcludeMissing
            accountingProductId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aggregationId")
            @ExcludeMissing
            aggregationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("compoundAggregationId")
            @ExcludeMissing
            compoundAggregationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cumulative")
            @ExcludeMissing
            cumulative: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("endDate")
            @ExcludeMissing
            endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("minimumSpend")
            @ExcludeMissing
            minimumSpend: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("minimumSpendBillInAdvance")
            @ExcludeMissing
            minimumSpendBillInAdvance: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("minimumSpendDescription")
            @ExcludeMissing
            minimumSpendDescription: JsonField<String> = JsonMissing.of(),
            @JsonProperty("overagePricingBands")
            @ExcludeMissing
            overagePricingBands: JsonField<List<PricingBand>> = JsonMissing.of(),
            @JsonProperty("planId") @ExcludeMissing planId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("planTemplateId")
            @ExcludeMissing
            planTemplateId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("segment") @ExcludeMissing segment: JsonField<Segment> = JsonMissing.of(),
            @JsonProperty("tiersSpanPlan")
            @ExcludeMissing
            tiersSpanPlan: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(
            pricingBands,
            startDate,
            accountingProductId,
            aggregationId,
            code,
            compoundAggregationId,
            cumulative,
            description,
            endDate,
            minimumSpend,
            minimumSpendBillInAdvance,
            minimumSpendDescription,
            overagePricingBands,
            planId,
            planTemplateId,
            segment,
            tiersSpanPlan,
            type,
            version,
            mutableMapOf(),
        )

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pricingBands(): List<PricingBand> = pricingBands.getRequired("pricingBands")

        /**
         * The start date *(in ISO-8601 format)* for when the Pricing starts to be active for the
         * Plan of Plan Template.*(Required)*
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startDate(): OffsetDateTime = startDate.getRequired("startDate")

        /**
         * Optional Product ID this Pricing should be attributed to for accounting purposes
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountingProductId(): Optional<String> =
            accountingProductId.getOptional("accountingProductId")

        /**
         * UUID of the Aggregation used to create the Pricing. Use this when creating a Pricing for
         * a segmented aggregation.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun aggregationId(): Optional<String> = aggregationId.getOptional("aggregationId")

        /**
         * Unique short code for the Pricing.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun code(): Optional<String> = code.getOptional("code")

        /**
         * UUID of the Compound Aggregation used to create the Pricing.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun compoundAggregationId(): Optional<String> =
            compoundAggregationId.getOptional("compoundAggregationId")

        /**
         * Controls whether or not charge rates under a set of pricing bands configured for a
         * Pricing are applied according to each separate band or at the highest band reached.
         *
         * *(Optional)*. The default value is **FALSE**.
         * * When TRUE, at billing charge rates are applied according to each separate band.
         * * When FALSE, at billing charge rates are applied according to highest band reached.
         *
         * **NOTE:** Use the `cumulative` parameter to create the type of Pricing you require. For
         * example, for Tiered Pricing set to **TRUE**; for Volume Pricing, set to **FALSE**.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cumulative(): Optional<Boolean> = cumulative.getOptional("cumulative")

        /**
         * Displayed on Bill line items.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * The end date *(in ISO-8601 format)* for when the Pricing ceases to be active for the Plan
         * or Plan Template.
         *
         * *(Optional)* If not specified, the Pricing remains active indefinitely.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): Optional<OffsetDateTime> = endDate.getOptional("endDate")

        /**
         * The minimum spend amount per billing cycle for end customer Accounts on a Plan to which
         * the Pricing is applied.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minimumSpend(): Optional<Double> = minimumSpend.getOptional("minimumSpend")

        /**
         * The default value is **FALSE**.
         * * When TRUE, minimum spend is billed at the start of each billing period.
         * * When FALSE, minimum spend is billed at the end of each billing period.
         *
         * *(Optional)*. Overrides the setting at Organization level for minimum spend billing in
         * arrears/in advance.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minimumSpendBillInAdvance(): Optional<Boolean> =
            minimumSpendBillInAdvance.getOptional("minimumSpendBillInAdvance")

        /**
         * Minimum spend description *(displayed on the bill line item)*.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minimumSpendDescription(): Optional<String> =
            minimumSpendDescription.getOptional("minimumSpendDescription")

        /**
         * Specify Prepayment/Balance overage pricing in pricing bands for the case of a **Tiered**
         * pricing structure.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun overagePricingBands(): Optional<List<PricingBand>> =
            overagePricingBands.getOptional("overagePricingBands")

        /**
         * UUID of the Plan the Pricing is created for.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun planId(): Optional<String> = planId.getOptional("planId")

        /**
         * UUID of the Plan Template the Pricing is created for.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun planTemplateId(): Optional<String> = planTemplateId.getOptional("planTemplateId")

        /**
         * Specifies the segment value which you are defining a Pricing for using this call:
         * - For each segment value defined on a Segmented Aggregation you must create a separate
         *   Pricing and use the appropriate `aggregationId` parameter for the call.
         * - If you specify a segment value that has not been defined for the Aggregation, you'll
         *   receive an error.
         * - If you've defined segment values for the Aggregation using a single wildcard or
         *   multiple wildcards, you can create Pricing for these wildcard segment values also.
         *
         * For more details on creating Pricings for segment values on a Segmented Aggregation using
         * this call, together with some examples, see the
         * [Using API Call to Create Segmented Pricings](https://www.m3ter.com/docs/guides/plans-and-pricing/pricing-plans/pricing-plans-using-segmented-aggregations#using-api-call-to-create-a-segmented-pricing)
         * in our User Documentation.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun segment(): Optional<Segment> = segment.getOptional("segment")

        /**
         * The default value is **FALSE**.
         * * If TRUE, usage accumulates over the entire period the priced Plan is active for the
         *   account, and is not reset for pricing band rates at the start of each billing period.
         * * If FALSE, usage does not accumulate, and is reset for pricing bands at the start of
         *   each billing period.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tiersSpanPlan(): Optional<Boolean> = tiersSpanPlan.getOptional("tiersSpanPlan")

        /**
         * * **DEBIT**. Default setting. The amount calculated using the Pricing is added to the
         *   bill as a debit.
         * * **PRODUCT_CREDIT**. The amount calculated using the Pricing is added to the bill as a
         *   credit *(negative amount)*. To prevent negative billing, the bill will be capped at the
         *   total of other line items for the same Product.
         * * **GLOBAL_CREDIT**. The amount calculated using the Pricing is added to the bill as a
         *   credit *(negative amount)*. To prevent negative billing, the bill will be capped at the
         *   total of other line items for the entire bill, which might include other Products the
         *   Account consumes.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - *do not use for
         *   Create*. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun version(): Optional<Long> = version.getOptional("version")

        /**
         * Returns the raw JSON value of [pricingBands].
         *
         * Unlike [pricingBands], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pricingBands")
        @ExcludeMissing
        fun _pricingBands(): JsonField<List<PricingBand>> = pricingBands

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("startDate")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

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
         * Returns the raw JSON value of [aggregationId].
         *
         * Unlike [aggregationId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("aggregationId")
        @ExcludeMissing
        fun _aggregationId(): JsonField<String> = aggregationId

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [compoundAggregationId].
         *
         * Unlike [compoundAggregationId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("compoundAggregationId")
        @ExcludeMissing
        fun _compoundAggregationId(): JsonField<String> = compoundAggregationId

        /**
         * Returns the raw JSON value of [cumulative].
         *
         * Unlike [cumulative], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cumulative")
        @ExcludeMissing
        fun _cumulative(): JsonField<Boolean> = cumulative

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

        /**
         * Returns the raw JSON value of [minimumSpend].
         *
         * Unlike [minimumSpend], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("minimumSpend")
        @ExcludeMissing
        fun _minimumSpend(): JsonField<Double> = minimumSpend

        /**
         * Returns the raw JSON value of [minimumSpendBillInAdvance].
         *
         * Unlike [minimumSpendBillInAdvance], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("minimumSpendBillInAdvance")
        @ExcludeMissing
        fun _minimumSpendBillInAdvance(): JsonField<Boolean> = minimumSpendBillInAdvance

        /**
         * Returns the raw JSON value of [minimumSpendDescription].
         *
         * Unlike [minimumSpendDescription], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("minimumSpendDescription")
        @ExcludeMissing
        fun _minimumSpendDescription(): JsonField<String> = minimumSpendDescription

        /**
         * Returns the raw JSON value of [overagePricingBands].
         *
         * Unlike [overagePricingBands], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("overagePricingBands")
        @ExcludeMissing
        fun _overagePricingBands(): JsonField<List<PricingBand>> = overagePricingBands

        /**
         * Returns the raw JSON value of [planId].
         *
         * Unlike [planId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("planId") @ExcludeMissing fun _planId(): JsonField<String> = planId

        /**
         * Returns the raw JSON value of [planTemplateId].
         *
         * Unlike [planTemplateId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("planTemplateId")
        @ExcludeMissing
        fun _planTemplateId(): JsonField<String> = planTemplateId

        /**
         * Returns the raw JSON value of [segment].
         *
         * Unlike [segment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("segment") @ExcludeMissing fun _segment(): JsonField<Segment> = segment

        /**
         * Returns the raw JSON value of [tiersSpanPlan].
         *
         * Unlike [tiersSpanPlan], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tiersSpanPlan")
        @ExcludeMissing
        fun _tiersSpanPlan(): JsonField<Boolean> = tiersSpanPlan

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * .pricingBands()
             * .startDate()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var pricingBands: JsonField<MutableList<PricingBand>>? = null
            private var startDate: JsonField<OffsetDateTime>? = null
            private var accountingProductId: JsonField<String> = JsonMissing.of()
            private var aggregationId: JsonField<String> = JsonMissing.of()
            private var code: JsonField<String> = JsonMissing.of()
            private var compoundAggregationId: JsonField<String> = JsonMissing.of()
            private var cumulative: JsonField<Boolean> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var minimumSpend: JsonField<Double> = JsonMissing.of()
            private var minimumSpendBillInAdvance: JsonField<Boolean> = JsonMissing.of()
            private var minimumSpendDescription: JsonField<String> = JsonMissing.of()
            private var overagePricingBands: JsonField<MutableList<PricingBand>>? = null
            private var planId: JsonField<String> = JsonMissing.of()
            private var planTemplateId: JsonField<String> = JsonMissing.of()
            private var segment: JsonField<Segment> = JsonMissing.of()
            private var tiersSpanPlan: JsonField<Boolean> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                pricingBands = body.pricingBands.map { it.toMutableList() }
                startDate = body.startDate
                accountingProductId = body.accountingProductId
                aggregationId = body.aggregationId
                code = body.code
                compoundAggregationId = body.compoundAggregationId
                cumulative = body.cumulative
                description = body.description
                endDate = body.endDate
                minimumSpend = body.minimumSpend
                minimumSpendBillInAdvance = body.minimumSpendBillInAdvance
                minimumSpendDescription = body.minimumSpendDescription
                overagePricingBands = body.overagePricingBands.map { it.toMutableList() }
                planId = body.planId
                planTemplateId = body.planTemplateId
                segment = body.segment
                tiersSpanPlan = body.tiersSpanPlan
                type = body.type
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun pricingBands(pricingBands: List<PricingBand>) =
                pricingBands(JsonField.of(pricingBands))

            /**
             * Sets [Builder.pricingBands] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pricingBands] with a well-typed `List<PricingBand>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun pricingBands(pricingBands: JsonField<List<PricingBand>>) = apply {
                this.pricingBands = pricingBands.map { it.toMutableList() }
            }

            /**
             * Adds a single [PricingBand] to [pricingBands].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPricingBand(pricingBand: PricingBand) = apply {
                pricingBands =
                    (pricingBands ?: JsonField.of(mutableListOf())).also {
                        checkKnown("pricingBands", it).add(pricingBand)
                    }
            }

            /**
             * The start date *(in ISO-8601 format)* for when the Pricing starts to be active for
             * the Plan of Plan Template.*(Required)*
             */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
            }

            /** Optional Product ID this Pricing should be attributed to for accounting purposes */
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

            /**
             * UUID of the Aggregation used to create the Pricing. Use this when creating a Pricing
             * for a segmented aggregation.
             */
            fun aggregationId(aggregationId: String) = aggregationId(JsonField.of(aggregationId))

            /**
             * Sets [Builder.aggregationId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aggregationId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun aggregationId(aggregationId: JsonField<String>) = apply {
                this.aggregationId = aggregationId
            }

            /** Unique short code for the Pricing. */
            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /** UUID of the Compound Aggregation used to create the Pricing. */
            fun compoundAggregationId(compoundAggregationId: String) =
                compoundAggregationId(JsonField.of(compoundAggregationId))

            /**
             * Sets [Builder.compoundAggregationId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.compoundAggregationId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun compoundAggregationId(compoundAggregationId: JsonField<String>) = apply {
                this.compoundAggregationId = compoundAggregationId
            }

            /**
             * Controls whether or not charge rates under a set of pricing bands configured for a
             * Pricing are applied according to each separate band or at the highest band reached.
             *
             * *(Optional)*. The default value is **FALSE**.
             * * When TRUE, at billing charge rates are applied according to each separate band.
             * * When FALSE, at billing charge rates are applied according to highest band reached.
             *
             * **NOTE:** Use the `cumulative` parameter to create the type of Pricing you require.
             * For example, for Tiered Pricing set to **TRUE**; for Volume Pricing, set to
             * **FALSE**.
             */
            fun cumulative(cumulative: Boolean) = cumulative(JsonField.of(cumulative))

            /**
             * Sets [Builder.cumulative] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cumulative] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cumulative(cumulative: JsonField<Boolean>) = apply { this.cumulative = cumulative }

            /** Displayed on Bill line items. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * The end date *(in ISO-8601 format)* for when the Pricing ceases to be active for the
             * Plan or Plan Template.
             *
             * *(Optional)* If not specified, the Pricing remains active indefinitely.
             */
            fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /**
             * The minimum spend amount per billing cycle for end customer Accounts on a Plan to
             * which the Pricing is applied.
             */
            fun minimumSpend(minimumSpend: Double) = minimumSpend(JsonField.of(minimumSpend))

            /**
             * Sets [Builder.minimumSpend] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimumSpend] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minimumSpend(minimumSpend: JsonField<Double>) = apply {
                this.minimumSpend = minimumSpend
            }

            /**
             * The default value is **FALSE**.
             * * When TRUE, minimum spend is billed at the start of each billing period.
             * * When FALSE, minimum spend is billed at the end of each billing period.
             *
             * *(Optional)*. Overrides the setting at Organization level for minimum spend billing
             * in arrears/in advance.
             */
            fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: Boolean) =
                minimumSpendBillInAdvance(JsonField.of(minimumSpendBillInAdvance))

            /**
             * Sets [Builder.minimumSpendBillInAdvance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimumSpendBillInAdvance] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: JsonField<Boolean>) = apply {
                this.minimumSpendBillInAdvance = minimumSpendBillInAdvance
            }

            /** Minimum spend description *(displayed on the bill line item)*. */
            fun minimumSpendDescription(minimumSpendDescription: String) =
                minimumSpendDescription(JsonField.of(minimumSpendDescription))

            /**
             * Sets [Builder.minimumSpendDescription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimumSpendDescription] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun minimumSpendDescription(minimumSpendDescription: JsonField<String>) = apply {
                this.minimumSpendDescription = minimumSpendDescription
            }

            /**
             * Specify Prepayment/Balance overage pricing in pricing bands for the case of a
             * **Tiered** pricing structure.
             */
            fun overagePricingBands(overagePricingBands: List<PricingBand>) =
                overagePricingBands(JsonField.of(overagePricingBands))

            /**
             * Sets [Builder.overagePricingBands] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overagePricingBands] with a well-typed
             * `List<PricingBand>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun overagePricingBands(overagePricingBands: JsonField<List<PricingBand>>) = apply {
                this.overagePricingBands = overagePricingBands.map { it.toMutableList() }
            }

            /**
             * Adds a single [PricingBand] to [overagePricingBands].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOveragePricingBand(overagePricingBand: PricingBand) = apply {
                overagePricingBands =
                    (overagePricingBands ?: JsonField.of(mutableListOf())).also {
                        checkKnown("overagePricingBands", it).add(overagePricingBand)
                    }
            }

            /** UUID of the Plan the Pricing is created for. */
            fun planId(planId: String) = planId(JsonField.of(planId))

            /**
             * Sets [Builder.planId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planId(planId: JsonField<String>) = apply { this.planId = planId }

            /** UUID of the Plan Template the Pricing is created for. */
            fun planTemplateId(planTemplateId: String) =
                planTemplateId(JsonField.of(planTemplateId))

            /**
             * Sets [Builder.planTemplateId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planTemplateId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planTemplateId(planTemplateId: JsonField<String>) = apply {
                this.planTemplateId = planTemplateId
            }

            /**
             * Specifies the segment value which you are defining a Pricing for using this call:
             * - For each segment value defined on a Segmented Aggregation you must create a
             *   separate Pricing and use the appropriate `aggregationId` parameter for the call.
             * - If you specify a segment value that has not been defined for the Aggregation,
             *   you'll receive an error.
             * - If you've defined segment values for the Aggregation using a single wildcard or
             *   multiple wildcards, you can create Pricing for these wildcard segment values also.
             *
             * For more details on creating Pricings for segment values on a Segmented Aggregation
             * using this call, together with some examples, see the
             * [Using API Call to Create Segmented Pricings](https://www.m3ter.com/docs/guides/plans-and-pricing/pricing-plans/pricing-plans-using-segmented-aggregations#using-api-call-to-create-a-segmented-pricing)
             * in our User Documentation.
             */
            fun segment(segment: Segment) = segment(JsonField.of(segment))

            /**
             * Sets [Builder.segment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.segment] with a well-typed [Segment] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun segment(segment: JsonField<Segment>) = apply { this.segment = segment }

            /**
             * The default value is **FALSE**.
             * * If TRUE, usage accumulates over the entire period the priced Plan is active for the
             *   account, and is not reset for pricing band rates at the start of each billing
             *   period.
             * * If FALSE, usage does not accumulate, and is reset for pricing bands at the start of
             *   each billing period.
             */
            fun tiersSpanPlan(tiersSpanPlan: Boolean) = tiersSpanPlan(JsonField.of(tiersSpanPlan))

            /**
             * Sets [Builder.tiersSpanPlan] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tiersSpanPlan] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tiersSpanPlan(tiersSpanPlan: JsonField<Boolean>) = apply {
                this.tiersSpanPlan = tiersSpanPlan
            }

            /**
             * * **DEBIT**. Default setting. The amount calculated using the Pricing is added to the
             *   bill as a debit.
             * * **PRODUCT_CREDIT**. The amount calculated using the Pricing is added to the bill as
             *   a credit *(negative amount)*. To prevent negative billing, the bill will be capped
             *   at the total of other line items for the same Product.
             * * **GLOBAL_CREDIT**. The amount calculated using the Pricing is added to the bill as
             *   a credit *(negative amount)*. To prevent negative billing, the bill will be capped
             *   at the total of other line items for the entire bill, which might include other
             *   Products the Account consumes.
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /**
             * The version number of the entity:
             * - **Create entity:** Not valid for initial insertion of new entity - *do not use for
             *   Create*. On initial Create, version is set at 1 and listed in the response.
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
             * .pricingBands()
             * .startDate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("pricingBands", pricingBands).map { it.toImmutable() },
                    checkRequired("startDate", startDate),
                    accountingProductId,
                    aggregationId,
                    code,
                    compoundAggregationId,
                    cumulative,
                    description,
                    endDate,
                    minimumSpend,
                    minimumSpendBillInAdvance,
                    minimumSpendDescription,
                    (overagePricingBands ?: JsonMissing.of()).map { it.toImmutable() },
                    planId,
                    planTemplateId,
                    segment,
                    tiersSpanPlan,
                    type,
                    version,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            pricingBands().forEach { it.validate() }
            startDate()
            accountingProductId()
            aggregationId()
            code()
            compoundAggregationId()
            cumulative()
            description()
            endDate()
            minimumSpend()
            minimumSpendBillInAdvance()
            minimumSpendDescription()
            overagePricingBands().ifPresent { it.forEach { it.validate() } }
            planId()
            planTemplateId()
            segment().ifPresent { it.validate() }
            tiersSpanPlan()
            type().ifPresent { it.validate() }
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
            (pricingBands.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (startDate.asKnown().isPresent) 1 else 0) +
                (if (accountingProductId.asKnown().isPresent) 1 else 0) +
                (if (aggregationId.asKnown().isPresent) 1 else 0) +
                (if (code.asKnown().isPresent) 1 else 0) +
                (if (compoundAggregationId.asKnown().isPresent) 1 else 0) +
                (if (cumulative.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (endDate.asKnown().isPresent) 1 else 0) +
                (if (minimumSpend.asKnown().isPresent) 1 else 0) +
                (if (minimumSpendBillInAdvance.asKnown().isPresent) 1 else 0) +
                (if (minimumSpendDescription.asKnown().isPresent) 1 else 0) +
                (overagePricingBands.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (planId.asKnown().isPresent) 1 else 0) +
                (if (planTemplateId.asKnown().isPresent) 1 else 0) +
                (segment.asKnown().getOrNull()?.validity() ?: 0) +
                (if (tiersSpanPlan.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                pricingBands == other.pricingBands &&
                startDate == other.startDate &&
                accountingProductId == other.accountingProductId &&
                aggregationId == other.aggregationId &&
                code == other.code &&
                compoundAggregationId == other.compoundAggregationId &&
                cumulative == other.cumulative &&
                description == other.description &&
                endDate == other.endDate &&
                minimumSpend == other.minimumSpend &&
                minimumSpendBillInAdvance == other.minimumSpendBillInAdvance &&
                minimumSpendDescription == other.minimumSpendDescription &&
                overagePricingBands == other.overagePricingBands &&
                planId == other.planId &&
                planTemplateId == other.planTemplateId &&
                segment == other.segment &&
                tiersSpanPlan == other.tiersSpanPlan &&
                type == other.type &&
                version == other.version &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                pricingBands,
                startDate,
                accountingProductId,
                aggregationId,
                code,
                compoundAggregationId,
                cumulative,
                description,
                endDate,
                minimumSpend,
                minimumSpendBillInAdvance,
                minimumSpendDescription,
                overagePricingBands,
                planId,
                planTemplateId,
                segment,
                tiersSpanPlan,
                type,
                version,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{pricingBands=$pricingBands, startDate=$startDate, accountingProductId=$accountingProductId, aggregationId=$aggregationId, code=$code, compoundAggregationId=$compoundAggregationId, cumulative=$cumulative, description=$description, endDate=$endDate, minimumSpend=$minimumSpend, minimumSpendBillInAdvance=$minimumSpendBillInAdvance, minimumSpendDescription=$minimumSpendDescription, overagePricingBands=$overagePricingBands, planId=$planId, planTemplateId=$planTemplateId, segment=$segment, tiersSpanPlan=$tiersSpanPlan, type=$type, version=$version, additionalProperties=$additionalProperties}"
    }

    /**
     * Specifies the segment value which you are defining a Pricing for using this call:
     * - For each segment value defined on a Segmented Aggregation you must create a separate
     *   Pricing and use the appropriate `aggregationId` parameter for the call.
     * - If you specify a segment value that has not been defined for the Aggregation, you'll
     *   receive an error.
     * - If you've defined segment values for the Aggregation using a single wildcard or multiple
     *   wildcards, you can create Pricing for these wildcard segment values also.
     *
     * For more details on creating Pricings for segment values on a Segmented Aggregation using
     * this call, together with some examples, see the
     * [Using API Call to Create Segmented Pricings](https://www.m3ter.com/docs/guides/plans-and-pricing/pricing-plans/pricing-plans-using-segmented-aggregations#using-api-call-to-create-a-segmented-pricing)
     * in our User Documentation.
     */
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

            return other is Segment && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Segment{additionalProperties=$additionalProperties}"
    }

    /**
     * * **DEBIT**. Default setting. The amount calculated using the Pricing is added to the bill as
     *   a debit.
     * * **PRODUCT_CREDIT**. The amount calculated using the Pricing is added to the bill as a
     *   credit *(negative amount)*. To prevent negative billing, the bill will be capped at the
     *   total of other line items for the same Product.
     * * **GLOBAL_CREDIT**. The amount calculated using the Pricing is added to the bill as a credit
     *   *(negative amount)*. To prevent negative billing, the bill will be capped at the total of
     *   other line items for the entire bill, which might include other Products the Account
     *   consumes.
     */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DEBIT = of("DEBIT")

            @JvmField val PRODUCT_CREDIT = of("PRODUCT_CREDIT")

            @JvmField val GLOBAL_CREDIT = of("GLOBAL_CREDIT")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            DEBIT,
            PRODUCT_CREDIT,
            GLOBAL_CREDIT,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DEBIT,
            PRODUCT_CREDIT,
            GLOBAL_CREDIT,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                DEBIT -> Value.DEBIT
                PRODUCT_CREDIT -> Value.PRODUCT_CREDIT
                GLOBAL_CREDIT -> Value.GLOBAL_CREDIT
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
                DEBIT -> Known.DEBIT
                PRODUCT_CREDIT -> Known.PRODUCT_CREDIT
                GLOBAL_CREDIT -> Known.GLOBAL_CREDIT
                else -> throw M3terInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PricingCreateParams &&
            orgId == other.orgId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(orgId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PricingCreateParams{orgId=$orgId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
