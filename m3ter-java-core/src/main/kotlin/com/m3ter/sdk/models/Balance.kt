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
class Balance
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("accountId")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount")
    @ExcludeMissing
    private val amount: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("balanceDrawDownDescription")
    @ExcludeMissing
    private val balanceDrawDownDescription: JsonField<String> = JsonMissing.of(),
    @JsonProperty("code") @ExcludeMissing private val code: JsonField<String> = JsonMissing.of(),
    @JsonProperty("consumptionsAccountingProductId")
    @ExcludeMissing
    private val consumptionsAccountingProductId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("createdBy")
    @ExcludeMissing
    private val createdBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("dtCreated")
    @ExcludeMissing
    private val dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    private val dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("endDate")
    @ExcludeMissing
    private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("feesAccountingProductId")
    @ExcludeMissing
    private val feesAccountingProductId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    private val lastModifiedBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("lineItemTypes")
    @ExcludeMissing
    private val lineItemTypes: JsonField<List<LineItemType>> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("overageDescription")
    @ExcludeMissing
    private val overageDescription: JsonField<String> = JsonMissing.of(),
    @JsonProperty("overageSurchargePercent")
    @ExcludeMissing
    private val overageSurchargePercent: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("productIds")
    @ExcludeMissing
    private val productIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("rolloverAmount")
    @ExcludeMissing
    private val rolloverAmount: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("rolloverEndDate")
    @ExcludeMissing
    private val rolloverEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("startDate")
    @ExcludeMissing
    private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
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

    /** The unique identifier (UUID) for the end customer Account the Balance belongs to. */
    fun accountId(): Optional<String> = Optional.ofNullable(accountId.getNullable("accountId"))

    /** The financial value that the Balance holds. */
    fun amount(): Optional<Double> = Optional.ofNullable(amount.getNullable("amount"))

    /** A description for the bill line items for charges drawn-down against the Balance. */
    fun balanceDrawDownDescription(): Optional<String> =
        Optional.ofNullable(balanceDrawDownDescription.getNullable("balanceDrawDownDescription"))

    /** A unique short code assigned to the Balance. */
    fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

    fun consumptionsAccountingProductId(): Optional<String> =
        Optional.ofNullable(
            consumptionsAccountingProductId.getNullable("consumptionsAccountingProductId")
        )

    /** The unique identifier (UUID) for the user who created the Balance. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /** The currency code used for the Balance amount. For example: USD, GBP or EUR. */
    fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

    /** A description of the Balance. */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** The date and time _(in ISO 8601 format)_ when the Balance was first created. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /** The date and time _(in ISO 8601 format)_ when the Balance was last modified. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /** The date _(in ISO 8601 format)_ after which the Balance will no longer be active. */
    fun endDate(): Optional<OffsetDateTime> = Optional.ofNullable(endDate.getNullable("endDate"))

    fun feesAccountingProductId(): Optional<String> =
        Optional.ofNullable(feesAccountingProductId.getNullable("feesAccountingProductId"))

    /** The unique identifier (UUID) for the user who last modified the Balance. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /**
     * A list of line item charge types that can draw-down against the Balance amount at billing.
     */
    fun lineItemTypes(): Optional<List<LineItemType>> =
        Optional.ofNullable(lineItemTypes.getNullable("lineItemTypes"))

    /** The official name of the Balance. */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** A description for overage charges. */
    fun overageDescription(): Optional<String> =
        Optional.ofNullable(overageDescription.getNullable("overageDescription"))

    /** The percentage surcharge applied to overage charges _(usage above the Balance)_. */
    fun overageSurchargePercent(): Optional<Double> =
        Optional.ofNullable(overageSurchargePercent.getNullable("overageSurchargePercent"))

    /**
     * A list of Product IDs whose consumption charges due at billing can be drawn-down against the
     * Balance amount.
     */
    fun productIds(): Optional<List<String>> =
        Optional.ofNullable(productIds.getNullable("productIds"))

    /**
     * The maximum amount that can be carried over past the Balance end date and draw-down against
     * for billing if there is an unused Balance amount remaining when the Balance end date is
     * reached.
     */
    fun rolloverAmount(): Optional<Double> =
        Optional.ofNullable(rolloverAmount.getNullable("rolloverAmount"))

    /**
     * The end date _(in ISO 8601 format)_ for the rollover grace period, which is the period that
     * unused Balance amounts can be carried over beyond the specified Balance `endDate` and
     * continue to be drawn-down against for billing.
     */
    fun rolloverEndDate(): Optional<OffsetDateTime> =
        Optional.ofNullable(rolloverEndDate.getNullable("rolloverEndDate"))

    /** The date _(in ISO 8601 format)_ when the Balance becomes active. */
    fun startDate(): Optional<OffsetDateTime> =
        Optional.ofNullable(startDate.getNullable("startDate"))

    /** The UUID of the entity. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    /** The unique identifier (UUID) for the end customer Account the Balance belongs to. */
    @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /** The financial value that the Balance holds. */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

    /** A description for the bill line items for charges drawn-down against the Balance. */
    @JsonProperty("balanceDrawDownDescription")
    @ExcludeMissing
    fun _balanceDrawDownDescription(): JsonField<String> = balanceDrawDownDescription

    /** A unique short code assigned to the Balance. */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    @JsonProperty("consumptionsAccountingProductId")
    @ExcludeMissing
    fun _consumptionsAccountingProductId(): JsonField<String> = consumptionsAccountingProductId

    /** The unique identifier (UUID) for the user who created the Balance. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /** The currency code used for the Balance amount. For example: USD, GBP or EUR. */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /** A description of the Balance. */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /** The date and time _(in ISO 8601 format)_ when the Balance was first created. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /** The date and time _(in ISO 8601 format)_ when the Balance was last modified. */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /** The date _(in ISO 8601 format)_ after which the Balance will no longer be active. */
    @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    @JsonProperty("feesAccountingProductId")
    @ExcludeMissing
    fun _feesAccountingProductId(): JsonField<String> = feesAccountingProductId

    /** The unique identifier (UUID) for the user who last modified the Balance. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /**
     * A list of line item charge types that can draw-down against the Balance amount at billing.
     */
    @JsonProperty("lineItemTypes")
    @ExcludeMissing
    fun _lineItemTypes(): JsonField<List<LineItemType>> = lineItemTypes

    /** The official name of the Balance. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** A description for overage charges. */
    @JsonProperty("overageDescription")
    @ExcludeMissing
    fun _overageDescription(): JsonField<String> = overageDescription

    /** The percentage surcharge applied to overage charges _(usage above the Balance)_. */
    @JsonProperty("overageSurchargePercent")
    @ExcludeMissing
    fun _overageSurchargePercent(): JsonField<Double> = overageSurchargePercent

    /**
     * A list of Product IDs whose consumption charges due at billing can be drawn-down against the
     * Balance amount.
     */
    @JsonProperty("productIds")
    @ExcludeMissing
    fun _productIds(): JsonField<List<String>> = productIds

    /**
     * The maximum amount that can be carried over past the Balance end date and draw-down against
     * for billing if there is an unused Balance amount remaining when the Balance end date is
     * reached.
     */
    @JsonProperty("rolloverAmount")
    @ExcludeMissing
    fun _rolloverAmount(): JsonField<Double> = rolloverAmount

    /**
     * The end date _(in ISO 8601 format)_ for the rollover grace period, which is the period that
     * unused Balance amounts can be carried over beyond the specified Balance `endDate` and
     * continue to be drawn-down against for billing.
     */
    @JsonProperty("rolloverEndDate")
    @ExcludeMissing
    fun _rolloverEndDate(): JsonField<OffsetDateTime> = rolloverEndDate

    /** The date _(in ISO 8601 format)_ when the Balance becomes active. */
    @JsonProperty("startDate")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Balance = apply {
        if (validated) {
            return@apply
        }

        id()
        version()
        accountId()
        amount()
        balanceDrawDownDescription()
        code()
        consumptionsAccountingProductId()
        createdBy()
        currency()
        description()
        dtCreated()
        dtLastModified()
        endDate()
        feesAccountingProductId()
        lastModifiedBy()
        lineItemTypes()
        name()
        overageDescription()
        overageSurchargePercent()
        productIds()
        rolloverAmount()
        rolloverEndDate()
        startDate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Balance]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var accountId: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Double> = JsonMissing.of()
        private var balanceDrawDownDescription: JsonField<String> = JsonMissing.of()
        private var code: JsonField<String> = JsonMissing.of()
        private var consumptionsAccountingProductId: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var feesAccountingProductId: JsonField<String> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var lineItemTypes: JsonField<MutableList<LineItemType>>? = null
        private var name: JsonField<String> = JsonMissing.of()
        private var overageDescription: JsonField<String> = JsonMissing.of()
        private var overageSurchargePercent: JsonField<Double> = JsonMissing.of()
        private var productIds: JsonField<MutableList<String>>? = null
        private var rolloverAmount: JsonField<Double> = JsonMissing.of()
        private var rolloverEndDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(balance: Balance) = apply {
            id = balance.id
            version = balance.version
            accountId = balance.accountId
            amount = balance.amount
            balanceDrawDownDescription = balance.balanceDrawDownDescription
            code = balance.code
            consumptionsAccountingProductId = balance.consumptionsAccountingProductId
            createdBy = balance.createdBy
            currency = balance.currency
            description = balance.description
            dtCreated = balance.dtCreated
            dtLastModified = balance.dtLastModified
            endDate = balance.endDate
            feesAccountingProductId = balance.feesAccountingProductId
            lastModifiedBy = balance.lastModifiedBy
            lineItemTypes = balance.lineItemTypes.map { it.toMutableList() }
            name = balance.name
            overageDescription = balance.overageDescription
            overageSurchargePercent = balance.overageSurchargePercent
            productIds = balance.productIds.map { it.toMutableList() }
            rolloverAmount = balance.rolloverAmount
            rolloverEndDate = balance.rolloverEndDate
            startDate = balance.startDate
            additionalProperties = balance.additionalProperties.toMutableMap()
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

        /** The unique identifier (UUID) for the end customer Account the Balance belongs to. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The unique identifier (UUID) for the end customer Account the Balance belongs to. */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The financial value that the Balance holds. */
        fun amount(amount: Double) = amount(JsonField.of(amount))

        /** The financial value that the Balance holds. */
        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

        /** A description for the bill line items for charges drawn-down against the Balance. */
        fun balanceDrawDownDescription(balanceDrawDownDescription: String) =
            balanceDrawDownDescription(JsonField.of(balanceDrawDownDescription))

        /** A description for the bill line items for charges drawn-down against the Balance. */
        fun balanceDrawDownDescription(balanceDrawDownDescription: JsonField<String>) = apply {
            this.balanceDrawDownDescription = balanceDrawDownDescription
        }

        /** A unique short code assigned to the Balance. */
        fun code(code: String) = code(JsonField.of(code))

        /** A unique short code assigned to the Balance. */
        fun code(code: JsonField<String>) = apply { this.code = code }

        fun consumptionsAccountingProductId(consumptionsAccountingProductId: String) =
            consumptionsAccountingProductId(JsonField.of(consumptionsAccountingProductId))

        fun consumptionsAccountingProductId(consumptionsAccountingProductId: JsonField<String>) =
            apply {
                this.consumptionsAccountingProductId = consumptionsAccountingProductId
            }

        /** The unique identifier (UUID) for the user who created the Balance. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The unique identifier (UUID) for the user who created the Balance. */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The currency code used for the Balance amount. For example: USD, GBP or EUR. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** The currency code used for the Balance amount. For example: USD, GBP or EUR. */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** A description of the Balance. */
        fun description(description: String) = description(JsonField.of(description))

        /** A description of the Balance. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The date and time _(in ISO 8601 format)_ when the Balance was first created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /** The date and time _(in ISO 8601 format)_ when the Balance was first created. */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The date and time _(in ISO 8601 format)_ when the Balance was last modified. */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /** The date and time _(in ISO 8601 format)_ when the Balance was last modified. */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        /** The date _(in ISO 8601 format)_ after which the Balance will no longer be active. */
        fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

        /** The date _(in ISO 8601 format)_ after which the Balance will no longer be active. */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        fun feesAccountingProductId(feesAccountingProductId: String) =
            feesAccountingProductId(JsonField.of(feesAccountingProductId))

        fun feesAccountingProductId(feesAccountingProductId: JsonField<String>) = apply {
            this.feesAccountingProductId = feesAccountingProductId
        }

        /** The unique identifier (UUID) for the user who last modified the Balance. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The unique identifier (UUID) for the user who last modified the Balance. */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
        }

        /**
         * A list of line item charge types that can draw-down against the Balance amount at
         * billing.
         */
        fun lineItemTypes(lineItemTypes: List<LineItemType>) =
            lineItemTypes(JsonField.of(lineItemTypes))

        /**
         * A list of line item charge types that can draw-down against the Balance amount at
         * billing.
         */
        fun lineItemTypes(lineItemTypes: JsonField<List<LineItemType>>) = apply {
            this.lineItemTypes = lineItemTypes.map { it.toMutableList() }
        }

        /**
         * A list of line item charge types that can draw-down against the Balance amount at
         * billing.
         */
        fun addLineItemType(lineItemType: LineItemType) = apply {
            lineItemTypes =
                (lineItemTypes ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(lineItemType)
                }
        }

        /** The official name of the Balance. */
        fun name(name: String) = name(JsonField.of(name))

        /** The official name of the Balance. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** A description for overage charges. */
        fun overageDescription(overageDescription: String) =
            overageDescription(JsonField.of(overageDescription))

        /** A description for overage charges. */
        fun overageDescription(overageDescription: JsonField<String>) = apply {
            this.overageDescription = overageDescription
        }

        /** The percentage surcharge applied to overage charges _(usage above the Balance)_. */
        fun overageSurchargePercent(overageSurchargePercent: Double) =
            overageSurchargePercent(JsonField.of(overageSurchargePercent))

        /** The percentage surcharge applied to overage charges _(usage above the Balance)_. */
        fun overageSurchargePercent(overageSurchargePercent: JsonField<Double>) = apply {
            this.overageSurchargePercent = overageSurchargePercent
        }

        /**
         * A list of Product IDs whose consumption charges due at billing can be drawn-down against
         * the Balance amount.
         */
        fun productIds(productIds: List<String>) = productIds(JsonField.of(productIds))

        /**
         * A list of Product IDs whose consumption charges due at billing can be drawn-down against
         * the Balance amount.
         */
        fun productIds(productIds: JsonField<List<String>>) = apply {
            this.productIds = productIds.map { it.toMutableList() }
        }

        /**
         * A list of Product IDs whose consumption charges due at billing can be drawn-down against
         * the Balance amount.
         */
        fun addProductId(productId: String) = apply {
            productIds =
                (productIds ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(productId)
                }
        }

        /**
         * The maximum amount that can be carried over past the Balance end date and draw-down
         * against for billing if there is an unused Balance amount remaining when the Balance end
         * date is reached.
         */
        fun rolloverAmount(rolloverAmount: Double) = rolloverAmount(JsonField.of(rolloverAmount))

        /**
         * The maximum amount that can be carried over past the Balance end date and draw-down
         * against for billing if there is an unused Balance amount remaining when the Balance end
         * date is reached.
         */
        fun rolloverAmount(rolloverAmount: JsonField<Double>) = apply {
            this.rolloverAmount = rolloverAmount
        }

        /**
         * The end date _(in ISO 8601 format)_ for the rollover grace period, which is the period
         * that unused Balance amounts can be carried over beyond the specified Balance `endDate`
         * and continue to be drawn-down against for billing.
         */
        fun rolloverEndDate(rolloverEndDate: OffsetDateTime) =
            rolloverEndDate(JsonField.of(rolloverEndDate))

        /**
         * The end date _(in ISO 8601 format)_ for the rollover grace period, which is the period
         * that unused Balance amounts can be carried over beyond the specified Balance `endDate`
         * and continue to be drawn-down against for billing.
         */
        fun rolloverEndDate(rolloverEndDate: JsonField<OffsetDateTime>) = apply {
            this.rolloverEndDate = rolloverEndDate
        }

        /** The date _(in ISO 8601 format)_ when the Balance becomes active. */
        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        /** The date _(in ISO 8601 format)_ when the Balance becomes active. */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

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

        fun build(): Balance =
            Balance(
                checkRequired("id", id),
                checkRequired("version", version),
                accountId,
                amount,
                balanceDrawDownDescription,
                code,
                consumptionsAccountingProductId,
                createdBy,
                currency,
                description,
                dtCreated,
                dtLastModified,
                endDate,
                feesAccountingProductId,
                lastModifiedBy,
                (lineItemTypes ?: JsonMissing.of()).map { it.toImmutable() },
                name,
                overageDescription,
                overageSurchargePercent,
                (productIds ?: JsonMissing.of()).map { it.toImmutable() },
                rolloverAmount,
                rolloverEndDate,
                startDate,
                additionalProperties.toImmutable(),
            )
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

            @JvmStatic fun of(value: String) = LineItemType(JsonField.of(value))
        }

        /** An enum containing [LineItemType]'s known values. */
        enum class Known {
            STANDING_CHARGE,
            USAGE,
            MINIMUM_SPEND,
            COUNTER_RUNNING_TOTAL_CHARGE,
            COUNTER_ADJUSTMENT_DEBIT,
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LineItemType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Balance && id == other.id && version == other.version && accountId == other.accountId && amount == other.amount && balanceDrawDownDescription == other.balanceDrawDownDescription && code == other.code && consumptionsAccountingProductId == other.consumptionsAccountingProductId && createdBy == other.createdBy && currency == other.currency && description == other.description && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && endDate == other.endDate && feesAccountingProductId == other.feesAccountingProductId && lastModifiedBy == other.lastModifiedBy && lineItemTypes == other.lineItemTypes && name == other.name && overageDescription == other.overageDescription && overageSurchargePercent == other.overageSurchargePercent && productIds == other.productIds && rolloverAmount == other.rolloverAmount && rolloverEndDate == other.rolloverEndDate && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, accountId, amount, balanceDrawDownDescription, code, consumptionsAccountingProductId, createdBy, currency, description, dtCreated, dtLastModified, endDate, feesAccountingProductId, lastModifiedBy, lineItemTypes, name, overageDescription, overageSurchargePercent, productIds, rolloverAmount, rolloverEndDate, startDate, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Balance{id=$id, version=$version, accountId=$accountId, amount=$amount, balanceDrawDownDescription=$balanceDrawDownDescription, code=$code, consumptionsAccountingProductId=$consumptionsAccountingProductId, createdBy=$createdBy, currency=$currency, description=$description, dtCreated=$dtCreated, dtLastModified=$dtLastModified, endDate=$endDate, feesAccountingProductId=$feesAccountingProductId, lastModifiedBy=$lastModifiedBy, lineItemTypes=$lineItemTypes, name=$name, overageDescription=$overageDescription, overageSurchargePercent=$overageSurchargePercent, productIds=$productIds, rolloverAmount=$rolloverAmount, rolloverEndDate=$rolloverEndDate, startDate=$startDate, additionalProperties=$additionalProperties}"
}
