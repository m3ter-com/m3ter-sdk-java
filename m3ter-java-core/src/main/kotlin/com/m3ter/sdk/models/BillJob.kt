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
class BillJob
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("accountIds")
    @ExcludeMissing
    private val accountIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("billDate")
    @ExcludeMissing
    private val billDate: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("billFrequencyInterval")
    @ExcludeMissing
    private val billFrequencyInterval: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("billIds")
    @ExcludeMissing
    private val billIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("billingFrequency")
    @ExcludeMissing
    private val billingFrequency: JsonField<BillingFrequency> = JsonMissing.of(),
    @JsonProperty("createdBy")
    @ExcludeMissing
    private val createdBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("currencyConversions")
    @ExcludeMissing
    private val currencyConversions: JsonField<List<CurrencyConversion>> = JsonMissing.of(),
    @JsonProperty("dayEpoch")
    @ExcludeMissing
    private val dayEpoch: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("dtCreated")
    @ExcludeMissing
    private val dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    private val dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dueDate")
    @ExcludeMissing
    private val dueDate: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("externalInvoiceDate")
    @ExcludeMissing
    private val externalInvoiceDate: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("lastDateInBillingPeriod")
    @ExcludeMissing
    private val lastDateInBillingPeriod: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    private val lastModifiedBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("monthEpoch")
    @ExcludeMissing
    private val monthEpoch: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("pending")
    @ExcludeMissing
    private val pending: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("targetCurrency")
    @ExcludeMissing
    private val targetCurrency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("timezone")
    @ExcludeMissing
    private val timezone: JsonField<String> = JsonMissing.of(),
    @JsonProperty("total") @ExcludeMissing private val total: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
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

    /** An array of UUIDs representing the end customer Accounts associated with the BillJob. */
    fun accountIds(): Optional<List<String>> =
        Optional.ofNullable(accountIds.getNullable("accountIds"))

    /**
     * The specific billing date _(in ISO 8601 format)_, determining when the Bill was generated.
     *
     * For example: `"2023-01-24"`.
     */
    fun billDate(): Optional<LocalDate> = Optional.ofNullable(billDate.getNullable("billDate"))

    /**
     * How often Bills are issued - used in conjunction with `billingFrequency`.
     *
     * For example, if `billingFrequency` is set to Monthly and `billFrequencyInterval` is set to 3,
     * Bills are issued every three months.
     */
    fun billFrequencyInterval(): Optional<Long> =
        Optional.ofNullable(billFrequencyInterval.getNullable("billFrequencyInterval"))

    /**
     * An array of Bill IDs related to the BillJob, providing references to the specific Bills
     * generated.
     */
    fun billIds(): Optional<List<String>> = Optional.ofNullable(billIds.getNullable("billIds"))

    /**
     * Defines how often Bills are generated.
     * - **Daily**. Starting at midnight each day, covering a twenty-four hour period following.
     * - **Weekly**. Starting at midnight on a Monday morning covering the seven-day period
     *   following.
     * - **Monthly**. Starting at midnight on the morning of the first day of each month covering
     *   the entire calendar month following.
     * - **Annually**. Starting at midnight on the morning of the first day of each year covering
     *   the entire calendar year following.
     * - **Ad_Hoc**. Use this setting when a custom billing schedule is used for billing an Account,
     *   such as for billing of Prepayment/Commitment fees using a custom billing schedule.
     */
    fun billingFrequency(): Optional<BillingFrequency> =
        Optional.ofNullable(billingFrequency.getNullable("billingFrequency"))

    /** The unique identifier (UUID) for the user who created the BillJob. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /**
     * An array of currency conversion rates from Bill currency to Organization currency. For
     * example, if Account is billed in GBP and Organization is set to USD, Bill line items are
     * calculated in GBP and then converted to USD using the defined rate.
     */
    fun currencyConversions(): Optional<List<CurrencyConversion>> =
        Optional.ofNullable(currencyConversions.getNullable("currencyConversions"))

    /**
     * The starting date _(epoch)_ for Daily billing frequency _(in ISO 8601 format)_, determining
     * the first Bill date for daily Bills.
     */
    fun dayEpoch(): Optional<LocalDate> = Optional.ofNullable(dayEpoch.getNullable("dayEpoch"))

    /** The date and time _(in ISO 8601 format)_ when the BillJob was first created. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /** The date and time _(in ISO 8601 format)_ when the BillJob was last modified. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /**
     * The due date _(in ISO 8601 format)_ for payment of the Bill.
     *
     * For example: `"2023-02-24"`.
     */
    fun dueDate(): Optional<LocalDate> = Optional.ofNullable(dueDate.getNullable("dueDate"))

    /**
     * For accounting purposes, the date set at Organization level to use for external invoicing
     * with respect to billing periods - two options:
     * - `FIRST_DAY_OF_NEXT_PERIOD` _(Default)_. Used when you want to recognize usage revenue in
     *   the following period.
     * - `LAST_DAY_OF_ARREARS`. Used when you want to recognize usage revenue in the same period
     *   that it's consumed, instead of in the following period.
     *
     * For example, if the retrieved Bill was on a monthly billing frequency and the billing period
     * for the Bill is September 2023 and the _External invoice date_ is set at
     * `FIRST_DAY_OF_NEXT_PERIOD`, then the `externalInvoiceDate` will be `"2023-10-01"`.
     */
    fun externalInvoiceDate(): Optional<LocalDate> =
        Optional.ofNullable(externalInvoiceDate.getNullable("externalInvoiceDate"))

    /**
     * Specifies the date _(in ISO 8601 format)_ of the last day in the billing period, defining the
     * time range for the associated Bills.
     *
     * For example: `"2023-03-24"`.
     */
    fun lastDateInBillingPeriod(): Optional<LocalDate> =
        Optional.ofNullable(lastDateInBillingPeriod.getNullable("lastDateInBillingPeriod"))

    /** The unique identifier (UUID) for the user who last modified this BillJob. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /**
     * The starting date _(epoch)_ for Monthly billing frequency _(in ISO 8601 format)_, determining
     * the first Bill date for monthly Bills.
     */
    fun monthEpoch(): Optional<LocalDate> =
        Optional.ofNullable(monthEpoch.getNullable("monthEpoch"))

    /** The number of pending actions or calculations within the BillJob. */
    fun pending(): Optional<Long> = Optional.ofNullable(pending.getNullable("pending"))

    /** The current status of the BillJob, indicating its progress or completion state. */
    fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

    /** The currency code used for the Bill, such as USD, GBP, or EUR. */
    fun targetCurrency(): Optional<String> =
        Optional.ofNullable(targetCurrency.getNullable("targetCurrency"))

    /**
     * Specifies the time zone used for the generated Bills, ensuring alignment with the local time
     * zone.
     */
    fun timezone(): Optional<String> = Optional.ofNullable(timezone.getNullable("timezone"))

    /** The total number of Bills or calculations related to the BillJob. */
    fun total(): Optional<Long> = Optional.ofNullable(total.getNullable("total"))

    /**
     * Specifies the type of BillJob.
     * - **CREATE** Returned for a _Create BillJob_ call.
     * - **RECALCULATE** Returned for a successful _Create Recalculation BillJob_ call.
     */
    fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

    /**
     * The starting date _(epoch)_ for Weekly billing frequency _(in ISO 8601 format)_, determining
     * the first Bill date for weekly Bills.
     */
    fun weekEpoch(): Optional<LocalDate> = Optional.ofNullable(weekEpoch.getNullable("weekEpoch"))

    /**
     * The starting date _(epoch)_ for Yearly billing frequency _(in ISO 8601 format)_, determining
     * the first Bill date for yearly Bills.
     */
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

    /** An array of UUIDs representing the end customer Accounts associated with the BillJob. */
    @JsonProperty("accountIds")
    @ExcludeMissing
    fun _accountIds(): JsonField<List<String>> = accountIds

    /**
     * The specific billing date _(in ISO 8601 format)_, determining when the Bill was generated.
     *
     * For example: `"2023-01-24"`.
     */
    @JsonProperty("billDate") @ExcludeMissing fun _billDate(): JsonField<LocalDate> = billDate

    /**
     * How often Bills are issued - used in conjunction with `billingFrequency`.
     *
     * For example, if `billingFrequency` is set to Monthly and `billFrequencyInterval` is set to 3,
     * Bills are issued every three months.
     */
    @JsonProperty("billFrequencyInterval")
    @ExcludeMissing
    fun _billFrequencyInterval(): JsonField<Long> = billFrequencyInterval

    /**
     * An array of Bill IDs related to the BillJob, providing references to the specific Bills
     * generated.
     */
    @JsonProperty("billIds") @ExcludeMissing fun _billIds(): JsonField<List<String>> = billIds

    /**
     * Defines how often Bills are generated.
     * - **Daily**. Starting at midnight each day, covering a twenty-four hour period following.
     * - **Weekly**. Starting at midnight on a Monday morning covering the seven-day period
     *   following.
     * - **Monthly**. Starting at midnight on the morning of the first day of each month covering
     *   the entire calendar month following.
     * - **Annually**. Starting at midnight on the morning of the first day of each year covering
     *   the entire calendar year following.
     * - **Ad_Hoc**. Use this setting when a custom billing schedule is used for billing an Account,
     *   such as for billing of Prepayment/Commitment fees using a custom billing schedule.
     */
    @JsonProperty("billingFrequency")
    @ExcludeMissing
    fun _billingFrequency(): JsonField<BillingFrequency> = billingFrequency

    /** The unique identifier (UUID) for the user who created the BillJob. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * An array of currency conversion rates from Bill currency to Organization currency. For
     * example, if Account is billed in GBP and Organization is set to USD, Bill line items are
     * calculated in GBP and then converted to USD using the defined rate.
     */
    @JsonProperty("currencyConversions")
    @ExcludeMissing
    fun _currencyConversions(): JsonField<List<CurrencyConversion>> = currencyConversions

    /**
     * The starting date _(epoch)_ for Daily billing frequency _(in ISO 8601 format)_, determining
     * the first Bill date for daily Bills.
     */
    @JsonProperty("dayEpoch") @ExcludeMissing fun _dayEpoch(): JsonField<LocalDate> = dayEpoch

    /** The date and time _(in ISO 8601 format)_ when the BillJob was first created. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /** The date and time _(in ISO 8601 format)_ when the BillJob was last modified. */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /**
     * The due date _(in ISO 8601 format)_ for payment of the Bill.
     *
     * For example: `"2023-02-24"`.
     */
    @JsonProperty("dueDate") @ExcludeMissing fun _dueDate(): JsonField<LocalDate> = dueDate

    /**
     * For accounting purposes, the date set at Organization level to use for external invoicing
     * with respect to billing periods - two options:
     * - `FIRST_DAY_OF_NEXT_PERIOD` _(Default)_. Used when you want to recognize usage revenue in
     *   the following period.
     * - `LAST_DAY_OF_ARREARS`. Used when you want to recognize usage revenue in the same period
     *   that it's consumed, instead of in the following period.
     *
     * For example, if the retrieved Bill was on a monthly billing frequency and the billing period
     * for the Bill is September 2023 and the _External invoice date_ is set at
     * `FIRST_DAY_OF_NEXT_PERIOD`, then the `externalInvoiceDate` will be `"2023-10-01"`.
     */
    @JsonProperty("externalInvoiceDate")
    @ExcludeMissing
    fun _externalInvoiceDate(): JsonField<LocalDate> = externalInvoiceDate

    /**
     * Specifies the date _(in ISO 8601 format)_ of the last day in the billing period, defining the
     * time range for the associated Bills.
     *
     * For example: `"2023-03-24"`.
     */
    @JsonProperty("lastDateInBillingPeriod")
    @ExcludeMissing
    fun _lastDateInBillingPeriod(): JsonField<LocalDate> = lastDateInBillingPeriod

    /** The unique identifier (UUID) for the user who last modified this BillJob. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /**
     * The starting date _(epoch)_ for Monthly billing frequency _(in ISO 8601 format)_, determining
     * the first Bill date for monthly Bills.
     */
    @JsonProperty("monthEpoch") @ExcludeMissing fun _monthEpoch(): JsonField<LocalDate> = monthEpoch

    /** The number of pending actions or calculations within the BillJob. */
    @JsonProperty("pending") @ExcludeMissing fun _pending(): JsonField<Long> = pending

    /** The current status of the BillJob, indicating its progress or completion state. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /** The currency code used for the Bill, such as USD, GBP, or EUR. */
    @JsonProperty("targetCurrency")
    @ExcludeMissing
    fun _targetCurrency(): JsonField<String> = targetCurrency

    /**
     * Specifies the time zone used for the generated Bills, ensuring alignment with the local time
     * zone.
     */
    @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<String> = timezone

    /** The total number of Bills or calculations related to the BillJob. */
    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Long> = total

    /**
     * Specifies the type of BillJob.
     * - **CREATE** Returned for a _Create BillJob_ call.
     * - **RECALCULATE** Returned for a successful _Create Recalculation BillJob_ call.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * The starting date _(epoch)_ for Weekly billing frequency _(in ISO 8601 format)_, determining
     * the first Bill date for weekly Bills.
     */
    @JsonProperty("weekEpoch") @ExcludeMissing fun _weekEpoch(): JsonField<LocalDate> = weekEpoch

    /**
     * The starting date _(epoch)_ for Yearly billing frequency _(in ISO 8601 format)_, determining
     * the first Bill date for yearly Bills.
     */
    @JsonProperty("yearEpoch") @ExcludeMissing fun _yearEpoch(): JsonField<LocalDate> = yearEpoch

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BillJob = apply {
        if (validated) {
            return@apply
        }

        id()
        version()
        accountIds()
        billDate()
        billFrequencyInterval()
        billIds()
        billingFrequency()
        createdBy()
        currencyConversions().ifPresent { it.forEach { it.validate() } }
        dayEpoch()
        dtCreated()
        dtLastModified()
        dueDate()
        externalInvoiceDate()
        lastDateInBillingPeriod()
        lastModifiedBy()
        monthEpoch()
        pending()
        status()
        targetCurrency()
        timezone()
        total()
        type()
        weekEpoch()
        yearEpoch()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BillJob]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var accountIds: JsonField<MutableList<String>>? = null
        private var billDate: JsonField<LocalDate> = JsonMissing.of()
        private var billFrequencyInterval: JsonField<Long> = JsonMissing.of()
        private var billIds: JsonField<MutableList<String>>? = null
        private var billingFrequency: JsonField<BillingFrequency> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var currencyConversions: JsonField<MutableList<CurrencyConversion>>? = null
        private var dayEpoch: JsonField<LocalDate> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dueDate: JsonField<LocalDate> = JsonMissing.of()
        private var externalInvoiceDate: JsonField<LocalDate> = JsonMissing.of()
        private var lastDateInBillingPeriod: JsonField<LocalDate> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var monthEpoch: JsonField<LocalDate> = JsonMissing.of()
        private var pending: JsonField<Long> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var targetCurrency: JsonField<String> = JsonMissing.of()
        private var timezone: JsonField<String> = JsonMissing.of()
        private var total: JsonField<Long> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var weekEpoch: JsonField<LocalDate> = JsonMissing.of()
        private var yearEpoch: JsonField<LocalDate> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(billJob: BillJob) = apply {
            id = billJob.id
            version = billJob.version
            accountIds = billJob.accountIds.map { it.toMutableList() }
            billDate = billJob.billDate
            billFrequencyInterval = billJob.billFrequencyInterval
            billIds = billJob.billIds.map { it.toMutableList() }
            billingFrequency = billJob.billingFrequency
            createdBy = billJob.createdBy
            currencyConversions = billJob.currencyConversions.map { it.toMutableList() }
            dayEpoch = billJob.dayEpoch
            dtCreated = billJob.dtCreated
            dtLastModified = billJob.dtLastModified
            dueDate = billJob.dueDate
            externalInvoiceDate = billJob.externalInvoiceDate
            lastDateInBillingPeriod = billJob.lastDateInBillingPeriod
            lastModifiedBy = billJob.lastModifiedBy
            monthEpoch = billJob.monthEpoch
            pending = billJob.pending
            status = billJob.status
            targetCurrency = billJob.targetCurrency
            timezone = billJob.timezone
            total = billJob.total
            type = billJob.type
            weekEpoch = billJob.weekEpoch
            yearEpoch = billJob.yearEpoch
            additionalProperties = billJob.additionalProperties.toMutableMap()
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

        /** An array of UUIDs representing the end customer Accounts associated with the BillJob. */
        fun accountIds(accountIds: List<String>) = accountIds(JsonField.of(accountIds))

        /** An array of UUIDs representing the end customer Accounts associated with the BillJob. */
        fun accountIds(accountIds: JsonField<List<String>>) = apply {
            this.accountIds = accountIds.map { it.toMutableList() }
        }

        /** An array of UUIDs representing the end customer Accounts associated with the BillJob. */
        fun addAccountId(accountId: String) = apply {
            accountIds =
                (accountIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("accountIds", it).add(accountId)
                }
        }

        /**
         * The specific billing date _(in ISO 8601 format)_, determining when the Bill was
         * generated.
         *
         * For example: `"2023-01-24"`.
         */
        fun billDate(billDate: LocalDate) = billDate(JsonField.of(billDate))

        /**
         * The specific billing date _(in ISO 8601 format)_, determining when the Bill was
         * generated.
         *
         * For example: `"2023-01-24"`.
         */
        fun billDate(billDate: JsonField<LocalDate>) = apply { this.billDate = billDate }

        /**
         * How often Bills are issued - used in conjunction with `billingFrequency`.
         *
         * For example, if `billingFrequency` is set to Monthly and `billFrequencyInterval` is set
         * to 3, Bills are issued every three months.
         */
        fun billFrequencyInterval(billFrequencyInterval: Long) =
            billFrequencyInterval(JsonField.of(billFrequencyInterval))

        /**
         * How often Bills are issued - used in conjunction with `billingFrequency`.
         *
         * For example, if `billingFrequency` is set to Monthly and `billFrequencyInterval` is set
         * to 3, Bills are issued every three months.
         */
        fun billFrequencyInterval(billFrequencyInterval: JsonField<Long>) = apply {
            this.billFrequencyInterval = billFrequencyInterval
        }

        /**
         * An array of Bill IDs related to the BillJob, providing references to the specific Bills
         * generated.
         */
        fun billIds(billIds: List<String>) = billIds(JsonField.of(billIds))

        /**
         * An array of Bill IDs related to the BillJob, providing references to the specific Bills
         * generated.
         */
        fun billIds(billIds: JsonField<List<String>>) = apply {
            this.billIds = billIds.map { it.toMutableList() }
        }

        /**
         * An array of Bill IDs related to the BillJob, providing references to the specific Bills
         * generated.
         */
        fun addBillId(billId: String) = apply {
            billIds =
                (billIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("billIds", it).add(billId)
                }
        }

        /**
         * Defines how often Bills are generated.
         * - **Daily**. Starting at midnight each day, covering a twenty-four hour period following.
         * - **Weekly**. Starting at midnight on a Monday morning covering the seven-day period
         *   following.
         * - **Monthly**. Starting at midnight on the morning of the first day of each month
         *   covering the entire calendar month following.
         * - **Annually**. Starting at midnight on the morning of the first day of each year
         *   covering the entire calendar year following.
         * - **Ad_Hoc**. Use this setting when a custom billing schedule is used for billing an
         *   Account, such as for billing of Prepayment/Commitment fees using a custom billing
         *   schedule.
         */
        fun billingFrequency(billingFrequency: BillingFrequency) =
            billingFrequency(JsonField.of(billingFrequency))

        /**
         * Defines how often Bills are generated.
         * - **Daily**. Starting at midnight each day, covering a twenty-four hour period following.
         * - **Weekly**. Starting at midnight on a Monday morning covering the seven-day period
         *   following.
         * - **Monthly**. Starting at midnight on the morning of the first day of each month
         *   covering the entire calendar month following.
         * - **Annually**. Starting at midnight on the morning of the first day of each year
         *   covering the entire calendar year following.
         * - **Ad_Hoc**. Use this setting when a custom billing schedule is used for billing an
         *   Account, such as for billing of Prepayment/Commitment fees using a custom billing
         *   schedule.
         */
        fun billingFrequency(billingFrequency: JsonField<BillingFrequency>) = apply {
            this.billingFrequency = billingFrequency
        }

        /** The unique identifier (UUID) for the user who created the BillJob. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The unique identifier (UUID) for the user who created the BillJob. */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /**
         * An array of currency conversion rates from Bill currency to Organization currency. For
         * example, if Account is billed in GBP and Organization is set to USD, Bill line items are
         * calculated in GBP and then converted to USD using the defined rate.
         */
        fun currencyConversions(currencyConversions: List<CurrencyConversion>) =
            currencyConversions(JsonField.of(currencyConversions))

        /**
         * An array of currency conversion rates from Bill currency to Organization currency. For
         * example, if Account is billed in GBP and Organization is set to USD, Bill line items are
         * calculated in GBP and then converted to USD using the defined rate.
         */
        fun currencyConversions(currencyConversions: JsonField<List<CurrencyConversion>>) = apply {
            this.currencyConversions = currencyConversions.map { it.toMutableList() }
        }

        /**
         * An array of currency conversion rates from Bill currency to Organization currency. For
         * example, if Account is billed in GBP and Organization is set to USD, Bill line items are
         * calculated in GBP and then converted to USD using the defined rate.
         */
        fun addCurrencyConversion(currencyConversion: CurrencyConversion) = apply {
            currencyConversions =
                (currencyConversions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("currencyConversions", it).add(currencyConversion)
                }
        }

        /**
         * The starting date _(epoch)_ for Daily billing frequency _(in ISO 8601 format)_,
         * determining the first Bill date for daily Bills.
         */
        fun dayEpoch(dayEpoch: LocalDate) = dayEpoch(JsonField.of(dayEpoch))

        /**
         * The starting date _(epoch)_ for Daily billing frequency _(in ISO 8601 format)_,
         * determining the first Bill date for daily Bills.
         */
        fun dayEpoch(dayEpoch: JsonField<LocalDate>) = apply { this.dayEpoch = dayEpoch }

        /** The date and time _(in ISO 8601 format)_ when the BillJob was first created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /** The date and time _(in ISO 8601 format)_ when the BillJob was first created. */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The date and time _(in ISO 8601 format)_ when the BillJob was last modified. */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /** The date and time _(in ISO 8601 format)_ when the BillJob was last modified. */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        /**
         * The due date _(in ISO 8601 format)_ for payment of the Bill.
         *
         * For example: `"2023-02-24"`.
         */
        fun dueDate(dueDate: LocalDate) = dueDate(JsonField.of(dueDate))

        /**
         * The due date _(in ISO 8601 format)_ for payment of the Bill.
         *
         * For example: `"2023-02-24"`.
         */
        fun dueDate(dueDate: JsonField<LocalDate>) = apply { this.dueDate = dueDate }

        /**
         * For accounting purposes, the date set at Organization level to use for external invoicing
         * with respect to billing periods - two options:
         * - `FIRST_DAY_OF_NEXT_PERIOD` _(Default)_. Used when you want to recognize usage revenue
         *   in the following period.
         * - `LAST_DAY_OF_ARREARS`. Used when you want to recognize usage revenue in the same period
         *   that it's consumed, instead of in the following period.
         *
         * For example, if the retrieved Bill was on a monthly billing frequency and the billing
         * period for the Bill is September 2023 and the _External invoice date_ is set at
         * `FIRST_DAY_OF_NEXT_PERIOD`, then the `externalInvoiceDate` will be `"2023-10-01"`.
         */
        fun externalInvoiceDate(externalInvoiceDate: LocalDate) =
            externalInvoiceDate(JsonField.of(externalInvoiceDate))

        /**
         * For accounting purposes, the date set at Organization level to use for external invoicing
         * with respect to billing periods - two options:
         * - `FIRST_DAY_OF_NEXT_PERIOD` _(Default)_. Used when you want to recognize usage revenue
         *   in the following period.
         * - `LAST_DAY_OF_ARREARS`. Used when you want to recognize usage revenue in the same period
         *   that it's consumed, instead of in the following period.
         *
         * For example, if the retrieved Bill was on a monthly billing frequency and the billing
         * period for the Bill is September 2023 and the _External invoice date_ is set at
         * `FIRST_DAY_OF_NEXT_PERIOD`, then the `externalInvoiceDate` will be `"2023-10-01"`.
         */
        fun externalInvoiceDate(externalInvoiceDate: JsonField<LocalDate>) = apply {
            this.externalInvoiceDate = externalInvoiceDate
        }

        /**
         * Specifies the date _(in ISO 8601 format)_ of the last day in the billing period, defining
         * the time range for the associated Bills.
         *
         * For example: `"2023-03-24"`.
         */
        fun lastDateInBillingPeriod(lastDateInBillingPeriod: LocalDate) =
            lastDateInBillingPeriod(JsonField.of(lastDateInBillingPeriod))

        /**
         * Specifies the date _(in ISO 8601 format)_ of the last day in the billing period, defining
         * the time range for the associated Bills.
         *
         * For example: `"2023-03-24"`.
         */
        fun lastDateInBillingPeriod(lastDateInBillingPeriod: JsonField<LocalDate>) = apply {
            this.lastDateInBillingPeriod = lastDateInBillingPeriod
        }

        /** The unique identifier (UUID) for the user who last modified this BillJob. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The unique identifier (UUID) for the user who last modified this BillJob. */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
        }

        /**
         * The starting date _(epoch)_ for Monthly billing frequency _(in ISO 8601 format)_,
         * determining the first Bill date for monthly Bills.
         */
        fun monthEpoch(monthEpoch: LocalDate) = monthEpoch(JsonField.of(monthEpoch))

        /**
         * The starting date _(epoch)_ for Monthly billing frequency _(in ISO 8601 format)_,
         * determining the first Bill date for monthly Bills.
         */
        fun monthEpoch(monthEpoch: JsonField<LocalDate>) = apply { this.monthEpoch = monthEpoch }

        /** The number of pending actions or calculations within the BillJob. */
        fun pending(pending: Long) = pending(JsonField.of(pending))

        /** The number of pending actions or calculations within the BillJob. */
        fun pending(pending: JsonField<Long>) = apply { this.pending = pending }

        /** The current status of the BillJob, indicating its progress or completion state. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The current status of the BillJob, indicating its progress or completion state. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The currency code used for the Bill, such as USD, GBP, or EUR. */
        fun targetCurrency(targetCurrency: String) = targetCurrency(JsonField.of(targetCurrency))

        /** The currency code used for the Bill, such as USD, GBP, or EUR. */
        fun targetCurrency(targetCurrency: JsonField<String>) = apply {
            this.targetCurrency = targetCurrency
        }

        /**
         * Specifies the time zone used for the generated Bills, ensuring alignment with the local
         * time zone.
         */
        fun timezone(timezone: String) = timezone(JsonField.of(timezone))

        /**
         * Specifies the time zone used for the generated Bills, ensuring alignment with the local
         * time zone.
         */
        fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

        /** The total number of Bills or calculations related to the BillJob. */
        fun total(total: Long) = total(JsonField.of(total))

        /** The total number of Bills or calculations related to the BillJob. */
        fun total(total: JsonField<Long>) = apply { this.total = total }

        /**
         * Specifies the type of BillJob.
         * - **CREATE** Returned for a _Create BillJob_ call.
         * - **RECALCULATE** Returned for a successful _Create Recalculation BillJob_ call.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Specifies the type of BillJob.
         * - **CREATE** Returned for a _Create BillJob_ call.
         * - **RECALCULATE** Returned for a successful _Create Recalculation BillJob_ call.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /**
         * The starting date _(epoch)_ for Weekly billing frequency _(in ISO 8601 format)_,
         * determining the first Bill date for weekly Bills.
         */
        fun weekEpoch(weekEpoch: LocalDate) = weekEpoch(JsonField.of(weekEpoch))

        /**
         * The starting date _(epoch)_ for Weekly billing frequency _(in ISO 8601 format)_,
         * determining the first Bill date for weekly Bills.
         */
        fun weekEpoch(weekEpoch: JsonField<LocalDate>) = apply { this.weekEpoch = weekEpoch }

        /**
         * The starting date _(epoch)_ for Yearly billing frequency _(in ISO 8601 format)_,
         * determining the first Bill date for yearly Bills.
         */
        fun yearEpoch(yearEpoch: LocalDate) = yearEpoch(JsonField.of(yearEpoch))

        /**
         * The starting date _(epoch)_ for Yearly billing frequency _(in ISO 8601 format)_,
         * determining the first Bill date for yearly Bills.
         */
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

        fun build(): BillJob =
            BillJob(
                checkRequired("id", id),
                checkRequired("version", version),
                (accountIds ?: JsonMissing.of()).map { it.toImmutable() },
                billDate,
                billFrequencyInterval,
                (billIds ?: JsonMissing.of()).map { it.toImmutable() },
                billingFrequency,
                createdBy,
                (currencyConversions ?: JsonMissing.of()).map { it.toImmutable() },
                dayEpoch,
                dtCreated,
                dtLastModified,
                dueDate,
                externalInvoiceDate,
                lastDateInBillingPeriod,
                lastModifiedBy,
                monthEpoch,
                pending,
                status,
                targetCurrency,
                timezone,
                total,
                type,
                weekEpoch,
                yearEpoch,
                additionalProperties.toImmutable(),
            )
    }

    /**
     * Defines how often Bills are generated.
     * - **Daily**. Starting at midnight each day, covering a twenty-four hour period following.
     * - **Weekly**. Starting at midnight on a Monday morning covering the seven-day period
     *   following.
     * - **Monthly**. Starting at midnight on the morning of the first day of each month covering
     *   the entire calendar month following.
     * - **Annually**. Starting at midnight on the morning of the first day of each year covering
     *   the entire calendar year following.
     * - **Ad_Hoc**. Use this setting when a custom billing schedule is used for billing an Account,
     *   such as for billing of Prepayment/Commitment fees using a custom billing schedule.
     */
    class BillingFrequency @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val DAILY = of("DAILY")

            @JvmField val WEEKLY = of("WEEKLY")

            @JvmField val MONTHLY = of("MONTHLY")

            @JvmField val ANNUALLY = of("ANNUALLY")

            @JvmField val AD_HOC = of("AD_HOC")

            @JvmStatic fun of(value: String) = BillingFrequency(JsonField.of(value))
        }

        /** An enum containing [BillingFrequency]'s known values. */
        enum class Known {
            DAILY,
            WEEKLY,
            MONTHLY,
            ANNUALLY,
            AD_HOC,
        }

        /**
         * An enum containing [BillingFrequency]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [BillingFrequency] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DAILY,
            WEEKLY,
            MONTHLY,
            ANNUALLY,
            AD_HOC,
            /**
             * An enum member indicating that [BillingFrequency] was instantiated with an unknown
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
                DAILY -> Value.DAILY
                WEEKLY -> Value.WEEKLY
                MONTHLY -> Value.MONTHLY
                ANNUALLY -> Value.ANNUALLY
                AD_HOC -> Value.AD_HOC
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
                DAILY -> Known.DAILY
                WEEKLY -> Known.WEEKLY
                MONTHLY -> Known.MONTHLY
                ANNUALLY -> Known.ANNUALLY
                AD_HOC -> Known.AD_HOC
                else -> throw M3terInvalidDataException("Unknown BillingFrequency: $value")
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

            return /* spotless:off */ other is BillingFrequency && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The current status of the BillJob, indicating its progress or completion state. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PENDING = of("PENDING")

            @JvmField val INITIALIZING = of("INITIALIZING")

            @JvmField val RUNNING = of("RUNNING")

            @JvmField val COMPLETE = of("COMPLETE")

            @JvmField val CANCELLED = of("CANCELLED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            INITIALIZING,
            RUNNING,
            COMPLETE,
            CANCELLED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            INITIALIZING,
            RUNNING,
            COMPLETE,
            CANCELLED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                PENDING -> Value.PENDING
                INITIALIZING -> Value.INITIALIZING
                RUNNING -> Value.RUNNING
                COMPLETE -> Value.COMPLETE
                CANCELLED -> Value.CANCELLED
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
                PENDING -> Known.PENDING
                INITIALIZING -> Known.INITIALIZING
                RUNNING -> Known.RUNNING
                COMPLETE -> Known.COMPLETE
                CANCELLED -> Known.CANCELLED
                else -> throw M3terInvalidDataException("Unknown Status: $value")
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Specifies the type of BillJob.
     * - **CREATE** Returned for a _Create BillJob_ call.
     * - **RECALCULATE** Returned for a successful _Create Recalculation BillJob_ call.
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

            @JvmField val CREATE = of("CREATE")

            @JvmField val RECALCULATE = of("RECALCULATE")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            CREATE,
            RECALCULATE,
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
            CREATE,
            RECALCULATE,
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
                CREATE -> Value.CREATE
                RECALCULATE -> Value.RECALCULATE
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
                CREATE -> Known.CREATE
                RECALCULATE -> Known.RECALCULATE
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

        return /* spotless:off */ other is BillJob && id == other.id && version == other.version && accountIds == other.accountIds && billDate == other.billDate && billFrequencyInterval == other.billFrequencyInterval && billIds == other.billIds && billingFrequency == other.billingFrequency && createdBy == other.createdBy && currencyConversions == other.currencyConversions && dayEpoch == other.dayEpoch && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && dueDate == other.dueDate && externalInvoiceDate == other.externalInvoiceDate && lastDateInBillingPeriod == other.lastDateInBillingPeriod && lastModifiedBy == other.lastModifiedBy && monthEpoch == other.monthEpoch && pending == other.pending && status == other.status && targetCurrency == other.targetCurrency && timezone == other.timezone && total == other.total && type == other.type && weekEpoch == other.weekEpoch && yearEpoch == other.yearEpoch && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, accountIds, billDate, billFrequencyInterval, billIds, billingFrequency, createdBy, currencyConversions, dayEpoch, dtCreated, dtLastModified, dueDate, externalInvoiceDate, lastDateInBillingPeriod, lastModifiedBy, monthEpoch, pending, status, targetCurrency, timezone, total, type, weekEpoch, yearEpoch, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BillJob{id=$id, version=$version, accountIds=$accountIds, billDate=$billDate, billFrequencyInterval=$billFrequencyInterval, billIds=$billIds, billingFrequency=$billingFrequency, createdBy=$createdBy, currencyConversions=$currencyConversions, dayEpoch=$dayEpoch, dtCreated=$dtCreated, dtLastModified=$dtLastModified, dueDate=$dueDate, externalInvoiceDate=$externalInvoiceDate, lastDateInBillingPeriod=$lastDateInBillingPeriod, lastModifiedBy=$lastModifiedBy, monthEpoch=$monthEpoch, pending=$pending, status=$status, targetCurrency=$targetCurrency, timezone=$timezone, total=$total, type=$type, weekEpoch=$weekEpoch, yearEpoch=$yearEpoch, additionalProperties=$additionalProperties}"
}
