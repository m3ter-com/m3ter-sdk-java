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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class Commitment
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("accountId")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("accountingProductId")
    @ExcludeMissing
    private val accountingProductId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount")
    @ExcludeMissing
    private val amount: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("amountFirstBill")
    @ExcludeMissing
    private val amountFirstBill: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("amountPrePaid")
    @ExcludeMissing
    private val amountPrePaid: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("amountSpent")
    @ExcludeMissing
    private val amountSpent: JsonField<Double> = JsonMissing.of(),
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
    @JsonProperty("createdBy")
    @ExcludeMissing
    private val createdBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("drawdownsAccountingProductId")
    @ExcludeMissing
    private val drawdownsAccountingProductId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("dtCreated")
    @ExcludeMissing
    private val dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    private val dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("endDate")
    @ExcludeMissing
    private val endDate: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("feeDates")
    @ExcludeMissing
    private val feeDates: JsonField<List<CommitmentFee>> = JsonMissing.of(),
    @JsonProperty("feesAccountingProductId")
    @ExcludeMissing
    private val feesAccountingProductId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    private val lastModifiedBy: JsonField<String> = JsonMissing.of(),
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
    @JsonProperty("startDate")
    @ExcludeMissing
    private val startDate: JsonField<LocalDate> = JsonMissing.of(),
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

    /** The unique identifier (UUID) for the end customer Account the Commitment is added to. */
    fun accountId(): Optional<String> = Optional.ofNullable(accountId.getNullable("accountId"))

    /**
     * The unique identifier (UUID) for the Product linked to the Commitment for accounting
     * purposes.
     */
    fun accountingProductId(): Optional<String> =
        Optional.ofNullable(accountingProductId.getNullable("accountingProductId"))

    /** The total amount that the customer has committed to pay. */
    fun amount(): Optional<Double> = Optional.ofNullable(amount.getNullable("amount"))

    /** The amount to be billed in the first invoice. */
    fun amountFirstBill(): Optional<Double> =
        Optional.ofNullable(amountFirstBill.getNullable("amountFirstBill"))

    /**
     * The amount that the customer has already paid upfront at the start of the Commitment service
     * period.
     */
    fun amountPrePaid(): Optional<Double> =
        Optional.ofNullable(amountPrePaid.getNullable("amountPrePaid"))

    /** The total amount of the Commitment that the customer has spent so far. */
    fun amountSpent(): Optional<Double> =
        Optional.ofNullable(amountSpent.getNullable("amountSpent"))

    /**
     * The starting date _(in ISO-8601 date format)_ from which the billing cycles are calculated.
     */
    fun billEpoch(): Optional<LocalDate> = Optional.ofNullable(billEpoch.getNullable("billEpoch"))

    /**
     * How often the Commitment fees are applied to bills. For example, if the plan being used to
     * bill for Commitment fees is set to issue bills every three months and the `billingInterval`
     * is set to 2, then the Commitment fees are applied every six months.
     */
    fun billingInterval(): Optional<Long> =
        Optional.ofNullable(billingInterval.getNullable("billingInterval"))

    /**
     * The offset for when the Commitment fees are first applied to bills on the Account. For
     * example, if bills are issued every three months and the `billingOffset` is 0, then the charge
     * is applied to the first bill (at three months); if set to 1, it's applied to the next bill
     * (at six months), and so on.
     */
    fun billingOffset(): Optional<Long> =
        Optional.ofNullable(billingOffset.getNullable("billingOffset"))

    /** The unique identifier (UUID) for the Product Plan used for billing Commitment fees due. */
    fun billingPlanId(): Optional<String> =
        Optional.ofNullable(billingPlanId.getNullable("billingPlanId"))

    /**
     * If the Account is either a Parent or a Child Account, this specifies the Account hierarchy
     * billing mode. The mode determines how billing will be handled and shown on bills for charges
     * due on the Parent Account, and charges due on Child Accounts:
     * - **Parent Breakdown** - a separate bill line item per Account. Default setting.
     * - **Parent Summary** - single bill line item for all Accounts.
     * - **Child** - the Child Account is billed.
     */
    fun childBillingMode(): Optional<ChildBillingMode> =
        Optional.ofNullable(childBillingMode.getNullable("childBillingMode"))

    /**
     * A boolean value indicating whether the Commitment fee is billed in advance _(start of each
     * billing period)_ or arrears _(end of each billing period)_.
     * - **TRUE** - bill in advance _(start of each billing period)_.
     * - **FALSE** - bill in arrears _(end of each billing period)_.
     */
    fun commitmentFeeBillInAdvance(): Optional<Boolean> =
        Optional.ofNullable(commitmentFeeBillInAdvance.getNullable("commitmentFeeBillInAdvance"))

    /** A textual description of the Commitment fee. */
    fun commitmentFeeDescription(): Optional<String> =
        Optional.ofNullable(commitmentFeeDescription.getNullable("commitmentFeeDescription"))

    /** A textual description of the Commitment usage. */
    fun commitmentUsageDescription(): Optional<String> =
        Optional.ofNullable(commitmentUsageDescription.getNullable("commitmentUsageDescription"))

    /**
     * The unique identifier (UUID) for a Contract you've created for the Account and to which the
     * Commitment has been added.
     */
    fun contractId(): Optional<String> = Optional.ofNullable(contractId.getNullable("contractId"))

    /** The unique identifier (UUID) of the user who created this Commitment. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /** The currency used for the Commitment. For example, 'USD'. */
    fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

    fun drawdownsAccountingProductId(): Optional<String> =
        Optional.ofNullable(
            drawdownsAccountingProductId.getNullable("drawdownsAccountingProductId")
        )

    /** The date and time _(in ISO-8601 format)_ when the Commitment was created. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /** The date and time _(in ISO-8601 format)_ when the Commitment was last modified. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /** The end date of the Commitment period in ISO-8601 format. */
    fun endDate(): Optional<LocalDate> = Optional.ofNullable(endDate.getNullable("endDate"))

    /**
     * Used for billing any outstanding Commitment fees _on a schedule_.
     *
     * An array defining a series of bill dates and amounts covering specified service periods:
     * - `date` - the billing date _(in ISO-8601 format)_.
     * - `amount` - the billed amount.
     * - `servicePeriodStartDate` and `servicePeriodEndDate` - defines the service period the bill
     *   covers _(in ISO-8601 format)_.
     */
    fun feeDates(): Optional<List<CommitmentFee>> =
        Optional.ofNullable(feeDates.getNullable("feeDates"))

    fun feesAccountingProductId(): Optional<String> =
        Optional.ofNullable(feesAccountingProductId.getNullable("feesAccountingProductId"))

    /** The unique identifier (UUID) of the user who last modified this Commitment. */
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
     */
    fun lineItemTypes(): Optional<List<LineItemType>> =
        Optional.ofNullable(lineItemTypes.getNullable("lineItemTypes"))

    /** A textual description of the overage charges. */
    fun overageDescription(): Optional<String> =
        Optional.ofNullable(overageDescription.getNullable("overageDescription"))

    /** The percentage surcharge applied to the usage charges that exceed the Commitment amount. */
    fun overageSurchargePercent(): Optional<Double> =
        Optional.ofNullable(overageSurchargePercent.getNullable("overageSurchargePercent"))

    /**
     * A list of unique identifiers (UUIDs) for Products the Account consumes. Charges due for these
     * Products will be made available for draw-down against the Commitment.
     *
     * **Note:** If not used, then charges due for all Products the Account consumes will be made
     * available for draw-down against the Commitment.
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
     */
    fun separateOverageUsage(): Optional<Boolean> =
        Optional.ofNullable(separateOverageUsage.getNullable("separateOverageUsage"))

    /** The start date of the Commitment period in ISO-8601 format. */
    fun startDate(): Optional<LocalDate> = Optional.ofNullable(startDate.getNullable("startDate"))

    /** The UUID of the entity. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    /** The unique identifier (UUID) for the end customer Account the Commitment is added to. */
    @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * The unique identifier (UUID) for the Product linked to the Commitment for accounting
     * purposes.
     */
    @JsonProperty("accountingProductId")
    @ExcludeMissing
    fun _accountingProductId(): JsonField<String> = accountingProductId

    /** The total amount that the customer has committed to pay. */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

    /** The amount to be billed in the first invoice. */
    @JsonProperty("amountFirstBill")
    @ExcludeMissing
    fun _amountFirstBill(): JsonField<Double> = amountFirstBill

    /**
     * The amount that the customer has already paid upfront at the start of the Commitment service
     * period.
     */
    @JsonProperty("amountPrePaid")
    @ExcludeMissing
    fun _amountPrePaid(): JsonField<Double> = amountPrePaid

    /** The total amount of the Commitment that the customer has spent so far. */
    @JsonProperty("amountSpent") @ExcludeMissing fun _amountSpent(): JsonField<Double> = amountSpent

    /**
     * The starting date _(in ISO-8601 date format)_ from which the billing cycles are calculated.
     */
    @JsonProperty("billEpoch") @ExcludeMissing fun _billEpoch(): JsonField<LocalDate> = billEpoch

    /**
     * How often the Commitment fees are applied to bills. For example, if the plan being used to
     * bill for Commitment fees is set to issue bills every three months and the `billingInterval`
     * is set to 2, then the Commitment fees are applied every six months.
     */
    @JsonProperty("billingInterval")
    @ExcludeMissing
    fun _billingInterval(): JsonField<Long> = billingInterval

    /**
     * The offset for when the Commitment fees are first applied to bills on the Account. For
     * example, if bills are issued every three months and the `billingOffset` is 0, then the charge
     * is applied to the first bill (at three months); if set to 1, it's applied to the next bill
     * (at six months), and so on.
     */
    @JsonProperty("billingOffset")
    @ExcludeMissing
    fun _billingOffset(): JsonField<Long> = billingOffset

    /** The unique identifier (UUID) for the Product Plan used for billing Commitment fees due. */
    @JsonProperty("billingPlanId")
    @ExcludeMissing
    fun _billingPlanId(): JsonField<String> = billingPlanId

    /**
     * If the Account is either a Parent or a Child Account, this specifies the Account hierarchy
     * billing mode. The mode determines how billing will be handled and shown on bills for charges
     * due on the Parent Account, and charges due on Child Accounts:
     * - **Parent Breakdown** - a separate bill line item per Account. Default setting.
     * - **Parent Summary** - single bill line item for all Accounts.
     * - **Child** - the Child Account is billed.
     */
    @JsonProperty("childBillingMode")
    @ExcludeMissing
    fun _childBillingMode(): JsonField<ChildBillingMode> = childBillingMode

    /**
     * A boolean value indicating whether the Commitment fee is billed in advance _(start of each
     * billing period)_ or arrears _(end of each billing period)_.
     * - **TRUE** - bill in advance _(start of each billing period)_.
     * - **FALSE** - bill in arrears _(end of each billing period)_.
     */
    @JsonProperty("commitmentFeeBillInAdvance")
    @ExcludeMissing
    fun _commitmentFeeBillInAdvance(): JsonField<Boolean> = commitmentFeeBillInAdvance

    /** A textual description of the Commitment fee. */
    @JsonProperty("commitmentFeeDescription")
    @ExcludeMissing
    fun _commitmentFeeDescription(): JsonField<String> = commitmentFeeDescription

    /** A textual description of the Commitment usage. */
    @JsonProperty("commitmentUsageDescription")
    @ExcludeMissing
    fun _commitmentUsageDescription(): JsonField<String> = commitmentUsageDescription

    /**
     * The unique identifier (UUID) for a Contract you've created for the Account and to which the
     * Commitment has been added.
     */
    @JsonProperty("contractId") @ExcludeMissing fun _contractId(): JsonField<String> = contractId

    /** The unique identifier (UUID) of the user who created this Commitment. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /** The currency used for the Commitment. For example, 'USD'. */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    @JsonProperty("drawdownsAccountingProductId")
    @ExcludeMissing
    fun _drawdownsAccountingProductId(): JsonField<String> = drawdownsAccountingProductId

    /** The date and time _(in ISO-8601 format)_ when the Commitment was created. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /** The date and time _(in ISO-8601 format)_ when the Commitment was last modified. */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /** The end date of the Commitment period in ISO-8601 format. */
    @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<LocalDate> = endDate

    /**
     * Used for billing any outstanding Commitment fees _on a schedule_.
     *
     * An array defining a series of bill dates and amounts covering specified service periods:
     * - `date` - the billing date _(in ISO-8601 format)_.
     * - `amount` - the billed amount.
     * - `servicePeriodStartDate` and `servicePeriodEndDate` - defines the service period the bill
     *   covers _(in ISO-8601 format)_.
     */
    @JsonProperty("feeDates")
    @ExcludeMissing
    fun _feeDates(): JsonField<List<CommitmentFee>> = feeDates

    @JsonProperty("feesAccountingProductId")
    @ExcludeMissing
    fun _feesAccountingProductId(): JsonField<String> = feesAccountingProductId

    /** The unique identifier (UUID) of the user who last modified this Commitment. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /**
     * Specifies the line item charge types that can draw-down at billing against the Commitment
     * amount. Options are:
     * - `MINIMUM_SPEND`
     * - `STANDING_CHARGE`
     * - `USAGE`
     * - `"COUNTER_RUNNING_TOTAL_CHARGE"`
     * - `"COUNTER_ADJUSTMENT_DEBIT"`
     */
    @JsonProperty("lineItemTypes")
    @ExcludeMissing
    fun _lineItemTypes(): JsonField<List<LineItemType>> = lineItemTypes

    /** A textual description of the overage charges. */
    @JsonProperty("overageDescription")
    @ExcludeMissing
    fun _overageDescription(): JsonField<String> = overageDescription

    /** The percentage surcharge applied to the usage charges that exceed the Commitment amount. */
    @JsonProperty("overageSurchargePercent")
    @ExcludeMissing
    fun _overageSurchargePercent(): JsonField<Double> = overageSurchargePercent

    /**
     * A list of unique identifiers (UUIDs) for Products the Account consumes. Charges due for these
     * Products will be made available for draw-down against the Commitment.
     *
     * **Note:** If not used, then charges due for all Products the Account consumes will be made
     * available for draw-down against the Commitment.
     */
    @JsonProperty("productIds")
    @ExcludeMissing
    fun _productIds(): JsonField<List<String>> = productIds

    /**
     * A boolean value indicating whether the overage usage is billed separately or together. If
     * overage usage is separated and a Commitment amount has been consumed by an Account, any
     * subsequent line items on Bills against the Account for usage will show as separate "overage
     * usage" charges, not simply as "usage" charges:
     * - **TRUE** - billed separately.
     * - **FALSE** - billed together.
     */
    @JsonProperty("separateOverageUsage")
    @ExcludeMissing
    fun _separateOverageUsage(): JsonField<Boolean> = separateOverageUsage

    /** The start date of the Commitment period in ISO-8601 format. */
    @JsonProperty("startDate") @ExcludeMissing fun _startDate(): JsonField<LocalDate> = startDate

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Commitment = apply {
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
        childBillingMode()
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
        lineItemTypes()
        overageDescription()
        overageSurchargePercent()
        productIds()
        separateOverageUsage()
        startDate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Commitment].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Commitment]. */
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
        internal fun from(commitment: Commitment) = apply {
            id = commitment.id
            version = commitment.version
            accountId = commitment.accountId
            accountingProductId = commitment.accountingProductId
            amount = commitment.amount
            amountFirstBill = commitment.amountFirstBill
            amountPrePaid = commitment.amountPrePaid
            amountSpent = commitment.amountSpent
            billEpoch = commitment.billEpoch
            billingInterval = commitment.billingInterval
            billingOffset = commitment.billingOffset
            billingPlanId = commitment.billingPlanId
            childBillingMode = commitment.childBillingMode
            commitmentFeeBillInAdvance = commitment.commitmentFeeBillInAdvance
            commitmentFeeDescription = commitment.commitmentFeeDescription
            commitmentUsageDescription = commitment.commitmentUsageDescription
            contractId = commitment.contractId
            createdBy = commitment.createdBy
            currency = commitment.currency
            drawdownsAccountingProductId = commitment.drawdownsAccountingProductId
            dtCreated = commitment.dtCreated
            dtLastModified = commitment.dtLastModified
            endDate = commitment.endDate
            feeDates = commitment.feeDates.map { it.toMutableList() }
            feesAccountingProductId = commitment.feesAccountingProductId
            lastModifiedBy = commitment.lastModifiedBy
            lineItemTypes = commitment.lineItemTypes.map { it.toMutableList() }
            overageDescription = commitment.overageDescription
            overageSurchargePercent = commitment.overageSurchargePercent
            productIds = commitment.productIds.map { it.toMutableList() }
            separateOverageUsage = commitment.separateOverageUsage
            startDate = commitment.startDate
            additionalProperties = commitment.additionalProperties.toMutableMap()
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

        /** The unique identifier (UUID) for the end customer Account the Commitment is added to. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The unique identifier (UUID) for the end customer Account the Commitment is added to. */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * The unique identifier (UUID) for the Product linked to the Commitment for accounting
         * purposes.
         */
        fun accountingProductId(accountingProductId: String) =
            accountingProductId(JsonField.of(accountingProductId))

        /**
         * The unique identifier (UUID) for the Product linked to the Commitment for accounting
         * purposes.
         */
        fun accountingProductId(accountingProductId: JsonField<String>) = apply {
            this.accountingProductId = accountingProductId
        }

        /** The total amount that the customer has committed to pay. */
        fun amount(amount: Double) = amount(JsonField.of(amount))

        /** The total amount that the customer has committed to pay. */
        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

        /** The amount to be billed in the first invoice. */
        fun amountFirstBill(amountFirstBill: Double) =
            amountFirstBill(JsonField.of(amountFirstBill))

        /** The amount to be billed in the first invoice. */
        fun amountFirstBill(amountFirstBill: JsonField<Double>) = apply {
            this.amountFirstBill = amountFirstBill
        }

        /**
         * The amount that the customer has already paid upfront at the start of the Commitment
         * service period.
         */
        fun amountPrePaid(amountPrePaid: Double) = amountPrePaid(JsonField.of(amountPrePaid))

        /**
         * The amount that the customer has already paid upfront at the start of the Commitment
         * service period.
         */
        fun amountPrePaid(amountPrePaid: JsonField<Double>) = apply {
            this.amountPrePaid = amountPrePaid
        }

        /** The total amount of the Commitment that the customer has spent so far. */
        fun amountSpent(amountSpent: Double) = amountSpent(JsonField.of(amountSpent))

        /** The total amount of the Commitment that the customer has spent so far. */
        fun amountSpent(amountSpent: JsonField<Double>) = apply { this.amountSpent = amountSpent }

        /**
         * The starting date _(in ISO-8601 date format)_ from which the billing cycles are
         * calculated.
         */
        fun billEpoch(billEpoch: LocalDate) = billEpoch(JsonField.of(billEpoch))

        /**
         * The starting date _(in ISO-8601 date format)_ from which the billing cycles are
         * calculated.
         */
        fun billEpoch(billEpoch: JsonField<LocalDate>) = apply { this.billEpoch = billEpoch }

        /**
         * How often the Commitment fees are applied to bills. For example, if the plan being used
         * to bill for Commitment fees is set to issue bills every three months and the
         * `billingInterval` is set to 2, then the Commitment fees are applied every six months.
         */
        fun billingInterval(billingInterval: Long) = billingInterval(JsonField.of(billingInterval))

        /**
         * How often the Commitment fees are applied to bills. For example, if the plan being used
         * to bill for Commitment fees is set to issue bills every three months and the
         * `billingInterval` is set to 2, then the Commitment fees are applied every six months.
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
         * The offset for when the Commitment fees are first applied to bills on the Account. For
         * example, if bills are issued every three months and the `billingOffset` is 0, then the
         * charge is applied to the first bill (at three months); if set to 1, it's applied to the
         * next bill (at six months), and so on.
         */
        fun billingOffset(billingOffset: JsonField<Long>) = apply {
            this.billingOffset = billingOffset
        }

        /**
         * The unique identifier (UUID) for the Product Plan used for billing Commitment fees due.
         */
        fun billingPlanId(billingPlanId: String) = billingPlanId(JsonField.of(billingPlanId))

        /**
         * The unique identifier (UUID) for the Product Plan used for billing Commitment fees due.
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
         * If the Account is either a Parent or a Child Account, this specifies the Account
         * hierarchy billing mode. The mode determines how billing will be handled and shown on
         * bills for charges due on the Parent Account, and charges due on Child Accounts:
         * - **Parent Breakdown** - a separate bill line item per Account. Default setting.
         * - **Parent Summary** - single bill line item for all Accounts.
         * - **Child** - the Child Account is billed.
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
         * A boolean value indicating whether the Commitment fee is billed in advance _(start of
         * each billing period)_ or arrears _(end of each billing period)_.
         * - **TRUE** - bill in advance _(start of each billing period)_.
         * - **FALSE** - bill in arrears _(end of each billing period)_.
         */
        fun commitmentFeeBillInAdvance(commitmentFeeBillInAdvance: JsonField<Boolean>) = apply {
            this.commitmentFeeBillInAdvance = commitmentFeeBillInAdvance
        }

        /** A textual description of the Commitment fee. */
        fun commitmentFeeDescription(commitmentFeeDescription: String) =
            commitmentFeeDescription(JsonField.of(commitmentFeeDescription))

        /** A textual description of the Commitment fee. */
        fun commitmentFeeDescription(commitmentFeeDescription: JsonField<String>) = apply {
            this.commitmentFeeDescription = commitmentFeeDescription
        }

        /** A textual description of the Commitment usage. */
        fun commitmentUsageDescription(commitmentUsageDescription: String) =
            commitmentUsageDescription(JsonField.of(commitmentUsageDescription))

        /** A textual description of the Commitment usage. */
        fun commitmentUsageDescription(commitmentUsageDescription: JsonField<String>) = apply {
            this.commitmentUsageDescription = commitmentUsageDescription
        }

        /**
         * The unique identifier (UUID) for a Contract you've created for the Account and to which
         * the Commitment has been added.
         */
        fun contractId(contractId: String) = contractId(JsonField.of(contractId))

        /**
         * The unique identifier (UUID) for a Contract you've created for the Account and to which
         * the Commitment has been added.
         */
        fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

        /** The unique identifier (UUID) of the user who created this Commitment. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The unique identifier (UUID) of the user who created this Commitment. */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The currency used for the Commitment. For example, 'USD'. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** The currency used for the Commitment. For example, 'USD'. */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        fun drawdownsAccountingProductId(drawdownsAccountingProductId: String) =
            drawdownsAccountingProductId(JsonField.of(drawdownsAccountingProductId))

        fun drawdownsAccountingProductId(drawdownsAccountingProductId: JsonField<String>) = apply {
            this.drawdownsAccountingProductId = drawdownsAccountingProductId
        }

        /** The date and time _(in ISO-8601 format)_ when the Commitment was created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /** The date and time _(in ISO-8601 format)_ when the Commitment was created. */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The date and time _(in ISO-8601 format)_ when the Commitment was last modified. */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /** The date and time _(in ISO-8601 format)_ when the Commitment was last modified. */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        /** The end date of the Commitment period in ISO-8601 format. */
        fun endDate(endDate: LocalDate) = endDate(JsonField.of(endDate))

        /** The end date of the Commitment period in ISO-8601 format. */
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
         * Used for billing any outstanding Commitment fees _on a schedule_.
         *
         * An array defining a series of bill dates and amounts covering specified service periods:
         * - `date` - the billing date _(in ISO-8601 format)_.
         * - `amount` - the billed amount.
         * - `servicePeriodStartDate` and `servicePeriodEndDate` - defines the service period the
         *   bill covers _(in ISO-8601 format)_.
         */
        fun feeDates(feeDates: JsonField<List<CommitmentFee>>) = apply {
            this.feeDates = feeDates.map { it.toMutableList() }
        }

        /**
         * Used for billing any outstanding Commitment fees _on a schedule_.
         *
         * An array defining a series of bill dates and amounts covering specified service periods:
         * - `date` - the billing date _(in ISO-8601 format)_.
         * - `amount` - the billed amount.
         * - `servicePeriodStartDate` and `servicePeriodEndDate` - defines the service period the
         *   bill covers _(in ISO-8601 format)_.
         */
        fun addFeeDate(feeDate: CommitmentFee) = apply {
            feeDates =
                (feeDates ?: JsonField.of(mutableListOf())).also {
                    checkKnown("feeDates", it).add(feeDate)
                }
        }

        fun feesAccountingProductId(feesAccountingProductId: String) =
            feesAccountingProductId(JsonField.of(feesAccountingProductId))

        fun feesAccountingProductId(feesAccountingProductId: JsonField<String>) = apply {
            this.feesAccountingProductId = feesAccountingProductId
        }

        /** The unique identifier (UUID) of the user who last modified this Commitment. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The unique identifier (UUID) of the user who last modified this Commitment. */
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
         * Specifies the line item charge types that can draw-down at billing against the Commitment
         * amount. Options are:
         * - `MINIMUM_SPEND`
         * - `STANDING_CHARGE`
         * - `USAGE`
         * - `"COUNTER_RUNNING_TOTAL_CHARGE"`
         * - `"COUNTER_ADJUSTMENT_DEBIT"`
         */
        fun lineItemTypes(lineItemTypes: JsonField<List<LineItemType>>) = apply {
            this.lineItemTypes = lineItemTypes.map { it.toMutableList() }
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
        fun addLineItemType(lineItemType: LineItemType) = apply {
            lineItemTypes =
                (lineItemTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("lineItemTypes", it).add(lineItemType)
                }
        }

        /** A textual description of the overage charges. */
        fun overageDescription(overageDescription: String) =
            overageDescription(JsonField.of(overageDescription))

        /** A textual description of the overage charges. */
        fun overageDescription(overageDescription: JsonField<String>) = apply {
            this.overageDescription = overageDescription
        }

        /**
         * The percentage surcharge applied to the usage charges that exceed the Commitment amount.
         */
        fun overageSurchargePercent(overageSurchargePercent: Double) =
            overageSurchargePercent(JsonField.of(overageSurchargePercent))

        /**
         * The percentage surcharge applied to the usage charges that exceed the Commitment amount.
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
         * A list of unique identifiers (UUIDs) for Products the Account consumes. Charges due for
         * these Products will be made available for draw-down against the Commitment.
         *
         * **Note:** If not used, then charges due for all Products the Account consumes will be
         * made available for draw-down against the Commitment.
         */
        fun productIds(productIds: JsonField<List<String>>) = apply {
            this.productIds = productIds.map { it.toMutableList() }
        }

        /**
         * A list of unique identifiers (UUIDs) for Products the Account consumes. Charges due for
         * these Products will be made available for draw-down against the Commitment.
         *
         * **Note:** If not used, then charges due for all Products the Account consumes will be
         * made available for draw-down against the Commitment.
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
         * A boolean value indicating whether the overage usage is billed separately or together. If
         * overage usage is separated and a Commitment amount has been consumed by an Account, any
         * subsequent line items on Bills against the Account for usage will show as separate
         * "overage usage" charges, not simply as "usage" charges:
         * - **TRUE** - billed separately.
         * - **FALSE** - billed together.
         */
        fun separateOverageUsage(separateOverageUsage: JsonField<Boolean>) = apply {
            this.separateOverageUsage = separateOverageUsage
        }

        /** The start date of the Commitment period in ISO-8601 format. */
        fun startDate(startDate: LocalDate) = startDate(JsonField.of(startDate))

        /** The start date of the Commitment period in ISO-8601 format. */
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

        fun build(): Commitment =
            Commitment(
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
                additionalProperties.toImmutable(),
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

        return /* spotless:off */ other is Commitment && id == other.id && version == other.version && accountId == other.accountId && accountingProductId == other.accountingProductId && amount == other.amount && amountFirstBill == other.amountFirstBill && amountPrePaid == other.amountPrePaid && amountSpent == other.amountSpent && billEpoch == other.billEpoch && billingInterval == other.billingInterval && billingOffset == other.billingOffset && billingPlanId == other.billingPlanId && childBillingMode == other.childBillingMode && commitmentFeeBillInAdvance == other.commitmentFeeBillInAdvance && commitmentFeeDescription == other.commitmentFeeDescription && commitmentUsageDescription == other.commitmentUsageDescription && contractId == other.contractId && createdBy == other.createdBy && currency == other.currency && drawdownsAccountingProductId == other.drawdownsAccountingProductId && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && endDate == other.endDate && feeDates == other.feeDates && feesAccountingProductId == other.feesAccountingProductId && lastModifiedBy == other.lastModifiedBy && lineItemTypes == other.lineItemTypes && overageDescription == other.overageDescription && overageSurchargePercent == other.overageSurchargePercent && productIds == other.productIds && separateOverageUsage == other.separateOverageUsage && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, accountId, accountingProductId, amount, amountFirstBill, amountPrePaid, amountSpent, billEpoch, billingInterval, billingOffset, billingPlanId, childBillingMode, commitmentFeeBillInAdvance, commitmentFeeDescription, commitmentUsageDescription, contractId, createdBy, currency, drawdownsAccountingProductId, dtCreated, dtLastModified, endDate, feeDates, feesAccountingProductId, lastModifiedBy, lineItemTypes, overageDescription, overageSurchargePercent, productIds, separateOverageUsage, startDate, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Commitment{id=$id, version=$version, accountId=$accountId, accountingProductId=$accountingProductId, amount=$amount, amountFirstBill=$amountFirstBill, amountPrePaid=$amountPrePaid, amountSpent=$amountSpent, billEpoch=$billEpoch, billingInterval=$billingInterval, billingOffset=$billingOffset, billingPlanId=$billingPlanId, childBillingMode=$childBillingMode, commitmentFeeBillInAdvance=$commitmentFeeBillInAdvance, commitmentFeeDescription=$commitmentFeeDescription, commitmentUsageDescription=$commitmentUsageDescription, contractId=$contractId, createdBy=$createdBy, currency=$currency, drawdownsAccountingProductId=$drawdownsAccountingProductId, dtCreated=$dtCreated, dtLastModified=$dtLastModified, endDate=$endDate, feeDates=$feeDates, feesAccountingProductId=$feesAccountingProductId, lastModifiedBy=$lastModifiedBy, lineItemTypes=$lineItemTypes, overageDescription=$overageDescription, overageSurchargePercent=$overageSurchargePercent, productIds=$productIds, separateOverageUsage=$separateOverageUsage, startDate=$startDate, additionalProperties=$additionalProperties}"
}
