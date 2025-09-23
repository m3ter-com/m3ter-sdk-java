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
import com.m3ter.core.checkRequired
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MeasurementRequest
private constructor(
    private val account: JsonField<String>,
    private val meter: JsonField<String>,
    private val ts: JsonField<OffsetDateTime>,
    private val cost: JsonField<Cost>,
    private val ets: JsonField<OffsetDateTime>,
    private val income: JsonField<Income>,
    private val measure: JsonField<Measure>,
    private val metadata: JsonField<Metadata>,
    private val other: JsonField<Other>,
    private val uid: JsonField<String>,
    private val what: JsonField<What>,
    private val where: JsonField<Where>,
    private val who: JsonField<Who>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("account") @ExcludeMissing account: JsonField<String> = JsonMissing.of(),
        @JsonProperty("meter") @ExcludeMissing meter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ts") @ExcludeMissing ts: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("cost") @ExcludeMissing cost: JsonField<Cost> = JsonMissing.of(),
        @JsonProperty("ets") @ExcludeMissing ets: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("income") @ExcludeMissing income: JsonField<Income> = JsonMissing.of(),
        @JsonProperty("measure") @ExcludeMissing measure: JsonField<Measure> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("other") @ExcludeMissing other: JsonField<Other> = JsonMissing.of(),
        @JsonProperty("uid") @ExcludeMissing uid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("what") @ExcludeMissing what: JsonField<What> = JsonMissing.of(),
        @JsonProperty("where") @ExcludeMissing where: JsonField<Where> = JsonMissing.of(),
        @JsonProperty("who") @ExcludeMissing who: JsonField<Who> = JsonMissing.of(),
    ) : this(
        account,
        meter,
        ts,
        cost,
        ets,
        income,
        measure,
        metadata,
        other,
        uid,
        what,
        where,
        who,
        mutableMapOf(),
    )

    /**
     * Code of the Account the measurement is for.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun account(): String = account.getRequired("account")

    /**
     * Short code identifying the Meter the measurement is for.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meter(): String = meter.getRequired("meter")

    /**
     * Timestamp for the measurement *(in ISO 8601 format)*.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ts(): OffsetDateTime = ts.getRequired("ts")

    /**
     * 'cost' values
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cost(): Optional<Cost> = cost.getOptional("cost")

    /**
     * End timestamp for the measurement *(in ISO 8601 format)*. *(Optional)*.
     *
     * Can be used in the case a usage event needs to have an explicit start and end rather than
     * being instantaneous.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ets(): Optional<OffsetDateTime> = ets.getOptional("ets")

    /**
     * 'income' values
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun income(): Optional<Income> = income.getOptional("income")

    /**
     * 'measure' values
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun measure(): Optional<Measure> = measure.getOptional("measure")

    /**
     * 'metadata' values
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

    /**
     * 'other' values
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun other(): Optional<Other> = other.getOptional("other")

    /**
     * Unique ID for this measurement.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uid(): Optional<String> = uid.getOptional("uid")

    /**
     * 'what' values
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun what(): Optional<What> = what.getOptional("what")

    /**
     * 'where' values
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun where(): Optional<Where> = where.getOptional("where")

    /**
     * 'who' values
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun who(): Optional<Who> = who.getOptional("who")

    /**
     * Returns the raw JSON value of [account].
     *
     * Unlike [account], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account") @ExcludeMissing fun _account(): JsonField<String> = account

    /**
     * Returns the raw JSON value of [meter].
     *
     * Unlike [meter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meter") @ExcludeMissing fun _meter(): JsonField<String> = meter

    /**
     * Returns the raw JSON value of [ts].
     *
     * Unlike [ts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ts") @ExcludeMissing fun _ts(): JsonField<OffsetDateTime> = ts

    /**
     * Returns the raw JSON value of [cost].
     *
     * Unlike [cost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<Cost> = cost

    /**
     * Returns the raw JSON value of [ets].
     *
     * Unlike [ets], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ets") @ExcludeMissing fun _ets(): JsonField<OffsetDateTime> = ets

    /**
     * Returns the raw JSON value of [income].
     *
     * Unlike [income], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("income") @ExcludeMissing fun _income(): JsonField<Income> = income

    /**
     * Returns the raw JSON value of [measure].
     *
     * Unlike [measure], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("measure") @ExcludeMissing fun _measure(): JsonField<Measure> = measure

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [other].
     *
     * Unlike [other], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("other") @ExcludeMissing fun _other(): JsonField<Other> = other

    /**
     * Returns the raw JSON value of [uid].
     *
     * Unlike [uid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uid") @ExcludeMissing fun _uid(): JsonField<String> = uid

    /**
     * Returns the raw JSON value of [what].
     *
     * Unlike [what], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("what") @ExcludeMissing fun _what(): JsonField<What> = what

    /**
     * Returns the raw JSON value of [where].
     *
     * Unlike [where], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("where") @ExcludeMissing fun _where(): JsonField<Where> = where

    /**
     * Returns the raw JSON value of [who].
     *
     * Unlike [who], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("who") @ExcludeMissing fun _who(): JsonField<Who> = who

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
         * Returns a mutable builder for constructing an instance of [MeasurementRequest].
         *
         * The following fields are required:
         * ```java
         * .account()
         * .meter()
         * .ts()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MeasurementRequest]. */
    class Builder internal constructor() {

        private var account: JsonField<String>? = null
        private var meter: JsonField<String>? = null
        private var ts: JsonField<OffsetDateTime>? = null
        private var cost: JsonField<Cost> = JsonMissing.of()
        private var ets: JsonField<OffsetDateTime> = JsonMissing.of()
        private var income: JsonField<Income> = JsonMissing.of()
        private var measure: JsonField<Measure> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var other: JsonField<Other> = JsonMissing.of()
        private var uid: JsonField<String> = JsonMissing.of()
        private var what: JsonField<What> = JsonMissing.of()
        private var where: JsonField<Where> = JsonMissing.of()
        private var who: JsonField<Who> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(measurementRequest: MeasurementRequest) = apply {
            account = measurementRequest.account
            meter = measurementRequest.meter
            ts = measurementRequest.ts
            cost = measurementRequest.cost
            ets = measurementRequest.ets
            income = measurementRequest.income
            measure = measurementRequest.measure
            metadata = measurementRequest.metadata
            other = measurementRequest.other
            uid = measurementRequest.uid
            what = measurementRequest.what
            where = measurementRequest.where
            who = measurementRequest.who
            additionalProperties = measurementRequest.additionalProperties.toMutableMap()
        }

        /** Code of the Account the measurement is for. */
        fun account(account: String) = account(JsonField.of(account))

        /**
         * Sets [Builder.account] to an arbitrary JSON value.
         *
         * You should usually call [Builder.account] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun account(account: JsonField<String>) = apply { this.account = account }

        /** Short code identifying the Meter the measurement is for. */
        fun meter(meter: String) = meter(JsonField.of(meter))

        /**
         * Sets [Builder.meter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meter] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meter(meter: JsonField<String>) = apply { this.meter = meter }

        /** Timestamp for the measurement *(in ISO 8601 format)*. */
        fun ts(ts: OffsetDateTime) = ts(JsonField.of(ts))

        /**
         * Sets [Builder.ts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ts] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ts(ts: JsonField<OffsetDateTime>) = apply { this.ts = ts }

        /** 'cost' values */
        fun cost(cost: Cost) = cost(JsonField.of(cost))

        /**
         * Sets [Builder.cost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cost] with a well-typed [Cost] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cost(cost: JsonField<Cost>) = apply { this.cost = cost }

        /**
         * End timestamp for the measurement *(in ISO 8601 format)*. *(Optional)*.
         *
         * Can be used in the case a usage event needs to have an explicit start and end rather than
         * being instantaneous.
         */
        fun ets(ets: OffsetDateTime) = ets(JsonField.of(ets))

        /**
         * Sets [Builder.ets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ets] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ets(ets: JsonField<OffsetDateTime>) = apply { this.ets = ets }

        /** 'income' values */
        fun income(income: Income) = income(JsonField.of(income))

        /**
         * Sets [Builder.income] to an arbitrary JSON value.
         *
         * You should usually call [Builder.income] with a well-typed [Income] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun income(income: JsonField<Income>) = apply { this.income = income }

        /** 'measure' values */
        fun measure(measure: Measure) = measure(JsonField.of(measure))

        /**
         * Sets [Builder.measure] to an arbitrary JSON value.
         *
         * You should usually call [Builder.measure] with a well-typed [Measure] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun measure(measure: JsonField<Measure>) = apply { this.measure = measure }

        /** 'metadata' values */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** 'other' values */
        fun other(other: Other) = other(JsonField.of(other))

        /**
         * Sets [Builder.other] to an arbitrary JSON value.
         *
         * You should usually call [Builder.other] with a well-typed [Other] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun other(other: JsonField<Other>) = apply { this.other = other }

        /** Unique ID for this measurement. */
        fun uid(uid: String) = uid(JsonField.of(uid))

        /**
         * Sets [Builder.uid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uid(uid: JsonField<String>) = apply { this.uid = uid }

        /** 'what' values */
        fun what(what: What) = what(JsonField.of(what))

        /**
         * Sets [Builder.what] to an arbitrary JSON value.
         *
         * You should usually call [Builder.what] with a well-typed [What] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun what(what: JsonField<What>) = apply { this.what = what }

        /** 'where' values */
        fun where(where: Where) = where(JsonField.of(where))

        /**
         * Sets [Builder.where] to an arbitrary JSON value.
         *
         * You should usually call [Builder.where] with a well-typed [Where] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun where(where: JsonField<Where>) = apply { this.where = where }

        /** 'who' values */
        fun who(who: Who) = who(JsonField.of(who))

        /**
         * Sets [Builder.who] to an arbitrary JSON value.
         *
         * You should usually call [Builder.who] with a well-typed [Who] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun who(who: JsonField<Who>) = apply { this.who = who }

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
         * Returns an immutable instance of [MeasurementRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .account()
         * .meter()
         * .ts()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MeasurementRequest =
            MeasurementRequest(
                checkRequired("account", account),
                checkRequired("meter", meter),
                checkRequired("ts", ts),
                cost,
                ets,
                income,
                measure,
                metadata,
                other,
                uid,
                what,
                where,
                who,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MeasurementRequest = apply {
        if (validated) {
            return@apply
        }

        account()
        meter()
        ts()
        cost().ifPresent { it.validate() }
        ets()
        income().ifPresent { it.validate() }
        measure().ifPresent { it.validate() }
        metadata().ifPresent { it.validate() }
        other().ifPresent { it.validate() }
        uid()
        what().ifPresent { it.validate() }
        where().ifPresent { it.validate() }
        who().ifPresent { it.validate() }
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
        (if (account.asKnown().isPresent) 1 else 0) +
            (if (meter.asKnown().isPresent) 1 else 0) +
            (if (ts.asKnown().isPresent) 1 else 0) +
            (cost.asKnown().getOrNull()?.validity() ?: 0) +
            (if (ets.asKnown().isPresent) 1 else 0) +
            (income.asKnown().getOrNull()?.validity() ?: 0) +
            (measure.asKnown().getOrNull()?.validity() ?: 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (other.asKnown().getOrNull()?.validity() ?: 0) +
            (if (uid.asKnown().isPresent) 1 else 0) +
            (what.asKnown().getOrNull()?.validity() ?: 0) +
            (where.asKnown().getOrNull()?.validity() ?: 0) +
            (who.asKnown().getOrNull()?.validity() ?: 0)

    /** 'cost' values */
    class Cost
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

            /** Returns a mutable builder for constructing an instance of [Cost]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Cost]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cost: Cost) = apply {
                additionalProperties = cost.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Cost].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Cost = Cost(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Cost = apply {
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

            return other is Cost && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Cost{additionalProperties=$additionalProperties}"
    }

    /** 'income' values */
    class Income
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

            /** Returns a mutable builder for constructing an instance of [Income]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Income]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(income: Income) = apply {
                additionalProperties = income.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Income].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Income = Income(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Income = apply {
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

            return other is Income && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Income{additionalProperties=$additionalProperties}"
    }

    /** 'measure' values */
    class Measure
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

            /** Returns a mutable builder for constructing an instance of [Measure]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Measure]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(measure: Measure) = apply {
                additionalProperties = measure.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Measure].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Measure = Measure(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Measure = apply {
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

            return other is Measure && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Measure{additionalProperties=$additionalProperties}"
    }

    /** 'metadata' values */
    class Metadata
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

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
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

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    /** 'other' values */
    class Other
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

            /** Returns a mutable builder for constructing an instance of [Other]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Other]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(other: Other) = apply {
                additionalProperties = other.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Other].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Other = Other(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Other = apply {
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

            return other is Other && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Other{additionalProperties=$additionalProperties}"
    }

    /** 'what' values */
    class What
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

            /** Returns a mutable builder for constructing an instance of [What]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [What]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(what: What) = apply {
                additionalProperties = what.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [What].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): What = What(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): What = apply {
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

            return other is What && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "What{additionalProperties=$additionalProperties}"
    }

    /** 'where' values */
    class Where
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

            /** Returns a mutable builder for constructing an instance of [Where]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Where]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(where: Where) = apply {
                additionalProperties = where.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Where].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Where = Where(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Where = apply {
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

            return other is Where && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Where{additionalProperties=$additionalProperties}"
    }

    /** 'who' values */
    class Who
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

            /** Returns a mutable builder for constructing an instance of [Who]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Who]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(who: Who) = apply {
                additionalProperties = who.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Who].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Who = Who(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Who = apply {
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

            return other is Who && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Who{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MeasurementRequest &&
            account == other.account &&
            meter == other.meter &&
            ts == other.ts &&
            cost == other.cost &&
            ets == other.ets &&
            income == other.income &&
            measure == other.measure &&
            metadata == other.metadata &&
            this.other == other.other &&
            uid == other.uid &&
            what == other.what &&
            where == other.where &&
            who == other.who &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            account,
            meter,
            ts,
            cost,
            ets,
            income,
            measure,
            metadata,
            other,
            uid,
            what,
            where,
            who,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MeasurementRequest{account=$account, meter=$meter, ts=$ts, cost=$cost, ets=$ets, income=$income, measure=$measure, metadata=$metadata, other=$other, uid=$uid, what=$what, where=$where, who=$who, additionalProperties=$additionalProperties}"
}
