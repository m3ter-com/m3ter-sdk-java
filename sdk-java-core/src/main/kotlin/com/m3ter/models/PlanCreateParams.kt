// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.m3ter.core.ExcludeMissing
import com.m3ter.core.JsonField
import com.m3ter.core.JsonMissing
import com.m3ter.core.JsonValue
import com.m3ter.core.Params
import com.m3ter.core.checkRequired
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a new Plan. */
class PlanCreateParams
private constructor(
    private val orgId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    /**
     * Unique short code reference for the Plan.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun code(): String = body.code()

    /**
     * Descriptive name for the Plan.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * UUID of the PlanTemplate the Plan belongs to.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun planTemplateId(): String = body.planTemplateId()

    /**
     * *(Optional)*. Used to specify an Account for which the Plan will be a custom/bespoke Plan:
     * * Use when first creating a Plan.
     * * A custom/bespoke Plan can only be attached to the specified Account.
     * * Once created, a custom/bespoke Plan cannot be updated to be made a custom/bespoke Plan for
     *   a different Account.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountId(): Optional<String> = body.accountId()

    /**
     * TRUE/FALSE flag indicating whether the plan is a custom/bespoke Plan for a particular
     * Account:
     * * When creating a Plan, use the `accountId` request parameter to specify the Account for
     *   which the Plan will be custom/bespoke.
     * * A custom/bespoke Plan can only be attached to the specified Account.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bespoke(): Optional<Boolean> = body.bespoke()

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
     * The product minimum spend amount per billing cycle for end customer Accounts on a priced
     * Plan.
     *
     * *(Optional)*. Overrides PlanTemplate value.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minimumSpend(): Optional<Double> = body.minimumSpend()

    /**
     * Optional Product ID this plan's minimum spend should be attributed to for accounting purposes
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minimumSpendAccountingProductId(): Optional<String> = body.minimumSpendAccountingProductId()

    /**
     * When TRUE, minimum spend is billed at the start of each billing period.
     *
     * When FALSE, minimum spend is billed at the end of each billing period.
     *
     * *(Optional)*. Overrides the setting at PlanTemplate level for minimum spend billing in
     * arrears/in advance.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minimumSpendBillInAdvance(): Optional<Boolean> = body.minimumSpendBillInAdvance()

    /**
     * Minimum spend description *(displayed on the bill line item)*.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minimumSpendDescription(): Optional<String> = body.minimumSpendDescription()

    /**
     * Assigns a rank or position to the Plan in your order of pricing plans - lower numbers
     * represent more basic pricing plans; higher numbers represent more premium pricing plans.
     *
     * *(Optional)*. Overrides PlanTemplate value.
     *
     * **NOTE: DEPRECATED** - do not use.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ordinal(): Optional<Long> = body.ordinal()

    /**
     * The standing charge applied to bills for end customers. This is prorated.
     *
     * *(Optional)*. Overrides PlanTemplate value.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun standingCharge(): Optional<Double> = body.standingCharge()

    /**
     * Optional Product ID this plan's standing charge should be attributed to for accounting
     * purposes
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun standingChargeAccountingProductId(): Optional<String> =
        body.standingChargeAccountingProductId()

    /**
     * When TRUE, standing charge is billed at the start of each billing period.
     *
     * When FALSE, standing charge is billed at the end of each billing period.
     *
     * *(Optional)*. Overrides the setting at PlanTemplate level for standing charge billing in
     * arrears/in advance.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun standingChargeBillInAdvance(): Optional<Boolean> = body.standingChargeBillInAdvance()

    /**
     * Standing charge description *(displayed on the bill line item)*.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun standingChargeDescription(): Optional<String> = body.standingChargeDescription()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - *do not use for Create*.
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
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [planTemplateId].
     *
     * Unlike [planTemplateId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _planTemplateId(): JsonField<String> = body._planTemplateId()

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountId(): JsonField<String> = body._accountId()

    /**
     * Returns the raw JSON value of [bespoke].
     *
     * Unlike [bespoke], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bespoke(): JsonField<Boolean> = body._bespoke()

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customFields(): JsonField<CustomFields> = body._customFields()

    /**
     * Returns the raw JSON value of [minimumSpend].
     *
     * Unlike [minimumSpend], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _minimumSpend(): JsonField<Double> = body._minimumSpend()

    /**
     * Returns the raw JSON value of [minimumSpendAccountingProductId].
     *
     * Unlike [minimumSpendAccountingProductId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _minimumSpendAccountingProductId(): JsonField<String> =
        body._minimumSpendAccountingProductId()

    /**
     * Returns the raw JSON value of [minimumSpendBillInAdvance].
     *
     * Unlike [minimumSpendBillInAdvance], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _minimumSpendBillInAdvance(): JsonField<Boolean> = body._minimumSpendBillInAdvance()

    /**
     * Returns the raw JSON value of [minimumSpendDescription].
     *
     * Unlike [minimumSpendDescription], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _minimumSpendDescription(): JsonField<String> = body._minimumSpendDescription()

    /**
     * Returns the raw JSON value of [ordinal].
     *
     * Unlike [ordinal], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ordinal(): JsonField<Long> = body._ordinal()

    /**
     * Returns the raw JSON value of [standingCharge].
     *
     * Unlike [standingCharge], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _standingCharge(): JsonField<Double> = body._standingCharge()

    /**
     * Returns the raw JSON value of [standingChargeAccountingProductId].
     *
     * Unlike [standingChargeAccountingProductId], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    fun _standingChargeAccountingProductId(): JsonField<String> =
        body._standingChargeAccountingProductId()

    /**
     * Returns the raw JSON value of [standingChargeBillInAdvance].
     *
     * Unlike [standingChargeBillInAdvance], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _standingChargeBillInAdvance(): JsonField<Boolean> = body._standingChargeBillInAdvance()

    /**
     * Returns the raw JSON value of [standingChargeDescription].
     *
     * Unlike [standingChargeDescription], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _standingChargeDescription(): JsonField<String> = body._standingChargeDescription()

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _version(): JsonField<Long> = body._version()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanCreateParams].
         *
         * The following fields are required:
         * ```java
         * .code()
         * .name()
         * .planTemplateId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PlanCreateParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(planCreateParams: PlanCreateParams) = apply {
            orgId = planCreateParams.orgId
            body = planCreateParams.body.toBuilder()
            additionalHeaders = planCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = planCreateParams.additionalQueryParams.toBuilder()
        }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [code]
         * - [name]
         * - [planTemplateId]
         * - [accountId]
         * - [bespoke]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Unique short code reference for the Plan. */
        fun code(code: String) = apply { body.code(code) }

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { body.code(code) }

        /** Descriptive name for the Plan. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** UUID of the PlanTemplate the Plan belongs to. */
        fun planTemplateId(planTemplateId: String) = apply { body.planTemplateId(planTemplateId) }

        /**
         * Sets [Builder.planTemplateId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planTemplateId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun planTemplateId(planTemplateId: JsonField<String>) = apply {
            body.planTemplateId(planTemplateId)
        }

        /**
         * *(Optional)*. Used to specify an Account for which the Plan will be a custom/bespoke
         * Plan:
         * * Use when first creating a Plan.
         * * A custom/bespoke Plan can only be attached to the specified Account.
         * * Once created, a custom/bespoke Plan cannot be updated to be made a custom/bespoke Plan
         *   for a different Account.
         */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { body.accountId(accountId) }

        /**
         * TRUE/FALSE flag indicating whether the plan is a custom/bespoke Plan for a particular
         * Account:
         * * When creating a Plan, use the `accountId` request parameter to specify the Account for
         *   which the Plan will be custom/bespoke.
         * * A custom/bespoke Plan can only be attached to the specified Account.
         */
        fun bespoke(bespoke: Boolean) = apply { body.bespoke(bespoke) }

        /**
         * Sets [Builder.bespoke] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bespoke] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bespoke(bespoke: JsonField<Boolean>) = apply { body.bespoke(bespoke) }

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
         * The product minimum spend amount per billing cycle for end customer Accounts on a priced
         * Plan.
         *
         * *(Optional)*. Overrides PlanTemplate value.
         */
        fun minimumSpend(minimumSpend: Double) = apply { body.minimumSpend(minimumSpend) }

        /**
         * Sets [Builder.minimumSpend] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimumSpend] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minimumSpend(minimumSpend: JsonField<Double>) = apply {
            body.minimumSpend(minimumSpend)
        }

        /**
         * Optional Product ID this plan's minimum spend should be attributed to for accounting
         * purposes
         */
        fun minimumSpendAccountingProductId(minimumSpendAccountingProductId: String) = apply {
            body.minimumSpendAccountingProductId(minimumSpendAccountingProductId)
        }

        /**
         * Sets [Builder.minimumSpendAccountingProductId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimumSpendAccountingProductId] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun minimumSpendAccountingProductId(minimumSpendAccountingProductId: JsonField<String>) =
            apply {
                body.minimumSpendAccountingProductId(minimumSpendAccountingProductId)
            }

        /**
         * When TRUE, minimum spend is billed at the start of each billing period.
         *
         * When FALSE, minimum spend is billed at the end of each billing period.
         *
         * *(Optional)*. Overrides the setting at PlanTemplate level for minimum spend billing in
         * arrears/in advance.
         */
        fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: Boolean) = apply {
            body.minimumSpendBillInAdvance(minimumSpendBillInAdvance)
        }

        /**
         * Sets [Builder.minimumSpendBillInAdvance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimumSpendBillInAdvance] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: JsonField<Boolean>) = apply {
            body.minimumSpendBillInAdvance(minimumSpendBillInAdvance)
        }

        /** Minimum spend description *(displayed on the bill line item)*. */
        fun minimumSpendDescription(minimumSpendDescription: String) = apply {
            body.minimumSpendDescription(minimumSpendDescription)
        }

        /**
         * Sets [Builder.minimumSpendDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimumSpendDescription] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun minimumSpendDescription(minimumSpendDescription: JsonField<String>) = apply {
            body.minimumSpendDescription(minimumSpendDescription)
        }

        /**
         * Assigns a rank or position to the Plan in your order of pricing plans - lower numbers
         * represent more basic pricing plans; higher numbers represent more premium pricing plans.
         *
         * *(Optional)*. Overrides PlanTemplate value.
         *
         * **NOTE: DEPRECATED** - do not use.
         */
        fun ordinal(ordinal: Long) = apply { body.ordinal(ordinal) }

        /**
         * Sets [Builder.ordinal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ordinal] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ordinal(ordinal: JsonField<Long>) = apply { body.ordinal(ordinal) }

        /**
         * The standing charge applied to bills for end customers. This is prorated.
         *
         * *(Optional)*. Overrides PlanTemplate value.
         */
        fun standingCharge(standingCharge: Double) = apply { body.standingCharge(standingCharge) }

        /**
         * Sets [Builder.standingCharge] to an arbitrary JSON value.
         *
         * You should usually call [Builder.standingCharge] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun standingCharge(standingCharge: JsonField<Double>) = apply {
            body.standingCharge(standingCharge)
        }

        /**
         * Optional Product ID this plan's standing charge should be attributed to for accounting
         * purposes
         */
        fun standingChargeAccountingProductId(standingChargeAccountingProductId: String) = apply {
            body.standingChargeAccountingProductId(standingChargeAccountingProductId)
        }

        /**
         * Sets [Builder.standingChargeAccountingProductId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.standingChargeAccountingProductId] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun standingChargeAccountingProductId(
            standingChargeAccountingProductId: JsonField<String>
        ) = apply { body.standingChargeAccountingProductId(standingChargeAccountingProductId) }

        /**
         * When TRUE, standing charge is billed at the start of each billing period.
         *
         * When FALSE, standing charge is billed at the end of each billing period.
         *
         * *(Optional)*. Overrides the setting at PlanTemplate level for standing charge billing in
         * arrears/in advance.
         */
        fun standingChargeBillInAdvance(standingChargeBillInAdvance: Boolean) = apply {
            body.standingChargeBillInAdvance(standingChargeBillInAdvance)
        }

        /**
         * Sets [Builder.standingChargeBillInAdvance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.standingChargeBillInAdvance] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun standingChargeBillInAdvance(standingChargeBillInAdvance: JsonField<Boolean>) = apply {
            body.standingChargeBillInAdvance(standingChargeBillInAdvance)
        }

        /** Standing charge description *(displayed on the bill line item)*. */
        fun standingChargeDescription(standingChargeDescription: String) = apply {
            body.standingChargeDescription(standingChargeDescription)
        }

        /**
         * Sets [Builder.standingChargeDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.standingChargeDescription] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun standingChargeDescription(standingChargeDescription: JsonField<String>) = apply {
            body.standingChargeDescription(standingChargeDescription)
        }

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - *do not use for
         *   Create*. On initial Create, version is set at 1 and listed in the response.
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
         * Returns an immutable instance of [PlanCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .code()
         * .name()
         * .planTemplateId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PlanCreateParams =
            PlanCreateParams(
                orgId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val code: JsonField<String>,
        private val name: JsonField<String>,
        private val planTemplateId: JsonField<String>,
        private val accountId: JsonField<String>,
        private val bespoke: JsonField<Boolean>,
        private val customFields: JsonField<CustomFields>,
        private val minimumSpend: JsonField<Double>,
        private val minimumSpendAccountingProductId: JsonField<String>,
        private val minimumSpendBillInAdvance: JsonField<Boolean>,
        private val minimumSpendDescription: JsonField<String>,
        private val ordinal: JsonField<Long>,
        private val standingCharge: JsonField<Double>,
        private val standingChargeAccountingProductId: JsonField<String>,
        private val standingChargeBillInAdvance: JsonField<Boolean>,
        private val standingChargeDescription: JsonField<String>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("planTemplateId")
            @ExcludeMissing
            planTemplateId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("accountId")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("bespoke") @ExcludeMissing bespoke: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("customFields")
            @ExcludeMissing
            customFields: JsonField<CustomFields> = JsonMissing.of(),
            @JsonProperty("minimumSpend")
            @ExcludeMissing
            minimumSpend: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("minimumSpendAccountingProductId")
            @ExcludeMissing
            minimumSpendAccountingProductId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("minimumSpendBillInAdvance")
            @ExcludeMissing
            minimumSpendBillInAdvance: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("minimumSpendDescription")
            @ExcludeMissing
            minimumSpendDescription: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ordinal") @ExcludeMissing ordinal: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("standingCharge")
            @ExcludeMissing
            standingCharge: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("standingChargeAccountingProductId")
            @ExcludeMissing
            standingChargeAccountingProductId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("standingChargeBillInAdvance")
            @ExcludeMissing
            standingChargeBillInAdvance: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("standingChargeDescription")
            @ExcludeMissing
            standingChargeDescription: JsonField<String> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(
            code,
            name,
            planTemplateId,
            accountId,
            bespoke,
            customFields,
            minimumSpend,
            minimumSpendAccountingProductId,
            minimumSpendBillInAdvance,
            minimumSpendDescription,
            ordinal,
            standingCharge,
            standingChargeAccountingProductId,
            standingChargeBillInAdvance,
            standingChargeDescription,
            version,
            mutableMapOf(),
        )

        /**
         * Unique short code reference for the Plan.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun code(): String = code.getRequired("code")

        /**
         * Descriptive name for the Plan.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * UUID of the PlanTemplate the Plan belongs to.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun planTemplateId(): String = planTemplateId.getRequired("planTemplateId")

        /**
         * *(Optional)*. Used to specify an Account for which the Plan will be a custom/bespoke
         * Plan:
         * * Use when first creating a Plan.
         * * A custom/bespoke Plan can only be attached to the specified Account.
         * * Once created, a custom/bespoke Plan cannot be updated to be made a custom/bespoke Plan
         *   for a different Account.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountId(): Optional<String> = accountId.getOptional("accountId")

        /**
         * TRUE/FALSE flag indicating whether the plan is a custom/bespoke Plan for a particular
         * Account:
         * * When creating a Plan, use the `accountId` request parameter to specify the Account for
         *   which the Plan will be custom/bespoke.
         * * A custom/bespoke Plan can only be attached to the specified Account.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bespoke(): Optional<Boolean> = bespoke.getOptional("bespoke")

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
        fun customFields(): Optional<CustomFields> = customFields.getOptional("customFields")

        /**
         * The product minimum spend amount per billing cycle for end customer Accounts on a priced
         * Plan.
         *
         * *(Optional)*. Overrides PlanTemplate value.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minimumSpend(): Optional<Double> = minimumSpend.getOptional("minimumSpend")

        /**
         * Optional Product ID this plan's minimum spend should be attributed to for accounting
         * purposes
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minimumSpendAccountingProductId(): Optional<String> =
            minimumSpendAccountingProductId.getOptional("minimumSpendAccountingProductId")

        /**
         * When TRUE, minimum spend is billed at the start of each billing period.
         *
         * When FALSE, minimum spend is billed at the end of each billing period.
         *
         * *(Optional)*. Overrides the setting at PlanTemplate level for minimum spend billing in
         * arrears/in advance.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minimumSpendBillInAdvance(): Optional<Boolean> =
            minimumSpendBillInAdvance.getOptional("minimumSpendBillInAdvance")

        /**
         * Minimum spend description *(displayed on the bill line item)*.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minimumSpendDescription(): Optional<String> =
            minimumSpendDescription.getOptional("minimumSpendDescription")

        /**
         * Assigns a rank or position to the Plan in your order of pricing plans - lower numbers
         * represent more basic pricing plans; higher numbers represent more premium pricing plans.
         *
         * *(Optional)*. Overrides PlanTemplate value.
         *
         * **NOTE: DEPRECATED** - do not use.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ordinal(): Optional<Long> = ordinal.getOptional("ordinal")

        /**
         * The standing charge applied to bills for end customers. This is prorated.
         *
         * *(Optional)*. Overrides PlanTemplate value.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun standingCharge(): Optional<Double> = standingCharge.getOptional("standingCharge")

        /**
         * Optional Product ID this plan's standing charge should be attributed to for accounting
         * purposes
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun standingChargeAccountingProductId(): Optional<String> =
            standingChargeAccountingProductId.getOptional("standingChargeAccountingProductId")

        /**
         * When TRUE, standing charge is billed at the start of each billing period.
         *
         * When FALSE, standing charge is billed at the end of each billing period.
         *
         * *(Optional)*. Overrides the setting at PlanTemplate level for standing charge billing in
         * arrears/in advance.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun standingChargeBillInAdvance(): Optional<Boolean> =
            standingChargeBillInAdvance.getOptional("standingChargeBillInAdvance")

        /**
         * Standing charge description *(displayed on the bill line item)*.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun standingChargeDescription(): Optional<String> =
            standingChargeDescription.getOptional("standingChargeDescription")

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - *do not use for
         *   Create*. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun version(): Optional<Long> = version.getOptional("version")

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [planTemplateId].
         *
         * Unlike [planTemplateId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("planTemplateId")
        @ExcludeMissing
        fun _planTemplateId(): JsonField<String> = planTemplateId

        /**
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * Returns the raw JSON value of [bespoke].
         *
         * Unlike [bespoke], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bespoke") @ExcludeMissing fun _bespoke(): JsonField<Boolean> = bespoke

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
         * Returns the raw JSON value of [minimumSpend].
         *
         * Unlike [minimumSpend], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("minimumSpend")
        @ExcludeMissing
        fun _minimumSpend(): JsonField<Double> = minimumSpend

        /**
         * Returns the raw JSON value of [minimumSpendAccountingProductId].
         *
         * Unlike [minimumSpendAccountingProductId], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("minimumSpendAccountingProductId")
        @ExcludeMissing
        fun _minimumSpendAccountingProductId(): JsonField<String> = minimumSpendAccountingProductId

        /**
         * Returns the raw JSON value of [minimumSpendBillInAdvance].
         *
         * Unlike [minimumSpendBillInAdvance], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("minimumSpendBillInAdvance")
        @ExcludeMissing
        fun _minimumSpendBillInAdvance(): JsonField<Boolean> = minimumSpendBillInAdvance

        /**
         * Returns the raw JSON value of [minimumSpendDescription].
         *
         * Unlike [minimumSpendDescription], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("minimumSpendDescription")
        @ExcludeMissing
        fun _minimumSpendDescription(): JsonField<String> = minimumSpendDescription

        /**
         * Returns the raw JSON value of [ordinal].
         *
         * Unlike [ordinal], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ordinal") @ExcludeMissing fun _ordinal(): JsonField<Long> = ordinal

        /**
         * Returns the raw JSON value of [standingCharge].
         *
         * Unlike [standingCharge], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("standingCharge")
        @ExcludeMissing
        fun _standingCharge(): JsonField<Double> = standingCharge

        /**
         * Returns the raw JSON value of [standingChargeAccountingProductId].
         *
         * Unlike [standingChargeAccountingProductId], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("standingChargeAccountingProductId")
        @ExcludeMissing
        fun _standingChargeAccountingProductId(): JsonField<String> =
            standingChargeAccountingProductId

        /**
         * Returns the raw JSON value of [standingChargeBillInAdvance].
         *
         * Unlike [standingChargeBillInAdvance], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("standingChargeBillInAdvance")
        @ExcludeMissing
        fun _standingChargeBillInAdvance(): JsonField<Boolean> = standingChargeBillInAdvance

        /**
         * Returns the raw JSON value of [standingChargeDescription].
         *
         * Unlike [standingChargeDescription], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("standingChargeDescription")
        @ExcludeMissing
        fun _standingChargeDescription(): JsonField<String> = standingChargeDescription

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
             * .name()
             * .planTemplateId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var code: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var planTemplateId: JsonField<String>? = null
            private var accountId: JsonField<String> = JsonMissing.of()
            private var bespoke: JsonField<Boolean> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var minimumSpend: JsonField<Double> = JsonMissing.of()
            private var minimumSpendAccountingProductId: JsonField<String> = JsonMissing.of()
            private var minimumSpendBillInAdvance: JsonField<Boolean> = JsonMissing.of()
            private var minimumSpendDescription: JsonField<String> = JsonMissing.of()
            private var ordinal: JsonField<Long> = JsonMissing.of()
            private var standingCharge: JsonField<Double> = JsonMissing.of()
            private var standingChargeAccountingProductId: JsonField<String> = JsonMissing.of()
            private var standingChargeBillInAdvance: JsonField<Boolean> = JsonMissing.of()
            private var standingChargeDescription: JsonField<String> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                code = body.code
                name = body.name
                planTemplateId = body.planTemplateId
                accountId = body.accountId
                bespoke = body.bespoke
                customFields = body.customFields
                minimumSpend = body.minimumSpend
                minimumSpendAccountingProductId = body.minimumSpendAccountingProductId
                minimumSpendBillInAdvance = body.minimumSpendBillInAdvance
                minimumSpendDescription = body.minimumSpendDescription
                ordinal = body.ordinal
                standingCharge = body.standingCharge
                standingChargeAccountingProductId = body.standingChargeAccountingProductId
                standingChargeBillInAdvance = body.standingChargeBillInAdvance
                standingChargeDescription = body.standingChargeDescription
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Unique short code reference for the Plan. */
            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /** Descriptive name for the Plan. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** UUID of the PlanTemplate the Plan belongs to. */
            fun planTemplateId(planTemplateId: String) =
                planTemplateId(JsonField.of(planTemplateId))

            /**
             * Sets [Builder.planTemplateId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planTemplateId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planTemplateId(planTemplateId: JsonField<String>) = apply {
                this.planTemplateId = planTemplateId
            }

            /**
             * *(Optional)*. Used to specify an Account for which the Plan will be a custom/bespoke
             * Plan:
             * * Use when first creating a Plan.
             * * A custom/bespoke Plan can only be attached to the specified Account.
             * * Once created, a custom/bespoke Plan cannot be updated to be made a custom/bespoke
             *   Plan for a different Account.
             */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /**
             * TRUE/FALSE flag indicating whether the plan is a custom/bespoke Plan for a particular
             * Account:
             * * When creating a Plan, use the `accountId` request parameter to specify the Account
             *   for which the Plan will be custom/bespoke.
             * * A custom/bespoke Plan can only be attached to the specified Account.
             */
            fun bespoke(bespoke: Boolean) = bespoke(JsonField.of(bespoke))

            /**
             * Sets [Builder.bespoke] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bespoke] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bespoke(bespoke: JsonField<Boolean>) = apply { this.bespoke = bespoke }

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
             * The product minimum spend amount per billing cycle for end customer Accounts on a
             * priced Plan.
             *
             * *(Optional)*. Overrides PlanTemplate value.
             */
            fun minimumSpend(minimumSpend: Double) = minimumSpend(JsonField.of(minimumSpend))

            /**
             * Sets [Builder.minimumSpend] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimumSpend] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.minimumSpendAccountingProductId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimumSpendAccountingProductId] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun minimumSpendAccountingProductId(
                minimumSpendAccountingProductId: JsonField<String>
            ) = apply { this.minimumSpendAccountingProductId = minimumSpendAccountingProductId }

            /**
             * When TRUE, minimum spend is billed at the start of each billing period.
             *
             * When FALSE, minimum spend is billed at the end of each billing period.
             *
             * *(Optional)*. Overrides the setting at PlanTemplate level for minimum spend billing
             * in arrears/in advance.
             */
            fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: Boolean) =
                minimumSpendBillInAdvance(JsonField.of(minimumSpendBillInAdvance))

            /**
             * Sets [Builder.minimumSpendBillInAdvance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimumSpendBillInAdvance] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun minimumSpendBillInAdvance(minimumSpendBillInAdvance: JsonField<Boolean>) = apply {
                this.minimumSpendBillInAdvance = minimumSpendBillInAdvance
            }

            /** Minimum spend description *(displayed on the bill line item)*. */
            fun minimumSpendDescription(minimumSpendDescription: String) =
                minimumSpendDescription(JsonField.of(minimumSpendDescription))

            /**
             * Sets [Builder.minimumSpendDescription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimumSpendDescription] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun minimumSpendDescription(minimumSpendDescription: JsonField<String>) = apply {
                this.minimumSpendDescription = minimumSpendDescription
            }

            /**
             * Assigns a rank or position to the Plan in your order of pricing plans - lower numbers
             * represent more basic pricing plans; higher numbers represent more premium pricing
             * plans.
             *
             * *(Optional)*. Overrides PlanTemplate value.
             *
             * **NOTE: DEPRECATED** - do not use.
             */
            fun ordinal(ordinal: Long) = ordinal(JsonField.of(ordinal))

            /**
             * Sets [Builder.ordinal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ordinal] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ordinal(ordinal: JsonField<Long>) = apply { this.ordinal = ordinal }

            /**
             * The standing charge applied to bills for end customers. This is prorated.
             *
             * *(Optional)*. Overrides PlanTemplate value.
             */
            fun standingCharge(standingCharge: Double) =
                standingCharge(JsonField.of(standingCharge))

            /**
             * Sets [Builder.standingCharge] to an arbitrary JSON value.
             *
             * You should usually call [Builder.standingCharge] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun standingCharge(standingCharge: JsonField<Double>) = apply {
                this.standingCharge = standingCharge
            }

            /**
             * Optional Product ID this plan's standing charge should be attributed to for
             * accounting purposes
             */
            fun standingChargeAccountingProductId(standingChargeAccountingProductId: String) =
                standingChargeAccountingProductId(JsonField.of(standingChargeAccountingProductId))

            /**
             * Sets [Builder.standingChargeAccountingProductId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.standingChargeAccountingProductId] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun standingChargeAccountingProductId(
                standingChargeAccountingProductId: JsonField<String>
            ) = apply { this.standingChargeAccountingProductId = standingChargeAccountingProductId }

            /**
             * When TRUE, standing charge is billed at the start of each billing period.
             *
             * When FALSE, standing charge is billed at the end of each billing period.
             *
             * *(Optional)*. Overrides the setting at PlanTemplate level for standing charge billing
             * in arrears/in advance.
             */
            fun standingChargeBillInAdvance(standingChargeBillInAdvance: Boolean) =
                standingChargeBillInAdvance(JsonField.of(standingChargeBillInAdvance))

            /**
             * Sets [Builder.standingChargeBillInAdvance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.standingChargeBillInAdvance] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun standingChargeBillInAdvance(standingChargeBillInAdvance: JsonField<Boolean>) =
                apply {
                    this.standingChargeBillInAdvance = standingChargeBillInAdvance
                }

            /** Standing charge description *(displayed on the bill line item)*. */
            fun standingChargeDescription(standingChargeDescription: String) =
                standingChargeDescription(JsonField.of(standingChargeDescription))

            /**
             * Sets [Builder.standingChargeDescription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.standingChargeDescription] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun standingChargeDescription(standingChargeDescription: JsonField<String>) = apply {
                this.standingChargeDescription = standingChargeDescription
            }

            /**
             * The version number of the entity:
             * - **Create entity:** Not valid for initial insertion of new entity - *do not use for
             *   Create*. On initial Create, version is set at 1 and listed in the response.
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
             * .name()
             * .planTemplateId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("code", code),
                    checkRequired("name", name),
                    checkRequired("planTemplateId", planTemplateId),
                    accountId,
                    bespoke,
                    customFields,
                    minimumSpend,
                    minimumSpendAccountingProductId,
                    minimumSpendBillInAdvance,
                    minimumSpendDescription,
                    ordinal,
                    standingCharge,
                    standingChargeAccountingProductId,
                    standingChargeBillInAdvance,
                    standingChargeDescription,
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
            name()
            planTemplateId()
            accountId()
            bespoke()
            customFields().ifPresent { it.validate() }
            minimumSpend()
            minimumSpendAccountingProductId()
            minimumSpendBillInAdvance()
            minimumSpendDescription()
            ordinal()
            standingCharge()
            standingChargeAccountingProductId()
            standingChargeBillInAdvance()
            standingChargeDescription()
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
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (planTemplateId.asKnown().isPresent) 1 else 0) +
                (if (accountId.asKnown().isPresent) 1 else 0) +
                (if (bespoke.asKnown().isPresent) 1 else 0) +
                (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (minimumSpend.asKnown().isPresent) 1 else 0) +
                (if (minimumSpendAccountingProductId.asKnown().isPresent) 1 else 0) +
                (if (minimumSpendBillInAdvance.asKnown().isPresent) 1 else 0) +
                (if (minimumSpendDescription.asKnown().isPresent) 1 else 0) +
                (if (ordinal.asKnown().isPresent) 1 else 0) +
                (if (standingCharge.asKnown().isPresent) 1 else 0) +
                (if (standingChargeAccountingProductId.asKnown().isPresent) 1 else 0) +
                (if (standingChargeBillInAdvance.asKnown().isPresent) 1 else 0) +
                (if (standingChargeDescription.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                code == other.code &&
                name == other.name &&
                planTemplateId == other.planTemplateId &&
                accountId == other.accountId &&
                bespoke == other.bespoke &&
                customFields == other.customFields &&
                minimumSpend == other.minimumSpend &&
                minimumSpendAccountingProductId == other.minimumSpendAccountingProductId &&
                minimumSpendBillInAdvance == other.minimumSpendBillInAdvance &&
                minimumSpendDescription == other.minimumSpendDescription &&
                ordinal == other.ordinal &&
                standingCharge == other.standingCharge &&
                standingChargeAccountingProductId == other.standingChargeAccountingProductId &&
                standingChargeBillInAdvance == other.standingChargeBillInAdvance &&
                standingChargeDescription == other.standingChargeDescription &&
                version == other.version &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                code,
                name,
                planTemplateId,
                accountId,
                bespoke,
                customFields,
                minimumSpend,
                minimumSpendAccountingProductId,
                minimumSpendBillInAdvance,
                minimumSpendDescription,
                ordinal,
                standingCharge,
                standingChargeAccountingProductId,
                standingChargeBillInAdvance,
                standingChargeDescription,
                version,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{code=$code, name=$name, planTemplateId=$planTemplateId, accountId=$accountId, bespoke=$bespoke, customFields=$customFields, minimumSpend=$minimumSpend, minimumSpendAccountingProductId=$minimumSpendAccountingProductId, minimumSpendBillInAdvance=$minimumSpendBillInAdvance, minimumSpendDescription=$minimumSpendDescription, ordinal=$ordinal, standingCharge=$standingCharge, standingChargeAccountingProductId=$standingChargeAccountingProductId, standingChargeBillInAdvance=$standingChargeBillInAdvance, standingChargeDescription=$standingChargeDescription, version=$version, additionalProperties=$additionalProperties}"
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

        return other is PlanCreateParams &&
            orgId == other.orgId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(orgId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PlanCreateParams{orgId=$orgId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
