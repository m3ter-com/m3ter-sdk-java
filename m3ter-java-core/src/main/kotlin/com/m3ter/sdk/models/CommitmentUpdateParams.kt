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
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

/**
 * Modify a specific Commitment.
 *
 * Update the details of the Commitment with the given UUID. Use this endpoint to adjust Commitment
 * parameters such as the fixed amount, overage surcharge percentage, or associated contract
 * details.
 */
class CommitmentUpdateParams
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
     * The unique identifier (UUID) for the end customer Account the Commitment is added to.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = body.accountId()

    /**
     * The total amount that the customer has committed to pay.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Double = body.amount()

    /**
     * The currency used for the Commitment. For example: USD.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = body.currency()

    /**
     * The end date of the Commitment period in ISO-8601 format.
     *
     * **Note:** End date is exclusive - if you set an end date of June 1st 2022, then the
     * Commitment ceases to be active for the Account at midnight on May 31st 2022, and any
     * Prepayment fees due are calculated up to that point in time, NOT up to midnight on June 1st
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endDate(): LocalDate = body.endDate()

    /**
     * The start date of the Commitment period in ISO-8601 format.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startDate(): LocalDate = body.startDate()

    /**
     * The unique identifier (UUID) for the Product linked to the Commitment for accounting
     * purposes. _(Optional)_
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountingProductId(): Optional<String> = body.accountingProductId()

    /**
     * The amount to be billed in the first invoice.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amountFirstBill(): Optional<Double> = body.amountFirstBill()

    /**
     * The amount that the customer has already paid upfront at the start of the Commitment service
     * period.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amountPrePaid(): Optional<Double> = body.amountPrePaid()

    /**
     * The starting date _(in ISO-8601 date format)_ from which the billing cycles are calculated.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billEpoch(): Optional<LocalDate> = body.billEpoch()

    /**
     * How often the Commitment fees are applied to bills. For example, if the plan being used to
     * bill for Commitment fees is set to issue bills every three months and the `billingInterval`
     * is set to 2, then the Commitment fees are applied every six months.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingInterval(): Optional<Long> = body.billingInterval()

    /**
     * Defines an offset for when the Commitment fees are first applied to bills on the Account. For
     * example, if bills are issued every three months and the `billingOffset` is 0, then the charge
     * is applied to the first bill (at three months); if set to 1, it's applied to the next bill
     * (at six months), and so on.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingOffset(): Optional<Long> = body.billingOffset()

    /**
     * The unique identifier (UUID) for the Product Plan used for billing Commitment fees due.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingPlanId(): Optional<String> = body.billingPlanId()

    /**
     * If the Account is either a Parent or a Child Account, this specifies the Account hierarchy
     * billing mode. The mode determines how billing will be handled and shown on bills for charges
     * due on the Parent Account, and charges due on Child Accounts:
     * - **Parent Breakdown** - a separate bill line item per Account. Default setting.
     * - **Parent Summary** - single bill line item for all Accounts.
     * - **Child** - the Child Account is billed.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun childBillingMode(): Optional<ChildBillingMode> = body.childBillingMode()

    /**
     * A boolean value indicating whether the Commitment fee is billed in advance _(start of each
     * billing period)_ or arrears _(end of each billing period)_.
     *
     * If no value is supplied, then the Organization Configuration value is used.
     * - **TRUE** - bill in advance _(start of each billing period)_.
     * - **FALSE** - bill in arrears _(end of each billing period)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commitmentFeeBillInAdvance(): Optional<Boolean> = body.commitmentFeeBillInAdvance()

    /**
     * A textual description of the Commitment fee.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commitmentFeeDescription(): Optional<String> = body.commitmentFeeDescription()

    /**
     * A textual description of the Commitment usage.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commitmentUsageDescription(): Optional<String> = body.commitmentUsageDescription()

    /**
     * The unique identifier (UUID) for a Contract you've created for the Account - used to add the
     * Commitment to this Contract.
     *
     * **Note:** If you associate the Commitment with a Contract you must ensure the Account Plan
     * attached to the Account has the same Contract associated with it. If the Account Plan
     * Contract and Commitment Contract do not match, then at billing the Commitment amount will not
     * be drawn-down against.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contractId(): Optional<String> = body.contractId()

    /**
     * Optional Product ID this Commitment consumptions should be attributed to for accounting
     * purposes
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun drawdownsAccountingProductId(): Optional<String> = body.drawdownsAccountingProductId()

    /**
     * Used for billing any outstanding Commitment fees _on a schedule_.
     *
     * Create an array to define a series of bill dates and amounts covering specified service
     * periods:
     * - `date` - the billing date _(in ISO-8601 format)_.
     * - `amount` - the billed amount.
     * - `servicePeriodStartDate` and `servicePeriodEndDate` - defines the service period the bill
     *   covers _(in ISO-8601 format)_.
     *
     * **Notes:**
     * - If you try to set `servicePeriodStartDate` _after_ `servicePeriodEndDate`, you'll receive
     *   an error.
     * - You can set `servicePeriodStartDate` and `servicePeriodEndDate` to the _same date_ without
     *   receiving an error, but _please be sure_ your Commitment billing use case requires this.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun feeDates(): Optional<List<CommitmentFee>> = body.feeDates()

    /**
     * Optional Product ID this Commitment fees should be attributed to for accounting purposes
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun feesAccountingProductId(): Optional<String> = body.feesAccountingProductId()

    /**
     * Specify the line item charge types that can draw-down at billing against the Commitment
     * amount. Options are:
     * - `MINIMUM_SPEND`
     * - `STANDING_CHARGE`
     * - `USAGE`
     * - `"COUNTER_RUNNING_TOTAL_CHARGE"`
     * - `"COUNTER_ADJUSTMENT_DEBIT"`
     *
     * **NOTE:** If no charge types are specified, by default _all types_ can draw-down against the
     * Commitment amount at billing.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lineItemTypes(): Optional<List<LineItemType>> = body.lineItemTypes()

    /**
     * A textual description of the overage charges.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overageDescription(): Optional<String> = body.overageDescription()

    /**
     * The percentage surcharge applied to usage charges that exceed the Commitment amount.
     *
     * **Note:** You can enter a _negative percentage_ if you want to give a discount rate for usage
     * to end customers who exceed their Commitment amount
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overageSurchargePercent(): Optional<Double> = body.overageSurchargePercent()

    /**
     * A list of unique identifiers (UUIDs) for Products the Account consumes. Charges due for these
     * Products will be made available for draw-down against the Commitment.
     *
     * **Note:** If not used, then charges due for all Products the Account consumes will be made
     * available for draw-down against the Commitment.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun productIds(): Optional<List<String>> = body.productIds()

    /**
     * A boolean value indicating whether the overage usage is billed separately or together. If
     * overage usage is separated and a Commitment amount has been consumed by an Account, any
     * subsequent line items on Bills against the Account for usage will show as separate "overage
     * usage" charges, not simply as "usage" charges:
     * - **TRUE** - billed separately.
     * - **FALSE** - billed together.
     *
     * **Notes:**
     * - Can be used only if no value or 0 has been defined for the `overageSurchargePercent`
     *   parameter. If you try to separate overage usage when a value other than 0 has been defined
     *   for `overageSurchargePercent`, you'll receive an error.
     * - If a priced Plan is used to bill any outstanding Commitment fees due and the Plan is set up
     *   with overage pricing on a _tiered pricing structure_ and you enable separate bill line
     *   items for overage usage, then overage usage charges will be rated according to the overage
     *   pricing defined for the tiered pricing on the Plan.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun separateOverageUsage(): Optional<Boolean> = body.separateOverageUsage()

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
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountId(): JsonField<String> = body._accountId()

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Double> = body._amount()

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currency(): JsonField<String> = body._currency()

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endDate(): JsonField<LocalDate> = body._endDate()

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startDate(): JsonField<LocalDate> = body._startDate()

    /**
     * Returns the raw JSON value of [accountingProductId].
     *
     * Unlike [accountingProductId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _accountingProductId(): JsonField<String> = body._accountingProductId()

    /**
     * Returns the raw JSON value of [amountFirstBill].
     *
     * Unlike [amountFirstBill], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amountFirstBill(): JsonField<Double> = body._amountFirstBill()

    /**
     * Returns the raw JSON value of [amountPrePaid].
     *
     * Unlike [amountPrePaid], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amountPrePaid(): JsonField<Double> = body._amountPrePaid()

    /**
     * Returns the raw JSON value of [billEpoch].
     *
     * Unlike [billEpoch], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billEpoch(): JsonField<LocalDate> = body._billEpoch()

    /**
     * Returns the raw JSON value of [billingInterval].
     *
     * Unlike [billingInterval], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billingInterval(): JsonField<Long> = body._billingInterval()

    /**
     * Returns the raw JSON value of [billingOffset].
     *
     * Unlike [billingOffset], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billingOffset(): JsonField<Long> = body._billingOffset()

    /**
     * Returns the raw JSON value of [billingPlanId].
     *
     * Unlike [billingPlanId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billingPlanId(): JsonField<String> = body._billingPlanId()

    /**
     * Returns the raw JSON value of [childBillingMode].
     *
     * Unlike [childBillingMode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _childBillingMode(): JsonField<ChildBillingMode> = body._childBillingMode()

    /**
     * Returns the raw JSON value of [commitmentFeeBillInAdvance].
     *
     * Unlike [commitmentFeeBillInAdvance], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _commitmentFeeBillInAdvance(): JsonField<Boolean> = body._commitmentFeeBillInAdvance()

    /**
     * Returns the raw JSON value of [commitmentFeeDescription].
     *
     * Unlike [commitmentFeeDescription], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _commitmentFeeDescription(): JsonField<String> = body._commitmentFeeDescription()

    /**
     * Returns the raw JSON value of [commitmentUsageDescription].
     *
     * Unlike [commitmentUsageDescription], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _commitmentUsageDescription(): JsonField<String> = body._commitmentUsageDescription()

    /**
     * Returns the raw JSON value of [contractId].
     *
     * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contractId(): JsonField<String> = body._contractId()

    /**
     * Returns the raw JSON value of [drawdownsAccountingProductId].
     *
     * Unlike [drawdownsAccountingProductId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _drawdownsAccountingProductId(): JsonField<String> = body._drawdownsAccountingProductId()

    /**
     * Returns the raw JSON value of [feeDates].
     *
     * Unlike [feeDates], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _feeDates(): JsonField<List<CommitmentFee>> = body._feeDates()

    /**
     * Returns the raw JSON value of [feesAccountingProductId].
     *
     * Unlike [feesAccountingProductId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _feesAccountingProductId(): JsonField<String> = body._feesAccountingProductId()

    /**
     * Returns the raw JSON value of [lineItemTypes].
     *
     * Unlike [lineItemTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _lineItemTypes(): JsonField<List<LineItemType>> = body._lineItemTypes()

    /**
     * Returns the raw JSON value of [overageDescription].
     *
     * Unlike [overageDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _overageDescription(): JsonField<String> = body._overageDescription()

    /**
     * Returns the raw JSON value of [overageSurchargePercent].
     *
     * Unlike [overageSurchargePercent], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _overageSurchargePercent(): JsonField<Double> = body._overageSurchargePercent()

    /**
     * Returns the raw JSON value of [productIds].
     *
     * Unlike [productIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _productIds(): JsonField<List<String>> = body._productIds()

    /**
     * Returns the raw JSON value of [separateOverageUsage].
     *
     * Unlike [separateOverageUsage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _separateOverageUsage(): JsonField<Boolean> = body._separateOverageUsage()

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _version(): JsonField<Long> = body._version()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId
            1 -> id
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("accountId")
        @ExcludeMissing
        private val accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("endDate")
        @ExcludeMissing
        private val endDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("startDate")
        @ExcludeMissing
        private val startDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("accountingProductId")
        @ExcludeMissing
        private val accountingProductId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amountFirstBill")
        @ExcludeMissing
        private val amountFirstBill: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("amountPrePaid")
        @ExcludeMissing
        private val amountPrePaid: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("billEpoch")
        @ExcludeMissing
        private val billEpoch: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("billingInterval")
        @ExcludeMissing
        private val billingInterval: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("billingOffset")
        @ExcludeMissing
        private val billingOffset: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("billingPlanId")
        @ExcludeMissing
        private val billingPlanId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("childBillingMode")
        @ExcludeMissing
        private val childBillingMode: JsonField<ChildBillingMode> = JsonMissing.of(),
        @JsonProperty("commitmentFeeBillInAdvance")
        @ExcludeMissing
        private val commitmentFeeBillInAdvance: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("commitmentFeeDescription")
        @ExcludeMissing
        private val commitmentFeeDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("commitmentUsageDescription")
        @ExcludeMissing
        private val commitmentUsageDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contractId")
        @ExcludeMissing
        private val contractId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("drawdownsAccountingProductId")
        @ExcludeMissing
        private val drawdownsAccountingProductId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("feeDates")
        @ExcludeMissing
        private val feeDates: JsonField<List<CommitmentFee>> = JsonMissing.of(),
        @JsonProperty("feesAccountingProductId")
        @ExcludeMissing
        private val feesAccountingProductId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lineItemTypes")
        @ExcludeMissing
        private val lineItemTypes: JsonField<List<LineItemType>> = JsonMissing.of(),
        @JsonProperty("overageDescription")
        @ExcludeMissing
        private val overageDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("overageSurchargePercent")
        @ExcludeMissing
        private val overageSurchargePercent: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("productIds")
        @ExcludeMissing
        private val productIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("separateOverageUsage")
        @ExcludeMissing
        private val separateOverageUsage: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("version")
        @ExcludeMissing
        private val version: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The unique identifier (UUID) for the end customer Account the Commitment is added to.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("accountId")

        /**
         * The total amount that the customer has committed to pay.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Double = amount.getRequired("amount")

        /**
         * The currency used for the Commitment. For example: USD.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * The end date of the Commitment period in ISO-8601 format.
         *
         * **Note:** End date is exclusive - if you set an end date of June 1st 2022, then the
         * Commitment ceases to be active for the Account at midnight on May 31st 2022, and any
         * Prepayment fees due are calculated up to that point in time, NOT up to midnight on June
         * 1st
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endDate(): LocalDate = endDate.getRequired("endDate")

        /**
         * The start date of the Commitment period in ISO-8601 format.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startDate(): LocalDate = startDate.getRequired("startDate")

        /**
         * The unique identifier (UUID) for the Product linked to the Commitment for accounting
         * purposes. _(Optional)_
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountingProductId(): Optional<String> =
            Optional.ofNullable(accountingProductId.getNullable("accountingProductId"))

        /**
         * The amount to be billed in the first invoice.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amountFirstBill(): Optional<Double> =
            Optional.ofNullable(amountFirstBill.getNullable("amountFirstBill"))

        /**
         * The amount that the customer has already paid upfront at the start of the Commitment
         * service period.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amountPrePaid(): Optional<Double> =
            Optional.ofNullable(amountPrePaid.getNullable("amountPrePaid"))

        /**
         * The starting date _(in ISO-8601 date format)_ from which the billing cycles are
         * calculated.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billEpoch(): Optional<LocalDate> =
            Optional.ofNullable(billEpoch.getNullable("billEpoch"))

        /**
         * How often the Commitment fees are applied to bills. For example, if the plan being used
         * to bill for Commitment fees is set to issue bills every three months and the
         * `billingInterval` is set to 2, then the Commitment fees are applied every six months.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingInterval(): Optional<Long> =
            Optional.ofNullable(billingInterval.getNullable("billingInterval"))

        /**
         * Defines an offset for when the Commitment fees are first applied to bills on the Account.
         * For example, if bills are issued every three months and the `billingOffset` is 0, then
         * the charge is applied to the first bill (at three months); if set to 1, it's applied to
         * the next bill (at six months), and so on.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingOffset(): Optional<Long> =
            Optional.ofNullable(billingOffset.getNullable("billingOffset"))

        /**
         * The unique identifier (UUID) for the Product Plan used for billing Commitment fees due.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingPlanId(): Optional<String> =
            Optional.ofNullable(billingPlanId.getNullable("billingPlanId"))

        /**
         * If the Account is either a Parent or a Child Account, this specifies the Account
         * hierarchy billing mode. The mode determines how billing will be handled and shown on
         * bills for charges due on the Parent Account, and charges due on Child Accounts:
         * - **Parent Breakdown** - a separate bill line item per Account. Default setting.
         * - **Parent Summary** - single bill line item for all Accounts.
         * - **Child** - the Child Account is billed.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun childBillingMode(): Optional<ChildBillingMode> =
            Optional.ofNullable(childBillingMode.getNullable("childBillingMode"))

        /**
         * A boolean value indicating whether the Commitment fee is billed in advance _(start of
         * each billing period)_ or arrears _(end of each billing period)_.
         *
         * If no value is supplied, then the Organization Configuration value is used.
         * - **TRUE** - bill in advance _(start of each billing period)_.
         * - **FALSE** - bill in arrears _(end of each billing period)_.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun commitmentFeeBillInAdvance(): Optional<Boolean> =
            Optional.ofNullable(
                commitmentFeeBillInAdvance.getNullable("commitmentFeeBillInAdvance")
            )

        /**
         * A textual description of the Commitment fee.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun commitmentFeeDescription(): Optional<String> =
            Optional.ofNullable(commitmentFeeDescription.getNullable("commitmentFeeDescription"))

        /**
         * A textual description of the Commitment usage.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun commitmentUsageDescription(): Optional<String> =
            Optional.ofNullable(
                commitmentUsageDescription.getNullable("commitmentUsageDescription")
            )

        /**
         * The unique identifier (UUID) for a Contract you've created for the Account - used to add
         * the Commitment to this Contract.
         *
         * **Note:** If you associate the Commitment with a Contract you must ensure the Account
         * Plan attached to the Account has the same Contract associated with it. If the Account
         * Plan Contract and Commitment Contract do not match, then at billing the Commitment amount
         * will not be drawn-down against.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contractId(): Optional<String> =
            Optional.ofNullable(contractId.getNullable("contractId"))

        /**
         * Optional Product ID this Commitment consumptions should be attributed to for accounting
         * purposes
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun drawdownsAccountingProductId(): Optional<String> =
            Optional.ofNullable(
                drawdownsAccountingProductId.getNullable("drawdownsAccountingProductId")
            )

        /**
         * Used for billing any outstanding Commitment fees _on a schedule_.
         *
         * Create an array to define a series of bill dates and amounts covering specified service
         * periods:
         * - `date` - the billing date _(in ISO-8601 format)_.
         * - `amount` - the billed amount.
         * - `servicePeriodStartDate` and `servicePeriodEndDate` - defines the service period the
         *   bill covers _(in ISO-8601 format)_.
         *
         * **Notes:**
         * - If you try to set `servicePeriodStartDate` _after_ `servicePeriodEndDate`, you'll
         *   receive an error.
         * - You can set `servicePeriodStartDate` and `servicePeriodEndDate` to the _same date_
         *   without receiving an error, but _please be sure_ your Commitment billing use case
         *   requires this.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun feeDates(): Optional<List<CommitmentFee>> =
            Optional.ofNullable(feeDates.getNullable("feeDates"))

        /**
         * Optional Product ID this Commitment fees should be attributed to for accounting purposes
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun feesAccountingProductId(): Optional<String> =
            Optional.ofNullable(feesAccountingProductId.getNullable("feesAccountingProductId"))

        /**
         * Specify the line item charge types that can draw-down at billing against the Commitment
         * amount. Options are:
         * - `MINIMUM_SPEND`
         * - `STANDING_CHARGE`
         * - `USAGE`
         * - `"COUNTER_RUNNING_TOTAL_CHARGE"`
         * - `"COUNTER_ADJUSTMENT_DEBIT"`
         *
         * **NOTE:** If no charge types are specified, by default _all types_ can draw-down against
         * the Commitment amount at billing.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lineItemTypes(): Optional<List<LineItemType>> =
            Optional.ofNullable(lineItemTypes.getNullable("lineItemTypes"))

        /**
         * A textual description of the overage charges.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun overageDescription(): Optional<String> =
            Optional.ofNullable(overageDescription.getNullable("overageDescription"))

        /**
         * The percentage surcharge applied to usage charges that exceed the Commitment amount.
         *
         * **Note:** You can enter a _negative percentage_ if you want to give a discount rate for
         * usage to end customers who exceed their Commitment amount
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun overageSurchargePercent(): Optional<Double> =
            Optional.ofNullable(overageSurchargePercent.getNullable("overageSurchargePercent"))

        /**
         * A list of unique identifiers (UUIDs) for Products the Account consumes. Charges due for
         * these Products will be made available for draw-down against the Commitment.
         *
         * **Note:** If not used, then charges due for all Products the Account consumes will be
         * made available for draw-down against the Commitment.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun productIds(): Optional<List<String>> =
            Optional.ofNullable(productIds.getNullable("productIds"))

        /**
         * A boolean value indicating whether the overage usage is billed separately or together. If
         * overage usage is separated and a Commitment amount has been consumed by an Account, any
         * subsequent line items on Bills against the Account for usage will show as separate
         * "overage usage" charges, not simply as "usage" charges:
         * - **TRUE** - billed separately.
         * - **FALSE** - billed together.
         *
         * **Notes:**
         * - Can be used only if no value or 0 has been defined for the `overageSurchargePercent`
         *   parameter. If you try to separate overage usage when a value other than 0 has been
         *   defined for `overageSurchargePercent`, you'll receive an error.
         * - If a priced Plan is used to bill any outstanding Commitment fees due and the Plan is
         *   set up with overage pricing on a _tiered pricing structure_ and you enable separate
         *   bill line items for overage usage, then overage usage charges will be rated according
         *   to the overage pricing defined for the tiered pricing on the Plan.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun separateOverageUsage(): Optional<Boolean> =
            Optional.ofNullable(separateOverageUsage.getNullable("separateOverageUsage"))

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
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<LocalDate> = endDate

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("startDate")
        @ExcludeMissing
        fun _startDate(): JsonField<LocalDate> = startDate

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
         * Returns the raw JSON value of [amountFirstBill].
         *
         * Unlike [amountFirstBill], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("amountFirstBill")
        @ExcludeMissing
        fun _amountFirstBill(): JsonField<Double> = amountFirstBill

        /**
         * Returns the raw JSON value of [amountPrePaid].
         *
         * Unlike [amountPrePaid], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("amountPrePaid")
        @ExcludeMissing
        fun _amountPrePaid(): JsonField<Double> = amountPrePaid

        /**
         * Returns the raw JSON value of [billEpoch].
         *
         * Unlike [billEpoch], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("billEpoch")
        @ExcludeMissing
        fun _billEpoch(): JsonField<LocalDate> = billEpoch

        /**
         * Returns the raw JSON value of [billingInterval].
         *
         * Unlike [billingInterval], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billingInterval")
        @ExcludeMissing
        fun _billingInterval(): JsonField<Long> = billingInterval

        /**
         * Returns the raw JSON value of [billingOffset].
         *
         * Unlike [billingOffset], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billingOffset")
        @ExcludeMissing
        fun _billingOffset(): JsonField<Long> = billingOffset

        /**
         * Returns the raw JSON value of [billingPlanId].
         *
         * Unlike [billingPlanId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billingPlanId")
        @ExcludeMissing
        fun _billingPlanId(): JsonField<String> = billingPlanId

        /**
         * Returns the raw JSON value of [childBillingMode].
         *
         * Unlike [childBillingMode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("childBillingMode")
        @ExcludeMissing
        fun _childBillingMode(): JsonField<ChildBillingMode> = childBillingMode

        /**
         * Returns the raw JSON value of [commitmentFeeBillInAdvance].
         *
         * Unlike [commitmentFeeBillInAdvance], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("commitmentFeeBillInAdvance")
        @ExcludeMissing
        fun _commitmentFeeBillInAdvance(): JsonField<Boolean> = commitmentFeeBillInAdvance

        /**
         * Returns the raw JSON value of [commitmentFeeDescription].
         *
         * Unlike [commitmentFeeDescription], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("commitmentFeeDescription")
        @ExcludeMissing
        fun _commitmentFeeDescription(): JsonField<String> = commitmentFeeDescription

        /**
         * Returns the raw JSON value of [commitmentUsageDescription].
         *
         * Unlike [commitmentUsageDescription], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("commitmentUsageDescription")
        @ExcludeMissing
        fun _commitmentUsageDescription(): JsonField<String> = commitmentUsageDescription

        /**
         * Returns the raw JSON value of [contractId].
         *
         * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contractId")
        @ExcludeMissing
        fun _contractId(): JsonField<String> = contractId

        /**
         * Returns the raw JSON value of [drawdownsAccountingProductId].
         *
         * Unlike [drawdownsAccountingProductId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("drawdownsAccountingProductId")
        @ExcludeMissing
        fun _drawdownsAccountingProductId(): JsonField<String> = drawdownsAccountingProductId

        /**
         * Returns the raw JSON value of [feeDates].
         *
         * Unlike [feeDates], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("feeDates")
        @ExcludeMissing
        fun _feeDates(): JsonField<List<CommitmentFee>> = feeDates

        /**
         * Returns the raw JSON value of [feesAccountingProductId].
         *
         * Unlike [feesAccountingProductId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("feesAccountingProductId")
        @ExcludeMissing
        fun _feesAccountingProductId(): JsonField<String> = feesAccountingProductId

        /**
         * Returns the raw JSON value of [lineItemTypes].
         *
         * Unlike [lineItemTypes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("lineItemTypes")
        @ExcludeMissing
        fun _lineItemTypes(): JsonField<List<LineItemType>> = lineItemTypes

        /**
         * Returns the raw JSON value of [overageDescription].
         *
         * Unlike [overageDescription], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("overageDescription")
        @ExcludeMissing
        fun _overageDescription(): JsonField<String> = overageDescription

        /**
         * Returns the raw JSON value of [overageSurchargePercent].
         *
         * Unlike [overageSurchargePercent], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("overageSurchargePercent")
        @ExcludeMissing
        fun _overageSurchargePercent(): JsonField<Double> = overageSurchargePercent

        /**
         * Returns the raw JSON value of [productIds].
         *
         * Unlike [productIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("productIds")
        @ExcludeMissing
        fun _productIds(): JsonField<List<String>> = productIds

        /**
         * Returns the raw JSON value of [separateOverageUsage].
         *
         * Unlike [separateOverageUsage], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("separateOverageUsage")
        @ExcludeMissing
        fun _separateOverageUsage(): JsonField<Boolean> = separateOverageUsage

        /**
         * Returns the raw JSON value of [version].
         *
         * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
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

            accountId()
            amount()
            currency()
            endDate()
            startDate()
            accountingProductId()
            amountFirstBill()
            amountPrePaid()
            billEpoch()
            billingInterval()
            billingOffset()
            billingPlanId()
            childBillingMode()
            commitmentFeeBillInAdvance()
            commitmentFeeDescription()
            commitmentUsageDescription()
            contractId()
            drawdownsAccountingProductId()
            feeDates().ifPresent { it.forEach { it.validate() } }
            feesAccountingProductId()
            lineItemTypes()
            overageDescription()
            overageSurchargePercent()
            productIds()
            separateOverageUsage()
            version()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .accountId()
             * .amount()
             * .currency()
             * .endDate()
             * .startDate()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var amount: JsonField<Double>? = null
            private var currency: JsonField<String>? = null
            private var endDate: JsonField<LocalDate>? = null
            private var startDate: JsonField<LocalDate>? = null
            private var accountingProductId: JsonField<String> = JsonMissing.of()
            private var amountFirstBill: JsonField<Double> = JsonMissing.of()
            private var amountPrePaid: JsonField<Double> = JsonMissing.of()
            private var billEpoch: JsonField<LocalDate> = JsonMissing.of()
            private var billingInterval: JsonField<Long> = JsonMissing.of()
            private var billingOffset: JsonField<Long> = JsonMissing.of()
            private var billingPlanId: JsonField<String> = JsonMissing.of()
            private var childBillingMode: JsonField<ChildBillingMode> = JsonMissing.of()
            private var commitmentFeeBillInAdvance: JsonField<Boolean> = JsonMissing.of()
            private var commitmentFeeDescription: JsonField<String> = JsonMissing.of()
            private var commitmentUsageDescription: JsonField<String> = JsonMissing.of()
            private var contractId: JsonField<String> = JsonMissing.of()
            private var drawdownsAccountingProductId: JsonField<String> = JsonMissing.of()
            private var feeDates: JsonField<MutableList<CommitmentFee>>? = null
            private var feesAccountingProductId: JsonField<String> = JsonMissing.of()
            private var lineItemTypes: JsonField<MutableList<LineItemType>>? = null
            private var overageDescription: JsonField<String> = JsonMissing.of()
            private var overageSurchargePercent: JsonField<Double> = JsonMissing.of()
            private var productIds: JsonField<MutableList<String>>? = null
            private var separateOverageUsage: JsonField<Boolean> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountId = body.accountId
                amount = body.amount
                currency = body.currency
                endDate = body.endDate
                startDate = body.startDate
                accountingProductId = body.accountingProductId
                amountFirstBill = body.amountFirstBill
                amountPrePaid = body.amountPrePaid
                billEpoch = body.billEpoch
                billingInterval = body.billingInterval
                billingOffset = body.billingOffset
                billingPlanId = body.billingPlanId
                childBillingMode = body.childBillingMode
                commitmentFeeBillInAdvance = body.commitmentFeeBillInAdvance
                commitmentFeeDescription = body.commitmentFeeDescription
                commitmentUsageDescription = body.commitmentUsageDescription
                contractId = body.contractId
                drawdownsAccountingProductId = body.drawdownsAccountingProductId
                feeDates = body.feeDates.map { it.toMutableList() }
                feesAccountingProductId = body.feesAccountingProductId
                lineItemTypes = body.lineItemTypes.map { it.toMutableList() }
                overageDescription = body.overageDescription
                overageSurchargePercent = body.overageSurchargePercent
                productIds = body.productIds.map { it.toMutableList() }
                separateOverageUsage = body.separateOverageUsage
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The unique identifier (UUID) for the end customer Account the Commitment is added to.
             */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The total amount that the customer has committed to pay. */
            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** The currency used for the Commitment. For example: USD. */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /**
             * The end date of the Commitment period in ISO-8601 format.
             *
             * **Note:** End date is exclusive - if you set an end date of June 1st 2022, then the
             * Commitment ceases to be active for the Account at midnight on May 31st 2022, and any
             * Prepayment fees due are calculated up to that point in time, NOT up to midnight on
             * June 1st
             */
            fun endDate(endDate: LocalDate) = endDate(JsonField.of(endDate))

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<LocalDate>) = apply { this.endDate = endDate }

            /** The start date of the Commitment period in ISO-8601 format. */
            fun startDate(startDate: LocalDate) = startDate(JsonField.of(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<LocalDate>) = apply { this.startDate = startDate }

            /**
             * The unique identifier (UUID) for the Product linked to the Commitment for accounting
             * purposes. _(Optional)_
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

            /** The amount to be billed in the first invoice. */
            fun amountFirstBill(amountFirstBill: Double) =
                amountFirstBill(JsonField.of(amountFirstBill))

            /**
             * Sets [Builder.amountFirstBill] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountFirstBill] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amountFirstBill(amountFirstBill: JsonField<Double>) = apply {
                this.amountFirstBill = amountFirstBill
            }

            /**
             * The amount that the customer has already paid upfront at the start of the Commitment
             * service period.
             */
            fun amountPrePaid(amountPrePaid: Double) = amountPrePaid(JsonField.of(amountPrePaid))

            /**
             * Sets [Builder.amountPrePaid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountPrePaid] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amountPrePaid(amountPrePaid: JsonField<Double>) = apply {
                this.amountPrePaid = amountPrePaid
            }

            /**
             * The starting date _(in ISO-8601 date format)_ from which the billing cycles are
             * calculated.
             */
            fun billEpoch(billEpoch: LocalDate) = billEpoch(JsonField.of(billEpoch))

            /**
             * Sets [Builder.billEpoch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billEpoch] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billEpoch(billEpoch: JsonField<LocalDate>) = apply { this.billEpoch = billEpoch }

            /**
             * How often the Commitment fees are applied to bills. For example, if the plan being
             * used to bill for Commitment fees is set to issue bills every three months and the
             * `billingInterval` is set to 2, then the Commitment fees are applied every six months.
             */
            fun billingInterval(billingInterval: Long) =
                billingInterval(JsonField.of(billingInterval))

            /**
             * Sets [Builder.billingInterval] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingInterval] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billingInterval(billingInterval: JsonField<Long>) = apply {
                this.billingInterval = billingInterval
            }

            /**
             * Defines an offset for when the Commitment fees are first applied to bills on the
             * Account. For example, if bills are issued every three months and the `billingOffset`
             * is 0, then the charge is applied to the first bill (at three months); if set to 1,
             * it's applied to the next bill (at six months), and so on.
             */
            fun billingOffset(billingOffset: Long) = billingOffset(JsonField.of(billingOffset))

            /**
             * Sets [Builder.billingOffset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingOffset] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billingOffset(billingOffset: JsonField<Long>) = apply {
                this.billingOffset = billingOffset
            }

            /**
             * The unique identifier (UUID) for the Product Plan used for billing Commitment fees
             * due.
             */
            fun billingPlanId(billingPlanId: String) = billingPlanId(JsonField.of(billingPlanId))

            /**
             * Sets [Builder.billingPlanId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingPlanId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billingPlanId(billingPlanId: JsonField<String>) = apply {
                this.billingPlanId = billingPlanId
            }

            /**
             * If the Account is either a Parent or a Child Account, this specifies the Account
             * hierarchy billing mode. The mode determines how billing will be handled and shown on
             * bills for charges due on the Parent Account, and charges due on Child Accounts:
             * - **Parent Breakdown** - a separate bill line item per Account. Default setting.
             * - **Parent Summary** - single bill line item for all Accounts.
             * - **Child** - the Child Account is billed.
             */
            fun childBillingMode(childBillingMode: ChildBillingMode) =
                childBillingMode(JsonField.of(childBillingMode))

            /**
             * Sets [Builder.childBillingMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.childBillingMode] with a well-typed
             * [ChildBillingMode] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun childBillingMode(childBillingMode: JsonField<ChildBillingMode>) = apply {
                this.childBillingMode = childBillingMode
            }

            /**
             * A boolean value indicating whether the Commitment fee is billed in advance _(start of
             * each billing period)_ or arrears _(end of each billing period)_.
             *
             * If no value is supplied, then the Organization Configuration value is used.
             * - **TRUE** - bill in advance _(start of each billing period)_.
             * - **FALSE** - bill in arrears _(end of each billing period)_.
             */
            fun commitmentFeeBillInAdvance(commitmentFeeBillInAdvance: Boolean) =
                commitmentFeeBillInAdvance(JsonField.of(commitmentFeeBillInAdvance))

            /**
             * Sets [Builder.commitmentFeeBillInAdvance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commitmentFeeBillInAdvance] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun commitmentFeeBillInAdvance(commitmentFeeBillInAdvance: JsonField<Boolean>) = apply {
                this.commitmentFeeBillInAdvance = commitmentFeeBillInAdvance
            }

            /** A textual description of the Commitment fee. */
            fun commitmentFeeDescription(commitmentFeeDescription: String) =
                commitmentFeeDescription(JsonField.of(commitmentFeeDescription))

            /**
             * Sets [Builder.commitmentFeeDescription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commitmentFeeDescription] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun commitmentFeeDescription(commitmentFeeDescription: JsonField<String>) = apply {
                this.commitmentFeeDescription = commitmentFeeDescription
            }

            /** A textual description of the Commitment usage. */
            fun commitmentUsageDescription(commitmentUsageDescription: String) =
                commitmentUsageDescription(JsonField.of(commitmentUsageDescription))

            /**
             * Sets [Builder.commitmentUsageDescription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commitmentUsageDescription] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun commitmentUsageDescription(commitmentUsageDescription: JsonField<String>) = apply {
                this.commitmentUsageDescription = commitmentUsageDescription
            }

            /**
             * The unique identifier (UUID) for a Contract you've created for the Account - used to
             * add the Commitment to this Contract.
             *
             * **Note:** If you associate the Commitment with a Contract you must ensure the Account
             * Plan attached to the Account has the same Contract associated with it. If the Account
             * Plan Contract and Commitment Contract do not match, then at billing the Commitment
             * amount will not be drawn-down against.
             */
            fun contractId(contractId: String) = contractId(JsonField.of(contractId))

            /**
             * Sets [Builder.contractId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contractId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

            /**
             * Optional Product ID this Commitment consumptions should be attributed to for
             * accounting purposes
             */
            fun drawdownsAccountingProductId(drawdownsAccountingProductId: String) =
                drawdownsAccountingProductId(JsonField.of(drawdownsAccountingProductId))

            /**
             * Sets [Builder.drawdownsAccountingProductId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.drawdownsAccountingProductId] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun drawdownsAccountingProductId(drawdownsAccountingProductId: JsonField<String>) =
                apply {
                    this.drawdownsAccountingProductId = drawdownsAccountingProductId
                }

            /**
             * Used for billing any outstanding Commitment fees _on a schedule_.
             *
             * Create an array to define a series of bill dates and amounts covering specified
             * service periods:
             * - `date` - the billing date _(in ISO-8601 format)_.
             * - `amount` - the billed amount.
             * - `servicePeriodStartDate` and `servicePeriodEndDate` - defines the service period
             *   the bill covers _(in ISO-8601 format)_.
             *
             * **Notes:**
             * - If you try to set `servicePeriodStartDate` _after_ `servicePeriodEndDate`, you'll
             *   receive an error.
             * - You can set `servicePeriodStartDate` and `servicePeriodEndDate` to the _same date_
             *   without receiving an error, but _please be sure_ your Commitment billing use case
             *   requires this.
             */
            fun feeDates(feeDates: List<CommitmentFee>) = feeDates(JsonField.of(feeDates))

            /**
             * Sets [Builder.feeDates] to an arbitrary JSON value.
             *
             * You should usually call [Builder.feeDates] with a well-typed `List<CommitmentFee>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun feeDates(feeDates: JsonField<List<CommitmentFee>>) = apply {
                this.feeDates = feeDates.map { it.toMutableList() }
            }

            /**
             * Adds a single [CommitmentFee] to [feeDates].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFeeDate(feeDate: CommitmentFee) = apply {
                feeDates =
                    (feeDates ?: JsonField.of(mutableListOf())).also {
                        checkKnown("feeDates", it).add(feeDate)
                    }
            }

            /**
             * Optional Product ID this Commitment fees should be attributed to for accounting
             * purposes
             */
            fun feesAccountingProductId(feesAccountingProductId: String) =
                feesAccountingProductId(JsonField.of(feesAccountingProductId))

            /**
             * Sets [Builder.feesAccountingProductId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.feesAccountingProductId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun feesAccountingProductId(feesAccountingProductId: JsonField<String>) = apply {
                this.feesAccountingProductId = feesAccountingProductId
            }

            /**
             * Specify the line item charge types that can draw-down at billing against the
             * Commitment amount. Options are:
             * - `MINIMUM_SPEND`
             * - `STANDING_CHARGE`
             * - `USAGE`
             * - `"COUNTER_RUNNING_TOTAL_CHARGE"`
             * - `"COUNTER_ADJUSTMENT_DEBIT"`
             *
             * **NOTE:** If no charge types are specified, by default _all types_ can draw-down
             * against the Commitment amount at billing.
             */
            fun lineItemTypes(lineItemTypes: List<LineItemType>) =
                lineItemTypes(JsonField.of(lineItemTypes))

            /**
             * Sets [Builder.lineItemTypes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lineItemTypes] with a well-typed
             * `List<LineItemType>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun lineItemTypes(lineItemTypes: JsonField<List<LineItemType>>) = apply {
                this.lineItemTypes = lineItemTypes.map { it.toMutableList() }
            }

            /**
             * Adds a single [LineItemType] to [lineItemTypes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLineItemType(lineItemType: LineItemType) = apply {
                lineItemTypes =
                    (lineItemTypes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("lineItemTypes", it).add(lineItemType)
                    }
            }

            /** A textual description of the overage charges. */
            fun overageDescription(overageDescription: String) =
                overageDescription(JsonField.of(overageDescription))

            /**
             * Sets [Builder.overageDescription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overageDescription] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun overageDescription(overageDescription: JsonField<String>) = apply {
                this.overageDescription = overageDescription
            }

            /**
             * The percentage surcharge applied to usage charges that exceed the Commitment amount.
             *
             * **Note:** You can enter a _negative percentage_ if you want to give a discount rate
             * for usage to end customers who exceed their Commitment amount
             */
            fun overageSurchargePercent(overageSurchargePercent: Double) =
                overageSurchargePercent(JsonField.of(overageSurchargePercent))

            /**
             * Sets [Builder.overageSurchargePercent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overageSurchargePercent] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun overageSurchargePercent(overageSurchargePercent: JsonField<Double>) = apply {
                this.overageSurchargePercent = overageSurchargePercent
            }

            /**
             * A list of unique identifiers (UUIDs) for Products the Account consumes. Charges due
             * for these Products will be made available for draw-down against the Commitment.
             *
             * **Note:** If not used, then charges due for all Products the Account consumes will be
             * made available for draw-down against the Commitment.
             */
            fun productIds(productIds: List<String>) = productIds(JsonField.of(productIds))

            /**
             * Sets [Builder.productIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productIds(productIds: JsonField<List<String>>) = apply {
                this.productIds = productIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [productIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addProductId(productId: String) = apply {
                productIds =
                    (productIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("productIds", it).add(productId)
                    }
            }

            /**
             * A boolean value indicating whether the overage usage is billed separately or
             * together. If overage usage is separated and a Commitment amount has been consumed by
             * an Account, any subsequent line items on Bills against the Account for usage will
             * show as separate "overage usage" charges, not simply as "usage" charges:
             * - **TRUE** - billed separately.
             * - **FALSE** - billed together.
             *
             * **Notes:**
             * - Can be used only if no value or 0 has been defined for the
             *   `overageSurchargePercent` parameter. If you try to separate overage usage when a
             *   value other than 0 has been defined for `overageSurchargePercent`, you'll receive
             *   an error.
             * - If a priced Plan is used to bill any outstanding Commitment fees due and the Plan
             *   is set up with overage pricing on a _tiered pricing structure_ and you enable
             *   separate bill line items for overage usage, then overage usage charges will be
             *   rated according to the overage pricing defined for the tiered pricing on the Plan.
             */
            fun separateOverageUsage(separateOverageUsage: Boolean) =
                separateOverageUsage(JsonField.of(separateOverageUsage))

            /**
             * Sets [Builder.separateOverageUsage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.separateOverageUsage] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun separateOverageUsage(separateOverageUsage: JsonField<Boolean>) = apply {
                this.separateOverageUsage = separateOverageUsage
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
             * .accountId()
             * .amount()
             * .currency()
             * .endDate()
             * .startDate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("accountId", accountId),
                    checkRequired("amount", amount),
                    checkRequired("currency", currency),
                    checkRequired("endDate", endDate),
                    checkRequired("startDate", startDate),
                    accountingProductId,
                    amountFirstBill,
                    amountPrePaid,
                    billEpoch,
                    billingInterval,
                    billingOffset,
                    billingPlanId,
                    childBillingMode,
                    commitmentFeeBillInAdvance,
                    commitmentFeeDescription,
                    commitmentUsageDescription,
                    contractId,
                    drawdownsAccountingProductId,
                    (feeDates ?: JsonMissing.of()).map { it.toImmutable() },
                    feesAccountingProductId,
                    (lineItemTypes ?: JsonMissing.of()).map { it.toImmutable() },
                    overageDescription,
                    overageSurchargePercent,
                    (productIds ?: JsonMissing.of()).map { it.toImmutable() },
                    separateOverageUsage,
                    version,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && accountId == other.accountId && amount == other.amount && currency == other.currency && endDate == other.endDate && startDate == other.startDate && accountingProductId == other.accountingProductId && amountFirstBill == other.amountFirstBill && amountPrePaid == other.amountPrePaid && billEpoch == other.billEpoch && billingInterval == other.billingInterval && billingOffset == other.billingOffset && billingPlanId == other.billingPlanId && childBillingMode == other.childBillingMode && commitmentFeeBillInAdvance == other.commitmentFeeBillInAdvance && commitmentFeeDescription == other.commitmentFeeDescription && commitmentUsageDescription == other.commitmentUsageDescription && contractId == other.contractId && drawdownsAccountingProductId == other.drawdownsAccountingProductId && feeDates == other.feeDates && feesAccountingProductId == other.feesAccountingProductId && lineItemTypes == other.lineItemTypes && overageDescription == other.overageDescription && overageSurchargePercent == other.overageSurchargePercent && productIds == other.productIds && separateOverageUsage == other.separateOverageUsage && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, amount, currency, endDate, startDate, accountingProductId, amountFirstBill, amountPrePaid, billEpoch, billingInterval, billingOffset, billingPlanId, childBillingMode, commitmentFeeBillInAdvance, commitmentFeeDescription, commitmentUsageDescription, contractId, drawdownsAccountingProductId, feeDates, feesAccountingProductId, lineItemTypes, overageDescription, overageSurchargePercent, productIds, separateOverageUsage, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountId=$accountId, amount=$amount, currency=$currency, endDate=$endDate, startDate=$startDate, accountingProductId=$accountingProductId, amountFirstBill=$amountFirstBill, amountPrePaid=$amountPrePaid, billEpoch=$billEpoch, billingInterval=$billingInterval, billingOffset=$billingOffset, billingPlanId=$billingPlanId, childBillingMode=$childBillingMode, commitmentFeeBillInAdvance=$commitmentFeeBillInAdvance, commitmentFeeDescription=$commitmentFeeDescription, commitmentUsageDescription=$commitmentUsageDescription, contractId=$contractId, drawdownsAccountingProductId=$drawdownsAccountingProductId, feeDates=$feeDates, feesAccountingProductId=$feesAccountingProductId, lineItemTypes=$lineItemTypes, overageDescription=$overageDescription, overageSurchargePercent=$overageSurchargePercent, productIds=$productIds, separateOverageUsage=$separateOverageUsage, version=$version, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CommitmentUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .id()
         * .accountId()
         * .amount()
         * .currency()
         * .endDate()
         * .startDate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommitmentUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(commitmentUpdateParams: CommitmentUpdateParams) = apply {
            orgId = commitmentUpdateParams.orgId
            id = commitmentUpdateParams.id
            body = commitmentUpdateParams.body.toBuilder()
            additionalHeaders = commitmentUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = commitmentUpdateParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        fun id(id: String) = apply { this.id = id }

        /** The unique identifier (UUID) for the end customer Account the Commitment is added to. */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { body.accountId(accountId) }

        /** The total amount that the customer has committed to pay. */
        fun amount(amount: Double) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Double>) = apply { body.amount(amount) }

        /** The currency used for the Commitment. For example: USD. */
        fun currency(currency: String) = apply { body.currency(currency) }

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { body.currency(currency) }

        /**
         * The end date of the Commitment period in ISO-8601 format.
         *
         * **Note:** End date is exclusive - if you set an end date of June 1st 2022, then the
         * Commitment ceases to be active for the Account at midnight on May 31st 2022, and any
         * Prepayment fees due are calculated up to that point in time, NOT up to midnight on June
         * 1st
         */
        fun endDate(endDate: LocalDate) = apply { body.endDate(endDate) }

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endDate(endDate: JsonField<LocalDate>) = apply { body.endDate(endDate) }

        /** The start date of the Commitment period in ISO-8601 format. */
        fun startDate(startDate: LocalDate) = apply { body.startDate(startDate) }

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startDate(startDate: JsonField<LocalDate>) = apply { body.startDate(startDate) }

        /**
         * The unique identifier (UUID) for the Product linked to the Commitment for accounting
         * purposes. _(Optional)_
         */
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

        /** The amount to be billed in the first invoice. */
        fun amountFirstBill(amountFirstBill: Double) = apply {
            body.amountFirstBill(amountFirstBill)
        }

        /**
         * Sets [Builder.amountFirstBill] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountFirstBill] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun amountFirstBill(amountFirstBill: JsonField<Double>) = apply {
            body.amountFirstBill(amountFirstBill)
        }

        /**
         * The amount that the customer has already paid upfront at the start of the Commitment
         * service period.
         */
        fun amountPrePaid(amountPrePaid: Double) = apply { body.amountPrePaid(amountPrePaid) }

        /**
         * Sets [Builder.amountPrePaid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountPrePaid] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun amountPrePaid(amountPrePaid: JsonField<Double>) = apply {
            body.amountPrePaid(amountPrePaid)
        }

        /**
         * The starting date _(in ISO-8601 date format)_ from which the billing cycles are
         * calculated.
         */
        fun billEpoch(billEpoch: LocalDate) = apply { body.billEpoch(billEpoch) }

        /**
         * Sets [Builder.billEpoch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billEpoch] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun billEpoch(billEpoch: JsonField<LocalDate>) = apply { body.billEpoch(billEpoch) }

        /**
         * How often the Commitment fees are applied to bills. For example, if the plan being used
         * to bill for Commitment fees is set to issue bills every three months and the
         * `billingInterval` is set to 2, then the Commitment fees are applied every six months.
         */
        fun billingInterval(billingInterval: Long) = apply { body.billingInterval(billingInterval) }

        /**
         * Sets [Builder.billingInterval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingInterval] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun billingInterval(billingInterval: JsonField<Long>) = apply {
            body.billingInterval(billingInterval)
        }

        /**
         * Defines an offset for when the Commitment fees are first applied to bills on the Account.
         * For example, if bills are issued every three months and the `billingOffset` is 0, then
         * the charge is applied to the first bill (at three months); if set to 1, it's applied to
         * the next bill (at six months), and so on.
         */
        fun billingOffset(billingOffset: Long) = apply { body.billingOffset(billingOffset) }

        /**
         * Sets [Builder.billingOffset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingOffset] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun billingOffset(billingOffset: JsonField<Long>) = apply {
            body.billingOffset(billingOffset)
        }

        /**
         * The unique identifier (UUID) for the Product Plan used for billing Commitment fees due.
         */
        fun billingPlanId(billingPlanId: String) = apply { body.billingPlanId(billingPlanId) }

        /**
         * Sets [Builder.billingPlanId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingPlanId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun billingPlanId(billingPlanId: JsonField<String>) = apply {
            body.billingPlanId(billingPlanId)
        }

        /**
         * If the Account is either a Parent or a Child Account, this specifies the Account
         * hierarchy billing mode. The mode determines how billing will be handled and shown on
         * bills for charges due on the Parent Account, and charges due on Child Accounts:
         * - **Parent Breakdown** - a separate bill line item per Account. Default setting.
         * - **Parent Summary** - single bill line item for all Accounts.
         * - **Child** - the Child Account is billed.
         */
        fun childBillingMode(childBillingMode: ChildBillingMode) = apply {
            body.childBillingMode(childBillingMode)
        }

        /**
         * Sets [Builder.childBillingMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.childBillingMode] with a well-typed [ChildBillingMode]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun childBillingMode(childBillingMode: JsonField<ChildBillingMode>) = apply {
            body.childBillingMode(childBillingMode)
        }

        /**
         * A boolean value indicating whether the Commitment fee is billed in advance _(start of
         * each billing period)_ or arrears _(end of each billing period)_.
         *
         * If no value is supplied, then the Organization Configuration value is used.
         * - **TRUE** - bill in advance _(start of each billing period)_.
         * - **FALSE** - bill in arrears _(end of each billing period)_.
         */
        fun commitmentFeeBillInAdvance(commitmentFeeBillInAdvance: Boolean) = apply {
            body.commitmentFeeBillInAdvance(commitmentFeeBillInAdvance)
        }

        /**
         * Sets [Builder.commitmentFeeBillInAdvance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commitmentFeeBillInAdvance] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun commitmentFeeBillInAdvance(commitmentFeeBillInAdvance: JsonField<Boolean>) = apply {
            body.commitmentFeeBillInAdvance(commitmentFeeBillInAdvance)
        }

        /** A textual description of the Commitment fee. */
        fun commitmentFeeDescription(commitmentFeeDescription: String) = apply {
            body.commitmentFeeDescription(commitmentFeeDescription)
        }

        /**
         * Sets [Builder.commitmentFeeDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commitmentFeeDescription] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun commitmentFeeDescription(commitmentFeeDescription: JsonField<String>) = apply {
            body.commitmentFeeDescription(commitmentFeeDescription)
        }

        /** A textual description of the Commitment usage. */
        fun commitmentUsageDescription(commitmentUsageDescription: String) = apply {
            body.commitmentUsageDescription(commitmentUsageDescription)
        }

        /**
         * Sets [Builder.commitmentUsageDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commitmentUsageDescription] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun commitmentUsageDescription(commitmentUsageDescription: JsonField<String>) = apply {
            body.commitmentUsageDescription(commitmentUsageDescription)
        }

        /**
         * The unique identifier (UUID) for a Contract you've created for the Account - used to add
         * the Commitment to this Contract.
         *
         * **Note:** If you associate the Commitment with a Contract you must ensure the Account
         * Plan attached to the Account has the same Contract associated with it. If the Account
         * Plan Contract and Commitment Contract do not match, then at billing the Commitment amount
         * will not be drawn-down against.
         */
        fun contractId(contractId: String) = apply { body.contractId(contractId) }

        /**
         * Sets [Builder.contractId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contractId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contractId(contractId: JsonField<String>) = apply { body.contractId(contractId) }

        /**
         * Optional Product ID this Commitment consumptions should be attributed to for accounting
         * purposes
         */
        fun drawdownsAccountingProductId(drawdownsAccountingProductId: String) = apply {
            body.drawdownsAccountingProductId(drawdownsAccountingProductId)
        }

        /**
         * Sets [Builder.drawdownsAccountingProductId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.drawdownsAccountingProductId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun drawdownsAccountingProductId(drawdownsAccountingProductId: JsonField<String>) = apply {
            body.drawdownsAccountingProductId(drawdownsAccountingProductId)
        }

        /**
         * Used for billing any outstanding Commitment fees _on a schedule_.
         *
         * Create an array to define a series of bill dates and amounts covering specified service
         * periods:
         * - `date` - the billing date _(in ISO-8601 format)_.
         * - `amount` - the billed amount.
         * - `servicePeriodStartDate` and `servicePeriodEndDate` - defines the service period the
         *   bill covers _(in ISO-8601 format)_.
         *
         * **Notes:**
         * - If you try to set `servicePeriodStartDate` _after_ `servicePeriodEndDate`, you'll
         *   receive an error.
         * - You can set `servicePeriodStartDate` and `servicePeriodEndDate` to the _same date_
         *   without receiving an error, but _please be sure_ your Commitment billing use case
         *   requires this.
         */
        fun feeDates(feeDates: List<CommitmentFee>) = apply { body.feeDates(feeDates) }

        /**
         * Sets [Builder.feeDates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feeDates] with a well-typed `List<CommitmentFee>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun feeDates(feeDates: JsonField<List<CommitmentFee>>) = apply { body.feeDates(feeDates) }

        /**
         * Adds a single [CommitmentFee] to [feeDates].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFeeDate(feeDate: CommitmentFee) = apply { body.addFeeDate(feeDate) }

        /**
         * Optional Product ID this Commitment fees should be attributed to for accounting purposes
         */
        fun feesAccountingProductId(feesAccountingProductId: String) = apply {
            body.feesAccountingProductId(feesAccountingProductId)
        }

        /**
         * Sets [Builder.feesAccountingProductId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feesAccountingProductId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun feesAccountingProductId(feesAccountingProductId: JsonField<String>) = apply {
            body.feesAccountingProductId(feesAccountingProductId)
        }

        /**
         * Specify the line item charge types that can draw-down at billing against the Commitment
         * amount. Options are:
         * - `MINIMUM_SPEND`
         * - `STANDING_CHARGE`
         * - `USAGE`
         * - `"COUNTER_RUNNING_TOTAL_CHARGE"`
         * - `"COUNTER_ADJUSTMENT_DEBIT"`
         *
         * **NOTE:** If no charge types are specified, by default _all types_ can draw-down against
         * the Commitment amount at billing.
         */
        fun lineItemTypes(lineItemTypes: List<LineItemType>) = apply {
            body.lineItemTypes(lineItemTypes)
        }

        /**
         * Sets [Builder.lineItemTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lineItemTypes] with a well-typed `List<LineItemType>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lineItemTypes(lineItemTypes: JsonField<List<LineItemType>>) = apply {
            body.lineItemTypes(lineItemTypes)
        }

        /**
         * Adds a single [LineItemType] to [lineItemTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLineItemType(lineItemType: LineItemType) = apply {
            body.addLineItemType(lineItemType)
        }

        /** A textual description of the overage charges. */
        fun overageDescription(overageDescription: String) = apply {
            body.overageDescription(overageDescription)
        }

        /**
         * Sets [Builder.overageDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overageDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun overageDescription(overageDescription: JsonField<String>) = apply {
            body.overageDescription(overageDescription)
        }

        /**
         * The percentage surcharge applied to usage charges that exceed the Commitment amount.
         *
         * **Note:** You can enter a _negative percentage_ if you want to give a discount rate for
         * usage to end customers who exceed their Commitment amount
         */
        fun overageSurchargePercent(overageSurchargePercent: Double) = apply {
            body.overageSurchargePercent(overageSurchargePercent)
        }

        /**
         * Sets [Builder.overageSurchargePercent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overageSurchargePercent] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun overageSurchargePercent(overageSurchargePercent: JsonField<Double>) = apply {
            body.overageSurchargePercent(overageSurchargePercent)
        }

        /**
         * A list of unique identifiers (UUIDs) for Products the Account consumes. Charges due for
         * these Products will be made available for draw-down against the Commitment.
         *
         * **Note:** If not used, then charges due for all Products the Account consumes will be
         * made available for draw-down against the Commitment.
         */
        fun productIds(productIds: List<String>) = apply { body.productIds(productIds) }

        /**
         * Sets [Builder.productIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun productIds(productIds: JsonField<List<String>>) = apply { body.productIds(productIds) }

        /**
         * Adds a single [String] to [productIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProductId(productId: String) = apply { body.addProductId(productId) }

        /**
         * A boolean value indicating whether the overage usage is billed separately or together. If
         * overage usage is separated and a Commitment amount has been consumed by an Account, any
         * subsequent line items on Bills against the Account for usage will show as separate
         * "overage usage" charges, not simply as "usage" charges:
         * - **TRUE** - billed separately.
         * - **FALSE** - billed together.
         *
         * **Notes:**
         * - Can be used only if no value or 0 has been defined for the `overageSurchargePercent`
         *   parameter. If you try to separate overage usage when a value other than 0 has been
         *   defined for `overageSurchargePercent`, you'll receive an error.
         * - If a priced Plan is used to bill any outstanding Commitment fees due and the Plan is
         *   set up with overage pricing on a _tiered pricing structure_ and you enable separate
         *   bill line items for overage usage, then overage usage charges will be rated according
         *   to the overage pricing defined for the tiered pricing on the Plan.
         */
        fun separateOverageUsage(separateOverageUsage: Boolean) = apply {
            body.separateOverageUsage(separateOverageUsage)
        }

        /**
         * Sets [Builder.separateOverageUsage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.separateOverageUsage] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun separateOverageUsage(separateOverageUsage: JsonField<Boolean>) = apply {
            body.separateOverageUsage(separateOverageUsage)
        }

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
         * Returns an immutable instance of [CommitmentUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .id()
         * .accountId()
         * .amount()
         * .currency()
         * .endDate()
         * .startDate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CommitmentUpdateParams =
            CommitmentUpdateParams(
                checkRequired("orgId", orgId),
                checkRequired("id", id),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * If the Account is either a Parent or a Child Account, this specifies the Account hierarchy
     * billing mode. The mode determines how billing will be handled and shown on bills for charges
     * due on the Parent Account, and charges due on Child Accounts:
     * - **Parent Breakdown** - a separate bill line item per Account. Default setting.
     * - **Parent Summary** - single bill line item for all Accounts.
     * - **Child** - the Child Account is billed.
     */
    class ChildBillingMode @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val PARENT_SUMMARY = of("PARENT_SUMMARY")

            @JvmField val PARENT_BREAKDOWN = of("PARENT_BREAKDOWN")

            @JvmField val CHILD = of("CHILD")

            @JvmStatic fun of(value: String) = ChildBillingMode(JsonField.of(value))
        }

        /** An enum containing [ChildBillingMode]'s known values. */
        enum class Known {
            PARENT_SUMMARY,
            PARENT_BREAKDOWN,
            CHILD,
        }

        /**
         * An enum containing [ChildBillingMode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ChildBillingMode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PARENT_SUMMARY,
            PARENT_BREAKDOWN,
            CHILD,
            /**
             * An enum member indicating that [ChildBillingMode] was instantiated with an unknown
             * value.
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
                PARENT_SUMMARY -> Value.PARENT_SUMMARY
                PARENT_BREAKDOWN -> Value.PARENT_BREAKDOWN
                CHILD -> Value.CHILD
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
                PARENT_SUMMARY -> Known.PARENT_SUMMARY
                PARENT_BREAKDOWN -> Known.PARENT_BREAKDOWN
                CHILD -> Known.CHILD
                else -> throw M3terInvalidDataException("Unknown ChildBillingMode: $value")
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

            return /* spotless:off */ other is ChildBillingMode && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Available line item types for Commitments */
    class LineItemType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val STANDING_CHARGE = of("STANDING_CHARGE")

            @JvmField val USAGE = of("USAGE")

            @JvmField val MINIMUM_SPEND = of("MINIMUM_SPEND")

            @JvmField val COUNTER_RUNNING_TOTAL_CHARGE = of("COUNTER_RUNNING_TOTAL_CHARGE")

            @JvmField val COUNTER_ADJUSTMENT_DEBIT = of("COUNTER_ADJUSTMENT_DEBIT")

            @JvmStatic fun of(value: String) = LineItemType(JsonField.of(value))
        }

        /** An enum containing [LineItemType]'s known values. */
        enum class Known {
            STANDING_CHARGE,
            USAGE,
            MINIMUM_SPEND,
            COUNTER_RUNNING_TOTAL_CHARGE,
            COUNTER_ADJUSTMENT_DEBIT,
        }

        /**
         * An enum containing [LineItemType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [LineItemType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            STANDING_CHARGE,
            USAGE,
            MINIMUM_SPEND,
            COUNTER_RUNNING_TOTAL_CHARGE,
            COUNTER_ADJUSTMENT_DEBIT,
            /**
             * An enum member indicating that [LineItemType] was instantiated with an unknown value.
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
                STANDING_CHARGE -> Value.STANDING_CHARGE
                USAGE -> Value.USAGE
                MINIMUM_SPEND -> Value.MINIMUM_SPEND
                COUNTER_RUNNING_TOTAL_CHARGE -> Value.COUNTER_RUNNING_TOTAL_CHARGE
                COUNTER_ADJUSTMENT_DEBIT -> Value.COUNTER_ADJUSTMENT_DEBIT
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
                STANDING_CHARGE -> Known.STANDING_CHARGE
                USAGE -> Known.USAGE
                MINIMUM_SPEND -> Known.MINIMUM_SPEND
                COUNTER_RUNNING_TOTAL_CHARGE -> Known.COUNTER_RUNNING_TOTAL_CHARGE
                COUNTER_ADJUSTMENT_DEBIT -> Known.COUNTER_ADJUSTMENT_DEBIT
                else -> throw M3terInvalidDataException("Unknown LineItemType: $value")
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

            return /* spotless:off */ other is LineItemType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CommitmentUpdateParams && orgId == other.orgId && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CommitmentUpdateParams{orgId=$orgId, id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
