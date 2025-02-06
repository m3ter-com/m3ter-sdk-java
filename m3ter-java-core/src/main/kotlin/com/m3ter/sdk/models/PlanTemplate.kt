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
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class PlanTemplate
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("billFrequency")
    @ExcludeMissing
    private val billFrequency: JsonField<BillFrequency> = JsonMissing.of(),
    @JsonProperty("billFrequencyInterval")
    @ExcludeMissing
    private val billFrequencyInterval: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("code") @ExcludeMissing private val code: JsonField<String> = JsonMissing.of(),
    @JsonProperty("createdBy")
    @ExcludeMissing
    private val createdBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
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
    @JsonProperty("productId")
    @ExcludeMissing
    private val productId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("standingCharge")
    @ExcludeMissing
    private val standingCharge: JsonField<Double> = JsonMissing.of(),
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
     * Determines the frequency at which bills are generated.
     * - **Daily**. Starting at midnight each day, covering the twenty-four hour period following.
     * - **Weekly**. Starting at midnight on a Monday, covering the seven-day period following.
     * - **Monthly**. Starting at midnight on the first day of each month, covering the entire
     *   calendar month following.
     * - **Annually**. Starting at midnight on first day of each year covering the entire calendar
     *   year following.
     */
    fun billFrequency(): Optional<BillFrequency> =
        Optional.ofNullable(billFrequency.getNullable("billFrequency"))

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

    /** The unique identifier (UUID) of the user who created this PlanTemplate. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /**
     * The ISO currency code for the pricing currency used by Plans based on the Plan Template to
     * define charge rates for Product consumption - for example USD, GBP, EUR.
     */
    fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

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

    /** The date and time _(in ISO-8601 format)_ when the PlanTemplate was created. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /** The date and time _(in ISO-8601 format)_ when the PlanTemplate was last modified. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /** The unique identifier (UUID) of the user who last modified this PlanTemplate. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

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

    /** Descriptive name for the PlanTemplate. */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /**
     * The ranking of the PlanTemplate among your pricing plans. Lower numbers represent more basic
     * plans, while higher numbers represent premium plans. This must be a non-negative integer.
     *
     * **NOTE:** **DEPRECATED** - no longer used.
     */
    fun ordinal(): Optional<Long> = Optional.ofNullable(ordinal.getNullable("ordinal"))

    /** The unique identifier (UUID) of the Product associated with this PlanTemplate. */
    fun productId(): Optional<String> = Optional.ofNullable(productId.getNullable("productId"))

    /**
     * The fixed charge _(standing charge)_ applied to customer bills. This charge is prorated and
     * must be a non-negative number.
     */
    fun standingCharge(): Optional<Double> =
        Optional.ofNullable(standingCharge.getNullable("standingCharge"))

    /**
     * A boolean that determines when the standing charge is billed.
     * - TRUE - standing charge is billed at the start of each billing period.
     * - FALSE - standing charge is billed at the end of each billing period.
     *
     * Overrides the setting at Organizational level for standing charge billing in arrears/in
     * advance.
     */
    fun standingChargeBillInAdvance(): Optional<Boolean> =
        Optional.ofNullable(standingChargeBillInAdvance.getNullable("standingChargeBillInAdvance"))

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
     * Defines an offset for when the standing charge is first applied. For example, if the bill is
     * issued every three months and the `standingChargeOfset` is 0, then the charge is applied to
     * the first bill _(at three months)_; if 1, it would be applied to the second bill _(at six
     * months)_, and so on.
     */
    fun standingChargeOffset(): Optional<Long> =
        Optional.ofNullable(standingChargeOffset.getNullable("standingChargeOffset"))

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
     * Determines the frequency at which bills are generated.
     * - **Daily**. Starting at midnight each day, covering the twenty-four hour period following.
     * - **Weekly**. Starting at midnight on a Monday, covering the seven-day period following.
     * - **Monthly**. Starting at midnight on the first day of each month, covering the entire
     *   calendar month following.
     * - **Annually**. Starting at midnight on first day of each year covering the entire calendar
     *   year following.
     */
    @JsonProperty("billFrequency")
    @ExcludeMissing
    fun _billFrequency(): JsonField<BillFrequency> = billFrequency

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

    /** The unique identifier (UUID) of the user who created this PlanTemplate. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * The ISO currency code for the pricing currency used by Plans based on the Plan Template to
     * define charge rates for Product consumption - for example USD, GBP, EUR.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

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

    /** The date and time _(in ISO-8601 format)_ when the PlanTemplate was created. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /** The date and time _(in ISO-8601 format)_ when the PlanTemplate was last modified. */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /** The unique identifier (UUID) of the user who last modified this PlanTemplate. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

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

    /** Descriptive name for the PlanTemplate. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * The ranking of the PlanTemplate among your pricing plans. Lower numbers represent more basic
     * plans, while higher numbers represent premium plans. This must be a non-negative integer.
     *
     * **NOTE:** **DEPRECATED** - no longer used.
     */
    @JsonProperty("ordinal") @ExcludeMissing fun _ordinal(): JsonField<Long> = ordinal

    /** The unique identifier (UUID) of the Product associated with this PlanTemplate. */
    @JsonProperty("productId") @ExcludeMissing fun _productId(): JsonField<String> = productId

    /**
     * The fixed charge _(standing charge)_ applied to customer bills. This charge is prorated and
     * must be a non-negative number.
     */
    @JsonProperty("standingCharge")
    @ExcludeMissing
    fun _standingCharge(): JsonField<Double> = standingCharge

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
     * Defines an offset for when the standing charge is first applied. For example, if the bill is
     * issued every three months and the `standingChargeOfset` is 0, then the charge is applied to
     * the first bill _(at three months)_; if 1, it would be applied to the second bill _(at six
     * months)_, and so on.
     */
    @JsonProperty("standingChargeOffset")
    @ExcludeMissing
    fun _standingChargeOffset(): JsonField<Long> = standingChargeOffset

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PlanTemplate = apply {
        if (validated) {
            return@apply
        }

        id()
        version()
        billFrequency()
        billFrequencyInterval()
        code()
        createdBy()
        currency()
        customFields().ifPresent { it.validate() }
        dtCreated()
        dtLastModified()
        lastModifiedBy()
        minimumSpend()
        minimumSpendBillInAdvance()
        minimumSpendDescription()
        name()
        ordinal()
        productId()
        standingCharge()
        standingChargeBillInAdvance()
        standingChargeDescription()
        standingChargeInterval()
        standingChargeOffset()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PlanTemplate]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var billFrequency: JsonField<BillFrequency> = JsonMissing.of()
        private var billFrequencyInterval: JsonField<Long> = JsonMissing.of()
        private var code: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var minimumSpend: JsonField<Double> = JsonMissing.of()
        private var minimumSpendBillInAdvance: JsonField<Boolean> = JsonMissing.of()
        private var minimumSpendDescription: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var ordinal: JsonField<Long> = JsonMissing.of()
        private var productId: JsonField<String> = JsonMissing.of()
        private var standingCharge: JsonField<Double> = JsonMissing.of()
        private var standingChargeBillInAdvance: JsonField<Boolean> = JsonMissing.of()
        private var standingChargeDescription: JsonField<String> = JsonMissing.of()
        private var standingChargeInterval: JsonField<Long> = JsonMissing.of()
        private var standingChargeOffset: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(planTemplate: PlanTemplate) = apply {
            id = planTemplate.id
            version = planTemplate.version
            billFrequency = planTemplate.billFrequency
            billFrequencyInterval = planTemplate.billFrequencyInterval
            code = planTemplate.code
            createdBy = planTemplate.createdBy
            currency = planTemplate.currency
            customFields = planTemplate.customFields
            dtCreated = planTemplate.dtCreated
            dtLastModified = planTemplate.dtLastModified
            lastModifiedBy = planTemplate.lastModifiedBy
            minimumSpend = planTemplate.minimumSpend
            minimumSpendBillInAdvance = planTemplate.minimumSpendBillInAdvance
            minimumSpendDescription = planTemplate.minimumSpendDescription
            name = planTemplate.name
            ordinal = planTemplate.ordinal
            productId = planTemplate.productId
            standingCharge = planTemplate.standingCharge
            standingChargeBillInAdvance = planTemplate.standingChargeBillInAdvance
            standingChargeDescription = planTemplate.standingChargeDescription
            standingChargeInterval = planTemplate.standingChargeInterval
            standingChargeOffset = planTemplate.standingChargeOffset
            additionalProperties = planTemplate.additionalProperties.toMutableMap()
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
         * Determines the frequency at which bills are generated.
         * - **Daily**. Starting at midnight each day, covering the twenty-four hour period
         *   following.
         * - **Weekly**. Starting at midnight on a Monday, covering the seven-day period following.
         * - **Monthly**. Starting at midnight on the first day of each month, covering the entire
         *   calendar month following.
         * - **Annually**. Starting at midnight on first day of each year covering the entire
         *   calendar year following.
         */
        fun billFrequency(billFrequency: BillFrequency) = billFrequency(JsonField.of(billFrequency))

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
            this.billFrequency = billFrequency
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
         * A unique, short code reference for the PlanTemplate. This code should not contain control
         * characters or spaces.
         */
        fun code(code: String) = code(JsonField.of(code))

        /**
         * A unique, short code reference for the PlanTemplate. This code should not contain control
         * characters or spaces.
         */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** The unique identifier (UUID) of the user who created this PlanTemplate. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The unique identifier (UUID) of the user who created this PlanTemplate. */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /**
         * The ISO currency code for the pricing currency used by Plans based on the Plan Template
         * to define charge rates for Product consumption - for example USD, GBP, EUR.
         */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * The ISO currency code for the pricing currency used by Plans based on the Plan Template
         * to define charge rates for Product consumption - for example USD, GBP, EUR.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

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

        /** The date and time _(in ISO-8601 format)_ when the PlanTemplate was created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /** The date and time _(in ISO-8601 format)_ when the PlanTemplate was created. */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The date and time _(in ISO-8601 format)_ when the PlanTemplate was last modified. */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /** The date and time _(in ISO-8601 format)_ when the PlanTemplate was last modified. */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        /** The unique identifier (UUID) of the user who last modified this PlanTemplate. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The unique identifier (UUID) of the user who last modified this PlanTemplate. */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
        }

        /**
         * The Product minimum spend amount per billing cycle for end customer Accounts on a pricing
         * Plan based on the PlanTemplate. This must be a non-negative number.
         */
        fun minimumSpend(minimumSpend: Double) = minimumSpend(JsonField.of(minimumSpend))

        /**
         * The Product minimum spend amount per billing cycle for end customer Accounts on a pricing
         * Plan based on the PlanTemplate. This must be a non-negative number.
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

        /** Descriptive name for the PlanTemplate. */
        fun name(name: String) = name(JsonField.of(name))

        /** Descriptive name for the PlanTemplate. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * The ranking of the PlanTemplate among your pricing plans. Lower numbers represent more
         * basic plans, while higher numbers represent premium plans. This must be a non-negative
         * integer.
         *
         * **NOTE:** **DEPRECATED** - no longer used.
         */
        fun ordinal(ordinal: Long) = ordinal(JsonField.of(ordinal))

        /**
         * The ranking of the PlanTemplate among your pricing plans. Lower numbers represent more
         * basic plans, while higher numbers represent premium plans. This must be a non-negative
         * integer.
         *
         * **NOTE:** **DEPRECATED** - no longer used.
         */
        fun ordinal(ordinal: JsonField<Long>) = apply { this.ordinal = ordinal }

        /** The unique identifier (UUID) of the Product associated with this PlanTemplate. */
        fun productId(productId: String) = productId(JsonField.of(productId))

        /** The unique identifier (UUID) of the Product associated with this PlanTemplate. */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        /**
         * The fixed charge _(standing charge)_ applied to customer bills. This charge is prorated
         * and must be a non-negative number.
         */
        fun standingCharge(standingCharge: Double) = standingCharge(JsonField.of(standingCharge))

        /**
         * The fixed charge _(standing charge)_ applied to customer bills. This charge is prorated
         * and must be a non-negative number.
         */
        fun standingCharge(standingCharge: JsonField<Double>) = apply {
            this.standingCharge = standingCharge
        }

        /**
         * A boolean that determines when the standing charge is billed.
         * - TRUE - standing charge is billed at the start of each billing period.
         * - FALSE - standing charge is billed at the end of each billing period.
         *
         * Overrides the setting at Organizational level for standing charge billing in arrears/in
         * advance.
         */
        fun standingChargeBillInAdvance(standingChargeBillInAdvance: Boolean) =
            standingChargeBillInAdvance(JsonField.of(standingChargeBillInAdvance))

        /**
         * A boolean that determines when the standing charge is billed.
         * - TRUE - standing charge is billed at the start of each billing period.
         * - FALSE - standing charge is billed at the end of each billing period.
         *
         * Overrides the setting at Organizational level for standing charge billing in arrears/in
         * advance.
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

        /**
         * How often the standing charge is applied. For example, if the bill is issued every three
         * months and `standingChargeInterval` is 2, then the standing charge is applied every six
         * months.
         */
        fun standingChargeInterval(standingChargeInterval: Long) =
            standingChargeInterval(JsonField.of(standingChargeInterval))

        /**
         * How often the standing charge is applied. For example, if the bill is issued every three
         * months and `standingChargeInterval` is 2, then the standing charge is applied every six
         * months.
         */
        fun standingChargeInterval(standingChargeInterval: JsonField<Long>) = apply {
            this.standingChargeInterval = standingChargeInterval
        }

        /**
         * Defines an offset for when the standing charge is first applied. For example, if the bill
         * is issued every three months and the `standingChargeOfset` is 0, then the charge is
         * applied to the first bill _(at three months)_; if 1, it would be applied to the second
         * bill _(at six months)_, and so on.
         */
        fun standingChargeOffset(standingChargeOffset: Long) =
            standingChargeOffset(JsonField.of(standingChargeOffset))

        /**
         * Defines an offset for when the standing charge is first applied. For example, if the bill
         * is issued every three months and the `standingChargeOfset` is 0, then the charge is
         * applied to the first bill _(at three months)_; if 1, it would be applied to the second
         * bill _(at six months)_, and so on.
         */
        fun standingChargeOffset(standingChargeOffset: JsonField<Long>) = apply {
            this.standingChargeOffset = standingChargeOffset
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

        fun build(): PlanTemplate =
            PlanTemplate(
                checkRequired("id", id),
                checkRequired("version", version),
                billFrequency,
                billFrequencyInterval,
                code,
                createdBy,
                currency,
                customFields,
                dtCreated,
                dtLastModified,
                lastModifiedBy,
                minimumSpend,
                minimumSpendBillInAdvance,
                minimumSpendDescription,
                name,
                ordinal,
                productId,
                standingCharge,
                standingChargeBillInAdvance,
                standingChargeDescription,
                standingChargeInterval,
                standingChargeOffset,
                additionalProperties.toImmutable(),
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
    class BillFrequency
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

        fun asString(): String = _value().asStringOrThrow()

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
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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

        return /* spotless:off */ other is PlanTemplate && id == other.id && version == other.version && billFrequency == other.billFrequency && billFrequencyInterval == other.billFrequencyInterval && code == other.code && createdBy == other.createdBy && currency == other.currency && customFields == other.customFields && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && lastModifiedBy == other.lastModifiedBy && minimumSpend == other.minimumSpend && minimumSpendBillInAdvance == other.minimumSpendBillInAdvance && minimumSpendDescription == other.minimumSpendDescription && name == other.name && ordinal == other.ordinal && productId == other.productId && standingCharge == other.standingCharge && standingChargeBillInAdvance == other.standingChargeBillInAdvance && standingChargeDescription == other.standingChargeDescription && standingChargeInterval == other.standingChargeInterval && standingChargeOffset == other.standingChargeOffset && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, billFrequency, billFrequencyInterval, code, createdBy, currency, customFields, dtCreated, dtLastModified, lastModifiedBy, minimumSpend, minimumSpendBillInAdvance, minimumSpendDescription, name, ordinal, productId, standingCharge, standingChargeBillInAdvance, standingChargeDescription, standingChargeInterval, standingChargeOffset, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlanTemplate{id=$id, version=$version, billFrequency=$billFrequency, billFrequencyInterval=$billFrequencyInterval, code=$code, createdBy=$createdBy, currency=$currency, customFields=$customFields, dtCreated=$dtCreated, dtLastModified=$dtLastModified, lastModifiedBy=$lastModifiedBy, minimumSpend=$minimumSpend, minimumSpendBillInAdvance=$minimumSpendBillInAdvance, minimumSpendDescription=$minimumSpendDescription, name=$name, ordinal=$ordinal, productId=$productId, standingCharge=$standingCharge, standingChargeBillInAdvance=$standingChargeBillInAdvance, standingChargeDescription=$standingChargeDescription, standingChargeInterval=$standingChargeInterval, standingChargeOffset=$standingChargeOffset, additionalProperties=$additionalProperties}"
}
