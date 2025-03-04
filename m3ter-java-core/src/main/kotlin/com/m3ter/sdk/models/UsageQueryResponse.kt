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
class UsageQueryResponse
@JsonCreator
private constructor(
    @JsonProperty("data")
    @ExcludeMissing
    private val data: JsonField<List<Data>> = JsonMissing.of(),
    @JsonProperty("hasMoreData")
    @ExcludeMissing
    private val hasMoreData: JsonField<Boolean> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun data(): Optional<List<Data>> = Optional.ofNullable(data.getNullable("data"))

    /** Flag to know if there are more data available than the one returned */
    fun hasMoreData(): Optional<Boolean> =
        Optional.ofNullable(hasMoreData.getNullable("hasMoreData"))

    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /** Flag to know if there are more data available than the one returned */
    @JsonProperty("hasMoreData")
    @ExcludeMissing
    fun _hasMoreData(): JsonField<Boolean> = hasMoreData

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): UsageQueryResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.forEach { it.validate() } }
        hasMoreData()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageQueryResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var hasMoreData: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(usageQueryResponse: UsageQueryResponse) = apply {
            data = usageQueryResponse.data.map { it.toMutableList() }
            hasMoreData = usageQueryResponse.hasMoreData
            additionalProperties = usageQueryResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(data)
                }
        }

        /** Flag to know if there are more data available than the one returned */
        fun hasMoreData(hasMoreData: Boolean) = hasMoreData(JsonField.of(hasMoreData))

        /** Flag to know if there are more data available than the one returned */
        fun hasMoreData(hasMoreData: JsonField<Boolean>) = apply { this.hasMoreData = hasMoreData }

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

        fun build(): UsageQueryResponse =
            UsageQueryResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                hasMoreData,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                additionalProperties = data.additionalProperties.toMutableMap()
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

            fun build(): Data = Data(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Data{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UsageQueryResponse && data == other.data && hasMoreData == other.hasMoreData && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, hasMoreData, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UsageQueryResponse{data=$data, hasMoreData=$hasMoreData, additionalProperties=$additionalProperties}"
}
