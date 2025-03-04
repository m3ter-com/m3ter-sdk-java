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
import com.m3ter.sdk.core.checkKnown
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class BillSearchResponse
@JsonCreator
private constructor(
    @JsonProperty("data")
    @ExcludeMissing
    private val data: JsonField<List<Bill>> = JsonMissing.of(),
    @JsonProperty("nextToken")
    @ExcludeMissing
    private val nextToken: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** An array containing the list of requested Bills. */
    fun data(): Optional<List<Bill>> = Optional.ofNullable(data.getNullable("data"))

    /**
     * The `nextToken` for multi-page retrievals. It is used to fetch the next page of Bills in a
     * paginated list.
     */
    fun nextToken(): Optional<String> = Optional.ofNullable(nextToken.getNullable("nextToken"))

    /** An array containing the list of requested Bills. */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Bill>> = data

    /**
     * The `nextToken` for multi-page retrievals. It is used to fetch the next page of Bills in a
     * paginated list.
     */
    @JsonProperty("nextToken") @ExcludeMissing fun _nextToken(): JsonField<String> = nextToken

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BillSearchResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.forEach { it.validate() } }
        nextToken()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [BillSearchResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BillSearchResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Bill>>? = null
        private var nextToken: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(billSearchResponse: BillSearchResponse) = apply {
            data = billSearchResponse.data.map { it.toMutableList() }
            nextToken = billSearchResponse.nextToken
            additionalProperties = billSearchResponse.additionalProperties.toMutableMap()
        }

        /** An array containing the list of requested Bills. */
        fun data(data: List<Bill>) = data(JsonField.of(data))

        /** An array containing the list of requested Bills. */
        fun data(data: JsonField<List<Bill>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /** An array containing the list of requested Bills. */
        fun addData(data: Bill) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        /**
         * The `nextToken` for multi-page retrievals. It is used to fetch the next page of Bills in
         * a paginated list.
         */
        fun nextToken(nextToken: String) = nextToken(JsonField.of(nextToken))

        /**
         * The `nextToken` for multi-page retrievals. It is used to fetch the next page of Bills in
         * a paginated list.
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

        fun build(): BillSearchResponse =
            BillSearchResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                nextToken,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillSearchResponse && data == other.data && nextToken == other.nextToken && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, nextToken, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BillSearchResponse{data=$data, nextToken=$nextToken, additionalProperties=$additionalProperties}"
}
