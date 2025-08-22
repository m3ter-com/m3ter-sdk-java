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

class PricingListPageResponse
private constructor(
    private val data: JsonField<List<PricingResponse>>,
    private val nextToken: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data")
        @ExcludeMissing
        data: JsonField<List<PricingResponse>> = JsonMissing.of(),
        @JsonProperty("nextToken") @ExcludeMissing nextToken: JsonField<String> = JsonMissing.of(),
    ) : this(data, nextToken, mutableMapOf())

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<List<PricingResponse>> = data.getOptional("data")

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
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<PricingResponse>> = data

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

        /** Returns a mutable builder for constructing an instance of [PricingListPageResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PricingListPageResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<PricingResponse>>? = null
        private var nextToken: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pricingListPageResponse: PricingListPageResponse) = apply {
            data = pricingListPageResponse.data.map { it.toMutableList() }
            nextToken = pricingListPageResponse.nextToken
            additionalProperties = pricingListPageResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<PricingResponse>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<PricingResponse>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun data(data: JsonField<List<PricingResponse>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [PricingResponse] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: PricingResponse) = apply {
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
            putAlladditional_properties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAlladditional_properties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [PricingListPageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PricingListPageResponse =
            PricingListPageResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                nextToken,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PricingListPageResponse = apply {
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

        return other is PricingListPageResponse &&
            data == other.data &&
            nextToken == other.nextToken &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, nextToken, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PricingListPageResponse{data=$data, nextToken=$nextToken, additionalProperties=$additionalProperties}"
}
