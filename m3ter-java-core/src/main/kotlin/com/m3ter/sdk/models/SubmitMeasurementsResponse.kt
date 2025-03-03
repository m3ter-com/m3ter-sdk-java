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
class SubmitMeasurementsResponse
@JsonCreator
private constructor(
    @JsonProperty("result")
    @ExcludeMissing
    private val result: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** `accepted` is returned when successful. */
    fun result(): Optional<String> = Optional.ofNullable(result.getNullable("result"))

    /** `accepted` is returned when successful. */
    @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<String> = result

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): SubmitMeasurementsResponse = apply {
        if (validated) {
            return@apply
        }

        result()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubmitMeasurementsResponse]. */
    class Builder internal constructor() {

        private var result: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(submitMeasurementsResponse: SubmitMeasurementsResponse) = apply {
            result = submitMeasurementsResponse.result
            additionalProperties = submitMeasurementsResponse.additionalProperties.toMutableMap()
        }

        /** `accepted` is returned when successful. */
        fun result(result: String) = result(JsonField.of(result))

        /** `accepted` is returned when successful. */
        fun result(result: JsonField<String>) = apply { this.result = result }

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

        fun build(): SubmitMeasurementsResponse =
            SubmitMeasurementsResponse(result, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubmitMeasurementsResponse && result == other.result && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(result, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubmitMeasurementsResponse{result=$result, additionalProperties=$additionalProperties}"
}
