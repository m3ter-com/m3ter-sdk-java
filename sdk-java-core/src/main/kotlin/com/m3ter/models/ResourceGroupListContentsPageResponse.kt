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
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ResourceGroupListContentsPageResponse
private constructor(
    private val data: JsonField<List<ResourceGroupListContentsResponse>>,
    private val nextToken: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data")
        @ExcludeMissing
        data: JsonField<List<ResourceGroupListContentsResponse>> = JsonMissing.of(),
        @JsonProperty("nextToken") @ExcludeMissing nextToken: JsonField<String> = JsonMissing.of(),
    ) : this(data, nextToken, mutableMapOf())

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<List<ResourceGroupListContentsResponse>> = data.getOptional("data")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextToken(): Optional<String> = nextToken.getOptional("nextToken")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data")
    @ExcludeMissing
    fun _data(): JsonField<List<ResourceGroupListContentsResponse>> = data

    /**
     * Returns the raw JSON value of [nextToken].
     *
     * Unlike [nextToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nextToken") @ExcludeMissing fun _nextToken(): JsonField<String> = nextToken

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
         * [ResourceGroupListContentsPageResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ResourceGroupListContentsPageResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<ResourceGroupListContentsResponse>>? = null
        private var nextToken: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            resourceGroupListContentsPageResponse: ResourceGroupListContentsPageResponse
        ) = apply {
            data = resourceGroupListContentsPageResponse.data.map { it.toMutableList() }
            nextToken = resourceGroupListContentsPageResponse.nextToken
            additionalProperties =
                resourceGroupListContentsPageResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<ResourceGroupListContentsResponse>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed
         * `List<ResourceGroupListContentsResponse>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<ResourceGroupListContentsResponse>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [ResourceGroupListContentsResponse] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: ResourceGroupListContentsResponse) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        fun nextToken(nextToken: String) = nextToken(JsonField.of(nextToken))

        /**
         * Sets [Builder.nextToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nextToken(nextToken: JsonField<String>) = apply { this.nextToken = nextToken }

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
         * Returns an immutable instance of [ResourceGroupListContentsPageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ResourceGroupListContentsPageResponse =
            ResourceGroupListContentsPageResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                nextToken,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ResourceGroupListContentsPageResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.forEach { it.validate() } }
        nextToken()
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (nextToken.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResourceGroupListContentsPageResponse && data == other.data && nextToken == other.nextToken && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, nextToken, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ResourceGroupListContentsPageResponse{data=$data, nextToken=$nextToken, additionalProperties=$additionalProperties}"
}
