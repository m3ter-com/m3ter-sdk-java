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
import com.m3ter.core.checkRequired
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BalanceChargeScheduleUpdateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val chargeDescription: JsonField<String>,
    private val amount: JsonField<Double>,
    private val balanceId: JsonField<String>,
    private val billEpoch: JsonField<LocalDate>,
    private val billFrequency: JsonField<BillFrequency>,
    private val billFrequencyInterval: JsonField<Int>,
    private val billInAdvance: JsonField<Boolean>,
    private val code: JsonField<String>,
    private val createdBy: JsonField<String>,
    private val currency: JsonField<String>,
    private val customFields: JsonField<CustomFields>,
    private val dtCreated: JsonField<OffsetDateTime>,
    private val dtLastModified: JsonField<OffsetDateTime>,
    private val lastModifiedBy: JsonField<String>,
    private val name: JsonField<String>,
    private val nextRun: JsonField<OffsetDateTime>,
    private val previousRun: JsonField<OffsetDateTime>,
    private val servicePeriodEndDate: JsonField<OffsetDateTime>,
    private val servicePeriodStartDate: JsonField<OffsetDateTime>,
    private val unitPrice: JsonField<Double>,
    private val units: JsonField<Double>,
    private val version: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("chargeDescription")
        @ExcludeMissing
        chargeDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("balanceId") @ExcludeMissing balanceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billEpoch")
        @ExcludeMissing
        billEpoch: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("billFrequency")
        @ExcludeMissing
        billFrequency: JsonField<BillFrequency> = JsonMissing.of(),
        @JsonProperty("billFrequencyInterval")
        @ExcludeMissing
        billFrequencyInterval: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("billInAdvance")
        @ExcludeMissing
        billInAdvance: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customFields")
        @ExcludeMissing
        customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("dtCreated")
        @ExcludeMissing
        dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        lastModifiedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("nextRun")
        @ExcludeMissing
        nextRun: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("previousRun")
        @ExcludeMissing
        previousRun: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("servicePeriodEndDate")
        @ExcludeMissing
        servicePeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("servicePeriodStartDate")
        @ExcludeMissing
        servicePeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("unitPrice") @ExcludeMissing unitPrice: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("units") @ExcludeMissing units: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        chargeDescription,
        amount,
        balanceId,
        billEpoch,
        billFrequency,
        billFrequencyInterval,
        billInAdvance,
        code,
        createdBy,
        currency,
        customFields,
        dtCreated,
        dtLastModified,
        lastModifiedBy,
        name,
        nextRun,
        previousRun,
        servicePeriodEndDate,
        servicePeriodStartDate,
        unitPrice,
        units,
        version,
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
     * The description for Charges created by the Balance Charge Schedule. Used on Bills for Charge
     * line items.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun chargeDescription(): String = chargeDescription.getRequired("chargeDescription")

    /**
     * The amount of each Charge created by the Balance Charge Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amount(): Optional<Double> = amount.getOptional("amount")

    /**
     * The unique identifier (UUID) for the Balance this Balance Charge Schedule was created for.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun balanceId(): Optional<String> = balanceId.getOptional("balanceId")

    /**
     * Specifies a billing cycle date (*in ISO-8601 format*) for when the first Bill is generated
     * for Balance Charges created by the Schedule, and also acts as a reference for when in the
     * Schedule period subsequent Bills are created for the defined `billFrequency`. If blank, then
     * the relevant Epoch date from your Organization's configuration is used.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billEpoch(): Optional<LocalDate> = billEpoch.getOptional("billEpoch")

    /**
     * Represents standard scheduling frequencies options for a job.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billFrequency(): Optional<BillFrequency> = billFrequency.getOptional("billFrequency")

    /**
     * How often Bills are issued. For example, if billFrequency is `MONTHLY` and
     * `billFrequencyInterval` is 3, Bills are issued every three months.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billFrequencyInterval(): Optional<Int> =
        billFrequencyInterval.getOptional("billFrequencyInterval")

    /**
     * Specifies how Charges created by the Balance Charge Schedule are billed - either in arrears
     * or in advance:
     * * If `false` then billing is in arrears.
     * * If `true` then billing is in advance.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billInAdvance(): Optional<Boolean> = billInAdvance.getOptional("billInAdvance")

    /**
     * Unique short code for the Balance Charge Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun code(): Optional<String> = code.getOptional("code")

    /**
     * The unique identifier (UUID) of the user who created the Balance Charge Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * The currency of the Charges created by the Balance Charge Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currency(): Optional<String> = currency.getOptional("currency")

    /**
     * User defined fields enabling you to attach custom data. The value for a custom field can be
     * either a string or a number.
     *
     * If `customFields` can also be defined for this entity at the Organizational
     * level,`customField` values defined at individual level override values of `customFields` with
     * the same name defined at Organization level.
     *
     * See
     * [Working with Custom Fields](https://www.m3ter.com/docs/guides/creating-and-managing-products/working-with-custom-fields)
     * in the m3ter documentation for more information.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customFields(): Optional<CustomFields> = customFields.getOptional("customFields")

    /**
     * The date and time (*in ISO-8601 format*) when the Balance Charge Schedule was created.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtCreated(): Optional<OffsetDateTime> = dtCreated.getOptional("dtCreated")

    /**
     * The date and time (*in ISO-8601 format*) when the Balance Charge Schedule was last modified.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtLastModified(): Optional<OffsetDateTime> = dtLastModified.getOptional("dtLastModified")

    /**
     * The unique identifier (UUID) for the user who last modified the Balance Charge Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedBy(): Optional<String> = lastModifiedBy.getOptional("lastModifiedBy")

    /**
     * The name of the Balance Charge Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * The date and time (*in ISO-8601 format*) when the next Charge will be created by the Balance
     * Charge Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextRun(): Optional<OffsetDateTime> = nextRun.getOptional("nextRun")

    /**
     * The date and time (*in ISO-8601 format*) when the previous Charge was generated by the
     * Balance Charge Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun previousRun(): Optional<OffsetDateTime> = previousRun.getOptional("previousRun")

    /**
     * The service period end date (*in ISO-8601 format*) of the Balance Charge Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun servicePeriodEndDate(): Optional<OffsetDateTime> =
        servicePeriodEndDate.getOptional("servicePeriodEndDate")

    /**
     * The service period start date (*in ISO-8601 format*) of the Balance Charge Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun servicePeriodStartDate(): Optional<OffsetDateTime> =
        servicePeriodStartDate.getOptional("servicePeriodStartDate")

    /**
     * Unit price. If the Charge was created with `amount` only, then will be null.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unitPrice(): Optional<Double> = unitPrice.getOptional("unitPrice")

    /**
     * Number of units. If the Charge was created with `amount` only, then will be null.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun units(): Optional<Double> = units.getOptional("units")

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
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [chargeDescription].
     *
     * Unlike [chargeDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("chargeDescription")
    @ExcludeMissing
    fun _chargeDescription(): JsonField<String> = chargeDescription

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

    /**
     * Returns the raw JSON value of [balanceId].
     *
     * Unlike [balanceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("balanceId") @ExcludeMissing fun _balanceId(): JsonField<String> = balanceId

    /**
     * Returns the raw JSON value of [billEpoch].
     *
     * Unlike [billEpoch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billEpoch") @ExcludeMissing fun _billEpoch(): JsonField<LocalDate> = billEpoch

    /**
     * Returns the raw JSON value of [billFrequency].
     *
     * Unlike [billFrequency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billFrequency")
    @ExcludeMissing
    fun _billFrequency(): JsonField<BillFrequency> = billFrequency

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
     * Returns the raw JSON value of [billInAdvance].
     *
     * Unlike [billInAdvance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billInAdvance")
    @ExcludeMissing
    fun _billInAdvance(): JsonField<Boolean> = billInAdvance

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

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
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customFields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

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
     * Returns the raw JSON value of [lastModifiedBy].
     *
     * Unlike [lastModifiedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [nextRun].
     *
     * Unlike [nextRun], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nextRun") @ExcludeMissing fun _nextRun(): JsonField<OffsetDateTime> = nextRun

    /**
     * Returns the raw JSON value of [previousRun].
     *
     * Unlike [previousRun], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("previousRun")
    @ExcludeMissing
    fun _previousRun(): JsonField<OffsetDateTime> = previousRun

    /**
     * Returns the raw JSON value of [servicePeriodEndDate].
     *
     * Unlike [servicePeriodEndDate], this method doesn't throw if the JSON field has an unexpected
     * type.
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
     * Returns the raw JSON value of [unitPrice].
     *
     * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unitPrice") @ExcludeMissing fun _unitPrice(): JsonField<Double> = unitPrice

    /**
     * Returns the raw JSON value of [units].
     *
     * Unlike [units], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("units") @ExcludeMissing fun _units(): JsonField<Double> = units

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
         * Returns a mutable builder for constructing an instance of
         * [BalanceChargeScheduleUpdateResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .chargeDescription()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BalanceChargeScheduleUpdateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var chargeDescription: JsonField<String>? = null
        private var amount: JsonField<Double> = JsonMissing.of()
        private var balanceId: JsonField<String> = JsonMissing.of()
        private var billEpoch: JsonField<LocalDate> = JsonMissing.of()
        private var billFrequency: JsonField<BillFrequency> = JsonMissing.of()
        private var billFrequencyInterval: JsonField<Int> = JsonMissing.of()
        private var billInAdvance: JsonField<Boolean> = JsonMissing.of()
        private var code: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var nextRun: JsonField<OffsetDateTime> = JsonMissing.of()
        private var previousRun: JsonField<OffsetDateTime> = JsonMissing.of()
        private var servicePeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var servicePeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var unitPrice: JsonField<Double> = JsonMissing.of()
        private var units: JsonField<Double> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            balanceChargeScheduleUpdateResponse: BalanceChargeScheduleUpdateResponse
        ) = apply {
            id = balanceChargeScheduleUpdateResponse.id
            chargeDescription = balanceChargeScheduleUpdateResponse.chargeDescription
            amount = balanceChargeScheduleUpdateResponse.amount
            balanceId = balanceChargeScheduleUpdateResponse.balanceId
            billEpoch = balanceChargeScheduleUpdateResponse.billEpoch
            billFrequency = balanceChargeScheduleUpdateResponse.billFrequency
            billFrequencyInterval = balanceChargeScheduleUpdateResponse.billFrequencyInterval
            billInAdvance = balanceChargeScheduleUpdateResponse.billInAdvance
            code = balanceChargeScheduleUpdateResponse.code
            createdBy = balanceChargeScheduleUpdateResponse.createdBy
            currency = balanceChargeScheduleUpdateResponse.currency
            customFields = balanceChargeScheduleUpdateResponse.customFields
            dtCreated = balanceChargeScheduleUpdateResponse.dtCreated
            dtLastModified = balanceChargeScheduleUpdateResponse.dtLastModified
            lastModifiedBy = balanceChargeScheduleUpdateResponse.lastModifiedBy
            name = balanceChargeScheduleUpdateResponse.name
            nextRun = balanceChargeScheduleUpdateResponse.nextRun
            previousRun = balanceChargeScheduleUpdateResponse.previousRun
            servicePeriodEndDate = balanceChargeScheduleUpdateResponse.servicePeriodEndDate
            servicePeriodStartDate = balanceChargeScheduleUpdateResponse.servicePeriodStartDate
            unitPrice = balanceChargeScheduleUpdateResponse.unitPrice
            units = balanceChargeScheduleUpdateResponse.units
            version = balanceChargeScheduleUpdateResponse.version
            additionalProperties =
                balanceChargeScheduleUpdateResponse.additionalProperties.toMutableMap()
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
         * The description for Charges created by the Balance Charge Schedule. Used on Bills for
         * Charge line items.
         */
        fun chargeDescription(chargeDescription: String) =
            chargeDescription(JsonField.of(chargeDescription))

        /**
         * Sets [Builder.chargeDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chargeDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun chargeDescription(chargeDescription: JsonField<String>) = apply {
            this.chargeDescription = chargeDescription
        }

        /** The amount of each Charge created by the Balance Charge Schedule. */
        fun amount(amount: Double) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

        /**
         * The unique identifier (UUID) for the Balance this Balance Charge Schedule was created
         * for.
         */
        fun balanceId(balanceId: String) = balanceId(JsonField.of(balanceId))

        /**
         * Sets [Builder.balanceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.balanceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun balanceId(balanceId: JsonField<String>) = apply { this.balanceId = balanceId }

        /**
         * Specifies a billing cycle date (*in ISO-8601 format*) for when the first Bill is
         * generated for Balance Charges created by the Schedule, and also acts as a reference for
         * when in the Schedule period subsequent Bills are created for the defined `billFrequency`.
         * If blank, then the relevant Epoch date from your Organization's configuration is used.
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

        /** Represents standard scheduling frequencies options for a job. */
        fun billFrequency(billFrequency: BillFrequency) = billFrequency(JsonField.of(billFrequency))

        /**
         * Sets [Builder.billFrequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billFrequency] with a well-typed [BillFrequency] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billFrequency(billFrequency: JsonField<BillFrequency>) = apply {
            this.billFrequency = billFrequency
        }

        /**
         * How often Bills are issued. For example, if billFrequency is `MONTHLY` and
         * `billFrequencyInterval` is 3, Bills are issued every three months.
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
         * Specifies how Charges created by the Balance Charge Schedule are billed - either in
         * arrears or in advance:
         * * If `false` then billing is in arrears.
         * * If `true` then billing is in advance.
         */
        fun billInAdvance(billInAdvance: Boolean) = billInAdvance(JsonField.of(billInAdvance))

        /**
         * Sets [Builder.billInAdvance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billInAdvance] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billInAdvance(billInAdvance: JsonField<Boolean>) = apply {
            this.billInAdvance = billInAdvance
        }

        /** Unique short code for the Balance Charge Schedule. */
        fun code(code: String) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** The unique identifier (UUID) of the user who created the Balance Charge Schedule. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The currency of the Charges created by the Balance Charge Schedule. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * User defined fields enabling you to attach custom data. The value for a custom field can
         * be either a string or a number.
         *
         * If `customFields` can also be defined for this entity at the Organizational
         * level,`customField` values defined at individual level override values of `customFields`
         * with the same name defined at Organization level.
         *
         * See
         * [Working with Custom Fields](https://www.m3ter.com/docs/guides/creating-and-managing-products/working-with-custom-fields)
         * in the m3ter documentation for more information.
         */
        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        /**
         * Sets [Builder.customFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
        }

        /**
         * The date and time (*in ISO-8601 format*) when the Balance Charge Schedule was created.
         */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /**
         * Sets [Builder.dtCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /**
         * The date and time (*in ISO-8601 format*) when the Balance Charge Schedule was last
         * modified.
         */
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
         * The unique identifier (UUID) for the user who last modified the Balance Charge Schedule.
         */
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

        /** The name of the Balance Charge Schedule. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * The date and time (*in ISO-8601 format*) when the next Charge will be created by the
         * Balance Charge Schedule.
         */
        fun nextRun(nextRun: OffsetDateTime) = nextRun(JsonField.of(nextRun))

        /**
         * Sets [Builder.nextRun] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextRun] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun nextRun(nextRun: JsonField<OffsetDateTime>) = apply { this.nextRun = nextRun }

        /**
         * The date and time (*in ISO-8601 format*) when the previous Charge was generated by the
         * Balance Charge Schedule.
         */
        fun previousRun(previousRun: OffsetDateTime) = previousRun(JsonField.of(previousRun))

        /**
         * Sets [Builder.previousRun] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previousRun] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun previousRun(previousRun: JsonField<OffsetDateTime>) = apply {
            this.previousRun = previousRun
        }

        /** The service period end date (*in ISO-8601 format*) of the Balance Charge Schedule. */
        fun servicePeriodEndDate(servicePeriodEndDate: OffsetDateTime) =
            servicePeriodEndDate(JsonField.of(servicePeriodEndDate))

        /**
         * Sets [Builder.servicePeriodEndDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.servicePeriodEndDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun servicePeriodEndDate(servicePeriodEndDate: JsonField<OffsetDateTime>) = apply {
            this.servicePeriodEndDate = servicePeriodEndDate
        }

        /** The service period start date (*in ISO-8601 format*) of the Balance Charge Schedule. */
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

        /** Unit price. If the Charge was created with `amount` only, then will be null. */
        fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

        /**
         * Sets [Builder.unitPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unitPrice] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun unitPrice(unitPrice: JsonField<Double>) = apply { this.unitPrice = unitPrice }

        /** Number of units. If the Charge was created with `amount` only, then will be null. */
        fun units(units: Double) = units(JsonField.of(units))

        /**
         * Sets [Builder.units] to an arbitrary JSON value.
         *
         * You should usually call [Builder.units] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun units(units: JsonField<Double>) = apply { this.units = units }

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
         * Returns an immutable instance of [BalanceChargeScheduleUpdateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .chargeDescription()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BalanceChargeScheduleUpdateResponse =
            BalanceChargeScheduleUpdateResponse(
                checkRequired("id", id),
                checkRequired("chargeDescription", chargeDescription),
                amount,
                balanceId,
                billEpoch,
                billFrequency,
                billFrequencyInterval,
                billInAdvance,
                code,
                createdBy,
                currency,
                customFields,
                dtCreated,
                dtLastModified,
                lastModifiedBy,
                name,
                nextRun,
                previousRun,
                servicePeriodEndDate,
                servicePeriodStartDate,
                unitPrice,
                units,
                version,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BalanceChargeScheduleUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        chargeDescription()
        amount()
        balanceId()
        billEpoch()
        billFrequency().ifPresent { it.validate() }
        billFrequencyInterval()
        billInAdvance()
        code()
        createdBy()
        currency()
        customFields().ifPresent { it.validate() }
        dtCreated()
        dtLastModified()
        lastModifiedBy()
        name()
        nextRun()
        previousRun()
        servicePeriodEndDate()
        servicePeriodStartDate()
        unitPrice()
        units()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (chargeDescription.asKnown().isPresent) 1 else 0) +
            (if (amount.asKnown().isPresent) 1 else 0) +
            (if (balanceId.asKnown().isPresent) 1 else 0) +
            (if (billEpoch.asKnown().isPresent) 1 else 0) +
            (billFrequency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (billFrequencyInterval.asKnown().isPresent) 1 else 0) +
            (if (billInAdvance.asKnown().isPresent) 1 else 0) +
            (if (code.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (customFields.asKnown().getOrNull()?.validity() ?: 0) +
            (if (dtCreated.asKnown().isPresent) 1 else 0) +
            (if (dtLastModified.asKnown().isPresent) 1 else 0) +
            (if (lastModifiedBy.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (nextRun.asKnown().isPresent) 1 else 0) +
            (if (previousRun.asKnown().isPresent) 1 else 0) +
            (if (servicePeriodEndDate.asKnown().isPresent) 1 else 0) +
            (if (servicePeriodStartDate.asKnown().isPresent) 1 else 0) +
            (if (unitPrice.asKnown().isPresent) 1 else 0) +
            (if (units.asKnown().isPresent) 1 else 0) +
            (if (version.asKnown().isPresent) 1 else 0)

    /** Represents standard scheduling frequencies options for a job. */
    class BillFrequency @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmStatic fun of(value: String) = BillFrequency(JsonField.of(value))
        }

        /** An enum containing [BillFrequency]'s known values. */
        enum class Known {
            DAILY,
            WEEKLY,
            MONTHLY,
            ANNUALLY,
        }

        /**
         * An enum containing [BillFrequency]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [BillFrequency] can contain an unknown value in a couple of cases:
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
            /**
             * An enum member indicating that [BillFrequency] was instantiated with an unknown
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
                else -> throw M3terInvalidDataException("Unknown BillFrequency: $value")
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

        fun validate(): BillFrequency = apply {
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

            return other is BillFrequency && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * User defined fields enabling you to attach custom data. The value for a custom field can be
     * either a string or a number.
     *
     * If `customFields` can also be defined for this entity at the Organizational
     * level,`customField` values defined at individual level override values of `customFields` with
     * the same name defined at Organization level.
     *
     * See
     * [Working with Custom Fields](https://www.m3ter.com/docs/guides/creating-and-managing-products/working-with-custom-fields)
     * in the m3ter documentation for more information.
     */
    class CustomFields
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

            /** Returns a mutable builder for constructing an instance of [CustomFields]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomFields]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customFields: CustomFields) = apply {
                additionalProperties = customFields.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [CustomFields].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): CustomFields = apply {
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

            return other is CustomFields && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BalanceChargeScheduleUpdateResponse &&
            id == other.id &&
            chargeDescription == other.chargeDescription &&
            amount == other.amount &&
            balanceId == other.balanceId &&
            billEpoch == other.billEpoch &&
            billFrequency == other.billFrequency &&
            billFrequencyInterval == other.billFrequencyInterval &&
            billInAdvance == other.billInAdvance &&
            code == other.code &&
            createdBy == other.createdBy &&
            currency == other.currency &&
            customFields == other.customFields &&
            dtCreated == other.dtCreated &&
            dtLastModified == other.dtLastModified &&
            lastModifiedBy == other.lastModifiedBy &&
            name == other.name &&
            nextRun == other.nextRun &&
            previousRun == other.previousRun &&
            servicePeriodEndDate == other.servicePeriodEndDate &&
            servicePeriodStartDate == other.servicePeriodStartDate &&
            unitPrice == other.unitPrice &&
            units == other.units &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            chargeDescription,
            amount,
            balanceId,
            billEpoch,
            billFrequency,
            billFrequencyInterval,
            billInAdvance,
            code,
            createdBy,
            currency,
            customFields,
            dtCreated,
            dtLastModified,
            lastModifiedBy,
            name,
            nextRun,
            previousRun,
            servicePeriodEndDate,
            servicePeriodStartDate,
            unitPrice,
            units,
            version,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BalanceChargeScheduleUpdateResponse{id=$id, chargeDescription=$chargeDescription, amount=$amount, balanceId=$balanceId, billEpoch=$billEpoch, billFrequency=$billFrequency, billFrequencyInterval=$billFrequencyInterval, billInAdvance=$billInAdvance, code=$code, createdBy=$createdBy, currency=$currency, customFields=$customFields, dtCreated=$dtCreated, dtLastModified=$dtLastModified, lastModifiedBy=$lastModifiedBy, name=$name, nextRun=$nextRun, previousRun=$previousRun, servicePeriodEndDate=$servicePeriodEndDate, servicePeriodStartDate=$servicePeriodStartDate, unitPrice=$unitPrice, units=$units, version=$version, additionalProperties=$additionalProperties}"
}
