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
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create a new BillJob to handle asynchronous bill calculations for a specific Organization.
 *
 * This operation allows you to initiate the processing of bills according to specified parameters.
 * For example, create a BillJob to run only those bills where `billingFrequency` is `MONTHLY`. Note
 * that if you want to run a BillJob for all billing frequencies, simply omit the `billingFrequency`
 * request parameter.
 *
 * Once created, the BillJob's progress can be monitored:
 * - In the Running Tasks panel in the m3ter Console - for more details, see
 *   [Running Bills Manually](https://www.m3ter.com/docs/guides/billing-and-usage-data/running-viewing-and-managing-bills/running-bills-and-viewing-bill-details#running-bills-manually)
 * - Queried using the
 *   [List BillJobs](https://www.m3ter.com/docs/api#tag/BillJob/operation/ListBillJobs) operation.
 *
 * **NOTES:**
 * - **Consolidated bills**. If you've already run billing with the Consolidate bills option
 *   disabled for your Organization but you then enable it, subsequent Bills for specific bill dates
 *   will now start afresh and not update earlier non-consolidated Bills for the same bill date. To
 *   avoid any billing conflicts, you might want to archive these earlier versions or delete them
 *   entirely.
 * - **Maximum concurrent BillJobs**. If you already have 10 BillJobs currently running, and try to
 *   create another one, you'll get an HTTP 429 response (Too many requests). When one of the
 *   existing BillJobs has completed, you'll be able to submit another job
 */
class BillJobCreateParams
private constructor(
    private val orgId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    /**
     * An array of UUIDs representing the end customer Accounts associated with the BillJob.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountIds(): Optional<List<String>> = body.accountIds()

    /**
     * The specific billing date *(in ISO 8601 format)*, determining when the Bill was generated.
     *
     * For example: `"2023-01-24"`.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billDate(): Optional<LocalDate> = body.billDate()

    /**
     * How often Bills are issued - used in conjunction with `billingFrequency`.
     *
     * For example, if `billingFrequency` is set to Monthly and `billFrequencyInterval` is set to 3,
     * Bills are issued every three months.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billFrequencyInterval(): Optional<Int> = body.billFrequencyInterval()

    /**
     * How often Bills are generated.
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
    fun billingFrequency(): Optional<BillingFrequency> = body.billingFrequency()

    /**
     * An array of currency conversion rates from Bill currency to Organization currency. For
     * example, if Account is billed in GBP and Organization is set to USD, Bill line items are
     * calculated in GBP and then converted to USD using the defined rate.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencyConversions(): Optional<List<CurrencyConversion>> = body.currencyConversions()

    /**
     * The starting date *(epoch)* for Daily billing frequency *(in ISO 8601 format)*, determining
     * the first Bill date for daily Bills.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dayEpoch(): Optional<LocalDate> = body.dayEpoch()

    /**
     * The due date *(in ISO 8601 format)* for payment of the Bill.
     *
     * For example: `"2023-02-24"`.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dueDate(): Optional<LocalDate> = body.dueDate()

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
     * **NOTE:** To change the `externalInvoiceDate` setting for your Organization, you can use the
     * [Update OrganizationConfig](https://www.m3ter.com/docs/api#tag/OrganizationConfig/operation/GetOrganizationConfig)
     * call.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalInvoiceDate(): Optional<LocalDate> = body.externalInvoiceDate()

    /**
     * Specifies the date *(in ISO 8601 format)* of the last day in the billing period, defining the
     * time range for the associated Bills.
     *
     * For example: `"2023-03-24"`.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastDateInBillingPeriod(): Optional<LocalDate> = body.lastDateInBillingPeriod()

    /**
     * The starting date *(epoch)* for Monthly billing frequency *(in ISO 8601 format)*, determining
     * the first Bill date for monthly Bills.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun monthEpoch(): Optional<LocalDate> = body.monthEpoch()

    /**
     * The currency code used for the Bill, such as USD, GBP, or EUR.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun targetCurrency(): Optional<String> = body.targetCurrency()

    /**
     * Specifies the time zone used for the generated Bills, ensuring alignment with the local time
     * zone.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timezone(): Optional<String> = body.timezone()

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
     * The starting date *(epoch)* for Weekly billing frequency *(in ISO 8601 format)*, determining
     * the first Bill date for weekly Bills.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun weekEpoch(): Optional<LocalDate> = body.weekEpoch()

    /**
     * The starting date *(epoch)* for Yearly billing frequency *(in ISO 8601 format)*, determining
     * the first Bill date for yearly Bills.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun yearEpoch(): Optional<LocalDate> = body.yearEpoch()

    /**
     * Returns the raw JSON value of [accountIds].
     *
     * Unlike [accountIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountIds(): JsonField<List<String>> = body._accountIds()

    /**
     * Returns the raw JSON value of [billDate].
     *
     * Unlike [billDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billDate(): JsonField<LocalDate> = body._billDate()

    /**
     * Returns the raw JSON value of [billFrequencyInterval].
     *
     * Unlike [billFrequencyInterval], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _billFrequencyInterval(): JsonField<Int> = body._billFrequencyInterval()

    /**
     * Returns the raw JSON value of [billingFrequency].
     *
     * Unlike [billingFrequency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _billingFrequency(): JsonField<BillingFrequency> = body._billingFrequency()

    /**
     * Returns the raw JSON value of [currencyConversions].
     *
     * Unlike [currencyConversions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _currencyConversions(): JsonField<List<CurrencyConversion>> = body._currencyConversions()

    /**
     * Returns the raw JSON value of [dayEpoch].
     *
     * Unlike [dayEpoch], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dayEpoch(): JsonField<LocalDate> = body._dayEpoch()

    /**
     * Returns the raw JSON value of [dueDate].
     *
     * Unlike [dueDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dueDate(): JsonField<LocalDate> = body._dueDate()

    /**
     * Returns the raw JSON value of [externalInvoiceDate].
     *
     * Unlike [externalInvoiceDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _externalInvoiceDate(): JsonField<LocalDate> = body._externalInvoiceDate()

    /**
     * Returns the raw JSON value of [lastDateInBillingPeriod].
     *
     * Unlike [lastDateInBillingPeriod], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _lastDateInBillingPeriod(): JsonField<LocalDate> = body._lastDateInBillingPeriod()

    /**
     * Returns the raw JSON value of [monthEpoch].
     *
     * Unlike [monthEpoch], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _monthEpoch(): JsonField<LocalDate> = body._monthEpoch()

    /**
     * Returns the raw JSON value of [targetCurrency].
     *
     * Unlike [targetCurrency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _targetCurrency(): JsonField<String> = body._targetCurrency()

    /**
     * Returns the raw JSON value of [timezone].
     *
     * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timezone(): JsonField<String> = body._timezone()

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _version(): JsonField<Long> = body._version()

    /**
     * Returns the raw JSON value of [weekEpoch].
     *
     * Unlike [weekEpoch], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _weekEpoch(): JsonField<LocalDate> = body._weekEpoch()

    /**
     * Returns the raw JSON value of [yearEpoch].
     *
     * Unlike [yearEpoch], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _yearEpoch(): JsonField<LocalDate> = body._yearEpoch()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): BillJobCreateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [BillJobCreateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BillJobCreateParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(billJobCreateParams: BillJobCreateParams) = apply {
            orgId = billJobCreateParams.orgId
            body = billJobCreateParams.body.toBuilder()
            additionalHeaders = billJobCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = billJobCreateParams.additionalQueryParams.toBuilder()
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
         * - [accountIds]
         * - [billDate]
         * - [billFrequencyInterval]
         * - [billingFrequency]
         * - [currencyConversions]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** An array of UUIDs representing the end customer Accounts associated with the BillJob. */
        fun accountIds(accountIds: List<String>) = apply { body.accountIds(accountIds) }

        /**
         * Sets [Builder.accountIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountIds(accountIds: JsonField<List<String>>) = apply { body.accountIds(accountIds) }

        /**
         * Adds a single [String] to [accountIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAccountId(accountId: String) = apply { body.addAccountId(accountId) }

        /**
         * The specific billing date *(in ISO 8601 format)*, determining when the Bill was
         * generated.
         *
         * For example: `"2023-01-24"`.
         */
        fun billDate(billDate: LocalDate) = apply { body.billDate(billDate) }

        /**
         * Sets [Builder.billDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun billDate(billDate: JsonField<LocalDate>) = apply { body.billDate(billDate) }

        /**
         * How often Bills are issued - used in conjunction with `billingFrequency`.
         *
         * For example, if `billingFrequency` is set to Monthly and `billFrequencyInterval` is set
         * to 3, Bills are issued every three months.
         */
        fun billFrequencyInterval(billFrequencyInterval: Int) = apply {
            body.billFrequencyInterval(billFrequencyInterval)
        }

        /**
         * Sets [Builder.billFrequencyInterval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billFrequencyInterval] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billFrequencyInterval(billFrequencyInterval: JsonField<Int>) = apply {
            body.billFrequencyInterval(billFrequencyInterval)
        }

        /**
         * How often Bills are generated.
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
        fun billingFrequency(billingFrequency: BillingFrequency) = apply {
            body.billingFrequency(billingFrequency)
        }

        /**
         * Sets [Builder.billingFrequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingFrequency] with a well-typed [BillingFrequency]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun billingFrequency(billingFrequency: JsonField<BillingFrequency>) = apply {
            body.billingFrequency(billingFrequency)
        }

        /**
         * An array of currency conversion rates from Bill currency to Organization currency. For
         * example, if Account is billed in GBP and Organization is set to USD, Bill line items are
         * calculated in GBP and then converted to USD using the defined rate.
         */
        fun currencyConversions(currencyConversions: List<CurrencyConversion>) = apply {
            body.currencyConversions(currencyConversions)
        }

        /**
         * Sets [Builder.currencyConversions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyConversions] with a well-typed
         * `List<CurrencyConversion>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun currencyConversions(currencyConversions: JsonField<List<CurrencyConversion>>) = apply {
            body.currencyConversions(currencyConversions)
        }

        /**
         * Adds a single [CurrencyConversion] to [currencyConversions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCurrencyConversion(currencyConversion: CurrencyConversion) = apply {
            body.addCurrencyConversion(currencyConversion)
        }

        /**
         * The starting date *(epoch)* for Daily billing frequency *(in ISO 8601 format)*,
         * determining the first Bill date for daily Bills.
         */
        fun dayEpoch(dayEpoch: LocalDate) = apply { body.dayEpoch(dayEpoch) }

        /**
         * Sets [Builder.dayEpoch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dayEpoch] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dayEpoch(dayEpoch: JsonField<LocalDate>) = apply { body.dayEpoch(dayEpoch) }

        /**
         * The due date *(in ISO 8601 format)* for payment of the Bill.
         *
         * For example: `"2023-02-24"`.
         */
        fun dueDate(dueDate: LocalDate) = apply { body.dueDate(dueDate) }

        /**
         * Sets [Builder.dueDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dueDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dueDate(dueDate: JsonField<LocalDate>) = apply { body.dueDate(dueDate) }

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
         *
         * **NOTE:** To change the `externalInvoiceDate` setting for your Organization, you can use
         * the
         * [Update OrganizationConfig](https://www.m3ter.com/docs/api#tag/OrganizationConfig/operation/GetOrganizationConfig)
         * call.
         */
        fun externalInvoiceDate(externalInvoiceDate: LocalDate) = apply {
            body.externalInvoiceDate(externalInvoiceDate)
        }

        /**
         * Sets [Builder.externalInvoiceDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalInvoiceDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalInvoiceDate(externalInvoiceDate: JsonField<LocalDate>) = apply {
            body.externalInvoiceDate(externalInvoiceDate)
        }

        /**
         * Specifies the date *(in ISO 8601 format)* of the last day in the billing period, defining
         * the time range for the associated Bills.
         *
         * For example: `"2023-03-24"`.
         */
        fun lastDateInBillingPeriod(lastDateInBillingPeriod: LocalDate) = apply {
            body.lastDateInBillingPeriod(lastDateInBillingPeriod)
        }

        /**
         * Sets [Builder.lastDateInBillingPeriod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastDateInBillingPeriod] with a well-typed [LocalDate]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lastDateInBillingPeriod(lastDateInBillingPeriod: JsonField<LocalDate>) = apply {
            body.lastDateInBillingPeriod(lastDateInBillingPeriod)
        }

        /**
         * The starting date *(epoch)* for Monthly billing frequency *(in ISO 8601 format)*,
         * determining the first Bill date for monthly Bills.
         */
        fun monthEpoch(monthEpoch: LocalDate) = apply { body.monthEpoch(monthEpoch) }

        /**
         * Sets [Builder.monthEpoch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.monthEpoch] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun monthEpoch(monthEpoch: JsonField<LocalDate>) = apply { body.monthEpoch(monthEpoch) }

        /** The currency code used for the Bill, such as USD, GBP, or EUR. */
        fun targetCurrency(targetCurrency: String) = apply { body.targetCurrency(targetCurrency) }

        /**
         * Sets [Builder.targetCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetCurrency] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun targetCurrency(targetCurrency: JsonField<String>) = apply {
            body.targetCurrency(targetCurrency)
        }

        /**
         * Specifies the time zone used for the generated Bills, ensuring alignment with the local
         * time zone.
         */
        fun timezone(timezone: String) = apply { body.timezone(timezone) }

        /**
         * Sets [Builder.timezone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timezone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timezone(timezone: JsonField<String>) = apply { body.timezone(timezone) }

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

        /**
         * The starting date *(epoch)* for Weekly billing frequency *(in ISO 8601 format)*,
         * determining the first Bill date for weekly Bills.
         */
        fun weekEpoch(weekEpoch: LocalDate) = apply { body.weekEpoch(weekEpoch) }

        /**
         * Sets [Builder.weekEpoch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.weekEpoch] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun weekEpoch(weekEpoch: JsonField<LocalDate>) = apply { body.weekEpoch(weekEpoch) }

        /**
         * The starting date *(epoch)* for Yearly billing frequency *(in ISO 8601 format)*,
         * determining the first Bill date for yearly Bills.
         */
        fun yearEpoch(yearEpoch: LocalDate) = apply { body.yearEpoch(yearEpoch) }

        /**
         * Sets [Builder.yearEpoch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.yearEpoch] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun yearEpoch(yearEpoch: JsonField<LocalDate>) = apply { body.yearEpoch(yearEpoch) }

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
         * Returns an immutable instance of [BillJobCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BillJobCreateParams =
            BillJobCreateParams(
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
        private val accountIds: JsonField<List<String>>,
        private val billDate: JsonField<LocalDate>,
        private val billFrequencyInterval: JsonField<Int>,
        private val billingFrequency: JsonField<BillingFrequency>,
        private val currencyConversions: JsonField<List<CurrencyConversion>>,
        private val dayEpoch: JsonField<LocalDate>,
        private val dueDate: JsonField<LocalDate>,
        private val externalInvoiceDate: JsonField<LocalDate>,
        private val lastDateInBillingPeriod: JsonField<LocalDate>,
        private val monthEpoch: JsonField<LocalDate>,
        private val targetCurrency: JsonField<String>,
        private val timezone: JsonField<String>,
        private val version: JsonField<Long>,
        private val weekEpoch: JsonField<LocalDate>,
        private val yearEpoch: JsonField<LocalDate>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountIds")
            @ExcludeMissing
            accountIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("billDate")
            @ExcludeMissing
            billDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("billFrequencyInterval")
            @ExcludeMissing
            billFrequencyInterval: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("billingFrequency")
            @ExcludeMissing
            billingFrequency: JsonField<BillingFrequency> = JsonMissing.of(),
            @JsonProperty("currencyConversions")
            @ExcludeMissing
            currencyConversions: JsonField<List<CurrencyConversion>> = JsonMissing.of(),
            @JsonProperty("dayEpoch")
            @ExcludeMissing
            dayEpoch: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("dueDate")
            @ExcludeMissing
            dueDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("externalInvoiceDate")
            @ExcludeMissing
            externalInvoiceDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("lastDateInBillingPeriod")
            @ExcludeMissing
            lastDateInBillingPeriod: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("monthEpoch")
            @ExcludeMissing
            monthEpoch: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("targetCurrency")
            @ExcludeMissing
            targetCurrency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timezone")
            @ExcludeMissing
            timezone: JsonField<String> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("weekEpoch")
            @ExcludeMissing
            weekEpoch: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("yearEpoch")
            @ExcludeMissing
            yearEpoch: JsonField<LocalDate> = JsonMissing.of(),
        ) : this(
            accountIds,
            billDate,
            billFrequencyInterval,
            billingFrequency,
            currencyConversions,
            dayEpoch,
            dueDate,
            externalInvoiceDate,
            lastDateInBillingPeriod,
            monthEpoch,
            targetCurrency,
            timezone,
            version,
            weekEpoch,
            yearEpoch,
            mutableMapOf(),
        )

        /**
         * An array of UUIDs representing the end customer Accounts associated with the BillJob.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountIds(): Optional<List<String>> = accountIds.getOptional("accountIds")

        /**
         * The specific billing date *(in ISO 8601 format)*, determining when the Bill was
         * generated.
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
         * For example, if `billingFrequency` is set to Monthly and `billFrequencyInterval` is set
         * to 3, Bills are issued every three months.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billFrequencyInterval(): Optional<Int> =
            billFrequencyInterval.getOptional("billFrequencyInterval")

        /**
         * How often Bills are generated.
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
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingFrequency(): Optional<BillingFrequency> =
            billingFrequency.getOptional("billingFrequency")

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
         * The starting date *(epoch)* for Daily billing frequency *(in ISO 8601 format)*,
         * determining the first Bill date for daily Bills.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dayEpoch(): Optional<LocalDate> = dayEpoch.getOptional("dayEpoch")

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
         * * `FIRST_DAY_OF_NEXT_PERIOD` *(Default)*. Used when you want to recognize usage revenue
         *   in the following period.
         * * `LAST_DAY_OF_ARREARS`. Used when you want to recognize usage revenue in the same period
         *   that it's consumed, instead of in the following period.
         *
         * For example, if the retrieved Bill was on a monthly billing frequency and the billing
         * period for the Bill is September 2023 and the *External invoice date* is set at
         * `FIRST_DAY_OF_NEXT_PERIOD`, then the `externalInvoiceDate` will be `"2023-10-01"`.
         *
         * **NOTE:** To change the `externalInvoiceDate` setting for your Organization, you can use
         * the
         * [Update OrganizationConfig](https://www.m3ter.com/docs/api#tag/OrganizationConfig/operation/GetOrganizationConfig)
         * call.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalInvoiceDate(): Optional<LocalDate> =
            externalInvoiceDate.getOptional("externalInvoiceDate")

        /**
         * Specifies the date *(in ISO 8601 format)* of the last day in the billing period, defining
         * the time range for the associated Bills.
         *
         * For example: `"2023-03-24"`.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastDateInBillingPeriod(): Optional<LocalDate> =
            lastDateInBillingPeriod.getOptional("lastDateInBillingPeriod")

        /**
         * The starting date *(epoch)* for Monthly billing frequency *(in ISO 8601 format)*,
         * determining the first Bill date for monthly Bills.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun monthEpoch(): Optional<LocalDate> = monthEpoch.getOptional("monthEpoch")

        /**
         * The currency code used for the Bill, such as USD, GBP, or EUR.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun targetCurrency(): Optional<String> = targetCurrency.getOptional("targetCurrency")

        /**
         * Specifies the time zone used for the generated Bills, ensuring alignment with the local
         * time zone.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timezone(): Optional<String> = timezone.getOptional("timezone")

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
         * The starting date *(epoch)* for Weekly billing frequency *(in ISO 8601 format)*,
         * determining the first Bill date for weekly Bills.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun weekEpoch(): Optional<LocalDate> = weekEpoch.getOptional("weekEpoch")

        /**
         * The starting date *(epoch)* for Yearly billing frequency *(in ISO 8601 format)*,
         * determining the first Bill date for yearly Bills.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun yearEpoch(): Optional<LocalDate> = yearEpoch.getOptional("yearEpoch")

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
         * Unlike [billFrequencyInterval], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("billFrequencyInterval")
        @ExcludeMissing
        fun _billFrequencyInterval(): JsonField<Int> = billFrequencyInterval

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
         * Returns the raw JSON value of [currencyConversions].
         *
         * Unlike [currencyConversions], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Returns the raw JSON value of [dueDate].
         *
         * Unlike [dueDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dueDate") @ExcludeMissing fun _dueDate(): JsonField<LocalDate> = dueDate

        /**
         * Returns the raw JSON value of [externalInvoiceDate].
         *
         * Unlike [externalInvoiceDate], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Returns the raw JSON value of [monthEpoch].
         *
         * Unlike [monthEpoch], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("monthEpoch")
        @ExcludeMissing
        fun _monthEpoch(): JsonField<LocalDate> = monthEpoch

        /**
         * Returns the raw JSON value of [targetCurrency].
         *
         * Unlike [targetCurrency], this method doesn't throw if the JSON field has an unexpected
         * type.
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
        @JsonProperty("weekEpoch")
        @ExcludeMissing
        fun _weekEpoch(): JsonField<LocalDate> = weekEpoch

        /**
         * Returns the raw JSON value of [yearEpoch].
         *
         * Unlike [yearEpoch], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("yearEpoch")
        @ExcludeMissing
        fun _yearEpoch(): JsonField<LocalDate> = yearEpoch

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountIds: JsonField<MutableList<String>>? = null
            private var billDate: JsonField<LocalDate> = JsonMissing.of()
            private var billFrequencyInterval: JsonField<Int> = JsonMissing.of()
            private var billingFrequency: JsonField<BillingFrequency> = JsonMissing.of()
            private var currencyConversions: JsonField<MutableList<CurrencyConversion>>? = null
            private var dayEpoch: JsonField<LocalDate> = JsonMissing.of()
            private var dueDate: JsonField<LocalDate> = JsonMissing.of()
            private var externalInvoiceDate: JsonField<LocalDate> = JsonMissing.of()
            private var lastDateInBillingPeriod: JsonField<LocalDate> = JsonMissing.of()
            private var monthEpoch: JsonField<LocalDate> = JsonMissing.of()
            private var targetCurrency: JsonField<String> = JsonMissing.of()
            private var timezone: JsonField<String> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var weekEpoch: JsonField<LocalDate> = JsonMissing.of()
            private var yearEpoch: JsonField<LocalDate> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountIds = body.accountIds.map { it.toMutableList() }
                billDate = body.billDate
                billFrequencyInterval = body.billFrequencyInterval
                billingFrequency = body.billingFrequency
                currencyConversions = body.currencyConversions.map { it.toMutableList() }
                dayEpoch = body.dayEpoch
                dueDate = body.dueDate
                externalInvoiceDate = body.externalInvoiceDate
                lastDateInBillingPeriod = body.lastDateInBillingPeriod
                monthEpoch = body.monthEpoch
                targetCurrency = body.targetCurrency
                timezone = body.timezone
                version = body.version
                weekEpoch = body.weekEpoch
                yearEpoch = body.yearEpoch
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * An array of UUIDs representing the end customer Accounts associated with the BillJob.
             */
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
             * You should usually call [Builder.billDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billDate(billDate: JsonField<LocalDate>) = apply { this.billDate = billDate }

            /**
             * How often Bills are issued - used in conjunction with `billingFrequency`.
             *
             * For example, if `billingFrequency` is set to Monthly and `billFrequencyInterval` is
             * set to 3, Bills are issued every three months.
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
             * How often Bills are generated.
             * * **Daily**. Starting at midnight each day, covering a twenty-four hour period
             *   following.
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
             * You should usually call [Builder.billingFrequency] with a well-typed
             * [BillingFrequency] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun billingFrequency(billingFrequency: JsonField<BillingFrequency>) = apply {
                this.billingFrequency = billingFrequency
            }

            /**
             * An array of currency conversion rates from Bill currency to Organization currency.
             * For example, if Account is billed in GBP and Organization is set to USD, Bill line
             * items are calculated in GBP and then converted to USD using the defined rate.
             */
            fun currencyConversions(currencyConversions: List<CurrencyConversion>) =
                currencyConversions(JsonField.of(currencyConversions))

            /**
             * Sets [Builder.currencyConversions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currencyConversions] with a well-typed
             * `List<CurrencyConversion>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun currencyConversions(currencyConversions: JsonField<List<CurrencyConversion>>) =
                apply {
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
             * You should usually call [Builder.dayEpoch] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dayEpoch(dayEpoch: JsonField<LocalDate>) = apply { this.dayEpoch = dayEpoch }

            /**
             * The due date *(in ISO 8601 format)* for payment of the Bill.
             *
             * For example: `"2023-02-24"`.
             */
            fun dueDate(dueDate: LocalDate) = dueDate(JsonField.of(dueDate))

            /**
             * Sets [Builder.dueDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dueDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dueDate(dueDate: JsonField<LocalDate>) = apply { this.dueDate = dueDate }

            /**
             * For accounting purposes, the date set at Organization level to use for external
             * invoicing with respect to billing periods - two options:
             * * `FIRST_DAY_OF_NEXT_PERIOD` *(Default)*. Used when you want to recognize usage
             *   revenue in the following period.
             * * `LAST_DAY_OF_ARREARS`. Used when you want to recognize usage revenue in the same
             *   period that it's consumed, instead of in the following period.
             *
             * For example, if the retrieved Bill was on a monthly billing frequency and the billing
             * period for the Bill is September 2023 and the *External invoice date* is set at
             * `FIRST_DAY_OF_NEXT_PERIOD`, then the `externalInvoiceDate` will be `"2023-10-01"`.
             *
             * **NOTE:** To change the `externalInvoiceDate` setting for your Organization, you can
             * use the
             * [Update OrganizationConfig](https://www.m3ter.com/docs/api#tag/OrganizationConfig/operation/GetOrganizationConfig)
             * call.
             */
            fun externalInvoiceDate(externalInvoiceDate: LocalDate) =
                externalInvoiceDate(JsonField.of(externalInvoiceDate))

            /**
             * Sets [Builder.externalInvoiceDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalInvoiceDate] with a well-typed [LocalDate]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun externalInvoiceDate(externalInvoiceDate: JsonField<LocalDate>) = apply {
                this.externalInvoiceDate = externalInvoiceDate
            }

            /**
             * Specifies the date *(in ISO 8601 format)* of the last day in the billing period,
             * defining the time range for the associated Bills.
             *
             * For example: `"2023-03-24"`.
             */
            fun lastDateInBillingPeriod(lastDateInBillingPeriod: LocalDate) =
                lastDateInBillingPeriod(JsonField.of(lastDateInBillingPeriod))

            /**
             * Sets [Builder.lastDateInBillingPeriod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastDateInBillingPeriod] with a well-typed
             * [LocalDate] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun lastDateInBillingPeriod(lastDateInBillingPeriod: JsonField<LocalDate>) = apply {
                this.lastDateInBillingPeriod = lastDateInBillingPeriod
            }

            /**
             * The starting date *(epoch)* for Monthly billing frequency *(in ISO 8601 format)*,
             * determining the first Bill date for monthly Bills.
             */
            fun monthEpoch(monthEpoch: LocalDate) = monthEpoch(JsonField.of(monthEpoch))

            /**
             * Sets [Builder.monthEpoch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.monthEpoch] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun monthEpoch(monthEpoch: JsonField<LocalDate>) = apply {
                this.monthEpoch = monthEpoch
            }

            /** The currency code used for the Bill, such as USD, GBP, or EUR. */
            fun targetCurrency(targetCurrency: String) =
                targetCurrency(JsonField.of(targetCurrency))

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
             * Specifies the time zone used for the generated Bills, ensuring alignment with the
             * local time zone.
             */
            fun timezone(timezone: String) = timezone(JsonField.of(timezone))

            /**
             * Sets [Builder.timezone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timezone] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

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

            /**
             * The starting date *(epoch)* for Weekly billing frequency *(in ISO 8601 format)*,
             * determining the first Bill date for weekly Bills.
             */
            fun weekEpoch(weekEpoch: LocalDate) = weekEpoch(JsonField.of(weekEpoch))

            /**
             * Sets [Builder.weekEpoch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.weekEpoch] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.yearEpoch] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    (accountIds ?: JsonMissing.of()).map { it.toImmutable() },
                    billDate,
                    billFrequencyInterval,
                    billingFrequency,
                    (currencyConversions ?: JsonMissing.of()).map { it.toImmutable() },
                    dayEpoch,
                    dueDate,
                    externalInvoiceDate,
                    lastDateInBillingPeriod,
                    monthEpoch,
                    targetCurrency,
                    timezone,
                    version,
                    weekEpoch,
                    yearEpoch,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accountIds()
            billDate()
            billFrequencyInterval()
            billingFrequency().ifPresent { it.validate() }
            currencyConversions().ifPresent { it.forEach { it.validate() } }
            dayEpoch()
            dueDate()
            externalInvoiceDate()
            lastDateInBillingPeriod()
            monthEpoch()
            targetCurrency()
            timezone()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (accountIds.asKnown().getOrNull()?.size ?: 0) +
                (if (billDate.asKnown().isPresent) 1 else 0) +
                (if (billFrequencyInterval.asKnown().isPresent) 1 else 0) +
                (billingFrequency.asKnown().getOrNull()?.validity() ?: 0) +
                (currencyConversions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (dayEpoch.asKnown().isPresent) 1 else 0) +
                (if (dueDate.asKnown().isPresent) 1 else 0) +
                (if (externalInvoiceDate.asKnown().isPresent) 1 else 0) +
                (if (lastDateInBillingPeriod.asKnown().isPresent) 1 else 0) +
                (if (monthEpoch.asKnown().isPresent) 1 else 0) +
                (if (targetCurrency.asKnown().isPresent) 1 else 0) +
                (if (timezone.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0) +
                (if (weekEpoch.asKnown().isPresent) 1 else 0) +
                (if (yearEpoch.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                accountIds == other.accountIds &&
                billDate == other.billDate &&
                billFrequencyInterval == other.billFrequencyInterval &&
                billingFrequency == other.billingFrequency &&
                currencyConversions == other.currencyConversions &&
                dayEpoch == other.dayEpoch &&
                dueDate == other.dueDate &&
                externalInvoiceDate == other.externalInvoiceDate &&
                lastDateInBillingPeriod == other.lastDateInBillingPeriod &&
                monthEpoch == other.monthEpoch &&
                targetCurrency == other.targetCurrency &&
                timezone == other.timezone &&
                version == other.version &&
                weekEpoch == other.weekEpoch &&
                yearEpoch == other.yearEpoch &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountIds,
                billDate,
                billFrequencyInterval,
                billingFrequency,
                currencyConversions,
                dayEpoch,
                dueDate,
                externalInvoiceDate,
                lastDateInBillingPeriod,
                monthEpoch,
                targetCurrency,
                timezone,
                version,
                weekEpoch,
                yearEpoch,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountIds=$accountIds, billDate=$billDate, billFrequencyInterval=$billFrequencyInterval, billingFrequency=$billingFrequency, currencyConversions=$currencyConversions, dayEpoch=$dayEpoch, dueDate=$dueDate, externalInvoiceDate=$externalInvoiceDate, lastDateInBillingPeriod=$lastDateInBillingPeriod, monthEpoch=$monthEpoch, targetCurrency=$targetCurrency, timezone=$timezone, version=$version, weekEpoch=$weekEpoch, yearEpoch=$yearEpoch, additionalProperties=$additionalProperties}"
    }

    /**
     * How often Bills are generated.
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BillJobCreateParams &&
            orgId == other.orgId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(orgId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BillJobCreateParams{orgId=$orgId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
