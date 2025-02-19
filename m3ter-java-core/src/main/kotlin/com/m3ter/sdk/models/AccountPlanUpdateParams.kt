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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Update the AccountPlan or AccountPlanGroup with the given UUID.
 *
 * This endpoint updates a new AccountPlan or AccountPlanGroup for a specific Account in your
 * Organization. The updated information should be provided in the request body.
 *
 * **Notes:**
 * - You cannot use this call to update _both_ an AccountPlan and AccountPlanGroup for an Account at
 *   the same time. If you want to update an AccounPlan and an AccountPlanGroup attached to an
 *   Account, you must submit two separate calls.
 * - If you have created Custom Fields for an AccountPlan, when you use this endpoint to update the
 *   AccountPlan use the `customFields` parameter to preserve those Custom Fields. If you omit them
 *   from the update request, they will be lost.
 */
class AccountPlanUpdateParams
private constructor(
    private val orgId: String,
    private val id: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    fun id(): String = id

    /** The unique identifier (UUID) for the Account. */
    fun accountId(): String = body.accountId()

    /**
     * The start date _(in ISO-8601 format)_ for the AccountPlan or AccountPlanGroup becoming active
     * for the Account.
     */
    fun startDate(): OffsetDateTime = body.startDate()

    /**
     * Optional setting to define a _billing cycle date_, which acts as a reference for when in the
     * applied billing frequency period bills are created:
     * - For example, if you attach a Plan to an Account where the Plan is configured for monthly
     *   billing frequency and you've defined the period the Plan will apply to the Account to be
     *   from January 1st, 2022 until January 1st, 2023. You then set a `billEpoch` date of February
     *   15th, 2022. The first Bill will be created for the Account on February 15th, and subsequent
     *   Bills created on the 15th of the months following for the remainder of the billing period -
     *   March 15th, April 15th, and so on.
     * - If not defined, then the `billEpoch` date set for the Account will be used instead.
     * - The date is in ISO-8601 format.
     */
    fun billEpoch(): Optional<LocalDate> = body.billEpoch()

    /**
     * If the Account is either a Parent or a Child Account, this specifies the Account hierarchy
     * billing mode. The mode determines how billing will be handled and shown on bills for charges
     * due on the Parent Account, and charges due on Child Accounts:
     * - **Parent Breakdown** - a separate bill line item per Account. Default setting.
     * - **Parent Summary** - single bill line item for all Accounts.
     * - **Child** - the Child Account is billed.
     */
    fun childBillingMode(): Optional<ChildBillingMode> = body.childBillingMode()

    /** A unique short code for the AccountPlan or AccountPlanGroup. */
    fun code(): Optional<String> = body.code()

    /**
     * The unique identifier (UUID) for a Contract to which you want to add the Plan or Plan Group
     * being attached to the Account.
     */
    fun contractId(): Optional<String> = body.contractId()

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
     * The end date _(in ISO-8601 format)_ for when the AccountPlan or AccountPlanGroup ceases to be
     * active for the Account. If not specified, the AccountPlan or AccountPlanGroup remains active
     * indefinitely.
     */
    fun endDate(): Optional<OffsetDateTime> = body.endDate()

    /**
     * The unique identifier (UUID) of the PlanGroup to be attached to the Account to create an
     * AccountPlanGroup.
     *
     * **Note:** Exclusive of the `planId` request parameter - exactly one of `planId` or
     * `planGroupId` must be used per call.
     */
    fun planGroupId(): Optional<String> = body.planGroupId()

    /**
     * The unique identifier (UUID) of the Plan to be attached to the Account to create an
     * AccountPlan.
     *
     * **Note:** Exclusive of the `planGroupId` request parameter - exactly one of `planId` or
     * `planGroupId` must be used per call.
     */
    fun planId(): Optional<String> = body.planId()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     */
    fun version(): Optional<Long> = body.version()

    /** The unique identifier (UUID) for the Account. */
    fun _accountId(): JsonField<String> = body._accountId()

    /**
     * The start date _(in ISO-8601 format)_ for the AccountPlan or AccountPlanGroup becoming active
     * for the Account.
     */
    fun _startDate(): JsonField<OffsetDateTime> = body._startDate()

    /**
     * Optional setting to define a _billing cycle date_, which acts as a reference for when in the
     * applied billing frequency period bills are created:
     * - For example, if you attach a Plan to an Account where the Plan is configured for monthly
     *   billing frequency and you've defined the period the Plan will apply to the Account to be
     *   from January 1st, 2022 until January 1st, 2023. You then set a `billEpoch` date of February
     *   15th, 2022. The first Bill will be created for the Account on February 15th, and subsequent
     *   Bills created on the 15th of the months following for the remainder of the billing period -
     *   March 15th, April 15th, and so on.
     * - If not defined, then the `billEpoch` date set for the Account will be used instead.
     * - The date is in ISO-8601 format.
     */
    fun _billEpoch(): JsonField<LocalDate> = body._billEpoch()

    /**
     * If the Account is either a Parent or a Child Account, this specifies the Account hierarchy
     * billing mode. The mode determines how billing will be handled and shown on bills for charges
     * due on the Parent Account, and charges due on Child Accounts:
     * - **Parent Breakdown** - a separate bill line item per Account. Default setting.
     * - **Parent Summary** - single bill line item for all Accounts.
     * - **Child** - the Child Account is billed.
     */
    fun _childBillingMode(): JsonField<ChildBillingMode> = body._childBillingMode()

    /** A unique short code for the AccountPlan or AccountPlanGroup. */
    fun _code(): JsonField<String> = body._code()

    /**
     * The unique identifier (UUID) for a Contract to which you want to add the Plan or Plan Group
     * being attached to the Account.
     */
    fun _contractId(): JsonField<String> = body._contractId()

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
     * The end date _(in ISO-8601 format)_ for when the AccountPlan or AccountPlanGroup ceases to be
     * active for the Account. If not specified, the AccountPlan or AccountPlanGroup remains active
     * indefinitely.
     */
    fun _endDate(): JsonField<OffsetDateTime> = body._endDate()

    /**
     * The unique identifier (UUID) of the PlanGroup to be attached to the Account to create an
     * AccountPlanGroup.
     *
     * **Note:** Exclusive of the `planId` request parameter - exactly one of `planId` or
     * `planGroupId` must be used per call.
     */
    fun _planGroupId(): JsonField<String> = body._planGroupId()

    /**
     * The unique identifier (UUID) of the Plan to be attached to the Account to create an
     * AccountPlan.
     *
     * **Note:** Exclusive of the `planGroupId` request parameter - exactly one of `planId` or
     * `planGroupId` must be used per call.
     */
    fun _planId(): JsonField<String> = body._planId()

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
            1 -> id
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("accountId")
        @ExcludeMissing
        private val accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("startDate")
        @ExcludeMissing
        private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("billEpoch")
        @ExcludeMissing
        private val billEpoch: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("childBillingMode")
        @ExcludeMissing
        private val childBillingMode: JsonField<ChildBillingMode> = JsonMissing.of(),
        @JsonProperty("code")
        @ExcludeMissing
        private val code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contractId")
        @ExcludeMissing
        private val contractId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customFields")
        @ExcludeMissing
        private val customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("endDate")
        @ExcludeMissing
        private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("planGroupId")
        @ExcludeMissing
        private val planGroupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("planId")
        @ExcludeMissing
        private val planId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version")
        @ExcludeMissing
        private val version: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The unique identifier (UUID) for the Account. */
        fun accountId(): String = accountId.getRequired("accountId")

        /**
         * The start date _(in ISO-8601 format)_ for the AccountPlan or AccountPlanGroup becoming
         * active for the Account.
         */
        fun startDate(): OffsetDateTime = startDate.getRequired("startDate")

        /**
         * Optional setting to define a _billing cycle date_, which acts as a reference for when in
         * the applied billing frequency period bills are created:
         * - For example, if you attach a Plan to an Account where the Plan is configured for
         *   monthly billing frequency and you've defined the period the Plan will apply to the
         *   Account to be from January 1st, 2022 until January 1st, 2023. You then set a
         *   `billEpoch` date of February 15th, 2022. The first Bill will be created for the Account
         *   on February 15th, and subsequent Bills created on the 15th of the months following for
         *   the remainder of the billing period - March 15th, April 15th, and so on.
         * - If not defined, then the `billEpoch` date set for the Account will be used instead.
         * - The date is in ISO-8601 format.
         */
        fun billEpoch(): Optional<LocalDate> =
            Optional.ofNullable(billEpoch.getNullable("billEpoch"))

        /**
         * If the Account is either a Parent or a Child Account, this specifies the Account
         * hierarchy billing mode. The mode determines how billing will be handled and shown on
         * bills for charges due on the Parent Account, and charges due on Child Accounts:
         * - **Parent Breakdown** - a separate bill line item per Account. Default setting.
         * - **Parent Summary** - single bill line item for all Accounts.
         * - **Child** - the Child Account is billed.
         */
        fun childBillingMode(): Optional<ChildBillingMode> =
            Optional.ofNullable(childBillingMode.getNullable("childBillingMode"))

        /** A unique short code for the AccountPlan or AccountPlanGroup. */
        fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

        /**
         * The unique identifier (UUID) for a Contract to which you want to add the Plan or Plan
         * Group being attached to the Account.
         */
        fun contractId(): Optional<String> =
            Optional.ofNullable(contractId.getNullable("contractId"))

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
         * The end date _(in ISO-8601 format)_ for when the AccountPlan or AccountPlanGroup ceases
         * to be active for the Account. If not specified, the AccountPlan or AccountPlanGroup
         * remains active indefinitely.
         */
        fun endDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(endDate.getNullable("endDate"))

        /**
         * The unique identifier (UUID) of the PlanGroup to be attached to the Account to create an
         * AccountPlanGroup.
         *
         * **Note:** Exclusive of the `planId` request parameter - exactly one of `planId` or
         * `planGroupId` must be used per call.
         */
        fun planGroupId(): Optional<String> =
            Optional.ofNullable(planGroupId.getNullable("planGroupId"))

        /**
         * The unique identifier (UUID) of the Plan to be attached to the Account to create an
         * AccountPlan.
         *
         * **Note:** Exclusive of the `planGroupId` request parameter - exactly one of `planId` or
         * `planGroupId` must be used per call.
         */
        fun planId(): Optional<String> = Optional.ofNullable(planId.getNullable("planId"))

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

        /** The unique identifier (UUID) for the Account. */
        @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * The start date _(in ISO-8601 format)_ for the AccountPlan or AccountPlanGroup becoming
         * active for the Account.
         */
        @JsonProperty("startDate")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

        /**
         * Optional setting to define a _billing cycle date_, which acts as a reference for when in
         * the applied billing frequency period bills are created:
         * - For example, if you attach a Plan to an Account where the Plan is configured for
         *   monthly billing frequency and you've defined the period the Plan will apply to the
         *   Account to be from January 1st, 2022 until January 1st, 2023. You then set a
         *   `billEpoch` date of February 15th, 2022. The first Bill will be created for the Account
         *   on February 15th, and subsequent Bills created on the 15th of the months following for
         *   the remainder of the billing period - March 15th, April 15th, and so on.
         * - If not defined, then the `billEpoch` date set for the Account will be used instead.
         * - The date is in ISO-8601 format.
         */
        @JsonProperty("billEpoch")
        @ExcludeMissing
        fun _billEpoch(): JsonField<LocalDate> = billEpoch

        /**
         * If the Account is either a Parent or a Child Account, this specifies the Account
         * hierarchy billing mode. The mode determines how billing will be handled and shown on
         * bills for charges due on the Parent Account, and charges due on Child Accounts:
         * - **Parent Breakdown** - a separate bill line item per Account. Default setting.
         * - **Parent Summary** - single bill line item for all Accounts.
         * - **Child** - the Child Account is billed.
         */
        @JsonProperty("childBillingMode")
        @ExcludeMissing
        fun _childBillingMode(): JsonField<ChildBillingMode> = childBillingMode

        /** A unique short code for the AccountPlan or AccountPlanGroup. */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * The unique identifier (UUID) for a Contract to which you want to add the Plan or Plan
         * Group being attached to the Account.
         */
        @JsonProperty("contractId")
        @ExcludeMissing
        fun _contractId(): JsonField<String> = contractId

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
         * The end date _(in ISO-8601 format)_ for when the AccountPlan or AccountPlanGroup ceases
         * to be active for the Account. If not specified, the AccountPlan or AccountPlanGroup
         * remains active indefinitely.
         */
        @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

        /**
         * The unique identifier (UUID) of the PlanGroup to be attached to the Account to create an
         * AccountPlanGroup.
         *
         * **Note:** Exclusive of the `planId` request parameter - exactly one of `planId` or
         * `planGroupId` must be used per call.
         */
        @JsonProperty("planGroupId")
        @ExcludeMissing
        fun _planGroupId(): JsonField<String> = planGroupId

        /**
         * The unique identifier (UUID) of the Plan to be attached to the Account to create an
         * AccountPlan.
         *
         * **Note:** Exclusive of the `planGroupId` request parameter - exactly one of `planId` or
         * `planGroupId` must be used per call.
         */
        @JsonProperty("planId") @ExcludeMissing fun _planId(): JsonField<String> = planId

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

            accountId()
            startDate()
            billEpoch()
            childBillingMode()
            code()
            contractId()
            customFields().ifPresent { it.validate() }
            endDate()
            planGroupId()
            planId()
            version()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var startDate: JsonField<OffsetDateTime>? = null
            private var billEpoch: JsonField<LocalDate> = JsonMissing.of()
            private var childBillingMode: JsonField<ChildBillingMode> = JsonMissing.of()
            private var code: JsonField<String> = JsonMissing.of()
            private var contractId: JsonField<String> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var planGroupId: JsonField<String> = JsonMissing.of()
            private var planId: JsonField<String> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountId = body.accountId
                startDate = body.startDate
                billEpoch = body.billEpoch
                childBillingMode = body.childBillingMode
                code = body.code
                contractId = body.contractId
                customFields = body.customFields
                endDate = body.endDate
                planGroupId = body.planGroupId
                planId = body.planId
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The unique identifier (UUID) for the Account. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /** The unique identifier (UUID) for the Account. */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /**
             * The start date _(in ISO-8601 format)_ for the AccountPlan or AccountPlanGroup
             * becoming active for the Account.
             */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /**
             * The start date _(in ISO-8601 format)_ for the AccountPlan or AccountPlanGroup
             * becoming active for the Account.
             */
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
            }

            /**
             * Optional setting to define a _billing cycle date_, which acts as a reference for when
             * in the applied billing frequency period bills are created:
             * - For example, if you attach a Plan to an Account where the Plan is configured for
             *   monthly billing frequency and you've defined the period the Plan will apply to the
             *   Account to be from January 1st, 2022 until January 1st, 2023. You then set a
             *   `billEpoch` date of February 15th, 2022. The first Bill will be created for the
             *   Account on February 15th, and subsequent Bills created on the 15th of the months
             *   following for the remainder of the billing period - March 15th, April 15th, and so
             *   on.
             * - If not defined, then the `billEpoch` date set for the Account will be used instead.
             * - The date is in ISO-8601 format.
             */
            fun billEpoch(billEpoch: LocalDate) = billEpoch(JsonField.of(billEpoch))

            /**
             * Optional setting to define a _billing cycle date_, which acts as a reference for when
             * in the applied billing frequency period bills are created:
             * - For example, if you attach a Plan to an Account where the Plan is configured for
             *   monthly billing frequency and you've defined the period the Plan will apply to the
             *   Account to be from January 1st, 2022 until January 1st, 2023. You then set a
             *   `billEpoch` date of February 15th, 2022. The first Bill will be created for the
             *   Account on February 15th, and subsequent Bills created on the 15th of the months
             *   following for the remainder of the billing period - March 15th, April 15th, and so
             *   on.
             * - If not defined, then the `billEpoch` date set for the Account will be used instead.
             * - The date is in ISO-8601 format.
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

            /** A unique short code for the AccountPlan or AccountPlanGroup. */
            fun code(code: String) = code(JsonField.of(code))

            /** A unique short code for the AccountPlan or AccountPlanGroup. */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /**
             * The unique identifier (UUID) for a Contract to which you want to add the Plan or Plan
             * Group being attached to the Account.
             */
            fun contractId(contractId: String) = contractId(JsonField.of(contractId))

            /**
             * The unique identifier (UUID) for a Contract to which you want to add the Plan or Plan
             * Group being attached to the Account.
             */
            fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

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
             * The end date _(in ISO-8601 format)_ for when the AccountPlan or AccountPlanGroup
             * ceases to be active for the Account. If not specified, the AccountPlan or
             * AccountPlanGroup remains active indefinitely.
             */
            fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

            /**
             * The end date _(in ISO-8601 format)_ for when the AccountPlan or AccountPlanGroup
             * ceases to be active for the Account. If not specified, the AccountPlan or
             * AccountPlanGroup remains active indefinitely.
             */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /**
             * The unique identifier (UUID) of the PlanGroup to be attached to the Account to create
             * an AccountPlanGroup.
             *
             * **Note:** Exclusive of the `planId` request parameter - exactly one of `planId` or
             * `planGroupId` must be used per call.
             */
            fun planGroupId(planGroupId: String) = planGroupId(JsonField.of(planGroupId))

            /**
             * The unique identifier (UUID) of the PlanGroup to be attached to the Account to create
             * an AccountPlanGroup.
             *
             * **Note:** Exclusive of the `planId` request parameter - exactly one of `planId` or
             * `planGroupId` must be used per call.
             */
            fun planGroupId(planGroupId: JsonField<String>) = apply {
                this.planGroupId = planGroupId
            }

            /**
             * The unique identifier (UUID) of the Plan to be attached to the Account to create an
             * AccountPlan.
             *
             * **Note:** Exclusive of the `planGroupId` request parameter - exactly one of `planId`
             * or `planGroupId` must be used per call.
             */
            fun planId(planId: String) = planId(JsonField.of(planId))

            /**
             * The unique identifier (UUID) of the Plan to be attached to the Account to create an
             * AccountPlan.
             *
             * **Note:** Exclusive of the `planGroupId` request parameter - exactly one of `planId`
             * or `planGroupId` must be used per call.
             */
            fun planId(planId: JsonField<String>) = apply { this.planId = planId }

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
                    checkRequired("accountId", accountId),
                    checkRequired("startDate", startDate),
                    billEpoch,
                    childBillingMode,
                    code,
                    contractId,
                    customFields,
                    endDate,
                    planGroupId,
                    planId,
                    version,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && accountId == other.accountId && startDate == other.startDate && billEpoch == other.billEpoch && childBillingMode == other.childBillingMode && code == other.code && contractId == other.contractId && customFields == other.customFields && endDate == other.endDate && planGroupId == other.planGroupId && planId == other.planId && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, startDate, billEpoch, childBillingMode, code, contractId, customFields, endDate, planGroupId, planId, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountId=$accountId, startDate=$startDate, billEpoch=$billEpoch, childBillingMode=$childBillingMode, code=$code, contractId=$contractId, customFields=$customFields, endDate=$endDate, planGroupId=$planGroupId, planId=$planId, version=$version, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountPlanUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(accountPlanUpdateParams: AccountPlanUpdateParams) = apply {
            orgId = accountPlanUpdateParams.orgId
            id = accountPlanUpdateParams.id
            body = accountPlanUpdateParams.body.toBuilder()
            additionalHeaders = accountPlanUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = accountPlanUpdateParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        fun id(id: String) = apply { this.id = id }

        /** The unique identifier (UUID) for the Account. */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /** The unique identifier (UUID) for the Account. */
        fun accountId(accountId: JsonField<String>) = apply { body.accountId(accountId) }

        /**
         * The start date _(in ISO-8601 format)_ for the AccountPlan or AccountPlanGroup becoming
         * active for the Account.
         */
        fun startDate(startDate: OffsetDateTime) = apply { body.startDate(startDate) }

        /**
         * The start date _(in ISO-8601 format)_ for the AccountPlan or AccountPlanGroup becoming
         * active for the Account.
         */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { body.startDate(startDate) }

        /**
         * Optional setting to define a _billing cycle date_, which acts as a reference for when in
         * the applied billing frequency period bills are created:
         * - For example, if you attach a Plan to an Account where the Plan is configured for
         *   monthly billing frequency and you've defined the period the Plan will apply to the
         *   Account to be from January 1st, 2022 until January 1st, 2023. You then set a
         *   `billEpoch` date of February 15th, 2022. The first Bill will be created for the Account
         *   on February 15th, and subsequent Bills created on the 15th of the months following for
         *   the remainder of the billing period - March 15th, April 15th, and so on.
         * - If not defined, then the `billEpoch` date set for the Account will be used instead.
         * - The date is in ISO-8601 format.
         */
        fun billEpoch(billEpoch: LocalDate) = apply { body.billEpoch(billEpoch) }

        /**
         * Optional setting to define a _billing cycle date_, which acts as a reference for when in
         * the applied billing frequency period bills are created:
         * - For example, if you attach a Plan to an Account where the Plan is configured for
         *   monthly billing frequency and you've defined the period the Plan will apply to the
         *   Account to be from January 1st, 2022 until January 1st, 2023. You then set a
         *   `billEpoch` date of February 15th, 2022. The first Bill will be created for the Account
         *   on February 15th, and subsequent Bills created on the 15th of the months following for
         *   the remainder of the billing period - March 15th, April 15th, and so on.
         * - If not defined, then the `billEpoch` date set for the Account will be used instead.
         * - The date is in ISO-8601 format.
         */
        fun billEpoch(billEpoch: JsonField<LocalDate>) = apply { body.billEpoch(billEpoch) }

        /**
         * If the Account is either a Parent or a Child Account, this specifies the Account
         * hierarchy billing mode. The mode determines how billing will be handled and shown on
         * bills for charges due on the Parent Account, and charges due on Child Accounts:
         * - **Parent Breakdown** - a separate bill line item per Account. Default setting.
         * - **Parent Summary** - single bill line item for all Accounts.
         * - **Child** - the Child Account is billed.
         */
        fun childBillingMode(childBillingMode: ChildBillingMode) = apply {
            body.childBillingMode(childBillingMode)
        }

        /**
         * If the Account is either a Parent or a Child Account, this specifies the Account
         * hierarchy billing mode. The mode determines how billing will be handled and shown on
         * bills for charges due on the Parent Account, and charges due on Child Accounts:
         * - **Parent Breakdown** - a separate bill line item per Account. Default setting.
         * - **Parent Summary** - single bill line item for all Accounts.
         * - **Child** - the Child Account is billed.
         */
        fun childBillingMode(childBillingMode: JsonField<ChildBillingMode>) = apply {
            body.childBillingMode(childBillingMode)
        }

        /** A unique short code for the AccountPlan or AccountPlanGroup. */
        fun code(code: String) = apply { body.code(code) }

        /** A unique short code for the AccountPlan or AccountPlanGroup. */
        fun code(code: JsonField<String>) = apply { body.code(code) }

        /**
         * The unique identifier (UUID) for a Contract to which you want to add the Plan or Plan
         * Group being attached to the Account.
         */
        fun contractId(contractId: String) = apply { body.contractId(contractId) }

        /**
         * The unique identifier (UUID) for a Contract to which you want to add the Plan or Plan
         * Group being attached to the Account.
         */
        fun contractId(contractId: JsonField<String>) = apply { body.contractId(contractId) }

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
         * The end date _(in ISO-8601 format)_ for when the AccountPlan or AccountPlanGroup ceases
         * to be active for the Account. If not specified, the AccountPlan or AccountPlanGroup
         * remains active indefinitely.
         */
        fun endDate(endDate: OffsetDateTime) = apply { body.endDate(endDate) }

        /**
         * The end date _(in ISO-8601 format)_ for when the AccountPlan or AccountPlanGroup ceases
         * to be active for the Account. If not specified, the AccountPlan or AccountPlanGroup
         * remains active indefinitely.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { body.endDate(endDate) }

        /**
         * The unique identifier (UUID) of the PlanGroup to be attached to the Account to create an
         * AccountPlanGroup.
         *
         * **Note:** Exclusive of the `planId` request parameter - exactly one of `planId` or
         * `planGroupId` must be used per call.
         */
        fun planGroupId(planGroupId: String) = apply { body.planGroupId(planGroupId) }

        /**
         * The unique identifier (UUID) of the PlanGroup to be attached to the Account to create an
         * AccountPlanGroup.
         *
         * **Note:** Exclusive of the `planId` request parameter - exactly one of `planId` or
         * `planGroupId` must be used per call.
         */
        fun planGroupId(planGroupId: JsonField<String>) = apply { body.planGroupId(planGroupId) }

        /**
         * The unique identifier (UUID) of the Plan to be attached to the Account to create an
         * AccountPlan.
         *
         * **Note:** Exclusive of the `planGroupId` request parameter - exactly one of `planId` or
         * `planGroupId` must be used per call.
         */
        fun planId(planId: String) = apply { body.planId(planId) }

        /**
         * The unique identifier (UUID) of the Plan to be attached to the Account to create an
         * AccountPlan.
         *
         * **Note:** Exclusive of the `planGroupId` request parameter - exactly one of `planId` or
         * `planGroupId` must be used per call.
         */
        fun planId(planId: JsonField<String>) = apply { body.planId(planId) }

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

        fun build(): AccountPlanUpdateParams =
            AccountPlanUpdateParams(
                checkRequired("orgId", orgId),
                checkRequired("id", id),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
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
    class ChildBillingMode @JsonCreator private constructor(private val value: JsonField<String>) :
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

            return /* spotless:off */ other is ChildBillingMode && value == other.value /* spotless:on */
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

        return /* spotless:off */ other is AccountPlanUpdateParams && orgId == other.orgId && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AccountPlanUpdateParams{orgId=$orgId, id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
