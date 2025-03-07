// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.m3ter.sdk.core.ExcludeMissing
import com.m3ter.sdk.core.JsonField
import com.m3ter.sdk.core.JsonMissing
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.core.NoAutoDetect
import com.m3ter.sdk.core.checkKnown
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class CounterPricingResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("accountingProductId")
    @ExcludeMissing
    private val accountingProductId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("code") @ExcludeMissing private val code: JsonField<String> = JsonMissing.of(),
    @JsonProperty("counterId")
    @ExcludeMissing
    private val counterId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("createdBy")
    @ExcludeMissing
    private val createdBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("cumulative")
    @ExcludeMissing
    private val cumulative: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("dtCreated")
    @ExcludeMissing
    private val dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    private val dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("endDate")
    @ExcludeMissing
    private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    private val lastModifiedBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("planId")
    @ExcludeMissing
    private val planId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("planTemplateId")
    @ExcludeMissing
    private val planTemplateId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("pricingBands")
    @ExcludeMissing
    private val pricingBands: JsonField<List<PricingBand>> = JsonMissing.of(),
    @JsonProperty("proRateAdjustmentCredit")
    @ExcludeMissing
    private val proRateAdjustmentCredit: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("proRateAdjustmentDebit")
    @ExcludeMissing
    private val proRateAdjustmentDebit: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("proRateRunningTotal")
    @ExcludeMissing
    private val proRateRunningTotal: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("runningTotalBillInAdvance")
    @ExcludeMissing
    private val runningTotalBillInAdvance: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("startDate")
    @ExcludeMissing
    private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
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

    fun accountingProductId(): Optional<String> =
        Optional.ofNullable(accountingProductId.getNullable("accountingProductId"))

    /** Unique short code for the Pricing. */
    fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

    /** UUID of the Counter used to create the pricing. */
    fun counterId(): Optional<String> = Optional.ofNullable(counterId.getNullable("counterId"))

    /** The ID of the user who created this item. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /**
     * Controls whether or not charge rates under a set of pricing bands configured for a Pricing
     * are applied according to each separate band or at the highest band reached.
     *
     * The default value is **TRUE**.
     * - When TRUE, at billing charge rates are applied according to each separate band.
     * - When FALSE, at billing charge rates are applied according to highest band reached.
     */
    fun cumulative(): Optional<Boolean> = Optional.ofNullable(cumulative.getNullable("cumulative"))

    /** Displayed on Bill line items. */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** The DateTime when this item was created _(in ISO-8601 format)_. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /** The DateTime when this item was last modified _(in ISO-8601 format)_. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /**
     * The end date _(in ISO-8601 format)_ for when the Pricing ceases to be active for the Plan or
     * Plan Template.
     *
     * If not specified, the Pricing remains active indefinitely.
     */
    fun endDate(): Optional<OffsetDateTime> = Optional.ofNullable(endDate.getNullable("endDate"))

    /** The ID of the user who last modified this item. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /** UUID of the Plan the Pricing is created for. */
    fun planId(): Optional<String> = Optional.ofNullable(planId.getNullable("planId"))

    /** UUID of the Plan Template the Pricing was created for. */
    fun planTemplateId(): Optional<String> =
        Optional.ofNullable(planTemplateId.getNullable("planTemplateId"))

    fun pricingBands(): Optional<List<PricingBand>> =
        Optional.ofNullable(pricingBands.getNullable("pricingBands"))

    /**
     * The default value is **TRUE**.
     * - When TRUE, counter adjustment credits are prorated and are billed according to the number
     *   of days in billing period.
     * - When FALSE, counter adjustment credits are not prorated and are billed for the entire
     *   billing period.
     */
    fun proRateAdjustmentCredit(): Optional<Boolean> =
        Optional.ofNullable(proRateAdjustmentCredit.getNullable("proRateAdjustmentCredit"))

    /**
     * The default value is **TRUE**.
     * - When TRUE, counter adjustment debits are prorated and are billed according to the number of
     *   days in billing period.
     * - When FALSE, counter adjustment debits are not prorated and are billed for the entire
     *   billing period.
     */
    fun proRateAdjustmentDebit(): Optional<Boolean> =
        Optional.ofNullable(proRateAdjustmentDebit.getNullable("proRateAdjustmentDebit"))

    /**
     * The default value is **TRUE**.
     * - When TRUE, counter running total charges are prorated and are billed according to the
     *   number of days in billing period.
     * - When FALSE, counter running total charges are not prorated and are billed for the entire
     *   billing period.
     */
    fun proRateRunningTotal(): Optional<Boolean> =
        Optional.ofNullable(proRateRunningTotal.getNullable("proRateRunningTotal"))

    /**
     * The default value is **TRUE**.
     * - When TRUE, running totals are billed at the start of each billing period.
     * - When FALSE, running totals are billed at the end of each billing period.
     */
    fun runningTotalBillInAdvance(): Optional<Boolean> =
        Optional.ofNullable(runningTotalBillInAdvance.getNullable("runningTotalBillInAdvance"))

    /**
     * The start date _(in ISO-8601 format)_ for when the Pricing starts to be active for the Plan
     * of Plan Template.
     */
    fun startDate(): Optional<OffsetDateTime> =
        Optional.ofNullable(startDate.getNullable("startDate"))

    /** The UUID of the entity. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    @JsonProperty("accountingProductId")
    @ExcludeMissing
    fun _accountingProductId(): JsonField<String> = accountingProductId

    /** Unique short code for the Pricing. */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /** UUID of the Counter used to create the pricing. */
    @JsonProperty("counterId") @ExcludeMissing fun _counterId(): JsonField<String> = counterId

    /** The ID of the user who created this item. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * Controls whether or not charge rates under a set of pricing bands configured for a Pricing
     * are applied according to each separate band or at the highest band reached.
     *
     * The default value is **TRUE**.
     * - When TRUE, at billing charge rates are applied according to each separate band.
     * - When FALSE, at billing charge rates are applied according to highest band reached.
     */
    @JsonProperty("cumulative") @ExcludeMissing fun _cumulative(): JsonField<Boolean> = cumulative

    /** Displayed on Bill line items. */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /** The DateTime when this item was created _(in ISO-8601 format)_. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /** The DateTime when this item was last modified _(in ISO-8601 format)_. */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /**
     * The end date _(in ISO-8601 format)_ for when the Pricing ceases to be active for the Plan or
     * Plan Template.
     *
     * If not specified, the Pricing remains active indefinitely.
     */
    @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    /** The ID of the user who last modified this item. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /** UUID of the Plan the Pricing is created for. */
    @JsonProperty("planId") @ExcludeMissing fun _planId(): JsonField<String> = planId

    /** UUID of the Plan Template the Pricing was created for. */
    @JsonProperty("planTemplateId")
    @ExcludeMissing
    fun _planTemplateId(): JsonField<String> = planTemplateId

    @JsonProperty("pricingBands")
    @ExcludeMissing
    fun _pricingBands(): JsonField<List<PricingBand>> = pricingBands

    /**
     * The default value is **TRUE**.
     * - When TRUE, counter adjustment credits are prorated and are billed according to the number
     *   of days in billing period.
     * - When FALSE, counter adjustment credits are not prorated and are billed for the entire
     *   billing period.
     */
    @JsonProperty("proRateAdjustmentCredit")
    @ExcludeMissing
    fun _proRateAdjustmentCredit(): JsonField<Boolean> = proRateAdjustmentCredit

    /**
     * The default value is **TRUE**.
     * - When TRUE, counter adjustment debits are prorated and are billed according to the number of
     *   days in billing period.
     * - When FALSE, counter adjustment debits are not prorated and are billed for the entire
     *   billing period.
     */
    @JsonProperty("proRateAdjustmentDebit")
    @ExcludeMissing
    fun _proRateAdjustmentDebit(): JsonField<Boolean> = proRateAdjustmentDebit

    /**
     * The default value is **TRUE**.
     * - When TRUE, counter running total charges are prorated and are billed according to the
     *   number of days in billing period.
     * - When FALSE, counter running total charges are not prorated and are billed for the entire
     *   billing period.
     */
    @JsonProperty("proRateRunningTotal")
    @ExcludeMissing
    fun _proRateRunningTotal(): JsonField<Boolean> = proRateRunningTotal

    /**
     * The default value is **TRUE**.
     * - When TRUE, running totals are billed at the start of each billing period.
     * - When FALSE, running totals are billed at the end of each billing period.
     */
    @JsonProperty("runningTotalBillInAdvance")
    @ExcludeMissing
    fun _runningTotalBillInAdvance(): JsonField<Boolean> = runningTotalBillInAdvance

    /**
     * The start date _(in ISO-8601 format)_ for when the Pricing starts to be active for the Plan
     * of Plan Template.
     */
    @JsonProperty("startDate")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun accountingProductId(accountingProductId: String) =
            accountingProductId(JsonField.of(accountingProductId))

        fun accountingProductId(accountingProductId: JsonField<String>) = apply {
            this.accountingProductId = accountingProductId
        }

        /** Unique short code for the Pricing. */
        fun code(code: String) = code(JsonField.of(code))

        /** Unique short code for the Pricing. */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** UUID of the Counter used to create the pricing. */
        fun counterId(counterId: String) = counterId(JsonField.of(counterId))

        /** UUID of the Counter used to create the pricing. */
        fun counterId(counterId: JsonField<String>) = apply { this.counterId = counterId }

        /** The ID of the user who created this item. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The ID of the user who created this item. */
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
         * Controls whether or not charge rates under a set of pricing bands configured for a
         * Pricing are applied according to each separate band or at the highest band reached.
         *
         * The default value is **TRUE**.
         * - When TRUE, at billing charge rates are applied according to each separate band.
         * - When FALSE, at billing charge rates are applied according to highest band reached.
         */
        fun cumulative(cumulative: JsonField<Boolean>) = apply { this.cumulative = cumulative }

        /** Displayed on Bill line items. */
        fun description(description: String) = description(JsonField.of(description))

        /** Displayed on Bill line items. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The DateTime when this item was created _(in ISO-8601 format)_. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /** The DateTime when this item was created _(in ISO-8601 format)_. */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The DateTime when this item was last modified _(in ISO-8601 format)_. */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /** The DateTime when this item was last modified _(in ISO-8601 format)_. */
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
         * The end date _(in ISO-8601 format)_ for when the Pricing ceases to be active for the Plan
         * or Plan Template.
         *
         * If not specified, the Pricing remains active indefinitely.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        /** The ID of the user who last modified this item. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The ID of the user who last modified this item. */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
        }

        /** UUID of the Plan the Pricing is created for. */
        fun planId(planId: String) = planId(JsonField.of(planId))

        /** UUID of the Plan the Pricing is created for. */
        fun planId(planId: JsonField<String>) = apply { this.planId = planId }

        /** UUID of the Plan Template the Pricing was created for. */
        fun planTemplateId(planTemplateId: String) = planTemplateId(JsonField.of(planTemplateId))

        /** UUID of the Plan Template the Pricing was created for. */
        fun planTemplateId(planTemplateId: JsonField<String>) = apply {
            this.planTemplateId = planTemplateId
        }

        fun pricingBands(pricingBands: List<PricingBand>) = pricingBands(JsonField.of(pricingBands))

        fun pricingBands(pricingBands: JsonField<List<PricingBand>>) = apply {
            this.pricingBands = pricingBands.map { it.toMutableList() }
        }

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
         * The default value is **TRUE**.
         * - When TRUE, counter adjustment credits are prorated and are billed according to the
         *   number of days in billing period.
         * - When FALSE, counter adjustment credits are not prorated and are billed for the entire
         *   billing period.
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
         * The default value is **TRUE**.
         * - When TRUE, counter adjustment debits are prorated and are billed according to the
         *   number of days in billing period.
         * - When FALSE, counter adjustment debits are not prorated and are billed for the entire
         *   billing period.
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
         * The default value is **TRUE**.
         * - When TRUE, counter running total charges are prorated and are billed according to the
         *   number of days in billing period.
         * - When FALSE, counter running total charges are not prorated and are billed for the
         *   entire billing period.
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
         * The default value is **TRUE**.
         * - When TRUE, running totals are billed at the start of each billing period.
         * - When FALSE, running totals are billed at the end of each billing period.
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
         * The start date _(in ISO-8601 format)_ for when the Pricing starts to be active for the
         * Plan of Plan Template.
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
                additionalProperties.toImmutable(),
            )
    }

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
