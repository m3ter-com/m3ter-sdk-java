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
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ContractEndDateBillingEntitiesResponse
private constructor(
    private val failedEntities: JsonField<FailedEntities>,
    private val statusMessage: JsonField<String>,
    private val updatedEntities: JsonField<UpdatedEntities>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("failedEntities")
        @ExcludeMissing
        failedEntities: JsonField<FailedEntities> = JsonMissing.of(),
        @JsonProperty("statusMessage")
        @ExcludeMissing
        statusMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedEntities")
        @ExcludeMissing
        updatedEntities: JsonField<UpdatedEntities> = JsonMissing.of(),
    ) : this(failedEntities, statusMessage, updatedEntities, mutableMapOf())

    /**
     * A dictionary with keys as identifiers of billing entities and values as lists containing
     * details of the entities for which the update failed.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun failedEntities(): Optional<FailedEntities> =
        Optional.ofNullable(failedEntities.getNullable("failedEntities"))

    /**
     * A message indicating the status of the operation.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusMessage(): Optional<String> =
        Optional.ofNullable(statusMessage.getNullable("statusMessage"))

    /**
     * A dictionary with keys as identifiers of billing entities and values as lists containing
     * details of the updated entities.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedEntities(): Optional<UpdatedEntities> =
        Optional.ofNullable(updatedEntities.getNullable("updatedEntities"))

    /**
     * Returns the raw JSON value of [failedEntities].
     *
     * Unlike [failedEntities], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failedEntities")
    @ExcludeMissing
    fun _failedEntities(): JsonField<FailedEntities> = failedEntities

    /**
     * Returns the raw JSON value of [statusMessage].
     *
     * Unlike [statusMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("statusMessage")
    @ExcludeMissing
    fun _statusMessage(): JsonField<String> = statusMessage

    /**
     * Returns the raw JSON value of [updatedEntities].
     *
     * Unlike [updatedEntities], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedEntities")
    @ExcludeMissing
    fun _updatedEntities(): JsonField<UpdatedEntities> = updatedEntities

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
         * Returns a mutable builder for constructing an instance of
         * [ContractEndDateBillingEntitiesResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContractEndDateBillingEntitiesResponse]. */
    class Builder internal constructor() {

        private var failedEntities: JsonField<FailedEntities> = JsonMissing.of()
        private var statusMessage: JsonField<String> = JsonMissing.of()
        private var updatedEntities: JsonField<UpdatedEntities> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            contractEndDateBillingEntitiesResponse: ContractEndDateBillingEntitiesResponse
        ) = apply {
            failedEntities = contractEndDateBillingEntitiesResponse.failedEntities
            statusMessage = contractEndDateBillingEntitiesResponse.statusMessage
            updatedEntities = contractEndDateBillingEntitiesResponse.updatedEntities
            additionalProperties =
                contractEndDateBillingEntitiesResponse.additionalProperties.toMutableMap()
        }

        /**
         * A dictionary with keys as identifiers of billing entities and values as lists containing
         * details of the entities for which the update failed.
         */
        fun failedEntities(failedEntities: FailedEntities) =
            failedEntities(JsonField.of(failedEntities))

        /**
         * Sets [Builder.failedEntities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failedEntities] with a well-typed [FailedEntities] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun failedEntities(failedEntities: JsonField<FailedEntities>) = apply {
            this.failedEntities = failedEntities
        }

        /** A message indicating the status of the operation. */
        fun statusMessage(statusMessage: String) = statusMessage(JsonField.of(statusMessage))

        /**
         * Sets [Builder.statusMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun statusMessage(statusMessage: JsonField<String>) = apply {
            this.statusMessage = statusMessage
        }

        /**
         * A dictionary with keys as identifiers of billing entities and values as lists containing
         * details of the updated entities.
         */
        fun updatedEntities(updatedEntities: UpdatedEntities) =
            updatedEntities(JsonField.of(updatedEntities))

        /**
         * Sets [Builder.updatedEntities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedEntities] with a well-typed [UpdatedEntities]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun updatedEntities(updatedEntities: JsonField<UpdatedEntities>) = apply {
            this.updatedEntities = updatedEntities
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
         * Returns an immutable instance of [ContractEndDateBillingEntitiesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ContractEndDateBillingEntitiesResponse =
            ContractEndDateBillingEntitiesResponse(
                failedEntities,
                statusMessage,
                updatedEntities,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ContractEndDateBillingEntitiesResponse = apply {
        if (validated) {
            return@apply
        }

        failedEntities().ifPresent { it.validate() }
        statusMessage()
        updatedEntities().ifPresent { it.validate() }
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
        (failedEntities.asKnown().getOrNull()?.validity() ?: 0) +
            (if (statusMessage.asKnown().isPresent) 1 else 0) +
            (updatedEntities.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * A dictionary with keys as identifiers of billing entities and values as lists containing
     * details of the entities for which the update failed.
     */
    class FailedEntities
    private constructor(
        private val accountplan: JsonField<SetString>,
        private val contract: JsonField<SetString>,
        private val counterPricings: JsonField<SetString>,
        private val prepayment: JsonField<SetString>,
        private val pricings: JsonField<SetString>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ACCOUNTPLAN")
            @ExcludeMissing
            accountplan: JsonField<SetString> = JsonMissing.of(),
            @JsonProperty("CONTRACT")
            @ExcludeMissing
            contract: JsonField<SetString> = JsonMissing.of(),
            @JsonProperty("COUNTER_PRICINGS")
            @ExcludeMissing
            counterPricings: JsonField<SetString> = JsonMissing.of(),
            @JsonProperty("PREPAYMENT")
            @ExcludeMissing
            prepayment: JsonField<SetString> = JsonMissing.of(),
            @JsonProperty("PRICINGS")
            @ExcludeMissing
            pricings: JsonField<SetString> = JsonMissing.of(),
        ) : this(accountplan, contract, counterPricings, prepayment, pricings, mutableMapOf())

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountplan(): Optional<SetString> =
            Optional.ofNullable(accountplan.getNullable("ACCOUNTPLAN"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contract(): Optional<SetString> = Optional.ofNullable(contract.getNullable("CONTRACT"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun counterPricings(): Optional<SetString> =
            Optional.ofNullable(counterPricings.getNullable("COUNTER_PRICINGS"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun prepayment(): Optional<SetString> =
            Optional.ofNullable(prepayment.getNullable("PREPAYMENT"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pricings(): Optional<SetString> = Optional.ofNullable(pricings.getNullable("PRICINGS"))

        /**
         * Returns the raw JSON value of [accountplan].
         *
         * Unlike [accountplan], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ACCOUNTPLAN")
        @ExcludeMissing
        fun _accountplan(): JsonField<SetString> = accountplan

        /**
         * Returns the raw JSON value of [contract].
         *
         * Unlike [contract], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("CONTRACT") @ExcludeMissing fun _contract(): JsonField<SetString> = contract

        /**
         * Returns the raw JSON value of [counterPricings].
         *
         * Unlike [counterPricings], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("COUNTER_PRICINGS")
        @ExcludeMissing
        fun _counterPricings(): JsonField<SetString> = counterPricings

        /**
         * Returns the raw JSON value of [prepayment].
         *
         * Unlike [prepayment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("PREPAYMENT")
        @ExcludeMissing
        fun _prepayment(): JsonField<SetString> = prepayment

        /**
         * Returns the raw JSON value of [pricings].
         *
         * Unlike [pricings], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("PRICINGS") @ExcludeMissing fun _pricings(): JsonField<SetString> = pricings

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

            /** Returns a mutable builder for constructing an instance of [FailedEntities]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FailedEntities]. */
        class Builder internal constructor() {

            private var accountplan: JsonField<SetString> = JsonMissing.of()
            private var contract: JsonField<SetString> = JsonMissing.of()
            private var counterPricings: JsonField<SetString> = JsonMissing.of()
            private var prepayment: JsonField<SetString> = JsonMissing.of()
            private var pricings: JsonField<SetString> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(failedEntities: FailedEntities) = apply {
                accountplan = failedEntities.accountplan
                contract = failedEntities.contract
                counterPricings = failedEntities.counterPricings
                prepayment = failedEntities.prepayment
                pricings = failedEntities.pricings
                additionalProperties = failedEntities.additionalProperties.toMutableMap()
            }

            fun accountplan(accountplan: SetString) = accountplan(JsonField.of(accountplan))

            /**
             * Sets [Builder.accountplan] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountplan] with a well-typed [SetString] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountplan(accountplan: JsonField<SetString>) = apply {
                this.accountplan = accountplan
            }

            fun contract(contract: SetString) = contract(JsonField.of(contract))

            /**
             * Sets [Builder.contract] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contract] with a well-typed [SetString] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contract(contract: JsonField<SetString>) = apply { this.contract = contract }

            fun counterPricings(counterPricings: SetString) =
                counterPricings(JsonField.of(counterPricings))

            /**
             * Sets [Builder.counterPricings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.counterPricings] with a well-typed [SetString] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun counterPricings(counterPricings: JsonField<SetString>) = apply {
                this.counterPricings = counterPricings
            }

            fun prepayment(prepayment: SetString) = prepayment(JsonField.of(prepayment))

            /**
             * Sets [Builder.prepayment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prepayment] with a well-typed [SetString] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prepayment(prepayment: JsonField<SetString>) = apply {
                this.prepayment = prepayment
            }

            fun pricings(pricings: SetString) = pricings(JsonField.of(pricings))

            /**
             * Sets [Builder.pricings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pricings] with a well-typed [SetString] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pricings(pricings: JsonField<SetString>) = apply { this.pricings = pricings }

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
             * Returns an immutable instance of [FailedEntities].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): FailedEntities =
                FailedEntities(
                    accountplan,
                    contract,
                    counterPricings,
                    prepayment,
                    pricings,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): FailedEntities = apply {
            if (validated) {
                return@apply
            }

            accountplan().ifPresent { it.validate() }
            contract().ifPresent { it.validate() }
            counterPricings().ifPresent { it.validate() }
            prepayment().ifPresent { it.validate() }
            pricings().ifPresent { it.validate() }
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
            (accountplan.asKnown().getOrNull()?.validity() ?: 0) +
                (contract.asKnown().getOrNull()?.validity() ?: 0) +
                (counterPricings.asKnown().getOrNull()?.validity() ?: 0) +
                (prepayment.asKnown().getOrNull()?.validity() ?: 0) +
                (pricings.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FailedEntities && accountplan == other.accountplan && contract == other.contract && counterPricings == other.counterPricings && prepayment == other.prepayment && pricings == other.pricings && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountplan, contract, counterPricings, prepayment, pricings, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FailedEntities{accountplan=$accountplan, contract=$contract, counterPricings=$counterPricings, prepayment=$prepayment, pricings=$pricings, additionalProperties=$additionalProperties}"
    }

    /**
     * A dictionary with keys as identifiers of billing entities and values as lists containing
     * details of the updated entities.
     */
    class UpdatedEntities
    private constructor(
        private val accountplan: JsonField<SetString>,
        private val contract: JsonField<SetString>,
        private val counterPricings: JsonField<SetString>,
        private val prepayment: JsonField<SetString>,
        private val pricings: JsonField<SetString>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ACCOUNTPLAN")
            @ExcludeMissing
            accountplan: JsonField<SetString> = JsonMissing.of(),
            @JsonProperty("CONTRACT")
            @ExcludeMissing
            contract: JsonField<SetString> = JsonMissing.of(),
            @JsonProperty("COUNTER_PRICINGS")
            @ExcludeMissing
            counterPricings: JsonField<SetString> = JsonMissing.of(),
            @JsonProperty("PREPAYMENT")
            @ExcludeMissing
            prepayment: JsonField<SetString> = JsonMissing.of(),
            @JsonProperty("PRICINGS")
            @ExcludeMissing
            pricings: JsonField<SetString> = JsonMissing.of(),
        ) : this(accountplan, contract, counterPricings, prepayment, pricings, mutableMapOf())

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountplan(): Optional<SetString> =
            Optional.ofNullable(accountplan.getNullable("ACCOUNTPLAN"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contract(): Optional<SetString> = Optional.ofNullable(contract.getNullable("CONTRACT"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun counterPricings(): Optional<SetString> =
            Optional.ofNullable(counterPricings.getNullable("COUNTER_PRICINGS"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun prepayment(): Optional<SetString> =
            Optional.ofNullable(prepayment.getNullable("PREPAYMENT"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pricings(): Optional<SetString> = Optional.ofNullable(pricings.getNullable("PRICINGS"))

        /**
         * Returns the raw JSON value of [accountplan].
         *
         * Unlike [accountplan], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ACCOUNTPLAN")
        @ExcludeMissing
        fun _accountplan(): JsonField<SetString> = accountplan

        /**
         * Returns the raw JSON value of [contract].
         *
         * Unlike [contract], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("CONTRACT") @ExcludeMissing fun _contract(): JsonField<SetString> = contract

        /**
         * Returns the raw JSON value of [counterPricings].
         *
         * Unlike [counterPricings], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("COUNTER_PRICINGS")
        @ExcludeMissing
        fun _counterPricings(): JsonField<SetString> = counterPricings

        /**
         * Returns the raw JSON value of [prepayment].
         *
         * Unlike [prepayment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("PREPAYMENT")
        @ExcludeMissing
        fun _prepayment(): JsonField<SetString> = prepayment

        /**
         * Returns the raw JSON value of [pricings].
         *
         * Unlike [pricings], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("PRICINGS") @ExcludeMissing fun _pricings(): JsonField<SetString> = pricings

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

            /** Returns a mutable builder for constructing an instance of [UpdatedEntities]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UpdatedEntities]. */
        class Builder internal constructor() {

            private var accountplan: JsonField<SetString> = JsonMissing.of()
            private var contract: JsonField<SetString> = JsonMissing.of()
            private var counterPricings: JsonField<SetString> = JsonMissing.of()
            private var prepayment: JsonField<SetString> = JsonMissing.of()
            private var pricings: JsonField<SetString> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(updatedEntities: UpdatedEntities) = apply {
                accountplan = updatedEntities.accountplan
                contract = updatedEntities.contract
                counterPricings = updatedEntities.counterPricings
                prepayment = updatedEntities.prepayment
                pricings = updatedEntities.pricings
                additionalProperties = updatedEntities.additionalProperties.toMutableMap()
            }

            fun accountplan(accountplan: SetString) = accountplan(JsonField.of(accountplan))

            /**
             * Sets [Builder.accountplan] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountplan] with a well-typed [SetString] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountplan(accountplan: JsonField<SetString>) = apply {
                this.accountplan = accountplan
            }

            fun contract(contract: SetString) = contract(JsonField.of(contract))

            /**
             * Sets [Builder.contract] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contract] with a well-typed [SetString] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contract(contract: JsonField<SetString>) = apply { this.contract = contract }

            fun counterPricings(counterPricings: SetString) =
                counterPricings(JsonField.of(counterPricings))

            /**
             * Sets [Builder.counterPricings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.counterPricings] with a well-typed [SetString] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun counterPricings(counterPricings: JsonField<SetString>) = apply {
                this.counterPricings = counterPricings
            }

            fun prepayment(prepayment: SetString) = prepayment(JsonField.of(prepayment))

            /**
             * Sets [Builder.prepayment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prepayment] with a well-typed [SetString] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prepayment(prepayment: JsonField<SetString>) = apply {
                this.prepayment = prepayment
            }

            fun pricings(pricings: SetString) = pricings(JsonField.of(pricings))

            /**
             * Sets [Builder.pricings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pricings] with a well-typed [SetString] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pricings(pricings: JsonField<SetString>) = apply { this.pricings = pricings }

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
             * Returns an immutable instance of [UpdatedEntities].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): UpdatedEntities =
                UpdatedEntities(
                    accountplan,
                    contract,
                    counterPricings,
                    prepayment,
                    pricings,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UpdatedEntities = apply {
            if (validated) {
                return@apply
            }

            accountplan().ifPresent { it.validate() }
            contract().ifPresent { it.validate() }
            counterPricings().ifPresent { it.validate() }
            prepayment().ifPresent { it.validate() }
            pricings().ifPresent { it.validate() }
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
            (accountplan.asKnown().getOrNull()?.validity() ?: 0) +
                (contract.asKnown().getOrNull()?.validity() ?: 0) +
                (counterPricings.asKnown().getOrNull()?.validity() ?: 0) +
                (prepayment.asKnown().getOrNull()?.validity() ?: 0) +
                (pricings.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UpdatedEntities && accountplan == other.accountplan && contract == other.contract && counterPricings == other.counterPricings && prepayment == other.prepayment && pricings == other.pricings && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountplan, contract, counterPricings, prepayment, pricings, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UpdatedEntities{accountplan=$accountplan, contract=$contract, counterPricings=$counterPricings, prepayment=$prepayment, pricings=$pricings, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractEndDateBillingEntitiesResponse && failedEntities == other.failedEntities && statusMessage == other.statusMessage && updatedEntities == other.updatedEntities && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(failedEntities, statusMessage, updatedEntities, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContractEndDateBillingEntitiesResponse{failedEntities=$failedEntities, statusMessage=$statusMessage, updatedEntities=$updatedEntities, additionalProperties=$additionalProperties}"
}
