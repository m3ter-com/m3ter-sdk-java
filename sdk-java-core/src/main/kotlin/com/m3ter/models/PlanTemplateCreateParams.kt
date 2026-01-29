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
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create a new PlanTemplate.
 *
 * This endpoint creates a new PlanTemplate within a specific Organization, identified by its unique
 * UUID. The request body should contain the necessary information for the new PlanTemplate.
 */
class PlanTemplateCreateParams
private constructor(
    private val orgId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    /**
     * Determines the frequency at which bills are generated.
     * * **Daily**. Starting at midnight each day, covering the twenty-four hour period following.
     * * **Weekly**. Starting at midnight on a Monday, covering the seven-day period following.
     * * **Monthly**. Starting at midnight on the first day of each month, covering the entire
     *   calendar month following.
     * * **Annually**. Starting at midnight on first day of each year covering the entire calendar
     *   year following.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billFrequency(): BillFrequency = body.billFrequency()

    /**
     * The ISO currency code for the currency used to charge end users - for example USD, GBP, EUR.
     * This defines the *pricing currency* and is inherited by any Plans based on the Plan Template.
     *
     * **Notes:**
     * * You can define a currency at Organization-level or Account-level to be used as the *billing
     *   currency*. This can be a different currency to that used for the Plan as the *pricing
     *   currency*.
     * * If the billing currency for an Account is different to the pricing currency used by a Plan
     *   attached to the Account, you must ensure a *currency conversion rate* is defined for your
     *   Organization to convert the pricing currency into the billing currency at billing,
     *   otherwise Bills will fail for the Account.
     * * To define any required currency conversion rates, use the `currencyConversions` request
     *   body parameter for the
     *   [Update OrganizationConfig](https://www.m3ter.com/docs/api#tag/OrganizationConfig/operation/UpdateOrganizationConfig)
     *   call.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = body.currency()

    /**
     * Descriptive name for the PlanTemplate.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * The unique identifier (UUID) of the Product associated with this PlanTemplate.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun productId(): String = body.productId()

    /**
     * The fixed charge *(standing charge)* applied to customer bills. This charge is prorated and
     * must be a non-negative number.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun standingCharge(): Double = body.standingCharge()

    /**
     * How often bills are issued. For example, if `billFrequency` is Monthly and
     * `billFrequencyInterval` is 3, bills are issued every three months.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billFrequencyInterval(): Optional<Int> = body.billFrequencyInterval()

    /**
     * A unique, short code reference for the PlanTemplate. This code should not contain control
     * characters or spaces.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun code(): Optional<String> = body.code()

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
     * The Product minimum spend amount per billing cycle for end customer Accounts on a pricing
     * Plan based on the PlanTemplate. This must be a non-negative number.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minimumSpend(): Optional<Double> = body.minimumSpend()

    /**
     * A boolean that determines when the minimum spend is billed.
     * * TRUE - minimum spend is billed at the start of each billing period.
     * * FALSE - minimum spend is billed at the end of each billing period.
     *
     * Overrides the setting at Organizational level for minimum spend billing in arrears/in
     * advance.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minimumSpendBillInAdvance(): Optional<Boolean> = body.minimumSpendBillInAdvance()

    /**
     * Minimum spend description *(displayed on the bill line item)*.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minimumSpendDescription(): Optional<String> = body.minimumSpendDescription()

    /**
     * The ranking of the PlanTemplate among your pricing plans. Lower numbers represent more basic
     * plans, while higher numbers represent premium plans. This must be a non-negative integer.
     *
     * **NOTE: DEPRECATED** - do not use.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ordinal(): Optional<Long> = body.ordinal()

    /**
     * A boolean that determines when the standing charge is billed.
     * * TRUE - standing charge is billed at the start of each billing period.
     * * FALSE - standing charge is billed at the end of each billing period.
     *
     * Overrides the setting at Organizational level for standing charge billing in arrears/in
     * advance.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun standingChargeBillInAdvance(): Optional<Boolean> = body.standingChargeBillInAdvance()

    /**
     * Standing charge description *(displayed on the bill line item)*.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun standingChargeDescription(): Optional<String> = body.standingChargeDescription()

    /**
     * How often the standing charge is applied. For example, if the bill is issued every three
     * months and `standingChargeInterval` is 2, then the standing charge is applied every six
     * months.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun standingChargeInterval(): Optional<Int> = body.standingChargeInterval()

    /**
     * Defines an offset for when the standing charge is first applied. For example, if the bill is
     * issued every three months and the `standingChargeOfset` is 0, then the charge is applied to
     * the first bill *(at three months)*; if 1, it would be applied to the second bill *(at six
     * months)*, and so on.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun standingChargeOffset(): Optional<Int> = body.standingChargeOffset()

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
     * Returns the raw JSON value of [billFrequency].
     *
     * Unlike [billFrequency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billFrequency(): JsonField<BillFrequency> = body._billFrequency()

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currency(): JsonField<String> = body._currency()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [productId].
     *
     * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _productId(): JsonField<String> = body._productId()

    /**
     * Returns the raw JSON value of [standingCharge].
     *
     * Unlike [standingCharge], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _standingCharge(): JsonField<Double> = body._standingCharge()

    /**
     * Returns the raw JSON value of [billFrequencyInterval].
     *
     * Unlike [billFrequencyInterval], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _billFrequencyInterval(): JsonField<Int> = body._billFrequencyInterval()

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _code(): JsonField<String> = body._code()

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customFields(): JsonField<CustomFields> = body._customFields()

    /**
     * Returns the raw JSON value of [minimumSpend].
     *
     * Unlike [minimumSpend], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _minimumSpend(): JsonField<Double> = body._minimumSpend()

    /**
     * Returns the raw JSON value of [minimumSpendBillInAdvance].
     *
     * Unlike [minimumSpendBillInAdvance], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _minimumSpendBillInAdvance(): JsonField<Boolean> = body._minimumSpendBillInAdvance()

    /**
     * Returns the raw JSON value of [minimumSpendDescription].
     *
     * Unlike [minimumSpendDescription], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _minimumSpendDescription(): JsonField<String> = body._minimumSpendDescription()

    /**
     * Returns the raw JSON value of [ordinal].
     *
     * Unlike [ordinal], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ordinal(): JsonField<Long> = body._ordinal()

    /**
     * Returns the raw JSON value of [standingChargeBillInAdvance].
     *
     * Unlike [standingChargeBillInAdvance], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _standingChargeBillInAdvance(): JsonField<Boolean> = body._standingChargeBillInAdvance()

    /**
     * Returns the raw JSON value of [standingChargeDescription].
     *
     * Unlike [standingChargeDescription], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _standingChargeDescription(): JsonField<String> = body._standingChargeDescription()

    /**
     * Returns the raw JSON value of [standingChargeInterval].
     *
     * Unlike [standingChargeInterval], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _standingChargeInterval(): JsonField<Int> = body._standingChargeInterval()

    /**
     * Returns the raw JSON value of [standingChargeOffset].
     *
     * Unlike [standingChargeOffset], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _standingChargeOffset(): JsonField<Int> = body._standingChargeOffset()

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
         * Returns a mutable builder for constructing an instance of [PlanTemplateCreateParams].
         *
         * The following fields are required:
         * ```java
         * .billFrequency()
         * .currency()
         * .name()
         * .productId()
         * .standingCharge()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PlanTemplateCreateParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(planTemplateCreateParams: PlanTemplateCreateParams) = apply {
            orgId = planTemplateCreateParams.orgId
            body = planTemplateCreateParams.body.toBuilder()
            additionalHeaders = planTemplateCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = planTemplateCreateParams.additionalQueryParams.toBuilder()
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
         * - [billFrequency]
         * - [currency]
         * - [name]
         * - [productId]
         * - [standingCharge]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Determines the frequency at which bills are generated.
         * * **Daily**. Starting at midnight each day, covering the twenty-four hour period
         *   following.
         * * **Weekly**. Starting at midnight on a Monday, covering the seven-day period following.
         * * **Monthly**. Starting at midnight on the first day of each month, covering the entire
         *   calendar month following.
         * * **Annually**. Starting at midnight on first day of each year covering the entire
         *   calendar year following.
         */
        fun billFrequency(billFrequency: BillFrequency) = apply {
            body.billFrequency(billFrequency)
        }

        /**
         * Sets [Builder.billFrequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billFrequency] with a well-typed [BillFrequency] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billFrequency(billFrequency: JsonField<BillFrequency>) = apply {
            body.billFrequency(billFrequency)
        }

        /**
         * The ISO currency code for the currency used to charge end users - for example USD, GBP,
         * EUR. This defines the *pricing currency* and is inherited by any Plans based on the Plan
         * Template.
         *
         * **Notes:**
         * * You can define a currency at Organization-level or Account-level to be used as the
         *   *billing currency*. This can be a different currency to that used for the Plan as the
         *   *pricing currency*.
         * * If the billing currency for an Account is different to the pricing currency used by a
         *   Plan attached to the Account, you must ensure a *currency conversion rate* is defined
         *   for your Organization to convert the pricing currency into the billing currency at
         *   billing, otherwise Bills will fail for the Account.
         * * To define any required currency conversion rates, use the `currencyConversions` request
         *   body parameter for the
         *   [Update OrganizationConfig](https://www.m3ter.com/docs/api#tag/OrganizationConfig/operation/UpdateOrganizationConfig)
         *   call.
         */
        fun currency(currency: String) = apply { body.currency(currency) }

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { body.currency(currency) }

        /** Descriptive name for the PlanTemplate. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** The unique identifier (UUID) of the Product associated with this PlanTemplate. */
        fun productId(productId: String) = apply { body.productId(productId) }

        /**
         * Sets [Builder.productId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productId(productId: JsonField<String>) = apply { body.productId(productId) }

        /**
         * The fixed charge *(standing charge)* applied to customer bills. This charge is prorated
         * and must be a non-negative number.
         */
        fun standingCharge(standingCharge: Double) = apply { body.standingCharge(standingCharge) }

        /**
         * Sets [Builder.standingCharge] to an arbitrary JSON value.
         *
         * You should usually call [Builder.standingCharge] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun standingCharge(standingCharge: JsonField<Double>) = apply {
            body.standingCharge(standingCharge)
        }

        /**
         * How often bills are issued. For example, if `billFrequency` is Monthly and
         * `billFrequencyInterval` is 3, bills are issued every three months.
         */
        fun billFrequencyInterval(billFrequencyInterval: Int) = apply {
            body.billFrequencyInterval(billFrequencyInterval)
        }

        /**
         * Sets [Builder.billFrequencyInterval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billFrequencyInterval] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billFrequencyInterval(billFrequencyInterval: JsonField<Int>) = apply {
            body.billFrequencyInterval(billFrequencyInterval)
        }

        /**
         * A unique, short code reference for the PlanTemplate. This code should not contain control
         * characters or spaces.
         */
        fun code(code: String) = apply { body.code(code) }

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { body.code(code) }

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

        /**
         * The Product minimum spend amount per billing cycle for end customer Accounts on a pricing
         * Plan based on the PlanTemplate. This must be a non-negative number.
         */
        fun minimumSpend(minimumSpend: Double) = apply { body.minimumSpend(minimumSpend) }

        /**
         * Sets [Builder.minimumSpend] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimumSpend] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minimumSpend(minimumSpend: JsonField<Double>) = apply {
            body.minimumSpend(minimumSpend)
        }

        /**
         * A boolean that determines when the minimum spend is billed.
         * * TRUE - minimum spend is billed at the start of each billing period.
         * * FALSE - minimum spend is billed at the end of each billing period.
         *
         * Overrides the setting at Organizational level for minimum spend billing in arrears/in
         * advance.
         */
        fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: Boolean) = apply {
            body.minimumSpendBillInAdvance(minimumSpendBillInAdvance)
        }

        /**
         * Sets [Builder.minimumSpendBillInAdvance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimumSpendBillInAdvance] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: JsonField<Boolean>) = apply {
            body.minimumSpendBillInAdvance(minimumSpendBillInAdvance)
        }

        /** Minimum spend description *(displayed on the bill line item)*. */
        fun minimumSpendDescription(minimumSpendDescription: String) = apply {
            body.minimumSpendDescription(minimumSpendDescription)
        }

        /**
         * Sets [Builder.minimumSpendDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimumSpendDescription] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun minimumSpendDescription(minimumSpendDescription: JsonField<String>) = apply {
            body.minimumSpendDescription(minimumSpendDescription)
        }

        /**
         * The ranking of the PlanTemplate among your pricing plans. Lower numbers represent more
         * basic plans, while higher numbers represent premium plans. This must be a non-negative
         * integer.
         *
         * **NOTE: DEPRECATED** - do not use.
         */
        fun ordinal(ordinal: Long) = apply { body.ordinal(ordinal) }

        /**
         * Sets [Builder.ordinal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ordinal] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ordinal(ordinal: JsonField<Long>) = apply { body.ordinal(ordinal) }

        /**
         * A boolean that determines when the standing charge is billed.
         * * TRUE - standing charge is billed at the start of each billing period.
         * * FALSE - standing charge is billed at the end of each billing period.
         *
         * Overrides the setting at Organizational level for standing charge billing in arrears/in
         * advance.
         */
        fun standingChargeBillInAdvance(standingChargeBillInAdvance: Boolean) = apply {
            body.standingChargeBillInAdvance(standingChargeBillInAdvance)
        }

        /**
         * Sets [Builder.standingChargeBillInAdvance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.standingChargeBillInAdvance] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun standingChargeBillInAdvance(standingChargeBillInAdvance: JsonField<Boolean>) = apply {
            body.standingChargeBillInAdvance(standingChargeBillInAdvance)
        }

        /** Standing charge description *(displayed on the bill line item)*. */
        fun standingChargeDescription(standingChargeDescription: String) = apply {
            body.standingChargeDescription(standingChargeDescription)
        }

        /**
         * Sets [Builder.standingChargeDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.standingChargeDescription] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun standingChargeDescription(standingChargeDescription: JsonField<String>) = apply {
            body.standingChargeDescription(standingChargeDescription)
        }

        /**
         * How often the standing charge is applied. For example, if the bill is issued every three
         * months and `standingChargeInterval` is 2, then the standing charge is applied every six
         * months.
         */
        fun standingChargeInterval(standingChargeInterval: Int) = apply {
            body.standingChargeInterval(standingChargeInterval)
        }

        /**
         * Sets [Builder.standingChargeInterval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.standingChargeInterval] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun standingChargeInterval(standingChargeInterval: JsonField<Int>) = apply {
            body.standingChargeInterval(standingChargeInterval)
        }

        /**
         * Defines an offset for when the standing charge is first applied. For example, if the bill
         * is issued every three months and the `standingChargeOfset` is 0, then the charge is
         * applied to the first bill *(at three months)*; if 1, it would be applied to the second
         * bill *(at six months)*, and so on.
         */
        fun standingChargeOffset(standingChargeOffset: Int) = apply {
            body.standingChargeOffset(standingChargeOffset)
        }

        /**
         * Sets [Builder.standingChargeOffset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.standingChargeOffset] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun standingChargeOffset(standingChargeOffset: JsonField<Int>) = apply {
            body.standingChargeOffset(standingChargeOffset)
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
         * Returns an immutable instance of [PlanTemplateCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .billFrequency()
         * .currency()
         * .name()
         * .productId()
         * .standingCharge()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PlanTemplateCreateParams =
            PlanTemplateCreateParams(
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

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val billFrequency: JsonField<BillFrequency>,
        private val currency: JsonField<String>,
        private val name: JsonField<String>,
        private val productId: JsonField<String>,
        private val standingCharge: JsonField<Double>,
        private val billFrequencyInterval: JsonField<Int>,
        private val code: JsonField<String>,
        private val customFields: JsonField<CustomFields>,
        private val minimumSpend: JsonField<Double>,
        private val minimumSpendBillInAdvance: JsonField<Boolean>,
        private val minimumSpendDescription: JsonField<String>,
        private val ordinal: JsonField<Long>,
        private val standingChargeBillInAdvance: JsonField<Boolean>,
        private val standingChargeDescription: JsonField<String>,
        private val standingChargeInterval: JsonField<Int>,
        private val standingChargeOffset: JsonField<Int>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("billFrequency")
            @ExcludeMissing
            billFrequency: JsonField<BillFrequency> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("productId")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("standingCharge")
            @ExcludeMissing
            standingCharge: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("billFrequencyInterval")
            @ExcludeMissing
            billFrequencyInterval: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customFields")
            @ExcludeMissing
            customFields: JsonField<CustomFields> = JsonMissing.of(),
            @JsonProperty("minimumSpend")
            @ExcludeMissing
            minimumSpend: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("minimumSpendBillInAdvance")
            @ExcludeMissing
            minimumSpendBillInAdvance: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("minimumSpendDescription")
            @ExcludeMissing
            minimumSpendDescription: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ordinal") @ExcludeMissing ordinal: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("standingChargeBillInAdvance")
            @ExcludeMissing
            standingChargeBillInAdvance: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("standingChargeDescription")
            @ExcludeMissing
            standingChargeDescription: JsonField<String> = JsonMissing.of(),
            @JsonProperty("standingChargeInterval")
            @ExcludeMissing
            standingChargeInterval: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("standingChargeOffset")
            @ExcludeMissing
            standingChargeOffset: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(
            billFrequency,
            currency,
            name,
            productId,
            standingCharge,
            billFrequencyInterval,
            code,
            customFields,
            minimumSpend,
            minimumSpendBillInAdvance,
            minimumSpendDescription,
            ordinal,
            standingChargeBillInAdvance,
            standingChargeDescription,
            standingChargeInterval,
            standingChargeOffset,
            version,
            mutableMapOf(),
        )

        /**
         * Determines the frequency at which bills are generated.
         * * **Daily**. Starting at midnight each day, covering the twenty-four hour period
         *   following.
         * * **Weekly**. Starting at midnight on a Monday, covering the seven-day period following.
         * * **Monthly**. Starting at midnight on the first day of each month, covering the entire
         *   calendar month following.
         * * **Annually**. Starting at midnight on first day of each year covering the entire
         *   calendar year following.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billFrequency(): BillFrequency = billFrequency.getRequired("billFrequency")

        /**
         * The ISO currency code for the currency used to charge end users - for example USD, GBP,
         * EUR. This defines the *pricing currency* and is inherited by any Plans based on the Plan
         * Template.
         *
         * **Notes:**
         * * You can define a currency at Organization-level or Account-level to be used as the
         *   *billing currency*. This can be a different currency to that used for the Plan as the
         *   *pricing currency*.
         * * If the billing currency for an Account is different to the pricing currency used by a
         *   Plan attached to the Account, you must ensure a *currency conversion rate* is defined
         *   for your Organization to convert the pricing currency into the billing currency at
         *   billing, otherwise Bills will fail for the Account.
         * * To define any required currency conversion rates, use the `currencyConversions` request
         *   body parameter for the
         *   [Update OrganizationConfig](https://www.m3ter.com/docs/api#tag/OrganizationConfig/operation/UpdateOrganizationConfig)
         *   call.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * Descriptive name for the PlanTemplate.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The unique identifier (UUID) of the Product associated with this PlanTemplate.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun productId(): String = productId.getRequired("productId")

        /**
         * The fixed charge *(standing charge)* applied to customer bills. This charge is prorated
         * and must be a non-negative number.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun standingCharge(): Double = standingCharge.getRequired("standingCharge")

        /**
         * How often bills are issued. For example, if `billFrequency` is Monthly and
         * `billFrequencyInterval` is 3, bills are issued every three months.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billFrequencyInterval(): Optional<Int> =
            billFrequencyInterval.getOptional("billFrequencyInterval")

        /**
         * A unique, short code reference for the PlanTemplate. This code should not contain control
         * characters or spaces.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun code(): Optional<String> = code.getOptional("code")

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
         * The Product minimum spend amount per billing cycle for end customer Accounts on a pricing
         * Plan based on the PlanTemplate. This must be a non-negative number.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minimumSpend(): Optional<Double> = minimumSpend.getOptional("minimumSpend")

        /**
         * A boolean that determines when the minimum spend is billed.
         * * TRUE - minimum spend is billed at the start of each billing period.
         * * FALSE - minimum spend is billed at the end of each billing period.
         *
         * Overrides the setting at Organizational level for minimum spend billing in arrears/in
         * advance.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minimumSpendBillInAdvance(): Optional<Boolean> =
            minimumSpendBillInAdvance.getOptional("minimumSpendBillInAdvance")

        /**
         * Minimum spend description *(displayed on the bill line item)*.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minimumSpendDescription(): Optional<String> =
            minimumSpendDescription.getOptional("minimumSpendDescription")

        /**
         * The ranking of the PlanTemplate among your pricing plans. Lower numbers represent more
         * basic plans, while higher numbers represent premium plans. This must be a non-negative
         * integer.
         *
         * **NOTE: DEPRECATED** - do not use.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ordinal(): Optional<Long> = ordinal.getOptional("ordinal")

        /**
         * A boolean that determines when the standing charge is billed.
         * * TRUE - standing charge is billed at the start of each billing period.
         * * FALSE - standing charge is billed at the end of each billing period.
         *
         * Overrides the setting at Organizational level for standing charge billing in arrears/in
         * advance.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun standingChargeBillInAdvance(): Optional<Boolean> =
            standingChargeBillInAdvance.getOptional("standingChargeBillInAdvance")

        /**
         * Standing charge description *(displayed on the bill line item)*.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun standingChargeDescription(): Optional<String> =
            standingChargeDescription.getOptional("standingChargeDescription")

        /**
         * How often the standing charge is applied. For example, if the bill is issued every three
         * months and `standingChargeInterval` is 2, then the standing charge is applied every six
         * months.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun standingChargeInterval(): Optional<Int> =
            standingChargeInterval.getOptional("standingChargeInterval")

        /**
         * Defines an offset for when the standing charge is first applied. For example, if the bill
         * is issued every three months and the `standingChargeOfset` is 0, then the charge is
         * applied to the first bill *(at three months)*; if 1, it would be applied to the second
         * bill *(at six months)*, and so on.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun standingChargeOffset(): Optional<Int> =
            standingChargeOffset.getOptional("standingChargeOffset")

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
         * Returns the raw JSON value of [billFrequency].
         *
         * Unlike [billFrequency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billFrequency")
        @ExcludeMissing
        fun _billFrequency(): JsonField<BillFrequency> = billFrequency

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [productId].
         *
         * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("productId") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * Returns the raw JSON value of [standingCharge].
         *
         * Unlike [standingCharge], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("standingCharge")
        @ExcludeMissing
        fun _standingCharge(): JsonField<Double> = standingCharge

        /**
         * Returns the raw JSON value of [billFrequencyInterval].
         *
         * Unlike [billFrequencyInterval], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("billFrequencyInterval")
        @ExcludeMissing
        fun _billFrequencyInterval(): JsonField<Int> = billFrequencyInterval

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

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
         * Returns the raw JSON value of [minimumSpend].
         *
         * Unlike [minimumSpend], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("minimumSpend")
        @ExcludeMissing
        fun _minimumSpend(): JsonField<Double> = minimumSpend

        /**
         * Returns the raw JSON value of [minimumSpendBillInAdvance].
         *
         * Unlike [minimumSpendBillInAdvance], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("minimumSpendBillInAdvance")
        @ExcludeMissing
        fun _minimumSpendBillInAdvance(): JsonField<Boolean> = minimumSpendBillInAdvance

        /**
         * Returns the raw JSON value of [minimumSpendDescription].
         *
         * Unlike [minimumSpendDescription], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("minimumSpendDescription")
        @ExcludeMissing
        fun _minimumSpendDescription(): JsonField<String> = minimumSpendDescription

        /**
         * Returns the raw JSON value of [ordinal].
         *
         * Unlike [ordinal], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ordinal") @ExcludeMissing fun _ordinal(): JsonField<Long> = ordinal

        /**
         * Returns the raw JSON value of [standingChargeBillInAdvance].
         *
         * Unlike [standingChargeBillInAdvance], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("standingChargeBillInAdvance")
        @ExcludeMissing
        fun _standingChargeBillInAdvance(): JsonField<Boolean> = standingChargeBillInAdvance

        /**
         * Returns the raw JSON value of [standingChargeDescription].
         *
         * Unlike [standingChargeDescription], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("standingChargeDescription")
        @ExcludeMissing
        fun _standingChargeDescription(): JsonField<String> = standingChargeDescription

        /**
         * Returns the raw JSON value of [standingChargeInterval].
         *
         * Unlike [standingChargeInterval], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("standingChargeInterval")
        @ExcludeMissing
        fun _standingChargeInterval(): JsonField<Int> = standingChargeInterval

        /**
         * Returns the raw JSON value of [standingChargeOffset].
         *
         * Unlike [standingChargeOffset], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("standingChargeOffset")
        @ExcludeMissing
        fun _standingChargeOffset(): JsonField<Int> = standingChargeOffset

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
             * .billFrequency()
             * .currency()
             * .name()
             * .productId()
             * .standingCharge()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var billFrequency: JsonField<BillFrequency>? = null
            private var currency: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var productId: JsonField<String>? = null
            private var standingCharge: JsonField<Double>? = null
            private var billFrequencyInterval: JsonField<Int> = JsonMissing.of()
            private var code: JsonField<String> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var minimumSpend: JsonField<Double> = JsonMissing.of()
            private var minimumSpendBillInAdvance: JsonField<Boolean> = JsonMissing.of()
            private var minimumSpendDescription: JsonField<String> = JsonMissing.of()
            private var ordinal: JsonField<Long> = JsonMissing.of()
            private var standingChargeBillInAdvance: JsonField<Boolean> = JsonMissing.of()
            private var standingChargeDescription: JsonField<String> = JsonMissing.of()
            private var standingChargeInterval: JsonField<Int> = JsonMissing.of()
            private var standingChargeOffset: JsonField<Int> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                billFrequency = body.billFrequency
                currency = body.currency
                name = body.name
                productId = body.productId
                standingCharge = body.standingCharge
                billFrequencyInterval = body.billFrequencyInterval
                code = body.code
                customFields = body.customFields
                minimumSpend = body.minimumSpend
                minimumSpendBillInAdvance = body.minimumSpendBillInAdvance
                minimumSpendDescription = body.minimumSpendDescription
                ordinal = body.ordinal
                standingChargeBillInAdvance = body.standingChargeBillInAdvance
                standingChargeDescription = body.standingChargeDescription
                standingChargeInterval = body.standingChargeInterval
                standingChargeOffset = body.standingChargeOffset
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Determines the frequency at which bills are generated.
             * * **Daily**. Starting at midnight each day, covering the twenty-four hour period
             *   following.
             * * **Weekly**. Starting at midnight on a Monday, covering the seven-day period
             *   following.
             * * **Monthly**. Starting at midnight on the first day of each month, covering the
             *   entire calendar month following.
             * * **Annually**. Starting at midnight on first day of each year covering the entire
             *   calendar year following.
             */
            fun billFrequency(billFrequency: BillFrequency) =
                billFrequency(JsonField.of(billFrequency))

            /**
             * Sets [Builder.billFrequency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billFrequency] with a well-typed [BillFrequency]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun billFrequency(billFrequency: JsonField<BillFrequency>) = apply {
                this.billFrequency = billFrequency
            }

            /**
             * The ISO currency code for the currency used to charge end users - for example USD,
             * GBP, EUR. This defines the *pricing currency* and is inherited by any Plans based on
             * the Plan Template.
             *
             * **Notes:**
             * * You can define a currency at Organization-level or Account-level to be used as the
             *   *billing currency*. This can be a different currency to that used for the Plan as
             *   the *pricing currency*.
             * * If the billing currency for an Account is different to the pricing currency used by
             *   a Plan attached to the Account, you must ensure a *currency conversion rate* is
             *   defined for your Organization to convert the pricing currency into the billing
             *   currency at billing, otherwise Bills will fail for the Account.
             * * To define any required currency conversion rates, use the `currencyConversions`
             *   request body parameter for the
             *   [Update OrganizationConfig](https://www.m3ter.com/docs/api#tag/OrganizationConfig/operation/UpdateOrganizationConfig)
             *   call.
             */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** Descriptive name for the PlanTemplate. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The unique identifier (UUID) of the Product associated with this PlanTemplate. */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /**
             * The fixed charge *(standing charge)* applied to customer bills. This charge is
             * prorated and must be a non-negative number.
             */
            fun standingCharge(standingCharge: Double) =
                standingCharge(JsonField.of(standingCharge))

            /**
             * Sets [Builder.standingCharge] to an arbitrary JSON value.
             *
             * You should usually call [Builder.standingCharge] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun standingCharge(standingCharge: JsonField<Double>) = apply {
                this.standingCharge = standingCharge
            }

            /**
             * How often bills are issued. For example, if `billFrequency` is Monthly and
             * `billFrequencyInterval` is 3, bills are issued every three months.
             */
            fun billFrequencyInterval(billFrequencyInterval: Int) =
                billFrequencyInterval(JsonField.of(billFrequencyInterval))

            /**
             * Sets [Builder.billFrequencyInterval] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billFrequencyInterval] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billFrequencyInterval(billFrequencyInterval: JsonField<Int>) = apply {
                this.billFrequencyInterval = billFrequencyInterval
            }

            /**
             * A unique, short code reference for the PlanTemplate. This code should not contain
             * control characters or spaces.
             */
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

            /**
             * The Product minimum spend amount per billing cycle for end customer Accounts on a
             * pricing Plan based on the PlanTemplate. This must be a non-negative number.
             */
            fun minimumSpend(minimumSpend: Double) = minimumSpend(JsonField.of(minimumSpend))

            /**
             * Sets [Builder.minimumSpend] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimumSpend] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minimumSpend(minimumSpend: JsonField<Double>) = apply {
                this.minimumSpend = minimumSpend
            }

            /**
             * A boolean that determines when the minimum spend is billed.
             * * TRUE - minimum spend is billed at the start of each billing period.
             * * FALSE - minimum spend is billed at the end of each billing period.
             *
             * Overrides the setting at Organizational level for minimum spend billing in arrears/in
             * advance.
             */
            fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: Boolean) =
                minimumSpendBillInAdvance(JsonField.of(minimumSpendBillInAdvance))

            /**
             * Sets [Builder.minimumSpendBillInAdvance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimumSpendBillInAdvance] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: JsonField<Boolean>) = apply {
                this.minimumSpendBillInAdvance = minimumSpendBillInAdvance
            }

            /** Minimum spend description *(displayed on the bill line item)*. */
            fun minimumSpendDescription(minimumSpendDescription: String) =
                minimumSpendDescription(JsonField.of(minimumSpendDescription))

            /**
             * Sets [Builder.minimumSpendDescription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimumSpendDescription] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun minimumSpendDescription(minimumSpendDescription: JsonField<String>) = apply {
                this.minimumSpendDescription = minimumSpendDescription
            }

            /**
             * The ranking of the PlanTemplate among your pricing plans. Lower numbers represent
             * more basic plans, while higher numbers represent premium plans. This must be a
             * non-negative integer.
             *
             * **NOTE: DEPRECATED** - do not use.
             */
            fun ordinal(ordinal: Long) = ordinal(JsonField.of(ordinal))

            /**
             * Sets [Builder.ordinal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ordinal] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ordinal(ordinal: JsonField<Long>) = apply { this.ordinal = ordinal }

            /**
             * A boolean that determines when the standing charge is billed.
             * * TRUE - standing charge is billed at the start of each billing period.
             * * FALSE - standing charge is billed at the end of each billing period.
             *
             * Overrides the setting at Organizational level for standing charge billing in
             * arrears/in advance.
             */
            fun standingChargeBillInAdvance(standingChargeBillInAdvance: Boolean) =
                standingChargeBillInAdvance(JsonField.of(standingChargeBillInAdvance))

            /**
             * Sets [Builder.standingChargeBillInAdvance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.standingChargeBillInAdvance] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun standingChargeBillInAdvance(standingChargeBillInAdvance: JsonField<Boolean>) =
                apply {
                    this.standingChargeBillInAdvance = standingChargeBillInAdvance
                }

            /** Standing charge description *(displayed on the bill line item)*. */
            fun standingChargeDescription(standingChargeDescription: String) =
                standingChargeDescription(JsonField.of(standingChargeDescription))

            /**
             * Sets [Builder.standingChargeDescription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.standingChargeDescription] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun standingChargeDescription(standingChargeDescription: JsonField<String>) = apply {
                this.standingChargeDescription = standingChargeDescription
            }

            /**
             * How often the standing charge is applied. For example, if the bill is issued every
             * three months and `standingChargeInterval` is 2, then the standing charge is applied
             * every six months.
             */
            fun standingChargeInterval(standingChargeInterval: Int) =
                standingChargeInterval(JsonField.of(standingChargeInterval))

            /**
             * Sets [Builder.standingChargeInterval] to an arbitrary JSON value.
             *
             * You should usually call [Builder.standingChargeInterval] with a well-typed [Int]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun standingChargeInterval(standingChargeInterval: JsonField<Int>) = apply {
                this.standingChargeInterval = standingChargeInterval
            }

            /**
             * Defines an offset for when the standing charge is first applied. For example, if the
             * bill is issued every three months and the `standingChargeOfset` is 0, then the charge
             * is applied to the first bill *(at three months)*; if 1, it would be applied to the
             * second bill *(at six months)*, and so on.
             */
            fun standingChargeOffset(standingChargeOffset: Int) =
                standingChargeOffset(JsonField.of(standingChargeOffset))

            /**
             * Sets [Builder.standingChargeOffset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.standingChargeOffset] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun standingChargeOffset(standingChargeOffset: JsonField<Int>) = apply {
                this.standingChargeOffset = standingChargeOffset
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
             * .billFrequency()
             * .currency()
             * .name()
             * .productId()
             * .standingCharge()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("billFrequency", billFrequency),
                    checkRequired("currency", currency),
                    checkRequired("name", name),
                    checkRequired("productId", productId),
                    checkRequired("standingCharge", standingCharge),
                    billFrequencyInterval,
                    code,
                    customFields,
                    minimumSpend,
                    minimumSpendBillInAdvance,
                    minimumSpendDescription,
                    ordinal,
                    standingChargeBillInAdvance,
                    standingChargeDescription,
                    standingChargeInterval,
                    standingChargeOffset,
                    version,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            billFrequency().validate()
            currency()
            name()
            productId()
            standingCharge()
            billFrequencyInterval()
            code()
            customFields().ifPresent { it.validate() }
            minimumSpend()
            minimumSpendBillInAdvance()
            minimumSpendDescription()
            ordinal()
            standingChargeBillInAdvance()
            standingChargeDescription()
            standingChargeInterval()
            standingChargeOffset()
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
            (billFrequency.asKnown().getOrNull()?.validity() ?: 0) +
                (if (currency.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (productId.asKnown().isPresent) 1 else 0) +
                (if (standingCharge.asKnown().isPresent) 1 else 0) +
                (if (billFrequencyInterval.asKnown().isPresent) 1 else 0) +
                (if (code.asKnown().isPresent) 1 else 0) +
                (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (minimumSpend.asKnown().isPresent) 1 else 0) +
                (if (minimumSpendBillInAdvance.asKnown().isPresent) 1 else 0) +
                (if (minimumSpendDescription.asKnown().isPresent) 1 else 0) +
                (if (ordinal.asKnown().isPresent) 1 else 0) +
                (if (standingChargeBillInAdvance.asKnown().isPresent) 1 else 0) +
                (if (standingChargeDescription.asKnown().isPresent) 1 else 0) +
                (if (standingChargeInterval.asKnown().isPresent) 1 else 0) +
                (if (standingChargeOffset.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                billFrequency == other.billFrequency &&
                currency == other.currency &&
                name == other.name &&
                productId == other.productId &&
                standingCharge == other.standingCharge &&
                billFrequencyInterval == other.billFrequencyInterval &&
                code == other.code &&
                customFields == other.customFields &&
                minimumSpend == other.minimumSpend &&
                minimumSpendBillInAdvance == other.minimumSpendBillInAdvance &&
                minimumSpendDescription == other.minimumSpendDescription &&
                ordinal == other.ordinal &&
                standingChargeBillInAdvance == other.standingChargeBillInAdvance &&
                standingChargeDescription == other.standingChargeDescription &&
                standingChargeInterval == other.standingChargeInterval &&
                standingChargeOffset == other.standingChargeOffset &&
                version == other.version &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                billFrequency,
                currency,
                name,
                productId,
                standingCharge,
                billFrequencyInterval,
                code,
                customFields,
                minimumSpend,
                minimumSpendBillInAdvance,
                minimumSpendDescription,
                ordinal,
                standingChargeBillInAdvance,
                standingChargeDescription,
                standingChargeInterval,
                standingChargeOffset,
                version,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{billFrequency=$billFrequency, currency=$currency, name=$name, productId=$productId, standingCharge=$standingCharge, billFrequencyInterval=$billFrequencyInterval, code=$code, customFields=$customFields, minimumSpend=$minimumSpend, minimumSpendBillInAdvance=$minimumSpendBillInAdvance, minimumSpendDescription=$minimumSpendDescription, ordinal=$ordinal, standingChargeBillInAdvance=$standingChargeBillInAdvance, standingChargeDescription=$standingChargeDescription, standingChargeInterval=$standingChargeInterval, standingChargeOffset=$standingChargeOffset, version=$version, additionalProperties=$additionalProperties}"
    }

    /**
     * Determines the frequency at which bills are generated.
     * * **Daily**. Starting at midnight each day, covering the twenty-four hour period following.
     * * **Weekly**. Starting at midnight on a Monday, covering the seven-day period following.
     * * **Monthly**. Starting at midnight on the first day of each month, covering the entire
     *   calendar month following.
     * * **Annually**. Starting at midnight on first day of each year covering the entire calendar
     *   year following.
     */
    class BillFrequency @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val DAILY = of("DAILY")

            @JvmField val WEEKLY = of("WEEKLY")

            @JvmField val MONTHLY = of("MONTHLY")

            @JvmField val ANNUALLY = of("ANNUALLY")

            @JvmField val AD_HOC = of("AD_HOC")

            @JvmField val MIXED = of("MIXED")

            @JvmStatic fun of(value: String) = BillFrequency(JsonField.of(value))
        }

        /** An enum containing [BillFrequency]'s known values. */
        enum class Known {
            DAILY,
            WEEKLY,
            MONTHLY,
            ANNUALLY,
            AD_HOC,
            MIXED,
        }

        /**
         * An enum containing [BillFrequency]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [BillFrequency] can contain an unknown value in a couple of cases:
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
            AD_HOC,
            MIXED,
            /**
             * An enum member indicating that [BillFrequency] was instantiated with an unknown
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
                DAILY -> Value.DAILY
                WEEKLY -> Value.WEEKLY
                MONTHLY -> Value.MONTHLY
                ANNUALLY -> Value.ANNUALLY
                AD_HOC -> Value.AD_HOC
                MIXED -> Value.MIXED
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
                AD_HOC -> Known.AD_HOC
                MIXED -> Known.MIXED
                else -> throw M3terInvalidDataException("Unknown BillFrequency: $value")
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

        fun validate(): BillFrequency = apply {
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

            return other is BillFrequency && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlanTemplateCreateParams &&
            orgId == other.orgId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(orgId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PlanTemplateCreateParams{orgId=$orgId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
