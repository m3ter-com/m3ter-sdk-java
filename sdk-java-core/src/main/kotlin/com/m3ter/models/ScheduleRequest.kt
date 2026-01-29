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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ScheduleRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val amount: JsonField<Double>,
    private val code: JsonField<String>,
    private val endDate: JsonField<OffsetDateTime>,
    private val frequency: JsonField<Frequency>,
    private val frequencyInterval: JsonField<Int>,
    private val name: JsonField<String>,
    private val startDate: JsonField<OffsetDateTime>,
    private val transactionDescription: JsonField<String>,
    private val transactionTypeId: JsonField<String>,
    private val currencyPaid: JsonField<String>,
    private val customFields: JsonField<CustomFields>,
    private val paid: JsonField<Double>,
    private val version: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("endDate")
        @ExcludeMissing
        endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("frequency")
        @ExcludeMissing
        frequency: JsonField<Frequency> = JsonMissing.of(),
        @JsonProperty("frequencyInterval")
        @ExcludeMissing
        frequencyInterval: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("startDate")
        @ExcludeMissing
        startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("transactionDescription")
        @ExcludeMissing
        transactionDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transactionTypeId")
        @ExcludeMissing
        transactionTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currencyPaid")
        @ExcludeMissing
        currencyPaid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customFields")
        @ExcludeMissing
        customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("paid") @ExcludeMissing paid: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
    ) : this(
        amount,
        code,
        endDate,
        frequency,
        frequencyInterval,
        name,
        startDate,
        transactionDescription,
        transactionTypeId,
        currencyPaid,
        customFields,
        paid,
        version,
        mutableMapOf(),
    )

    /**
     * The amount of each Balance Transaction created by this Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Double = amount.getRequired("amount")

    /**
     * The unique short code of the Balance Transaction Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun code(): String = code.getRequired("code")

    /**
     * The end date (*in ISO-8601 format*) of the Balance Transaction Schedule.
     *
     * **NOTE:** End date is exclusive.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endDate(): OffsetDateTime = endDate.getRequired("endDate")

    /**
     * Represents standard scheduling frequencies options for a job.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun frequency(): Frequency = frequency.getRequired("frequency")

    /**
     * Used in conjunction with `frequency` to define how often Balance Transactions are generated
     * by the Schedule. For example, if `frequency` is MONTHLY and `frequencyInterval` is 3, then
     * Balance Transactions are generated every three months.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun frequencyInterval(): Int = frequencyInterval.getRequired("frequencyInterval")

    /**
     * The name of the Balance Transaction Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The start date (*in ISO-8601 format*) of the Balance Transaction Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startDate(): OffsetDateTime = startDate.getRequired("startDate")

    /**
     * The description of each Balance Transaction that will be created by this Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transactionDescription(): String =
        transactionDescription.getRequired("transactionDescription")

    /**
     * The unique identifier (UUID) of the transaction type used to create Transactions by this
     * Schedule. You can obtain a list of Transaction Types created for the Organization. See the
     * the
     * [List TransactionTypes](https://www.m3ter.com/docs/api#tag/TransactionType/operation/ListTransactionTypes)
     * endpoint of this API Reference.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transactionTypeId(): String = transactionTypeId.getRequired("transactionTypeId")

    /**
     * The currency code of the payment if it differs from the Balance currency. For example: USD,
     * GBP or EUR.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencyPaid(): Optional<String> = currencyPaid.getOptional("currencyPaid")

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
    fun customFields(): Optional<CustomFields> = customFields.getOptional("customFields")

    /**
     * The payment amount if the payment currency differs from the Balance currency.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paid(): Optional<Double> = paid.getOptional("paid")

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
    fun version(): Optional<Long> = version.getOptional("version")

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    /**
     * Returns the raw JSON value of [frequency].
     *
     * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("frequency") @ExcludeMissing fun _frequency(): JsonField<Frequency> = frequency

    /**
     * Returns the raw JSON value of [frequencyInterval].
     *
     * Unlike [frequencyInterval], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("frequencyInterval")
    @ExcludeMissing
    fun _frequencyInterval(): JsonField<Int> = frequencyInterval

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startDate")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    /**
     * Returns the raw JSON value of [transactionDescription].
     *
     * Unlike [transactionDescription], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("transactionDescription")
    @ExcludeMissing
    fun _transactionDescription(): JsonField<String> = transactionDescription

    /**
     * Returns the raw JSON value of [transactionTypeId].
     *
     * Unlike [transactionTypeId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transactionTypeId")
    @ExcludeMissing
    fun _transactionTypeId(): JsonField<String> = transactionTypeId

    /**
     * Returns the raw JSON value of [currencyPaid].
     *
     * Unlike [currencyPaid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currencyPaid")
    @ExcludeMissing
    fun _currencyPaid(): JsonField<String> = currencyPaid

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customFields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    /**
     * Returns the raw JSON value of [paid].
     *
     * Unlike [paid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("paid") @ExcludeMissing fun _paid(): JsonField<Double> = paid

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
         * Returns a mutable builder for constructing an instance of [ScheduleRequest].
         *
         * The following fields are required:
         * ```java
         * .amount()
         * .code()
         * .endDate()
         * .frequency()
         * .frequencyInterval()
         * .name()
         * .startDate()
         * .transactionDescription()
         * .transactionTypeId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScheduleRequest]. */
    class Builder internal constructor() {

        private var amount: JsonField<Double>? = null
        private var code: JsonField<String>? = null
        private var endDate: JsonField<OffsetDateTime>? = null
        private var frequency: JsonField<Frequency>? = null
        private var frequencyInterval: JsonField<Int>? = null
        private var name: JsonField<String>? = null
        private var startDate: JsonField<OffsetDateTime>? = null
        private var transactionDescription: JsonField<String>? = null
        private var transactionTypeId: JsonField<String>? = null
        private var currencyPaid: JsonField<String> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var paid: JsonField<Double> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(scheduleRequest: ScheduleRequest) = apply {
            amount = scheduleRequest.amount
            code = scheduleRequest.code
            endDate = scheduleRequest.endDate
            frequency = scheduleRequest.frequency
            frequencyInterval = scheduleRequest.frequencyInterval
            name = scheduleRequest.name
            startDate = scheduleRequest.startDate
            transactionDescription = scheduleRequest.transactionDescription
            transactionTypeId = scheduleRequest.transactionTypeId
            currencyPaid = scheduleRequest.currencyPaid
            customFields = scheduleRequest.customFields
            paid = scheduleRequest.paid
            version = scheduleRequest.version
            additionalProperties = scheduleRequest.additionalProperties.toMutableMap()
        }

        /** The amount of each Balance Transaction created by this Schedule. */
        fun amount(amount: Double) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

        /** The unique short code of the Balance Transaction Schedule. */
        fun code(code: String) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /**
         * The end date (*in ISO-8601 format*) of the Balance Transaction Schedule.
         *
         * **NOTE:** End date is exclusive.
         */
        fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        /** Represents standard scheduling frequencies options for a job. */
        fun frequency(frequency: Frequency) = frequency(JsonField.of(frequency))

        /**
         * Sets [Builder.frequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequency] with a well-typed [Frequency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun frequency(frequency: JsonField<Frequency>) = apply { this.frequency = frequency }

        /**
         * Used in conjunction with `frequency` to define how often Balance Transactions are
         * generated by the Schedule. For example, if `frequency` is MONTHLY and `frequencyInterval`
         * is 3, then Balance Transactions are generated every three months.
         */
        fun frequencyInterval(frequencyInterval: Int) =
            frequencyInterval(JsonField.of(frequencyInterval))

        /**
         * Sets [Builder.frequencyInterval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequencyInterval] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun frequencyInterval(frequencyInterval: JsonField<Int>) = apply {
            this.frequencyInterval = frequencyInterval
        }

        /** The name of the Balance Transaction Schedule. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The start date (*in ISO-8601 format*) of the Balance Transaction Schedule. */
        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

        /** The description of each Balance Transaction that will be created by this Schedule. */
        fun transactionDescription(transactionDescription: String) =
            transactionDescription(JsonField.of(transactionDescription))

        /**
         * Sets [Builder.transactionDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transactionDescription(transactionDescription: JsonField<String>) = apply {
            this.transactionDescription = transactionDescription
        }

        /**
         * The unique identifier (UUID) of the transaction type used to create Transactions by this
         * Schedule. You can obtain a list of Transaction Types created for the Organization. See
         * the the
         * [List TransactionTypes](https://www.m3ter.com/docs/api#tag/TransactionType/operation/ListTransactionTypes)
         * endpoint of this API Reference.
         */
        fun transactionTypeId(transactionTypeId: String) =
            transactionTypeId(JsonField.of(transactionTypeId))

        /**
         * Sets [Builder.transactionTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionTypeId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transactionTypeId(transactionTypeId: JsonField<String>) = apply {
            this.transactionTypeId = transactionTypeId
        }

        /**
         * The currency code of the payment if it differs from the Balance currency. For example:
         * USD, GBP or EUR.
         */
        fun currencyPaid(currencyPaid: String) = currencyPaid(JsonField.of(currencyPaid))

        /**
         * Sets [Builder.currencyPaid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyPaid] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currencyPaid(currencyPaid: JsonField<String>) = apply {
            this.currencyPaid = currencyPaid
        }

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

        /** The payment amount if the payment currency differs from the Balance currency. */
        fun paid(paid: Double) = paid(JsonField.of(paid))

        /**
         * Sets [Builder.paid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paid] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun paid(paid: JsonField<Double>) = apply { this.paid = paid }

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - *do not use for
         *   Create*. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
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
         * Returns an immutable instance of [ScheduleRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .amount()
         * .code()
         * .endDate()
         * .frequency()
         * .frequencyInterval()
         * .name()
         * .startDate()
         * .transactionDescription()
         * .transactionTypeId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ScheduleRequest =
            ScheduleRequest(
                checkRequired("amount", amount),
                checkRequired("code", code),
                checkRequired("endDate", endDate),
                checkRequired("frequency", frequency),
                checkRequired("frequencyInterval", frequencyInterval),
                checkRequired("name", name),
                checkRequired("startDate", startDate),
                checkRequired("transactionDescription", transactionDescription),
                checkRequired("transactionTypeId", transactionTypeId),
                currencyPaid,
                customFields,
                paid,
                version,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ScheduleRequest = apply {
        if (validated) {
            return@apply
        }

        amount()
        code()
        endDate()
        frequency().validate()
        frequencyInterval()
        name()
        startDate()
        transactionDescription()
        transactionTypeId()
        currencyPaid()
        customFields().ifPresent { it.validate() }
        paid()
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
        (if (amount.asKnown().isPresent) 1 else 0) +
            (if (code.asKnown().isPresent) 1 else 0) +
            (if (endDate.asKnown().isPresent) 1 else 0) +
            (frequency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (frequencyInterval.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (startDate.asKnown().isPresent) 1 else 0) +
            (if (transactionDescription.asKnown().isPresent) 1 else 0) +
            (if (transactionTypeId.asKnown().isPresent) 1 else 0) +
            (if (currencyPaid.asKnown().isPresent) 1 else 0) +
            (customFields.asKnown().getOrNull()?.validity() ?: 0) +
            (if (paid.asKnown().isPresent) 1 else 0) +
            (if (version.asKnown().isPresent) 1 else 0)

    /** Represents standard scheduling frequencies options for a job. */
    class Frequency @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmStatic fun of(value: String) = Frequency(JsonField.of(value))
        }

        /** An enum containing [Frequency]'s known values. */
        enum class Known {
            DAILY,
            WEEKLY,
            MONTHLY,
            ANNUALLY,
        }

        /**
         * An enum containing [Frequency]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Frequency] can contain an unknown value in a couple of cases:
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
             * An enum member indicating that [Frequency] was instantiated with an unknown value.
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
                else -> throw M3terInvalidDataException("Unknown Frequency: $value")
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

        fun validate(): Frequency = apply {
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

            return other is Frequency && value == other.value
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

        return other is ScheduleRequest &&
            amount == other.amount &&
            code == other.code &&
            endDate == other.endDate &&
            frequency == other.frequency &&
            frequencyInterval == other.frequencyInterval &&
            name == other.name &&
            startDate == other.startDate &&
            transactionDescription == other.transactionDescription &&
            transactionTypeId == other.transactionTypeId &&
            currencyPaid == other.currencyPaid &&
            customFields == other.customFields &&
            paid == other.paid &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            amount,
            code,
            endDate,
            frequency,
            frequencyInterval,
            name,
            startDate,
            transactionDescription,
            transactionTypeId,
            currencyPaid,
            customFields,
            paid,
            version,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScheduleRequest{amount=$amount, code=$code, endDate=$endDate, frequency=$frequency, frequencyInterval=$frequencyInterval, name=$name, startDate=$startDate, transactionDescription=$transactionDescription, transactionTypeId=$transactionTypeId, currencyPaid=$currencyPaid, customFields=$customFields, paid=$paid, version=$version, additionalProperties=$additionalProperties}"
}
