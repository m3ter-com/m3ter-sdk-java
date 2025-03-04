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
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.util.Objects
import java.util.Optional

/**
 * Update a specific PlanTemplate.
 *
 * This endpoint enables you to update a specific PlanTemplate within a specific Organization, both
 * identified by their unique identifiers (UUIDs). The request body should contain the updated
 * information for the PlanTemplate.
 *
 * **Note:** If you have created Custom Fields for a Plan Template, when you use this endpoint to
 * update the Plan Template use the `customFields` parameter to preserve those Custom Fields. If you
 * omit them from the update request, they will be lost.
 */
class PlanTemplateUpdateParams
private constructor(
    private val orgId: String,
    private val id: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    fun id(): String = id

    /**
     * Determines the frequency at which bills are generated.
     * - **Daily**. Starting at midnight each day, covering the twenty-four hour period following.
     * - **Weekly**. Starting at midnight on a Monday, covering the seven-day period following.
     * - **Monthly**. Starting at midnight on the first day of each month, covering the entire
     *   calendar month following.
     * - **Annually**. Starting at midnight on first day of each year covering the entire calendar
     *   year following.
     */
    fun billFrequency(): BillFrequency = body.billFrequency()

    /**
     * The ISO currency code for the currency used to charge end users - for example USD, GBP, EUR.
     * This defines the _pricing currency_ and is inherited by any Plans based on the Plan Template.
     *
     * **Notes:**
     * - You can define a currency at Organization-level or Account-level to be used as the _billing
     *   currency_. This can be a different currency to that used for the Plan as the _pricing
     *   currency_.
     * - If the billing currency for an Account is different to the pricing currency used by a Plan
     *   attached to the Account, you must ensure a _currency conversion rate_ is defined for your
     *   Organization to convert the pricing currency into the billing currency at billing,
     *   otherwise Bills will fail for the Account.
     * - To define any required currency conversion rates, use the `currencyConversions` request
     *   body parameter for the
     *   [Update OrganizationConfig](https://www.m3ter.com/docs/api#tag/OrganizationConfig/operation/UpdateOrganizationConfig)
     *   call.
     */
    fun currency(): String = body.currency()

    /** Descriptive name for the PlanTemplate. */
    fun name(): String = body.name()

    /** The unique identifier (UUID) of the Product associated with this PlanTemplate. */
    fun productId(): String = body.productId()

    /**
     * The fixed charge _(standing charge)_ applied to customer bills. This charge is prorated and
     * must be a non-negative number.
     */
    fun standingCharge(): Double = body.standingCharge()

    /**
     * How often bills are issued. For example, if `billFrequency` is Monthly and
     * `billFrequencyInterval` is 3, bills are issued every three months.
     */
    fun billFrequencyInterval(): Optional<Long> = body.billFrequencyInterval()

    /**
     * A unique, short code reference for the PlanTemplate. This code should not contain control
     * characters or spaces.
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
     */
    fun customFields(): Optional<CustomFields> = body.customFields()

    /**
     * The Product minimum spend amount per billing cycle for end customer Accounts on a pricing
     * Plan based on the PlanTemplate. This must be a non-negative number.
     */
    fun minimumSpend(): Optional<Double> = body.minimumSpend()

    /**
     * A boolean that determines when the minimum spend is billed.
     * - TRUE - minimum spend is billed at the start of each billing period.
     * - FALSE - minimum spend is billed at the end of each billing period.
     *
     * Overrides the setting at Organizational level for minimum spend billing in arrears/in
     * advance.
     */
    fun minimumSpendBillInAdvance(): Optional<Boolean> = body.minimumSpendBillInAdvance()

    /** Minimum spend description _(displayed on the bill line item)_. */
    fun minimumSpendDescription(): Optional<String> = body.minimumSpendDescription()

    /**
     * The ranking of the PlanTemplate among your pricing plans. Lower numbers represent more basic
     * plans, while higher numbers represent premium plans. This must be a non-negative integer.
     *
     * **NOTE: DEPRECATED** - do not use.
     */
    fun ordinal(): Optional<Long> = body.ordinal()

    /**
     * A boolean that determines when the standing charge is billed.
     * - TRUE - standing charge is billed at the start of each billing period.
     * - FALSE - standing charge is billed at the end of each billing period.
     *
     * Overrides the setting at Organizational level for standing charge billing in arrears/in
     * advance.
     */
    fun standingChargeBillInAdvance(): Optional<Boolean> = body.standingChargeBillInAdvance()

    /** Standing charge description _(displayed on the bill line item)_. */
    fun standingChargeDescription(): Optional<String> = body.standingChargeDescription()

    /**
     * How often the standing charge is applied. For example, if the bill is issued every three
     * months and `standingChargeInterval` is 2, then the standing charge is applied every six
     * months.
     */
    fun standingChargeInterval(): Optional<Long> = body.standingChargeInterval()

    /**
     * Defines an offset for when the standing charge is first applied. For example, if the bill is
     * issued every three months and the `standingChargeOfset` is 0, then the charge is applied to
     * the first bill _(at three months)_; if 1, it would be applied to the second bill _(at six
     * months)_, and so on.
     */
    fun standingChargeOffset(): Optional<Long> = body.standingChargeOffset()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     */
    fun version(): Optional<Long> = body.version()

    /**
     * Determines the frequency at which bills are generated.
     * - **Daily**. Starting at midnight each day, covering the twenty-four hour period following.
     * - **Weekly**. Starting at midnight on a Monday, covering the seven-day period following.
     * - **Monthly**. Starting at midnight on the first day of each month, covering the entire
     *   calendar month following.
     * - **Annually**. Starting at midnight on first day of each year covering the entire calendar
     *   year following.
     */
    fun _billFrequency(): JsonField<BillFrequency> = body._billFrequency()

    /**
     * The ISO currency code for the currency used to charge end users - for example USD, GBP, EUR.
     * This defines the _pricing currency_ and is inherited by any Plans based on the Plan Template.
     *
     * **Notes:**
     * - You can define a currency at Organization-level or Account-level to be used as the _billing
     *   currency_. This can be a different currency to that used for the Plan as the _pricing
     *   currency_.
     * - If the billing currency for an Account is different to the pricing currency used by a Plan
     *   attached to the Account, you must ensure a _currency conversion rate_ is defined for your
     *   Organization to convert the pricing currency into the billing currency at billing,
     *   otherwise Bills will fail for the Account.
     * - To define any required currency conversion rates, use the `currencyConversions` request
     *   body parameter for the
     *   [Update OrganizationConfig](https://www.m3ter.com/docs/api#tag/OrganizationConfig/operation/UpdateOrganizationConfig)
     *   call.
     */
    fun _currency(): JsonField<String> = body._currency()

    /** Descriptive name for the PlanTemplate. */
    fun _name(): JsonField<String> = body._name()

    /** The unique identifier (UUID) of the Product associated with this PlanTemplate. */
    fun _productId(): JsonField<String> = body._productId()

    /**
     * The fixed charge _(standing charge)_ applied to customer bills. This charge is prorated and
     * must be a non-negative number.
     */
    fun _standingCharge(): JsonField<Double> = body._standingCharge()

    /**
     * How often bills are issued. For example, if `billFrequency` is Monthly and
     * `billFrequencyInterval` is 3, bills are issued every three months.
     */
    fun _billFrequencyInterval(): JsonField<Long> = body._billFrequencyInterval()

    /**
     * A unique, short code reference for the PlanTemplate. This code should not contain control
     * characters or spaces.
     */
    fun _code(): JsonField<String> = body._code()

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
    fun _customFields(): JsonField<CustomFields> = body._customFields()

    /**
     * The Product minimum spend amount per billing cycle for end customer Accounts on a pricing
     * Plan based on the PlanTemplate. This must be a non-negative number.
     */
    fun _minimumSpend(): JsonField<Double> = body._minimumSpend()

    /**
     * A boolean that determines when the minimum spend is billed.
     * - TRUE - minimum spend is billed at the start of each billing period.
     * - FALSE - minimum spend is billed at the end of each billing period.
     *
     * Overrides the setting at Organizational level for minimum spend billing in arrears/in
     * advance.
     */
    fun _minimumSpendBillInAdvance(): JsonField<Boolean> = body._minimumSpendBillInAdvance()

    /** Minimum spend description _(displayed on the bill line item)_. */
    fun _minimumSpendDescription(): JsonField<String> = body._minimumSpendDescription()

    /**
     * The ranking of the PlanTemplate among your pricing plans. Lower numbers represent more basic
     * plans, while higher numbers represent premium plans. This must be a non-negative integer.
     *
     * **NOTE: DEPRECATED** - do not use.
     */
    fun _ordinal(): JsonField<Long> = body._ordinal()

    /**
     * A boolean that determines when the standing charge is billed.
     * - TRUE - standing charge is billed at the start of each billing period.
     * - FALSE - standing charge is billed at the end of each billing period.
     *
     * Overrides the setting at Organizational level for standing charge billing in arrears/in
     * advance.
     */
    fun _standingChargeBillInAdvance(): JsonField<Boolean> = body._standingChargeBillInAdvance()

    /** Standing charge description _(displayed on the bill line item)_. */
    fun _standingChargeDescription(): JsonField<String> = body._standingChargeDescription()

    /**
     * How often the standing charge is applied. For example, if the bill is issued every three
     * months and `standingChargeInterval` is 2, then the standing charge is applied every six
     * months.
     */
    fun _standingChargeInterval(): JsonField<Long> = body._standingChargeInterval()

    /**
     * Defines an offset for when the standing charge is first applied. For example, if the bill is
     * issued every three months and the `standingChargeOfset` is 0, then the charge is applied to
     * the first bill _(at three months)_; if 1, it would be applied to the second bill _(at six
     * months)_, and so on.
     */
    fun _standingChargeOffset(): JsonField<Long> = body._standingChargeOffset()

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
            1 -> id
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("billFrequency")
        @ExcludeMissing
        private val billFrequency: JsonField<BillFrequency> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("productId")
        @ExcludeMissing
        private val productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("standingCharge")
        @ExcludeMissing
        private val standingCharge: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("billFrequencyInterval")
        @ExcludeMissing
        private val billFrequencyInterval: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("code")
        @ExcludeMissing
        private val code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customFields")
        @ExcludeMissing
        private val customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("minimumSpend")
        @ExcludeMissing
        private val minimumSpend: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("minimumSpendBillInAdvance")
        @ExcludeMissing
        private val minimumSpendBillInAdvance: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("minimumSpendDescription")
        @ExcludeMissing
        private val minimumSpendDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ordinal")
        @ExcludeMissing
        private val ordinal: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("standingChargeBillInAdvance")
        @ExcludeMissing
        private val standingChargeBillInAdvance: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("standingChargeDescription")
        @ExcludeMissing
        private val standingChargeDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("standingChargeInterval")
        @ExcludeMissing
        private val standingChargeInterval: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("standingChargeOffset")
        @ExcludeMissing
        private val standingChargeOffset: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("version")
        @ExcludeMissing
        private val version: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Determines the frequency at which bills are generated.
         * - **Daily**. Starting at midnight each day, covering the twenty-four hour period
         *   following.
         * - **Weekly**. Starting at midnight on a Monday, covering the seven-day period following.
         * - **Monthly**. Starting at midnight on the first day of each month, covering the entire
         *   calendar month following.
         * - **Annually**. Starting at midnight on first day of each year covering the entire
         *   calendar year following.
         */
        fun billFrequency(): BillFrequency = billFrequency.getRequired("billFrequency")

        /**
         * The ISO currency code for the currency used to charge end users - for example USD, GBP,
         * EUR. This defines the _pricing currency_ and is inherited by any Plans based on the Plan
         * Template.
         *
         * **Notes:**
         * - You can define a currency at Organization-level or Account-level to be used as the
         *   _billing currency_. This can be a different currency to that used for the Plan as the
         *   _pricing currency_.
         * - If the billing currency for an Account is different to the pricing currency used by a
         *   Plan attached to the Account, you must ensure a _currency conversion rate_ is defined
         *   for your Organization to convert the pricing currency into the billing currency at
         *   billing, otherwise Bills will fail for the Account.
         * - To define any required currency conversion rates, use the `currencyConversions` request
         *   body parameter for the
         *   [Update OrganizationConfig](https://www.m3ter.com/docs/api#tag/OrganizationConfig/operation/UpdateOrganizationConfig)
         *   call.
         */
        fun currency(): String = currency.getRequired("currency")

        /** Descriptive name for the PlanTemplate. */
        fun name(): String = name.getRequired("name")

        /** The unique identifier (UUID) of the Product associated with this PlanTemplate. */
        fun productId(): String = productId.getRequired("productId")

        /**
         * The fixed charge _(standing charge)_ applied to customer bills. This charge is prorated
         * and must be a non-negative number.
         */
        fun standingCharge(): Double = standingCharge.getRequired("standingCharge")

        /**
         * How often bills are issued. For example, if `billFrequency` is Monthly and
         * `billFrequencyInterval` is 3, bills are issued every three months.
         */
        fun billFrequencyInterval(): Optional<Long> =
            Optional.ofNullable(billFrequencyInterval.getNullable("billFrequencyInterval"))

        /**
         * A unique, short code reference for the PlanTemplate. This code should not contain control
         * characters or spaces.
         */
        fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

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
        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("customFields"))

        /**
         * The Product minimum spend amount per billing cycle for end customer Accounts on a pricing
         * Plan based on the PlanTemplate. This must be a non-negative number.
         */
        fun minimumSpend(): Optional<Double> =
            Optional.ofNullable(minimumSpend.getNullable("minimumSpend"))

        /**
         * A boolean that determines when the minimum spend is billed.
         * - TRUE - minimum spend is billed at the start of each billing period.
         * - FALSE - minimum spend is billed at the end of each billing period.
         *
         * Overrides the setting at Organizational level for minimum spend billing in arrears/in
         * advance.
         */
        fun minimumSpendBillInAdvance(): Optional<Boolean> =
            Optional.ofNullable(minimumSpendBillInAdvance.getNullable("minimumSpendBillInAdvance"))

        /** Minimum spend description _(displayed on the bill line item)_. */
        fun minimumSpendDescription(): Optional<String> =
            Optional.ofNullable(minimumSpendDescription.getNullable("minimumSpendDescription"))

        /**
         * The ranking of the PlanTemplate among your pricing plans. Lower numbers represent more
         * basic plans, while higher numbers represent premium plans. This must be a non-negative
         * integer.
         *
         * **NOTE: DEPRECATED** - do not use.
         */
        fun ordinal(): Optional<Long> = Optional.ofNullable(ordinal.getNullable("ordinal"))

        /**
         * A boolean that determines when the standing charge is billed.
         * - TRUE - standing charge is billed at the start of each billing period.
         * - FALSE - standing charge is billed at the end of each billing period.
         *
         * Overrides the setting at Organizational level for standing charge billing in arrears/in
         * advance.
         */
        fun standingChargeBillInAdvance(): Optional<Boolean> =
            Optional.ofNullable(
                standingChargeBillInAdvance.getNullable("standingChargeBillInAdvance")
            )

        /** Standing charge description _(displayed on the bill line item)_. */
        fun standingChargeDescription(): Optional<String> =
            Optional.ofNullable(standingChargeDescription.getNullable("standingChargeDescription"))

        /**
         * How often the standing charge is applied. For example, if the bill is issued every three
         * months and `standingChargeInterval` is 2, then the standing charge is applied every six
         * months.
         */
        fun standingChargeInterval(): Optional<Long> =
            Optional.ofNullable(standingChargeInterval.getNullable("standingChargeInterval"))

        /**
         * Defines an offset for when the standing charge is first applied. For example, if the bill
         * is issued every three months and the `standingChargeOfset` is 0, then the charge is
         * applied to the first bill _(at three months)_; if 1, it would be applied to the second
         * bill _(at six months)_, and so on.
         */
        fun standingChargeOffset(): Optional<Long> =
            Optional.ofNullable(standingChargeOffset.getNullable("standingChargeOffset"))

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

        /**
         * Determines the frequency at which bills are generated.
         * - **Daily**. Starting at midnight each day, covering the twenty-four hour period
         *   following.
         * - **Weekly**. Starting at midnight on a Monday, covering the seven-day period following.
         * - **Monthly**. Starting at midnight on the first day of each month, covering the entire
         *   calendar month following.
         * - **Annually**. Starting at midnight on first day of each year covering the entire
         *   calendar year following.
         */
        @JsonProperty("billFrequency")
        @ExcludeMissing
        fun _billFrequency(): JsonField<BillFrequency> = billFrequency

        /**
         * The ISO currency code for the currency used to charge end users - for example USD, GBP,
         * EUR. This defines the _pricing currency_ and is inherited by any Plans based on the Plan
         * Template.
         *
         * **Notes:**
         * - You can define a currency at Organization-level or Account-level to be used as the
         *   _billing currency_. This can be a different currency to that used for the Plan as the
         *   _pricing currency_.
         * - If the billing currency for an Account is different to the pricing currency used by a
         *   Plan attached to the Account, you must ensure a _currency conversion rate_ is defined
         *   for your Organization to convert the pricing currency into the billing currency at
         *   billing, otherwise Bills will fail for the Account.
         * - To define any required currency conversion rates, use the `currencyConversions` request
         *   body parameter for the
         *   [Update OrganizationConfig](https://www.m3ter.com/docs/api#tag/OrganizationConfig/operation/UpdateOrganizationConfig)
         *   call.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /** Descriptive name for the PlanTemplate. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** The unique identifier (UUID) of the Product associated with this PlanTemplate. */
        @JsonProperty("productId") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * The fixed charge _(standing charge)_ applied to customer bills. This charge is prorated
         * and must be a non-negative number.
         */
        @JsonProperty("standingCharge")
        @ExcludeMissing
        fun _standingCharge(): JsonField<Double> = standingCharge

        /**
         * How often bills are issued. For example, if `billFrequency` is Monthly and
         * `billFrequencyInterval` is 3, bills are issued every three months.
         */
        @JsonProperty("billFrequencyInterval")
        @ExcludeMissing
        fun _billFrequencyInterval(): JsonField<Long> = billFrequencyInterval

        /**
         * A unique, short code reference for the PlanTemplate. This code should not contain control
         * characters or spaces.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

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
        @JsonProperty("customFields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /**
         * The Product minimum spend amount per billing cycle for end customer Accounts on a pricing
         * Plan based on the PlanTemplate. This must be a non-negative number.
         */
        @JsonProperty("minimumSpend")
        @ExcludeMissing
        fun _minimumSpend(): JsonField<Double> = minimumSpend

        /**
         * A boolean that determines when the minimum spend is billed.
         * - TRUE - minimum spend is billed at the start of each billing period.
         * - FALSE - minimum spend is billed at the end of each billing period.
         *
         * Overrides the setting at Organizational level for minimum spend billing in arrears/in
         * advance.
         */
        @JsonProperty("minimumSpendBillInAdvance")
        @ExcludeMissing
        fun _minimumSpendBillInAdvance(): JsonField<Boolean> = minimumSpendBillInAdvance

        /** Minimum spend description _(displayed on the bill line item)_. */
        @JsonProperty("minimumSpendDescription")
        @ExcludeMissing
        fun _minimumSpendDescription(): JsonField<String> = minimumSpendDescription

        /**
         * The ranking of the PlanTemplate among your pricing plans. Lower numbers represent more
         * basic plans, while higher numbers represent premium plans. This must be a non-negative
         * integer.
         *
         * **NOTE: DEPRECATED** - do not use.
         */
        @JsonProperty("ordinal") @ExcludeMissing fun _ordinal(): JsonField<Long> = ordinal

        /**
         * A boolean that determines when the standing charge is billed.
         * - TRUE - standing charge is billed at the start of each billing period.
         * - FALSE - standing charge is billed at the end of each billing period.
         *
         * Overrides the setting at Organizational level for standing charge billing in arrears/in
         * advance.
         */
        @JsonProperty("standingChargeBillInAdvance")
        @ExcludeMissing
        fun _standingChargeBillInAdvance(): JsonField<Boolean> = standingChargeBillInAdvance

        /** Standing charge description _(displayed on the bill line item)_. */
        @JsonProperty("standingChargeDescription")
        @ExcludeMissing
        fun _standingChargeDescription(): JsonField<String> = standingChargeDescription

        /**
         * How often the standing charge is applied. For example, if the bill is issued every three
         * months and `standingChargeInterval` is 2, then the standing charge is applied every six
         * months.
         */
        @JsonProperty("standingChargeInterval")
        @ExcludeMissing
        fun _standingChargeInterval(): JsonField<Long> = standingChargeInterval

        /**
         * Defines an offset for when the standing charge is first applied. For example, if the bill
         * is issued every three months and the `standingChargeOfset` is 0, then the charge is
         * applied to the first bill _(at three months)_; if 1, it would be applied to the second
         * bill _(at six months)_, and so on.
         */
        @JsonProperty("standingChargeOffset")
        @ExcludeMissing
        fun _standingChargeOffset(): JsonField<Long> = standingChargeOffset

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

            billFrequency()
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
            private var billFrequencyInterval: JsonField<Long> = JsonMissing.of()
            private var code: JsonField<String> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var minimumSpend: JsonField<Double> = JsonMissing.of()
            private var minimumSpendBillInAdvance: JsonField<Boolean> = JsonMissing.of()
            private var minimumSpendDescription: JsonField<String> = JsonMissing.of()
            private var ordinal: JsonField<Long> = JsonMissing.of()
            private var standingChargeBillInAdvance: JsonField<Boolean> = JsonMissing.of()
            private var standingChargeDescription: JsonField<String> = JsonMissing.of()
            private var standingChargeInterval: JsonField<Long> = JsonMissing.of()
            private var standingChargeOffset: JsonField<Long> = JsonMissing.of()
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
             * - **Daily**. Starting at midnight each day, covering the twenty-four hour period
             *   following.
             * - **Weekly**. Starting at midnight on a Monday, covering the seven-day period
             *   following.
             * - **Monthly**. Starting at midnight on the first day of each month, covering the
             *   entire calendar month following.
             * - **Annually**. Starting at midnight on first day of each year covering the entire
             *   calendar year following.
             */
            fun billFrequency(billFrequency: BillFrequency) =
                billFrequency(JsonField.of(billFrequency))

            /**
             * Determines the frequency at which bills are generated.
             * - **Daily**. Starting at midnight each day, covering the twenty-four hour period
             *   following.
             * - **Weekly**. Starting at midnight on a Monday, covering the seven-day period
             *   following.
             * - **Monthly**. Starting at midnight on the first day of each month, covering the
             *   entire calendar month following.
             * - **Annually**. Starting at midnight on first day of each year covering the entire
             *   calendar year following.
             */
            fun billFrequency(billFrequency: JsonField<BillFrequency>) = apply {
                this.billFrequency = billFrequency
            }

            /**
             * The ISO currency code for the currency used to charge end users - for example USD,
             * GBP, EUR. This defines the _pricing currency_ and is inherited by any Plans based on
             * the Plan Template.
             *
             * **Notes:**
             * - You can define a currency at Organization-level or Account-level to be used as the
             *   _billing currency_. This can be a different currency to that used for the Plan as
             *   the _pricing currency_.
             * - If the billing currency for an Account is different to the pricing currency used by
             *   a Plan attached to the Account, you must ensure a _currency conversion rate_ is
             *   defined for your Organization to convert the pricing currency into the billing
             *   currency at billing, otherwise Bills will fail for the Account.
             * - To define any required currency conversion rates, use the `currencyConversions`
             *   request body parameter for the
             *   [Update OrganizationConfig](https://www.m3ter.com/docs/api#tag/OrganizationConfig/operation/UpdateOrganizationConfig)
             *   call.
             */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * The ISO currency code for the currency used to charge end users - for example USD,
             * GBP, EUR. This defines the _pricing currency_ and is inherited by any Plans based on
             * the Plan Template.
             *
             * **Notes:**
             * - You can define a currency at Organization-level or Account-level to be used as the
             *   _billing currency_. This can be a different currency to that used for the Plan as
             *   the _pricing currency_.
             * - If the billing currency for an Account is different to the pricing currency used by
             *   a Plan attached to the Account, you must ensure a _currency conversion rate_ is
             *   defined for your Organization to convert the pricing currency into the billing
             *   currency at billing, otherwise Bills will fail for the Account.
             * - To define any required currency conversion rates, use the `currencyConversions`
             *   request body parameter for the
             *   [Update OrganizationConfig](https://www.m3ter.com/docs/api#tag/OrganizationConfig/operation/UpdateOrganizationConfig)
             *   call.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** Descriptive name for the PlanTemplate. */
            fun name(name: String) = name(JsonField.of(name))

            /** Descriptive name for the PlanTemplate. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The unique identifier (UUID) of the Product associated with this PlanTemplate. */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /** The unique identifier (UUID) of the Product associated with this PlanTemplate. */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /**
             * The fixed charge _(standing charge)_ applied to customer bills. This charge is
             * prorated and must be a non-negative number.
             */
            fun standingCharge(standingCharge: Double) =
                standingCharge(JsonField.of(standingCharge))

            /**
             * The fixed charge _(standing charge)_ applied to customer bills. This charge is
             * prorated and must be a non-negative number.
             */
            fun standingCharge(standingCharge: JsonField<Double>) = apply {
                this.standingCharge = standingCharge
            }

            /**
             * How often bills are issued. For example, if `billFrequency` is Monthly and
             * `billFrequencyInterval` is 3, bills are issued every three months.
             */
            fun billFrequencyInterval(billFrequencyInterval: Long) =
                billFrequencyInterval(JsonField.of(billFrequencyInterval))

            /**
             * How often bills are issued. For example, if `billFrequency` is Monthly and
             * `billFrequencyInterval` is 3, bills are issued every three months.
             */
            fun billFrequencyInterval(billFrequencyInterval: JsonField<Long>) = apply {
                this.billFrequencyInterval = billFrequencyInterval
            }

            /**
             * A unique, short code reference for the PlanTemplate. This code should not contain
             * control characters or spaces.
             */
            fun code(code: String) = code(JsonField.of(code))

            /**
             * A unique, short code reference for the PlanTemplate. This code should not contain
             * control characters or spaces.
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
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            /**
             * The Product minimum spend amount per billing cycle for end customer Accounts on a
             * pricing Plan based on the PlanTemplate. This must be a non-negative number.
             */
            fun minimumSpend(minimumSpend: Double) = minimumSpend(JsonField.of(minimumSpend))

            /**
             * The Product minimum spend amount per billing cycle for end customer Accounts on a
             * pricing Plan based on the PlanTemplate. This must be a non-negative number.
             */
            fun minimumSpend(minimumSpend: JsonField<Double>) = apply {
                this.minimumSpend = minimumSpend
            }

            /**
             * A boolean that determines when the minimum spend is billed.
             * - TRUE - minimum spend is billed at the start of each billing period.
             * - FALSE - minimum spend is billed at the end of each billing period.
             *
             * Overrides the setting at Organizational level for minimum spend billing in arrears/in
             * advance.
             */
            fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: Boolean) =
                minimumSpendBillInAdvance(JsonField.of(minimumSpendBillInAdvance))

            /**
             * A boolean that determines when the minimum spend is billed.
             * - TRUE - minimum spend is billed at the start of each billing period.
             * - FALSE - minimum spend is billed at the end of each billing period.
             *
             * Overrides the setting at Organizational level for minimum spend billing in arrears/in
             * advance.
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
             * The ranking of the PlanTemplate among your pricing plans. Lower numbers represent
             * more basic plans, while higher numbers represent premium plans. This must be a
             * non-negative integer.
             *
             * **NOTE: DEPRECATED** - do not use.
             */
            fun ordinal(ordinal: Long) = ordinal(JsonField.of(ordinal))

            /**
             * The ranking of the PlanTemplate among your pricing plans. Lower numbers represent
             * more basic plans, while higher numbers represent premium plans. This must be a
             * non-negative integer.
             *
             * **NOTE: DEPRECATED** - do not use.
             */
            fun ordinal(ordinal: JsonField<Long>) = apply { this.ordinal = ordinal }

            /**
             * A boolean that determines when the standing charge is billed.
             * - TRUE - standing charge is billed at the start of each billing period.
             * - FALSE - standing charge is billed at the end of each billing period.
             *
             * Overrides the setting at Organizational level for standing charge billing in
             * arrears/in advance.
             */
            fun standingChargeBillInAdvance(standingChargeBillInAdvance: Boolean) =
                standingChargeBillInAdvance(JsonField.of(standingChargeBillInAdvance))

            /**
             * A boolean that determines when the standing charge is billed.
             * - TRUE - standing charge is billed at the start of each billing period.
             * - FALSE - standing charge is billed at the end of each billing period.
             *
             * Overrides the setting at Organizational level for standing charge billing in
             * arrears/in advance.
             */
            fun standingChargeBillInAdvance(standingChargeBillInAdvance: JsonField<Boolean>) =
                apply {
                    this.standingChargeBillInAdvance = standingChargeBillInAdvance
                }

            /** Standing charge description _(displayed on the bill line item)_. */
            fun standingChargeDescription(standingChargeDescription: String) =
                standingChargeDescription(JsonField.of(standingChargeDescription))

            /** Standing charge description _(displayed on the bill line item)_. */
            fun standingChargeDescription(standingChargeDescription: JsonField<String>) = apply {
                this.standingChargeDescription = standingChargeDescription
            }

            /**
             * How often the standing charge is applied. For example, if the bill is issued every
             * three months and `standingChargeInterval` is 2, then the standing charge is applied
             * every six months.
             */
            fun standingChargeInterval(standingChargeInterval: Long) =
                standingChargeInterval(JsonField.of(standingChargeInterval))

            /**
             * How often the standing charge is applied. For example, if the bill is issued every
             * three months and `standingChargeInterval` is 2, then the standing charge is applied
             * every six months.
             */
            fun standingChargeInterval(standingChargeInterval: JsonField<Long>) = apply {
                this.standingChargeInterval = standingChargeInterval
            }

            /**
             * Defines an offset for when the standing charge is first applied. For example, if the
             * bill is issued every three months and the `standingChargeOfset` is 0, then the charge
             * is applied to the first bill _(at three months)_; if 1, it would be applied to the
             * second bill _(at six months)_, and so on.
             */
            fun standingChargeOffset(standingChargeOffset: Long) =
                standingChargeOffset(JsonField.of(standingChargeOffset))

            /**
             * Defines an offset for when the standing charge is first applied. For example, if the
             * bill is issued every three months and the `standingChargeOfset` is 0, then the charge
             * is applied to the first bill _(at three months)_; if 1, it would be applied to the
             * second bill _(at six months)_, and so on.
             */
            fun standingChargeOffset(standingChargeOffset: JsonField<Long>) = apply {
                this.standingChargeOffset = standingChargeOffset
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
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && billFrequency == other.billFrequency && currency == other.currency && name == other.name && productId == other.productId && standingCharge == other.standingCharge && billFrequencyInterval == other.billFrequencyInterval && code == other.code && customFields == other.customFields && minimumSpend == other.minimumSpend && minimumSpendBillInAdvance == other.minimumSpendBillInAdvance && minimumSpendDescription == other.minimumSpendDescription && ordinal == other.ordinal && standingChargeBillInAdvance == other.standingChargeBillInAdvance && standingChargeDescription == other.standingChargeDescription && standingChargeInterval == other.standingChargeInterval && standingChargeOffset == other.standingChargeOffset && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(billFrequency, currency, name, productId, standingCharge, billFrequencyInterval, code, customFields, minimumSpend, minimumSpendBillInAdvance, minimumSpendDescription, ordinal, standingChargeBillInAdvance, standingChargeDescription, standingChargeInterval, standingChargeOffset, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{billFrequency=$billFrequency, currency=$currency, name=$name, productId=$productId, standingCharge=$standingCharge, billFrequencyInterval=$billFrequencyInterval, code=$code, customFields=$customFields, minimumSpend=$minimumSpend, minimumSpendBillInAdvance=$minimumSpendBillInAdvance, minimumSpendDescription=$minimumSpendDescription, ordinal=$ordinal, standingChargeBillInAdvance=$standingChargeBillInAdvance, standingChargeDescription=$standingChargeDescription, standingChargeInterval=$standingChargeInterval, standingChargeOffset=$standingChargeOffset, version=$version, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanTemplateUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .id()
         * .billFrequency()
         * .currency()
         * .name()
         * .productId()
         * .standingCharge()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PlanTemplateUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(planTemplateUpdateParams: PlanTemplateUpdateParams) = apply {
            orgId = planTemplateUpdateParams.orgId
            id = planTemplateUpdateParams.id
            body = planTemplateUpdateParams.body.toBuilder()
            additionalHeaders = planTemplateUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = planTemplateUpdateParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        fun id(id: String) = apply { this.id = id }

        /**
         * Determines the frequency at which bills are generated.
         * - **Daily**. Starting at midnight each day, covering the twenty-four hour period
         *   following.
         * - **Weekly**. Starting at midnight on a Monday, covering the seven-day period following.
         * - **Monthly**. Starting at midnight on the first day of each month, covering the entire
         *   calendar month following.
         * - **Annually**. Starting at midnight on first day of each year covering the entire
         *   calendar year following.
         */
        fun billFrequency(billFrequency: BillFrequency) = apply {
            body.billFrequency(billFrequency)
        }

        /**
         * Determines the frequency at which bills are generated.
         * - **Daily**. Starting at midnight each day, covering the twenty-four hour period
         *   following.
         * - **Weekly**. Starting at midnight on a Monday, covering the seven-day period following.
         * - **Monthly**. Starting at midnight on the first day of each month, covering the entire
         *   calendar month following.
         * - **Annually**. Starting at midnight on first day of each year covering the entire
         *   calendar year following.
         */
        fun billFrequency(billFrequency: JsonField<BillFrequency>) = apply {
            body.billFrequency(billFrequency)
        }

        /**
         * The ISO currency code for the currency used to charge end users - for example USD, GBP,
         * EUR. This defines the _pricing currency_ and is inherited by any Plans based on the Plan
         * Template.
         *
         * **Notes:**
         * - You can define a currency at Organization-level or Account-level to be used as the
         *   _billing currency_. This can be a different currency to that used for the Plan as the
         *   _pricing currency_.
         * - If the billing currency for an Account is different to the pricing currency used by a
         *   Plan attached to the Account, you must ensure a _currency conversion rate_ is defined
         *   for your Organization to convert the pricing currency into the billing currency at
         *   billing, otherwise Bills will fail for the Account.
         * - To define any required currency conversion rates, use the `currencyConversions` request
         *   body parameter for the
         *   [Update OrganizationConfig](https://www.m3ter.com/docs/api#tag/OrganizationConfig/operation/UpdateOrganizationConfig)
         *   call.
         */
        fun currency(currency: String) = apply { body.currency(currency) }

        /**
         * The ISO currency code for the currency used to charge end users - for example USD, GBP,
         * EUR. This defines the _pricing currency_ and is inherited by any Plans based on the Plan
         * Template.
         *
         * **Notes:**
         * - You can define a currency at Organization-level or Account-level to be used as the
         *   _billing currency_. This can be a different currency to that used for the Plan as the
         *   _pricing currency_.
         * - If the billing currency for an Account is different to the pricing currency used by a
         *   Plan attached to the Account, you must ensure a _currency conversion rate_ is defined
         *   for your Organization to convert the pricing currency into the billing currency at
         *   billing, otherwise Bills will fail for the Account.
         * - To define any required currency conversion rates, use the `currencyConversions` request
         *   body parameter for the
         *   [Update OrganizationConfig](https://www.m3ter.com/docs/api#tag/OrganizationConfig/operation/UpdateOrganizationConfig)
         *   call.
         */
        fun currency(currency: JsonField<String>) = apply { body.currency(currency) }

        /** Descriptive name for the PlanTemplate. */
        fun name(name: String) = apply { body.name(name) }

        /** Descriptive name for the PlanTemplate. */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** The unique identifier (UUID) of the Product associated with this PlanTemplate. */
        fun productId(productId: String) = apply { body.productId(productId) }

        /** The unique identifier (UUID) of the Product associated with this PlanTemplate. */
        fun productId(productId: JsonField<String>) = apply { body.productId(productId) }

        /**
         * The fixed charge _(standing charge)_ applied to customer bills. This charge is prorated
         * and must be a non-negative number.
         */
        fun standingCharge(standingCharge: Double) = apply { body.standingCharge(standingCharge) }

        /**
         * The fixed charge _(standing charge)_ applied to customer bills. This charge is prorated
         * and must be a non-negative number.
         */
        fun standingCharge(standingCharge: JsonField<Double>) = apply {
            body.standingCharge(standingCharge)
        }

        /**
         * How often bills are issued. For example, if `billFrequency` is Monthly and
         * `billFrequencyInterval` is 3, bills are issued every three months.
         */
        fun billFrequencyInterval(billFrequencyInterval: Long) = apply {
            body.billFrequencyInterval(billFrequencyInterval)
        }

        /**
         * How often bills are issued. For example, if `billFrequency` is Monthly and
         * `billFrequencyInterval` is 3, bills are issued every three months.
         */
        fun billFrequencyInterval(billFrequencyInterval: JsonField<Long>) = apply {
            body.billFrequencyInterval(billFrequencyInterval)
        }

        /**
         * A unique, short code reference for the PlanTemplate. This code should not contain control
         * characters or spaces.
         */
        fun code(code: String) = apply { body.code(code) }

        /**
         * A unique, short code reference for the PlanTemplate. This code should not contain control
         * characters or spaces.
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
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            body.customFields(customFields)
        }

        /**
         * The Product minimum spend amount per billing cycle for end customer Accounts on a pricing
         * Plan based on the PlanTemplate. This must be a non-negative number.
         */
        fun minimumSpend(minimumSpend: Double) = apply { body.minimumSpend(minimumSpend) }

        /**
         * The Product minimum spend amount per billing cycle for end customer Accounts on a pricing
         * Plan based on the PlanTemplate. This must be a non-negative number.
         */
        fun minimumSpend(minimumSpend: JsonField<Double>) = apply {
            body.minimumSpend(minimumSpend)
        }

        /**
         * A boolean that determines when the minimum spend is billed.
         * - TRUE - minimum spend is billed at the start of each billing period.
         * - FALSE - minimum spend is billed at the end of each billing period.
         *
         * Overrides the setting at Organizational level for minimum spend billing in arrears/in
         * advance.
         */
        fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: Boolean) = apply {
            body.minimumSpendBillInAdvance(minimumSpendBillInAdvance)
        }

        /**
         * A boolean that determines when the minimum spend is billed.
         * - TRUE - minimum spend is billed at the start of each billing period.
         * - FALSE - minimum spend is billed at the end of each billing period.
         *
         * Overrides the setting at Organizational level for minimum spend billing in arrears/in
         * advance.
         */
        fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: JsonField<Boolean>) = apply {
            body.minimumSpendBillInAdvance(minimumSpendBillInAdvance)
        }

        /** Minimum spend description _(displayed on the bill line item)_. */
        fun minimumSpendDescription(minimumSpendDescription: String) = apply {
            body.minimumSpendDescription(minimumSpendDescription)
        }

        /** Minimum spend description _(displayed on the bill line item)_. */
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
         * The ranking of the PlanTemplate among your pricing plans. Lower numbers represent more
         * basic plans, while higher numbers represent premium plans. This must be a non-negative
         * integer.
         *
         * **NOTE: DEPRECATED** - do not use.
         */
        fun ordinal(ordinal: JsonField<Long>) = apply { body.ordinal(ordinal) }

        /**
         * A boolean that determines when the standing charge is billed.
         * - TRUE - standing charge is billed at the start of each billing period.
         * - FALSE - standing charge is billed at the end of each billing period.
         *
         * Overrides the setting at Organizational level for standing charge billing in arrears/in
         * advance.
         */
        fun standingChargeBillInAdvance(standingChargeBillInAdvance: Boolean) = apply {
            body.standingChargeBillInAdvance(standingChargeBillInAdvance)
        }

        /**
         * A boolean that determines when the standing charge is billed.
         * - TRUE - standing charge is billed at the start of each billing period.
         * - FALSE - standing charge is billed at the end of each billing period.
         *
         * Overrides the setting at Organizational level for standing charge billing in arrears/in
         * advance.
         */
        fun standingChargeBillInAdvance(standingChargeBillInAdvance: JsonField<Boolean>) = apply {
            body.standingChargeBillInAdvance(standingChargeBillInAdvance)
        }

        /** Standing charge description _(displayed on the bill line item)_. */
        fun standingChargeDescription(standingChargeDescription: String) = apply {
            body.standingChargeDescription(standingChargeDescription)
        }

        /** Standing charge description _(displayed on the bill line item)_. */
        fun standingChargeDescription(standingChargeDescription: JsonField<String>) = apply {
            body.standingChargeDescription(standingChargeDescription)
        }

        /**
         * How often the standing charge is applied. For example, if the bill is issued every three
         * months and `standingChargeInterval` is 2, then the standing charge is applied every six
         * months.
         */
        fun standingChargeInterval(standingChargeInterval: Long) = apply {
            body.standingChargeInterval(standingChargeInterval)
        }

        /**
         * How often the standing charge is applied. For example, if the bill is issued every three
         * months and `standingChargeInterval` is 2, then the standing charge is applied every six
         * months.
         */
        fun standingChargeInterval(standingChargeInterval: JsonField<Long>) = apply {
            body.standingChargeInterval(standingChargeInterval)
        }

        /**
         * Defines an offset for when the standing charge is first applied. For example, if the bill
         * is issued every three months and the `standingChargeOfset` is 0, then the charge is
         * applied to the first bill _(at three months)_; if 1, it would be applied to the second
         * bill _(at six months)_, and so on.
         */
        fun standingChargeOffset(standingChargeOffset: Long) = apply {
            body.standingChargeOffset(standingChargeOffset)
        }

        /**
         * Defines an offset for when the standing charge is first applied. For example, if the bill
         * is issued every three months and the `standingChargeOfset` is 0, then the charge is
         * applied to the first bill _(at three months)_; if 1, it would be applied to the second
         * bill _(at six months)_, and so on.
         */
        fun standingChargeOffset(standingChargeOffset: JsonField<Long>) = apply {
            body.standingChargeOffset(standingChargeOffset)
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

        fun build(): PlanTemplateUpdateParams =
            PlanTemplateUpdateParams(
                checkRequired("orgId", orgId),
                checkRequired("id", id),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * Determines the frequency at which bills are generated.
     * - **Daily**. Starting at midnight each day, covering the twenty-four hour period following.
     * - **Weekly**. Starting at midnight on a Monday, covering the seven-day period following.
     * - **Monthly**. Starting at midnight on the first day of each month, covering the entire
     *   calendar month following.
     * - **Annually**. Starting at midnight on first day of each year covering the entire calendar
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BillFrequency && value == other.value /* spotless:on */
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
    @NoAutoDetect
    class CustomFields
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomFields = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

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

            fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomFields && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlanTemplateUpdateParams && orgId == other.orgId && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PlanTemplateUpdateParams{orgId=$orgId, id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
