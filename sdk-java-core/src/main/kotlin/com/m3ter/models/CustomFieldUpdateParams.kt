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
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update Custom Fields added at Organization level to entities that support them. */
class CustomFieldUpdateParams
private constructor(
    private val orgId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    /**
     * Updates to Account entity CustomFields.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun account(): Optional<Account> = body.account()

    /**
     * Updates to AccountPlan entity CustomFields.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountPlan(): Optional<AccountPlan> = body.accountPlan()

    /**
     * Updates to simple Aggregation entity CustomFields.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun aggregation(): Optional<Aggregation> = body.aggregation()

    /**
     * Updates to Compound Aggregation entity CustomFields.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun compoundAggregation(): Optional<CompoundAggregation> = body.compoundAggregation()

    /**
     * Updates to Contract entity CustomFields.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contract(): Optional<Contract> = body.contract()

    /**
     * Updates to Meter entity CustomFields.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun meter(): Optional<Meter> = body.meter()

    /**
     * Updates to Organization CustomFields.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun organization(): Optional<Organization> = body.organization()

    /**
     * Updates to Plan entity CustomFields.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun plan(): Optional<Plan> = body.plan()

    /**
     * Updates to planTemplate entity CustomFields.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun planTemplate(): Optional<PlanTemplate> = body.planTemplate()

    /**
     * Updates to Product entity CustomFields.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun product(): Optional<Product> = body.product()

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
     * Returns the raw JSON value of [account].
     *
     * Unlike [account], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _account(): JsonField<Account> = body._account()

    /**
     * Returns the raw JSON value of [accountPlan].
     *
     * Unlike [accountPlan], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountPlan(): JsonField<AccountPlan> = body._accountPlan()

    /**
     * Returns the raw JSON value of [aggregation].
     *
     * Unlike [aggregation], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _aggregation(): JsonField<Aggregation> = body._aggregation()

    /**
     * Returns the raw JSON value of [compoundAggregation].
     *
     * Unlike [compoundAggregation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _compoundAggregation(): JsonField<CompoundAggregation> = body._compoundAggregation()

    /**
     * Returns the raw JSON value of [contract].
     *
     * Unlike [contract], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contract(): JsonField<Contract> = body._contract()

    /**
     * Returns the raw JSON value of [meter].
     *
     * Unlike [meter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _meter(): JsonField<Meter> = body._meter()

    /**
     * Returns the raw JSON value of [organization].
     *
     * Unlike [organization], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _organization(): JsonField<Organization> = body._organization()

    /**
     * Returns the raw JSON value of [plan].
     *
     * Unlike [plan], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _plan(): JsonField<Plan> = body._plan()

    /**
     * Returns the raw JSON value of [planTemplate].
     *
     * Unlike [planTemplate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _planTemplate(): JsonField<PlanTemplate> = body._planTemplate()

    /**
     * Returns the raw JSON value of [product].
     *
     * Unlike [product], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _product(): JsonField<Product> = body._product()

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

        @JvmStatic fun none(): CustomFieldUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CustomFieldUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomFieldUpdateParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customFieldUpdateParams: CustomFieldUpdateParams) = apply {
            orgId = customFieldUpdateParams.orgId
            body = customFieldUpdateParams.body.toBuilder()
            additionalHeaders = customFieldUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = customFieldUpdateParams.additionalQueryParams.toBuilder()
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
         * - [account]
         * - [accountPlan]
         * - [aggregation]
         * - [compoundAggregation]
         * - [contract]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Updates to Account entity CustomFields. */
        fun account(account: Account) = apply { body.account(account) }

        /**
         * Sets [Builder.account] to an arbitrary JSON value.
         *
         * You should usually call [Builder.account] with a well-typed [Account] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun account(account: JsonField<Account>) = apply { body.account(account) }

        /** Updates to AccountPlan entity CustomFields. */
        fun accountPlan(accountPlan: AccountPlan) = apply { body.accountPlan(accountPlan) }

        /**
         * Sets [Builder.accountPlan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountPlan] with a well-typed [AccountPlan] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountPlan(accountPlan: JsonField<AccountPlan>) = apply {
            body.accountPlan(accountPlan)
        }

        /** Updates to simple Aggregation entity CustomFields. */
        fun aggregation(aggregation: Aggregation) = apply { body.aggregation(aggregation) }

        /**
         * Sets [Builder.aggregation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aggregation] with a well-typed [Aggregation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun aggregation(aggregation: JsonField<Aggregation>) = apply {
            body.aggregation(aggregation)
        }

        /** Updates to Compound Aggregation entity CustomFields. */
        fun compoundAggregation(compoundAggregation: CompoundAggregation) = apply {
            body.compoundAggregation(compoundAggregation)
        }

        /**
         * Sets [Builder.compoundAggregation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.compoundAggregation] with a well-typed
         * [CompoundAggregation] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun compoundAggregation(compoundAggregation: JsonField<CompoundAggregation>) = apply {
            body.compoundAggregation(compoundAggregation)
        }

        /** Updates to Contract entity CustomFields. */
        fun contract(contract: Contract) = apply { body.contract(contract) }

        /**
         * Sets [Builder.contract] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contract] with a well-typed [Contract] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contract(contract: JsonField<Contract>) = apply { body.contract(contract) }

        /** Updates to Meter entity CustomFields. */
        fun meter(meter: Meter) = apply { body.meter(meter) }

        /**
         * Sets [Builder.meter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meter] with a well-typed [Meter] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meter(meter: JsonField<Meter>) = apply { body.meter(meter) }

        /** Updates to Organization CustomFields. */
        fun organization(organization: Organization) = apply { body.organization(organization) }

        /**
         * Sets [Builder.organization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organization] with a well-typed [Organization] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun organization(organization: JsonField<Organization>) = apply {
            body.organization(organization)
        }

        /** Updates to Plan entity CustomFields. */
        fun plan(plan: Plan) = apply { body.plan(plan) }

        /**
         * Sets [Builder.plan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.plan] with a well-typed [Plan] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun plan(plan: JsonField<Plan>) = apply { body.plan(plan) }

        /** Updates to planTemplate entity CustomFields. */
        fun planTemplate(planTemplate: PlanTemplate) = apply { body.planTemplate(planTemplate) }

        /**
         * Sets [Builder.planTemplate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planTemplate] with a well-typed [PlanTemplate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun planTemplate(planTemplate: JsonField<PlanTemplate>) = apply {
            body.planTemplate(planTemplate)
        }

        /** Updates to Product entity CustomFields. */
        fun product(product: Product) = apply { body.product(product) }

        /**
         * Sets [Builder.product] to an arbitrary JSON value.
         *
         * You should usually call [Builder.product] with a well-typed [Product] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun product(product: JsonField<Product>) = apply { body.product(product) }

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
         * Returns an immutable instance of [CustomFieldUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CustomFieldUpdateParams =
            CustomFieldUpdateParams(
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
    private constructor(
        private val account: JsonField<Account>,
        private val accountPlan: JsonField<AccountPlan>,
        private val aggregation: JsonField<Aggregation>,
        private val compoundAggregation: JsonField<CompoundAggregation>,
        private val contract: JsonField<Contract>,
        private val meter: JsonField<Meter>,
        private val organization: JsonField<Organization>,
        private val plan: JsonField<Plan>,
        private val planTemplate: JsonField<PlanTemplate>,
        private val product: JsonField<Product>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account") @ExcludeMissing account: JsonField<Account> = JsonMissing.of(),
            @JsonProperty("accountPlan")
            @ExcludeMissing
            accountPlan: JsonField<AccountPlan> = JsonMissing.of(),
            @JsonProperty("aggregation")
            @ExcludeMissing
            aggregation: JsonField<Aggregation> = JsonMissing.of(),
            @JsonProperty("compoundAggregation")
            @ExcludeMissing
            compoundAggregation: JsonField<CompoundAggregation> = JsonMissing.of(),
            @JsonProperty("contract")
            @ExcludeMissing
            contract: JsonField<Contract> = JsonMissing.of(),
            @JsonProperty("meter") @ExcludeMissing meter: JsonField<Meter> = JsonMissing.of(),
            @JsonProperty("organization")
            @ExcludeMissing
            organization: JsonField<Organization> = JsonMissing.of(),
            @JsonProperty("plan") @ExcludeMissing plan: JsonField<Plan> = JsonMissing.of(),
            @JsonProperty("planTemplate")
            @ExcludeMissing
            planTemplate: JsonField<PlanTemplate> = JsonMissing.of(),
            @JsonProperty("product") @ExcludeMissing product: JsonField<Product> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(
            account,
            accountPlan,
            aggregation,
            compoundAggregation,
            contract,
            meter,
            organization,
            plan,
            planTemplate,
            product,
            version,
            mutableMapOf(),
        )

        /**
         * Updates to Account entity CustomFields.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun account(): Optional<Account> = account.getOptional("account")

        /**
         * Updates to AccountPlan entity CustomFields.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountPlan(): Optional<AccountPlan> = accountPlan.getOptional("accountPlan")

        /**
         * Updates to simple Aggregation entity CustomFields.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun aggregation(): Optional<Aggregation> = aggregation.getOptional("aggregation")

        /**
         * Updates to Compound Aggregation entity CustomFields.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun compoundAggregation(): Optional<CompoundAggregation> =
            compoundAggregation.getOptional("compoundAggregation")

        /**
         * Updates to Contract entity CustomFields.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contract(): Optional<Contract> = contract.getOptional("contract")

        /**
         * Updates to Meter entity CustomFields.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun meter(): Optional<Meter> = meter.getOptional("meter")

        /**
         * Updates to Organization CustomFields.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun organization(): Optional<Organization> = organization.getOptional("organization")

        /**
         * Updates to Plan entity CustomFields.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun plan(): Optional<Plan> = plan.getOptional("plan")

        /**
         * Updates to planTemplate entity CustomFields.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun planTemplate(): Optional<PlanTemplate> = planTemplate.getOptional("planTemplate")

        /**
         * Updates to Product entity CustomFields.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun product(): Optional<Product> = product.getOptional("product")

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
        fun version(): Optional<Long> = version.getOptional("version")

        /**
         * Returns the raw JSON value of [account].
         *
         * Unlike [account], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account") @ExcludeMissing fun _account(): JsonField<Account> = account

        /**
         * Returns the raw JSON value of [accountPlan].
         *
         * Unlike [accountPlan], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accountPlan")
        @ExcludeMissing
        fun _accountPlan(): JsonField<AccountPlan> = accountPlan

        /**
         * Returns the raw JSON value of [aggregation].
         *
         * Unlike [aggregation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("aggregation")
        @ExcludeMissing
        fun _aggregation(): JsonField<Aggregation> = aggregation

        /**
         * Returns the raw JSON value of [compoundAggregation].
         *
         * Unlike [compoundAggregation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("compoundAggregation")
        @ExcludeMissing
        fun _compoundAggregation(): JsonField<CompoundAggregation> = compoundAggregation

        /**
         * Returns the raw JSON value of [contract].
         *
         * Unlike [contract], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contract") @ExcludeMissing fun _contract(): JsonField<Contract> = contract

        /**
         * Returns the raw JSON value of [meter].
         *
         * Unlike [meter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("meter") @ExcludeMissing fun _meter(): JsonField<Meter> = meter

        /**
         * Returns the raw JSON value of [organization].
         *
         * Unlike [organization], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("organization")
        @ExcludeMissing
        fun _organization(): JsonField<Organization> = organization

        /**
         * Returns the raw JSON value of [plan].
         *
         * Unlike [plan], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("plan") @ExcludeMissing fun _plan(): JsonField<Plan> = plan

        /**
         * Returns the raw JSON value of [planTemplate].
         *
         * Unlike [planTemplate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("planTemplate")
        @ExcludeMissing
        fun _planTemplate(): JsonField<PlanTemplate> = planTemplate

        /**
         * Returns the raw JSON value of [product].
         *
         * Unlike [product], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<Product> = product

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var account: JsonField<Account> = JsonMissing.of()
            private var accountPlan: JsonField<AccountPlan> = JsonMissing.of()
            private var aggregation: JsonField<Aggregation> = JsonMissing.of()
            private var compoundAggregation: JsonField<CompoundAggregation> = JsonMissing.of()
            private var contract: JsonField<Contract> = JsonMissing.of()
            private var meter: JsonField<Meter> = JsonMissing.of()
            private var organization: JsonField<Organization> = JsonMissing.of()
            private var plan: JsonField<Plan> = JsonMissing.of()
            private var planTemplate: JsonField<PlanTemplate> = JsonMissing.of()
            private var product: JsonField<Product> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                account = body.account
                accountPlan = body.accountPlan
                aggregation = body.aggregation
                compoundAggregation = body.compoundAggregation
                contract = body.contract
                meter = body.meter
                organization = body.organization
                plan = body.plan
                planTemplate = body.planTemplate
                product = body.product
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Updates to Account entity CustomFields. */
            fun account(account: Account) = account(JsonField.of(account))

            /**
             * Sets [Builder.account] to an arbitrary JSON value.
             *
             * You should usually call [Builder.account] with a well-typed [Account] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun account(account: JsonField<Account>) = apply { this.account = account }

            /** Updates to AccountPlan entity CustomFields. */
            fun accountPlan(accountPlan: AccountPlan) = accountPlan(JsonField.of(accountPlan))

            /**
             * Sets [Builder.accountPlan] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountPlan] with a well-typed [AccountPlan] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountPlan(accountPlan: JsonField<AccountPlan>) = apply {
                this.accountPlan = accountPlan
            }

            /** Updates to simple Aggregation entity CustomFields. */
            fun aggregation(aggregation: Aggregation) = aggregation(JsonField.of(aggregation))

            /**
             * Sets [Builder.aggregation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aggregation] with a well-typed [Aggregation] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun aggregation(aggregation: JsonField<Aggregation>) = apply {
                this.aggregation = aggregation
            }

            /** Updates to Compound Aggregation entity CustomFields. */
            fun compoundAggregation(compoundAggregation: CompoundAggregation) =
                compoundAggregation(JsonField.of(compoundAggregation))

            /**
             * Sets [Builder.compoundAggregation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.compoundAggregation] with a well-typed
             * [CompoundAggregation] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun compoundAggregation(compoundAggregation: JsonField<CompoundAggregation>) = apply {
                this.compoundAggregation = compoundAggregation
            }

            /** Updates to Contract entity CustomFields. */
            fun contract(contract: Contract) = contract(JsonField.of(contract))

            /**
             * Sets [Builder.contract] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contract] with a well-typed [Contract] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contract(contract: JsonField<Contract>) = apply { this.contract = contract }

            /** Updates to Meter entity CustomFields. */
            fun meter(meter: Meter) = meter(JsonField.of(meter))

            /**
             * Sets [Builder.meter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meter] with a well-typed [Meter] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun meter(meter: JsonField<Meter>) = apply { this.meter = meter }

            /** Updates to Organization CustomFields. */
            fun organization(organization: Organization) = organization(JsonField.of(organization))

            /**
             * Sets [Builder.organization] to an arbitrary JSON value.
             *
             * You should usually call [Builder.organization] with a well-typed [Organization] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun organization(organization: JsonField<Organization>) = apply {
                this.organization = organization
            }

            /** Updates to Plan entity CustomFields. */
            fun plan(plan: Plan) = plan(JsonField.of(plan))

            /**
             * Sets [Builder.plan] to an arbitrary JSON value.
             *
             * You should usually call [Builder.plan] with a well-typed [Plan] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun plan(plan: JsonField<Plan>) = apply { this.plan = plan }

            /** Updates to planTemplate entity CustomFields. */
            fun planTemplate(planTemplate: PlanTemplate) = planTemplate(JsonField.of(planTemplate))

            /**
             * Sets [Builder.planTemplate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planTemplate] with a well-typed [PlanTemplate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planTemplate(planTemplate: JsonField<PlanTemplate>) = apply {
                this.planTemplate = planTemplate
            }

            /** Updates to Product entity CustomFields. */
            fun product(product: Product) = product(JsonField.of(product))

            /**
             * Sets [Builder.product] to an arbitrary JSON value.
             *
             * You should usually call [Builder.product] with a well-typed [Product] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun product(product: JsonField<Product>) = apply { this.product = product }

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
             */
            fun build(): Body =
                Body(
                    account,
                    accountPlan,
                    aggregation,
                    compoundAggregation,
                    contract,
                    meter,
                    organization,
                    plan,
                    planTemplate,
                    product,
                    version,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            account().ifPresent { it.validate() }
            accountPlan().ifPresent { it.validate() }
            aggregation().ifPresent { it.validate() }
            compoundAggregation().ifPresent { it.validate() }
            contract().ifPresent { it.validate() }
            meter().ifPresent { it.validate() }
            organization().ifPresent { it.validate() }
            plan().ifPresent { it.validate() }
            planTemplate().ifPresent { it.validate() }
            product().ifPresent { it.validate() }
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
            (account.asKnown().getOrNull()?.validity() ?: 0) +
                (accountPlan.asKnown().getOrNull()?.validity() ?: 0) +
                (aggregation.asKnown().getOrNull()?.validity() ?: 0) +
                (compoundAggregation.asKnown().getOrNull()?.validity() ?: 0) +
                (contract.asKnown().getOrNull()?.validity() ?: 0) +
                (meter.asKnown().getOrNull()?.validity() ?: 0) +
                (organization.asKnown().getOrNull()?.validity() ?: 0) +
                (plan.asKnown().getOrNull()?.validity() ?: 0) +
                (planTemplate.asKnown().getOrNull()?.validity() ?: 0) +
                (product.asKnown().getOrNull()?.validity() ?: 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && account == other.account && accountPlan == other.accountPlan && aggregation == other.aggregation && compoundAggregation == other.compoundAggregation && contract == other.contract && meter == other.meter && organization == other.organization && plan == other.plan && planTemplate == other.planTemplate && product == other.product && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(account, accountPlan, aggregation, compoundAggregation, contract, meter, organization, plan, planTemplate, product, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{account=$account, accountPlan=$accountPlan, aggregation=$aggregation, compoundAggregation=$compoundAggregation, contract=$contract, meter=$meter, organization=$organization, plan=$plan, planTemplate=$planTemplate, product=$product, version=$version, additionalProperties=$additionalProperties}"
    }

    /** Updates to Account entity CustomFields. */
    class Account
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

            /** Returns a mutable builder for constructing an instance of [Account]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Account]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(account: Account) = apply {
                additionalProperties = account.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Account].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Account = Account(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Account = apply {
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

            return /* spotless:off */ other is Account && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Account{additionalProperties=$additionalProperties}"
    }

    /** Updates to AccountPlan entity CustomFields. */
    class AccountPlan
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

            /** Returns a mutable builder for constructing an instance of [AccountPlan]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AccountPlan]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountPlan: AccountPlan) = apply {
                additionalProperties = accountPlan.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [AccountPlan].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AccountPlan = AccountPlan(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): AccountPlan = apply {
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

            return /* spotless:off */ other is AccountPlan && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "AccountPlan{additionalProperties=$additionalProperties}"
    }

    /** Updates to simple Aggregation entity CustomFields. */
    class Aggregation
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

            /** Returns a mutable builder for constructing an instance of [Aggregation]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Aggregation]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(aggregation: Aggregation) = apply {
                additionalProperties = aggregation.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Aggregation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Aggregation = Aggregation(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Aggregation = apply {
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

            return /* spotless:off */ other is Aggregation && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Aggregation{additionalProperties=$additionalProperties}"
    }

    /** Updates to Compound Aggregation entity CustomFields. */
    class CompoundAggregation
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

            /** Returns a mutable builder for constructing an instance of [CompoundAggregation]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CompoundAggregation]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(compoundAggregation: CompoundAggregation) = apply {
                additionalProperties = compoundAggregation.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [CompoundAggregation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CompoundAggregation =
                CompoundAggregation(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): CompoundAggregation = apply {
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

            return /* spotless:off */ other is CompoundAggregation && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "CompoundAggregation{additionalProperties=$additionalProperties}"
    }

    /** Updates to Contract entity CustomFields. */
    class Contract
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

            /** Returns a mutable builder for constructing an instance of [Contract]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Contract]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contract: Contract) = apply {
                additionalProperties = contract.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Contract].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Contract = Contract(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Contract = apply {
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

            return /* spotless:off */ other is Contract && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Contract{additionalProperties=$additionalProperties}"
    }

    /** Updates to Meter entity CustomFields. */
    class Meter
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

            /** Returns a mutable builder for constructing an instance of [Meter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Meter]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(meter: Meter) = apply {
                additionalProperties = meter.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Meter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Meter = Meter(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Meter = apply {
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

            return /* spotless:off */ other is Meter && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Meter{additionalProperties=$additionalProperties}"
    }

    /** Updates to Organization CustomFields. */
    class Organization
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

            /** Returns a mutable builder for constructing an instance of [Organization]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Organization]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(organization: Organization) = apply {
                additionalProperties = organization.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Organization].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Organization = Organization(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Organization = apply {
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

            return /* spotless:off */ other is Organization && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Organization{additionalProperties=$additionalProperties}"
    }

    /** Updates to Plan entity CustomFields. */
    class Plan
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

            /** Returns a mutable builder for constructing an instance of [Plan]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Plan]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(plan: Plan) = apply {
                additionalProperties = plan.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Plan].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Plan = Plan(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Plan = apply {
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

            return /* spotless:off */ other is Plan && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Plan{additionalProperties=$additionalProperties}"
    }

    /** Updates to planTemplate entity CustomFields. */
    class PlanTemplate
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

            /** Returns a mutable builder for constructing an instance of [PlanTemplate]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PlanTemplate]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(planTemplate: PlanTemplate) = apply {
                additionalProperties = planTemplate.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [PlanTemplate].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PlanTemplate = PlanTemplate(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): PlanTemplate = apply {
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

            return /* spotless:off */ other is PlanTemplate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "PlanTemplate{additionalProperties=$additionalProperties}"
    }

    /** Updates to Product entity CustomFields. */
    class Product
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

            /** Returns a mutable builder for constructing an instance of [Product]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Product]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(product: Product) = apply {
                additionalProperties = product.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Product].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Product = Product(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Product = apply {
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

            return /* spotless:off */ other is Product && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Product{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomFieldUpdateParams && orgId == other.orgId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomFieldUpdateParams{orgId=$orgId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
