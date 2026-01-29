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

class ScheduleResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val amount: JsonField<Double>,
    private val balanceId: JsonField<String>,
    private val code: JsonField<String>,
    private val createdBy: JsonField<String>,
    private val currencyPaid: JsonField<String>,
    private val customFields: JsonField<CustomFields>,
    private val dtCreated: JsonField<OffsetDateTime>,
    private val dtLastModified: JsonField<OffsetDateTime>,
    private val endDate: JsonField<OffsetDateTime>,
    private val frequency: JsonField<Frequency>,
    private val frequencyInterval: JsonField<Int>,
    private val lastModifiedBy: JsonField<String>,
    private val name: JsonField<String>,
    private val nextRun: JsonField<OffsetDateTime>,
    private val paid: JsonField<Double>,
    private val previousRun: JsonField<OffsetDateTime>,
    private val startDate: JsonField<OffsetDateTime>,
    private val transactionDescription: JsonField<String>,
    private val transactionTypeId: JsonField<String>,
    private val version: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("balanceId") @ExcludeMissing balanceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currencyPaid")
        @ExcludeMissing
        currencyPaid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customFields")
        @ExcludeMissing
        customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("dtCreated")
        @ExcludeMissing
        dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("endDate")
        @ExcludeMissing
        endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("frequency")
        @ExcludeMissing
        frequency: JsonField<Frequency> = JsonMissing.of(),
        @JsonProperty("frequencyInterval")
        @ExcludeMissing
        frequencyInterval: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        lastModifiedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("nextRun")
        @ExcludeMissing
        nextRun: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("paid") @ExcludeMissing paid: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("previousRun")
        @ExcludeMissing
        previousRun: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("startDate")
        @ExcludeMissing
        startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("transactionDescription")
        @ExcludeMissing
        transactionDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transactionTypeId")
        @ExcludeMissing
        transactionTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        amount,
        balanceId,
        code,
        createdBy,
        currencyPaid,
        customFields,
        dtCreated,
        dtLastModified,
        endDate,
        frequency,
        frequencyInterval,
        lastModifiedBy,
        name,
        nextRun,
        paid,
        previousRun,
        startDate,
        transactionDescription,
        transactionTypeId,
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
     * The amount of each Balance Transaction created by this Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amount(): Optional<Double> = amount.getOptional("amount")

    /**
     * The unique identifier (UUID) for the Balance this Balance Transaction Schedule was created
     * for.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun balanceId(): Optional<String> = balanceId.getOptional("balanceId")

    /**
     * Unique short code of the Balance Transaction Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun code(): Optional<String> = code.getOptional("code")

    /**
     * The unique identifier (UUID) of the user who created this Balance Transaction Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

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
     * The date and time (*in ISO-8601 format*) when the Balance Transaction Schedule was created.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtCreated(): Optional<OffsetDateTime> = dtCreated.getOptional("dtCreated")

    /**
     * The date and time (*in ISO-8601 format*) when the Balance Transaction Schedule was last
     * modified.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtLastModified(): Optional<OffsetDateTime> = dtLastModified.getOptional("dtLastModified")

    /**
     * The end date (*in ISO-8601 format*) of the Balance Transaction Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endDate(): Optional<OffsetDateTime> = endDate.getOptional("endDate")

    /**
     * Represents standard scheduling frequencies options for a job.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun frequency(): Optional<Frequency> = frequency.getOptional("frequency")

    /**
     * Used in conjunction with `frequency` to define how often Balance Transactions are generated.
     * For example, if `frequency` is MONTHLY and `frequencyInterval` is 3, Balance Transactions are
     * generated every three months.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun frequencyInterval(): Optional<Int> = frequencyInterval.getOptional("frequencyInterval")

    /**
     * The unique identifier (UUID) of the user who last modified this Balance Transaction Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedBy(): Optional<String> = lastModifiedBy.getOptional("lastModifiedBy")

    /**
     * The name of the Balance Transaction Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * The date and time (*in ISO-8601 format*) when the next Transaction will be generated by the
     * Balance Transaction Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextRun(): Optional<OffsetDateTime> = nextRun.getOptional("nextRun")

    /**
     * The payment amount if the payment currency differs from the Balance currency.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paid(): Optional<Double> = paid.getOptional("paid")

    /**
     * The date and time (*in ISO-8601 format*) when the previous Transaction was generated by the
     * Balance Transaction Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun previousRun(): Optional<OffsetDateTime> = previousRun.getOptional("previousRun")

    /**
     * The start date (*in ISO-8601 format*) of the Balance Transaction Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startDate(): Optional<OffsetDateTime> = startDate.getOptional("startDate")

    /**
     * The description of each Balance Transaction created by this Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transactionDescription(): Optional<String> =
        transactionDescription.getOptional("transactionDescription")

    /**
     * The unique identifier (UUID) of the transaction type used for Transactions created by this
     * Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transactionTypeId(): Optional<String> = transactionTypeId.getOptional("transactionTypeId")

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
     * Returns the raw JSON value of [paid].
     *
     * Unlike [paid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("paid") @ExcludeMissing fun _paid(): JsonField<Double> = paid

    /**
     * Returns the raw JSON value of [previousRun].
     *
     * Unlike [previousRun], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("previousRun")
    @ExcludeMissing
    fun _previousRun(): JsonField<OffsetDateTime> = previousRun

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
         * Returns a mutable builder for constructing an instance of [ScheduleResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScheduleResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amount: JsonField<Double> = JsonMissing.of()
        private var balanceId: JsonField<String> = JsonMissing.of()
        private var code: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var currencyPaid: JsonField<String> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var frequency: JsonField<Frequency> = JsonMissing.of()
        private var frequencyInterval: JsonField<Int> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var nextRun: JsonField<OffsetDateTime> = JsonMissing.of()
        private var paid: JsonField<Double> = JsonMissing.of()
        private var previousRun: JsonField<OffsetDateTime> = JsonMissing.of()
        private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var transactionDescription: JsonField<String> = JsonMissing.of()
        private var transactionTypeId: JsonField<String> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(scheduleResponse: ScheduleResponse) = apply {
            id = scheduleResponse.id
            amount = scheduleResponse.amount
            balanceId = scheduleResponse.balanceId
            code = scheduleResponse.code
            createdBy = scheduleResponse.createdBy
            currencyPaid = scheduleResponse.currencyPaid
            customFields = scheduleResponse.customFields
            dtCreated = scheduleResponse.dtCreated
            dtLastModified = scheduleResponse.dtLastModified
            endDate = scheduleResponse.endDate
            frequency = scheduleResponse.frequency
            frequencyInterval = scheduleResponse.frequencyInterval
            lastModifiedBy = scheduleResponse.lastModifiedBy
            name = scheduleResponse.name
            nextRun = scheduleResponse.nextRun
            paid = scheduleResponse.paid
            previousRun = scheduleResponse.previousRun
            startDate = scheduleResponse.startDate
            transactionDescription = scheduleResponse.transactionDescription
            transactionTypeId = scheduleResponse.transactionTypeId
            version = scheduleResponse.version
            additionalProperties = scheduleResponse.additionalProperties.toMutableMap()
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

        /** The amount of each Balance Transaction created by this Schedule. */
        fun amount(amount: Double) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

        /**
         * The unique identifier (UUID) for the Balance this Balance Transaction Schedule was
         * created for.
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

        /** Unique short code of the Balance Transaction Schedule. */
        fun code(code: String) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /**
         * The unique identifier (UUID) of the user who created this Balance Transaction Schedule.
         */
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
         * The date and time (*in ISO-8601 format*) when the Balance Transaction Schedule was
         * created.
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
         * The date and time (*in ISO-8601 format*) when the Balance Transaction Schedule was last
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

        /** The end date (*in ISO-8601 format*) of the Balance Transaction Schedule. */
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
         * generated. For example, if `frequency` is MONTHLY and `frequencyInterval` is 3, Balance
         * Transactions are generated every three months.
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

        /**
         * The unique identifier (UUID) of the user who last modified this Balance Transaction
         * Schedule.
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

        /** The name of the Balance Transaction Schedule. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * The date and time (*in ISO-8601 format*) when the next Transaction will be generated by
         * the Balance Transaction Schedule.
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
         * The date and time (*in ISO-8601 format*) when the previous Transaction was generated by
         * the Balance Transaction Schedule.
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

        /** The description of each Balance Transaction created by this Schedule. */
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
         * The unique identifier (UUID) of the transaction type used for Transactions created by
         * this Schedule.
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
         * Returns an immutable instance of [ScheduleResponse].
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
        fun build(): ScheduleResponse =
            ScheduleResponse(
                checkRequired("id", id),
                amount,
                balanceId,
                code,
                createdBy,
                currencyPaid,
                customFields,
                dtCreated,
                dtLastModified,
                endDate,
                frequency,
                frequencyInterval,
                lastModifiedBy,
                name,
                nextRun,
                paid,
                previousRun,
                startDate,
                transactionDescription,
                transactionTypeId,
                version,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ScheduleResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        amount()
        balanceId()
        code()
        createdBy()
        currencyPaid()
        customFields().ifPresent { it.validate() }
        dtCreated()
        dtLastModified()
        endDate()
        frequency().ifPresent { it.validate() }
        frequencyInterval()
        lastModifiedBy()
        name()
        nextRun()
        paid()
        previousRun()
        startDate()
        transactionDescription()
        transactionTypeId()
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
            (if (amount.asKnown().isPresent) 1 else 0) +
            (if (balanceId.asKnown().isPresent) 1 else 0) +
            (if (code.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (currencyPaid.asKnown().isPresent) 1 else 0) +
            (customFields.asKnown().getOrNull()?.validity() ?: 0) +
            (if (dtCreated.asKnown().isPresent) 1 else 0) +
            (if (dtLastModified.asKnown().isPresent) 1 else 0) +
            (if (endDate.asKnown().isPresent) 1 else 0) +
            (frequency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (frequencyInterval.asKnown().isPresent) 1 else 0) +
            (if (lastModifiedBy.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (nextRun.asKnown().isPresent) 1 else 0) +
            (if (paid.asKnown().isPresent) 1 else 0) +
            (if (previousRun.asKnown().isPresent) 1 else 0) +
            (if (startDate.asKnown().isPresent) 1 else 0) +
            (if (transactionDescription.asKnown().isPresent) 1 else 0) +
            (if (transactionTypeId.asKnown().isPresent) 1 else 0) +
            (if (version.asKnown().isPresent) 1 else 0)

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScheduleResponse &&
            id == other.id &&
            amount == other.amount &&
            balanceId == other.balanceId &&
            code == other.code &&
            createdBy == other.createdBy &&
            currencyPaid == other.currencyPaid &&
            customFields == other.customFields &&
            dtCreated == other.dtCreated &&
            dtLastModified == other.dtLastModified &&
            endDate == other.endDate &&
            frequency == other.frequency &&
            frequencyInterval == other.frequencyInterval &&
            lastModifiedBy == other.lastModifiedBy &&
            name == other.name &&
            nextRun == other.nextRun &&
            paid == other.paid &&
            previousRun == other.previousRun &&
            startDate == other.startDate &&
            transactionDescription == other.transactionDescription &&
            transactionTypeId == other.transactionTypeId &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            amount,
            balanceId,
            code,
            createdBy,
            currencyPaid,
            customFields,
            dtCreated,
            dtLastModified,
            endDate,
            frequency,
            frequencyInterval,
            lastModifiedBy,
            name,
            nextRun,
            paid,
            previousRun,
            startDate,
            transactionDescription,
            transactionTypeId,
            version,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScheduleResponse{id=$id, amount=$amount, balanceId=$balanceId, code=$code, createdBy=$createdBy, currencyPaid=$currencyPaid, customFields=$customFields, dtCreated=$dtCreated, dtLastModified=$dtLastModified, endDate=$endDate, frequency=$frequency, frequencyInterval=$frequencyInterval, lastModifiedBy=$lastModifiedBy, name=$name, nextRun=$nextRun, paid=$paid, previousRun=$previousRun, startDate=$startDate, transactionDescription=$transactionDescription, transactionTypeId=$transactionTypeId, version=$version, additionalProperties=$additionalProperties}"
}
