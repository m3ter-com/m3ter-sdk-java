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

/**
 * Create a new Charge.
 *
 * **NOTES:**
 * * To create an ad-hoc Charge on an Account, use the `accountId` request parameter.
 * * To create a balance fee Charge for a Balance, use the `entityId` request parameter to specify
 *   which Balance on an Account the Charge is for.
 * * To define the value of the Charge amount that is billed, you can simply specify an `amount` or
 *   use a number of `units` together with a `unitPrice` for a calculated value = units x unit
 *   price. But you cannot specify *both an amount and units/unit price*.
 */
class ChargeCreateParams
private constructor(
    private val orgId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    /**
     * The ID of the Account the Charge is being created for.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = body.accountId()

    /**
     * Unique short code for the Charge.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun code(): String = body.code()

    /**
     * Charge currency.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = body.currency()

    /**
     * The entity type the Charge has been created for.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entityType(): EntityType = body.entityType()

    /**
     * Available line item types that can be used for billing a Charge.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lineItemType(): LineItemType = body.lineItemType()

    /**
     * Name of the Charge. Added to the Bill line item description for this Charge.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * The service period end date (*in ISO-8601 format*)for the Charge.
     *
     * **NOTE:** End date is exclusive.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun servicePeriodEndDate(): OffsetDateTime = body.servicePeriodEndDate()

    /**
     * The service period start date (*in ISO-8601 format*) for the Charge.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun servicePeriodStartDate(): OffsetDateTime = body.servicePeriodStartDate()

    /**
     * The Accounting Product ID assigned to the Charge.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountingProductId(): Optional<String> = body.accountingProductId()

    /**
     * Amount of the Charge. If `amount` is provided, then `units` and `unitPrice` must be omitted.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amount(): Optional<Double> = body.amount()

    /**
     * The date when the Charge will be added to a Bill.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billDate(): Optional<String> = body.billDate()

    /**
     * The ID of a Contract on the Account that the Charge will be added to.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contractId(): Optional<String> = body.contractId()

    /**
     * The description added to the Bill line item for the Charge.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * The ID of the Charge linked entity. For example, the ID of an Account Balance if a Balance
     * Charge.
     *
     * **NOTE:** If `entityType` is `BALANCE`, you must provide the `entityId` of the Balance the
     * Charge is for.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entityId(): Optional<String> = body.entityId()

    /**
     * Used to enter information about the Charge for accounting purposes, such as the reason it was
     * created. This information will not be added to a Bill line item for the Charge.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun notes(): Optional<String> = body.notes()

    /**
     * Unit price. If `amount` is omitted, then provide together with `units`. When `amount` is
     * provided, `unitPrice` must be omitted.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unitPrice(): Optional<Double> = body.unitPrice()

    /**
     * Number of units of the Charge. If `amount` is omitted, then provide together with
     * `unitPrice`. When `amount` is provided, `units` must be omitted.
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
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountId(): JsonField<String> = body._accountId()

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
     * Returns the raw JSON value of [entityType].
     *
     * Unlike [entityType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _entityType(): JsonField<EntityType> = body._entityType()

    /**
     * Returns the raw JSON value of [lineItemType].
     *
     * Unlike [lineItemType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _lineItemType(): JsonField<LineItemType> = body._lineItemType()

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
     * Returns the raw JSON value of [billDate].
     *
     * Unlike [billDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billDate(): JsonField<String> = body._billDate()

    /**
     * Returns the raw JSON value of [contractId].
     *
     * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contractId(): JsonField<String> = body._contractId()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [entityId].
     *
     * Unlike [entityId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _entityId(): JsonField<String> = body._entityId()

    /**
     * Returns the raw JSON value of [notes].
     *
     * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _notes(): JsonField<String> = body._notes()

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
         * Returns a mutable builder for constructing an instance of [ChargeCreateParams].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .code()
         * .currency()
         * .entityType()
         * .lineItemType()
         * .name()
         * .servicePeriodEndDate()
         * .servicePeriodStartDate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChargeCreateParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(chargeCreateParams: ChargeCreateParams) = apply {
            orgId = chargeCreateParams.orgId
            body = chargeCreateParams.body.toBuilder()
            additionalHeaders = chargeCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = chargeCreateParams.additionalQueryParams.toBuilder()
        }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accountId]
         * - [code]
         * - [currency]
         * - [entityType]
         * - [lineItemType]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The ID of the Account the Charge is being created for. */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { body.accountId(accountId) }

        /** Unique short code for the Charge. */
        fun code(code: String) = apply { body.code(code) }

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { body.code(code) }

        /** Charge currency. */
        fun currency(currency: String) = apply { body.currency(currency) }

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { body.currency(currency) }

        /** The entity type the Charge has been created for. */
        fun entityType(entityType: EntityType) = apply { body.entityType(entityType) }

        /**
         * Sets [Builder.entityType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityType] with a well-typed [EntityType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun entityType(entityType: JsonField<EntityType>) = apply { body.entityType(entityType) }

        /** Available line item types that can be used for billing a Charge. */
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

        /** Name of the Charge. Added to the Bill line item description for this Charge. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * The service period end date (*in ISO-8601 format*)for the Charge.
         *
         * **NOTE:** End date is exclusive.
         */
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

        /** The service period start date (*in ISO-8601 format*) for the Charge. */
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

        /** The Accounting Product ID assigned to the Charge. */
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

        /**
         * Amount of the Charge. If `amount` is provided, then `units` and `unitPrice` must be
         * omitted.
         */
        fun amount(amount: Double) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Double>) = apply { body.amount(amount) }

        /** The date when the Charge will be added to a Bill. */
        fun billDate(billDate: String) = apply { body.billDate(billDate) }

        /**
         * Sets [Builder.billDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billDate] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun billDate(billDate: JsonField<String>) = apply { body.billDate(billDate) }

        /** The ID of a Contract on the Account that the Charge will be added to. */
        fun contractId(contractId: String) = apply { body.contractId(contractId) }

        /**
         * Sets [Builder.contractId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contractId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contractId(contractId: JsonField<String>) = apply { body.contractId(contractId) }

        /** The description added to the Bill line item for the Charge. */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * The ID of the Charge linked entity. For example, the ID of an Account Balance if a
         * Balance Charge.
         *
         * **NOTE:** If `entityType` is `BALANCE`, you must provide the `entityId` of the Balance
         * the Charge is for.
         */
        fun entityId(entityId: String) = apply { body.entityId(entityId) }

        /**
         * Sets [Builder.entityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun entityId(entityId: JsonField<String>) = apply { body.entityId(entityId) }

        /**
         * Used to enter information about the Charge for accounting purposes, such as the reason it
         * was created. This information will not be added to a Bill line item for the Charge.
         */
        fun notes(notes: String) = apply { body.notes(notes) }

        /**
         * Sets [Builder.notes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notes] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun notes(notes: JsonField<String>) = apply { body.notes(notes) }

        /**
         * Unit price. If `amount` is omitted, then provide together with `units`. When `amount` is
         * provided, `unitPrice` must be omitted.
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
         * Number of units of the Charge. If `amount` is omitted, then provide together with
         * `unitPrice`. When `amount` is provided, `units` must be omitted.
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
         * Returns an immutable instance of [ChargeCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .code()
         * .currency()
         * .entityType()
         * .lineItemType()
         * .name()
         * .servicePeriodEndDate()
         * .servicePeriodStartDate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChargeCreateParams =
            ChargeCreateParams(
                orgId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request containing a Charge entity */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountId: JsonField<String>,
        private val code: JsonField<String>,
        private val currency: JsonField<String>,
        private val entityType: JsonField<EntityType>,
        private val lineItemType: JsonField<LineItemType>,
        private val name: JsonField<String>,
        private val servicePeriodEndDate: JsonField<OffsetDateTime>,
        private val servicePeriodStartDate: JsonField<OffsetDateTime>,
        private val accountingProductId: JsonField<String>,
        private val amount: JsonField<Double>,
        private val billDate: JsonField<String>,
        private val contractId: JsonField<String>,
        private val description: JsonField<String>,
        private val entityId: JsonField<String>,
        private val notes: JsonField<String>,
        private val unitPrice: JsonField<Double>,
        private val units: JsonField<Double>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountId")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("entityType")
            @ExcludeMissing
            entityType: JsonField<EntityType> = JsonMissing.of(),
            @JsonProperty("lineItemType")
            @ExcludeMissing
            lineItemType: JsonField<LineItemType> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("servicePeriodEndDate")
            @ExcludeMissing
            servicePeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("servicePeriodStartDate")
            @ExcludeMissing
            servicePeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("accountingProductId")
            @ExcludeMissing
            accountingProductId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("billDate")
            @ExcludeMissing
            billDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contractId")
            @ExcludeMissing
            contractId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("entityId")
            @ExcludeMissing
            entityId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("unitPrice")
            @ExcludeMissing
            unitPrice: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("units") @ExcludeMissing units: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(
            accountId,
            code,
            currency,
            entityType,
            lineItemType,
            name,
            servicePeriodEndDate,
            servicePeriodStartDate,
            accountingProductId,
            amount,
            billDate,
            contractId,
            description,
            entityId,
            notes,
            unitPrice,
            units,
            version,
            mutableMapOf(),
        )

        /**
         * The ID of the Account the Charge is being created for.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("accountId")

        /**
         * Unique short code for the Charge.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun code(): String = code.getRequired("code")

        /**
         * Charge currency.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * The entity type the Charge has been created for.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entityType(): EntityType = entityType.getRequired("entityType")

        /**
         * Available line item types that can be used for billing a Charge.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lineItemType(): LineItemType = lineItemType.getRequired("lineItemType")

        /**
         * Name of the Charge. Added to the Bill line item description for this Charge.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The service period end date (*in ISO-8601 format*)for the Charge.
         *
         * **NOTE:** End date is exclusive.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun servicePeriodEndDate(): OffsetDateTime =
            servicePeriodEndDate.getRequired("servicePeriodEndDate")

        /**
         * The service period start date (*in ISO-8601 format*) for the Charge.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun servicePeriodStartDate(): OffsetDateTime =
            servicePeriodStartDate.getRequired("servicePeriodStartDate")

        /**
         * The Accounting Product ID assigned to the Charge.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountingProductId(): Optional<String> =
            accountingProductId.getOptional("accountingProductId")

        /**
         * Amount of the Charge. If `amount` is provided, then `units` and `unitPrice` must be
         * omitted.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amount(): Optional<Double> = amount.getOptional("amount")

        /**
         * The date when the Charge will be added to a Bill.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billDate(): Optional<String> = billDate.getOptional("billDate")

        /**
         * The ID of a Contract on the Account that the Charge will be added to.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contractId(): Optional<String> = contractId.getOptional("contractId")

        /**
         * The description added to the Bill line item for the Charge.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * The ID of the Charge linked entity. For example, the ID of an Account Balance if a
         * Balance Charge.
         *
         * **NOTE:** If `entityType` is `BALANCE`, you must provide the `entityId` of the Balance
         * the Charge is for.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun entityId(): Optional<String> = entityId.getOptional("entityId")

        /**
         * Used to enter information about the Charge for accounting purposes, such as the reason it
         * was created. This information will not be added to a Bill line item for the Charge.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun notes(): Optional<String> = notes.getOptional("notes")

        /**
         * Unit price. If `amount` is omitted, then provide together with `units`. When `amount` is
         * provided, `unitPrice` must be omitted.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun unitPrice(): Optional<Double> = unitPrice.getOptional("unitPrice")

        /**
         * Number of units of the Charge. If `amount` is omitted, then provide together with
         * `unitPrice`. When `amount` is provided, `units` must be omitted.
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
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

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
         * Returns the raw JSON value of [entityType].
         *
         * Unlike [entityType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entityType")
        @ExcludeMissing
        fun _entityType(): JsonField<EntityType> = entityType

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
         * Returns the raw JSON value of [billDate].
         *
         * Unlike [billDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("billDate") @ExcludeMissing fun _billDate(): JsonField<String> = billDate

        /**
         * Returns the raw JSON value of [contractId].
         *
         * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contractId")
        @ExcludeMissing
        fun _contractId(): JsonField<String> = contractId

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [entityId].
         *
         * Unlike [entityId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entityId") @ExcludeMissing fun _entityId(): JsonField<String> = entityId

        /**
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

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
             * .accountId()
             * .code()
             * .currency()
             * .entityType()
             * .lineItemType()
             * .name()
             * .servicePeriodEndDate()
             * .servicePeriodStartDate()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var code: JsonField<String>? = null
            private var currency: JsonField<String>? = null
            private var entityType: JsonField<EntityType>? = null
            private var lineItemType: JsonField<LineItemType>? = null
            private var name: JsonField<String>? = null
            private var servicePeriodEndDate: JsonField<OffsetDateTime>? = null
            private var servicePeriodStartDate: JsonField<OffsetDateTime>? = null
            private var accountingProductId: JsonField<String> = JsonMissing.of()
            private var amount: JsonField<Double> = JsonMissing.of()
            private var billDate: JsonField<String> = JsonMissing.of()
            private var contractId: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var entityId: JsonField<String> = JsonMissing.of()
            private var notes: JsonField<String> = JsonMissing.of()
            private var unitPrice: JsonField<Double> = JsonMissing.of()
            private var units: JsonField<Double> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountId = body.accountId
                code = body.code
                currency = body.currency
                entityType = body.entityType
                lineItemType = body.lineItemType
                name = body.name
                servicePeriodEndDate = body.servicePeriodEndDate
                servicePeriodStartDate = body.servicePeriodStartDate
                accountingProductId = body.accountingProductId
                amount = body.amount
                billDate = body.billDate
                contractId = body.contractId
                description = body.description
                entityId = body.entityId
                notes = body.notes
                unitPrice = body.unitPrice
                units = body.units
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The ID of the Account the Charge is being created for. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** Unique short code for the Charge. */
            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /** Charge currency. */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** The entity type the Charge has been created for. */
            fun entityType(entityType: EntityType) = entityType(JsonField.of(entityType))

            /**
             * Sets [Builder.entityType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entityType] with a well-typed [EntityType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entityType(entityType: JsonField<EntityType>) = apply {
                this.entityType = entityType
            }

            /** Available line item types that can be used for billing a Charge. */
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

            /** Name of the Charge. Added to the Bill line item description for this Charge. */
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
             * The service period end date (*in ISO-8601 format*)for the Charge.
             *
             * **NOTE:** End date is exclusive.
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

            /** The service period start date (*in ISO-8601 format*) for the Charge. */
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

            /** The Accounting Product ID assigned to the Charge. */
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

            /**
             * Amount of the Charge. If `amount` is provided, then `units` and `unitPrice` must be
             * omitted.
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

            /** The date when the Charge will be added to a Bill. */
            fun billDate(billDate: String) = billDate(JsonField.of(billDate))

            /**
             * Sets [Builder.billDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billDate] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billDate(billDate: JsonField<String>) = apply { this.billDate = billDate }

            /** The ID of a Contract on the Account that the Charge will be added to. */
            fun contractId(contractId: String) = contractId(JsonField.of(contractId))

            /**
             * Sets [Builder.contractId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contractId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

            /** The description added to the Bill line item for the Charge. */
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

            /**
             * The ID of the Charge linked entity. For example, the ID of an Account Balance if a
             * Balance Charge.
             *
             * **NOTE:** If `entityType` is `BALANCE`, you must provide the `entityId` of the
             * Balance the Charge is for.
             */
            fun entityId(entityId: String) = entityId(JsonField.of(entityId))

            /**
             * Sets [Builder.entityId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entityId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

            /**
             * Used to enter information about the Charge for accounting purposes, such as the
             * reason it was created. This information will not be added to a Bill line item for the
             * Charge.
             */
            fun notes(notes: String) = notes(JsonField.of(notes))

            /**
             * Sets [Builder.notes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

            /**
             * Unit price. If `amount` is omitted, then provide together with `units`. When `amount`
             * is provided, `unitPrice` must be omitted.
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
             * Number of units of the Charge. If `amount` is omitted, then provide together with
             * `unitPrice`. When `amount` is provided, `units` must be omitted.
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
             * .accountId()
             * .code()
             * .currency()
             * .entityType()
             * .lineItemType()
             * .name()
             * .servicePeriodEndDate()
             * .servicePeriodStartDate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("accountId", accountId),
                    checkRequired("code", code),
                    checkRequired("currency", currency),
                    checkRequired("entityType", entityType),
                    checkRequired("lineItemType", lineItemType),
                    checkRequired("name", name),
                    checkRequired("servicePeriodEndDate", servicePeriodEndDate),
                    checkRequired("servicePeriodStartDate", servicePeriodStartDate),
                    accountingProductId,
                    amount,
                    billDate,
                    contractId,
                    description,
                    entityId,
                    notes,
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

            accountId()
            code()
            currency()
            entityType().validate()
            lineItemType().validate()
            name()
            servicePeriodEndDate()
            servicePeriodStartDate()
            accountingProductId()
            amount()
            billDate()
            contractId()
            description()
            entityId()
            notes()
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
            (if (accountId.asKnown().isPresent) 1 else 0) +
                (if (code.asKnown().isPresent) 1 else 0) +
                (if (currency.asKnown().isPresent) 1 else 0) +
                (entityType.asKnown().getOrNull()?.validity() ?: 0) +
                (lineItemType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (servicePeriodEndDate.asKnown().isPresent) 1 else 0) +
                (if (servicePeriodStartDate.asKnown().isPresent) 1 else 0) +
                (if (accountingProductId.asKnown().isPresent) 1 else 0) +
                (if (amount.asKnown().isPresent) 1 else 0) +
                (if (billDate.asKnown().isPresent) 1 else 0) +
                (if (contractId.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (entityId.asKnown().isPresent) 1 else 0) +
                (if (notes.asKnown().isPresent) 1 else 0) +
                (if (unitPrice.asKnown().isPresent) 1 else 0) +
                (if (units.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                accountId == other.accountId &&
                code == other.code &&
                currency == other.currency &&
                entityType == other.entityType &&
                lineItemType == other.lineItemType &&
                name == other.name &&
                servicePeriodEndDate == other.servicePeriodEndDate &&
                servicePeriodStartDate == other.servicePeriodStartDate &&
                accountingProductId == other.accountingProductId &&
                amount == other.amount &&
                billDate == other.billDate &&
                contractId == other.contractId &&
                description == other.description &&
                entityId == other.entityId &&
                notes == other.notes &&
                unitPrice == other.unitPrice &&
                units == other.units &&
                version == other.version &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountId,
                code,
                currency,
                entityType,
                lineItemType,
                name,
                servicePeriodEndDate,
                servicePeriodStartDate,
                accountingProductId,
                amount,
                billDate,
                contractId,
                description,
                entityId,
                notes,
                unitPrice,
                units,
                version,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountId=$accountId, code=$code, currency=$currency, entityType=$entityType, lineItemType=$lineItemType, name=$name, servicePeriodEndDate=$servicePeriodEndDate, servicePeriodStartDate=$servicePeriodStartDate, accountingProductId=$accountingProductId, amount=$amount, billDate=$billDate, contractId=$contractId, description=$description, entityId=$entityId, notes=$notes, unitPrice=$unitPrice, units=$units, version=$version, additionalProperties=$additionalProperties}"
    }

    /** The entity type the Charge has been created for. */
    class EntityType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AD_HOC = of("AD_HOC")

            @JvmField val BALANCE = of("BALANCE")

            @JvmStatic fun of(value: String) = EntityType(JsonField.of(value))
        }

        /** An enum containing [EntityType]'s known values. */
        enum class Known {
            AD_HOC,
            BALANCE,
        }

        /**
         * An enum containing [EntityType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EntityType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AD_HOC,
            BALANCE,
            /**
             * An enum member indicating that [EntityType] was instantiated with an unknown value.
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
                AD_HOC -> Value.AD_HOC
                BALANCE -> Value.BALANCE
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
                AD_HOC -> Known.AD_HOC
                BALANCE -> Known.BALANCE
                else -> throw M3terInvalidDataException("Unknown EntityType: $value")
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

        fun validate(): EntityType = apply {
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

            return other is EntityType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Available line item types that can be used for billing a Charge. */
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

            @JvmField val BALANCE_FEE = of("BALANCE_FEE")

            @JvmField val AD_HOC = of("AD_HOC")

            @JvmStatic fun of(value: String) = LineItemType(JsonField.of(value))
        }

        /** An enum containing [LineItemType]'s known values. */
        enum class Known {
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

        return other is ChargeCreateParams &&
            orgId == other.orgId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(orgId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ChargeCreateParams{orgId=$orgId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
