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
import com.m3ter.sdk.services.blocking.CounterPricingService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of CounterPricing entities filtered by date, Plan ID, Plan Template ID, or
 * CounterPricing ID.
 */
class CounterPricingListPage
private constructor(
    private val counterPricingsService: CounterPricingService,
    private val params: CounterPricingListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<CounterPricingResponse> = response().data()

    fun nextToken(): Optional<String> = response().nextToken()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CounterPricingListPage && counterPricingsService == other.counterPricingsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(counterPricingsService, params, response) /* spotless:on */

    override fun toString() =
        "CounterPricingListPage{counterPricingsService=$counterPricingsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextToken().isPresent
    }

    fun getNextPageParams(): Optional<CounterPricingListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            CounterPricingListParams.builder()
                .from(params)
                .apply { nextToken().ifPresent { this.nextToken(it) } }
                .build()
        )
    }

    fun getNextPage(): Optional<CounterPricingListPage> {
        return getNextPageParams().map { counterPricingsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            counterPricingsService: CounterPricingService,
            params: CounterPricingListParams,
            response: Response,
        ) = CounterPricingListPage(counterPricingsService, params, response)
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("data")
        private val data: JsonField<List<CounterPricingResponse>> = JsonMissing.of(),
        @JsonProperty("nextToken") private val nextToken: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun data(): List<CounterPricingResponse> = data.getNullable("data") ?: listOf()

        fun nextToken(): Optional<String> = Optional.ofNullable(nextToken.getNullable("nextToken"))

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<CounterPricingResponse>>> = Optional.ofNullable(data)

        @JsonProperty("nextToken")
        fun _nextToken(): Optional<JsonField<String>> = Optional.ofNullable(nextToken)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            data().map { it.validate() }
            nextToken()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && data == other.data && nextToken == other.nextToken && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(data, nextToken, additionalProperties) /* spotless:on */

        override fun toString() =
            "Response{data=$data, nextToken=$nextToken, additionalProperties=$additionalProperties}"

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [CounterPricingListPage].
             */
            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<CounterPricingResponse>> = JsonMissing.of()
            private var nextToken: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.data = page.data
                this.nextToken = page.nextToken
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<CounterPricingResponse>) = data(JsonField.of(data))

            fun data(data: JsonField<List<CounterPricingResponse>>) = apply { this.data = data }

            fun nextToken(nextToken: String) = nextToken(JsonField.of(nextToken))

            fun nextToken(nextToken: JsonField<String>) = apply { this.nextToken = nextToken }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(data, nextToken, additionalProperties.toImmutable())
        }
    }

    class AutoPager(private val firstPage: CounterPricingListPage) :
        Iterable<CounterPricingResponse> {

        override fun iterator(): Iterator<CounterPricingResponse> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<CounterPricingResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
