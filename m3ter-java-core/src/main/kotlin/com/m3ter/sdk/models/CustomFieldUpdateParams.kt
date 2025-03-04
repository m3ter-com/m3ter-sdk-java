// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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
import java.util.Objects
import java.util.Optional

/** Update Custom Fields added at Organization level to entities that support them. */
class CustomFieldUpdateParams
private constructor(
    private val orgId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    /** Updates to Account entity CustomFields. */
    fun account(): Optional<Account> = body.account()

    /** Updates to accountPlan entity CustomFields. */
    fun accountPlan(): Optional<AccountPlan> = body.accountPlan()

    /** Updates to simple Aggregation entity CustomFields. */
    fun aggregation(): Optional<Aggregation> = body.aggregation()

    /** Updates to Compound Aggregation entity CustomFields. */
    fun compoundAggregation(): Optional<CompoundAggregation> = body.compoundAggregation()

    /** Updates to Meter entity CustomFields. */
    fun meter(): Optional<Meter> = body.meter()

    /** Updates to Organization CustomFields. */
    fun organization(): Optional<Organization> = body.organization()

    /** Updates to Plan entity CustomFields. */
    fun plan(): Optional<Plan> = body.plan()

    /** Updates to planTemplate entity CustomFields. */
    fun planTemplate(): Optional<PlanTemplate> = body.planTemplate()

    /** Updates to Product entity CustomFields. */
    fun product(): Optional<Product> = body.product()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     */
    fun version(): Optional<Long> = body.version()

    /** Updates to Account entity CustomFields. */
    fun _account(): JsonField<Account> = body._account()

    /** Updates to accountPlan entity CustomFields. */
    fun _accountPlan(): JsonField<AccountPlan> = body._accountPlan()

    /** Updates to simple Aggregation entity CustomFields. */
    fun _aggregation(): JsonField<Aggregation> = body._aggregation()

    /** Updates to Compound Aggregation entity CustomFields. */
    fun _compoundAggregation(): JsonField<CompoundAggregation> = body._compoundAggregation()

    /** Updates to Meter entity CustomFields. */
    fun _meter(): JsonField<Meter> = body._meter()

    /** Updates to Organization CustomFields. */
    fun _organization(): JsonField<Organization> = body._organization()

    /** Updates to Plan entity CustomFields. */
    fun _plan(): JsonField<Plan> = body._plan()

    /** Updates to planTemplate entity CustomFields. */
    fun _planTemplate(): JsonField<PlanTemplate> = body._planTemplate()

    /** Updates to Product entity CustomFields. */
    fun _product(): JsonField<Product> = body._product()

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

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("account")
        @ExcludeMissing
        private val account: JsonField<Account> = JsonMissing.of(),
        @JsonProperty("accountPlan")
        @ExcludeMissing
        private val accountPlan: JsonField<AccountPlan> = JsonMissing.of(),
        @JsonProperty("aggregation")
        @ExcludeMissing
        private val aggregation: JsonField<Aggregation> = JsonMissing.of(),
        @JsonProperty("compoundAggregation")
        @ExcludeMissing
        private val compoundAggregation: JsonField<CompoundAggregation> = JsonMissing.of(),
        @JsonProperty("meter")
        @ExcludeMissing
        private val meter: JsonField<Meter> = JsonMissing.of(),
        @JsonProperty("organization")
        @ExcludeMissing
        private val organization: JsonField<Organization> = JsonMissing.of(),
        @JsonProperty("plan") @ExcludeMissing private val plan: JsonField<Plan> = JsonMissing.of(),
        @JsonProperty("planTemplate")
        @ExcludeMissing
        private val planTemplate: JsonField<PlanTemplate> = JsonMissing.of(),
        @JsonProperty("product")
        @ExcludeMissing
        private val product: JsonField<Product> = JsonMissing.of(),
        @JsonProperty("version")
        @ExcludeMissing
        private val version: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Updates to Account entity CustomFields. */
        fun account(): Optional<Account> = Optional.ofNullable(account.getNullable("account"))

        /** Updates to accountPlan entity CustomFields. */
        fun accountPlan(): Optional<AccountPlan> =
            Optional.ofNullable(accountPlan.getNullable("accountPlan"))

        /** Updates to simple Aggregation entity CustomFields. */
        fun aggregation(): Optional<Aggregation> =
            Optional.ofNullable(aggregation.getNullable("aggregation"))

        /** Updates to Compound Aggregation entity CustomFields. */
        fun compoundAggregation(): Optional<CompoundAggregation> =
            Optional.ofNullable(compoundAggregation.getNullable("compoundAggregation"))

        /** Updates to Meter entity CustomFields. */
        fun meter(): Optional<Meter> = Optional.ofNullable(meter.getNullable("meter"))

        /** Updates to Organization CustomFields. */
        fun organization(): Optional<Organization> =
            Optional.ofNullable(organization.getNullable("organization"))

        /** Updates to Plan entity CustomFields. */
        fun plan(): Optional<Plan> = Optional.ofNullable(plan.getNullable("plan"))

        /** Updates to planTemplate entity CustomFields. */
        fun planTemplate(): Optional<PlanTemplate> =
            Optional.ofNullable(planTemplate.getNullable("planTemplate"))

        /** Updates to Product entity CustomFields. */
        fun product(): Optional<Product> = Optional.ofNullable(product.getNullable("product"))

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

        /** Updates to Account entity CustomFields. */
        @JsonProperty("account") @ExcludeMissing fun _account(): JsonField<Account> = account

        /** Updates to accountPlan entity CustomFields. */
        @JsonProperty("accountPlan")
        @ExcludeMissing
        fun _accountPlan(): JsonField<AccountPlan> = accountPlan

        /** Updates to simple Aggregation entity CustomFields. */
        @JsonProperty("aggregation")
        @ExcludeMissing
        fun _aggregation(): JsonField<Aggregation> = aggregation

        /** Updates to Compound Aggregation entity CustomFields. */
        @JsonProperty("compoundAggregation")
        @ExcludeMissing
        fun _compoundAggregation(): JsonField<CompoundAggregation> = compoundAggregation

        /** Updates to Meter entity CustomFields. */
        @JsonProperty("meter") @ExcludeMissing fun _meter(): JsonField<Meter> = meter

        /** Updates to Organization CustomFields. */
        @JsonProperty("organization")
        @ExcludeMissing
        fun _organization(): JsonField<Organization> = organization

        /** Updates to Plan entity CustomFields. */
        @JsonProperty("plan") @ExcludeMissing fun _plan(): JsonField<Plan> = plan

        /** Updates to planTemplate entity CustomFields. */
        @JsonProperty("planTemplate")
        @ExcludeMissing
        fun _planTemplate(): JsonField<PlanTemplate> = planTemplate

        /** Updates to Product entity CustomFields. */
        @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<Product> = product

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

            account().ifPresent { it.validate() }
            accountPlan().ifPresent { it.validate() }
            aggregation().ifPresent { it.validate() }
            compoundAggregation().ifPresent { it.validate() }
            meter().ifPresent { it.validate() }
            organization().ifPresent { it.validate() }
            plan().ifPresent { it.validate() }
            planTemplate().ifPresent { it.validate() }
            product().ifPresent { it.validate() }
            version()
            validated = true
        }

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

            /** Updates to Account entity CustomFields. */
            fun account(account: JsonField<Account>) = apply { this.account = account }

            /** Updates to accountPlan entity CustomFields. */
            fun accountPlan(accountPlan: AccountPlan) = accountPlan(JsonField.of(accountPlan))

            /** Updates to accountPlan entity CustomFields. */
            fun accountPlan(accountPlan: JsonField<AccountPlan>) = apply {
                this.accountPlan = accountPlan
            }

            /** Updates to simple Aggregation entity CustomFields. */
            fun aggregation(aggregation: Aggregation) = aggregation(JsonField.of(aggregation))

            /** Updates to simple Aggregation entity CustomFields. */
            fun aggregation(aggregation: JsonField<Aggregation>) = apply {
                this.aggregation = aggregation
            }

            /** Updates to Compound Aggregation entity CustomFields. */
            fun compoundAggregation(compoundAggregation: CompoundAggregation) =
                compoundAggregation(JsonField.of(compoundAggregation))

            /** Updates to Compound Aggregation entity CustomFields. */
            fun compoundAggregation(compoundAggregation: JsonField<CompoundAggregation>) = apply {
                this.compoundAggregation = compoundAggregation
            }

            /** Updates to Meter entity CustomFields. */
            fun meter(meter: Meter) = meter(JsonField.of(meter))

            /** Updates to Meter entity CustomFields. */
            fun meter(meter: JsonField<Meter>) = apply { this.meter = meter }

            /** Updates to Organization CustomFields. */
            fun organization(organization: Organization) = organization(JsonField.of(organization))

            /** Updates to Organization CustomFields. */
            fun organization(organization: JsonField<Organization>) = apply {
                this.organization = organization
            }

            /** Updates to Plan entity CustomFields. */
            fun plan(plan: Plan) = plan(JsonField.of(plan))

            /** Updates to Plan entity CustomFields. */
            fun plan(plan: JsonField<Plan>) = apply { this.plan = plan }

            /** Updates to planTemplate entity CustomFields. */
            fun planTemplate(planTemplate: PlanTemplate) = planTemplate(JsonField.of(planTemplate))

            /** Updates to planTemplate entity CustomFields. */
            fun planTemplate(planTemplate: JsonField<PlanTemplate>) = apply {
                this.planTemplate = planTemplate
            }

            /** Updates to Product entity CustomFields. */
            fun product(product: Product) = product(JsonField.of(product))

            /** Updates to Product entity CustomFields. */
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
                    account,
                    accountPlan,
                    aggregation,
                    compoundAggregation,
                    meter,
                    organization,
                    plan,
                    planTemplate,
                    product,
                    version,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && account == other.account && accountPlan == other.accountPlan && aggregation == other.aggregation && compoundAggregation == other.compoundAggregation && meter == other.meter && organization == other.organization && plan == other.plan && planTemplate == other.planTemplate && product == other.product && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(account, accountPlan, aggregation, compoundAggregation, meter, organization, plan, planTemplate, product, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{account=$account, accountPlan=$accountPlan, aggregation=$aggregation, compoundAggregation=$compoundAggregation, meter=$meter, organization=$organization, plan=$plan, planTemplate=$planTemplate, product=$product, version=$version, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomFieldUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomFieldUpdateParams]. */
    @NoAutoDetect
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

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /** Updates to Account entity CustomFields. */
        fun account(account: Account) = apply { body.account(account) }

        /** Updates to Account entity CustomFields. */
        fun account(account: JsonField<Account>) = apply { body.account(account) }

        /** Updates to accountPlan entity CustomFields. */
        fun accountPlan(accountPlan: AccountPlan) = apply { body.accountPlan(accountPlan) }

        /** Updates to accountPlan entity CustomFields. */
        fun accountPlan(accountPlan: JsonField<AccountPlan>) = apply {
            body.accountPlan(accountPlan)
        }

        /** Updates to simple Aggregation entity CustomFields. */
        fun aggregation(aggregation: Aggregation) = apply { body.aggregation(aggregation) }

        /** Updates to simple Aggregation entity CustomFields. */
        fun aggregation(aggregation: JsonField<Aggregation>) = apply {
            body.aggregation(aggregation)
        }

        /** Updates to Compound Aggregation entity CustomFields. */
        fun compoundAggregation(compoundAggregation: CompoundAggregation) = apply {
            body.compoundAggregation(compoundAggregation)
        }

        /** Updates to Compound Aggregation entity CustomFields. */
        fun compoundAggregation(compoundAggregation: JsonField<CompoundAggregation>) = apply {
            body.compoundAggregation(compoundAggregation)
        }

        /** Updates to Meter entity CustomFields. */
        fun meter(meter: Meter) = apply { body.meter(meter) }

        /** Updates to Meter entity CustomFields. */
        fun meter(meter: JsonField<Meter>) = apply { body.meter(meter) }

        /** Updates to Organization CustomFields. */
        fun organization(organization: Organization) = apply { body.organization(organization) }

        /** Updates to Organization CustomFields. */
        fun organization(organization: JsonField<Organization>) = apply {
            body.organization(organization)
        }

        /** Updates to Plan entity CustomFields. */
        fun plan(plan: Plan) = apply { body.plan(plan) }

        /** Updates to Plan entity CustomFields. */
        fun plan(plan: JsonField<Plan>) = apply { body.plan(plan) }

        /** Updates to planTemplate entity CustomFields. */
        fun planTemplate(planTemplate: PlanTemplate) = apply { body.planTemplate(planTemplate) }

        /** Updates to planTemplate entity CustomFields. */
        fun planTemplate(planTemplate: JsonField<PlanTemplate>) = apply {
            body.planTemplate(planTemplate)
        }

        /** Updates to Product entity CustomFields. */
        fun product(product: Product) = apply { body.product(product) }

        /** Updates to Product entity CustomFields. */
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

        fun build(): CustomFieldUpdateParams =
            CustomFieldUpdateParams(
                checkRequired("orgId", orgId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** Updates to Account entity CustomFields. */
    @NoAutoDetect
    class Account
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Account = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

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

            fun build(): Account = Account(additionalProperties.toImmutable())
        }

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

    /** Updates to accountPlan entity CustomFields. */
    @NoAutoDetect
    class AccountPlan
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AccountPlan = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

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

            fun build(): AccountPlan = AccountPlan(additionalProperties.toImmutable())
        }

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
    @NoAutoDetect
    class Aggregation
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Aggregation = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

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

            fun build(): Aggregation = Aggregation(additionalProperties.toImmutable())
        }

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
    @NoAutoDetect
    class CompoundAggregation
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CompoundAggregation = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

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

            fun build(): CompoundAggregation =
                CompoundAggregation(additionalProperties.toImmutable())
        }

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

    /** Updates to Meter entity CustomFields. */
    @NoAutoDetect
    class Meter
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Meter = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

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

            fun build(): Meter = Meter(additionalProperties.toImmutable())
        }

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
    @NoAutoDetect
    class Organization
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Organization = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

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

            fun build(): Organization = Organization(additionalProperties.toImmutable())
        }

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
    @NoAutoDetect
    class Plan
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Plan = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

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

            fun build(): Plan = Plan(additionalProperties.toImmutable())
        }

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
    @NoAutoDetect
    class PlanTemplate
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PlanTemplate = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

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

            fun build(): PlanTemplate = PlanTemplate(additionalProperties.toImmutable())
        }

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
    @NoAutoDetect
    class Product
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Product = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

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

            fun build(): Product = Product(additionalProperties.toImmutable())
        }

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
