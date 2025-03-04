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
import com.m3ter.sdk.core.checkKnown
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

/** Create a new Account within the Organization. */
class AccountCreateParams
private constructor(
    private val orgId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    /** Code of the Account. This is a unique short code used for the Account. */
    fun code(): String = body.code()

    /** Contact email for the Account. */
    fun emailAddress(): String = body.emailAddress()

    /** Name of the Account. */
    fun name(): String = body.name()

    /** Contact address. */
    fun address(): Optional<Address> = body.address()

    /**
     * Specify whether to auto-generate statements once Bills are approved or locked.
     * - **None**. Statements will not be auto-generated.
     * - **JSON**. Statements are auto-generated in JSON format.
     * - **JSON and CSV**. Statements are auto-generated in both JSON and CSV formats.
     */
    fun autoGenerateStatementMode(): Optional<AutoGenerateStatementMode> =
        body.autoGenerateStatementMode()

    /**
     * Optional setting to define a _billing cycle date_, which sets the date of the first Bill and
     * acts as a reference for when in the applied billing frequency period subsequent bills are
     * created:
     * - For example, if you attach a Plan to an Account where the Plan is configured for monthly
     *   billing frequency and you've defined the period the Plan will apply to the Account to be
     *   from January 1st, 2022 until January 1st, 2023. You then set a `billEpoch` date of February
     *   15th, 2022. The first Bill will be created for the Account on February 15th, and subsequent
     *   Bills created on the 15th of the months following for the remainder of the billing period -
     *   March 15th, April 15th, and so on.
     * - If not defined, then the relevant Epoch date set for the billing frequency period at
     *   Organization level will be used instead.
     * - The date is in ISO-8601 format.
     */
    fun billEpoch(): Optional<LocalDate> = body.billEpoch()

    /**
     * Configuration data for the Account Supported settings:
     * - SendBillsToThirdParties ("true"/"false")
     */
    fun configData(): Optional<ConfigData> = body.configData()

    /**
     * Define the order in which any Prepayment or Balance amounts on the Account are to be
     * drawn-down against for billing. Four options:
     * - `"PREPAYMENT","BALANCE"`. Draw-down against Prepayment credit before Balance credit.
     * - `"BALANCE","PREPAYMENT"`. Draw-down against Balance credit before Prepayment credit.
     * - `"PREPAYMENT"`. Only draw-down against Prepayment credit.
     * - `"BALANCE"`. Only draw-down against Balance credit.
     *
     * **NOTES:**
     * - Any setting you define here overrides the setting for credit application order at
     *   Organization level.
     * - If the Account belongs to a Parent/Child Account hierarchy, then the
     *   `creditApplicationOrder` settings are not available, and the draw-down order defaults
     *   always to Prepayment then Balance order.
     */
    fun creditApplicationOrder(): Optional<List<CreditApplicationOrder>> =
        body.creditApplicationOrder()

    /**
     * Account level billing currency, such as USD or GBP. Optional attribute:
     * - If you define an Account currency, this will be used for bills.
     * - If you do not define a currency, the billing currency defined at Organizational level will
     *   be used.
     *
     * **Note:** If you've attached a Plan to the Account that uses a different currency to the
     * billing currency, then you must add the relevant currency conversion rate at Organization
     * level to ensure the billing process can convert line items calculated using the Plan currency
     * into the selected billing currency. If you don't add these conversion rates, then bills will
     * fail for the Account.
     */
    fun currency(): Optional<String> = body.currency()

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
     * Enter the number of days after the Bill generation date that you want to show on Bills as the
     * due date.
     *
     * **Note:** If you define `daysBeforeBillDue` at individual Account level, this will take
     * precedence over any `daysBeforeBillDue` setting defined at Organization level.
     */
    fun daysBeforeBillDue(): Optional<Long> = body.daysBeforeBillDue()

    /** Parent Account ID, or null if this Account does not have a parent. */
    fun parentAccountId(): Optional<String> = body.parentAccountId()

    /**
     * Purchase Order Number of the Account.
     *
     * Optional attribute - allows you to set a purchase order number that comes through into
     * invoicing. For example, your financial systems might require this as a reference for clearing
     * payments.
     */
    fun purchaseOrderNumber(): Optional<String> = body.purchaseOrderNumber()

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
    fun statementDefinitionId(): Optional<String> = body.statementDefinitionId()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     */
    fun version(): Optional<Long> = body.version()

    /** Code of the Account. This is a unique short code used for the Account. */
    fun _code(): JsonField<String> = body._code()

    /** Contact email for the Account. */
    fun _emailAddress(): JsonField<String> = body._emailAddress()

    /** Name of the Account. */
    fun _name(): JsonField<String> = body._name()

    /** Contact address. */
    fun _address(): JsonField<Address> = body._address()

    /**
     * Specify whether to auto-generate statements once Bills are approved or locked.
     * - **None**. Statements will not be auto-generated.
     * - **JSON**. Statements are auto-generated in JSON format.
     * - **JSON and CSV**. Statements are auto-generated in both JSON and CSV formats.
     */
    fun _autoGenerateStatementMode(): JsonField<AutoGenerateStatementMode> =
        body._autoGenerateStatementMode()

    /**
     * Optional setting to define a _billing cycle date_, which sets the date of the first Bill and
     * acts as a reference for when in the applied billing frequency period subsequent bills are
     * created:
     * - For example, if you attach a Plan to an Account where the Plan is configured for monthly
     *   billing frequency and you've defined the period the Plan will apply to the Account to be
     *   from January 1st, 2022 until January 1st, 2023. You then set a `billEpoch` date of February
     *   15th, 2022. The first Bill will be created for the Account on February 15th, and subsequent
     *   Bills created on the 15th of the months following for the remainder of the billing period -
     *   March 15th, April 15th, and so on.
     * - If not defined, then the relevant Epoch date set for the billing frequency period at
     *   Organization level will be used instead.
     * - The date is in ISO-8601 format.
     */
    fun _billEpoch(): JsonField<LocalDate> = body._billEpoch()

    /**
     * Configuration data for the Account Supported settings:
     * - SendBillsToThirdParties ("true"/"false")
     */
    fun _configData(): JsonField<ConfigData> = body._configData()

    /**
     * Define the order in which any Prepayment or Balance amounts on the Account are to be
     * drawn-down against for billing. Four options:
     * - `"PREPAYMENT","BALANCE"`. Draw-down against Prepayment credit before Balance credit.
     * - `"BALANCE","PREPAYMENT"`. Draw-down against Balance credit before Prepayment credit.
     * - `"PREPAYMENT"`. Only draw-down against Prepayment credit.
     * - `"BALANCE"`. Only draw-down against Balance credit.
     *
     * **NOTES:**
     * - Any setting you define here overrides the setting for credit application order at
     *   Organization level.
     * - If the Account belongs to a Parent/Child Account hierarchy, then the
     *   `creditApplicationOrder` settings are not available, and the draw-down order defaults
     *   always to Prepayment then Balance order.
     */
    fun _creditApplicationOrder(): JsonField<List<CreditApplicationOrder>> =
        body._creditApplicationOrder()

    /**
     * Account level billing currency, such as USD or GBP. Optional attribute:
     * - If you define an Account currency, this will be used for bills.
     * - If you do not define a currency, the billing currency defined at Organizational level will
     *   be used.
     *
     * **Note:** If you've attached a Plan to the Account that uses a different currency to the
     * billing currency, then you must add the relevant currency conversion rate at Organization
     * level to ensure the billing process can convert line items calculated using the Plan currency
     * into the selected billing currency. If you don't add these conversion rates, then bills will
     * fail for the Account.
     */
    fun _currency(): JsonField<String> = body._currency()

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
     * Enter the number of days after the Bill generation date that you want to show on Bills as the
     * due date.
     *
     * **Note:** If you define `daysBeforeBillDue` at individual Account level, this will take
     * precedence over any `daysBeforeBillDue` setting defined at Organization level.
     */
    fun _daysBeforeBillDue(): JsonField<Long> = body._daysBeforeBillDue()

    /** Parent Account ID, or null if this Account does not have a parent. */
    fun _parentAccountId(): JsonField<String> = body._parentAccountId()

    /**
     * Purchase Order Number of the Account.
     *
     * Optional attribute - allows you to set a purchase order number that comes through into
     * invoicing. For example, your financial systems might require this as a reference for clearing
     * payments.
     */
    fun _purchaseOrderNumber(): JsonField<String> = body._purchaseOrderNumber()

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
    fun _statementDefinitionId(): JsonField<String> = body._statementDefinitionId()

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

    /** Account request for operations such as Create or Update Account. */
    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("code")
        @ExcludeMissing
        private val code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("emailAddress")
        @ExcludeMissing
        private val emailAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("address")
        @ExcludeMissing
        private val address: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("autoGenerateStatementMode")
        @ExcludeMissing
        private val autoGenerateStatementMode: JsonField<AutoGenerateStatementMode> =
            JsonMissing.of(),
        @JsonProperty("billEpoch")
        @ExcludeMissing
        private val billEpoch: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("configData")
        @ExcludeMissing
        private val configData: JsonField<ConfigData> = JsonMissing.of(),
        @JsonProperty("creditApplicationOrder")
        @ExcludeMissing
        private val creditApplicationOrder: JsonField<List<CreditApplicationOrder>> =
            JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customFields")
        @ExcludeMissing
        private val customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("daysBeforeBillDue")
        @ExcludeMissing
        private val daysBeforeBillDue: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("parentAccountId")
        @ExcludeMissing
        private val parentAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("purchaseOrderNumber")
        @ExcludeMissing
        private val purchaseOrderNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("statementDefinitionId")
        @ExcludeMissing
        private val statementDefinitionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version")
        @ExcludeMissing
        private val version: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Code of the Account. This is a unique short code used for the Account. */
        fun code(): String = code.getRequired("code")

        /** Contact email for the Account. */
        fun emailAddress(): String = emailAddress.getRequired("emailAddress")

        /** Name of the Account. */
        fun name(): String = name.getRequired("name")

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
         * Optional setting to define a _billing cycle date_, which sets the date of the first Bill
         * and acts as a reference for when in the applied billing frequency period subsequent bills
         * are created:
         * - For example, if you attach a Plan to an Account where the Plan is configured for
         *   monthly billing frequency and you've defined the period the Plan will apply to the
         *   Account to be from January 1st, 2022 until January 1st, 2023. You then set a
         *   `billEpoch` date of February 15th, 2022. The first Bill will be created for the Account
         *   on February 15th, and subsequent Bills created on the 15th of the months following for
         *   the remainder of the billing period - March 15th, April 15th, and so on.
         * - If not defined, then the relevant Epoch date set for the billing frequency period at
         *   Organization level will be used instead.
         * - The date is in ISO-8601 format.
         */
        fun billEpoch(): Optional<LocalDate> =
            Optional.ofNullable(billEpoch.getNullable("billEpoch"))

        /**
         * Configuration data for the Account Supported settings:
         * - SendBillsToThirdParties ("true"/"false")
         */
        fun configData(): Optional<ConfigData> =
            Optional.ofNullable(configData.getNullable("configData"))

        /**
         * Define the order in which any Prepayment or Balance amounts on the Account are to be
         * drawn-down against for billing. Four options:
         * - `"PREPAYMENT","BALANCE"`. Draw-down against Prepayment credit before Balance credit.
         * - `"BALANCE","PREPAYMENT"`. Draw-down against Balance credit before Prepayment credit.
         * - `"PREPAYMENT"`. Only draw-down against Prepayment credit.
         * - `"BALANCE"`. Only draw-down against Balance credit.
         *
         * **NOTES:**
         * - Any setting you define here overrides the setting for credit application order at
         *   Organization level.
         * - If the Account belongs to a Parent/Child Account hierarchy, then the
         *   `creditApplicationOrder` settings are not available, and the draw-down order defaults
         *   always to Prepayment then Balance order.
         */
        fun creditApplicationOrder(): Optional<List<CreditApplicationOrder>> =
            Optional.ofNullable(creditApplicationOrder.getNullable("creditApplicationOrder"))

        /**
         * Account level billing currency, such as USD or GBP. Optional attribute:
         * - If you define an Account currency, this will be used for bills.
         * - If you do not define a currency, the billing currency defined at Organizational level
         *   will be used.
         *
         * **Note:** If you've attached a Plan to the Account that uses a different currency to the
         * billing currency, then you must add the relevant currency conversion rate at Organization
         * level to ensure the billing process can convert line items calculated using the Plan
         * currency into the selected billing currency. If you don't add these conversion rates,
         * then bills will fail for the Account.
         */
        fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

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
         * Enter the number of days after the Bill generation date that you want to show on Bills as
         * the due date.
         *
         * **Note:** If you define `daysBeforeBillDue` at individual Account level, this will take
         * precedence over any `daysBeforeBillDue` setting defined at Organization level.
         */
        fun daysBeforeBillDue(): Optional<Long> =
            Optional.ofNullable(daysBeforeBillDue.getNullable("daysBeforeBillDue"))

        /** Parent Account ID, or null if this Account does not have a parent. */
        fun parentAccountId(): Optional<String> =
            Optional.ofNullable(parentAccountId.getNullable("parentAccountId"))

        /**
         * Purchase Order Number of the Account.
         *
         * Optional attribute - allows you to set a purchase order number that comes through into
         * invoicing. For example, your financial systems might require this as a reference for
         * clearing payments.
         */
        fun purchaseOrderNumber(): Optional<String> =
            Optional.ofNullable(purchaseOrderNumber.getNullable("purchaseOrderNumber"))

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
        fun statementDefinitionId(): Optional<String> =
            Optional.ofNullable(statementDefinitionId.getNullable("statementDefinitionId"))

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

        /** Code of the Account. This is a unique short code used for the Account. */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /** Contact email for the Account. */
        @JsonProperty("emailAddress")
        @ExcludeMissing
        fun _emailAddress(): JsonField<String> = emailAddress

        /** Name of the Account. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Optional setting to define a _billing cycle date_, which sets the date of the first Bill
         * and acts as a reference for when in the applied billing frequency period subsequent bills
         * are created:
         * - For example, if you attach a Plan to an Account where the Plan is configured for
         *   monthly billing frequency and you've defined the period the Plan will apply to the
         *   Account to be from January 1st, 2022 until January 1st, 2023. You then set a
         *   `billEpoch` date of February 15th, 2022. The first Bill will be created for the Account
         *   on February 15th, and subsequent Bills created on the 15th of the months following for
         *   the remainder of the billing period - March 15th, April 15th, and so on.
         * - If not defined, then the relevant Epoch date set for the billing frequency period at
         *   Organization level will be used instead.
         * - The date is in ISO-8601 format.
         */
        @JsonProperty("billEpoch")
        @ExcludeMissing
        fun _billEpoch(): JsonField<LocalDate> = billEpoch

        /**
         * Configuration data for the Account Supported settings:
         * - SendBillsToThirdParties ("true"/"false")
         */
        @JsonProperty("configData")
        @ExcludeMissing
        fun _configData(): JsonField<ConfigData> = configData

        /**
         * Define the order in which any Prepayment or Balance amounts on the Account are to be
         * drawn-down against for billing. Four options:
         * - `"PREPAYMENT","BALANCE"`. Draw-down against Prepayment credit before Balance credit.
         * - `"BALANCE","PREPAYMENT"`. Draw-down against Balance credit before Prepayment credit.
         * - `"PREPAYMENT"`. Only draw-down against Prepayment credit.
         * - `"BALANCE"`. Only draw-down against Balance credit.
         *
         * **NOTES:**
         * - Any setting you define here overrides the setting for credit application order at
         *   Organization level.
         * - If the Account belongs to a Parent/Child Account hierarchy, then the
         *   `creditApplicationOrder` settings are not available, and the draw-down order defaults
         *   always to Prepayment then Balance order.
         */
        @JsonProperty("creditApplicationOrder")
        @ExcludeMissing
        fun _creditApplicationOrder(): JsonField<List<CreditApplicationOrder>> =
            creditApplicationOrder

        /**
         * Account level billing currency, such as USD or GBP. Optional attribute:
         * - If you define an Account currency, this will be used for bills.
         * - If you do not define a currency, the billing currency defined at Organizational level
         *   will be used.
         *
         * **Note:** If you've attached a Plan to the Account that uses a different currency to the
         * billing currency, then you must add the relevant currency conversion rate at Organization
         * level to ensure the billing process can convert line items calculated using the Plan
         * currency into the selected billing currency. If you don't add these conversion rates,
         * then bills will fail for the Account.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

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
         * Enter the number of days after the Bill generation date that you want to show on Bills as
         * the due date.
         *
         * **Note:** If you define `daysBeforeBillDue` at individual Account level, this will take
         * precedence over any `daysBeforeBillDue` setting defined at Organization level.
         */
        @JsonProperty("daysBeforeBillDue")
        @ExcludeMissing
        fun _daysBeforeBillDue(): JsonField<Long> = daysBeforeBillDue

        /** Parent Account ID, or null if this Account does not have a parent. */
        @JsonProperty("parentAccountId")
        @ExcludeMissing
        fun _parentAccountId(): JsonField<String> = parentAccountId

        /**
         * Purchase Order Number of the Account.
         *
         * Optional attribute - allows you to set a purchase order number that comes through into
         * invoicing. For example, your financial systems might require this as a reference for
         * clearing payments.
         */
        @JsonProperty("purchaseOrderNumber")
        @ExcludeMissing
        fun _purchaseOrderNumber(): JsonField<String> = purchaseOrderNumber

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
        @JsonProperty("statementDefinitionId")
        @ExcludeMissing
        fun _statementDefinitionId(): JsonField<String> = statementDefinitionId

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
            emailAddress()
            name()
            address().ifPresent { it.validate() }
            autoGenerateStatementMode()
            billEpoch()
            configData().ifPresent { it.validate() }
            creditApplicationOrder()
            currency()
            customFields().ifPresent { it.validate() }
            daysBeforeBillDue()
            parentAccountId()
            purchaseOrderNumber()
            statementDefinitionId()
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
            private var emailAddress: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var address: JsonField<Address> = JsonMissing.of()
            private var autoGenerateStatementMode: JsonField<AutoGenerateStatementMode> =
                JsonMissing.of()
            private var billEpoch: JsonField<LocalDate> = JsonMissing.of()
            private var configData: JsonField<ConfigData> = JsonMissing.of()
            private var creditApplicationOrder: JsonField<MutableList<CreditApplicationOrder>>? =
                null
            private var currency: JsonField<String> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var daysBeforeBillDue: JsonField<Long> = JsonMissing.of()
            private var parentAccountId: JsonField<String> = JsonMissing.of()
            private var purchaseOrderNumber: JsonField<String> = JsonMissing.of()
            private var statementDefinitionId: JsonField<String> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                code = body.code
                emailAddress = body.emailAddress
                name = body.name
                address = body.address
                autoGenerateStatementMode = body.autoGenerateStatementMode
                billEpoch = body.billEpoch
                configData = body.configData
                creditApplicationOrder = body.creditApplicationOrder.map { it.toMutableList() }
                currency = body.currency
                customFields = body.customFields
                daysBeforeBillDue = body.daysBeforeBillDue
                parentAccountId = body.parentAccountId
                purchaseOrderNumber = body.purchaseOrderNumber
                statementDefinitionId = body.statementDefinitionId
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Code of the Account. This is a unique short code used for the Account. */
            fun code(code: String) = code(JsonField.of(code))

            /** Code of the Account. This is a unique short code used for the Account. */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /** Contact email for the Account. */
            fun emailAddress(emailAddress: String) = emailAddress(JsonField.of(emailAddress))

            /** Contact email for the Account. */
            fun emailAddress(emailAddress: JsonField<String>) = apply {
                this.emailAddress = emailAddress
            }

            /** Name of the Account. */
            fun name(name: String) = name(JsonField.of(name))

            /** Name of the Account. */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Optional setting to define a _billing cycle date_, which sets the date of the first
             * Bill and acts as a reference for when in the applied billing frequency period
             * subsequent bills are created:
             * - For example, if you attach a Plan to an Account where the Plan is configured for
             *   monthly billing frequency and you've defined the period the Plan will apply to the
             *   Account to be from January 1st, 2022 until January 1st, 2023. You then set a
             *   `billEpoch` date of February 15th, 2022. The first Bill will be created for the
             *   Account on February 15th, and subsequent Bills created on the 15th of the months
             *   following for the remainder of the billing period - March 15th, April 15th, and so
             *   on.
             * - If not defined, then the relevant Epoch date set for the billing frequency period
             *   at Organization level will be used instead.
             * - The date is in ISO-8601 format.
             */
            fun billEpoch(billEpoch: LocalDate) = billEpoch(JsonField.of(billEpoch))

            /**
             * Optional setting to define a _billing cycle date_, which sets the date of the first
             * Bill and acts as a reference for when in the applied billing frequency period
             * subsequent bills are created:
             * - For example, if you attach a Plan to an Account where the Plan is configured for
             *   monthly billing frequency and you've defined the period the Plan will apply to the
             *   Account to be from January 1st, 2022 until January 1st, 2023. You then set a
             *   `billEpoch` date of February 15th, 2022. The first Bill will be created for the
             *   Account on February 15th, and subsequent Bills created on the 15th of the months
             *   following for the remainder of the billing period - March 15th, April 15th, and so
             *   on.
             * - If not defined, then the relevant Epoch date set for the billing frequency period
             *   at Organization level will be used instead.
             * - The date is in ISO-8601 format.
             */
            fun billEpoch(billEpoch: JsonField<LocalDate>) = apply { this.billEpoch = billEpoch }

            /**
             * Configuration data for the Account Supported settings:
             * - SendBillsToThirdParties ("true"/"false")
             */
            fun configData(configData: ConfigData) = configData(JsonField.of(configData))

            /**
             * Configuration data for the Account Supported settings:
             * - SendBillsToThirdParties ("true"/"false")
             */
            fun configData(configData: JsonField<ConfigData>) = apply {
                this.configData = configData
            }

            /**
             * Define the order in which any Prepayment or Balance amounts on the Account are to be
             * drawn-down against for billing. Four options:
             * - `"PREPAYMENT","BALANCE"`. Draw-down against Prepayment credit before Balance
             *   credit.
             * - `"BALANCE","PREPAYMENT"`. Draw-down against Balance credit before Prepayment
             *   credit.
             * - `"PREPAYMENT"`. Only draw-down against Prepayment credit.
             * - `"BALANCE"`. Only draw-down against Balance credit.
             *
             * **NOTES:**
             * - Any setting you define here overrides the setting for credit application order at
             *   Organization level.
             * - If the Account belongs to a Parent/Child Account hierarchy, then the
             *   `creditApplicationOrder` settings are not available, and the draw-down order
             *   defaults always to Prepayment then Balance order.
             */
            fun creditApplicationOrder(creditApplicationOrder: List<CreditApplicationOrder>) =
                creditApplicationOrder(JsonField.of(creditApplicationOrder))

            /**
             * Define the order in which any Prepayment or Balance amounts on the Account are to be
             * drawn-down against for billing. Four options:
             * - `"PREPAYMENT","BALANCE"`. Draw-down against Prepayment credit before Balance
             *   credit.
             * - `"BALANCE","PREPAYMENT"`. Draw-down against Balance credit before Prepayment
             *   credit.
             * - `"PREPAYMENT"`. Only draw-down against Prepayment credit.
             * - `"BALANCE"`. Only draw-down against Balance credit.
             *
             * **NOTES:**
             * - Any setting you define here overrides the setting for credit application order at
             *   Organization level.
             * - If the Account belongs to a Parent/Child Account hierarchy, then the
             *   `creditApplicationOrder` settings are not available, and the draw-down order
             *   defaults always to Prepayment then Balance order.
             */
            fun creditApplicationOrder(
                creditApplicationOrder: JsonField<List<CreditApplicationOrder>>
            ) = apply {
                this.creditApplicationOrder = creditApplicationOrder.map { it.toMutableList() }
            }

            /**
             * Define the order in which any Prepayment or Balance amounts on the Account are to be
             * drawn-down against for billing. Four options:
             * - `"PREPAYMENT","BALANCE"`. Draw-down against Prepayment credit before Balance
             *   credit.
             * - `"BALANCE","PREPAYMENT"`. Draw-down against Balance credit before Prepayment
             *   credit.
             * - `"PREPAYMENT"`. Only draw-down against Prepayment credit.
             * - `"BALANCE"`. Only draw-down against Balance credit.
             *
             * **NOTES:**
             * - Any setting you define here overrides the setting for credit application order at
             *   Organization level.
             * - If the Account belongs to a Parent/Child Account hierarchy, then the
             *   `creditApplicationOrder` settings are not available, and the draw-down order
             *   defaults always to Prepayment then Balance order.
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
             * - If you do not define a currency, the billing currency defined at Organizational
             *   level will be used.
             *
             * **Note:** If you've attached a Plan to the Account that uses a different currency to
             * the billing currency, then you must add the relevant currency conversion rate at
             * Organization level to ensure the billing process can convert line items calculated
             * using the Plan currency into the selected billing currency. If you don't add these
             * conversion rates, then bills will fail for the Account.
             */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Account level billing currency, such as USD or GBP. Optional attribute:
             * - If you define an Account currency, this will be used for bills.
             * - If you do not define a currency, the billing currency defined at Organizational
             *   level will be used.
             *
             * **Note:** If you've attached a Plan to the Account that uses a different currency to
             * the billing currency, then you must add the relevant currency conversion rate at
             * Organization level to ensure the billing process can convert line items calculated
             * using the Plan currency into the selected billing currency. If you don't add these
             * conversion rates, then bills will fail for the Account.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

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
             * Enter the number of days after the Bill generation date that you want to show on
             * Bills as the due date.
             *
             * **Note:** If you define `daysBeforeBillDue` at individual Account level, this will
             * take precedence over any `daysBeforeBillDue` setting defined at Organization level.
             */
            fun daysBeforeBillDue(daysBeforeBillDue: Long) =
                daysBeforeBillDue(JsonField.of(daysBeforeBillDue))

            /**
             * Enter the number of days after the Bill generation date that you want to show on
             * Bills as the due date.
             *
             * **Note:** If you define `daysBeforeBillDue` at individual Account level, this will
             * take precedence over any `daysBeforeBillDue` setting defined at Organization level.
             */
            fun daysBeforeBillDue(daysBeforeBillDue: JsonField<Long>) = apply {
                this.daysBeforeBillDue = daysBeforeBillDue
            }

            /** Parent Account ID, or null if this Account does not have a parent. */
            fun parentAccountId(parentAccountId: String) =
                parentAccountId(JsonField.of(parentAccountId))

            /** Parent Account ID, or null if this Account does not have a parent. */
            fun parentAccountId(parentAccountId: JsonField<String>) = apply {
                this.parentAccountId = parentAccountId
            }

            /**
             * Purchase Order Number of the Account.
             *
             * Optional attribute - allows you to set a purchase order number that comes through
             * into invoicing. For example, your financial systems might require this as a reference
             * for clearing payments.
             */
            fun purchaseOrderNumber(purchaseOrderNumber: String) =
                purchaseOrderNumber(JsonField.of(purchaseOrderNumber))

            /**
             * Purchase Order Number of the Account.
             *
             * Optional attribute - allows you to set a purchase order number that comes through
             * into invoicing. For example, your financial systems might require this as a reference
             * for clearing payments.
             */
            fun purchaseOrderNumber(purchaseOrderNumber: JsonField<String>) = apply {
                this.purchaseOrderNumber = purchaseOrderNumber
            }

            /**
             * The UUID of the statement definition used when Bill statements are generated for the
             * Account. If no statement definition is specified for the Account, the statement
             * definition specified at Organizational level is used.
             *
             * Bill statements can be used as informative backing sheets to invoices. Based on the
             * usage breakdown defined in the statement definition, generated statements give a
             * breakdown of usage charges on Account Bills, which helps customers better understand
             * usage charges incurred over the billing period.
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
             * Bill statements can be used as informative backing sheets to invoices. Based on the
             * usage breakdown defined in the statement definition, generated statements give a
             * breakdown of usage charges on Account Bills, which helps customers better understand
             * usage charges incurred over the billing period.
             *
             * See
             * [Working with Bill Statements](https://www.m3ter.com/docs/guides/running-viewing-and-managing-bills/working-with-bill-statements)
             * in the m3ter documentation for more details.
             */
            fun statementDefinitionId(statementDefinitionId: JsonField<String>) = apply {
                this.statementDefinitionId = statementDefinitionId
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
                    checkRequired("emailAddress", emailAddress),
                    checkRequired("name", name),
                    address,
                    autoGenerateStatementMode,
                    billEpoch,
                    configData,
                    (creditApplicationOrder ?: JsonMissing.of()).map { it.toImmutable() },
                    currency,
                    customFields,
                    daysBeforeBillDue,
                    parentAccountId,
                    purchaseOrderNumber,
                    statementDefinitionId,
                    version,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && code == other.code && emailAddress == other.emailAddress && name == other.name && address == other.address && autoGenerateStatementMode == other.autoGenerateStatementMode && billEpoch == other.billEpoch && configData == other.configData && creditApplicationOrder == other.creditApplicationOrder && currency == other.currency && customFields == other.customFields && daysBeforeBillDue == other.daysBeforeBillDue && parentAccountId == other.parentAccountId && purchaseOrderNumber == other.purchaseOrderNumber && statementDefinitionId == other.statementDefinitionId && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(code, emailAddress, name, address, autoGenerateStatementMode, billEpoch, configData, creditApplicationOrder, currency, customFields, daysBeforeBillDue, parentAccountId, purchaseOrderNumber, statementDefinitionId, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{code=$code, emailAddress=$emailAddress, name=$name, address=$address, autoGenerateStatementMode=$autoGenerateStatementMode, billEpoch=$billEpoch, configData=$configData, creditApplicationOrder=$creditApplicationOrder, currency=$currency, customFields=$customFields, daysBeforeBillDue=$daysBeforeBillDue, parentAccountId=$parentAccountId, purchaseOrderNumber=$purchaseOrderNumber, statementDefinitionId=$statementDefinitionId, version=$version, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(accountCreateParams: AccountCreateParams) = apply {
            orgId = accountCreateParams.orgId
            body = accountCreateParams.body.toBuilder()
            additionalHeaders = accountCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = accountCreateParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /** Code of the Account. This is a unique short code used for the Account. */
        fun code(code: String) = apply { body.code(code) }

        /** Code of the Account. This is a unique short code used for the Account. */
        fun code(code: JsonField<String>) = apply { body.code(code) }

        /** Contact email for the Account. */
        fun emailAddress(emailAddress: String) = apply { body.emailAddress(emailAddress) }

        /** Contact email for the Account. */
        fun emailAddress(emailAddress: JsonField<String>) = apply {
            body.emailAddress(emailAddress)
        }

        /** Name of the Account. */
        fun name(name: String) = apply { body.name(name) }

        /** Name of the Account. */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** Contact address. */
        fun address(address: Address) = apply { body.address(address) }

        /** Contact address. */
        fun address(address: JsonField<Address>) = apply { body.address(address) }

        /**
         * Specify whether to auto-generate statements once Bills are approved or locked.
         * - **None**. Statements will not be auto-generated.
         * - **JSON**. Statements are auto-generated in JSON format.
         * - **JSON and CSV**. Statements are auto-generated in both JSON and CSV formats.
         */
        fun autoGenerateStatementMode(autoGenerateStatementMode: AutoGenerateStatementMode) =
            apply {
                body.autoGenerateStatementMode(autoGenerateStatementMode)
            }

        /**
         * Specify whether to auto-generate statements once Bills are approved or locked.
         * - **None**. Statements will not be auto-generated.
         * - **JSON**. Statements are auto-generated in JSON format.
         * - **JSON and CSV**. Statements are auto-generated in both JSON and CSV formats.
         */
        fun autoGenerateStatementMode(
            autoGenerateStatementMode: JsonField<AutoGenerateStatementMode>
        ) = apply { body.autoGenerateStatementMode(autoGenerateStatementMode) }

        /**
         * Optional setting to define a _billing cycle date_, which sets the date of the first Bill
         * and acts as a reference for when in the applied billing frequency period subsequent bills
         * are created:
         * - For example, if you attach a Plan to an Account where the Plan is configured for
         *   monthly billing frequency and you've defined the period the Plan will apply to the
         *   Account to be from January 1st, 2022 until January 1st, 2023. You then set a
         *   `billEpoch` date of February 15th, 2022. The first Bill will be created for the Account
         *   on February 15th, and subsequent Bills created on the 15th of the months following for
         *   the remainder of the billing period - March 15th, April 15th, and so on.
         * - If not defined, then the relevant Epoch date set for the billing frequency period at
         *   Organization level will be used instead.
         * - The date is in ISO-8601 format.
         */
        fun billEpoch(billEpoch: LocalDate) = apply { body.billEpoch(billEpoch) }

        /**
         * Optional setting to define a _billing cycle date_, which sets the date of the first Bill
         * and acts as a reference for when in the applied billing frequency period subsequent bills
         * are created:
         * - For example, if you attach a Plan to an Account where the Plan is configured for
         *   monthly billing frequency and you've defined the period the Plan will apply to the
         *   Account to be from January 1st, 2022 until January 1st, 2023. You then set a
         *   `billEpoch` date of February 15th, 2022. The first Bill will be created for the Account
         *   on February 15th, and subsequent Bills created on the 15th of the months following for
         *   the remainder of the billing period - March 15th, April 15th, and so on.
         * - If not defined, then the relevant Epoch date set for the billing frequency period at
         *   Organization level will be used instead.
         * - The date is in ISO-8601 format.
         */
        fun billEpoch(billEpoch: JsonField<LocalDate>) = apply { body.billEpoch(billEpoch) }

        /**
         * Configuration data for the Account Supported settings:
         * - SendBillsToThirdParties ("true"/"false")
         */
        fun configData(configData: ConfigData) = apply { body.configData(configData) }

        /**
         * Configuration data for the Account Supported settings:
         * - SendBillsToThirdParties ("true"/"false")
         */
        fun configData(configData: JsonField<ConfigData>) = apply { body.configData(configData) }

        /**
         * Define the order in which any Prepayment or Balance amounts on the Account are to be
         * drawn-down against for billing. Four options:
         * - `"PREPAYMENT","BALANCE"`. Draw-down against Prepayment credit before Balance credit.
         * - `"BALANCE","PREPAYMENT"`. Draw-down against Balance credit before Prepayment credit.
         * - `"PREPAYMENT"`. Only draw-down against Prepayment credit.
         * - `"BALANCE"`. Only draw-down against Balance credit.
         *
         * **NOTES:**
         * - Any setting you define here overrides the setting for credit application order at
         *   Organization level.
         * - If the Account belongs to a Parent/Child Account hierarchy, then the
         *   `creditApplicationOrder` settings are not available, and the draw-down order defaults
         *   always to Prepayment then Balance order.
         */
        fun creditApplicationOrder(creditApplicationOrder: List<CreditApplicationOrder>) = apply {
            body.creditApplicationOrder(creditApplicationOrder)
        }

        /**
         * Define the order in which any Prepayment or Balance amounts on the Account are to be
         * drawn-down against for billing. Four options:
         * - `"PREPAYMENT","BALANCE"`. Draw-down against Prepayment credit before Balance credit.
         * - `"BALANCE","PREPAYMENT"`. Draw-down against Balance credit before Prepayment credit.
         * - `"PREPAYMENT"`. Only draw-down against Prepayment credit.
         * - `"BALANCE"`. Only draw-down against Balance credit.
         *
         * **NOTES:**
         * - Any setting you define here overrides the setting for credit application order at
         *   Organization level.
         * - If the Account belongs to a Parent/Child Account hierarchy, then the
         *   `creditApplicationOrder` settings are not available, and the draw-down order defaults
         *   always to Prepayment then Balance order.
         */
        fun creditApplicationOrder(
            creditApplicationOrder: JsonField<List<CreditApplicationOrder>>
        ) = apply { body.creditApplicationOrder(creditApplicationOrder) }

        /**
         * Define the order in which any Prepayment or Balance amounts on the Account are to be
         * drawn-down against for billing. Four options:
         * - `"PREPAYMENT","BALANCE"`. Draw-down against Prepayment credit before Balance credit.
         * - `"BALANCE","PREPAYMENT"`. Draw-down against Balance credit before Prepayment credit.
         * - `"PREPAYMENT"`. Only draw-down against Prepayment credit.
         * - `"BALANCE"`. Only draw-down against Balance credit.
         *
         * **NOTES:**
         * - Any setting you define here overrides the setting for credit application order at
         *   Organization level.
         * - If the Account belongs to a Parent/Child Account hierarchy, then the
         *   `creditApplicationOrder` settings are not available, and the draw-down order defaults
         *   always to Prepayment then Balance order.
         */
        fun addCreditApplicationOrder(creditApplicationOrder: CreditApplicationOrder) = apply {
            body.addCreditApplicationOrder(creditApplicationOrder)
        }

        /**
         * Account level billing currency, such as USD or GBP. Optional attribute:
         * - If you define an Account currency, this will be used for bills.
         * - If you do not define a currency, the billing currency defined at Organizational level
         *   will be used.
         *
         * **Note:** If you've attached a Plan to the Account that uses a different currency to the
         * billing currency, then you must add the relevant currency conversion rate at Organization
         * level to ensure the billing process can convert line items calculated using the Plan
         * currency into the selected billing currency. If you don't add these conversion rates,
         * then bills will fail for the Account.
         */
        fun currency(currency: String) = apply { body.currency(currency) }

        /**
         * Account level billing currency, such as USD or GBP. Optional attribute:
         * - If you define an Account currency, this will be used for bills.
         * - If you do not define a currency, the billing currency defined at Organizational level
         *   will be used.
         *
         * **Note:** If you've attached a Plan to the Account that uses a different currency to the
         * billing currency, then you must add the relevant currency conversion rate at Organization
         * level to ensure the billing process can convert line items calculated using the Plan
         * currency into the selected billing currency. If you don't add these conversion rates,
         * then bills will fail for the Account.
         */
        fun currency(currency: JsonField<String>) = apply { body.currency(currency) }

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
         * Enter the number of days after the Bill generation date that you want to show on Bills as
         * the due date.
         *
         * **Note:** If you define `daysBeforeBillDue` at individual Account level, this will take
         * precedence over any `daysBeforeBillDue` setting defined at Organization level.
         */
        fun daysBeforeBillDue(daysBeforeBillDue: Long) = apply {
            body.daysBeforeBillDue(daysBeforeBillDue)
        }

        /**
         * Enter the number of days after the Bill generation date that you want to show on Bills as
         * the due date.
         *
         * **Note:** If you define `daysBeforeBillDue` at individual Account level, this will take
         * precedence over any `daysBeforeBillDue` setting defined at Organization level.
         */
        fun daysBeforeBillDue(daysBeforeBillDue: JsonField<Long>) = apply {
            body.daysBeforeBillDue(daysBeforeBillDue)
        }

        /** Parent Account ID, or null if this Account does not have a parent. */
        fun parentAccountId(parentAccountId: String) = apply {
            body.parentAccountId(parentAccountId)
        }

        /** Parent Account ID, or null if this Account does not have a parent. */
        fun parentAccountId(parentAccountId: JsonField<String>) = apply {
            body.parentAccountId(parentAccountId)
        }

        /**
         * Purchase Order Number of the Account.
         *
         * Optional attribute - allows you to set a purchase order number that comes through into
         * invoicing. For example, your financial systems might require this as a reference for
         * clearing payments.
         */
        fun purchaseOrderNumber(purchaseOrderNumber: String) = apply {
            body.purchaseOrderNumber(purchaseOrderNumber)
        }

        /**
         * Purchase Order Number of the Account.
         *
         * Optional attribute - allows you to set a purchase order number that comes through into
         * invoicing. For example, your financial systems might require this as a reference for
         * clearing payments.
         */
        fun purchaseOrderNumber(purchaseOrderNumber: JsonField<String>) = apply {
            body.purchaseOrderNumber(purchaseOrderNumber)
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
        fun statementDefinitionId(statementDefinitionId: String) = apply {
            body.statementDefinitionId(statementDefinitionId)
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
        fun statementDefinitionId(statementDefinitionId: JsonField<String>) = apply {
            body.statementDefinitionId(statementDefinitionId)
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

        fun build(): AccountCreateParams =
            AccountCreateParams(
                checkRequired("orgId", orgId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
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

            return /* spotless:off */ other is AutoGenerateStatementMode && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Configuration data for the Account Supported settings:
     * - SendBillsToThirdParties ("true"/"false")
     */
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

            return /* spotless:off */ other is CreditApplicationOrder && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

        return /* spotless:off */ other is AccountCreateParams && orgId == other.orgId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AccountCreateParams{orgId=$orgId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
