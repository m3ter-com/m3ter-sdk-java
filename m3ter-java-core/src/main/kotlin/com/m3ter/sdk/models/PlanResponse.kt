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
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class PlanResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("accountId")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("bespoke")
    @ExcludeMissing
    private val bespoke: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("code") @ExcludeMissing private val code: JsonField<String> = JsonMissing.of(),
    @JsonProperty("createdBy")
    @ExcludeMissing
    private val createdBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("customFields")
    @ExcludeMissing
    private val customFields: JsonField<CustomFields> = JsonMissing.of(),
    @JsonProperty("dtCreated")
    @ExcludeMissing
    private val dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    private val dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    private val lastModifiedBy: JsonField<String> = JsonMissing.of(),
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
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ordinal")
    @ExcludeMissing
    private val ordinal: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("planTemplateId")
    @ExcludeMissing
    private val planTemplateId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("productId")
    @ExcludeMissing
    private val productId: JsonField<String> = JsonMissing.of(),
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

    /**
     * _(Optional)_. The Account ID for which this plan was created as custom/bespoke. A
     * custom/bespoke Plan can only be attached to the specified Account.
     */
    fun accountId(): Optional<String> = Optional.ofNullable(accountId.getNullable("accountId"))

    /** TRUE/FALSE flag indicating whether the plan is custom/bespoke for a particular Account. */
    fun bespoke(): Optional<Boolean> = Optional.ofNullable(bespoke.getNullable("bespoke"))

    /** Unique short code reference for the Plan. */
    fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

    /** The id of the user who created this plan. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /**
     * User defined fields enabling you to attach custom data. The value for a custom field can be
     * either a string or a number.
     *
     * If `customFields` can also be defined for this entity at the Organizational
     * level,`customField` values defined at individual level override values of `customFields` with
     * the same name defined at Organization level.
     *
     * See
     * [Working with Custom Fields](https://www.m3ter.com/docs/guides/creating-and-managing-products/working-with-custom-fields)
     * in the m3ter documentation for more information.
     */
    fun customFields(): Optional<CustomFields> =
        Optional.ofNullable(customFields.getNullable("customFields"))

    /** The DateTime _(in ISO-8601 format)_ when the plan was created. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /** The DateTime _(in ISO-8601 format)_ when the plan was last modified. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /** The id of the user who last modified this plan. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /**
     * The product minimum spend amount per billing cycle for end customer Accounts on a priced
     * Plan.
     *
     * _(Optional)_. Overrides PlanTemplate value.
     */
    fun minimumSpend(): Optional<Double> =
        Optional.ofNullable(minimumSpend.getNullable("minimumSpend"))

    /**
     * Optional Product ID this plan's minimum spend should be attributed to for accounting purposes
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

    /** Descriptive name for the Plan. */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /**
     * Assigns a rank or position to the Plan in your order of pricing plans - lower numbers
     * represent more basic pricing plans; higher numbers represent more premium pricing plans.
     *
     * _(Optional)_. Overrides PlanTemplate value.
     *
     * **NOTE:** **DEPRECATED** - no longer used.
     */
    fun ordinal(): Optional<Long> = Optional.ofNullable(ordinal.getNullable("ordinal"))

    /** UUID of the PlanTemplate the Plan belongs to. */
    fun planTemplateId(): Optional<String> =
        Optional.ofNullable(planTemplateId.getNullable("planTemplateId"))

    /** UUID of the Product the Plan belongs to. */
    fun productId(): Optional<String> = Optional.ofNullable(productId.getNullable("productId"))

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
        Optional.ofNullable(standingChargeBillInAdvance.getNullable("standingChargeBillInAdvance"))

    /** Standing charge description _(displayed on the bill line item)_. */
    fun standingChargeDescription(): Optional<String> =
        Optional.ofNullable(standingChargeDescription.getNullable("standingChargeDescription"))

    /** The UUID of the entity. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    /**
     * _(Optional)_. The Account ID for which this plan was created as custom/bespoke. A
     * custom/bespoke Plan can only be attached to the specified Account.
     */
    @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /** TRUE/FALSE flag indicating whether the plan is custom/bespoke for a particular Account. */
    @JsonProperty("bespoke") @ExcludeMissing fun _bespoke(): JsonField<Boolean> = bespoke

    /** Unique short code reference for the Plan. */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /** The id of the user who created this plan. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * User defined fields enabling you to attach custom data. The value for a custom field can be
     * either a string or a number.
     *
     * If `customFields` can also be defined for this entity at the Organizational
     * level,`customField` values defined at individual level override values of `customFields` with
     * the same name defined at Organization level.
     *
     * See
     * [Working with Custom Fields](https://www.m3ter.com/docs/guides/creating-and-managing-products/working-with-custom-fields)
     * in the m3ter documentation for more information.
     */
    @JsonProperty("customFields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    /** The DateTime _(in ISO-8601 format)_ when the plan was created. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /** The DateTime _(in ISO-8601 format)_ when the plan was last modified. */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /** The id of the user who last modified this plan. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

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
     * Optional Product ID this plan's minimum spend should be attributed to for accounting purposes
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

    /** Descriptive name for the Plan. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Assigns a rank or position to the Plan in your order of pricing plans - lower numbers
     * represent more basic pricing plans; higher numbers represent more premium pricing plans.
     *
     * _(Optional)_. Overrides PlanTemplate value.
     *
     * **NOTE:** **DEPRECATED** - no longer used.
     */
    @JsonProperty("ordinal") @ExcludeMissing fun _ordinal(): JsonField<Long> = ordinal

    /** UUID of the PlanTemplate the Plan belongs to. */
    @JsonProperty("planTemplateId")
    @ExcludeMissing
    fun _planTemplateId(): JsonField<String> = planTemplateId

    /** UUID of the Product the Plan belongs to. */
    @JsonProperty("productId") @ExcludeMissing fun _productId(): JsonField<String> = productId

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
    fun _standingChargeAccountingProductId(): JsonField<String> = standingChargeAccountingProductId

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

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PlanResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        version()
        accountId()
        bespoke()
        code()
        createdBy()
        customFields().ifPresent { it.validate() }
        dtCreated()
        dtLastModified()
        lastModifiedBy()
        minimumSpend()
        minimumSpendAccountingProductId()
        minimumSpendBillInAdvance()
        minimumSpendDescription()
        name()
        ordinal()
        planTemplateId()
        productId()
        standingCharge()
        standingChargeAccountingProductId()
        standingChargeBillInAdvance()
        standingChargeDescription()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PlanResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var accountId: JsonField<String> = JsonMissing.of()
        private var bespoke: JsonField<Boolean> = JsonMissing.of()
        private var code: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var minimumSpend: JsonField<Double> = JsonMissing.of()
        private var minimumSpendAccountingProductId: JsonField<String> = JsonMissing.of()
        private var minimumSpendBillInAdvance: JsonField<Boolean> = JsonMissing.of()
        private var minimumSpendDescription: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var ordinal: JsonField<Long> = JsonMissing.of()
        private var planTemplateId: JsonField<String> = JsonMissing.of()
        private var productId: JsonField<String> = JsonMissing.of()
        private var standingCharge: JsonField<Double> = JsonMissing.of()
        private var standingChargeAccountingProductId: JsonField<String> = JsonMissing.of()
        private var standingChargeBillInAdvance: JsonField<Boolean> = JsonMissing.of()
        private var standingChargeDescription: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(planResponse: PlanResponse) = apply {
            id = planResponse.id
            version = planResponse.version
            accountId = planResponse.accountId
            bespoke = planResponse.bespoke
            code = planResponse.code
            createdBy = planResponse.createdBy
            customFields = planResponse.customFields
            dtCreated = planResponse.dtCreated
            dtLastModified = planResponse.dtLastModified
            lastModifiedBy = planResponse.lastModifiedBy
            minimumSpend = planResponse.minimumSpend
            minimumSpendAccountingProductId = planResponse.minimumSpendAccountingProductId
            minimumSpendBillInAdvance = planResponse.minimumSpendBillInAdvance
            minimumSpendDescription = planResponse.minimumSpendDescription
            name = planResponse.name
            ordinal = planResponse.ordinal
            planTemplateId = planResponse.planTemplateId
            productId = planResponse.productId
            standingCharge = planResponse.standingCharge
            standingChargeAccountingProductId = planResponse.standingChargeAccountingProductId
            standingChargeBillInAdvance = planResponse.standingChargeBillInAdvance
            standingChargeDescription = planResponse.standingChargeDescription
            additionalProperties = planResponse.additionalProperties.toMutableMap()
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
         * _(Optional)_. The Account ID for which this plan was created as custom/bespoke. A
         * custom/bespoke Plan can only be attached to the specified Account.
         */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * _(Optional)_. The Account ID for which this plan was created as custom/bespoke. A
         * custom/bespoke Plan can only be attached to the specified Account.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * TRUE/FALSE flag indicating whether the plan is custom/bespoke for a particular Account.
         */
        fun bespoke(bespoke: Boolean) = bespoke(JsonField.of(bespoke))

        /**
         * TRUE/FALSE flag indicating whether the plan is custom/bespoke for a particular Account.
         */
        fun bespoke(bespoke: JsonField<Boolean>) = apply { this.bespoke = bespoke }

        /** Unique short code reference for the Plan. */
        fun code(code: String) = code(JsonField.of(code))

        /** Unique short code reference for the Plan. */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** The id of the user who created this plan. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The id of the user who created this plan. */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /**
         * User defined fields enabling you to attach custom data. The value for a custom field can
         * be either a string or a number.
         *
         * If `customFields` can also be defined for this entity at the Organizational
         * level,`customField` values defined at individual level override values of `customFields`
         * with the same name defined at Organization level.
         *
         * See
         * [Working with Custom Fields](https://www.m3ter.com/docs/guides/creating-and-managing-products/working-with-custom-fields)
         * in the m3ter documentation for more information.
         */
        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        /**
         * User defined fields enabling you to attach custom data. The value for a custom field can
         * be either a string or a number.
         *
         * If `customFields` can also be defined for this entity at the Organizational
         * level,`customField` values defined at individual level override values of `customFields`
         * with the same name defined at Organization level.
         *
         * See
         * [Working with Custom Fields](https://www.m3ter.com/docs/guides/creating-and-managing-products/working-with-custom-fields)
         * in the m3ter documentation for more information.
         */
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
        }

        /** The DateTime _(in ISO-8601 format)_ when the plan was created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /** The DateTime _(in ISO-8601 format)_ when the plan was created. */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The DateTime _(in ISO-8601 format)_ when the plan was last modified. */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /** The DateTime _(in ISO-8601 format)_ when the plan was last modified. */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        /** The id of the user who last modified this plan. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The id of the user who last modified this plan. */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
        }

        /**
         * The product minimum spend amount per billing cycle for end customer Accounts on a priced
         * Plan.
         *
         * _(Optional)_. Overrides PlanTemplate value.
         */
        fun minimumSpend(minimumSpend: Double) = minimumSpend(JsonField.of(minimumSpend))

        /**
         * The product minimum spend amount per billing cycle for end customer Accounts on a priced
         * Plan.
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
        fun minimumSpendAccountingProductId(minimumSpendAccountingProductId: JsonField<String>) =
            apply {
                this.minimumSpendAccountingProductId = minimumSpendAccountingProductId
            }

        /**
         * When TRUE, minimum spend is billed at the start of each billing period.
         *
         * When FALSE, minimum spend is billed at the end of each billing period.
         *
         * _(Optional)_. Overrides the setting at PlanTemplate level for minimum spend billing in
         * arrears/in advance.
         */
        fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: Boolean) =
            minimumSpendBillInAdvance(JsonField.of(minimumSpendBillInAdvance))

        /**
         * When TRUE, minimum spend is billed at the start of each billing period.
         *
         * When FALSE, minimum spend is billed at the end of each billing period.
         *
         * _(Optional)_. Overrides the setting at PlanTemplate level for minimum spend billing in
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

        /** Descriptive name for the Plan. */
        fun name(name: String) = name(JsonField.of(name))

        /** Descriptive name for the Plan. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Assigns a rank or position to the Plan in your order of pricing plans - lower numbers
         * represent more basic pricing plans; higher numbers represent more premium pricing plans.
         *
         * _(Optional)_. Overrides PlanTemplate value.
         *
         * **NOTE:** **DEPRECATED** - no longer used.
         */
        fun ordinal(ordinal: Long) = ordinal(JsonField.of(ordinal))

        /**
         * Assigns a rank or position to the Plan in your order of pricing plans - lower numbers
         * represent more basic pricing plans; higher numbers represent more premium pricing plans.
         *
         * _(Optional)_. Overrides PlanTemplate value.
         *
         * **NOTE:** **DEPRECATED** - no longer used.
         */
        fun ordinal(ordinal: JsonField<Long>) = apply { this.ordinal = ordinal }

        /** UUID of the PlanTemplate the Plan belongs to. */
        fun planTemplateId(planTemplateId: String) = planTemplateId(JsonField.of(planTemplateId))

        /** UUID of the PlanTemplate the Plan belongs to. */
        fun planTemplateId(planTemplateId: JsonField<String>) = apply {
            this.planTemplateId = planTemplateId
        }

        /** UUID of the Product the Plan belongs to. */
        fun productId(productId: String) = productId(JsonField.of(productId))

        /** UUID of the Product the Plan belongs to. */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        /**
         * The standing charge applied to bills for end customers. This is prorated.
         *
         * _(Optional)_. Overrides PlanTemplate value.
         */
        fun standingCharge(standingCharge: Double) = standingCharge(JsonField.of(standingCharge))

        /**
         * The standing charge applied to bills for end customers. This is prorated.
         *
         * _(Optional)_. Overrides PlanTemplate value.
         */
        fun standingCharge(standingCharge: JsonField<Double>) = apply {
            this.standingCharge = standingCharge
        }

        /**
         * Optional Product ID this plan's standing charge should be attributed to for accounting
         * purposes
         */
        fun standingChargeAccountingProductId(standingChargeAccountingProductId: String) =
            standingChargeAccountingProductId(JsonField.of(standingChargeAccountingProductId))

        /**
         * Optional Product ID this plan's standing charge should be attributed to for accounting
         * purposes
         */
        fun standingChargeAccountingProductId(
            standingChargeAccountingProductId: JsonField<String>
        ) = apply { this.standingChargeAccountingProductId = standingChargeAccountingProductId }

        /**
         * When TRUE, standing charge is billed at the start of each billing period.
         *
         * When FALSE, standing charge is billed at the end of each billing period.
         *
         * _(Optional)_. Overrides the setting at PlanTemplate level for standing charge billing in
         * arrears/in advance.
         */
        fun standingChargeBillInAdvance(standingChargeBillInAdvance: Boolean) =
            standingChargeBillInAdvance(JsonField.of(standingChargeBillInAdvance))

        /**
         * When TRUE, standing charge is billed at the start of each billing period.
         *
         * When FALSE, standing charge is billed at the end of each billing period.
         *
         * _(Optional)_. Overrides the setting at PlanTemplate level for standing charge billing in
         * arrears/in advance.
         */
        fun standingChargeBillInAdvance(standingChargeBillInAdvance: JsonField<Boolean>) = apply {
            this.standingChargeBillInAdvance = standingChargeBillInAdvance
        }

        /** Standing charge description _(displayed on the bill line item)_. */
        fun standingChargeDescription(standingChargeDescription: String) =
            standingChargeDescription(JsonField.of(standingChargeDescription))

        /** Standing charge description _(displayed on the bill line item)_. */
        fun standingChargeDescription(standingChargeDescription: JsonField<String>) = apply {
            this.standingChargeDescription = standingChargeDescription
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

        fun build(): PlanResponse =
            PlanResponse(
                checkRequired("id", id),
                checkRequired("version", version),
                accountId,
                bespoke,
                code,
                createdBy,
                customFields,
                dtCreated,
                dtLastModified,
                lastModifiedBy,
                minimumSpend,
                minimumSpendAccountingProductId,
                minimumSpendBillInAdvance,
                minimumSpendDescription,
                name,
                ordinal,
                planTemplateId,
                productId,
                standingCharge,
                standingChargeAccountingProductId,
                standingChargeBillInAdvance,
                standingChargeDescription,
                additionalProperties.toImmutable(),
            )
    }

    /**
     * User defined fields enabling you to attach custom data. The value for a custom field can be
     * either a string or a number.
     *
     * If `customFields` can also be defined for this entity at the Organizational
     * level,`customField` values defined at individual level override values of `customFields` with
     * the same name defined at Organization level.
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

        return /* spotless:off */ other is PlanResponse && id == other.id && version == other.version && accountId == other.accountId && bespoke == other.bespoke && code == other.code && createdBy == other.createdBy && customFields == other.customFields && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && lastModifiedBy == other.lastModifiedBy && minimumSpend == other.minimumSpend && minimumSpendAccountingProductId == other.minimumSpendAccountingProductId && minimumSpendBillInAdvance == other.minimumSpendBillInAdvance && minimumSpendDescription == other.minimumSpendDescription && name == other.name && ordinal == other.ordinal && planTemplateId == other.planTemplateId && productId == other.productId && standingCharge == other.standingCharge && standingChargeAccountingProductId == other.standingChargeAccountingProductId && standingChargeBillInAdvance == other.standingChargeBillInAdvance && standingChargeDescription == other.standingChargeDescription && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, accountId, bespoke, code, createdBy, customFields, dtCreated, dtLastModified, lastModifiedBy, minimumSpend, minimumSpendAccountingProductId, minimumSpendBillInAdvance, minimumSpendDescription, name, ordinal, planTemplateId, productId, standingCharge, standingChargeAccountingProductId, standingChargeBillInAdvance, standingChargeDescription, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlanResponse{id=$id, version=$version, accountId=$accountId, bespoke=$bespoke, code=$code, createdBy=$createdBy, customFields=$customFields, dtCreated=$dtCreated, dtLastModified=$dtLastModified, lastModifiedBy=$lastModifiedBy, minimumSpend=$minimumSpend, minimumSpendAccountingProductId=$minimumSpendAccountingProductId, minimumSpendBillInAdvance=$minimumSpendBillInAdvance, minimumSpendDescription=$minimumSpendDescription, name=$name, ordinal=$ordinal, planTemplateId=$planTemplateId, productId=$productId, standingCharge=$standingCharge, standingChargeAccountingProductId=$standingChargeAccountingProductId, standingChargeBillInAdvance=$standingChargeBillInAdvance, standingChargeDescription=$standingChargeDescription, additionalProperties=$additionalProperties}"
}
