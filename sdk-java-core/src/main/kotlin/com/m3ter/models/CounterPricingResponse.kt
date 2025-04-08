// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.m3ter.core.ExcludeMissing
import com.m3ter.core.JsonField
import com.m3ter.core.JsonMissing
import com.m3ter.core.JsonValue
import com.m3ter.core.checkKnown
import com.m3ter.core.checkRequired
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CounterPricingResponse
private constructor(
    private val id: JsonField<String>,
    private val version: JsonField<Long>,
    private val accountingProductId: JsonField<String>,
    private val code: JsonField<String>,
    private val counterId: JsonField<String>,
    private val createdBy: JsonField<String>,
    private val cumulative: JsonField<Boolean>,
    private val description: JsonField<String>,
    private val dtCreated: JsonField<OffsetDateTime>,
    private val dtLastModified: JsonField<OffsetDateTime>,
    private val endDate: JsonField<OffsetDateTime>,
    private val lastModifiedBy: JsonField<String>,
    private val planId: JsonField<String>,
    private val planTemplateId: JsonField<String>,
    private val pricingBands: JsonField<List<PricingBand>>,
    private val proRateAdjustmentCredit: JsonField<Boolean>,
    private val proRateAdjustmentDebit: JsonField<Boolean>,
    private val proRateRunningTotal: JsonField<Boolean>,
    private val runningTotalBillInAdvance: JsonField<Boolean>,
    private val startDate: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("accountingProductId")
        @ExcludeMissing
        accountingProductId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("counterId") @ExcludeMissing counterId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cumulative")
        @ExcludeMissing
        cumulative: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dtCreated")
        @ExcludeMissing
        dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("endDate")
        @ExcludeMissing
        endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        lastModifiedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("planId") @ExcludeMissing planId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("planTemplateId")
        @ExcludeMissing
        planTemplateId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pricingBands")
        @ExcludeMissing
        pricingBands: JsonField<List<PricingBand>> = JsonMissing.of(),
        @JsonProperty("proRateAdjustmentCredit")
        @ExcludeMissing
        proRateAdjustmentCredit: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("proRateAdjustmentDebit")
        @ExcludeMissing
        proRateAdjustmentDebit: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("proRateRunningTotal")
        @ExcludeMissing
        proRateRunningTotal: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("runningTotalBillInAdvance")
        @ExcludeMissing
        runningTotalBillInAdvance: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("startDate")
        @ExcludeMissing
        startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        version,
        accountingProductId,
        code,
        counterId,
        createdBy,
        cumulative,
        description,
        dtCreated,
        dtLastModified,
        endDate,
        lastModifiedBy,
        planId,
        planTemplateId,
        pricingBands,
        proRateAdjustmentCredit,
        proRateAdjustmentDebit,
        proRateRunningTotal,
        runningTotalBillInAdvance,
        startDate,
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
    fun accountingProductId(): Optional<String> =
        accountingProductId.getOptional("accountingProductId")

    /**
     * Unique short code for the Pricing.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun code(): Optional<String> = code.getOptional("code")

    /**
     * UUID of the Counter used to create the pricing.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun counterId(): Optional<String> = counterId.getOptional("counterId")

    /**
     * The ID of the user who created this item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * Controls whether or not charge rates under a set of pricing bands configured for a Pricing
     * are applied according to each separate band or at the highest band reached.
     *
     * The default value is **TRUE**.
     * - When TRUE, at billing charge rates are applied according to each separate band.
     * - When FALSE, at billing charge rates are applied according to highest band reached.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cumulative(): Optional<Boolean> = cumulative.getOptional("cumulative")

    /**
     * Displayed on Bill line items.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * The DateTime when this item was created _(in ISO-8601 format)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtCreated(): Optional<OffsetDateTime> = dtCreated.getOptional("dtCreated")

    /**
     * The DateTime when this item was last modified _(in ISO-8601 format)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtLastModified(): Optional<OffsetDateTime> = dtLastModified.getOptional("dtLastModified")

    /**
     * The end date _(in ISO-8601 format)_ for when the Pricing ceases to be active for the Plan or
     * Plan Template.
     *
     * If not specified, the Pricing remains active indefinitely.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endDate(): Optional<OffsetDateTime> = endDate.getOptional("endDate")

    /**
     * The ID of the user who last modified this item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedBy(): Optional<String> = lastModifiedBy.getOptional("lastModifiedBy")

    /**
     * UUID of the Plan the Pricing is created for.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun planId(): Optional<String> = planId.getOptional("planId")

    /**
     * UUID of the Plan Template the Pricing was created for.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun planTemplateId(): Optional<String> = planTemplateId.getOptional("planTemplateId")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pricingBands(): Optional<List<PricingBand>> = pricingBands.getOptional("pricingBands")

    /**
     * The default value is **TRUE**.
     * - When TRUE, counter adjustment credits are prorated and are billed according to the number
     *   of days in billing period.
     * - When FALSE, counter adjustment credits are not prorated and are billed for the entire
     *   billing period.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun proRateAdjustmentCredit(): Optional<Boolean> =
        proRateAdjustmentCredit.getOptional("proRateAdjustmentCredit")

    /**
     * The default value is **TRUE**.
     * - When TRUE, counter adjustment debits are prorated and are billed according to the number of
     *   days in billing period.
     * - When FALSE, counter adjustment debits are not prorated and are billed for the entire
     *   billing period.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun proRateAdjustmentDebit(): Optional<Boolean> =
        proRateAdjustmentDebit.getOptional("proRateAdjustmentDebit")

    /**
     * The default value is **TRUE**.
     * - When TRUE, counter running total charges are prorated and are billed according to the
     *   number of days in billing period.
     * - When FALSE, counter running total charges are not prorated and are billed for the entire
     *   billing period.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun proRateRunningTotal(): Optional<Boolean> =
        proRateRunningTotal.getOptional("proRateRunningTotal")

    /**
     * The default value is **TRUE**.
     * - When TRUE, running totals are billed at the start of each billing period.
     * - When FALSE, running totals are billed at the end of each billing period.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runningTotalBillInAdvance(): Optional<Boolean> =
        runningTotalBillInAdvance.getOptional("runningTotalBillInAdvance")

    /**
     * The start date _(in ISO-8601 format)_ for when the Pricing starts to be active for the Plan
     * of Plan Template.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startDate(): Optional<OffsetDateTime> = startDate.getOptional("startDate")

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
     * Returns the raw JSON value of [accountingProductId].
     *
     * Unlike [accountingProductId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("accountingProductId")
    @ExcludeMissing
    fun _accountingProductId(): JsonField<String> = accountingProductId

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /**
     * Returns the raw JSON value of [counterId].
     *
     * Unlike [counterId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("counterId") @ExcludeMissing fun _counterId(): JsonField<String> = counterId

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [cumulative].
     *
     * Unlike [cumulative], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cumulative") @ExcludeMissing fun _cumulative(): JsonField<Boolean> = cumulative

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

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
     * Returns the raw JSON value of [lastModifiedBy].
     *
     * Unlike [lastModifiedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /**
     * Returns the raw JSON value of [planId].
     *
     * Unlike [planId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("planId") @ExcludeMissing fun _planId(): JsonField<String> = planId

    /**
     * Returns the raw JSON value of [planTemplateId].
     *
     * Unlike [planTemplateId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("planTemplateId")
    @ExcludeMissing
    fun _planTemplateId(): JsonField<String> = planTemplateId

    /**
     * Returns the raw JSON value of [pricingBands].
     *
     * Unlike [pricingBands], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pricingBands")
    @ExcludeMissing
    fun _pricingBands(): JsonField<List<PricingBand>> = pricingBands

    /**
     * Returns the raw JSON value of [proRateAdjustmentCredit].
     *
     * Unlike [proRateAdjustmentCredit], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("proRateAdjustmentCredit")
    @ExcludeMissing
    fun _proRateAdjustmentCredit(): JsonField<Boolean> = proRateAdjustmentCredit

    /**
     * Returns the raw JSON value of [proRateAdjustmentDebit].
     *
     * Unlike [proRateAdjustmentDebit], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("proRateAdjustmentDebit")
    @ExcludeMissing
    fun _proRateAdjustmentDebit(): JsonField<Boolean> = proRateAdjustmentDebit

    /**
     * Returns the raw JSON value of [proRateRunningTotal].
     *
     * Unlike [proRateRunningTotal], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("proRateRunningTotal")
    @ExcludeMissing
    fun _proRateRunningTotal(): JsonField<Boolean> = proRateRunningTotal

    /**
     * Returns the raw JSON value of [runningTotalBillInAdvance].
     *
     * Unlike [runningTotalBillInAdvance], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("runningTotalBillInAdvance")
    @ExcludeMissing
    fun _runningTotalBillInAdvance(): JsonField<Boolean> = runningTotalBillInAdvance

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startDate")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

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
         * Returns a mutable builder for constructing an instance of [CounterPricingResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CounterPricingResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var accountingProductId: JsonField<String> = JsonMissing.of()
        private var code: JsonField<String> = JsonMissing.of()
        private var counterId: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var cumulative: JsonField<Boolean> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var planId: JsonField<String> = JsonMissing.of()
        private var planTemplateId: JsonField<String> = JsonMissing.of()
        private var pricingBands: JsonField<MutableList<PricingBand>>? = null
        private var proRateAdjustmentCredit: JsonField<Boolean> = JsonMissing.of()
        private var proRateAdjustmentDebit: JsonField<Boolean> = JsonMissing.of()
        private var proRateRunningTotal: JsonField<Boolean> = JsonMissing.of()
        private var runningTotalBillInAdvance: JsonField<Boolean> = JsonMissing.of()
        private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(counterPricingResponse: CounterPricingResponse) = apply {
            id = counterPricingResponse.id
            version = counterPricingResponse.version
            accountingProductId = counterPricingResponse.accountingProductId
            code = counterPricingResponse.code
            counterId = counterPricingResponse.counterId
            createdBy = counterPricingResponse.createdBy
            cumulative = counterPricingResponse.cumulative
            description = counterPricingResponse.description
            dtCreated = counterPricingResponse.dtCreated
            dtLastModified = counterPricingResponse.dtLastModified
            endDate = counterPricingResponse.endDate
            lastModifiedBy = counterPricingResponse.lastModifiedBy
            planId = counterPricingResponse.planId
            planTemplateId = counterPricingResponse.planTemplateId
            pricingBands = counterPricingResponse.pricingBands.map { it.toMutableList() }
            proRateAdjustmentCredit = counterPricingResponse.proRateAdjustmentCredit
            proRateAdjustmentDebit = counterPricingResponse.proRateAdjustmentDebit
            proRateRunningTotal = counterPricingResponse.proRateRunningTotal
            runningTotalBillInAdvance = counterPricingResponse.runningTotalBillInAdvance
            startDate = counterPricingResponse.startDate
            additionalProperties = counterPricingResponse.additionalProperties.toMutableMap()
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

        fun accountingProductId(accountingProductId: String) =
            accountingProductId(JsonField.of(accountingProductId))

        /**
         * Sets [Builder.accountingProductId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountingProductId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountingProductId(accountingProductId: JsonField<String>) = apply {
            this.accountingProductId = accountingProductId
        }

        /** Unique short code for the Pricing. */
        fun code(code: String) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** UUID of the Counter used to create the pricing. */
        fun counterId(counterId: String) = counterId(JsonField.of(counterId))

        /**
         * Sets [Builder.counterId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.counterId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun counterId(counterId: JsonField<String>) = apply { this.counterId = counterId }

        /** The ID of the user who created this item. */
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
         * Controls whether or not charge rates under a set of pricing bands configured for a
         * Pricing are applied according to each separate band or at the highest band reached.
         *
         * The default value is **TRUE**.
         * - When TRUE, at billing charge rates are applied according to each separate band.
         * - When FALSE, at billing charge rates are applied according to highest band reached.
         */
        fun cumulative(cumulative: Boolean) = cumulative(JsonField.of(cumulative))

        /**
         * Sets [Builder.cumulative] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cumulative] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cumulative(cumulative: JsonField<Boolean>) = apply { this.cumulative = cumulative }

        /** Displayed on Bill line items. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The DateTime when this item was created _(in ISO-8601 format)_. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /**
         * Sets [Builder.dtCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The DateTime when this item was last modified _(in ISO-8601 format)_. */
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
         * The end date _(in ISO-8601 format)_ for when the Pricing ceases to be active for the Plan
         * or Plan Template.
         *
         * If not specified, the Pricing remains active indefinitely.
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

        /** The ID of the user who last modified this item. */
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

        /** UUID of the Plan the Pricing is created for. */
        fun planId(planId: String) = planId(JsonField.of(planId))

        /**
         * Sets [Builder.planId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun planId(planId: JsonField<String>) = apply { this.planId = planId }

        /** UUID of the Plan Template the Pricing was created for. */
        fun planTemplateId(planTemplateId: String) = planTemplateId(JsonField.of(planTemplateId))

        /**
         * Sets [Builder.planTemplateId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planTemplateId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun planTemplateId(planTemplateId: JsonField<String>) = apply {
            this.planTemplateId = planTemplateId
        }

        fun pricingBands(pricingBands: List<PricingBand>) = pricingBands(JsonField.of(pricingBands))

        /**
         * Sets [Builder.pricingBands] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pricingBands] with a well-typed `List<PricingBand>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun pricingBands(pricingBands: JsonField<List<PricingBand>>) = apply {
            this.pricingBands = pricingBands.map { it.toMutableList() }
        }

        /**
         * Adds a single [PricingBand] to [pricingBands].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPricingBand(pricingBand: PricingBand) = apply {
            pricingBands =
                (pricingBands ?: JsonField.of(mutableListOf())).also {
                    checkKnown("pricingBands", it).add(pricingBand)
                }
        }

        /**
         * The default value is **TRUE**.
         * - When TRUE, counter adjustment credits are prorated and are billed according to the
         *   number of days in billing period.
         * - When FALSE, counter adjustment credits are not prorated and are billed for the entire
         *   billing period.
         */
        fun proRateAdjustmentCredit(proRateAdjustmentCredit: Boolean) =
            proRateAdjustmentCredit(JsonField.of(proRateAdjustmentCredit))

        /**
         * Sets [Builder.proRateAdjustmentCredit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.proRateAdjustmentCredit] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun proRateAdjustmentCredit(proRateAdjustmentCredit: JsonField<Boolean>) = apply {
            this.proRateAdjustmentCredit = proRateAdjustmentCredit
        }

        /**
         * The default value is **TRUE**.
         * - When TRUE, counter adjustment debits are prorated and are billed according to the
         *   number of days in billing period.
         * - When FALSE, counter adjustment debits are not prorated and are billed for the entire
         *   billing period.
         */
        fun proRateAdjustmentDebit(proRateAdjustmentDebit: Boolean) =
            proRateAdjustmentDebit(JsonField.of(proRateAdjustmentDebit))

        /**
         * Sets [Builder.proRateAdjustmentDebit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.proRateAdjustmentDebit] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun proRateAdjustmentDebit(proRateAdjustmentDebit: JsonField<Boolean>) = apply {
            this.proRateAdjustmentDebit = proRateAdjustmentDebit
        }

        /**
         * The default value is **TRUE**.
         * - When TRUE, counter running total charges are prorated and are billed according to the
         *   number of days in billing period.
         * - When FALSE, counter running total charges are not prorated and are billed for the
         *   entire billing period.
         */
        fun proRateRunningTotal(proRateRunningTotal: Boolean) =
            proRateRunningTotal(JsonField.of(proRateRunningTotal))

        /**
         * Sets [Builder.proRateRunningTotal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.proRateRunningTotal] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun proRateRunningTotal(proRateRunningTotal: JsonField<Boolean>) = apply {
            this.proRateRunningTotal = proRateRunningTotal
        }

        /**
         * The default value is **TRUE**.
         * - When TRUE, running totals are billed at the start of each billing period.
         * - When FALSE, running totals are billed at the end of each billing period.
         */
        fun runningTotalBillInAdvance(runningTotalBillInAdvance: Boolean) =
            runningTotalBillInAdvance(JsonField.of(runningTotalBillInAdvance))

        /**
         * Sets [Builder.runningTotalBillInAdvance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runningTotalBillInAdvance] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun runningTotalBillInAdvance(runningTotalBillInAdvance: JsonField<Boolean>) = apply {
            this.runningTotalBillInAdvance = runningTotalBillInAdvance
        }

        /**
         * The start date _(in ISO-8601 format)_ for when the Pricing starts to be active for the
         * Plan of Plan Template.
         */
        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

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
         * Returns an immutable instance of [CounterPricingResponse].
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
        fun build(): CounterPricingResponse =
            CounterPricingResponse(
                checkRequired("id", id),
                checkRequired("version", version),
                accountingProductId,
                code,
                counterId,
                createdBy,
                cumulative,
                description,
                dtCreated,
                dtLastModified,
                endDate,
                lastModifiedBy,
                planId,
                planTemplateId,
                (pricingBands ?: JsonMissing.of()).map { it.toImmutable() },
                proRateAdjustmentCredit,
                proRateAdjustmentDebit,
                proRateRunningTotal,
                runningTotalBillInAdvance,
                startDate,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CounterPricingResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        version()
        accountingProductId()
        code()
        counterId()
        createdBy()
        cumulative()
        description()
        dtCreated()
        dtLastModified()
        endDate()
        lastModifiedBy()
        planId()
        planTemplateId()
        pricingBands().ifPresent { it.forEach { it.validate() } }
        proRateAdjustmentCredit()
        proRateAdjustmentDebit()
        proRateRunningTotal()
        runningTotalBillInAdvance()
        startDate()
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
            (if (accountingProductId.asKnown().isPresent) 1 else 0) +
            (if (code.asKnown().isPresent) 1 else 0) +
            (if (counterId.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (cumulative.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (dtCreated.asKnown().isPresent) 1 else 0) +
            (if (dtLastModified.asKnown().isPresent) 1 else 0) +
            (if (endDate.asKnown().isPresent) 1 else 0) +
            (if (lastModifiedBy.asKnown().isPresent) 1 else 0) +
            (if (planId.asKnown().isPresent) 1 else 0) +
            (if (planTemplateId.asKnown().isPresent) 1 else 0) +
            (pricingBands.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (proRateAdjustmentCredit.asKnown().isPresent) 1 else 0) +
            (if (proRateAdjustmentDebit.asKnown().isPresent) 1 else 0) +
            (if (proRateRunningTotal.asKnown().isPresent) 1 else 0) +
            (if (runningTotalBillInAdvance.asKnown().isPresent) 1 else 0) +
            (if (startDate.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CounterPricingResponse && id == other.id && version == other.version && accountingProductId == other.accountingProductId && code == other.code && counterId == other.counterId && createdBy == other.createdBy && cumulative == other.cumulative && description == other.description && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && endDate == other.endDate && lastModifiedBy == other.lastModifiedBy && planId == other.planId && planTemplateId == other.planTemplateId && pricingBands == other.pricingBands && proRateAdjustmentCredit == other.proRateAdjustmentCredit && proRateAdjustmentDebit == other.proRateAdjustmentDebit && proRateRunningTotal == other.proRateRunningTotal && runningTotalBillInAdvance == other.runningTotalBillInAdvance && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, accountingProductId, code, counterId, createdBy, cumulative, description, dtCreated, dtLastModified, endDate, lastModifiedBy, planId, planTemplateId, pricingBands, proRateAdjustmentCredit, proRateAdjustmentDebit, proRateRunningTotal, runningTotalBillInAdvance, startDate, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CounterPricingResponse{id=$id, version=$version, accountingProductId=$accountingProductId, code=$code, counterId=$counterId, createdBy=$createdBy, cumulative=$cumulative, description=$description, dtCreated=$dtCreated, dtLastModified=$dtLastModified, endDate=$endDate, lastModifiedBy=$lastModifiedBy, planId=$planId, planTemplateId=$planTemplateId, pricingBands=$pricingBands, proRateAdjustmentCredit=$proRateAdjustmentCredit, proRateAdjustmentDebit=$proRateAdjustmentDebit, proRateRunningTotal=$proRateRunningTotal, runningTotalBillInAdvance=$runningTotalBillInAdvance, startDate=$startDate, additionalProperties=$additionalProperties}"
}
