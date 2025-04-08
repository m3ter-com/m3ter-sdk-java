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
import com.m3ter.errors.M3terInvalidDataException
import com.m3ter.services.async.PermissionPolicyServiceAsync
import java.util.Collections
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of PermissionPolicy entities */
class PermissionPolicyListPageAsync
private constructor(
    private val permissionPoliciesService: PermissionPolicyServiceAsync,
    private val params: PermissionPolicyListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<PermissionPolicyResponse> = response().data()

    fun nextToken(): Optional<String> = response().nextToken()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PermissionPolicyListPageAsync && permissionPoliciesService == other.permissionPoliciesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(permissionPoliciesService, params, response) /* spotless:on */

    override fun toString() =
        "PermissionPolicyListPageAsync{permissionPoliciesService=$permissionPoliciesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextToken().isPresent
    }

    fun getNextPageParams(): Optional<PermissionPolicyListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            PermissionPolicyListParams.builder()
                .from(params)
                .apply { nextToken().ifPresent { this.nextToken(it) } }
                .build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<PermissionPolicyListPageAsync>> {
        return getNextPageParams()
            .map { permissionPoliciesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            permissionPoliciesService: PermissionPolicyServiceAsync,
            params: PermissionPolicyListParams,
            response: Response,
        ) = PermissionPolicyListPageAsync(permissionPoliciesService, params, response)
    }

    class Response(
        private val data: JsonField<List<PermissionPolicyResponse>>,
        private val nextToken: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data")
            data: JsonField<List<PermissionPolicyResponse>> = JsonMissing.of(),
            @JsonProperty("nextToken") nextToken: JsonField<String> = JsonMissing.of(),
        ) : this(data, nextToken, mutableMapOf())

        fun data(): List<PermissionPolicyResponse> =
            data.getOptional("data").getOrNull() ?: listOf()

        fun nextToken(): Optional<String> = nextToken.getOptional("nextToken")

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<PermissionPolicyResponse>>> = Optional.ofNullable(data)

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
             * [PermissionPolicyListPageAsync].
             */
            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<PermissionPolicyResponse>> = JsonMissing.of()
            private var nextToken: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.data = page.data
                this.nextToken = page.nextToken
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<PermissionPolicyResponse>) = data(JsonField.of(data))

            fun data(data: JsonField<List<PermissionPolicyResponse>>) = apply { this.data = data }

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

    class AutoPager(private val firstPage: PermissionPolicyListPageAsync) {

        fun forEach(
            action: Predicate<PermissionPolicyResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<PermissionPolicyListPageAsync>>.forEach(
                action: (PermissionPolicyResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<PermissionPolicyResponse>> {
            val values = mutableListOf<PermissionPolicyResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
