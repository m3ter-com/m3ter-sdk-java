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
import com.m3ter.sdk.core.checkKnown
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CommitmentResponse
private constructor(
    private val id: JsonField<String>,
    private val version: JsonField<Long>,
    private val accountId: JsonField<String>,
    private val accountingProductId: JsonField<String>,
    private val amount: JsonField<Double>,
    private val amountFirstBill: JsonField<Double>,
    private val amountPrePaid: JsonField<Double>,
    private val amountSpent: JsonField<Double>,
    private val billEpoch: JsonField<LocalDate>,
    private val billingInterval: JsonField<Long>,
    private val billingOffset: JsonField<Long>,
    private val billingPlanId: JsonField<String>,
    private val childBillingMode: JsonField<ChildBillingMode>,
    private val commitmentFeeBillInAdvance: JsonField<Boolean>,
    private val commitmentFeeDescription: JsonField<String>,
    private val commitmentUsageDescription: JsonField<String>,
    private val contractId: JsonField<String>,
    private val createdBy: JsonField<String>,
    private val currency: JsonField<String>,
    private val drawdownsAccountingProductId: JsonField<String>,
    private val dtCreated: JsonField<OffsetDateTime>,
    private val dtLastModified: JsonField<OffsetDateTime>,
    private val endDate: JsonField<LocalDate>,
    private val feeDates: JsonField<List<CommitmentFee>>,
    private val feesAccountingProductId: JsonField<String>,
    private val lastModifiedBy: JsonField<String>,
    private val lineItemTypes: JsonField<List<LineItemType>>,
    private val overageDescription: JsonField<String>,
    private val overageSurchargePercent: JsonField<Double>,
    private val productIds: JsonField<List<String>>,
    private val separateOverageUsage: JsonField<Boolean>,
    private val startDate: JsonField<LocalDate>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("accountId") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accountingProductId")
        @ExcludeMissing
        accountingProductId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("amountFirstBill")
        @ExcludeMissing
        amountFirstBill: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("amountPrePaid")
        @ExcludeMissing
        amountPrePaid: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("amountSpent")
        @ExcludeMissing
        amountSpent: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("billEpoch")
        @ExcludeMissing
        billEpoch: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("billingInterval")
        @ExcludeMissing
        billingInterval: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("billingOffset")
        @ExcludeMissing
        billingOffset: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("billingPlanId")
        @ExcludeMissing
        billingPlanId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("childBillingMode")
        @ExcludeMissing
        childBillingMode: JsonField<ChildBillingMode> = JsonMissing.of(),
        @JsonProperty("commitmentFeeBillInAdvance")
        @ExcludeMissing
        commitmentFeeBillInAdvance: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("commitmentFeeDescription")
        @ExcludeMissing
        commitmentFeeDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("commitmentUsageDescription")
        @ExcludeMissing
        commitmentUsageDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contractId")
        @ExcludeMissing
        contractId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("drawdownsAccountingProductId")
        @ExcludeMissing
        drawdownsAccountingProductId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dtCreated")
        @ExcludeMissing
        dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("endDate") @ExcludeMissing endDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("feeDates")
        @ExcludeMissing
        feeDates: JsonField<List<CommitmentFee>> = JsonMissing.of(),
        @JsonProperty("feesAccountingProductId")
        @ExcludeMissing
        feesAccountingProductId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        lastModifiedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lineItemTypes")
        @ExcludeMissing
        lineItemTypes: JsonField<List<LineItemType>> = JsonMissing.of(),
        @JsonProperty("overageDescription")
        @ExcludeMissing
        overageDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("overageSurchargePercent")
        @ExcludeMissing
        overageSurchargePercent: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("productIds")
        @ExcludeMissing
        productIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("separateOverageUsage")
        @ExcludeMissing
        separateOverageUsage: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("startDate")
        @ExcludeMissing
        startDate: JsonField<LocalDate> = JsonMissing.of(),
    ) : this(
        id,
        version,
        accountId,
        accountingProductId,
        amount,
        amountFirstBill,
        amountPrePaid,
        amountSpent,
        billEpoch,
        billingInterval,
        billingOffset,
        billingPlanId,
        childBillingMode,
        commitmentFeeBillInAdvance,
        commitmentFeeDescription,
        commitmentUsageDescription,
        contractId,
        createdBy,
        currency,
        drawdownsAccountingProductId,
        dtCreated,
        dtLastModified,
        endDate,
        feeDates,
        feesAccountingProductId,
        lastModifiedBy,
        lineItemTypes,
        overageDescription,
        overageSurchargePercent,
        productIds,
        separateOverageUsage,
        startDate,
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
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun version(): Long = version.getRequired("version")

    /**
     * The unique identifier (UUID) for the end customer Account the Commitment is added to.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountId(): Optional<String> = Optional.ofNullable(accountId.getNullable("accountId"))

    /**
     * The unique identifier (UUID) for the Product linked to the Commitment for accounting
     * purposes.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountingProductId(): Optional<String> =
        Optional.ofNullable(accountingProductId.getNullable("accountingProductId"))

    /**
     * The total amount that the customer has committed to pay.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amount(): Optional<Double> = Optional.ofNullable(amount.getNullable("amount"))

    /**
     * The amount to be billed in the first invoice.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amountFirstBill(): Optional<Double> =
        Optional.ofNullable(amountFirstBill.getNullable("amountFirstBill"))

    /**
     * The amount that the customer has already paid upfront at the start of the Commitment service
     * period.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amountPrePaid(): Optional<Double> =
        Optional.ofNullable(amountPrePaid.getNullable("amountPrePaid"))

    /**
     * The total amount of the Commitment that the customer has spent so far.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amountSpent(): Optional<Double> =
        Optional.ofNullable(amountSpent.getNullable("amountSpent"))

    /**
     * The starting date _(in ISO-8601 date format)_ from which the billing cycles are calculated.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billEpoch(): Optional<LocalDate> = Optional.ofNullable(billEpoch.getNullable("billEpoch"))

    /**
     * How often the Commitment fees are applied to bills. For example, if the plan being used to
     * bill for Commitment fees is set to issue bills every three months and the `billingInterval`
     * is set to 2, then the Commitment fees are applied every six months.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingInterval(): Optional<Long> =
        Optional.ofNullable(billingInterval.getNullable("billingInterval"))

    /**
     * The offset for when the Commitment fees are first applied to bills on the Account. For
     * example, if bills are issued every three months and the `billingOffset` is 0, then the charge
     * is applied to the first bill (at three months); if set to 1, it's applied to the next bill
     * (at six months), and so on.
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
    fun childBillingMode(): Optional<ChildBillingMode> =
        Optional.ofNullable(childBillingMode.getNullable("childBillingMode"))

    /**
     * A boolean value indicating whether the Commitment fee is billed in advance _(start of each
     * billing period)_ or arrears _(end of each billing period)_.
     * - **TRUE** - bill in advance _(start of each billing period)_.
     * - **FALSE** - bill in arrears _(end of each billing period)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commitmentFeeBillInAdvance(): Optional<Boolean> =
        Optional.ofNullable(commitmentFeeBillInAdvance.getNullable("commitmentFeeBillInAdvance"))

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
        Optional.ofNullable(commitmentUsageDescription.getNullable("commitmentUsageDescription"))

    /**
     * The unique identifier (UUID) for a Contract you've created for the Account and to which the
     * Commitment has been added.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contractId(): Optional<String> = Optional.ofNullable(contractId.getNullable("contractId"))

    /**
     * The unique identifier (UUID) of the user who created this Commitment.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /**
     * The currency used for the Commitment. For example, 'USD'.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun drawdownsAccountingProductId(): Optional<String> =
        Optional.ofNullable(
            drawdownsAccountingProductId.getNullable("drawdownsAccountingProductId")
        )

    /**
     * The date and time _(in ISO-8601 format)_ when the Commitment was created.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /**
     * The date and time _(in ISO-8601 format)_ when the Commitment was last modified.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /**
     * The end date of the Commitment period in ISO-8601 format.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endDate(): Optional<LocalDate> = Optional.ofNullable(endDate.getNullable("endDate"))

    /**
     * Used for billing any outstanding Commitment fees _on a schedule_.
     *
     * An array defining a series of bill dates and amounts covering specified service periods:
     * - `date` - the billing date _(in ISO-8601 format)_.
     * - `amount` - the billed amount.
     * - `servicePeriodStartDate` and `servicePeriodEndDate` - defines the service period the bill
     *   covers _(in ISO-8601 format)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun feeDates(): Optional<List<CommitmentFee>> =
        Optional.ofNullable(feeDates.getNullable("feeDates"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun feesAccountingProductId(): Optional<String> =
        Optional.ofNullable(feesAccountingProductId.getNullable("feesAccountingProductId"))

    /**
     * The unique identifier (UUID) of the user who last modified this Commitment.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /**
     * Specifies the line item charge types that can draw-down at billing against the Commitment
     * amount. Options are:
     * - `MINIMUM_SPEND`
     * - `STANDING_CHARGE`
     * - `USAGE`
     * - `"COUNTER_RUNNING_TOTAL_CHARGE"`
     * - `"COUNTER_ADJUSTMENT_DEBIT"`
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
     * The percentage surcharge applied to the usage charges that exceed the Commitment amount.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overageSurchargePercent(): Optional<Double> =
        Optional.ofNullable(overageSurchargePercent.getNullable("overageSurchargePercent"))

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
    fun productIds(): Optional<List<String>> =
        Optional.ofNullable(productIds.getNullable("productIds"))

    /**
     * A boolean value indicating whether the overage usage is billed separately or together. If
     * overage usage is separated and a Commitment amount has been consumed by an Account, any
     * subsequent line items on Bills against the Account for usage will show as separate "overage
     * usage" charges, not simply as "usage" charges:
     * - **TRUE** - billed separately.
     * - **FALSE** - billed together.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun separateOverageUsage(): Optional<Boolean> =
        Optional.ofNullable(separateOverageUsage.getNullable("separateOverageUsage"))

    /**
     * The start date of the Commitment period in ISO-8601 format.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startDate(): Optional<LocalDate> = Optional.ofNullable(startDate.getNullable("startDate"))

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

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
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

    /**
     * Returns the raw JSON value of [amountFirstBill].
     *
     * Unlike [amountFirstBill], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amountFirstBill")
    @ExcludeMissing
    fun _amountFirstBill(): JsonField<Double> = amountFirstBill

    /**
     * Returns the raw JSON value of [amountPrePaid].
     *
     * Unlike [amountPrePaid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amountPrePaid")
    @ExcludeMissing
    fun _amountPrePaid(): JsonField<Double> = amountPrePaid

    /**
     * Returns the raw JSON value of [amountSpent].
     *
     * Unlike [amountSpent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amountSpent") @ExcludeMissing fun _amountSpent(): JsonField<Double> = amountSpent

    /**
     * Returns the raw JSON value of [billEpoch].
     *
     * Unlike [billEpoch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billEpoch") @ExcludeMissing fun _billEpoch(): JsonField<LocalDate> = billEpoch

    /**
     * Returns the raw JSON value of [billingInterval].
     *
     * Unlike [billingInterval], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billingInterval")
    @ExcludeMissing
    fun _billingInterval(): JsonField<Long> = billingInterval

    /**
     * Returns the raw JSON value of [billingOffset].
     *
     * Unlike [billingOffset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billingOffset")
    @ExcludeMissing
    fun _billingOffset(): JsonField<Long> = billingOffset

    /**
     * Returns the raw JSON value of [billingPlanId].
     *
     * Unlike [billingPlanId], this method doesn't throw if the JSON field has an unexpected type.
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
    @JsonProperty("contractId") @ExcludeMissing fun _contractId(): JsonField<String> = contractId

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

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
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<LocalDate> = endDate

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
     * Returns the raw JSON value of [lastModifiedBy].
     *
     * Unlike [lastModifiedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /**
     * Returns the raw JSON value of [lineItemTypes].
     *
     * Unlike [lineItemTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lineItemTypes")
    @ExcludeMissing
    fun _lineItemTypes(): JsonField<List<LineItemType>> = lineItemTypes

    /**
     * Returns the raw JSON value of [overageDescription].
     *
     * Unlike [overageDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
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
     * Unlike [separateOverageUsage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("separateOverageUsage")
    @ExcludeMissing
    fun _separateOverageUsage(): JsonField<Boolean> = separateOverageUsage

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startDate") @ExcludeMissing fun _startDate(): JsonField<LocalDate> = startDate

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
         * Returns a mutable builder for constructing an instance of [CommitmentResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommitmentResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var accountId: JsonField<String> = JsonMissing.of()
        private var accountingProductId: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Double> = JsonMissing.of()
        private var amountFirstBill: JsonField<Double> = JsonMissing.of()
        private var amountPrePaid: JsonField<Double> = JsonMissing.of()
        private var amountSpent: JsonField<Double> = JsonMissing.of()
        private var billEpoch: JsonField<LocalDate> = JsonMissing.of()
        private var billingInterval: JsonField<Long> = JsonMissing.of()
        private var billingOffset: JsonField<Long> = JsonMissing.of()
        private var billingPlanId: JsonField<String> = JsonMissing.of()
        private var childBillingMode: JsonField<ChildBillingMode> = JsonMissing.of()
        private var commitmentFeeBillInAdvance: JsonField<Boolean> = JsonMissing.of()
        private var commitmentFeeDescription: JsonField<String> = JsonMissing.of()
        private var commitmentUsageDescription: JsonField<String> = JsonMissing.of()
        private var contractId: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var drawdownsAccountingProductId: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var endDate: JsonField<LocalDate> = JsonMissing.of()
        private var feeDates: JsonField<MutableList<CommitmentFee>>? = null
        private var feesAccountingProductId: JsonField<String> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var lineItemTypes: JsonField<MutableList<LineItemType>>? = null
        private var overageDescription: JsonField<String> = JsonMissing.of()
        private var overageSurchargePercent: JsonField<Double> = JsonMissing.of()
        private var productIds: JsonField<MutableList<String>>? = null
        private var separateOverageUsage: JsonField<Boolean> = JsonMissing.of()
        private var startDate: JsonField<LocalDate> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(commitmentResponse: CommitmentResponse) = apply {
            id = commitmentResponse.id
            version = commitmentResponse.version
            accountId = commitmentResponse.accountId
            accountingProductId = commitmentResponse.accountingProductId
            amount = commitmentResponse.amount
            amountFirstBill = commitmentResponse.amountFirstBill
            amountPrePaid = commitmentResponse.amountPrePaid
            amountSpent = commitmentResponse.amountSpent
            billEpoch = commitmentResponse.billEpoch
            billingInterval = commitmentResponse.billingInterval
            billingOffset = commitmentResponse.billingOffset
            billingPlanId = commitmentResponse.billingPlanId
            childBillingMode = commitmentResponse.childBillingMode
            commitmentFeeBillInAdvance = commitmentResponse.commitmentFeeBillInAdvance
            commitmentFeeDescription = commitmentResponse.commitmentFeeDescription
            commitmentUsageDescription = commitmentResponse.commitmentUsageDescription
            contractId = commitmentResponse.contractId
            createdBy = commitmentResponse.createdBy
            currency = commitmentResponse.currency
            drawdownsAccountingProductId = commitmentResponse.drawdownsAccountingProductId
            dtCreated = commitmentResponse.dtCreated
            dtLastModified = commitmentResponse.dtLastModified
            endDate = commitmentResponse.endDate
            feeDates = commitmentResponse.feeDates.map { it.toMutableList() }
            feesAccountingProductId = commitmentResponse.feesAccountingProductId
            lastModifiedBy = commitmentResponse.lastModifiedBy
            lineItemTypes = commitmentResponse.lineItemTypes.map { it.toMutableList() }
            overageDescription = commitmentResponse.overageDescription
            overageSurchargePercent = commitmentResponse.overageSurchargePercent
            productIds = commitmentResponse.productIds.map { it.toMutableList() }
            separateOverageUsage = commitmentResponse.separateOverageUsage
            startDate = commitmentResponse.startDate
            additionalProperties = commitmentResponse.additionalProperties.toMutableMap()
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

        /** The unique identifier (UUID) for the end customer Account the Commitment is added to. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * The unique identifier (UUID) for the Product linked to the Commitment for accounting
         * purposes.
         */
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

        /** The total amount that the customer has committed to pay. */
        fun amount(amount: Double) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

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
         * You should usually call [Builder.amountPrePaid] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun amountPrePaid(amountPrePaid: JsonField<Double>) = apply {
            this.amountPrePaid = amountPrePaid
        }

        /** The total amount of the Commitment that the customer has spent so far. */
        fun amountSpent(amountSpent: Double) = amountSpent(JsonField.of(amountSpent))

        /**
         * Sets [Builder.amountSpent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountSpent] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun amountSpent(amountSpent: JsonField<Double>) = apply { this.amountSpent = amountSpent }

        /**
         * The starting date _(in ISO-8601 date format)_ from which the billing cycles are
         * calculated.
         */
        fun billEpoch(billEpoch: LocalDate) = billEpoch(JsonField.of(billEpoch))

        /**
         * Sets [Builder.billEpoch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billEpoch] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun billEpoch(billEpoch: JsonField<LocalDate>) = apply { this.billEpoch = billEpoch }

        /**
         * How often the Commitment fees are applied to bills. For example, if the plan being used
         * to bill for Commitment fees is set to issue bills every three months and the
         * `billingInterval` is set to 2, then the Commitment fees are applied every six months.
         */
        fun billingInterval(billingInterval: Long) = billingInterval(JsonField.of(billingInterval))

        /**
         * Sets [Builder.billingInterval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingInterval] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun billingInterval(billingInterval: JsonField<Long>) = apply {
            this.billingInterval = billingInterval
        }

        /**
         * The offset for when the Commitment fees are first applied to bills on the Account. For
         * example, if bills are issued every three months and the `billingOffset` is 0, then the
         * charge is applied to the first bill (at three months); if set to 1, it's applied to the
         * next bill (at six months), and so on.
         */
        fun billingOffset(billingOffset: Long) = billingOffset(JsonField.of(billingOffset))

        /**
         * Sets [Builder.billingOffset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingOffset] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun billingOffset(billingOffset: JsonField<Long>) = apply {
            this.billingOffset = billingOffset
        }

        /**
         * The unique identifier (UUID) for the Product Plan used for billing Commitment fees due.
         */
        fun billingPlanId(billingPlanId: String) = billingPlanId(JsonField.of(billingPlanId))

        /**
         * Sets [Builder.billingPlanId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingPlanId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * You should usually call [Builder.childBillingMode] with a well-typed [ChildBillingMode]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun childBillingMode(childBillingMode: JsonField<ChildBillingMode>) = apply {
            this.childBillingMode = childBillingMode
        }

        /**
         * A boolean value indicating whether the Commitment fee is billed in advance _(start of
         * each billing period)_ or arrears _(end of each billing period)_.
         * - **TRUE** - bill in advance _(start of each billing period)_.
         * - **FALSE** - bill in arrears _(end of each billing period)_.
         */
        fun commitmentFeeBillInAdvance(commitmentFeeBillInAdvance: Boolean) =
            commitmentFeeBillInAdvance(JsonField.of(commitmentFeeBillInAdvance))

        /**
         * Sets [Builder.commitmentFeeBillInAdvance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commitmentFeeBillInAdvance] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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
         * You should usually call [Builder.commitmentUsageDescription] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun commitmentUsageDescription(commitmentUsageDescription: JsonField<String>) = apply {
            this.commitmentUsageDescription = commitmentUsageDescription
        }

        /**
         * The unique identifier (UUID) for a Contract you've created for the Account and to which
         * the Commitment has been added.
         */
        fun contractId(contractId: String) = contractId(JsonField.of(contractId))

        /**
         * Sets [Builder.contractId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contractId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

        /** The unique identifier (UUID) of the user who created this Commitment. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The currency used for the Commitment. For example, 'USD'. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        fun drawdownsAccountingProductId(drawdownsAccountingProductId: String) =
            drawdownsAccountingProductId(JsonField.of(drawdownsAccountingProductId))

        /**
         * Sets [Builder.drawdownsAccountingProductId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.drawdownsAccountingProductId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun drawdownsAccountingProductId(drawdownsAccountingProductId: JsonField<String>) = apply {
            this.drawdownsAccountingProductId = drawdownsAccountingProductId
        }

        /** The date and time _(in ISO-8601 format)_ when the Commitment was created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /**
         * Sets [Builder.dtCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The date and time _(in ISO-8601 format)_ when the Commitment was last modified. */
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

        /** The end date of the Commitment period in ISO-8601 format. */
        fun endDate(endDate: LocalDate) = endDate(JsonField.of(endDate))

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endDate(endDate: JsonField<LocalDate>) = apply { this.endDate = endDate }

        /**
         * Used for billing any outstanding Commitment fees _on a schedule_.
         *
         * An array defining a series of bill dates and amounts covering specified service periods:
         * - `date` - the billing date _(in ISO-8601 format)_.
         * - `amount` - the billed amount.
         * - `servicePeriodStartDate` and `servicePeriodEndDate` - defines the service period the
         *   bill covers _(in ISO-8601 format)_.
         */
        fun feeDates(feeDates: List<CommitmentFee>) = feeDates(JsonField.of(feeDates))

        /**
         * Sets [Builder.feeDates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feeDates] with a well-typed `List<CommitmentFee>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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

        fun feesAccountingProductId(feesAccountingProductId: String) =
            feesAccountingProductId(JsonField.of(feesAccountingProductId))

        /**
         * Sets [Builder.feesAccountingProductId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feesAccountingProductId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun feesAccountingProductId(feesAccountingProductId: JsonField<String>) = apply {
            this.feesAccountingProductId = feesAccountingProductId
        }

        /** The unique identifier (UUID) of the user who last modified this Commitment. */
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
         * Specifies the line item charge types that can draw-down at billing against the Commitment
         * amount. Options are:
         * - `MINIMUM_SPEND`
         * - `STANDING_CHARGE`
         * - `USAGE`
         * - `"COUNTER_RUNNING_TOTAL_CHARGE"`
         * - `"COUNTER_ADJUSTMENT_DEBIT"`
         */
        fun lineItemTypes(lineItemTypes: List<LineItemType>) =
            lineItemTypes(JsonField.of(lineItemTypes))

        /**
         * Sets [Builder.lineItemTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lineItemTypes] with a well-typed `List<LineItemType>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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
         * The percentage surcharge applied to the usage charges that exceed the Commitment amount.
         */
        fun overageSurchargePercent(overageSurchargePercent: Double) =
            overageSurchargePercent(JsonField.of(overageSurchargePercent))

        /**
         * Sets [Builder.overageSurchargePercent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overageSurchargePercent] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun overageSurchargePercent(overageSurchargePercent: JsonField<Double>) = apply {
            this.overageSurchargePercent = overageSurchargePercent
        }

        /**
         * A list of unique identifiers (UUIDs) for Products the Account consumes. Charges due for
         * these Products will be made available for draw-down against the Commitment.
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
         * A boolean value indicating whether the overage usage is billed separately or together. If
         * overage usage is separated and a Commitment amount has been consumed by an Account, any
         * subsequent line items on Bills against the Account for usage will show as separate
         * "overage usage" charges, not simply as "usage" charges:
         * - **TRUE** - billed separately.
         * - **FALSE** - billed together.
         */
        fun separateOverageUsage(separateOverageUsage: Boolean) =
            separateOverageUsage(JsonField.of(separateOverageUsage))

        /**
         * Sets [Builder.separateOverageUsage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.separateOverageUsage] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun separateOverageUsage(separateOverageUsage: JsonField<Boolean>) = apply {
            this.separateOverageUsage = separateOverageUsage
        }

        /** The start date of the Commitment period in ISO-8601 format. */
        fun startDate(startDate: LocalDate) = startDate(JsonField.of(startDate))

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startDate(startDate: JsonField<LocalDate>) = apply { this.startDate = startDate }

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
         * Returns an immutable instance of [CommitmentResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .version()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CommitmentResponse =
            CommitmentResponse(
                checkRequired("id", id),
                checkRequired("version", version),
                accountId,
                accountingProductId,
                amount,
                amountFirstBill,
                amountPrePaid,
                amountSpent,
                billEpoch,
                billingInterval,
                billingOffset,
                billingPlanId,
                childBillingMode,
                commitmentFeeBillInAdvance,
                commitmentFeeDescription,
                commitmentUsageDescription,
                contractId,
                createdBy,
                currency,
                drawdownsAccountingProductId,
                dtCreated,
                dtLastModified,
                endDate,
                (feeDates ?: JsonMissing.of()).map { it.toImmutable() },
                feesAccountingProductId,
                lastModifiedBy,
                (lineItemTypes ?: JsonMissing.of()).map { it.toImmutable() },
                overageDescription,
                overageSurchargePercent,
                (productIds ?: JsonMissing.of()).map { it.toImmutable() },
                separateOverageUsage,
                startDate,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CommitmentResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        version()
        accountId()
        accountingProductId()
        amount()
        amountFirstBill()
        amountPrePaid()
        amountSpent()
        billEpoch()
        billingInterval()
        billingOffset()
        billingPlanId()
        childBillingMode().ifPresent { it.validate() }
        commitmentFeeBillInAdvance()
        commitmentFeeDescription()
        commitmentUsageDescription()
        contractId()
        createdBy()
        currency()
        drawdownsAccountingProductId()
        dtCreated()
        dtLastModified()
        endDate()
        feeDates().ifPresent { it.forEach { it.validate() } }
        feesAccountingProductId()
        lastModifiedBy()
        lineItemTypes().ifPresent { it.forEach { it.validate() } }
        overageDescription()
        overageSurchargePercent()
        productIds()
        separateOverageUsage()
        startDate()
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
            (if (version.asKnown().isPresent) 1 else 0) +
            (if (accountId.asKnown().isPresent) 1 else 0) +
            (if (accountingProductId.asKnown().isPresent) 1 else 0) +
            (if (amount.asKnown().isPresent) 1 else 0) +
            (if (amountFirstBill.asKnown().isPresent) 1 else 0) +
            (if (amountPrePaid.asKnown().isPresent) 1 else 0) +
            (if (amountSpent.asKnown().isPresent) 1 else 0) +
            (if (billEpoch.asKnown().isPresent) 1 else 0) +
            (if (billingInterval.asKnown().isPresent) 1 else 0) +
            (if (billingOffset.asKnown().isPresent) 1 else 0) +
            (if (billingPlanId.asKnown().isPresent) 1 else 0) +
            (childBillingMode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (commitmentFeeBillInAdvance.asKnown().isPresent) 1 else 0) +
            (if (commitmentFeeDescription.asKnown().isPresent) 1 else 0) +
            (if (commitmentUsageDescription.asKnown().isPresent) 1 else 0) +
            (if (contractId.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (if (drawdownsAccountingProductId.asKnown().isPresent) 1 else 0) +
            (if (dtCreated.asKnown().isPresent) 1 else 0) +
            (if (dtLastModified.asKnown().isPresent) 1 else 0) +
            (if (endDate.asKnown().isPresent) 1 else 0) +
            (feeDates.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (feesAccountingProductId.asKnown().isPresent) 1 else 0) +
            (if (lastModifiedBy.asKnown().isPresent) 1 else 0) +
            (lineItemTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (overageDescription.asKnown().isPresent) 1 else 0) +
            (if (overageSurchargePercent.asKnown().isPresent) 1 else 0) +
            (productIds.asKnown().getOrNull()?.size ?: 0) +
            (if (separateOverageUsage.asKnown().isPresent) 1 else 0) +
            (if (startDate.asKnown().isPresent) 1 else 0)

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

        private var validated: Boolean = false

        fun validate(): ChildBillingMode = apply {
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

        private var validated: Boolean = false

        fun validate(): LineItemType = apply {
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

            return /* spotless:off */ other is LineItemType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CommitmentResponse && id == other.id && version == other.version && accountId == other.accountId && accountingProductId == other.accountingProductId && amount == other.amount && amountFirstBill == other.amountFirstBill && amountPrePaid == other.amountPrePaid && amountSpent == other.amountSpent && billEpoch == other.billEpoch && billingInterval == other.billingInterval && billingOffset == other.billingOffset && billingPlanId == other.billingPlanId && childBillingMode == other.childBillingMode && commitmentFeeBillInAdvance == other.commitmentFeeBillInAdvance && commitmentFeeDescription == other.commitmentFeeDescription && commitmentUsageDescription == other.commitmentUsageDescription && contractId == other.contractId && createdBy == other.createdBy && currency == other.currency && drawdownsAccountingProductId == other.drawdownsAccountingProductId && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && endDate == other.endDate && feeDates == other.feeDates && feesAccountingProductId == other.feesAccountingProductId && lastModifiedBy == other.lastModifiedBy && lineItemTypes == other.lineItemTypes && overageDescription == other.overageDescription && overageSurchargePercent == other.overageSurchargePercent && productIds == other.productIds && separateOverageUsage == other.separateOverageUsage && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, accountId, accountingProductId, amount, amountFirstBill, amountPrePaid, amountSpent, billEpoch, billingInterval, billingOffset, billingPlanId, childBillingMode, commitmentFeeBillInAdvance, commitmentFeeDescription, commitmentUsageDescription, contractId, createdBy, currency, drawdownsAccountingProductId, dtCreated, dtLastModified, endDate, feeDates, feesAccountingProductId, lastModifiedBy, lineItemTypes, overageDescription, overageSurchargePercent, productIds, separateOverageUsage, startDate, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CommitmentResponse{id=$id, version=$version, accountId=$accountId, accountingProductId=$accountingProductId, amount=$amount, amountFirstBill=$amountFirstBill, amountPrePaid=$amountPrePaid, amountSpent=$amountSpent, billEpoch=$billEpoch, billingInterval=$billingInterval, billingOffset=$billingOffset, billingPlanId=$billingPlanId, childBillingMode=$childBillingMode, commitmentFeeBillInAdvance=$commitmentFeeBillInAdvance, commitmentFeeDescription=$commitmentFeeDescription, commitmentUsageDescription=$commitmentUsageDescription, contractId=$contractId, createdBy=$createdBy, currency=$currency, drawdownsAccountingProductId=$drawdownsAccountingProductId, dtCreated=$dtCreated, dtLastModified=$dtLastModified, endDate=$endDate, feeDates=$feeDates, feesAccountingProductId=$feesAccountingProductId, lastModifiedBy=$lastModifiedBy, lineItemTypes=$lineItemTypes, overageDescription=$overageDescription, overageSurchargePercent=$overageSurchargePercent, productIds=$productIds, separateOverageUsage=$separateOverageUsage, startDate=$startDate, additionalProperties=$additionalProperties}"
}
