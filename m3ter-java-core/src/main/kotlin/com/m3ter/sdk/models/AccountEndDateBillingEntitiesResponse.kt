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
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class AccountEndDateBillingEntitiesResponse
@JsonCreator
private constructor(
    @JsonProperty("failedEntities")
    @ExcludeMissing
    private val failedEntities: JsonField<FailedEntities> = JsonMissing.of(),
    @JsonProperty("statusMessage")
    @ExcludeMissing
    private val statusMessage: JsonField<String> = JsonMissing.of(),
    @JsonProperty("updatedEntities")
    @ExcludeMissing
    private val updatedEntities: JsonField<UpdatedEntities> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * A dictionary with keys as identifiers of billing entities and values as lists containing
     * details of the entities for which the update failed.
     */
    fun failedEntities(): Optional<FailedEntities> =
        Optional.ofNullable(failedEntities.getNullable("failedEntities"))

    /** A message indicating the status of the operation. */
    fun statusMessage(): Optional<String> =
        Optional.ofNullable(statusMessage.getNullable("statusMessage"))

    /**
     * A dictionary with keys as identifiers of billing entities and values as lists containing
     * details of the updated entities.
     */
    fun updatedEntities(): Optional<UpdatedEntities> =
        Optional.ofNullable(updatedEntities.getNullable("updatedEntities"))

    /**
     * A dictionary with keys as identifiers of billing entities and values as lists containing
     * details of the entities for which the update failed.
     */
    @JsonProperty("failedEntities")
    @ExcludeMissing
    fun _failedEntities(): JsonField<FailedEntities> = failedEntities

    /** A message indicating the status of the operation. */
    @JsonProperty("statusMessage")
    @ExcludeMissing
    fun _statusMessage(): JsonField<String> = statusMessage

    /**
     * A dictionary with keys as identifiers of billing entities and values as lists containing
     * details of the updated entities.
     */
    @JsonProperty("updatedEntities")
    @ExcludeMissing
    fun _updatedEntities(): JsonField<UpdatedEntities> = updatedEntities

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AccountEndDateBillingEntitiesResponse = apply {
        if (validated) {
            return@apply
        }

        failedEntities().ifPresent { it.validate() }
        statusMessage()
        updatedEntities().ifPresent { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountEndDateBillingEntitiesResponse]. */
    class Builder internal constructor() {

        private var failedEntities: JsonField<FailedEntities> = JsonMissing.of()
        private var statusMessage: JsonField<String> = JsonMissing.of()
        private var updatedEntities: JsonField<UpdatedEntities> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            accountEndDateBillingEntitiesResponse: AccountEndDateBillingEntitiesResponse
        ) = apply {
            failedEntities = accountEndDateBillingEntitiesResponse.failedEntities
            statusMessage = accountEndDateBillingEntitiesResponse.statusMessage
            updatedEntities = accountEndDateBillingEntitiesResponse.updatedEntities
            additionalProperties =
                accountEndDateBillingEntitiesResponse.additionalProperties.toMutableMap()
        }

        /**
         * A dictionary with keys as identifiers of billing entities and values as lists containing
         * details of the entities for which the update failed.
         */
        fun failedEntities(failedEntities: FailedEntities) =
            failedEntities(JsonField.of(failedEntities))

        /**
         * A dictionary with keys as identifiers of billing entities and values as lists containing
         * details of the entities for which the update failed.
         */
        fun failedEntities(failedEntities: JsonField<FailedEntities>) = apply {
            this.failedEntities = failedEntities
        }

        /** A message indicating the status of the operation. */
        fun statusMessage(statusMessage: String) = statusMessage(JsonField.of(statusMessage))

        /** A message indicating the status of the operation. */
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
         * A dictionary with keys as identifiers of billing entities and values as lists containing
         * details of the updated entities.
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

        fun build(): AccountEndDateBillingEntitiesResponse =
            AccountEndDateBillingEntitiesResponse(
                failedEntities,
                statusMessage,
                updatedEntities,
                additionalProperties.toImmutable(),
            )
    }

    /**
     * A dictionary with keys as identifiers of billing entities and values as lists containing
     * details of the entities for which the update failed.
     */
    @NoAutoDetect
    class FailedEntities
    @JsonCreator
    private constructor(
        @JsonProperty("ACCOUNTPLAN")
        @ExcludeMissing
        private val accountplan: JsonField<SetString> = JsonMissing.of(),
        @JsonProperty("CONTRACT")
        @ExcludeMissing
        private val contract: JsonField<SetString> = JsonMissing.of(),
        @JsonProperty("COUNTER_PRICINGS")
        @ExcludeMissing
        private val counterPricings: JsonField<SetString> = JsonMissing.of(),
        @JsonProperty("PREPAYMENT")
        @ExcludeMissing
        private val prepayment: JsonField<SetString> = JsonMissing.of(),
        @JsonProperty("PRICINGS")
        @ExcludeMissing
        private val pricings: JsonField<SetString> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun accountplan(): Optional<SetString> =
            Optional.ofNullable(accountplan.getNullable("ACCOUNTPLAN"))

        fun contract(): Optional<SetString> = Optional.ofNullable(contract.getNullable("CONTRACT"))

        fun counterPricings(): Optional<SetString> =
            Optional.ofNullable(counterPricings.getNullable("COUNTER_PRICINGS"))

        fun prepayment(): Optional<SetString> =
            Optional.ofNullable(prepayment.getNullable("PREPAYMENT"))

        fun pricings(): Optional<SetString> = Optional.ofNullable(pricings.getNullable("PRICINGS"))

        @JsonProperty("ACCOUNTPLAN")
        @ExcludeMissing
        fun _accountplan(): JsonField<SetString> = accountplan

        @JsonProperty("CONTRACT") @ExcludeMissing fun _contract(): JsonField<SetString> = contract

        @JsonProperty("COUNTER_PRICINGS")
        @ExcludeMissing
        fun _counterPricings(): JsonField<SetString> = counterPricings

        @JsonProperty("PREPAYMENT")
        @ExcludeMissing
        fun _prepayment(): JsonField<SetString> = prepayment

        @JsonProperty("PRICINGS") @ExcludeMissing fun _pricings(): JsonField<SetString> = pricings

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun accountplan(accountplan: JsonField<SetString>) = apply {
                this.accountplan = accountplan
            }

            fun contract(contract: SetString) = contract(JsonField.of(contract))

            fun contract(contract: JsonField<SetString>) = apply { this.contract = contract }

            fun counterPricings(counterPricings: SetString) =
                counterPricings(JsonField.of(counterPricings))

            fun counterPricings(counterPricings: JsonField<SetString>) = apply {
                this.counterPricings = counterPricings
            }

            fun prepayment(prepayment: SetString) = prepayment(JsonField.of(prepayment))

            fun prepayment(prepayment: JsonField<SetString>) = apply {
                this.prepayment = prepayment
            }

            fun pricings(pricings: SetString) = pricings(JsonField.of(pricings))

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

            fun build(): FailedEntities =
                FailedEntities(
                    accountplan,
                    contract,
                    counterPricings,
                    prepayment,
                    pricings,
                    additionalProperties.toImmutable(),
                )
        }

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
    @NoAutoDetect
    class UpdatedEntities
    @JsonCreator
    private constructor(
        @JsonProperty("ACCOUNTPLAN")
        @ExcludeMissing
        private val accountplan: JsonField<SetString> = JsonMissing.of(),
        @JsonProperty("CONTRACT")
        @ExcludeMissing
        private val contract: JsonField<SetString> = JsonMissing.of(),
        @JsonProperty("COUNTER_PRICINGS")
        @ExcludeMissing
        private val counterPricings: JsonField<SetString> = JsonMissing.of(),
        @JsonProperty("PREPAYMENT")
        @ExcludeMissing
        private val prepayment: JsonField<SetString> = JsonMissing.of(),
        @JsonProperty("PRICINGS")
        @ExcludeMissing
        private val pricings: JsonField<SetString> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun accountplan(): Optional<SetString> =
            Optional.ofNullable(accountplan.getNullable("ACCOUNTPLAN"))

        fun contract(): Optional<SetString> = Optional.ofNullable(contract.getNullable("CONTRACT"))

        fun counterPricings(): Optional<SetString> =
            Optional.ofNullable(counterPricings.getNullable("COUNTER_PRICINGS"))

        fun prepayment(): Optional<SetString> =
            Optional.ofNullable(prepayment.getNullable("PREPAYMENT"))

        fun pricings(): Optional<SetString> = Optional.ofNullable(pricings.getNullable("PRICINGS"))

        @JsonProperty("ACCOUNTPLAN")
        @ExcludeMissing
        fun _accountplan(): JsonField<SetString> = accountplan

        @JsonProperty("CONTRACT") @ExcludeMissing fun _contract(): JsonField<SetString> = contract

        @JsonProperty("COUNTER_PRICINGS")
        @ExcludeMissing
        fun _counterPricings(): JsonField<SetString> = counterPricings

        @JsonProperty("PREPAYMENT")
        @ExcludeMissing
        fun _prepayment(): JsonField<SetString> = prepayment

        @JsonProperty("PRICINGS") @ExcludeMissing fun _pricings(): JsonField<SetString> = pricings

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun accountplan(accountplan: JsonField<SetString>) = apply {
                this.accountplan = accountplan
            }

            fun contract(contract: SetString) = contract(JsonField.of(contract))

            fun contract(contract: JsonField<SetString>) = apply { this.contract = contract }

            fun counterPricings(counterPricings: SetString) =
                counterPricings(JsonField.of(counterPricings))

            fun counterPricings(counterPricings: JsonField<SetString>) = apply {
                this.counterPricings = counterPricings
            }

            fun prepayment(prepayment: SetString) = prepayment(JsonField.of(prepayment))

            fun prepayment(prepayment: JsonField<SetString>) = apply {
                this.prepayment = prepayment
            }

            fun pricings(pricings: SetString) = pricings(JsonField.of(pricings))

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

            fun build(): UpdatedEntities =
                UpdatedEntities(
                    accountplan,
                    contract,
                    counterPricings,
                    prepayment,
                    pricings,
                    additionalProperties.toImmutable(),
                )
        }

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

        return /* spotless:off */ other is AccountEndDateBillingEntitiesResponse && failedEntities == other.failedEntities && statusMessage == other.statusMessage && updatedEntities == other.updatedEntities && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(failedEntities, statusMessage, updatedEntities, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountEndDateBillingEntitiesResponse{failedEntities=$failedEntities, statusMessage=$statusMessage, updatedEntities=$updatedEntities, additionalProperties=$additionalProperties}"
}
