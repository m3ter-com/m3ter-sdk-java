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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Create a new Balance for the given end customer Account.
 *
 * This endpoint allows you to create a new Balance for a specific end customer Account. The Balance
 * details should be provided in the request body.
 */
class BalanceCreateParams
private constructor(
    private val orgId: String,
    private val body: BalanceCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    /** The unique identifier (UUID) for the end customer Account. */
    fun accountId(): String = body.accountId()

    /** The currency code used for the Balance amount. For example: USD, GBP or EUR. */
    fun currency(): String = body.currency()

    /**
     * The date _(in ISO 8601 format)_ after which the Balance will no longer be active for the
     * Account.
     *
     * **Note:** You can use the `rolloverEndDate` request parameter to define an extended grace
     * period for continued draw-down against the Balance if any amount remains when the specified
     * `endDate` is reached.
     */
    fun endDate(): OffsetDateTime = body.endDate()

    /** The date _(in ISO 8601 format)_ when the Balance becomes active. */
    fun startDate(): OffsetDateTime = body.startDate()

    /**
     * A description for the bill line items for draw-down charges against the Balance.
     * _(Optional)._
     */
    fun balanceDrawDownDescription(): Optional<String> = body.balanceDrawDownDescription()

    /** Unique short code for the Balance. */
    fun code(): Optional<String> = body.code()

    /**
     * Optional Product ID this Balance Consumptions should be attributed to for accounting purposes
     */
    fun consumptionsAccountingProductId(): Optional<String> = body.consumptionsAccountingProductId()

    /** A description of the Balance. */
    fun description(): Optional<String> = body.description()

    /** Optional Product ID this Balance Fees should be attributed to for accounting purposes */
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
     * **NOTE:** If no charge types are specified, by default _all types_ can draw-down against the
     * Balance amount at billing.
     */
    fun lineItemTypes(): Optional<List<LineItemType>> = body.lineItemTypes()

    /** The official name for the Balance. */
    fun name(): Optional<String> = body.name()

    /** A description for Bill line items overage charges. */
    fun overageDescription(): Optional<String> = body.overageDescription()

    /**
     * Define a surcharge level, as a percentage of regular usage rating, applied to overages
     * _(usage charges that exceed the Balance amount)_. For example, if the regular usage rate is
     * $10 per unit of usage consumed and `overageSurchargePercent` is set at 10%, then any usage
     * charged above the original Balance amount is charged at $11 per unit of usage.
     */
    fun overageSurchargePercent(): Optional<Double> = body.overageSurchargePercent()

    /**
     * Specify the Products whose consumption charges due at billing can be drawn-down against the
     * Balance amount.
     *
     * **Note:** If you don't specify any Products for Balance draw-down, by default the consumption
     * charges for any Product the Account consumes will be drawn-down against the Balance amount.
     */
    fun productIds(): Optional<List<String>> = body.productIds()

    /**
     * The maximum amount that can be carried over past the Balance end date for draw-down at
     * billing if there is any unused Balance amount when the end date is reached. Works with
     * `rolloverEndDate` to define the amount and duration of a Balance "grace period". _(Optional)_
     *
     * **Notes:**
     * - If you leave `rolloverAmount` empty and only enter a `rolloverEndDate`, any amount left
     *   over after the Balance end date is reached will be drawn-down against up to the specified
     *   `rolloverEndDate`.
     * - You must enter a `rolloverEndDate`. If you only enter a `rolloverAmount` without entering a
     *   `rolloverEndDate`, you'll receive an error when trying to create or update the Balance.
     * - If you don't want to grant any grace period for outstanding Balance amounts, then do not
     *   use `rolloverAmount` and `rolloverEndDate`.
     */
    fun rolloverAmount(): Optional<Double> = body.rolloverAmount()

    /**
     * The end date _(in ISO 8601 format)_ for the grace period during which unused Balance amounts
     * can be carried over and drawn-down against at billing.
     *
     * **Note:** Use `rolloverAmount` if you want to specify a maximum amount that can be carried
     * over and made available for draw-down.
     */
    fun rolloverEndDate(): Optional<OffsetDateTime> = body.rolloverEndDate()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     */
    fun version(): Optional<Long> = body.version()

    /** The unique identifier (UUID) for the end customer Account. */
    fun _accountId(): JsonField<String> = body._accountId()

    /** The currency code used for the Balance amount. For example: USD, GBP or EUR. */
    fun _currency(): JsonField<String> = body._currency()

    /**
     * The date _(in ISO 8601 format)_ after which the Balance will no longer be active for the
     * Account.
     *
     * **Note:** You can use the `rolloverEndDate` request parameter to define an extended grace
     * period for continued draw-down against the Balance if any amount remains when the specified
     * `endDate` is reached.
     */
    fun _endDate(): JsonField<OffsetDateTime> = body._endDate()

    /** The date _(in ISO 8601 format)_ when the Balance becomes active. */
    fun _startDate(): JsonField<OffsetDateTime> = body._startDate()

    /**
     * A description for the bill line items for draw-down charges against the Balance.
     * _(Optional)._
     */
    fun _balanceDrawDownDescription(): JsonField<String> = body._balanceDrawDownDescription()

    /** Unique short code for the Balance. */
    fun _code(): JsonField<String> = body._code()

    /**
     * Optional Product ID this Balance Consumptions should be attributed to for accounting purposes
     */
    fun _consumptionsAccountingProductId(): JsonField<String> =
        body._consumptionsAccountingProductId()

    /** A description of the Balance. */
    fun _description(): JsonField<String> = body._description()

    /** Optional Product ID this Balance Fees should be attributed to for accounting purposes */
    fun _feesAccountingProductId(): JsonField<String> = body._feesAccountingProductId()

    /**
     * Specify the line item charge types that can draw-down at billing against the Balance amount.
     * Options are:
     * - `"MINIMUM_SPEND"`
     * - `"STANDING_CHARGE"`
     * - `"USAGE"`
     * - `"COUNTER_RUNNING_TOTAL_CHARGE"`
     * - `"COUNTER_ADJUSTMENT_DEBIT"`
     *
     * **NOTE:** If no charge types are specified, by default _all types_ can draw-down against the
     * Balance amount at billing.
     */
    fun _lineItemTypes(): JsonField<List<LineItemType>> = body._lineItemTypes()

    /** The official name for the Balance. */
    fun _name(): JsonField<String> = body._name()

    /** A description for Bill line items overage charges. */
    fun _overageDescription(): JsonField<String> = body._overageDescription()

    /**
     * Define a surcharge level, as a percentage of regular usage rating, applied to overages
     * _(usage charges that exceed the Balance amount)_. For example, if the regular usage rate is
     * $10 per unit of usage consumed and `overageSurchargePercent` is set at 10%, then any usage
     * charged above the original Balance amount is charged at $11 per unit of usage.
     */
    fun _overageSurchargePercent(): JsonField<Double> = body._overageSurchargePercent()

    /**
     * Specify the Products whose consumption charges due at billing can be drawn-down against the
     * Balance amount.
     *
     * **Note:** If you don't specify any Products for Balance draw-down, by default the consumption
     * charges for any Product the Account consumes will be drawn-down against the Balance amount.
     */
    fun _productIds(): JsonField<List<String>> = body._productIds()

    /**
     * The maximum amount that can be carried over past the Balance end date for draw-down at
     * billing if there is any unused Balance amount when the end date is reached. Works with
     * `rolloverEndDate` to define the amount and duration of a Balance "grace period". _(Optional)_
     *
     * **Notes:**
     * - If you leave `rolloverAmount` empty and only enter a `rolloverEndDate`, any amount left
     *   over after the Balance end date is reached will be drawn-down against up to the specified
     *   `rolloverEndDate`.
     * - You must enter a `rolloverEndDate`. If you only enter a `rolloverAmount` without entering a
     *   `rolloverEndDate`, you'll receive an error when trying to create or update the Balance.
     * - If you don't want to grant any grace period for outstanding Balance amounts, then do not
     *   use `rolloverAmount` and `rolloverEndDate`.
     */
    fun _rolloverAmount(): JsonField<Double> = body._rolloverAmount()

    /**
     * The end date _(in ISO 8601 format)_ for the grace period during which unused Balance amounts
     * can be carried over and drawn-down against at billing.
     *
     * **Note:** Use `rolloverAmount` if you want to specify a maximum amount that can be carried
     * over and made available for draw-down.
     */
    fun _rolloverEndDate(): JsonField<OffsetDateTime> = body._rolloverEndDate()

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

    @JvmSynthetic internal fun _body(): BalanceCreateBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> orgId
            else -> ""
        }
    }

    @NoAutoDetect
    class BalanceCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("accountId")
        @ExcludeMissing
        private val accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("endDate")
        @ExcludeMissing
        private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("startDate")
        @ExcludeMissing
        private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("balanceDrawDownDescription")
        @ExcludeMissing
        private val balanceDrawDownDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("code")
        @ExcludeMissing
        private val code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("consumptionsAccountingProductId")
        @ExcludeMissing
        private val consumptionsAccountingProductId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("feesAccountingProductId")
        @ExcludeMissing
        private val feesAccountingProductId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lineItemTypes")
        @ExcludeMissing
        private val lineItemTypes: JsonField<List<LineItemType>> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("version")
        @ExcludeMissing
        private val version: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The unique identifier (UUID) for the end customer Account. */
        fun accountId(): String = accountId.getRequired("accountId")

        /** The currency code used for the Balance amount. For example: USD, GBP or EUR. */
        fun currency(): String = currency.getRequired("currency")

        /**
         * The date _(in ISO 8601 format)_ after which the Balance will no longer be active for the
         * Account.
         *
         * **Note:** You can use the `rolloverEndDate` request parameter to define an extended grace
         * period for continued draw-down against the Balance if any amount remains when the
         * specified `endDate` is reached.
         */
        fun endDate(): OffsetDateTime = endDate.getRequired("endDate")

        /** The date _(in ISO 8601 format)_ when the Balance becomes active. */
        fun startDate(): OffsetDateTime = startDate.getRequired("startDate")

        /**
         * A description for the bill line items for draw-down charges against the Balance.
         * _(Optional)._
         */
        fun balanceDrawDownDescription(): Optional<String> =
            Optional.ofNullable(
                balanceDrawDownDescription.getNullable("balanceDrawDownDescription")
            )

        /** Unique short code for the Balance. */
        fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

        /**
         * Optional Product ID this Balance Consumptions should be attributed to for accounting
         * purposes
         */
        fun consumptionsAccountingProductId(): Optional<String> =
            Optional.ofNullable(
                consumptionsAccountingProductId.getNullable("consumptionsAccountingProductId")
            )

        /** A description of the Balance. */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /** Optional Product ID this Balance Fees should be attributed to for accounting purposes */
        fun feesAccountingProductId(): Optional<String> =
            Optional.ofNullable(feesAccountingProductId.getNullable("feesAccountingProductId"))

        /**
         * Specify the line item charge types that can draw-down at billing against the Balance
         * amount. Options are:
         * - `"MINIMUM_SPEND"`
         * - `"STANDING_CHARGE"`
         * - `"USAGE"`
         * - `"COUNTER_RUNNING_TOTAL_CHARGE"`
         * - `"COUNTER_ADJUSTMENT_DEBIT"`
         *
         * **NOTE:** If no charge types are specified, by default _all types_ can draw-down against
         * the Balance amount at billing.
         */
        fun lineItemTypes(): Optional<List<LineItemType>> =
            Optional.ofNullable(lineItemTypes.getNullable("lineItemTypes"))

        /** The official name for the Balance. */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** A description for Bill line items overage charges. */
        fun overageDescription(): Optional<String> =
            Optional.ofNullable(overageDescription.getNullable("overageDescription"))

        /**
         * Define a surcharge level, as a percentage of regular usage rating, applied to overages
         * _(usage charges that exceed the Balance amount)_. For example, if the regular usage rate
         * is $10 per unit of usage consumed and `overageSurchargePercent` is set at 10%, then any
         * usage charged above the original Balance amount is charged at $11 per unit of usage.
         */
        fun overageSurchargePercent(): Optional<Double> =
            Optional.ofNullable(overageSurchargePercent.getNullable("overageSurchargePercent"))

        /**
         * Specify the Products whose consumption charges due at billing can be drawn-down against
         * the Balance amount.
         *
         * **Note:** If you don't specify any Products for Balance draw-down, by default the
         * consumption charges for any Product the Account consumes will be drawn-down against the
         * Balance amount.
         */
        fun productIds(): Optional<List<String>> =
            Optional.ofNullable(productIds.getNullable("productIds"))

        /**
         * The maximum amount that can be carried over past the Balance end date for draw-down at
         * billing if there is any unused Balance amount when the end date is reached. Works with
         * `rolloverEndDate` to define the amount and duration of a Balance "grace period".
         * _(Optional)_
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
        fun rolloverAmount(): Optional<Double> =
            Optional.ofNullable(rolloverAmount.getNullable("rolloverAmount"))

        /**
         * The end date _(in ISO 8601 format)_ for the grace period during which unused Balance
         * amounts can be carried over and drawn-down against at billing.
         *
         * **Note:** Use `rolloverAmount` if you want to specify a maximum amount that can be
         * carried over and made available for draw-down.
         */
        fun rolloverEndDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(rolloverEndDate.getNullable("rolloverEndDate"))

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

        /** The unique identifier (UUID) for the end customer Account. */
        @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /** The currency code used for the Balance amount. For example: USD, GBP or EUR. */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * The date _(in ISO 8601 format)_ after which the Balance will no longer be active for the
         * Account.
         *
         * **Note:** You can use the `rolloverEndDate` request parameter to define an extended grace
         * period for continued draw-down against the Balance if any amount remains when the
         * specified `endDate` is reached.
         */
        @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

        /** The date _(in ISO 8601 format)_ when the Balance becomes active. */
        @JsonProperty("startDate")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

        /**
         * A description for the bill line items for draw-down charges against the Balance.
         * _(Optional)._
         */
        @JsonProperty("balanceDrawDownDescription")
        @ExcludeMissing
        fun _balanceDrawDownDescription(): JsonField<String> = balanceDrawDownDescription

        /** Unique short code for the Balance. */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Optional Product ID this Balance Consumptions should be attributed to for accounting
         * purposes
         */
        @JsonProperty("consumptionsAccountingProductId")
        @ExcludeMissing
        fun _consumptionsAccountingProductId(): JsonField<String> = consumptionsAccountingProductId

        /** A description of the Balance. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** Optional Product ID this Balance Fees should be attributed to for accounting purposes */
        @JsonProperty("feesAccountingProductId")
        @ExcludeMissing
        fun _feesAccountingProductId(): JsonField<String> = feesAccountingProductId

        /**
         * Specify the line item charge types that can draw-down at billing against the Balance
         * amount. Options are:
         * - `"MINIMUM_SPEND"`
         * - `"STANDING_CHARGE"`
         * - `"USAGE"`
         * - `"COUNTER_RUNNING_TOTAL_CHARGE"`
         * - `"COUNTER_ADJUSTMENT_DEBIT"`
         *
         * **NOTE:** If no charge types are specified, by default _all types_ can draw-down against
         * the Balance amount at billing.
         */
        @JsonProperty("lineItemTypes")
        @ExcludeMissing
        fun _lineItemTypes(): JsonField<List<LineItemType>> = lineItemTypes

        /** The official name for the Balance. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** A description for Bill line items overage charges. */
        @JsonProperty("overageDescription")
        @ExcludeMissing
        fun _overageDescription(): JsonField<String> = overageDescription

        /**
         * Define a surcharge level, as a percentage of regular usage rating, applied to overages
         * _(usage charges that exceed the Balance amount)_. For example, if the regular usage rate
         * is $10 per unit of usage consumed and `overageSurchargePercent` is set at 10%, then any
         * usage charged above the original Balance amount is charged at $11 per unit of usage.
         */
        @JsonProperty("overageSurchargePercent")
        @ExcludeMissing
        fun _overageSurchargePercent(): JsonField<Double> = overageSurchargePercent

        /**
         * Specify the Products whose consumption charges due at billing can be drawn-down against
         * the Balance amount.
         *
         * **Note:** If you don't specify any Products for Balance draw-down, by default the
         * consumption charges for any Product the Account consumes will be drawn-down against the
         * Balance amount.
         */
        @JsonProperty("productIds")
        @ExcludeMissing
        fun _productIds(): JsonField<List<String>> = productIds

        /**
         * The maximum amount that can be carried over past the Balance end date for draw-down at
         * billing if there is any unused Balance amount when the end date is reached. Works with
         * `rolloverEndDate` to define the amount and duration of a Balance "grace period".
         * _(Optional)_
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
        @JsonProperty("rolloverAmount")
        @ExcludeMissing
        fun _rolloverAmount(): JsonField<Double> = rolloverAmount

        /**
         * The end date _(in ISO 8601 format)_ for the grace period during which unused Balance
         * amounts can be carried over and drawn-down against at billing.
         *
         * **Note:** Use `rolloverAmount` if you want to specify a maximum amount that can be
         * carried over and made available for draw-down.
         */
        @JsonProperty("rolloverEndDate")
        @ExcludeMissing
        fun _rolloverEndDate(): JsonField<OffsetDateTime> = rolloverEndDate

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

        fun validate(): BalanceCreateBody = apply {
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
            description()
            feesAccountingProductId()
            lineItemTypes()
            name()
            overageDescription()
            overageSurchargePercent()
            productIds()
            rolloverAmount()
            rolloverEndDate()
            version()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BalanceCreateBody]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var currency: JsonField<String>? = null
            private var endDate: JsonField<OffsetDateTime>? = null
            private var startDate: JsonField<OffsetDateTime>? = null
            private var balanceDrawDownDescription: JsonField<String> = JsonMissing.of()
            private var code: JsonField<String> = JsonMissing.of()
            private var consumptionsAccountingProductId: JsonField<String> = JsonMissing.of()
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
            internal fun from(balanceCreateBody: BalanceCreateBody) = apply {
                accountId = balanceCreateBody.accountId
                currency = balanceCreateBody.currency
                endDate = balanceCreateBody.endDate
                startDate = balanceCreateBody.startDate
                balanceDrawDownDescription = balanceCreateBody.balanceDrawDownDescription
                code = balanceCreateBody.code
                consumptionsAccountingProductId = balanceCreateBody.consumptionsAccountingProductId
                description = balanceCreateBody.description
                feesAccountingProductId = balanceCreateBody.feesAccountingProductId
                lineItemTypes = balanceCreateBody.lineItemTypes.map { it.toMutableList() }
                name = balanceCreateBody.name
                overageDescription = balanceCreateBody.overageDescription
                overageSurchargePercent = balanceCreateBody.overageSurchargePercent
                productIds = balanceCreateBody.productIds.map { it.toMutableList() }
                rolloverAmount = balanceCreateBody.rolloverAmount
                rolloverEndDate = balanceCreateBody.rolloverEndDate
                version = balanceCreateBody.version
                additionalProperties = balanceCreateBody.additionalProperties.toMutableMap()
            }

            /** The unique identifier (UUID) for the end customer Account. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /** The unique identifier (UUID) for the end customer Account. */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The currency code used for the Balance amount. For example: USD, GBP or EUR. */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /** The currency code used for the Balance amount. For example: USD, GBP or EUR. */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /**
             * The date _(in ISO 8601 format)_ after which the Balance will no longer be active for
             * the Account.
             *
             * **Note:** You can use the `rolloverEndDate` request parameter to define an extended
             * grace period for continued draw-down against the Balance if any amount remains when
             * the specified `endDate` is reached.
             */
            fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

            /**
             * The date _(in ISO 8601 format)_ after which the Balance will no longer be active for
             * the Account.
             *
             * **Note:** You can use the `rolloverEndDate` request parameter to define an extended
             * grace period for continued draw-down against the Balance if any amount remains when
             * the specified `endDate` is reached.
             */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /** The date _(in ISO 8601 format)_ when the Balance becomes active. */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /** The date _(in ISO 8601 format)_ when the Balance becomes active. */
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
            }

            /**
             * A description for the bill line items for draw-down charges against the Balance.
             * _(Optional)._
             */
            fun balanceDrawDownDescription(balanceDrawDownDescription: String) =
                balanceDrawDownDescription(JsonField.of(balanceDrawDownDescription))

            /**
             * A description for the bill line items for draw-down charges against the Balance.
             * _(Optional)._
             */
            fun balanceDrawDownDescription(balanceDrawDownDescription: JsonField<String>) = apply {
                this.balanceDrawDownDescription = balanceDrawDownDescription
            }

            /** Unique short code for the Balance. */
            fun code(code: String) = code(JsonField.of(code))

            /** Unique short code for the Balance. */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /**
             * Optional Product ID this Balance Consumptions should be attributed to for accounting
             * purposes
             */
            fun consumptionsAccountingProductId(consumptionsAccountingProductId: String) =
                consumptionsAccountingProductId(JsonField.of(consumptionsAccountingProductId))

            /**
             * Optional Product ID this Balance Consumptions should be attributed to for accounting
             * purposes
             */
            fun consumptionsAccountingProductId(
                consumptionsAccountingProductId: JsonField<String>
            ) = apply { this.consumptionsAccountingProductId = consumptionsAccountingProductId }

            /** A description of the Balance. */
            fun description(description: String) = description(JsonField.of(description))

            /** A description of the Balance. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * Optional Product ID this Balance Fees should be attributed to for accounting purposes
             */
            fun feesAccountingProductId(feesAccountingProductId: String) =
                feesAccountingProductId(JsonField.of(feesAccountingProductId))

            /**
             * Optional Product ID this Balance Fees should be attributed to for accounting purposes
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
             * **NOTE:** If no charge types are specified, by default _all types_ can draw-down
             * against the Balance amount at billing.
             */
            fun lineItemTypes(lineItemTypes: List<LineItemType>) =
                lineItemTypes(JsonField.of(lineItemTypes))

            /**
             * Specify the line item charge types that can draw-down at billing against the Balance
             * amount. Options are:
             * - `"MINIMUM_SPEND"`
             * - `"STANDING_CHARGE"`
             * - `"USAGE"`
             * - `"COUNTER_RUNNING_TOTAL_CHARGE"`
             * - `"COUNTER_ADJUSTMENT_DEBIT"`
             *
             * **NOTE:** If no charge types are specified, by default _all types_ can draw-down
             * against the Balance amount at billing.
             */
            fun lineItemTypes(lineItemTypes: JsonField<List<LineItemType>>) = apply {
                this.lineItemTypes = lineItemTypes.map { it.toMutableList() }
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
             * **NOTE:** If no charge types are specified, by default _all types_ can draw-down
             * against the Balance amount at billing.
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

            /** The official name for the Balance. */
            fun name(name: String) = name(JsonField.of(name))

            /** The official name for the Balance. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** A description for Bill line items overage charges. */
            fun overageDescription(overageDescription: String) =
                overageDescription(JsonField.of(overageDescription))

            /** A description for Bill line items overage charges. */
            fun overageDescription(overageDescription: JsonField<String>) = apply {
                this.overageDescription = overageDescription
            }

            /**
             * Define a surcharge level, as a percentage of regular usage rating, applied to
             * overages _(usage charges that exceed the Balance amount)_. For example, if the
             * regular usage rate is $10 per unit of usage consumed and `overageSurchargePercent` is
             * set at 10%, then any usage charged above the original Balance amount is charged at
             * $11 per unit of usage.
             */
            fun overageSurchargePercent(overageSurchargePercent: Double) =
                overageSurchargePercent(JsonField.of(overageSurchargePercent))

            /**
             * Define a surcharge level, as a percentage of regular usage rating, applied to
             * overages _(usage charges that exceed the Balance amount)_. For example, if the
             * regular usage rate is $10 per unit of usage consumed and `overageSurchargePercent` is
             * set at 10%, then any usage charged above the original Balance amount is charged at
             * $11 per unit of usage.
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
             * Specify the Products whose consumption charges due at billing can be drawn-down
             * against the Balance amount.
             *
             * **Note:** If you don't specify any Products for Balance draw-down, by default the
             * consumption charges for any Product the Account consumes will be drawn-down against
             * the Balance amount.
             */
            fun productIds(productIds: JsonField<List<String>>) = apply {
                this.productIds = productIds.map { it.toMutableList() }
            }

            /**
             * Specify the Products whose consumption charges due at billing can be drawn-down
             * against the Balance amount.
             *
             * **Note:** If you don't specify any Products for Balance draw-down, by default the
             * consumption charges for any Product the Account consumes will be drawn-down against
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
             * The maximum amount that can be carried over past the Balance end date for draw-down
             * at billing if there is any unused Balance amount when the end date is reached. Works
             * with `rolloverEndDate` to define the amount and duration of a Balance "grace period".
             * _(Optional)_
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
             * The maximum amount that can be carried over past the Balance end date for draw-down
             * at billing if there is any unused Balance amount when the end date is reached. Works
             * with `rolloverEndDate` to define the amount and duration of a Balance "grace period".
             * _(Optional)_
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
            fun rolloverAmount(rolloverAmount: JsonField<Double>) = apply {
                this.rolloverAmount = rolloverAmount
            }

            /**
             * The end date _(in ISO 8601 format)_ for the grace period during which unused Balance
             * amounts can be carried over and drawn-down against at billing.
             *
             * **Note:** Use `rolloverAmount` if you want to specify a maximum amount that can be
             * carried over and made available for draw-down.
             */
            fun rolloverEndDate(rolloverEndDate: OffsetDateTime) =
                rolloverEndDate(JsonField.of(rolloverEndDate))

            /**
             * The end date _(in ISO 8601 format)_ for the grace period during which unused Balance
             * amounts can be carried over and drawn-down against at billing.
             *
             * **Note:** Use `rolloverAmount` if you want to specify a maximum amount that can be
             * carried over and made available for draw-down.
             */
            fun rolloverEndDate(rolloverEndDate: JsonField<OffsetDateTime>) = apply {
                this.rolloverEndDate = rolloverEndDate
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

            fun build(): BalanceCreateBody =
                BalanceCreateBody(
                    checkRequired("accountId", accountId),
                    checkRequired("currency", currency),
                    checkRequired("endDate", endDate),
                    checkRequired("startDate", startDate),
                    balanceDrawDownDescription,
                    code,
                    consumptionsAccountingProductId,
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
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BalanceCreateBody && accountId == other.accountId && currency == other.currency && endDate == other.endDate && startDate == other.startDate && balanceDrawDownDescription == other.balanceDrawDownDescription && code == other.code && consumptionsAccountingProductId == other.consumptionsAccountingProductId && description == other.description && feesAccountingProductId == other.feesAccountingProductId && lineItemTypes == other.lineItemTypes && name == other.name && overageDescription == other.overageDescription && overageSurchargePercent == other.overageSurchargePercent && productIds == other.productIds && rolloverAmount == other.rolloverAmount && rolloverEndDate == other.rolloverEndDate && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, currency, endDate, startDate, balanceDrawDownDescription, code, consumptionsAccountingProductId, description, feesAccountingProductId, lineItemTypes, name, overageDescription, overageSurchargePercent, productIds, rolloverAmount, rolloverEndDate, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BalanceCreateBody{accountId=$accountId, currency=$currency, endDate=$endDate, startDate=$startDate, balanceDrawDownDescription=$balanceDrawDownDescription, code=$code, consumptionsAccountingProductId=$consumptionsAccountingProductId, description=$description, feesAccountingProductId=$feesAccountingProductId, lineItemTypes=$lineItemTypes, name=$name, overageDescription=$overageDescription, overageSurchargePercent=$overageSurchargePercent, productIds=$productIds, rolloverAmount=$rolloverAmount, rolloverEndDate=$rolloverEndDate, version=$version, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BalanceCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var body: BalanceCreateBody.Builder = BalanceCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(balanceCreateParams: BalanceCreateParams) = apply {
            orgId = balanceCreateParams.orgId
            body = balanceCreateParams.body.toBuilder()
            additionalHeaders = balanceCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = balanceCreateParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /** The unique identifier (UUID) for the end customer Account. */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /** The unique identifier (UUID) for the end customer Account. */
        fun accountId(accountId: JsonField<String>) = apply { body.accountId(accountId) }

        /** The currency code used for the Balance amount. For example: USD, GBP or EUR. */
        fun currency(currency: String) = apply { body.currency(currency) }

        /** The currency code used for the Balance amount. For example: USD, GBP or EUR. */
        fun currency(currency: JsonField<String>) = apply { body.currency(currency) }

        /**
         * The date _(in ISO 8601 format)_ after which the Balance will no longer be active for the
         * Account.
         *
         * **Note:** You can use the `rolloverEndDate` request parameter to define an extended grace
         * period for continued draw-down against the Balance if any amount remains when the
         * specified `endDate` is reached.
         */
        fun endDate(endDate: OffsetDateTime) = apply { body.endDate(endDate) }

        /**
         * The date _(in ISO 8601 format)_ after which the Balance will no longer be active for the
         * Account.
         *
         * **Note:** You can use the `rolloverEndDate` request parameter to define an extended grace
         * period for continued draw-down against the Balance if any amount remains when the
         * specified `endDate` is reached.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { body.endDate(endDate) }

        /** The date _(in ISO 8601 format)_ when the Balance becomes active. */
        fun startDate(startDate: OffsetDateTime) = apply { body.startDate(startDate) }

        /** The date _(in ISO 8601 format)_ when the Balance becomes active. */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { body.startDate(startDate) }

        /**
         * A description for the bill line items for draw-down charges against the Balance.
         * _(Optional)._
         */
        fun balanceDrawDownDescription(balanceDrawDownDescription: String) = apply {
            body.balanceDrawDownDescription(balanceDrawDownDescription)
        }

        /**
         * A description for the bill line items for draw-down charges against the Balance.
         * _(Optional)._
         */
        fun balanceDrawDownDescription(balanceDrawDownDescription: JsonField<String>) = apply {
            body.balanceDrawDownDescription(balanceDrawDownDescription)
        }

        /** Unique short code for the Balance. */
        fun code(code: String) = apply { body.code(code) }

        /** Unique short code for the Balance. */
        fun code(code: JsonField<String>) = apply { body.code(code) }

        /**
         * Optional Product ID this Balance Consumptions should be attributed to for accounting
         * purposes
         */
        fun consumptionsAccountingProductId(consumptionsAccountingProductId: String) = apply {
            body.consumptionsAccountingProductId(consumptionsAccountingProductId)
        }

        /**
         * Optional Product ID this Balance Consumptions should be attributed to for accounting
         * purposes
         */
        fun consumptionsAccountingProductId(consumptionsAccountingProductId: JsonField<String>) =
            apply {
                body.consumptionsAccountingProductId(consumptionsAccountingProductId)
            }

        /** A description of the Balance. */
        fun description(description: String) = apply { body.description(description) }

        /** A description of the Balance. */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** Optional Product ID this Balance Fees should be attributed to for accounting purposes */
        fun feesAccountingProductId(feesAccountingProductId: String) = apply {
            body.feesAccountingProductId(feesAccountingProductId)
        }

        /** Optional Product ID this Balance Fees should be attributed to for accounting purposes */
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
         * **NOTE:** If no charge types are specified, by default _all types_ can draw-down against
         * the Balance amount at billing.
         */
        fun lineItemTypes(lineItemTypes: List<LineItemType>) = apply {
            body.lineItemTypes(lineItemTypes)
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
         * **NOTE:** If no charge types are specified, by default _all types_ can draw-down against
         * the Balance amount at billing.
         */
        fun lineItemTypes(lineItemTypes: JsonField<List<LineItemType>>) = apply {
            body.lineItemTypes(lineItemTypes)
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
         * **NOTE:** If no charge types are specified, by default _all types_ can draw-down against
         * the Balance amount at billing.
         */
        fun addLineItemType(lineItemType: LineItemType) = apply {
            body.addLineItemType(lineItemType)
        }

        /** The official name for the Balance. */
        fun name(name: String) = apply { body.name(name) }

        /** The official name for the Balance. */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** A description for Bill line items overage charges. */
        fun overageDescription(overageDescription: String) = apply {
            body.overageDescription(overageDescription)
        }

        /** A description for Bill line items overage charges. */
        fun overageDescription(overageDescription: JsonField<String>) = apply {
            body.overageDescription(overageDescription)
        }

        /**
         * Define a surcharge level, as a percentage of regular usage rating, applied to overages
         * _(usage charges that exceed the Balance amount)_. For example, if the regular usage rate
         * is $10 per unit of usage consumed and `overageSurchargePercent` is set at 10%, then any
         * usage charged above the original Balance amount is charged at $11 per unit of usage.
         */
        fun overageSurchargePercent(overageSurchargePercent: Double) = apply {
            body.overageSurchargePercent(overageSurchargePercent)
        }

        /**
         * Define a surcharge level, as a percentage of regular usage rating, applied to overages
         * _(usage charges that exceed the Balance amount)_. For example, if the regular usage rate
         * is $10 per unit of usage consumed and `overageSurchargePercent` is set at 10%, then any
         * usage charged above the original Balance amount is charged at $11 per unit of usage.
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
         * Specify the Products whose consumption charges due at billing can be drawn-down against
         * the Balance amount.
         *
         * **Note:** If you don't specify any Products for Balance draw-down, by default the
         * consumption charges for any Product the Account consumes will be drawn-down against the
         * Balance amount.
         */
        fun productIds(productIds: JsonField<List<String>>) = apply { body.productIds(productIds) }

        /**
         * Specify the Products whose consumption charges due at billing can be drawn-down against
         * the Balance amount.
         *
         * **Note:** If you don't specify any Products for Balance draw-down, by default the
         * consumption charges for any Product the Account consumes will be drawn-down against the
         * Balance amount.
         */
        fun addProductId(productId: String) = apply { body.addProductId(productId) }

        /**
         * The maximum amount that can be carried over past the Balance end date for draw-down at
         * billing if there is any unused Balance amount when the end date is reached. Works with
         * `rolloverEndDate` to define the amount and duration of a Balance "grace period".
         * _(Optional)_
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
         * The maximum amount that can be carried over past the Balance end date for draw-down at
         * billing if there is any unused Balance amount when the end date is reached. Works with
         * `rolloverEndDate` to define the amount and duration of a Balance "grace period".
         * _(Optional)_
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
        fun rolloverAmount(rolloverAmount: JsonField<Double>) = apply {
            body.rolloverAmount(rolloverAmount)
        }

        /**
         * The end date _(in ISO 8601 format)_ for the grace period during which unused Balance
         * amounts can be carried over and drawn-down against at billing.
         *
         * **Note:** Use `rolloverAmount` if you want to specify a maximum amount that can be
         * carried over and made available for draw-down.
         */
        fun rolloverEndDate(rolloverEndDate: OffsetDateTime) = apply {
            body.rolloverEndDate(rolloverEndDate)
        }

        /**
         * The end date _(in ISO 8601 format)_ for the grace period during which unused Balance
         * amounts can be carried over and drawn-down against at billing.
         *
         * **Note:** Use `rolloverAmount` if you want to specify a maximum amount that can be
         * carried over and made available for draw-down.
         */
        fun rolloverEndDate(rolloverEndDate: JsonField<OffsetDateTime>) = apply {
            body.rolloverEndDate(rolloverEndDate)
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

        fun build(): BalanceCreateParams =
            BalanceCreateParams(
                checkRequired("orgId", orgId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

        fun asString(): String = _value().asStringOrThrow()

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

        return /* spotless:off */ other is BalanceCreateParams && orgId == other.orgId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BalanceCreateParams{orgId=$orgId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
