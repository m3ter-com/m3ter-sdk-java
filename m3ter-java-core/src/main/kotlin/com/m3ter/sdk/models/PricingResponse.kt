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
import com.m3ter.sdk.core.checkKnown
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class PricingResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("accountingProductId")
    @ExcludeMissing
    private val accountingProductId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("aggregationId")
    @ExcludeMissing
    private val aggregationId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("aggregationType")
    @ExcludeMissing
    private val aggregationType: JsonField<AggregationType> = JsonMissing.of(),
    @JsonProperty("code") @ExcludeMissing private val code: JsonField<String> = JsonMissing.of(),
    @JsonProperty("compoundAggregationId")
    @ExcludeMissing
    private val compoundAggregationId: JsonField<String> = JsonMissing.of(),
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
    @JsonProperty("minimumSpend")
    @ExcludeMissing
    private val minimumSpend: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("minimumSpendBillInAdvance")
    @ExcludeMissing
    private val minimumSpendBillInAdvance: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("minimumSpendDescription")
    @ExcludeMissing
    private val minimumSpendDescription: JsonField<String> = JsonMissing.of(),
    @JsonProperty("overagePricingBands")
    @ExcludeMissing
    private val overagePricingBands: JsonField<List<PricingBand>> = JsonMissing.of(),
    @JsonProperty("planId")
    @ExcludeMissing
    private val planId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("planTemplateId")
    @ExcludeMissing
    private val planTemplateId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("pricingBands")
    @ExcludeMissing
    private val pricingBands: JsonField<List<PricingBand>> = JsonMissing.of(),
    @JsonProperty("segment")
    @ExcludeMissing
    private val segment: JsonField<Segment> = JsonMissing.of(),
    @JsonProperty("segmentString")
    @ExcludeMissing
    private val segmentString: JsonField<String> = JsonMissing.of(),
    @JsonProperty("startDate")
    @ExcludeMissing
    private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("tiersSpanPlan")
    @ExcludeMissing
    private val tiersSpanPlan: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
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

    /**
     * UUID of the Aggregation used to create the Pricing. Use this when creating a Pricing for a
     * segmented aggregation.
     */
    fun aggregationId(): Optional<String> =
        Optional.ofNullable(aggregationId.getNullable("aggregationId"))

    fun aggregationType(): Optional<AggregationType> =
        Optional.ofNullable(aggregationType.getNullable("aggregationType"))

    /** Unique short code for the Pricing. */
    fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

    /** UUID of the Compound Aggregation used to create the Pricing. */
    fun compoundAggregationId(): Optional<String> =
        Optional.ofNullable(compoundAggregationId.getNullable("compoundAggregationId"))

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

    /**
     * The minimum spend amount per billing cycle for end customer Accounts on a Plan to which the
     * Pricing is applied.
     */
    fun minimumSpend(): Optional<Double> =
        Optional.ofNullable(minimumSpend.getNullable("minimumSpend"))

    /**
     * The default value is **FALSE**.
     * - When TRUE, minimum spend is billed at the start of each billing period.
     * - When FALSE, minimum spend is billed at the end of each billing period.
     *
     * _(Optional)_. Overrides the setting at Organization level for minimum spend billing in
     * arrears/in advance.
     */
    fun minimumSpendBillInAdvance(): Optional<Boolean> =
        Optional.ofNullable(minimumSpendBillInAdvance.getNullable("minimumSpendBillInAdvance"))

    /** Minimum spend description _(displayed on the bill line item)_. */
    fun minimumSpendDescription(): Optional<String> =
        Optional.ofNullable(minimumSpendDescription.getNullable("minimumSpendDescription"))

    /**
     * The Prepayment/Balance overage pricing in pricing bands for the case of a **Tiered** pricing
     * structure.
     */
    fun overagePricingBands(): Optional<List<PricingBand>> =
        Optional.ofNullable(overagePricingBands.getNullable("overagePricingBands"))

    /** UUID of the Plan the Pricing is created for. */
    fun planId(): Optional<String> = Optional.ofNullable(planId.getNullable("planId"))

    /** UUID of the Plan Template the Pricing was created for. */
    fun planTemplateId(): Optional<String> =
        Optional.ofNullable(planTemplateId.getNullable("planTemplateId"))

    fun pricingBands(): Optional<List<PricingBand>> =
        Optional.ofNullable(pricingBands.getNullable("pricingBands"))

    /**
     * Name of the segment for which you are defining a Pricing.
     *
     * For each segment in a segmented aggregation, make a separate call using `aggregationId`
     * parameter to update a Pricing.
     */
    fun segment(): Optional<Segment> = Optional.ofNullable(segment.getNullable("segment"))

    fun segmentString(): Optional<String> =
        Optional.ofNullable(segmentString.getNullable("segmentString"))

    /**
     * The start date _(in ISO-8601 format)_ for when the Pricing starts to be active for the Plan
     * of Plan Template.
     */
    fun startDate(): Optional<OffsetDateTime> =
        Optional.ofNullable(startDate.getNullable("startDate"))

    /**
     * The default value is **FALSE**.
     * - If TRUE, usage accumulates over the entire period the priced Plan is active for the
     *   account, and is not reset for pricing band rates at the start of each billing period.
     * - If FALSE, usage does not accumulate, and is reset for pricing bands at the start of each
     *   billing period.
     */
    fun tiersSpanPlan(): Optional<Boolean> =
        Optional.ofNullable(tiersSpanPlan.getNullable("tiersSpanPlan"))

    /**
     * - **DEBIT**. Default setting. The amount calculated using the Pricing is added to the bill as
     *   a debit.
     * - **PRODUCT_CREDIT**. The amount calculated using the Pricing is added to the bill as a
     *   credit _(negative amount)_. To prevent negative billing, the bill will be capped at the
     *   total of other line items for the _same_ Product.
     * - **GLOBAL_CREDIT**. The amount calculated using the Pricing is added to the bill as a credit
     *   _(negative amount)_. To prevent negative billing, the bill will be capped at the total of
     *   other line items for the entire bill, which might include other Products the Account
     *   consumes.
     */
    fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

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

    /**
     * UUID of the Aggregation used to create the Pricing. Use this when creating a Pricing for a
     * segmented aggregation.
     */
    @JsonProperty("aggregationId")
    @ExcludeMissing
    fun _aggregationId(): JsonField<String> = aggregationId

    @JsonProperty("aggregationType")
    @ExcludeMissing
    fun _aggregationType(): JsonField<AggregationType> = aggregationType

    /** Unique short code for the Pricing. */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /** UUID of the Compound Aggregation used to create the Pricing. */
    @JsonProperty("compoundAggregationId")
    @ExcludeMissing
    fun _compoundAggregationId(): JsonField<String> = compoundAggregationId

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

    /**
     * The minimum spend amount per billing cycle for end customer Accounts on a Plan to which the
     * Pricing is applied.
     */
    @JsonProperty("minimumSpend")
    @ExcludeMissing
    fun _minimumSpend(): JsonField<Double> = minimumSpend

    /**
     * The default value is **FALSE**.
     * - When TRUE, minimum spend is billed at the start of each billing period.
     * - When FALSE, minimum spend is billed at the end of each billing period.
     *
     * _(Optional)_. Overrides the setting at Organization level for minimum spend billing in
     * arrears/in advance.
     */
    @JsonProperty("minimumSpendBillInAdvance")
    @ExcludeMissing
    fun _minimumSpendBillInAdvance(): JsonField<Boolean> = minimumSpendBillInAdvance

    /** Minimum spend description _(displayed on the bill line item)_. */
    @JsonProperty("minimumSpendDescription")
    @ExcludeMissing
    fun _minimumSpendDescription(): JsonField<String> = minimumSpendDescription

    /**
     * The Prepayment/Balance overage pricing in pricing bands for the case of a **Tiered** pricing
     * structure.
     */
    @JsonProperty("overagePricingBands")
    @ExcludeMissing
    fun _overagePricingBands(): JsonField<List<PricingBand>> = overagePricingBands

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
     * Name of the segment for which you are defining a Pricing.
     *
     * For each segment in a segmented aggregation, make a separate call using `aggregationId`
     * parameter to update a Pricing.
     */
    @JsonProperty("segment") @ExcludeMissing fun _segment(): JsonField<Segment> = segment

    @JsonProperty("segmentString")
    @ExcludeMissing
    fun _segmentString(): JsonField<String> = segmentString

    /**
     * The start date _(in ISO-8601 format)_ for when the Pricing starts to be active for the Plan
     * of Plan Template.
     */
    @JsonProperty("startDate")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    /**
     * The default value is **FALSE**.
     * - If TRUE, usage accumulates over the entire period the priced Plan is active for the
     *   account, and is not reset for pricing band rates at the start of each billing period.
     * - If FALSE, usage does not accumulate, and is reset for pricing bands at the start of each
     *   billing period.
     */
    @JsonProperty("tiersSpanPlan")
    @ExcludeMissing
    fun _tiersSpanPlan(): JsonField<Boolean> = tiersSpanPlan

    /**
     * - **DEBIT**. Default setting. The amount calculated using the Pricing is added to the bill as
     *   a debit.
     * - **PRODUCT_CREDIT**. The amount calculated using the Pricing is added to the bill as a
     *   credit _(negative amount)_. To prevent negative billing, the bill will be capped at the
     *   total of other line items for the _same_ Product.
     * - **GLOBAL_CREDIT**. The amount calculated using the Pricing is added to the bill as a credit
     *   _(negative amount)_. To prevent negative billing, the bill will be capped at the total of
     *   other line items for the entire bill, which might include other Products the Account
     *   consumes.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PricingResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        version()
        accountingProductId()
        aggregationId()
        aggregationType()
        code()
        compoundAggregationId()
        createdBy()
        cumulative()
        description()
        dtCreated()
        dtLastModified()
        endDate()
        lastModifiedBy()
        minimumSpend()
        minimumSpendBillInAdvance()
        minimumSpendDescription()
        overagePricingBands().ifPresent { it.forEach { it.validate() } }
        planId()
        planTemplateId()
        pricingBands().ifPresent { it.forEach { it.validate() } }
        segment().ifPresent { it.validate() }
        segmentString()
        startDate()
        tiersSpanPlan()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PricingResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PricingResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var accountingProductId: JsonField<String> = JsonMissing.of()
        private var aggregationId: JsonField<String> = JsonMissing.of()
        private var aggregationType: JsonField<AggregationType> = JsonMissing.of()
        private var code: JsonField<String> = JsonMissing.of()
        private var compoundAggregationId: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var cumulative: JsonField<Boolean> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var minimumSpend: JsonField<Double> = JsonMissing.of()
        private var minimumSpendBillInAdvance: JsonField<Boolean> = JsonMissing.of()
        private var minimumSpendDescription: JsonField<String> = JsonMissing.of()
        private var overagePricingBands: JsonField<MutableList<PricingBand>>? = null
        private var planId: JsonField<String> = JsonMissing.of()
        private var planTemplateId: JsonField<String> = JsonMissing.of()
        private var pricingBands: JsonField<MutableList<PricingBand>>? = null
        private var segment: JsonField<Segment> = JsonMissing.of()
        private var segmentString: JsonField<String> = JsonMissing.of()
        private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var tiersSpanPlan: JsonField<Boolean> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pricingResponse: PricingResponse) = apply {
            id = pricingResponse.id
            version = pricingResponse.version
            accountingProductId = pricingResponse.accountingProductId
            aggregationId = pricingResponse.aggregationId
            aggregationType = pricingResponse.aggregationType
            code = pricingResponse.code
            compoundAggregationId = pricingResponse.compoundAggregationId
            createdBy = pricingResponse.createdBy
            cumulative = pricingResponse.cumulative
            description = pricingResponse.description
            dtCreated = pricingResponse.dtCreated
            dtLastModified = pricingResponse.dtLastModified
            endDate = pricingResponse.endDate
            lastModifiedBy = pricingResponse.lastModifiedBy
            minimumSpend = pricingResponse.minimumSpend
            minimumSpendBillInAdvance = pricingResponse.minimumSpendBillInAdvance
            minimumSpendDescription = pricingResponse.minimumSpendDescription
            overagePricingBands = pricingResponse.overagePricingBands.map { it.toMutableList() }
            planId = pricingResponse.planId
            planTemplateId = pricingResponse.planTemplateId
            pricingBands = pricingResponse.pricingBands.map { it.toMutableList() }
            segment = pricingResponse.segment
            segmentString = pricingResponse.segmentString
            startDate = pricingResponse.startDate
            tiersSpanPlan = pricingResponse.tiersSpanPlan
            type = pricingResponse.type
            additionalProperties = pricingResponse.additionalProperties.toMutableMap()
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

        /**
         * UUID of the Aggregation used to create the Pricing. Use this when creating a Pricing for
         * a segmented aggregation.
         */
        fun aggregationId(aggregationId: String) = aggregationId(JsonField.of(aggregationId))

        /**
         * UUID of the Aggregation used to create the Pricing. Use this when creating a Pricing for
         * a segmented aggregation.
         */
        fun aggregationId(aggregationId: JsonField<String>) = apply {
            this.aggregationId = aggregationId
        }

        fun aggregationType(aggregationType: AggregationType) =
            aggregationType(JsonField.of(aggregationType))

        fun aggregationType(aggregationType: JsonField<AggregationType>) = apply {
            this.aggregationType = aggregationType
        }

        /** Unique short code for the Pricing. */
        fun code(code: String) = code(JsonField.of(code))

        /** Unique short code for the Pricing. */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** UUID of the Compound Aggregation used to create the Pricing. */
        fun compoundAggregationId(compoundAggregationId: String) =
            compoundAggregationId(JsonField.of(compoundAggregationId))

        /** UUID of the Compound Aggregation used to create the Pricing. */
        fun compoundAggregationId(compoundAggregationId: JsonField<String>) = apply {
            this.compoundAggregationId = compoundAggregationId
        }

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

        /**
         * The minimum spend amount per billing cycle for end customer Accounts on a Plan to which
         * the Pricing is applied.
         */
        fun minimumSpend(minimumSpend: Double) = minimumSpend(JsonField.of(minimumSpend))

        /**
         * The minimum spend amount per billing cycle for end customer Accounts on a Plan to which
         * the Pricing is applied.
         */
        fun minimumSpend(minimumSpend: JsonField<Double>) = apply {
            this.minimumSpend = minimumSpend
        }

        /**
         * The default value is **FALSE**.
         * - When TRUE, minimum spend is billed at the start of each billing period.
         * - When FALSE, minimum spend is billed at the end of each billing period.
         *
         * _(Optional)_. Overrides the setting at Organization level for minimum spend billing in
         * arrears/in advance.
         */
        fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: Boolean) =
            minimumSpendBillInAdvance(JsonField.of(minimumSpendBillInAdvance))

        /**
         * The default value is **FALSE**.
         * - When TRUE, minimum spend is billed at the start of each billing period.
         * - When FALSE, minimum spend is billed at the end of each billing period.
         *
         * _(Optional)_. Overrides the setting at Organization level for minimum spend billing in
         * arrears/in advance.
         */
        fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: JsonField<Boolean>) = apply {
            this.minimumSpendBillInAdvance = minimumSpendBillInAdvance
        }

        /** Minimum spend description _(displayed on the bill line item)_. */
        fun minimumSpendDescription(minimumSpendDescription: String) =
            minimumSpendDescription(JsonField.of(minimumSpendDescription))

        /** Minimum spend description _(displayed on the bill line item)_. */
        fun minimumSpendDescription(minimumSpendDescription: JsonField<String>) = apply {
            this.minimumSpendDescription = minimumSpendDescription
        }

        /**
         * The Prepayment/Balance overage pricing in pricing bands for the case of a **Tiered**
         * pricing structure.
         */
        fun overagePricingBands(overagePricingBands: List<PricingBand>) =
            overagePricingBands(JsonField.of(overagePricingBands))

        /**
         * The Prepayment/Balance overage pricing in pricing bands for the case of a **Tiered**
         * pricing structure.
         */
        fun overagePricingBands(overagePricingBands: JsonField<List<PricingBand>>) = apply {
            this.overagePricingBands = overagePricingBands.map { it.toMutableList() }
        }

        /**
         * The Prepayment/Balance overage pricing in pricing bands for the case of a **Tiered**
         * pricing structure.
         */
        fun addOveragePricingBand(overagePricingBand: PricingBand) = apply {
            overagePricingBands =
                (overagePricingBands ?: JsonField.of(mutableListOf())).also {
                    checkKnown("overagePricingBands", it).add(overagePricingBand)
                }
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
         * Name of the segment for which you are defining a Pricing.
         *
         * For each segment in a segmented aggregation, make a separate call using `aggregationId`
         * parameter to update a Pricing.
         */
        fun segment(segment: Segment) = segment(JsonField.of(segment))

        /**
         * Name of the segment for which you are defining a Pricing.
         *
         * For each segment in a segmented aggregation, make a separate call using `aggregationId`
         * parameter to update a Pricing.
         */
        fun segment(segment: JsonField<Segment>) = apply { this.segment = segment }

        fun segmentString(segmentString: String) = segmentString(JsonField.of(segmentString))

        fun segmentString(segmentString: JsonField<String>) = apply {
            this.segmentString = segmentString
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

        /**
         * The default value is **FALSE**.
         * - If TRUE, usage accumulates over the entire period the priced Plan is active for the
         *   account, and is not reset for pricing band rates at the start of each billing period.
         * - If FALSE, usage does not accumulate, and is reset for pricing bands at the start of
         *   each billing period.
         */
        fun tiersSpanPlan(tiersSpanPlan: Boolean) = tiersSpanPlan(JsonField.of(tiersSpanPlan))

        /**
         * The default value is **FALSE**.
         * - If TRUE, usage accumulates over the entire period the priced Plan is active for the
         *   account, and is not reset for pricing band rates at the start of each billing period.
         * - If FALSE, usage does not accumulate, and is reset for pricing bands at the start of
         *   each billing period.
         */
        fun tiersSpanPlan(tiersSpanPlan: JsonField<Boolean>) = apply {
            this.tiersSpanPlan = tiersSpanPlan
        }

        /**
         * - **DEBIT**. Default setting. The amount calculated using the Pricing is added to the
         *   bill as a debit.
         * - **PRODUCT_CREDIT**. The amount calculated using the Pricing is added to the bill as a
         *   credit _(negative amount)_. To prevent negative billing, the bill will be capped at the
         *   total of other line items for the _same_ Product.
         * - **GLOBAL_CREDIT**. The amount calculated using the Pricing is added to the bill as a
         *   credit _(negative amount)_. To prevent negative billing, the bill will be capped at the
         *   total of other line items for the entire bill, which might include other Products the
         *   Account consumes.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * - **DEBIT**. Default setting. The amount calculated using the Pricing is added to the
         *   bill as a debit.
         * - **PRODUCT_CREDIT**. The amount calculated using the Pricing is added to the bill as a
         *   credit _(negative amount)_. To prevent negative billing, the bill will be capped at the
         *   total of other line items for the _same_ Product.
         * - **GLOBAL_CREDIT**. The amount calculated using the Pricing is added to the bill as a
         *   credit _(negative amount)_. To prevent negative billing, the bill will be capped at the
         *   total of other line items for the entire bill, which might include other Products the
         *   Account consumes.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        fun build(): PricingResponse =
            PricingResponse(
                checkRequired("id", id),
                checkRequired("version", version),
                accountingProductId,
                aggregationId,
                aggregationType,
                code,
                compoundAggregationId,
                createdBy,
                cumulative,
                description,
                dtCreated,
                dtLastModified,
                endDate,
                lastModifiedBy,
                minimumSpend,
                minimumSpendBillInAdvance,
                minimumSpendDescription,
                (overagePricingBands ?: JsonMissing.of()).map { it.toImmutable() },
                planId,
                planTemplateId,
                (pricingBands ?: JsonMissing.of()).map { it.toImmutable() },
                segment,
                segmentString,
                startDate,
                tiersSpanPlan,
                type,
                additionalProperties.toImmutable(),
            )
    }

    class AggregationType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val SIMPLE = of("SIMPLE")

            @JvmField val COMPOUND = of("COMPOUND")

            @JvmStatic fun of(value: String) = AggregationType(JsonField.of(value))
        }

        /** An enum containing [AggregationType]'s known values. */
        enum class Known {
            SIMPLE,
            COMPOUND,
        }

        /**
         * An enum containing [AggregationType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AggregationType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SIMPLE,
            COMPOUND,
            /**
             * An enum member indicating that [AggregationType] was instantiated with an unknown
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
                SIMPLE -> Value.SIMPLE
                COMPOUND -> Value.COMPOUND
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
                SIMPLE -> Known.SIMPLE
                COMPOUND -> Known.COMPOUND
                else -> throw M3terInvalidDataException("Unknown AggregationType: $value")
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

            return /* spotless:off */ other is AggregationType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Name of the segment for which you are defining a Pricing.
     *
     * For each segment in a segmented aggregation, make a separate call using `aggregationId`
     * parameter to update a Pricing.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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
     * - **DEBIT**. Default setting. The amount calculated using the Pricing is added to the bill as
     *   a debit.
     * - **PRODUCT_CREDIT**. The amount calculated using the Pricing is added to the bill as a
     *   credit _(negative amount)_. To prevent negative billing, the bill will be capped at the
     *   total of other line items for the _same_ Product.
     * - **GLOBAL_CREDIT**. The amount calculated using the Pricing is added to the bill as a credit
     *   _(negative amount)_. To prevent negative billing, the bill will be capped at the total of
     *   other line items for the entire bill, which might include other Products the Account
     *   consumes.
     */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DEBIT = of("DEBIT")

            @JvmField val PRODUCT_CREDIT = of("PRODUCT_CREDIT")

            @JvmField val GLOBAL_CREDIT = of("GLOBAL_CREDIT")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            DEBIT,
            PRODUCT_CREDIT,
            GLOBAL_CREDIT,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DEBIT,
            PRODUCT_CREDIT,
            GLOBAL_CREDIT,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                DEBIT -> Value.DEBIT
                PRODUCT_CREDIT -> Value.PRODUCT_CREDIT
                GLOBAL_CREDIT -> Value.GLOBAL_CREDIT
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
                DEBIT -> Known.DEBIT
                PRODUCT_CREDIT -> Known.PRODUCT_CREDIT
                GLOBAL_CREDIT -> Known.GLOBAL_CREDIT
                else -> throw M3terInvalidDataException("Unknown Type: $value")
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

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PricingResponse && id == other.id && version == other.version && accountingProductId == other.accountingProductId && aggregationId == other.aggregationId && aggregationType == other.aggregationType && code == other.code && compoundAggregationId == other.compoundAggregationId && createdBy == other.createdBy && cumulative == other.cumulative && description == other.description && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && endDate == other.endDate && lastModifiedBy == other.lastModifiedBy && minimumSpend == other.minimumSpend && minimumSpendBillInAdvance == other.minimumSpendBillInAdvance && minimumSpendDescription == other.minimumSpendDescription && overagePricingBands == other.overagePricingBands && planId == other.planId && planTemplateId == other.planTemplateId && pricingBands == other.pricingBands && segment == other.segment && segmentString == other.segmentString && startDate == other.startDate && tiersSpanPlan == other.tiersSpanPlan && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, accountingProductId, aggregationId, aggregationType, code, compoundAggregationId, createdBy, cumulative, description, dtCreated, dtLastModified, endDate, lastModifiedBy, minimumSpend, minimumSpendBillInAdvance, minimumSpendDescription, overagePricingBands, planId, planTemplateId, pricingBands, segment, segmentString, startDate, tiersSpanPlan, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PricingResponse{id=$id, version=$version, accountingProductId=$accountingProductId, aggregationId=$aggregationId, aggregationType=$aggregationType, code=$code, compoundAggregationId=$compoundAggregationId, createdBy=$createdBy, cumulative=$cumulative, description=$description, dtCreated=$dtCreated, dtLastModified=$dtLastModified, endDate=$endDate, lastModifiedBy=$lastModifiedBy, minimumSpend=$minimumSpend, minimumSpendBillInAdvance=$minimumSpendBillInAdvance, minimumSpendDescription=$minimumSpendDescription, overagePricingBands=$overagePricingBands, planId=$planId, planTemplateId=$planTemplateId, pricingBands=$pricingBands, segment=$segment, segmentString=$segmentString, startDate=$startDate, tiersSpanPlan=$tiersSpanPlan, type=$type, additionalProperties=$additionalProperties}"
}
