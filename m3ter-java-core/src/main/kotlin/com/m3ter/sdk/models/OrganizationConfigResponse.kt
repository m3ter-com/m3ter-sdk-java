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
class OrganizationConfigResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("autoApproveBillsGracePeriod")
    @ExcludeMissing
    private val autoApproveBillsGracePeriod: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("autoApproveBillsGracePeriodUnit")
    @ExcludeMissing
    private val autoApproveBillsGracePeriodUnit: JsonField<AutoApproveBillsGracePeriodUnit> =
        JsonMissing.of(),
    @JsonProperty("autoGenerateStatementMode")
    @ExcludeMissing
    private val autoGenerateStatementMode: JsonField<AutoGenerateStatementMode> = JsonMissing.of(),
    @JsonProperty("billPrefix")
    @ExcludeMissing
    private val billPrefix: JsonField<String> = JsonMissing.of(),
    @JsonProperty("commitmentFeeBillInAdvance")
    @ExcludeMissing
    private val commitmentFeeBillInAdvance: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("consolidateBills")
    @ExcludeMissing
    private val consolidateBills: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("createdBy")
    @ExcludeMissing
    private val createdBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("creditApplicationOrder")
    @ExcludeMissing
    private val creditApplicationOrder: JsonField<List<CreditApplicationOrder>> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("currencyConversions")
    @ExcludeMissing
    private val currencyConversions: JsonField<List<CurrencyConversion>> = JsonMissing.of(),
    @JsonProperty("dayEpoch")
    @ExcludeMissing
    private val dayEpoch: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("daysBeforeBillDue")
    @ExcludeMissing
    private val daysBeforeBillDue: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("defaultStatementDefinitionId")
    @ExcludeMissing
    private val defaultStatementDefinitionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("dtCreated")
    @ExcludeMissing
    private val dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    private val dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("externalInvoiceDate")
    @ExcludeMissing
    private val externalInvoiceDate: JsonField<ExternalInvoiceDate> = JsonMissing.of(),
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    private val lastModifiedBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("minimumSpendBillInAdvance")
    @ExcludeMissing
    private val minimumSpendBillInAdvance: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("monthEpoch")
    @ExcludeMissing
    private val monthEpoch: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("scheduledBillInterval")
    @ExcludeMissing
    private val scheduledBillInterval: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("sequenceStartNumber")
    @ExcludeMissing
    private val sequenceStartNumber: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("standingChargeBillInAdvance")
    @ExcludeMissing
    private val standingChargeBillInAdvance: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("suppressedEmptyBills")
    @ExcludeMissing
    private val suppressedEmptyBills: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("timezone")
    @ExcludeMissing
    private val timezone: JsonField<String> = JsonMissing.of(),
    @JsonProperty("weekEpoch")
    @ExcludeMissing
    private val weekEpoch: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("yearEpoch")
    @ExcludeMissing
    private val yearEpoch: JsonField<LocalDate> = JsonMissing.of(),
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

    /**
     * Grace period before bills are auto-approved. Used in combination with the field
     * `autoApproveBillsGracePeriodUnit`.
     */
    fun autoApproveBillsGracePeriod(): Optional<Long> =
        Optional.ofNullable(autoApproveBillsGracePeriod.getNullable("autoApproveBillsGracePeriod"))

    /**  */
    fun autoApproveBillsGracePeriodUnit(): Optional<AutoApproveBillsGracePeriodUnit> =
        Optional.ofNullable(
            autoApproveBillsGracePeriodUnit.getNullable("autoApproveBillsGracePeriodUnit")
        )

    /**
     * Specifies whether to auto-generate statements once Bills are _approved_ or _locked_. It will
     * not auto-generate if a bill is in _pending_ state.
     *
     * The default value is **None**.
     * - **None**. Statements will not be auto-generated.
     * - **JSON**. Statements are auto-generated in JSON format.
     * - **JSON and CSV**. Statements are auto-generated in both JSON and CSV formats.
     */
    fun autoGenerateStatementMode(): Optional<AutoGenerateStatementMode> =
        Optional.ofNullable(autoGenerateStatementMode.getNullable("autoGenerateStatementMode"))

    /**
     * Prefix to be used for sequential invoice numbers. This will be combined with the
     * `sequenceStartNumber`.
     */
    fun billPrefix(): Optional<String> = Optional.ofNullable(billPrefix.getNullable("billPrefix"))

    /**
     * Specifies whether commitments _(prepayments)_ are billed in advance at the start of each
     * billing period, or billed in arrears at the end of each billing period.
     * - **TRUE** - bill in advance _(start of each billing period)_.
     * - **FALSE** - bill in arrears _(end of each billing period)_.
     */
    fun commitmentFeeBillInAdvance(): Optional<Boolean> =
        Optional.ofNullable(commitmentFeeBillInAdvance.getNullable("commitmentFeeBillInAdvance"))

    /**
     * Specifies whether to consolidate different billing frequencies onto the same bill.
     * - **TRUE** - consolidate different billing frequencies onto the same bill.
     * - **FALSE** - bills are not consolidated.
     */
    fun consolidateBills(): Optional<Boolean> =
        Optional.ofNullable(consolidateBills.getNullable("consolidateBills"))

    /** The id of the user who created this organization config. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /**
     * The order in which any Prepayment or Balance credit amounts on Accounts are to be drawn-down
     * against for billing. Four options:
     * - `"PREPAYMENT","BALANCE"`. Draw-down against Prepayment credit before Balance credit.
     * - `"BALANCE","PREPAYMENT"`. Draw-down against Balance credit before Prepayment credit.
     * - `"PREPAYMENT"`. Only draw-down against Prepayment credit.
     * - `"BALANCE"`. Only draw-down against Balance credit.
     */
    fun creditApplicationOrder(): Optional<List<CreditApplicationOrder>> =
        Optional.ofNullable(creditApplicationOrder.getNullable("creditApplicationOrder"))

    /**
     * The currency code for the currency used in this Organization. For example: USD, GBP, or EUR.
     */
    fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

    /**
     * Currency conversion rates from Bill currency to Organization currency.
     *
     * For example, if Account is billed in GBP and Organization is set to USD, Bill line items are
     * calculated in GBP and then converted to USD using the defined rate.
     */
    fun currencyConversions(): Optional<List<CurrencyConversion>> =
        Optional.ofNullable(currencyConversions.getNullable("currencyConversions"))

    /** The first bill date _(in ISO-8601 format)_ for daily billing periods. */
    fun dayEpoch(): Optional<LocalDate> = Optional.ofNullable(dayEpoch.getNullable("dayEpoch"))

    /** The number of days after the Bill generation date shown on Bills as the due date. */
    fun daysBeforeBillDue(): Optional<Long> =
        Optional.ofNullable(daysBeforeBillDue.getNullable("daysBeforeBillDue"))

    /**
     * Organization level default `statementDefinitionId` to be used when there is no statement
     * definition linked to the account.
     *
     * Statement definitions are used to generate bill statements, which are informative backing
     * sheets to invoices.
     */
    fun defaultStatementDefinitionId(): Optional<String> =
        Optional.ofNullable(
            defaultStatementDefinitionId.getNullable("defaultStatementDefinitionId")
        )

    /** The DateTime when the organization config was created _(in ISO-8601 format)_. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /** The DateTime when the organization config was last modified _(in ISO-8601 format)_. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    fun externalInvoiceDate(): Optional<ExternalInvoiceDate> =
        Optional.ofNullable(externalInvoiceDate.getNullable("externalInvoiceDate"))

    /** The id of the user who last modified this organization config. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /**
     * Specifies whether minimum spend amounts are billed in advance at the start of each billing
     * period, or billed in arrears at the end of each billing period.
     * - **TRUE** - bill in advance _(start of each billing period)_.
     * - **FALSE** - bill in arrears _(end of each billing period)_.
     */
    fun minimumSpendBillInAdvance(): Optional<Boolean> =
        Optional.ofNullable(minimumSpendBillInAdvance.getNullable("minimumSpendBillInAdvance"))

    /** The first bill date _(in ISO-8601 format)_ for monthly billing periods. */
    fun monthEpoch(): Optional<LocalDate> =
        Optional.ofNullable(monthEpoch.getNullable("monthEpoch"))

    /**
     * Specifies the required interval for updating bills.
     * - **For portions of an hour (minutes)**. Two options: **0.25** (15 minutes) and **0.5** (30
     *   minutes).
     * - **For full hours.** Eight possible values: **1**, **2**, **3**, **4**, **6**, **8**,
     *   **12**, or **24**.
     * - **Default.** The default is **0**, which disables scheduling.
     */
    fun scheduledBillInterval(): Optional<Double> =
        Optional.ofNullable(scheduledBillInterval.getNullable("scheduledBillInterval"))

    /**
     * The starting number to be used for sequential invoice numbers. This will be combined with the
     * `billPrefix`.
     */
    fun sequenceStartNumber(): Optional<Long> =
        Optional.ofNullable(sequenceStartNumber.getNullable("sequenceStartNumber"))

    /**
     * Specifies whether the standing charge is billed in advance at the start of each billing
     * period, or billed in arrears at the end of each billing period.
     * - **TRUE** - bill in advance _(start of each billing period)_.
     * - **FALSE** - bill in arrears _(end of each billing period)_.
     */
    fun standingChargeBillInAdvance(): Optional<Boolean> =
        Optional.ofNullable(standingChargeBillInAdvance.getNullable("standingChargeBillInAdvance"))

    /**
     * Specifies whether to supress generating bills that have no line items.
     * - **TRUE** - prevents generating bills with no line items.
     * - **FALSE** - bills are still generated even when they have no line items.
     */
    fun suppressedEmptyBills(): Optional<Boolean> =
        Optional.ofNullable(suppressedEmptyBills.getNullable("suppressedEmptyBills"))

    /** The timezone for the Organization. */
    fun timezone(): Optional<String> = Optional.ofNullable(timezone.getNullable("timezone"))

    /** The first bill date _(in ISO-8601 format)_ for weekly billing periods. */
    fun weekEpoch(): Optional<LocalDate> = Optional.ofNullable(weekEpoch.getNullable("weekEpoch"))

    /** The first bill date _(in ISO-8601 format)_ for yearly billing periods. */
    fun yearEpoch(): Optional<LocalDate> = Optional.ofNullable(yearEpoch.getNullable("yearEpoch"))

    /** The UUID of the entity. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    /**
     * Grace period before bills are auto-approved. Used in combination with the field
     * `autoApproveBillsGracePeriodUnit`.
     */
    @JsonProperty("autoApproveBillsGracePeriod")
    @ExcludeMissing
    fun _autoApproveBillsGracePeriod(): JsonField<Long> = autoApproveBillsGracePeriod

    /**  */
    @JsonProperty("autoApproveBillsGracePeriodUnit")
    @ExcludeMissing
    fun _autoApproveBillsGracePeriodUnit(): JsonField<AutoApproveBillsGracePeriodUnit> =
        autoApproveBillsGracePeriodUnit

    /**
     * Specifies whether to auto-generate statements once Bills are _approved_ or _locked_. It will
     * not auto-generate if a bill is in _pending_ state.
     *
     * The default value is **None**.
     * - **None**. Statements will not be auto-generated.
     * - **JSON**. Statements are auto-generated in JSON format.
     * - **JSON and CSV**. Statements are auto-generated in both JSON and CSV formats.
     */
    @JsonProperty("autoGenerateStatementMode")
    @ExcludeMissing
    fun _autoGenerateStatementMode(): JsonField<AutoGenerateStatementMode> =
        autoGenerateStatementMode

    /**
     * Prefix to be used for sequential invoice numbers. This will be combined with the
     * `sequenceStartNumber`.
     */
    @JsonProperty("billPrefix") @ExcludeMissing fun _billPrefix(): JsonField<String> = billPrefix

    /**
     * Specifies whether commitments _(prepayments)_ are billed in advance at the start of each
     * billing period, or billed in arrears at the end of each billing period.
     * - **TRUE** - bill in advance _(start of each billing period)_.
     * - **FALSE** - bill in arrears _(end of each billing period)_.
     */
    @JsonProperty("commitmentFeeBillInAdvance")
    @ExcludeMissing
    fun _commitmentFeeBillInAdvance(): JsonField<Boolean> = commitmentFeeBillInAdvance

    /**
     * Specifies whether to consolidate different billing frequencies onto the same bill.
     * - **TRUE** - consolidate different billing frequencies onto the same bill.
     * - **FALSE** - bills are not consolidated.
     */
    @JsonProperty("consolidateBills")
    @ExcludeMissing
    fun _consolidateBills(): JsonField<Boolean> = consolidateBills

    /** The id of the user who created this organization config. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * The order in which any Prepayment or Balance credit amounts on Accounts are to be drawn-down
     * against for billing. Four options:
     * - `"PREPAYMENT","BALANCE"`. Draw-down against Prepayment credit before Balance credit.
     * - `"BALANCE","PREPAYMENT"`. Draw-down against Balance credit before Prepayment credit.
     * - `"PREPAYMENT"`. Only draw-down against Prepayment credit.
     * - `"BALANCE"`. Only draw-down against Balance credit.
     */
    @JsonProperty("creditApplicationOrder")
    @ExcludeMissing
    fun _creditApplicationOrder(): JsonField<List<CreditApplicationOrder>> = creditApplicationOrder

    /**
     * The currency code for the currency used in this Organization. For example: USD, GBP, or EUR.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Currency conversion rates from Bill currency to Organization currency.
     *
     * For example, if Account is billed in GBP and Organization is set to USD, Bill line items are
     * calculated in GBP and then converted to USD using the defined rate.
     */
    @JsonProperty("currencyConversions")
    @ExcludeMissing
    fun _currencyConversions(): JsonField<List<CurrencyConversion>> = currencyConversions

    /** The first bill date _(in ISO-8601 format)_ for daily billing periods. */
    @JsonProperty("dayEpoch") @ExcludeMissing fun _dayEpoch(): JsonField<LocalDate> = dayEpoch

    /** The number of days after the Bill generation date shown on Bills as the due date. */
    @JsonProperty("daysBeforeBillDue")
    @ExcludeMissing
    fun _daysBeforeBillDue(): JsonField<Long> = daysBeforeBillDue

    /**
     * Organization level default `statementDefinitionId` to be used when there is no statement
     * definition linked to the account.
     *
     * Statement definitions are used to generate bill statements, which are informative backing
     * sheets to invoices.
     */
    @JsonProperty("defaultStatementDefinitionId")
    @ExcludeMissing
    fun _defaultStatementDefinitionId(): JsonField<String> = defaultStatementDefinitionId

    /** The DateTime when the organization config was created _(in ISO-8601 format)_. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /** The DateTime when the organization config was last modified _(in ISO-8601 format)_. */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    @JsonProperty("externalInvoiceDate")
    @ExcludeMissing
    fun _externalInvoiceDate(): JsonField<ExternalInvoiceDate> = externalInvoiceDate

    /** The id of the user who last modified this organization config. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /**
     * Specifies whether minimum spend amounts are billed in advance at the start of each billing
     * period, or billed in arrears at the end of each billing period.
     * - **TRUE** - bill in advance _(start of each billing period)_.
     * - **FALSE** - bill in arrears _(end of each billing period)_.
     */
    @JsonProperty("minimumSpendBillInAdvance")
    @ExcludeMissing
    fun _minimumSpendBillInAdvance(): JsonField<Boolean> = minimumSpendBillInAdvance

    /** The first bill date _(in ISO-8601 format)_ for monthly billing periods. */
    @JsonProperty("monthEpoch") @ExcludeMissing fun _monthEpoch(): JsonField<LocalDate> = monthEpoch

    /**
     * Specifies the required interval for updating bills.
     * - **For portions of an hour (minutes)**. Two options: **0.25** (15 minutes) and **0.5** (30
     *   minutes).
     * - **For full hours.** Eight possible values: **1**, **2**, **3**, **4**, **6**, **8**,
     *   **12**, or **24**.
     * - **Default.** The default is **0**, which disables scheduling.
     */
    @JsonProperty("scheduledBillInterval")
    @ExcludeMissing
    fun _scheduledBillInterval(): JsonField<Double> = scheduledBillInterval

    /**
     * The starting number to be used for sequential invoice numbers. This will be combined with the
     * `billPrefix`.
     */
    @JsonProperty("sequenceStartNumber")
    @ExcludeMissing
    fun _sequenceStartNumber(): JsonField<Long> = sequenceStartNumber

    /**
     * Specifies whether the standing charge is billed in advance at the start of each billing
     * period, or billed in arrears at the end of each billing period.
     * - **TRUE** - bill in advance _(start of each billing period)_.
     * - **FALSE** - bill in arrears _(end of each billing period)_.
     */
    @JsonProperty("standingChargeBillInAdvance")
    @ExcludeMissing
    fun _standingChargeBillInAdvance(): JsonField<Boolean> = standingChargeBillInAdvance

    /**
     * Specifies whether to supress generating bills that have no line items.
     * - **TRUE** - prevents generating bills with no line items.
     * - **FALSE** - bills are still generated even when they have no line items.
     */
    @JsonProperty("suppressedEmptyBills")
    @ExcludeMissing
    fun _suppressedEmptyBills(): JsonField<Boolean> = suppressedEmptyBills

    /** The timezone for the Organization. */
    @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<String> = timezone

    /** The first bill date _(in ISO-8601 format)_ for weekly billing periods. */
    @JsonProperty("weekEpoch") @ExcludeMissing fun _weekEpoch(): JsonField<LocalDate> = weekEpoch

    /** The first bill date _(in ISO-8601 format)_ for yearly billing periods. */
    @JsonProperty("yearEpoch") @ExcludeMissing fun _yearEpoch(): JsonField<LocalDate> = yearEpoch

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): OrganizationConfigResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        version()
        autoApproveBillsGracePeriod()
        autoApproveBillsGracePeriodUnit()
        autoGenerateStatementMode()
        billPrefix()
        commitmentFeeBillInAdvance()
        consolidateBills()
        createdBy()
        creditApplicationOrder()
        currency()
        currencyConversions().ifPresent { it.forEach { it.validate() } }
        dayEpoch()
        daysBeforeBillDue()
        defaultStatementDefinitionId()
        dtCreated()
        dtLastModified()
        externalInvoiceDate()
        lastModifiedBy()
        minimumSpendBillInAdvance()
        monthEpoch()
        scheduledBillInterval()
        sequenceStartNumber()
        standingChargeBillInAdvance()
        suppressedEmptyBills()
        timezone()
        weekEpoch()
        yearEpoch()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OrganizationConfigResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OrganizationConfigResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var autoApproveBillsGracePeriod: JsonField<Long> = JsonMissing.of()
        private var autoApproveBillsGracePeriodUnit: JsonField<AutoApproveBillsGracePeriodUnit> =
            JsonMissing.of()
        private var autoGenerateStatementMode: JsonField<AutoGenerateStatementMode> =
            JsonMissing.of()
        private var billPrefix: JsonField<String> = JsonMissing.of()
        private var commitmentFeeBillInAdvance: JsonField<Boolean> = JsonMissing.of()
        private var consolidateBills: JsonField<Boolean> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var creditApplicationOrder: JsonField<MutableList<CreditApplicationOrder>>? = null
        private var currency: JsonField<String> = JsonMissing.of()
        private var currencyConversions: JsonField<MutableList<CurrencyConversion>>? = null
        private var dayEpoch: JsonField<LocalDate> = JsonMissing.of()
        private var daysBeforeBillDue: JsonField<Long> = JsonMissing.of()
        private var defaultStatementDefinitionId: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var externalInvoiceDate: JsonField<ExternalInvoiceDate> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var minimumSpendBillInAdvance: JsonField<Boolean> = JsonMissing.of()
        private var monthEpoch: JsonField<LocalDate> = JsonMissing.of()
        private var scheduledBillInterval: JsonField<Double> = JsonMissing.of()
        private var sequenceStartNumber: JsonField<Long> = JsonMissing.of()
        private var standingChargeBillInAdvance: JsonField<Boolean> = JsonMissing.of()
        private var suppressedEmptyBills: JsonField<Boolean> = JsonMissing.of()
        private var timezone: JsonField<String> = JsonMissing.of()
        private var weekEpoch: JsonField<LocalDate> = JsonMissing.of()
        private var yearEpoch: JsonField<LocalDate> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(organizationConfigResponse: OrganizationConfigResponse) = apply {
            id = organizationConfigResponse.id
            version = organizationConfigResponse.version
            autoApproveBillsGracePeriod = organizationConfigResponse.autoApproveBillsGracePeriod
            autoApproveBillsGracePeriodUnit =
                organizationConfigResponse.autoApproveBillsGracePeriodUnit
            autoGenerateStatementMode = organizationConfigResponse.autoGenerateStatementMode
            billPrefix = organizationConfigResponse.billPrefix
            commitmentFeeBillInAdvance = organizationConfigResponse.commitmentFeeBillInAdvance
            consolidateBills = organizationConfigResponse.consolidateBills
            createdBy = organizationConfigResponse.createdBy
            creditApplicationOrder =
                organizationConfigResponse.creditApplicationOrder.map { it.toMutableList() }
            currency = organizationConfigResponse.currency
            currencyConversions =
                organizationConfigResponse.currencyConversions.map { it.toMutableList() }
            dayEpoch = organizationConfigResponse.dayEpoch
            daysBeforeBillDue = organizationConfigResponse.daysBeforeBillDue
            defaultStatementDefinitionId = organizationConfigResponse.defaultStatementDefinitionId
            dtCreated = organizationConfigResponse.dtCreated
            dtLastModified = organizationConfigResponse.dtLastModified
            externalInvoiceDate = organizationConfigResponse.externalInvoiceDate
            lastModifiedBy = organizationConfigResponse.lastModifiedBy
            minimumSpendBillInAdvance = organizationConfigResponse.minimumSpendBillInAdvance
            monthEpoch = organizationConfigResponse.monthEpoch
            scheduledBillInterval = organizationConfigResponse.scheduledBillInterval
            sequenceStartNumber = organizationConfigResponse.sequenceStartNumber
            standingChargeBillInAdvance = organizationConfigResponse.standingChargeBillInAdvance
            suppressedEmptyBills = organizationConfigResponse.suppressedEmptyBills
            timezone = organizationConfigResponse.timezone
            weekEpoch = organizationConfigResponse.weekEpoch
            yearEpoch = organizationConfigResponse.yearEpoch
            additionalProperties = organizationConfigResponse.additionalProperties.toMutableMap()
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

        /**
         * Grace period before bills are auto-approved. Used in combination with the field
         * `autoApproveBillsGracePeriodUnit`.
         */
        fun autoApproveBillsGracePeriod(autoApproveBillsGracePeriod: Long) =
            autoApproveBillsGracePeriod(JsonField.of(autoApproveBillsGracePeriod))

        /**
         * Grace period before bills are auto-approved. Used in combination with the field
         * `autoApproveBillsGracePeriodUnit`.
         */
        fun autoApproveBillsGracePeriod(autoApproveBillsGracePeriod: JsonField<Long>) = apply {
            this.autoApproveBillsGracePeriod = autoApproveBillsGracePeriod
        }

        /**  */
        fun autoApproveBillsGracePeriodUnit(
            autoApproveBillsGracePeriodUnit: AutoApproveBillsGracePeriodUnit
        ) = autoApproveBillsGracePeriodUnit(JsonField.of(autoApproveBillsGracePeriodUnit))

        /**  */
        fun autoApproveBillsGracePeriodUnit(
            autoApproveBillsGracePeriodUnit: JsonField<AutoApproveBillsGracePeriodUnit>
        ) = apply { this.autoApproveBillsGracePeriodUnit = autoApproveBillsGracePeriodUnit }

        /**
         * Specifies whether to auto-generate statements once Bills are _approved_ or _locked_. It
         * will not auto-generate if a bill is in _pending_ state.
         *
         * The default value is **None**.
         * - **None**. Statements will not be auto-generated.
         * - **JSON**. Statements are auto-generated in JSON format.
         * - **JSON and CSV**. Statements are auto-generated in both JSON and CSV formats.
         */
        fun autoGenerateStatementMode(autoGenerateStatementMode: AutoGenerateStatementMode) =
            autoGenerateStatementMode(JsonField.of(autoGenerateStatementMode))

        /**
         * Specifies whether to auto-generate statements once Bills are _approved_ or _locked_. It
         * will not auto-generate if a bill is in _pending_ state.
         *
         * The default value is **None**.
         * - **None**. Statements will not be auto-generated.
         * - **JSON**. Statements are auto-generated in JSON format.
         * - **JSON and CSV**. Statements are auto-generated in both JSON and CSV formats.
         */
        fun autoGenerateStatementMode(
            autoGenerateStatementMode: JsonField<AutoGenerateStatementMode>
        ) = apply { this.autoGenerateStatementMode = autoGenerateStatementMode }

        /**
         * Prefix to be used for sequential invoice numbers. This will be combined with the
         * `sequenceStartNumber`.
         */
        fun billPrefix(billPrefix: String) = billPrefix(JsonField.of(billPrefix))

        /**
         * Prefix to be used for sequential invoice numbers. This will be combined with the
         * `sequenceStartNumber`.
         */
        fun billPrefix(billPrefix: JsonField<String>) = apply { this.billPrefix = billPrefix }

        /**
         * Specifies whether commitments _(prepayments)_ are billed in advance at the start of each
         * billing period, or billed in arrears at the end of each billing period.
         * - **TRUE** - bill in advance _(start of each billing period)_.
         * - **FALSE** - bill in arrears _(end of each billing period)_.
         */
        fun commitmentFeeBillInAdvance(commitmentFeeBillInAdvance: Boolean) =
            commitmentFeeBillInAdvance(JsonField.of(commitmentFeeBillInAdvance))

        /**
         * Specifies whether commitments _(prepayments)_ are billed in advance at the start of each
         * billing period, or billed in arrears at the end of each billing period.
         * - **TRUE** - bill in advance _(start of each billing period)_.
         * - **FALSE** - bill in arrears _(end of each billing period)_.
         */
        fun commitmentFeeBillInAdvance(commitmentFeeBillInAdvance: JsonField<Boolean>) = apply {
            this.commitmentFeeBillInAdvance = commitmentFeeBillInAdvance
        }

        /**
         * Specifies whether to consolidate different billing frequencies onto the same bill.
         * - **TRUE** - consolidate different billing frequencies onto the same bill.
         * - **FALSE** - bills are not consolidated.
         */
        fun consolidateBills(consolidateBills: Boolean) =
            consolidateBills(JsonField.of(consolidateBills))

        /**
         * Specifies whether to consolidate different billing frequencies onto the same bill.
         * - **TRUE** - consolidate different billing frequencies onto the same bill.
         * - **FALSE** - bills are not consolidated.
         */
        fun consolidateBills(consolidateBills: JsonField<Boolean>) = apply {
            this.consolidateBills = consolidateBills
        }

        /** The id of the user who created this organization config. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The id of the user who created this organization config. */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /**
         * The order in which any Prepayment or Balance credit amounts on Accounts are to be
         * drawn-down against for billing. Four options:
         * - `"PREPAYMENT","BALANCE"`. Draw-down against Prepayment credit before Balance credit.
         * - `"BALANCE","PREPAYMENT"`. Draw-down against Balance credit before Prepayment credit.
         * - `"PREPAYMENT"`. Only draw-down against Prepayment credit.
         * - `"BALANCE"`. Only draw-down against Balance credit.
         */
        fun creditApplicationOrder(creditApplicationOrder: List<CreditApplicationOrder>) =
            creditApplicationOrder(JsonField.of(creditApplicationOrder))

        /**
         * The order in which any Prepayment or Balance credit amounts on Accounts are to be
         * drawn-down against for billing. Four options:
         * - `"PREPAYMENT","BALANCE"`. Draw-down against Prepayment credit before Balance credit.
         * - `"BALANCE","PREPAYMENT"`. Draw-down against Balance credit before Prepayment credit.
         * - `"PREPAYMENT"`. Only draw-down against Prepayment credit.
         * - `"BALANCE"`. Only draw-down against Balance credit.
         */
        fun creditApplicationOrder(
            creditApplicationOrder: JsonField<List<CreditApplicationOrder>>
        ) = apply {
            this.creditApplicationOrder = creditApplicationOrder.map { it.toMutableList() }
        }

        /**
         * The order in which any Prepayment or Balance credit amounts on Accounts are to be
         * drawn-down against for billing. Four options:
         * - `"PREPAYMENT","BALANCE"`. Draw-down against Prepayment credit before Balance credit.
         * - `"BALANCE","PREPAYMENT"`. Draw-down against Balance credit before Prepayment credit.
         * - `"PREPAYMENT"`. Only draw-down against Prepayment credit.
         * - `"BALANCE"`. Only draw-down against Balance credit.
         */
        fun addCreditApplicationOrder(creditApplicationOrder: CreditApplicationOrder) = apply {
            this.creditApplicationOrder =
                (this.creditApplicationOrder ?: JsonField.of(mutableListOf())).also {
                    checkKnown("creditApplicationOrder", it).add(creditApplicationOrder)
                }
        }

        /**
         * The currency code for the currency used in this Organization. For example: USD, GBP, or
         * EUR.
         */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * The currency code for the currency used in this Organization. For example: USD, GBP, or
         * EUR.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * Currency conversion rates from Bill currency to Organization currency.
         *
         * For example, if Account is billed in GBP and Organization is set to USD, Bill line items
         * are calculated in GBP and then converted to USD using the defined rate.
         */
        fun currencyConversions(currencyConversions: List<CurrencyConversion>) =
            currencyConversions(JsonField.of(currencyConversions))

        /**
         * Currency conversion rates from Bill currency to Organization currency.
         *
         * For example, if Account is billed in GBP and Organization is set to USD, Bill line items
         * are calculated in GBP and then converted to USD using the defined rate.
         */
        fun currencyConversions(currencyConversions: JsonField<List<CurrencyConversion>>) = apply {
            this.currencyConversions = currencyConversions.map { it.toMutableList() }
        }

        /**
         * Currency conversion rates from Bill currency to Organization currency.
         *
         * For example, if Account is billed in GBP and Organization is set to USD, Bill line items
         * are calculated in GBP and then converted to USD using the defined rate.
         */
        fun addCurrencyConversion(currencyConversion: CurrencyConversion) = apply {
            currencyConversions =
                (currencyConversions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("currencyConversions", it).add(currencyConversion)
                }
        }

        /** The first bill date _(in ISO-8601 format)_ for daily billing periods. */
        fun dayEpoch(dayEpoch: LocalDate) = dayEpoch(JsonField.of(dayEpoch))

        /** The first bill date _(in ISO-8601 format)_ for daily billing periods. */
        fun dayEpoch(dayEpoch: JsonField<LocalDate>) = apply { this.dayEpoch = dayEpoch }

        /** The number of days after the Bill generation date shown on Bills as the due date. */
        fun daysBeforeBillDue(daysBeforeBillDue: Long) =
            daysBeforeBillDue(JsonField.of(daysBeforeBillDue))

        /** The number of days after the Bill generation date shown on Bills as the due date. */
        fun daysBeforeBillDue(daysBeforeBillDue: JsonField<Long>) = apply {
            this.daysBeforeBillDue = daysBeforeBillDue
        }

        /**
         * Organization level default `statementDefinitionId` to be used when there is no statement
         * definition linked to the account.
         *
         * Statement definitions are used to generate bill statements, which are informative backing
         * sheets to invoices.
         */
        fun defaultStatementDefinitionId(defaultStatementDefinitionId: String) =
            defaultStatementDefinitionId(JsonField.of(defaultStatementDefinitionId))

        /**
         * Organization level default `statementDefinitionId` to be used when there is no statement
         * definition linked to the account.
         *
         * Statement definitions are used to generate bill statements, which are informative backing
         * sheets to invoices.
         */
        fun defaultStatementDefinitionId(defaultStatementDefinitionId: JsonField<String>) = apply {
            this.defaultStatementDefinitionId = defaultStatementDefinitionId
        }

        /** The DateTime when the organization config was created _(in ISO-8601 format)_. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /** The DateTime when the organization config was created _(in ISO-8601 format)_. */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The DateTime when the organization config was last modified _(in ISO-8601 format)_. */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /** The DateTime when the organization config was last modified _(in ISO-8601 format)_. */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        fun externalInvoiceDate(externalInvoiceDate: ExternalInvoiceDate) =
            externalInvoiceDate(JsonField.of(externalInvoiceDate))

        fun externalInvoiceDate(externalInvoiceDate: JsonField<ExternalInvoiceDate>) = apply {
            this.externalInvoiceDate = externalInvoiceDate
        }

        /** The id of the user who last modified this organization config. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The id of the user who last modified this organization config. */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
        }

        /**
         * Specifies whether minimum spend amounts are billed in advance at the start of each
         * billing period, or billed in arrears at the end of each billing period.
         * - **TRUE** - bill in advance _(start of each billing period)_.
         * - **FALSE** - bill in arrears _(end of each billing period)_.
         */
        fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: Boolean) =
            minimumSpendBillInAdvance(JsonField.of(minimumSpendBillInAdvance))

        /**
         * Specifies whether minimum spend amounts are billed in advance at the start of each
         * billing period, or billed in arrears at the end of each billing period.
         * - **TRUE** - bill in advance _(start of each billing period)_.
         * - **FALSE** - bill in arrears _(end of each billing period)_.
         */
        fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: JsonField<Boolean>) = apply {
            this.minimumSpendBillInAdvance = minimumSpendBillInAdvance
        }

        /** The first bill date _(in ISO-8601 format)_ for monthly billing periods. */
        fun monthEpoch(monthEpoch: LocalDate) = monthEpoch(JsonField.of(monthEpoch))

        /** The first bill date _(in ISO-8601 format)_ for monthly billing periods. */
        fun monthEpoch(monthEpoch: JsonField<LocalDate>) = apply { this.monthEpoch = monthEpoch }

        /**
         * Specifies the required interval for updating bills.
         * - **For portions of an hour (minutes)**. Two options: **0.25** (15 minutes) and **0.5**
         *   (30 minutes).
         * - **For full hours.** Eight possible values: **1**, **2**, **3**, **4**, **6**, **8**,
         *   **12**, or **24**.
         * - **Default.** The default is **0**, which disables scheduling.
         */
        fun scheduledBillInterval(scheduledBillInterval: Double) =
            scheduledBillInterval(JsonField.of(scheduledBillInterval))

        /**
         * Specifies the required interval for updating bills.
         * - **For portions of an hour (minutes)**. Two options: **0.25** (15 minutes) and **0.5**
         *   (30 minutes).
         * - **For full hours.** Eight possible values: **1**, **2**, **3**, **4**, **6**, **8**,
         *   **12**, or **24**.
         * - **Default.** The default is **0**, which disables scheduling.
         */
        fun scheduledBillInterval(scheduledBillInterval: JsonField<Double>) = apply {
            this.scheduledBillInterval = scheduledBillInterval
        }

        /**
         * The starting number to be used for sequential invoice numbers. This will be combined with
         * the `billPrefix`.
         */
        fun sequenceStartNumber(sequenceStartNumber: Long) =
            sequenceStartNumber(JsonField.of(sequenceStartNumber))

        /**
         * The starting number to be used for sequential invoice numbers. This will be combined with
         * the `billPrefix`.
         */
        fun sequenceStartNumber(sequenceStartNumber: JsonField<Long>) = apply {
            this.sequenceStartNumber = sequenceStartNumber
        }

        /**
         * Specifies whether the standing charge is billed in advance at the start of each billing
         * period, or billed in arrears at the end of each billing period.
         * - **TRUE** - bill in advance _(start of each billing period)_.
         * - **FALSE** - bill in arrears _(end of each billing period)_.
         */
        fun standingChargeBillInAdvance(standingChargeBillInAdvance: Boolean) =
            standingChargeBillInAdvance(JsonField.of(standingChargeBillInAdvance))

        /**
         * Specifies whether the standing charge is billed in advance at the start of each billing
         * period, or billed in arrears at the end of each billing period.
         * - **TRUE** - bill in advance _(start of each billing period)_.
         * - **FALSE** - bill in arrears _(end of each billing period)_.
         */
        fun standingChargeBillInAdvance(standingChargeBillInAdvance: JsonField<Boolean>) = apply {
            this.standingChargeBillInAdvance = standingChargeBillInAdvance
        }

        /**
         * Specifies whether to supress generating bills that have no line items.
         * - **TRUE** - prevents generating bills with no line items.
         * - **FALSE** - bills are still generated even when they have no line items.
         */
        fun suppressedEmptyBills(suppressedEmptyBills: Boolean) =
            suppressedEmptyBills(JsonField.of(suppressedEmptyBills))

        /**
         * Specifies whether to supress generating bills that have no line items.
         * - **TRUE** - prevents generating bills with no line items.
         * - **FALSE** - bills are still generated even when they have no line items.
         */
        fun suppressedEmptyBills(suppressedEmptyBills: JsonField<Boolean>) = apply {
            this.suppressedEmptyBills = suppressedEmptyBills
        }

        /** The timezone for the Organization. */
        fun timezone(timezone: String) = timezone(JsonField.of(timezone))

        /** The timezone for the Organization. */
        fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

        /** The first bill date _(in ISO-8601 format)_ for weekly billing periods. */
        fun weekEpoch(weekEpoch: LocalDate) = weekEpoch(JsonField.of(weekEpoch))

        /** The first bill date _(in ISO-8601 format)_ for weekly billing periods. */
        fun weekEpoch(weekEpoch: JsonField<LocalDate>) = apply { this.weekEpoch = weekEpoch }

        /** The first bill date _(in ISO-8601 format)_ for yearly billing periods. */
        fun yearEpoch(yearEpoch: LocalDate) = yearEpoch(JsonField.of(yearEpoch))

        /** The first bill date _(in ISO-8601 format)_ for yearly billing periods. */
        fun yearEpoch(yearEpoch: JsonField<LocalDate>) = apply { this.yearEpoch = yearEpoch }

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

        fun build(): OrganizationConfigResponse =
            OrganizationConfigResponse(
                checkRequired("id", id),
                checkRequired("version", version),
                autoApproveBillsGracePeriod,
                autoApproveBillsGracePeriodUnit,
                autoGenerateStatementMode,
                billPrefix,
                commitmentFeeBillInAdvance,
                consolidateBills,
                createdBy,
                (creditApplicationOrder ?: JsonMissing.of()).map { it.toImmutable() },
                currency,
                (currencyConversions ?: JsonMissing.of()).map { it.toImmutable() },
                dayEpoch,
                daysBeforeBillDue,
                defaultStatementDefinitionId,
                dtCreated,
                dtLastModified,
                externalInvoiceDate,
                lastModifiedBy,
                minimumSpendBillInAdvance,
                monthEpoch,
                scheduledBillInterval,
                sequenceStartNumber,
                standingChargeBillInAdvance,
                suppressedEmptyBills,
                timezone,
                weekEpoch,
                yearEpoch,
                additionalProperties.toImmutable(),
            )
    }

    /**  */
    class AutoApproveBillsGracePeriodUnit
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val MINUTES = of("MINUTES")

            @JvmField val HOURS = of("HOURS")

            @JvmField val DAYS = of("DAYS")

            @JvmStatic fun of(value: String) = AutoApproveBillsGracePeriodUnit(JsonField.of(value))
        }

        /** An enum containing [AutoApproveBillsGracePeriodUnit]'s known values. */
        enum class Known {
            MINUTES,
            HOURS,
            DAYS,
        }

        /**
         * An enum containing [AutoApproveBillsGracePeriodUnit]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [AutoApproveBillsGracePeriodUnit] can contain an unknown value in a couple
         * of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MINUTES,
            HOURS,
            DAYS,
            /**
             * An enum member indicating that [AutoApproveBillsGracePeriodUnit] was instantiated
             * with an unknown value.
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
                MINUTES -> Value.MINUTES
                HOURS -> Value.HOURS
                DAYS -> Value.DAYS
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
                MINUTES -> Known.MINUTES
                HOURS -> Known.HOURS
                DAYS -> Known.DAYS
                else ->
                    throw M3terInvalidDataException(
                        "Unknown AutoApproveBillsGracePeriodUnit: $value"
                    )
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

            return /* spotless:off */ other is AutoApproveBillsGracePeriodUnit && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Specifies whether to auto-generate statements once Bills are _approved_ or _locked_. It will
     * not auto-generate if a bill is in _pending_ state.
     *
     * The default value is **None**.
     * - **None**. Statements will not be auto-generated.
     * - **JSON**. Statements are auto-generated in JSON format.
     * - **JSON and CSV**. Statements are auto-generated in both JSON and CSV formats.
     */
    class AutoGenerateStatementMode
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val NONE = of("NONE")

            @JvmField val JSON = of("JSON")

            @JvmField val JSON_AND_CSV = of("JSON_AND_CSV")

            @JvmStatic fun of(value: String) = AutoGenerateStatementMode(JsonField.of(value))
        }

        /** An enum containing [AutoGenerateStatementMode]'s known values. */
        enum class Known {
            NONE,
            JSON,
            JSON_AND_CSV,
        }

        /**
         * An enum containing [AutoGenerateStatementMode]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [AutoGenerateStatementMode] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NONE,
            JSON,
            JSON_AND_CSV,
            /**
             * An enum member indicating that [AutoGenerateStatementMode] was instantiated with an
             * unknown value.
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
                NONE -> Value.NONE
                JSON -> Value.JSON
                JSON_AND_CSV -> Value.JSON_AND_CSV
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
                NONE -> Known.NONE
                JSON -> Known.JSON
                JSON_AND_CSV -> Known.JSON_AND_CSV
                else -> throw M3terInvalidDataException("Unknown AutoGenerateStatementMode: $value")
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

            return /* spotless:off */ other is AutoGenerateStatementMode && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class CreditApplicationOrder
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PREPAYMENT = of("PREPAYMENT")

            @JvmField val BALANCE = of("BALANCE")

            @JvmStatic fun of(value: String) = CreditApplicationOrder(JsonField.of(value))
        }

        /** An enum containing [CreditApplicationOrder]'s known values. */
        enum class Known {
            PREPAYMENT,
            BALANCE,
        }

        /**
         * An enum containing [CreditApplicationOrder]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [CreditApplicationOrder] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PREPAYMENT,
            BALANCE,
            /**
             * An enum member indicating that [CreditApplicationOrder] was instantiated with an
             * unknown value.
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
                PREPAYMENT -> Value.PREPAYMENT
                BALANCE -> Value.BALANCE
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
                PREPAYMENT -> Known.PREPAYMENT
                BALANCE -> Known.BALANCE
                else -> throw M3terInvalidDataException("Unknown CreditApplicationOrder: $value")
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

            return /* spotless:off */ other is CreditApplicationOrder && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ExternalInvoiceDate
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val LAST_DAY_OF_ARREARS = of("LAST_DAY_OF_ARREARS")

            @JvmField val FIRST_DAY_OF_NEXT_PERIOD = of("FIRST_DAY_OF_NEXT_PERIOD")

            @JvmStatic fun of(value: String) = ExternalInvoiceDate(JsonField.of(value))
        }

        /** An enum containing [ExternalInvoiceDate]'s known values. */
        enum class Known {
            LAST_DAY_OF_ARREARS,
            FIRST_DAY_OF_NEXT_PERIOD,
        }

        /**
         * An enum containing [ExternalInvoiceDate]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ExternalInvoiceDate] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LAST_DAY_OF_ARREARS,
            FIRST_DAY_OF_NEXT_PERIOD,
            /**
             * An enum member indicating that [ExternalInvoiceDate] was instantiated with an unknown
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
                LAST_DAY_OF_ARREARS -> Value.LAST_DAY_OF_ARREARS
                FIRST_DAY_OF_NEXT_PERIOD -> Value.FIRST_DAY_OF_NEXT_PERIOD
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
                LAST_DAY_OF_ARREARS -> Known.LAST_DAY_OF_ARREARS
                FIRST_DAY_OF_NEXT_PERIOD -> Known.FIRST_DAY_OF_NEXT_PERIOD
                else -> throw M3terInvalidDataException("Unknown ExternalInvoiceDate: $value")
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

            return /* spotless:off */ other is ExternalInvoiceDate && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OrganizationConfigResponse && id == other.id && version == other.version && autoApproveBillsGracePeriod == other.autoApproveBillsGracePeriod && autoApproveBillsGracePeriodUnit == other.autoApproveBillsGracePeriodUnit && autoGenerateStatementMode == other.autoGenerateStatementMode && billPrefix == other.billPrefix && commitmentFeeBillInAdvance == other.commitmentFeeBillInAdvance && consolidateBills == other.consolidateBills && createdBy == other.createdBy && creditApplicationOrder == other.creditApplicationOrder && currency == other.currency && currencyConversions == other.currencyConversions && dayEpoch == other.dayEpoch && daysBeforeBillDue == other.daysBeforeBillDue && defaultStatementDefinitionId == other.defaultStatementDefinitionId && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && externalInvoiceDate == other.externalInvoiceDate && lastModifiedBy == other.lastModifiedBy && minimumSpendBillInAdvance == other.minimumSpendBillInAdvance && monthEpoch == other.monthEpoch && scheduledBillInterval == other.scheduledBillInterval && sequenceStartNumber == other.sequenceStartNumber && standingChargeBillInAdvance == other.standingChargeBillInAdvance && suppressedEmptyBills == other.suppressedEmptyBills && timezone == other.timezone && weekEpoch == other.weekEpoch && yearEpoch == other.yearEpoch && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, autoApproveBillsGracePeriod, autoApproveBillsGracePeriodUnit, autoGenerateStatementMode, billPrefix, commitmentFeeBillInAdvance, consolidateBills, createdBy, creditApplicationOrder, currency, currencyConversions, dayEpoch, daysBeforeBillDue, defaultStatementDefinitionId, dtCreated, dtLastModified, externalInvoiceDate, lastModifiedBy, minimumSpendBillInAdvance, monthEpoch, scheduledBillInterval, sequenceStartNumber, standingChargeBillInAdvance, suppressedEmptyBills, timezone, weekEpoch, yearEpoch, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OrganizationConfigResponse{id=$id, version=$version, autoApproveBillsGracePeriod=$autoApproveBillsGracePeriod, autoApproveBillsGracePeriodUnit=$autoApproveBillsGracePeriodUnit, autoGenerateStatementMode=$autoGenerateStatementMode, billPrefix=$billPrefix, commitmentFeeBillInAdvance=$commitmentFeeBillInAdvance, consolidateBills=$consolidateBills, createdBy=$createdBy, creditApplicationOrder=$creditApplicationOrder, currency=$currency, currencyConversions=$currencyConversions, dayEpoch=$dayEpoch, daysBeforeBillDue=$daysBeforeBillDue, defaultStatementDefinitionId=$defaultStatementDefinitionId, dtCreated=$dtCreated, dtLastModified=$dtLastModified, externalInvoiceDate=$externalInvoiceDate, lastModifiedBy=$lastModifiedBy, minimumSpendBillInAdvance=$minimumSpendBillInAdvance, monthEpoch=$monthEpoch, scheduledBillInterval=$scheduledBillInterval, sequenceStartNumber=$sequenceStartNumber, standingChargeBillInAdvance=$standingChargeBillInAdvance, suppressedEmptyBills=$suppressedEmptyBills, timezone=$timezone, weekEpoch=$weekEpoch, yearEpoch=$yearEpoch, additionalProperties=$additionalProperties}"
}
