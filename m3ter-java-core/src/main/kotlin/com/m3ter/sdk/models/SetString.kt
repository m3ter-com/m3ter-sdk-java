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

class SetString
private constructor(
    private val empty: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("empty") @ExcludeMissing empty: JsonField<Boolean> = JsonMissing.of()
    ) : this(empty, mutableMapOf())

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun empty(): Optional<Boolean> = empty.getOptional("empty")

    /**
     * Returns the raw JSON value of [empty].
     *
     * Unlike [empty], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("empty") @ExcludeMissing fun _empty(): JsonField<Boolean> = empty

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

        /** Returns a mutable builder for constructing an instance of [SetString]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SetString]. */
    class Builder internal constructor() {

        private var empty: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(setString: SetString) = apply {
            empty = setString.empty
            additionalProperties = setString.additionalProperties.toMutableMap()
        }

        fun empty(empty: Boolean) = empty(JsonField.of(empty))

        /**
         * Sets [Builder.empty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.empty] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun empty(empty: JsonField<Boolean>) = apply { this.empty = empty }

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
         * Returns an immutable instance of [SetString].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SetString = SetString(empty, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): SetString = apply {
        if (validated) {
            return@apply
        }

        empty()
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
    @JvmSynthetic internal fun validity(): Int = (if (empty.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SetString && empty == other.empty && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(empty, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "SetString{empty=$empty, additionalProperties=$additionalProperties}"
}
