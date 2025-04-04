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
import com.m3ter.sdk.services.async.bills.LineItemServiceAsync
import java.util.Collections
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * Lists all the line items for a specific Bill.
 *
 * This endpoint retrieves a list of line items for the given Bill within the specified
 * Organization. The list can also be paginated for easier management. The line items returned in
 * the list include individual charges, discounts, or adjustments within a Bill.
 */
class BillLineItemListPageAsync
private constructor(
    private val lineItemsService: LineItemServiceAsync,
    private val params: BillLineItemListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<LineItemResponse> = response().data()

    fun nextToken(): Optional<String> = response().nextToken()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillLineItemListPageAsync && lineItemsService == other.lineItemsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(lineItemsService, params, response) /* spotless:on */

    override fun toString() =
        "BillLineItemListPageAsync{lineItemsService=$lineItemsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextToken().isPresent
    }

    fun getNextPageParams(): Optional<BillLineItemListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            BillLineItemListParams.builder()
                .from(params)
                .apply { nextToken().ifPresent { this.nextToken(it) } }
                .build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<BillLineItemListPageAsync>> {
        return getNextPageParams()
            .map { lineItemsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            lineItemsService: LineItemServiceAsync,
            params: BillLineItemListParams,
            response: Response,
        ) = BillLineItemListPageAsync(lineItemsService, params, response)
    }

    class Response(
        private val data: JsonField<List<LineItemResponse>>,
        private val nextToken: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data") data: JsonField<List<LineItemResponse>> = JsonMissing.of(),
            @JsonProperty("nextToken") nextToken: JsonField<String> = JsonMissing.of(),
        ) : this(data, nextToken, mutableMapOf())

        fun data(): List<LineItemResponse> = data.getOptional("data").getOrNull() ?: listOf()

        fun nextToken(): Optional<String> = nextToken.getOptional("nextToken")

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<LineItemResponse>>> = Optional.ofNullable(data)

        @JsonProperty("nextToken")
        fun _nextToken(): Optional<JsonField<String>> = Optional.ofNullable(nextToken)

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            data().map { it.validate() }
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
             * Returns a mutable builder for constructing an instance of
             * [BillLineItemListPageAsync].
             */
            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<LineItemResponse>> = JsonMissing.of()
            private var nextToken: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.data = page.data
                this.nextToken = page.nextToken
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<LineItemResponse>) = data(JsonField.of(data))

            fun data(data: JsonField<List<LineItemResponse>>) = apply { this.data = data }

            fun nextToken(nextToken: String) = nextToken(JsonField.of(nextToken))

            fun nextToken(nextToken: JsonField<String>) = apply { this.nextToken = nextToken }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            /**
             * Returns an immutable instance of [Response].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Response = Response(data, nextToken, additionalProperties.toMutableMap())
        }
    }

    class AutoPager(private val firstPage: BillLineItemListPageAsync) {

        fun forEach(
            action: Predicate<LineItemResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<BillLineItemListPageAsync>>.forEach(
                action: (LineItemResponse) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.data().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<LineItemResponse>> {
            val values = mutableListOf<LineItemResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
