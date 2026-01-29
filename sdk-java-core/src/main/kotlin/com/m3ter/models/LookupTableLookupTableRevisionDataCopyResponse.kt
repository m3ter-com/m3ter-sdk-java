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
import com.m3ter.errors.M3terInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class LookupTableLookupTableRevisionDataCopyResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val jobId: JsonField<String>,
    private val revisionId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("jobId") @ExcludeMissing jobId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("revisionId") @ExcludeMissing revisionId: JsonField<String> = JsonMissing.of(),
    ) : this(jobId, revisionId, mutableMapOf())

    /**
     * UUID of the Revision Data copy job.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jobId(): Optional<String> = jobId.getOptional("jobId")

    /**
     * The ID of the destination Revision.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun revisionId(): Optional<String> = revisionId.getOptional("revisionId")

    /**
     * Returns the raw JSON value of [jobId].
     *
     * Unlike [jobId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("jobId") @ExcludeMissing fun _jobId(): JsonField<String> = jobId

    /**
     * Returns the raw JSON value of [revisionId].
     *
     * Unlike [revisionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("revisionId") @ExcludeMissing fun _revisionId(): JsonField<String> = revisionId

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
         * [LookupTableLookupTableRevisionDataCopyResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LookupTableLookupTableRevisionDataCopyResponse]. */
    class Builder internal constructor() {

        private var jobId: JsonField<String> = JsonMissing.of()
        private var revisionId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            lookupTableLookupTableRevisionDataCopyResponse:
                LookupTableLookupTableRevisionDataCopyResponse
        ) = apply {
            jobId = lookupTableLookupTableRevisionDataCopyResponse.jobId
            revisionId = lookupTableLookupTableRevisionDataCopyResponse.revisionId
            additionalProperties =
                lookupTableLookupTableRevisionDataCopyResponse.additionalProperties.toMutableMap()
        }

        /** UUID of the Revision Data copy job. */
        fun jobId(jobId: String) = jobId(JsonField.of(jobId))

        /**
         * Sets [Builder.jobId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jobId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun jobId(jobId: JsonField<String>) = apply { this.jobId = jobId }

        /** The ID of the destination Revision. */
        fun revisionId(revisionId: String) = revisionId(JsonField.of(revisionId))

        /**
         * Sets [Builder.revisionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revisionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun revisionId(revisionId: JsonField<String>) = apply { this.revisionId = revisionId }

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
         * Returns an immutable instance of [LookupTableLookupTableRevisionDataCopyResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LookupTableLookupTableRevisionDataCopyResponse =
            LookupTableLookupTableRevisionDataCopyResponse(
                jobId,
                revisionId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LookupTableLookupTableRevisionDataCopyResponse = apply {
        if (validated) {
            return@apply
        }

        jobId()
        revisionId()
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
        (if (jobId.asKnown().isPresent) 1 else 0) + (if (revisionId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LookupTableLookupTableRevisionDataCopyResponse &&
            jobId == other.jobId &&
            revisionId == other.revisionId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(jobId, revisionId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LookupTableLookupTableRevisionDataCopyResponse{jobId=$jobId, revisionId=$revisionId, additionalProperties=$additionalProperties}"
}
