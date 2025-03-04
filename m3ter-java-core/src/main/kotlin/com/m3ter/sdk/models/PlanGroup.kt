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
class PlanGroup
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("accountId")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
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
     * Optional. This PlanGroup was created as bespoke for the associated Account with this Account
     * ID.
     */
    fun accountId(): Optional<String> = Optional.ofNullable(accountId.getNullable("accountId"))

    /** The short code representing the PlanGroup. */
    fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

    /** The unique identifier (UUID) for the user who created the PlanGroup. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /** Currency code for the PlanGroup (For example, USD). */
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

    /** The date and time _(in ISO 8601 format)_ when the PlanGroup was first created. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /** The date and time _(in ISO 8601 format)_ when the PlanGroup was last modified. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /** The unique identifier (UUID) for the user who last modified the PlanGroup. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /** The minimum spend amount for the PlanGroup. */
    fun minimumSpend(): Optional<Double> =
        Optional.ofNullable(minimumSpend.getNullable("minimumSpend"))

    /** Optional. Product ID to attribute the PlanGroup's minimum spend for accounting purposes. */
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

    /** The name of the PlanGroup. */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** Standing charge amount for the PlanGroup. */
    fun standingCharge(): Optional<Double> =
        Optional.ofNullable(standingCharge.getNullable("standingCharge"))

    /**
     * Optional. Product ID to attribute the PlanGroup's standing charge for accounting purposes.
     */
    fun standingChargeAccountingProductId(): Optional<String> =
        Optional.ofNullable(
            standingChargeAccountingProductId.getNullable("standingChargeAccountingProductId")
        )

    /**
     * A boolean flag that determines when the standing charge is billed. This flag overrides the
     * setting at Organizational level for standing charge billing in arrears/in advance.
     * - **TRUE** - standing charge is billed at the start of each billing period.
     * - **FALSE** - standing charge is billed at the end of each billing period.
     */
    fun standingChargeBillInAdvance(): Optional<Boolean> =
        Optional.ofNullable(standingChargeBillInAdvance.getNullable("standingChargeBillInAdvance"))

    /** Description of the standing charge, displayed on the bill line item. */
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
     * Optional. This PlanGroup was created as bespoke for the associated Account with this Account
     * ID.
     */
    @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /** The short code representing the PlanGroup. */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /** The unique identifier (UUID) for the user who created the PlanGroup. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /** Currency code for the PlanGroup (For example, USD). */
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

    /** The date and time _(in ISO 8601 format)_ when the PlanGroup was first created. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /** The date and time _(in ISO 8601 format)_ when the PlanGroup was last modified. */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /** The unique identifier (UUID) for the user who last modified the PlanGroup. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /** The minimum spend amount for the PlanGroup. */
    @JsonProperty("minimumSpend")
    @ExcludeMissing
    fun _minimumSpend(): JsonField<Double> = minimumSpend

    /** Optional. Product ID to attribute the PlanGroup's minimum spend for accounting purposes. */
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

    /** The name of the PlanGroup. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** Standing charge amount for the PlanGroup. */
    @JsonProperty("standingCharge")
    @ExcludeMissing
    fun _standingCharge(): JsonField<Double> = standingCharge

    /**
     * Optional. Product ID to attribute the PlanGroup's standing charge for accounting purposes.
     */
    @JsonProperty("standingChargeAccountingProductId")
    @ExcludeMissing
    fun _standingChargeAccountingProductId(): JsonField<String> = standingChargeAccountingProductId

    /**
     * A boolean flag that determines when the standing charge is billed. This flag overrides the
     * setting at Organizational level for standing charge billing in arrears/in advance.
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

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PlanGroup = apply {
        if (validated) {
            return@apply
        }

        id()
        version()
        accountId()
        code()
        createdBy()
        currency()
        customFields().ifPresent { it.validate() }
        dtCreated()
        dtLastModified()
        lastModifiedBy()
        minimumSpend()
        minimumSpendAccountingProductId()
        minimumSpendBillInAdvance()
        minimumSpendDescription()
        name()
        standingCharge()
        standingChargeAccountingProductId()
        standingChargeBillInAdvance()
        standingChargeDescription()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanGroup].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PlanGroup]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var accountId: JsonField<String> = JsonMissing.of()
        private var code: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var minimumSpend: JsonField<Double> = JsonMissing.of()
        private var minimumSpendAccountingProductId: JsonField<String> = JsonMissing.of()
        private var minimumSpendBillInAdvance: JsonField<Boolean> = JsonMissing.of()
        private var minimumSpendDescription: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var standingCharge: JsonField<Double> = JsonMissing.of()
        private var standingChargeAccountingProductId: JsonField<String> = JsonMissing.of()
        private var standingChargeBillInAdvance: JsonField<Boolean> = JsonMissing.of()
        private var standingChargeDescription: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(planGroup: PlanGroup) = apply {
            id = planGroup.id
            version = planGroup.version
            accountId = planGroup.accountId
            code = planGroup.code
            createdBy = planGroup.createdBy
            currency = planGroup.currency
            customFields = planGroup.customFields
            dtCreated = planGroup.dtCreated
            dtLastModified = planGroup.dtLastModified
            lastModifiedBy = planGroup.lastModifiedBy
            minimumSpend = planGroup.minimumSpend
            minimumSpendAccountingProductId = planGroup.minimumSpendAccountingProductId
            minimumSpendBillInAdvance = planGroup.minimumSpendBillInAdvance
            minimumSpendDescription = planGroup.minimumSpendDescription
            name = planGroup.name
            standingCharge = planGroup.standingCharge
            standingChargeAccountingProductId = planGroup.standingChargeAccountingProductId
            standingChargeBillInAdvance = planGroup.standingChargeBillInAdvance
            standingChargeDescription = planGroup.standingChargeDescription
            additionalProperties = planGroup.additionalProperties.toMutableMap()
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
         * Optional. This PlanGroup was created as bespoke for the associated Account with this
         * Account ID.
         */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Optional. This PlanGroup was created as bespoke for the associated Account with this
         * Account ID.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The short code representing the PlanGroup. */
        fun code(code: String) = code(JsonField.of(code))

        /** The short code representing the PlanGroup. */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** The unique identifier (UUID) for the user who created the PlanGroup. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The unique identifier (UUID) for the user who created the PlanGroup. */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** Currency code for the PlanGroup (For example, USD). */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** Currency code for the PlanGroup (For example, USD). */
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

        /** The date and time _(in ISO 8601 format)_ when the PlanGroup was first created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /** The date and time _(in ISO 8601 format)_ when the PlanGroup was first created. */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The date and time _(in ISO 8601 format)_ when the PlanGroup was last modified. */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /** The date and time _(in ISO 8601 format)_ when the PlanGroup was last modified. */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        /** The unique identifier (UUID) for the user who last modified the PlanGroup. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The unique identifier (UUID) for the user who last modified the PlanGroup. */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
        }

        /** The minimum spend amount for the PlanGroup. */
        fun minimumSpend(minimumSpend: Double) = minimumSpend(JsonField.of(minimumSpend))

        /** The minimum spend amount for the PlanGroup. */
        fun minimumSpend(minimumSpend: JsonField<Double>) = apply {
            this.minimumSpend = minimumSpend
        }

        /**
         * Optional. Product ID to attribute the PlanGroup's minimum spend for accounting purposes.
         */
        fun minimumSpendAccountingProductId(minimumSpendAccountingProductId: String) =
            minimumSpendAccountingProductId(JsonField.of(minimumSpendAccountingProductId))

        /**
         * Optional. Product ID to attribute the PlanGroup's minimum spend for accounting purposes.
         */
        fun minimumSpendAccountingProductId(minimumSpendAccountingProductId: JsonField<String>) =
            apply {
                this.minimumSpendAccountingProductId = minimumSpendAccountingProductId
            }

        /**
         * A boolean flag that determines when the minimum spend is billed. This flag overrides the
         * setting at Organizational level for minimum spend billing in arrears/in advance.
         * - **TRUE** - minimum spend is billed at the start of each billing period.
         * - **FALSE** - minimum spend is billed at the end of each billing period.
         */
        fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: Boolean) =
            minimumSpendBillInAdvance(JsonField.of(minimumSpendBillInAdvance))

        /**
         * A boolean flag that determines when the minimum spend is billed. This flag overrides the
         * setting at Organizational level for minimum spend billing in arrears/in advance.
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

        /** The name of the PlanGroup. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the PlanGroup. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Standing charge amount for the PlanGroup. */
        fun standingCharge(standingCharge: Double) = standingCharge(JsonField.of(standingCharge))

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
         * A boolean flag that determines when the standing charge is billed. This flag overrides
         * the setting at Organizational level for standing charge billing in arrears/in advance.
         * - **TRUE** - standing charge is billed at the start of each billing period.
         * - **FALSE** - standing charge is billed at the end of each billing period.
         */
        fun standingChargeBillInAdvance(standingChargeBillInAdvance: Boolean) =
            standingChargeBillInAdvance(JsonField.of(standingChargeBillInAdvance))

        /**
         * A boolean flag that determines when the standing charge is billed. This flag overrides
         * the setting at Organizational level for standing charge billing in arrears/in advance.
         * - **TRUE** - standing charge is billed at the start of each billing period.
         * - **FALSE** - standing charge is billed at the end of each billing period.
         */
        fun standingChargeBillInAdvance(standingChargeBillInAdvance: JsonField<Boolean>) = apply {
            this.standingChargeBillInAdvance = standingChargeBillInAdvance
        }

        /** Description of the standing charge, displayed on the bill line item. */
        fun standingChargeDescription(standingChargeDescription: String) =
            standingChargeDescription(JsonField.of(standingChargeDescription))

        /** Description of the standing charge, displayed on the bill line item. */
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

        fun build(): PlanGroup =
            PlanGroup(
                checkRequired("id", id),
                checkRequired("version", version),
                accountId,
                code,
                createdBy,
                currency,
                customFields,
                dtCreated,
                dtLastModified,
                lastModifiedBy,
                minimumSpend,
                minimumSpendAccountingProductId,
                minimumSpendBillInAdvance,
                minimumSpendDescription,
                name,
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

        return /* spotless:off */ other is PlanGroup && id == other.id && version == other.version && accountId == other.accountId && code == other.code && createdBy == other.createdBy && currency == other.currency && customFields == other.customFields && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && lastModifiedBy == other.lastModifiedBy && minimumSpend == other.minimumSpend && minimumSpendAccountingProductId == other.minimumSpendAccountingProductId && minimumSpendBillInAdvance == other.minimumSpendBillInAdvance && minimumSpendDescription == other.minimumSpendDescription && name == other.name && standingCharge == other.standingCharge && standingChargeAccountingProductId == other.standingChargeAccountingProductId && standingChargeBillInAdvance == other.standingChargeBillInAdvance && standingChargeDescription == other.standingChargeDescription && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, accountId, code, createdBy, currency, customFields, dtCreated, dtLastModified, lastModifiedBy, minimumSpend, minimumSpendAccountingProductId, minimumSpendBillInAdvance, minimumSpendDescription, name, standingCharge, standingChargeAccountingProductId, standingChargeBillInAdvance, standingChargeDescription, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlanGroup{id=$id, version=$version, accountId=$accountId, code=$code, createdBy=$createdBy, currency=$currency, customFields=$customFields, dtCreated=$dtCreated, dtLastModified=$dtLastModified, lastModifiedBy=$lastModifiedBy, minimumSpend=$minimumSpend, minimumSpendAccountingProductId=$minimumSpendAccountingProductId, minimumSpendBillInAdvance=$minimumSpendBillInAdvance, minimumSpendDescription=$minimumSpendDescription, name=$name, standingCharge=$standingCharge, standingChargeAccountingProductId=$standingChargeAccountingProductId, standingChargeBillInAdvance=$standingChargeBillInAdvance, standingChargeDescription=$standingChargeDescription, additionalProperties=$additionalProperties}"
}
