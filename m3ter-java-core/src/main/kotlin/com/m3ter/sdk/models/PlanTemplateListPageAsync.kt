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
import com.m3ter.sdk.services.async.PlanTemplateServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/**
 * Retrieve a list of PlanTemplates.
 *
 * This endpoint enables you to retrieve a paginated list of PlanTemplates belonging to a specific
 * Organization, identified by its UUID. You can filter the list by PlanTemplate IDs or Product IDs
 * for more focused retrieval.
 */
class PlanTemplateListPageAsync
private constructor(
    private val planTemplatesService: PlanTemplateServiceAsync,
    private val params: PlanTemplateListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<PlanTemplateResponse> = response().data()

    fun nextToken(): Optional<String> = response().nextToken()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlanTemplateListPageAsync && planTemplatesService == other.planTemplatesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(planTemplatesService, params, response) /* spotless:on */

    override fun toString() =
        "PlanTemplateListPageAsync{planTemplatesService=$planTemplatesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextToken().isPresent
    }

    fun getNextPageParams(): Optional<PlanTemplateListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            PlanTemplateListParams.builder()
                .from(params)
                .apply { nextToken().ifPresent { this.nextToken(it) } }
                .build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<PlanTemplateListPageAsync>> {
        return getNextPageParams()
            .map { planTemplatesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            planTemplatesService: PlanTemplateServiceAsync,
            params: PlanTemplateListParams,
            response: Response,
        ) = PlanTemplateListPageAsync(planTemplatesService, params, response)
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("data")
        private val data: JsonField<List<PlanTemplateResponse>> = JsonMissing.of(),
        @JsonProperty("nextToken") private val nextToken: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun data(): List<PlanTemplateResponse> = data.getNullable("data") ?: listOf()

        fun nextToken(): Optional<String> = Optional.ofNullable(nextToken.getNullable("nextToken"))

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<PlanTemplateResponse>>> = Optional.ofNullable(data)

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
             * Returns a mutable builder for constructing an instance of
             * [PlanTemplateListPageAsync].
             */
            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<PlanTemplateResponse>> = JsonMissing.of()
            private var nextToken: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.data = page.data
                this.nextToken = page.nextToken
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<PlanTemplateResponse>) = data(JsonField.of(data))

            fun data(data: JsonField<List<PlanTemplateResponse>>) = apply { this.data = data }

            fun nextToken(nextToken: String) = nextToken(JsonField.of(nextToken))

            fun nextToken(nextToken: JsonField<String>) = apply { this.nextToken = nextToken }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(data, nextToken, additionalProperties.toImmutable())
        }
    }

    class AutoPager(private val firstPage: PlanTemplateListPageAsync) {

        fun forEach(
            action: Predicate<PlanTemplateResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<PlanTemplateListPageAsync>>.forEach(
                action: (PlanTemplateResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<PlanTemplateResponse>> {
            val values = mutableListOf<PlanTemplateResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
