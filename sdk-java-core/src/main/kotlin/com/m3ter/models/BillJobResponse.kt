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
import com.m3ter.core.checkKnown
import com.m3ter.core.checkRequired
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BillJobResponse
private constructor(
    private val id: JsonField<String>,
    private val accountIds: JsonField<List<String>>,
    private val billDate: JsonField<LocalDate>,
    private val billFrequencyInterval: JsonField<Int>,
    private val billIds: JsonField<List<String>>,
    private val billingFrequency: JsonField<BillingFrequency>,
    private val createdBy: JsonField<String>,
    private val currencyConversions: JsonField<List<CurrencyConversion>>,
    private val dayEpoch: JsonField<LocalDate>,
    private val dtCreated: JsonField<OffsetDateTime>,
    private val dtLastModified: JsonField<OffsetDateTime>,
    private val dueDate: JsonField<LocalDate>,
    private val externalInvoiceDate: JsonField<LocalDate>,
    private val lastDateInBillingPeriod: JsonField<LocalDate>,
    private val lastModifiedBy: JsonField<String>,
    private val monthEpoch: JsonField<LocalDate>,
    private val pending: JsonField<Long>,
    private val status: JsonField<Status>,
    private val targetCurrency: JsonField<String>,
    private val timezone: JsonField<String>,
    private val total: JsonField<Long>,
    private val type: JsonField<Type>,
    private val version: JsonField<Long>,
    private val weekEpoch: JsonField<LocalDate>,
    private val yearEpoch: JsonField<LocalDate>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accountIds")
        @ExcludeMissing
        accountIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("billDate") @ExcludeMissing billDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("billFrequencyInterval")
        @ExcludeMissing
        billFrequencyInterval: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("billIds")
        @ExcludeMissing
        billIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("billingFrequency")
        @ExcludeMissing
        billingFrequency: JsonField<BillingFrequency> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currencyConversions")
        @ExcludeMissing
        currencyConversions: JsonField<List<CurrencyConversion>> = JsonMissing.of(),
        @JsonProperty("dayEpoch") @ExcludeMissing dayEpoch: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("dtCreated")
        @ExcludeMissing
        dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dueDate") @ExcludeMissing dueDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("externalInvoiceDate")
        @ExcludeMissing
        externalInvoiceDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("lastDateInBillingPeriod")
        @ExcludeMissing
        lastDateInBillingPeriod: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        lastModifiedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("monthEpoch")
        @ExcludeMissing
        monthEpoch: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("pending") @ExcludeMissing pending: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("targetCurrency")
        @ExcludeMissing
        targetCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timezone") @ExcludeMissing timezone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("weekEpoch")
        @ExcludeMissing
        weekEpoch: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("yearEpoch")
        @ExcludeMissing
        yearEpoch: JsonField<LocalDate> = JsonMissing.of(),
    ) : this(
        id,
        accountIds,
        billDate,
        billFrequencyInterval,
        billIds,
        billingFrequency,
        createdBy,
        currencyConversions,
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
        version,
        weekEpoch,
        yearEpoch,
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
     * An array of UUIDs representing the end customer Accounts associated with the BillJob.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountIds(): Optional<List<String>> = accountIds.getOptional("accountIds")

    /**
     * The specific billing date *(in ISO 8601 format)*, determining when the Bill was generated.
     *
     * For example: `"2023-01-24"`.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billDate(): Optional<LocalDate> = billDate.getOptional("billDate")

    /**
     * How often Bills are issued - used in conjunction with `billingFrequency`.
     *
     * For example, if `billingFrequency` is set to Monthly and `billFrequencyInterval` is set to 3,
     * Bills are issued every three months.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billFrequencyInterval(): Optional<Int> =
        billFrequencyInterval.getOptional("billFrequencyInterval")

    /**
     * An array of Bill IDs related to the BillJob, providing references to the specific Bills
     * generated.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billIds(): Optional<List<String>> = billIds.getOptional("billIds")

    /**
     * Defines how often Bills are generated.
     * * **Daily**. Starting at midnight each day, covering a twenty-four hour period following.
     * * **Weekly**. Starting at midnight on a Monday morning covering the seven-day period
     *   following.
     * * **Monthly**. Starting at midnight on the morning of the first day of each month covering
     *   the entire calendar month following.
     * * **Annually**. Starting at midnight on the morning of the first day of each year covering
     *   the entire calendar year following.
     * * **Ad_Hoc**. Use this setting when a custom billing schedule is used for billing an Account,
     *   such as for billing of Prepayment/Commitment fees using a custom billing schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingFrequency(): Optional<BillingFrequency> =
        billingFrequency.getOptional("billingFrequency")

    /**
     * The unique identifier (UUID) for the user who created the BillJob.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * An array of currency conversion rates from Bill currency to Organization currency. For
     * example, if Account is billed in GBP and Organization is set to USD, Bill line items are
     * calculated in GBP and then converted to USD using the defined rate.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencyConversions(): Optional<List<CurrencyConversion>> =
        currencyConversions.getOptional("currencyConversions")

    /**
     * The starting date *(epoch)* for Daily billing frequency *(in ISO 8601 format)*, determining
     * the first Bill date for daily Bills.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dayEpoch(): Optional<LocalDate> = dayEpoch.getOptional("dayEpoch")

    /**
     * The date and time *(in ISO 8601 format)* when the BillJob was first created.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtCreated(): Optional<OffsetDateTime> = dtCreated.getOptional("dtCreated")

    /**
     * The date and time *(in ISO 8601 format)* when the BillJob was last modified.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtLastModified(): Optional<OffsetDateTime> = dtLastModified.getOptional("dtLastModified")

    /**
     * The due date *(in ISO 8601 format)* for payment of the Bill.
     *
     * For example: `"2023-02-24"`.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dueDate(): Optional<LocalDate> = dueDate.getOptional("dueDate")

    /**
     * For accounting purposes, the date set at Organization level to use for external invoicing
     * with respect to billing periods - two options:
     * * `FIRST_DAY_OF_NEXT_PERIOD` *(Default)*. Used when you want to recognize usage revenue in
     *   the following period.
     * * `LAST_DAY_OF_ARREARS`. Used when you want to recognize usage revenue in the same period
     *   that it's consumed, instead of in the following period.
     *
     * For example, if the retrieved Bill was on a monthly billing frequency and the billing period
     * for the Bill is September 2023 and the *External invoice date* is set at
     * `FIRST_DAY_OF_NEXT_PERIOD`, then the `externalInvoiceDate` will be `"2023-10-01"`.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalInvoiceDate(): Optional<LocalDate> =
        externalInvoiceDate.getOptional("externalInvoiceDate")

    /**
     * Specifies the date *(in ISO 8601 format)* of the last day in the billing period, defining the
     * time range for the associated Bills.
     *
     * For example: `"2023-03-24"`.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastDateInBillingPeriod(): Optional<LocalDate> =
        lastDateInBillingPeriod.getOptional("lastDateInBillingPeriod")

    /**
     * The unique identifier (UUID) for the user who last modified this BillJob.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedBy(): Optional<String> = lastModifiedBy.getOptional("lastModifiedBy")

    /**
     * The starting date *(epoch)* for Monthly billing frequency *(in ISO 8601 format)*, determining
     * the first Bill date for monthly Bills.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun monthEpoch(): Optional<LocalDate> = monthEpoch.getOptional("monthEpoch")

    /**
     * The number of pending actions or calculations within the BillJob.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pending(): Optional<Long> = pending.getOptional("pending")

    /**
     * The current status of the BillJob, indicating its progress or completion state.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * The currency code used for the Bill, such as USD, GBP, or EUR.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun targetCurrency(): Optional<String> = targetCurrency.getOptional("targetCurrency")

    /**
     * Specifies the time zone used for the generated Bills, ensuring alignment with the local time
     * zone.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timezone(): Optional<String> = timezone.getOptional("timezone")

    /**
     * The total number of Bills or calculations related to the BillJob.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun total(): Optional<Long> = total.getOptional("total")

    /**
     * Specifies the type of BillJob.
     * * **CREATE** Returned for a *Create BillJob* call.
     * * **RECALCULATE** Returned for a successful *Create Recalculation BillJob* call.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun version(): Optional<Long> = version.getOptional("version")

    /**
     * The starting date *(epoch)* for Weekly billing frequency *(in ISO 8601 format)*, determining
     * the first Bill date for weekly Bills.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun weekEpoch(): Optional<LocalDate> = weekEpoch.getOptional("weekEpoch")

    /**
     * The starting date *(epoch)* for Yearly billing frequency *(in ISO 8601 format)*, determining
     * the first Bill date for yearly Bills.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun yearEpoch(): Optional<LocalDate> = yearEpoch.getOptional("yearEpoch")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [accountIds].
     *
     * Unlike [accountIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountIds")
    @ExcludeMissing
    fun _accountIds(): JsonField<List<String>> = accountIds

    /**
     * Returns the raw JSON value of [billDate].
     *
     * Unlike [billDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billDate") @ExcludeMissing fun _billDate(): JsonField<LocalDate> = billDate

    /**
     * Returns the raw JSON value of [billFrequencyInterval].
     *
     * Unlike [billFrequencyInterval], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("billFrequencyInterval")
    @ExcludeMissing
    fun _billFrequencyInterval(): JsonField<Int> = billFrequencyInterval

    /**
     * Returns the raw JSON value of [billIds].
     *
     * Unlike [billIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billIds") @ExcludeMissing fun _billIds(): JsonField<List<String>> = billIds

    /**
     * Returns the raw JSON value of [billingFrequency].
     *
     * Unlike [billingFrequency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("billingFrequency")
    @ExcludeMissing
    fun _billingFrequency(): JsonField<BillingFrequency> = billingFrequency

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [currencyConversions].
     *
     * Unlike [currencyConversions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("currencyConversions")
    @ExcludeMissing
    fun _currencyConversions(): JsonField<List<CurrencyConversion>> = currencyConversions

    /**
     * Returns the raw JSON value of [dayEpoch].
     *
     * Unlike [dayEpoch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dayEpoch") @ExcludeMissing fun _dayEpoch(): JsonField<LocalDate> = dayEpoch

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
     * Returns the raw JSON value of [dueDate].
     *
     * Unlike [dueDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dueDate") @ExcludeMissing fun _dueDate(): JsonField<LocalDate> = dueDate

    /**
     * Returns the raw JSON value of [externalInvoiceDate].
     *
     * Unlike [externalInvoiceDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("externalInvoiceDate")
    @ExcludeMissing
    fun _externalInvoiceDate(): JsonField<LocalDate> = externalInvoiceDate

    /**
     * Returns the raw JSON value of [lastDateInBillingPeriod].
     *
     * Unlike [lastDateInBillingPeriod], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("lastDateInBillingPeriod")
    @ExcludeMissing
    fun _lastDateInBillingPeriod(): JsonField<LocalDate> = lastDateInBillingPeriod

    /**
     * Returns the raw JSON value of [lastModifiedBy].
     *
     * Unlike [lastModifiedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /**
     * Returns the raw JSON value of [monthEpoch].
     *
     * Unlike [monthEpoch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("monthEpoch") @ExcludeMissing fun _monthEpoch(): JsonField<LocalDate> = monthEpoch

    /**
     * Returns the raw JSON value of [pending].
     *
     * Unlike [pending], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pending") @ExcludeMissing fun _pending(): JsonField<Long> = pending

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [targetCurrency].
     *
     * Unlike [targetCurrency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("targetCurrency")
    @ExcludeMissing
    fun _targetCurrency(): JsonField<String> = targetCurrency

    /**
     * Returns the raw JSON value of [timezone].
     *
     * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<String> = timezone

    /**
     * Returns the raw JSON value of [total].
     *
     * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Long> = total

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

    /**
     * Returns the raw JSON value of [weekEpoch].
     *
     * Unlike [weekEpoch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("weekEpoch") @ExcludeMissing fun _weekEpoch(): JsonField<LocalDate> = weekEpoch

    /**
     * Returns the raw JSON value of [yearEpoch].
     *
     * Unlike [yearEpoch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("yearEpoch") @ExcludeMissing fun _yearEpoch(): JsonField<LocalDate> = yearEpoch

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
         * Returns a mutable builder for constructing an instance of [BillJobResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BillJobResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountIds: JsonField<MutableList<String>>? = null
        private var billDate: JsonField<LocalDate> = JsonMissing.of()
        private var billFrequencyInterval: JsonField<Int> = JsonMissing.of()
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
        private var version: JsonField<Long> = JsonMissing.of()
        private var weekEpoch: JsonField<LocalDate> = JsonMissing.of()
        private var yearEpoch: JsonField<LocalDate> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(billJobResponse: BillJobResponse) = apply {
            id = billJobResponse.id
            accountIds = billJobResponse.accountIds.map { it.toMutableList() }
            billDate = billJobResponse.billDate
            billFrequencyInterval = billJobResponse.billFrequencyInterval
            billIds = billJobResponse.billIds.map { it.toMutableList() }
            billingFrequency = billJobResponse.billingFrequency
            createdBy = billJobResponse.createdBy
            currencyConversions = billJobResponse.currencyConversions.map { it.toMutableList() }
            dayEpoch = billJobResponse.dayEpoch
            dtCreated = billJobResponse.dtCreated
            dtLastModified = billJobResponse.dtLastModified
            dueDate = billJobResponse.dueDate
            externalInvoiceDate = billJobResponse.externalInvoiceDate
            lastDateInBillingPeriod = billJobResponse.lastDateInBillingPeriod
            lastModifiedBy = billJobResponse.lastModifiedBy
            monthEpoch = billJobResponse.monthEpoch
            pending = billJobResponse.pending
            status = billJobResponse.status
            targetCurrency = billJobResponse.targetCurrency
            timezone = billJobResponse.timezone
            total = billJobResponse.total
            type = billJobResponse.type
            version = billJobResponse.version
            weekEpoch = billJobResponse.weekEpoch
            yearEpoch = billJobResponse.yearEpoch
            additionalProperties = billJobResponse.additionalProperties.toMutableMap()
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

        /** An array of UUIDs representing the end customer Accounts associated with the BillJob. */
        fun accountIds(accountIds: List<String>) = accountIds(JsonField.of(accountIds))

        /**
         * Sets [Builder.accountIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountIds(accountIds: JsonField<List<String>>) = apply {
            this.accountIds = accountIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [accountIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAccountId(accountId: String) = apply {
            accountIds =
                (accountIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("accountIds", it).add(accountId)
                }
        }

        /**
         * The specific billing date *(in ISO 8601 format)*, determining when the Bill was
         * generated.
         *
         * For example: `"2023-01-24"`.
         */
        fun billDate(billDate: LocalDate) = billDate(JsonField.of(billDate))

        /**
         * Sets [Builder.billDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun billDate(billDate: JsonField<LocalDate>) = apply { this.billDate = billDate }

        /**
         * How often Bills are issued - used in conjunction with `billingFrequency`.
         *
         * For example, if `billingFrequency` is set to Monthly and `billFrequencyInterval` is set
         * to 3, Bills are issued every three months.
         */
        fun billFrequencyInterval(billFrequencyInterval: Int) =
            billFrequencyInterval(JsonField.of(billFrequencyInterval))

        /**
         * Sets [Builder.billFrequencyInterval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billFrequencyInterval] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billFrequencyInterval(billFrequencyInterval: JsonField<Int>) = apply {
            this.billFrequencyInterval = billFrequencyInterval
        }

        /**
         * An array of Bill IDs related to the BillJob, providing references to the specific Bills
         * generated.
         */
        fun billIds(billIds: List<String>) = billIds(JsonField.of(billIds))

        /**
         * Sets [Builder.billIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billIds] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun billIds(billIds: JsonField<List<String>>) = apply {
            this.billIds = billIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [billIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBillId(billId: String) = apply {
            billIds =
                (billIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("billIds", it).add(billId)
                }
        }

        /**
         * Defines how often Bills are generated.
         * * **Daily**. Starting at midnight each day, covering a twenty-four hour period following.
         * * **Weekly**. Starting at midnight on a Monday morning covering the seven-day period
         *   following.
         * * **Monthly**. Starting at midnight on the morning of the first day of each month
         *   covering the entire calendar month following.
         * * **Annually**. Starting at midnight on the morning of the first day of each year
         *   covering the entire calendar year following.
         * * **Ad_Hoc**. Use this setting when a custom billing schedule is used for billing an
         *   Account, such as for billing of Prepayment/Commitment fees using a custom billing
         *   schedule.
         */
        fun billingFrequency(billingFrequency: BillingFrequency) =
            billingFrequency(JsonField.of(billingFrequency))

        /**
         * Sets [Builder.billingFrequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingFrequency] with a well-typed [BillingFrequency]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun billingFrequency(billingFrequency: JsonField<BillingFrequency>) = apply {
            this.billingFrequency = billingFrequency
        }

        /** The unique identifier (UUID) for the user who created the BillJob. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /**
         * An array of currency conversion rates from Bill currency to Organization currency. For
         * example, if Account is billed in GBP and Organization is set to USD, Bill line items are
         * calculated in GBP and then converted to USD using the defined rate.
         */
        fun currencyConversions(currencyConversions: List<CurrencyConversion>) =
            currencyConversions(JsonField.of(currencyConversions))

        /**
         * Sets [Builder.currencyConversions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyConversions] with a well-typed
         * `List<CurrencyConversion>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun currencyConversions(currencyConversions: JsonField<List<CurrencyConversion>>) = apply {
            this.currencyConversions = currencyConversions.map { it.toMutableList() }
        }

        /**
         * Adds a single [CurrencyConversion] to [currencyConversions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCurrencyConversion(currencyConversion: CurrencyConversion) = apply {
            currencyConversions =
                (currencyConversions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("currencyConversions", it).add(currencyConversion)
                }
        }

        /**
         * The starting date *(epoch)* for Daily billing frequency *(in ISO 8601 format)*,
         * determining the first Bill date for daily Bills.
         */
        fun dayEpoch(dayEpoch: LocalDate) = dayEpoch(JsonField.of(dayEpoch))

        /**
         * Sets [Builder.dayEpoch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dayEpoch] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dayEpoch(dayEpoch: JsonField<LocalDate>) = apply { this.dayEpoch = dayEpoch }

        /** The date and time *(in ISO 8601 format)* when the BillJob was first created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /**
         * Sets [Builder.dtCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The date and time *(in ISO 8601 format)* when the BillJob was last modified. */
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

        /**
         * The due date *(in ISO 8601 format)* for payment of the Bill.
         *
         * For example: `"2023-02-24"`.
         */
        fun dueDate(dueDate: LocalDate) = dueDate(JsonField.of(dueDate))

        /**
         * Sets [Builder.dueDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dueDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dueDate(dueDate: JsonField<LocalDate>) = apply { this.dueDate = dueDate }

        /**
         * For accounting purposes, the date set at Organization level to use for external invoicing
         * with respect to billing periods - two options:
         * * `FIRST_DAY_OF_NEXT_PERIOD` *(Default)*. Used when you want to recognize usage revenue
         *   in the following period.
         * * `LAST_DAY_OF_ARREARS`. Used when you want to recognize usage revenue in the same period
         *   that it's consumed, instead of in the following period.
         *
         * For example, if the retrieved Bill was on a monthly billing frequency and the billing
         * period for the Bill is September 2023 and the *External invoice date* is set at
         * `FIRST_DAY_OF_NEXT_PERIOD`, then the `externalInvoiceDate` will be `"2023-10-01"`.
         */
        fun externalInvoiceDate(externalInvoiceDate: LocalDate) =
            externalInvoiceDate(JsonField.of(externalInvoiceDate))

        /**
         * Sets [Builder.externalInvoiceDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalInvoiceDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalInvoiceDate(externalInvoiceDate: JsonField<LocalDate>) = apply {
            this.externalInvoiceDate = externalInvoiceDate
        }

        /**
         * Specifies the date *(in ISO 8601 format)* of the last day in the billing period, defining
         * the time range for the associated Bills.
         *
         * For example: `"2023-03-24"`.
         */
        fun lastDateInBillingPeriod(lastDateInBillingPeriod: LocalDate) =
            lastDateInBillingPeriod(JsonField.of(lastDateInBillingPeriod))

        /**
         * Sets [Builder.lastDateInBillingPeriod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastDateInBillingPeriod] with a well-typed [LocalDate]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lastDateInBillingPeriod(lastDateInBillingPeriod: JsonField<LocalDate>) = apply {
            this.lastDateInBillingPeriod = lastDateInBillingPeriod
        }

        /** The unique identifier (UUID) for the user who last modified this BillJob. */
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
         * The starting date *(epoch)* for Monthly billing frequency *(in ISO 8601 format)*,
         * determining the first Bill date for monthly Bills.
         */
        fun monthEpoch(monthEpoch: LocalDate) = monthEpoch(JsonField.of(monthEpoch))

        /**
         * Sets [Builder.monthEpoch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.monthEpoch] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun monthEpoch(monthEpoch: JsonField<LocalDate>) = apply { this.monthEpoch = monthEpoch }

        /** The number of pending actions or calculations within the BillJob. */
        fun pending(pending: Long) = pending(JsonField.of(pending))

        /**
         * Sets [Builder.pending] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pending] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pending(pending: JsonField<Long>) = apply { this.pending = pending }

        /** The current status of the BillJob, indicating its progress or completion state. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The currency code used for the Bill, such as USD, GBP, or EUR. */
        fun targetCurrency(targetCurrency: String) = targetCurrency(JsonField.of(targetCurrency))

        /**
         * Sets [Builder.targetCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetCurrency] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun targetCurrency(targetCurrency: JsonField<String>) = apply {
            this.targetCurrency = targetCurrency
        }

        /**
         * Specifies the time zone used for the generated Bills, ensuring alignment with the local
         * time zone.
         */
        fun timezone(timezone: String) = timezone(JsonField.of(timezone))

        /**
         * Sets [Builder.timezone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timezone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

        /** The total number of Bills or calculations related to the BillJob. */
        fun total(total: Long) = total(JsonField.of(total))

        /**
         * Sets [Builder.total] to an arbitrary JSON value.
         *
         * You should usually call [Builder.total] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun total(total: JsonField<Long>) = apply { this.total = total }

        /**
         * Specifies the type of BillJob.
         * * **CREATE** Returned for a *Create BillJob* call.
         * * **RECALCULATE** Returned for a successful *Create Recalculation BillJob* call.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        /**
         * The starting date *(epoch)* for Weekly billing frequency *(in ISO 8601 format)*,
         * determining the first Bill date for weekly Bills.
         */
        fun weekEpoch(weekEpoch: LocalDate) = weekEpoch(JsonField.of(weekEpoch))

        /**
         * Sets [Builder.weekEpoch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.weekEpoch] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun weekEpoch(weekEpoch: JsonField<LocalDate>) = apply { this.weekEpoch = weekEpoch }

        /**
         * The starting date *(epoch)* for Yearly billing frequency *(in ISO 8601 format)*,
         * determining the first Bill date for yearly Bills.
         */
        fun yearEpoch(yearEpoch: LocalDate) = yearEpoch(JsonField.of(yearEpoch))

        /**
         * Sets [Builder.yearEpoch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.yearEpoch] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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

        /**
         * Returns an immutable instance of [BillJobResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BillJobResponse =
            BillJobResponse(
                checkRequired("id", id),
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
                version,
                weekEpoch,
                yearEpoch,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BillJobResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        accountIds()
        billDate()
        billFrequencyInterval()
        billIds()
        billingFrequency().ifPresent { it.validate() }
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
        status().ifPresent { it.validate() }
        targetCurrency()
        timezone()
        total()
        type().ifPresent { it.validate() }
        version()
        weekEpoch()
        yearEpoch()
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
            (accountIds.asKnown().getOrNull()?.size ?: 0) +
            (if (billDate.asKnown().isPresent) 1 else 0) +
            (if (billFrequencyInterval.asKnown().isPresent) 1 else 0) +
            (billIds.asKnown().getOrNull()?.size ?: 0) +
            (billingFrequency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (currencyConversions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (dayEpoch.asKnown().isPresent) 1 else 0) +
            (if (dtCreated.asKnown().isPresent) 1 else 0) +
            (if (dtLastModified.asKnown().isPresent) 1 else 0) +
            (if (dueDate.asKnown().isPresent) 1 else 0) +
            (if (externalInvoiceDate.asKnown().isPresent) 1 else 0) +
            (if (lastDateInBillingPeriod.asKnown().isPresent) 1 else 0) +
            (if (lastModifiedBy.asKnown().isPresent) 1 else 0) +
            (if (monthEpoch.asKnown().isPresent) 1 else 0) +
            (if (pending.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (targetCurrency.asKnown().isPresent) 1 else 0) +
            (if (timezone.asKnown().isPresent) 1 else 0) +
            (if (total.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (version.asKnown().isPresent) 1 else 0) +
            (if (weekEpoch.asKnown().isPresent) 1 else 0) +
            (if (yearEpoch.asKnown().isPresent) 1 else 0)

    /**
     * Defines how often Bills are generated.
     * * **Daily**. Starting at midnight each day, covering a twenty-four hour period following.
     * * **Weekly**. Starting at midnight on a Monday morning covering the seven-day period
     *   following.
     * * **Monthly**. Starting at midnight on the morning of the first day of each month covering
     *   the entire calendar month following.
     * * **Annually**. Starting at midnight on the morning of the first day of each year covering
     *   the entire calendar year following.
     * * **Ad_Hoc**. Use this setting when a custom billing schedule is used for billing an Account,
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

        private var validated: Boolean = false

        fun validate(): BillingFrequency = apply {
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

            return other is BillingFrequency && value == other.value
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

        private var validated: Boolean = false

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Specifies the type of BillJob.
     * * **CREATE** Returned for a *Create BillJob* call.
     * * **RECALCULATE** Returned for a successful *Create Recalculation BillJob* call.
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

        return other is BillJobResponse &&
            id == other.id &&
            accountIds == other.accountIds &&
            billDate == other.billDate &&
            billFrequencyInterval == other.billFrequencyInterval &&
            billIds == other.billIds &&
            billingFrequency == other.billingFrequency &&
            createdBy == other.createdBy &&
            currencyConversions == other.currencyConversions &&
            dayEpoch == other.dayEpoch &&
            dtCreated == other.dtCreated &&
            dtLastModified == other.dtLastModified &&
            dueDate == other.dueDate &&
            externalInvoiceDate == other.externalInvoiceDate &&
            lastDateInBillingPeriod == other.lastDateInBillingPeriod &&
            lastModifiedBy == other.lastModifiedBy &&
            monthEpoch == other.monthEpoch &&
            pending == other.pending &&
            status == other.status &&
            targetCurrency == other.targetCurrency &&
            timezone == other.timezone &&
            total == other.total &&
            type == other.type &&
            version == other.version &&
            weekEpoch == other.weekEpoch &&
            yearEpoch == other.yearEpoch &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accountIds,
            billDate,
            billFrequencyInterval,
            billIds,
            billingFrequency,
            createdBy,
            currencyConversions,
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
            version,
            weekEpoch,
            yearEpoch,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BillJobResponse{id=$id, accountIds=$accountIds, billDate=$billDate, billFrequencyInterval=$billFrequencyInterval, billIds=$billIds, billingFrequency=$billingFrequency, createdBy=$createdBy, currencyConversions=$currencyConversions, dayEpoch=$dayEpoch, dtCreated=$dtCreated, dtLastModified=$dtLastModified, dueDate=$dueDate, externalInvoiceDate=$externalInvoiceDate, lastDateInBillingPeriod=$lastDateInBillingPeriod, lastModifiedBy=$lastModifiedBy, monthEpoch=$monthEpoch, pending=$pending, status=$status, targetCurrency=$targetCurrency, timezone=$timezone, total=$total, type=$type, version=$version, weekEpoch=$weekEpoch, yearEpoch=$yearEpoch, additionalProperties=$additionalProperties}"
}
