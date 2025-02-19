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
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import java.util.Objects
import java.util.Optional

/**
 * Update the Plan with the given UUID.
 *
 * **Note:** If you have created Custom Fields for a Plan, when you use this endpoint to update the
 * Plan use the `customFields` parameter to preserve those Custom Fields. If you omit them from the
 * update request, they will be lost.
 */
class PlanUpdateParams
private constructor(
    private val orgId: String,
    private val id: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    fun id(): String = id

    /** Unique short code reference for the Plan. */
    fun code(): String = body.code()

    /** Descriptive name for the Plan. */
    fun name(): String = body.name()

    /** UUID of the PlanTemplate the Plan belongs to. */
    fun planTemplateId(): String = body.planTemplateId()

    /**
     * _(Optional)_. Used to specify an Account for which the Plan will be a custom/bespoke Plan:
     * - Use when first creating a Plan.
     * - A custom/bespoke Plan can only be attached to the specified Account.
     * - Once created, a custom/bespoke Plan cannot be updated to be made a custom/bespoke Plan for
     *   a different Account.
     */
    fun accountId(): Optional<String> = body.accountId()

    /**
     * TRUE/FALSE flag indicating whether the plan is a custom/bespoke Plan for a particular
     * Account:
     * - When creating a Plan, use the `accountId` request parameter to specify the Account for
     *   which the Plan will be custom/bespoke.
     * - A custom/bespoke Plan can only be attached to the specified Account.
     */
    fun bespoke(): Optional<Boolean> = body.bespoke()

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
     * The product minimum spend amount per billing cycle for end customer Accounts on a priced
     * Plan.
     *
     * _(Optional)_. Overrides PlanTemplate value.
     */
    fun minimumSpend(): Optional<Double> = body.minimumSpend()

    /**
     * Optional Product ID this plan's minimum spend should be attributed to for accounting purposes
     */
    fun minimumSpendAccountingProductId(): Optional<String> = body.minimumSpendAccountingProductId()

    /**
     * When TRUE, minimum spend is billed at the start of each billing period.
     *
     * When FALSE, minimum spend is billed at the end of each billing period.
     *
     * _(Optional)_. Overrides the setting at PlanTemplate level for minimum spend billing in
     * arrears/in advance.
     */
    fun minimumSpendBillInAdvance(): Optional<Boolean> = body.minimumSpendBillInAdvance()

    /** Minimum spend description _(displayed on the bill line item)_. */
    fun minimumSpendDescription(): Optional<String> = body.minimumSpendDescription()

    /**
     * Assigns a rank or position to the Plan in your order of pricing plans - lower numbers
     * represent more basic pricing plans; higher numbers represent more premium pricing plans.
     *
     * _(Optional)_. Overrides PlanTemplate value.
     *
     * **NOTE: DEPRECATED** - do not use.
     */
    fun ordinal(): Optional<Long> = body.ordinal()

    /**
     * The standing charge applied to bills for end customers. This is prorated.
     *
     * _(Optional)_. Overrides PlanTemplate value.
     */
    fun standingCharge(): Optional<Double> = body.standingCharge()

    /**
     * Optional Product ID this plan's standing charge should be attributed to for accounting
     * purposes
     */
    fun standingChargeAccountingProductId(): Optional<String> =
        body.standingChargeAccountingProductId()

    /**
     * When TRUE, standing charge is billed at the start of each billing period.
     *
     * When FALSE, standing charge is billed at the end of each billing period.
     *
     * _(Optional)_. Overrides the setting at PlanTemplate level for standing charge billing in
     * arrears/in advance.
     */
    fun standingChargeBillInAdvance(): Optional<Boolean> = body.standingChargeBillInAdvance()

    /** Standing charge description _(displayed on the bill line item)_. */
    fun standingChargeDescription(): Optional<String> = body.standingChargeDescription()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     */
    fun version(): Optional<Long> = body.version()

    /** Unique short code reference for the Plan. */
    fun _code(): JsonField<String> = body._code()

    /** Descriptive name for the Plan. */
    fun _name(): JsonField<String> = body._name()

    /** UUID of the PlanTemplate the Plan belongs to. */
    fun _planTemplateId(): JsonField<String> = body._planTemplateId()

    /**
     * _(Optional)_. Used to specify an Account for which the Plan will be a custom/bespoke Plan:
     * - Use when first creating a Plan.
     * - A custom/bespoke Plan can only be attached to the specified Account.
     * - Once created, a custom/bespoke Plan cannot be updated to be made a custom/bespoke Plan for
     *   a different Account.
     */
    fun _accountId(): JsonField<String> = body._accountId()

    /**
     * TRUE/FALSE flag indicating whether the plan is a custom/bespoke Plan for a particular
     * Account:
     * - When creating a Plan, use the `accountId` request parameter to specify the Account for
     *   which the Plan will be custom/bespoke.
     * - A custom/bespoke Plan can only be attached to the specified Account.
     */
    fun _bespoke(): JsonField<Boolean> = body._bespoke()

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
     * The product minimum spend amount per billing cycle for end customer Accounts on a priced
     * Plan.
     *
     * _(Optional)_. Overrides PlanTemplate value.
     */
    fun _minimumSpend(): JsonField<Double> = body._minimumSpend()

    /**
     * Optional Product ID this plan's minimum spend should be attributed to for accounting purposes
     */
    fun _minimumSpendAccountingProductId(): JsonField<String> =
        body._minimumSpendAccountingProductId()

    /**
     * When TRUE, minimum spend is billed at the start of each billing period.
     *
     * When FALSE, minimum spend is billed at the end of each billing period.
     *
     * _(Optional)_. Overrides the setting at PlanTemplate level for minimum spend billing in
     * arrears/in advance.
     */
    fun _minimumSpendBillInAdvance(): JsonField<Boolean> = body._minimumSpendBillInAdvance()

    /** Minimum spend description _(displayed on the bill line item)_. */
    fun _minimumSpendDescription(): JsonField<String> = body._minimumSpendDescription()

    /**
     * Assigns a rank or position to the Plan in your order of pricing plans - lower numbers
     * represent more basic pricing plans; higher numbers represent more premium pricing plans.
     *
     * _(Optional)_. Overrides PlanTemplate value.
     *
     * **NOTE: DEPRECATED** - do not use.
     */
    fun _ordinal(): JsonField<Long> = body._ordinal()

    /**
     * The standing charge applied to bills for end customers. This is prorated.
     *
     * _(Optional)_. Overrides PlanTemplate value.
     */
    fun _standingCharge(): JsonField<Double> = body._standingCharge()

    /**
     * Optional Product ID this plan's standing charge should be attributed to for accounting
     * purposes
     */
    fun _standingChargeAccountingProductId(): JsonField<String> =
        body._standingChargeAccountingProductId()

    /**
     * When TRUE, standing charge is billed at the start of each billing period.
     *
     * When FALSE, standing charge is billed at the end of each billing period.
     *
     * _(Optional)_. Overrides the setting at PlanTemplate level for standing charge billing in
     * arrears/in advance.
     */
    fun _standingChargeBillInAdvance(): JsonField<Boolean> = body._standingChargeBillInAdvance()

    /** Standing charge description _(displayed on the bill line item)_. */
    fun _standingChargeDescription(): JsonField<String> = body._standingChargeDescription()

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
        @JsonProperty("code")
        @ExcludeMissing
        private val code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("planTemplateId")
        @ExcludeMissing
        private val planTemplateId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accountId")
        @ExcludeMissing
        private val accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bespoke")
        @ExcludeMissing
        private val bespoke: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("customFields")
        @ExcludeMissing
        private val customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("minimumSpend")
        @ExcludeMissing
        private val minimumSpend: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("minimumSpendAccountingProductId")
        @ExcludeMissing
        private val minimumSpendAccountingProductId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("minimumSpendBillInAdvance")
        @ExcludeMissing
        private val minimumSpendBillInAdvance: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("minimumSpendDescription")
        @ExcludeMissing
        private val minimumSpendDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ordinal")
        @ExcludeMissing
        private val ordinal: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("standingCharge")
        @ExcludeMissing
        private val standingCharge: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("standingChargeAccountingProductId")
        @ExcludeMissing
        private val standingChargeAccountingProductId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("standingChargeBillInAdvance")
        @ExcludeMissing
        private val standingChargeBillInAdvance: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("standingChargeDescription")
        @ExcludeMissing
        private val standingChargeDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version")
        @ExcludeMissing
        private val version: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Unique short code reference for the Plan. */
        fun code(): String = code.getRequired("code")

        /** Descriptive name for the Plan. */
        fun name(): String = name.getRequired("name")

        /** UUID of the PlanTemplate the Plan belongs to. */
        fun planTemplateId(): String = planTemplateId.getRequired("planTemplateId")

        /**
         * _(Optional)_. Used to specify an Account for which the Plan will be a custom/bespoke
         * Plan:
         * - Use when first creating a Plan.
         * - A custom/bespoke Plan can only be attached to the specified Account.
         * - Once created, a custom/bespoke Plan cannot be updated to be made a custom/bespoke Plan
         *   for a different Account.
         */
        fun accountId(): Optional<String> = Optional.ofNullable(accountId.getNullable("accountId"))

        /**
         * TRUE/FALSE flag indicating whether the plan is a custom/bespoke Plan for a particular
         * Account:
         * - When creating a Plan, use the `accountId` request parameter to specify the Account for
         *   which the Plan will be custom/bespoke.
         * - A custom/bespoke Plan can only be attached to the specified Account.
         */
        fun bespoke(): Optional<Boolean> = Optional.ofNullable(bespoke.getNullable("bespoke"))

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
         * The product minimum spend amount per billing cycle for end customer Accounts on a priced
         * Plan.
         *
         * _(Optional)_. Overrides PlanTemplate value.
         */
        fun minimumSpend(): Optional<Double> =
            Optional.ofNullable(minimumSpend.getNullable("minimumSpend"))

        /**
         * Optional Product ID this plan's minimum spend should be attributed to for accounting
         * purposes
         */
        fun minimumSpendAccountingProductId(): Optional<String> =
            Optional.ofNullable(
                minimumSpendAccountingProductId.getNullable("minimumSpendAccountingProductId")
            )

        /**
         * When TRUE, minimum spend is billed at the start of each billing period.
         *
         * When FALSE, minimum spend is billed at the end of each billing period.
         *
         * _(Optional)_. Overrides the setting at PlanTemplate level for minimum spend billing in
         * arrears/in advance.
         */
        fun minimumSpendBillInAdvance(): Optional<Boolean> =
            Optional.ofNullable(minimumSpendBillInAdvance.getNullable("minimumSpendBillInAdvance"))

        /** Minimum spend description _(displayed on the bill line item)_. */
        fun minimumSpendDescription(): Optional<String> =
            Optional.ofNullable(minimumSpendDescription.getNullable("minimumSpendDescription"))

        /**
         * Assigns a rank or position to the Plan in your order of pricing plans - lower numbers
         * represent more basic pricing plans; higher numbers represent more premium pricing plans.
         *
         * _(Optional)_. Overrides PlanTemplate value.
         *
         * **NOTE: DEPRECATED** - do not use.
         */
        fun ordinal(): Optional<Long> = Optional.ofNullable(ordinal.getNullable("ordinal"))

        /**
         * The standing charge applied to bills for end customers. This is prorated.
         *
         * _(Optional)_. Overrides PlanTemplate value.
         */
        fun standingCharge(): Optional<Double> =
            Optional.ofNullable(standingCharge.getNullable("standingCharge"))

        /**
         * Optional Product ID this plan's standing charge should be attributed to for accounting
         * purposes
         */
        fun standingChargeAccountingProductId(): Optional<String> =
            Optional.ofNullable(
                standingChargeAccountingProductId.getNullable("standingChargeAccountingProductId")
            )

        /**
         * When TRUE, standing charge is billed at the start of each billing period.
         *
         * When FALSE, standing charge is billed at the end of each billing period.
         *
         * _(Optional)_. Overrides the setting at PlanTemplate level for standing charge billing in
         * arrears/in advance.
         */
        fun standingChargeBillInAdvance(): Optional<Boolean> =
            Optional.ofNullable(
                standingChargeBillInAdvance.getNullable("standingChargeBillInAdvance")
            )

        /** Standing charge description _(displayed on the bill line item)_. */
        fun standingChargeDescription(): Optional<String> =
            Optional.ofNullable(standingChargeDescription.getNullable("standingChargeDescription"))

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

        /** Unique short code reference for the Plan. */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /** Descriptive name for the Plan. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** UUID of the PlanTemplate the Plan belongs to. */
        @JsonProperty("planTemplateId")
        @ExcludeMissing
        fun _planTemplateId(): JsonField<String> = planTemplateId

        /**
         * _(Optional)_. Used to specify an Account for which the Plan will be a custom/bespoke
         * Plan:
         * - Use when first creating a Plan.
         * - A custom/bespoke Plan can only be attached to the specified Account.
         * - Once created, a custom/bespoke Plan cannot be updated to be made a custom/bespoke Plan
         *   for a different Account.
         */
        @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * TRUE/FALSE flag indicating whether the plan is a custom/bespoke Plan for a particular
         * Account:
         * - When creating a Plan, use the `accountId` request parameter to specify the Account for
         *   which the Plan will be custom/bespoke.
         * - A custom/bespoke Plan can only be attached to the specified Account.
         */
        @JsonProperty("bespoke") @ExcludeMissing fun _bespoke(): JsonField<Boolean> = bespoke

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
         * The product minimum spend amount per billing cycle for end customer Accounts on a priced
         * Plan.
         *
         * _(Optional)_. Overrides PlanTemplate value.
         */
        @JsonProperty("minimumSpend")
        @ExcludeMissing
        fun _minimumSpend(): JsonField<Double> = minimumSpend

        /**
         * Optional Product ID this plan's minimum spend should be attributed to for accounting
         * purposes
         */
        @JsonProperty("minimumSpendAccountingProductId")
        @ExcludeMissing
        fun _minimumSpendAccountingProductId(): JsonField<String> = minimumSpendAccountingProductId

        /**
         * When TRUE, minimum spend is billed at the start of each billing period.
         *
         * When FALSE, minimum spend is billed at the end of each billing period.
         *
         * _(Optional)_. Overrides the setting at PlanTemplate level for minimum spend billing in
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
         * Assigns a rank or position to the Plan in your order of pricing plans - lower numbers
         * represent more basic pricing plans; higher numbers represent more premium pricing plans.
         *
         * _(Optional)_. Overrides PlanTemplate value.
         *
         * **NOTE: DEPRECATED** - do not use.
         */
        @JsonProperty("ordinal") @ExcludeMissing fun _ordinal(): JsonField<Long> = ordinal

        /**
         * The standing charge applied to bills for end customers. This is prorated.
         *
         * _(Optional)_. Overrides PlanTemplate value.
         */
        @JsonProperty("standingCharge")
        @ExcludeMissing
        fun _standingCharge(): JsonField<Double> = standingCharge

        /**
         * Optional Product ID this plan's standing charge should be attributed to for accounting
         * purposes
         */
        @JsonProperty("standingChargeAccountingProductId")
        @ExcludeMissing
        fun _standingChargeAccountingProductId(): JsonField<String> =
            standingChargeAccountingProductId

        /**
         * When TRUE, standing charge is billed at the start of each billing period.
         *
         * When FALSE, standing charge is billed at the end of each billing period.
         *
         * _(Optional)_. Overrides the setting at PlanTemplate level for standing charge billing in
         * arrears/in advance.
         */
        @JsonProperty("standingChargeBillInAdvance")
        @ExcludeMissing
        fun _standingChargeBillInAdvance(): JsonField<Boolean> = standingChargeBillInAdvance

        /** Standing charge description _(displayed on the bill line item)_. */
        @JsonProperty("standingChargeDescription")
        @ExcludeMissing
        fun _standingChargeDescription(): JsonField<String> = standingChargeDescription

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

            code()
            name()
            planTemplateId()
            accountId()
            bespoke()
            customFields().ifPresent { it.validate() }
            minimumSpend()
            minimumSpendAccountingProductId()
            minimumSpendBillInAdvance()
            minimumSpendDescription()
            ordinal()
            standingCharge()
            standingChargeAccountingProductId()
            standingChargeBillInAdvance()
            standingChargeDescription()
            version()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var code: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var planTemplateId: JsonField<String>? = null
            private var accountId: JsonField<String> = JsonMissing.of()
            private var bespoke: JsonField<Boolean> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var minimumSpend: JsonField<Double> = JsonMissing.of()
            private var minimumSpendAccountingProductId: JsonField<String> = JsonMissing.of()
            private var minimumSpendBillInAdvance: JsonField<Boolean> = JsonMissing.of()
            private var minimumSpendDescription: JsonField<String> = JsonMissing.of()
            private var ordinal: JsonField<Long> = JsonMissing.of()
            private var standingCharge: JsonField<Double> = JsonMissing.of()
            private var standingChargeAccountingProductId: JsonField<String> = JsonMissing.of()
            private var standingChargeBillInAdvance: JsonField<Boolean> = JsonMissing.of()
            private var standingChargeDescription: JsonField<String> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                code = body.code
                name = body.name
                planTemplateId = body.planTemplateId
                accountId = body.accountId
                bespoke = body.bespoke
                customFields = body.customFields
                minimumSpend = body.minimumSpend
                minimumSpendAccountingProductId = body.minimumSpendAccountingProductId
                minimumSpendBillInAdvance = body.minimumSpendBillInAdvance
                minimumSpendDescription = body.minimumSpendDescription
                ordinal = body.ordinal
                standingCharge = body.standingCharge
                standingChargeAccountingProductId = body.standingChargeAccountingProductId
                standingChargeBillInAdvance = body.standingChargeBillInAdvance
                standingChargeDescription = body.standingChargeDescription
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Unique short code reference for the Plan. */
            fun code(code: String) = code(JsonField.of(code))

            /** Unique short code reference for the Plan. */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /** Descriptive name for the Plan. */
            fun name(name: String) = name(JsonField.of(name))

            /** Descriptive name for the Plan. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** UUID of the PlanTemplate the Plan belongs to. */
            fun planTemplateId(planTemplateId: String) =
                planTemplateId(JsonField.of(planTemplateId))

            /** UUID of the PlanTemplate the Plan belongs to. */
            fun planTemplateId(planTemplateId: JsonField<String>) = apply {
                this.planTemplateId = planTemplateId
            }

            /**
             * _(Optional)_. Used to specify an Account for which the Plan will be a custom/bespoke
             * Plan:
             * - Use when first creating a Plan.
             * - A custom/bespoke Plan can only be attached to the specified Account.
             * - Once created, a custom/bespoke Plan cannot be updated to be made a custom/bespoke
             *   Plan for a different Account.
             */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * _(Optional)_. Used to specify an Account for which the Plan will be a custom/bespoke
             * Plan:
             * - Use when first creating a Plan.
             * - A custom/bespoke Plan can only be attached to the specified Account.
             * - Once created, a custom/bespoke Plan cannot be updated to be made a custom/bespoke
             *   Plan for a different Account.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /**
             * TRUE/FALSE flag indicating whether the plan is a custom/bespoke Plan for a particular
             * Account:
             * - When creating a Plan, use the `accountId` request parameter to specify the Account
             *   for which the Plan will be custom/bespoke.
             * - A custom/bespoke Plan can only be attached to the specified Account.
             */
            fun bespoke(bespoke: Boolean) = bespoke(JsonField.of(bespoke))

            /**
             * TRUE/FALSE flag indicating whether the plan is a custom/bespoke Plan for a particular
             * Account:
             * - When creating a Plan, use the `accountId` request parameter to specify the Account
             *   for which the Plan will be custom/bespoke.
             * - A custom/bespoke Plan can only be attached to the specified Account.
             */
            fun bespoke(bespoke: JsonField<Boolean>) = apply { this.bespoke = bespoke }

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
             * The product minimum spend amount per billing cycle for end customer Accounts on a
             * priced Plan.
             *
             * _(Optional)_. Overrides PlanTemplate value.
             */
            fun minimumSpend(minimumSpend: Double) = minimumSpend(JsonField.of(minimumSpend))

            /**
             * The product minimum spend amount per billing cycle for end customer Accounts on a
             * priced Plan.
             *
             * _(Optional)_. Overrides PlanTemplate value.
             */
            fun minimumSpend(minimumSpend: JsonField<Double>) = apply {
                this.minimumSpend = minimumSpend
            }

            /**
             * Optional Product ID this plan's minimum spend should be attributed to for accounting
             * purposes
             */
            fun minimumSpendAccountingProductId(minimumSpendAccountingProductId: String) =
                minimumSpendAccountingProductId(JsonField.of(minimumSpendAccountingProductId))

            /**
             * Optional Product ID this plan's minimum spend should be attributed to for accounting
             * purposes
             */
            fun minimumSpendAccountingProductId(
                minimumSpendAccountingProductId: JsonField<String>
            ) = apply { this.minimumSpendAccountingProductId = minimumSpendAccountingProductId }

            /**
             * When TRUE, minimum spend is billed at the start of each billing period.
             *
             * When FALSE, minimum spend is billed at the end of each billing period.
             *
             * _(Optional)_. Overrides the setting at PlanTemplate level for minimum spend billing
             * in arrears/in advance.
             */
            fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: Boolean) =
                minimumSpendBillInAdvance(JsonField.of(minimumSpendBillInAdvance))

            /**
             * When TRUE, minimum spend is billed at the start of each billing period.
             *
             * When FALSE, minimum spend is billed at the end of each billing period.
             *
             * _(Optional)_. Overrides the setting at PlanTemplate level for minimum spend billing
             * in arrears/in advance.
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
             * Assigns a rank or position to the Plan in your order of pricing plans - lower numbers
             * represent more basic pricing plans; higher numbers represent more premium pricing
             * plans.
             *
             * _(Optional)_. Overrides PlanTemplate value.
             *
             * **NOTE: DEPRECATED** - do not use.
             */
            fun ordinal(ordinal: Long) = ordinal(JsonField.of(ordinal))

            /**
             * Assigns a rank or position to the Plan in your order of pricing plans - lower numbers
             * represent more basic pricing plans; higher numbers represent more premium pricing
             * plans.
             *
             * _(Optional)_. Overrides PlanTemplate value.
             *
             * **NOTE: DEPRECATED** - do not use.
             */
            fun ordinal(ordinal: JsonField<Long>) = apply { this.ordinal = ordinal }

            /**
             * The standing charge applied to bills for end customers. This is prorated.
             *
             * _(Optional)_. Overrides PlanTemplate value.
             */
            fun standingCharge(standingCharge: Double) =
                standingCharge(JsonField.of(standingCharge))

            /**
             * The standing charge applied to bills for end customers. This is prorated.
             *
             * _(Optional)_. Overrides PlanTemplate value.
             */
            fun standingCharge(standingCharge: JsonField<Double>) = apply {
                this.standingCharge = standingCharge
            }

            /**
             * Optional Product ID this plan's standing charge should be attributed to for
             * accounting purposes
             */
            fun standingChargeAccountingProductId(standingChargeAccountingProductId: String) =
                standingChargeAccountingProductId(JsonField.of(standingChargeAccountingProductId))

            /**
             * Optional Product ID this plan's standing charge should be attributed to for
             * accounting purposes
             */
            fun standingChargeAccountingProductId(
                standingChargeAccountingProductId: JsonField<String>
            ) = apply { this.standingChargeAccountingProductId = standingChargeAccountingProductId }

            /**
             * When TRUE, standing charge is billed at the start of each billing period.
             *
             * When FALSE, standing charge is billed at the end of each billing period.
             *
             * _(Optional)_. Overrides the setting at PlanTemplate level for standing charge billing
             * in arrears/in advance.
             */
            fun standingChargeBillInAdvance(standingChargeBillInAdvance: Boolean) =
                standingChargeBillInAdvance(JsonField.of(standingChargeBillInAdvance))

            /**
             * When TRUE, standing charge is billed at the start of each billing period.
             *
             * When FALSE, standing charge is billed at the end of each billing period.
             *
             * _(Optional)_. Overrides the setting at PlanTemplate level for standing charge billing
             * in arrears/in advance.
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
                    checkRequired("code", code),
                    checkRequired("name", name),
                    checkRequired("planTemplateId", planTemplateId),
                    accountId,
                    bespoke,
                    customFields,
                    minimumSpend,
                    minimumSpendAccountingProductId,
                    minimumSpendBillInAdvance,
                    minimumSpendDescription,
                    ordinal,
                    standingCharge,
                    standingChargeAccountingProductId,
                    standingChargeBillInAdvance,
                    standingChargeDescription,
                    version,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && code == other.code && name == other.name && planTemplateId == other.planTemplateId && accountId == other.accountId && bespoke == other.bespoke && customFields == other.customFields && minimumSpend == other.minimumSpend && minimumSpendAccountingProductId == other.minimumSpendAccountingProductId && minimumSpendBillInAdvance == other.minimumSpendBillInAdvance && minimumSpendDescription == other.minimumSpendDescription && ordinal == other.ordinal && standingCharge == other.standingCharge && standingChargeAccountingProductId == other.standingChargeAccountingProductId && standingChargeBillInAdvance == other.standingChargeBillInAdvance && standingChargeDescription == other.standingChargeDescription && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(code, name, planTemplateId, accountId, bespoke, customFields, minimumSpend, minimumSpendAccountingProductId, minimumSpendBillInAdvance, minimumSpendDescription, ordinal, standingCharge, standingChargeAccountingProductId, standingChargeBillInAdvance, standingChargeDescription, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{code=$code, name=$name, planTemplateId=$planTemplateId, accountId=$accountId, bespoke=$bespoke, customFields=$customFields, minimumSpend=$minimumSpend, minimumSpendAccountingProductId=$minimumSpendAccountingProductId, minimumSpendBillInAdvance=$minimumSpendBillInAdvance, minimumSpendDescription=$minimumSpendDescription, ordinal=$ordinal, standingCharge=$standingCharge, standingChargeAccountingProductId=$standingChargeAccountingProductId, standingChargeBillInAdvance=$standingChargeBillInAdvance, standingChargeDescription=$standingChargeDescription, version=$version, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PlanUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(planUpdateParams: PlanUpdateParams) = apply {
            orgId = planUpdateParams.orgId
            id = planUpdateParams.id
            body = planUpdateParams.body.toBuilder()
            additionalHeaders = planUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = planUpdateParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        fun id(id: String) = apply { this.id = id }

        /** Unique short code reference for the Plan. */
        fun code(code: String) = apply { body.code(code) }

        /** Unique short code reference for the Plan. */
        fun code(code: JsonField<String>) = apply { body.code(code) }

        /** Descriptive name for the Plan. */
        fun name(name: String) = apply { body.name(name) }

        /** Descriptive name for the Plan. */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** UUID of the PlanTemplate the Plan belongs to. */
        fun planTemplateId(planTemplateId: String) = apply { body.planTemplateId(planTemplateId) }

        /** UUID of the PlanTemplate the Plan belongs to. */
        fun planTemplateId(planTemplateId: JsonField<String>) = apply {
            body.planTemplateId(planTemplateId)
        }

        /**
         * _(Optional)_. Used to specify an Account for which the Plan will be a custom/bespoke
         * Plan:
         * - Use when first creating a Plan.
         * - A custom/bespoke Plan can only be attached to the specified Account.
         * - Once created, a custom/bespoke Plan cannot be updated to be made a custom/bespoke Plan
         *   for a different Account.
         */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /**
         * _(Optional)_. Used to specify an Account for which the Plan will be a custom/bespoke
         * Plan:
         * - Use when first creating a Plan.
         * - A custom/bespoke Plan can only be attached to the specified Account.
         * - Once created, a custom/bespoke Plan cannot be updated to be made a custom/bespoke Plan
         *   for a different Account.
         */
        fun accountId(accountId: JsonField<String>) = apply { body.accountId(accountId) }

        /**
         * TRUE/FALSE flag indicating whether the plan is a custom/bespoke Plan for a particular
         * Account:
         * - When creating a Plan, use the `accountId` request parameter to specify the Account for
         *   which the Plan will be custom/bespoke.
         * - A custom/bespoke Plan can only be attached to the specified Account.
         */
        fun bespoke(bespoke: Boolean) = apply { body.bespoke(bespoke) }

        /**
         * TRUE/FALSE flag indicating whether the plan is a custom/bespoke Plan for a particular
         * Account:
         * - When creating a Plan, use the `accountId` request parameter to specify the Account for
         *   which the Plan will be custom/bespoke.
         * - A custom/bespoke Plan can only be attached to the specified Account.
         */
        fun bespoke(bespoke: JsonField<Boolean>) = apply { body.bespoke(bespoke) }

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
         * The product minimum spend amount per billing cycle for end customer Accounts on a priced
         * Plan.
         *
         * _(Optional)_. Overrides PlanTemplate value.
         */
        fun minimumSpend(minimumSpend: Double) = apply { body.minimumSpend(minimumSpend) }

        /**
         * The product minimum spend amount per billing cycle for end customer Accounts on a priced
         * Plan.
         *
         * _(Optional)_. Overrides PlanTemplate value.
         */
        fun minimumSpend(minimumSpend: JsonField<Double>) = apply {
            body.minimumSpend(minimumSpend)
        }

        /**
         * Optional Product ID this plan's minimum spend should be attributed to for accounting
         * purposes
         */
        fun minimumSpendAccountingProductId(minimumSpendAccountingProductId: String) = apply {
            body.minimumSpendAccountingProductId(minimumSpendAccountingProductId)
        }

        /**
         * Optional Product ID this plan's minimum spend should be attributed to for accounting
         * purposes
         */
        fun minimumSpendAccountingProductId(minimumSpendAccountingProductId: JsonField<String>) =
            apply {
                body.minimumSpendAccountingProductId(minimumSpendAccountingProductId)
            }

        /**
         * When TRUE, minimum spend is billed at the start of each billing period.
         *
         * When FALSE, minimum spend is billed at the end of each billing period.
         *
         * _(Optional)_. Overrides the setting at PlanTemplate level for minimum spend billing in
         * arrears/in advance.
         */
        fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: Boolean) = apply {
            body.minimumSpendBillInAdvance(minimumSpendBillInAdvance)
        }

        /**
         * When TRUE, minimum spend is billed at the start of each billing period.
         *
         * When FALSE, minimum spend is billed at the end of each billing period.
         *
         * _(Optional)_. Overrides the setting at PlanTemplate level for minimum spend billing in
         * arrears/in advance.
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
         * Assigns a rank or position to the Plan in your order of pricing plans - lower numbers
         * represent more basic pricing plans; higher numbers represent more premium pricing plans.
         *
         * _(Optional)_. Overrides PlanTemplate value.
         *
         * **NOTE: DEPRECATED** - do not use.
         */
        fun ordinal(ordinal: Long) = apply { body.ordinal(ordinal) }

        /**
         * Assigns a rank or position to the Plan in your order of pricing plans - lower numbers
         * represent more basic pricing plans; higher numbers represent more premium pricing plans.
         *
         * _(Optional)_. Overrides PlanTemplate value.
         *
         * **NOTE: DEPRECATED** - do not use.
         */
        fun ordinal(ordinal: JsonField<Long>) = apply { body.ordinal(ordinal) }

        /**
         * The standing charge applied to bills for end customers. This is prorated.
         *
         * _(Optional)_. Overrides PlanTemplate value.
         */
        fun standingCharge(standingCharge: Double) = apply { body.standingCharge(standingCharge) }

        /**
         * The standing charge applied to bills for end customers. This is prorated.
         *
         * _(Optional)_. Overrides PlanTemplate value.
         */
        fun standingCharge(standingCharge: JsonField<Double>) = apply {
            body.standingCharge(standingCharge)
        }

        /**
         * Optional Product ID this plan's standing charge should be attributed to for accounting
         * purposes
         */
        fun standingChargeAccountingProductId(standingChargeAccountingProductId: String) = apply {
            body.standingChargeAccountingProductId(standingChargeAccountingProductId)
        }

        /**
         * Optional Product ID this plan's standing charge should be attributed to for accounting
         * purposes
         */
        fun standingChargeAccountingProductId(
            standingChargeAccountingProductId: JsonField<String>
        ) = apply { body.standingChargeAccountingProductId(standingChargeAccountingProductId) }

        /**
         * When TRUE, standing charge is billed at the start of each billing period.
         *
         * When FALSE, standing charge is billed at the end of each billing period.
         *
         * _(Optional)_. Overrides the setting at PlanTemplate level for standing charge billing in
         * arrears/in advance.
         */
        fun standingChargeBillInAdvance(standingChargeBillInAdvance: Boolean) = apply {
            body.standingChargeBillInAdvance(standingChargeBillInAdvance)
        }

        /**
         * When TRUE, standing charge is billed at the start of each billing period.
         *
         * When FALSE, standing charge is billed at the end of each billing period.
         *
         * _(Optional)_. Overrides the setting at PlanTemplate level for standing charge billing in
         * arrears/in advance.
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

        fun build(): PlanUpdateParams =
            PlanUpdateParams(
                checkRequired("orgId", orgId),
                checkRequired("id", id),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
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

        return /* spotless:off */ other is PlanUpdateParams && orgId == other.orgId && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PlanUpdateParams{orgId=$orgId, id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
