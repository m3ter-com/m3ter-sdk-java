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

class BillResponse
private constructor(
    private val id: JsonField<String>,
    private val version: JsonField<Long>,
    private val accountCode: JsonField<String>,
    private val accountId: JsonField<String>,
    private val billDate: JsonField<LocalDate>,
    private val billFrequencyInterval: JsonField<Long>,
    private val billingFrequency: JsonField<BillingFrequency>,
    private val billJobId: JsonField<String>,
    private val billTotal: JsonField<Double>,
    private val createdBy: JsonField<String>,
    private val createdDate: JsonField<OffsetDateTime>,
    private val csvStatementGenerated: JsonField<Boolean>,
    private val currency: JsonField<String>,
    private val currencyConversions: JsonField<List<CurrencyConversion>>,
    private val dtCreated: JsonField<OffsetDateTime>,
    private val dtLastModified: JsonField<OffsetDateTime>,
    private val dueDate: JsonField<LocalDate>,
    private val endDate: JsonField<LocalDate>,
    private val endDateTimeUtc: JsonField<OffsetDateTime>,
    private val externalInvoiceDate: JsonField<LocalDate>,
    private val externalInvoiceReference: JsonField<String>,
    private val jsonStatementGenerated: JsonField<Boolean>,
    private val lastCalculatedDate: JsonField<OffsetDateTime>,
    private val lastModifiedBy: JsonField<String>,
    private val lineItems: JsonField<List<LineItem>>,
    private val locked: JsonField<Boolean>,
    private val purchaseOrderNumber: JsonField<String>,
    private val sequentialInvoiceNumber: JsonField<String>,
    private val startDate: JsonField<LocalDate>,
    private val startDateTimeUtc: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val timezone: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("accountCode")
        @ExcludeMissing
        accountCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accountId") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billDate") @ExcludeMissing billDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("billFrequencyInterval")
        @ExcludeMissing
        billFrequencyInterval: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("billingFrequency")
        @ExcludeMissing
        billingFrequency: JsonField<BillingFrequency> = JsonMissing.of(),
        @JsonProperty("billJobId") @ExcludeMissing billJobId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billTotal") @ExcludeMissing billTotal: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdDate")
        @ExcludeMissing
        createdDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("csvStatementGenerated")
        @ExcludeMissing
        csvStatementGenerated: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currencyConversions")
        @ExcludeMissing
        currencyConversions: JsonField<List<CurrencyConversion>> = JsonMissing.of(),
        @JsonProperty("dtCreated")
        @ExcludeMissing
        dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dueDate") @ExcludeMissing dueDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("endDate") @ExcludeMissing endDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("endDateTimeUTC")
        @ExcludeMissing
        endDateTimeUtc: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("externalInvoiceDate")
        @ExcludeMissing
        externalInvoiceDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("externalInvoiceReference")
        @ExcludeMissing
        externalInvoiceReference: JsonField<String> = JsonMissing.of(),
        @JsonProperty("jsonStatementGenerated")
        @ExcludeMissing
        jsonStatementGenerated: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lastCalculatedDate")
        @ExcludeMissing
        lastCalculatedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        lastModifiedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lineItems")
        @ExcludeMissing
        lineItems: JsonField<List<LineItem>> = JsonMissing.of(),
        @JsonProperty("locked") @ExcludeMissing locked: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("purchaseOrderNumber")
        @ExcludeMissing
        purchaseOrderNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sequentialInvoiceNumber")
        @ExcludeMissing
        sequentialInvoiceNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("startDate")
        @ExcludeMissing
        startDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("startDateTimeUTC")
        @ExcludeMissing
        startDateTimeUtc: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("timezone") @ExcludeMissing timezone: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        version,
        accountCode,
        accountId,
        billDate,
        billFrequencyInterval,
        billingFrequency,
        billJobId,
        billTotal,
        createdBy,
        createdDate,
        csvStatementGenerated,
        currency,
        currencyConversions,
        dtCreated,
        dtLastModified,
        dueDate,
        endDate,
        endDateTimeUtc,
        externalInvoiceDate,
        externalInvoiceReference,
        jsonStatementGenerated,
        lastCalculatedDate,
        lastModifiedBy,
        lineItems,
        locked,
        purchaseOrderNumber,
        sequentialInvoiceNumber,
        startDate,
        startDateTimeUtc,
        status,
        timezone,
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
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountCode(): Optional<String> =
        Optional.ofNullable(accountCode.getNullable("accountCode"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountId(): Optional<String> = Optional.ofNullable(accountId.getNullable("accountId"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billDate(): Optional<LocalDate> = Optional.ofNullable(billDate.getNullable("billDate"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billFrequencyInterval(): Optional<Long> =
        Optional.ofNullable(billFrequencyInterval.getNullable("billFrequencyInterval"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingFrequency(): Optional<BillingFrequency> =
        Optional.ofNullable(billingFrequency.getNullable("billingFrequency"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billJobId(): Optional<String> = Optional.ofNullable(billJobId.getNullable("billJobId"))

    /**
     * The sum total for the Bill.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billTotal(): Optional<Double> = Optional.ofNullable(billTotal.getNullable("billTotal"))

    /**
     * The unique identifier (UUID) for the user who created the Bill.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdDate(): Optional<OffsetDateTime> =
        Optional.ofNullable(createdDate.getNullable("createdDate"))

    /**
     * Flag to indicate that the statement in CSV format has been generated for the Bill.
     * - **TRUE** - CSV statement has been generated.
     * - **FALSE** - no CSV statement generated.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun csvStatementGenerated(): Optional<Boolean> =
        Optional.ofNullable(csvStatementGenerated.getNullable("csvStatementGenerated"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencyConversions(): Optional<List<CurrencyConversion>> =
        Optional.ofNullable(currencyConversions.getNullable("currencyConversions"))

    /**
     * The date and time _(in ISO 8601 format)_ when the Bill was first created.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /**
     * The date and time _(in ISO 8601 format)_ when the Bill was last modified.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dueDate(): Optional<LocalDate> = Optional.ofNullable(dueDate.getNullable("dueDate"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endDate(): Optional<LocalDate> = Optional.ofNullable(endDate.getNullable("endDate"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endDateTimeUtc(): Optional<OffsetDateTime> =
        Optional.ofNullable(endDateTimeUtc.getNullable("endDateTimeUTC"))

    /**
     * For accounting purposes, the date set at Organization level to use for external invoicing
     * with respect to billing periods - two options:
     * - `FIRST_DAY_OF_NEXT_PERIOD` _(Default)_.
     * - `LAST_DAY_OF_ARREARS`
     *
     * For example, if the retrieved Bill was on a monthly billing frequency and the billing period
     * for the Bill is September 2023 and the _External invoice date_ is set at
     * `FIRST_DAY_OF_NEXT_PERIOD`, then the `externalInvoiceDate` will be `"2023-10-01"`.
     *
     * **NOTE:** To change the `externalInvoiceDate` setting for your Organization, you can use the
     * [Update OrganizationConfig](https://www.m3ter.com/docs/api#tag/OrganizationConfig/operation/GetOrganizationConfig)
     * call.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalInvoiceDate(): Optional<LocalDate> =
        Optional.ofNullable(externalInvoiceDate.getNullable("externalInvoiceDate"))

    /**
     * The reference ID to use for external invoice.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalInvoiceReference(): Optional<String> =
        Optional.ofNullable(externalInvoiceReference.getNullable("externalInvoiceReference"))

    /**
     * Flag to indicate that the statement in JSON format has been generated for the Bill.
     * - **TRUE** - JSON statement has been generated.
     * - **FALSE** - no JSON statement generated.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jsonStatementGenerated(): Optional<Boolean> =
        Optional.ofNullable(jsonStatementGenerated.getNullable("jsonStatementGenerated"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastCalculatedDate(): Optional<OffsetDateTime> =
        Optional.ofNullable(lastCalculatedDate.getNullable("lastCalculatedDate"))

    /**
     * The unique identifier (UUID) for the user who last modified this Bill.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /**
     * An array of the Bill line items.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lineItems(): Optional<List<LineItem>> =
        Optional.ofNullable(lineItems.getNullable("lineItems"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locked(): Optional<Boolean> = Optional.ofNullable(locked.getNullable("locked"))

    /**
     * Purchase Order number linked to the Account the Bill is for.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun purchaseOrderNumber(): Optional<String> =
        Optional.ofNullable(purchaseOrderNumber.getNullable("purchaseOrderNumber"))

    /**
     * The sequential invoice number of the Bill.
     *
     * **NOTE:** If you have not defined a `billPrefix` for your Organization, a
     * `sequentialInvoiceNumber` is not returned in the response. See
     * [Update OrganizationConfig](https://www.m3ter.com/docs/api#tag/OrganizationConfig/operation/UpdateOrganizationConfig)
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sequentialInvoiceNumber(): Optional<String> =
        Optional.ofNullable(sequentialInvoiceNumber.getNullable("sequentialInvoiceNumber"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startDate(): Optional<LocalDate> = Optional.ofNullable(startDate.getNullable("startDate"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startDateTimeUtc(): Optional<OffsetDateTime> =
        Optional.ofNullable(startDateTimeUtc.getNullable("startDateTimeUTC"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timezone(): Optional<String> = Optional.ofNullable(timezone.getNullable("timezone"))

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
     * Returns the raw JSON value of [accountCode].
     *
     * Unlike [accountCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountCode") @ExcludeMissing fun _accountCode(): JsonField<String> = accountCode

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

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
    fun _billFrequencyInterval(): JsonField<Long> = billFrequencyInterval

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
     * Returns the raw JSON value of [billJobId].
     *
     * Unlike [billJobId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billJobId") @ExcludeMissing fun _billJobId(): JsonField<String> = billJobId

    /**
     * Returns the raw JSON value of [billTotal].
     *
     * Unlike [billTotal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billTotal") @ExcludeMissing fun _billTotal(): JsonField<Double> = billTotal

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [createdDate].
     *
     * Unlike [createdDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdDate")
    @ExcludeMissing
    fun _createdDate(): JsonField<OffsetDateTime> = createdDate

    /**
     * Returns the raw JSON value of [csvStatementGenerated].
     *
     * Unlike [csvStatementGenerated], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("csvStatementGenerated")
    @ExcludeMissing
    fun _csvStatementGenerated(): JsonField<Boolean> = csvStatementGenerated

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

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
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<LocalDate> = endDate

    /**
     * Returns the raw JSON value of [endDateTimeUtc].
     *
     * Unlike [endDateTimeUtc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endDateTimeUTC")
    @ExcludeMissing
    fun _endDateTimeUtc(): JsonField<OffsetDateTime> = endDateTimeUtc

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
     * Returns the raw JSON value of [externalInvoiceReference].
     *
     * Unlike [externalInvoiceReference], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("externalInvoiceReference")
    @ExcludeMissing
    fun _externalInvoiceReference(): JsonField<String> = externalInvoiceReference

    /**
     * Returns the raw JSON value of [jsonStatementGenerated].
     *
     * Unlike [jsonStatementGenerated], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("jsonStatementGenerated")
    @ExcludeMissing
    fun _jsonStatementGenerated(): JsonField<Boolean> = jsonStatementGenerated

    /**
     * Returns the raw JSON value of [lastCalculatedDate].
     *
     * Unlike [lastCalculatedDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("lastCalculatedDate")
    @ExcludeMissing
    fun _lastCalculatedDate(): JsonField<OffsetDateTime> = lastCalculatedDate

    /**
     * Returns the raw JSON value of [lastModifiedBy].
     *
     * Unlike [lastModifiedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /**
     * Returns the raw JSON value of [lineItems].
     *
     * Unlike [lineItems], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lineItems")
    @ExcludeMissing
    fun _lineItems(): JsonField<List<LineItem>> = lineItems

    /**
     * Returns the raw JSON value of [locked].
     *
     * Unlike [locked], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locked") @ExcludeMissing fun _locked(): JsonField<Boolean> = locked

    /**
     * Returns the raw JSON value of [purchaseOrderNumber].
     *
     * Unlike [purchaseOrderNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("purchaseOrderNumber")
    @ExcludeMissing
    fun _purchaseOrderNumber(): JsonField<String> = purchaseOrderNumber

    /**
     * Returns the raw JSON value of [sequentialInvoiceNumber].
     *
     * Unlike [sequentialInvoiceNumber], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("sequentialInvoiceNumber")
    @ExcludeMissing
    fun _sequentialInvoiceNumber(): JsonField<String> = sequentialInvoiceNumber

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startDate") @ExcludeMissing fun _startDate(): JsonField<LocalDate> = startDate

    /**
     * Returns the raw JSON value of [startDateTimeUtc].
     *
     * Unlike [startDateTimeUtc], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("startDateTimeUTC")
    @ExcludeMissing
    fun _startDateTimeUtc(): JsonField<OffsetDateTime> = startDateTimeUtc

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [timezone].
     *
     * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<String> = timezone

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
         * Returns a mutable builder for constructing an instance of [BillResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BillResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var accountCode: JsonField<String> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var billDate: JsonField<LocalDate> = JsonMissing.of()
        private var billFrequencyInterval: JsonField<Long> = JsonMissing.of()
        private var billingFrequency: JsonField<BillingFrequency> = JsonMissing.of()
        private var billJobId: JsonField<String> = JsonMissing.of()
        private var billTotal: JsonField<Double> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var createdDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var csvStatementGenerated: JsonField<Boolean> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var currencyConversions: JsonField<MutableList<CurrencyConversion>>? = null
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dueDate: JsonField<LocalDate> = JsonMissing.of()
        private var endDate: JsonField<LocalDate> = JsonMissing.of()
        private var endDateTimeUtc: JsonField<OffsetDateTime> = JsonMissing.of()
        private var externalInvoiceDate: JsonField<LocalDate> = JsonMissing.of()
        private var externalInvoiceReference: JsonField<String> = JsonMissing.of()
        private var jsonStatementGenerated: JsonField<Boolean> = JsonMissing.of()
        private var lastCalculatedDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var lineItems: JsonField<MutableList<LineItem>>? = null
        private var locked: JsonField<Boolean> = JsonMissing.of()
        private var purchaseOrderNumber: JsonField<String> = JsonMissing.of()
        private var sequentialInvoiceNumber: JsonField<String> = JsonMissing.of()
        private var startDate: JsonField<LocalDate> = JsonMissing.of()
        private var startDateTimeUtc: JsonField<OffsetDateTime> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var timezone: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(billResponse: BillResponse) = apply {
            id = billResponse.id
            version = billResponse.version
            accountCode = billResponse.accountCode
            accountId = billResponse.accountId
            billDate = billResponse.billDate
            billFrequencyInterval = billResponse.billFrequencyInterval
            billingFrequency = billResponse.billingFrequency
            billJobId = billResponse.billJobId
            billTotal = billResponse.billTotal
            createdBy = billResponse.createdBy
            createdDate = billResponse.createdDate
            csvStatementGenerated = billResponse.csvStatementGenerated
            currency = billResponse.currency
            currencyConversions = billResponse.currencyConversions.map { it.toMutableList() }
            dtCreated = billResponse.dtCreated
            dtLastModified = billResponse.dtLastModified
            dueDate = billResponse.dueDate
            endDate = billResponse.endDate
            endDateTimeUtc = billResponse.endDateTimeUtc
            externalInvoiceDate = billResponse.externalInvoiceDate
            externalInvoiceReference = billResponse.externalInvoiceReference
            jsonStatementGenerated = billResponse.jsonStatementGenerated
            lastCalculatedDate = billResponse.lastCalculatedDate
            lastModifiedBy = billResponse.lastModifiedBy
            lineItems = billResponse.lineItems.map { it.toMutableList() }
            locked = billResponse.locked
            purchaseOrderNumber = billResponse.purchaseOrderNumber
            sequentialInvoiceNumber = billResponse.sequentialInvoiceNumber
            startDate = billResponse.startDate
            startDateTimeUtc = billResponse.startDateTimeUtc
            status = billResponse.status
            timezone = billResponse.timezone
            additionalProperties = billResponse.additionalProperties.toMutableMap()
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

        fun accountCode(accountCode: String) = accountCode(JsonField.of(accountCode))

        /**
         * Sets [Builder.accountCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountCode(accountCode: JsonField<String>) = apply { this.accountCode = accountCode }

        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        fun billDate(billDate: LocalDate) = billDate(JsonField.of(billDate))

        /**
         * Sets [Builder.billDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun billDate(billDate: JsonField<LocalDate>) = apply { this.billDate = billDate }

        fun billFrequencyInterval(billFrequencyInterval: Long) =
            billFrequencyInterval(JsonField.of(billFrequencyInterval))

        /**
         * Sets [Builder.billFrequencyInterval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billFrequencyInterval] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billFrequencyInterval(billFrequencyInterval: JsonField<Long>) = apply {
            this.billFrequencyInterval = billFrequencyInterval
        }

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

        fun billJobId(billJobId: String) = billJobId(JsonField.of(billJobId))

        /**
         * Sets [Builder.billJobId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billJobId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun billJobId(billJobId: JsonField<String>) = apply { this.billJobId = billJobId }

        /** The sum total for the Bill. */
        fun billTotal(billTotal: Double) = billTotal(JsonField.of(billTotal))

        /**
         * Sets [Builder.billTotal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billTotal] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun billTotal(billTotal: JsonField<Double>) = apply { this.billTotal = billTotal }

        /** The unique identifier (UUID) for the user who created the Bill. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        fun createdDate(createdDate: OffsetDateTime) = createdDate(JsonField.of(createdDate))

        /**
         * Sets [Builder.createdDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdDate(createdDate: JsonField<OffsetDateTime>) = apply {
            this.createdDate = createdDate
        }

        /**
         * Flag to indicate that the statement in CSV format has been generated for the Bill.
         * - **TRUE** - CSV statement has been generated.
         * - **FALSE** - no CSV statement generated.
         */
        fun csvStatementGenerated(csvStatementGenerated: Boolean) =
            csvStatementGenerated(JsonField.of(csvStatementGenerated))

        /**
         * Sets [Builder.csvStatementGenerated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.csvStatementGenerated] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun csvStatementGenerated(csvStatementGenerated: JsonField<Boolean>) = apply {
            this.csvStatementGenerated = csvStatementGenerated
        }

        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

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

        /** The date and time _(in ISO 8601 format)_ when the Bill was first created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /**
         * Sets [Builder.dtCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The date and time _(in ISO 8601 format)_ when the Bill was last modified. */
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

        fun dueDate(dueDate: LocalDate) = dueDate(JsonField.of(dueDate))

        /**
         * Sets [Builder.dueDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dueDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dueDate(dueDate: JsonField<LocalDate>) = apply { this.dueDate = dueDate }

        fun endDate(endDate: LocalDate) = endDate(JsonField.of(endDate))

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endDate(endDate: JsonField<LocalDate>) = apply { this.endDate = endDate }

        fun endDateTimeUtc(endDateTimeUtc: OffsetDateTime) =
            endDateTimeUtc(JsonField.of(endDateTimeUtc))

        /**
         * Sets [Builder.endDateTimeUtc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDateTimeUtc] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDateTimeUtc(endDateTimeUtc: JsonField<OffsetDateTime>) = apply {
            this.endDateTimeUtc = endDateTimeUtc
        }

        /**
         * For accounting purposes, the date set at Organization level to use for external invoicing
         * with respect to billing periods - two options:
         * - `FIRST_DAY_OF_NEXT_PERIOD` _(Default)_.
         * - `LAST_DAY_OF_ARREARS`
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

        /** The reference ID to use for external invoice. */
        fun externalInvoiceReference(externalInvoiceReference: String) =
            externalInvoiceReference(JsonField.of(externalInvoiceReference))

        /**
         * Sets [Builder.externalInvoiceReference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalInvoiceReference] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun externalInvoiceReference(externalInvoiceReference: JsonField<String>) = apply {
            this.externalInvoiceReference = externalInvoiceReference
        }

        /**
         * Flag to indicate that the statement in JSON format has been generated for the Bill.
         * - **TRUE** - JSON statement has been generated.
         * - **FALSE** - no JSON statement generated.
         */
        fun jsonStatementGenerated(jsonStatementGenerated: Boolean) =
            jsonStatementGenerated(JsonField.of(jsonStatementGenerated))

        /**
         * Sets [Builder.jsonStatementGenerated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jsonStatementGenerated] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun jsonStatementGenerated(jsonStatementGenerated: JsonField<Boolean>) = apply {
            this.jsonStatementGenerated = jsonStatementGenerated
        }

        fun lastCalculatedDate(lastCalculatedDate: OffsetDateTime) =
            lastCalculatedDate(JsonField.of(lastCalculatedDate))

        /**
         * Sets [Builder.lastCalculatedDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastCalculatedDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lastCalculatedDate(lastCalculatedDate: JsonField<OffsetDateTime>) = apply {
            this.lastCalculatedDate = lastCalculatedDate
        }

        /** The unique identifier (UUID) for the user who last modified this Bill. */
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

        /** An array of the Bill line items. */
        fun lineItems(lineItems: List<LineItem>) = lineItems(JsonField.of(lineItems))

        /**
         * Sets [Builder.lineItems] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lineItems] with a well-typed `List<LineItem>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lineItems(lineItems: JsonField<List<LineItem>>) = apply {
            this.lineItems = lineItems.map { it.toMutableList() }
        }

        /**
         * Adds a single [LineItem] to [lineItems].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLineItem(lineItem: LineItem) = apply {
            lineItems =
                (lineItems ?: JsonField.of(mutableListOf())).also {
                    checkKnown("lineItems", it).add(lineItem)
                }
        }

        fun locked(locked: Boolean) = locked(JsonField.of(locked))

        /**
         * Sets [Builder.locked] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locked] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun locked(locked: JsonField<Boolean>) = apply { this.locked = locked }

        /** Purchase Order number linked to the Account the Bill is for. */
        fun purchaseOrderNumber(purchaseOrderNumber: String) =
            purchaseOrderNumber(JsonField.of(purchaseOrderNumber))

        /**
         * Sets [Builder.purchaseOrderNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.purchaseOrderNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun purchaseOrderNumber(purchaseOrderNumber: JsonField<String>) = apply {
            this.purchaseOrderNumber = purchaseOrderNumber
        }

        /**
         * The sequential invoice number of the Bill.
         *
         * **NOTE:** If you have not defined a `billPrefix` for your Organization, a
         * `sequentialInvoiceNumber` is not returned in the response. See
         * [Update OrganizationConfig](https://www.m3ter.com/docs/api#tag/OrganizationConfig/operation/UpdateOrganizationConfig)
         */
        fun sequentialInvoiceNumber(sequentialInvoiceNumber: String) =
            sequentialInvoiceNumber(JsonField.of(sequentialInvoiceNumber))

        /**
         * Sets [Builder.sequentialInvoiceNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sequentialInvoiceNumber] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun sequentialInvoiceNumber(sequentialInvoiceNumber: JsonField<String>) = apply {
            this.sequentialInvoiceNumber = sequentialInvoiceNumber
        }

        fun startDate(startDate: LocalDate) = startDate(JsonField.of(startDate))

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startDate(startDate: JsonField<LocalDate>) = apply { this.startDate = startDate }

        fun startDateTimeUtc(startDateTimeUtc: OffsetDateTime) =
            startDateTimeUtc(JsonField.of(startDateTimeUtc))

        /**
         * Sets [Builder.startDateTimeUtc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDateTimeUtc] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun startDateTimeUtc(startDateTimeUtc: JsonField<OffsetDateTime>) = apply {
            this.startDateTimeUtc = startDateTimeUtc
        }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun timezone(timezone: String) = timezone(JsonField.of(timezone))

        /**
         * Sets [Builder.timezone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timezone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

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
         * Returns an immutable instance of [BillResponse].
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
        fun build(): BillResponse =
            BillResponse(
                checkRequired("id", id),
                checkRequired("version", version),
                accountCode,
                accountId,
                billDate,
                billFrequencyInterval,
                billingFrequency,
                billJobId,
                billTotal,
                createdBy,
                createdDate,
                csvStatementGenerated,
                currency,
                (currencyConversions ?: JsonMissing.of()).map { it.toImmutable() },
                dtCreated,
                dtLastModified,
                dueDate,
                endDate,
                endDateTimeUtc,
                externalInvoiceDate,
                externalInvoiceReference,
                jsonStatementGenerated,
                lastCalculatedDate,
                lastModifiedBy,
                (lineItems ?: JsonMissing.of()).map { it.toImmutable() },
                locked,
                purchaseOrderNumber,
                sequentialInvoiceNumber,
                startDate,
                startDateTimeUtc,
                status,
                timezone,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BillResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        version()
        accountCode()
        accountId()
        billDate()
        billFrequencyInterval()
        billingFrequency().ifPresent { it.validate() }
        billJobId()
        billTotal()
        createdBy()
        createdDate()
        csvStatementGenerated()
        currency()
        currencyConversions().ifPresent { it.forEach { it.validate() } }
        dtCreated()
        dtLastModified()
        dueDate()
        endDate()
        endDateTimeUtc()
        externalInvoiceDate()
        externalInvoiceReference()
        jsonStatementGenerated()
        lastCalculatedDate()
        lastModifiedBy()
        lineItems().ifPresent { it.forEach { it.validate() } }
        locked()
        purchaseOrderNumber()
        sequentialInvoiceNumber()
        startDate()
        startDateTimeUtc()
        status().ifPresent { it.validate() }
        timezone()
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
            (if (accountCode.asKnown().isPresent) 1 else 0) +
            (if (accountId.asKnown().isPresent) 1 else 0) +
            (if (billDate.asKnown().isPresent) 1 else 0) +
            (if (billFrequencyInterval.asKnown().isPresent) 1 else 0) +
            (billingFrequency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (billJobId.asKnown().isPresent) 1 else 0) +
            (if (billTotal.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (createdDate.asKnown().isPresent) 1 else 0) +
            (if (csvStatementGenerated.asKnown().isPresent) 1 else 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (currencyConversions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (dtCreated.asKnown().isPresent) 1 else 0) +
            (if (dtLastModified.asKnown().isPresent) 1 else 0) +
            (if (dueDate.asKnown().isPresent) 1 else 0) +
            (if (endDate.asKnown().isPresent) 1 else 0) +
            (if (endDateTimeUtc.asKnown().isPresent) 1 else 0) +
            (if (externalInvoiceDate.asKnown().isPresent) 1 else 0) +
            (if (externalInvoiceReference.asKnown().isPresent) 1 else 0) +
            (if (jsonStatementGenerated.asKnown().isPresent) 1 else 0) +
            (if (lastCalculatedDate.asKnown().isPresent) 1 else 0) +
            (if (lastModifiedBy.asKnown().isPresent) 1 else 0) +
            (lineItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (locked.asKnown().isPresent) 1 else 0) +
            (if (purchaseOrderNumber.asKnown().isPresent) 1 else 0) +
            (if (sequentialInvoiceNumber.asKnown().isPresent) 1 else 0) +
            (if (startDate.asKnown().isPresent) 1 else 0) +
            (if (startDateTimeUtc.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (timezone.asKnown().isPresent) 1 else 0)

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

            @JvmField val MIXED = of("MIXED")

            @JvmStatic fun of(value: String) = BillingFrequency(JsonField.of(value))
        }

        /** An enum containing [BillingFrequency]'s known values. */
        enum class Known {
            DAILY,
            WEEKLY,
            MONTHLY,
            ANNUALLY,
            AD_HOC,
            MIXED,
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
            MIXED,
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
                MIXED -> Value.MIXED
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
                MIXED -> Known.MIXED
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

            return /* spotless:off */ other is BillingFrequency && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class LineItem
    private constructor(
        private val averageUnitPrice: JsonField<Double>,
        private val conversionRate: JsonField<Double>,
        private val convertedSubtotal: JsonField<Double>,
        private val currency: JsonField<String>,
        private val description: JsonField<String>,
        private val lineItemType: JsonField<LineItemType>,
        private val quantity: JsonField<Double>,
        private val subtotal: JsonField<Double>,
        private val unit: JsonField<String>,
        private val units: JsonField<Double>,
        private val id: JsonField<String>,
        private val aggregationId: JsonField<String>,
        private val balanceId: JsonField<String>,
        private val chargeId: JsonField<String>,
        private val childAccountCode: JsonField<String>,
        private val childAccountId: JsonField<String>,
        private val commitmentId: JsonField<String>,
        private val compoundAggregationId: JsonField<String>,
        private val contractId: JsonField<String>,
        private val counterId: JsonField<String>,
        private val creditTypeId: JsonField<String>,
        private val group: JsonField<Group>,
        private val meterId: JsonField<String>,
        private val planGroupId: JsonField<String>,
        private val planId: JsonField<String>,
        private val pricingId: JsonField<String>,
        private val productCode: JsonField<String>,
        private val productId: JsonField<String>,
        private val productName: JsonField<String>,
        private val reasonId: JsonField<String>,
        private val referencedBillId: JsonField<String>,
        private val referencedLineItemId: JsonField<String>,
        private val segment: JsonField<Segment>,
        private val sequenceNumber: JsonField<Long>,
        private val servicePeriodEndDate: JsonField<OffsetDateTime>,
        private val servicePeriodStartDate: JsonField<OffsetDateTime>,
        private val usagePerPricingBand: JsonField<List<UsagePerPricingBand>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("averageUnitPrice")
            @ExcludeMissing
            averageUnitPrice: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("conversionRate")
            @ExcludeMissing
            conversionRate: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("convertedSubtotal")
            @ExcludeMissing
            convertedSubtotal: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lineItemType")
            @ExcludeMissing
            lineItemType: JsonField<LineItemType> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            quantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("subtotal")
            @ExcludeMissing
            subtotal: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("unit") @ExcludeMissing unit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("units") @ExcludeMissing units: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aggregationId")
            @ExcludeMissing
            aggregationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("balanceId")
            @ExcludeMissing
            balanceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("chargeId")
            @ExcludeMissing
            chargeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("childAccountCode")
            @ExcludeMissing
            childAccountCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("childAccountId")
            @ExcludeMissing
            childAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("commitmentId")
            @ExcludeMissing
            commitmentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("compoundAggregationId")
            @ExcludeMissing
            compoundAggregationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contractId")
            @ExcludeMissing
            contractId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("counterId")
            @ExcludeMissing
            counterId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("creditTypeId")
            @ExcludeMissing
            creditTypeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("group") @ExcludeMissing group: JsonField<Group> = JsonMissing.of(),
            @JsonProperty("meterId") @ExcludeMissing meterId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("planGroupId")
            @ExcludeMissing
            planGroupId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("planId") @ExcludeMissing planId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pricingId")
            @ExcludeMissing
            pricingId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("productCode")
            @ExcludeMissing
            productCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("productId")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("productName")
            @ExcludeMissing
            productName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reasonId")
            @ExcludeMissing
            reasonId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("referencedBillId")
            @ExcludeMissing
            referencedBillId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("referencedLineItemId")
            @ExcludeMissing
            referencedLineItemId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("segment") @ExcludeMissing segment: JsonField<Segment> = JsonMissing.of(),
            @JsonProperty("sequenceNumber")
            @ExcludeMissing
            sequenceNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("servicePeriodEndDate")
            @ExcludeMissing
            servicePeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("servicePeriodStartDate")
            @ExcludeMissing
            servicePeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("usagePerPricingBand")
            @ExcludeMissing
            usagePerPricingBand: JsonField<List<UsagePerPricingBand>> = JsonMissing.of(),
        ) : this(
            averageUnitPrice,
            conversionRate,
            convertedSubtotal,
            currency,
            description,
            lineItemType,
            quantity,
            subtotal,
            unit,
            units,
            id,
            aggregationId,
            balanceId,
            chargeId,
            childAccountCode,
            childAccountId,
            commitmentId,
            compoundAggregationId,
            contractId,
            counterId,
            creditTypeId,
            group,
            meterId,
            planGroupId,
            planId,
            pricingId,
            productCode,
            productId,
            productName,
            reasonId,
            referencedBillId,
            referencedLineItemId,
            segment,
            sequenceNumber,
            servicePeriodEndDate,
            servicePeriodStartDate,
            usagePerPricingBand,
            mutableMapOf(),
        )

        /**
         * The average unit price across all tiers / pricing bands.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun averageUnitPrice(): Double = averageUnitPrice.getRequired("averageUnitPrice")

        /**
         * The currency conversion rate if currency conversion is required for the line item.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun conversionRate(): Double = conversionRate.getRequired("conversionRate")

        /**
         * The converted subtotal amount if currency conversions have been used.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun convertedSubtotal(): Double = convertedSubtotal.getRequired("convertedSubtotal")

        /**
         * The currency code for the currency used in the line item. For example: USD, GBP, or EUR.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * Line item description.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun description(): String = description.getRequired("description")

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lineItemType(): LineItemType = lineItemType.getRequired("lineItemType")

        /**
         * The amount of usage for the line item.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun quantity(): Double = quantity.getRequired("quantity")

        /**
         * The subtotal amount for the line item, before any currency conversions.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subtotal(): Double = subtotal.getRequired("subtotal")

        /**
         * The unit for the usage data in thie line item. For example: **GB** of disk storage space.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun unit(): String = unit.getRequired("unit")

        /**
         * The number of units used for the line item.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun units(): Double = units.getRequired("units")

        /**
         * The UUID for the line item.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

        /**
         * The Aggregation ID used for the line item.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun aggregationId(): Optional<String> =
            Optional.ofNullable(aggregationId.getNullable("aggregationId"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun balanceId(): Optional<String> = Optional.ofNullable(balanceId.getNullable("balanceId"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun chargeId(): Optional<String> = Optional.ofNullable(chargeId.getNullable("chargeId"))

        /**
         * If part of a Parent/Child account billing hierarchy, this is the code for the child
         * Account.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun childAccountCode(): Optional<String> =
            Optional.ofNullable(childAccountCode.getNullable("childAccountCode"))

        /**
         * If part of a Parent/Child account billing hierarchy, this is the child Account UUID.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun childAccountId(): Optional<String> =
            Optional.ofNullable(childAccountId.getNullable("childAccountId"))

        /**
         * If Commitments _(prepayments)_ are used in the line item, this shows the Commitment UUID.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun commitmentId(): Optional<String> =
            Optional.ofNullable(commitmentId.getNullable("commitmentId"))

        /**
         * The Compound Aggregation ID for the line item if a Compound Aggregation has been used.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun compoundAggregationId(): Optional<String> =
            Optional.ofNullable(compoundAggregationId.getNullable("compoundAggregationId"))

        /**
         * The UUID for the Contract used in the line item.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contractId(): Optional<String> =
            Optional.ofNullable(contractId.getNullable("contractId"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun counterId(): Optional<String> = Optional.ofNullable(counterId.getNullable("counterId"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun creditTypeId(): Optional<String> =
            Optional.ofNullable(creditTypeId.getNullable("creditTypeId"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun group(): Optional<Group> = Optional.ofNullable(group.getNullable("group"))

        /**
         * The UUID of the Meter used in the line item.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun meterId(): Optional<String> = Optional.ofNullable(meterId.getNullable("meterId"))

        /**
         * The UUID of the PlanGroup, provided the line item used a PlanGroup.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun planGroupId(): Optional<String> =
            Optional.ofNullable(planGroupId.getNullable("planGroupId"))

        /**
         * The ID of the Plan used for the line item.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun planId(): Optional<String> = Optional.ofNullable(planId.getNullable("planId"))

        /**
         * The UUID of the Pricing used on the line item.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pricingId(): Optional<String> = Optional.ofNullable(pricingId.getNullable("pricingId"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun productCode(): Optional<String> =
            Optional.ofNullable(productCode.getNullable("productCode"))

        /**
         * The UUID of the Product for the line item.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun productId(): Optional<String> = Optional.ofNullable(productId.getNullable("productId"))

        /**
         * The name of the Product for the line item.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun productName(): Optional<String> =
            Optional.ofNullable(productName.getNullable("productName"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reasonId(): Optional<String> = Optional.ofNullable(reasonId.getNullable("reasonId"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun referencedBillId(): Optional<String> =
            Optional.ofNullable(referencedBillId.getNullable("referencedBillId"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun referencedLineItemId(): Optional<String> =
            Optional.ofNullable(referencedLineItemId.getNullable("referencedLineItemId"))

        /**
         * Applies only when segmented Aggregations have been used. The Segment to which the usage
         * data in this line item belongs.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun segment(): Optional<Segment> = Optional.ofNullable(segment.getNullable("segment"))

        /**
         * The number used for sequential invoices.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sequenceNumber(): Optional<Long> =
            Optional.ofNullable(sequenceNumber.getNullable("sequenceNumber"))

        /**
         * The ending date _(exclusive)_ for the service period _(in ISO 8601 format)_.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun servicePeriodEndDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(servicePeriodEndDate.getNullable("servicePeriodEndDate"))

        /**
         * The starting date _(inclusive)_ for the service period _(in ISO 8601 format)_.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun servicePeriodStartDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(servicePeriodStartDate.getNullable("servicePeriodStartDate"))

        /**
         * Shows the usage by pricing band for tiered pricing structures.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun usagePerPricingBand(): Optional<List<UsagePerPricingBand>> =
            Optional.ofNullable(usagePerPricingBand.getNullable("usagePerPricingBand"))

        /**
         * Returns the raw JSON value of [averageUnitPrice].
         *
         * Unlike [averageUnitPrice], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("averageUnitPrice")
        @ExcludeMissing
        fun _averageUnitPrice(): JsonField<Double> = averageUnitPrice

        /**
         * Returns the raw JSON value of [conversionRate].
         *
         * Unlike [conversionRate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("conversionRate")
        @ExcludeMissing
        fun _conversionRate(): JsonField<Double> = conversionRate

        /**
         * Returns the raw JSON value of [convertedSubtotal].
         *
         * Unlike [convertedSubtotal], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("convertedSubtotal")
        @ExcludeMissing
        fun _convertedSubtotal(): JsonField<Double> = convertedSubtotal

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [lineItemType].
         *
         * Unlike [lineItemType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("lineItemType")
        @ExcludeMissing
        fun _lineItemType(): JsonField<LineItemType> = lineItemType

        /**
         * Returns the raw JSON value of [quantity].
         *
         * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        /**
         * Returns the raw JSON value of [subtotal].
         *
         * Unlike [subtotal], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<Double> = subtotal

        /**
         * Returns the raw JSON value of [unit].
         *
         * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

        /**
         * Returns the raw JSON value of [units].
         *
         * Unlike [units], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("units") @ExcludeMissing fun _units(): JsonField<Double> = units

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [aggregationId].
         *
         * Unlike [aggregationId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("aggregationId")
        @ExcludeMissing
        fun _aggregationId(): JsonField<String> = aggregationId

        /**
         * Returns the raw JSON value of [balanceId].
         *
         * Unlike [balanceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("balanceId") @ExcludeMissing fun _balanceId(): JsonField<String> = balanceId

        /**
         * Returns the raw JSON value of [chargeId].
         *
         * Unlike [chargeId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("chargeId") @ExcludeMissing fun _chargeId(): JsonField<String> = chargeId

        /**
         * Returns the raw JSON value of [childAccountCode].
         *
         * Unlike [childAccountCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("childAccountCode")
        @ExcludeMissing
        fun _childAccountCode(): JsonField<String> = childAccountCode

        /**
         * Returns the raw JSON value of [childAccountId].
         *
         * Unlike [childAccountId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("childAccountId")
        @ExcludeMissing
        fun _childAccountId(): JsonField<String> = childAccountId

        /**
         * Returns the raw JSON value of [commitmentId].
         *
         * Unlike [commitmentId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("commitmentId")
        @ExcludeMissing
        fun _commitmentId(): JsonField<String> = commitmentId

        /**
         * Returns the raw JSON value of [compoundAggregationId].
         *
         * Unlike [compoundAggregationId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("compoundAggregationId")
        @ExcludeMissing
        fun _compoundAggregationId(): JsonField<String> = compoundAggregationId

        /**
         * Returns the raw JSON value of [contractId].
         *
         * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contractId")
        @ExcludeMissing
        fun _contractId(): JsonField<String> = contractId

        /**
         * Returns the raw JSON value of [counterId].
         *
         * Unlike [counterId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("counterId") @ExcludeMissing fun _counterId(): JsonField<String> = counterId

        /**
         * Returns the raw JSON value of [creditTypeId].
         *
         * Unlike [creditTypeId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("creditTypeId")
        @ExcludeMissing
        fun _creditTypeId(): JsonField<String> = creditTypeId

        /**
         * Returns the raw JSON value of [group].
         *
         * Unlike [group], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group") @ExcludeMissing fun _group(): JsonField<Group> = group

        /**
         * Returns the raw JSON value of [meterId].
         *
         * Unlike [meterId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("meterId") @ExcludeMissing fun _meterId(): JsonField<String> = meterId

        /**
         * Returns the raw JSON value of [planGroupId].
         *
         * Unlike [planGroupId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("planGroupId")
        @ExcludeMissing
        fun _planGroupId(): JsonField<String> = planGroupId

        /**
         * Returns the raw JSON value of [planId].
         *
         * Unlike [planId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("planId") @ExcludeMissing fun _planId(): JsonField<String> = planId

        /**
         * Returns the raw JSON value of [pricingId].
         *
         * Unlike [pricingId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pricingId") @ExcludeMissing fun _pricingId(): JsonField<String> = pricingId

        /**
         * Returns the raw JSON value of [productCode].
         *
         * Unlike [productCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("productCode")
        @ExcludeMissing
        fun _productCode(): JsonField<String> = productCode

        /**
         * Returns the raw JSON value of [productId].
         *
         * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("productId") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * Returns the raw JSON value of [productName].
         *
         * Unlike [productName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("productName")
        @ExcludeMissing
        fun _productName(): JsonField<String> = productName

        /**
         * Returns the raw JSON value of [reasonId].
         *
         * Unlike [reasonId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reasonId") @ExcludeMissing fun _reasonId(): JsonField<String> = reasonId

        /**
         * Returns the raw JSON value of [referencedBillId].
         *
         * Unlike [referencedBillId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("referencedBillId")
        @ExcludeMissing
        fun _referencedBillId(): JsonField<String> = referencedBillId

        /**
         * Returns the raw JSON value of [referencedLineItemId].
         *
         * Unlike [referencedLineItemId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("referencedLineItemId")
        @ExcludeMissing
        fun _referencedLineItemId(): JsonField<String> = referencedLineItemId

        /**
         * Returns the raw JSON value of [segment].
         *
         * Unlike [segment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("segment") @ExcludeMissing fun _segment(): JsonField<Segment> = segment

        /**
         * Returns the raw JSON value of [sequenceNumber].
         *
         * Unlike [sequenceNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sequenceNumber")
        @ExcludeMissing
        fun _sequenceNumber(): JsonField<Long> = sequenceNumber

        /**
         * Returns the raw JSON value of [servicePeriodEndDate].
         *
         * Unlike [servicePeriodEndDate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("servicePeriodEndDate")
        @ExcludeMissing
        fun _servicePeriodEndDate(): JsonField<OffsetDateTime> = servicePeriodEndDate

        /**
         * Returns the raw JSON value of [servicePeriodStartDate].
         *
         * Unlike [servicePeriodStartDate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("servicePeriodStartDate")
        @ExcludeMissing
        fun _servicePeriodStartDate(): JsonField<OffsetDateTime> = servicePeriodStartDate

        /**
         * Returns the raw JSON value of [usagePerPricingBand].
         *
         * Unlike [usagePerPricingBand], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("usagePerPricingBand")
        @ExcludeMissing
        fun _usagePerPricingBand(): JsonField<List<UsagePerPricingBand>> = usagePerPricingBand

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
             * Returns a mutable builder for constructing an instance of [LineItem].
             *
             * The following fields are required:
             * ```java
             * .averageUnitPrice()
             * .conversionRate()
             * .convertedSubtotal()
             * .currency()
             * .description()
             * .lineItemType()
             * .quantity()
             * .subtotal()
             * .unit()
             * .units()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [LineItem]. */
        class Builder internal constructor() {

            private var averageUnitPrice: JsonField<Double>? = null
            private var conversionRate: JsonField<Double>? = null
            private var convertedSubtotal: JsonField<Double>? = null
            private var currency: JsonField<String>? = null
            private var description: JsonField<String>? = null
            private var lineItemType: JsonField<LineItemType>? = null
            private var quantity: JsonField<Double>? = null
            private var subtotal: JsonField<Double>? = null
            private var unit: JsonField<String>? = null
            private var units: JsonField<Double>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var aggregationId: JsonField<String> = JsonMissing.of()
            private var balanceId: JsonField<String> = JsonMissing.of()
            private var chargeId: JsonField<String> = JsonMissing.of()
            private var childAccountCode: JsonField<String> = JsonMissing.of()
            private var childAccountId: JsonField<String> = JsonMissing.of()
            private var commitmentId: JsonField<String> = JsonMissing.of()
            private var compoundAggregationId: JsonField<String> = JsonMissing.of()
            private var contractId: JsonField<String> = JsonMissing.of()
            private var counterId: JsonField<String> = JsonMissing.of()
            private var creditTypeId: JsonField<String> = JsonMissing.of()
            private var group: JsonField<Group> = JsonMissing.of()
            private var meterId: JsonField<String> = JsonMissing.of()
            private var planGroupId: JsonField<String> = JsonMissing.of()
            private var planId: JsonField<String> = JsonMissing.of()
            private var pricingId: JsonField<String> = JsonMissing.of()
            private var productCode: JsonField<String> = JsonMissing.of()
            private var productId: JsonField<String> = JsonMissing.of()
            private var productName: JsonField<String> = JsonMissing.of()
            private var reasonId: JsonField<String> = JsonMissing.of()
            private var referencedBillId: JsonField<String> = JsonMissing.of()
            private var referencedLineItemId: JsonField<String> = JsonMissing.of()
            private var segment: JsonField<Segment> = JsonMissing.of()
            private var sequenceNumber: JsonField<Long> = JsonMissing.of()
            private var servicePeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var servicePeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var usagePerPricingBand: JsonField<MutableList<UsagePerPricingBand>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(lineItem: LineItem) = apply {
                averageUnitPrice = lineItem.averageUnitPrice
                conversionRate = lineItem.conversionRate
                convertedSubtotal = lineItem.convertedSubtotal
                currency = lineItem.currency
                description = lineItem.description
                lineItemType = lineItem.lineItemType
                quantity = lineItem.quantity
                subtotal = lineItem.subtotal
                unit = lineItem.unit
                units = lineItem.units
                id = lineItem.id
                aggregationId = lineItem.aggregationId
                balanceId = lineItem.balanceId
                chargeId = lineItem.chargeId
                childAccountCode = lineItem.childAccountCode
                childAccountId = lineItem.childAccountId
                commitmentId = lineItem.commitmentId
                compoundAggregationId = lineItem.compoundAggregationId
                contractId = lineItem.contractId
                counterId = lineItem.counterId
                creditTypeId = lineItem.creditTypeId
                group = lineItem.group
                meterId = lineItem.meterId
                planGroupId = lineItem.planGroupId
                planId = lineItem.planId
                pricingId = lineItem.pricingId
                productCode = lineItem.productCode
                productId = lineItem.productId
                productName = lineItem.productName
                reasonId = lineItem.reasonId
                referencedBillId = lineItem.referencedBillId
                referencedLineItemId = lineItem.referencedLineItemId
                segment = lineItem.segment
                sequenceNumber = lineItem.sequenceNumber
                servicePeriodEndDate = lineItem.servicePeriodEndDate
                servicePeriodStartDate = lineItem.servicePeriodStartDate
                usagePerPricingBand = lineItem.usagePerPricingBand.map { it.toMutableList() }
                additionalProperties = lineItem.additionalProperties.toMutableMap()
            }

            /** The average unit price across all tiers / pricing bands. */
            fun averageUnitPrice(averageUnitPrice: Double) =
                averageUnitPrice(JsonField.of(averageUnitPrice))

            /**
             * Sets [Builder.averageUnitPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.averageUnitPrice] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun averageUnitPrice(averageUnitPrice: JsonField<Double>) = apply {
                this.averageUnitPrice = averageUnitPrice
            }

            /**
             * The currency conversion rate if currency conversion is required for the line item.
             */
            fun conversionRate(conversionRate: Double) =
                conversionRate(JsonField.of(conversionRate))

            /**
             * Sets [Builder.conversionRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conversionRate] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun conversionRate(conversionRate: JsonField<Double>) = apply {
                this.conversionRate = conversionRate
            }

            /** The converted subtotal amount if currency conversions have been used. */
            fun convertedSubtotal(convertedSubtotal: Double) =
                convertedSubtotal(JsonField.of(convertedSubtotal))

            /**
             * Sets [Builder.convertedSubtotal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.convertedSubtotal] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun convertedSubtotal(convertedSubtotal: JsonField<Double>) = apply {
                this.convertedSubtotal = convertedSubtotal
            }

            /**
             * The currency code for the currency used in the line item. For example: USD, GBP, or
             * EUR.
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

            /** Line item description. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun lineItemType(lineItemType: LineItemType) = lineItemType(JsonField.of(lineItemType))

            /**
             * Sets [Builder.lineItemType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lineItemType] with a well-typed [LineItemType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lineItemType(lineItemType: JsonField<LineItemType>) = apply {
                this.lineItemType = lineItemType
            }

            /** The amount of usage for the line item. */
            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            /** The subtotal amount for the line item, before any currency conversions. */
            fun subtotal(subtotal: Double) = subtotal(JsonField.of(subtotal))

            /**
             * Sets [Builder.subtotal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subtotal] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subtotal(subtotal: JsonField<Double>) = apply { this.subtotal = subtotal }

            /**
             * The unit for the usage data in thie line item. For example: **GB** of disk storage
             * space.
             */
            fun unit(unit: String) = unit(JsonField.of(unit))

            /**
             * Sets [Builder.unit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unit] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun unit(unit: JsonField<String>) = apply { this.unit = unit }

            /** The number of units used for the line item. */
            fun units(units: Double) = units(JsonField.of(units))

            /**
             * Sets [Builder.units] to an arbitrary JSON value.
             *
             * You should usually call [Builder.units] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun units(units: JsonField<Double>) = apply { this.units = units }

            /** The UUID for the line item. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The Aggregation ID used for the line item. */
            fun aggregationId(aggregationId: String) = aggregationId(JsonField.of(aggregationId))

            /**
             * Sets [Builder.aggregationId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aggregationId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun aggregationId(aggregationId: JsonField<String>) = apply {
                this.aggregationId = aggregationId
            }

            fun balanceId(balanceId: String) = balanceId(JsonField.of(balanceId))

            /**
             * Sets [Builder.balanceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.balanceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun balanceId(balanceId: JsonField<String>) = apply { this.balanceId = balanceId }

            fun chargeId(chargeId: String) = chargeId(JsonField.of(chargeId))

            /**
             * Sets [Builder.chargeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chargeId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chargeId(chargeId: JsonField<String>) = apply { this.chargeId = chargeId }

            /**
             * If part of a Parent/Child account billing hierarchy, this is the code for the child
             * Account.
             */
            fun childAccountCode(childAccountCode: String) =
                childAccountCode(JsonField.of(childAccountCode))

            /**
             * Sets [Builder.childAccountCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.childAccountCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun childAccountCode(childAccountCode: JsonField<String>) = apply {
                this.childAccountCode = childAccountCode
            }

            /**
             * If part of a Parent/Child account billing hierarchy, this is the child Account UUID.
             */
            fun childAccountId(childAccountId: String) =
                childAccountId(JsonField.of(childAccountId))

            /**
             * Sets [Builder.childAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.childAccountId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun childAccountId(childAccountId: JsonField<String>) = apply {
                this.childAccountId = childAccountId
            }

            /**
             * If Commitments _(prepayments)_ are used in the line item, this shows the Commitment
             * UUID.
             */
            fun commitmentId(commitmentId: String) = commitmentId(JsonField.of(commitmentId))

            /**
             * Sets [Builder.commitmentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commitmentId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commitmentId(commitmentId: JsonField<String>) = apply {
                this.commitmentId = commitmentId
            }

            /**
             * The Compound Aggregation ID for the line item if a Compound Aggregation has been
             * used.
             */
            fun compoundAggregationId(compoundAggregationId: String) =
                compoundAggregationId(JsonField.of(compoundAggregationId))

            /**
             * Sets [Builder.compoundAggregationId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.compoundAggregationId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun compoundAggregationId(compoundAggregationId: JsonField<String>) = apply {
                this.compoundAggregationId = compoundAggregationId
            }

            /** The UUID for the Contract used in the line item. */
            fun contractId(contractId: String) = contractId(JsonField.of(contractId))

            /**
             * Sets [Builder.contractId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contractId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

            fun counterId(counterId: String) = counterId(JsonField.of(counterId))

            /**
             * Sets [Builder.counterId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.counterId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun counterId(counterId: JsonField<String>) = apply { this.counterId = counterId }

            fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

            /**
             * Sets [Builder.creditTypeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditTypeId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                this.creditTypeId = creditTypeId
            }

            fun group(group: Group) = group(JsonField.of(group))

            /**
             * Sets [Builder.group] to an arbitrary JSON value.
             *
             * You should usually call [Builder.group] with a well-typed [Group] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun group(group: JsonField<Group>) = apply { this.group = group }

            /** The UUID of the Meter used in the line item. */
            fun meterId(meterId: String) = meterId(JsonField.of(meterId))

            /**
             * Sets [Builder.meterId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meterId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun meterId(meterId: JsonField<String>) = apply { this.meterId = meterId }

            /** The UUID of the PlanGroup, provided the line item used a PlanGroup. */
            fun planGroupId(planGroupId: String) = planGroupId(JsonField.of(planGroupId))

            /**
             * Sets [Builder.planGroupId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planGroupId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planGroupId(planGroupId: JsonField<String>) = apply {
                this.planGroupId = planGroupId
            }

            /** The ID of the Plan used for the line item. */
            fun planId(planId: String) = planId(JsonField.of(planId))

            /**
             * Sets [Builder.planId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planId(planId: JsonField<String>) = apply { this.planId = planId }

            /** The UUID of the Pricing used on the line item. */
            fun pricingId(pricingId: String) = pricingId(JsonField.of(pricingId))

            /**
             * Sets [Builder.pricingId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pricingId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pricingId(pricingId: JsonField<String>) = apply { this.pricingId = pricingId }

            fun productCode(productCode: String) = productCode(JsonField.of(productCode))

            /**
             * Sets [Builder.productCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productCode(productCode: JsonField<String>) = apply {
                this.productCode = productCode
            }

            /** The UUID of the Product for the line item. */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /** The name of the Product for the line item. */
            fun productName(productName: String) = productName(JsonField.of(productName))

            /**
             * Sets [Builder.productName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productName(productName: JsonField<String>) = apply {
                this.productName = productName
            }

            fun reasonId(reasonId: String) = reasonId(JsonField.of(reasonId))

            /**
             * Sets [Builder.reasonId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reasonId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reasonId(reasonId: JsonField<String>) = apply { this.reasonId = reasonId }

            fun referencedBillId(referencedBillId: String) =
                referencedBillId(JsonField.of(referencedBillId))

            /**
             * Sets [Builder.referencedBillId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referencedBillId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun referencedBillId(referencedBillId: JsonField<String>) = apply {
                this.referencedBillId = referencedBillId
            }

            fun referencedLineItemId(referencedLineItemId: String) =
                referencedLineItemId(JsonField.of(referencedLineItemId))

            /**
             * Sets [Builder.referencedLineItemId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referencedLineItemId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun referencedLineItemId(referencedLineItemId: JsonField<String>) = apply {
                this.referencedLineItemId = referencedLineItemId
            }

            /**
             * Applies only when segmented Aggregations have been used. The Segment to which the
             * usage data in this line item belongs.
             */
            fun segment(segment: Segment) = segment(JsonField.of(segment))

            /**
             * Sets [Builder.segment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.segment] with a well-typed [Segment] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun segment(segment: JsonField<Segment>) = apply { this.segment = segment }

            /** The number used for sequential invoices. */
            fun sequenceNumber(sequenceNumber: Long) = sequenceNumber(JsonField.of(sequenceNumber))

            /**
             * Sets [Builder.sequenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sequenceNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sequenceNumber(sequenceNumber: JsonField<Long>) = apply {
                this.sequenceNumber = sequenceNumber
            }

            /** The ending date _(exclusive)_ for the service period _(in ISO 8601 format)_. */
            fun servicePeriodEndDate(servicePeriodEndDate: OffsetDateTime) =
                servicePeriodEndDate(JsonField.of(servicePeriodEndDate))

            /**
             * Sets [Builder.servicePeriodEndDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.servicePeriodEndDate] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun servicePeriodEndDate(servicePeriodEndDate: JsonField<OffsetDateTime>) = apply {
                this.servicePeriodEndDate = servicePeriodEndDate
            }

            /** The starting date _(inclusive)_ for the service period _(in ISO 8601 format)_. */
            fun servicePeriodStartDate(servicePeriodStartDate: OffsetDateTime) =
                servicePeriodStartDate(JsonField.of(servicePeriodStartDate))

            /**
             * Sets [Builder.servicePeriodStartDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.servicePeriodStartDate] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun servicePeriodStartDate(servicePeriodStartDate: JsonField<OffsetDateTime>) = apply {
                this.servicePeriodStartDate = servicePeriodStartDate
            }

            /** Shows the usage by pricing band for tiered pricing structures. */
            fun usagePerPricingBand(usagePerPricingBand: List<UsagePerPricingBand>) =
                usagePerPricingBand(JsonField.of(usagePerPricingBand))

            /**
             * Sets [Builder.usagePerPricingBand] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usagePerPricingBand] with a well-typed
             * `List<UsagePerPricingBand>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun usagePerPricingBand(usagePerPricingBand: JsonField<List<UsagePerPricingBand>>) =
                apply {
                    this.usagePerPricingBand = usagePerPricingBand.map { it.toMutableList() }
                }

            /**
             * Adds a single [UsagePerPricingBand] to [Builder.usagePerPricingBand].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUsagePerPricingBand(usagePerPricingBand: UsagePerPricingBand) = apply {
                this.usagePerPricingBand =
                    (this.usagePerPricingBand ?: JsonField.of(mutableListOf())).also {
                        checkKnown("usagePerPricingBand", it).add(usagePerPricingBand)
                    }
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

            /**
             * Returns an immutable instance of [LineItem].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .averageUnitPrice()
             * .conversionRate()
             * .convertedSubtotal()
             * .currency()
             * .description()
             * .lineItemType()
             * .quantity()
             * .subtotal()
             * .unit()
             * .units()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): LineItem =
                LineItem(
                    checkRequired("averageUnitPrice", averageUnitPrice),
                    checkRequired("conversionRate", conversionRate),
                    checkRequired("convertedSubtotal", convertedSubtotal),
                    checkRequired("currency", currency),
                    checkRequired("description", description),
                    checkRequired("lineItemType", lineItemType),
                    checkRequired("quantity", quantity),
                    checkRequired("subtotal", subtotal),
                    checkRequired("unit", unit),
                    checkRequired("units", units),
                    id,
                    aggregationId,
                    balanceId,
                    chargeId,
                    childAccountCode,
                    childAccountId,
                    commitmentId,
                    compoundAggregationId,
                    contractId,
                    counterId,
                    creditTypeId,
                    group,
                    meterId,
                    planGroupId,
                    planId,
                    pricingId,
                    productCode,
                    productId,
                    productName,
                    reasonId,
                    referencedBillId,
                    referencedLineItemId,
                    segment,
                    sequenceNumber,
                    servicePeriodEndDate,
                    servicePeriodStartDate,
                    (usagePerPricingBand ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): LineItem = apply {
            if (validated) {
                return@apply
            }

            averageUnitPrice()
            conversionRate()
            convertedSubtotal()
            currency()
            description()
            lineItemType().validate()
            quantity()
            subtotal()
            unit()
            units()
            id()
            aggregationId()
            balanceId()
            chargeId()
            childAccountCode()
            childAccountId()
            commitmentId()
            compoundAggregationId()
            contractId()
            counterId()
            creditTypeId()
            group().ifPresent { it.validate() }
            meterId()
            planGroupId()
            planId()
            pricingId()
            productCode()
            productId()
            productName()
            reasonId()
            referencedBillId()
            referencedLineItemId()
            segment().ifPresent { it.validate() }
            sequenceNumber()
            servicePeriodEndDate()
            servicePeriodStartDate()
            usagePerPricingBand().ifPresent { it.forEach { it.validate() } }
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
            (if (averageUnitPrice.asKnown().isPresent) 1 else 0) +
                (if (conversionRate.asKnown().isPresent) 1 else 0) +
                (if (convertedSubtotal.asKnown().isPresent) 1 else 0) +
                (if (currency.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (lineItemType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (quantity.asKnown().isPresent) 1 else 0) +
                (if (subtotal.asKnown().isPresent) 1 else 0) +
                (if (unit.asKnown().isPresent) 1 else 0) +
                (if (units.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (aggregationId.asKnown().isPresent) 1 else 0) +
                (if (balanceId.asKnown().isPresent) 1 else 0) +
                (if (chargeId.asKnown().isPresent) 1 else 0) +
                (if (childAccountCode.asKnown().isPresent) 1 else 0) +
                (if (childAccountId.asKnown().isPresent) 1 else 0) +
                (if (commitmentId.asKnown().isPresent) 1 else 0) +
                (if (compoundAggregationId.asKnown().isPresent) 1 else 0) +
                (if (contractId.asKnown().isPresent) 1 else 0) +
                (if (counterId.asKnown().isPresent) 1 else 0) +
                (if (creditTypeId.asKnown().isPresent) 1 else 0) +
                (group.asKnown().getOrNull()?.validity() ?: 0) +
                (if (meterId.asKnown().isPresent) 1 else 0) +
                (if (planGroupId.asKnown().isPresent) 1 else 0) +
                (if (planId.asKnown().isPresent) 1 else 0) +
                (if (pricingId.asKnown().isPresent) 1 else 0) +
                (if (productCode.asKnown().isPresent) 1 else 0) +
                (if (productId.asKnown().isPresent) 1 else 0) +
                (if (productName.asKnown().isPresent) 1 else 0) +
                (if (reasonId.asKnown().isPresent) 1 else 0) +
                (if (referencedBillId.asKnown().isPresent) 1 else 0) +
                (if (referencedLineItemId.asKnown().isPresent) 1 else 0) +
                (segment.asKnown().getOrNull()?.validity() ?: 0) +
                (if (sequenceNumber.asKnown().isPresent) 1 else 0) +
                (if (servicePeriodEndDate.asKnown().isPresent) 1 else 0) +
                (if (servicePeriodStartDate.asKnown().isPresent) 1 else 0) +
                (usagePerPricingBand.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class LineItemType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val STANDING_CHARGE = of("STANDING_CHARGE")

                @JvmField val USAGE = of("USAGE")

                @JvmField val COUNTER_RUNNING_TOTAL_CHARGE = of("COUNTER_RUNNING_TOTAL_CHARGE")

                @JvmField val COUNTER_ADJUSTMENT_DEBIT = of("COUNTER_ADJUSTMENT_DEBIT")

                @JvmField val COUNTER_ADJUSTMENT_CREDIT = of("COUNTER_ADJUSTMENT_CREDIT")

                @JvmField val USAGE_CREDIT = of("USAGE_CREDIT")

                @JvmField val MINIMUM_SPEND = of("MINIMUM_SPEND")

                @JvmField val MINIMUM_SPEND_REFUND = of("MINIMUM_SPEND_REFUND")

                @JvmField val CREDIT_DEDUCTION = of("CREDIT_DEDUCTION")

                @JvmField val MANUAL_ADJUSTMENT = of("MANUAL_ADJUSTMENT")

                @JvmField val CREDIT_MEMO = of("CREDIT_MEMO")

                @JvmField val DEBIT_MEMO = of("DEBIT_MEMO")

                @JvmField val COMMITMENT_CONSUMED = of("COMMITMENT_CONSUMED")

                @JvmField val COMMITMENT_FEE = of("COMMITMENT_FEE")

                @JvmField val OVERAGE_SURCHARGE = of("OVERAGE_SURCHARGE")

                @JvmField val OVERAGE_USAGE = of("OVERAGE_USAGE")

                @JvmField val BALANCE_CONSUMED = of("BALANCE_CONSUMED")

                @JvmField val BALANCE_FEE = of("BALANCE_FEE")

                @JvmStatic fun of(value: String) = LineItemType(JsonField.of(value))
            }

            /** An enum containing [LineItemType]'s known values. */
            enum class Known {
                STANDING_CHARGE,
                USAGE,
                COUNTER_RUNNING_TOTAL_CHARGE,
                COUNTER_ADJUSTMENT_DEBIT,
                COUNTER_ADJUSTMENT_CREDIT,
                USAGE_CREDIT,
                MINIMUM_SPEND,
                MINIMUM_SPEND_REFUND,
                CREDIT_DEDUCTION,
                MANUAL_ADJUSTMENT,
                CREDIT_MEMO,
                DEBIT_MEMO,
                COMMITMENT_CONSUMED,
                COMMITMENT_FEE,
                OVERAGE_SURCHARGE,
                OVERAGE_USAGE,
                BALANCE_CONSUMED,
                BALANCE_FEE,
            }

            /**
             * An enum containing [LineItemType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [LineItemType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                STANDING_CHARGE,
                USAGE,
                COUNTER_RUNNING_TOTAL_CHARGE,
                COUNTER_ADJUSTMENT_DEBIT,
                COUNTER_ADJUSTMENT_CREDIT,
                USAGE_CREDIT,
                MINIMUM_SPEND,
                MINIMUM_SPEND_REFUND,
                CREDIT_DEDUCTION,
                MANUAL_ADJUSTMENT,
                CREDIT_MEMO,
                DEBIT_MEMO,
                COMMITMENT_CONSUMED,
                COMMITMENT_FEE,
                OVERAGE_SURCHARGE,
                OVERAGE_USAGE,
                BALANCE_CONSUMED,
                BALANCE_FEE,
                /**
                 * An enum member indicating that [LineItemType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    STANDING_CHARGE -> Value.STANDING_CHARGE
                    USAGE -> Value.USAGE
                    COUNTER_RUNNING_TOTAL_CHARGE -> Value.COUNTER_RUNNING_TOTAL_CHARGE
                    COUNTER_ADJUSTMENT_DEBIT -> Value.COUNTER_ADJUSTMENT_DEBIT
                    COUNTER_ADJUSTMENT_CREDIT -> Value.COUNTER_ADJUSTMENT_CREDIT
                    USAGE_CREDIT -> Value.USAGE_CREDIT
                    MINIMUM_SPEND -> Value.MINIMUM_SPEND
                    MINIMUM_SPEND_REFUND -> Value.MINIMUM_SPEND_REFUND
                    CREDIT_DEDUCTION -> Value.CREDIT_DEDUCTION
                    MANUAL_ADJUSTMENT -> Value.MANUAL_ADJUSTMENT
                    CREDIT_MEMO -> Value.CREDIT_MEMO
                    DEBIT_MEMO -> Value.DEBIT_MEMO
                    COMMITMENT_CONSUMED -> Value.COMMITMENT_CONSUMED
                    COMMITMENT_FEE -> Value.COMMITMENT_FEE
                    OVERAGE_SURCHARGE -> Value.OVERAGE_SURCHARGE
                    OVERAGE_USAGE -> Value.OVERAGE_USAGE
                    BALANCE_CONSUMED -> Value.BALANCE_CONSUMED
                    BALANCE_FEE -> Value.BALANCE_FEE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws M3terInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    STANDING_CHARGE -> Known.STANDING_CHARGE
                    USAGE -> Known.USAGE
                    COUNTER_RUNNING_TOTAL_CHARGE -> Known.COUNTER_RUNNING_TOTAL_CHARGE
                    COUNTER_ADJUSTMENT_DEBIT -> Known.COUNTER_ADJUSTMENT_DEBIT
                    COUNTER_ADJUSTMENT_CREDIT -> Known.COUNTER_ADJUSTMENT_CREDIT
                    USAGE_CREDIT -> Known.USAGE_CREDIT
                    MINIMUM_SPEND -> Known.MINIMUM_SPEND
                    MINIMUM_SPEND_REFUND -> Known.MINIMUM_SPEND_REFUND
                    CREDIT_DEDUCTION -> Known.CREDIT_DEDUCTION
                    MANUAL_ADJUSTMENT -> Known.MANUAL_ADJUSTMENT
                    CREDIT_MEMO -> Known.CREDIT_MEMO
                    DEBIT_MEMO -> Known.DEBIT_MEMO
                    COMMITMENT_CONSUMED -> Known.COMMITMENT_CONSUMED
                    COMMITMENT_FEE -> Known.COMMITMENT_FEE
                    OVERAGE_SURCHARGE -> Known.OVERAGE_SURCHARGE
                    OVERAGE_USAGE -> Known.OVERAGE_USAGE
                    BALANCE_CONSUMED -> Known.BALANCE_CONSUMED
                    BALANCE_FEE -> Known.BALANCE_FEE
                    else -> throw M3terInvalidDataException("Unknown LineItemType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws M3terInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    M3terInvalidDataException("Value is not a String")
                }

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

        class Group
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Group]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Group]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(group: Group) = apply {
                    additionalProperties = group.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Group].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Group = Group(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Group = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Group && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Group{additionalProperties=$additionalProperties}"
        }

        /**
         * Applies only when segmented Aggregations have been used. The Segment to which the usage
         * data in this line item belongs.
         */
        class Segment
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Segment]. */
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Segment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Segment = Segment(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Segment = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

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
         * Array containing the pricing band information, which shows the details for each pricing
         * band or tier.
         */
        class UsagePerPricingBand
        private constructor(
            private val bandQuantity: JsonField<Double>,
            private val bandSubtotal: JsonField<Double>,
            private val bandUnits: JsonField<Double>,
            private val creditTypeId: JsonField<String>,
            private val fixedPrice: JsonField<Double>,
            private val lowerLimit: JsonField<Double>,
            private val pricingBandId: JsonField<String>,
            private val unitPrice: JsonField<Double>,
            private val unitSubtotal: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("bandQuantity")
                @ExcludeMissing
                bandQuantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("bandSubtotal")
                @ExcludeMissing
                bandSubtotal: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("bandUnits")
                @ExcludeMissing
                bandUnits: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("creditTypeId")
                @ExcludeMissing
                creditTypeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("fixedPrice")
                @ExcludeMissing
                fixedPrice: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("lowerLimit")
                @ExcludeMissing
                lowerLimit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("pricingBandId")
                @ExcludeMissing
                pricingBandId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("unitPrice")
                @ExcludeMissing
                unitPrice: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("unitSubtotal")
                @ExcludeMissing
                unitSubtotal: JsonField<Double> = JsonMissing.of(),
            ) : this(
                bandQuantity,
                bandSubtotal,
                bandUnits,
                creditTypeId,
                fixedPrice,
                lowerLimit,
                pricingBandId,
                unitPrice,
                unitSubtotal,
                mutableMapOf(),
            )

            /**
             * Usage amount within the band.
             *
             * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun bandQuantity(): Optional<Double> =
                Optional.ofNullable(bandQuantity.getNullable("bandQuantity"))

            /**
             * Subtotal amount for the band.
             *
             * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun bandSubtotal(): Optional<Double> =
                Optional.ofNullable(bandSubtotal.getNullable("bandSubtotal"))

            /**
             * The number of units used within the band.
             *
             * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun bandUnits(): Optional<Double> =
                Optional.ofNullable(bandUnits.getNullable("bandUnits"))

            /**
             * The UUID of the credit type.
             *
             * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun creditTypeId(): Optional<String> =
                Optional.ofNullable(creditTypeId.getNullable("creditTypeId"))

            /**
             * Fixed price is a charge entered for certain pricing types such as Stairstep, Custom
             * Tiered, and Custom Volume. It is a set price and not dependent on usage.
             *
             * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun fixedPrice(): Optional<Double> =
                Optional.ofNullable(fixedPrice.getNullable("fixedPrice"))

            /**
             * The lower limit _(start)_ of the pricing band.
             *
             * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun lowerLimit(): Optional<Double> =
                Optional.ofNullable(lowerLimit.getNullable("lowerLimit"))

            /**
             * The UUID for the pricing band.
             *
             * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun pricingBandId(): Optional<String> =
                Optional.ofNullable(pricingBandId.getNullable("pricingBandId"))

            /**
             * The price per unit in the band.
             *
             * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun unitPrice(): Optional<Double> =
                Optional.ofNullable(unitPrice.getNullable("unitPrice"))

            /**
             * The subtotal of the unit usage.
             *
             * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun unitSubtotal(): Optional<Double> =
                Optional.ofNullable(unitSubtotal.getNullable("unitSubtotal"))

            /**
             * Returns the raw JSON value of [bandQuantity].
             *
             * Unlike [bandQuantity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bandQuantity")
            @ExcludeMissing
            fun _bandQuantity(): JsonField<Double> = bandQuantity

            /**
             * Returns the raw JSON value of [bandSubtotal].
             *
             * Unlike [bandSubtotal], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bandSubtotal")
            @ExcludeMissing
            fun _bandSubtotal(): JsonField<Double> = bandSubtotal

            /**
             * Returns the raw JSON value of [bandUnits].
             *
             * Unlike [bandUnits], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bandUnits")
            @ExcludeMissing
            fun _bandUnits(): JsonField<Double> = bandUnits

            /**
             * Returns the raw JSON value of [creditTypeId].
             *
             * Unlike [creditTypeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("creditTypeId")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

            /**
             * Returns the raw JSON value of [fixedPrice].
             *
             * Unlike [fixedPrice], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("fixedPrice")
            @ExcludeMissing
            fun _fixedPrice(): JsonField<Double> = fixedPrice

            /**
             * Returns the raw JSON value of [lowerLimit].
             *
             * Unlike [lowerLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("lowerLimit")
            @ExcludeMissing
            fun _lowerLimit(): JsonField<Double> = lowerLimit

            /**
             * Returns the raw JSON value of [pricingBandId].
             *
             * Unlike [pricingBandId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("pricingBandId")
            @ExcludeMissing
            fun _pricingBandId(): JsonField<String> = pricingBandId

            /**
             * Returns the raw JSON value of [unitPrice].
             *
             * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("unitPrice")
            @ExcludeMissing
            fun _unitPrice(): JsonField<Double> = unitPrice

            /**
             * Returns the raw JSON value of [unitSubtotal].
             *
             * Unlike [unitSubtotal], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("unitSubtotal")
            @ExcludeMissing
            fun _unitSubtotal(): JsonField<Double> = unitSubtotal

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
                 * Returns a mutable builder for constructing an instance of [UsagePerPricingBand].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UsagePerPricingBand]. */
            class Builder internal constructor() {

                private var bandQuantity: JsonField<Double> = JsonMissing.of()
                private var bandSubtotal: JsonField<Double> = JsonMissing.of()
                private var bandUnits: JsonField<Double> = JsonMissing.of()
                private var creditTypeId: JsonField<String> = JsonMissing.of()
                private var fixedPrice: JsonField<Double> = JsonMissing.of()
                private var lowerLimit: JsonField<Double> = JsonMissing.of()
                private var pricingBandId: JsonField<String> = JsonMissing.of()
                private var unitPrice: JsonField<Double> = JsonMissing.of()
                private var unitSubtotal: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(usagePerPricingBand: UsagePerPricingBand) = apply {
                    bandQuantity = usagePerPricingBand.bandQuantity
                    bandSubtotal = usagePerPricingBand.bandSubtotal
                    bandUnits = usagePerPricingBand.bandUnits
                    creditTypeId = usagePerPricingBand.creditTypeId
                    fixedPrice = usagePerPricingBand.fixedPrice
                    lowerLimit = usagePerPricingBand.lowerLimit
                    pricingBandId = usagePerPricingBand.pricingBandId
                    unitPrice = usagePerPricingBand.unitPrice
                    unitSubtotal = usagePerPricingBand.unitSubtotal
                    additionalProperties = usagePerPricingBand.additionalProperties.toMutableMap()
                }

                /** Usage amount within the band. */
                fun bandQuantity(bandQuantity: Double) = bandQuantity(JsonField.of(bandQuantity))

                /**
                 * Sets [Builder.bandQuantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bandQuantity] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bandQuantity(bandQuantity: JsonField<Double>) = apply {
                    this.bandQuantity = bandQuantity
                }

                /** Subtotal amount for the band. */
                fun bandSubtotal(bandSubtotal: Double) = bandSubtotal(JsonField.of(bandSubtotal))

                /**
                 * Sets [Builder.bandSubtotal] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bandSubtotal] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bandSubtotal(bandSubtotal: JsonField<Double>) = apply {
                    this.bandSubtotal = bandSubtotal
                }

                /** The number of units used within the band. */
                fun bandUnits(bandUnits: Double) = bandUnits(JsonField.of(bandUnits))

                /**
                 * Sets [Builder.bandUnits] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bandUnits] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bandUnits(bandUnits: JsonField<Double>) = apply { this.bandUnits = bandUnits }

                /** The UUID of the credit type. */
                fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

                /**
                 * Sets [Builder.creditTypeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditTypeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                    this.creditTypeId = creditTypeId
                }

                /**
                 * Fixed price is a charge entered for certain pricing types such as Stairstep,
                 * Custom Tiered, and Custom Volume. It is a set price and not dependent on usage.
                 */
                fun fixedPrice(fixedPrice: Double) = fixedPrice(JsonField.of(fixedPrice))

                /**
                 * Sets [Builder.fixedPrice] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fixedPrice] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fixedPrice(fixedPrice: JsonField<Double>) = apply {
                    this.fixedPrice = fixedPrice
                }

                /** The lower limit _(start)_ of the pricing band. */
                fun lowerLimit(lowerLimit: Double) = lowerLimit(JsonField.of(lowerLimit))

                /**
                 * Sets [Builder.lowerLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lowerLimit] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun lowerLimit(lowerLimit: JsonField<Double>) = apply {
                    this.lowerLimit = lowerLimit
                }

                /** The UUID for the pricing band. */
                fun pricingBandId(pricingBandId: String) =
                    pricingBandId(JsonField.of(pricingBandId))

                /**
                 * Sets [Builder.pricingBandId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pricingBandId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pricingBandId(pricingBandId: JsonField<String>) = apply {
                    this.pricingBandId = pricingBandId
                }

                /** The price per unit in the band. */
                fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                /**
                 * Sets [Builder.unitPrice] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unitPrice] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun unitPrice(unitPrice: JsonField<Double>) = apply { this.unitPrice = unitPrice }

                /** The subtotal of the unit usage. */
                fun unitSubtotal(unitSubtotal: Double) = unitSubtotal(JsonField.of(unitSubtotal))

                /**
                 * Sets [Builder.unitSubtotal] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unitSubtotal] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun unitSubtotal(unitSubtotal: JsonField<Double>) = apply {
                    this.unitSubtotal = unitSubtotal
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [UsagePerPricingBand].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UsagePerPricingBand =
                    UsagePerPricingBand(
                        bandQuantity,
                        bandSubtotal,
                        bandUnits,
                        creditTypeId,
                        fixedPrice,
                        lowerLimit,
                        pricingBandId,
                        unitPrice,
                        unitSubtotal,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): UsagePerPricingBand = apply {
                if (validated) {
                    return@apply
                }

                bandQuantity()
                bandSubtotal()
                bandUnits()
                creditTypeId()
                fixedPrice()
                lowerLimit()
                pricingBandId()
                unitPrice()
                unitSubtotal()
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
                (if (bandQuantity.asKnown().isPresent) 1 else 0) +
                    (if (bandSubtotal.asKnown().isPresent) 1 else 0) +
                    (if (bandUnits.asKnown().isPresent) 1 else 0) +
                    (if (creditTypeId.asKnown().isPresent) 1 else 0) +
                    (if (fixedPrice.asKnown().isPresent) 1 else 0) +
                    (if (lowerLimit.asKnown().isPresent) 1 else 0) +
                    (if (pricingBandId.asKnown().isPresent) 1 else 0) +
                    (if (unitPrice.asKnown().isPresent) 1 else 0) +
                    (if (unitSubtotal.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UsagePerPricingBand && bandQuantity == other.bandQuantity && bandSubtotal == other.bandSubtotal && bandUnits == other.bandUnits && creditTypeId == other.creditTypeId && fixedPrice == other.fixedPrice && lowerLimit == other.lowerLimit && pricingBandId == other.pricingBandId && unitPrice == other.unitPrice && unitSubtotal == other.unitSubtotal && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(bandQuantity, bandSubtotal, bandUnits, creditTypeId, fixedPrice, lowerLimit, pricingBandId, unitPrice, unitSubtotal, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UsagePerPricingBand{bandQuantity=$bandQuantity, bandSubtotal=$bandSubtotal, bandUnits=$bandUnits, creditTypeId=$creditTypeId, fixedPrice=$fixedPrice, lowerLimit=$lowerLimit, pricingBandId=$pricingBandId, unitPrice=$unitPrice, unitSubtotal=$unitSubtotal, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LineItem && averageUnitPrice == other.averageUnitPrice && conversionRate == other.conversionRate && convertedSubtotal == other.convertedSubtotal && currency == other.currency && description == other.description && lineItemType == other.lineItemType && quantity == other.quantity && subtotal == other.subtotal && unit == other.unit && units == other.units && id == other.id && aggregationId == other.aggregationId && balanceId == other.balanceId && chargeId == other.chargeId && childAccountCode == other.childAccountCode && childAccountId == other.childAccountId && commitmentId == other.commitmentId && compoundAggregationId == other.compoundAggregationId && contractId == other.contractId && counterId == other.counterId && creditTypeId == other.creditTypeId && group == other.group && meterId == other.meterId && planGroupId == other.planGroupId && planId == other.planId && pricingId == other.pricingId && productCode == other.productCode && productId == other.productId && productName == other.productName && reasonId == other.reasonId && referencedBillId == other.referencedBillId && referencedLineItemId == other.referencedLineItemId && segment == other.segment && sequenceNumber == other.sequenceNumber && servicePeriodEndDate == other.servicePeriodEndDate && servicePeriodStartDate == other.servicePeriodStartDate && usagePerPricingBand == other.usagePerPricingBand && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(averageUnitPrice, conversionRate, convertedSubtotal, currency, description, lineItemType, quantity, subtotal, unit, units, id, aggregationId, balanceId, chargeId, childAccountCode, childAccountId, commitmentId, compoundAggregationId, contractId, counterId, creditTypeId, group, meterId, planGroupId, planId, pricingId, productCode, productId, productName, reasonId, referencedBillId, referencedLineItemId, segment, sequenceNumber, servicePeriodEndDate, servicePeriodStartDate, usagePerPricingBand, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LineItem{averageUnitPrice=$averageUnitPrice, conversionRate=$conversionRate, convertedSubtotal=$convertedSubtotal, currency=$currency, description=$description, lineItemType=$lineItemType, quantity=$quantity, subtotal=$subtotal, unit=$unit, units=$units, id=$id, aggregationId=$aggregationId, balanceId=$balanceId, chargeId=$chargeId, childAccountCode=$childAccountCode, childAccountId=$childAccountId, commitmentId=$commitmentId, compoundAggregationId=$compoundAggregationId, contractId=$contractId, counterId=$counterId, creditTypeId=$creditTypeId, group=$group, meterId=$meterId, planGroupId=$planGroupId, planId=$planId, pricingId=$pricingId, productCode=$productCode, productId=$productId, productName=$productName, reasonId=$reasonId, referencedBillId=$referencedBillId, referencedLineItemId=$referencedLineItemId, segment=$segment, sequenceNumber=$sequenceNumber, servicePeriodEndDate=$servicePeriodEndDate, servicePeriodStartDate=$servicePeriodStartDate, usagePerPricingBand=$usagePerPricingBand, additionalProperties=$additionalProperties}"
    }

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

            @JvmField val APPROVED = of("APPROVED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            APPROVED,
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
            APPROVED,
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
                APPROVED -> Value.APPROVED
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
                APPROVED -> Known.APPROVED
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillResponse && id == other.id && version == other.version && accountCode == other.accountCode && accountId == other.accountId && billDate == other.billDate && billFrequencyInterval == other.billFrequencyInterval && billingFrequency == other.billingFrequency && billJobId == other.billJobId && billTotal == other.billTotal && createdBy == other.createdBy && createdDate == other.createdDate && csvStatementGenerated == other.csvStatementGenerated && currency == other.currency && currencyConversions == other.currencyConversions && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && dueDate == other.dueDate && endDate == other.endDate && endDateTimeUtc == other.endDateTimeUtc && externalInvoiceDate == other.externalInvoiceDate && externalInvoiceReference == other.externalInvoiceReference && jsonStatementGenerated == other.jsonStatementGenerated && lastCalculatedDate == other.lastCalculatedDate && lastModifiedBy == other.lastModifiedBy && lineItems == other.lineItems && locked == other.locked && purchaseOrderNumber == other.purchaseOrderNumber && sequentialInvoiceNumber == other.sequentialInvoiceNumber && startDate == other.startDate && startDateTimeUtc == other.startDateTimeUtc && status == other.status && timezone == other.timezone && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, accountCode, accountId, billDate, billFrequencyInterval, billingFrequency, billJobId, billTotal, createdBy, createdDate, csvStatementGenerated, currency, currencyConversions, dtCreated, dtLastModified, dueDate, endDate, endDateTimeUtc, externalInvoiceDate, externalInvoiceReference, jsonStatementGenerated, lastCalculatedDate, lastModifiedBy, lineItems, locked, purchaseOrderNumber, sequentialInvoiceNumber, startDate, startDateTimeUtc, status, timezone, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BillResponse{id=$id, version=$version, accountCode=$accountCode, accountId=$accountId, billDate=$billDate, billFrequencyInterval=$billFrequencyInterval, billingFrequency=$billingFrequency, billJobId=$billJobId, billTotal=$billTotal, createdBy=$createdBy, createdDate=$createdDate, csvStatementGenerated=$csvStatementGenerated, currency=$currency, currencyConversions=$currencyConversions, dtCreated=$dtCreated, dtLastModified=$dtLastModified, dueDate=$dueDate, endDate=$endDate, endDateTimeUtc=$endDateTimeUtc, externalInvoiceDate=$externalInvoiceDate, externalInvoiceReference=$externalInvoiceReference, jsonStatementGenerated=$jsonStatementGenerated, lastCalculatedDate=$lastCalculatedDate, lastModifiedBy=$lastModifiedBy, lineItems=$lineItems, locked=$locked, purchaseOrderNumber=$purchaseOrderNumber, sequentialInvoiceNumber=$sequentialInvoiceNumber, startDate=$startDate, startDateTimeUtc=$startDateTimeUtc, status=$status, timezone=$timezone, additionalProperties=$additionalProperties}"
}
