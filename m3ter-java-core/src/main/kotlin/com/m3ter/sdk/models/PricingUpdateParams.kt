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
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkKnown
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Update Pricing for the given UUID.
 *
 * **Note:** Either `planId` or `planTemplateId` request parameters are required for this call to be
 * valid. If you omit both, then you will receive a validation error.
 */
class PricingUpdateParams
private constructor(
    private val orgId: String,
    private val id: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    fun id(): String = id

    fun pricingBands(): List<PricingBand> = body.pricingBands()

    /**
     * The start date _(in ISO-8601 format)_ for when the Pricing starts to be active for the Plan
     * of Plan Template._(Required)_
     */
    fun startDate(): OffsetDateTime = body.startDate()

    /** Optional Product ID this Pricing should be attributed to for accounting purposes */
    fun accountingProductId(): Optional<String> = body.accountingProductId()

    /**
     * UUID of the Aggregation used to create the Pricing. Use this when creating a Pricing for a
     * segmented aggregation.
     */
    fun aggregationId(): Optional<String> = body.aggregationId()

    /** Unique short code for the Pricing. */
    fun code(): Optional<String> = body.code()

    /** UUID of the Compound Aggregation used to create the Pricing. */
    fun compoundAggregationId(): Optional<String> = body.compoundAggregationId()

    /**
     * Controls whether or not charge rates under a set of pricing bands configured for a Pricing
     * are applied according to each separate band or at the highest band reached.
     *
     * _(Optional)_. The default value is **FALSE**.
     * - When TRUE, at billing charge rates are applied according to each separate band.
     * - When FALSE, at billing charge rates are applied according to highest band reached.
     *
     * **NOTE:** Use the `cumulative` parameter to create the type of Pricing you require. For
     * example, for Tiered Pricing set to **TRUE**; for Volume Pricing, set to **FALSE**.
     */
    fun cumulative(): Optional<Boolean> = body.cumulative()

    /** Displayed on Bill line items. */
    fun description(): Optional<String> = body.description()

    /**
     * The end date _(in ISO-8601 format)_ for when the Pricing ceases to be active for the Plan or
     * Plan Template.
     *
     * _(Optional)_ If not specified, the Pricing remains active indefinitely.
     */
    fun endDate(): Optional<OffsetDateTime> = body.endDate()

    /**
     * The minimum spend amount per billing cycle for end customer Accounts on a Plan to which the
     * Pricing is applied.
     */
    fun minimumSpend(): Optional<Double> = body.minimumSpend()

    /**
     * The default value is **FALSE**.
     * - When TRUE, minimum spend is billed at the start of each billing period.
     * - When FALSE, minimum spend is billed at the end of each billing period.
     *
     * _(Optional)_. Overrides the setting at Organization level for minimum spend billing in
     * arrears/in advance.
     */
    fun minimumSpendBillInAdvance(): Optional<Boolean> = body.minimumSpendBillInAdvance()

    /** Minimum spend description _(displayed on the bill line item)_. */
    fun minimumSpendDescription(): Optional<String> = body.minimumSpendDescription()

    /**
     * Specify Prepayment/Balance overage pricing in pricing bands for the case of a **Tiered**
     * pricing structure.
     */
    fun overagePricingBands(): Optional<List<PricingBand>> = body.overagePricingBands()

    /** UUID of the Plan the Pricing is created for. */
    fun planId(): Optional<String> = body.planId()

    /** UUID of the Plan Template the Pricing is created for. */
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
     */
    fun segment(): Optional<Segment> = body.segment()

    /**
     * The default value is **FALSE**.
     * - If TRUE, usage accumulates over the entire period the priced Plan is active for the
     *   account, and is not reset for pricing band rates at the start of each billing period.
     * - If FALSE, usage does not accumulate, and is reset for pricing bands at the start of each
     *   billing period.
     */
    fun tiersSpanPlan(): Optional<Boolean> = body.tiersSpanPlan()

    /**
     * - **DEBIT**. Default setting. The amount calculated using the Pricing is added to the bill as
     *   a debit.
     * - **PRODUCT_CREDIT**. The amount calculated using the Pricing is added to the bill as a
     *   credit _(negative amount)_. To prevent negative billing, the bill will be capped at the
     *   total of other line items for the same Product.
     * - **GLOBAL_CREDIT**. The amount calculated using the Pricing is added to the bill as a credit
     *   _(negative amount)_. To prevent negative billing, the bill will be capped at the total of
     *   other line items for the entire bill, which might include other Products the Account
     *   consumes.
     */
    fun type(): Optional<Type> = body.type()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     */
    fun version(): Optional<Long> = body.version()

    fun _pricingBands(): JsonField<List<PricingBand>> = body._pricingBands()

    /**
     * The start date _(in ISO-8601 format)_ for when the Pricing starts to be active for the Plan
     * of Plan Template._(Required)_
     */
    fun _startDate(): JsonField<OffsetDateTime> = body._startDate()

    /** Optional Product ID this Pricing should be attributed to for accounting purposes */
    fun _accountingProductId(): JsonField<String> = body._accountingProductId()

    /**
     * UUID of the Aggregation used to create the Pricing. Use this when creating a Pricing for a
     * segmented aggregation.
     */
    fun _aggregationId(): JsonField<String> = body._aggregationId()

    /** Unique short code for the Pricing. */
    fun _code(): JsonField<String> = body._code()

    /** UUID of the Compound Aggregation used to create the Pricing. */
    fun _compoundAggregationId(): JsonField<String> = body._compoundAggregationId()

    /**
     * Controls whether or not charge rates under a set of pricing bands configured for a Pricing
     * are applied according to each separate band or at the highest band reached.
     *
     * _(Optional)_. The default value is **FALSE**.
     * - When TRUE, at billing charge rates are applied according to each separate band.
     * - When FALSE, at billing charge rates are applied according to highest band reached.
     *
     * **NOTE:** Use the `cumulative` parameter to create the type of Pricing you require. For
     * example, for Tiered Pricing set to **TRUE**; for Volume Pricing, set to **FALSE**.
     */
    fun _cumulative(): JsonField<Boolean> = body._cumulative()

    /** Displayed on Bill line items. */
    fun _description(): JsonField<String> = body._description()

    /**
     * The end date _(in ISO-8601 format)_ for when the Pricing ceases to be active for the Plan or
     * Plan Template.
     *
     * _(Optional)_ If not specified, the Pricing remains active indefinitely.
     */
    fun _endDate(): JsonField<OffsetDateTime> = body._endDate()

    /**
     * The minimum spend amount per billing cycle for end customer Accounts on a Plan to which the
     * Pricing is applied.
     */
    fun _minimumSpend(): JsonField<Double> = body._minimumSpend()

    /**
     * The default value is **FALSE**.
     * - When TRUE, minimum spend is billed at the start of each billing period.
     * - When FALSE, minimum spend is billed at the end of each billing period.
     *
     * _(Optional)_. Overrides the setting at Organization level for minimum spend billing in
     * arrears/in advance.
     */
    fun _minimumSpendBillInAdvance(): JsonField<Boolean> = body._minimumSpendBillInAdvance()

    /** Minimum spend description _(displayed on the bill line item)_. */
    fun _minimumSpendDescription(): JsonField<String> = body._minimumSpendDescription()

    /**
     * Specify Prepayment/Balance overage pricing in pricing bands for the case of a **Tiered**
     * pricing structure.
     */
    fun _overagePricingBands(): JsonField<List<PricingBand>> = body._overagePricingBands()

    /** UUID of the Plan the Pricing is created for. */
    fun _planId(): JsonField<String> = body._planId()

    /** UUID of the Plan Template the Pricing is created for. */
    fun _planTemplateId(): JsonField<String> = body._planTemplateId()

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
    fun _segment(): JsonField<Segment> = body._segment()

    /**
     * The default value is **FALSE**.
     * - If TRUE, usage accumulates over the entire period the priced Plan is active for the
     *   account, and is not reset for pricing band rates at the start of each billing period.
     * - If FALSE, usage does not accumulate, and is reset for pricing bands at the start of each
     *   billing period.
     */
    fun _tiersSpanPlan(): JsonField<Boolean> = body._tiersSpanPlan()

    /**
     * - **DEBIT**. Default setting. The amount calculated using the Pricing is added to the bill as
     *   a debit.
     * - **PRODUCT_CREDIT**. The amount calculated using the Pricing is added to the bill as a
     *   credit _(negative amount)_. To prevent negative billing, the bill will be capped at the
     *   total of other line items for the same Product.
     * - **GLOBAL_CREDIT**. The amount calculated using the Pricing is added to the bill as a credit
     *   _(negative amount)_. To prevent negative billing, the bill will be capped at the total of
     *   other line items for the entire bill, which might include other Products the Account
     *   consumes.
     */
    fun _type(): JsonField<Type> = body._type()

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

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> orgId
            1 -> id
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("pricingBands")
        @ExcludeMissing
        private val pricingBands: JsonField<List<PricingBand>> = JsonMissing.of(),
        @JsonProperty("startDate")
        @ExcludeMissing
        private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("accountingProductId")
        @ExcludeMissing
        private val accountingProductId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("aggregationId")
        @ExcludeMissing
        private val aggregationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("code")
        @ExcludeMissing
        private val code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("compoundAggregationId")
        @ExcludeMissing
        private val compoundAggregationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cumulative")
        @ExcludeMissing
        private val cumulative: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("endDate")
        @ExcludeMissing
        private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("minimumSpend")
        @ExcludeMissing
        private val minimumSpend: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("minimumSpendBillInAdvance")
        @ExcludeMissing
        private val minimumSpendBillInAdvance: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("minimumSpendDescription")
        @ExcludeMissing
        private val minimumSpendDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("overagePricingBands")
        @ExcludeMissing
        private val overagePricingBands: JsonField<List<PricingBand>> = JsonMissing.of(),
        @JsonProperty("planId")
        @ExcludeMissing
        private val planId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("planTemplateId")
        @ExcludeMissing
        private val planTemplateId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("segment")
        @ExcludeMissing
        private val segment: JsonField<Segment> = JsonMissing.of(),
        @JsonProperty("tiersSpanPlan")
        @ExcludeMissing
        private val tiersSpanPlan: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("version")
        @ExcludeMissing
        private val version: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun pricingBands(): List<PricingBand> = pricingBands.getRequired("pricingBands")

        /**
         * The start date _(in ISO-8601 format)_ for when the Pricing starts to be active for the
         * Plan of Plan Template._(Required)_
         */
        fun startDate(): OffsetDateTime = startDate.getRequired("startDate")

        /** Optional Product ID this Pricing should be attributed to for accounting purposes */
        fun accountingProductId(): Optional<String> =
            Optional.ofNullable(accountingProductId.getNullable("accountingProductId"))

        /**
         * UUID of the Aggregation used to create the Pricing. Use this when creating a Pricing for
         * a segmented aggregation.
         */
        fun aggregationId(): Optional<String> =
            Optional.ofNullable(aggregationId.getNullable("aggregationId"))

        /** Unique short code for the Pricing. */
        fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

        /** UUID of the Compound Aggregation used to create the Pricing. */
        fun compoundAggregationId(): Optional<String> =
            Optional.ofNullable(compoundAggregationId.getNullable("compoundAggregationId"))

        /**
         * Controls whether or not charge rates under a set of pricing bands configured for a
         * Pricing are applied according to each separate band or at the highest band reached.
         *
         * _(Optional)_. The default value is **FALSE**.
         * - When TRUE, at billing charge rates are applied according to each separate band.
         * - When FALSE, at billing charge rates are applied according to highest band reached.
         *
         * **NOTE:** Use the `cumulative` parameter to create the type of Pricing you require. For
         * example, for Tiered Pricing set to **TRUE**; for Volume Pricing, set to **FALSE**.
         */
        fun cumulative(): Optional<Boolean> =
            Optional.ofNullable(cumulative.getNullable("cumulative"))

        /** Displayed on Bill line items. */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * The end date _(in ISO-8601 format)_ for when the Pricing ceases to be active for the Plan
         * or Plan Template.
         *
         * _(Optional)_ If not specified, the Pricing remains active indefinitely.
         */
        fun endDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(endDate.getNullable("endDate"))

        /**
         * The minimum spend amount per billing cycle for end customer Accounts on a Plan to which
         * the Pricing is applied.
         */
        fun minimumSpend(): Optional<Double> =
            Optional.ofNullable(minimumSpend.getNullable("minimumSpend"))

        /**
         * The default value is **FALSE**.
         * - When TRUE, minimum spend is billed at the start of each billing period.
         * - When FALSE, minimum spend is billed at the end of each billing period.
         *
         * _(Optional)_. Overrides the setting at Organization level for minimum spend billing in
         * arrears/in advance.
         */
        fun minimumSpendBillInAdvance(): Optional<Boolean> =
            Optional.ofNullable(minimumSpendBillInAdvance.getNullable("minimumSpendBillInAdvance"))

        /** Minimum spend description _(displayed on the bill line item)_. */
        fun minimumSpendDescription(): Optional<String> =
            Optional.ofNullable(minimumSpendDescription.getNullable("minimumSpendDescription"))

        /**
         * Specify Prepayment/Balance overage pricing in pricing bands for the case of a **Tiered**
         * pricing structure.
         */
        fun overagePricingBands(): Optional<List<PricingBand>> =
            Optional.ofNullable(overagePricingBands.getNullable("overagePricingBands"))

        /** UUID of the Plan the Pricing is created for. */
        fun planId(): Optional<String> = Optional.ofNullable(planId.getNullable("planId"))

        /** UUID of the Plan Template the Pricing is created for. */
        fun planTemplateId(): Optional<String> =
            Optional.ofNullable(planTemplateId.getNullable("planTemplateId"))

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
        fun segment(): Optional<Segment> = Optional.ofNullable(segment.getNullable("segment"))

        /**
         * The default value is **FALSE**.
         * - If TRUE, usage accumulates over the entire period the priced Plan is active for the
         *   account, and is not reset for pricing band rates at the start of each billing period.
         * - If FALSE, usage does not accumulate, and is reset for pricing bands at the start of
         *   each billing period.
         */
        fun tiersSpanPlan(): Optional<Boolean> =
            Optional.ofNullable(tiersSpanPlan.getNullable("tiersSpanPlan"))

        /**
         * - **DEBIT**. Default setting. The amount calculated using the Pricing is added to the
         *   bill as a debit.
         * - **PRODUCT_CREDIT**. The amount calculated using the Pricing is added to the bill as a
         *   credit _(negative amount)_. To prevent negative billing, the bill will be capped at the
         *   total of other line items for the same Product.
         * - **GLOBAL_CREDIT**. The amount calculated using the Pricing is added to the bill as a
         *   credit _(negative amount)_. To prevent negative billing, the bill will be capped at the
         *   total of other line items for the entire bill, which might include other Products the
         *   Account consumes.
         */
        fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

        @JsonProperty("pricingBands")
        @ExcludeMissing
        fun _pricingBands(): JsonField<List<PricingBand>> = pricingBands

        /**
         * The start date _(in ISO-8601 format)_ for when the Pricing starts to be active for the
         * Plan of Plan Template._(Required)_
         */
        @JsonProperty("startDate")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

        /** Optional Product ID this Pricing should be attributed to for accounting purposes */
        @JsonProperty("accountingProductId")
        @ExcludeMissing
        fun _accountingProductId(): JsonField<String> = accountingProductId

        /**
         * UUID of the Aggregation used to create the Pricing. Use this when creating a Pricing for
         * a segmented aggregation.
         */
        @JsonProperty("aggregationId")
        @ExcludeMissing
        fun _aggregationId(): JsonField<String> = aggregationId

        /** Unique short code for the Pricing. */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /** UUID of the Compound Aggregation used to create the Pricing. */
        @JsonProperty("compoundAggregationId")
        @ExcludeMissing
        fun _compoundAggregationId(): JsonField<String> = compoundAggregationId

        /**
         * Controls whether or not charge rates under a set of pricing bands configured for a
         * Pricing are applied according to each separate band or at the highest band reached.
         *
         * _(Optional)_. The default value is **FALSE**.
         * - When TRUE, at billing charge rates are applied according to each separate band.
         * - When FALSE, at billing charge rates are applied according to highest band reached.
         *
         * **NOTE:** Use the `cumulative` parameter to create the type of Pricing you require. For
         * example, for Tiered Pricing set to **TRUE**; for Volume Pricing, set to **FALSE**.
         */
        @JsonProperty("cumulative")
        @ExcludeMissing
        fun _cumulative(): JsonField<Boolean> = cumulative

        /** Displayed on Bill line items. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * The end date _(in ISO-8601 format)_ for when the Pricing ceases to be active for the Plan
         * or Plan Template.
         *
         * _(Optional)_ If not specified, the Pricing remains active indefinitely.
         */
        @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

        /**
         * The minimum spend amount per billing cycle for end customer Accounts on a Plan to which
         * the Pricing is applied.
         */
        @JsonProperty("minimumSpend")
        @ExcludeMissing
        fun _minimumSpend(): JsonField<Double> = minimumSpend

        /**
         * The default value is **FALSE**.
         * - When TRUE, minimum spend is billed at the start of each billing period.
         * - When FALSE, minimum spend is billed at the end of each billing period.
         *
         * _(Optional)_. Overrides the setting at Organization level for minimum spend billing in
         * arrears/in advance.
         */
        @JsonProperty("minimumSpendBillInAdvance")
        @ExcludeMissing
        fun _minimumSpendBillInAdvance(): JsonField<Boolean> = minimumSpendBillInAdvance

        /** Minimum spend description _(displayed on the bill line item)_. */
        @JsonProperty("minimumSpendDescription")
        @ExcludeMissing
        fun _minimumSpendDescription(): JsonField<String> = minimumSpendDescription

        /**
         * Specify Prepayment/Balance overage pricing in pricing bands for the case of a **Tiered**
         * pricing structure.
         */
        @JsonProperty("overagePricingBands")
        @ExcludeMissing
        fun _overagePricingBands(): JsonField<List<PricingBand>> = overagePricingBands

        /** UUID of the Plan the Pricing is created for. */
        @JsonProperty("planId") @ExcludeMissing fun _planId(): JsonField<String> = planId

        /** UUID of the Plan Template the Pricing is created for. */
        @JsonProperty("planTemplateId")
        @ExcludeMissing
        fun _planTemplateId(): JsonField<String> = planTemplateId

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
        @JsonProperty("segment") @ExcludeMissing fun _segment(): JsonField<Segment> = segment

        /**
         * The default value is **FALSE**.
         * - If TRUE, usage accumulates over the entire period the priced Plan is active for the
         *   account, and is not reset for pricing band rates at the start of each billing period.
         * - If FALSE, usage does not accumulate, and is reset for pricing bands at the start of
         *   each billing period.
         */
        @JsonProperty("tiersSpanPlan")
        @ExcludeMissing
        fun _tiersSpanPlan(): JsonField<Boolean> = tiersSpanPlan

        /**
         * - **DEBIT**. Default setting. The amount calculated using the Pricing is added to the
         *   bill as a debit.
         * - **PRODUCT_CREDIT**. The amount calculated using the Pricing is added to the bill as a
         *   credit _(negative amount)_. To prevent negative billing, the bill will be capped at the
         *   total of other line items for the same Product.
         * - **GLOBAL_CREDIT**. The amount calculated using the Pricing is added to the bill as a
         *   credit _(negative amount)_. To prevent negative billing, the bill will be capped at the
         *   total of other line items for the entire bill, which might include other Products the
         *   Account consumes.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
            type()
            version()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun pricingBands(pricingBands: JsonField<List<PricingBand>>) = apply {
                this.pricingBands = pricingBands.map { it.toMutableList() }
            }

            fun addPricingBand(pricingBand: PricingBand) = apply {
                pricingBands =
                    (pricingBands ?: JsonField.of(mutableListOf())).also {
                        checkKnown("pricingBands", it).add(pricingBand)
                    }
            }

            /**
             * The start date _(in ISO-8601 format)_ for when the Pricing starts to be active for
             * the Plan of Plan Template._(Required)_
             */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /**
             * The start date _(in ISO-8601 format)_ for when the Pricing starts to be active for
             * the Plan of Plan Template._(Required)_
             */
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
            }

            /** Optional Product ID this Pricing should be attributed to for accounting purposes */
            fun accountingProductId(accountingProductId: String) =
                accountingProductId(JsonField.of(accountingProductId))

            /** Optional Product ID this Pricing should be attributed to for accounting purposes */
            fun accountingProductId(accountingProductId: JsonField<String>) = apply {
                this.accountingProductId = accountingProductId
            }

            /**
             * UUID of the Aggregation used to create the Pricing. Use this when creating a Pricing
             * for a segmented aggregation.
             */
            fun aggregationId(aggregationId: String) = aggregationId(JsonField.of(aggregationId))

            /**
             * UUID of the Aggregation used to create the Pricing. Use this when creating a Pricing
             * for a segmented aggregation.
             */
            fun aggregationId(aggregationId: JsonField<String>) = apply {
                this.aggregationId = aggregationId
            }

            /** Unique short code for the Pricing. */
            fun code(code: String) = code(JsonField.of(code))

            /** Unique short code for the Pricing. */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /** UUID of the Compound Aggregation used to create the Pricing. */
            fun compoundAggregationId(compoundAggregationId: String) =
                compoundAggregationId(JsonField.of(compoundAggregationId))

            /** UUID of the Compound Aggregation used to create the Pricing. */
            fun compoundAggregationId(compoundAggregationId: JsonField<String>) = apply {
                this.compoundAggregationId = compoundAggregationId
            }

            /**
             * Controls whether or not charge rates under a set of pricing bands configured for a
             * Pricing are applied according to each separate band or at the highest band reached.
             *
             * _(Optional)_. The default value is **FALSE**.
             * - When TRUE, at billing charge rates are applied according to each separate band.
             * - When FALSE, at billing charge rates are applied according to highest band reached.
             *
             * **NOTE:** Use the `cumulative` parameter to create the type of Pricing you require.
             * For example, for Tiered Pricing set to **TRUE**; for Volume Pricing, set to
             * **FALSE**.
             */
            fun cumulative(cumulative: Boolean) = cumulative(JsonField.of(cumulative))

            /**
             * Controls whether or not charge rates under a set of pricing bands configured for a
             * Pricing are applied according to each separate band or at the highest band reached.
             *
             * _(Optional)_. The default value is **FALSE**.
             * - When TRUE, at billing charge rates are applied according to each separate band.
             * - When FALSE, at billing charge rates are applied according to highest band reached.
             *
             * **NOTE:** Use the `cumulative` parameter to create the type of Pricing you require.
             * For example, for Tiered Pricing set to **TRUE**; for Volume Pricing, set to
             * **FALSE**.
             */
            fun cumulative(cumulative: JsonField<Boolean>) = apply { this.cumulative = cumulative }

            /** Displayed on Bill line items. */
            fun description(description: String) = description(JsonField.of(description))

            /** Displayed on Bill line items. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * The end date _(in ISO-8601 format)_ for when the Pricing ceases to be active for the
             * Plan or Plan Template.
             *
             * _(Optional)_ If not specified, the Pricing remains active indefinitely.
             */
            fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

            /**
             * The end date _(in ISO-8601 format)_ for when the Pricing ceases to be active for the
             * Plan or Plan Template.
             *
             * _(Optional)_ If not specified, the Pricing remains active indefinitely.
             */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /**
             * The minimum spend amount per billing cycle for end customer Accounts on a Plan to
             * which the Pricing is applied.
             */
            fun minimumSpend(minimumSpend: Double) = minimumSpend(JsonField.of(minimumSpend))

            /**
             * The minimum spend amount per billing cycle for end customer Accounts on a Plan to
             * which the Pricing is applied.
             */
            fun minimumSpend(minimumSpend: JsonField<Double>) = apply {
                this.minimumSpend = minimumSpend
            }

            /**
             * The default value is **FALSE**.
             * - When TRUE, minimum spend is billed at the start of each billing period.
             * - When FALSE, minimum spend is billed at the end of each billing period.
             *
             * _(Optional)_. Overrides the setting at Organization level for minimum spend billing
             * in arrears/in advance.
             */
            fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: Boolean) =
                minimumSpendBillInAdvance(JsonField.of(minimumSpendBillInAdvance))

            /**
             * The default value is **FALSE**.
             * - When TRUE, minimum spend is billed at the start of each billing period.
             * - When FALSE, minimum spend is billed at the end of each billing period.
             *
             * _(Optional)_. Overrides the setting at Organization level for minimum spend billing
             * in arrears/in advance.
             */
            fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: JsonField<Boolean>) = apply {
                this.minimumSpendBillInAdvance = minimumSpendBillInAdvance
            }

            /** Minimum spend description _(displayed on the bill line item)_. */
            fun minimumSpendDescription(minimumSpendDescription: String) =
                minimumSpendDescription(JsonField.of(minimumSpendDescription))

            /** Minimum spend description _(displayed on the bill line item)_. */
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
             * Specify Prepayment/Balance overage pricing in pricing bands for the case of a
             * **Tiered** pricing structure.
             */
            fun overagePricingBands(overagePricingBands: JsonField<List<PricingBand>>) = apply {
                this.overagePricingBands = overagePricingBands.map { it.toMutableList() }
            }

            /**
             * Specify Prepayment/Balance overage pricing in pricing bands for the case of a
             * **Tiered** pricing structure.
             */
            fun addOveragePricingBand(overagePricingBand: PricingBand) = apply {
                overagePricingBands =
                    (overagePricingBands ?: JsonField.of(mutableListOf())).also {
                        checkKnown("overagePricingBands", it).add(overagePricingBand)
                    }
            }

            /** UUID of the Plan the Pricing is created for. */
            fun planId(planId: String) = planId(JsonField.of(planId))

            /** UUID of the Plan the Pricing is created for. */
            fun planId(planId: JsonField<String>) = apply { this.planId = planId }

            /** UUID of the Plan Template the Pricing is created for. */
            fun planTemplateId(planTemplateId: String) =
                planTemplateId(JsonField.of(planTemplateId))

            /** UUID of the Plan Template the Pricing is created for. */
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
            fun segment(segment: JsonField<Segment>) = apply { this.segment = segment }

            /**
             * The default value is **FALSE**.
             * - If TRUE, usage accumulates over the entire period the priced Plan is active for the
             *   account, and is not reset for pricing band rates at the start of each billing
             *   period.
             * - If FALSE, usage does not accumulate, and is reset for pricing bands at the start of
             *   each billing period.
             */
            fun tiersSpanPlan(tiersSpanPlan: Boolean) = tiersSpanPlan(JsonField.of(tiersSpanPlan))

            /**
             * The default value is **FALSE**.
             * - If TRUE, usage accumulates over the entire period the priced Plan is active for the
             *   account, and is not reset for pricing band rates at the start of each billing
             *   period.
             * - If FALSE, usage does not accumulate, and is reset for pricing bands at the start of
             *   each billing period.
             */
            fun tiersSpanPlan(tiersSpanPlan: JsonField<Boolean>) = apply {
                this.tiersSpanPlan = tiersSpanPlan
            }

            /**
             * - **DEBIT**. Default setting. The amount calculated using the Pricing is added to the
             *   bill as a debit.
             * - **PRODUCT_CREDIT**. The amount calculated using the Pricing is added to the bill as
             *   a credit _(negative amount)_. To prevent negative billing, the bill will be capped
             *   at the total of other line items for the same Product.
             * - **GLOBAL_CREDIT**. The amount calculated using the Pricing is added to the bill as
             *   a credit _(negative amount)_. To prevent negative billing, the bill will be capped
             *   at the total of other line items for the entire bill, which might include other
             *   Products the Account consumes.
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * - **DEBIT**. Default setting. The amount calculated using the Pricing is added to the
             *   bill as a debit.
             * - **PRODUCT_CREDIT**. The amount calculated using the Pricing is added to the bill as
             *   a credit _(negative amount)_. To prevent negative billing, the bill will be capped
             *   at the total of other line items for the same Product.
             * - **GLOBAL_CREDIT**. The amount calculated using the Pricing is added to the bill as
             *   a credit _(negative amount)_. To prevent negative billing, the bill will be capped
             *   at the total of other line items for the entire bill, which might include other
             *   Products the Account consumes.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && pricingBands == other.pricingBands && startDate == other.startDate && accountingProductId == other.accountingProductId && aggregationId == other.aggregationId && code == other.code && compoundAggregationId == other.compoundAggregationId && cumulative == other.cumulative && description == other.description && endDate == other.endDate && minimumSpend == other.minimumSpend && minimumSpendBillInAdvance == other.minimumSpendBillInAdvance && minimumSpendDescription == other.minimumSpendDescription && overagePricingBands == other.overagePricingBands && planId == other.planId && planTemplateId == other.planTemplateId && segment == other.segment && tiersSpanPlan == other.tiersSpanPlan && type == other.type && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(pricingBands, startDate, accountingProductId, aggregationId, code, compoundAggregationId, cumulative, description, endDate, minimumSpend, minimumSpendBillInAdvance, minimumSpendDescription, overagePricingBands, planId, planTemplateId, segment, tiersSpanPlan, type, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{pricingBands=$pricingBands, startDate=$startDate, accountingProductId=$accountingProductId, aggregationId=$aggregationId, code=$code, compoundAggregationId=$compoundAggregationId, cumulative=$cumulative, description=$description, endDate=$endDate, minimumSpend=$minimumSpend, minimumSpendBillInAdvance=$minimumSpendBillInAdvance, minimumSpendDescription=$minimumSpendDescription, overagePricingBands=$overagePricingBands, planId=$planId, planTemplateId=$planTemplateId, segment=$segment, tiersSpanPlan=$tiersSpanPlan, type=$type, version=$version, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PricingUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(pricingUpdateParams: PricingUpdateParams) = apply {
            orgId = pricingUpdateParams.orgId
            id = pricingUpdateParams.id
            body = pricingUpdateParams.body.toBuilder()
            additionalHeaders = pricingUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = pricingUpdateParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        fun id(id: String) = apply { this.id = id }

        fun pricingBands(pricingBands: List<PricingBand>) = apply {
            body.pricingBands(pricingBands)
        }

        fun pricingBands(pricingBands: JsonField<List<PricingBand>>) = apply {
            body.pricingBands(pricingBands)
        }

        fun addPricingBand(pricingBand: PricingBand) = apply { body.addPricingBand(pricingBand) }

        /**
         * The start date _(in ISO-8601 format)_ for when the Pricing starts to be active for the
         * Plan of Plan Template._(Required)_
         */
        fun startDate(startDate: OffsetDateTime) = apply { body.startDate(startDate) }

        /**
         * The start date _(in ISO-8601 format)_ for when the Pricing starts to be active for the
         * Plan of Plan Template._(Required)_
         */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { body.startDate(startDate) }

        /** Optional Product ID this Pricing should be attributed to for accounting purposes */
        fun accountingProductId(accountingProductId: String) = apply {
            body.accountingProductId(accountingProductId)
        }

        /** Optional Product ID this Pricing should be attributed to for accounting purposes */
        fun accountingProductId(accountingProductId: JsonField<String>) = apply {
            body.accountingProductId(accountingProductId)
        }

        /**
         * UUID of the Aggregation used to create the Pricing. Use this when creating a Pricing for
         * a segmented aggregation.
         */
        fun aggregationId(aggregationId: String) = apply { body.aggregationId(aggregationId) }

        /**
         * UUID of the Aggregation used to create the Pricing. Use this when creating a Pricing for
         * a segmented aggregation.
         */
        fun aggregationId(aggregationId: JsonField<String>) = apply {
            body.aggregationId(aggregationId)
        }

        /** Unique short code for the Pricing. */
        fun code(code: String) = apply { body.code(code) }

        /** Unique short code for the Pricing. */
        fun code(code: JsonField<String>) = apply { body.code(code) }

        /** UUID of the Compound Aggregation used to create the Pricing. */
        fun compoundAggregationId(compoundAggregationId: String) = apply {
            body.compoundAggregationId(compoundAggregationId)
        }

        /** UUID of the Compound Aggregation used to create the Pricing. */
        fun compoundAggregationId(compoundAggregationId: JsonField<String>) = apply {
            body.compoundAggregationId(compoundAggregationId)
        }

        /**
         * Controls whether or not charge rates under a set of pricing bands configured for a
         * Pricing are applied according to each separate band or at the highest band reached.
         *
         * _(Optional)_. The default value is **FALSE**.
         * - When TRUE, at billing charge rates are applied according to each separate band.
         * - When FALSE, at billing charge rates are applied according to highest band reached.
         *
         * **NOTE:** Use the `cumulative` parameter to create the type of Pricing you require. For
         * example, for Tiered Pricing set to **TRUE**; for Volume Pricing, set to **FALSE**.
         */
        fun cumulative(cumulative: Boolean) = apply { body.cumulative(cumulative) }

        /**
         * Controls whether or not charge rates under a set of pricing bands configured for a
         * Pricing are applied according to each separate band or at the highest band reached.
         *
         * _(Optional)_. The default value is **FALSE**.
         * - When TRUE, at billing charge rates are applied according to each separate band.
         * - When FALSE, at billing charge rates are applied according to highest band reached.
         *
         * **NOTE:** Use the `cumulative` parameter to create the type of Pricing you require. For
         * example, for Tiered Pricing set to **TRUE**; for Volume Pricing, set to **FALSE**.
         */
        fun cumulative(cumulative: JsonField<Boolean>) = apply { body.cumulative(cumulative) }

        /** Displayed on Bill line items. */
        fun description(description: String) = apply { body.description(description) }

        /** Displayed on Bill line items. */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * The end date _(in ISO-8601 format)_ for when the Pricing ceases to be active for the Plan
         * or Plan Template.
         *
         * _(Optional)_ If not specified, the Pricing remains active indefinitely.
         */
        fun endDate(endDate: OffsetDateTime) = apply { body.endDate(endDate) }

        /**
         * The end date _(in ISO-8601 format)_ for when the Pricing ceases to be active for the Plan
         * or Plan Template.
         *
         * _(Optional)_ If not specified, the Pricing remains active indefinitely.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { body.endDate(endDate) }

        /**
         * The minimum spend amount per billing cycle for end customer Accounts on a Plan to which
         * the Pricing is applied.
         */
        fun minimumSpend(minimumSpend: Double) = apply { body.minimumSpend(minimumSpend) }

        /**
         * The minimum spend amount per billing cycle for end customer Accounts on a Plan to which
         * the Pricing is applied.
         */
        fun minimumSpend(minimumSpend: JsonField<Double>) = apply {
            body.minimumSpend(minimumSpend)
        }

        /**
         * The default value is **FALSE**.
         * - When TRUE, minimum spend is billed at the start of each billing period.
         * - When FALSE, minimum spend is billed at the end of each billing period.
         *
         * _(Optional)_. Overrides the setting at Organization level for minimum spend billing in
         * arrears/in advance.
         */
        fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: Boolean) = apply {
            body.minimumSpendBillInAdvance(minimumSpendBillInAdvance)
        }

        /**
         * The default value is **FALSE**.
         * - When TRUE, minimum spend is billed at the start of each billing period.
         * - When FALSE, minimum spend is billed at the end of each billing period.
         *
         * _(Optional)_. Overrides the setting at Organization level for minimum spend billing in
         * arrears/in advance.
         */
        fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: JsonField<Boolean>) = apply {
            body.minimumSpendBillInAdvance(minimumSpendBillInAdvance)
        }

        /** Minimum spend description _(displayed on the bill line item)_. */
        fun minimumSpendDescription(minimumSpendDescription: String) = apply {
            body.minimumSpendDescription(minimumSpendDescription)
        }

        /** Minimum spend description _(displayed on the bill line item)_. */
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
         * Specify Prepayment/Balance overage pricing in pricing bands for the case of a **Tiered**
         * pricing structure.
         */
        fun overagePricingBands(overagePricingBands: JsonField<List<PricingBand>>) = apply {
            body.overagePricingBands(overagePricingBands)
        }

        /**
         * Specify Prepayment/Balance overage pricing in pricing bands for the case of a **Tiered**
         * pricing structure.
         */
        fun addOveragePricingBand(overagePricingBand: PricingBand) = apply {
            body.addOveragePricingBand(overagePricingBand)
        }

        /** UUID of the Plan the Pricing is created for. */
        fun planId(planId: String) = apply { body.planId(planId) }

        /** UUID of the Plan the Pricing is created for. */
        fun planId(planId: JsonField<String>) = apply { body.planId(planId) }

        /** UUID of the Plan Template the Pricing is created for. */
        fun planTemplateId(planTemplateId: String) = apply { body.planTemplateId(planTemplateId) }

        /** UUID of the Plan Template the Pricing is created for. */
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
        fun segment(segment: JsonField<Segment>) = apply { body.segment(segment) }

        /**
         * The default value is **FALSE**.
         * - If TRUE, usage accumulates over the entire period the priced Plan is active for the
         *   account, and is not reset for pricing band rates at the start of each billing period.
         * - If FALSE, usage does not accumulate, and is reset for pricing bands at the start of
         *   each billing period.
         */
        fun tiersSpanPlan(tiersSpanPlan: Boolean) = apply { body.tiersSpanPlan(tiersSpanPlan) }

        /**
         * The default value is **FALSE**.
         * - If TRUE, usage accumulates over the entire period the priced Plan is active for the
         *   account, and is not reset for pricing band rates at the start of each billing period.
         * - If FALSE, usage does not accumulate, and is reset for pricing bands at the start of
         *   each billing period.
         */
        fun tiersSpanPlan(tiersSpanPlan: JsonField<Boolean>) = apply {
            body.tiersSpanPlan(tiersSpanPlan)
        }

        /**
         * - **DEBIT**. Default setting. The amount calculated using the Pricing is added to the
         *   bill as a debit.
         * - **PRODUCT_CREDIT**. The amount calculated using the Pricing is added to the bill as a
         *   credit _(negative amount)_. To prevent negative billing, the bill will be capped at the
         *   total of other line items for the same Product.
         * - **GLOBAL_CREDIT**. The amount calculated using the Pricing is added to the bill as a
         *   credit _(negative amount)_. To prevent negative billing, the bill will be capped at the
         *   total of other line items for the entire bill, which might include other Products the
         *   Account consumes.
         */
        fun type(type: Type) = apply { body.type(type) }

        /**
         * - **DEBIT**. Default setting. The amount calculated using the Pricing is added to the
         *   bill as a debit.
         * - **PRODUCT_CREDIT**. The amount calculated using the Pricing is added to the bill as a
         *   credit _(negative amount)_. To prevent negative billing, the bill will be capped at the
         *   total of other line items for the same Product.
         * - **GLOBAL_CREDIT**. The amount calculated using the Pricing is added to the bill as a
         *   credit _(negative amount)_. To prevent negative billing, the bill will be capped at the
         *   total of other line items for the entire bill, which might include other Products the
         *   Account consumes.
         */
        fun type(type: JsonField<Type>) = apply { body.type(type) }

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

        fun build(): PricingUpdateParams =
            PricingUpdateParams(
                checkRequired("orgId", orgId),
                checkRequired("id", id),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
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

    /**
     * - **DEBIT**. Default setting. The amount calculated using the Pricing is added to the bill as
     *   a debit.
     * - **PRODUCT_CREDIT**. The amount calculated using the Pricing is added to the bill as a
     *   credit _(negative amount)_. To prevent negative billing, the bill will be capped at the
     *   total of other line items for the same Product.
     * - **GLOBAL_CREDIT**. The amount calculated using the Pricing is added to the bill as a credit
     *   _(negative amount)_. To prevent negative billing, the bill will be capped at the total of
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PricingUpdateParams && orgId == other.orgId && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PricingUpdateParams{orgId=$orgId, id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
