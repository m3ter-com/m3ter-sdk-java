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
import com.m3ter.core.checkKnown
import com.m3ter.core.checkRequired
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class SubmitMeasurementsRequest
private constructor(
    private val measurements: JsonField<List<MeasurementRequest>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("measurements")
        @ExcludeMissing
        measurements: JsonField<List<MeasurementRequest>> = JsonMissing.of()
    ) : this(measurements, mutableMapOf())

    /**
     * Request containing the usage data measurements for submission.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun measurements(): List<MeasurementRequest> = measurements.getRequired("measurements")

    /**
     * Returns the raw JSON value of [measurements].
     *
     * Unlike [measurements], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("measurements")
    @ExcludeMissing
    fun _measurements(): JsonField<List<MeasurementRequest>> = measurements

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
         * Returns a mutable builder for constructing an instance of [SubmitMeasurementsRequest].
         *
         * The following fields are required:
         * ```java
         * .measurements()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubmitMeasurementsRequest]. */
    class Builder internal constructor() {

        private var measurements: JsonField<MutableList<MeasurementRequest>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(submitMeasurementsRequest: SubmitMeasurementsRequest) = apply {
            measurements = submitMeasurementsRequest.measurements.map { it.toMutableList() }
            additionalProperties = submitMeasurementsRequest.additionalProperties.toMutableMap()
        }

        /** Request containing the usage data measurements for submission. */
        fun measurements(measurements: List<MeasurementRequest>) =
            measurements(JsonField.of(measurements))

        /**
         * Sets [Builder.measurements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.measurements] with a well-typed
         * `List<MeasurementRequest>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun measurements(measurements: JsonField<List<MeasurementRequest>>) = apply {
            this.measurements = measurements.map { it.toMutableList() }
        }

        /**
         * Adds a single [MeasurementRequest] to [measurements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMeasurement(measurement: MeasurementRequest) = apply {
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
         * Returns an immutable instance of [SubmitMeasurementsRequest].
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
        fun build(): SubmitMeasurementsRequest =
            SubmitMeasurementsRequest(
                checkRequired("measurements", measurements).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SubmitMeasurementsRequest = apply {
        if (validated) {
            return@apply
        }

        measurements().forEach { it.validate() }
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
        (measurements.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubmitMeasurementsRequest &&
            measurements == other.measurements &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(measurements, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubmitMeasurementsRequest{measurements=$measurements, additionalProperties=$additionalProperties}"
}
