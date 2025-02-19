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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class Account
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("address")
    @ExcludeMissing
    private val address: JsonField<Address> = JsonMissing.of(),
    @JsonProperty("autoGenerateStatementMode")
    @ExcludeMissing
    private val autoGenerateStatementMode: JsonField<AutoGenerateStatementMode> = JsonMissing.of(),
    @JsonProperty("billEpoch")
    @ExcludeMissing
    private val billEpoch: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("code") @ExcludeMissing private val code: JsonField<String> = JsonMissing.of(),
    @JsonProperty("configData")
    @ExcludeMissing
    private val configData: JsonField<ConfigData> = JsonMissing.of(),
    @JsonProperty("createdBy")
    @ExcludeMissing
    private val createdBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("creditApplicationOrder")
    @ExcludeMissing
    private val creditApplicationOrder: JsonField<List<CreditApplicationOrder>> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("customFields")
    @ExcludeMissing
    private val customFields: JsonField<CustomFields> = JsonMissing.of(),
    @JsonProperty("daysBeforeBillDue")
    @ExcludeMissing
    private val daysBeforeBillDue: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("dtCreated")
    @ExcludeMissing
    private val dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    private val dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("emailAddress")
    @ExcludeMissing
    private val emailAddress: JsonField<String> = JsonMissing.of(),
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    private val lastModifiedBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("parentAccountId")
    @ExcludeMissing
    private val parentAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("purchaseOrderNumber")
    @ExcludeMissing
    private val purchaseOrderNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("statementDefinitionId")
    @ExcludeMissing
    private val statementDefinitionId: JsonField<String> = JsonMissing.of(),
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

    /** Contact address. */
    fun address(): Optional<Address> = Optional.ofNullable(address.getNullable("address"))

    /**
     * Specify whether to auto-generate statements once Bills are approved or locked.
     * - **None**. Statements will not be auto-generated.
     * - **JSON**. Statements are auto-generated in JSON format.
     * - **JSON and CSV**. Statements are auto-generated in both JSON and CSV formats.
     */
    fun autoGenerateStatementMode(): Optional<AutoGenerateStatementMode> =
        Optional.ofNullable(autoGenerateStatementMode.getNullable("autoGenerateStatementMode"))

    /**
     * Defines first bill date for Account Bills. For example, if the Plan attached to the Account
     * is set for monthly billing frequency and you set the first bill date to be January 1st, Bills
     * are created every month starting on that date.
     *
     * Optional attribute - if not defined, then first bill date is determined by the Epoch settings
     * at Organizational level.
     */
    fun billEpoch(): Optional<LocalDate> = Optional.ofNullable(billEpoch.getNullable("billEpoch"))

    /** Code of the Account. This is a unique short code used for the Account. */
    fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

    /** Configuration data for the Account */
    fun configData(): Optional<ConfigData> =
        Optional.ofNullable(configData.getNullable("configData"))

    /** The ID of the user who created the account. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /**
     * The order in which any Prepayment or Balance amounts on the Account are to be drawn-down
     * against for billing. Four options:
     * - `"PREPAYMENT","BALANCE"`. Draw-down against Prepayment credit before Balance credit.
     * - `"BALANCE","PREPAYMENT"`. Draw-down against Balance credit before Prepayment credit.
     * - `"PREPAYMENT"`. Only draw-down against Prepayment credit.
     * - `"BALANCE"`. Only draw-down against Balance credit.
     */
    fun creditApplicationOrder(): Optional<List<CreditApplicationOrder>> =
        Optional.ofNullable(creditApplicationOrder.getNullable("creditApplicationOrder"))

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

    /** The number of days after the Bill generation date shown on Bills as the due date. */
    fun daysBeforeBillDue(): Optional<Long> =
        Optional.ofNullable(daysBeforeBillDue.getNullable("daysBeforeBillDue"))

    /** The DateTime when the Account was created _(in ISO 8601 format)_. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /** The DateTime when the Account was last modified _(in ISO 8601 format)_. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /** Contact email for the Account. */
    fun emailAddress(): Optional<String> =
        Optional.ofNullable(emailAddress.getNullable("emailAddress"))

    /** The ID of the user who last modified the Account. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /** Name of the Account. */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** Parent Account ID, or null if this account does not have a parent. */
    fun parentAccountId(): Optional<String> =
        Optional.ofNullable(parentAccountId.getNullable("parentAccountId"))

    /**
     * Purchase Order Number of the Account.
     *
     * Optional attribute - allows you to set a purchase order number that comes through into
     * invoicing. For example, your financial systems might require this as a reference for clearing
     * payments.
     */
    fun purchaseOrderNumber(): Optional<String> =
        Optional.ofNullable(purchaseOrderNumber.getNullable("purchaseOrderNumber"))

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
     */
    fun statementDefinitionId(): Optional<String> =
        Optional.ofNullable(statementDefinitionId.getNullable("statementDefinitionId"))

    /** The UUID of the entity. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    /** Contact address. */
    @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

    /**
     * Specify whether to auto-generate statements once Bills are approved or locked.
     * - **None**. Statements will not be auto-generated.
     * - **JSON**. Statements are auto-generated in JSON format.
     * - **JSON and CSV**. Statements are auto-generated in both JSON and CSV formats.
     */
    @JsonProperty("autoGenerateStatementMode")
    @ExcludeMissing
    fun _autoGenerateStatementMode(): JsonField<AutoGenerateStatementMode> =
        autoGenerateStatementMode

    /**
     * Defines first bill date for Account Bills. For example, if the Plan attached to the Account
     * is set for monthly billing frequency and you set the first bill date to be January 1st, Bills
     * are created every month starting on that date.
     *
     * Optional attribute - if not defined, then first bill date is determined by the Epoch settings
     * at Organizational level.
     */
    @JsonProperty("billEpoch") @ExcludeMissing fun _billEpoch(): JsonField<LocalDate> = billEpoch

    /** Code of the Account. This is a unique short code used for the Account. */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /** Configuration data for the Account */
    @JsonProperty("configData")
    @ExcludeMissing
    fun _configData(): JsonField<ConfigData> = configData

    /** The ID of the user who created the account. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * The order in which any Prepayment or Balance amounts on the Account are to be drawn-down
     * against for billing. Four options:
     * - `"PREPAYMENT","BALANCE"`. Draw-down against Prepayment credit before Balance credit.
     * - `"BALANCE","PREPAYMENT"`. Draw-down against Balance credit before Prepayment credit.
     * - `"PREPAYMENT"`. Only draw-down against Prepayment credit.
     * - `"BALANCE"`. Only draw-down against Balance credit.
     */
    @JsonProperty("creditApplicationOrder")
    @ExcludeMissing
    fun _creditApplicationOrder(): JsonField<List<CreditApplicationOrder>> = creditApplicationOrder

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

    /** The number of days after the Bill generation date shown on Bills as the due date. */
    @JsonProperty("daysBeforeBillDue")
    @ExcludeMissing
    fun _daysBeforeBillDue(): JsonField<Long> = daysBeforeBillDue

    /** The DateTime when the Account was created _(in ISO 8601 format)_. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /** The DateTime when the Account was last modified _(in ISO 8601 format)_. */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /** Contact email for the Account. */
    @JsonProperty("emailAddress")
    @ExcludeMissing
    fun _emailAddress(): JsonField<String> = emailAddress

    /** The ID of the user who last modified the Account. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /** Name of the Account. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** Parent Account ID, or null if this account does not have a parent. */
    @JsonProperty("parentAccountId")
    @ExcludeMissing
    fun _parentAccountId(): JsonField<String> = parentAccountId

    /**
     * Purchase Order Number of the Account.
     *
     * Optional attribute - allows you to set a purchase order number that comes through into
     * invoicing. For example, your financial systems might require this as a reference for clearing
     * payments.
     */
    @JsonProperty("purchaseOrderNumber")
    @ExcludeMissing
    fun _purchaseOrderNumber(): JsonField<String> = purchaseOrderNumber

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
     */
    @JsonProperty("statementDefinitionId")
    @ExcludeMissing
    fun _statementDefinitionId(): JsonField<String> = statementDefinitionId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Account = apply {
        if (validated) {
            return@apply
        }

        id()
        version()
        address().ifPresent { it.validate() }
        autoGenerateStatementMode()
        billEpoch()
        code()
        configData().ifPresent { it.validate() }
        createdBy()
        creditApplicationOrder()
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
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Account]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var address: JsonField<Address> = JsonMissing.of()
        private var autoGenerateStatementMode: JsonField<AutoGenerateStatementMode> =
            JsonMissing.of()
        private var billEpoch: JsonField<LocalDate> = JsonMissing.of()
        private var code: JsonField<String> = JsonMissing.of()
        private var configData: JsonField<ConfigData> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var creditApplicationOrder: JsonField<MutableList<CreditApplicationOrder>>? = null
        private var currency: JsonField<String> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var daysBeforeBillDue: JsonField<Long> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var emailAddress: JsonField<String> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var parentAccountId: JsonField<String> = JsonMissing.of()
        private var purchaseOrderNumber: JsonField<String> = JsonMissing.of()
        private var statementDefinitionId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(account: Account) = apply {
            id = account.id
            version = account.version
            address = account.address
            autoGenerateStatementMode = account.autoGenerateStatementMode
            billEpoch = account.billEpoch
            code = account.code
            configData = account.configData
            createdBy = account.createdBy
            creditApplicationOrder = account.creditApplicationOrder.map { it.toMutableList() }
            currency = account.currency
            customFields = account.customFields
            daysBeforeBillDue = account.daysBeforeBillDue
            dtCreated = account.dtCreated
            dtLastModified = account.dtLastModified
            emailAddress = account.emailAddress
            lastModifiedBy = account.lastModifiedBy
            name = account.name
            parentAccountId = account.parentAccountId
            purchaseOrderNumber = account.purchaseOrderNumber
            statementDefinitionId = account.statementDefinitionId
            additionalProperties = account.additionalProperties.toMutableMap()
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

        /** Contact address. */
        fun address(address: Address) = address(JsonField.of(address))

        /** Contact address. */
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
         * Specify whether to auto-generate statements once Bills are approved or locked.
         * - **None**. Statements will not be auto-generated.
         * - **JSON**. Statements are auto-generated in JSON format.
         * - **JSON and CSV**. Statements are auto-generated in both JSON and CSV formats.
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
         * Defines first bill date for Account Bills. For example, if the Plan attached to the
         * Account is set for monthly billing frequency and you set the first bill date to be
         * January 1st, Bills are created every month starting on that date.
         *
         * Optional attribute - if not defined, then first bill date is determined by the Epoch
         * settings at Organizational level.
         */
        fun billEpoch(billEpoch: JsonField<LocalDate>) = apply { this.billEpoch = billEpoch }

        /** Code of the Account. This is a unique short code used for the Account. */
        fun code(code: String) = code(JsonField.of(code))

        /** Code of the Account. This is a unique short code used for the Account. */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** Configuration data for the Account */
        fun configData(configData: ConfigData) = configData(JsonField.of(configData))

        /** Configuration data for the Account */
        fun configData(configData: JsonField<ConfigData>) = apply { this.configData = configData }

        /** The ID of the user who created the account. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The ID of the user who created the account. */
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
         * The order in which any Prepayment or Balance amounts on the Account are to be drawn-down
         * against for billing. Four options:
         * - `"PREPAYMENT","BALANCE"`. Draw-down against Prepayment credit before Balance credit.
         * - `"BALANCE","PREPAYMENT"`. Draw-down against Balance credit before Prepayment credit.
         * - `"PREPAYMENT"`. Only draw-down against Prepayment credit.
         * - `"BALANCE"`. Only draw-down against Balance credit.
         */
        fun creditApplicationOrder(
            creditApplicationOrder: JsonField<List<CreditApplicationOrder>>
        ) = apply {
            this.creditApplicationOrder = creditApplicationOrder.map { it.toMutableList() }
        }

        /**
         * The order in which any Prepayment or Balance amounts on the Account are to be drawn-down
         * against for billing. Four options:
         * - `"PREPAYMENT","BALANCE"`. Draw-down against Prepayment credit before Balance credit.
         * - `"BALANCE","PREPAYMENT"`. Draw-down against Balance credit before Prepayment credit.
         * - `"PREPAYMENT"`. Only draw-down against Prepayment credit.
         * - `"BALANCE"`. Only draw-down against Balance credit.
         */
        fun addCreditApplicationOrder(creditApplicationOrder: CreditApplicationOrder) = apply {
            this.creditApplicationOrder =
                (this.creditApplicationOrder ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(creditApplicationOrder)
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

        /** The number of days after the Bill generation date shown on Bills as the due date. */
        fun daysBeforeBillDue(daysBeforeBillDue: Long) =
            daysBeforeBillDue(JsonField.of(daysBeforeBillDue))

        /** The number of days after the Bill generation date shown on Bills as the due date. */
        fun daysBeforeBillDue(daysBeforeBillDue: JsonField<Long>) = apply {
            this.daysBeforeBillDue = daysBeforeBillDue
        }

        /** The DateTime when the Account was created _(in ISO 8601 format)_. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /** The DateTime when the Account was created _(in ISO 8601 format)_. */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The DateTime when the Account was last modified _(in ISO 8601 format)_. */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /** The DateTime when the Account was last modified _(in ISO 8601 format)_. */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        /** Contact email for the Account. */
        fun emailAddress(emailAddress: String) = emailAddress(JsonField.of(emailAddress))

        /** Contact email for the Account. */
        fun emailAddress(emailAddress: JsonField<String>) = apply {
            this.emailAddress = emailAddress
        }

        /** The ID of the user who last modified the Account. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The ID of the user who last modified the Account. */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
        }

        /** Name of the Account. */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the Account. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Parent Account ID, or null if this account does not have a parent. */
        fun parentAccountId(parentAccountId: String) =
            parentAccountId(JsonField.of(parentAccountId))

        /** Parent Account ID, or null if this account does not have a parent. */
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
         * Purchase Order Number of the Account.
         *
         * Optional attribute - allows you to set a purchase order number that comes through into
         * invoicing. For example, your financial systems might require this as a reference for
         * clearing payments.
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
        fun statementDefinitionId(statementDefinitionId: JsonField<String>) = apply {
            this.statementDefinitionId = statementDefinitionId
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

        fun build(): Account =
            Account(
                checkRequired("id", id),
                checkRequired("version", version),
                address,
                autoGenerateStatementMode,
                billEpoch,
                code,
                configData,
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
                additionalProperties.toImmutable(),
            )
    }

    /** Contact address. */
    @NoAutoDetect
    class Address
    @JsonCreator
    private constructor(
        @JsonProperty("addressLine1")
        @ExcludeMissing
        private val addressLine1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("addressLine2")
        @ExcludeMissing
        private val addressLine2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("addressLine3")
        @ExcludeMissing
        private val addressLine3: JsonField<String> = JsonMissing.of(),
        @JsonProperty("addressLine4")
        @ExcludeMissing
        private val addressLine4: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locality")
        @ExcludeMissing
        private val locality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postCode")
        @ExcludeMissing
        private val postCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region")
        @ExcludeMissing
        private val region: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun addressLine1(): Optional<String> =
            Optional.ofNullable(addressLine1.getNullable("addressLine1"))

        fun addressLine2(): Optional<String> =
            Optional.ofNullable(addressLine2.getNullable("addressLine2"))

        fun addressLine3(): Optional<String> =
            Optional.ofNullable(addressLine3.getNullable("addressLine3"))

        fun addressLine4(): Optional<String> =
            Optional.ofNullable(addressLine4.getNullable("addressLine4"))

        fun country(): Optional<String> = Optional.ofNullable(country.getNullable("country"))

        fun locality(): Optional<String> = Optional.ofNullable(locality.getNullable("locality"))

        fun postCode(): Optional<String> = Optional.ofNullable(postCode.getNullable("postCode"))

        fun region(): Optional<String> = Optional.ofNullable(region.getNullable("region"))

        @JsonProperty("addressLine1")
        @ExcludeMissing
        fun _addressLine1(): JsonField<String> = addressLine1

        @JsonProperty("addressLine2")
        @ExcludeMissing
        fun _addressLine2(): JsonField<String> = addressLine2

        @JsonProperty("addressLine3")
        @ExcludeMissing
        fun _addressLine3(): JsonField<String> = addressLine3

        @JsonProperty("addressLine4")
        @ExcludeMissing
        fun _addressLine4(): JsonField<String> = addressLine4

        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

        @JsonProperty("postCode") @ExcludeMissing fun _postCode(): JsonField<String> = postCode

        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Address = apply {
            if (validated) {
                return@apply
            }

            addressLine1()
            addressLine2()
            addressLine3()
            addressLine4()
            country()
            locality()
            postCode()
            region()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Address]. */
        class Builder internal constructor() {

            private var addressLine1: JsonField<String> = JsonMissing.of()
            private var addressLine2: JsonField<String> = JsonMissing.of()
            private var addressLine3: JsonField<String> = JsonMissing.of()
            private var addressLine4: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var locality: JsonField<String> = JsonMissing.of()
            private var postCode: JsonField<String> = JsonMissing.of()
            private var region: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(address: Address) = apply {
                addressLine1 = address.addressLine1
                addressLine2 = address.addressLine2
                addressLine3 = address.addressLine3
                addressLine4 = address.addressLine4
                country = address.country
                locality = address.locality
                postCode = address.postCode
                region = address.region
                additionalProperties = address.additionalProperties.toMutableMap()
            }

            fun addressLine1(addressLine1: String) = addressLine1(JsonField.of(addressLine1))

            fun addressLine1(addressLine1: JsonField<String>) = apply {
                this.addressLine1 = addressLine1
            }

            fun addressLine2(addressLine2: String) = addressLine2(JsonField.of(addressLine2))

            fun addressLine2(addressLine2: JsonField<String>) = apply {
                this.addressLine2 = addressLine2
            }

            fun addressLine3(addressLine3: String) = addressLine3(JsonField.of(addressLine3))

            fun addressLine3(addressLine3: JsonField<String>) = apply {
                this.addressLine3 = addressLine3
            }

            fun addressLine4(addressLine4: String) = addressLine4(JsonField.of(addressLine4))

            fun addressLine4(addressLine4: JsonField<String>) = apply {
                this.addressLine4 = addressLine4
            }

            fun country(country: String) = country(JsonField.of(country))

            fun country(country: JsonField<String>) = apply { this.country = country }

            fun locality(locality: String) = locality(JsonField.of(locality))

            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            fun postCode(postCode: String) = postCode(JsonField.of(postCode))

            fun postCode(postCode: JsonField<String>) = apply { this.postCode = postCode }

            fun region(region: String) = region(JsonField.of(region))

            fun region(region: JsonField<String>) = apply { this.region = region }

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

            fun build(): Address =
                Address(
                    addressLine1,
                    addressLine2,
                    addressLine3,
                    addressLine4,
                    country,
                    locality,
                    postCode,
                    region,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Address && addressLine1 == other.addressLine1 && addressLine2 == other.addressLine2 && addressLine3 == other.addressLine3 && addressLine4 == other.addressLine4 && country == other.country && locality == other.locality && postCode == other.postCode && region == other.region && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(addressLine1, addressLine2, addressLine3, addressLine4, country, locality, postCode, region, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Address{addressLine1=$addressLine1, addressLine2=$addressLine2, addressLine3=$addressLine3, addressLine4=$addressLine4, country=$country, locality=$locality, postCode=$postCode, region=$region, additionalProperties=$additionalProperties}"
    }

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

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AutoGenerateStatementMode && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Configuration data for the Account */
    @NoAutoDetect
    class ConfigData
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ConfigData = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ConfigData]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(configData: ConfigData) = apply {
                additionalProperties = configData.additionalProperties.toMutableMap()
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

            fun build(): ConfigData = ConfigData(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ConfigData && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "ConfigData{additionalProperties=$additionalProperties}"
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

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreditApplicationOrder && value == other.value /* spotless:on */
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

        return /* spotless:off */ other is Account && id == other.id && version == other.version && address == other.address && autoGenerateStatementMode == other.autoGenerateStatementMode && billEpoch == other.billEpoch && code == other.code && configData == other.configData && createdBy == other.createdBy && creditApplicationOrder == other.creditApplicationOrder && currency == other.currency && customFields == other.customFields && daysBeforeBillDue == other.daysBeforeBillDue && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && emailAddress == other.emailAddress && lastModifiedBy == other.lastModifiedBy && name == other.name && parentAccountId == other.parentAccountId && purchaseOrderNumber == other.purchaseOrderNumber && statementDefinitionId == other.statementDefinitionId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, address, autoGenerateStatementMode, billEpoch, code, configData, createdBy, creditApplicationOrder, currency, customFields, daysBeforeBillDue, dtCreated, dtLastModified, emailAddress, lastModifiedBy, name, parentAccountId, purchaseOrderNumber, statementDefinitionId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Account{id=$id, version=$version, address=$address, autoGenerateStatementMode=$autoGenerateStatementMode, billEpoch=$billEpoch, code=$code, configData=$configData, createdBy=$createdBy, creditApplicationOrder=$creditApplicationOrder, currency=$currency, customFields=$customFields, daysBeforeBillDue=$daysBeforeBillDue, dtCreated=$dtCreated, dtLastModified=$dtLastModified, emailAddress=$emailAddress, lastModifiedBy=$lastModifiedBy, name=$name, parentAccountId=$parentAccountId, purchaseOrderNumber=$purchaseOrderNumber, statementDefinitionId=$statementDefinitionId, additionalProperties=$additionalProperties}"
}
