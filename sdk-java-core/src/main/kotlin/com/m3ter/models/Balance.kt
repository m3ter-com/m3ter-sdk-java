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
import com.m3ter.core.checkKnown
import com.m3ter.core.checkRequired
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Balance
private constructor(
    private val id: JsonField<String>,
    private val version: JsonField<Long>,
    private val accountId: JsonField<String>,
    private val amount: JsonField<Double>,
    private val balanceDrawDownDescription: JsonField<String>,
    private val code: JsonField<String>,
    private val consumptionsAccountingProductId: JsonField<String>,
    private val contractId: JsonField<String>,
    private val createdBy: JsonField<String>,
    private val currency: JsonField<String>,
    private val description: JsonField<String>,
    private val dtCreated: JsonField<OffsetDateTime>,
    private val dtLastModified: JsonField<OffsetDateTime>,
    private val endDate: JsonField<OffsetDateTime>,
    private val feesAccountingProductId: JsonField<String>,
    private val lastModifiedBy: JsonField<String>,
    private val lineItemTypes: JsonField<List<LineItemType>>,
    private val name: JsonField<String>,
    private val overageDescription: JsonField<String>,
    private val overageSurchargePercent: JsonField<Double>,
    private val productIds: JsonField<List<String>>,
    private val rolloverAmount: JsonField<Double>,
    private val rolloverEndDate: JsonField<OffsetDateTime>,
    private val startDate: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("accountId") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
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
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dtCreated")
        @ExcludeMissing
        dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("endDate")
        @ExcludeMissing
        endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("feesAccountingProductId")
        @ExcludeMissing
        feesAccountingProductId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        lastModifiedBy: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("startDate")
        @ExcludeMissing
        startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        version,
        accountId,
        amount,
        balanceDrawDownDescription,
        code,
        consumptionsAccountingProductId,
        contractId,
        createdBy,
        currency,
        description,
        dtCreated,
        dtLastModified,
        endDate,
        feesAccountingProductId,
        lastModifiedBy,
        lineItemTypes,
        name,
        overageDescription,
        overageSurchargePercent,
        productIds,
        rolloverAmount,
        rolloverEndDate,
        startDate,
        mutableMapOf(),
    )

    /**
     * The UUID of the entity.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun version(): Long = version.getRequired("version")

    /**
     * The unique identifier (UUID) for the end customer Account the Balance belongs to.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountId(): Optional<String> = accountId.getOptional("accountId")

    /**
     * The financial value that the Balance holds.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amount(): Optional<Double> = amount.getOptional("amount")

    /**
     * A description for the bill line items for charges drawn-down against the Balance.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun balanceDrawDownDescription(): Optional<String> =
        balanceDrawDownDescription.getOptional("balanceDrawDownDescription")

    /**
     * A unique short code assigned to the Balance.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun code(): Optional<String> = code.getOptional("code")

    /**
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
     * The unique identifier (UUID) for the user who created the Balance.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * The currency code used for the Balance amount. For example: USD, GBP or EUR.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currency(): Optional<String> = currency.getOptional("currency")

    /**
     * A description of the Balance.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * The date and time _(in ISO 8601 format)_ when the Balance was first created.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtCreated(): Optional<OffsetDateTime> = dtCreated.getOptional("dtCreated")

    /**
     * The date and time _(in ISO 8601 format)_ when the Balance was last modified.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtLastModified(): Optional<OffsetDateTime> = dtLastModified.getOptional("dtLastModified")

    /**
     * The date _(in ISO 8601 format)_ after which the Balance will no longer be active.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endDate(): Optional<OffsetDateTime> = endDate.getOptional("endDate")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun feesAccountingProductId(): Optional<String> =
        feesAccountingProductId.getOptional("feesAccountingProductId")

    /**
     * The unique identifier (UUID) for the user who last modified the Balance.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedBy(): Optional<String> = lastModifiedBy.getOptional("lastModifiedBy")

    /**
     * A list of line item charge types that can draw-down against the Balance amount at billing.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lineItemTypes(): Optional<List<LineItemType>> = lineItemTypes.getOptional("lineItemTypes")

    /**
     * The official name of the Balance.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * A description for overage charges.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overageDescription(): Optional<String> =
        overageDescription.getOptional("overageDescription")

    /**
     * The percentage surcharge applied to overage charges _(usage above the Balance)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overageSurchargePercent(): Optional<Double> =
        overageSurchargePercent.getOptional("overageSurchargePercent")

    /**
     * A list of Product IDs whose consumption charges due at billing can be drawn-down against the
     * Balance amount.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun productIds(): Optional<List<String>> = productIds.getOptional("productIds")

    /**
     * The maximum amount that can be carried over past the Balance end date and draw-down against
     * for billing if there is an unused Balance amount remaining when the Balance end date is
     * reached.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rolloverAmount(): Optional<Double> = rolloverAmount.getOptional("rolloverAmount")

    /**
     * The end date _(in ISO 8601 format)_ for the rollover grace period, which is the period that
     * unused Balance amounts can be carried over beyond the specified Balance `endDate` and
     * continue to be drawn-down against for billing.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rolloverEndDate(): Optional<OffsetDateTime> = rolloverEndDate.getOptional("rolloverEndDate")

    /**
     * The date _(in ISO 8601 format)_ when the Balance becomes active.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startDate(): Optional<OffsetDateTime> = startDate.getOptional("startDate")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

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
     * Unlike [consumptionsAccountingProductId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("consumptionsAccountingProductId")
    @ExcludeMissing
    fun _consumptionsAccountingProductId(): JsonField<String> = consumptionsAccountingProductId

    /**
     * Returns the raw JSON value of [contractId].
     *
     * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contractId") @ExcludeMissing fun _contractId(): JsonField<String> = contractId

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [dtCreated].
     *
     * Unlike [dtCreated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /**
     * Returns the raw JSON value of [dtLastModified].
     *
     * Unlike [dtLastModified], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

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
     * Returns the raw JSON value of [lastModifiedBy].
     *
     * Unlike [lastModifiedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /**
     * Returns the raw JSON value of [lineItemTypes].
     *
     * Unlike [lineItemTypes], this method doesn't throw if the JSON field has an unexpected type.
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
     * Unlike [overageDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
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
     * Unlike [rolloverAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rolloverAmount")
    @ExcludeMissing
    fun _rolloverAmount(): JsonField<Double> = rolloverAmount

    /**
     * Returns the raw JSON value of [rolloverEndDate].
     *
     * Unlike [rolloverEndDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rolloverEndDate")
    @ExcludeMissing
    fun _rolloverEndDate(): JsonField<OffsetDateTime> = rolloverEndDate

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startDate")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

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
         * Returns a mutable builder for constructing an instance of [Balance].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .version()
         * ```
         */
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
        private var contractId: JsonField<String> = JsonMissing.of()
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
            contractId = balance.contractId
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

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The version number:
         * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
         *   response.
         * - **Update:** On successful Update, the version is incremented by 1 in the response.
         */
        fun version(version: Long) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<Long>) = apply { this.version = version }

        /** The unique identifier (UUID) for the end customer Account the Balance belongs to. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The financial value that the Balance holds. */
        fun amount(amount: Double) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

        /** A description for the bill line items for charges drawn-down against the Balance. */
        fun balanceDrawDownDescription(balanceDrawDownDescription: String) =
            balanceDrawDownDescription(JsonField.of(balanceDrawDownDescription))

        /**
         * Sets [Builder.balanceDrawDownDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.balanceDrawDownDescription] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun balanceDrawDownDescription(balanceDrawDownDescription: JsonField<String>) = apply {
            this.balanceDrawDownDescription = balanceDrawDownDescription
        }

        /** A unique short code assigned to the Balance. */
        fun code(code: String) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { this.code = code }

        fun consumptionsAccountingProductId(consumptionsAccountingProductId: String) =
            consumptionsAccountingProductId(JsonField.of(consumptionsAccountingProductId))

        /**
         * Sets [Builder.consumptionsAccountingProductId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.consumptionsAccountingProductId] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun consumptionsAccountingProductId(consumptionsAccountingProductId: JsonField<String>) =
            apply {
                this.consumptionsAccountingProductId = consumptionsAccountingProductId
            }

        fun contractId(contractId: String) = contractId(JsonField.of(contractId))

        /**
         * Sets [Builder.contractId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contractId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

        /** The unique identifier (UUID) for the user who created the Balance. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The currency code used for the Balance amount. For example: USD, GBP or EUR. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** A description of the Balance. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The date and time _(in ISO 8601 format)_ when the Balance was first created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /**
         * Sets [Builder.dtCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The date and time _(in ISO 8601 format)_ when the Balance was last modified. */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /**
         * Sets [Builder.dtLastModified] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtLastModified] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        /** The date _(in ISO 8601 format)_ after which the Balance will no longer be active. */
        fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        fun feesAccountingProductId(feesAccountingProductId: String) =
            feesAccountingProductId(JsonField.of(feesAccountingProductId))

        /**
         * Sets [Builder.feesAccountingProductId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feesAccountingProductId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun feesAccountingProductId(feesAccountingProductId: JsonField<String>) = apply {
            this.feesAccountingProductId = feesAccountingProductId
        }

        /** The unique identifier (UUID) for the user who last modified the Balance. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /**
         * Sets [Builder.lastModifiedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastModifiedBy] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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
         * Sets [Builder.lineItemTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lineItemTypes] with a well-typed `List<LineItemType>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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

        /** The official name of the Balance. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** A description for overage charges. */
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

        /** The percentage surcharge applied to overage charges _(usage above the Balance)_. */
        fun overageSurchargePercent(overageSurchargePercent: Double) =
            overageSurchargePercent(JsonField.of(overageSurchargePercent))

        /**
         * Sets [Builder.overageSurchargePercent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overageSurchargePercent] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun overageSurchargePercent(overageSurchargePercent: JsonField<Double>) = apply {
            this.overageSurchargePercent = overageSurchargePercent
        }

        /**
         * A list of Product IDs whose consumption charges due at billing can be drawn-down against
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
         * The maximum amount that can be carried over past the Balance end date and draw-down
         * against for billing if there is an unused Balance amount remaining when the Balance end
         * date is reached.
         */
        fun rolloverAmount(rolloverAmount: Double) = rolloverAmount(JsonField.of(rolloverAmount))

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
         * The end date _(in ISO 8601 format)_ for the rollover grace period, which is the period
         * that unused Balance amounts can be carried over beyond the specified Balance `endDate`
         * and continue to be drawn-down against for billing.
         */
        fun rolloverEndDate(rolloverEndDate: OffsetDateTime) =
            rolloverEndDate(JsonField.of(rolloverEndDate))

        /**
         * Sets [Builder.rolloverEndDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rolloverEndDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun rolloverEndDate(rolloverEndDate: JsonField<OffsetDateTime>) = apply {
            this.rolloverEndDate = rolloverEndDate
        }

        /** The date _(in ISO 8601 format)_ when the Balance becomes active. */
        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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

        /**
         * Returns an immutable instance of [Balance].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .version()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Balance =
            Balance(
                checkRequired("id", id),
                checkRequired("version", version),
                accountId,
                amount,
                balanceDrawDownDescription,
                code,
                consumptionsAccountingProductId,
                contractId,
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
                additionalProperties.toMutableMap(),
            )
    }

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
        contractId()
        createdBy()
        currency()
        description()
        dtCreated()
        dtLastModified()
        endDate()
        feesAccountingProductId()
        lastModifiedBy()
        lineItemTypes().ifPresent { it.forEach { it.validate() } }
        name()
        overageDescription()
        overageSurchargePercent()
        productIds()
        rolloverAmount()
        rolloverEndDate()
        startDate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (version.asKnown().isPresent) 1 else 0) +
            (if (accountId.asKnown().isPresent) 1 else 0) +
            (if (amount.asKnown().isPresent) 1 else 0) +
            (if (balanceDrawDownDescription.asKnown().isPresent) 1 else 0) +
            (if (code.asKnown().isPresent) 1 else 0) +
            (if (consumptionsAccountingProductId.asKnown().isPresent) 1 else 0) +
            (if (contractId.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (dtCreated.asKnown().isPresent) 1 else 0) +
            (if (dtLastModified.asKnown().isPresent) 1 else 0) +
            (if (endDate.asKnown().isPresent) 1 else 0) +
            (if (feesAccountingProductId.asKnown().isPresent) 1 else 0) +
            (if (lastModifiedBy.asKnown().isPresent) 1 else 0) +
            (lineItemTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (overageDescription.asKnown().isPresent) 1 else 0) +
            (if (overageSurchargePercent.asKnown().isPresent) 1 else 0) +
            (productIds.asKnown().getOrNull()?.size ?: 0) +
            (if (rolloverAmount.asKnown().isPresent) 1 else 0) +
            (if (rolloverEndDate.asKnown().isPresent) 1 else 0) +
            (if (startDate.asKnown().isPresent) 1 else 0)

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

            return /* spotless:off */ other is LineItemType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Balance && id == other.id && version == other.version && accountId == other.accountId && amount == other.amount && balanceDrawDownDescription == other.balanceDrawDownDescription && code == other.code && consumptionsAccountingProductId == other.consumptionsAccountingProductId && contractId == other.contractId && createdBy == other.createdBy && currency == other.currency && description == other.description && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && endDate == other.endDate && feesAccountingProductId == other.feesAccountingProductId && lastModifiedBy == other.lastModifiedBy && lineItemTypes == other.lineItemTypes && name == other.name && overageDescription == other.overageDescription && overageSurchargePercent == other.overageSurchargePercent && productIds == other.productIds && rolloverAmount == other.rolloverAmount && rolloverEndDate == other.rolloverEndDate && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, accountId, amount, balanceDrawDownDescription, code, consumptionsAccountingProductId, contractId, createdBy, currency, description, dtCreated, dtLastModified, endDate, feesAccountingProductId, lastModifiedBy, lineItemTypes, name, overageDescription, overageSurchargePercent, productIds, rolloverAmount, rolloverEndDate, startDate, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Balance{id=$id, version=$version, accountId=$accountId, amount=$amount, balanceDrawDownDescription=$balanceDrawDownDescription, code=$code, consumptionsAccountingProductId=$consumptionsAccountingProductId, contractId=$contractId, createdBy=$createdBy, currency=$currency, description=$description, dtCreated=$dtCreated, dtLastModified=$dtLastModified, endDate=$endDate, feesAccountingProductId=$feesAccountingProductId, lastModifiedBy=$lastModifiedBy, lineItemTypes=$lineItemTypes, name=$name, overageDescription=$overageDescription, overageSurchargePercent=$overageSurchargePercent, productIds=$productIds, rolloverAmount=$rolloverAmount, rolloverEndDate=$rolloverEndDate, startDate=$startDate, additionalProperties=$additionalProperties}"
}
