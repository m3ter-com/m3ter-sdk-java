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
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class Bill
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("accountCode")
    @ExcludeMissing
    private val accountCode: JsonField<String> = JsonMissing.of(),
    @JsonProperty("accountId")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("billDate")
    @ExcludeMissing
    private val billDate: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("billFrequencyInterval")
    @ExcludeMissing
    private val billFrequencyInterval: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("billingFrequency")
    @ExcludeMissing
    private val billingFrequency: JsonField<BillingFrequency> = JsonMissing.of(),
    @JsonProperty("billJobId")
    @ExcludeMissing
    private val billJobId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("billTotal")
    @ExcludeMissing
    private val billTotal: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("createdBy")
    @ExcludeMissing
    private val createdBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("createdDate")
    @ExcludeMissing
    private val createdDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("csvStatementGenerated")
    @ExcludeMissing
    private val csvStatementGenerated: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("currencyConversions")
    @ExcludeMissing
    private val currencyConversions: JsonField<List<CurrencyConversion>> = JsonMissing.of(),
    @JsonProperty("dtCreated")
    @ExcludeMissing
    private val dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    private val dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dueDate")
    @ExcludeMissing
    private val dueDate: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("endDate")
    @ExcludeMissing
    private val endDate: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("endDateTimeUTC")
    @ExcludeMissing
    private val endDateTimeUtc: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("externalInvoiceDate")
    @ExcludeMissing
    private val externalInvoiceDate: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("externalInvoiceReference")
    @ExcludeMissing
    private val externalInvoiceReference: JsonField<String> = JsonMissing.of(),
    @JsonProperty("jsonStatementGenerated")
    @ExcludeMissing
    private val jsonStatementGenerated: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("lastCalculatedDate")
    @ExcludeMissing
    private val lastCalculatedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    private val lastModifiedBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("lineItems")
    @ExcludeMissing
    private val lineItems: JsonField<List<LineItem>> = JsonMissing.of(),
    @JsonProperty("locked")
    @ExcludeMissing
    private val locked: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("purchaseOrderNumber")
    @ExcludeMissing
    private val purchaseOrderNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("sequentialInvoiceNumber")
    @ExcludeMissing
    private val sequentialInvoiceNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("startDate")
    @ExcludeMissing
    private val startDate: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("startDateTimeUTC")
    @ExcludeMissing
    private val startDateTimeUtc: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("timezone")
    @ExcludeMissing
    private val timezone: JsonField<String> = JsonMissing.of(),
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

    fun accountCode(): Optional<String> =
        Optional.ofNullable(accountCode.getNullable("accountCode"))

    fun accountId(): Optional<String> = Optional.ofNullable(accountId.getNullable("accountId"))

    fun billDate(): Optional<LocalDate> = Optional.ofNullable(billDate.getNullable("billDate"))

    fun billFrequencyInterval(): Optional<Long> =
        Optional.ofNullable(billFrequencyInterval.getNullable("billFrequencyInterval"))

    fun billingFrequency(): Optional<BillingFrequency> =
        Optional.ofNullable(billingFrequency.getNullable("billingFrequency"))

    fun billJobId(): Optional<String> = Optional.ofNullable(billJobId.getNullable("billJobId"))

    /** The sum total for the Bill. */
    fun billTotal(): Optional<Double> = Optional.ofNullable(billTotal.getNullable("billTotal"))

    /** The unique identifier (UUID) for the user who created the Bill. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    fun createdDate(): Optional<OffsetDateTime> =
        Optional.ofNullable(createdDate.getNullable("createdDate"))

    /**
     * Flag to indicate that the statement in CSV format has been generated for the Bill.
     * - **TRUE** - CSV statement has been generated.
     * - **FALSE** - no CSV statement generated.
     */
    fun csvStatementGenerated(): Optional<Boolean> =
        Optional.ofNullable(csvStatementGenerated.getNullable("csvStatementGenerated"))

    fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

    fun currencyConversions(): Optional<List<CurrencyConversion>> =
        Optional.ofNullable(currencyConversions.getNullable("currencyConversions"))

    /** The date and time _(in ISO 8601 format)_ when the Bill was first created. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /** The date and time _(in ISO 8601 format)_ when the Bill was last modified. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    fun dueDate(): Optional<LocalDate> = Optional.ofNullable(dueDate.getNullable("dueDate"))

    fun endDate(): Optional<LocalDate> = Optional.ofNullable(endDate.getNullable("endDate"))

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
     */
    fun externalInvoiceDate(): Optional<LocalDate> =
        Optional.ofNullable(externalInvoiceDate.getNullable("externalInvoiceDate"))

    /** The reference ID to use for external invoice. */
    fun externalInvoiceReference(): Optional<String> =
        Optional.ofNullable(externalInvoiceReference.getNullable("externalInvoiceReference"))

    /**
     * Flag to indicate that the statement in JSON format has been generated for the Bill.
     * - **TRUE** - JSON statement has been generated.
     * - **FALSE** - no JSON statement generated.
     */
    fun jsonStatementGenerated(): Optional<Boolean> =
        Optional.ofNullable(jsonStatementGenerated.getNullable("jsonStatementGenerated"))

    fun lastCalculatedDate(): Optional<OffsetDateTime> =
        Optional.ofNullable(lastCalculatedDate.getNullable("lastCalculatedDate"))

    /** The unique identifier (UUID) for the user who last modified this Bill. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /** An array of the Bill line items. */
    fun lineItems(): Optional<List<LineItem>> =
        Optional.ofNullable(lineItems.getNullable("lineItems"))

    fun locked(): Optional<Boolean> = Optional.ofNullable(locked.getNullable("locked"))

    /** Purchase Order number linked to the Account the Bill is for. */
    fun purchaseOrderNumber(): Optional<String> =
        Optional.ofNullable(purchaseOrderNumber.getNullable("purchaseOrderNumber"))

    /**
     * The sequential invoice number of the Bill.
     *
     * **NOTE:** If you have not defined a `billPrefix` for your Organization, a
     * `sequentialInvoiceNumber` is not returned in the response. See
     * [Update OrganizationConfig](https://www.m3ter.com/docs/api#tag/OrganizationConfig/operation/UpdateOrganizationConfig)
     */
    fun sequentialInvoiceNumber(): Optional<String> =
        Optional.ofNullable(sequentialInvoiceNumber.getNullable("sequentialInvoiceNumber"))

    fun startDate(): Optional<LocalDate> = Optional.ofNullable(startDate.getNullable("startDate"))

    fun startDateTimeUtc(): Optional<OffsetDateTime> =
        Optional.ofNullable(startDateTimeUtc.getNullable("startDateTimeUTC"))

    fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

    fun timezone(): Optional<String> = Optional.ofNullable(timezone.getNullable("timezone"))

    /** The UUID of the entity. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    @JsonProperty("accountCode") @ExcludeMissing fun _accountCode(): JsonField<String> = accountCode

    @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    @JsonProperty("billDate") @ExcludeMissing fun _billDate(): JsonField<LocalDate> = billDate

    @JsonProperty("billFrequencyInterval")
    @ExcludeMissing
    fun _billFrequencyInterval(): JsonField<Long> = billFrequencyInterval

    @JsonProperty("billingFrequency")
    @ExcludeMissing
    fun _billingFrequency(): JsonField<BillingFrequency> = billingFrequency

    @JsonProperty("billJobId") @ExcludeMissing fun _billJobId(): JsonField<String> = billJobId

    /** The sum total for the Bill. */
    @JsonProperty("billTotal") @ExcludeMissing fun _billTotal(): JsonField<Double> = billTotal

    /** The unique identifier (UUID) for the user who created the Bill. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    @JsonProperty("createdDate")
    @ExcludeMissing
    fun _createdDate(): JsonField<OffsetDateTime> = createdDate

    /**
     * Flag to indicate that the statement in CSV format has been generated for the Bill.
     * - **TRUE** - CSV statement has been generated.
     * - **FALSE** - no CSV statement generated.
     */
    @JsonProperty("csvStatementGenerated")
    @ExcludeMissing
    fun _csvStatementGenerated(): JsonField<Boolean> = csvStatementGenerated

    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    @JsonProperty("currencyConversions")
    @ExcludeMissing
    fun _currencyConversions(): JsonField<List<CurrencyConversion>> = currencyConversions

    /** The date and time _(in ISO 8601 format)_ when the Bill was first created. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /** The date and time _(in ISO 8601 format)_ when the Bill was last modified. */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    @JsonProperty("dueDate") @ExcludeMissing fun _dueDate(): JsonField<LocalDate> = dueDate

    @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<LocalDate> = endDate

    @JsonProperty("endDateTimeUTC")
    @ExcludeMissing
    fun _endDateTimeUtc(): JsonField<OffsetDateTime> = endDateTimeUtc

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
     */
    @JsonProperty("externalInvoiceDate")
    @ExcludeMissing
    fun _externalInvoiceDate(): JsonField<LocalDate> = externalInvoiceDate

    /** The reference ID to use for external invoice. */
    @JsonProperty("externalInvoiceReference")
    @ExcludeMissing
    fun _externalInvoiceReference(): JsonField<String> = externalInvoiceReference

    /**
     * Flag to indicate that the statement in JSON format has been generated for the Bill.
     * - **TRUE** - JSON statement has been generated.
     * - **FALSE** - no JSON statement generated.
     */
    @JsonProperty("jsonStatementGenerated")
    @ExcludeMissing
    fun _jsonStatementGenerated(): JsonField<Boolean> = jsonStatementGenerated

    @JsonProperty("lastCalculatedDate")
    @ExcludeMissing
    fun _lastCalculatedDate(): JsonField<OffsetDateTime> = lastCalculatedDate

    /** The unique identifier (UUID) for the user who last modified this Bill. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /** An array of the Bill line items. */
    @JsonProperty("lineItems")
    @ExcludeMissing
    fun _lineItems(): JsonField<List<LineItem>> = lineItems

    @JsonProperty("locked") @ExcludeMissing fun _locked(): JsonField<Boolean> = locked

    /** Purchase Order number linked to the Account the Bill is for. */
    @JsonProperty("purchaseOrderNumber")
    @ExcludeMissing
    fun _purchaseOrderNumber(): JsonField<String> = purchaseOrderNumber

    /**
     * The sequential invoice number of the Bill.
     *
     * **NOTE:** If you have not defined a `billPrefix` for your Organization, a
     * `sequentialInvoiceNumber` is not returned in the response. See
     * [Update OrganizationConfig](https://www.m3ter.com/docs/api#tag/OrganizationConfig/operation/UpdateOrganizationConfig)
     */
    @JsonProperty("sequentialInvoiceNumber")
    @ExcludeMissing
    fun _sequentialInvoiceNumber(): JsonField<String> = sequentialInvoiceNumber

    @JsonProperty("startDate") @ExcludeMissing fun _startDate(): JsonField<LocalDate> = startDate

    @JsonProperty("startDateTimeUTC")
    @ExcludeMissing
    fun _startDateTimeUtc(): JsonField<OffsetDateTime> = startDateTimeUtc

    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<String> = timezone

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Bill = apply {
        if (validated) {
            return@apply
        }

        id()
        version()
        accountCode()
        accountId()
        billDate()
        billFrequencyInterval()
        billingFrequency()
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
        status()
        timezone()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Bill]. */
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
        internal fun from(bill: Bill) = apply {
            id = bill.id
            version = bill.version
            accountCode = bill.accountCode
            accountId = bill.accountId
            billDate = bill.billDate
            billFrequencyInterval = bill.billFrequencyInterval
            billingFrequency = bill.billingFrequency
            billJobId = bill.billJobId
            billTotal = bill.billTotal
            createdBy = bill.createdBy
            createdDate = bill.createdDate
            csvStatementGenerated = bill.csvStatementGenerated
            currency = bill.currency
            currencyConversions = bill.currencyConversions.map { it.toMutableList() }
            dtCreated = bill.dtCreated
            dtLastModified = bill.dtLastModified
            dueDate = bill.dueDate
            endDate = bill.endDate
            endDateTimeUtc = bill.endDateTimeUtc
            externalInvoiceDate = bill.externalInvoiceDate
            externalInvoiceReference = bill.externalInvoiceReference
            jsonStatementGenerated = bill.jsonStatementGenerated
            lastCalculatedDate = bill.lastCalculatedDate
            lastModifiedBy = bill.lastModifiedBy
            lineItems = bill.lineItems.map { it.toMutableList() }
            locked = bill.locked
            purchaseOrderNumber = bill.purchaseOrderNumber
            sequentialInvoiceNumber = bill.sequentialInvoiceNumber
            startDate = bill.startDate
            startDateTimeUtc = bill.startDateTimeUtc
            status = bill.status
            timezone = bill.timezone
            additionalProperties = bill.additionalProperties.toMutableMap()
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

        fun accountCode(accountCode: String) = accountCode(JsonField.of(accountCode))

        fun accountCode(accountCode: JsonField<String>) = apply { this.accountCode = accountCode }

        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        fun billDate(billDate: LocalDate) = billDate(JsonField.of(billDate))

        fun billDate(billDate: JsonField<LocalDate>) = apply { this.billDate = billDate }

        fun billFrequencyInterval(billFrequencyInterval: Long) =
            billFrequencyInterval(JsonField.of(billFrequencyInterval))

        fun billFrequencyInterval(billFrequencyInterval: JsonField<Long>) = apply {
            this.billFrequencyInterval = billFrequencyInterval
        }

        fun billingFrequency(billingFrequency: BillingFrequency) =
            billingFrequency(JsonField.of(billingFrequency))

        fun billingFrequency(billingFrequency: JsonField<BillingFrequency>) = apply {
            this.billingFrequency = billingFrequency
        }

        fun billJobId(billJobId: String) = billJobId(JsonField.of(billJobId))

        fun billJobId(billJobId: JsonField<String>) = apply { this.billJobId = billJobId }

        /** The sum total for the Bill. */
        fun billTotal(billTotal: Double) = billTotal(JsonField.of(billTotal))

        /** The sum total for the Bill. */
        fun billTotal(billTotal: JsonField<Double>) = apply { this.billTotal = billTotal }

        /** The unique identifier (UUID) for the user who created the Bill. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The unique identifier (UUID) for the user who created the Bill. */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        fun createdDate(createdDate: OffsetDateTime) = createdDate(JsonField.of(createdDate))

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
         * Flag to indicate that the statement in CSV format has been generated for the Bill.
         * - **TRUE** - CSV statement has been generated.
         * - **FALSE** - no CSV statement generated.
         */
        fun csvStatementGenerated(csvStatementGenerated: JsonField<Boolean>) = apply {
            this.csvStatementGenerated = csvStatementGenerated
        }

        fun currency(currency: String) = currency(JsonField.of(currency))

        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        fun currencyConversions(currencyConversions: List<CurrencyConversion>) =
            currencyConversions(JsonField.of(currencyConversions))

        fun currencyConversions(currencyConversions: JsonField<List<CurrencyConversion>>) = apply {
            this.currencyConversions = currencyConversions.map { it.toMutableList() }
        }

        fun addCurrencyConversion(currencyConversion: CurrencyConversion) = apply {
            currencyConversions =
                (currencyConversions ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(currencyConversion)
                }
        }

        /** The date and time _(in ISO 8601 format)_ when the Bill was first created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /** The date and time _(in ISO 8601 format)_ when the Bill was first created. */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The date and time _(in ISO 8601 format)_ when the Bill was last modified. */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /** The date and time _(in ISO 8601 format)_ when the Bill was last modified. */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        fun dueDate(dueDate: LocalDate) = dueDate(JsonField.of(dueDate))

        fun dueDate(dueDate: JsonField<LocalDate>) = apply { this.dueDate = dueDate }

        fun endDate(endDate: LocalDate) = endDate(JsonField.of(endDate))

        fun endDate(endDate: JsonField<LocalDate>) = apply { this.endDate = endDate }

        fun endDateTimeUtc(endDateTimeUtc: OffsetDateTime) =
            endDateTimeUtc(JsonField.of(endDateTimeUtc))

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
        fun externalInvoiceDate(externalInvoiceDate: JsonField<LocalDate>) = apply {
            this.externalInvoiceDate = externalInvoiceDate
        }

        /** The reference ID to use for external invoice. */
        fun externalInvoiceReference(externalInvoiceReference: String) =
            externalInvoiceReference(JsonField.of(externalInvoiceReference))

        /** The reference ID to use for external invoice. */
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
         * Flag to indicate that the statement in JSON format has been generated for the Bill.
         * - **TRUE** - JSON statement has been generated.
         * - **FALSE** - no JSON statement generated.
         */
        fun jsonStatementGenerated(jsonStatementGenerated: JsonField<Boolean>) = apply {
            this.jsonStatementGenerated = jsonStatementGenerated
        }

        fun lastCalculatedDate(lastCalculatedDate: OffsetDateTime) =
            lastCalculatedDate(JsonField.of(lastCalculatedDate))

        fun lastCalculatedDate(lastCalculatedDate: JsonField<OffsetDateTime>) = apply {
            this.lastCalculatedDate = lastCalculatedDate
        }

        /** The unique identifier (UUID) for the user who last modified this Bill. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The unique identifier (UUID) for the user who last modified this Bill. */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
        }

        /** An array of the Bill line items. */
        fun lineItems(lineItems: List<LineItem>) = lineItems(JsonField.of(lineItems))

        /** An array of the Bill line items. */
        fun lineItems(lineItems: JsonField<List<LineItem>>) = apply {
            this.lineItems = lineItems.map { it.toMutableList() }
        }

        /** An array of the Bill line items. */
        fun addLineItem(lineItem: LineItem) = apply {
            lineItems =
                (lineItems ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(lineItem)
                }
        }

        fun locked(locked: Boolean) = locked(JsonField.of(locked))

        fun locked(locked: JsonField<Boolean>) = apply { this.locked = locked }

        /** Purchase Order number linked to the Account the Bill is for. */
        fun purchaseOrderNumber(purchaseOrderNumber: String) =
            purchaseOrderNumber(JsonField.of(purchaseOrderNumber))

        /** Purchase Order number linked to the Account the Bill is for. */
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
         * The sequential invoice number of the Bill.
         *
         * **NOTE:** If you have not defined a `billPrefix` for your Organization, a
         * `sequentialInvoiceNumber` is not returned in the response. See
         * [Update OrganizationConfig](https://www.m3ter.com/docs/api#tag/OrganizationConfig/operation/UpdateOrganizationConfig)
         */
        fun sequentialInvoiceNumber(sequentialInvoiceNumber: JsonField<String>) = apply {
            this.sequentialInvoiceNumber = sequentialInvoiceNumber
        }

        fun startDate(startDate: LocalDate) = startDate(JsonField.of(startDate))

        fun startDate(startDate: JsonField<LocalDate>) = apply { this.startDate = startDate }

        fun startDateTimeUtc(startDateTimeUtc: OffsetDateTime) =
            startDateTimeUtc(JsonField.of(startDateTimeUtc))

        fun startDateTimeUtc(startDateTimeUtc: JsonField<OffsetDateTime>) = apply {
            this.startDateTimeUtc = startDateTimeUtc
        }

        fun status(status: Status) = status(JsonField.of(status))

        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun timezone(timezone: String) = timezone(JsonField.of(timezone))

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

        fun build(): Bill =
            Bill(
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
                additionalProperties.toImmutable(),
            )
    }

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BillingFrequency && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class LineItem
    @JsonCreator
    private constructor(
        @JsonProperty("averageUnitPrice")
        @ExcludeMissing
        private val averageUnitPrice: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("conversionRate")
        @ExcludeMissing
        private val conversionRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("convertedSubtotal")
        @ExcludeMissing
        private val convertedSubtotal: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lineItemType")
        @ExcludeMissing
        private val lineItemType: JsonField<LineItemType> = JsonMissing.of(),
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("subtotal")
        @ExcludeMissing
        private val subtotal: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("unit")
        @ExcludeMissing
        private val unit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("units")
        @ExcludeMissing
        private val units: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("aggregationId")
        @ExcludeMissing
        private val aggregationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("balanceId")
        @ExcludeMissing
        private val balanceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("chargeId")
        @ExcludeMissing
        private val chargeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("childAccountCode")
        @ExcludeMissing
        private val childAccountCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("childAccountId")
        @ExcludeMissing
        private val childAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("commitmentId")
        @ExcludeMissing
        private val commitmentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("compoundAggregationId")
        @ExcludeMissing
        private val compoundAggregationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contractId")
        @ExcludeMissing
        private val contractId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("counterId")
        @ExcludeMissing
        private val counterId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("creditTypeId")
        @ExcludeMissing
        private val creditTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("group")
        @ExcludeMissing
        private val group: JsonField<Group> = JsonMissing.of(),
        @JsonProperty("meterId")
        @ExcludeMissing
        private val meterId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("planGroupId")
        @ExcludeMissing
        private val planGroupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("planId")
        @ExcludeMissing
        private val planId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pricingId")
        @ExcludeMissing
        private val pricingId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("productCode")
        @ExcludeMissing
        private val productCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("productId")
        @ExcludeMissing
        private val productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("productName")
        @ExcludeMissing
        private val productName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reasonId")
        @ExcludeMissing
        private val reasonId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("referencedBillId")
        @ExcludeMissing
        private val referencedBillId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("referencedLineItemId")
        @ExcludeMissing
        private val referencedLineItemId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("segment")
        @ExcludeMissing
        private val segment: JsonField<Segment> = JsonMissing.of(),
        @JsonProperty("sequenceNumber")
        @ExcludeMissing
        private val sequenceNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("servicePeriodEndDate")
        @ExcludeMissing
        private val servicePeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("servicePeriodStartDate")
        @ExcludeMissing
        private val servicePeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("usagePerPricingBand")
        @ExcludeMissing
        private val usagePerPricingBand: JsonField<List<UsagePerPricingBand>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The average unit price across all tiers / pricing bands. */
        fun averageUnitPrice(): Double = averageUnitPrice.getRequired("averageUnitPrice")

        /** The currency conversion rate if currency conversion is required for the line item. */
        fun conversionRate(): Double = conversionRate.getRequired("conversionRate")

        /** The converted subtotal amount if currency conversions have been used. */
        fun convertedSubtotal(): Double = convertedSubtotal.getRequired("convertedSubtotal")

        /**
         * The currency code for the currency used in the line item. For example: USD, GBP, or EUR.
         */
        fun currency(): String = currency.getRequired("currency")

        /** Line item description. */
        fun description(): String = description.getRequired("description")

        fun lineItemType(): LineItemType = lineItemType.getRequired("lineItemType")

        /** The amount of usage for the line item. */
        fun quantity(): Double = quantity.getRequired("quantity")

        /** The subtotal amount for the line item, before any currency conversions. */
        fun subtotal(): Double = subtotal.getRequired("subtotal")

        /**
         * The unit for the usage data in thie line item. For example: **GB** of disk storage space.
         */
        fun unit(): String = unit.getRequired("unit")

        /** The number of units used for the line item. */
        fun units(): Double = units.getRequired("units")

        /** The UUID for the line item. */
        fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

        /** The Aggregation ID used for the line item. */
        fun aggregationId(): Optional<String> =
            Optional.ofNullable(aggregationId.getNullable("aggregationId"))

        fun balanceId(): Optional<String> = Optional.ofNullable(balanceId.getNullable("balanceId"))

        fun chargeId(): Optional<String> = Optional.ofNullable(chargeId.getNullable("chargeId"))

        /**
         * If part of a Parent/Child account billing hierarchy, this is the code for the child
         * Account.
         */
        fun childAccountCode(): Optional<String> =
            Optional.ofNullable(childAccountCode.getNullable("childAccountCode"))

        /** If part of a Parent/Child account billing hierarchy, this is the child Account UUID. */
        fun childAccountId(): Optional<String> =
            Optional.ofNullable(childAccountId.getNullable("childAccountId"))

        /**
         * If Commitments _(prepayments)_ are used in the line item, this shows the Commitment UUID.
         */
        fun commitmentId(): Optional<String> =
            Optional.ofNullable(commitmentId.getNullable("commitmentId"))

        /**
         * The Compound Aggregation ID for the line item if a Compound Aggregation has been used.
         */
        fun compoundAggregationId(): Optional<String> =
            Optional.ofNullable(compoundAggregationId.getNullable("compoundAggregationId"))

        /** The UUID for the Contract used in the line item. */
        fun contractId(): Optional<String> =
            Optional.ofNullable(contractId.getNullable("contractId"))

        fun counterId(): Optional<String> = Optional.ofNullable(counterId.getNullable("counterId"))

        fun creditTypeId(): Optional<String> =
            Optional.ofNullable(creditTypeId.getNullable("creditTypeId"))

        fun group(): Optional<Group> = Optional.ofNullable(group.getNullable("group"))

        /** The UUID of the Meter used in the line item. */
        fun meterId(): Optional<String> = Optional.ofNullable(meterId.getNullable("meterId"))

        /** The UUID of the PlanGroup, provided the line item used a PlanGroup. */
        fun planGroupId(): Optional<String> =
            Optional.ofNullable(planGroupId.getNullable("planGroupId"))

        /** The ID of the Plan used for the line item. */
        fun planId(): Optional<String> = Optional.ofNullable(planId.getNullable("planId"))

        /** The UUID of the Pricing used on the line item. */
        fun pricingId(): Optional<String> = Optional.ofNullable(pricingId.getNullable("pricingId"))

        fun productCode(): Optional<String> =
            Optional.ofNullable(productCode.getNullable("productCode"))

        /** The UUID of the Product for the line item. */
        fun productId(): Optional<String> = Optional.ofNullable(productId.getNullable("productId"))

        /** The name of the Product for the line item. */
        fun productName(): Optional<String> =
            Optional.ofNullable(productName.getNullable("productName"))

        fun reasonId(): Optional<String> = Optional.ofNullable(reasonId.getNullable("reasonId"))

        fun referencedBillId(): Optional<String> =
            Optional.ofNullable(referencedBillId.getNullable("referencedBillId"))

        fun referencedLineItemId(): Optional<String> =
            Optional.ofNullable(referencedLineItemId.getNullable("referencedLineItemId"))

        /**
         * Applies only when segmented Aggregations have been used. The Segment to which the usage
         * data in this line item belongs.
         */
        fun segment(): Optional<Segment> = Optional.ofNullable(segment.getNullable("segment"))

        /** The number used for sequential invoices. */
        fun sequenceNumber(): Optional<Long> =
            Optional.ofNullable(sequenceNumber.getNullable("sequenceNumber"))

        /** The ending date _(exclusive)_ for the service period _(in ISO 8601 format)_. */
        fun servicePeriodEndDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(servicePeriodEndDate.getNullable("servicePeriodEndDate"))

        /** The starting date _(inclusive)_ for the service period _(in ISO 8601 format)_. */
        fun servicePeriodStartDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(servicePeriodStartDate.getNullable("servicePeriodStartDate"))

        /** Shows the usage by pricing band for tiered pricing structures. */
        fun usagePerPricingBand(): Optional<List<UsagePerPricingBand>> =
            Optional.ofNullable(usagePerPricingBand.getNullable("usagePerPricingBand"))

        /** The average unit price across all tiers / pricing bands. */
        @JsonProperty("averageUnitPrice")
        @ExcludeMissing
        fun _averageUnitPrice(): JsonField<Double> = averageUnitPrice

        /** The currency conversion rate if currency conversion is required for the line item. */
        @JsonProperty("conversionRate")
        @ExcludeMissing
        fun _conversionRate(): JsonField<Double> = conversionRate

        /** The converted subtotal amount if currency conversions have been used. */
        @JsonProperty("convertedSubtotal")
        @ExcludeMissing
        fun _convertedSubtotal(): JsonField<Double> = convertedSubtotal

        /**
         * The currency code for the currency used in the line item. For example: USD, GBP, or EUR.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /** Line item description. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        @JsonProperty("lineItemType")
        @ExcludeMissing
        fun _lineItemType(): JsonField<LineItemType> = lineItemType

        /** The amount of usage for the line item. */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        /** The subtotal amount for the line item, before any currency conversions. */
        @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<Double> = subtotal

        /**
         * The unit for the usage data in thie line item. For example: **GB** of disk storage space.
         */
        @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

        /** The number of units used for the line item. */
        @JsonProperty("units") @ExcludeMissing fun _units(): JsonField<Double> = units

        /** The UUID for the line item. */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /** The Aggregation ID used for the line item. */
        @JsonProperty("aggregationId")
        @ExcludeMissing
        fun _aggregationId(): JsonField<String> = aggregationId

        @JsonProperty("balanceId") @ExcludeMissing fun _balanceId(): JsonField<String> = balanceId

        @JsonProperty("chargeId") @ExcludeMissing fun _chargeId(): JsonField<String> = chargeId

        /**
         * If part of a Parent/Child account billing hierarchy, this is the code for the child
         * Account.
         */
        @JsonProperty("childAccountCode")
        @ExcludeMissing
        fun _childAccountCode(): JsonField<String> = childAccountCode

        /** If part of a Parent/Child account billing hierarchy, this is the child Account UUID. */
        @JsonProperty("childAccountId")
        @ExcludeMissing
        fun _childAccountId(): JsonField<String> = childAccountId

        /**
         * If Commitments _(prepayments)_ are used in the line item, this shows the Commitment UUID.
         */
        @JsonProperty("commitmentId")
        @ExcludeMissing
        fun _commitmentId(): JsonField<String> = commitmentId

        /**
         * The Compound Aggregation ID for the line item if a Compound Aggregation has been used.
         */
        @JsonProperty("compoundAggregationId")
        @ExcludeMissing
        fun _compoundAggregationId(): JsonField<String> = compoundAggregationId

        /** The UUID for the Contract used in the line item. */
        @JsonProperty("contractId")
        @ExcludeMissing
        fun _contractId(): JsonField<String> = contractId

        @JsonProperty("counterId") @ExcludeMissing fun _counterId(): JsonField<String> = counterId

        @JsonProperty("creditTypeId")
        @ExcludeMissing
        fun _creditTypeId(): JsonField<String> = creditTypeId

        @JsonProperty("group") @ExcludeMissing fun _group(): JsonField<Group> = group

        /** The UUID of the Meter used in the line item. */
        @JsonProperty("meterId") @ExcludeMissing fun _meterId(): JsonField<String> = meterId

        /** The UUID of the PlanGroup, provided the line item used a PlanGroup. */
        @JsonProperty("planGroupId")
        @ExcludeMissing
        fun _planGroupId(): JsonField<String> = planGroupId

        /** The ID of the Plan used for the line item. */
        @JsonProperty("planId") @ExcludeMissing fun _planId(): JsonField<String> = planId

        /** The UUID of the Pricing used on the line item. */
        @JsonProperty("pricingId") @ExcludeMissing fun _pricingId(): JsonField<String> = pricingId

        @JsonProperty("productCode")
        @ExcludeMissing
        fun _productCode(): JsonField<String> = productCode

        /** The UUID of the Product for the line item. */
        @JsonProperty("productId") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /** The name of the Product for the line item. */
        @JsonProperty("productName")
        @ExcludeMissing
        fun _productName(): JsonField<String> = productName

        @JsonProperty("reasonId") @ExcludeMissing fun _reasonId(): JsonField<String> = reasonId

        @JsonProperty("referencedBillId")
        @ExcludeMissing
        fun _referencedBillId(): JsonField<String> = referencedBillId

        @JsonProperty("referencedLineItemId")
        @ExcludeMissing
        fun _referencedLineItemId(): JsonField<String> = referencedLineItemId

        /**
         * Applies only when segmented Aggregations have been used. The Segment to which the usage
         * data in this line item belongs.
         */
        @JsonProperty("segment") @ExcludeMissing fun _segment(): JsonField<Segment> = segment

        /** The number used for sequential invoices. */
        @JsonProperty("sequenceNumber")
        @ExcludeMissing
        fun _sequenceNumber(): JsonField<Long> = sequenceNumber

        /** The ending date _(exclusive)_ for the service period _(in ISO 8601 format)_. */
        @JsonProperty("servicePeriodEndDate")
        @ExcludeMissing
        fun _servicePeriodEndDate(): JsonField<OffsetDateTime> = servicePeriodEndDate

        /** The starting date _(inclusive)_ for the service period _(in ISO 8601 format)_. */
        @JsonProperty("servicePeriodStartDate")
        @ExcludeMissing
        fun _servicePeriodStartDate(): JsonField<OffsetDateTime> = servicePeriodStartDate

        /** Shows the usage by pricing band for tiered pricing structures. */
        @JsonProperty("usagePerPricingBand")
        @ExcludeMissing
        fun _usagePerPricingBand(): JsonField<List<UsagePerPricingBand>> = usagePerPricingBand

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
            lineItemType()
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

        fun toBuilder() = Builder().from(this)

        companion object {

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

            /** The average unit price across all tiers / pricing bands. */
            fun averageUnitPrice(averageUnitPrice: JsonField<Double>) = apply {
                this.averageUnitPrice = averageUnitPrice
            }

            /**
             * The currency conversion rate if currency conversion is required for the line item.
             */
            fun conversionRate(conversionRate: Double) =
                conversionRate(JsonField.of(conversionRate))

            /**
             * The currency conversion rate if currency conversion is required for the line item.
             */
            fun conversionRate(conversionRate: JsonField<Double>) = apply {
                this.conversionRate = conversionRate
            }

            /** The converted subtotal amount if currency conversions have been used. */
            fun convertedSubtotal(convertedSubtotal: Double) =
                convertedSubtotal(JsonField.of(convertedSubtotal))

            /** The converted subtotal amount if currency conversions have been used. */
            fun convertedSubtotal(convertedSubtotal: JsonField<Double>) = apply {
                this.convertedSubtotal = convertedSubtotal
            }

            /**
             * The currency code for the currency used in the line item. For example: USD, GBP, or
             * EUR.
             */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * The currency code for the currency used in the line item. For example: USD, GBP, or
             * EUR.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** Line item description. */
            fun description(description: String) = description(JsonField.of(description))

            /** Line item description. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun lineItemType(lineItemType: LineItemType) = lineItemType(JsonField.of(lineItemType))

            fun lineItemType(lineItemType: JsonField<LineItemType>) = apply {
                this.lineItemType = lineItemType
            }

            /** The amount of usage for the line item. */
            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            /** The amount of usage for the line item. */
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            /** The subtotal amount for the line item, before any currency conversions. */
            fun subtotal(subtotal: Double) = subtotal(JsonField.of(subtotal))

            /** The subtotal amount for the line item, before any currency conversions. */
            fun subtotal(subtotal: JsonField<Double>) = apply { this.subtotal = subtotal }

            /**
             * The unit for the usage data in thie line item. For example: **GB** of disk storage
             * space.
             */
            fun unit(unit: String) = unit(JsonField.of(unit))

            /**
             * The unit for the usage data in thie line item. For example: **GB** of disk storage
             * space.
             */
            fun unit(unit: JsonField<String>) = apply { this.unit = unit }

            /** The number of units used for the line item. */
            fun units(units: Double) = units(JsonField.of(units))

            /** The number of units used for the line item. */
            fun units(units: JsonField<Double>) = apply { this.units = units }

            /** The UUID for the line item. */
            fun id(id: String) = id(JsonField.of(id))

            /** The UUID for the line item. */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The Aggregation ID used for the line item. */
            fun aggregationId(aggregationId: String) = aggregationId(JsonField.of(aggregationId))

            /** The Aggregation ID used for the line item. */
            fun aggregationId(aggregationId: JsonField<String>) = apply {
                this.aggregationId = aggregationId
            }

            fun balanceId(balanceId: String) = balanceId(JsonField.of(balanceId))

            fun balanceId(balanceId: JsonField<String>) = apply { this.balanceId = balanceId }

            fun chargeId(chargeId: String) = chargeId(JsonField.of(chargeId))

            fun chargeId(chargeId: JsonField<String>) = apply { this.chargeId = chargeId }

            /**
             * If part of a Parent/Child account billing hierarchy, this is the code for the child
             * Account.
             */
            fun childAccountCode(childAccountCode: String) =
                childAccountCode(JsonField.of(childAccountCode))

            /**
             * If part of a Parent/Child account billing hierarchy, this is the code for the child
             * Account.
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
             * If part of a Parent/Child account billing hierarchy, this is the child Account UUID.
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
             * If Commitments _(prepayments)_ are used in the line item, this shows the Commitment
             * UUID.
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
             * The Compound Aggregation ID for the line item if a Compound Aggregation has been
             * used.
             */
            fun compoundAggregationId(compoundAggregationId: JsonField<String>) = apply {
                this.compoundAggregationId = compoundAggregationId
            }

            /** The UUID for the Contract used in the line item. */
            fun contractId(contractId: String) = contractId(JsonField.of(contractId))

            /** The UUID for the Contract used in the line item. */
            fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

            fun counterId(counterId: String) = counterId(JsonField.of(counterId))

            fun counterId(counterId: JsonField<String>) = apply { this.counterId = counterId }

            fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

            fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                this.creditTypeId = creditTypeId
            }

            fun group(group: Group) = group(JsonField.of(group))

            fun group(group: JsonField<Group>) = apply { this.group = group }

            /** The UUID of the Meter used in the line item. */
            fun meterId(meterId: String) = meterId(JsonField.of(meterId))

            /** The UUID of the Meter used in the line item. */
            fun meterId(meterId: JsonField<String>) = apply { this.meterId = meterId }

            /** The UUID of the PlanGroup, provided the line item used a PlanGroup. */
            fun planGroupId(planGroupId: String) = planGroupId(JsonField.of(planGroupId))

            /** The UUID of the PlanGroup, provided the line item used a PlanGroup. */
            fun planGroupId(planGroupId: JsonField<String>) = apply {
                this.planGroupId = planGroupId
            }

            /** The ID of the Plan used for the line item. */
            fun planId(planId: String) = planId(JsonField.of(planId))

            /** The ID of the Plan used for the line item. */
            fun planId(planId: JsonField<String>) = apply { this.planId = planId }

            /** The UUID of the Pricing used on the line item. */
            fun pricingId(pricingId: String) = pricingId(JsonField.of(pricingId))

            /** The UUID of the Pricing used on the line item. */
            fun pricingId(pricingId: JsonField<String>) = apply { this.pricingId = pricingId }

            fun productCode(productCode: String) = productCode(JsonField.of(productCode))

            fun productCode(productCode: JsonField<String>) = apply {
                this.productCode = productCode
            }

            /** The UUID of the Product for the line item. */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /** The UUID of the Product for the line item. */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /** The name of the Product for the line item. */
            fun productName(productName: String) = productName(JsonField.of(productName))

            /** The name of the Product for the line item. */
            fun productName(productName: JsonField<String>) = apply {
                this.productName = productName
            }

            fun reasonId(reasonId: String) = reasonId(JsonField.of(reasonId))

            fun reasonId(reasonId: JsonField<String>) = apply { this.reasonId = reasonId }

            fun referencedBillId(referencedBillId: String) =
                referencedBillId(JsonField.of(referencedBillId))

            fun referencedBillId(referencedBillId: JsonField<String>) = apply {
                this.referencedBillId = referencedBillId
            }

            fun referencedLineItemId(referencedLineItemId: String) =
                referencedLineItemId(JsonField.of(referencedLineItemId))

            fun referencedLineItemId(referencedLineItemId: JsonField<String>) = apply {
                this.referencedLineItemId = referencedLineItemId
            }

            /**
             * Applies only when segmented Aggregations have been used. The Segment to which the
             * usage data in this line item belongs.
             */
            fun segment(segment: Segment) = segment(JsonField.of(segment))

            /**
             * Applies only when segmented Aggregations have been used. The Segment to which the
             * usage data in this line item belongs.
             */
            fun segment(segment: JsonField<Segment>) = apply { this.segment = segment }

            /** The number used for sequential invoices. */
            fun sequenceNumber(sequenceNumber: Long) = sequenceNumber(JsonField.of(sequenceNumber))

            /** The number used for sequential invoices. */
            fun sequenceNumber(sequenceNumber: JsonField<Long>) = apply {
                this.sequenceNumber = sequenceNumber
            }

            /** The ending date _(exclusive)_ for the service period _(in ISO 8601 format)_. */
            fun servicePeriodEndDate(servicePeriodEndDate: OffsetDateTime) =
                servicePeriodEndDate(JsonField.of(servicePeriodEndDate))

            /** The ending date _(exclusive)_ for the service period _(in ISO 8601 format)_. */
            fun servicePeriodEndDate(servicePeriodEndDate: JsonField<OffsetDateTime>) = apply {
                this.servicePeriodEndDate = servicePeriodEndDate
            }

            /** The starting date _(inclusive)_ for the service period _(in ISO 8601 format)_. */
            fun servicePeriodStartDate(servicePeriodStartDate: OffsetDateTime) =
                servicePeriodStartDate(JsonField.of(servicePeriodStartDate))

            /** The starting date _(inclusive)_ for the service period _(in ISO 8601 format)_. */
            fun servicePeriodStartDate(servicePeriodStartDate: JsonField<OffsetDateTime>) = apply {
                this.servicePeriodStartDate = servicePeriodStartDate
            }

            /** Shows the usage by pricing band for tiered pricing structures. */
            fun usagePerPricingBand(usagePerPricingBand: List<UsagePerPricingBand>) =
                usagePerPricingBand(JsonField.of(usagePerPricingBand))

            /** Shows the usage by pricing band for tiered pricing structures. */
            fun usagePerPricingBand(usagePerPricingBand: JsonField<List<UsagePerPricingBand>>) =
                apply {
                    this.usagePerPricingBand = usagePerPricingBand.map { it.toMutableList() }
                }

            /** Shows the usage by pricing band for tiered pricing structures. */
            fun addUsagePerPricingBand(usagePerPricingBand: UsagePerPricingBand) = apply {
                this.usagePerPricingBand =
                    (this.usagePerPricingBand ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(usagePerPricingBand)
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
                    additionalProperties.toImmutable(),
                )
        }

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LineItemType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class Group
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Group = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun build(): Group = Group(additionalProperties.toImmutable())
            }

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
        @NoAutoDetect
        class Segment
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Segment = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun build(): Segment = Segment(additionalProperties.toImmutable())
            }

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
        @NoAutoDetect
        class UsagePerPricingBand
        @JsonCreator
        private constructor(
            @JsonProperty("bandQuantity")
            @ExcludeMissing
            private val bandQuantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("bandSubtotal")
            @ExcludeMissing
            private val bandSubtotal: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("bandUnits")
            @ExcludeMissing
            private val bandUnits: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("creditTypeId")
            @ExcludeMissing
            private val creditTypeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fixedPrice")
            @ExcludeMissing
            private val fixedPrice: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("lowerLimit")
            @ExcludeMissing
            private val lowerLimit: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("pricingBandId")
            @ExcludeMissing
            private val pricingBandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("unitPrice")
            @ExcludeMissing
            private val unitPrice: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("unitSubtotal")
            @ExcludeMissing
            private val unitSubtotal: JsonField<Double> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Usage amount within the band. */
            fun bandQuantity(): Optional<Double> =
                Optional.ofNullable(bandQuantity.getNullable("bandQuantity"))

            /** Subtotal amount for the band. */
            fun bandSubtotal(): Optional<Double> =
                Optional.ofNullable(bandSubtotal.getNullable("bandSubtotal"))

            /** The number of units used within the band. */
            fun bandUnits(): Optional<Double> =
                Optional.ofNullable(bandUnits.getNullable("bandUnits"))

            /** The UUID of the credit type. */
            fun creditTypeId(): Optional<String> =
                Optional.ofNullable(creditTypeId.getNullable("creditTypeId"))

            /**
             * Fixed price is a charge entered for certain pricing types such as Stairstep, Custom
             * Tiered, and Custom Volume. It is a set price and not dependent on usage.
             */
            fun fixedPrice(): Optional<Double> =
                Optional.ofNullable(fixedPrice.getNullable("fixedPrice"))

            /** The lower limit _(start)_ of the pricing band. */
            fun lowerLimit(): Optional<Double> =
                Optional.ofNullable(lowerLimit.getNullable("lowerLimit"))

            /** The UUID for the pricing band. */
            fun pricingBandId(): Optional<String> =
                Optional.ofNullable(pricingBandId.getNullable("pricingBandId"))

            /** The price per unit in the band. */
            fun unitPrice(): Optional<Double> =
                Optional.ofNullable(unitPrice.getNullable("unitPrice"))

            /** The subtotal of the unit usage. */
            fun unitSubtotal(): Optional<Double> =
                Optional.ofNullable(unitSubtotal.getNullable("unitSubtotal"))

            /** Usage amount within the band. */
            @JsonProperty("bandQuantity")
            @ExcludeMissing
            fun _bandQuantity(): JsonField<Double> = bandQuantity

            /** Subtotal amount for the band. */
            @JsonProperty("bandSubtotal")
            @ExcludeMissing
            fun _bandSubtotal(): JsonField<Double> = bandSubtotal

            /** The number of units used within the band. */
            @JsonProperty("bandUnits")
            @ExcludeMissing
            fun _bandUnits(): JsonField<Double> = bandUnits

            /** The UUID of the credit type. */
            @JsonProperty("creditTypeId")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

            /**
             * Fixed price is a charge entered for certain pricing types such as Stairstep, Custom
             * Tiered, and Custom Volume. It is a set price and not dependent on usage.
             */
            @JsonProperty("fixedPrice")
            @ExcludeMissing
            fun _fixedPrice(): JsonField<Double> = fixedPrice

            /** The lower limit _(start)_ of the pricing band. */
            @JsonProperty("lowerLimit")
            @ExcludeMissing
            fun _lowerLimit(): JsonField<Double> = lowerLimit

            /** The UUID for the pricing band. */
            @JsonProperty("pricingBandId")
            @ExcludeMissing
            fun _pricingBandId(): JsonField<String> = pricingBandId

            /** The price per unit in the band. */
            @JsonProperty("unitPrice")
            @ExcludeMissing
            fun _unitPrice(): JsonField<Double> = unitPrice

            /** The subtotal of the unit usage. */
            @JsonProperty("unitSubtotal")
            @ExcludeMissing
            fun _unitSubtotal(): JsonField<Double> = unitSubtotal

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            fun toBuilder() = Builder().from(this)

            companion object {

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

                /** Usage amount within the band. */
                fun bandQuantity(bandQuantity: JsonField<Double>) = apply {
                    this.bandQuantity = bandQuantity
                }

                /** Subtotal amount for the band. */
                fun bandSubtotal(bandSubtotal: Double) = bandSubtotal(JsonField.of(bandSubtotal))

                /** Subtotal amount for the band. */
                fun bandSubtotal(bandSubtotal: JsonField<Double>) = apply {
                    this.bandSubtotal = bandSubtotal
                }

                /** The number of units used within the band. */
                fun bandUnits(bandUnits: Double) = bandUnits(JsonField.of(bandUnits))

                /** The number of units used within the band. */
                fun bandUnits(bandUnits: JsonField<Double>) = apply { this.bandUnits = bandUnits }

                /** The UUID of the credit type. */
                fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

                /** The UUID of the credit type. */
                fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                    this.creditTypeId = creditTypeId
                }

                /**
                 * Fixed price is a charge entered for certain pricing types such as Stairstep,
                 * Custom Tiered, and Custom Volume. It is a set price and not dependent on usage.
                 */
                fun fixedPrice(fixedPrice: Double) = fixedPrice(JsonField.of(fixedPrice))

                /**
                 * Fixed price is a charge entered for certain pricing types such as Stairstep,
                 * Custom Tiered, and Custom Volume. It is a set price and not dependent on usage.
                 */
                fun fixedPrice(fixedPrice: JsonField<Double>) = apply {
                    this.fixedPrice = fixedPrice
                }

                /** The lower limit _(start)_ of the pricing band. */
                fun lowerLimit(lowerLimit: Double) = lowerLimit(JsonField.of(lowerLimit))

                /** The lower limit _(start)_ of the pricing band. */
                fun lowerLimit(lowerLimit: JsonField<Double>) = apply {
                    this.lowerLimit = lowerLimit
                }

                /** The UUID for the pricing band. */
                fun pricingBandId(pricingBandId: String) =
                    pricingBandId(JsonField.of(pricingBandId))

                /** The UUID for the pricing band. */
                fun pricingBandId(pricingBandId: JsonField<String>) = apply {
                    this.pricingBandId = pricingBandId
                }

                /** The price per unit in the band. */
                fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                /** The price per unit in the band. */
                fun unitPrice(unitPrice: JsonField<Double>) = apply { this.unitPrice = unitPrice }

                /** The subtotal of the unit usage. */
                fun unitSubtotal(unitSubtotal: Double) = unitSubtotal(JsonField.of(unitSubtotal))

                /** The subtotal of the unit usage. */
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
                        additionalProperties.toImmutable(),
                    )
            }

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

        return /* spotless:off */ other is Bill && id == other.id && version == other.version && accountCode == other.accountCode && accountId == other.accountId && billDate == other.billDate && billFrequencyInterval == other.billFrequencyInterval && billingFrequency == other.billingFrequency && billJobId == other.billJobId && billTotal == other.billTotal && createdBy == other.createdBy && createdDate == other.createdDate && csvStatementGenerated == other.csvStatementGenerated && currency == other.currency && currencyConversions == other.currencyConversions && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && dueDate == other.dueDate && endDate == other.endDate && endDateTimeUtc == other.endDateTimeUtc && externalInvoiceDate == other.externalInvoiceDate && externalInvoiceReference == other.externalInvoiceReference && jsonStatementGenerated == other.jsonStatementGenerated && lastCalculatedDate == other.lastCalculatedDate && lastModifiedBy == other.lastModifiedBy && lineItems == other.lineItems && locked == other.locked && purchaseOrderNumber == other.purchaseOrderNumber && sequentialInvoiceNumber == other.sequentialInvoiceNumber && startDate == other.startDate && startDateTimeUtc == other.startDateTimeUtc && status == other.status && timezone == other.timezone && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, accountCode, accountId, billDate, billFrequencyInterval, billingFrequency, billJobId, billTotal, createdBy, createdDate, csvStatementGenerated, currency, currencyConversions, dtCreated, dtLastModified, dueDate, endDate, endDateTimeUtc, externalInvoiceDate, externalInvoiceReference, jsonStatementGenerated, lastCalculatedDate, lastModifiedBy, lineItems, locked, purchaseOrderNumber, sequentialInvoiceNumber, startDate, startDateTimeUtc, status, timezone, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Bill{id=$id, version=$version, accountCode=$accountCode, accountId=$accountId, billDate=$billDate, billFrequencyInterval=$billFrequencyInterval, billingFrequency=$billingFrequency, billJobId=$billJobId, billTotal=$billTotal, createdBy=$createdBy, createdDate=$createdDate, csvStatementGenerated=$csvStatementGenerated, currency=$currency, currencyConversions=$currencyConversions, dtCreated=$dtCreated, dtLastModified=$dtLastModified, dueDate=$dueDate, endDate=$endDate, endDateTimeUtc=$endDateTimeUtc, externalInvoiceDate=$externalInvoiceDate, externalInvoiceReference=$externalInvoiceReference, jsonStatementGenerated=$jsonStatementGenerated, lastCalculatedDate=$lastCalculatedDate, lastModifiedBy=$lastModifiedBy, lineItems=$lineItems, locked=$locked, purchaseOrderNumber=$purchaseOrderNumber, sequentialInvoiceNumber=$sequentialInvoiceNumber, startDate=$startDate, startDateTimeUtc=$startDateTimeUtc, status=$status, timezone=$timezone, additionalProperties=$additionalProperties}"
}
