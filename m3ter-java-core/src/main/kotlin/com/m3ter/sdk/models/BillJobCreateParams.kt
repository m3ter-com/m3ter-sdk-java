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
    private val orgId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    /** An array of UUIDs representing the end customer Accounts associated with the BillJob. */
    fun accountIds(): Optional<List<String>> = body.accountIds()

    /**
     * The specific billing date _(in ISO 8601 format)_, determining when the Bill was generated.
     *
     * For example: `"2023-01-24"`.
     */
    fun billDate(): Optional<LocalDate> = body.billDate()

    /**
     * How often Bills are issued - used in conjunction with `billingFrequency`.
     *
     * For example, if `billingFrequency` is set to Monthly and `billFrequencyInterval` is set to 3,
     * Bills are issued every three months.
     */
    fun billFrequencyInterval(): Optional<Long> = body.billFrequencyInterval()

    /**
     * How often Bills are generated.
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
    fun billingFrequency(): Optional<BillingFrequency> = body.billingFrequency()

    /**
     * An array of currency conversion rates from Bill currency to Organization currency. For
     * example, if Account is billed in GBP and Organization is set to USD, Bill line items are
     * calculated in GBP and then converted to USD using the defined rate.
     */
    fun currencyConversions(): Optional<List<CurrencyConversion>> = body.currencyConversions()

    /**
     * The starting date _(epoch)_ for Daily billing frequency _(in ISO 8601 format)_, determining
     * the first Bill date for daily Bills.
     */
    fun dayEpoch(): Optional<LocalDate> = body.dayEpoch()

    /**
     * The due date _(in ISO 8601 format)_ for payment of the Bill.
     *
     * For example: `"2023-02-24"`.
     */
    fun dueDate(): Optional<LocalDate> = body.dueDate()

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
     *
     * **NOTE:** To change the `externalInvoiceDate` setting for your Organization, you can use the
     * [Update OrganizationConfig](https://www.m3ter.com/docs/api#tag/OrganizationConfig/operation/GetOrganizationConfig)
     * call.
     */
    fun externalInvoiceDate(): Optional<LocalDate> = body.externalInvoiceDate()

    /**
     * Specifies the date _(in ISO 8601 format)_ of the last day in the billing period, defining the
     * time range for the associated Bills.
     *
     * For example: `"2023-03-24"`.
     */
    fun lastDateInBillingPeriod(): Optional<LocalDate> = body.lastDateInBillingPeriod()

    /**
     * The starting date _(epoch)_ for Monthly billing frequency _(in ISO 8601 format)_, determining
     * the first Bill date for monthly Bills.
     */
    fun monthEpoch(): Optional<LocalDate> = body.monthEpoch()

    /** The currency code used for the Bill, such as USD, GBP, or EUR. */
    fun targetCurrency(): Optional<String> = body.targetCurrency()

    /**
     * Specifies the time zone used for the generated Bills, ensuring alignment with the local time
     * zone.
     */
    fun timezone(): Optional<String> = body.timezone()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     */
    fun version(): Optional<Long> = body.version()

    /**
     * The starting date _(epoch)_ for Weekly billing frequency _(in ISO 8601 format)_, determining
     * the first Bill date for weekly Bills.
     */
    fun weekEpoch(): Optional<LocalDate> = body.weekEpoch()

    /**
     * The starting date _(epoch)_ for Yearly billing frequency _(in ISO 8601 format)_, determining
     * the first Bill date for yearly Bills.
     */
    fun yearEpoch(): Optional<LocalDate> = body.yearEpoch()

    /** An array of UUIDs representing the end customer Accounts associated with the BillJob. */
    fun _accountIds(): JsonField<List<String>> = body._accountIds()

    /**
     * The specific billing date _(in ISO 8601 format)_, determining when the Bill was generated.
     *
     * For example: `"2023-01-24"`.
     */
    fun _billDate(): JsonField<LocalDate> = body._billDate()

    /**
     * How often Bills are issued - used in conjunction with `billingFrequency`.
     *
     * For example, if `billingFrequency` is set to Monthly and `billFrequencyInterval` is set to 3,
     * Bills are issued every three months.
     */
    fun _billFrequencyInterval(): JsonField<Long> = body._billFrequencyInterval()

    /**
     * How often Bills are generated.
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
    fun _billingFrequency(): JsonField<BillingFrequency> = body._billingFrequency()

    /**
     * An array of currency conversion rates from Bill currency to Organization currency. For
     * example, if Account is billed in GBP and Organization is set to USD, Bill line items are
     * calculated in GBP and then converted to USD using the defined rate.
     */
    fun _currencyConversions(): JsonField<List<CurrencyConversion>> = body._currencyConversions()

    /**
     * The starting date _(epoch)_ for Daily billing frequency _(in ISO 8601 format)_, determining
     * the first Bill date for daily Bills.
     */
    fun _dayEpoch(): JsonField<LocalDate> = body._dayEpoch()

    /**
     * The due date _(in ISO 8601 format)_ for payment of the Bill.
     *
     * For example: `"2023-02-24"`.
     */
    fun _dueDate(): JsonField<LocalDate> = body._dueDate()

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
     *
     * **NOTE:** To change the `externalInvoiceDate` setting for your Organization, you can use the
     * [Update OrganizationConfig](https://www.m3ter.com/docs/api#tag/OrganizationConfig/operation/GetOrganizationConfig)
     * call.
     */
    fun _externalInvoiceDate(): JsonField<LocalDate> = body._externalInvoiceDate()

    /**
     * Specifies the date _(in ISO 8601 format)_ of the last day in the billing period, defining the
     * time range for the associated Bills.
     *
     * For example: `"2023-03-24"`.
     */
    fun _lastDateInBillingPeriod(): JsonField<LocalDate> = body._lastDateInBillingPeriod()

    /**
     * The starting date _(epoch)_ for Monthly billing frequency _(in ISO 8601 format)_, determining
     * the first Bill date for monthly Bills.
     */
    fun _monthEpoch(): JsonField<LocalDate> = body._monthEpoch()

    /** The currency code used for the Bill, such as USD, GBP, or EUR. */
    fun _targetCurrency(): JsonField<String> = body._targetCurrency()

    /**
     * Specifies the time zone used for the generated Bills, ensuring alignment with the local time
     * zone.
     */
    fun _timezone(): JsonField<String> = body._timezone()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     */
    fun _version(): JsonField<Long> = body._version()

    /**
     * The starting date _(epoch)_ for Weekly billing frequency _(in ISO 8601 format)_, determining
     * the first Bill date for weekly Bills.
     */
    fun _weekEpoch(): JsonField<LocalDate> = body._weekEpoch()

    /**
     * The starting date _(epoch)_ for Yearly billing frequency _(in ISO 8601 format)_, determining
     * the first Bill date for yearly Bills.
     */
    fun _yearEpoch(): JsonField<LocalDate> = body._yearEpoch()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> orgId
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("accountIds")
        @ExcludeMissing
        private val accountIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("billDate")
        @ExcludeMissing
        private val billDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("billFrequencyInterval")
        @ExcludeMissing
        private val billFrequencyInterval: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("billingFrequency")
        @ExcludeMissing
        private val billingFrequency: JsonField<BillingFrequency> = JsonMissing.of(),
        @JsonProperty("currencyConversions")
        @ExcludeMissing
        private val currencyConversions: JsonField<List<CurrencyConversion>> = JsonMissing.of(),
        @JsonProperty("dayEpoch")
        @ExcludeMissing
        private val dayEpoch: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("dueDate")
        @ExcludeMissing
        private val dueDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("externalInvoiceDate")
        @ExcludeMissing
        private val externalInvoiceDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("lastDateInBillingPeriod")
        @ExcludeMissing
        private val lastDateInBillingPeriod: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("monthEpoch")
        @ExcludeMissing
        private val monthEpoch: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("targetCurrency")
        @ExcludeMissing
        private val targetCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timezone")
        @ExcludeMissing
        private val timezone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version")
        @ExcludeMissing
        private val version: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("weekEpoch")
        @ExcludeMissing
        private val weekEpoch: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("yearEpoch")
        @ExcludeMissing
        private val yearEpoch: JsonField<LocalDate> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** An array of UUIDs representing the end customer Accounts associated with the BillJob. */
        fun accountIds(): Optional<List<String>> =
            Optional.ofNullable(accountIds.getNullable("accountIds"))

        /**
         * The specific billing date _(in ISO 8601 format)_, determining when the Bill was
         * generated.
         *
         * For example: `"2023-01-24"`.
         */
        fun billDate(): Optional<LocalDate> = Optional.ofNullable(billDate.getNullable("billDate"))

        /**
         * How often Bills are issued - used in conjunction with `billingFrequency`.
         *
         * For example, if `billingFrequency` is set to Monthly and `billFrequencyInterval` is set
         * to 3, Bills are issued every three months.
         */
        fun billFrequencyInterval(): Optional<Long> =
            Optional.ofNullable(billFrequencyInterval.getNullable("billFrequencyInterval"))

        /**
         * How often Bills are generated.
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
        fun billingFrequency(): Optional<BillingFrequency> =
            Optional.ofNullable(billingFrequency.getNullable("billingFrequency"))

        /**
         * An array of currency conversion rates from Bill currency to Organization currency. For
         * example, if Account is billed in GBP and Organization is set to USD, Bill line items are
         * calculated in GBP and then converted to USD using the defined rate.
         */
        fun currencyConversions(): Optional<List<CurrencyConversion>> =
            Optional.ofNullable(currencyConversions.getNullable("currencyConversions"))

        /**
         * The starting date _(epoch)_ for Daily billing frequency _(in ISO 8601 format)_,
         * determining the first Bill date for daily Bills.
         */
        fun dayEpoch(): Optional<LocalDate> = Optional.ofNullable(dayEpoch.getNullable("dayEpoch"))

        /**
         * The due date _(in ISO 8601 format)_ for payment of the Bill.
         *
         * For example: `"2023-02-24"`.
         */
        fun dueDate(): Optional<LocalDate> = Optional.ofNullable(dueDate.getNullable("dueDate"))

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
         *
         * **NOTE:** To change the `externalInvoiceDate` setting for your Organization, you can use
         * the
         * [Update OrganizationConfig](https://www.m3ter.com/docs/api#tag/OrganizationConfig/operation/GetOrganizationConfig)
         * call.
         */
        fun externalInvoiceDate(): Optional<LocalDate> =
            Optional.ofNullable(externalInvoiceDate.getNullable("externalInvoiceDate"))

        /**
         * Specifies the date _(in ISO 8601 format)_ of the last day in the billing period, defining
         * the time range for the associated Bills.
         *
         * For example: `"2023-03-24"`.
         */
        fun lastDateInBillingPeriod(): Optional<LocalDate> =
            Optional.ofNullable(lastDateInBillingPeriod.getNullable("lastDateInBillingPeriod"))

        /**
         * The starting date _(epoch)_ for Monthly billing frequency _(in ISO 8601 format)_,
         * determining the first Bill date for monthly Bills.
         */
        fun monthEpoch(): Optional<LocalDate> =
            Optional.ofNullable(monthEpoch.getNullable("monthEpoch"))

        /** The currency code used for the Bill, such as USD, GBP, or EUR. */
        fun targetCurrency(): Optional<String> =
            Optional.ofNullable(targetCurrency.getNullable("targetCurrency"))

        /**
         * Specifies the time zone used for the generated Bills, ensuring alignment with the local
         * time zone.
         */
        fun timezone(): Optional<String> = Optional.ofNullable(timezone.getNullable("timezone"))

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

        /**
         * The starting date _(epoch)_ for Weekly billing frequency _(in ISO 8601 format)_,
         * determining the first Bill date for weekly Bills.
         */
        fun weekEpoch(): Optional<LocalDate> =
            Optional.ofNullable(weekEpoch.getNullable("weekEpoch"))

        /**
         * The starting date _(epoch)_ for Yearly billing frequency _(in ISO 8601 format)_,
         * determining the first Bill date for yearly Bills.
         */
        fun yearEpoch(): Optional<LocalDate> =
            Optional.ofNullable(yearEpoch.getNullable("yearEpoch"))

        /** An array of UUIDs representing the end customer Accounts associated with the BillJob. */
        @JsonProperty("accountIds")
        @ExcludeMissing
        fun _accountIds(): JsonField<List<String>> = accountIds

        /**
         * The specific billing date _(in ISO 8601 format)_, determining when the Bill was
         * generated.
         *
         * For example: `"2023-01-24"`.
         */
        @JsonProperty("billDate") @ExcludeMissing fun _billDate(): JsonField<LocalDate> = billDate

        /**
         * How often Bills are issued - used in conjunction with `billingFrequency`.
         *
         * For example, if `billingFrequency` is set to Monthly and `billFrequencyInterval` is set
         * to 3, Bills are issued every three months.
         */
        @JsonProperty("billFrequencyInterval")
        @ExcludeMissing
        fun _billFrequencyInterval(): JsonField<Long> = billFrequencyInterval

        /**
         * How often Bills are generated.
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
        @JsonProperty("billingFrequency")
        @ExcludeMissing
        fun _billingFrequency(): JsonField<BillingFrequency> = billingFrequency

        /**
         * An array of currency conversion rates from Bill currency to Organization currency. For
         * example, if Account is billed in GBP and Organization is set to USD, Bill line items are
         * calculated in GBP and then converted to USD using the defined rate.
         */
        @JsonProperty("currencyConversions")
        @ExcludeMissing
        fun _currencyConversions(): JsonField<List<CurrencyConversion>> = currencyConversions

        /**
         * The starting date _(epoch)_ for Daily billing frequency _(in ISO 8601 format)_,
         * determining the first Bill date for daily Bills.
         */
        @JsonProperty("dayEpoch") @ExcludeMissing fun _dayEpoch(): JsonField<LocalDate> = dayEpoch

        /**
         * The due date _(in ISO 8601 format)_ for payment of the Bill.
         *
         * For example: `"2023-02-24"`.
         */
        @JsonProperty("dueDate") @ExcludeMissing fun _dueDate(): JsonField<LocalDate> = dueDate

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
         *
         * **NOTE:** To change the `externalInvoiceDate` setting for your Organization, you can use
         * the
         * [Update OrganizationConfig](https://www.m3ter.com/docs/api#tag/OrganizationConfig/operation/GetOrganizationConfig)
         * call.
         */
        @JsonProperty("externalInvoiceDate")
        @ExcludeMissing
        fun _externalInvoiceDate(): JsonField<LocalDate> = externalInvoiceDate

        /**
         * Specifies the date _(in ISO 8601 format)_ of the last day in the billing period, defining
         * the time range for the associated Bills.
         *
         * For example: `"2023-03-24"`.
         */
        @JsonProperty("lastDateInBillingPeriod")
        @ExcludeMissing
        fun _lastDateInBillingPeriod(): JsonField<LocalDate> = lastDateInBillingPeriod

        /**
         * The starting date _(epoch)_ for Monthly billing frequency _(in ISO 8601 format)_,
         * determining the first Bill date for monthly Bills.
         */
        @JsonProperty("monthEpoch")
        @ExcludeMissing
        fun _monthEpoch(): JsonField<LocalDate> = monthEpoch

        /** The currency code used for the Bill, such as USD, GBP, or EUR. */
        @JsonProperty("targetCurrency")
        @ExcludeMissing
        fun _targetCurrency(): JsonField<String> = targetCurrency

        /**
         * Specifies the time zone used for the generated Bills, ensuring alignment with the local
         * time zone.
         */
        @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<String> = timezone

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

        /**
         * The starting date _(epoch)_ for Weekly billing frequency _(in ISO 8601 format)_,
         * determining the first Bill date for weekly Bills.
         */
        @JsonProperty("weekEpoch")
        @ExcludeMissing
        fun _weekEpoch(): JsonField<LocalDate> = weekEpoch

        /**
         * The starting date _(epoch)_ for Yearly billing frequency _(in ISO 8601 format)_,
         * determining the first Bill date for yearly Bills.
         */
        @JsonProperty("yearEpoch")
        @ExcludeMissing
        fun _yearEpoch(): JsonField<LocalDate> = yearEpoch

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accountIds()
            billDate()
            billFrequencyInterval()
            billingFrequency()
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

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountIds: JsonField<MutableList<String>>? = null
            private var billDate: JsonField<LocalDate> = JsonMissing.of()
            private var billFrequencyInterval: JsonField<Long> = JsonMissing.of()
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
             * An array of UUIDs representing the end customer Accounts associated with the BillJob.
             */
            fun accountIds(accountIds: JsonField<List<String>>) = apply {
                this.accountIds = accountIds.map { it.toMutableList() }
            }

            /**
             * An array of UUIDs representing the end customer Accounts associated with the BillJob.
             */
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
             * For example, if `billingFrequency` is set to Monthly and `billFrequencyInterval` is
             * set to 3, Bills are issued every three months.
             */
            fun billFrequencyInterval(billFrequencyInterval: Long) =
                billFrequencyInterval(JsonField.of(billFrequencyInterval))

            /**
             * How often Bills are issued - used in conjunction with `billingFrequency`.
             *
             * For example, if `billingFrequency` is set to Monthly and `billFrequencyInterval` is
             * set to 3, Bills are issued every three months.
             */
            fun billFrequencyInterval(billFrequencyInterval: JsonField<Long>) = apply {
                this.billFrequencyInterval = billFrequencyInterval
            }

            /**
             * How often Bills are generated.
             * - **Daily**. Starting at midnight each day, covering a twenty-four hour period
             *   following.
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
             * How often Bills are generated.
             * - **Daily**. Starting at midnight each day, covering a twenty-four hour period
             *   following.
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

            /**
             * An array of currency conversion rates from Bill currency to Organization currency.
             * For example, if Account is billed in GBP and Organization is set to USD, Bill line
             * items are calculated in GBP and then converted to USD using the defined rate.
             */
            fun currencyConversions(currencyConversions: List<CurrencyConversion>) =
                currencyConversions(JsonField.of(currencyConversions))

            /**
             * An array of currency conversion rates from Bill currency to Organization currency.
             * For example, if Account is billed in GBP and Organization is set to USD, Bill line
             * items are calculated in GBP and then converted to USD using the defined rate.
             */
            fun currencyConversions(currencyConversions: JsonField<List<CurrencyConversion>>) =
                apply {
                    this.currencyConversions = currencyConversions.map { it.toMutableList() }
                }

            /**
             * An array of currency conversion rates from Bill currency to Organization currency.
             * For example, if Account is billed in GBP and Organization is set to USD, Bill line
             * items are calculated in GBP and then converted to USD using the defined rate.
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
             * For accounting purposes, the date set at Organization level to use for external
             * invoicing with respect to billing periods - two options:
             * - `FIRST_DAY_OF_NEXT_PERIOD` _(Default)_. Used when you want to recognize usage
             *   revenue in the following period.
             * - `LAST_DAY_OF_ARREARS`. Used when you want to recognize usage revenue in the same
             *   period that it's consumed, instead of in the following period.
             *
             * For example, if the retrieved Bill was on a monthly billing frequency and the billing
             * period for the Bill is September 2023 and the _External invoice date_ is set at
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
             * For accounting purposes, the date set at Organization level to use for external
             * invoicing with respect to billing periods - two options:
             * - `FIRST_DAY_OF_NEXT_PERIOD` _(Default)_. Used when you want to recognize usage
             *   revenue in the following period.
             * - `LAST_DAY_OF_ARREARS`. Used when you want to recognize usage revenue in the same
             *   period that it's consumed, instead of in the following period.
             *
             * For example, if the retrieved Bill was on a monthly billing frequency and the billing
             * period for the Bill is September 2023 and the _External invoice date_ is set at
             * `FIRST_DAY_OF_NEXT_PERIOD`, then the `externalInvoiceDate` will be `"2023-10-01"`.
             *
             * **NOTE:** To change the `externalInvoiceDate` setting for your Organization, you can
             * use the
             * [Update OrganizationConfig](https://www.m3ter.com/docs/api#tag/OrganizationConfig/operation/GetOrganizationConfig)
             * call.
             */
            fun externalInvoiceDate(externalInvoiceDate: JsonField<LocalDate>) = apply {
                this.externalInvoiceDate = externalInvoiceDate
            }

            /**
             * Specifies the date _(in ISO 8601 format)_ of the last day in the billing period,
             * defining the time range for the associated Bills.
             *
             * For example: `"2023-03-24"`.
             */
            fun lastDateInBillingPeriod(lastDateInBillingPeriod: LocalDate) =
                lastDateInBillingPeriod(JsonField.of(lastDateInBillingPeriod))

            /**
             * Specifies the date _(in ISO 8601 format)_ of the last day in the billing period,
             * defining the time range for the associated Bills.
             *
             * For example: `"2023-03-24"`.
             */
            fun lastDateInBillingPeriod(lastDateInBillingPeriod: JsonField<LocalDate>) = apply {
                this.lastDateInBillingPeriod = lastDateInBillingPeriod
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
            fun monthEpoch(monthEpoch: JsonField<LocalDate>) = apply {
                this.monthEpoch = monthEpoch
            }

            /** The currency code used for the Bill, such as USD, GBP, or EUR. */
            fun targetCurrency(targetCurrency: String) =
                targetCurrency(JsonField.of(targetCurrency))

            /** The currency code used for the Bill, such as USD, GBP, or EUR. */
            fun targetCurrency(targetCurrency: JsonField<String>) = apply {
                this.targetCurrency = targetCurrency
            }

            /**
             * Specifies the time zone used for the generated Bills, ensuring alignment with the
             * local time zone.
             */
            fun timezone(timezone: String) = timezone(JsonField.of(timezone))

            /**
             * Specifies the time zone used for the generated Bills, ensuring alignment with the
             * local time zone.
             */
            fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

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
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && accountIds == other.accountIds && billDate == other.billDate && billFrequencyInterval == other.billFrequencyInterval && billingFrequency == other.billingFrequency && currencyConversions == other.currencyConversions && dayEpoch == other.dayEpoch && dueDate == other.dueDate && externalInvoiceDate == other.externalInvoiceDate && lastDateInBillingPeriod == other.lastDateInBillingPeriod && monthEpoch == other.monthEpoch && targetCurrency == other.targetCurrency && timezone == other.timezone && version == other.version && weekEpoch == other.weekEpoch && yearEpoch == other.yearEpoch && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountIds, billDate, billFrequencyInterval, billingFrequency, currencyConversions, dayEpoch, dueDate, externalInvoiceDate, lastDateInBillingPeriod, monthEpoch, targetCurrency, timezone, version, weekEpoch, yearEpoch, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountIds=$accountIds, billDate=$billDate, billFrequencyInterval=$billFrequencyInterval, billingFrequency=$billingFrequency, currencyConversions=$currencyConversions, dayEpoch=$dayEpoch, dueDate=$dueDate, externalInvoiceDate=$externalInvoiceDate, lastDateInBillingPeriod=$lastDateInBillingPeriod, monthEpoch=$monthEpoch, targetCurrency=$targetCurrency, timezone=$timezone, version=$version, weekEpoch=$weekEpoch, yearEpoch=$yearEpoch, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BillJobCreateParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BillJobCreateParams]. */
    @NoAutoDetect
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

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /** An array of UUIDs representing the end customer Accounts associated with the BillJob. */
        fun accountIds(accountIds: List<String>) = apply { body.accountIds(accountIds) }

        /** An array of UUIDs representing the end customer Accounts associated with the BillJob. */
        fun accountIds(accountIds: JsonField<List<String>>) = apply { body.accountIds(accountIds) }

        /** An array of UUIDs representing the end customer Accounts associated with the BillJob. */
        fun addAccountId(accountId: String) = apply { body.addAccountId(accountId) }

        /**
         * The specific billing date _(in ISO 8601 format)_, determining when the Bill was
         * generated.
         *
         * For example: `"2023-01-24"`.
         */
        fun billDate(billDate: LocalDate) = apply { body.billDate(billDate) }

        /**
         * The specific billing date _(in ISO 8601 format)_, determining when the Bill was
         * generated.
         *
         * For example: `"2023-01-24"`.
         */
        fun billDate(billDate: JsonField<LocalDate>) = apply { body.billDate(billDate) }

        /**
         * How often Bills are issued - used in conjunction with `billingFrequency`.
         *
         * For example, if `billingFrequency` is set to Monthly and `billFrequencyInterval` is set
         * to 3, Bills are issued every three months.
         */
        fun billFrequencyInterval(billFrequencyInterval: Long) = apply {
            body.billFrequencyInterval(billFrequencyInterval)
        }

        /**
         * How often Bills are issued - used in conjunction with `billingFrequency`.
         *
         * For example, if `billingFrequency` is set to Monthly and `billFrequencyInterval` is set
         * to 3, Bills are issued every three months.
         */
        fun billFrequencyInterval(billFrequencyInterval: JsonField<Long>) = apply {
            body.billFrequencyInterval(billFrequencyInterval)
        }

        /**
         * How often Bills are generated.
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
        fun billingFrequency(billingFrequency: BillingFrequency) = apply {
            body.billingFrequency(billingFrequency)
        }

        /**
         * How often Bills are generated.
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
         * An array of currency conversion rates from Bill currency to Organization currency. For
         * example, if Account is billed in GBP and Organization is set to USD, Bill line items are
         * calculated in GBP and then converted to USD using the defined rate.
         */
        fun currencyConversions(currencyConversions: JsonField<List<CurrencyConversion>>) = apply {
            body.currencyConversions(currencyConversions)
        }

        /**
         * An array of currency conversion rates from Bill currency to Organization currency. For
         * example, if Account is billed in GBP and Organization is set to USD, Bill line items are
         * calculated in GBP and then converted to USD using the defined rate.
         */
        fun addCurrencyConversion(currencyConversion: CurrencyConversion) = apply {
            body.addCurrencyConversion(currencyConversion)
        }

        /**
         * The starting date _(epoch)_ for Daily billing frequency _(in ISO 8601 format)_,
         * determining the first Bill date for daily Bills.
         */
        fun dayEpoch(dayEpoch: LocalDate) = apply { body.dayEpoch(dayEpoch) }

        /**
         * The starting date _(epoch)_ for Daily billing frequency _(in ISO 8601 format)_,
         * determining the first Bill date for daily Bills.
         */
        fun dayEpoch(dayEpoch: JsonField<LocalDate>) = apply { body.dayEpoch(dayEpoch) }

        /**
         * The due date _(in ISO 8601 format)_ for payment of the Bill.
         *
         * For example: `"2023-02-24"`.
         */
        fun dueDate(dueDate: LocalDate) = apply { body.dueDate(dueDate) }

        /**
         * The due date _(in ISO 8601 format)_ for payment of the Bill.
         *
         * For example: `"2023-02-24"`.
         */
        fun dueDate(dueDate: JsonField<LocalDate>) = apply { body.dueDate(dueDate) }

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
         *
         * **NOTE:** To change the `externalInvoiceDate` setting for your Organization, you can use
         * the
         * [Update OrganizationConfig](https://www.m3ter.com/docs/api#tag/OrganizationConfig/operation/GetOrganizationConfig)
         * call.
         */
        fun externalInvoiceDate(externalInvoiceDate: JsonField<LocalDate>) = apply {
            body.externalInvoiceDate(externalInvoiceDate)
        }

        /**
         * Specifies the date _(in ISO 8601 format)_ of the last day in the billing period, defining
         * the time range for the associated Bills.
         *
         * For example: `"2023-03-24"`.
         */
        fun lastDateInBillingPeriod(lastDateInBillingPeriod: LocalDate) = apply {
            body.lastDateInBillingPeriod(lastDateInBillingPeriod)
        }

        /**
         * Specifies the date _(in ISO 8601 format)_ of the last day in the billing period, defining
         * the time range for the associated Bills.
         *
         * For example: `"2023-03-24"`.
         */
        fun lastDateInBillingPeriod(lastDateInBillingPeriod: JsonField<LocalDate>) = apply {
            body.lastDateInBillingPeriod(lastDateInBillingPeriod)
        }

        /**
         * The starting date _(epoch)_ for Monthly billing frequency _(in ISO 8601 format)_,
         * determining the first Bill date for monthly Bills.
         */
        fun monthEpoch(monthEpoch: LocalDate) = apply { body.monthEpoch(monthEpoch) }

        /**
         * The starting date _(epoch)_ for Monthly billing frequency _(in ISO 8601 format)_,
         * determining the first Bill date for monthly Bills.
         */
        fun monthEpoch(monthEpoch: JsonField<LocalDate>) = apply { body.monthEpoch(monthEpoch) }

        /** The currency code used for the Bill, such as USD, GBP, or EUR. */
        fun targetCurrency(targetCurrency: String) = apply { body.targetCurrency(targetCurrency) }

        /** The currency code used for the Bill, such as USD, GBP, or EUR. */
        fun targetCurrency(targetCurrency: JsonField<String>) = apply {
            body.targetCurrency(targetCurrency)
        }

        /**
         * Specifies the time zone used for the generated Bills, ensuring alignment with the local
         * time zone.
         */
        fun timezone(timezone: String) = apply { body.timezone(timezone) }

        /**
         * Specifies the time zone used for the generated Bills, ensuring alignment with the local
         * time zone.
         */
        fun timezone(timezone: JsonField<String>) = apply { body.timezone(timezone) }

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

        /**
         * The starting date _(epoch)_ for Weekly billing frequency _(in ISO 8601 format)_,
         * determining the first Bill date for weekly Bills.
         */
        fun weekEpoch(weekEpoch: LocalDate) = apply { body.weekEpoch(weekEpoch) }

        /**
         * The starting date _(epoch)_ for Weekly billing frequency _(in ISO 8601 format)_,
         * determining the first Bill date for weekly Bills.
         */
        fun weekEpoch(weekEpoch: JsonField<LocalDate>) = apply { body.weekEpoch(weekEpoch) }

        /**
         * The starting date _(epoch)_ for Yearly billing frequency _(in ISO 8601 format)_,
         * determining the first Bill date for yearly Bills.
         */
        fun yearEpoch(yearEpoch: LocalDate) = apply { body.yearEpoch(yearEpoch) }

        /**
         * The starting date _(epoch)_ for Yearly billing frequency _(in ISO 8601 format)_,
         * determining the first Bill date for yearly Bills.
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

        fun build(): BillJobCreateParams =
            BillJobCreateParams(
                checkRequired("orgId", orgId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * How often Bills are generated.
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillJobCreateParams && orgId == other.orgId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BillJobCreateParams{orgId=$orgId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
