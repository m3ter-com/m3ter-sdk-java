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
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkKnown
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update the Organization-wide configuration details. */
class OrganizationConfigUpdateParams
private constructor(
    private val orgId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    /**
     * The currency code for the Organization. For example: USD, GBP, or EUR:
     * - This defines the _billing currency_ for the Organization. You can override this by
     *   selecting a different billing currency at individual Account level.
     * - You must first define the currencies you want to use in your Organization. See the
     *   [Currency](https://www.m3ter.com/docs/api#tag/Currency) section in this API Reference.
     *
     * **Note:** If you use a different currency as the _pricing currency_ for Plans to set charge
     * rates for Product consumption by an Account, you must define a currency conversion rate from
     * the pricing currency to the billing currency before you run billing for the Account,
     * otherwise billing will fail. See below for the `currencyConversions` request parameter.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = body.currency()

    /**
     * Optional setting that defines the billing cycle date for Accounts that are billed daily.
     * Defines the date of the first Bill:
     * - For example, suppose the Plan you attach to an Account is configured for daily billing
     *   frequency and will apply to the Account from January 1st, 2022 until June 30th, 2022. If
     *   you set a `dayEpoch` date of January 2nd, 2022, then the first Bill is created for the
     *   Account on that date and subsequent Bills are created for the Account each day following
     *   through to the end of the billing service period.
     * - The date is in ISO-8601 format.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dayEpoch(): String = body.dayEpoch()

    /**
     * Enter the number of days after the Bill generation date that you want to show on Bills as the
     * due date.
     *
     * **Note:** If you define `daysBeforeBillDue` at individual Account level, this will take
     * precedence over any `daysBeforeBillDue` setting defined at Organization level.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun daysBeforeBillDue(): Long = body.daysBeforeBillDue()

    /**
     * Optional setting that defines the billing cycle date for Accounts that are billed monthly.
     * Defines the date of the first Bill and then acts as reference for when subsequent Bills are
     * created for the Account:
     * - For example, suppose the Plan you attach to an Account is configured for monthly billing
     *   frequency and will apply to the Account from January 1st, 2022 until June 30th, 2022. If
     *   you set a `monthEpoch` date of January 15th, 2022, then the first Bill is created for the
     *   Account on that date and subsequent Bills are created for the Account on the 15th of each
     *   month following through to the end of the billing service period - February 15th, March
     *   15th, and so on.
     * - The date is in ISO-8601 format.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun monthEpoch(): String = body.monthEpoch()

    /**
     * Sets the timezone for the Organization.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timezone(): String = body.timezone()

    /**
     * Optional setting that defines the billing cycle date for Accounts that are billed weekly.
     * Defines the date of the first Bill and then acts as reference for when subsequent Bills are
     * created for the Account:
     * - For example, suppose the Plan you attach to an Account is configured for weekly billing
     *   frequency and will apply to the Account from January 1st, 2022 until June 30th, 2022. If
     *   you set a `weekEpoch` date of January 15th, 2022, which falls on a Saturday, then the first
     *   Bill is created for the Account on that date and subsequent Bills are created for the
     *   Account on Saturday of each week following through to the end of the billing service
     *   period.
     * - The date is in ISO-8601 format.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun weekEpoch(): String = body.weekEpoch()

    /**
     * Optional setting that defines the billing cycle date for Accounts that are billed yearly.
     * Defines the date of the first Bill and then acts as reference for when subsequent Bills are
     * created for the Account:
     * - For example, suppose the Plan you attach to an Account is configured for yearly billing
     *   frequency and will apply to the Account from January 1st, 2022 until January 15th, 2028. If
     *   you set a `yearEpoch` date of January 1st, 2023, then the first Bill is created for the
     *   Account on that date and subsequent Bills are created for the Account on January 1st of
     *   each year following through to the end of the billing service period - January 1st, 2023,
     *   January 1st, 2024 and so on.
     * - The date is in ISO-8601 format.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun yearEpoch(): String = body.yearEpoch()

    /**
     * Grace period before bills are auto-approved. Used in combination with
     * `autoApproveBillsGracePeriodUnit` parameter.
     *
     * **Note:** When used in combination with `autoApproveBillsGracePeriodUnit` enables
     * auto-approval of Bills for Organization, which occurs when the specified time period has
     * elapsed after Bill generation.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun autoApproveBillsGracePeriod(): Optional<Long> = body.autoApproveBillsGracePeriod()

    /**
     * Time unit of grace period before bills are auto-approved. Used in combination with
     * `autoApproveBillsGracePeriod` parameter. Allowed options are MINUTES, HOURS, or DAYS.
     *
     * **Note:** When used in combination with `autoApproveBillsGracePeriod` enables auto-approval
     * of Bills for Organization, which occurs when the specified time period has elapsed after Bill
     * generation.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun autoApproveBillsGracePeriodUnit(): Optional<String> = body.autoApproveBillsGracePeriodUnit()

    /**
     * Specify whether to auto-generate statements once Bills are _approved_ or _locked_. It will
     * not auto-generate if a bill is in _pending_ state.
     *
     * The default value is **None**.
     * - **None**. Statements will not be auto-generated.
     * - **JSON**. Statements are auto-generated in JSON format.
     * - **JSON and CSV**. Statements are auto-generated in both JSON and CSV formats.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun autoGenerateStatementMode(): Optional<AutoGenerateStatementMode> =
        body.autoGenerateStatementMode()

    /**
     * Prefix to be used for sequential invoice numbers. This will be combined with the
     * `sequenceStartNumber`.
     *
     * **NOTES:**
     * - If you do not define a `billPrefix`, a default will be used in the Console for the Bill
     *   **REFERENCE** number. This default will concatenate **INV-** with the last four characters
     *   of the `billId`.
     * - If you do not define a `billPrefix`, the Bill response schema for API calls that retrieve
     *   Bill data will not contain a `sequentialInvoiceNumber`.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billPrefix(): Optional<String> = body.billPrefix()

    /**
     * Boolean setting to specify whether commitments _(prepayments)_ are billed in advance at the
     * start of each billing period, or billed in arrears at the end of each billing period.
     * - **TRUE** - bill in advance _(start of each billing period)_.
     * - **FALSE** - bill in arrears _(end of each billing period)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commitmentFeeBillInAdvance(): Optional<Boolean> = body.commitmentFeeBillInAdvance()

    /**
     * Boolean setting to consolidate different billing frequencies onto the same bill.
     * - **TRUE** - consolidate different billing frequencies onto the same bill.
     * - **FALSE** - bills are not consolidated.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun consolidateBills(): Optional<Boolean> = body.consolidateBills()

    /**
     * Define the order in which any Prepayment or Balance amounts on Accounts are to be drawn-down
     * against for billing. Four options:
     * - `"PREPAYMENT","BALANCE"`. Draw-down against Prepayment credit before Balance credit.
     * - `"BALANCE","PREPAYMENT"`. Draw-down against Balance credit before Prepayment credit.
     * - `"PREPAYMENT"`. Only draw-down against Prepayment credit.
     * - `"BALANCE"`. Only draw-down against Balance credit.
     *
     * **NOTES:**
     * - You can override this Organization-level setting for `creditApplicationOrder` at the level
     *   of an individual Account.
     * - If the Account belongs to a Parent/Child Account hierarchy, then the
     *   `creditApplicationOrder` settings are not available, and the draw-down order defaults
     *   always to Prepayment then Balance order.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditApplicationOrder(): Optional<List<CreditApplicationOrder>> =
        body.creditApplicationOrder()

    /**
     * Define currency conversion rates from _pricing currency_ to _billing currency_:
     * - You can use the `currency` request parameter with this call to define the billing currency
     *   for your Organization - see above.
     * - You can also define a billing currency at the individual Account level and this will
     *   override the Organization billing currency.
     * - A Plan used to set Product consumption charge rates on an Account might use a different
     *   pricing currency. At billing, charges are calculated in the pricing currency and then
     *   converted into billing currency amounts to appear on Bills. If you haven't defined a
     *   currency conversion rate from pricing to billing currency, billing will fail for the
     *   Account.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencyConversions(): Optional<List<CurrencyConversion>> = body.currencyConversions()

    /**
     * Organization level default `statementDefinitionId` to be used when there is no statement
     * definition linked to the account.
     *
     * Statement definitions are used to generate bill statements, which are informative backing
     * sheets to invoices.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultStatementDefinitionId(): Optional<String> = body.defaultStatementDefinitionId()

    /**
     * Date to use for the invoice date. Allowed values are `FIRST_DAY_OF_NEXT_PERIOD` or
     * `LAST_DAY_OF_ARREARS`.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalInvoiceDate(): Optional<String> = body.externalInvoiceDate()

    /**
     * Boolean setting to specify whether minimum spend amounts are billed in advance at the start
     * of each billing period, or billed in arrears at the end of each billing period.
     * - **TRUE** - bill in advance _(start of each billing period)_.
     * - **FALSE** - bill in arrears _(end of each billing period)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minimumSpendBillInAdvance(): Optional<Boolean> = body.minimumSpendBillInAdvance()

    /**
     * Sets the required interval for updating bills. It is an optional parameter that can be set
     * as:
     * - **For portions of an hour (minutes)**. Two options: **0.25** (15 minutes) and **0.5** (30
     *   minutes).
     * - **For full hours.** Enter **1** for every hour, **2** for every two hours, and so on. Eight
     *   options: **1**, **2**, **3**, **4**, **6**, **8**, **12**, or **24**.
     * - **Default.** The default is **0**, which disables scheduling.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scheduledBillInterval(): Optional<Double> = body.scheduledBillInterval()

    /**
     * The starting number to be used for sequential invoice numbers. This will be combined with the
     * `billPrefix`.
     *
     * For example, if you define `billPrefix` to be **INVOICE-** and you set the
     * `seqenceStartNumber` as **100**, the first Bill created after updating your Organization
     * Configuration will have a `sequentialInvoiceNumber` assigned of **INVOICE-101**. Subsequent
     * Bills created will be numbered in time sequence for their initial creation date/time.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sequenceStartNumber(): Optional<Long> = body.sequenceStartNumber()

    /**
     * Boolean setting to specify whether the standing charge is billed in advance at the start of
     * each billing period, or billed in arrears at the end of each billing period.
     * - **TRUE** - bill in advance _(start of each billing period)_.
     * - **FALSE** - bill in arrears _(end of each billing period)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun standingChargeBillInAdvance(): Optional<Boolean> = body.standingChargeBillInAdvance()

    /**
     * Boolean setting that supresses generating bills that have no line items.
     * - **TRUE** - prevents generating bills with no line items.
     * - **FALSE** - bills are still generated even when they have no line items.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun suppressedEmptyBills(): Optional<Boolean> = body.suppressedEmptyBills()

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
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currency(): JsonField<String> = body._currency()

    /**
     * Returns the raw JSON value of [dayEpoch].
     *
     * Unlike [dayEpoch], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dayEpoch(): JsonField<String> = body._dayEpoch()

    /**
     * Returns the raw JSON value of [daysBeforeBillDue].
     *
     * Unlike [daysBeforeBillDue], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _daysBeforeBillDue(): JsonField<Long> = body._daysBeforeBillDue()

    /**
     * Returns the raw JSON value of [monthEpoch].
     *
     * Unlike [monthEpoch], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _monthEpoch(): JsonField<String> = body._monthEpoch()

    /**
     * Returns the raw JSON value of [timezone].
     *
     * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timezone(): JsonField<String> = body._timezone()

    /**
     * Returns the raw JSON value of [weekEpoch].
     *
     * Unlike [weekEpoch], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _weekEpoch(): JsonField<String> = body._weekEpoch()

    /**
     * Returns the raw JSON value of [yearEpoch].
     *
     * Unlike [yearEpoch], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _yearEpoch(): JsonField<String> = body._yearEpoch()

    /**
     * Returns the raw JSON value of [autoApproveBillsGracePeriod].
     *
     * Unlike [autoApproveBillsGracePeriod], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _autoApproveBillsGracePeriod(): JsonField<Long> = body._autoApproveBillsGracePeriod()

    /**
     * Returns the raw JSON value of [autoApproveBillsGracePeriodUnit].
     *
     * Unlike [autoApproveBillsGracePeriodUnit], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _autoApproveBillsGracePeriodUnit(): JsonField<String> =
        body._autoApproveBillsGracePeriodUnit()

    /**
     * Returns the raw JSON value of [autoGenerateStatementMode].
     *
     * Unlike [autoGenerateStatementMode], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _autoGenerateStatementMode(): JsonField<AutoGenerateStatementMode> =
        body._autoGenerateStatementMode()

    /**
     * Returns the raw JSON value of [billPrefix].
     *
     * Unlike [billPrefix], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billPrefix(): JsonField<String> = body._billPrefix()

    /**
     * Returns the raw JSON value of [commitmentFeeBillInAdvance].
     *
     * Unlike [commitmentFeeBillInAdvance], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _commitmentFeeBillInAdvance(): JsonField<Boolean> = body._commitmentFeeBillInAdvance()

    /**
     * Returns the raw JSON value of [consolidateBills].
     *
     * Unlike [consolidateBills], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _consolidateBills(): JsonField<Boolean> = body._consolidateBills()

    /**
     * Returns the raw JSON value of [creditApplicationOrder].
     *
     * Unlike [creditApplicationOrder], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _creditApplicationOrder(): JsonField<List<CreditApplicationOrder>> =
        body._creditApplicationOrder()

    /**
     * Returns the raw JSON value of [currencyConversions].
     *
     * Unlike [currencyConversions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _currencyConversions(): JsonField<List<CurrencyConversion>> = body._currencyConversions()

    /**
     * Returns the raw JSON value of [defaultStatementDefinitionId].
     *
     * Unlike [defaultStatementDefinitionId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _defaultStatementDefinitionId(): JsonField<String> = body._defaultStatementDefinitionId()

    /**
     * Returns the raw JSON value of [externalInvoiceDate].
     *
     * Unlike [externalInvoiceDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _externalInvoiceDate(): JsonField<String> = body._externalInvoiceDate()

    /**
     * Returns the raw JSON value of [minimumSpendBillInAdvance].
     *
     * Unlike [minimumSpendBillInAdvance], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _minimumSpendBillInAdvance(): JsonField<Boolean> = body._minimumSpendBillInAdvance()

    /**
     * Returns the raw JSON value of [scheduledBillInterval].
     *
     * Unlike [scheduledBillInterval], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _scheduledBillInterval(): JsonField<Double> = body._scheduledBillInterval()

    /**
     * Returns the raw JSON value of [sequenceStartNumber].
     *
     * Unlike [sequenceStartNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _sequenceStartNumber(): JsonField<Long> = body._sequenceStartNumber()

    /**
     * Returns the raw JSON value of [standingChargeBillInAdvance].
     *
     * Unlike [standingChargeBillInAdvance], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _standingChargeBillInAdvance(): JsonField<Boolean> = body._standingChargeBillInAdvance()

    /**
     * Returns the raw JSON value of [suppressedEmptyBills].
     *
     * Unlike [suppressedEmptyBills], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _suppressedEmptyBills(): JsonField<Boolean> = body._suppressedEmptyBills()

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _version(): JsonField<Long> = body._version()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [OrganizationConfigUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .currency()
         * .dayEpoch()
         * .daysBeforeBillDue()
         * .monthEpoch()
         * .timezone()
         * .weekEpoch()
         * .yearEpoch()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OrganizationConfigUpdateParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(organizationConfigUpdateParams: OrganizationConfigUpdateParams) = apply {
            orgId = organizationConfigUpdateParams.orgId
            body = organizationConfigUpdateParams.body.toBuilder()
            additionalHeaders = organizationConfigUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = organizationConfigUpdateParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [currency]
         * - [dayEpoch]
         * - [daysBeforeBillDue]
         * - [monthEpoch]
         * - [timezone]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The currency code for the Organization. For example: USD, GBP, or EUR:
         * - This defines the _billing currency_ for the Organization. You can override this by
         *   selecting a different billing currency at individual Account level.
         * - You must first define the currencies you want to use in your Organization. See the
         *   [Currency](https://www.m3ter.com/docs/api#tag/Currency) section in this API Reference.
         *
         * **Note:** If you use a different currency as the _pricing currency_ for Plans to set
         * charge rates for Product consumption by an Account, you must define a currency conversion
         * rate from the pricing currency to the billing currency before you run billing for the
         * Account, otherwise billing will fail. See below for the `currencyConversions` request
         * parameter.
         */
        fun currency(currency: String) = apply { body.currency(currency) }

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { body.currency(currency) }

        /**
         * Optional setting that defines the billing cycle date for Accounts that are billed daily.
         * Defines the date of the first Bill:
         * - For example, suppose the Plan you attach to an Account is configured for daily billing
         *   frequency and will apply to the Account from January 1st, 2022 until June 30th, 2022.
         *   If you set a `dayEpoch` date of January 2nd, 2022, then the first Bill is created for
         *   the Account on that date and subsequent Bills are created for the Account each day
         *   following through to the end of the billing service period.
         * - The date is in ISO-8601 format.
         */
        fun dayEpoch(dayEpoch: String) = apply { body.dayEpoch(dayEpoch) }

        /**
         * Sets [Builder.dayEpoch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dayEpoch] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dayEpoch(dayEpoch: JsonField<String>) = apply { body.dayEpoch(dayEpoch) }

        /**
         * Enter the number of days after the Bill generation date that you want to show on Bills as
         * the due date.
         *
         * **Note:** If you define `daysBeforeBillDue` at individual Account level, this will take
         * precedence over any `daysBeforeBillDue` setting defined at Organization level.
         */
        fun daysBeforeBillDue(daysBeforeBillDue: Long) = apply {
            body.daysBeforeBillDue(daysBeforeBillDue)
        }

        /**
         * Sets [Builder.daysBeforeBillDue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.daysBeforeBillDue] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun daysBeforeBillDue(daysBeforeBillDue: JsonField<Long>) = apply {
            body.daysBeforeBillDue(daysBeforeBillDue)
        }

        /**
         * Optional setting that defines the billing cycle date for Accounts that are billed
         * monthly. Defines the date of the first Bill and then acts as reference for when
         * subsequent Bills are created for the Account:
         * - For example, suppose the Plan you attach to an Account is configured for monthly
         *   billing frequency and will apply to the Account from January 1st, 2022 until June
         *   30th, 2022. If you set a `monthEpoch` date of January 15th, 2022, then the first Bill
         *   is created for the Account on that date and subsequent Bills are created for the
         *   Account on the 15th of each month following through to the end of the billing service
         *   period - February 15th, March 15th, and so on.
         * - The date is in ISO-8601 format.
         */
        fun monthEpoch(monthEpoch: String) = apply { body.monthEpoch(monthEpoch) }

        /**
         * Sets [Builder.monthEpoch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.monthEpoch] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun monthEpoch(monthEpoch: JsonField<String>) = apply { body.monthEpoch(monthEpoch) }

        /** Sets the timezone for the Organization. */
        fun timezone(timezone: String) = apply { body.timezone(timezone) }

        /**
         * Sets [Builder.timezone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timezone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timezone(timezone: JsonField<String>) = apply { body.timezone(timezone) }

        /**
         * Optional setting that defines the billing cycle date for Accounts that are billed weekly.
         * Defines the date of the first Bill and then acts as reference for when subsequent Bills
         * are created for the Account:
         * - For example, suppose the Plan you attach to an Account is configured for weekly billing
         *   frequency and will apply to the Account from January 1st, 2022 until June 30th, 2022.
         *   If you set a `weekEpoch` date of January 15th, 2022, which falls on a Saturday, then
         *   the first Bill is created for the Account on that date and subsequent Bills are created
         *   for the Account on Saturday of each week following through to the end of the billing
         *   service period.
         * - The date is in ISO-8601 format.
         */
        fun weekEpoch(weekEpoch: String) = apply { body.weekEpoch(weekEpoch) }

        /**
         * Sets [Builder.weekEpoch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.weekEpoch] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun weekEpoch(weekEpoch: JsonField<String>) = apply { body.weekEpoch(weekEpoch) }

        /**
         * Optional setting that defines the billing cycle date for Accounts that are billed yearly.
         * Defines the date of the first Bill and then acts as reference for when subsequent Bills
         * are created for the Account:
         * - For example, suppose the Plan you attach to an Account is configured for yearly billing
         *   frequency and will apply to the Account from January 1st, 2022 until January
         *   15th, 2028. If you set a `yearEpoch` date of January 1st, 2023, then the first Bill is
         *   created for the Account on that date and subsequent Bills are created for the Account
         *   on January 1st of each year following through to the end of the billing service
         *   period - January 1st, 2023, January 1st, 2024 and so on.
         * - The date is in ISO-8601 format.
         */
        fun yearEpoch(yearEpoch: String) = apply { body.yearEpoch(yearEpoch) }

        /**
         * Sets [Builder.yearEpoch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.yearEpoch] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun yearEpoch(yearEpoch: JsonField<String>) = apply { body.yearEpoch(yearEpoch) }

        /**
         * Grace period before bills are auto-approved. Used in combination with
         * `autoApproveBillsGracePeriodUnit` parameter.
         *
         * **Note:** When used in combination with `autoApproveBillsGracePeriodUnit` enables
         * auto-approval of Bills for Organization, which occurs when the specified time period has
         * elapsed after Bill generation.
         */
        fun autoApproveBillsGracePeriod(autoApproveBillsGracePeriod: Long) = apply {
            body.autoApproveBillsGracePeriod(autoApproveBillsGracePeriod)
        }

        /**
         * Sets [Builder.autoApproveBillsGracePeriod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoApproveBillsGracePeriod] with a well-typed [Long]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun autoApproveBillsGracePeriod(autoApproveBillsGracePeriod: JsonField<Long>) = apply {
            body.autoApproveBillsGracePeriod(autoApproveBillsGracePeriod)
        }

        /**
         * Time unit of grace period before bills are auto-approved. Used in combination with
         * `autoApproveBillsGracePeriod` parameter. Allowed options are MINUTES, HOURS, or DAYS.
         *
         * **Note:** When used in combination with `autoApproveBillsGracePeriod` enables
         * auto-approval of Bills for Organization, which occurs when the specified time period has
         * elapsed after Bill generation.
         */
        fun autoApproveBillsGracePeriodUnit(autoApproveBillsGracePeriodUnit: String) = apply {
            body.autoApproveBillsGracePeriodUnit(autoApproveBillsGracePeriodUnit)
        }

        /**
         * Sets [Builder.autoApproveBillsGracePeriodUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoApproveBillsGracePeriodUnit] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun autoApproveBillsGracePeriodUnit(autoApproveBillsGracePeriodUnit: JsonField<String>) =
            apply {
                body.autoApproveBillsGracePeriodUnit(autoApproveBillsGracePeriodUnit)
            }

        /**
         * Specify whether to auto-generate statements once Bills are _approved_ or _locked_. It
         * will not auto-generate if a bill is in _pending_ state.
         *
         * The default value is **None**.
         * - **None**. Statements will not be auto-generated.
         * - **JSON**. Statements are auto-generated in JSON format.
         * - **JSON and CSV**. Statements are auto-generated in both JSON and CSV formats.
         */
        fun autoGenerateStatementMode(autoGenerateStatementMode: AutoGenerateStatementMode) =
            apply {
                body.autoGenerateStatementMode(autoGenerateStatementMode)
            }

        /**
         * Sets [Builder.autoGenerateStatementMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoGenerateStatementMode] with a well-typed
         * [AutoGenerateStatementMode] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun autoGenerateStatementMode(
            autoGenerateStatementMode: JsonField<AutoGenerateStatementMode>
        ) = apply { body.autoGenerateStatementMode(autoGenerateStatementMode) }

        /**
         * Prefix to be used for sequential invoice numbers. This will be combined with the
         * `sequenceStartNumber`.
         *
         * **NOTES:**
         * - If you do not define a `billPrefix`, a default will be used in the Console for the Bill
         *   **REFERENCE** number. This default will concatenate **INV-** with the last four
         *   characters of the `billId`.
         * - If you do not define a `billPrefix`, the Bill response schema for API calls that
         *   retrieve Bill data will not contain a `sequentialInvoiceNumber`.
         */
        fun billPrefix(billPrefix: String) = apply { body.billPrefix(billPrefix) }

        /**
         * Sets [Builder.billPrefix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billPrefix] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun billPrefix(billPrefix: JsonField<String>) = apply { body.billPrefix(billPrefix) }

        /**
         * Boolean setting to specify whether commitments _(prepayments)_ are billed in advance at
         * the start of each billing period, or billed in arrears at the end of each billing period.
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

        /**
         * Boolean setting to consolidate different billing frequencies onto the same bill.
         * - **TRUE** - consolidate different billing frequencies onto the same bill.
         * - **FALSE** - bills are not consolidated.
         */
        fun consolidateBills(consolidateBills: Boolean) = apply {
            body.consolidateBills(consolidateBills)
        }

        /**
         * Sets [Builder.consolidateBills] to an arbitrary JSON value.
         *
         * You should usually call [Builder.consolidateBills] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun consolidateBills(consolidateBills: JsonField<Boolean>) = apply {
            body.consolidateBills(consolidateBills)
        }

        /**
         * Define the order in which any Prepayment or Balance amounts on Accounts are to be
         * drawn-down against for billing. Four options:
         * - `"PREPAYMENT","BALANCE"`. Draw-down against Prepayment credit before Balance credit.
         * - `"BALANCE","PREPAYMENT"`. Draw-down against Balance credit before Prepayment credit.
         * - `"PREPAYMENT"`. Only draw-down against Prepayment credit.
         * - `"BALANCE"`. Only draw-down against Balance credit.
         *
         * **NOTES:**
         * - You can override this Organization-level setting for `creditApplicationOrder` at the
         *   level of an individual Account.
         * - If the Account belongs to a Parent/Child Account hierarchy, then the
         *   `creditApplicationOrder` settings are not available, and the draw-down order defaults
         *   always to Prepayment then Balance order.
         */
        fun creditApplicationOrder(creditApplicationOrder: List<CreditApplicationOrder>) = apply {
            body.creditApplicationOrder(creditApplicationOrder)
        }

        /**
         * Sets [Builder.creditApplicationOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditApplicationOrder] with a well-typed
         * `List<CreditApplicationOrder>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun creditApplicationOrder(
            creditApplicationOrder: JsonField<List<CreditApplicationOrder>>
        ) = apply { body.creditApplicationOrder(creditApplicationOrder) }

        /**
         * Adds a single [CreditApplicationOrder] to [Builder.creditApplicationOrder].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCreditApplicationOrder(creditApplicationOrder: CreditApplicationOrder) = apply {
            body.addCreditApplicationOrder(creditApplicationOrder)
        }

        /**
         * Define currency conversion rates from _pricing currency_ to _billing currency_:
         * - You can use the `currency` request parameter with this call to define the billing
         *   currency for your Organization - see above.
         * - You can also define a billing currency at the individual Account level and this will
         *   override the Organization billing currency.
         * - A Plan used to set Product consumption charge rates on an Account might use a different
         *   pricing currency. At billing, charges are calculated in the pricing currency and then
         *   converted into billing currency amounts to appear on Bills. If you haven't defined a
         *   currency conversion rate from pricing to billing currency, billing will fail for the
         *   Account.
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
         * Organization level default `statementDefinitionId` to be used when there is no statement
         * definition linked to the account.
         *
         * Statement definitions are used to generate bill statements, which are informative backing
         * sheets to invoices.
         */
        fun defaultStatementDefinitionId(defaultStatementDefinitionId: String) = apply {
            body.defaultStatementDefinitionId(defaultStatementDefinitionId)
        }

        /**
         * Sets [Builder.defaultStatementDefinitionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultStatementDefinitionId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun defaultStatementDefinitionId(defaultStatementDefinitionId: JsonField<String>) = apply {
            body.defaultStatementDefinitionId(defaultStatementDefinitionId)
        }

        /**
         * Date to use for the invoice date. Allowed values are `FIRST_DAY_OF_NEXT_PERIOD` or
         * `LAST_DAY_OF_ARREARS`.
         */
        fun externalInvoiceDate(externalInvoiceDate: String) = apply {
            body.externalInvoiceDate(externalInvoiceDate)
        }

        /**
         * Sets [Builder.externalInvoiceDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalInvoiceDate] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalInvoiceDate(externalInvoiceDate: JsonField<String>) = apply {
            body.externalInvoiceDate(externalInvoiceDate)
        }

        /**
         * Boolean setting to specify whether minimum spend amounts are billed in advance at the
         * start of each billing period, or billed in arrears at the end of each billing period.
         * - **TRUE** - bill in advance _(start of each billing period)_.
         * - **FALSE** - bill in arrears _(end of each billing period)_.
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

        /**
         * Sets the required interval for updating bills. It is an optional parameter that can be
         * set as:
         * - **For portions of an hour (minutes)**. Two options: **0.25** (15 minutes) and **0.5**
         *   (30 minutes).
         * - **For full hours.** Enter **1** for every hour, **2** for every two hours, and so on.
         *   Eight options: **1**, **2**, **3**, **4**, **6**, **8**, **12**, or **24**.
         * - **Default.** The default is **0**, which disables scheduling.
         */
        fun scheduledBillInterval(scheduledBillInterval: Double) = apply {
            body.scheduledBillInterval(scheduledBillInterval)
        }

        /**
         * Sets [Builder.scheduledBillInterval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduledBillInterval] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scheduledBillInterval(scheduledBillInterval: JsonField<Double>) = apply {
            body.scheduledBillInterval(scheduledBillInterval)
        }

        /**
         * The starting number to be used for sequential invoice numbers. This will be combined with
         * the `billPrefix`.
         *
         * For example, if you define `billPrefix` to be **INVOICE-** and you set the
         * `seqenceStartNumber` as **100**, the first Bill created after updating your Organization
         * Configuration will have a `sequentialInvoiceNumber` assigned of **INVOICE-101**.
         * Subsequent Bills created will be numbered in time sequence for their initial creation
         * date/time.
         */
        fun sequenceStartNumber(sequenceStartNumber: Long) = apply {
            body.sequenceStartNumber(sequenceStartNumber)
        }

        /**
         * Sets [Builder.sequenceStartNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sequenceStartNumber] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sequenceStartNumber(sequenceStartNumber: JsonField<Long>) = apply {
            body.sequenceStartNumber(sequenceStartNumber)
        }

        /**
         * Boolean setting to specify whether the standing charge is billed in advance at the start
         * of each billing period, or billed in arrears at the end of each billing period.
         * - **TRUE** - bill in advance _(start of each billing period)_.
         * - **FALSE** - bill in arrears _(end of each billing period)_.
         */
        fun standingChargeBillInAdvance(standingChargeBillInAdvance: Boolean) = apply {
            body.standingChargeBillInAdvance(standingChargeBillInAdvance)
        }

        /**
         * Sets [Builder.standingChargeBillInAdvance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.standingChargeBillInAdvance] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun standingChargeBillInAdvance(standingChargeBillInAdvance: JsonField<Boolean>) = apply {
            body.standingChargeBillInAdvance(standingChargeBillInAdvance)
        }

        /**
         * Boolean setting that supresses generating bills that have no line items.
         * - **TRUE** - prevents generating bills with no line items.
         * - **FALSE** - bills are still generated even when they have no line items.
         */
        fun suppressedEmptyBills(suppressedEmptyBills: Boolean) = apply {
            body.suppressedEmptyBills(suppressedEmptyBills)
        }

        /**
         * Sets [Builder.suppressedEmptyBills] to an arbitrary JSON value.
         *
         * You should usually call [Builder.suppressedEmptyBills] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun suppressedEmptyBills(suppressedEmptyBills: JsonField<Boolean>) = apply {
            body.suppressedEmptyBills(suppressedEmptyBills)
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
         * Returns an immutable instance of [OrganizationConfigUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .currency()
         * .dayEpoch()
         * .daysBeforeBillDue()
         * .monthEpoch()
         * .timezone()
         * .weekEpoch()
         * .yearEpoch()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OrganizationConfigUpdateParams =
            OrganizationConfigUpdateParams(
                checkRequired("orgId", orgId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val currency: JsonField<String>,
        private val dayEpoch: JsonField<String>,
        private val daysBeforeBillDue: JsonField<Long>,
        private val monthEpoch: JsonField<String>,
        private val timezone: JsonField<String>,
        private val weekEpoch: JsonField<String>,
        private val yearEpoch: JsonField<String>,
        private val autoApproveBillsGracePeriod: JsonField<Long>,
        private val autoApproveBillsGracePeriodUnit: JsonField<String>,
        private val autoGenerateStatementMode: JsonField<AutoGenerateStatementMode>,
        private val billPrefix: JsonField<String>,
        private val commitmentFeeBillInAdvance: JsonField<Boolean>,
        private val consolidateBills: JsonField<Boolean>,
        private val creditApplicationOrder: JsonField<List<CreditApplicationOrder>>,
        private val currencyConversions: JsonField<List<CurrencyConversion>>,
        private val defaultStatementDefinitionId: JsonField<String>,
        private val externalInvoiceDate: JsonField<String>,
        private val minimumSpendBillInAdvance: JsonField<Boolean>,
        private val scheduledBillInterval: JsonField<Double>,
        private val sequenceStartNumber: JsonField<Long>,
        private val standingChargeBillInAdvance: JsonField<Boolean>,
        private val suppressedEmptyBills: JsonField<Boolean>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dayEpoch")
            @ExcludeMissing
            dayEpoch: JsonField<String> = JsonMissing.of(),
            @JsonProperty("daysBeforeBillDue")
            @ExcludeMissing
            daysBeforeBillDue: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("monthEpoch")
            @ExcludeMissing
            monthEpoch: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timezone")
            @ExcludeMissing
            timezone: JsonField<String> = JsonMissing.of(),
            @JsonProperty("weekEpoch")
            @ExcludeMissing
            weekEpoch: JsonField<String> = JsonMissing.of(),
            @JsonProperty("yearEpoch")
            @ExcludeMissing
            yearEpoch: JsonField<String> = JsonMissing.of(),
            @JsonProperty("autoApproveBillsGracePeriod")
            @ExcludeMissing
            autoApproveBillsGracePeriod: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("autoApproveBillsGracePeriodUnit")
            @ExcludeMissing
            autoApproveBillsGracePeriodUnit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("autoGenerateStatementMode")
            @ExcludeMissing
            autoGenerateStatementMode: JsonField<AutoGenerateStatementMode> = JsonMissing.of(),
            @JsonProperty("billPrefix")
            @ExcludeMissing
            billPrefix: JsonField<String> = JsonMissing.of(),
            @JsonProperty("commitmentFeeBillInAdvance")
            @ExcludeMissing
            commitmentFeeBillInAdvance: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("consolidateBills")
            @ExcludeMissing
            consolidateBills: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("creditApplicationOrder")
            @ExcludeMissing
            creditApplicationOrder: JsonField<List<CreditApplicationOrder>> = JsonMissing.of(),
            @JsonProperty("currencyConversions")
            @ExcludeMissing
            currencyConversions: JsonField<List<CurrencyConversion>> = JsonMissing.of(),
            @JsonProperty("defaultStatementDefinitionId")
            @ExcludeMissing
            defaultStatementDefinitionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("externalInvoiceDate")
            @ExcludeMissing
            externalInvoiceDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("minimumSpendBillInAdvance")
            @ExcludeMissing
            minimumSpendBillInAdvance: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("scheduledBillInterval")
            @ExcludeMissing
            scheduledBillInterval: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("sequenceStartNumber")
            @ExcludeMissing
            sequenceStartNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("standingChargeBillInAdvance")
            @ExcludeMissing
            standingChargeBillInAdvance: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("suppressedEmptyBills")
            @ExcludeMissing
            suppressedEmptyBills: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(
            currency,
            dayEpoch,
            daysBeforeBillDue,
            monthEpoch,
            timezone,
            weekEpoch,
            yearEpoch,
            autoApproveBillsGracePeriod,
            autoApproveBillsGracePeriodUnit,
            autoGenerateStatementMode,
            billPrefix,
            commitmentFeeBillInAdvance,
            consolidateBills,
            creditApplicationOrder,
            currencyConversions,
            defaultStatementDefinitionId,
            externalInvoiceDate,
            minimumSpendBillInAdvance,
            scheduledBillInterval,
            sequenceStartNumber,
            standingChargeBillInAdvance,
            suppressedEmptyBills,
            version,
            mutableMapOf(),
        )

        /**
         * The currency code for the Organization. For example: USD, GBP, or EUR:
         * - This defines the _billing currency_ for the Organization. You can override this by
         *   selecting a different billing currency at individual Account level.
         * - You must first define the currencies you want to use in your Organization. See the
         *   [Currency](https://www.m3ter.com/docs/api#tag/Currency) section in this API Reference.
         *
         * **Note:** If you use a different currency as the _pricing currency_ for Plans to set
         * charge rates for Product consumption by an Account, you must define a currency conversion
         * rate from the pricing currency to the billing currency before you run billing for the
         * Account, otherwise billing will fail. See below for the `currencyConversions` request
         * parameter.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * Optional setting that defines the billing cycle date for Accounts that are billed daily.
         * Defines the date of the first Bill:
         * - For example, suppose the Plan you attach to an Account is configured for daily billing
         *   frequency and will apply to the Account from January 1st, 2022 until June 30th, 2022.
         *   If you set a `dayEpoch` date of January 2nd, 2022, then the first Bill is created for
         *   the Account on that date and subsequent Bills are created for the Account each day
         *   following through to the end of the billing service period.
         * - The date is in ISO-8601 format.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dayEpoch(): String = dayEpoch.getRequired("dayEpoch")

        /**
         * Enter the number of days after the Bill generation date that you want to show on Bills as
         * the due date.
         *
         * **Note:** If you define `daysBeforeBillDue` at individual Account level, this will take
         * precedence over any `daysBeforeBillDue` setting defined at Organization level.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun daysBeforeBillDue(): Long = daysBeforeBillDue.getRequired("daysBeforeBillDue")

        /**
         * Optional setting that defines the billing cycle date for Accounts that are billed
         * monthly. Defines the date of the first Bill and then acts as reference for when
         * subsequent Bills are created for the Account:
         * - For example, suppose the Plan you attach to an Account is configured for monthly
         *   billing frequency and will apply to the Account from January 1st, 2022 until June
         *   30th, 2022. If you set a `monthEpoch` date of January 15th, 2022, then the first Bill
         *   is created for the Account on that date and subsequent Bills are created for the
         *   Account on the 15th of each month following through to the end of the billing service
         *   period - February 15th, March 15th, and so on.
         * - The date is in ISO-8601 format.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun monthEpoch(): String = monthEpoch.getRequired("monthEpoch")

        /**
         * Sets the timezone for the Organization.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun timezone(): String = timezone.getRequired("timezone")

        /**
         * Optional setting that defines the billing cycle date for Accounts that are billed weekly.
         * Defines the date of the first Bill and then acts as reference for when subsequent Bills
         * are created for the Account:
         * - For example, suppose the Plan you attach to an Account is configured for weekly billing
         *   frequency and will apply to the Account from January 1st, 2022 until June 30th, 2022.
         *   If you set a `weekEpoch` date of January 15th, 2022, which falls on a Saturday, then
         *   the first Bill is created for the Account on that date and subsequent Bills are created
         *   for the Account on Saturday of each week following through to the end of the billing
         *   service period.
         * - The date is in ISO-8601 format.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun weekEpoch(): String = weekEpoch.getRequired("weekEpoch")

        /**
         * Optional setting that defines the billing cycle date for Accounts that are billed yearly.
         * Defines the date of the first Bill and then acts as reference for when subsequent Bills
         * are created for the Account:
         * - For example, suppose the Plan you attach to an Account is configured for yearly billing
         *   frequency and will apply to the Account from January 1st, 2022 until January
         *   15th, 2028. If you set a `yearEpoch` date of January 1st, 2023, then the first Bill is
         *   created for the Account on that date and subsequent Bills are created for the Account
         *   on January 1st of each year following through to the end of the billing service
         *   period - January 1st, 2023, January 1st, 2024 and so on.
         * - The date is in ISO-8601 format.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun yearEpoch(): String = yearEpoch.getRequired("yearEpoch")

        /**
         * Grace period before bills are auto-approved. Used in combination with
         * `autoApproveBillsGracePeriodUnit` parameter.
         *
         * **Note:** When used in combination with `autoApproveBillsGracePeriodUnit` enables
         * auto-approval of Bills for Organization, which occurs when the specified time period has
         * elapsed after Bill generation.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun autoApproveBillsGracePeriod(): Optional<Long> =
            autoApproveBillsGracePeriod.getOptional("autoApproveBillsGracePeriod")

        /**
         * Time unit of grace period before bills are auto-approved. Used in combination with
         * `autoApproveBillsGracePeriod` parameter. Allowed options are MINUTES, HOURS, or DAYS.
         *
         * **Note:** When used in combination with `autoApproveBillsGracePeriod` enables
         * auto-approval of Bills for Organization, which occurs when the specified time period has
         * elapsed after Bill generation.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun autoApproveBillsGracePeriodUnit(): Optional<String> =
            autoApproveBillsGracePeriodUnit.getOptional("autoApproveBillsGracePeriodUnit")

        /**
         * Specify whether to auto-generate statements once Bills are _approved_ or _locked_. It
         * will not auto-generate if a bill is in _pending_ state.
         *
         * The default value is **None**.
         * - **None**. Statements will not be auto-generated.
         * - **JSON**. Statements are auto-generated in JSON format.
         * - **JSON and CSV**. Statements are auto-generated in both JSON and CSV formats.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun autoGenerateStatementMode(): Optional<AutoGenerateStatementMode> =
            autoGenerateStatementMode.getOptional("autoGenerateStatementMode")

        /**
         * Prefix to be used for sequential invoice numbers. This will be combined with the
         * `sequenceStartNumber`.
         *
         * **NOTES:**
         * - If you do not define a `billPrefix`, a default will be used in the Console for the Bill
         *   **REFERENCE** number. This default will concatenate **INV-** with the last four
         *   characters of the `billId`.
         * - If you do not define a `billPrefix`, the Bill response schema for API calls that
         *   retrieve Bill data will not contain a `sequentialInvoiceNumber`.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billPrefix(): Optional<String> = billPrefix.getOptional("billPrefix")

        /**
         * Boolean setting to specify whether commitments _(prepayments)_ are billed in advance at
         * the start of each billing period, or billed in arrears at the end of each billing period.
         * - **TRUE** - bill in advance _(start of each billing period)_.
         * - **FALSE** - bill in arrears _(end of each billing period)_.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun commitmentFeeBillInAdvance(): Optional<Boolean> =
            commitmentFeeBillInAdvance.getOptional("commitmentFeeBillInAdvance")

        /**
         * Boolean setting to consolidate different billing frequencies onto the same bill.
         * - **TRUE** - consolidate different billing frequencies onto the same bill.
         * - **FALSE** - bills are not consolidated.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun consolidateBills(): Optional<Boolean> = consolidateBills.getOptional("consolidateBills")

        /**
         * Define the order in which any Prepayment or Balance amounts on Accounts are to be
         * drawn-down against for billing. Four options:
         * - `"PREPAYMENT","BALANCE"`. Draw-down against Prepayment credit before Balance credit.
         * - `"BALANCE","PREPAYMENT"`. Draw-down against Balance credit before Prepayment credit.
         * - `"PREPAYMENT"`. Only draw-down against Prepayment credit.
         * - `"BALANCE"`. Only draw-down against Balance credit.
         *
         * **NOTES:**
         * - You can override this Organization-level setting for `creditApplicationOrder` at the
         *   level of an individual Account.
         * - If the Account belongs to a Parent/Child Account hierarchy, then the
         *   `creditApplicationOrder` settings are not available, and the draw-down order defaults
         *   always to Prepayment then Balance order.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun creditApplicationOrder(): Optional<List<CreditApplicationOrder>> =
            creditApplicationOrder.getOptional("creditApplicationOrder")

        /**
         * Define currency conversion rates from _pricing currency_ to _billing currency_:
         * - You can use the `currency` request parameter with this call to define the billing
         *   currency for your Organization - see above.
         * - You can also define a billing currency at the individual Account level and this will
         *   override the Organization billing currency.
         * - A Plan used to set Product consumption charge rates on an Account might use a different
         *   pricing currency. At billing, charges are calculated in the pricing currency and then
         *   converted into billing currency amounts to appear on Bills. If you haven't defined a
         *   currency conversion rate from pricing to billing currency, billing will fail for the
         *   Account.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currencyConversions(): Optional<List<CurrencyConversion>> =
            currencyConversions.getOptional("currencyConversions")

        /**
         * Organization level default `statementDefinitionId` to be used when there is no statement
         * definition linked to the account.
         *
         * Statement definitions are used to generate bill statements, which are informative backing
         * sheets to invoices.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultStatementDefinitionId(): Optional<String> =
            defaultStatementDefinitionId.getOptional("defaultStatementDefinitionId")

        /**
         * Date to use for the invoice date. Allowed values are `FIRST_DAY_OF_NEXT_PERIOD` or
         * `LAST_DAY_OF_ARREARS`.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalInvoiceDate(): Optional<String> =
            externalInvoiceDate.getOptional("externalInvoiceDate")

        /**
         * Boolean setting to specify whether minimum spend amounts are billed in advance at the
         * start of each billing period, or billed in arrears at the end of each billing period.
         * - **TRUE** - bill in advance _(start of each billing period)_.
         * - **FALSE** - bill in arrears _(end of each billing period)_.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minimumSpendBillInAdvance(): Optional<Boolean> =
            minimumSpendBillInAdvance.getOptional("minimumSpendBillInAdvance")

        /**
         * Sets the required interval for updating bills. It is an optional parameter that can be
         * set as:
         * - **For portions of an hour (minutes)**. Two options: **0.25** (15 minutes) and **0.5**
         *   (30 minutes).
         * - **For full hours.** Enter **1** for every hour, **2** for every two hours, and so on.
         *   Eight options: **1**, **2**, **3**, **4**, **6**, **8**, **12**, or **24**.
         * - **Default.** The default is **0**, which disables scheduling.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun scheduledBillInterval(): Optional<Double> =
            scheduledBillInterval.getOptional("scheduledBillInterval")

        /**
         * The starting number to be used for sequential invoice numbers. This will be combined with
         * the `billPrefix`.
         *
         * For example, if you define `billPrefix` to be **INVOICE-** and you set the
         * `seqenceStartNumber` as **100**, the first Bill created after updating your Organization
         * Configuration will have a `sequentialInvoiceNumber` assigned of **INVOICE-101**.
         * Subsequent Bills created will be numbered in time sequence for their initial creation
         * date/time.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sequenceStartNumber(): Optional<Long> =
            sequenceStartNumber.getOptional("sequenceStartNumber")

        /**
         * Boolean setting to specify whether the standing charge is billed in advance at the start
         * of each billing period, or billed in arrears at the end of each billing period.
         * - **TRUE** - bill in advance _(start of each billing period)_.
         * - **FALSE** - bill in arrears _(end of each billing period)_.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun standingChargeBillInAdvance(): Optional<Boolean> =
            standingChargeBillInAdvance.getOptional("standingChargeBillInAdvance")

        /**
         * Boolean setting that supresses generating bills that have no line items.
         * - **TRUE** - prevents generating bills with no line items.
         * - **FALSE** - bills are still generated even when they have no line items.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun suppressedEmptyBills(): Optional<Boolean> =
            suppressedEmptyBills.getOptional("suppressedEmptyBills")

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
        fun version(): Optional<Long> = version.getOptional("version")

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [dayEpoch].
         *
         * Unlike [dayEpoch], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dayEpoch") @ExcludeMissing fun _dayEpoch(): JsonField<String> = dayEpoch

        /**
         * Returns the raw JSON value of [daysBeforeBillDue].
         *
         * Unlike [daysBeforeBillDue], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("daysBeforeBillDue")
        @ExcludeMissing
        fun _daysBeforeBillDue(): JsonField<Long> = daysBeforeBillDue

        /**
         * Returns the raw JSON value of [monthEpoch].
         *
         * Unlike [monthEpoch], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("monthEpoch")
        @ExcludeMissing
        fun _monthEpoch(): JsonField<String> = monthEpoch

        /**
         * Returns the raw JSON value of [timezone].
         *
         * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<String> = timezone

        /**
         * Returns the raw JSON value of [weekEpoch].
         *
         * Unlike [weekEpoch], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("weekEpoch") @ExcludeMissing fun _weekEpoch(): JsonField<String> = weekEpoch

        /**
         * Returns the raw JSON value of [yearEpoch].
         *
         * Unlike [yearEpoch], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("yearEpoch") @ExcludeMissing fun _yearEpoch(): JsonField<String> = yearEpoch

        /**
         * Returns the raw JSON value of [autoApproveBillsGracePeriod].
         *
         * Unlike [autoApproveBillsGracePeriod], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("autoApproveBillsGracePeriod")
        @ExcludeMissing
        fun _autoApproveBillsGracePeriod(): JsonField<Long> = autoApproveBillsGracePeriod

        /**
         * Returns the raw JSON value of [autoApproveBillsGracePeriodUnit].
         *
         * Unlike [autoApproveBillsGracePeriodUnit], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("autoApproveBillsGracePeriodUnit")
        @ExcludeMissing
        fun _autoApproveBillsGracePeriodUnit(): JsonField<String> = autoApproveBillsGracePeriodUnit

        /**
         * Returns the raw JSON value of [autoGenerateStatementMode].
         *
         * Unlike [autoGenerateStatementMode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("autoGenerateStatementMode")
        @ExcludeMissing
        fun _autoGenerateStatementMode(): JsonField<AutoGenerateStatementMode> =
            autoGenerateStatementMode

        /**
         * Returns the raw JSON value of [billPrefix].
         *
         * Unlike [billPrefix], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("billPrefix")
        @ExcludeMissing
        fun _billPrefix(): JsonField<String> = billPrefix

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
         * Returns the raw JSON value of [consolidateBills].
         *
         * Unlike [consolidateBills], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("consolidateBills")
        @ExcludeMissing
        fun _consolidateBills(): JsonField<Boolean> = consolidateBills

        /**
         * Returns the raw JSON value of [creditApplicationOrder].
         *
         * Unlike [creditApplicationOrder], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("creditApplicationOrder")
        @ExcludeMissing
        fun _creditApplicationOrder(): JsonField<List<CreditApplicationOrder>> =
            creditApplicationOrder

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
         * Returns the raw JSON value of [defaultStatementDefinitionId].
         *
         * Unlike [defaultStatementDefinitionId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("defaultStatementDefinitionId")
        @ExcludeMissing
        fun _defaultStatementDefinitionId(): JsonField<String> = defaultStatementDefinitionId

        /**
         * Returns the raw JSON value of [externalInvoiceDate].
         *
         * Unlike [externalInvoiceDate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("externalInvoiceDate")
        @ExcludeMissing
        fun _externalInvoiceDate(): JsonField<String> = externalInvoiceDate

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
         * Returns the raw JSON value of [scheduledBillInterval].
         *
         * Unlike [scheduledBillInterval], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("scheduledBillInterval")
        @ExcludeMissing
        fun _scheduledBillInterval(): JsonField<Double> = scheduledBillInterval

        /**
         * Returns the raw JSON value of [sequenceStartNumber].
         *
         * Unlike [sequenceStartNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("sequenceStartNumber")
        @ExcludeMissing
        fun _sequenceStartNumber(): JsonField<Long> = sequenceStartNumber

        /**
         * Returns the raw JSON value of [standingChargeBillInAdvance].
         *
         * Unlike [standingChargeBillInAdvance], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("standingChargeBillInAdvance")
        @ExcludeMissing
        fun _standingChargeBillInAdvance(): JsonField<Boolean> = standingChargeBillInAdvance

        /**
         * Returns the raw JSON value of [suppressedEmptyBills].
         *
         * Unlike [suppressedEmptyBills], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("suppressedEmptyBills")
        @ExcludeMissing
        fun _suppressedEmptyBills(): JsonField<Boolean> = suppressedEmptyBills

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
             * .currency()
             * .dayEpoch()
             * .daysBeforeBillDue()
             * .monthEpoch()
             * .timezone()
             * .weekEpoch()
             * .yearEpoch()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var currency: JsonField<String>? = null
            private var dayEpoch: JsonField<String>? = null
            private var daysBeforeBillDue: JsonField<Long>? = null
            private var monthEpoch: JsonField<String>? = null
            private var timezone: JsonField<String>? = null
            private var weekEpoch: JsonField<String>? = null
            private var yearEpoch: JsonField<String>? = null
            private var autoApproveBillsGracePeriod: JsonField<Long> = JsonMissing.of()
            private var autoApproveBillsGracePeriodUnit: JsonField<String> = JsonMissing.of()
            private var autoGenerateStatementMode: JsonField<AutoGenerateStatementMode> =
                JsonMissing.of()
            private var billPrefix: JsonField<String> = JsonMissing.of()
            private var commitmentFeeBillInAdvance: JsonField<Boolean> = JsonMissing.of()
            private var consolidateBills: JsonField<Boolean> = JsonMissing.of()
            private var creditApplicationOrder: JsonField<MutableList<CreditApplicationOrder>>? =
                null
            private var currencyConversions: JsonField<MutableList<CurrencyConversion>>? = null
            private var defaultStatementDefinitionId: JsonField<String> = JsonMissing.of()
            private var externalInvoiceDate: JsonField<String> = JsonMissing.of()
            private var minimumSpendBillInAdvance: JsonField<Boolean> = JsonMissing.of()
            private var scheduledBillInterval: JsonField<Double> = JsonMissing.of()
            private var sequenceStartNumber: JsonField<Long> = JsonMissing.of()
            private var standingChargeBillInAdvance: JsonField<Boolean> = JsonMissing.of()
            private var suppressedEmptyBills: JsonField<Boolean> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                currency = body.currency
                dayEpoch = body.dayEpoch
                daysBeforeBillDue = body.daysBeforeBillDue
                monthEpoch = body.monthEpoch
                timezone = body.timezone
                weekEpoch = body.weekEpoch
                yearEpoch = body.yearEpoch
                autoApproveBillsGracePeriod = body.autoApproveBillsGracePeriod
                autoApproveBillsGracePeriodUnit = body.autoApproveBillsGracePeriodUnit
                autoGenerateStatementMode = body.autoGenerateStatementMode
                billPrefix = body.billPrefix
                commitmentFeeBillInAdvance = body.commitmentFeeBillInAdvance
                consolidateBills = body.consolidateBills
                creditApplicationOrder = body.creditApplicationOrder.map { it.toMutableList() }
                currencyConversions = body.currencyConversions.map { it.toMutableList() }
                defaultStatementDefinitionId = body.defaultStatementDefinitionId
                externalInvoiceDate = body.externalInvoiceDate
                minimumSpendBillInAdvance = body.minimumSpendBillInAdvance
                scheduledBillInterval = body.scheduledBillInterval
                sequenceStartNumber = body.sequenceStartNumber
                standingChargeBillInAdvance = body.standingChargeBillInAdvance
                suppressedEmptyBills = body.suppressedEmptyBills
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The currency code for the Organization. For example: USD, GBP, or EUR:
             * - This defines the _billing currency_ for the Organization. You can override this by
             *   selecting a different billing currency at individual Account level.
             * - You must first define the currencies you want to use in your Organization. See the
             *   [Currency](https://www.m3ter.com/docs/api#tag/Currency) section in this API
             *   Reference.
             *
             * **Note:** If you use a different currency as the _pricing currency_ for Plans to set
             * charge rates for Product consumption by an Account, you must define a currency
             * conversion rate from the pricing currency to the billing currency before you run
             * billing for the Account, otherwise billing will fail. See below for the
             * `currencyConversions` request parameter.
             */
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
             * Optional setting that defines the billing cycle date for Accounts that are billed
             * daily. Defines the date of the first Bill:
             * - For example, suppose the Plan you attach to an Account is configured for daily
             *   billing frequency and will apply to the Account from January 1st, 2022 until June
             *   30th, 2022. If you set a `dayEpoch` date of January 2nd, 2022, then the first Bill
             *   is created for the Account on that date and subsequent Bills are created for the
             *   Account each day following through to the end of the billing service period.
             * - The date is in ISO-8601 format.
             */
            fun dayEpoch(dayEpoch: String) = dayEpoch(JsonField.of(dayEpoch))

            /**
             * Sets [Builder.dayEpoch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dayEpoch] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dayEpoch(dayEpoch: JsonField<String>) = apply { this.dayEpoch = dayEpoch }

            /**
             * Enter the number of days after the Bill generation date that you want to show on
             * Bills as the due date.
             *
             * **Note:** If you define `daysBeforeBillDue` at individual Account level, this will
             * take precedence over any `daysBeforeBillDue` setting defined at Organization level.
             */
            fun daysBeforeBillDue(daysBeforeBillDue: Long) =
                daysBeforeBillDue(JsonField.of(daysBeforeBillDue))

            /**
             * Sets [Builder.daysBeforeBillDue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.daysBeforeBillDue] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun daysBeforeBillDue(daysBeforeBillDue: JsonField<Long>) = apply {
                this.daysBeforeBillDue = daysBeforeBillDue
            }

            /**
             * Optional setting that defines the billing cycle date for Accounts that are billed
             * monthly. Defines the date of the first Bill and then acts as reference for when
             * subsequent Bills are created for the Account:
             * - For example, suppose the Plan you attach to an Account is configured for monthly
             *   billing frequency and will apply to the Account from January 1st, 2022 until June
             *   30th, 2022. If you set a `monthEpoch` date of January 15th, 2022, then the first
             *   Bill is created for the Account on that date and subsequent Bills are created for
             *   the Account on the 15th of each month following through to the end of the billing
             *   service period - February 15th, March 15th, and so on.
             * - The date is in ISO-8601 format.
             */
            fun monthEpoch(monthEpoch: String) = monthEpoch(JsonField.of(monthEpoch))

            /**
             * Sets [Builder.monthEpoch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.monthEpoch] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun monthEpoch(monthEpoch: JsonField<String>) = apply { this.monthEpoch = monthEpoch }

            /** Sets the timezone for the Organization. */
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
             * Optional setting that defines the billing cycle date for Accounts that are billed
             * weekly. Defines the date of the first Bill and then acts as reference for when
             * subsequent Bills are created for the Account:
             * - For example, suppose the Plan you attach to an Account is configured for weekly
             *   billing frequency and will apply to the Account from January 1st, 2022 until June
             *   30th, 2022. If you set a `weekEpoch` date of January 15th, 2022, which falls on a
             *   Saturday, then the first Bill is created for the Account on that date and
             *   subsequent Bills are created for the Account on Saturday of each week following
             *   through to the end of the billing service period.
             * - The date is in ISO-8601 format.
             */
            fun weekEpoch(weekEpoch: String) = weekEpoch(JsonField.of(weekEpoch))

            /**
             * Sets [Builder.weekEpoch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.weekEpoch] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun weekEpoch(weekEpoch: JsonField<String>) = apply { this.weekEpoch = weekEpoch }

            /**
             * Optional setting that defines the billing cycle date for Accounts that are billed
             * yearly. Defines the date of the first Bill and then acts as reference for when
             * subsequent Bills are created for the Account:
             * - For example, suppose the Plan you attach to an Account is configured for yearly
             *   billing frequency and will apply to the Account from January 1st, 2022 until
             *   January 15th, 2028. If you set a `yearEpoch` date of January 1st, 2023, then the
             *   first Bill is created for the Account on that date and subsequent Bills are created
             *   for the Account on January 1st of each year following through to the end of the
             *   billing service period - January 1st, 2023, January 1st, 2024 and so on.
             * - The date is in ISO-8601 format.
             */
            fun yearEpoch(yearEpoch: String) = yearEpoch(JsonField.of(yearEpoch))

            /**
             * Sets [Builder.yearEpoch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.yearEpoch] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun yearEpoch(yearEpoch: JsonField<String>) = apply { this.yearEpoch = yearEpoch }

            /**
             * Grace period before bills are auto-approved. Used in combination with
             * `autoApproveBillsGracePeriodUnit` parameter.
             *
             * **Note:** When used in combination with `autoApproveBillsGracePeriodUnit` enables
             * auto-approval of Bills for Organization, which occurs when the specified time period
             * has elapsed after Bill generation.
             */
            fun autoApproveBillsGracePeriod(autoApproveBillsGracePeriod: Long) =
                autoApproveBillsGracePeriod(JsonField.of(autoApproveBillsGracePeriod))

            /**
             * Sets [Builder.autoApproveBillsGracePeriod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoApproveBillsGracePeriod] with a well-typed
             * [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun autoApproveBillsGracePeriod(autoApproveBillsGracePeriod: JsonField<Long>) = apply {
                this.autoApproveBillsGracePeriod = autoApproveBillsGracePeriod
            }

            /**
             * Time unit of grace period before bills are auto-approved. Used in combination with
             * `autoApproveBillsGracePeriod` parameter. Allowed options are MINUTES, HOURS, or DAYS.
             *
             * **Note:** When used in combination with `autoApproveBillsGracePeriod` enables
             * auto-approval of Bills for Organization, which occurs when the specified time period
             * has elapsed after Bill generation.
             */
            fun autoApproveBillsGracePeriodUnit(autoApproveBillsGracePeriodUnit: String) =
                autoApproveBillsGracePeriodUnit(JsonField.of(autoApproveBillsGracePeriodUnit))

            /**
             * Sets [Builder.autoApproveBillsGracePeriodUnit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoApproveBillsGracePeriodUnit] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun autoApproveBillsGracePeriodUnit(
                autoApproveBillsGracePeriodUnit: JsonField<String>
            ) = apply { this.autoApproveBillsGracePeriodUnit = autoApproveBillsGracePeriodUnit }

            /**
             * Specify whether to auto-generate statements once Bills are _approved_ or _locked_. It
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
             * Sets [Builder.autoGenerateStatementMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoGenerateStatementMode] with a well-typed
             * [AutoGenerateStatementMode] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun autoGenerateStatementMode(
                autoGenerateStatementMode: JsonField<AutoGenerateStatementMode>
            ) = apply { this.autoGenerateStatementMode = autoGenerateStatementMode }

            /**
             * Prefix to be used for sequential invoice numbers. This will be combined with the
             * `sequenceStartNumber`.
             *
             * **NOTES:**
             * - If you do not define a `billPrefix`, a default will be used in the Console for the
             *   Bill **REFERENCE** number. This default will concatenate **INV-** with the last
             *   four characters of the `billId`.
             * - If you do not define a `billPrefix`, the Bill response schema for API calls that
             *   retrieve Bill data will not contain a `sequentialInvoiceNumber`.
             */
            fun billPrefix(billPrefix: String) = billPrefix(JsonField.of(billPrefix))

            /**
             * Sets [Builder.billPrefix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billPrefix] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billPrefix(billPrefix: JsonField<String>) = apply { this.billPrefix = billPrefix }

            /**
             * Boolean setting to specify whether commitments _(prepayments)_ are billed in advance
             * at the start of each billing period, or billed in arrears at the end of each billing
             * period.
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

            /**
             * Boolean setting to consolidate different billing frequencies onto the same bill.
             * - **TRUE** - consolidate different billing frequencies onto the same bill.
             * - **FALSE** - bills are not consolidated.
             */
            fun consolidateBills(consolidateBills: Boolean) =
                consolidateBills(JsonField.of(consolidateBills))

            /**
             * Sets [Builder.consolidateBills] to an arbitrary JSON value.
             *
             * You should usually call [Builder.consolidateBills] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun consolidateBills(consolidateBills: JsonField<Boolean>) = apply {
                this.consolidateBills = consolidateBills
            }

            /**
             * Define the order in which any Prepayment or Balance amounts on Accounts are to be
             * drawn-down against for billing. Four options:
             * - `"PREPAYMENT","BALANCE"`. Draw-down against Prepayment credit before Balance
             *   credit.
             * - `"BALANCE","PREPAYMENT"`. Draw-down against Balance credit before Prepayment
             *   credit.
             * - `"PREPAYMENT"`. Only draw-down against Prepayment credit.
             * - `"BALANCE"`. Only draw-down against Balance credit.
             *
             * **NOTES:**
             * - You can override this Organization-level setting for `creditApplicationOrder` at
             *   the level of an individual Account.
             * - If the Account belongs to a Parent/Child Account hierarchy, then the
             *   `creditApplicationOrder` settings are not available, and the draw-down order
             *   defaults always to Prepayment then Balance order.
             */
            fun creditApplicationOrder(creditApplicationOrder: List<CreditApplicationOrder>) =
                creditApplicationOrder(JsonField.of(creditApplicationOrder))

            /**
             * Sets [Builder.creditApplicationOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditApplicationOrder] with a well-typed
             * `List<CreditApplicationOrder>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun creditApplicationOrder(
                creditApplicationOrder: JsonField<List<CreditApplicationOrder>>
            ) = apply {
                this.creditApplicationOrder = creditApplicationOrder.map { it.toMutableList() }
            }

            /**
             * Adds a single [CreditApplicationOrder] to [Builder.creditApplicationOrder].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCreditApplicationOrder(creditApplicationOrder: CreditApplicationOrder) = apply {
                this.creditApplicationOrder =
                    (this.creditApplicationOrder ?: JsonField.of(mutableListOf())).also {
                        checkKnown("creditApplicationOrder", it).add(creditApplicationOrder)
                    }
            }

            /**
             * Define currency conversion rates from _pricing currency_ to _billing currency_:
             * - You can use the `currency` request parameter with this call to define the billing
             *   currency for your Organization - see above.
             * - You can also define a billing currency at the individual Account level and this
             *   will override the Organization billing currency.
             * - A Plan used to set Product consumption charge rates on an Account might use a
             *   different pricing currency. At billing, charges are calculated in the pricing
             *   currency and then converted into billing currency amounts to appear on Bills. If
             *   you haven't defined a currency conversion rate from pricing to billing currency,
             *   billing will fail for the Account.
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
             * Organization level default `statementDefinitionId` to be used when there is no
             * statement definition linked to the account.
             *
             * Statement definitions are used to generate bill statements, which are informative
             * backing sheets to invoices.
             */
            fun defaultStatementDefinitionId(defaultStatementDefinitionId: String) =
                defaultStatementDefinitionId(JsonField.of(defaultStatementDefinitionId))

            /**
             * Sets [Builder.defaultStatementDefinitionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultStatementDefinitionId] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun defaultStatementDefinitionId(defaultStatementDefinitionId: JsonField<String>) =
                apply {
                    this.defaultStatementDefinitionId = defaultStatementDefinitionId
                }

            /**
             * Date to use for the invoice date. Allowed values are `FIRST_DAY_OF_NEXT_PERIOD` or
             * `LAST_DAY_OF_ARREARS`.
             */
            fun externalInvoiceDate(externalInvoiceDate: String) =
                externalInvoiceDate(JsonField.of(externalInvoiceDate))

            /**
             * Sets [Builder.externalInvoiceDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalInvoiceDate] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun externalInvoiceDate(externalInvoiceDate: JsonField<String>) = apply {
                this.externalInvoiceDate = externalInvoiceDate
            }

            /**
             * Boolean setting to specify whether minimum spend amounts are billed in advance at the
             * start of each billing period, or billed in arrears at the end of each billing period.
             * - **TRUE** - bill in advance _(start of each billing period)_.
             * - **FALSE** - bill in arrears _(end of each billing period)_.
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

            /**
             * Sets the required interval for updating bills. It is an optional parameter that can
             * be set as:
             * - **For portions of an hour (minutes)**. Two options: **0.25** (15 minutes) and
             *   **0.5** (30 minutes).
             * - **For full hours.** Enter **1** for every hour, **2** for every two hours, and so
             *   on. Eight options: **1**, **2**, **3**, **4**, **6**, **8**, **12**, or **24**.
             * - **Default.** The default is **0**, which disables scheduling.
             */
            fun scheduledBillInterval(scheduledBillInterval: Double) =
                scheduledBillInterval(JsonField.of(scheduledBillInterval))

            /**
             * Sets [Builder.scheduledBillInterval] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scheduledBillInterval] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun scheduledBillInterval(scheduledBillInterval: JsonField<Double>) = apply {
                this.scheduledBillInterval = scheduledBillInterval
            }

            /**
             * The starting number to be used for sequential invoice numbers. This will be combined
             * with the `billPrefix`.
             *
             * For example, if you define `billPrefix` to be **INVOICE-** and you set the
             * `seqenceStartNumber` as **100**, the first Bill created after updating your
             * Organization Configuration will have a `sequentialInvoiceNumber` assigned of
             * **INVOICE-101**. Subsequent Bills created will be numbered in time sequence for their
             * initial creation date/time.
             */
            fun sequenceStartNumber(sequenceStartNumber: Long) =
                sequenceStartNumber(JsonField.of(sequenceStartNumber))

            /**
             * Sets [Builder.sequenceStartNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sequenceStartNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sequenceStartNumber(sequenceStartNumber: JsonField<Long>) = apply {
                this.sequenceStartNumber = sequenceStartNumber
            }

            /**
             * Boolean setting to specify whether the standing charge is billed in advance at the
             * start of each billing period, or billed in arrears at the end of each billing period.
             * - **TRUE** - bill in advance _(start of each billing period)_.
             * - **FALSE** - bill in arrears _(end of each billing period)_.
             */
            fun standingChargeBillInAdvance(standingChargeBillInAdvance: Boolean) =
                standingChargeBillInAdvance(JsonField.of(standingChargeBillInAdvance))

            /**
             * Sets [Builder.standingChargeBillInAdvance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.standingChargeBillInAdvance] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun standingChargeBillInAdvance(standingChargeBillInAdvance: JsonField<Boolean>) =
                apply {
                    this.standingChargeBillInAdvance = standingChargeBillInAdvance
                }

            /**
             * Boolean setting that supresses generating bills that have no line items.
             * - **TRUE** - prevents generating bills with no line items.
             * - **FALSE** - bills are still generated even when they have no line items.
             */
            fun suppressedEmptyBills(suppressedEmptyBills: Boolean) =
                suppressedEmptyBills(JsonField.of(suppressedEmptyBills))

            /**
             * Sets [Builder.suppressedEmptyBills] to an arbitrary JSON value.
             *
             * You should usually call [Builder.suppressedEmptyBills] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun suppressedEmptyBills(suppressedEmptyBills: JsonField<Boolean>) = apply {
                this.suppressedEmptyBills = suppressedEmptyBills
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
             * .currency()
             * .dayEpoch()
             * .daysBeforeBillDue()
             * .monthEpoch()
             * .timezone()
             * .weekEpoch()
             * .yearEpoch()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("currency", currency),
                    checkRequired("dayEpoch", dayEpoch),
                    checkRequired("daysBeforeBillDue", daysBeforeBillDue),
                    checkRequired("monthEpoch", monthEpoch),
                    checkRequired("timezone", timezone),
                    checkRequired("weekEpoch", weekEpoch),
                    checkRequired("yearEpoch", yearEpoch),
                    autoApproveBillsGracePeriod,
                    autoApproveBillsGracePeriodUnit,
                    autoGenerateStatementMode,
                    billPrefix,
                    commitmentFeeBillInAdvance,
                    consolidateBills,
                    (creditApplicationOrder ?: JsonMissing.of()).map { it.toImmutable() },
                    (currencyConversions ?: JsonMissing.of()).map { it.toImmutable() },
                    defaultStatementDefinitionId,
                    externalInvoiceDate,
                    minimumSpendBillInAdvance,
                    scheduledBillInterval,
                    sequenceStartNumber,
                    standingChargeBillInAdvance,
                    suppressedEmptyBills,
                    version,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            currency()
            dayEpoch()
            daysBeforeBillDue()
            monthEpoch()
            timezone()
            weekEpoch()
            yearEpoch()
            autoApproveBillsGracePeriod()
            autoApproveBillsGracePeriodUnit()
            autoGenerateStatementMode().ifPresent { it.validate() }
            billPrefix()
            commitmentFeeBillInAdvance()
            consolidateBills()
            creditApplicationOrder().ifPresent { it.forEach { it.validate() } }
            currencyConversions().ifPresent { it.forEach { it.validate() } }
            defaultStatementDefinitionId()
            externalInvoiceDate()
            minimumSpendBillInAdvance()
            scheduledBillInterval()
            sequenceStartNumber()
            standingChargeBillInAdvance()
            suppressedEmptyBills()
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
            (if (currency.asKnown().isPresent) 1 else 0) +
                (if (dayEpoch.asKnown().isPresent) 1 else 0) +
                (if (daysBeforeBillDue.asKnown().isPresent) 1 else 0) +
                (if (monthEpoch.asKnown().isPresent) 1 else 0) +
                (if (timezone.asKnown().isPresent) 1 else 0) +
                (if (weekEpoch.asKnown().isPresent) 1 else 0) +
                (if (yearEpoch.asKnown().isPresent) 1 else 0) +
                (if (autoApproveBillsGracePeriod.asKnown().isPresent) 1 else 0) +
                (if (autoApproveBillsGracePeriodUnit.asKnown().isPresent) 1 else 0) +
                (autoGenerateStatementMode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (billPrefix.asKnown().isPresent) 1 else 0) +
                (if (commitmentFeeBillInAdvance.asKnown().isPresent) 1 else 0) +
                (if (consolidateBills.asKnown().isPresent) 1 else 0) +
                (creditApplicationOrder.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (currencyConversions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (defaultStatementDefinitionId.asKnown().isPresent) 1 else 0) +
                (if (externalInvoiceDate.asKnown().isPresent) 1 else 0) +
                (if (minimumSpendBillInAdvance.asKnown().isPresent) 1 else 0) +
                (if (scheduledBillInterval.asKnown().isPresent) 1 else 0) +
                (if (sequenceStartNumber.asKnown().isPresent) 1 else 0) +
                (if (standingChargeBillInAdvance.asKnown().isPresent) 1 else 0) +
                (if (suppressedEmptyBills.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && currency == other.currency && dayEpoch == other.dayEpoch && daysBeforeBillDue == other.daysBeforeBillDue && monthEpoch == other.monthEpoch && timezone == other.timezone && weekEpoch == other.weekEpoch && yearEpoch == other.yearEpoch && autoApproveBillsGracePeriod == other.autoApproveBillsGracePeriod && autoApproveBillsGracePeriodUnit == other.autoApproveBillsGracePeriodUnit && autoGenerateStatementMode == other.autoGenerateStatementMode && billPrefix == other.billPrefix && commitmentFeeBillInAdvance == other.commitmentFeeBillInAdvance && consolidateBills == other.consolidateBills && creditApplicationOrder == other.creditApplicationOrder && currencyConversions == other.currencyConversions && defaultStatementDefinitionId == other.defaultStatementDefinitionId && externalInvoiceDate == other.externalInvoiceDate && minimumSpendBillInAdvance == other.minimumSpendBillInAdvance && scheduledBillInterval == other.scheduledBillInterval && sequenceStartNumber == other.sequenceStartNumber && standingChargeBillInAdvance == other.standingChargeBillInAdvance && suppressedEmptyBills == other.suppressedEmptyBills && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(currency, dayEpoch, daysBeforeBillDue, monthEpoch, timezone, weekEpoch, yearEpoch, autoApproveBillsGracePeriod, autoApproveBillsGracePeriodUnit, autoGenerateStatementMode, billPrefix, commitmentFeeBillInAdvance, consolidateBills, creditApplicationOrder, currencyConversions, defaultStatementDefinitionId, externalInvoiceDate, minimumSpendBillInAdvance, scheduledBillInterval, sequenceStartNumber, standingChargeBillInAdvance, suppressedEmptyBills, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{currency=$currency, dayEpoch=$dayEpoch, daysBeforeBillDue=$daysBeforeBillDue, monthEpoch=$monthEpoch, timezone=$timezone, weekEpoch=$weekEpoch, yearEpoch=$yearEpoch, autoApproveBillsGracePeriod=$autoApproveBillsGracePeriod, autoApproveBillsGracePeriodUnit=$autoApproveBillsGracePeriodUnit, autoGenerateStatementMode=$autoGenerateStatementMode, billPrefix=$billPrefix, commitmentFeeBillInAdvance=$commitmentFeeBillInAdvance, consolidateBills=$consolidateBills, creditApplicationOrder=$creditApplicationOrder, currencyConversions=$currencyConversions, defaultStatementDefinitionId=$defaultStatementDefinitionId, externalInvoiceDate=$externalInvoiceDate, minimumSpendBillInAdvance=$minimumSpendBillInAdvance, scheduledBillInterval=$scheduledBillInterval, sequenceStartNumber=$sequenceStartNumber, standingChargeBillInAdvance=$standingChargeBillInAdvance, suppressedEmptyBills=$suppressedEmptyBills, version=$version, additionalProperties=$additionalProperties}"
    }

    /**
     * Specify whether to auto-generate statements once Bills are _approved_ or _locked_. It will
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

        private var validated: Boolean = false

        fun validate(): AutoGenerateStatementMode = apply {
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

        private var validated: Boolean = false

        fun validate(): CreditApplicationOrder = apply {
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

            return /* spotless:off */ other is CreditApplicationOrder && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OrganizationConfigUpdateParams && orgId == other.orgId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "OrganizationConfigUpdateParams{orgId=$orgId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
