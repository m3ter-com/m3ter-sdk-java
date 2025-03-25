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
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkKnown
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Submit a measurement or multiple measurements to the m3ter platform. The maximum size of the
 * payload needs to be less than 512,000 bytes.
 *
 * **NOTES:**
 * - **Non-existent Accounts.** The `account` request parameter is required. However, if you want to
 *   submit a usage data measurement for an Account which does not yet exist in your Organization,
 *   you can use an `account` code for a non-existent Account. A new skeleton Account will be
 *   automatically created. The usage data measurement is accepted and ingested as data belonging to
 *   the new auto-created Account. At a later date, you can edit the Account's Code,??Name,
 *   and??e-mail address. For more details, see
 *   [Submittting Usage Data for Non-Existent Accounts](https://www.m3ter.com/docs/guides/billing-and-usage-data/submitting-usage-data/submitting-usage-data-for-non-existent-accounts)
 *   in our main documentation.
 * - **Usage Data Adjustments.** If you need to make corrections for billing retrospectively against
 *   an Account, you can use date/time values in the past for the `ts` (timestamp) request parameter
 *   to submit positive or negative usage data amounts to correct and reconcile earlier billing
 *   anomalies. For more details, see
 *   [Submittting Usage Data Adjustments Using Timestamp](https://www.m3ter.com/docs/guides/billing-and-usage-data/submitting-usage-data/submitting-usage-data-adjustments-using-timestamp)
 *   in our main documentation.
 * - **Ingest Validation Failure Events.** After the intial submission of a usage data measurement
 *   to the Ingest API, a data enrichment stage is performed to check for any errors in the usage
 *   data measurement, such as a missing field. If an error is identified, this might result in the
 *   submission being rejected. In these cases, an _ingest validation failure_ Event is generated,
 *   which you can review on the
 *   [Ingest Events](https://www.m3ter.com/docs/guides/billing-and-usage-data/submitting-usage-data/reviewing-and-resolving-ingest-events)
 *   page in the Console. See also the [Events](https://www.m3ter.com/docs/api#tag/Events) section
 *   in this API Reference.
 *
 * **IMPORTANT! - Use of PII:** The use of any of your end-customers' Personally Identifiable
 * Information (PII) in m3ter is restricted to a few fields on the **Account** entity. Please ensure
 * that any measurements you submit do not contain any end-customer PII data. See the
 * [Introduction section](https://www.m3ter.com/docs/api#section/Introduction) above for more
 * details.
 */
class UsageSubmitParams
private constructor(
    private val orgId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    /**
     * Request containing the usage data measurements for submission.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun measurements(): List<Measurement> = body.measurements()

    /**
     * Returns the raw JSON value of [measurements].
     *
     * Unlike [measurements], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _measurements(): JsonField<List<Measurement>> = body._measurements()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UsageSubmitParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .measurements()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageSubmitParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(usageSubmitParams: UsageSubmitParams) = apply {
            orgId = usageSubmitParams.orgId
            body = usageSubmitParams.body.toBuilder()
            additionalHeaders = usageSubmitParams.additionalHeaders.toBuilder()
            additionalQueryParams = usageSubmitParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /** Request containing the usage data measurements for submission. */
        fun measurements(measurements: List<Measurement>) = apply {
            body.measurements(measurements)
        }

        /**
         * Sets [Builder.measurements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.measurements] with a well-typed `List<Measurement>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun measurements(measurements: JsonField<List<Measurement>>) = apply {
            body.measurements(measurements)
        }

        /**
         * Adds a single [Measurement] to [measurements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMeasurement(measurement: Measurement) = apply { body.addMeasurement(measurement) }

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
         * Returns an immutable instance of [UsageSubmitParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .measurements()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UsageSubmitParams =
            UsageSubmitParams(
                checkRequired("orgId", orgId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @JvmSynthetic internal fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val measurements: JsonField<List<Measurement>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("measurements")
            @ExcludeMissing
            measurements: JsonField<List<Measurement>> = JsonMissing.of()
        ) : this(measurements, mutableMapOf())

        /**
         * Request containing the usage data measurements for submission.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun measurements(): List<Measurement> = measurements.getRequired("measurements")

        /**
         * Returns the raw JSON value of [measurements].
         *
         * Unlike [measurements], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("measurements")
        @ExcludeMissing
        fun _measurements(): JsonField<List<Measurement>> = measurements

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
             * .measurements()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var measurements: JsonField<MutableList<Measurement>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                measurements = body.measurements.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Request containing the usage data measurements for submission. */
            fun measurements(measurements: List<Measurement>) =
                measurements(JsonField.of(measurements))

            /**
             * Sets [Builder.measurements] to an arbitrary JSON value.
             *
             * You should usually call [Builder.measurements] with a well-typed `List<Measurement>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun measurements(measurements: JsonField<List<Measurement>>) = apply {
                this.measurements = measurements.map { it.toMutableList() }
            }

            /**
             * Adds a single [Measurement] to [measurements].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMeasurement(measurement: Measurement) = apply {
                measurements =
                    (measurements ?: JsonField.of(mutableListOf())).also {
                        checkKnown("measurements", it).add(measurement)
                    }
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .measurements()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("measurements", measurements).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            measurements().forEach { it.validate() }
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && measurements == other.measurements && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(measurements, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{measurements=$measurements, additionalProperties=$additionalProperties}"
    }

    class Measurement
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
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
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
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun account(): String = account.getRequired("account")

        /**
         * Short code identifying the Meter the measurement is for.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun meter(): String = meter.getRequired("meter")

        /**
         * Timestamp for the measurement _(in ISO 8601 format)_.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ts(): OffsetDateTime = ts.getRequired("ts")

        /**
         * 'cost' values
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cost(): Optional<Cost> = Optional.ofNullable(cost.getNullable("cost"))

        /**
         * End timestamp for the measurement _(in ISO 8601 format)_. _(Optional)_.
         *
         * Can be used in the case a usage event needs to have an explicit start and end rather than
         * being instantaneous.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ets(): Optional<OffsetDateTime> = Optional.ofNullable(ets.getNullable("ets"))

        /**
         * 'income' values
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun income(): Optional<Income> = Optional.ofNullable(income.getNullable("income"))

        /**
         * 'measure' values
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun measure(): Optional<Measure> = Optional.ofNullable(measure.getNullable("measure"))

        /**
         * 'metadata' values
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

        /**
         * 'other' values
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun other(): Optional<Other> = Optional.ofNullable(other.getNullable("other"))

        /**
         * Unique ID for this measurement.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun uid(): Optional<String> = Optional.ofNullable(uid.getNullable("uid"))

        /**
         * 'what' values
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun what(): Optional<What> = Optional.ofNullable(what.getNullable("what"))

        /**
         * 'where' values
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun where(): Optional<Where> = Optional.ofNullable(where.getNullable("where"))

        /**
         * 'who' values
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun who(): Optional<Who> = Optional.ofNullable(who.getNullable("who"))

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
             * Returns a mutable builder for constructing an instance of [Measurement].
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

        /** A builder for [Measurement]. */
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
            internal fun from(measurement: Measurement) = apply {
                account = measurement.account
                meter = measurement.meter
                ts = measurement.ts
                cost = measurement.cost
                ets = measurement.ets
                income = measurement.income
                measure = measurement.measure
                metadata = measurement.metadata
                other = measurement.other
                uid = measurement.uid
                what = measurement.what
                where = measurement.where
                who = measurement.who
                additionalProperties = measurement.additionalProperties.toMutableMap()
            }

            /** Code of the Account the measurement is for. */
            fun account(account: String) = account(JsonField.of(account))

            /**
             * Sets [Builder.account] to an arbitrary JSON value.
             *
             * You should usually call [Builder.account] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun account(account: JsonField<String>) = apply { this.account = account }

            /** Short code identifying the Meter the measurement is for. */
            fun meter(meter: String) = meter(JsonField.of(meter))

            /**
             * Sets [Builder.meter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meter] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun meter(meter: JsonField<String>) = apply { this.meter = meter }

            /** Timestamp for the measurement _(in ISO 8601 format)_. */
            fun ts(ts: OffsetDateTime) = ts(JsonField.of(ts))

            /**
             * Sets [Builder.ts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ts] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ts(ts: JsonField<OffsetDateTime>) = apply { this.ts = ts }

            /** 'cost' values */
            fun cost(cost: Cost) = cost(JsonField.of(cost))

            /**
             * Sets [Builder.cost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cost] with a well-typed [Cost] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun cost(cost: JsonField<Cost>) = apply { this.cost = cost }

            /**
             * End timestamp for the measurement _(in ISO 8601 format)_. _(Optional)_.
             *
             * Can be used in the case a usage event needs to have an explicit start and end rather
             * than being instantaneous.
             */
            fun ets(ets: OffsetDateTime) = ets(JsonField.of(ets))

            /**
             * Sets [Builder.ets] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ets] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ets(ets: JsonField<OffsetDateTime>) = apply { this.ets = ets }

            /** 'income' values */
            fun income(income: Income) = income(JsonField.of(income))

            /**
             * Sets [Builder.income] to an arbitrary JSON value.
             *
             * You should usually call [Builder.income] with a well-typed [Income] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun income(income: JsonField<Income>) = apply { this.income = income }

            /** 'measure' values */
            fun measure(measure: Measure) = measure(JsonField.of(measure))

            /**
             * Sets [Builder.measure] to an arbitrary JSON value.
             *
             * You should usually call [Builder.measure] with a well-typed [Measure] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun measure(measure: JsonField<Measure>) = apply { this.measure = measure }

            /** 'metadata' values */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** 'other' values */
            fun other(other: Other) = other(JsonField.of(other))

            /**
             * Sets [Builder.other] to an arbitrary JSON value.
             *
             * You should usually call [Builder.other] with a well-typed [Other] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun other(other: JsonField<Other>) = apply { this.other = other }

            /** Unique ID for this measurement. */
            fun uid(uid: String) = uid(JsonField.of(uid))

            /**
             * Sets [Builder.uid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uid] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun uid(uid: JsonField<String>) = apply { this.uid = uid }

            /** 'what' values */
            fun what(what: What) = what(JsonField.of(what))

            /**
             * Sets [Builder.what] to an arbitrary JSON value.
             *
             * You should usually call [Builder.what] with a well-typed [What] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun what(what: JsonField<What>) = apply { this.what = what }

            /** 'where' values */
            fun where(where: Where) = where(JsonField.of(where))

            /**
             * Sets [Builder.where] to an arbitrary JSON value.
             *
             * You should usually call [Builder.where] with a well-typed [Where] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun where(where: JsonField<Where>) = apply { this.where = where }

            /** 'who' values */
            fun who(who: Who) = who(JsonField.of(who))

            /**
             * Sets [Builder.who] to an arbitrary JSON value.
             *
             * You should usually call [Builder.who] with a well-typed [Who] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [Measurement].
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
            fun build(): Measurement =
                Measurement(
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

        fun validate(): Measurement = apply {
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

        /** 'cost' values */
        class Cost
        private constructor(private val additionalProperties: MutableMap<String, JsonValue>) {

            @JsonCreator private constructor() : this(mutableMapOf())

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Cost].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Cost = Cost(additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Cost = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cost && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Cost{additionalProperties=$additionalProperties}"
        }

        /** 'income' values */
        class Income
        private constructor(private val additionalProperties: MutableMap<String, JsonValue>) {

            @JsonCreator private constructor() : this(mutableMapOf())

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Income].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Income = Income(additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Income = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Income && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Income{additionalProperties=$additionalProperties}"
        }

        /** 'measure' values */
        class Measure
        private constructor(private val additionalProperties: MutableMap<String, JsonValue>) {

            @JsonCreator private constructor() : this(mutableMapOf())

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Measure].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Measure = Measure(additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Measure = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Measure && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Measure{additionalProperties=$additionalProperties}"
        }

        /** 'metadata' values */
        class Metadata
        private constructor(private val additionalProperties: MutableMap<String, JsonValue>) {

            @JsonCreator private constructor() : this(mutableMapOf())

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Metadata].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Metadata = Metadata(additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        /** 'other' values */
        class Other
        private constructor(private val additionalProperties: MutableMap<String, JsonValue>) {

            @JsonCreator private constructor() : this(mutableMapOf())

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Other].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Other = Other(additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Other = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Other && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Other{additionalProperties=$additionalProperties}"
        }

        /** 'what' values */
        class What
        private constructor(private val additionalProperties: MutableMap<String, JsonValue>) {

            @JsonCreator private constructor() : this(mutableMapOf())

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [What].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): What = What(additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): What = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is What && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "What{additionalProperties=$additionalProperties}"
        }

        /** 'where' values */
        class Where
        private constructor(private val additionalProperties: MutableMap<String, JsonValue>) {

            @JsonCreator private constructor() : this(mutableMapOf())

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Where].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Where = Where(additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Where = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Where && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Where{additionalProperties=$additionalProperties}"
        }

        /** 'who' values */
        class Who
        private constructor(private val additionalProperties: MutableMap<String, JsonValue>) {

            @JsonCreator private constructor() : this(mutableMapOf())

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Who].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Who = Who(additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Who = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Who && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Who{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Measurement && account == other.account && meter == other.meter && ts == other.ts && cost == other.cost && ets == other.ets && income == other.income && measure == other.measure && metadata == other.metadata && this.other == other.other && uid == other.uid && what == other.what && where == other.where && who == other.who && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(account, meter, ts, cost, ets, income, measure, metadata, other, uid, what, where, who, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Measurement{account=$account, meter=$meter, ts=$ts, cost=$cost, ets=$ets, income=$income, measure=$measure, metadata=$metadata, other=$other, uid=$uid, what=$what, where=$where, who=$who, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UsageSubmitParams && orgId == other.orgId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "UsageSubmitParams{orgId=$orgId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
