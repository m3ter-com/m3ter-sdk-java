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
class AccountSearchResponse
@JsonCreator
private constructor(
    @JsonProperty("data")
    @ExcludeMissing
    private val data: JsonField<List<Account>> = JsonMissing.of(),
    @JsonProperty("nextToken")
    @ExcludeMissing
    private val nextToken: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun data(): Optional<List<Account>> = Optional.ofNullable(data.getNullable("data"))

    fun nextToken(): Optional<String> = Optional.ofNullable(nextToken.getNullable("nextToken"))

    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Account>> = data

    @JsonProperty("nextToken") @ExcludeMissing fun _nextToken(): JsonField<String> = nextToken

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AccountSearchResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.forEach { it.validate() } }
        nextToken()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountSearchResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Account>>? = null
        private var nextToken: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountSearchResponse: AccountSearchResponse) = apply {
            data = accountSearchResponse.data.map { it.toMutableList() }
            nextToken = accountSearchResponse.nextToken
            additionalProperties = accountSearchResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Account>) = data(JsonField.of(data))

        fun data(data: JsonField<List<Account>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        fun addData(data: Account) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        fun nextToken(nextToken: String) = nextToken(JsonField.of(nextToken))

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

        fun build(): AccountSearchResponse =
            AccountSearchResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                nextToken,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountSearchResponse && data == other.data && nextToken == other.nextToken && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, nextToken, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountSearchResponse{data=$data, nextToken=$nextToken, additionalProperties=$additionalProperties}"
}
