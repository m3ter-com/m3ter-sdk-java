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
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class CustomFieldsResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
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
    @JsonProperty("createdBy")
    @ExcludeMissing
    private val createdBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("dtCreated")
    @ExcludeMissing
    private val dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    private val dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    private val lastModifiedBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("meter") @ExcludeMissing private val meter: JsonField<Meter> = JsonMissing.of(),
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

    /** CustomFields added to Account entities. */
    fun account(): Optional<Account> = Optional.ofNullable(account.getNullable("account"))

    /** CustomFields added to accountPlan entities. */
    fun accountPlan(): Optional<AccountPlan> =
        Optional.ofNullable(accountPlan.getNullable("accountPlan"))

    /** CustomFields added to simple Aggregation entities. */
    fun aggregation(): Optional<Aggregation> =
        Optional.ofNullable(aggregation.getNullable("aggregation"))

    /** CustomFields added to Compound Aggregation entities. */
    fun compoundAggregation(): Optional<CompoundAggregation> =
        Optional.ofNullable(compoundAggregation.getNullable("compoundAggregation"))

    /** The id of the user who created this custom field. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /** The DateTime when the Organization was created _(in ISO-8601 format)_. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /**
     * The DateTime when a custom field was last modified - created, modified, or deleted - for the
     * Organization _(in ISO-8601 format)_.
     */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /** The id of the user who last modified this custom field. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /** CustomFields added to Meter entities. */
    fun meter(): Optional<Meter> = Optional.ofNullable(meter.getNullable("meter"))

    /** CustomFields added to the Organization. */
    fun organization(): Optional<Organization> =
        Optional.ofNullable(organization.getNullable("organization"))

    /** CustomFields added to Plan entities. */
    fun plan(): Optional<Plan> = Optional.ofNullable(plan.getNullable("plan"))

    /** CustomFields added to planTemplate entities. */
    fun planTemplate(): Optional<PlanTemplate> =
        Optional.ofNullable(planTemplate.getNullable("planTemplate"))

    /** CustomFields added to Product entities. */
    fun product(): Optional<Product> = Optional.ofNullable(product.getNullable("product"))

    /** The UUID of the entity. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    /** CustomFields added to Account entities. */
    @JsonProperty("account") @ExcludeMissing fun _account(): JsonField<Account> = account

    /** CustomFields added to accountPlan entities. */
    @JsonProperty("accountPlan")
    @ExcludeMissing
    fun _accountPlan(): JsonField<AccountPlan> = accountPlan

    /** CustomFields added to simple Aggregation entities. */
    @JsonProperty("aggregation")
    @ExcludeMissing
    fun _aggregation(): JsonField<Aggregation> = aggregation

    /** CustomFields added to Compound Aggregation entities. */
    @JsonProperty("compoundAggregation")
    @ExcludeMissing
    fun _compoundAggregation(): JsonField<CompoundAggregation> = compoundAggregation

    /** The id of the user who created this custom field. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /** The DateTime when the Organization was created _(in ISO-8601 format)_. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /**
     * The DateTime when a custom field was last modified - created, modified, or deleted - for the
     * Organization _(in ISO-8601 format)_.
     */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /** The id of the user who last modified this custom field. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /** CustomFields added to Meter entities. */
    @JsonProperty("meter") @ExcludeMissing fun _meter(): JsonField<Meter> = meter

    /** CustomFields added to the Organization. */
    @JsonProperty("organization")
    @ExcludeMissing
    fun _organization(): JsonField<Organization> = organization

    /** CustomFields added to Plan entities. */
    @JsonProperty("plan") @ExcludeMissing fun _plan(): JsonField<Plan> = plan

    /** CustomFields added to planTemplate entities. */
    @JsonProperty("planTemplate")
    @ExcludeMissing
    fun _planTemplate(): JsonField<PlanTemplate> = planTemplate

    /** CustomFields added to Product entities. */
    @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<Product> = product

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CustomFieldsResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        version()
        account().ifPresent { it.validate() }
        accountPlan().ifPresent { it.validate() }
        aggregation().ifPresent { it.validate() }
        compoundAggregation().ifPresent { it.validate() }
        createdBy()
        dtCreated()
        dtLastModified()
        lastModifiedBy()
        meter().ifPresent { it.validate() }
        organization().ifPresent { it.validate() }
        plan().ifPresent { it.validate() }
        planTemplate().ifPresent { it.validate() }
        product().ifPresent { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomFieldsResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomFieldsResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var account: JsonField<Account> = JsonMissing.of()
        private var accountPlan: JsonField<AccountPlan> = JsonMissing.of()
        private var aggregation: JsonField<Aggregation> = JsonMissing.of()
        private var compoundAggregation: JsonField<CompoundAggregation> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var meter: JsonField<Meter> = JsonMissing.of()
        private var organization: JsonField<Organization> = JsonMissing.of()
        private var plan: JsonField<Plan> = JsonMissing.of()
        private var planTemplate: JsonField<PlanTemplate> = JsonMissing.of()
        private var product: JsonField<Product> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customFieldsResponse: CustomFieldsResponse) = apply {
            id = customFieldsResponse.id
            version = customFieldsResponse.version
            account = customFieldsResponse.account
            accountPlan = customFieldsResponse.accountPlan
            aggregation = customFieldsResponse.aggregation
            compoundAggregation = customFieldsResponse.compoundAggregation
            createdBy = customFieldsResponse.createdBy
            dtCreated = customFieldsResponse.dtCreated
            dtLastModified = customFieldsResponse.dtLastModified
            lastModifiedBy = customFieldsResponse.lastModifiedBy
            meter = customFieldsResponse.meter
            organization = customFieldsResponse.organization
            plan = customFieldsResponse.plan
            planTemplate = customFieldsResponse.planTemplate
            product = customFieldsResponse.product
            additionalProperties = customFieldsResponse.additionalProperties.toMutableMap()
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

        /** CustomFields added to Account entities. */
        fun account(account: Account) = account(JsonField.of(account))

        /** CustomFields added to Account entities. */
        fun account(account: JsonField<Account>) = apply { this.account = account }

        /** CustomFields added to accountPlan entities. */
        fun accountPlan(accountPlan: AccountPlan) = accountPlan(JsonField.of(accountPlan))

        /** CustomFields added to accountPlan entities. */
        fun accountPlan(accountPlan: JsonField<AccountPlan>) = apply {
            this.accountPlan = accountPlan
        }

        /** CustomFields added to simple Aggregation entities. */
        fun aggregation(aggregation: Aggregation) = aggregation(JsonField.of(aggregation))

        /** CustomFields added to simple Aggregation entities. */
        fun aggregation(aggregation: JsonField<Aggregation>) = apply {
            this.aggregation = aggregation
        }

        /** CustomFields added to Compound Aggregation entities. */
        fun compoundAggregation(compoundAggregation: CompoundAggregation) =
            compoundAggregation(JsonField.of(compoundAggregation))

        /** CustomFields added to Compound Aggregation entities. */
        fun compoundAggregation(compoundAggregation: JsonField<CompoundAggregation>) = apply {
            this.compoundAggregation = compoundAggregation
        }

        /** The id of the user who created this custom field. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The id of the user who created this custom field. */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The DateTime when the Organization was created _(in ISO-8601 format)_. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /** The DateTime when the Organization was created _(in ISO-8601 format)_. */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /**
         * The DateTime when a custom field was last modified - created, modified, or deleted - for
         * the Organization _(in ISO-8601 format)_.
         */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /**
         * The DateTime when a custom field was last modified - created, modified, or deleted - for
         * the Organization _(in ISO-8601 format)_.
         */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        /** The id of the user who last modified this custom field. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The id of the user who last modified this custom field. */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
        }

        /** CustomFields added to Meter entities. */
        fun meter(meter: Meter) = meter(JsonField.of(meter))

        /** CustomFields added to Meter entities. */
        fun meter(meter: JsonField<Meter>) = apply { this.meter = meter }

        /** CustomFields added to the Organization. */
        fun organization(organization: Organization) = organization(JsonField.of(organization))

        /** CustomFields added to the Organization. */
        fun organization(organization: JsonField<Organization>) = apply {
            this.organization = organization
        }

        /** CustomFields added to Plan entities. */
        fun plan(plan: Plan) = plan(JsonField.of(plan))

        /** CustomFields added to Plan entities. */
        fun plan(plan: JsonField<Plan>) = apply { this.plan = plan }

        /** CustomFields added to planTemplate entities. */
        fun planTemplate(planTemplate: PlanTemplate) = planTemplate(JsonField.of(planTemplate))

        /** CustomFields added to planTemplate entities. */
        fun planTemplate(planTemplate: JsonField<PlanTemplate>) = apply {
            this.planTemplate = planTemplate
        }

        /** CustomFields added to Product entities. */
        fun product(product: Product) = product(JsonField.of(product))

        /** CustomFields added to Product entities. */
        fun product(product: JsonField<Product>) = apply { this.product = product }

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

        fun build(): CustomFieldsResponse =
            CustomFieldsResponse(
                checkRequired("id", id),
                checkRequired("version", version),
                account,
                accountPlan,
                aggregation,
                compoundAggregation,
                createdBy,
                dtCreated,
                dtLastModified,
                lastModifiedBy,
                meter,
                organization,
                plan,
                planTemplate,
                product,
                additionalProperties.toImmutable(),
            )
    }

    /** CustomFields added to Account entities. */
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

    /** CustomFields added to accountPlan entities. */
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

    /** CustomFields added to simple Aggregation entities. */
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

    /** CustomFields added to Compound Aggregation entities. */
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

    /** CustomFields added to Meter entities. */
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

    /** CustomFields added to the Organization. */
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

    /** CustomFields added to Plan entities. */
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

    /** CustomFields added to planTemplate entities. */
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

    /** CustomFields added to Product entities. */
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

        return /* spotless:off */ other is CustomFieldsResponse && id == other.id && version == other.version && account == other.account && accountPlan == other.accountPlan && aggregation == other.aggregation && compoundAggregation == other.compoundAggregation && createdBy == other.createdBy && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && lastModifiedBy == other.lastModifiedBy && meter == other.meter && organization == other.organization && plan == other.plan && planTemplate == other.planTemplate && product == other.product && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, account, accountPlan, aggregation, compoundAggregation, createdBy, dtCreated, dtLastModified, lastModifiedBy, meter, organization, plan, planTemplate, product, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomFieldsResponse{id=$id, version=$version, account=$account, accountPlan=$accountPlan, aggregation=$aggregation, compoundAggregation=$compoundAggregation, createdBy=$createdBy, dtCreated=$dtCreated, dtLastModified=$dtLastModified, lastModifiedBy=$lastModifiedBy, meter=$meter, organization=$organization, plan=$plan, planTemplate=$planTemplate, product=$product, additionalProperties=$additionalProperties}"
}
