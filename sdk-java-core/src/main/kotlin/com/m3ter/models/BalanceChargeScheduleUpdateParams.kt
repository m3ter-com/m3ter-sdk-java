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
import com.m3ter.core.checkRequired
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update a BalanceChargeSchedule for the given UUID. */
class BalanceChargeScheduleUpdateParams
private constructor(
    private val orgId: String?,
    private val balanceId: String,
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    fun balanceId(): String = balanceId

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * Represents standard scheduling frequencies options for a job.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billFrequency(): BillFrequency = body.billFrequency()

    /**
     * How often Bills are issued. For example, if billFrequency is `MONTHLY` and
     * `billFrequencyInterval` is 3, Bills are issued every three months.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billFrequencyInterval(): Int = body.billFrequencyInterval()

    /**
     * Used to specify how Charges created by the Balance Charge Schedule are billed - either in
     * arrears or in advance:
     * * Use `false` for billing in arrears.
     * * Use `true` for billing in advance.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billInAdvance(): Boolean = body.billInAdvance()

    /**
     * The description for Charges created by the Balance Charge Schedule. Used on Bills for Charge
     * line items.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun chargeDescription(): String = body.chargeDescription()

    /**
     * Unique short code for the Balance Charge Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun code(): String = body.code()

    /**
     * The currency of the Charges created by the Balance Charge Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = body.currency()

    /**
     * The name of the Balance Charge Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * The service period end date (*in ISO-8601 format*) of the Balance Charge Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun servicePeriodEndDate(): OffsetDateTime = body.servicePeriodEndDate()

    /**
     * The service period start date (*in ISO-8601 format)* of the Balance Charge Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun servicePeriodStartDate(): OffsetDateTime = body.servicePeriodStartDate()

    /**
     * The amount of each Charge created by the Balance Charge Schedule. Must be omitted if `units`
     * and `unitPrice` are provided.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amount(): Optional<Double> = body.amount()

    /**
     * Specify a billing cycle date (*in ISO-8601 format*) for when the first Bill is created for
     * Balance Charges created by the Schedule, and also acts as a reference for when in the
     * Schedule period subsequent Bills are created for the defined `billFrequency`. If left blank,
     * then the relevant Epoch date from your Organization's configuration will be used as the
     * billing cycle date instead.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billEpoch(): Optional<LocalDate> = body.billEpoch()

    /**
     * User defined fields enabling you to attach custom data. The value for a custom field can be
     * either a string or a number.
     *
     * If `customFields` can also be defined for this entity at the Organizational level,
     * `customField` values defined at individual level override values of `customFields` with the
     * same name defined at Organization level.
     *
     * See
     * [Working with Custom Fields](https://www.m3ter.com/docs/guides/creating-and-managing-products/working-with-custom-fields)
     * in the m3ter documentation for more information.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customFields(): Optional<CustomFields> = body.customFields()

    /**
     * Unit price for Charge. Must be provided when `units` is used. Must be omitted when `amount`
     * is used.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unitPrice(): Optional<Double> = body.unitPrice()

    /**
     * Number of units defined for the Charges created by the Schedule. Required when `unitPrice` is
     * provided. Must be omitted when `amount` is used.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun units(): Optional<Double> = body.units()

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
     * Returns the raw JSON value of [billFrequency].
     *
     * Unlike [billFrequency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billFrequency(): JsonField<BillFrequency> = body._billFrequency()

    /**
     * Returns the raw JSON value of [billFrequencyInterval].
     *
     * Unlike [billFrequencyInterval], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _billFrequencyInterval(): JsonField<Int> = body._billFrequencyInterval()

    /**
     * Returns the raw JSON value of [billInAdvance].
     *
     * Unlike [billInAdvance], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billInAdvance(): JsonField<Boolean> = body._billInAdvance()

    /**
     * Returns the raw JSON value of [chargeDescription].
     *
     * Unlike [chargeDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _chargeDescription(): JsonField<String> = body._chargeDescription()

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _code(): JsonField<String> = body._code()

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currency(): JsonField<String> = body._currency()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [servicePeriodEndDate].
     *
     * Unlike [servicePeriodEndDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _servicePeriodEndDate(): JsonField<OffsetDateTime> = body._servicePeriodEndDate()

    /**
     * Returns the raw JSON value of [servicePeriodStartDate].
     *
     * Unlike [servicePeriodStartDate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _servicePeriodStartDate(): JsonField<OffsetDateTime> = body._servicePeriodStartDate()

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Double> = body._amount()

    /**
     * Returns the raw JSON value of [billEpoch].
     *
     * Unlike [billEpoch], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billEpoch(): JsonField<LocalDate> = body._billEpoch()

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customFields(): JsonField<CustomFields> = body._customFields()

    /**
     * Returns the raw JSON value of [unitPrice].
     *
     * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _unitPrice(): JsonField<Double> = body._unitPrice()

    /**
     * Returns the raw JSON value of [units].
     *
     * Unlike [units], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _units(): JsonField<Double> = body._units()

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _version(): JsonField<Long> = body._version()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [BalanceChargeScheduleUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .balanceId()
         * .billFrequency()
         * .billFrequencyInterval()
         * .billInAdvance()
         * .chargeDescription()
         * .code()
         * .currency()
         * .name()
         * .servicePeriodEndDate()
         * .servicePeriodStartDate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BalanceChargeScheduleUpdateParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var balanceId: String? = null
        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(balanceChargeScheduleUpdateParams: BalanceChargeScheduleUpdateParams) =
            apply {
                orgId = balanceChargeScheduleUpdateParams.orgId
                balanceId = balanceChargeScheduleUpdateParams.balanceId
                id = balanceChargeScheduleUpdateParams.id
                body = balanceChargeScheduleUpdateParams.body.toBuilder()
                additionalHeaders = balanceChargeScheduleUpdateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    balanceChargeScheduleUpdateParams.additionalQueryParams.toBuilder()
            }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        fun balanceId(balanceId: String) = apply { this.balanceId = balanceId }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [billFrequency]
         * - [billFrequencyInterval]
         * - [billInAdvance]
         * - [chargeDescription]
         * - [code]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Represents standard scheduling frequencies options for a job. */
        fun billFrequency(billFrequency: BillFrequency) = apply {
            body.billFrequency(billFrequency)
        }

        /**
         * Sets [Builder.billFrequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billFrequency] with a well-typed [BillFrequency] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billFrequency(billFrequency: JsonField<BillFrequency>) = apply {
            body.billFrequency(billFrequency)
        }

        /**
         * How often Bills are issued. For example, if billFrequency is `MONTHLY` and
         * `billFrequencyInterval` is 3, Bills are issued every three months.
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
         * Used to specify how Charges created by the Balance Charge Schedule are billed - either in
         * arrears or in advance:
         * * Use `false` for billing in arrears.
         * * Use `true` for billing in advance.
         */
        fun billInAdvance(billInAdvance: Boolean) = apply { body.billInAdvance(billInAdvance) }

        /**
         * Sets [Builder.billInAdvance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billInAdvance] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billInAdvance(billInAdvance: JsonField<Boolean>) = apply {
            body.billInAdvance(billInAdvance)
        }

        /**
         * The description for Charges created by the Balance Charge Schedule. Used on Bills for
         * Charge line items.
         */
        fun chargeDescription(chargeDescription: String) = apply {
            body.chargeDescription(chargeDescription)
        }

        /**
         * Sets [Builder.chargeDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chargeDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun chargeDescription(chargeDescription: JsonField<String>) = apply {
            body.chargeDescription(chargeDescription)
        }

        /** Unique short code for the Balance Charge Schedule. */
        fun code(code: String) = apply { body.code(code) }

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { body.code(code) }

        /** The currency of the Charges created by the Balance Charge Schedule. */
        fun currency(currency: String) = apply { body.currency(currency) }

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { body.currency(currency) }

        /** The name of the Balance Charge Schedule. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** The service period end date (*in ISO-8601 format*) of the Balance Charge Schedule. */
        fun servicePeriodEndDate(servicePeriodEndDate: OffsetDateTime) = apply {
            body.servicePeriodEndDate(servicePeriodEndDate)
        }

        /**
         * Sets [Builder.servicePeriodEndDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.servicePeriodEndDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun servicePeriodEndDate(servicePeriodEndDate: JsonField<OffsetDateTime>) = apply {
            body.servicePeriodEndDate(servicePeriodEndDate)
        }

        /** The service period start date (*in ISO-8601 format)* of the Balance Charge Schedule. */
        fun servicePeriodStartDate(servicePeriodStartDate: OffsetDateTime) = apply {
            body.servicePeriodStartDate(servicePeriodStartDate)
        }

        /**
         * Sets [Builder.servicePeriodStartDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.servicePeriodStartDate] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun servicePeriodStartDate(servicePeriodStartDate: JsonField<OffsetDateTime>) = apply {
            body.servicePeriodStartDate(servicePeriodStartDate)
        }

        /**
         * The amount of each Charge created by the Balance Charge Schedule. Must be omitted if
         * `units` and `unitPrice` are provided.
         */
        fun amount(amount: Double) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Double>) = apply { body.amount(amount) }

        /**
         * Specify a billing cycle date (*in ISO-8601 format*) for when the first Bill is created
         * for Balance Charges created by the Schedule, and also acts as a reference for when in the
         * Schedule period subsequent Bills are created for the defined `billFrequency`. If left
         * blank, then the relevant Epoch date from your Organization's configuration will be used
         * as the billing cycle date instead.
         */
        fun billEpoch(billEpoch: LocalDate) = apply { body.billEpoch(billEpoch) }

        /**
         * Sets [Builder.billEpoch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billEpoch] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun billEpoch(billEpoch: JsonField<LocalDate>) = apply { body.billEpoch(billEpoch) }

        /**
         * User defined fields enabling you to attach custom data. The value for a custom field can
         * be either a string or a number.
         *
         * If `customFields` can also be defined for this entity at the Organizational level,
         * `customField` values defined at individual level override values of `customFields` with
         * the same name defined at Organization level.
         *
         * See
         * [Working with Custom Fields](https://www.m3ter.com/docs/guides/creating-and-managing-products/working-with-custom-fields)
         * in the m3ter documentation for more information.
         */
        fun customFields(customFields: CustomFields) = apply { body.customFields(customFields) }

        /**
         * Sets [Builder.customFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            body.customFields(customFields)
        }

        /**
         * Unit price for Charge. Must be provided when `units` is used. Must be omitted when
         * `amount` is used.
         */
        fun unitPrice(unitPrice: Double) = apply { body.unitPrice(unitPrice) }

        /**
         * Sets [Builder.unitPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unitPrice] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun unitPrice(unitPrice: JsonField<Double>) = apply { body.unitPrice(unitPrice) }

        /**
         * Number of units defined for the Charges created by the Schedule. Required when
         * `unitPrice` is provided. Must be omitted when `amount` is used.
         */
        fun units(units: Double) = apply { body.units(units) }

        /**
         * Sets [Builder.units] to an arbitrary JSON value.
         *
         * You should usually call [Builder.units] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun units(units: JsonField<Double>) = apply { body.units(units) }

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
         * Returns an immutable instance of [BalanceChargeScheduleUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .balanceId()
         * .billFrequency()
         * .billFrequencyInterval()
         * .billInAdvance()
         * .chargeDescription()
         * .code()
         * .currency()
         * .name()
         * .servicePeriodEndDate()
         * .servicePeriodStartDate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BalanceChargeScheduleUpdateParams =
            BalanceChargeScheduleUpdateParams(
                orgId,
                checkRequired("balanceId", balanceId),
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId ?: ""
            1 -> balanceId
            2 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val billFrequency: JsonField<BillFrequency>,
        private val billFrequencyInterval: JsonField<Int>,
        private val billInAdvance: JsonField<Boolean>,
        private val chargeDescription: JsonField<String>,
        private val code: JsonField<String>,
        private val currency: JsonField<String>,
        private val name: JsonField<String>,
        private val servicePeriodEndDate: JsonField<OffsetDateTime>,
        private val servicePeriodStartDate: JsonField<OffsetDateTime>,
        private val amount: JsonField<Double>,
        private val billEpoch: JsonField<LocalDate>,
        private val customFields: JsonField<CustomFields>,
        private val unitPrice: JsonField<Double>,
        private val units: JsonField<Double>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("billFrequency")
            @ExcludeMissing
            billFrequency: JsonField<BillFrequency> = JsonMissing.of(),
            @JsonProperty("billFrequencyInterval")
            @ExcludeMissing
            billFrequencyInterval: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("billInAdvance")
            @ExcludeMissing
            billInAdvance: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("chargeDescription")
            @ExcludeMissing
            chargeDescription: JsonField<String> = JsonMissing.of(),
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("servicePeriodEndDate")
            @ExcludeMissing
            servicePeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("servicePeriodStartDate")
            @ExcludeMissing
            servicePeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("billEpoch")
            @ExcludeMissing
            billEpoch: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("customFields")
            @ExcludeMissing
            customFields: JsonField<CustomFields> = JsonMissing.of(),
            @JsonProperty("unitPrice")
            @ExcludeMissing
            unitPrice: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("units") @ExcludeMissing units: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(
            billFrequency,
            billFrequencyInterval,
            billInAdvance,
            chargeDescription,
            code,
            currency,
            name,
            servicePeriodEndDate,
            servicePeriodStartDate,
            amount,
            billEpoch,
            customFields,
            unitPrice,
            units,
            version,
            mutableMapOf(),
        )

        /**
         * Represents standard scheduling frequencies options for a job.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billFrequency(): BillFrequency = billFrequency.getRequired("billFrequency")

        /**
         * How often Bills are issued. For example, if billFrequency is `MONTHLY` and
         * `billFrequencyInterval` is 3, Bills are issued every three months.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billFrequencyInterval(): Int =
            billFrequencyInterval.getRequired("billFrequencyInterval")

        /**
         * Used to specify how Charges created by the Balance Charge Schedule are billed - either in
         * arrears or in advance:
         * * Use `false` for billing in arrears.
         * * Use `true` for billing in advance.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billInAdvance(): Boolean = billInAdvance.getRequired("billInAdvance")

        /**
         * The description for Charges created by the Balance Charge Schedule. Used on Bills for
         * Charge line items.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun chargeDescription(): String = chargeDescription.getRequired("chargeDescription")

        /**
         * Unique short code for the Balance Charge Schedule.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun code(): String = code.getRequired("code")

        /**
         * The currency of the Charges created by the Balance Charge Schedule.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * The name of the Balance Charge Schedule.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The service period end date (*in ISO-8601 format*) of the Balance Charge Schedule.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun servicePeriodEndDate(): OffsetDateTime =
            servicePeriodEndDate.getRequired("servicePeriodEndDate")

        /**
         * The service period start date (*in ISO-8601 format)* of the Balance Charge Schedule.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun servicePeriodStartDate(): OffsetDateTime =
            servicePeriodStartDate.getRequired("servicePeriodStartDate")

        /**
         * The amount of each Charge created by the Balance Charge Schedule. Must be omitted if
         * `units` and `unitPrice` are provided.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amount(): Optional<Double> = amount.getOptional("amount")

        /**
         * Specify a billing cycle date (*in ISO-8601 format*) for when the first Bill is created
         * for Balance Charges created by the Schedule, and also acts as a reference for when in the
         * Schedule period subsequent Bills are created for the defined `billFrequency`. If left
         * blank, then the relevant Epoch date from your Organization's configuration will be used
         * as the billing cycle date instead.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billEpoch(): Optional<LocalDate> = billEpoch.getOptional("billEpoch")

        /**
         * User defined fields enabling you to attach custom data. The value for a custom field can
         * be either a string or a number.
         *
         * If `customFields` can also be defined for this entity at the Organizational level,
         * `customField` values defined at individual level override values of `customFields` with
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
         * Unit price for Charge. Must be provided when `units` is used. Must be omitted when
         * `amount` is used.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun unitPrice(): Optional<Double> = unitPrice.getOptional("unitPrice")

        /**
         * Number of units defined for the Charges created by the Schedule. Required when
         * `unitPrice` is provided. Must be omitted when `amount` is used.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun units(): Optional<Double> = units.getOptional("units")

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
         * Returns the raw JSON value of [billFrequency].
         *
         * Unlike [billFrequency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billFrequency")
        @ExcludeMissing
        fun _billFrequency(): JsonField<BillFrequency> = billFrequency

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
         * Returns the raw JSON value of [billInAdvance].
         *
         * Unlike [billInAdvance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billInAdvance")
        @ExcludeMissing
        fun _billInAdvance(): JsonField<Boolean> = billInAdvance

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
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [billEpoch].
         *
         * Unlike [billEpoch], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("billEpoch")
        @ExcludeMissing
        fun _billEpoch(): JsonField<LocalDate> = billEpoch

        /**
         * Returns the raw JSON value of [customFields].
         *
         * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("customFields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .billFrequency()
             * .billFrequencyInterval()
             * .billInAdvance()
             * .chargeDescription()
             * .code()
             * .currency()
             * .name()
             * .servicePeriodEndDate()
             * .servicePeriodStartDate()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var billFrequency: JsonField<BillFrequency>? = null
            private var billFrequencyInterval: JsonField<Int>? = null
            private var billInAdvance: JsonField<Boolean>? = null
            private var chargeDescription: JsonField<String>? = null
            private var code: JsonField<String>? = null
            private var currency: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var servicePeriodEndDate: JsonField<OffsetDateTime>? = null
            private var servicePeriodStartDate: JsonField<OffsetDateTime>? = null
            private var amount: JsonField<Double> = JsonMissing.of()
            private var billEpoch: JsonField<LocalDate> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var unitPrice: JsonField<Double> = JsonMissing.of()
            private var units: JsonField<Double> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                billFrequency = body.billFrequency
                billFrequencyInterval = body.billFrequencyInterval
                billInAdvance = body.billInAdvance
                chargeDescription = body.chargeDescription
                code = body.code
                currency = body.currency
                name = body.name
                servicePeriodEndDate = body.servicePeriodEndDate
                servicePeriodStartDate = body.servicePeriodStartDate
                amount = body.amount
                billEpoch = body.billEpoch
                customFields = body.customFields
                unitPrice = body.unitPrice
                units = body.units
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Represents standard scheduling frequencies options for a job. */
            fun billFrequency(billFrequency: BillFrequency) =
                billFrequency(JsonField.of(billFrequency))

            /**
             * Sets [Builder.billFrequency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billFrequency] with a well-typed [BillFrequency]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * Used to specify how Charges created by the Balance Charge Schedule are billed -
             * either in arrears or in advance:
             * * Use `false` for billing in arrears.
             * * Use `true` for billing in advance.
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

            /** Unique short code for the Balance Charge Schedule. */
            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /** The currency of the Charges created by the Balance Charge Schedule. */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** The name of the Balance Charge Schedule. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * The service period end date (*in ISO-8601 format*) of the Balance Charge Schedule.
             */
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

            /**
             * The service period start date (*in ISO-8601 format)* of the Balance Charge Schedule.
             */
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

            /**
             * The amount of each Charge created by the Balance Charge Schedule. Must be omitted if
             * `units` and `unitPrice` are provided.
             */
            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /**
             * Specify a billing cycle date (*in ISO-8601 format*) for when the first Bill is
             * created for Balance Charges created by the Schedule, and also acts as a reference for
             * when in the Schedule period subsequent Bills are created for the defined
             * `billFrequency`. If left blank, then the relevant Epoch date from your Organization's
             * configuration will be used as the billing cycle date instead.
             */
            fun billEpoch(billEpoch: LocalDate) = billEpoch(JsonField.of(billEpoch))

            /**
             * Sets [Builder.billEpoch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billEpoch] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billEpoch(billEpoch: JsonField<LocalDate>) = apply { this.billEpoch = billEpoch }

            /**
             * User defined fields enabling you to attach custom data. The value for a custom field
             * can be either a string or a number.
             *
             * If `customFields` can also be defined for this entity at the Organizational level,
             * `customField` values defined at individual level override values of `customFields`
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
             * Unit price for Charge. Must be provided when `units` is used. Must be omitted when
             * `amount` is used.
             */
            fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

            /**
             * Sets [Builder.unitPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unitPrice] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unitPrice(unitPrice: JsonField<Double>) = apply { this.unitPrice = unitPrice }

            /**
             * Number of units defined for the Charges created by the Schedule. Required when
             * `unitPrice` is provided. Must be omitted when `amount` is used.
             */
            fun units(units: Double) = units(JsonField.of(units))

            /**
             * Sets [Builder.units] to an arbitrary JSON value.
             *
             * You should usually call [Builder.units] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun units(units: JsonField<Double>) = apply { this.units = units }

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
             * .billFrequency()
             * .billFrequencyInterval()
             * .billInAdvance()
             * .chargeDescription()
             * .code()
             * .currency()
             * .name()
             * .servicePeriodEndDate()
             * .servicePeriodStartDate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("billFrequency", billFrequency),
                    checkRequired("billFrequencyInterval", billFrequencyInterval),
                    checkRequired("billInAdvance", billInAdvance),
                    checkRequired("chargeDescription", chargeDescription),
                    checkRequired("code", code),
                    checkRequired("currency", currency),
                    checkRequired("name", name),
                    checkRequired("servicePeriodEndDate", servicePeriodEndDate),
                    checkRequired("servicePeriodStartDate", servicePeriodStartDate),
                    amount,
                    billEpoch,
                    customFields,
                    unitPrice,
                    units,
                    version,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            billFrequency().validate()
            billFrequencyInterval()
            billInAdvance()
            chargeDescription()
            code()
            currency()
            name()
            servicePeriodEndDate()
            servicePeriodStartDate()
            amount()
            billEpoch()
            customFields().ifPresent { it.validate() }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (billFrequency.asKnown().getOrNull()?.validity() ?: 0) +
                (if (billFrequencyInterval.asKnown().isPresent) 1 else 0) +
                (if (billInAdvance.asKnown().isPresent) 1 else 0) +
                (if (chargeDescription.asKnown().isPresent) 1 else 0) +
                (if (code.asKnown().isPresent) 1 else 0) +
                (if (currency.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (servicePeriodEndDate.asKnown().isPresent) 1 else 0) +
                (if (servicePeriodStartDate.asKnown().isPresent) 1 else 0) +
                (if (amount.asKnown().isPresent) 1 else 0) +
                (if (billEpoch.asKnown().isPresent) 1 else 0) +
                (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (unitPrice.asKnown().isPresent) 1 else 0) +
                (if (units.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                billFrequency == other.billFrequency &&
                billFrequencyInterval == other.billFrequencyInterval &&
                billInAdvance == other.billInAdvance &&
                chargeDescription == other.chargeDescription &&
                code == other.code &&
                currency == other.currency &&
                name == other.name &&
                servicePeriodEndDate == other.servicePeriodEndDate &&
                servicePeriodStartDate == other.servicePeriodStartDate &&
                amount == other.amount &&
                billEpoch == other.billEpoch &&
                customFields == other.customFields &&
                unitPrice == other.unitPrice &&
                units == other.units &&
                version == other.version &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                billFrequency,
                billFrequencyInterval,
                billInAdvance,
                chargeDescription,
                code,
                currency,
                name,
                servicePeriodEndDate,
                servicePeriodStartDate,
                amount,
                billEpoch,
                customFields,
                unitPrice,
                units,
                version,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{billFrequency=$billFrequency, billFrequencyInterval=$billFrequencyInterval, billInAdvance=$billInAdvance, chargeDescription=$chargeDescription, code=$code, currency=$currency, name=$name, servicePeriodEndDate=$servicePeriodEndDate, servicePeriodStartDate=$servicePeriodStartDate, amount=$amount, billEpoch=$billEpoch, customFields=$customFields, unitPrice=$unitPrice, units=$units, version=$version, additionalProperties=$additionalProperties}"
    }

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
     * If `customFields` can also be defined for this entity at the Organizational level,
     * `customField` values defined at individual level override values of `customFields` with the
     * same name defined at Organization level.
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

        return other is BalanceChargeScheduleUpdateParams &&
            orgId == other.orgId &&
            balanceId == other.balanceId &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(orgId, balanceId, id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BalanceChargeScheduleUpdateParams{orgId=$orgId, balanceId=$balanceId, id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
