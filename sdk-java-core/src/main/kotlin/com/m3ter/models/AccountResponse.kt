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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AccountResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val address: JsonField<Address>,
    private val autoGenerateStatementMode: JsonField<AutoGenerateStatementMode>,
    private val billEpoch: JsonField<LocalDate>,
    private val code: JsonField<String>,
    private val createdBy: JsonField<String>,
    private val creditApplicationOrder: JsonField<List<CreditApplicationOrder>>,
    private val currency: JsonField<String>,
    private val customFields: JsonField<CustomFields>,
    private val daysBeforeBillDue: JsonField<Int>,
    private val dtCreated: JsonField<OffsetDateTime>,
    private val dtLastModified: JsonField<OffsetDateTime>,
    private val emailAddress: JsonField<String>,
    private val lastModifiedBy: JsonField<String>,
    private val name: JsonField<String>,
    private val parentAccountId: JsonField<String>,
    private val purchaseOrderNumber: JsonField<String>,
    private val statementDefinitionId: JsonField<String>,
    private val version: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("autoGenerateStatementMode")
        @ExcludeMissing
        autoGenerateStatementMode: JsonField<AutoGenerateStatementMode> = JsonMissing.of(),
        @JsonProperty("billEpoch")
        @ExcludeMissing
        billEpoch: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("creditApplicationOrder")
        @ExcludeMissing
        creditApplicationOrder: JsonField<List<CreditApplicationOrder>> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customFields")
        @ExcludeMissing
        customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("daysBeforeBillDue")
        @ExcludeMissing
        daysBeforeBillDue: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("dtCreated")
        @ExcludeMissing
        dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("emailAddress")
        @ExcludeMissing
        emailAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        lastModifiedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parentAccountId")
        @ExcludeMissing
        parentAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("purchaseOrderNumber")
        @ExcludeMissing
        purchaseOrderNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("statementDefinitionId")
        @ExcludeMissing
        statementDefinitionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        address,
        autoGenerateStatementMode,
        billEpoch,
        code,
        createdBy,
        creditApplicationOrder,
        currency,
        customFields,
        daysBeforeBillDue,
        dtCreated,
        dtLastModified,
        emailAddress,
        lastModifiedBy,
        name,
        parentAccountId,
        purchaseOrderNumber,
        statementDefinitionId,
        version,
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
     * Contact address.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun address(): Optional<Address> = address.getOptional("address")

    /**
     * Specify whether to auto-generate statements once Bills are approved or locked.
     * - **None**. Statements will not be auto-generated.
     * - **JSON**. Statements are auto-generated in JSON format.
     * - **JSON and CSV**. Statements are auto-generated in both JSON and CSV formats.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun autoGenerateStatementMode(): Optional<AutoGenerateStatementMode> =
        autoGenerateStatementMode.getOptional("autoGenerateStatementMode")

    /**
     * Defines first bill date for Account Bills. For example, if the Plan attached to the Account
     * is set for monthly billing frequency and you set the first bill date to be January 1st, Bills
     * are created every month starting on that date.
     *
     * Optional attribute - if not defined, then first bill date is determined by the Epoch settings
     * at Organizational level.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billEpoch(): Optional<LocalDate> = billEpoch.getOptional("billEpoch")

    /**
     * Code of the Account. This is a unique short code used for the Account.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun code(): Optional<String> = code.getOptional("code")

    /**
     * The ID of the user who created the account.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * The order in which any Prepayment or Balance amounts on the Account are to be drawn-down
     * against for billing. Four options:
     * - `"PREPAYMENT","BALANCE"`. Draw-down against Prepayment credit before Balance credit.
     * - `"BALANCE","PREPAYMENT"`. Draw-down against Balance credit before Prepayment credit.
     * - `"PREPAYMENT"`. Only draw-down against Prepayment credit.
     * - `"BALANCE"`. Only draw-down against Balance credit.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditApplicationOrder(): Optional<List<CreditApplicationOrder>> =
        creditApplicationOrder.getOptional("creditApplicationOrder")

    /**
     * Account level billing currency, such as USD or GBP. Optional attribute:
     * - If you define an Account currency, this will be used for bills.
     * - If you do not define a currency, the billing currency defined at Organizational will be
     *   used.
     *
     * **Note:** If you've attached a Plan to the Account that uses a different currency to the
     * billing currency, then you must add the relevant currency conversion rate at Organization
     * level to ensure the billing process can convert line items calculated using the Plan currency
     * into the selected billing currency. If you don't add these conversion rates, then bills will
     * fail for the Account.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currency(): Optional<String> = currency.getOptional("currency")

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
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customFields(): Optional<CustomFields> = customFields.getOptional("customFields")

    /**
     * The number of days after the Bill generation date shown on Bills as the due date.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun daysBeforeBillDue(): Optional<Int> = daysBeforeBillDue.getOptional("daysBeforeBillDue")

    /**
     * The DateTime when the Account was created *(in ISO 8601 format)*.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtCreated(): Optional<OffsetDateTime> = dtCreated.getOptional("dtCreated")

    /**
     * The DateTime when the Account was last modified *(in ISO 8601 format)*.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtLastModified(): Optional<OffsetDateTime> = dtLastModified.getOptional("dtLastModified")

    /**
     * Contact email for the Account.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun emailAddress(): Optional<String> = emailAddress.getOptional("emailAddress")

    /**
     * The ID of the user who last modified the Account.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedBy(): Optional<String> = lastModifiedBy.getOptional("lastModifiedBy")

    /**
     * Name of the Account.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Parent Account ID, or null if this account does not have a parent.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parentAccountId(): Optional<String> = parentAccountId.getOptional("parentAccountId")

    /**
     * Purchase Order Number of the Account.
     *
     * Optional attribute - allows you to set a purchase order number that comes through into
     * invoicing. For example, your financial systems might require this as a reference for clearing
     * payments.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun purchaseOrderNumber(): Optional<String> =
        purchaseOrderNumber.getOptional("purchaseOrderNumber")

    /**
     * The UUID of the statement definition used when Bill statements are generated for the Account.
     * If no statement definition is specified for the Account, the statement definition specified
     * at Organizational level is used.
     *
     * Bill statements can be used as informative backing sheets to invoices. Based on the usage
     * breakdown defined in the statement definition, generated statements give a breakdown of usage
     * charges on Account Bills, which helps customers better understand usage charges incurred over
     * the billing period.
     *
     * See
     * [Working with Bill Statements](https://www.m3ter.com/docs/guides/running-viewing-and-managing-bills/working-with-bill-statements)
     * in the m3ter documentation for more details.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statementDefinitionId(): Optional<String> =
        statementDefinitionId.getOptional("statementDefinitionId")

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun version(): Optional<Long> = version.getOptional("version")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [address].
     *
     * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

    /**
     * Returns the raw JSON value of [autoGenerateStatementMode].
     *
     * Unlike [autoGenerateStatementMode], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("autoGenerateStatementMode")
    @ExcludeMissing
    fun _autoGenerateStatementMode(): JsonField<AutoGenerateStatementMode> =
        autoGenerateStatementMode

    /**
     * Returns the raw JSON value of [billEpoch].
     *
     * Unlike [billEpoch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billEpoch") @ExcludeMissing fun _billEpoch(): JsonField<LocalDate> = billEpoch

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [creditApplicationOrder].
     *
     * Unlike [creditApplicationOrder], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("creditApplicationOrder")
    @ExcludeMissing
    fun _creditApplicationOrder(): JsonField<List<CreditApplicationOrder>> = creditApplicationOrder

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customFields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    /**
     * Returns the raw JSON value of [daysBeforeBillDue].
     *
     * Unlike [daysBeforeBillDue], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("daysBeforeBillDue")
    @ExcludeMissing
    fun _daysBeforeBillDue(): JsonField<Int> = daysBeforeBillDue

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
     * Returns the raw JSON value of [emailAddress].
     *
     * Unlike [emailAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("emailAddress")
    @ExcludeMissing
    fun _emailAddress(): JsonField<String> = emailAddress

    /**
     * Returns the raw JSON value of [lastModifiedBy].
     *
     * Unlike [lastModifiedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [parentAccountId].
     *
     * Unlike [parentAccountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parentAccountId")
    @ExcludeMissing
    fun _parentAccountId(): JsonField<String> = parentAccountId

    /**
     * Returns the raw JSON value of [purchaseOrderNumber].
     *
     * Unlike [purchaseOrderNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("purchaseOrderNumber")
    @ExcludeMissing
    fun _purchaseOrderNumber(): JsonField<String> = purchaseOrderNumber

    /**
     * Returns the raw JSON value of [statementDefinitionId].
     *
     * Unlike [statementDefinitionId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("statementDefinitionId")
    @ExcludeMissing
    fun _statementDefinitionId(): JsonField<String> = statementDefinitionId

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
         * Returns a mutable builder for constructing an instance of [AccountResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var address: JsonField<Address> = JsonMissing.of()
        private var autoGenerateStatementMode: JsonField<AutoGenerateStatementMode> =
            JsonMissing.of()
        private var billEpoch: JsonField<LocalDate> = JsonMissing.of()
        private var code: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var creditApplicationOrder: JsonField<MutableList<CreditApplicationOrder>>? = null
        private var currency: JsonField<String> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var daysBeforeBillDue: JsonField<Int> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var emailAddress: JsonField<String> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var parentAccountId: JsonField<String> = JsonMissing.of()
        private var purchaseOrderNumber: JsonField<String> = JsonMissing.of()
        private var statementDefinitionId: JsonField<String> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountResponse: AccountResponse) = apply {
            id = accountResponse.id
            address = accountResponse.address
            autoGenerateStatementMode = accountResponse.autoGenerateStatementMode
            billEpoch = accountResponse.billEpoch
            code = accountResponse.code
            createdBy = accountResponse.createdBy
            creditApplicationOrder =
                accountResponse.creditApplicationOrder.map { it.toMutableList() }
            currency = accountResponse.currency
            customFields = accountResponse.customFields
            daysBeforeBillDue = accountResponse.daysBeforeBillDue
            dtCreated = accountResponse.dtCreated
            dtLastModified = accountResponse.dtLastModified
            emailAddress = accountResponse.emailAddress
            lastModifiedBy = accountResponse.lastModifiedBy
            name = accountResponse.name
            parentAccountId = accountResponse.parentAccountId
            purchaseOrderNumber = accountResponse.purchaseOrderNumber
            statementDefinitionId = accountResponse.statementDefinitionId
            version = accountResponse.version
            additionalProperties = accountResponse.additionalProperties.toMutableMap()
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

        /** Contact address. */
        fun address(address: Address) = address(JsonField.of(address))

        /**
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [Address] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address(address: JsonField<Address>) = apply { this.address = address }

        /**
         * Specify whether to auto-generate statements once Bills are approved or locked.
         * - **None**. Statements will not be auto-generated.
         * - **JSON**. Statements are auto-generated in JSON format.
         * - **JSON and CSV**. Statements are auto-generated in both JSON and CSV formats.
         */
        fun autoGenerateStatementMode(autoGenerateStatementMode: AutoGenerateStatementMode) =
            autoGenerateStatementMode(JsonField.of(autoGenerateStatementMode))

        /**
         * Sets [Builder.autoGenerateStatementMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoGenerateStatementMode] with a well-typed
         * [AutoGenerateStatementMode] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun autoGenerateStatementMode(
            autoGenerateStatementMode: JsonField<AutoGenerateStatementMode>
        ) = apply { this.autoGenerateStatementMode = autoGenerateStatementMode }

        /**
         * Defines first bill date for Account Bills. For example, if the Plan attached to the
         * Account is set for monthly billing frequency and you set the first bill date to be
         * January 1st, Bills are created every month starting on that date.
         *
         * Optional attribute - if not defined, then first bill date is determined by the Epoch
         * settings at Organizational level.
         */
        fun billEpoch(billEpoch: LocalDate) = billEpoch(JsonField.of(billEpoch))

        /**
         * Sets [Builder.billEpoch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billEpoch] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun billEpoch(billEpoch: JsonField<LocalDate>) = apply { this.billEpoch = billEpoch }

        /** Code of the Account. This is a unique short code used for the Account. */
        fun code(code: String) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** The ID of the user who created the account. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /**
         * The order in which any Prepayment or Balance amounts on the Account are to be drawn-down
         * against for billing. Four options:
         * - `"PREPAYMENT","BALANCE"`. Draw-down against Prepayment credit before Balance credit.
         * - `"BALANCE","PREPAYMENT"`. Draw-down against Balance credit before Prepayment credit.
         * - `"PREPAYMENT"`. Only draw-down against Prepayment credit.
         * - `"BALANCE"`. Only draw-down against Balance credit.
         */
        fun creditApplicationOrder(creditApplicationOrder: List<CreditApplicationOrder>) =
            creditApplicationOrder(JsonField.of(creditApplicationOrder))

        /**
         * Sets [Builder.creditApplicationOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditApplicationOrder] with a well-typed
         * `List<CreditApplicationOrder>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun creditApplicationOrder(
            creditApplicationOrder: JsonField<List<CreditApplicationOrder>>
        ) = apply {
            this.creditApplicationOrder = creditApplicationOrder.map { it.toMutableList() }
        }

        /**
         * Adds a single [CreditApplicationOrder] to [Builder.creditApplicationOrder].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCreditApplicationOrder(creditApplicationOrder: CreditApplicationOrder) = apply {
            this.creditApplicationOrder =
                (this.creditApplicationOrder ?: JsonField.of(mutableListOf())).also {
                    checkKnown("creditApplicationOrder", it).add(creditApplicationOrder)
                }
        }

        /**
         * Account level billing currency, such as USD or GBP. Optional attribute:
         * - If you define an Account currency, this will be used for bills.
         * - If you do not define a currency, the billing currency defined at Organizational will be
         *   used.
         *
         * **Note:** If you've attached a Plan to the Account that uses a different currency to the
         * billing currency, then you must add the relevant currency conversion rate at Organization
         * level to ensure the billing process can convert line items calculated using the Plan
         * currency into the selected billing currency. If you don't add these conversion rates,
         * then bills will fail for the Account.
         */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Sets [Builder.customFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
        }

        /** The number of days after the Bill generation date shown on Bills as the due date. */
        fun daysBeforeBillDue(daysBeforeBillDue: Int) =
            daysBeforeBillDue(JsonField.of(daysBeforeBillDue))

        /**
         * Sets [Builder.daysBeforeBillDue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.daysBeforeBillDue] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun daysBeforeBillDue(daysBeforeBillDue: JsonField<Int>) = apply {
            this.daysBeforeBillDue = daysBeforeBillDue
        }

        /** The DateTime when the Account was created *(in ISO 8601 format)*. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /**
         * Sets [Builder.dtCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The DateTime when the Account was last modified *(in ISO 8601 format)*. */
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

        /** Contact email for the Account. */
        fun emailAddress(emailAddress: String) = emailAddress(JsonField.of(emailAddress))

        /**
         * Sets [Builder.emailAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailAddress] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun emailAddress(emailAddress: JsonField<String>) = apply {
            this.emailAddress = emailAddress
        }

        /** The ID of the user who last modified the Account. */
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

        /** Name of the Account. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Parent Account ID, or null if this account does not have a parent. */
        fun parentAccountId(parentAccountId: String) =
            parentAccountId(JsonField.of(parentAccountId))

        /**
         * Sets [Builder.parentAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parentAccountId(parentAccountId: JsonField<String>) = apply {
            this.parentAccountId = parentAccountId
        }

        /**
         * Purchase Order Number of the Account.
         *
         * Optional attribute - allows you to set a purchase order number that comes through into
         * invoicing. For example, your financial systems might require this as a reference for
         * clearing payments.
         */
        fun purchaseOrderNumber(purchaseOrderNumber: String) =
            purchaseOrderNumber(JsonField.of(purchaseOrderNumber))

        /**
         * Sets [Builder.purchaseOrderNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.purchaseOrderNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun purchaseOrderNumber(purchaseOrderNumber: JsonField<String>) = apply {
            this.purchaseOrderNumber = purchaseOrderNumber
        }

        /**
         * The UUID of the statement definition used when Bill statements are generated for the
         * Account. If no statement definition is specified for the Account, the statement
         * definition specified at Organizational level is used.
         *
         * Bill statements can be used as informative backing sheets to invoices. Based on the usage
         * breakdown defined in the statement definition, generated statements give a breakdown of
         * usage charges on Account Bills, which helps customers better understand usage charges
         * incurred over the billing period.
         *
         * See
         * [Working with Bill Statements](https://www.m3ter.com/docs/guides/running-viewing-and-managing-bills/working-with-bill-statements)
         * in the m3ter documentation for more details.
         */
        fun statementDefinitionId(statementDefinitionId: String) =
            statementDefinitionId(JsonField.of(statementDefinitionId))

        /**
         * Sets [Builder.statementDefinitionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statementDefinitionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statementDefinitionId(statementDefinitionId: JsonField<String>) = apply {
            this.statementDefinitionId = statementDefinitionId
        }

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
         * Returns an immutable instance of [AccountResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountResponse =
            AccountResponse(
                checkRequired("id", id),
                address,
                autoGenerateStatementMode,
                billEpoch,
                code,
                createdBy,
                (creditApplicationOrder ?: JsonMissing.of()).map { it.toImmutable() },
                currency,
                customFields,
                daysBeforeBillDue,
                dtCreated,
                dtLastModified,
                emailAddress,
                lastModifiedBy,
                name,
                parentAccountId,
                purchaseOrderNumber,
                statementDefinitionId,
                version,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AccountResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        address().ifPresent { it.validate() }
        autoGenerateStatementMode().ifPresent { it.validate() }
        billEpoch()
        code()
        createdBy()
        creditApplicationOrder().ifPresent { it.forEach { it.validate() } }
        currency()
        customFields().ifPresent { it.validate() }
        daysBeforeBillDue()
        dtCreated()
        dtLastModified()
        emailAddress()
        lastModifiedBy()
        name()
        parentAccountId()
        purchaseOrderNumber()
        statementDefinitionId()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (address.asKnown().getOrNull()?.validity() ?: 0) +
            (autoGenerateStatementMode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (billEpoch.asKnown().isPresent) 1 else 0) +
            (if (code.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (creditApplicationOrder.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (customFields.asKnown().getOrNull()?.validity() ?: 0) +
            (if (daysBeforeBillDue.asKnown().isPresent) 1 else 0) +
            (if (dtCreated.asKnown().isPresent) 1 else 0) +
            (if (dtLastModified.asKnown().isPresent) 1 else 0) +
            (if (emailAddress.asKnown().isPresent) 1 else 0) +
            (if (lastModifiedBy.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (parentAccountId.asKnown().isPresent) 1 else 0) +
            (if (purchaseOrderNumber.asKnown().isPresent) 1 else 0) +
            (if (statementDefinitionId.asKnown().isPresent) 1 else 0) +
            (if (version.asKnown().isPresent) 1 else 0)

    /**
     * Specify whether to auto-generate statements once Bills are approved or locked.
     * - **None**. Statements will not be auto-generated.
     * - **JSON**. Statements are auto-generated in JSON format.
     * - **JSON and CSV**. Statements are auto-generated in both JSON and CSV formats.
     */
    class AutoGenerateStatementMode
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val NONE = of("NONE")

            @JvmField val JSON = of("JSON")

            @JvmField val JSON_AND_CSV = of("JSON_AND_CSV")

            @JvmStatic fun of(value: String) = AutoGenerateStatementMode(JsonField.of(value))
        }

        /** An enum containing [AutoGenerateStatementMode]'s known values. */
        enum class Known {
            NONE,
            JSON,
            JSON_AND_CSV,
        }

        /**
         * An enum containing [AutoGenerateStatementMode]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [AutoGenerateStatementMode] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NONE,
            JSON,
            JSON_AND_CSV,
            /**
             * An enum member indicating that [AutoGenerateStatementMode] was instantiated with an
             * unknown value.
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
                NONE -> Value.NONE
                JSON -> Value.JSON
                JSON_AND_CSV -> Value.JSON_AND_CSV
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
                NONE -> Known.NONE
                JSON -> Known.JSON
                JSON_AND_CSV -> Known.JSON_AND_CSV
                else -> throw M3terInvalidDataException("Unknown AutoGenerateStatementMode: $value")
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

        fun validate(): AutoGenerateStatementMode = apply {
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

            return other is AutoGenerateStatementMode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class CreditApplicationOrder
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PREPAYMENT = of("PREPAYMENT")

            @JvmField val BALANCE = of("BALANCE")

            @JvmStatic fun of(value: String) = CreditApplicationOrder(JsonField.of(value))
        }

        /** An enum containing [CreditApplicationOrder]'s known values. */
        enum class Known {
            PREPAYMENT,
            BALANCE,
        }

        /**
         * An enum containing [CreditApplicationOrder]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [CreditApplicationOrder] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PREPAYMENT,
            BALANCE,
            /**
             * An enum member indicating that [CreditApplicationOrder] was instantiated with an
             * unknown value.
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
                PREPAYMENT -> Value.PREPAYMENT
                BALANCE -> Value.BALANCE
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
                PREPAYMENT -> Known.PREPAYMENT
                BALANCE -> Known.BALANCE
                else -> throw M3terInvalidDataException("Unknown CreditApplicationOrder: $value")
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

        fun validate(): CreditApplicationOrder = apply {
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

            return other is CreditApplicationOrder && value == other.value
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

        return other is AccountResponse &&
            id == other.id &&
            address == other.address &&
            autoGenerateStatementMode == other.autoGenerateStatementMode &&
            billEpoch == other.billEpoch &&
            code == other.code &&
            createdBy == other.createdBy &&
            creditApplicationOrder == other.creditApplicationOrder &&
            currency == other.currency &&
            customFields == other.customFields &&
            daysBeforeBillDue == other.daysBeforeBillDue &&
            dtCreated == other.dtCreated &&
            dtLastModified == other.dtLastModified &&
            emailAddress == other.emailAddress &&
            lastModifiedBy == other.lastModifiedBy &&
            name == other.name &&
            parentAccountId == other.parentAccountId &&
            purchaseOrderNumber == other.purchaseOrderNumber &&
            statementDefinitionId == other.statementDefinitionId &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            address,
            autoGenerateStatementMode,
            billEpoch,
            code,
            createdBy,
            creditApplicationOrder,
            currency,
            customFields,
            daysBeforeBillDue,
            dtCreated,
            dtLastModified,
            emailAddress,
            lastModifiedBy,
            name,
            parentAccountId,
            purchaseOrderNumber,
            statementDefinitionId,
            version,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountResponse{id=$id, address=$address, autoGenerateStatementMode=$autoGenerateStatementMode, billEpoch=$billEpoch, code=$code, createdBy=$createdBy, creditApplicationOrder=$creditApplicationOrder, currency=$currency, customFields=$customFields, daysBeforeBillDue=$daysBeforeBillDue, dtCreated=$dtCreated, dtLastModified=$dtLastModified, emailAddress=$emailAddress, lastModifiedBy=$lastModifiedBy, name=$name, parentAccountId=$parentAccountId, purchaseOrderNumber=$purchaseOrderNumber, statementDefinitionId=$statementDefinitionId, version=$version, additionalProperties=$additionalProperties}"
}
