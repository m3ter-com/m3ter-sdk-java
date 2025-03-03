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
 * Create a new PlanGroup. This endpoint creates a new PlanGroup within the specified organization.
 */
class PlanGroupCreateParams
private constructor(
    private val orgId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    /** Currency code for the PlanGroup (For example, USD). */
    fun currency(): String = body.currency()

    /** The name of the PlanGroup. */
    fun name(): String = body.name()

    /**
     * Optional. This PlanGroup is created as bespoke for the associated Account with this Account
     * ID.
     */
    fun accountId(): Optional<String> = body.accountId()

    /** The short code representing the PlanGroup. */
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

    /** The minimum spend amount for the PlanGroup. */
    fun minimumSpend(): Optional<Double> = body.minimumSpend()

    /** Optional. Product ID to attribute the PlanGroup's minimum spend for accounting purposes. */
    fun minimumSpendAccountingProductId(): Optional<String> = body.minimumSpendAccountingProductId()

    /**
     * A boolean flag that determines when the minimum spend is billed. This flag overrides the
     * setting at Organizational level for minimum spend billing in arrears/in advance.
     * - **TRUE** - minimum spend is billed at the start of each billing period.
     * - **FALSE** - minimum spend is billed at the end of each billing period.
     */
    fun minimumSpendBillInAdvance(): Optional<Boolean> = body.minimumSpendBillInAdvance()

    /** Description of the minimum spend, displayed on the bill line item. */
    fun minimumSpendDescription(): Optional<String> = body.minimumSpendDescription()

    /** Standing charge amount for the PlanGroup. */
    fun standingCharge(): Optional<Double> = body.standingCharge()

    /**
     * Optional. Product ID to attribute the PlanGroup's standing charge for accounting purposes.
     */
    fun standingChargeAccountingProductId(): Optional<String> =
        body.standingChargeAccountingProductId()

    /**
     * A boolean flag that determines when the standing charge is billed. This flag overrides the
     * setting at Organizational level for standing charge billing in arrears/in advance.
     * - **TRUE** - standing charge is billed at the start of each billing period.
     * - **FALSE** - standing charge is billed at the end of each billing period.
     */
    fun standingChargeBillInAdvance(): Optional<Boolean> = body.standingChargeBillInAdvance()

    /** Description of the standing charge, displayed on the bill line item. */
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

    /** Currency code for the PlanGroup (For example, USD). */
    fun _currency(): JsonField<String> = body._currency()

    /** The name of the PlanGroup. */
    fun _name(): JsonField<String> = body._name()

    /**
     * Optional. This PlanGroup is created as bespoke for the associated Account with this Account
     * ID.
     */
    fun _accountId(): JsonField<String> = body._accountId()

    /** The short code representing the PlanGroup. */
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

    /** The minimum spend amount for the PlanGroup. */
    fun _minimumSpend(): JsonField<Double> = body._minimumSpend()

    /** Optional. Product ID to attribute the PlanGroup's minimum spend for accounting purposes. */
    fun _minimumSpendAccountingProductId(): JsonField<String> =
        body._minimumSpendAccountingProductId()

    /**
     * A boolean flag that determines when the minimum spend is billed. This flag overrides the
     * setting at Organizational level for minimum spend billing in arrears/in advance.
     * - **TRUE** - minimum spend is billed at the start of each billing period.
     * - **FALSE** - minimum spend is billed at the end of each billing period.
     */
    fun _minimumSpendBillInAdvance(): JsonField<Boolean> = body._minimumSpendBillInAdvance()

    /** Description of the minimum spend, displayed on the bill line item. */
    fun _minimumSpendDescription(): JsonField<String> = body._minimumSpendDescription()

    /** Standing charge amount for the PlanGroup. */
    fun _standingCharge(): JsonField<Double> = body._standingCharge()

    /**
     * Optional. Product ID to attribute the PlanGroup's standing charge for accounting purposes.
     */
    fun _standingChargeAccountingProductId(): JsonField<String> =
        body._standingChargeAccountingProductId()

    /**
     * A boolean flag that determines when the standing charge is billed. This flag overrides the
     * setting at Organizational level for standing charge billing in arrears/in advance.
     * - **TRUE** - standing charge is billed at the start of each billing period.
     * - **FALSE** - standing charge is billed at the end of each billing period.
     */
    fun _standingChargeBillInAdvance(): JsonField<Boolean> = body._standingChargeBillInAdvance()

    /** Description of the standing charge, displayed on the bill line item. */
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
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accountId")
        @ExcludeMissing
        private val accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("code")
        @ExcludeMissing
        private val code: JsonField<String> = JsonMissing.of(),
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

        /** Currency code for the PlanGroup (For example, USD). */
        fun currency(): String = currency.getRequired("currency")

        /** The name of the PlanGroup. */
        fun name(): String = name.getRequired("name")

        /**
         * Optional. This PlanGroup is created as bespoke for the associated Account with this
         * Account ID.
         */
        fun accountId(): Optional<String> = Optional.ofNullable(accountId.getNullable("accountId"))

        /** The short code representing the PlanGroup. */
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

        /** The minimum spend amount for the PlanGroup. */
        fun minimumSpend(): Optional<Double> =
            Optional.ofNullable(minimumSpend.getNullable("minimumSpend"))

        /**
         * Optional. Product ID to attribute the PlanGroup's minimum spend for accounting purposes.
         */
        fun minimumSpendAccountingProductId(): Optional<String> =
            Optional.ofNullable(
                minimumSpendAccountingProductId.getNullable("minimumSpendAccountingProductId")
            )

        /**
         * A boolean flag that determines when the minimum spend is billed. This flag overrides the
         * setting at Organizational level for minimum spend billing in arrears/in advance.
         * - **TRUE** - minimum spend is billed at the start of each billing period.
         * - **FALSE** - minimum spend is billed at the end of each billing period.
         */
        fun minimumSpendBillInAdvance(): Optional<Boolean> =
            Optional.ofNullable(minimumSpendBillInAdvance.getNullable("minimumSpendBillInAdvance"))

        /** Description of the minimum spend, displayed on the bill line item. */
        fun minimumSpendDescription(): Optional<String> =
            Optional.ofNullable(minimumSpendDescription.getNullable("minimumSpendDescription"))

        /** Standing charge amount for the PlanGroup. */
        fun standingCharge(): Optional<Double> =
            Optional.ofNullable(standingCharge.getNullable("standingCharge"))

        /**
         * Optional. Product ID to attribute the PlanGroup's standing charge for accounting
         * purposes.
         */
        fun standingChargeAccountingProductId(): Optional<String> =
            Optional.ofNullable(
                standingChargeAccountingProductId.getNullable("standingChargeAccountingProductId")
            )

        /**
         * A boolean flag that determines when the standing charge is billed. This flag overrides
         * the setting at Organizational level for standing charge billing in arrears/in advance.
         * - **TRUE** - standing charge is billed at the start of each billing period.
         * - **FALSE** - standing charge is billed at the end of each billing period.
         */
        fun standingChargeBillInAdvance(): Optional<Boolean> =
            Optional.ofNullable(
                standingChargeBillInAdvance.getNullable("standingChargeBillInAdvance")
            )

        /** Description of the standing charge, displayed on the bill line item. */
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

        /** Currency code for the PlanGroup (For example, USD). */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /** The name of the PlanGroup. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Optional. This PlanGroup is created as bespoke for the associated Account with this
         * Account ID.
         */
        @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /** The short code representing the PlanGroup. */
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

        /** The minimum spend amount for the PlanGroup. */
        @JsonProperty("minimumSpend")
        @ExcludeMissing
        fun _minimumSpend(): JsonField<Double> = minimumSpend

        /**
         * Optional. Product ID to attribute the PlanGroup's minimum spend for accounting purposes.
         */
        @JsonProperty("minimumSpendAccountingProductId")
        @ExcludeMissing
        fun _minimumSpendAccountingProductId(): JsonField<String> = minimumSpendAccountingProductId

        /**
         * A boolean flag that determines when the minimum spend is billed. This flag overrides the
         * setting at Organizational level for minimum spend billing in arrears/in advance.
         * - **TRUE** - minimum spend is billed at the start of each billing period.
         * - **FALSE** - minimum spend is billed at the end of each billing period.
         */
        @JsonProperty("minimumSpendBillInAdvance")
        @ExcludeMissing
        fun _minimumSpendBillInAdvance(): JsonField<Boolean> = minimumSpendBillInAdvance

        /** Description of the minimum spend, displayed on the bill line item. */
        @JsonProperty("minimumSpendDescription")
        @ExcludeMissing
        fun _minimumSpendDescription(): JsonField<String> = minimumSpendDescription

        /** Standing charge amount for the PlanGroup. */
        @JsonProperty("standingCharge")
        @ExcludeMissing
        fun _standingCharge(): JsonField<Double> = standingCharge

        /**
         * Optional. Product ID to attribute the PlanGroup's standing charge for accounting
         * purposes.
         */
        @JsonProperty("standingChargeAccountingProductId")
        @ExcludeMissing
        fun _standingChargeAccountingProductId(): JsonField<String> =
            standingChargeAccountingProductId

        /**
         * A boolean flag that determines when the standing charge is billed. This flag overrides
         * the setting at Organizational level for standing charge billing in arrears/in advance.
         * - **TRUE** - standing charge is billed at the start of each billing period.
         * - **FALSE** - standing charge is billed at the end of each billing period.
         */
        @JsonProperty("standingChargeBillInAdvance")
        @ExcludeMissing
        fun _standingChargeBillInAdvance(): JsonField<Boolean> = standingChargeBillInAdvance

        /** Description of the standing charge, displayed on the bill line item. */
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

            currency()
            name()
            accountId()
            code()
            customFields().ifPresent { it.validate() }
            minimumSpend()
            minimumSpendAccountingProductId()
            minimumSpendBillInAdvance()
            minimumSpendDescription()
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

            private var currency: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var accountId: JsonField<String> = JsonMissing.of()
            private var code: JsonField<String> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var minimumSpend: JsonField<Double> = JsonMissing.of()
            private var minimumSpendAccountingProductId: JsonField<String> = JsonMissing.of()
            private var minimumSpendBillInAdvance: JsonField<Boolean> = JsonMissing.of()
            private var minimumSpendDescription: JsonField<String> = JsonMissing.of()
            private var standingCharge: JsonField<Double> = JsonMissing.of()
            private var standingChargeAccountingProductId: JsonField<String> = JsonMissing.of()
            private var standingChargeBillInAdvance: JsonField<Boolean> = JsonMissing.of()
            private var standingChargeDescription: JsonField<String> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                currency = body.currency
                name = body.name
                accountId = body.accountId
                code = body.code
                customFields = body.customFields
                minimumSpend = body.minimumSpend
                minimumSpendAccountingProductId = body.minimumSpendAccountingProductId
                minimumSpendBillInAdvance = body.minimumSpendBillInAdvance
                minimumSpendDescription = body.minimumSpendDescription
                standingCharge = body.standingCharge
                standingChargeAccountingProductId = body.standingChargeAccountingProductId
                standingChargeBillInAdvance = body.standingChargeBillInAdvance
                standingChargeDescription = body.standingChargeDescription
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Currency code for the PlanGroup (For example, USD). */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /** Currency code for the PlanGroup (For example, USD). */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** The name of the PlanGroup. */
            fun name(name: String) = name(JsonField.of(name))

            /** The name of the PlanGroup. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Optional. This PlanGroup is created as bespoke for the associated Account with this
             * Account ID.
             */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * Optional. This PlanGroup is created as bespoke for the associated Account with this
             * Account ID.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The short code representing the PlanGroup. */
            fun code(code: String) = code(JsonField.of(code))

            /** The short code representing the PlanGroup. */
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

            /** The minimum spend amount for the PlanGroup. */
            fun minimumSpend(minimumSpend: Double) = minimumSpend(JsonField.of(minimumSpend))

            /** The minimum spend amount for the PlanGroup. */
            fun minimumSpend(minimumSpend: JsonField<Double>) = apply {
                this.minimumSpend = minimumSpend
            }

            /**
             * Optional. Product ID to attribute the PlanGroup's minimum spend for accounting
             * purposes.
             */
            fun minimumSpendAccountingProductId(minimumSpendAccountingProductId: String) =
                minimumSpendAccountingProductId(JsonField.of(minimumSpendAccountingProductId))

            /**
             * Optional. Product ID to attribute the PlanGroup's minimum spend for accounting
             * purposes.
             */
            fun minimumSpendAccountingProductId(
                minimumSpendAccountingProductId: JsonField<String>
            ) = apply { this.minimumSpendAccountingProductId = minimumSpendAccountingProductId }

            /**
             * A boolean flag that determines when the minimum spend is billed. This flag overrides
             * the setting at Organizational level for minimum spend billing in arrears/in advance.
             * - **TRUE** - minimum spend is billed at the start of each billing period.
             * - **FALSE** - minimum spend is billed at the end of each billing period.
             */
            fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: Boolean) =
                minimumSpendBillInAdvance(JsonField.of(minimumSpendBillInAdvance))

            /**
             * A boolean flag that determines when the minimum spend is billed. This flag overrides
             * the setting at Organizational level for minimum spend billing in arrears/in advance.
             * - **TRUE** - minimum spend is billed at the start of each billing period.
             * - **FALSE** - minimum spend is billed at the end of each billing period.
             */
            fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: JsonField<Boolean>) = apply {
                this.minimumSpendBillInAdvance = minimumSpendBillInAdvance
            }

            /** Description of the minimum spend, displayed on the bill line item. */
            fun minimumSpendDescription(minimumSpendDescription: String) =
                minimumSpendDescription(JsonField.of(minimumSpendDescription))

            /** Description of the minimum spend, displayed on the bill line item. */
            fun minimumSpendDescription(minimumSpendDescription: JsonField<String>) = apply {
                this.minimumSpendDescription = minimumSpendDescription
            }

            /** Standing charge amount for the PlanGroup. */
            fun standingCharge(standingCharge: Double) =
                standingCharge(JsonField.of(standingCharge))

            /** Standing charge amount for the PlanGroup. */
            fun standingCharge(standingCharge: JsonField<Double>) = apply {
                this.standingCharge = standingCharge
            }

            /**
             * Optional. Product ID to attribute the PlanGroup's standing charge for accounting
             * purposes.
             */
            fun standingChargeAccountingProductId(standingChargeAccountingProductId: String) =
                standingChargeAccountingProductId(JsonField.of(standingChargeAccountingProductId))

            /**
             * Optional. Product ID to attribute the PlanGroup's standing charge for accounting
             * purposes.
             */
            fun standingChargeAccountingProductId(
                standingChargeAccountingProductId: JsonField<String>
            ) = apply { this.standingChargeAccountingProductId = standingChargeAccountingProductId }

            /**
             * A boolean flag that determines when the standing charge is billed. This flag
             * overrides the setting at Organizational level for standing charge billing in
             * arrears/in advance.
             * - **TRUE** - standing charge is billed at the start of each billing period.
             * - **FALSE** - standing charge is billed at the end of each billing period.
             */
            fun standingChargeBillInAdvance(standingChargeBillInAdvance: Boolean) =
                standingChargeBillInAdvance(JsonField.of(standingChargeBillInAdvance))

            /**
             * A boolean flag that determines when the standing charge is billed. This flag
             * overrides the setting at Organizational level for standing charge billing in
             * arrears/in advance.
             * - **TRUE** - standing charge is billed at the start of each billing period.
             * - **FALSE** - standing charge is billed at the end of each billing period.
             */
            fun standingChargeBillInAdvance(standingChargeBillInAdvance: JsonField<Boolean>) =
                apply {
                    this.standingChargeBillInAdvance = standingChargeBillInAdvance
                }

            /** Description of the standing charge, displayed on the bill line item. */
            fun standingChargeDescription(standingChargeDescription: String) =
                standingChargeDescription(JsonField.of(standingChargeDescription))

            /** Description of the standing charge, displayed on the bill line item. */
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
                    checkRequired("currency", currency),
                    checkRequired("name", name),
                    accountId,
                    code,
                    customFields,
                    minimumSpend,
                    minimumSpendAccountingProductId,
                    minimumSpendBillInAdvance,
                    minimumSpendDescription,
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

            return /* spotless:off */ other is Body && currency == other.currency && name == other.name && accountId == other.accountId && code == other.code && customFields == other.customFields && minimumSpend == other.minimumSpend && minimumSpendAccountingProductId == other.minimumSpendAccountingProductId && minimumSpendBillInAdvance == other.minimumSpendBillInAdvance && minimumSpendDescription == other.minimumSpendDescription && standingCharge == other.standingCharge && standingChargeAccountingProductId == other.standingChargeAccountingProductId && standingChargeBillInAdvance == other.standingChargeBillInAdvance && standingChargeDescription == other.standingChargeDescription && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(currency, name, accountId, code, customFields, minimumSpend, minimumSpendAccountingProductId, minimumSpendBillInAdvance, minimumSpendDescription, standingCharge, standingChargeAccountingProductId, standingChargeBillInAdvance, standingChargeDescription, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{currency=$currency, name=$name, accountId=$accountId, code=$code, customFields=$customFields, minimumSpend=$minimumSpend, minimumSpendAccountingProductId=$minimumSpendAccountingProductId, minimumSpendBillInAdvance=$minimumSpendBillInAdvance, minimumSpendDescription=$minimumSpendDescription, standingCharge=$standingCharge, standingChargeAccountingProductId=$standingChargeAccountingProductId, standingChargeBillInAdvance=$standingChargeBillInAdvance, standingChargeDescription=$standingChargeDescription, version=$version, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PlanGroupCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(planGroupCreateParams: PlanGroupCreateParams) = apply {
            orgId = planGroupCreateParams.orgId
            body = planGroupCreateParams.body.toBuilder()
            additionalHeaders = planGroupCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = planGroupCreateParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /** Currency code for the PlanGroup (For example, USD). */
        fun currency(currency: String) = apply { body.currency(currency) }

        /** Currency code for the PlanGroup (For example, USD). */
        fun currency(currency: JsonField<String>) = apply { body.currency(currency) }

        /** The name of the PlanGroup. */
        fun name(name: String) = apply { body.name(name) }

        /** The name of the PlanGroup. */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * Optional. This PlanGroup is created as bespoke for the associated Account with this
         * Account ID.
         */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /**
         * Optional. This PlanGroup is created as bespoke for the associated Account with this
         * Account ID.
         */
        fun accountId(accountId: JsonField<String>) = apply { body.accountId(accountId) }

        /** The short code representing the PlanGroup. */
        fun code(code: String) = apply { body.code(code) }

        /** The short code representing the PlanGroup. */
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

        /** The minimum spend amount for the PlanGroup. */
        fun minimumSpend(minimumSpend: Double) = apply { body.minimumSpend(minimumSpend) }

        /** The minimum spend amount for the PlanGroup. */
        fun minimumSpend(minimumSpend: JsonField<Double>) = apply {
            body.minimumSpend(minimumSpend)
        }

        /**
         * Optional. Product ID to attribute the PlanGroup's minimum spend for accounting purposes.
         */
        fun minimumSpendAccountingProductId(minimumSpendAccountingProductId: String) = apply {
            body.minimumSpendAccountingProductId(minimumSpendAccountingProductId)
        }

        /**
         * Optional. Product ID to attribute the PlanGroup's minimum spend for accounting purposes.
         */
        fun minimumSpendAccountingProductId(minimumSpendAccountingProductId: JsonField<String>) =
            apply {
                body.minimumSpendAccountingProductId(minimumSpendAccountingProductId)
            }

        /**
         * A boolean flag that determines when the minimum spend is billed. This flag overrides the
         * setting at Organizational level for minimum spend billing in arrears/in advance.
         * - **TRUE** - minimum spend is billed at the start of each billing period.
         * - **FALSE** - minimum spend is billed at the end of each billing period.
         */
        fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: Boolean) = apply {
            body.minimumSpendBillInAdvance(minimumSpendBillInAdvance)
        }

        /**
         * A boolean flag that determines when the minimum spend is billed. This flag overrides the
         * setting at Organizational level for minimum spend billing in arrears/in advance.
         * - **TRUE** - minimum spend is billed at the start of each billing period.
         * - **FALSE** - minimum spend is billed at the end of each billing period.
         */
        fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: JsonField<Boolean>) = apply {
            body.minimumSpendBillInAdvance(minimumSpendBillInAdvance)
        }

        /** Description of the minimum spend, displayed on the bill line item. */
        fun minimumSpendDescription(minimumSpendDescription: String) = apply {
            body.minimumSpendDescription(minimumSpendDescription)
        }

        /** Description of the minimum spend, displayed on the bill line item. */
        fun minimumSpendDescription(minimumSpendDescription: JsonField<String>) = apply {
            body.minimumSpendDescription(minimumSpendDescription)
        }

        /** Standing charge amount for the PlanGroup. */
        fun standingCharge(standingCharge: Double) = apply { body.standingCharge(standingCharge) }

        /** Standing charge amount for the PlanGroup. */
        fun standingCharge(standingCharge: JsonField<Double>) = apply {
            body.standingCharge(standingCharge)
        }

        /**
         * Optional. Product ID to attribute the PlanGroup's standing charge for accounting
         * purposes.
         */
        fun standingChargeAccountingProductId(standingChargeAccountingProductId: String) = apply {
            body.standingChargeAccountingProductId(standingChargeAccountingProductId)
        }

        /**
         * Optional. Product ID to attribute the PlanGroup's standing charge for accounting
         * purposes.
         */
        fun standingChargeAccountingProductId(
            standingChargeAccountingProductId: JsonField<String>
        ) = apply { body.standingChargeAccountingProductId(standingChargeAccountingProductId) }

        /**
         * A boolean flag that determines when the standing charge is billed. This flag overrides
         * the setting at Organizational level for standing charge billing in arrears/in advance.
         * - **TRUE** - standing charge is billed at the start of each billing period.
         * - **FALSE** - standing charge is billed at the end of each billing period.
         */
        fun standingChargeBillInAdvance(standingChargeBillInAdvance: Boolean) = apply {
            body.standingChargeBillInAdvance(standingChargeBillInAdvance)
        }

        /**
         * A boolean flag that determines when the standing charge is billed. This flag overrides
         * the setting at Organizational level for standing charge billing in arrears/in advance.
         * - **TRUE** - standing charge is billed at the start of each billing period.
         * - **FALSE** - standing charge is billed at the end of each billing period.
         */
        fun standingChargeBillInAdvance(standingChargeBillInAdvance: JsonField<Boolean>) = apply {
            body.standingChargeBillInAdvance(standingChargeBillInAdvance)
        }

        /** Description of the standing charge, displayed on the bill line item. */
        fun standingChargeDescription(standingChargeDescription: String) = apply {
            body.standingChargeDescription(standingChargeDescription)
        }

        /** Description of the standing charge, displayed on the bill line item. */
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

        fun build(): PlanGroupCreateParams =
            PlanGroupCreateParams(
                checkRequired("orgId", orgId),
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

        return /* spotless:off */ other is PlanGroupCreateParams && orgId == other.orgId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PlanGroupCreateParams{orgId=$orgId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
