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
class AccountPlan
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("accountId")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("billEpoch")
    @ExcludeMissing
    private val billEpoch: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("childBillingMode")
    @ExcludeMissing
    private val childBillingMode: JsonField<ChildBillingMode> = JsonMissing.of(),
    @JsonProperty("code") @ExcludeMissing private val code: JsonField<String> = JsonMissing.of(),
    @JsonProperty("contractId")
    @ExcludeMissing
    private val contractId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("createdBy")
    @ExcludeMissing
    private val createdBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("customFields")
    @ExcludeMissing
    private val customFields: JsonField<CustomFields> = JsonMissing.of(),
    @JsonProperty("dtCreated")
    @ExcludeMissing
    private val dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    private val dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("endDate")
    @ExcludeMissing
    private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    private val lastModifiedBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("planGroupId")
    @ExcludeMissing
    private val planGroupId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("planId")
    @ExcludeMissing
    private val planId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("productId")
    @ExcludeMissing
    private val productId: JsonField<String> = JsonMissing.of(),
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

    /**
     * The unique identifier (UUID) for the Account to which the AccountPlan or AccounPlanGroup is
     * attached.
     */
    fun accountId(): Optional<String> = Optional.ofNullable(accountId.getNullable("accountId"))

    /**
     * The initial date for creating the first bill against the Account for charges due under the
     * AccountPlan or AccountPlanGroup. All subsequent bill creation dates are calculated from this
     * date. If left empty, the first bill date definedfor the Account is used. The date is in
     * ISO-8601 format.
     */
    fun billEpoch(): Optional<LocalDate> = Optional.ofNullable(billEpoch.getNullable("billEpoch"))

    /**
     * If the Account is either a Parent or a Child Account, this specifies the Account hierarchy
     * billing mode. The mode determines how billing will be handled and shown on bills for charges
     * due on the Parent Account, and charges due on Child Accounts:
     * - **Parent Breakdown** - a separate bill line item per Account. Default setting.
     * - **Parent Summary** - single bill line item for all Accounts.
     * - **Child** - the Child Account is billed.
     */
    fun childBillingMode(): Optional<ChildBillingMode> =
        Optional.ofNullable(childBillingMode.getNullable("childBillingMode"))

    /** The unique short code of the AccountPlan or AccountPlanGroup. */
    fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

    /**
     * The unique identifier (UUID) for the Contract to which the Plan or Plan Group attached to the
     * Account has been added.
     */
    fun contractId(): Optional<String> = Optional.ofNullable(contractId.getNullable("contractId"))

    /**
     * The unique identifier (UUID) for the user who created the AccountPlan or AccountPlanGroup.
     */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

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

    /**
     * The date and time _(in ISO 8601 format)_ when the AccountPlan or AccountPlanGroup was first
     * created.
     */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /**
     * The date and time _(in ISO 8601 format)_ when the AccountPlan or AccountPlanGroup was last
     * modified.
     */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /**
     * The end date _(in ISO-8601 format)_ for when the AccountPlan or AccountPlanGroup ceases to be
     * active for the Account. If not specified, the AccountPlan or AccountPlanGroup remains active
     * indefinitely.
     */
    fun endDate(): Optional<OffsetDateTime> = Optional.ofNullable(endDate.getNullable("endDate"))

    /**
     * The unique identifier (UUID) for the user who last modified the AccountPlan or
     * AccountPlanGroup.
     */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /**
     * The unique identifier (UUID) of the Plan Group that has been attached to the Account to
     * create the AccountPlanGroup.
     */
    fun planGroupId(): Optional<String> =
        Optional.ofNullable(planGroupId.getNullable("planGroupId"))

    /**
     * The unique identifier (UUID) of the Plan that has been attached to the Account to create the
     * AccountPlan.
     */
    fun planId(): Optional<String> = Optional.ofNullable(planId.getNullable("planId"))

    /**
     * The unique identifier (UUID) for the Product associated with the AccountPlan.
     *
     * **Note:** Not present in response for AccountPlanGroup - Plan Groups can contain multiple
     * Plans belonging to different Products.
     */
    fun productId(): Optional<String> = Optional.ofNullable(productId.getNullable("productId"))

    /**
     * The start date _(in ISO-8601 format)_ for the when the AccountPlan or AccountPlanGroup starts
     * to be active for the Account.
     */
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

    /**
     * The unique identifier (UUID) for the Account to which the AccountPlan or AccounPlanGroup is
     * attached.
     */
    @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * The initial date for creating the first bill against the Account for charges due under the
     * AccountPlan or AccountPlanGroup. All subsequent bill creation dates are calculated from this
     * date. If left empty, the first bill date definedfor the Account is used. The date is in
     * ISO-8601 format.
     */
    @JsonProperty("billEpoch") @ExcludeMissing fun _billEpoch(): JsonField<LocalDate> = billEpoch

    /**
     * If the Account is either a Parent or a Child Account, this specifies the Account hierarchy
     * billing mode. The mode determines how billing will be handled and shown on bills for charges
     * due on the Parent Account, and charges due on Child Accounts:
     * - **Parent Breakdown** - a separate bill line item per Account. Default setting.
     * - **Parent Summary** - single bill line item for all Accounts.
     * - **Child** - the Child Account is billed.
     */
    @JsonProperty("childBillingMode")
    @ExcludeMissing
    fun _childBillingMode(): JsonField<ChildBillingMode> = childBillingMode

    /** The unique short code of the AccountPlan or AccountPlanGroup. */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /**
     * The unique identifier (UUID) for the Contract to which the Plan or Plan Group attached to the
     * Account has been added.
     */
    @JsonProperty("contractId") @ExcludeMissing fun _contractId(): JsonField<String> = contractId

    /**
     * The unique identifier (UUID) for the user who created the AccountPlan or AccountPlanGroup.
     */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

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

    /**
     * The date and time _(in ISO 8601 format)_ when the AccountPlan or AccountPlanGroup was first
     * created.
     */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /**
     * The date and time _(in ISO 8601 format)_ when the AccountPlan or AccountPlanGroup was last
     * modified.
     */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /**
     * The end date _(in ISO-8601 format)_ for when the AccountPlan or AccountPlanGroup ceases to be
     * active for the Account. If not specified, the AccountPlan or AccountPlanGroup remains active
     * indefinitely.
     */
    @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    /**
     * The unique identifier (UUID) for the user who last modified the AccountPlan or
     * AccountPlanGroup.
     */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /**
     * The unique identifier (UUID) of the Plan Group that has been attached to the Account to
     * create the AccountPlanGroup.
     */
    @JsonProperty("planGroupId") @ExcludeMissing fun _planGroupId(): JsonField<String> = planGroupId

    /**
     * The unique identifier (UUID) of the Plan that has been attached to the Account to create the
     * AccountPlan.
     */
    @JsonProperty("planId") @ExcludeMissing fun _planId(): JsonField<String> = planId

    /**
     * The unique identifier (UUID) for the Product associated with the AccountPlan.
     *
     * **Note:** Not present in response for AccountPlanGroup - Plan Groups can contain multiple
     * Plans belonging to different Products.
     */
    @JsonProperty("productId") @ExcludeMissing fun _productId(): JsonField<String> = productId

    /**
     * The start date _(in ISO-8601 format)_ for the when the AccountPlan or AccountPlanGroup starts
     * to be active for the Account.
     */
    @JsonProperty("startDate")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AccountPlan = apply {
        if (validated) {
            return@apply
        }

        id()
        version()
        accountId()
        billEpoch()
        childBillingMode()
        code()
        contractId()
        createdBy()
        customFields().ifPresent { it.validate() }
        dtCreated()
        dtLastModified()
        endDate()
        lastModifiedBy()
        planGroupId()
        planId()
        productId()
        startDate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountPlan]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var accountId: JsonField<String> = JsonMissing.of()
        private var billEpoch: JsonField<LocalDate> = JsonMissing.of()
        private var childBillingMode: JsonField<ChildBillingMode> = JsonMissing.of()
        private var code: JsonField<String> = JsonMissing.of()
        private var contractId: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var planGroupId: JsonField<String> = JsonMissing.of()
        private var planId: JsonField<String> = JsonMissing.of()
        private var productId: JsonField<String> = JsonMissing.of()
        private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountPlan: AccountPlan) = apply {
            id = accountPlan.id
            version = accountPlan.version
            accountId = accountPlan.accountId
            billEpoch = accountPlan.billEpoch
            childBillingMode = accountPlan.childBillingMode
            code = accountPlan.code
            contractId = accountPlan.contractId
            createdBy = accountPlan.createdBy
            customFields = accountPlan.customFields
            dtCreated = accountPlan.dtCreated
            dtLastModified = accountPlan.dtLastModified
            endDate = accountPlan.endDate
            lastModifiedBy = accountPlan.lastModifiedBy
            planGroupId = accountPlan.planGroupId
            planId = accountPlan.planId
            productId = accountPlan.productId
            startDate = accountPlan.startDate
            additionalProperties = accountPlan.additionalProperties.toMutableMap()
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
         * The unique identifier (UUID) for the Account to which the AccountPlan or AccounPlanGroup
         * is attached.
         */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * The unique identifier (UUID) for the Account to which the AccountPlan or AccounPlanGroup
         * is attached.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * The initial date for creating the first bill against the Account for charges due under
         * the AccountPlan or AccountPlanGroup. All subsequent bill creation dates are calculated
         * from this date. If left empty, the first bill date definedfor the Account is used. The
         * date is in ISO-8601 format.
         */
        fun billEpoch(billEpoch: LocalDate) = billEpoch(JsonField.of(billEpoch))

        /**
         * The initial date for creating the first bill against the Account for charges due under
         * the AccountPlan or AccountPlanGroup. All subsequent bill creation dates are calculated
         * from this date. If left empty, the first bill date definedfor the Account is used. The
         * date is in ISO-8601 format.
         */
        fun billEpoch(billEpoch: JsonField<LocalDate>) = apply { this.billEpoch = billEpoch }

        /**
         * If the Account is either a Parent or a Child Account, this specifies the Account
         * hierarchy billing mode. The mode determines how billing will be handled and shown on
         * bills for charges due on the Parent Account, and charges due on Child Accounts:
         * - **Parent Breakdown** - a separate bill line item per Account. Default setting.
         * - **Parent Summary** - single bill line item for all Accounts.
         * - **Child** - the Child Account is billed.
         */
        fun childBillingMode(childBillingMode: ChildBillingMode) =
            childBillingMode(JsonField.of(childBillingMode))

        /**
         * If the Account is either a Parent or a Child Account, this specifies the Account
         * hierarchy billing mode. The mode determines how billing will be handled and shown on
         * bills for charges due on the Parent Account, and charges due on Child Accounts:
         * - **Parent Breakdown** - a separate bill line item per Account. Default setting.
         * - **Parent Summary** - single bill line item for all Accounts.
         * - **Child** - the Child Account is billed.
         */
        fun childBillingMode(childBillingMode: JsonField<ChildBillingMode>) = apply {
            this.childBillingMode = childBillingMode
        }

        /** The unique short code of the AccountPlan or AccountPlanGroup. */
        fun code(code: String) = code(JsonField.of(code))

        /** The unique short code of the AccountPlan or AccountPlanGroup. */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /**
         * The unique identifier (UUID) for the Contract to which the Plan or Plan Group attached to
         * the Account has been added.
         */
        fun contractId(contractId: String) = contractId(JsonField.of(contractId))

        /**
         * The unique identifier (UUID) for the Contract to which the Plan or Plan Group attached to
         * the Account has been added.
         */
        fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

        /**
         * The unique identifier (UUID) for the user who created the AccountPlan or
         * AccountPlanGroup.
         */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * The unique identifier (UUID) for the user who created the AccountPlan or
         * AccountPlanGroup.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

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

        /**
         * The date and time _(in ISO 8601 format)_ when the AccountPlan or AccountPlanGroup was
         * first created.
         */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /**
         * The date and time _(in ISO 8601 format)_ when the AccountPlan or AccountPlanGroup was
         * first created.
         */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /**
         * The date and time _(in ISO 8601 format)_ when the AccountPlan or AccountPlanGroup was
         * last modified.
         */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /**
         * The date and time _(in ISO 8601 format)_ when the AccountPlan or AccountPlanGroup was
         * last modified.
         */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        /**
         * The end date _(in ISO-8601 format)_ for when the AccountPlan or AccountPlanGroup ceases
         * to be active for the Account. If not specified, the AccountPlan or AccountPlanGroup
         * remains active indefinitely.
         */
        fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

        /**
         * The end date _(in ISO-8601 format)_ for when the AccountPlan or AccountPlanGroup ceases
         * to be active for the Account. If not specified, the AccountPlan or AccountPlanGroup
         * remains active indefinitely.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        /**
         * The unique identifier (UUID) for the user who last modified the AccountPlan or
         * AccountPlanGroup.
         */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /**
         * The unique identifier (UUID) for the user who last modified the AccountPlan or
         * AccountPlanGroup.
         */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
        }

        /**
         * The unique identifier (UUID) of the Plan Group that has been attached to the Account to
         * create the AccountPlanGroup.
         */
        fun planGroupId(planGroupId: String) = planGroupId(JsonField.of(planGroupId))

        /**
         * The unique identifier (UUID) of the Plan Group that has been attached to the Account to
         * create the AccountPlanGroup.
         */
        fun planGroupId(planGroupId: JsonField<String>) = apply { this.planGroupId = planGroupId }

        /**
         * The unique identifier (UUID) of the Plan that has been attached to the Account to create
         * the AccountPlan.
         */
        fun planId(planId: String) = planId(JsonField.of(planId))

        /**
         * The unique identifier (UUID) of the Plan that has been attached to the Account to create
         * the AccountPlan.
         */
        fun planId(planId: JsonField<String>) = apply { this.planId = planId }

        /**
         * The unique identifier (UUID) for the Product associated with the AccountPlan.
         *
         * **Note:** Not present in response for AccountPlanGroup - Plan Groups can contain multiple
         * Plans belonging to different Products.
         */
        fun productId(productId: String) = productId(JsonField.of(productId))

        /**
         * The unique identifier (UUID) for the Product associated with the AccountPlan.
         *
         * **Note:** Not present in response for AccountPlanGroup - Plan Groups can contain multiple
         * Plans belonging to different Products.
         */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        /**
         * The start date _(in ISO-8601 format)_ for the when the AccountPlan or AccountPlanGroup
         * starts to be active for the Account.
         */
        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        /**
         * The start date _(in ISO-8601 format)_ for the when the AccountPlan or AccountPlanGroup
         * starts to be active for the Account.
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

        fun build(): AccountPlan =
            AccountPlan(
                checkRequired("id", id),
                checkRequired("version", version),
                accountId,
                billEpoch,
                childBillingMode,
                code,
                contractId,
                createdBy,
                customFields,
                dtCreated,
                dtLastModified,
                endDate,
                lastModifiedBy,
                planGroupId,
                planId,
                productId,
                startDate,
                additionalProperties.toImmutable(),
            )
    }

    /**
     * If the Account is either a Parent or a Child Account, this specifies the Account hierarchy
     * billing mode. The mode determines how billing will be handled and shown on bills for charges
     * due on the Parent Account, and charges due on Child Accounts:
     * - **Parent Breakdown** - a separate bill line item per Account. Default setting.
     * - **Parent Summary** - single bill line item for all Accounts.
     * - **Child** - the Child Account is billed.
     */
    class ChildBillingMode
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

            @JvmField val PARENT_SUMMARY = of("PARENT_SUMMARY")

            @JvmField val PARENT_BREAKDOWN = of("PARENT_BREAKDOWN")

            @JvmField val CHILD = of("CHILD")

            @JvmStatic fun of(value: String) = ChildBillingMode(JsonField.of(value))
        }

        /** An enum containing [ChildBillingMode]'s known values. */
        enum class Known {
            PARENT_SUMMARY,
            PARENT_BREAKDOWN,
            CHILD,
        }

        /**
         * An enum containing [ChildBillingMode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ChildBillingMode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PARENT_SUMMARY,
            PARENT_BREAKDOWN,
            CHILD,
            /**
             * An enum member indicating that [ChildBillingMode] was instantiated with an unknown
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
                PARENT_SUMMARY -> Value.PARENT_SUMMARY
                PARENT_BREAKDOWN -> Value.PARENT_BREAKDOWN
                CHILD -> Value.CHILD
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
                PARENT_SUMMARY -> Known.PARENT_SUMMARY
                PARENT_BREAKDOWN -> Known.PARENT_BREAKDOWN
                CHILD -> Known.CHILD
                else -> throw M3terInvalidDataException("Unknown ChildBillingMode: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ChildBillingMode && value == other.value /* spotless:on */
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

        return /* spotless:off */ other is AccountPlan && id == other.id && version == other.version && accountId == other.accountId && billEpoch == other.billEpoch && childBillingMode == other.childBillingMode && code == other.code && contractId == other.contractId && createdBy == other.createdBy && customFields == other.customFields && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && endDate == other.endDate && lastModifiedBy == other.lastModifiedBy && planGroupId == other.planGroupId && planId == other.planId && productId == other.productId && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, accountId, billEpoch, childBillingMode, code, contractId, createdBy, customFields, dtCreated, dtLastModified, endDate, lastModifiedBy, planGroupId, planId, productId, startDate, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountPlan{id=$id, version=$version, accountId=$accountId, billEpoch=$billEpoch, childBillingMode=$childBillingMode, code=$code, contractId=$contractId, createdBy=$createdBy, customFields=$customFields, dtCreated=$dtCreated, dtLastModified=$dtLastModified, endDate=$endDate, lastModifiedBy=$lastModifiedBy, planGroupId=$planGroupId, planId=$planId, productId=$productId, startDate=$startDate, additionalProperties=$additionalProperties}"
}
