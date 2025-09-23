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
import com.m3ter.core.checkKnown
import com.m3ter.core.checkRequired
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update a specific Balance.
 *
 * This endpoint allows you to update the details of a specific Balance. The updated Balance details
 * should be provided in the request body.
 */
class BalanceUpdateParams
private constructor(
    private val orgId: String?,
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * The unique identifier (UUID) for the end customer Account.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = body.accountId()

    /**
     * The currency code used for the Balance amount. For example: USD, GBP or EUR.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = body.currency()

    /**
     * The date *(in ISO 8601 format)* after which the Balance will no longer be active for the
     * Account.
     *
     * **Note:** You can use the `rolloverEndDate` request parameter to define an extended grace
     * period for continued draw-down against the Balance if any amount remains when the specified
     * `endDate` is reached.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endDate(): OffsetDateTime = body.endDate()

    /**
     * The date *(in ISO 8601 format)* when the Balance becomes active.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startDate(): OffsetDateTime = body.startDate()

    /**
     * A description for the bill line items for draw-down charges against the Balance.
     * *(Optional).*
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun balanceDrawDownDescription(): Optional<String> = body.balanceDrawDownDescription()

    /**
     * Unique short code for the Balance.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun code(): Optional<String> = body.code()

    /**
     * Optional Product ID this Balance Consumptions should be attributed to for accounting purposes
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun consumptionsAccountingProductId(): Optional<String> = body.consumptionsAccountingProductId()

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contractId(): Optional<String> = body.contractId()

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
    fun customFields(): Optional<CustomFields> = body.customFields()

    /**
     * A description of the Balance.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * Optional Product ID this Balance Fees should be attributed to for accounting purposes
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun feesAccountingProductId(): Optional<String> = body.feesAccountingProductId()

    /**
     * Specify the line item charge types that can draw-down at billing against the Balance amount.
     * Options are:
     * - `"MINIMUM_SPEND"`
     * - `"STANDING_CHARGE"`
     * - `"USAGE"`
     * - `"COUNTER_RUNNING_TOTAL_CHARGE"`
     * - `"COUNTER_ADJUSTMENT_DEBIT"`
     *
     * **NOTE:** If no charge types are specified, by default *all types* can draw-down against the
     * Balance amount at billing.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lineItemTypes(): Optional<List<LineItemType>> = body.lineItemTypes()

    /**
     * The official name for the Balance.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * A description for Bill line items overage charges.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overageDescription(): Optional<String> = body.overageDescription()

    /**
     * Define a surcharge level, as a percentage of regular usage rating, applied to overages
     * *(usage charges that exceed the Balance amount)*. For example, if the regular usage rate is
     * $10 per unit of usage consumed and `overageSurchargePercent` is set at 10%, then any usage
     * charged above the original Balance amount is charged at $11 per unit of usage.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overageSurchargePercent(): Optional<Double> = body.overageSurchargePercent()

    /**
     * Specify the Products whose consumption charges due at billing can be drawn-down against the
     * Balance amount.
     *
     * **Note:** If you don't specify any Products for Balance draw-down, by default the consumption
     * charges for any Product the Account consumes will be drawn-down against the Balance amount.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun productIds(): Optional<List<String>> = body.productIds()

    /**
     * The maximum amount that can be carried over past the Balance end date for draw-down at
     * billing if there is any unused Balance amount when the end date is reached. Works with
     * `rolloverEndDate` to define the amount and duration of a Balance "grace period". *(Optional)*
     *
     * **Notes:**
     * - If you leave `rolloverAmount` empty and only enter a `rolloverEndDate`, any amount left
     *   over after the Balance end date is reached will be drawn-down against up to the specified
     *   `rolloverEndDate`.
     * - You must enter a `rolloverEndDate`. If you only enter a `rolloverAmount` without entering a
     *   `rolloverEndDate`, you'll receive an error when trying to create or update the Balance.
     * - If you don't want to grant any grace period for outstanding Balance amounts, then do not
     *   use `rolloverAmount` and `rolloverEndDate`.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rolloverAmount(): Optional<Double> = body.rolloverAmount()

    /**
     * The end date *(in ISO 8601 format)* for the grace period during which unused Balance amounts
     * can be carried over and drawn-down against at billing.
     *
     * **Note:** Use `rolloverAmount` if you want to specify a maximum amount that can be carried
     * over and made available for draw-down.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rolloverEndDate(): Optional<OffsetDateTime> = body.rolloverEndDate()

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
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currency(): JsonField<String> = body._currency()

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endDate(): JsonField<OffsetDateTime> = body._endDate()

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startDate(): JsonField<OffsetDateTime> = body._startDate()

    /**
     * Returns the raw JSON value of [balanceDrawDownDescription].
     *
     * Unlike [balanceDrawDownDescription], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _balanceDrawDownDescription(): JsonField<String> = body._balanceDrawDownDescription()

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _code(): JsonField<String> = body._code()

    /**
     * Returns the raw JSON value of [consumptionsAccountingProductId].
     *
     * Unlike [consumptionsAccountingProductId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _consumptionsAccountingProductId(): JsonField<String> =
        body._consumptionsAccountingProductId()

    /**
     * Returns the raw JSON value of [contractId].
     *
     * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contractId(): JsonField<String> = body._contractId()

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customFields(): JsonField<CustomFields> = body._customFields()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [feesAccountingProductId].
     *
     * Unlike [feesAccountingProductId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _feesAccountingProductId(): JsonField<String> = body._feesAccountingProductId()

    /**
     * Returns the raw JSON value of [lineItemTypes].
     *
     * Unlike [lineItemTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _lineItemTypes(): JsonField<List<LineItemType>> = body._lineItemTypes()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [overageDescription].
     *
     * Unlike [overageDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _overageDescription(): JsonField<String> = body._overageDescription()

    /**
     * Returns the raw JSON value of [overageSurchargePercent].
     *
     * Unlike [overageSurchargePercent], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _overageSurchargePercent(): JsonField<Double> = body._overageSurchargePercent()

    /**
     * Returns the raw JSON value of [productIds].
     *
     * Unlike [productIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _productIds(): JsonField<List<String>> = body._productIds()

    /**
     * Returns the raw JSON value of [rolloverAmount].
     *
     * Unlike [rolloverAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rolloverAmount(): JsonField<Double> = body._rolloverAmount()

    /**
     * Returns the raw JSON value of [rolloverEndDate].
     *
     * Unlike [rolloverEndDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rolloverEndDate(): JsonField<OffsetDateTime> = body._rolloverEndDate()

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
         * Returns a mutable builder for constructing an instance of [BalanceUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .currency()
         * .endDate()
         * .startDate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BalanceUpdateParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(balanceUpdateParams: BalanceUpdateParams) = apply {
            orgId = balanceUpdateParams.orgId
            id = balanceUpdateParams.id
            body = balanceUpdateParams.body.toBuilder()
            additionalHeaders = balanceUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = balanceUpdateParams.additionalQueryParams.toBuilder()
        }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accountId]
         * - [currency]
         * - [endDate]
         * - [startDate]
         * - [balanceDrawDownDescription]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The unique identifier (UUID) for the end customer Account. */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { body.accountId(accountId) }

        /** The currency code used for the Balance amount. For example: USD, GBP or EUR. */
        fun currency(currency: String) = apply { body.currency(currency) }

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { body.currency(currency) }

        /**
         * The date *(in ISO 8601 format)* after which the Balance will no longer be active for the
         * Account.
         *
         * **Note:** You can use the `rolloverEndDate` request parameter to define an extended grace
         * period for continued draw-down against the Balance if any amount remains when the
         * specified `endDate` is reached.
         */
        fun endDate(endDate: OffsetDateTime) = apply { body.endDate(endDate) }

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { body.endDate(endDate) }

        /** The date *(in ISO 8601 format)* when the Balance becomes active. */
        fun startDate(startDate: OffsetDateTime) = apply { body.startDate(startDate) }

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { body.startDate(startDate) }

        /**
         * A description for the bill line items for draw-down charges against the Balance.
         * *(Optional).*
         */
        fun balanceDrawDownDescription(balanceDrawDownDescription: String) = apply {
            body.balanceDrawDownDescription(balanceDrawDownDescription)
        }

        /**
         * Sets [Builder.balanceDrawDownDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.balanceDrawDownDescription] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun balanceDrawDownDescription(balanceDrawDownDescription: JsonField<String>) = apply {
            body.balanceDrawDownDescription(balanceDrawDownDescription)
        }

        /** Unique short code for the Balance. */
        fun code(code: String) = apply { body.code(code) }

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { body.code(code) }

        /**
         * Optional Product ID this Balance Consumptions should be attributed to for accounting
         * purposes
         */
        fun consumptionsAccountingProductId(consumptionsAccountingProductId: String) = apply {
            body.consumptionsAccountingProductId(consumptionsAccountingProductId)
        }

        /**
         * Sets [Builder.consumptionsAccountingProductId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.consumptionsAccountingProductId] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun consumptionsAccountingProductId(consumptionsAccountingProductId: JsonField<String>) =
            apply {
                body.consumptionsAccountingProductId(consumptionsAccountingProductId)
            }

        fun contractId(contractId: String) = apply { body.contractId(contractId) }

        /**
         * Sets [Builder.contractId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contractId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contractId(contractId: JsonField<String>) = apply { body.contractId(contractId) }

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
        fun customFields(customFields: CustomFields) = apply { body.customFields(customFields) }

        /**
         * Sets [Builder.customFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            body.customFields(customFields)
        }

        /** A description of the Balance. */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** Optional Product ID this Balance Fees should be attributed to for accounting purposes */
        fun feesAccountingProductId(feesAccountingProductId: String) = apply {
            body.feesAccountingProductId(feesAccountingProductId)
        }

        /**
         * Sets [Builder.feesAccountingProductId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feesAccountingProductId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun feesAccountingProductId(feesAccountingProductId: JsonField<String>) = apply {
            body.feesAccountingProductId(feesAccountingProductId)
        }

        /**
         * Specify the line item charge types that can draw-down at billing against the Balance
         * amount. Options are:
         * - `"MINIMUM_SPEND"`
         * - `"STANDING_CHARGE"`
         * - `"USAGE"`
         * - `"COUNTER_RUNNING_TOTAL_CHARGE"`
         * - `"COUNTER_ADJUSTMENT_DEBIT"`
         *
         * **NOTE:** If no charge types are specified, by default *all types* can draw-down against
         * the Balance amount at billing.
         */
        fun lineItemTypes(lineItemTypes: List<LineItemType>) = apply {
            body.lineItemTypes(lineItemTypes)
        }

        /**
         * Sets [Builder.lineItemTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lineItemTypes] with a well-typed `List<LineItemType>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lineItemTypes(lineItemTypes: JsonField<List<LineItemType>>) = apply {
            body.lineItemTypes(lineItemTypes)
        }

        /**
         * Adds a single [LineItemType] to [lineItemTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLineItemType(lineItemType: LineItemType) = apply {
            body.addLineItemType(lineItemType)
        }

        /** The official name for the Balance. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** A description for Bill line items overage charges. */
        fun overageDescription(overageDescription: String) = apply {
            body.overageDescription(overageDescription)
        }

        /**
         * Sets [Builder.overageDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overageDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun overageDescription(overageDescription: JsonField<String>) = apply {
            body.overageDescription(overageDescription)
        }

        /**
         * Define a surcharge level, as a percentage of regular usage rating, applied to overages
         * *(usage charges that exceed the Balance amount)*. For example, if the regular usage rate
         * is $10 per unit of usage consumed and `overageSurchargePercent` is set at 10%, then any
         * usage charged above the original Balance amount is charged at $11 per unit of usage.
         */
        fun overageSurchargePercent(overageSurchargePercent: Double) = apply {
            body.overageSurchargePercent(overageSurchargePercent)
        }

        /**
         * Sets [Builder.overageSurchargePercent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overageSurchargePercent] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun overageSurchargePercent(overageSurchargePercent: JsonField<Double>) = apply {
            body.overageSurchargePercent(overageSurchargePercent)
        }

        /**
         * Specify the Products whose consumption charges due at billing can be drawn-down against
         * the Balance amount.
         *
         * **Note:** If you don't specify any Products for Balance draw-down, by default the
         * consumption charges for any Product the Account consumes will be drawn-down against the
         * Balance amount.
         */
        fun productIds(productIds: List<String>) = apply { body.productIds(productIds) }

        /**
         * Sets [Builder.productIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun productIds(productIds: JsonField<List<String>>) = apply { body.productIds(productIds) }

        /**
         * Adds a single [String] to [productIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProductId(productId: String) = apply { body.addProductId(productId) }

        /**
         * The maximum amount that can be carried over past the Balance end date for draw-down at
         * billing if there is any unused Balance amount when the end date is reached. Works with
         * `rolloverEndDate` to define the amount and duration of a Balance "grace period".
         * *(Optional)*
         *
         * **Notes:**
         * - If you leave `rolloverAmount` empty and only enter a `rolloverEndDate`, any amount left
         *   over after the Balance end date is reached will be drawn-down against up to the
         *   specified `rolloverEndDate`.
         * - You must enter a `rolloverEndDate`. If you only enter a `rolloverAmount` without
         *   entering a `rolloverEndDate`, you'll receive an error when trying to create or update
         *   the Balance.
         * - If you don't want to grant any grace period for outstanding Balance amounts, then do
         *   not use `rolloverAmount` and `rolloverEndDate`.
         */
        fun rolloverAmount(rolloverAmount: Double) = apply { body.rolloverAmount(rolloverAmount) }

        /**
         * Sets [Builder.rolloverAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rolloverAmount] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rolloverAmount(rolloverAmount: JsonField<Double>) = apply {
            body.rolloverAmount(rolloverAmount)
        }

        /**
         * The end date *(in ISO 8601 format)* for the grace period during which unused Balance
         * amounts can be carried over and drawn-down against at billing.
         *
         * **Note:** Use `rolloverAmount` if you want to specify a maximum amount that can be
         * carried over and made available for draw-down.
         */
        fun rolloverEndDate(rolloverEndDate: OffsetDateTime) = apply {
            body.rolloverEndDate(rolloverEndDate)
        }

        /**
         * Sets [Builder.rolloverEndDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rolloverEndDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun rolloverEndDate(rolloverEndDate: JsonField<OffsetDateTime>) = apply {
            body.rolloverEndDate(rolloverEndDate)
        }

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
         * Returns an immutable instance of [BalanceUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .currency()
         * .endDate()
         * .startDate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BalanceUpdateParams =
            BalanceUpdateParams(
                orgId,
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
            1 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val accountId: JsonField<String>,
        private val currency: JsonField<String>,
        private val endDate: JsonField<OffsetDateTime>,
        private val startDate: JsonField<OffsetDateTime>,
        private val balanceDrawDownDescription: JsonField<String>,
        private val code: JsonField<String>,
        private val consumptionsAccountingProductId: JsonField<String>,
        private val contractId: JsonField<String>,
        private val customFields: JsonField<CustomFields>,
        private val description: JsonField<String>,
        private val feesAccountingProductId: JsonField<String>,
        private val lineItemTypes: JsonField<List<LineItemType>>,
        private val name: JsonField<String>,
        private val overageDescription: JsonField<String>,
        private val overageSurchargePercent: JsonField<Double>,
        private val productIds: JsonField<List<String>>,
        private val rolloverAmount: JsonField<Double>,
        private val rolloverEndDate: JsonField<OffsetDateTime>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountId")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("endDate")
            @ExcludeMissing
            endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("startDate")
            @ExcludeMissing
            startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("balanceDrawDownDescription")
            @ExcludeMissing
            balanceDrawDownDescription: JsonField<String> = JsonMissing.of(),
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("consumptionsAccountingProductId")
            @ExcludeMissing
            consumptionsAccountingProductId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contractId")
            @ExcludeMissing
            contractId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customFields")
            @ExcludeMissing
            customFields: JsonField<CustomFields> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("feesAccountingProductId")
            @ExcludeMissing
            feesAccountingProductId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lineItemTypes")
            @ExcludeMissing
            lineItemTypes: JsonField<List<LineItemType>> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("overageDescription")
            @ExcludeMissing
            overageDescription: JsonField<String> = JsonMissing.of(),
            @JsonProperty("overageSurchargePercent")
            @ExcludeMissing
            overageSurchargePercent: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("productIds")
            @ExcludeMissing
            productIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("rolloverAmount")
            @ExcludeMissing
            rolloverAmount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("rolloverEndDate")
            @ExcludeMissing
            rolloverEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(
            accountId,
            currency,
            endDate,
            startDate,
            balanceDrawDownDescription,
            code,
            consumptionsAccountingProductId,
            contractId,
            customFields,
            description,
            feesAccountingProductId,
            lineItemTypes,
            name,
            overageDescription,
            overageSurchargePercent,
            productIds,
            rolloverAmount,
            rolloverEndDate,
            version,
            mutableMapOf(),
        )

        /**
         * The unique identifier (UUID) for the end customer Account.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("accountId")

        /**
         * The currency code used for the Balance amount. For example: USD, GBP or EUR.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * The date *(in ISO 8601 format)* after which the Balance will no longer be active for the
         * Account.
         *
         * **Note:** You can use the `rolloverEndDate` request parameter to define an extended grace
         * period for continued draw-down against the Balance if any amount remains when the
         * specified `endDate` is reached.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endDate(): OffsetDateTime = endDate.getRequired("endDate")

        /**
         * The date *(in ISO 8601 format)* when the Balance becomes active.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startDate(): OffsetDateTime = startDate.getRequired("startDate")

        /**
         * A description for the bill line items for draw-down charges against the Balance.
         * *(Optional).*
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun balanceDrawDownDescription(): Optional<String> =
            balanceDrawDownDescription.getOptional("balanceDrawDownDescription")

        /**
         * Unique short code for the Balance.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun code(): Optional<String> = code.getOptional("code")

        /**
         * Optional Product ID this Balance Consumptions should be attributed to for accounting
         * purposes
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun consumptionsAccountingProductId(): Optional<String> =
            consumptionsAccountingProductId.getOptional("consumptionsAccountingProductId")

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contractId(): Optional<String> = contractId.getOptional("contractId")

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
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customFields(): Optional<CustomFields> = customFields.getOptional("customFields")

        /**
         * A description of the Balance.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Optional Product ID this Balance Fees should be attributed to for accounting purposes
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun feesAccountingProductId(): Optional<String> =
            feesAccountingProductId.getOptional("feesAccountingProductId")

        /**
         * Specify the line item charge types that can draw-down at billing against the Balance
         * amount. Options are:
         * - `"MINIMUM_SPEND"`
         * - `"STANDING_CHARGE"`
         * - `"USAGE"`
         * - `"COUNTER_RUNNING_TOTAL_CHARGE"`
         * - `"COUNTER_ADJUSTMENT_DEBIT"`
         *
         * **NOTE:** If no charge types are specified, by default *all types* can draw-down against
         * the Balance amount at billing.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lineItemTypes(): Optional<List<LineItemType>> =
            lineItemTypes.getOptional("lineItemTypes")

        /**
         * The official name for the Balance.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * A description for Bill line items overage charges.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun overageDescription(): Optional<String> =
            overageDescription.getOptional("overageDescription")

        /**
         * Define a surcharge level, as a percentage of regular usage rating, applied to overages
         * *(usage charges that exceed the Balance amount)*. For example, if the regular usage rate
         * is $10 per unit of usage consumed and `overageSurchargePercent` is set at 10%, then any
         * usage charged above the original Balance amount is charged at $11 per unit of usage.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun overageSurchargePercent(): Optional<Double> =
            overageSurchargePercent.getOptional("overageSurchargePercent")

        /**
         * Specify the Products whose consumption charges due at billing can be drawn-down against
         * the Balance amount.
         *
         * **Note:** If you don't specify any Products for Balance draw-down, by default the
         * consumption charges for any Product the Account consumes will be drawn-down against the
         * Balance amount.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun productIds(): Optional<List<String>> = productIds.getOptional("productIds")

        /**
         * The maximum amount that can be carried over past the Balance end date for draw-down at
         * billing if there is any unused Balance amount when the end date is reached. Works with
         * `rolloverEndDate` to define the amount and duration of a Balance "grace period".
         * *(Optional)*
         *
         * **Notes:**
         * - If you leave `rolloverAmount` empty and only enter a `rolloverEndDate`, any amount left
         *   over after the Balance end date is reached will be drawn-down against up to the
         *   specified `rolloverEndDate`.
         * - You must enter a `rolloverEndDate`. If you only enter a `rolloverAmount` without
         *   entering a `rolloverEndDate`, you'll receive an error when trying to create or update
         *   the Balance.
         * - If you don't want to grant any grace period for outstanding Balance amounts, then do
         *   not use `rolloverAmount` and `rolloverEndDate`.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rolloverAmount(): Optional<Double> = rolloverAmount.getOptional("rolloverAmount")

        /**
         * The end date *(in ISO 8601 format)* for the grace period during which unused Balance
         * amounts can be carried over and drawn-down against at billing.
         *
         * **Note:** Use `rolloverAmount` if you want to specify a maximum amount that can be
         * carried over and made available for draw-down.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rolloverEndDate(): Optional<OffsetDateTime> =
            rolloverEndDate.getOptional("rolloverEndDate")

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
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("startDate")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

        /**
         * Returns the raw JSON value of [balanceDrawDownDescription].
         *
         * Unlike [balanceDrawDownDescription], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("balanceDrawDownDescription")
        @ExcludeMissing
        fun _balanceDrawDownDescription(): JsonField<String> = balanceDrawDownDescription

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [consumptionsAccountingProductId].
         *
         * Unlike [consumptionsAccountingProductId], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("consumptionsAccountingProductId")
        @ExcludeMissing
        fun _consumptionsAccountingProductId(): JsonField<String> = consumptionsAccountingProductId

        /**
         * Returns the raw JSON value of [contractId].
         *
         * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contractId")
        @ExcludeMissing
        fun _contractId(): JsonField<String> = contractId

        /**
         * Returns the raw JSON value of [customFields].
         *
         * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("customFields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [feesAccountingProductId].
         *
         * Unlike [feesAccountingProductId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("feesAccountingProductId")
        @ExcludeMissing
        fun _feesAccountingProductId(): JsonField<String> = feesAccountingProductId

        /**
         * Returns the raw JSON value of [lineItemTypes].
         *
         * Unlike [lineItemTypes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("lineItemTypes")
        @ExcludeMissing
        fun _lineItemTypes(): JsonField<List<LineItemType>> = lineItemTypes

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [overageDescription].
         *
         * Unlike [overageDescription], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("overageDescription")
        @ExcludeMissing
        fun _overageDescription(): JsonField<String> = overageDescription

        /**
         * Returns the raw JSON value of [overageSurchargePercent].
         *
         * Unlike [overageSurchargePercent], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("overageSurchargePercent")
        @ExcludeMissing
        fun _overageSurchargePercent(): JsonField<Double> = overageSurchargePercent

        /**
         * Returns the raw JSON value of [productIds].
         *
         * Unlike [productIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("productIds")
        @ExcludeMissing
        fun _productIds(): JsonField<List<String>> = productIds

        /**
         * Returns the raw JSON value of [rolloverAmount].
         *
         * Unlike [rolloverAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rolloverAmount")
        @ExcludeMissing
        fun _rolloverAmount(): JsonField<Double> = rolloverAmount

        /**
         * Returns the raw JSON value of [rolloverEndDate].
         *
         * Unlike [rolloverEndDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rolloverEndDate")
        @ExcludeMissing
        fun _rolloverEndDate(): JsonField<OffsetDateTime> = rolloverEndDate

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
             * .currency()
             * .endDate()
             * .startDate()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var currency: JsonField<String>? = null
            private var endDate: JsonField<OffsetDateTime>? = null
            private var startDate: JsonField<OffsetDateTime>? = null
            private var balanceDrawDownDescription: JsonField<String> = JsonMissing.of()
            private var code: JsonField<String> = JsonMissing.of()
            private var consumptionsAccountingProductId: JsonField<String> = JsonMissing.of()
            private var contractId: JsonField<String> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var feesAccountingProductId: JsonField<String> = JsonMissing.of()
            private var lineItemTypes: JsonField<MutableList<LineItemType>>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var overageDescription: JsonField<String> = JsonMissing.of()
            private var overageSurchargePercent: JsonField<Double> = JsonMissing.of()
            private var productIds: JsonField<MutableList<String>>? = null
            private var rolloverAmount: JsonField<Double> = JsonMissing.of()
            private var rolloverEndDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountId = body.accountId
                currency = body.currency
                endDate = body.endDate
                startDate = body.startDate
                balanceDrawDownDescription = body.balanceDrawDownDescription
                code = body.code
                consumptionsAccountingProductId = body.consumptionsAccountingProductId
                contractId = body.contractId
                customFields = body.customFields
                description = body.description
                feesAccountingProductId = body.feesAccountingProductId
                lineItemTypes = body.lineItemTypes.map { it.toMutableList() }
                name = body.name
                overageDescription = body.overageDescription
                overageSurchargePercent = body.overageSurchargePercent
                productIds = body.productIds.map { it.toMutableList() }
                rolloverAmount = body.rolloverAmount
                rolloverEndDate = body.rolloverEndDate
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The unique identifier (UUID) for the end customer Account. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The currency code used for the Balance amount. For example: USD, GBP or EUR. */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /**
             * The date *(in ISO 8601 format)* after which the Balance will no longer be active for
             * the Account.
             *
             * **Note:** You can use the `rolloverEndDate` request parameter to define an extended
             * grace period for continued draw-down against the Balance if any amount remains when
             * the specified `endDate` is reached.
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

            /** The date *(in ISO 8601 format)* when the Balance becomes active. */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
            }

            /**
             * A description for the bill line items for draw-down charges against the Balance.
             * *(Optional).*
             */
            fun balanceDrawDownDescription(balanceDrawDownDescription: String) =
                balanceDrawDownDescription(JsonField.of(balanceDrawDownDescription))

            /**
             * Sets [Builder.balanceDrawDownDescription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.balanceDrawDownDescription] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun balanceDrawDownDescription(balanceDrawDownDescription: JsonField<String>) = apply {
                this.balanceDrawDownDescription = balanceDrawDownDescription
            }

            /** Unique short code for the Balance. */
            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /**
             * Optional Product ID this Balance Consumptions should be attributed to for accounting
             * purposes
             */
            fun consumptionsAccountingProductId(consumptionsAccountingProductId: String) =
                consumptionsAccountingProductId(JsonField.of(consumptionsAccountingProductId))

            /**
             * Sets [Builder.consumptionsAccountingProductId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.consumptionsAccountingProductId] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun consumptionsAccountingProductId(
                consumptionsAccountingProductId: JsonField<String>
            ) = apply { this.consumptionsAccountingProductId = consumptionsAccountingProductId }

            fun contractId(contractId: String) = contractId(JsonField.of(contractId))

            /**
             * Sets [Builder.contractId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contractId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

            /**
             * User defined fields enabling you to attach custom data. The value for a custom field
             * can be either a string or a number.
             *
             * If `customFields` can also be defined for this entity at the Organizational level,
             * `customField` values defined at individual level override values of `customFields`
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

            /** A description of the Balance. */
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
             * Optional Product ID this Balance Fees should be attributed to for accounting purposes
             */
            fun feesAccountingProductId(feesAccountingProductId: String) =
                feesAccountingProductId(JsonField.of(feesAccountingProductId))

            /**
             * Sets [Builder.feesAccountingProductId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.feesAccountingProductId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun feesAccountingProductId(feesAccountingProductId: JsonField<String>) = apply {
                this.feesAccountingProductId = feesAccountingProductId
            }

            /**
             * Specify the line item charge types that can draw-down at billing against the Balance
             * amount. Options are:
             * - `"MINIMUM_SPEND"`
             * - `"STANDING_CHARGE"`
             * - `"USAGE"`
             * - `"COUNTER_RUNNING_TOTAL_CHARGE"`
             * - `"COUNTER_ADJUSTMENT_DEBIT"`
             *
             * **NOTE:** If no charge types are specified, by default *all types* can draw-down
             * against the Balance amount at billing.
             */
            fun lineItemTypes(lineItemTypes: List<LineItemType>) =
                lineItemTypes(JsonField.of(lineItemTypes))

            /**
             * Sets [Builder.lineItemTypes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lineItemTypes] with a well-typed
             * `List<LineItemType>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun lineItemTypes(lineItemTypes: JsonField<List<LineItemType>>) = apply {
                this.lineItemTypes = lineItemTypes.map { it.toMutableList() }
            }

            /**
             * Adds a single [LineItemType] to [lineItemTypes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLineItemType(lineItemType: LineItemType) = apply {
                lineItemTypes =
                    (lineItemTypes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("lineItemTypes", it).add(lineItemType)
                    }
            }

            /** The official name for the Balance. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** A description for Bill line items overage charges. */
            fun overageDescription(overageDescription: String) =
                overageDescription(JsonField.of(overageDescription))

            /**
             * Sets [Builder.overageDescription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overageDescription] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun overageDescription(overageDescription: JsonField<String>) = apply {
                this.overageDescription = overageDescription
            }

            /**
             * Define a surcharge level, as a percentage of regular usage rating, applied to
             * overages *(usage charges that exceed the Balance amount)*. For example, if the
             * regular usage rate is $10 per unit of usage consumed and `overageSurchargePercent` is
             * set at 10%, then any usage charged above the original Balance amount is charged at
             * $11 per unit of usage.
             */
            fun overageSurchargePercent(overageSurchargePercent: Double) =
                overageSurchargePercent(JsonField.of(overageSurchargePercent))

            /**
             * Sets [Builder.overageSurchargePercent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overageSurchargePercent] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun overageSurchargePercent(overageSurchargePercent: JsonField<Double>) = apply {
                this.overageSurchargePercent = overageSurchargePercent
            }

            /**
             * Specify the Products whose consumption charges due at billing can be drawn-down
             * against the Balance amount.
             *
             * **Note:** If you don't specify any Products for Balance draw-down, by default the
             * consumption charges for any Product the Account consumes will be drawn-down against
             * the Balance amount.
             */
            fun productIds(productIds: List<String>) = productIds(JsonField.of(productIds))

            /**
             * Sets [Builder.productIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productIds(productIds: JsonField<List<String>>) = apply {
                this.productIds = productIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [productIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addProductId(productId: String) = apply {
                productIds =
                    (productIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("productIds", it).add(productId)
                    }
            }

            /**
             * The maximum amount that can be carried over past the Balance end date for draw-down
             * at billing if there is any unused Balance amount when the end date is reached. Works
             * with `rolloverEndDate` to define the amount and duration of a Balance "grace period".
             * *(Optional)*
             *
             * **Notes:**
             * - If you leave `rolloverAmount` empty and only enter a `rolloverEndDate`, any amount
             *   left over after the Balance end date is reached will be drawn-down against up to
             *   the specified `rolloverEndDate`.
             * - You must enter a `rolloverEndDate`. If you only enter a `rolloverAmount` without
             *   entering a `rolloverEndDate`, you'll receive an error when trying to create or
             *   update the Balance.
             * - If you don't want to grant any grace period for outstanding Balance amounts, then
             *   do not use `rolloverAmount` and `rolloverEndDate`.
             */
            fun rolloverAmount(rolloverAmount: Double) =
                rolloverAmount(JsonField.of(rolloverAmount))

            /**
             * Sets [Builder.rolloverAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rolloverAmount] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rolloverAmount(rolloverAmount: JsonField<Double>) = apply {
                this.rolloverAmount = rolloverAmount
            }

            /**
             * The end date *(in ISO 8601 format)* for the grace period during which unused Balance
             * amounts can be carried over and drawn-down against at billing.
             *
             * **Note:** Use `rolloverAmount` if you want to specify a maximum amount that can be
             * carried over and made available for draw-down.
             */
            fun rolloverEndDate(rolloverEndDate: OffsetDateTime) =
                rolloverEndDate(JsonField.of(rolloverEndDate))

            /**
             * Sets [Builder.rolloverEndDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rolloverEndDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun rolloverEndDate(rolloverEndDate: JsonField<OffsetDateTime>) = apply {
                this.rolloverEndDate = rolloverEndDate
            }

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
             * .currency()
             * .endDate()
             * .startDate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("accountId", accountId),
                    checkRequired("currency", currency),
                    checkRequired("endDate", endDate),
                    checkRequired("startDate", startDate),
                    balanceDrawDownDescription,
                    code,
                    consumptionsAccountingProductId,
                    contractId,
                    customFields,
                    description,
                    feesAccountingProductId,
                    (lineItemTypes ?: JsonMissing.of()).map { it.toImmutable() },
                    name,
                    overageDescription,
                    overageSurchargePercent,
                    (productIds ?: JsonMissing.of()).map { it.toImmutable() },
                    rolloverAmount,
                    rolloverEndDate,
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
            currency()
            endDate()
            startDate()
            balanceDrawDownDescription()
            code()
            consumptionsAccountingProductId()
            contractId()
            customFields().ifPresent { it.validate() }
            description()
            feesAccountingProductId()
            lineItemTypes().ifPresent { it.forEach { it.validate() } }
            name()
            overageDescription()
            overageSurchargePercent()
            productIds()
            rolloverAmount()
            rolloverEndDate()
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
                (if (currency.asKnown().isPresent) 1 else 0) +
                (if (endDate.asKnown().isPresent) 1 else 0) +
                (if (startDate.asKnown().isPresent) 1 else 0) +
                (if (balanceDrawDownDescription.asKnown().isPresent) 1 else 0) +
                (if (code.asKnown().isPresent) 1 else 0) +
                (if (consumptionsAccountingProductId.asKnown().isPresent) 1 else 0) +
                (if (contractId.asKnown().isPresent) 1 else 0) +
                (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (feesAccountingProductId.asKnown().isPresent) 1 else 0) +
                (lineItemTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (overageDescription.asKnown().isPresent) 1 else 0) +
                (if (overageSurchargePercent.asKnown().isPresent) 1 else 0) +
                (productIds.asKnown().getOrNull()?.size ?: 0) +
                (if (rolloverAmount.asKnown().isPresent) 1 else 0) +
                (if (rolloverEndDate.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                accountId == other.accountId &&
                currency == other.currency &&
                endDate == other.endDate &&
                startDate == other.startDate &&
                balanceDrawDownDescription == other.balanceDrawDownDescription &&
                code == other.code &&
                consumptionsAccountingProductId == other.consumptionsAccountingProductId &&
                contractId == other.contractId &&
                customFields == other.customFields &&
                description == other.description &&
                feesAccountingProductId == other.feesAccountingProductId &&
                lineItemTypes == other.lineItemTypes &&
                name == other.name &&
                overageDescription == other.overageDescription &&
                overageSurchargePercent == other.overageSurchargePercent &&
                productIds == other.productIds &&
                rolloverAmount == other.rolloverAmount &&
                rolloverEndDate == other.rolloverEndDate &&
                version == other.version &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountId,
                currency,
                endDate,
                startDate,
                balanceDrawDownDescription,
                code,
                consumptionsAccountingProductId,
                contractId,
                customFields,
                description,
                feesAccountingProductId,
                lineItemTypes,
                name,
                overageDescription,
                overageSurchargePercent,
                productIds,
                rolloverAmount,
                rolloverEndDate,
                version,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountId=$accountId, currency=$currency, endDate=$endDate, startDate=$startDate, balanceDrawDownDescription=$balanceDrawDownDescription, code=$code, consumptionsAccountingProductId=$consumptionsAccountingProductId, contractId=$contractId, customFields=$customFields, description=$description, feesAccountingProductId=$feesAccountingProductId, lineItemTypes=$lineItemTypes, name=$name, overageDescription=$overageDescription, overageSurchargePercent=$overageSurchargePercent, productIds=$productIds, rolloverAmount=$rolloverAmount, rolloverEndDate=$rolloverEndDate, version=$version, additionalProperties=$additionalProperties}"
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

    /** Available line item types for Balances */
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

            @JvmField val MINIMUM_SPEND = of("MINIMUM_SPEND")

            @JvmField val COUNTER_RUNNING_TOTAL_CHARGE = of("COUNTER_RUNNING_TOTAL_CHARGE")

            @JvmField val COUNTER_ADJUSTMENT_DEBIT = of("COUNTER_ADJUSTMENT_DEBIT")

            @JvmField val AD_HOC = of("AD_HOC")

            @JvmStatic fun of(value: String) = LineItemType(JsonField.of(value))
        }

        /** An enum containing [LineItemType]'s known values. */
        enum class Known {
            STANDING_CHARGE,
            USAGE,
            MINIMUM_SPEND,
            COUNTER_RUNNING_TOTAL_CHARGE,
            COUNTER_ADJUSTMENT_DEBIT,
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
            MINIMUM_SPEND,
            COUNTER_RUNNING_TOTAL_CHARGE,
            COUNTER_ADJUSTMENT_DEBIT,
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
                MINIMUM_SPEND -> Value.MINIMUM_SPEND
                COUNTER_RUNNING_TOTAL_CHARGE -> Value.COUNTER_RUNNING_TOTAL_CHARGE
                COUNTER_ADJUSTMENT_DEBIT -> Value.COUNTER_ADJUSTMENT_DEBIT
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
                MINIMUM_SPEND -> Known.MINIMUM_SPEND
                COUNTER_RUNNING_TOTAL_CHARGE -> Known.COUNTER_RUNNING_TOTAL_CHARGE
                COUNTER_ADJUSTMENT_DEBIT -> Known.COUNTER_ADJUSTMENT_DEBIT
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

        return other is BalanceUpdateParams &&
            orgId == other.orgId &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(orgId, id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BalanceUpdateParams{orgId=$orgId, id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
