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
class LineItemResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("aggregationId")
    @ExcludeMissing
    private val aggregationId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("averageUnitPrice")
    @ExcludeMissing
    private val averageUnitPrice: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("balanceId")
    @ExcludeMissing
    private val balanceId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("bandUsage")
    @ExcludeMissing
    private val bandUsage: JsonField<List<BandUsage>> = JsonMissing.of(),
    @JsonProperty("billId")
    @ExcludeMissing
    private val billId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("commitmentId")
    @ExcludeMissing
    private val commitmentId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("compoundAggregationId")
    @ExcludeMissing
    private val compoundAggregationId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("contractId")
    @ExcludeMissing
    private val contractId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("conversionRate")
    @ExcludeMissing
    private val conversionRate: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("convertedSubtotal")
    @ExcludeMissing
    private val convertedSubtotal: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("counterId")
    @ExcludeMissing
    private val counterId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("createdBy")
    @ExcludeMissing
    private val createdBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("creditTypeId")
    @ExcludeMissing
    private val creditTypeId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("dtCreated")
    @ExcludeMissing
    private val dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    private val dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("group") @ExcludeMissing private val group: JsonField<Group> = JsonMissing.of(),
    @JsonProperty("jsonUsageGenerated")
    @ExcludeMissing
    private val jsonUsageGenerated: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    private val lastModifiedBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("lineItemType")
    @ExcludeMissing
    private val lineItemType: JsonField<LineItemType> = JsonMissing.of(),
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
    @JsonProperty("quantity")
    @ExcludeMissing
    private val quantity: JsonField<Double> = JsonMissing.of(),
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
    @JsonProperty("subtotal")
    @ExcludeMissing
    private val subtotal: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("unit") @ExcludeMissing private val unit: JsonField<String> = JsonMissing.of(),
    @JsonProperty("units") @ExcludeMissing private val units: JsonField<Double> = JsonMissing.of(),
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

    /** A unique identifier (UUID) for the Aggregation that contributes to this Bill line item. */
    fun aggregationId(): Optional<String> =
        Optional.ofNullable(aggregationId.getNullable("aggregationId"))

    /**
     * Represents the average unit price calculated across all pricing bands or tiers for this line
     * item.
     */
    fun averageUnitPrice(): Optional<Double> =
        Optional.ofNullable(averageUnitPrice.getNullable("averageUnitPrice"))

    fun balanceId(): Optional<String> = Optional.ofNullable(balanceId.getNullable("balanceId"))

    /**
     * Array containing the pricing band information, which shows the details for each pricing band
     * or tier.
     */
    fun bandUsage(): Optional<List<BandUsage>> =
        Optional.ofNullable(bandUsage.getNullable("bandUsage"))

    /** The unique identifier (UUID) for the Bill that includes this line item. */
    fun billId(): Optional<String> = Optional.ofNullable(billId.getNullable("billId"))

    /** The unique identifier (UUID) of the Commitment _(if this is used)_. */
    fun commitmentId(): Optional<String> =
        Optional.ofNullable(commitmentId.getNullable("commitmentId"))

    /** A unique identifier (UUID) for the Compound Aggregation, if applicable. */
    fun compoundAggregationId(): Optional<String> =
        Optional.ofNullable(compoundAggregationId.getNullable("compoundAggregationId"))

    /** The unique identifier (UUID) for the contract associated with this line item. */
    fun contractId(): Optional<String> = Optional.ofNullable(contractId.getNullable("contractId"))

    /** The currency conversion rate _(if used)_ for the line item. */
    fun conversionRate(): Optional<Double> =
        Optional.ofNullable(conversionRate.getNullable("conversionRate"))

    /** The subtotal amount for this line item after currency conversion, if applicable. */
    fun convertedSubtotal(): Optional<Double> =
        Optional.ofNullable(convertedSubtotal.getNullable("convertedSubtotal"))

    fun counterId(): Optional<String> = Optional.ofNullable(counterId.getNullable("counterId"))

    /** The unique identifier (UUID) for the user who created the Bill line item. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /** The unique identifier (UUID) for the type of credit applied to this line item. */
    fun creditTypeId(): Optional<String> =
        Optional.ofNullable(creditTypeId.getNullable("creditTypeId"))

    /**
     * The currency in which the line item is billed, represented as a currency code. For example,
     * USD, GBP, or EUR.
     */
    fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

    /** A detailed description providing context for the line item within the Bill. */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** The date and time _(in ISO 8601 format)_ when the Bill line item was first created. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /** The date and time _(in ISO 8601 format)_ when the Bill line item was last modified. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    fun group(): Optional<Group> = Optional.ofNullable(group.getNullable("group"))

    /**
     * Boolean flag indicating whether the Bill line item has associated statement usage in JSON
     * format. When a Bill statement is generated, usage line items have their usage stored in JSON
     * format.
     *
     * See
     * [Working with Bill Statements](https://www.m3ter.com/docs/guides/running-viewing-and-managing-bills/working-with-bill-statements)
     * for more information.
     */
    fun jsonUsageGenerated(): Optional<Boolean> =
        Optional.ofNullable(jsonUsageGenerated.getNullable("jsonUsageGenerated"))

    /** The unique identifier (UUID) for the user who last modified this Bill line item. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    fun lineItemType(): Optional<LineItemType> =
        Optional.ofNullable(lineItemType.getNullable("lineItemType"))

    /** The unique identifier (UUID) of the Meter responsible for tracking usage. */
    fun meterId(): Optional<String> = Optional.ofNullable(meterId.getNullable("meterId"))

    /**
     * The UUID of the PlanGroup.
     *
     * The unique identifier (UUID) for the PlanGroup, if applicable.
     */
    fun planGroupId(): Optional<String> =
        Optional.ofNullable(planGroupId.getNullable("planGroupId"))

    /** A unique identifier (UUID) for the billing Plan associated with this line item, */
    fun planId(): Optional<String> = Optional.ofNullable(planId.getNullable("planId"))

    /** The unique identifier (UUID) of the Pricing used for this line item, */
    fun pricingId(): Optional<String> = Optional.ofNullable(pricingId.getNullable("pricingId"))

    fun productCode(): Optional<String> =
        Optional.ofNullable(productCode.getNullable("productCode"))

    /** The unique identifier (UUID) for the associated Product. */
    fun productId(): Optional<String> = Optional.ofNullable(productId.getNullable("productId"))

    /** The name of the Product associated with this line item. */
    fun productName(): Optional<String> =
        Optional.ofNullable(productName.getNullable("productName"))

    /** The amount of the product or service used in this line item. */
    fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

    /**
     * The UUID of the reason used for the line item.
     *
     * A unique identifier (UUID) for the reason or justification for this line item, if applicable.
     */
    fun reasonId(): Optional<String> = Optional.ofNullable(reasonId.getNullable("reasonId"))

    /**
     * A unique identifier (UUID) for a Bill that this line item may be related to or derived from.
     */
    fun referencedBillId(): Optional<String> =
        Optional.ofNullable(referencedBillId.getNullable("referencedBillId"))

    /**
     * A unique identifier (UUID) for another line item that this line item may be related to or
     * derived from.
     */
    fun referencedLineItemId(): Optional<String> =
        Optional.ofNullable(referencedLineItemId.getNullable("referencedLineItemId"))

    /**
     * Specifies the segment name or identifier when segmented Aggregation is used. This is relevant
     * for more complex billing structures.
     */
    fun segment(): Optional<Segment> = Optional.ofNullable(segment.getNullable("segment"))

    /** The number used for sequential invoices. */
    fun sequenceNumber(): Optional<Long> =
        Optional.ofNullable(sequenceNumber.getNullable("sequenceNumber"))

    /** The _(exclusive)_ end date for the service period in ISO 68601 format. */
    fun servicePeriodEndDate(): Optional<OffsetDateTime> =
        Optional.ofNullable(servicePeriodEndDate.getNullable("servicePeriodEndDate"))

    /** The _(inclusive)_ start date for the service period in ISO 8601 format. */
    fun servicePeriodStartDate(): Optional<OffsetDateTime> =
        Optional.ofNullable(servicePeriodStartDate.getNullable("servicePeriodStartDate"))

    /**
     * The subtotal amount when not currency converted _(in the cases where currency conversion is
     * required)_.
     */
    fun subtotal(): Optional<Double> = Optional.ofNullable(subtotal.getNullable("subtotal"))

    /** Specifies the unit type. For example: **MB**, **GB**, **api_calls**, and so on. */
    fun unit(): Optional<String> = Optional.ofNullable(unit.getNullable("unit"))

    /**
     * The number of units rated in the line item, each of which is of the type specified in the
     * `unit` field. For example: 400 api_calls.
     *
     * In this example, the unit type of **api_calls** is read from the `unit` field.
     */
    fun units(): Optional<Double> = Optional.ofNullable(units.getNullable("units"))

    /** The UUID of the entity. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    /** A unique identifier (UUID) for the Aggregation that contributes to this Bill line item. */
    @JsonProperty("aggregationId")
    @ExcludeMissing
    fun _aggregationId(): JsonField<String> = aggregationId

    /**
     * Represents the average unit price calculated across all pricing bands or tiers for this line
     * item.
     */
    @JsonProperty("averageUnitPrice")
    @ExcludeMissing
    fun _averageUnitPrice(): JsonField<Double> = averageUnitPrice

    @JsonProperty("balanceId") @ExcludeMissing fun _balanceId(): JsonField<String> = balanceId

    /**
     * Array containing the pricing band information, which shows the details for each pricing band
     * or tier.
     */
    @JsonProperty("bandUsage")
    @ExcludeMissing
    fun _bandUsage(): JsonField<List<BandUsage>> = bandUsage

    /** The unique identifier (UUID) for the Bill that includes this line item. */
    @JsonProperty("billId") @ExcludeMissing fun _billId(): JsonField<String> = billId

    /** The unique identifier (UUID) of the Commitment _(if this is used)_. */
    @JsonProperty("commitmentId")
    @ExcludeMissing
    fun _commitmentId(): JsonField<String> = commitmentId

    /** A unique identifier (UUID) for the Compound Aggregation, if applicable. */
    @JsonProperty("compoundAggregationId")
    @ExcludeMissing
    fun _compoundAggregationId(): JsonField<String> = compoundAggregationId

    /** The unique identifier (UUID) for the contract associated with this line item. */
    @JsonProperty("contractId") @ExcludeMissing fun _contractId(): JsonField<String> = contractId

    /** The currency conversion rate _(if used)_ for the line item. */
    @JsonProperty("conversionRate")
    @ExcludeMissing
    fun _conversionRate(): JsonField<Double> = conversionRate

    /** The subtotal amount for this line item after currency conversion, if applicable. */
    @JsonProperty("convertedSubtotal")
    @ExcludeMissing
    fun _convertedSubtotal(): JsonField<Double> = convertedSubtotal

    @JsonProperty("counterId") @ExcludeMissing fun _counterId(): JsonField<String> = counterId

    /** The unique identifier (UUID) for the user who created the Bill line item. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /** The unique identifier (UUID) for the type of credit applied to this line item. */
    @JsonProperty("creditTypeId")
    @ExcludeMissing
    fun _creditTypeId(): JsonField<String> = creditTypeId

    /**
     * The currency in which the line item is billed, represented as a currency code. For example,
     * USD, GBP, or EUR.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /** A detailed description providing context for the line item within the Bill. */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /** The date and time _(in ISO 8601 format)_ when the Bill line item was first created. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /** The date and time _(in ISO 8601 format)_ when the Bill line item was last modified. */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    @JsonProperty("group") @ExcludeMissing fun _group(): JsonField<Group> = group

    /**
     * Boolean flag indicating whether the Bill line item has associated statement usage in JSON
     * format. When a Bill statement is generated, usage line items have their usage stored in JSON
     * format.
     *
     * See
     * [Working with Bill Statements](https://www.m3ter.com/docs/guides/running-viewing-and-managing-bills/working-with-bill-statements)
     * for more information.
     */
    @JsonProperty("jsonUsageGenerated")
    @ExcludeMissing
    fun _jsonUsageGenerated(): JsonField<Boolean> = jsonUsageGenerated

    /** The unique identifier (UUID) for the user who last modified this Bill line item. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    @JsonProperty("lineItemType")
    @ExcludeMissing
    fun _lineItemType(): JsonField<LineItemType> = lineItemType

    /** The unique identifier (UUID) of the Meter responsible for tracking usage. */
    @JsonProperty("meterId") @ExcludeMissing fun _meterId(): JsonField<String> = meterId

    /**
     * The UUID of the PlanGroup.
     *
     * The unique identifier (UUID) for the PlanGroup, if applicable.
     */
    @JsonProperty("planGroupId") @ExcludeMissing fun _planGroupId(): JsonField<String> = planGroupId

    /** A unique identifier (UUID) for the billing Plan associated with this line item, */
    @JsonProperty("planId") @ExcludeMissing fun _planId(): JsonField<String> = planId

    /** The unique identifier (UUID) of the Pricing used for this line item, */
    @JsonProperty("pricingId") @ExcludeMissing fun _pricingId(): JsonField<String> = pricingId

    @JsonProperty("productCode") @ExcludeMissing fun _productCode(): JsonField<String> = productCode

    /** The unique identifier (UUID) for the associated Product. */
    @JsonProperty("productId") @ExcludeMissing fun _productId(): JsonField<String> = productId

    /** The name of the Product associated with this line item. */
    @JsonProperty("productName") @ExcludeMissing fun _productName(): JsonField<String> = productName

    /** The amount of the product or service used in this line item. */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

    /**
     * The UUID of the reason used for the line item.
     *
     * A unique identifier (UUID) for the reason or justification for this line item, if applicable.
     */
    @JsonProperty("reasonId") @ExcludeMissing fun _reasonId(): JsonField<String> = reasonId

    /**
     * A unique identifier (UUID) for a Bill that this line item may be related to or derived from.
     */
    @JsonProperty("referencedBillId")
    @ExcludeMissing
    fun _referencedBillId(): JsonField<String> = referencedBillId

    /**
     * A unique identifier (UUID) for another line item that this line item may be related to or
     * derived from.
     */
    @JsonProperty("referencedLineItemId")
    @ExcludeMissing
    fun _referencedLineItemId(): JsonField<String> = referencedLineItemId

    /**
     * Specifies the segment name or identifier when segmented Aggregation is used. This is relevant
     * for more complex billing structures.
     */
    @JsonProperty("segment") @ExcludeMissing fun _segment(): JsonField<Segment> = segment

    /** The number used for sequential invoices. */
    @JsonProperty("sequenceNumber")
    @ExcludeMissing
    fun _sequenceNumber(): JsonField<Long> = sequenceNumber

    /** The _(exclusive)_ end date for the service period in ISO 68601 format. */
    @JsonProperty("servicePeriodEndDate")
    @ExcludeMissing
    fun _servicePeriodEndDate(): JsonField<OffsetDateTime> = servicePeriodEndDate

    /** The _(inclusive)_ start date for the service period in ISO 8601 format. */
    @JsonProperty("servicePeriodStartDate")
    @ExcludeMissing
    fun _servicePeriodStartDate(): JsonField<OffsetDateTime> = servicePeriodStartDate

    /**
     * The subtotal amount when not currency converted _(in the cases where currency conversion is
     * required)_.
     */
    @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<Double> = subtotal

    /** Specifies the unit type. For example: **MB**, **GB**, **api_calls**, and so on. */
    @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

    /**
     * The number of units rated in the line item, each of which is of the type specified in the
     * `unit` field. For example: 400 api_calls.
     *
     * In this example, the unit type of **api_calls** is read from the `unit` field.
     */
    @JsonProperty("units") @ExcludeMissing fun _units(): JsonField<Double> = units

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): LineItemResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        version()
        aggregationId()
        averageUnitPrice()
        balanceId()
        bandUsage().ifPresent { it.forEach { it.validate() } }
        billId()
        commitmentId()
        compoundAggregationId()
        contractId()
        conversionRate()
        convertedSubtotal()
        counterId()
        createdBy()
        creditTypeId()
        currency()
        description()
        dtCreated()
        dtLastModified()
        group().ifPresent { it.validate() }
        jsonUsageGenerated()
        lastModifiedBy()
        lineItemType()
        meterId()
        planGroupId()
        planId()
        pricingId()
        productCode()
        productId()
        productName()
        quantity()
        reasonId()
        referencedBillId()
        referencedLineItemId()
        segment().ifPresent { it.validate() }
        sequenceNumber()
        servicePeriodEndDate()
        servicePeriodStartDate()
        subtotal()
        unit()
        units()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LineItemResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LineItemResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var aggregationId: JsonField<String> = JsonMissing.of()
        private var averageUnitPrice: JsonField<Double> = JsonMissing.of()
        private var balanceId: JsonField<String> = JsonMissing.of()
        private var bandUsage: JsonField<MutableList<BandUsage>>? = null
        private var billId: JsonField<String> = JsonMissing.of()
        private var commitmentId: JsonField<String> = JsonMissing.of()
        private var compoundAggregationId: JsonField<String> = JsonMissing.of()
        private var contractId: JsonField<String> = JsonMissing.of()
        private var conversionRate: JsonField<Double> = JsonMissing.of()
        private var convertedSubtotal: JsonField<Double> = JsonMissing.of()
        private var counterId: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var creditTypeId: JsonField<String> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var group: JsonField<Group> = JsonMissing.of()
        private var jsonUsageGenerated: JsonField<Boolean> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var lineItemType: JsonField<LineItemType> = JsonMissing.of()
        private var meterId: JsonField<String> = JsonMissing.of()
        private var planGroupId: JsonField<String> = JsonMissing.of()
        private var planId: JsonField<String> = JsonMissing.of()
        private var pricingId: JsonField<String> = JsonMissing.of()
        private var productCode: JsonField<String> = JsonMissing.of()
        private var productId: JsonField<String> = JsonMissing.of()
        private var productName: JsonField<String> = JsonMissing.of()
        private var quantity: JsonField<Double> = JsonMissing.of()
        private var reasonId: JsonField<String> = JsonMissing.of()
        private var referencedBillId: JsonField<String> = JsonMissing.of()
        private var referencedLineItemId: JsonField<String> = JsonMissing.of()
        private var segment: JsonField<Segment> = JsonMissing.of()
        private var sequenceNumber: JsonField<Long> = JsonMissing.of()
        private var servicePeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var servicePeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var subtotal: JsonField<Double> = JsonMissing.of()
        private var unit: JsonField<String> = JsonMissing.of()
        private var units: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(lineItemResponse: LineItemResponse) = apply {
            id = lineItemResponse.id
            version = lineItemResponse.version
            aggregationId = lineItemResponse.aggregationId
            averageUnitPrice = lineItemResponse.averageUnitPrice
            balanceId = lineItemResponse.balanceId
            bandUsage = lineItemResponse.bandUsage.map { it.toMutableList() }
            billId = lineItemResponse.billId
            commitmentId = lineItemResponse.commitmentId
            compoundAggregationId = lineItemResponse.compoundAggregationId
            contractId = lineItemResponse.contractId
            conversionRate = lineItemResponse.conversionRate
            convertedSubtotal = lineItemResponse.convertedSubtotal
            counterId = lineItemResponse.counterId
            createdBy = lineItemResponse.createdBy
            creditTypeId = lineItemResponse.creditTypeId
            currency = lineItemResponse.currency
            description = lineItemResponse.description
            dtCreated = lineItemResponse.dtCreated
            dtLastModified = lineItemResponse.dtLastModified
            group = lineItemResponse.group
            jsonUsageGenerated = lineItemResponse.jsonUsageGenerated
            lastModifiedBy = lineItemResponse.lastModifiedBy
            lineItemType = lineItemResponse.lineItemType
            meterId = lineItemResponse.meterId
            planGroupId = lineItemResponse.planGroupId
            planId = lineItemResponse.planId
            pricingId = lineItemResponse.pricingId
            productCode = lineItemResponse.productCode
            productId = lineItemResponse.productId
            productName = lineItemResponse.productName
            quantity = lineItemResponse.quantity
            reasonId = lineItemResponse.reasonId
            referencedBillId = lineItemResponse.referencedBillId
            referencedLineItemId = lineItemResponse.referencedLineItemId
            segment = lineItemResponse.segment
            sequenceNumber = lineItemResponse.sequenceNumber
            servicePeriodEndDate = lineItemResponse.servicePeriodEndDate
            servicePeriodStartDate = lineItemResponse.servicePeriodStartDate
            subtotal = lineItemResponse.subtotal
            unit = lineItemResponse.unit
            units = lineItemResponse.units
            additionalProperties = lineItemResponse.additionalProperties.toMutableMap()
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

        /**
         * A unique identifier (UUID) for the Aggregation that contributes to this Bill line item.
         */
        fun aggregationId(aggregationId: String) = aggregationId(JsonField.of(aggregationId))

        /**
         * A unique identifier (UUID) for the Aggregation that contributes to this Bill line item.
         */
        fun aggregationId(aggregationId: JsonField<String>) = apply {
            this.aggregationId = aggregationId
        }

        /**
         * Represents the average unit price calculated across all pricing bands or tiers for this
         * line item.
         */
        fun averageUnitPrice(averageUnitPrice: Double) =
            averageUnitPrice(JsonField.of(averageUnitPrice))

        /**
         * Represents the average unit price calculated across all pricing bands or tiers for this
         * line item.
         */
        fun averageUnitPrice(averageUnitPrice: JsonField<Double>) = apply {
            this.averageUnitPrice = averageUnitPrice
        }

        fun balanceId(balanceId: String) = balanceId(JsonField.of(balanceId))

        fun balanceId(balanceId: JsonField<String>) = apply { this.balanceId = balanceId }

        /**
         * Array containing the pricing band information, which shows the details for each pricing
         * band or tier.
         */
        fun bandUsage(bandUsage: List<BandUsage>) = bandUsage(JsonField.of(bandUsage))

        /**
         * Array containing the pricing band information, which shows the details for each pricing
         * band or tier.
         */
        fun bandUsage(bandUsage: JsonField<List<BandUsage>>) = apply {
            this.bandUsage = bandUsage.map { it.toMutableList() }
        }

        /**
         * Array containing the pricing band information, which shows the details for each pricing
         * band or tier.
         */
        fun addBandUsage(bandUsage: BandUsage) = apply {
            this.bandUsage =
                (this.bandUsage ?: JsonField.of(mutableListOf())).also {
                    checkKnown("bandUsage", it).add(bandUsage)
                }
        }

        /** The unique identifier (UUID) for the Bill that includes this line item. */
        fun billId(billId: String) = billId(JsonField.of(billId))

        /** The unique identifier (UUID) for the Bill that includes this line item. */
        fun billId(billId: JsonField<String>) = apply { this.billId = billId }

        /** The unique identifier (UUID) of the Commitment _(if this is used)_. */
        fun commitmentId(commitmentId: String) = commitmentId(JsonField.of(commitmentId))

        /** The unique identifier (UUID) of the Commitment _(if this is used)_. */
        fun commitmentId(commitmentId: JsonField<String>) = apply {
            this.commitmentId = commitmentId
        }

        /** A unique identifier (UUID) for the Compound Aggregation, if applicable. */
        fun compoundAggregationId(compoundAggregationId: String) =
            compoundAggregationId(JsonField.of(compoundAggregationId))

        /** A unique identifier (UUID) for the Compound Aggregation, if applicable. */
        fun compoundAggregationId(compoundAggregationId: JsonField<String>) = apply {
            this.compoundAggregationId = compoundAggregationId
        }

        /** The unique identifier (UUID) for the contract associated with this line item. */
        fun contractId(contractId: String) = contractId(JsonField.of(contractId))

        /** The unique identifier (UUID) for the contract associated with this line item. */
        fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

        /** The currency conversion rate _(if used)_ for the line item. */
        fun conversionRate(conversionRate: Double) = conversionRate(JsonField.of(conversionRate))

        /** The currency conversion rate _(if used)_ for the line item. */
        fun conversionRate(conversionRate: JsonField<Double>) = apply {
            this.conversionRate = conversionRate
        }

        /** The subtotal amount for this line item after currency conversion, if applicable. */
        fun convertedSubtotal(convertedSubtotal: Double) =
            convertedSubtotal(JsonField.of(convertedSubtotal))

        /** The subtotal amount for this line item after currency conversion, if applicable. */
        fun convertedSubtotal(convertedSubtotal: JsonField<Double>) = apply {
            this.convertedSubtotal = convertedSubtotal
        }

        fun counterId(counterId: String) = counterId(JsonField.of(counterId))

        fun counterId(counterId: JsonField<String>) = apply { this.counterId = counterId }

        /** The unique identifier (UUID) for the user who created the Bill line item. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The unique identifier (UUID) for the user who created the Bill line item. */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The unique identifier (UUID) for the type of credit applied to this line item. */
        fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

        /** The unique identifier (UUID) for the type of credit applied to this line item. */
        fun creditTypeId(creditTypeId: JsonField<String>) = apply {
            this.creditTypeId = creditTypeId
        }

        /**
         * The currency in which the line item is billed, represented as a currency code. For
         * example, USD, GBP, or EUR.
         */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * The currency in which the line item is billed, represented as a currency code. For
         * example, USD, GBP, or EUR.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** A detailed description providing context for the line item within the Bill. */
        fun description(description: String) = description(JsonField.of(description))

        /** A detailed description providing context for the line item within the Bill. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The date and time _(in ISO 8601 format)_ when the Bill line item was first created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /** The date and time _(in ISO 8601 format)_ when the Bill line item was first created. */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The date and time _(in ISO 8601 format)_ when the Bill line item was last modified. */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /** The date and time _(in ISO 8601 format)_ when the Bill line item was last modified. */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        fun group(group: Group) = group(JsonField.of(group))

        fun group(group: JsonField<Group>) = apply { this.group = group }

        /**
         * Boolean flag indicating whether the Bill line item has associated statement usage in JSON
         * format. When a Bill statement is generated, usage line items have their usage stored in
         * JSON format.
         *
         * See
         * [Working with Bill Statements](https://www.m3ter.com/docs/guides/running-viewing-and-managing-bills/working-with-bill-statements)
         * for more information.
         */
        fun jsonUsageGenerated(jsonUsageGenerated: Boolean) =
            jsonUsageGenerated(JsonField.of(jsonUsageGenerated))

        /**
         * Boolean flag indicating whether the Bill line item has associated statement usage in JSON
         * format. When a Bill statement is generated, usage line items have their usage stored in
         * JSON format.
         *
         * See
         * [Working with Bill Statements](https://www.m3ter.com/docs/guides/running-viewing-and-managing-bills/working-with-bill-statements)
         * for more information.
         */
        fun jsonUsageGenerated(jsonUsageGenerated: JsonField<Boolean>) = apply {
            this.jsonUsageGenerated = jsonUsageGenerated
        }

        /** The unique identifier (UUID) for the user who last modified this Bill line item. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The unique identifier (UUID) for the user who last modified this Bill line item. */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
        }

        fun lineItemType(lineItemType: LineItemType) = lineItemType(JsonField.of(lineItemType))

        fun lineItemType(lineItemType: JsonField<LineItemType>) = apply {
            this.lineItemType = lineItemType
        }

        /** The unique identifier (UUID) of the Meter responsible for tracking usage. */
        fun meterId(meterId: String) = meterId(JsonField.of(meterId))

        /** The unique identifier (UUID) of the Meter responsible for tracking usage. */
        fun meterId(meterId: JsonField<String>) = apply { this.meterId = meterId }

        /**
         * The UUID of the PlanGroup.
         *
         * The unique identifier (UUID) for the PlanGroup, if applicable.
         */
        fun planGroupId(planGroupId: String) = planGroupId(JsonField.of(planGroupId))

        /**
         * The UUID of the PlanGroup.
         *
         * The unique identifier (UUID) for the PlanGroup, if applicable.
         */
        fun planGroupId(planGroupId: JsonField<String>) = apply { this.planGroupId = planGroupId }

        /** A unique identifier (UUID) for the billing Plan associated with this line item, */
        fun planId(planId: String) = planId(JsonField.of(planId))

        /** A unique identifier (UUID) for the billing Plan associated with this line item, */
        fun planId(planId: JsonField<String>) = apply { this.planId = planId }

        /** The unique identifier (UUID) of the Pricing used for this line item, */
        fun pricingId(pricingId: String) = pricingId(JsonField.of(pricingId))

        /** The unique identifier (UUID) of the Pricing used for this line item, */
        fun pricingId(pricingId: JsonField<String>) = apply { this.pricingId = pricingId }

        fun productCode(productCode: String) = productCode(JsonField.of(productCode))

        fun productCode(productCode: JsonField<String>) = apply { this.productCode = productCode }

        /** The unique identifier (UUID) for the associated Product. */
        fun productId(productId: String) = productId(JsonField.of(productId))

        /** The unique identifier (UUID) for the associated Product. */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        /** The name of the Product associated with this line item. */
        fun productName(productName: String) = productName(JsonField.of(productName))

        /** The name of the Product associated with this line item. */
        fun productName(productName: JsonField<String>) = apply { this.productName = productName }

        /** The amount of the product or service used in this line item. */
        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

        /** The amount of the product or service used in this line item. */
        fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

        /**
         * The UUID of the reason used for the line item.
         *
         * A unique identifier (UUID) for the reason or justification for this line item, if
         * applicable.
         */
        fun reasonId(reasonId: String) = reasonId(JsonField.of(reasonId))

        /**
         * The UUID of the reason used for the line item.
         *
         * A unique identifier (UUID) for the reason or justification for this line item, if
         * applicable.
         */
        fun reasonId(reasonId: JsonField<String>) = apply { this.reasonId = reasonId }

        /**
         * A unique identifier (UUID) for a Bill that this line item may be related to or derived
         * from.
         */
        fun referencedBillId(referencedBillId: String) =
            referencedBillId(JsonField.of(referencedBillId))

        /**
         * A unique identifier (UUID) for a Bill that this line item may be related to or derived
         * from.
         */
        fun referencedBillId(referencedBillId: JsonField<String>) = apply {
            this.referencedBillId = referencedBillId
        }

        /**
         * A unique identifier (UUID) for another line item that this line item may be related to or
         * derived from.
         */
        fun referencedLineItemId(referencedLineItemId: String) =
            referencedLineItemId(JsonField.of(referencedLineItemId))

        /**
         * A unique identifier (UUID) for another line item that this line item may be related to or
         * derived from.
         */
        fun referencedLineItemId(referencedLineItemId: JsonField<String>) = apply {
            this.referencedLineItemId = referencedLineItemId
        }

        /**
         * Specifies the segment name or identifier when segmented Aggregation is used. This is
         * relevant for more complex billing structures.
         */
        fun segment(segment: Segment) = segment(JsonField.of(segment))

        /**
         * Specifies the segment name or identifier when segmented Aggregation is used. This is
         * relevant for more complex billing structures.
         */
        fun segment(segment: JsonField<Segment>) = apply { this.segment = segment }

        /** The number used for sequential invoices. */
        fun sequenceNumber(sequenceNumber: Long) = sequenceNumber(JsonField.of(sequenceNumber))

        /** The number used for sequential invoices. */
        fun sequenceNumber(sequenceNumber: JsonField<Long>) = apply {
            this.sequenceNumber = sequenceNumber
        }

        /** The _(exclusive)_ end date for the service period in ISO 68601 format. */
        fun servicePeriodEndDate(servicePeriodEndDate: OffsetDateTime) =
            servicePeriodEndDate(JsonField.of(servicePeriodEndDate))

        /** The _(exclusive)_ end date for the service period in ISO 68601 format. */
        fun servicePeriodEndDate(servicePeriodEndDate: JsonField<OffsetDateTime>) = apply {
            this.servicePeriodEndDate = servicePeriodEndDate
        }

        /** The _(inclusive)_ start date for the service period in ISO 8601 format. */
        fun servicePeriodStartDate(servicePeriodStartDate: OffsetDateTime) =
            servicePeriodStartDate(JsonField.of(servicePeriodStartDate))

        /** The _(inclusive)_ start date for the service period in ISO 8601 format. */
        fun servicePeriodStartDate(servicePeriodStartDate: JsonField<OffsetDateTime>) = apply {
            this.servicePeriodStartDate = servicePeriodStartDate
        }

        /**
         * The subtotal amount when not currency converted _(in the cases where currency conversion
         * is required)_.
         */
        fun subtotal(subtotal: Double) = subtotal(JsonField.of(subtotal))

        /**
         * The subtotal amount when not currency converted _(in the cases where currency conversion
         * is required)_.
         */
        fun subtotal(subtotal: JsonField<Double>) = apply { this.subtotal = subtotal }

        /** Specifies the unit type. For example: **MB**, **GB**, **api_calls**, and so on. */
        fun unit(unit: String) = unit(JsonField.of(unit))

        /** Specifies the unit type. For example: **MB**, **GB**, **api_calls**, and so on. */
        fun unit(unit: JsonField<String>) = apply { this.unit = unit }

        /**
         * The number of units rated in the line item, each of which is of the type specified in the
         * `unit` field. For example: 400 api_calls.
         *
         * In this example, the unit type of **api_calls** is read from the `unit` field.
         */
        fun units(units: Double) = units(JsonField.of(units))

        /**
         * The number of units rated in the line item, each of which is of the type specified in the
         * `unit` field. For example: 400 api_calls.
         *
         * In this example, the unit type of **api_calls** is read from the `unit` field.
         */
        fun units(units: JsonField<Double>) = apply { this.units = units }

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

        fun build(): LineItemResponse =
            LineItemResponse(
                checkRequired("id", id),
                checkRequired("version", version),
                aggregationId,
                averageUnitPrice,
                balanceId,
                (bandUsage ?: JsonMissing.of()).map { it.toImmutable() },
                billId,
                commitmentId,
                compoundAggregationId,
                contractId,
                conversionRate,
                convertedSubtotal,
                counterId,
                createdBy,
                creditTypeId,
                currency,
                description,
                dtCreated,
                dtLastModified,
                group,
                jsonUsageGenerated,
                lastModifiedBy,
                lineItemType,
                meterId,
                planGroupId,
                planId,
                pricingId,
                productCode,
                productId,
                productName,
                quantity,
                reasonId,
                referencedBillId,
                referencedLineItemId,
                segment,
                sequenceNumber,
                servicePeriodEndDate,
                servicePeriodStartDate,
                subtotal,
                unit,
                units,
                additionalProperties.toImmutable(),
            )
    }

    /**
     * Array containing the pricing band information, which shows the details for each pricing band
     * or tier.
     */
    @NoAutoDetect
    class BandUsage
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
        fun bandUnits(): Optional<Double> = Optional.ofNullable(bandUnits.getNullable("bandUnits"))

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
        fun unitPrice(): Optional<Double> = Optional.ofNullable(unitPrice.getNullable("unitPrice"))

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
        @JsonProperty("bandUnits") @ExcludeMissing fun _bandUnits(): JsonField<Double> = bandUnits

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
        @JsonProperty("unitPrice") @ExcludeMissing fun _unitPrice(): JsonField<Double> = unitPrice

        /** The subtotal of the unit usage. */
        @JsonProperty("unitSubtotal")
        @ExcludeMissing
        fun _unitSubtotal(): JsonField<Double> = unitSubtotal

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): BandUsage = apply {
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

            /** Returns a mutable builder for constructing an instance of [BandUsage]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BandUsage]. */
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
            internal fun from(bandUsage: BandUsage) = apply {
                bandQuantity = bandUsage.bandQuantity
                bandSubtotal = bandUsage.bandSubtotal
                bandUnits = bandUsage.bandUnits
                creditTypeId = bandUsage.creditTypeId
                fixedPrice = bandUsage.fixedPrice
                lowerLimit = bandUsage.lowerLimit
                pricingBandId = bandUsage.pricingBandId
                unitPrice = bandUsage.unitPrice
                unitSubtotal = bandUsage.unitSubtotal
                additionalProperties = bandUsage.additionalProperties.toMutableMap()
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
             * Fixed price is a charge entered for certain pricing types such as Stairstep, Custom
             * Tiered, and Custom Volume. It is a set price and not dependent on usage.
             */
            fun fixedPrice(fixedPrice: Double) = fixedPrice(JsonField.of(fixedPrice))

            /**
             * Fixed price is a charge entered for certain pricing types such as Stairstep, Custom
             * Tiered, and Custom Volume. It is a set price and not dependent on usage.
             */
            fun fixedPrice(fixedPrice: JsonField<Double>) = apply { this.fixedPrice = fixedPrice }

            /** The lower limit _(start)_ of the pricing band. */
            fun lowerLimit(lowerLimit: Double) = lowerLimit(JsonField.of(lowerLimit))

            /** The lower limit _(start)_ of the pricing band. */
            fun lowerLimit(lowerLimit: JsonField<Double>) = apply { this.lowerLimit = lowerLimit }

            /** The UUID for the pricing band. */
            fun pricingBandId(pricingBandId: String) = pricingBandId(JsonField.of(pricingBandId))

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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): BandUsage =
                BandUsage(
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

            return /* spotless:off */ other is BandUsage && bandQuantity == other.bandQuantity && bandSubtotal == other.bandSubtotal && bandUnits == other.bandUnits && creditTypeId == other.creditTypeId && fixedPrice == other.fixedPrice && lowerLimit == other.lowerLimit && pricingBandId == other.pricingBandId && unitPrice == other.unitPrice && unitSubtotal == other.unitSubtotal && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(bandQuantity, bandSubtotal, bandUnits, creditTypeId, fixedPrice, lowerLimit, pricingBandId, unitPrice, unitSubtotal, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BandUsage{bandQuantity=$bandQuantity, bandSubtotal=$bandSubtotal, bandUnits=$bandUnits, creditTypeId=$creditTypeId, fixedPrice=$fixedPrice, lowerLimit=$lowerLimit, pricingBandId=$pricingBandId, unitPrice=$unitPrice, unitSubtotal=$unitSubtotal, additionalProperties=$additionalProperties}"
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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

    class LineItemType @JsonCreator private constructor(private val value: JsonField<String>) :
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
             * An enum member indicating that [LineItemType] was instantiated with an unknown value.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws M3terInvalidDataException if this class instance's value is a not a known member.
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

            return /* spotless:off */ other is LineItemType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Specifies the segment name or identifier when segmented Aggregation is used. This is relevant
     * for more complex billing structures.
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LineItemResponse && id == other.id && version == other.version && aggregationId == other.aggregationId && averageUnitPrice == other.averageUnitPrice && balanceId == other.balanceId && bandUsage == other.bandUsage && billId == other.billId && commitmentId == other.commitmentId && compoundAggregationId == other.compoundAggregationId && contractId == other.contractId && conversionRate == other.conversionRate && convertedSubtotal == other.convertedSubtotal && counterId == other.counterId && createdBy == other.createdBy && creditTypeId == other.creditTypeId && currency == other.currency && description == other.description && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && group == other.group && jsonUsageGenerated == other.jsonUsageGenerated && lastModifiedBy == other.lastModifiedBy && lineItemType == other.lineItemType && meterId == other.meterId && planGroupId == other.planGroupId && planId == other.planId && pricingId == other.pricingId && productCode == other.productCode && productId == other.productId && productName == other.productName && quantity == other.quantity && reasonId == other.reasonId && referencedBillId == other.referencedBillId && referencedLineItemId == other.referencedLineItemId && segment == other.segment && sequenceNumber == other.sequenceNumber && servicePeriodEndDate == other.servicePeriodEndDate && servicePeriodStartDate == other.servicePeriodStartDate && subtotal == other.subtotal && unit == other.unit && units == other.units && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, aggregationId, averageUnitPrice, balanceId, bandUsage, billId, commitmentId, compoundAggregationId, contractId, conversionRate, convertedSubtotal, counterId, createdBy, creditTypeId, currency, description, dtCreated, dtLastModified, group, jsonUsageGenerated, lastModifiedBy, lineItemType, meterId, planGroupId, planId, pricingId, productCode, productId, productName, quantity, reasonId, referencedBillId, referencedLineItemId, segment, sequenceNumber, servicePeriodEndDate, servicePeriodStartDate, subtotal, unit, units, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LineItemResponse{id=$id, version=$version, aggregationId=$aggregationId, averageUnitPrice=$averageUnitPrice, balanceId=$balanceId, bandUsage=$bandUsage, billId=$billId, commitmentId=$commitmentId, compoundAggregationId=$compoundAggregationId, contractId=$contractId, conversionRate=$conversionRate, convertedSubtotal=$convertedSubtotal, counterId=$counterId, createdBy=$createdBy, creditTypeId=$creditTypeId, currency=$currency, description=$description, dtCreated=$dtCreated, dtLastModified=$dtLastModified, group=$group, jsonUsageGenerated=$jsonUsageGenerated, lastModifiedBy=$lastModifiedBy, lineItemType=$lineItemType, meterId=$meterId, planGroupId=$planGroupId, planId=$planId, pricingId=$pricingId, productCode=$productCode, productId=$productId, productName=$productName, quantity=$quantity, reasonId=$reasonId, referencedBillId=$referencedBillId, referencedLineItemId=$referencedLineItemId, segment=$segment, sequenceNumber=$sequenceNumber, servicePeriodEndDate=$servicePeriodEndDate, servicePeriodStartDate=$servicePeriodStartDate, subtotal=$subtotal, unit=$unit, units=$units, additionalProperties=$additionalProperties}"
}
