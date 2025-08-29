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
import com.m3ter.core.checkKnown
import com.m3ter.core.checkRequired
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class LineItemResponse
private constructor(
    private val id: JsonField<String>,
    private val accountingProductCode: JsonField<String>,
    private val accountingProductId: JsonField<String>,
    private val accountingProductName: JsonField<String>,
    private val additional: JsonField<Additional>,
    private val aggregationId: JsonField<String>,
    private val averageUnitPrice: JsonField<Double>,
    private val balanceId: JsonField<String>,
    private val bandUsage: JsonField<List<BandUsage>>,
    private val billId: JsonField<String>,
    private val chargeId: JsonField<String>,
    private val commitmentId: JsonField<String>,
    private val compoundAggregationId: JsonField<String>,
    private val contractId: JsonField<String>,
    private val conversionRate: JsonField<Double>,
    private val convertedSubtotal: JsonField<Double>,
    private val counterId: JsonField<String>,
    private val createdBy: JsonField<String>,
    private val creditTypeId: JsonField<String>,
    private val currency: JsonField<String>,
    private val description: JsonField<String>,
    private val dtCreated: JsonField<OffsetDateTime>,
    private val dtLastModified: JsonField<OffsetDateTime>,
    private val group: JsonField<Group>,
    private val jsonUsageGenerated: JsonField<Boolean>,
    private val lastModifiedBy: JsonField<String>,
    private val lineItemType: JsonField<LineItemType>,
    private val meterId: JsonField<String>,
    private val planGroupId: JsonField<String>,
    private val planId: JsonField<String>,
    private val pricingId: JsonField<String>,
    private val productCode: JsonField<String>,
    private val productId: JsonField<String>,
    private val productName: JsonField<String>,
    private val quantity: JsonField<Double>,
    private val reasonId: JsonField<String>,
    private val referencedBillId: JsonField<String>,
    private val referencedLineItemId: JsonField<String>,
    private val segment: JsonField<Segment>,
    private val sequenceNumber: JsonField<Int>,
    private val servicePeriodEndDate: JsonField<OffsetDateTime>,
    private val servicePeriodStartDate: JsonField<OffsetDateTime>,
    private val subtotal: JsonField<Double>,
    private val unit: JsonField<String>,
    private val units: JsonField<Double>,
    private val version: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accountingProductCode")
        @ExcludeMissing
        accountingProductCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accountingProductId")
        @ExcludeMissing
        accountingProductId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accountingProductName")
        @ExcludeMissing
        accountingProductName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("additional")
        @ExcludeMissing
        additional: JsonField<Additional> = JsonMissing.of(),
        @JsonProperty("aggregationId")
        @ExcludeMissing
        aggregationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("averageUnitPrice")
        @ExcludeMissing
        averageUnitPrice: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("balanceId") @ExcludeMissing balanceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bandUsage")
        @ExcludeMissing
        bandUsage: JsonField<List<BandUsage>> = JsonMissing.of(),
        @JsonProperty("billId") @ExcludeMissing billId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("chargeId") @ExcludeMissing chargeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("commitmentId")
        @ExcludeMissing
        commitmentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("compoundAggregationId")
        @ExcludeMissing
        compoundAggregationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contractId")
        @ExcludeMissing
        contractId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("conversionRate")
        @ExcludeMissing
        conversionRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("convertedSubtotal")
        @ExcludeMissing
        convertedSubtotal: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("counterId") @ExcludeMissing counterId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("creditTypeId")
        @ExcludeMissing
        creditTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dtCreated")
        @ExcludeMissing
        dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("group") @ExcludeMissing group: JsonField<Group> = JsonMissing.of(),
        @JsonProperty("jsonUsageGenerated")
        @ExcludeMissing
        jsonUsageGenerated: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        lastModifiedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lineItemType")
        @ExcludeMissing
        lineItemType: JsonField<LineItemType> = JsonMissing.of(),
        @JsonProperty("meterId") @ExcludeMissing meterId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("planGroupId")
        @ExcludeMissing
        planGroupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("planId") @ExcludeMissing planId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pricingId") @ExcludeMissing pricingId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("productCode")
        @ExcludeMissing
        productCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("productId") @ExcludeMissing productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("productName")
        @ExcludeMissing
        productName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("reasonId") @ExcludeMissing reasonId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("referencedBillId")
        @ExcludeMissing
        referencedBillId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("referencedLineItemId")
        @ExcludeMissing
        referencedLineItemId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("segment") @ExcludeMissing segment: JsonField<Segment> = JsonMissing.of(),
        @JsonProperty("sequenceNumber")
        @ExcludeMissing
        sequenceNumber: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("servicePeriodEndDate")
        @ExcludeMissing
        servicePeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("servicePeriodStartDate")
        @ExcludeMissing
        servicePeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("subtotal") @ExcludeMissing subtotal: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("unit") @ExcludeMissing unit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("units") @ExcludeMissing units: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        accountingProductCode,
        accountingProductId,
        accountingProductName,
        additional,
        aggregationId,
        averageUnitPrice,
        balanceId,
        bandUsage,
        billId,
        chargeId,
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
     * The code of the Accounting Product associated with this line item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountingProductCode(): Optional<String> =
        accountingProductCode.getOptional("accountingProductCode")

    /**
     * The unique identifier (UUID) for the associated Accounting Product.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountingProductId(): Optional<String> =
        accountingProductId.getOptional("accountingProductId")

    /**
     * The name of the Accounting Product associated with this line item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountingProductName(): Optional<String> =
        accountingProductName.getOptional("accountingProductName")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun additional(): Optional<Additional> = additional.getOptional("additional")

    /**
     * A unique identifier (UUID) for the Aggregation that contributes to this Bill line item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun aggregationId(): Optional<String> = aggregationId.getOptional("aggregationId")

    /**
     * Represents the average unit price calculated across all pricing bands or tiers for this line
     * item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun averageUnitPrice(): Optional<Double> = averageUnitPrice.getOptional("averageUnitPrice")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun balanceId(): Optional<String> = balanceId.getOptional("balanceId")

    /**
     * Array containing the pricing band information, which shows the details for each pricing band
     * or tier.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bandUsage(): Optional<List<BandUsage>> = bandUsage.getOptional("bandUsage")

    /**
     * The unique identifier (UUID) for the Bill that includes this line item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billId(): Optional<String> = billId.getOptional("billId")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun chargeId(): Optional<String> = chargeId.getOptional("chargeId")

    /**
     * The unique identifier (UUID) of the Commitment _(if this is used)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commitmentId(): Optional<String> = commitmentId.getOptional("commitmentId")

    /**
     * A unique identifier (UUID) for the Compound Aggregation, if applicable.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun compoundAggregationId(): Optional<String> =
        compoundAggregationId.getOptional("compoundAggregationId")

    /**
     * The unique identifier (UUID) for the contract associated with this line item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contractId(): Optional<String> = contractId.getOptional("contractId")

    /**
     * The currency conversion rate _(if used)_ for the line item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conversionRate(): Optional<Double> = conversionRate.getOptional("conversionRate")

    /**
     * The subtotal amount for this line item after currency conversion, if applicable.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun convertedSubtotal(): Optional<Double> = convertedSubtotal.getOptional("convertedSubtotal")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun counterId(): Optional<String> = counterId.getOptional("counterId")

    /**
     * The unique identifier (UUID) for the user who created the Bill line item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * The unique identifier (UUID) for the type of credit applied to this line item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditTypeId(): Optional<String> = creditTypeId.getOptional("creditTypeId")

    /**
     * The currency in which the line item is billed, represented as a currency code. For example,
     * USD, GBP, or EUR.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currency(): Optional<String> = currency.getOptional("currency")

    /**
     * A detailed description providing context for the line item within the Bill.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * The date and time _(in ISO 8601 format)_ when the Bill line item was first created.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtCreated(): Optional<OffsetDateTime> = dtCreated.getOptional("dtCreated")

    /**
     * The date and time _(in ISO 8601 format)_ when the Bill line item was last modified.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtLastModified(): Optional<OffsetDateTime> = dtLastModified.getOptional("dtLastModified")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun group(): Optional<Group> = group.getOptional("group")

    /**
     * Boolean flag indicating whether the Bill line item has associated statement usage in JSON
     * format. When a Bill statement is generated, usage line items have their usage stored in JSON
     * format.
     *
     * See
     * [Working with Bill Statements](https://www.m3ter.com/docs/guides/running-viewing-and-managing-bills/working-with-bill-statements)
     * for more information.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jsonUsageGenerated(): Optional<Boolean> =
        jsonUsageGenerated.getOptional("jsonUsageGenerated")

    /**
     * The unique identifier (UUID) for the user who last modified this Bill line item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedBy(): Optional<String> = lastModifiedBy.getOptional("lastModifiedBy")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lineItemType(): Optional<LineItemType> = lineItemType.getOptional("lineItemType")

    /**
     * The unique identifier (UUID) of the Meter responsible for tracking usage.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun meterId(): Optional<String> = meterId.getOptional("meterId")

    /**
     * The UUID of the PlanGroup.
     *
     * The unique identifier (UUID) for the PlanGroup, if applicable.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun planGroupId(): Optional<String> = planGroupId.getOptional("planGroupId")

    /**
     * A unique identifier (UUID) for the billing Plan associated with this line item,
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun planId(): Optional<String> = planId.getOptional("planId")

    /**
     * The unique identifier (UUID) of the Pricing used for this line item,
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pricingId(): Optional<String> = pricingId.getOptional("pricingId")

    /**
     * The code of the Product associated with this line item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun productCode(): Optional<String> = productCode.getOptional("productCode")

    /**
     * The unique identifier (UUID) for the associated Product.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun productId(): Optional<String> = productId.getOptional("productId")

    /**
     * The name of the Product associated with this line item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun productName(): Optional<String> = productName.getOptional("productName")

    /**
     * The amount of the product or service used in this line item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun quantity(): Optional<Double> = quantity.getOptional("quantity")

    /**
     * The UUID of the reason used for the line item.
     *
     * A unique identifier (UUID) for the reason or justification for this line item, if applicable.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reasonId(): Optional<String> = reasonId.getOptional("reasonId")

    /**
     * A unique identifier (UUID) for a Bill that this line item may be related to or derived from.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referencedBillId(): Optional<String> = referencedBillId.getOptional("referencedBillId")

    /**
     * A unique identifier (UUID) for another line item that this line item may be related to or
     * derived from.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referencedLineItemId(): Optional<String> =
        referencedLineItemId.getOptional("referencedLineItemId")

    /**
     * Specifies the segment name or identifier when segmented Aggregation is used. This is relevant
     * for more complex billing structures.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun segment(): Optional<Segment> = segment.getOptional("segment")

    /**
     * The number used for sequential invoices.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sequenceNumber(): Optional<Int> = sequenceNumber.getOptional("sequenceNumber")

    /**
     * The _(exclusive)_ end date for the service period in ISO 68601 format.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun servicePeriodEndDate(): Optional<OffsetDateTime> =
        servicePeriodEndDate.getOptional("servicePeriodEndDate")

    /**
     * The _(inclusive)_ start date for the service period in ISO 8601 format.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun servicePeriodStartDate(): Optional<OffsetDateTime> =
        servicePeriodStartDate.getOptional("servicePeriodStartDate")

    /**
     * The subtotal amount when not currency converted _(in the cases where currency conversion is
     * required)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subtotal(): Optional<Double> = subtotal.getOptional("subtotal")

    /**
     * Specifies the unit type. For example: **MB**, **GB**, **api_calls**, and so on.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unit(): Optional<String> = unit.getOptional("unit")

    /**
     * The number of units rated in the line item, each of which is of the type specified in the
     * `unit` field. For example: 400 api_calls.
     *
     * In this example, the unit type of **api_calls** is read from the `unit` field.
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
     * Returns the raw JSON value of [accountingProductCode].
     *
     * Unlike [accountingProductCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("accountingProductCode")
    @ExcludeMissing
    fun _accountingProductCode(): JsonField<String> = accountingProductCode

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
     * Returns the raw JSON value of [accountingProductName].
     *
     * Unlike [accountingProductName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("accountingProductName")
    @ExcludeMissing
    fun _accountingProductName(): JsonField<String> = accountingProductName

    /**
     * Returns the raw JSON value of [additional].
     *
     * Unlike [additional], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("additional")
    @ExcludeMissing
    fun _additional(): JsonField<Additional> = additional

    /**
     * Returns the raw JSON value of [aggregationId].
     *
     * Unlike [aggregationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aggregationId")
    @ExcludeMissing
    fun _aggregationId(): JsonField<String> = aggregationId

    /**
     * Returns the raw JSON value of [averageUnitPrice].
     *
     * Unlike [averageUnitPrice], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("averageUnitPrice")
    @ExcludeMissing
    fun _averageUnitPrice(): JsonField<Double> = averageUnitPrice

    /**
     * Returns the raw JSON value of [balanceId].
     *
     * Unlike [balanceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("balanceId") @ExcludeMissing fun _balanceId(): JsonField<String> = balanceId

    /**
     * Returns the raw JSON value of [bandUsage].
     *
     * Unlike [bandUsage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bandUsage")
    @ExcludeMissing
    fun _bandUsage(): JsonField<List<BandUsage>> = bandUsage

    /**
     * Returns the raw JSON value of [billId].
     *
     * Unlike [billId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billId") @ExcludeMissing fun _billId(): JsonField<String> = billId

    /**
     * Returns the raw JSON value of [chargeId].
     *
     * Unlike [chargeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chargeId") @ExcludeMissing fun _chargeId(): JsonField<String> = chargeId

    /**
     * Returns the raw JSON value of [commitmentId].
     *
     * Unlike [commitmentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("commitmentId")
    @ExcludeMissing
    fun _commitmentId(): JsonField<String> = commitmentId

    /**
     * Returns the raw JSON value of [compoundAggregationId].
     *
     * Unlike [compoundAggregationId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("compoundAggregationId")
    @ExcludeMissing
    fun _compoundAggregationId(): JsonField<String> = compoundAggregationId

    /**
     * Returns the raw JSON value of [contractId].
     *
     * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contractId") @ExcludeMissing fun _contractId(): JsonField<String> = contractId

    /**
     * Returns the raw JSON value of [conversionRate].
     *
     * Unlike [conversionRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("conversionRate")
    @ExcludeMissing
    fun _conversionRate(): JsonField<Double> = conversionRate

    /**
     * Returns the raw JSON value of [convertedSubtotal].
     *
     * Unlike [convertedSubtotal], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("convertedSubtotal")
    @ExcludeMissing
    fun _convertedSubtotal(): JsonField<Double> = convertedSubtotal

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
     * Returns the raw JSON value of [creditTypeId].
     *
     * Unlike [creditTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("creditTypeId")
    @ExcludeMissing
    fun _creditTypeId(): JsonField<String> = creditTypeId

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

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
     * Returns the raw JSON value of [group].
     *
     * Unlike [group], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("group") @ExcludeMissing fun _group(): JsonField<Group> = group

    /**
     * Returns the raw JSON value of [jsonUsageGenerated].
     *
     * Unlike [jsonUsageGenerated], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("jsonUsageGenerated")
    @ExcludeMissing
    fun _jsonUsageGenerated(): JsonField<Boolean> = jsonUsageGenerated

    /**
     * Returns the raw JSON value of [lastModifiedBy].
     *
     * Unlike [lastModifiedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /**
     * Returns the raw JSON value of [lineItemType].
     *
     * Unlike [lineItemType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lineItemType")
    @ExcludeMissing
    fun _lineItemType(): JsonField<LineItemType> = lineItemType

    /**
     * Returns the raw JSON value of [meterId].
     *
     * Unlike [meterId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meterId") @ExcludeMissing fun _meterId(): JsonField<String> = meterId

    /**
     * Returns the raw JSON value of [planGroupId].
     *
     * Unlike [planGroupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("planGroupId") @ExcludeMissing fun _planGroupId(): JsonField<String> = planGroupId

    /**
     * Returns the raw JSON value of [planId].
     *
     * Unlike [planId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("planId") @ExcludeMissing fun _planId(): JsonField<String> = planId

    /**
     * Returns the raw JSON value of [pricingId].
     *
     * Unlike [pricingId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pricingId") @ExcludeMissing fun _pricingId(): JsonField<String> = pricingId

    /**
     * Returns the raw JSON value of [productCode].
     *
     * Unlike [productCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("productCode") @ExcludeMissing fun _productCode(): JsonField<String> = productCode

    /**
     * Returns the raw JSON value of [productId].
     *
     * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("productId") @ExcludeMissing fun _productId(): JsonField<String> = productId

    /**
     * Returns the raw JSON value of [productName].
     *
     * Unlike [productName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("productName") @ExcludeMissing fun _productName(): JsonField<String> = productName

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

    /**
     * Returns the raw JSON value of [reasonId].
     *
     * Unlike [reasonId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reasonId") @ExcludeMissing fun _reasonId(): JsonField<String> = reasonId

    /**
     * Returns the raw JSON value of [referencedBillId].
     *
     * Unlike [referencedBillId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("referencedBillId")
    @ExcludeMissing
    fun _referencedBillId(): JsonField<String> = referencedBillId

    /**
     * Returns the raw JSON value of [referencedLineItemId].
     *
     * Unlike [referencedLineItemId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("referencedLineItemId")
    @ExcludeMissing
    fun _referencedLineItemId(): JsonField<String> = referencedLineItemId

    /**
     * Returns the raw JSON value of [segment].
     *
     * Unlike [segment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("segment") @ExcludeMissing fun _segment(): JsonField<Segment> = segment

    /**
     * Returns the raw JSON value of [sequenceNumber].
     *
     * Unlike [sequenceNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sequenceNumber")
    @ExcludeMissing
    fun _sequenceNumber(): JsonField<Int> = sequenceNumber

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
     * Returns the raw JSON value of [subtotal].
     *
     * Unlike [subtotal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<Double> = subtotal

    /**
     * Returns the raw JSON value of [unit].
     *
     * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

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
         * Returns a mutable builder for constructing an instance of [LineItemResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LineItemResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountingProductCode: JsonField<String> = JsonMissing.of()
        private var accountingProductId: JsonField<String> = JsonMissing.of()
        private var accountingProductName: JsonField<String> = JsonMissing.of()
        private var additional: JsonField<Additional> = JsonMissing.of()
        private var aggregationId: JsonField<String> = JsonMissing.of()
        private var averageUnitPrice: JsonField<Double> = JsonMissing.of()
        private var balanceId: JsonField<String> = JsonMissing.of()
        private var bandUsage: JsonField<MutableList<BandUsage>>? = null
        private var billId: JsonField<String> = JsonMissing.of()
        private var chargeId: JsonField<String> = JsonMissing.of()
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
        private var sequenceNumber: JsonField<Int> = JsonMissing.of()
        private var servicePeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var servicePeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var subtotal: JsonField<Double> = JsonMissing.of()
        private var unit: JsonField<String> = JsonMissing.of()
        private var units: JsonField<Double> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(lineItemResponse: LineItemResponse) = apply {
            id = lineItemResponse.id
            accountingProductCode = lineItemResponse.accountingProductCode
            accountingProductId = lineItemResponse.accountingProductId
            accountingProductName = lineItemResponse.accountingProductName
            additional = lineItemResponse.additional
            aggregationId = lineItemResponse.aggregationId
            averageUnitPrice = lineItemResponse.averageUnitPrice
            balanceId = lineItemResponse.balanceId
            bandUsage = lineItemResponse.bandUsage.map { it.toMutableList() }
            billId = lineItemResponse.billId
            chargeId = lineItemResponse.chargeId
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
            version = lineItemResponse.version
            additionalProperties = lineItemResponse.additionalProperties.toMutableMap()
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

        /** The code of the Accounting Product associated with this line item. */
        fun accountingProductCode(accountingProductCode: String) =
            accountingProductCode(JsonField.of(accountingProductCode))

        /**
         * Sets [Builder.accountingProductCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountingProductCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountingProductCode(accountingProductCode: JsonField<String>) = apply {
            this.accountingProductCode = accountingProductCode
        }

        /** The unique identifier (UUID) for the associated Accounting Product. */
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

        /** The name of the Accounting Product associated with this line item. */
        fun accountingProductName(accountingProductName: String) =
            accountingProductName(JsonField.of(accountingProductName))

        /**
         * Sets [Builder.accountingProductName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountingProductName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountingProductName(accountingProductName: JsonField<String>) = apply {
            this.accountingProductName = accountingProductName
        }

        fun additional(additional: Additional) = additional(JsonField.of(additional))

        /**
         * Sets [Builder.additional] to an arbitrary JSON value.
         *
         * You should usually call [Builder.additional] with a well-typed [Additional] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun additional(additional: JsonField<Additional>) = apply { this.additional = additional }

        /**
         * A unique identifier (UUID) for the Aggregation that contributes to this Bill line item.
         */
        fun aggregationId(aggregationId: String) = aggregationId(JsonField.of(aggregationId))

        /**
         * Sets [Builder.aggregationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aggregationId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Sets [Builder.averageUnitPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.averageUnitPrice] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun averageUnitPrice(averageUnitPrice: JsonField<Double>) = apply {
            this.averageUnitPrice = averageUnitPrice
        }

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
         * Array containing the pricing band information, which shows the details for each pricing
         * band or tier.
         */
        fun bandUsage(bandUsage: List<BandUsage>) = bandUsage(JsonField.of(bandUsage))

        /**
         * Sets [Builder.bandUsage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bandUsage] with a well-typed `List<BandUsage>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bandUsage(bandUsage: JsonField<List<BandUsage>>) = apply {
            this.bandUsage = bandUsage.map { it.toMutableList() }
        }

        /**
         * Adds a single [BandUsage] to [Builder.bandUsage].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBandUsage(bandUsage: BandUsage) = apply {
            this.bandUsage =
                (this.bandUsage ?: JsonField.of(mutableListOf())).also {
                    checkKnown("bandUsage", it).add(bandUsage)
                }
        }

        /** The unique identifier (UUID) for the Bill that includes this line item. */
        fun billId(billId: String) = billId(JsonField.of(billId))

        /**
         * Sets [Builder.billId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun billId(billId: JsonField<String>) = apply { this.billId = billId }

        fun chargeId(chargeId: String) = chargeId(JsonField.of(chargeId))

        /**
         * Sets [Builder.chargeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chargeId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chargeId(chargeId: JsonField<String>) = apply { this.chargeId = chargeId }

        /** The unique identifier (UUID) of the Commitment _(if this is used)_. */
        fun commitmentId(commitmentId: String) = commitmentId(JsonField.of(commitmentId))

        /**
         * Sets [Builder.commitmentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commitmentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun commitmentId(commitmentId: JsonField<String>) = apply {
            this.commitmentId = commitmentId
        }

        /** A unique identifier (UUID) for the Compound Aggregation, if applicable. */
        fun compoundAggregationId(compoundAggregationId: String) =
            compoundAggregationId(JsonField.of(compoundAggregationId))

        /**
         * Sets [Builder.compoundAggregationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.compoundAggregationId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun compoundAggregationId(compoundAggregationId: JsonField<String>) = apply {
            this.compoundAggregationId = compoundAggregationId
        }

        /** The unique identifier (UUID) for the contract associated with this line item. */
        fun contractId(contractId: String) = contractId(JsonField.of(contractId))

        /**
         * Sets [Builder.contractId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contractId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

        /** The currency conversion rate _(if used)_ for the line item. */
        fun conversionRate(conversionRate: Double) = conversionRate(JsonField.of(conversionRate))

        /**
         * Sets [Builder.conversionRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conversionRate] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun conversionRate(conversionRate: JsonField<Double>) = apply {
            this.conversionRate = conversionRate
        }

        /** The subtotal amount for this line item after currency conversion, if applicable. */
        fun convertedSubtotal(convertedSubtotal: Double) =
            convertedSubtotal(JsonField.of(convertedSubtotal))

        /**
         * Sets [Builder.convertedSubtotal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.convertedSubtotal] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun convertedSubtotal(convertedSubtotal: JsonField<Double>) = apply {
            this.convertedSubtotal = convertedSubtotal
        }

        fun counterId(counterId: String) = counterId(JsonField.of(counterId))

        /**
         * Sets [Builder.counterId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.counterId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun counterId(counterId: JsonField<String>) = apply { this.counterId = counterId }

        /** The unique identifier (UUID) for the user who created the Bill line item. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The unique identifier (UUID) for the type of credit applied to this line item. */
        fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

        /**
         * Sets [Builder.creditTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditTypeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun creditTypeId(creditTypeId: JsonField<String>) = apply {
            this.creditTypeId = creditTypeId
        }

        /**
         * The currency in which the line item is billed, represented as a currency code. For
         * example, USD, GBP, or EUR.
         */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** A detailed description providing context for the line item within the Bill. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The date and time _(in ISO 8601 format)_ when the Bill line item was first created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /**
         * Sets [Builder.dtCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The date and time _(in ISO 8601 format)_ when the Bill line item was last modified. */
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

        fun group(group: Group) = group(JsonField.of(group))

        /**
         * Sets [Builder.group] to an arbitrary JSON value.
         *
         * You should usually call [Builder.group] with a well-typed [Group] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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
         * Sets [Builder.jsonUsageGenerated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jsonUsageGenerated] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun jsonUsageGenerated(jsonUsageGenerated: JsonField<Boolean>) = apply {
            this.jsonUsageGenerated = jsonUsageGenerated
        }

        /** The unique identifier (UUID) for the user who last modified this Bill line item. */
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

        fun lineItemType(lineItemType: LineItemType) = lineItemType(JsonField.of(lineItemType))

        /**
         * Sets [Builder.lineItemType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lineItemType] with a well-typed [LineItemType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lineItemType(lineItemType: JsonField<LineItemType>) = apply {
            this.lineItemType = lineItemType
        }

        /** The unique identifier (UUID) of the Meter responsible for tracking usage. */
        fun meterId(meterId: String) = meterId(JsonField.of(meterId))

        /**
         * Sets [Builder.meterId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meterId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meterId(meterId: JsonField<String>) = apply { this.meterId = meterId }

        /**
         * The UUID of the PlanGroup.
         *
         * The unique identifier (UUID) for the PlanGroup, if applicable.
         */
        fun planGroupId(planGroupId: String) = planGroupId(JsonField.of(planGroupId))

        /**
         * Sets [Builder.planGroupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planGroupId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun planGroupId(planGroupId: JsonField<String>) = apply { this.planGroupId = planGroupId }

        /** A unique identifier (UUID) for the billing Plan associated with this line item, */
        fun planId(planId: String) = planId(JsonField.of(planId))

        /**
         * Sets [Builder.planId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun planId(planId: JsonField<String>) = apply { this.planId = planId }

        /** The unique identifier (UUID) of the Pricing used for this line item, */
        fun pricingId(pricingId: String) = pricingId(JsonField.of(pricingId))

        /**
         * Sets [Builder.pricingId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pricingId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pricingId(pricingId: JsonField<String>) = apply { this.pricingId = pricingId }

        /** The code of the Product associated with this line item. */
        fun productCode(productCode: String) = productCode(JsonField.of(productCode))

        /**
         * Sets [Builder.productCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productCode(productCode: JsonField<String>) = apply { this.productCode = productCode }

        /** The unique identifier (UUID) for the associated Product. */
        fun productId(productId: String) = productId(JsonField.of(productId))

        /**
         * Sets [Builder.productId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        /** The name of the Product associated with this line item. */
        fun productName(productName: String) = productName(JsonField.of(productName))

        /**
         * Sets [Builder.productName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productName(productName: JsonField<String>) = apply { this.productName = productName }

        /** The amount of the product or service used in this line item. */
        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

        /**
         * The UUID of the reason used for the line item.
         *
         * A unique identifier (UUID) for the reason or justification for this line item, if
         * applicable.
         */
        fun reasonId(reasonId: String) = reasonId(JsonField.of(reasonId))

        /**
         * Sets [Builder.reasonId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reasonId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reasonId(reasonId: JsonField<String>) = apply { this.reasonId = reasonId }

        /**
         * A unique identifier (UUID) for a Bill that this line item may be related to or derived
         * from.
         */
        fun referencedBillId(referencedBillId: String) =
            referencedBillId(JsonField.of(referencedBillId))

        /**
         * Sets [Builder.referencedBillId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referencedBillId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Sets [Builder.referencedLineItemId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referencedLineItemId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Sets [Builder.segment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.segment] with a well-typed [Segment] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun segment(segment: JsonField<Segment>) = apply { this.segment = segment }

        /** The number used for sequential invoices. */
        fun sequenceNumber(sequenceNumber: Int) = sequenceNumber(JsonField.of(sequenceNumber))

        /**
         * Sets [Builder.sequenceNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sequenceNumber] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sequenceNumber(sequenceNumber: JsonField<Int>) = apply {
            this.sequenceNumber = sequenceNumber
        }

        /** The _(exclusive)_ end date for the service period in ISO 68601 format. */
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

        /** The _(inclusive)_ start date for the service period in ISO 8601 format. */
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
         * The subtotal amount when not currency converted _(in the cases where currency conversion
         * is required)_.
         */
        fun subtotal(subtotal: Double) = subtotal(JsonField.of(subtotal))

        /**
         * Sets [Builder.subtotal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subtotal] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subtotal(subtotal: JsonField<Double>) = apply { this.subtotal = subtotal }

        /** Specifies the unit type. For example: **MB**, **GB**, **api_calls**, and so on. */
        fun unit(unit: String) = unit(JsonField.of(unit))

        /**
         * Sets [Builder.unit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unit] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun unit(unit: JsonField<String>) = apply { this.unit = unit }

        /**
         * The number of units rated in the line item, each of which is of the type specified in the
         * `unit` field. For example: 400 api_calls.
         *
         * In this example, the unit type of **api_calls** is read from the `unit` field.
         */
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
         * Returns an immutable instance of [LineItemResponse].
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
        fun build(): LineItemResponse =
            LineItemResponse(
                checkRequired("id", id),
                accountingProductCode,
                accountingProductId,
                accountingProductName,
                additional,
                aggregationId,
                averageUnitPrice,
                balanceId,
                (bandUsage ?: JsonMissing.of()).map { it.toImmutable() },
                billId,
                chargeId,
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
                version,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LineItemResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        accountingProductCode()
        accountingProductId()
        accountingProductName()
        additional().ifPresent { it.validate() }
        aggregationId()
        averageUnitPrice()
        balanceId()
        bandUsage().ifPresent { it.forEach { it.validate() } }
        billId()
        chargeId()
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
        lineItemType().ifPresent { it.validate() }
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
            (if (accountingProductCode.asKnown().isPresent) 1 else 0) +
            (if (accountingProductId.asKnown().isPresent) 1 else 0) +
            (if (accountingProductName.asKnown().isPresent) 1 else 0) +
            (additional.asKnown().getOrNull()?.validity() ?: 0) +
            (if (aggregationId.asKnown().isPresent) 1 else 0) +
            (if (averageUnitPrice.asKnown().isPresent) 1 else 0) +
            (if (balanceId.asKnown().isPresent) 1 else 0) +
            (bandUsage.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (billId.asKnown().isPresent) 1 else 0) +
            (if (chargeId.asKnown().isPresent) 1 else 0) +
            (if (commitmentId.asKnown().isPresent) 1 else 0) +
            (if (compoundAggregationId.asKnown().isPresent) 1 else 0) +
            (if (contractId.asKnown().isPresent) 1 else 0) +
            (if (conversionRate.asKnown().isPresent) 1 else 0) +
            (if (convertedSubtotal.asKnown().isPresent) 1 else 0) +
            (if (counterId.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (creditTypeId.asKnown().isPresent) 1 else 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (dtCreated.asKnown().isPresent) 1 else 0) +
            (if (dtLastModified.asKnown().isPresent) 1 else 0) +
            (group.asKnown().getOrNull()?.validity() ?: 0) +
            (if (jsonUsageGenerated.asKnown().isPresent) 1 else 0) +
            (if (lastModifiedBy.asKnown().isPresent) 1 else 0) +
            (lineItemType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (meterId.asKnown().isPresent) 1 else 0) +
            (if (planGroupId.asKnown().isPresent) 1 else 0) +
            (if (planId.asKnown().isPresent) 1 else 0) +
            (if (pricingId.asKnown().isPresent) 1 else 0) +
            (if (productCode.asKnown().isPresent) 1 else 0) +
            (if (productId.asKnown().isPresent) 1 else 0) +
            (if (productName.asKnown().isPresent) 1 else 0) +
            (if (quantity.asKnown().isPresent) 1 else 0) +
            (if (reasonId.asKnown().isPresent) 1 else 0) +
            (if (referencedBillId.asKnown().isPresent) 1 else 0) +
            (if (referencedLineItemId.asKnown().isPresent) 1 else 0) +
            (segment.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sequenceNumber.asKnown().isPresent) 1 else 0) +
            (if (servicePeriodEndDate.asKnown().isPresent) 1 else 0) +
            (if (servicePeriodStartDate.asKnown().isPresent) 1 else 0) +
            (if (subtotal.asKnown().isPresent) 1 else 0) +
            (if (unit.asKnown().isPresent) 1 else 0) +
            (if (units.asKnown().isPresent) 1 else 0) +
            (if (version.asKnown().isPresent) 1 else 0)

    class Additional
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

            /** Returns a mutable builder for constructing an instance of [Additional]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Additional]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(additional: Additional) = apply {
                additionalProperties = additional.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Additional].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Additional = Additional(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Additional = apply {
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

            return other is Additional && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Additional{additionalProperties=$additionalProperties}"
    }

    /**
     * Array containing the pricing band information, which shows the details for each pricing band
     * or tier.
     */
    class BandUsage
    private constructor(
        private val bandQuantity: JsonField<Double>,
        private val bandSubtotal: JsonField<Double>,
        private val bandUnits: JsonField<Double>,
        private val convertedBandSubtotal: JsonField<Double>,
        private val creditTypeId: JsonField<String>,
        private val fixedPrice: JsonField<Double>,
        private val lowerLimit: JsonField<Double>,
        private val pricingBandId: JsonField<String>,
        private val unitPrice: JsonField<Double>,
        private val unitSubtotal: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("bandQuantity")
            @ExcludeMissing
            bandQuantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("bandSubtotal")
            @ExcludeMissing
            bandSubtotal: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("bandUnits")
            @ExcludeMissing
            bandUnits: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("convertedBandSubtotal")
            @ExcludeMissing
            convertedBandSubtotal: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("creditTypeId")
            @ExcludeMissing
            creditTypeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fixedPrice")
            @ExcludeMissing
            fixedPrice: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("lowerLimit")
            @ExcludeMissing
            lowerLimit: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("pricingBandId")
            @ExcludeMissing
            pricingBandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("unitPrice")
            @ExcludeMissing
            unitPrice: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("unitSubtotal")
            @ExcludeMissing
            unitSubtotal: JsonField<Double> = JsonMissing.of(),
        ) : this(
            bandQuantity,
            bandSubtotal,
            bandUnits,
            convertedBandSubtotal,
            creditTypeId,
            fixedPrice,
            lowerLimit,
            pricingBandId,
            unitPrice,
            unitSubtotal,
            mutableMapOf(),
        )

        /**
         * Usage amount within the band.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bandQuantity(): Optional<Double> = bandQuantity.getOptional("bandQuantity")

        /**
         * Subtotal amount for the band.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bandSubtotal(): Optional<Double> = bandSubtotal.getOptional("bandSubtotal")

        /**
         * The number of units used within the band.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bandUnits(): Optional<Double> = bandUnits.getOptional("bandUnits")

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun convertedBandSubtotal(): Optional<Double> =
            convertedBandSubtotal.getOptional("convertedBandSubtotal")

        /**
         * The UUID of the credit type.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun creditTypeId(): Optional<String> = creditTypeId.getOptional("creditTypeId")

        /**
         * Fixed price is a charge entered for certain pricing types such as Stairstep, Custom
         * Tiered, and Custom Volume. It is a set price and not dependent on usage.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fixedPrice(): Optional<Double> = fixedPrice.getOptional("fixedPrice")

        /**
         * The lower limit _(start)_ of the pricing band.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lowerLimit(): Optional<Double> = lowerLimit.getOptional("lowerLimit")

        /**
         * The UUID for the pricing band.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pricingBandId(): Optional<String> = pricingBandId.getOptional("pricingBandId")

        /**
         * The price per unit in the band.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun unitPrice(): Optional<Double> = unitPrice.getOptional("unitPrice")

        /**
         * The subtotal of the unit usage.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun unitSubtotal(): Optional<Double> = unitSubtotal.getOptional("unitSubtotal")

        /**
         * Returns the raw JSON value of [bandQuantity].
         *
         * Unlike [bandQuantity], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("bandQuantity")
        @ExcludeMissing
        fun _bandQuantity(): JsonField<Double> = bandQuantity

        /**
         * Returns the raw JSON value of [bandSubtotal].
         *
         * Unlike [bandSubtotal], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("bandSubtotal")
        @ExcludeMissing
        fun _bandSubtotal(): JsonField<Double> = bandSubtotal

        /**
         * Returns the raw JSON value of [bandUnits].
         *
         * Unlike [bandUnits], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bandUnits") @ExcludeMissing fun _bandUnits(): JsonField<Double> = bandUnits

        /**
         * Returns the raw JSON value of [convertedBandSubtotal].
         *
         * Unlike [convertedBandSubtotal], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("convertedBandSubtotal")
        @ExcludeMissing
        fun _convertedBandSubtotal(): JsonField<Double> = convertedBandSubtotal

        /**
         * Returns the raw JSON value of [creditTypeId].
         *
         * Unlike [creditTypeId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("creditTypeId")
        @ExcludeMissing
        fun _creditTypeId(): JsonField<String> = creditTypeId

        /**
         * Returns the raw JSON value of [fixedPrice].
         *
         * Unlike [fixedPrice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fixedPrice")
        @ExcludeMissing
        fun _fixedPrice(): JsonField<Double> = fixedPrice

        /**
         * Returns the raw JSON value of [lowerLimit].
         *
         * Unlike [lowerLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lowerLimit")
        @ExcludeMissing
        fun _lowerLimit(): JsonField<Double> = lowerLimit

        /**
         * Returns the raw JSON value of [pricingBandId].
         *
         * Unlike [pricingBandId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pricingBandId")
        @ExcludeMissing
        fun _pricingBandId(): JsonField<String> = pricingBandId

        /**
         * Returns the raw JSON value of [unitPrice].
         *
         * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unitPrice") @ExcludeMissing fun _unitPrice(): JsonField<Double> = unitPrice

        /**
         * Returns the raw JSON value of [unitSubtotal].
         *
         * Unlike [unitSubtotal], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("unitSubtotal")
        @ExcludeMissing
        fun _unitSubtotal(): JsonField<Double> = unitSubtotal

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

            /** Returns a mutable builder for constructing an instance of [BandUsage]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BandUsage]. */
        class Builder internal constructor() {

            private var bandQuantity: JsonField<Double> = JsonMissing.of()
            private var bandSubtotal: JsonField<Double> = JsonMissing.of()
            private var bandUnits: JsonField<Double> = JsonMissing.of()
            private var convertedBandSubtotal: JsonField<Double> = JsonMissing.of()
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
                convertedBandSubtotal = bandUsage.convertedBandSubtotal
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

            /**
             * Sets [Builder.bandQuantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bandQuantity] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bandQuantity(bandQuantity: JsonField<Double>) = apply {
                this.bandQuantity = bandQuantity
            }

            /** Subtotal amount for the band. */
            fun bandSubtotal(bandSubtotal: Double) = bandSubtotal(JsonField.of(bandSubtotal))

            /**
             * Sets [Builder.bandSubtotal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bandSubtotal] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bandSubtotal(bandSubtotal: JsonField<Double>) = apply {
                this.bandSubtotal = bandSubtotal
            }

            /** The number of units used within the band. */
            fun bandUnits(bandUnits: Double) = bandUnits(JsonField.of(bandUnits))

            /**
             * Sets [Builder.bandUnits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bandUnits] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bandUnits(bandUnits: JsonField<Double>) = apply { this.bandUnits = bandUnits }

            fun convertedBandSubtotal(convertedBandSubtotal: Double) =
                convertedBandSubtotal(JsonField.of(convertedBandSubtotal))

            /**
             * Sets [Builder.convertedBandSubtotal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.convertedBandSubtotal] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun convertedBandSubtotal(convertedBandSubtotal: JsonField<Double>) = apply {
                this.convertedBandSubtotal = convertedBandSubtotal
            }

            /** The UUID of the credit type. */
            fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

            /**
             * Sets [Builder.creditTypeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditTypeId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                this.creditTypeId = creditTypeId
            }

            /**
             * Fixed price is a charge entered for certain pricing types such as Stairstep, Custom
             * Tiered, and Custom Volume. It is a set price and not dependent on usage.
             */
            fun fixedPrice(fixedPrice: Double) = fixedPrice(JsonField.of(fixedPrice))

            /**
             * Sets [Builder.fixedPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fixedPrice] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fixedPrice(fixedPrice: JsonField<Double>) = apply { this.fixedPrice = fixedPrice }

            /** The lower limit _(start)_ of the pricing band. */
            fun lowerLimit(lowerLimit: Double) = lowerLimit(JsonField.of(lowerLimit))

            /**
             * Sets [Builder.lowerLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lowerLimit] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lowerLimit(lowerLimit: JsonField<Double>) = apply { this.lowerLimit = lowerLimit }

            /** The UUID for the pricing band. */
            fun pricingBandId(pricingBandId: String) = pricingBandId(JsonField.of(pricingBandId))

            /**
             * Sets [Builder.pricingBandId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pricingBandId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pricingBandId(pricingBandId: JsonField<String>) = apply {
                this.pricingBandId = pricingBandId
            }

            /** The price per unit in the band. */
            fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

            /**
             * Sets [Builder.unitPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unitPrice] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unitPrice(unitPrice: JsonField<Double>) = apply { this.unitPrice = unitPrice }

            /** The subtotal of the unit usage. */
            fun unitSubtotal(unitSubtotal: Double) = unitSubtotal(JsonField.of(unitSubtotal))

            /**
             * Sets [Builder.unitSubtotal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unitSubtotal] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [BandUsage].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): BandUsage =
                BandUsage(
                    bandQuantity,
                    bandSubtotal,
                    bandUnits,
                    convertedBandSubtotal,
                    creditTypeId,
                    fixedPrice,
                    lowerLimit,
                    pricingBandId,
                    unitPrice,
                    unitSubtotal,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): BandUsage = apply {
            if (validated) {
                return@apply
            }

            bandQuantity()
            bandSubtotal()
            bandUnits()
            convertedBandSubtotal()
            creditTypeId()
            fixedPrice()
            lowerLimit()
            pricingBandId()
            unitPrice()
            unitSubtotal()
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
            (if (bandQuantity.asKnown().isPresent) 1 else 0) +
                (if (bandSubtotal.asKnown().isPresent) 1 else 0) +
                (if (bandUnits.asKnown().isPresent) 1 else 0) +
                (if (convertedBandSubtotal.asKnown().isPresent) 1 else 0) +
                (if (creditTypeId.asKnown().isPresent) 1 else 0) +
                (if (fixedPrice.asKnown().isPresent) 1 else 0) +
                (if (lowerLimit.asKnown().isPresent) 1 else 0) +
                (if (pricingBandId.asKnown().isPresent) 1 else 0) +
                (if (unitPrice.asKnown().isPresent) 1 else 0) +
                (if (unitSubtotal.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BandUsage &&
                bandQuantity == other.bandQuantity &&
                bandSubtotal == other.bandSubtotal &&
                bandUnits == other.bandUnits &&
                convertedBandSubtotal == other.convertedBandSubtotal &&
                creditTypeId == other.creditTypeId &&
                fixedPrice == other.fixedPrice &&
                lowerLimit == other.lowerLimit &&
                pricingBandId == other.pricingBandId &&
                unitPrice == other.unitPrice &&
                unitSubtotal == other.unitSubtotal &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                bandQuantity,
                bandSubtotal,
                bandUnits,
                convertedBandSubtotal,
                creditTypeId,
                fixedPrice,
                lowerLimit,
                pricingBandId,
                unitPrice,
                unitSubtotal,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BandUsage{bandQuantity=$bandQuantity, bandSubtotal=$bandSubtotal, bandUnits=$bandUnits, convertedBandSubtotal=$convertedBandSubtotal, creditTypeId=$creditTypeId, fixedPrice=$fixedPrice, lowerLimit=$lowerLimit, pricingBandId=$pricingBandId, unitPrice=$unitPrice, unitSubtotal=$unitSubtotal, additionalProperties=$additionalProperties}"
    }

    class Group
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

            /**
             * Returns an immutable instance of [Group].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Group = Group(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Group = apply {
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

            return other is Group && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

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

        private var validated: Boolean = false

        fun validate(): LineItemType = apply {
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

            return other is LineItemType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Specifies the segment name or identifier when segmented Aggregation is used. This is relevant
     * for more complex billing structures.
     */
    class Segment
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

            /**
             * Returns an immutable instance of [Segment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Segment = Segment(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Segment = apply {
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

            return other is Segment && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Segment{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LineItemResponse &&
            id == other.id &&
            accountingProductCode == other.accountingProductCode &&
            accountingProductId == other.accountingProductId &&
            accountingProductName == other.accountingProductName &&
            additional == other.additional &&
            aggregationId == other.aggregationId &&
            averageUnitPrice == other.averageUnitPrice &&
            balanceId == other.balanceId &&
            bandUsage == other.bandUsage &&
            billId == other.billId &&
            chargeId == other.chargeId &&
            commitmentId == other.commitmentId &&
            compoundAggregationId == other.compoundAggregationId &&
            contractId == other.contractId &&
            conversionRate == other.conversionRate &&
            convertedSubtotal == other.convertedSubtotal &&
            counterId == other.counterId &&
            createdBy == other.createdBy &&
            creditTypeId == other.creditTypeId &&
            currency == other.currency &&
            description == other.description &&
            dtCreated == other.dtCreated &&
            dtLastModified == other.dtLastModified &&
            group == other.group &&
            jsonUsageGenerated == other.jsonUsageGenerated &&
            lastModifiedBy == other.lastModifiedBy &&
            lineItemType == other.lineItemType &&
            meterId == other.meterId &&
            planGroupId == other.planGroupId &&
            planId == other.planId &&
            pricingId == other.pricingId &&
            productCode == other.productCode &&
            productId == other.productId &&
            productName == other.productName &&
            quantity == other.quantity &&
            reasonId == other.reasonId &&
            referencedBillId == other.referencedBillId &&
            referencedLineItemId == other.referencedLineItemId &&
            segment == other.segment &&
            sequenceNumber == other.sequenceNumber &&
            servicePeriodEndDate == other.servicePeriodEndDate &&
            servicePeriodStartDate == other.servicePeriodStartDate &&
            subtotal == other.subtotal &&
            unit == other.unit &&
            units == other.units &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accountingProductCode,
            accountingProductId,
            accountingProductName,
            additional,
            aggregationId,
            averageUnitPrice,
            balanceId,
            bandUsage,
            billId,
            chargeId,
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
            version,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LineItemResponse{id=$id, accountingProductCode=$accountingProductCode, accountingProductId=$accountingProductId, accountingProductName=$accountingProductName, additional=$additional, aggregationId=$aggregationId, averageUnitPrice=$averageUnitPrice, balanceId=$balanceId, bandUsage=$bandUsage, billId=$billId, chargeId=$chargeId, commitmentId=$commitmentId, compoundAggregationId=$compoundAggregationId, contractId=$contractId, conversionRate=$conversionRate, convertedSubtotal=$convertedSubtotal, counterId=$counterId, createdBy=$createdBy, creditTypeId=$creditTypeId, currency=$currency, description=$description, dtCreated=$dtCreated, dtLastModified=$dtLastModified, group=$group, jsonUsageGenerated=$jsonUsageGenerated, lastModifiedBy=$lastModifiedBy, lineItemType=$lineItemType, meterId=$meterId, planGroupId=$planGroupId, planId=$planId, pricingId=$pricingId, productCode=$productCode, productId=$productId, productName=$productName, quantity=$quantity, reasonId=$reasonId, referencedBillId=$referencedBillId, referencedLineItemId=$referencedLineItemId, segment=$segment, sequenceNumber=$sequenceNumber, servicePeriodEndDate=$servicePeriodEndDate, servicePeriodStartDate=$servicePeriodStartDate, subtotal=$subtotal, unit=$unit, units=$units, version=$version, additionalProperties=$additionalProperties}"
}
