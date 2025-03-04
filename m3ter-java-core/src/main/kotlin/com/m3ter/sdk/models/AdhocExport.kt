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

/** Response containing data export ad-hoc jobId */
@NoAutoDetect
class AdhocExport
@JsonCreator
private constructor(
    @JsonProperty("jobId") @ExcludeMissing private val jobId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The id of the job */
    fun jobId(): Optional<String> = Optional.ofNullable(jobId.getNullable("jobId"))

    /** The id of the job */
    @JsonProperty("jobId") @ExcludeMissing fun _jobId(): JsonField<String> = jobId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AdhocExport = apply {
        if (validated) {
            return@apply
        }

        jobId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [AdhocExport]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AdhocExport]. */
    class Builder internal constructor() {

        private var jobId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(adhocExport: AdhocExport) = apply {
            jobId = adhocExport.jobId
            additionalProperties = adhocExport.additionalProperties.toMutableMap()
        }

        /** The id of the job */
        fun jobId(jobId: String) = jobId(JsonField.of(jobId))

        /** The id of the job */
        fun jobId(jobId: JsonField<String>) = apply { this.jobId = jobId }

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

        fun build(): AdhocExport = AdhocExport(jobId, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AdhocExport && jobId == other.jobId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(jobId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AdhocExport{jobId=$jobId, additionalProperties=$additionalProperties}"
}
