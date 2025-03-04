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
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkKnown
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Create a new CounterPricing.
 *
 * **Note:** Either `planId` or `planTemplateId` request parameters are required for this call to be
 * valid. If you omit both, then you will receive a validation error.
 */
class CounterPricingCreateParams
private constructor(
    private val orgId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    /** UUID of the Counter used to create the pricing. */
    fun counterId(): String = body.counterId()

    fun pricingBands(): List<PricingBand> = body.pricingBands()

    /**
     * The start date _(in ISO-8601 format)_ for when the Pricing starts to be active for the Plan
     * of Plan Template._(Required)_
     */
    fun startDate(): OffsetDateTime = body.startDate()

    /** Optional Product ID this Pricing should be attributed to for accounting purposes */
    fun accountingProductId(): Optional<String> = body.accountingProductId()

    /** Unique short code for the Pricing. */
    fun code(): Optional<String> = body.code()

    /**
     * Controls whether or not charge rates under a set of pricing bands configured for a Pricing
     * are applied according to each separate band or at the highest band reached.
     *
     * _(Optional)_. The default value is **FALSE**.
     * - When TRUE, at billing charge rates are applied according to each separate band.
     * - When FALSE, at billing charge rates are applied according to highest band reached.
     *
     * **NOTE:** Use the `cumulative` parameter to create the type of Pricing you require. For
     * example, for Tiered Pricing set to **TRUE**; for Volume Pricing, set to **FALSE**.
     */
    fun cumulative(): Optional<Boolean> = body.cumulative()

    /** Displayed on Bill line items. */
    fun description(): Optional<String> = body.description()

    /**
     * The end date _(in ISO-8601 format)_ for when the Pricing ceases to be active for the Plan or
     * Plan Template.
     *
     * _(Optional)_ If not specified, the Pricing remains active indefinitely.
     */
    fun endDate(): Optional<OffsetDateTime> = body.endDate()

    /** UUID of the Plan the Pricing is created for. */
    fun planId(): Optional<String> = body.planId()

    /** UUID of the Plan Template the Pricing is created for. */
    fun planTemplateId(): Optional<String> = body.planTemplateId()

    /**
     * The default value is **TRUE**.
     * - When TRUE, counter adjustment credits are prorated and are billed according to the number
     *   of days in billing period.
     * - When FALSE, counter adjustment credits are not prorated and are billed for the entire
     *   billing period.
     *
     * _(Optional)_.
     */
    fun proRateAdjustmentCredit(): Optional<Boolean> = body.proRateAdjustmentCredit()

    /**
     * The default value is **TRUE**.
     * - When TRUE, counter adjustment debits are prorated and are billed according to the number of
     *   days in billing period.
     * - When FALSE, counter adjustment debits are not prorated and are billed for the entire
     *   billing period.
     *
     * _(Optional)_.
     */
    fun proRateAdjustmentDebit(): Optional<Boolean> = body.proRateAdjustmentDebit()

    /**
     * The default value is **TRUE**.
     * - When TRUE, counter running total charges are prorated and are billed according to the
     *   number of days in billing period.
     * - When FALSE, counter running total charges are not prorated and are billed for the entire
     *   billing period.
     *
     * _(Optional)_.
     */
    fun proRateRunningTotal(): Optional<Boolean> = body.proRateRunningTotal()

    /**
     * The default value is **TRUE**.
     * - When TRUE, running totals are billed at the start of each billing period.
     * - When FALSE, running totals are billed at the end of each billing period.
     *
     * _(Optional)_.
     */
    fun runningTotalBillInAdvance(): Optional<Boolean> = body.runningTotalBillInAdvance()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     */
    fun version(): Optional<Long> = body.version()

    /** UUID of the Counter used to create the pricing. */
    fun _counterId(): JsonField<String> = body._counterId()

    fun _pricingBands(): JsonField<List<PricingBand>> = body._pricingBands()

    /**
     * The start date _(in ISO-8601 format)_ for when the Pricing starts to be active for the Plan
     * of Plan Template._(Required)_
     */
    fun _startDate(): JsonField<OffsetDateTime> = body._startDate()

    /** Optional Product ID this Pricing should be attributed to for accounting purposes */
    fun _accountingProductId(): JsonField<String> = body._accountingProductId()

    /** Unique short code for the Pricing. */
    fun _code(): JsonField<String> = body._code()

    /**
     * Controls whether or not charge rates under a set of pricing bands configured for a Pricing
     * are applied according to each separate band or at the highest band reached.
     *
     * _(Optional)_. The default value is **FALSE**.
     * - When TRUE, at billing charge rates are applied according to each separate band.
     * - When FALSE, at billing charge rates are applied according to highest band reached.
     *
     * **NOTE:** Use the `cumulative` parameter to create the type of Pricing you require. For
     * example, for Tiered Pricing set to **TRUE**; for Volume Pricing, set to **FALSE**.
     */
    fun _cumulative(): JsonField<Boolean> = body._cumulative()

    /** Displayed on Bill line items. */
    fun _description(): JsonField<String> = body._description()

    /**
     * The end date _(in ISO-8601 format)_ for when the Pricing ceases to be active for the Plan or
     * Plan Template.
     *
     * _(Optional)_ If not specified, the Pricing remains active indefinitely.
     */
    fun _endDate(): JsonField<OffsetDateTime> = body._endDate()

    /** UUID of the Plan the Pricing is created for. */
    fun _planId(): JsonField<String> = body._planId()

    /** UUID of the Plan Template the Pricing is created for. */
    fun _planTemplateId(): JsonField<String> = body._planTemplateId()

    /**
     * The default value is **TRUE**.
     * - When TRUE, counter adjustment credits are prorated and are billed according to the number
     *   of days in billing period.
     * - When FALSE, counter adjustment credits are not prorated and are billed for the entire
     *   billing period.
     *
     * _(Optional)_.
     */
    fun _proRateAdjustmentCredit(): JsonField<Boolean> = body._proRateAdjustmentCredit()

    /**
     * The default value is **TRUE**.
     * - When TRUE, counter adjustment debits are prorated and are billed according to the number of
     *   days in billing period.
     * - When FALSE, counter adjustment debits are not prorated and are billed for the entire
     *   billing period.
     *
     * _(Optional)_.
     */
    fun _proRateAdjustmentDebit(): JsonField<Boolean> = body._proRateAdjustmentDebit()

    /**
     * The default value is **TRUE**.
     * - When TRUE, counter running total charges are prorated and are billed according to the
     *   number of days in billing period.
     * - When FALSE, counter running total charges are not prorated and are billed for the entire
     *   billing period.
     *
     * _(Optional)_.
     */
    fun _proRateRunningTotal(): JsonField<Boolean> = body._proRateRunningTotal()

    /**
     * The default value is **TRUE**.
     * - When TRUE, running totals are billed at the start of each billing period.
     * - When FALSE, running totals are billed at the end of each billing period.
     *
     * _(Optional)_.
     */
    fun _runningTotalBillInAdvance(): JsonField<Boolean> = body._runningTotalBillInAdvance()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     */
    fun _version(): JsonField<Long> = body._version()

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
        @JsonProperty("counterId")
        @ExcludeMissing
        private val counterId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pricingBands")
        @ExcludeMissing
        private val pricingBands: JsonField<List<PricingBand>> = JsonMissing.of(),
        @JsonProperty("startDate")
        @ExcludeMissing
        private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("accountingProductId")
        @ExcludeMissing
        private val accountingProductId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("code")
        @ExcludeMissing
        private val code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cumulative")
        @ExcludeMissing
        private val cumulative: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("endDate")
        @ExcludeMissing
        private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("planId")
        @ExcludeMissing
        private val planId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("planTemplateId")
        @ExcludeMissing
        private val planTemplateId: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("version")
        @ExcludeMissing
        private val version: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** UUID of the Counter used to create the pricing. */
        fun counterId(): String = counterId.getRequired("counterId")

        fun pricingBands(): List<PricingBand> = pricingBands.getRequired("pricingBands")

        /**
         * The start date _(in ISO-8601 format)_ for when the Pricing starts to be active for the
         * Plan of Plan Template._(Required)_
         */
        fun startDate(): OffsetDateTime = startDate.getRequired("startDate")

        /** Optional Product ID this Pricing should be attributed to for accounting purposes */
        fun accountingProductId(): Optional<String> =
            Optional.ofNullable(accountingProductId.getNullable("accountingProductId"))

        /** Unique short code for the Pricing. */
        fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

        /**
         * Controls whether or not charge rates under a set of pricing bands configured for a
         * Pricing are applied according to each separate band or at the highest band reached.
         *
         * _(Optional)_. The default value is **FALSE**.
         * - When TRUE, at billing charge rates are applied according to each separate band.
         * - When FALSE, at billing charge rates are applied according to highest band reached.
         *
         * **NOTE:** Use the `cumulative` parameter to create the type of Pricing you require. For
         * example, for Tiered Pricing set to **TRUE**; for Volume Pricing, set to **FALSE**.
         */
        fun cumulative(): Optional<Boolean> =
            Optional.ofNullable(cumulative.getNullable("cumulative"))

        /** Displayed on Bill line items. */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * The end date _(in ISO-8601 format)_ for when the Pricing ceases to be active for the Plan
         * or Plan Template.
         *
         * _(Optional)_ If not specified, the Pricing remains active indefinitely.
         */
        fun endDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(endDate.getNullable("endDate"))

        /** UUID of the Plan the Pricing is created for. */
        fun planId(): Optional<String> = Optional.ofNullable(planId.getNullable("planId"))

        /** UUID of the Plan Template the Pricing is created for. */
        fun planTemplateId(): Optional<String> =
            Optional.ofNullable(planTemplateId.getNullable("planTemplateId"))

        /**
         * The default value is **TRUE**.
         * - When TRUE, counter adjustment credits are prorated and are billed according to the
         *   number of days in billing period.
         * - When FALSE, counter adjustment credits are not prorated and are billed for the entire
         *   billing period.
         *
         * _(Optional)_.
         */
        fun proRateAdjustmentCredit(): Optional<Boolean> =
            Optional.ofNullable(proRateAdjustmentCredit.getNullable("proRateAdjustmentCredit"))

        /**
         * The default value is **TRUE**.
         * - When TRUE, counter adjustment debits are prorated and are billed according to the
         *   number of days in billing period.
         * - When FALSE, counter adjustment debits are not prorated and are billed for the entire
         *   billing period.
         *
         * _(Optional)_.
         */
        fun proRateAdjustmentDebit(): Optional<Boolean> =
            Optional.ofNullable(proRateAdjustmentDebit.getNullable("proRateAdjustmentDebit"))

        /**
         * The default value is **TRUE**.
         * - When TRUE, counter running total charges are prorated and are billed according to the
         *   number of days in billing period.
         * - When FALSE, counter running total charges are not prorated and are billed for the
         *   entire billing period.
         *
         * _(Optional)_.
         */
        fun proRateRunningTotal(): Optional<Boolean> =
            Optional.ofNullable(proRateRunningTotal.getNullable("proRateRunningTotal"))

        /**
         * The default value is **TRUE**.
         * - When TRUE, running totals are billed at the start of each billing period.
         * - When FALSE, running totals are billed at the end of each billing period.
         *
         * _(Optional)_.
         */
        fun runningTotalBillInAdvance(): Optional<Boolean> =
            Optional.ofNullable(runningTotalBillInAdvance.getNullable("runningTotalBillInAdvance"))

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

        /** UUID of the Counter used to create the pricing. */
        @JsonProperty("counterId") @ExcludeMissing fun _counterId(): JsonField<String> = counterId

        @JsonProperty("pricingBands")
        @ExcludeMissing
        fun _pricingBands(): JsonField<List<PricingBand>> = pricingBands

        /**
         * The start date _(in ISO-8601 format)_ for when the Pricing starts to be active for the
         * Plan of Plan Template._(Required)_
         */
        @JsonProperty("startDate")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

        /** Optional Product ID this Pricing should be attributed to for accounting purposes */
        @JsonProperty("accountingProductId")
        @ExcludeMissing
        fun _accountingProductId(): JsonField<String> = accountingProductId

        /** Unique short code for the Pricing. */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Controls whether or not charge rates under a set of pricing bands configured for a
         * Pricing are applied according to each separate band or at the highest band reached.
         *
         * _(Optional)_. The default value is **FALSE**.
         * - When TRUE, at billing charge rates are applied according to each separate band.
         * - When FALSE, at billing charge rates are applied according to highest band reached.
         *
         * **NOTE:** Use the `cumulative` parameter to create the type of Pricing you require. For
         * example, for Tiered Pricing set to **TRUE**; for Volume Pricing, set to **FALSE**.
         */
        @JsonProperty("cumulative")
        @ExcludeMissing
        fun _cumulative(): JsonField<Boolean> = cumulative

        /** Displayed on Bill line items. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * The end date _(in ISO-8601 format)_ for when the Pricing ceases to be active for the Plan
         * or Plan Template.
         *
         * _(Optional)_ If not specified, the Pricing remains active indefinitely.
         */
        @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

        /** UUID of the Plan the Pricing is created for. */
        @JsonProperty("planId") @ExcludeMissing fun _planId(): JsonField<String> = planId

        /** UUID of the Plan Template the Pricing is created for. */
        @JsonProperty("planTemplateId")
        @ExcludeMissing
        fun _planTemplateId(): JsonField<String> = planTemplateId

        /**
         * The default value is **TRUE**.
         * - When TRUE, counter adjustment credits are prorated and are billed according to the
         *   number of days in billing period.
         * - When FALSE, counter adjustment credits are not prorated and are billed for the entire
         *   billing period.
         *
         * _(Optional)_.
         */
        @JsonProperty("proRateAdjustmentCredit")
        @ExcludeMissing
        fun _proRateAdjustmentCredit(): JsonField<Boolean> = proRateAdjustmentCredit

        /**
         * The default value is **TRUE**.
         * - When TRUE, counter adjustment debits are prorated and are billed according to the
         *   number of days in billing period.
         * - When FALSE, counter adjustment debits are not prorated and are billed for the entire
         *   billing period.
         *
         * _(Optional)_.
         */
        @JsonProperty("proRateAdjustmentDebit")
        @ExcludeMissing
        fun _proRateAdjustmentDebit(): JsonField<Boolean> = proRateAdjustmentDebit

        /**
         * The default value is **TRUE**.
         * - When TRUE, counter running total charges are prorated and are billed according to the
         *   number of days in billing period.
         * - When FALSE, counter running total charges are not prorated and are billed for the
         *   entire billing period.
         *
         * _(Optional)_.
         */
        @JsonProperty("proRateRunningTotal")
        @ExcludeMissing
        fun _proRateRunningTotal(): JsonField<Boolean> = proRateRunningTotal

        /**
         * The default value is **TRUE**.
         * - When TRUE, running totals are billed at the start of each billing period.
         * - When FALSE, running totals are billed at the end of each billing period.
         *
         * _(Optional)_.
         */
        @JsonProperty("runningTotalBillInAdvance")
        @ExcludeMissing
        fun _runningTotalBillInAdvance(): JsonField<Boolean> = runningTotalBillInAdvance

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            counterId()
            pricingBands().forEach { it.validate() }
            startDate()
            accountingProductId()
            code()
            cumulative()
            description()
            endDate()
            planId()
            planTemplateId()
            proRateAdjustmentCredit()
            proRateAdjustmentDebit()
            proRateRunningTotal()
            runningTotalBillInAdvance()
            version()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var counterId: JsonField<String>? = null
            private var pricingBands: JsonField<MutableList<PricingBand>>? = null
            private var startDate: JsonField<OffsetDateTime>? = null
            private var accountingProductId: JsonField<String> = JsonMissing.of()
            private var code: JsonField<String> = JsonMissing.of()
            private var cumulative: JsonField<Boolean> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var planId: JsonField<String> = JsonMissing.of()
            private var planTemplateId: JsonField<String> = JsonMissing.of()
            private var proRateAdjustmentCredit: JsonField<Boolean> = JsonMissing.of()
            private var proRateAdjustmentDebit: JsonField<Boolean> = JsonMissing.of()
            private var proRateRunningTotal: JsonField<Boolean> = JsonMissing.of()
            private var runningTotalBillInAdvance: JsonField<Boolean> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                counterId = body.counterId
                pricingBands = body.pricingBands.map { it.toMutableList() }
                startDate = body.startDate
                accountingProductId = body.accountingProductId
                code = body.code
                cumulative = body.cumulative
                description = body.description
                endDate = body.endDate
                planId = body.planId
                planTemplateId = body.planTemplateId
                proRateAdjustmentCredit = body.proRateAdjustmentCredit
                proRateAdjustmentDebit = body.proRateAdjustmentDebit
                proRateRunningTotal = body.proRateRunningTotal
                runningTotalBillInAdvance = body.runningTotalBillInAdvance
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** UUID of the Counter used to create the pricing. */
            fun counterId(counterId: String) = counterId(JsonField.of(counterId))

            /** UUID of the Counter used to create the pricing. */
            fun counterId(counterId: JsonField<String>) = apply { this.counterId = counterId }

            fun pricingBands(pricingBands: List<PricingBand>) =
                pricingBands(JsonField.of(pricingBands))

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
             * The start date _(in ISO-8601 format)_ for when the Pricing starts to be active for
             * the Plan of Plan Template._(Required)_
             */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /**
             * The start date _(in ISO-8601 format)_ for when the Pricing starts to be active for
             * the Plan of Plan Template._(Required)_
             */
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
            }

            /** Optional Product ID this Pricing should be attributed to for accounting purposes */
            fun accountingProductId(accountingProductId: String) =
                accountingProductId(JsonField.of(accountingProductId))

            /** Optional Product ID this Pricing should be attributed to for accounting purposes */
            fun accountingProductId(accountingProductId: JsonField<String>) = apply {
                this.accountingProductId = accountingProductId
            }

            /** Unique short code for the Pricing. */
            fun code(code: String) = code(JsonField.of(code))

            /** Unique short code for the Pricing. */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /**
             * Controls whether or not charge rates under a set of pricing bands configured for a
             * Pricing are applied according to each separate band or at the highest band reached.
             *
             * _(Optional)_. The default value is **FALSE**.
             * - When TRUE, at billing charge rates are applied according to each separate band.
             * - When FALSE, at billing charge rates are applied according to highest band reached.
             *
             * **NOTE:** Use the `cumulative` parameter to create the type of Pricing you require.
             * For example, for Tiered Pricing set to **TRUE**; for Volume Pricing, set to
             * **FALSE**.
             */
            fun cumulative(cumulative: Boolean) = cumulative(JsonField.of(cumulative))

            /**
             * Controls whether or not charge rates under a set of pricing bands configured for a
             * Pricing are applied according to each separate band or at the highest band reached.
             *
             * _(Optional)_. The default value is **FALSE**.
             * - When TRUE, at billing charge rates are applied according to each separate band.
             * - When FALSE, at billing charge rates are applied according to highest band reached.
             *
             * **NOTE:** Use the `cumulative` parameter to create the type of Pricing you require.
             * For example, for Tiered Pricing set to **TRUE**; for Volume Pricing, set to
             * **FALSE**.
             */
            fun cumulative(cumulative: JsonField<Boolean>) = apply { this.cumulative = cumulative }

            /** Displayed on Bill line items. */
            fun description(description: String) = description(JsonField.of(description))

            /** Displayed on Bill line items. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * The end date _(in ISO-8601 format)_ for when the Pricing ceases to be active for the
             * Plan or Plan Template.
             *
             * _(Optional)_ If not specified, the Pricing remains active indefinitely.
             */
            fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

            /**
             * The end date _(in ISO-8601 format)_ for when the Pricing ceases to be active for the
             * Plan or Plan Template.
             *
             * _(Optional)_ If not specified, the Pricing remains active indefinitely.
             */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /** UUID of the Plan the Pricing is created for. */
            fun planId(planId: String) = planId(JsonField.of(planId))

            /** UUID of the Plan the Pricing is created for. */
            fun planId(planId: JsonField<String>) = apply { this.planId = planId }

            /** UUID of the Plan Template the Pricing is created for. */
            fun planTemplateId(planTemplateId: String) =
                planTemplateId(JsonField.of(planTemplateId))

            /** UUID of the Plan Template the Pricing is created for. */
            fun planTemplateId(planTemplateId: JsonField<String>) = apply {
                this.planTemplateId = planTemplateId
            }

            /**
             * The default value is **TRUE**.
             * - When TRUE, counter adjustment credits are prorated and are billed according to the
             *   number of days in billing period.
             * - When FALSE, counter adjustment credits are not prorated and are billed for the
             *   entire billing period.
             *
             * _(Optional)_.
             */
            fun proRateAdjustmentCredit(proRateAdjustmentCredit: Boolean) =
                proRateAdjustmentCredit(JsonField.of(proRateAdjustmentCredit))

            /**
             * The default value is **TRUE**.
             * - When TRUE, counter adjustment credits are prorated and are billed according to the
             *   number of days in billing period.
             * - When FALSE, counter adjustment credits are not prorated and are billed for the
             *   entire billing period.
             *
             * _(Optional)_.
             */
            fun proRateAdjustmentCredit(proRateAdjustmentCredit: JsonField<Boolean>) = apply {
                this.proRateAdjustmentCredit = proRateAdjustmentCredit
            }

            /**
             * The default value is **TRUE**.
             * - When TRUE, counter adjustment debits are prorated and are billed according to the
             *   number of days in billing period.
             * - When FALSE, counter adjustment debits are not prorated and are billed for the
             *   entire billing period.
             *
             * _(Optional)_.
             */
            fun proRateAdjustmentDebit(proRateAdjustmentDebit: Boolean) =
                proRateAdjustmentDebit(JsonField.of(proRateAdjustmentDebit))

            /**
             * The default value is **TRUE**.
             * - When TRUE, counter adjustment debits are prorated and are billed according to the
             *   number of days in billing period.
             * - When FALSE, counter adjustment debits are not prorated and are billed for the
             *   entire billing period.
             *
             * _(Optional)_.
             */
            fun proRateAdjustmentDebit(proRateAdjustmentDebit: JsonField<Boolean>) = apply {
                this.proRateAdjustmentDebit = proRateAdjustmentDebit
            }

            /**
             * The default value is **TRUE**.
             * - When TRUE, counter running total charges are prorated and are billed according to
             *   the number of days in billing period.
             * - When FALSE, counter running total charges are not prorated and are billed for the
             *   entire billing period.
             *
             * _(Optional)_.
             */
            fun proRateRunningTotal(proRateRunningTotal: Boolean) =
                proRateRunningTotal(JsonField.of(proRateRunningTotal))

            /**
             * The default value is **TRUE**.
             * - When TRUE, counter running total charges are prorated and are billed according to
             *   the number of days in billing period.
             * - When FALSE, counter running total charges are not prorated and are billed for the
             *   entire billing period.
             *
             * _(Optional)_.
             */
            fun proRateRunningTotal(proRateRunningTotal: JsonField<Boolean>) = apply {
                this.proRateRunningTotal = proRateRunningTotal
            }

            /**
             * The default value is **TRUE**.
             * - When TRUE, running totals are billed at the start of each billing period.
             * - When FALSE, running totals are billed at the end of each billing period.
             *
             * _(Optional)_.
             */
            fun runningTotalBillInAdvance(runningTotalBillInAdvance: Boolean) =
                runningTotalBillInAdvance(JsonField.of(runningTotalBillInAdvance))

            /**
             * The default value is **TRUE**.
             * - When TRUE, running totals are billed at the start of each billing period.
             * - When FALSE, running totals are billed at the end of each billing period.
             *
             * _(Optional)_.
             */
            fun runningTotalBillInAdvance(runningTotalBillInAdvance: JsonField<Boolean>) = apply {
                this.runningTotalBillInAdvance = runningTotalBillInAdvance
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
             * The version number of the entity:
             * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
             *   Create_. On initial Create, version is set at 1 and listed in the response.
             * - **Update Entity:** On Update, version is required and must match the existing
             *   version because a check is performed to ensure sequential versioning is preserved.
             *   Version is incremented by 1 and listed in the response.
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

            fun build(): Body =
                Body(
                    checkRequired("counterId", counterId),
                    checkRequired("pricingBands", pricingBands).map { it.toImmutable() },
                    checkRequired("startDate", startDate),
                    accountingProductId,
                    code,
                    cumulative,
                    description,
                    endDate,
                    planId,
                    planTemplateId,
                    proRateAdjustmentCredit,
                    proRateAdjustmentDebit,
                    proRateRunningTotal,
                    runningTotalBillInAdvance,
                    version,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && counterId == other.counterId && pricingBands == other.pricingBands && startDate == other.startDate && accountingProductId == other.accountingProductId && code == other.code && cumulative == other.cumulative && description == other.description && endDate == other.endDate && planId == other.planId && planTemplateId == other.planTemplateId && proRateAdjustmentCredit == other.proRateAdjustmentCredit && proRateAdjustmentDebit == other.proRateAdjustmentDebit && proRateRunningTotal == other.proRateRunningTotal && runningTotalBillInAdvance == other.runningTotalBillInAdvance && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(counterId, pricingBands, startDate, accountingProductId, code, cumulative, description, endDate, planId, planTemplateId, proRateAdjustmentCredit, proRateAdjustmentDebit, proRateRunningTotal, runningTotalBillInAdvance, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{counterId=$counterId, pricingBands=$pricingBands, startDate=$startDate, accountingProductId=$accountingProductId, code=$code, cumulative=$cumulative, description=$description, endDate=$endDate, planId=$planId, planTemplateId=$planTemplateId, proRateAdjustmentCredit=$proRateAdjustmentCredit, proRateAdjustmentDebit=$proRateAdjustmentDebit, proRateRunningTotal=$proRateRunningTotal, runningTotalBillInAdvance=$runningTotalBillInAdvance, version=$version, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CounterPricingCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(counterPricingCreateParams: CounterPricingCreateParams) = apply {
            orgId = counterPricingCreateParams.orgId
            body = counterPricingCreateParams.body.toBuilder()
            additionalHeaders = counterPricingCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = counterPricingCreateParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /** UUID of the Counter used to create the pricing. */
        fun counterId(counterId: String) = apply { body.counterId(counterId) }

        /** UUID of the Counter used to create the pricing. */
        fun counterId(counterId: JsonField<String>) = apply { body.counterId(counterId) }

        fun pricingBands(pricingBands: List<PricingBand>) = apply {
            body.pricingBands(pricingBands)
        }

        fun pricingBands(pricingBands: JsonField<List<PricingBand>>) = apply {
            body.pricingBands(pricingBands)
        }

        fun addPricingBand(pricingBand: PricingBand) = apply { body.addPricingBand(pricingBand) }

        /**
         * The start date _(in ISO-8601 format)_ for when the Pricing starts to be active for the
         * Plan of Plan Template._(Required)_
         */
        fun startDate(startDate: OffsetDateTime) = apply { body.startDate(startDate) }

        /**
         * The start date _(in ISO-8601 format)_ for when the Pricing starts to be active for the
         * Plan of Plan Template._(Required)_
         */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { body.startDate(startDate) }

        /** Optional Product ID this Pricing should be attributed to for accounting purposes */
        fun accountingProductId(accountingProductId: String) = apply {
            body.accountingProductId(accountingProductId)
        }

        /** Optional Product ID this Pricing should be attributed to for accounting purposes */
        fun accountingProductId(accountingProductId: JsonField<String>) = apply {
            body.accountingProductId(accountingProductId)
        }

        /** Unique short code for the Pricing. */
        fun code(code: String) = apply { body.code(code) }

        /** Unique short code for the Pricing. */
        fun code(code: JsonField<String>) = apply { body.code(code) }

        /**
         * Controls whether or not charge rates under a set of pricing bands configured for a
         * Pricing are applied according to each separate band or at the highest band reached.
         *
         * _(Optional)_. The default value is **FALSE**.
         * - When TRUE, at billing charge rates are applied according to each separate band.
         * - When FALSE, at billing charge rates are applied according to highest band reached.
         *
         * **NOTE:** Use the `cumulative` parameter to create the type of Pricing you require. For
         * example, for Tiered Pricing set to **TRUE**; for Volume Pricing, set to **FALSE**.
         */
        fun cumulative(cumulative: Boolean) = apply { body.cumulative(cumulative) }

        /**
         * Controls whether or not charge rates under a set of pricing bands configured for a
         * Pricing are applied according to each separate band or at the highest band reached.
         *
         * _(Optional)_. The default value is **FALSE**.
         * - When TRUE, at billing charge rates are applied according to each separate band.
         * - When FALSE, at billing charge rates are applied according to highest band reached.
         *
         * **NOTE:** Use the `cumulative` parameter to create the type of Pricing you require. For
         * example, for Tiered Pricing set to **TRUE**; for Volume Pricing, set to **FALSE**.
         */
        fun cumulative(cumulative: JsonField<Boolean>) = apply { body.cumulative(cumulative) }

        /** Displayed on Bill line items. */
        fun description(description: String) = apply { body.description(description) }

        /** Displayed on Bill line items. */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * The end date _(in ISO-8601 format)_ for when the Pricing ceases to be active for the Plan
         * or Plan Template.
         *
         * _(Optional)_ If not specified, the Pricing remains active indefinitely.
         */
        fun endDate(endDate: OffsetDateTime) = apply { body.endDate(endDate) }

        /**
         * The end date _(in ISO-8601 format)_ for when the Pricing ceases to be active for the Plan
         * or Plan Template.
         *
         * _(Optional)_ If not specified, the Pricing remains active indefinitely.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { body.endDate(endDate) }

        /** UUID of the Plan the Pricing is created for. */
        fun planId(planId: String) = apply { body.planId(planId) }

        /** UUID of the Plan the Pricing is created for. */
        fun planId(planId: JsonField<String>) = apply { body.planId(planId) }

        /** UUID of the Plan Template the Pricing is created for. */
        fun planTemplateId(planTemplateId: String) = apply { body.planTemplateId(planTemplateId) }

        /** UUID of the Plan Template the Pricing is created for. */
        fun planTemplateId(planTemplateId: JsonField<String>) = apply {
            body.planTemplateId(planTemplateId)
        }

        /**
         * The default value is **TRUE**.
         * - When TRUE, counter adjustment credits are prorated and are billed according to the
         *   number of days in billing period.
         * - When FALSE, counter adjustment credits are not prorated and are billed for the entire
         *   billing period.
         *
         * _(Optional)_.
         */
        fun proRateAdjustmentCredit(proRateAdjustmentCredit: Boolean) = apply {
            body.proRateAdjustmentCredit(proRateAdjustmentCredit)
        }

        /**
         * The default value is **TRUE**.
         * - When TRUE, counter adjustment credits are prorated and are billed according to the
         *   number of days in billing period.
         * - When FALSE, counter adjustment credits are not prorated and are billed for the entire
         *   billing period.
         *
         * _(Optional)_.
         */
        fun proRateAdjustmentCredit(proRateAdjustmentCredit: JsonField<Boolean>) = apply {
            body.proRateAdjustmentCredit(proRateAdjustmentCredit)
        }

        /**
         * The default value is **TRUE**.
         * - When TRUE, counter adjustment debits are prorated and are billed according to the
         *   number of days in billing period.
         * - When FALSE, counter adjustment debits are not prorated and are billed for the entire
         *   billing period.
         *
         * _(Optional)_.
         */
        fun proRateAdjustmentDebit(proRateAdjustmentDebit: Boolean) = apply {
            body.proRateAdjustmentDebit(proRateAdjustmentDebit)
        }

        /**
         * The default value is **TRUE**.
         * - When TRUE, counter adjustment debits are prorated and are billed according to the
         *   number of days in billing period.
         * - When FALSE, counter adjustment debits are not prorated and are billed for the entire
         *   billing period.
         *
         * _(Optional)_.
         */
        fun proRateAdjustmentDebit(proRateAdjustmentDebit: JsonField<Boolean>) = apply {
            body.proRateAdjustmentDebit(proRateAdjustmentDebit)
        }

        /**
         * The default value is **TRUE**.
         * - When TRUE, counter running total charges are prorated and are billed according to the
         *   number of days in billing period.
         * - When FALSE, counter running total charges are not prorated and are billed for the
         *   entire billing period.
         *
         * _(Optional)_.
         */
        fun proRateRunningTotal(proRateRunningTotal: Boolean) = apply {
            body.proRateRunningTotal(proRateRunningTotal)
        }

        /**
         * The default value is **TRUE**.
         * - When TRUE, counter running total charges are prorated and are billed according to the
         *   number of days in billing period.
         * - When FALSE, counter running total charges are not prorated and are billed for the
         *   entire billing period.
         *
         * _(Optional)_.
         */
        fun proRateRunningTotal(proRateRunningTotal: JsonField<Boolean>) = apply {
            body.proRateRunningTotal(proRateRunningTotal)
        }

        /**
         * The default value is **TRUE**.
         * - When TRUE, running totals are billed at the start of each billing period.
         * - When FALSE, running totals are billed at the end of each billing period.
         *
         * _(Optional)_.
         */
        fun runningTotalBillInAdvance(runningTotalBillInAdvance: Boolean) = apply {
            body.runningTotalBillInAdvance(runningTotalBillInAdvance)
        }

        /**
         * The default value is **TRUE**.
         * - When TRUE, running totals are billed at the start of each billing period.
         * - When FALSE, running totals are billed at the end of each billing period.
         *
         * _(Optional)_.
         */
        fun runningTotalBillInAdvance(runningTotalBillInAdvance: JsonField<Boolean>) = apply {
            body.runningTotalBillInAdvance(runningTotalBillInAdvance)
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
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
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

        fun build(): CounterPricingCreateParams =
            CounterPricingCreateParams(
                checkRequired("orgId", orgId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CounterPricingCreateParams && orgId == other.orgId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CounterPricingCreateParams{orgId=$orgId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
