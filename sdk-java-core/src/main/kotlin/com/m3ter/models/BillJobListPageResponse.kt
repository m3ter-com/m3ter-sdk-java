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

class BillJobListPageResponse
private constructor(
    private val data: JsonField<List<BillJobResponse>>,
    private val nextToken: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data")
        @ExcludeMissing
        data: JsonField<List<BillJobResponse>> = JsonMissing.of(),
        @JsonProperty("nextToken") @ExcludeMissing nextToken: JsonField<String> = JsonMissing.of(),
    ) : this(data, nextToken, mutableMapOf())

    /**
     * An array containing the list of requested BillJobs.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<List<BillJobResponse>> = data.getOptional("data")

    /**
     * The `nextToken` for multi-page retrievals. It is used to fetch the next page of BillJobs in a
     * paginated list.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextToken(): Optional<String> = nextToken.getOptional("nextToken")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<BillJobResponse>> = data

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

        /** Returns a mutable builder for constructing an instance of [BillJobListPageResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BillJobListPageResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<BillJobResponse>>? = null
        private var nextToken: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(billJobListPageResponse: BillJobListPageResponse) = apply {
            data = billJobListPageResponse.data.map { it.toMutableList() }
            nextToken = billJobListPageResponse.nextToken
            additionalProperties = billJobListPageResponse.additionalProperties.toMutableMap()
        }

        /** An array containing the list of requested BillJobs. */
        fun data(data: List<BillJobResponse>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<BillJobResponse>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun data(data: JsonField<List<BillJobResponse>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [BillJobResponse] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: BillJobResponse) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        /**
         * The `nextToken` for multi-page retrievals. It is used to fetch the next page of BillJobs
         * in a paginated list.
         */
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
         * Returns an immutable instance of [BillJobListPageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BillJobListPageResponse =
            BillJobListPageResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                nextToken,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BillJobListPageResponse = apply {
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

        return /* spotless:off */ other is BillJobListPageResponse && data == other.data && nextToken == other.nextToken && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, nextToken, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BillJobListPageResponse{data=$data, nextToken=$nextToken, additionalProperties=$additionalProperties}"
}
