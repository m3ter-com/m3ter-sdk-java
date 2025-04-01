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
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkKnown
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update the Account with the given Account UUID.
 *
 * **Note:** If you have created Custom Fields for an Account, when you use this endpoint to update
 * the Account, use the `customFields` parameter to preserve those Custom Fields. If you omit them
 * from the update request, they will be lost.
 */
class AccountUpdateParams
private constructor(
    private val orgId: String,
    private val id: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    fun id(): String = id

    /**
     * Code of the Account. This is a unique short code used for the Account.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun code(): String = body.code()

    /**
     * Contact email for the Account.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun emailAddress(): String = body.emailAddress()

    /**
     * Name of the Account.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * Contact address.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun address(): Optional<Address> = body.address()

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
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billEpoch(): Optional<LocalDate> = body.billEpoch()

    /**
     * Configuration data for the Account Supported settings:
     * - SendBillsToThirdParties ("true"/"false")
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
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
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
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
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
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
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customFields(): Optional<CustomFields> = body.customFields()

    /**
     * Enter the number of days after the Bill generation date that you want to show on Bills as the
     * due date.
     *
     * **Note:** If you define `daysBeforeBillDue` at individual Account level, this will take
     * precedence over any `daysBeforeBillDue` setting defined at Organization level.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun daysBeforeBillDue(): Optional<Long> = body.daysBeforeBillDue()

    /**
     * Parent Account ID, or null if this Account does not have a parent.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parentAccountId(): Optional<String> = body.parentAccountId()

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
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statementDefinitionId(): Optional<String> = body.statementDefinitionId()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun version(): Optional<Long> = body.version()

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _code(): JsonField<String> = body._code()

    /**
     * Returns the raw JSON value of [emailAddress].
     *
     * Unlike [emailAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _emailAddress(): JsonField<String> = body._emailAddress()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [address].
     *
     * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _address(): JsonField<Address> = body._address()

    /**
     * Returns the raw JSON value of [autoGenerateStatementMode].
     *
     * Unlike [autoGenerateStatementMode], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _autoGenerateStatementMode(): JsonField<AutoGenerateStatementMode> =
        body._autoGenerateStatementMode()

    /**
     * Returns the raw JSON value of [billEpoch].
     *
     * Unlike [billEpoch], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billEpoch(): JsonField<LocalDate> = body._billEpoch()

    /**
     * Returns the raw JSON value of [configData].
     *
     * Unlike [configData], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _configData(): JsonField<ConfigData> = body._configData()

    /**
     * Returns the raw JSON value of [creditApplicationOrder].
     *
     * Unlike [creditApplicationOrder], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _creditApplicationOrder(): JsonField<List<CreditApplicationOrder>> =
        body._creditApplicationOrder()

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currency(): JsonField<String> = body._currency()

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customFields(): JsonField<CustomFields> = body._customFields()

    /**
     * Returns the raw JSON value of [daysBeforeBillDue].
     *
     * Unlike [daysBeforeBillDue], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _daysBeforeBillDue(): JsonField<Long> = body._daysBeforeBillDue()

    /**
     * Returns the raw JSON value of [parentAccountId].
     *
     * Unlike [parentAccountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _parentAccountId(): JsonField<String> = body._parentAccountId()

    /**
     * Returns the raw JSON value of [purchaseOrderNumber].
     *
     * Unlike [purchaseOrderNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _purchaseOrderNumber(): JsonField<String> = body._purchaseOrderNumber()

    /**
     * Returns the raw JSON value of [statementDefinitionId].
     *
     * Unlike [statementDefinitionId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _statementDefinitionId(): JsonField<String> = body._statementDefinitionId()

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _version(): JsonField<Long> = body._version()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .id()
         * .code()
         * .emailAddress()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountUpdateParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(accountUpdateParams: AccountUpdateParams) = apply {
            orgId = accountUpdateParams.orgId
            id = accountUpdateParams.id
            body = accountUpdateParams.body.toBuilder()
            additionalHeaders = accountUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = accountUpdateParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        fun id(id: String) = apply { this.id = id }

        /** Code of the Account. This is a unique short code used for the Account. */
        fun code(code: String) = apply { body.code(code) }

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { body.code(code) }

        /** Contact email for the Account. */
        fun emailAddress(emailAddress: String) = apply { body.emailAddress(emailAddress) }

        /**
         * Sets [Builder.emailAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailAddress] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun emailAddress(emailAddress: JsonField<String>) = apply {
            body.emailAddress(emailAddress)
        }

        /** Name of the Account. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** Contact address. */
        fun address(address: Address) = apply { body.address(address) }

        /**
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [Address] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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
         * Sets [Builder.autoGenerateStatementMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoGenerateStatementMode] with a well-typed
         * [AutoGenerateStatementMode] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
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
         * Sets [Builder.billEpoch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billEpoch] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun billEpoch(billEpoch: JsonField<LocalDate>) = apply { body.billEpoch(billEpoch) }

        /**
         * Configuration data for the Account Supported settings:
         * - SendBillsToThirdParties ("true"/"false")
         */
        fun configData(configData: ConfigData) = apply { body.configData(configData) }

        /**
         * Sets [Builder.configData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.configData] with a well-typed [ConfigData] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Sets [Builder.creditApplicationOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditApplicationOrder] with a well-typed
         * `List<CreditApplicationOrder>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun creditApplicationOrder(
            creditApplicationOrder: JsonField<List<CreditApplicationOrder>>
        ) = apply { body.creditApplicationOrder(creditApplicationOrder) }

        /**
         * Adds a single [CreditApplicationOrder] to [Builder.creditApplicationOrder].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
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
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Sets [Builder.customFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Sets [Builder.daysBeforeBillDue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.daysBeforeBillDue] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun daysBeforeBillDue(daysBeforeBillDue: JsonField<Long>) = apply {
            body.daysBeforeBillDue(daysBeforeBillDue)
        }

        /** Parent Account ID, or null if this Account does not have a parent. */
        fun parentAccountId(parentAccountId: String) = apply {
            body.parentAccountId(parentAccountId)
        }

        /**
         * Sets [Builder.parentAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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
         * Sets [Builder.purchaseOrderNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.purchaseOrderNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Sets [Builder.statementDefinitionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statementDefinitionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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

        /**
         * Returns an immutable instance of [AccountUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .id()
         * .code()
         * .emailAddress()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountUpdateParams =
            AccountUpdateParams(
                checkRequired("orgId", orgId),
                checkRequired("id", id),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @JvmSynthetic internal fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId
            1 -> id
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Account request for operations such as Create or Update Account. */
    class Body
    private constructor(
        private val code: JsonField<String>,
        private val emailAddress: JsonField<String>,
        private val name: JsonField<String>,
        private val address: JsonField<Address>,
        private val autoGenerateStatementMode: JsonField<AutoGenerateStatementMode>,
        private val billEpoch: JsonField<LocalDate>,
        private val configData: JsonField<ConfigData>,
        private val creditApplicationOrder: JsonField<List<CreditApplicationOrder>>,
        private val currency: JsonField<String>,
        private val customFields: JsonField<CustomFields>,
        private val daysBeforeBillDue: JsonField<Long>,
        private val parentAccountId: JsonField<String>,
        private val purchaseOrderNumber: JsonField<String>,
        private val statementDefinitionId: JsonField<String>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("emailAddress")
            @ExcludeMissing
            emailAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("autoGenerateStatementMode")
            @ExcludeMissing
            autoGenerateStatementMode: JsonField<AutoGenerateStatementMode> = JsonMissing.of(),
            @JsonProperty("billEpoch")
            @ExcludeMissing
            billEpoch: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("configData")
            @ExcludeMissing
            configData: JsonField<ConfigData> = JsonMissing.of(),
            @JsonProperty("creditApplicationOrder")
            @ExcludeMissing
            creditApplicationOrder: JsonField<List<CreditApplicationOrder>> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customFields")
            @ExcludeMissing
            customFields: JsonField<CustomFields> = JsonMissing.of(),
            @JsonProperty("daysBeforeBillDue")
            @ExcludeMissing
            daysBeforeBillDue: JsonField<Long> = JsonMissing.of(),
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
            code,
            emailAddress,
            name,
            address,
            autoGenerateStatementMode,
            billEpoch,
            configData,
            creditApplicationOrder,
            currency,
            customFields,
            daysBeforeBillDue,
            parentAccountId,
            purchaseOrderNumber,
            statementDefinitionId,
            version,
            mutableMapOf(),
        )

        /**
         * Code of the Account. This is a unique short code used for the Account.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun code(): String = code.getRequired("code")

        /**
         * Contact email for the Account.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun emailAddress(): String = emailAddress.getRequired("emailAddress")

        /**
         * Name of the Account.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Contact address.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun address(): Optional<Address> = Optional.ofNullable(address.getNullable("address"))

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
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billEpoch(): Optional<LocalDate> =
            Optional.ofNullable(billEpoch.getNullable("billEpoch"))

        /**
         * Configuration data for the Account Supported settings:
         * - SendBillsToThirdParties ("true"/"false")
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
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
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
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
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
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
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("customFields"))

        /**
         * Enter the number of days after the Bill generation date that you want to show on Bills as
         * the due date.
         *
         * **Note:** If you define `daysBeforeBillDue` at individual Account level, this will take
         * precedence over any `daysBeforeBillDue` setting defined at Organization level.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun daysBeforeBillDue(): Optional<Long> =
            Optional.ofNullable(daysBeforeBillDue.getNullable("daysBeforeBillDue"))

        /**
         * Parent Account ID, or null if this Account does not have a parent.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun parentAccountId(): Optional<String> =
            Optional.ofNullable(parentAccountId.getNullable("parentAccountId"))

        /**
         * Purchase Order Number of the Account.
         *
         * Optional attribute - allows you to set a purchase order number that comes through into
         * invoicing. For example, your financial systems might require this as a reference for
         * clearing payments.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
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
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
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
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [emailAddress].
         *
         * Unlike [emailAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("emailAddress")
        @ExcludeMissing
        fun _emailAddress(): JsonField<String> = emailAddress

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
        @JsonProperty("billEpoch")
        @ExcludeMissing
        fun _billEpoch(): JsonField<LocalDate> = billEpoch

        /**
         * Returns the raw JSON value of [configData].
         *
         * Unlike [configData], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("configData")
        @ExcludeMissing
        fun _configData(): JsonField<ConfigData> = configData

        /**
         * Returns the raw JSON value of [creditApplicationOrder].
         *
         * Unlike [creditApplicationOrder], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("creditApplicationOrder")
        @ExcludeMissing
        fun _creditApplicationOrder(): JsonField<List<CreditApplicationOrder>> =
            creditApplicationOrder

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [customFields].
         *
         * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected
         * type.
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
        fun _daysBeforeBillDue(): JsonField<Long> = daysBeforeBillDue

        /**
         * Returns the raw JSON value of [parentAccountId].
         *
         * Unlike [parentAccountId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("parentAccountId")
        @ExcludeMissing
        fun _parentAccountId(): JsonField<String> = parentAccountId

        /**
         * Returns the raw JSON value of [purchaseOrderNumber].
         *
         * Unlike [purchaseOrderNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("purchaseOrderNumber")
        @ExcludeMissing
        fun _purchaseOrderNumber(): JsonField<String> = purchaseOrderNumber

        /**
         * Returns the raw JSON value of [statementDefinitionId].
         *
         * Unlike [statementDefinitionId], this method doesn't throw if the JSON field has an
         * unexpected type.
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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .code()
             * .emailAddress()
             * .name()
             * ```
             */
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

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /** Contact email for the Account. */
            fun emailAddress(emailAddress: String) = emailAddress(JsonField.of(emailAddress))

            /**
             * Sets [Builder.emailAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emailAddress] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun emailAddress(emailAddress: JsonField<String>) = apply {
                this.emailAddress = emailAddress
            }

            /** Name of the Account. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Contact address. */
            fun address(address: Address) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [Address] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * [AutoGenerateStatementMode] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
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
             * Sets [Builder.billEpoch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billEpoch] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billEpoch(billEpoch: JsonField<LocalDate>) = apply { this.billEpoch = billEpoch }

            /**
             * Configuration data for the Account Supported settings:
             * - SendBillsToThirdParties ("true"/"false")
             */
            fun configData(configData: ConfigData) = configData(JsonField.of(configData))

            /**
             * Sets [Builder.configData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.configData] with a well-typed [ConfigData] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.creditApplicationOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditApplicationOrder] with a well-typed
             * `List<CreditApplicationOrder>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
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
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.customFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.daysBeforeBillDue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.daysBeforeBillDue] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun daysBeforeBillDue(daysBeforeBillDue: JsonField<Long>) = apply {
                this.daysBeforeBillDue = daysBeforeBillDue
            }

            /** Parent Account ID, or null if this Account does not have a parent. */
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
             * Optional attribute - allows you to set a purchase order number that comes through
             * into invoicing. For example, your financial systems might require this as a reference
             * for clearing payments.
             */
            fun purchaseOrderNumber(purchaseOrderNumber: String) =
                purchaseOrderNumber(JsonField.of(purchaseOrderNumber))

            /**
             * Sets [Builder.purchaseOrderNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.purchaseOrderNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * Sets [Builder.statementDefinitionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statementDefinitionId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * Sets [Builder.version] to an arbitrary JSON value.
             *
             * You should usually call [Builder.version] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .code()
             * .emailAddress()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
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
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            code()
            emailAddress()
            name()
            address().ifPresent { it.validate() }
            autoGenerateStatementMode().ifPresent { it.validate() }
            billEpoch()
            configData().ifPresent { it.validate() }
            creditApplicationOrder().ifPresent { it.forEach { it.validate() } }
            currency()
            customFields().ifPresent { it.validate() }
            daysBeforeBillDue()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (code.asKnown().isPresent) 1 else 0) +
                (if (emailAddress.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (address.asKnown().getOrNull()?.validity() ?: 0) +
                (autoGenerateStatementMode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (billEpoch.asKnown().isPresent) 1 else 0) +
                (configData.asKnown().getOrNull()?.validity() ?: 0) +
                (creditApplicationOrder.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (if (currency.asKnown().isPresent) 1 else 0) +
                (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (daysBeforeBillDue.asKnown().isPresent) 1 else 0) +
                (if (parentAccountId.asKnown().isPresent) 1 else 0) +
                (if (purchaseOrderNumber.asKnown().isPresent) 1 else 0) +
                (if (statementDefinitionId.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0)

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

            return /* spotless:off */ other is AutoGenerateStatementMode && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Configuration data for the Account Supported settings:
     * - SendBillsToThirdParties ("true"/"false")
     */
    class ConfigData
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

            /** Returns a mutable builder for constructing an instance of [ConfigData]. */
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

            /**
             * Returns an immutable instance of [ConfigData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ConfigData = ConfigData(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ConfigData = apply {
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

        return /* spotless:off */ other is AccountUpdateParams && orgId == other.orgId && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AccountUpdateParams{orgId=$orgId, id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
