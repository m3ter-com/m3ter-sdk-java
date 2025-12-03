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
import com.m3ter.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update the Credit line item with the given UUID. */
class BillCreditLineItemUpdateParams
private constructor(
    private val orgId: String?,
    private val billId: String,
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    fun billId(): String = billId

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountingProductId(): String = body.accountingProductId()

    /**
     * The amount for the line item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Double = body.amount()

    /**
     * The description for the line item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = body.description()

    /**
     * The UUID of the Product.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun productId(): String = body.productId()

    /**
     * The UUID of the bill for the line item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun referencedBillId(): String = body.referencedBillId()

    /**
     * The UUID of the line item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun referencedLineItemId(): String = body.referencedLineItemId()

    /**
     * The service period end date in ISO-8601 format.*(exclusive of the ending date)*.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun servicePeriodEndDate(): OffsetDateTime = body.servicePeriodEndDate()

    /**
     * The service period start date in ISO-8601 format. *(inclusive of the starting date)*.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun servicePeriodStartDate(): OffsetDateTime = body.servicePeriodStartDate()

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amountToApplyOnBill(): Optional<Double> = body.amountToApplyOnBill()

    /**
     * The UUID of the credit reason.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditReasonId(): Optional<String> = body.creditReasonId()

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lineItemType(): Optional<LineItemType> = body.lineItemType()

    /**
     * The UUID of the line item reason.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reasonId(): Optional<String> = body.reasonId()

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
     * Returns the raw JSON value of [accountingProductId].
     *
     * Unlike [accountingProductId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _accountingProductId(): JsonField<String> = body._accountingProductId()

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Double> = body._amount()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [productId].
     *
     * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _productId(): JsonField<String> = body._productId()

    /**
     * Returns the raw JSON value of [referencedBillId].
     *
     * Unlike [referencedBillId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _referencedBillId(): JsonField<String> = body._referencedBillId()

    /**
     * Returns the raw JSON value of [referencedLineItemId].
     *
     * Unlike [referencedLineItemId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _referencedLineItemId(): JsonField<String> = body._referencedLineItemId()

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
     * Returns the raw JSON value of [amountToApplyOnBill].
     *
     * Unlike [amountToApplyOnBill], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _amountToApplyOnBill(): JsonField<Double> = body._amountToApplyOnBill()

    /**
     * Returns the raw JSON value of [creditReasonId].
     *
     * Unlike [creditReasonId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _creditReasonId(): JsonField<String> = body._creditReasonId()

    /**
     * Returns the raw JSON value of [lineItemType].
     *
     * Unlike [lineItemType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _lineItemType(): JsonField<LineItemType> = body._lineItemType()

    /**
     * Returns the raw JSON value of [reasonId].
     *
     * Unlike [reasonId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _reasonId(): JsonField<String> = body._reasonId()

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
         * [BillCreditLineItemUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .billId()
         * .accountingProductId()
         * .amount()
         * .description()
         * .productId()
         * .referencedBillId()
         * .referencedLineItemId()
         * .servicePeriodEndDate()
         * .servicePeriodStartDate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BillCreditLineItemUpdateParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var billId: String? = null
        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(billCreditLineItemUpdateParams: BillCreditLineItemUpdateParams) = apply {
            orgId = billCreditLineItemUpdateParams.orgId
            billId = billCreditLineItemUpdateParams.billId
            id = billCreditLineItemUpdateParams.id
            body = billCreditLineItemUpdateParams.body.toBuilder()
            additionalHeaders = billCreditLineItemUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = billCreditLineItemUpdateParams.additionalQueryParams.toBuilder()
        }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        fun billId(billId: String) = apply { this.billId = billId }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accountingProductId]
         * - [amount]
         * - [description]
         * - [productId]
         * - [referencedBillId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun accountingProductId(accountingProductId: String) = apply {
            body.accountingProductId(accountingProductId)
        }

        /**
         * Sets [Builder.accountingProductId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountingProductId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountingProductId(accountingProductId: JsonField<String>) = apply {
            body.accountingProductId(accountingProductId)
        }

        /** The amount for the line item. */
        fun amount(amount: Double) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Double>) = apply { body.amount(amount) }

        /** The description for the line item. */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** The UUID of the Product. */
        fun productId(productId: String) = apply { body.productId(productId) }

        /**
         * Sets [Builder.productId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productId(productId: JsonField<String>) = apply { body.productId(productId) }

        /** The UUID of the bill for the line item. */
        fun referencedBillId(referencedBillId: String) = apply {
            body.referencedBillId(referencedBillId)
        }

        /**
         * Sets [Builder.referencedBillId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referencedBillId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referencedBillId(referencedBillId: JsonField<String>) = apply {
            body.referencedBillId(referencedBillId)
        }

        /** The UUID of the line item. */
        fun referencedLineItemId(referencedLineItemId: String) = apply {
            body.referencedLineItemId(referencedLineItemId)
        }

        /**
         * Sets [Builder.referencedLineItemId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referencedLineItemId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referencedLineItemId(referencedLineItemId: JsonField<String>) = apply {
            body.referencedLineItemId(referencedLineItemId)
        }

        /** The service period end date in ISO-8601 format.*(exclusive of the ending date)*. */
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

        /** The service period start date in ISO-8601 format. *(inclusive of the starting date)*. */
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

        fun amountToApplyOnBill(amountToApplyOnBill: Double) = apply {
            body.amountToApplyOnBill(amountToApplyOnBill)
        }

        /**
         * Sets [Builder.amountToApplyOnBill] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountToApplyOnBill] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun amountToApplyOnBill(amountToApplyOnBill: JsonField<Double>) = apply {
            body.amountToApplyOnBill(amountToApplyOnBill)
        }

        /** The UUID of the credit reason. */
        fun creditReasonId(creditReasonId: String) = apply { body.creditReasonId(creditReasonId) }

        /**
         * Sets [Builder.creditReasonId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditReasonId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditReasonId(creditReasonId: JsonField<String>) = apply {
            body.creditReasonId(creditReasonId)
        }

        fun lineItemType(lineItemType: LineItemType) = apply { body.lineItemType(lineItemType) }

        /**
         * Sets [Builder.lineItemType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lineItemType] with a well-typed [LineItemType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lineItemType(lineItemType: JsonField<LineItemType>) = apply {
            body.lineItemType(lineItemType)
        }

        /** The UUID of the line item reason. */
        fun reasonId(reasonId: String) = apply { body.reasonId(reasonId) }

        /**
         * Sets [Builder.reasonId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reasonId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reasonId(reasonId: JsonField<String>) = apply { body.reasonId(reasonId) }

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
         * Returns an immutable instance of [BillCreditLineItemUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .billId()
         * .accountingProductId()
         * .amount()
         * .description()
         * .productId()
         * .referencedBillId()
         * .referencedLineItemId()
         * .servicePeriodEndDate()
         * .servicePeriodStartDate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BillCreditLineItemUpdateParams =
            BillCreditLineItemUpdateParams(
                orgId,
                checkRequired("billId", billId),
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
            1 -> billId
            2 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountingProductId: JsonField<String>,
        private val amount: JsonField<Double>,
        private val description: JsonField<String>,
        private val productId: JsonField<String>,
        private val referencedBillId: JsonField<String>,
        private val referencedLineItemId: JsonField<String>,
        private val servicePeriodEndDate: JsonField<OffsetDateTime>,
        private val servicePeriodStartDate: JsonField<OffsetDateTime>,
        private val amountToApplyOnBill: JsonField<Double>,
        private val creditReasonId: JsonField<String>,
        private val lineItemType: JsonField<LineItemType>,
        private val reasonId: JsonField<String>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountingProductId")
            @ExcludeMissing
            accountingProductId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("productId")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("referencedBillId")
            @ExcludeMissing
            referencedBillId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("referencedLineItemId")
            @ExcludeMissing
            referencedLineItemId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("servicePeriodEndDate")
            @ExcludeMissing
            servicePeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("servicePeriodStartDate")
            @ExcludeMissing
            servicePeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("amountToApplyOnBill")
            @ExcludeMissing
            amountToApplyOnBill: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("creditReasonId")
            @ExcludeMissing
            creditReasonId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lineItemType")
            @ExcludeMissing
            lineItemType: JsonField<LineItemType> = JsonMissing.of(),
            @JsonProperty("reasonId")
            @ExcludeMissing
            reasonId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(
            accountingProductId,
            amount,
            description,
            productId,
            referencedBillId,
            referencedLineItemId,
            servicePeriodEndDate,
            servicePeriodStartDate,
            amountToApplyOnBill,
            creditReasonId,
            lineItemType,
            reasonId,
            version,
            mutableMapOf(),
        )

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountingProductId(): String = accountingProductId.getRequired("accountingProductId")

        /**
         * The amount for the line item.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Double = amount.getRequired("amount")

        /**
         * The description for the line item.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun description(): String = description.getRequired("description")

        /**
         * The UUID of the Product.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun productId(): String = productId.getRequired("productId")

        /**
         * The UUID of the bill for the line item.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun referencedBillId(): String = referencedBillId.getRequired("referencedBillId")

        /**
         * The UUID of the line item.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun referencedLineItemId(): String =
            referencedLineItemId.getRequired("referencedLineItemId")

        /**
         * The service period end date in ISO-8601 format.*(exclusive of the ending date)*.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun servicePeriodEndDate(): OffsetDateTime =
            servicePeriodEndDate.getRequired("servicePeriodEndDate")

        /**
         * The service period start date in ISO-8601 format. *(inclusive of the starting date)*.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun servicePeriodStartDate(): OffsetDateTime =
            servicePeriodStartDate.getRequired("servicePeriodStartDate")

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amountToApplyOnBill(): Optional<Double> =
            amountToApplyOnBill.getOptional("amountToApplyOnBill")

        /**
         * The UUID of the credit reason.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun creditReasonId(): Optional<String> = creditReasonId.getOptional("creditReasonId")

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lineItemType(): Optional<LineItemType> = lineItemType.getOptional("lineItemType")

        /**
         * The UUID of the line item reason.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reasonId(): Optional<String> = reasonId.getOptional("reasonId")

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
         * Returns the raw JSON value of [accountingProductId].
         *
         * Unlike [accountingProductId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("accountingProductId")
        @ExcludeMissing
        fun _accountingProductId(): JsonField<String> = accountingProductId

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [productId].
         *
         * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("productId") @ExcludeMissing fun _productId(): JsonField<String> = productId

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
         * Unlike [referencedLineItemId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("referencedLineItemId")
        @ExcludeMissing
        fun _referencedLineItemId(): JsonField<String> = referencedLineItemId

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
         * Returns the raw JSON value of [amountToApplyOnBill].
         *
         * Unlike [amountToApplyOnBill], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("amountToApplyOnBill")
        @ExcludeMissing
        fun _amountToApplyOnBill(): JsonField<Double> = amountToApplyOnBill

        /**
         * Returns the raw JSON value of [creditReasonId].
         *
         * Unlike [creditReasonId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("creditReasonId")
        @ExcludeMissing
        fun _creditReasonId(): JsonField<String> = creditReasonId

        /**
         * Returns the raw JSON value of [lineItemType].
         *
         * Unlike [lineItemType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("lineItemType")
        @ExcludeMissing
        fun _lineItemType(): JsonField<LineItemType> = lineItemType

        /**
         * Returns the raw JSON value of [reasonId].
         *
         * Unlike [reasonId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reasonId") @ExcludeMissing fun _reasonId(): JsonField<String> = reasonId

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
             * .accountingProductId()
             * .amount()
             * .description()
             * .productId()
             * .referencedBillId()
             * .referencedLineItemId()
             * .servicePeriodEndDate()
             * .servicePeriodStartDate()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountingProductId: JsonField<String>? = null
            private var amount: JsonField<Double>? = null
            private var description: JsonField<String>? = null
            private var productId: JsonField<String>? = null
            private var referencedBillId: JsonField<String>? = null
            private var referencedLineItemId: JsonField<String>? = null
            private var servicePeriodEndDate: JsonField<OffsetDateTime>? = null
            private var servicePeriodStartDate: JsonField<OffsetDateTime>? = null
            private var amountToApplyOnBill: JsonField<Double> = JsonMissing.of()
            private var creditReasonId: JsonField<String> = JsonMissing.of()
            private var lineItemType: JsonField<LineItemType> = JsonMissing.of()
            private var reasonId: JsonField<String> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountingProductId = body.accountingProductId
                amount = body.amount
                description = body.description
                productId = body.productId
                referencedBillId = body.referencedBillId
                referencedLineItemId = body.referencedLineItemId
                servicePeriodEndDate = body.servicePeriodEndDate
                servicePeriodStartDate = body.servicePeriodStartDate
                amountToApplyOnBill = body.amountToApplyOnBill
                creditReasonId = body.creditReasonId
                lineItemType = body.lineItemType
                reasonId = body.reasonId
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun accountingProductId(accountingProductId: String) =
                accountingProductId(JsonField.of(accountingProductId))

            /**
             * Sets [Builder.accountingProductId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountingProductId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun accountingProductId(accountingProductId: JsonField<String>) = apply {
                this.accountingProductId = accountingProductId
            }

            /** The amount for the line item. */
            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** The description for the line item. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The UUID of the Product. */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /** The UUID of the bill for the line item. */
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

            /** The UUID of the line item. */
            fun referencedLineItemId(referencedLineItemId: String) =
                referencedLineItemId(JsonField.of(referencedLineItemId))

            /**
             * Sets [Builder.referencedLineItemId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referencedLineItemId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun referencedLineItemId(referencedLineItemId: JsonField<String>) = apply {
                this.referencedLineItemId = referencedLineItemId
            }

            /** The service period end date in ISO-8601 format.*(exclusive of the ending date)*. */
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
             * The service period start date in ISO-8601 format. *(inclusive of the starting date)*.
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

            fun amountToApplyOnBill(amountToApplyOnBill: Double) =
                amountToApplyOnBill(JsonField.of(amountToApplyOnBill))

            /**
             * Sets [Builder.amountToApplyOnBill] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountToApplyOnBill] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun amountToApplyOnBill(amountToApplyOnBill: JsonField<Double>) = apply {
                this.amountToApplyOnBill = amountToApplyOnBill
            }

            /** The UUID of the credit reason. */
            fun creditReasonId(creditReasonId: String) =
                creditReasonId(JsonField.of(creditReasonId))

            /**
             * Sets [Builder.creditReasonId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditReasonId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditReasonId(creditReasonId: JsonField<String>) = apply {
                this.creditReasonId = creditReasonId
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

            /** The UUID of the line item reason. */
            fun reasonId(reasonId: String) = reasonId(JsonField.of(reasonId))

            /**
             * Sets [Builder.reasonId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reasonId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reasonId(reasonId: JsonField<String>) = apply { this.reasonId = reasonId }

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
             * .accountingProductId()
             * .amount()
             * .description()
             * .productId()
             * .referencedBillId()
             * .referencedLineItemId()
             * .servicePeriodEndDate()
             * .servicePeriodStartDate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("accountingProductId", accountingProductId),
                    checkRequired("amount", amount),
                    checkRequired("description", description),
                    checkRequired("productId", productId),
                    checkRequired("referencedBillId", referencedBillId),
                    checkRequired("referencedLineItemId", referencedLineItemId),
                    checkRequired("servicePeriodEndDate", servicePeriodEndDate),
                    checkRequired("servicePeriodStartDate", servicePeriodStartDate),
                    amountToApplyOnBill,
                    creditReasonId,
                    lineItemType,
                    reasonId,
                    version,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accountingProductId()
            amount()
            description()
            productId()
            referencedBillId()
            referencedLineItemId()
            servicePeriodEndDate()
            servicePeriodStartDate()
            amountToApplyOnBill()
            creditReasonId()
            lineItemType().ifPresent { it.validate() }
            reasonId()
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
            (if (accountingProductId.asKnown().isPresent) 1 else 0) +
                (if (amount.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (productId.asKnown().isPresent) 1 else 0) +
                (if (referencedBillId.asKnown().isPresent) 1 else 0) +
                (if (referencedLineItemId.asKnown().isPresent) 1 else 0) +
                (if (servicePeriodEndDate.asKnown().isPresent) 1 else 0) +
                (if (servicePeriodStartDate.asKnown().isPresent) 1 else 0) +
                (if (amountToApplyOnBill.asKnown().isPresent) 1 else 0) +
                (if (creditReasonId.asKnown().isPresent) 1 else 0) +
                (lineItemType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (reasonId.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                accountingProductId == other.accountingProductId &&
                amount == other.amount &&
                description == other.description &&
                productId == other.productId &&
                referencedBillId == other.referencedBillId &&
                referencedLineItemId == other.referencedLineItemId &&
                servicePeriodEndDate == other.servicePeriodEndDate &&
                servicePeriodStartDate == other.servicePeriodStartDate &&
                amountToApplyOnBill == other.amountToApplyOnBill &&
                creditReasonId == other.creditReasonId &&
                lineItemType == other.lineItemType &&
                reasonId == other.reasonId &&
                version == other.version &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountingProductId,
                amount,
                description,
                productId,
                referencedBillId,
                referencedLineItemId,
                servicePeriodEndDate,
                servicePeriodStartDate,
                amountToApplyOnBill,
                creditReasonId,
                lineItemType,
                reasonId,
                version,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountingProductId=$accountingProductId, amount=$amount, description=$description, productId=$productId, referencedBillId=$referencedBillId, referencedLineItemId=$referencedLineItemId, servicePeriodEndDate=$servicePeriodEndDate, servicePeriodStartDate=$servicePeriodStartDate, amountToApplyOnBill=$amountToApplyOnBill, creditReasonId=$creditReasonId, lineItemType=$lineItemType, reasonId=$reasonId, version=$version, additionalProperties=$additionalProperties}"
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

            @JvmField val AD_HOC = of("AD_HOC")

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
            AD_HOC,
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
            AD_HOC,
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
                AD_HOC -> Value.AD_HOC
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
                AD_HOC -> Known.AD_HOC
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BillCreditLineItemUpdateParams &&
            orgId == other.orgId &&
            billId == other.billId &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(orgId, billId, id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BillCreditLineItemUpdateParams{orgId=$orgId, billId=$billId, id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
