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
import com.m3ter.services.blocking.AccountPlanService
import java.util.Collections
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of AccountPlan and AccountPlanGroup entities for the specified Organization.
 *
 * This endpoint retrieves a list of AccountPlans and AccountPlanGroups for a specific Organization.
 * The list can be paginated for easier management, and supports filtering with various parameters.
 *
 * **NOTE:** You cannot use the `product` query parameter as a single filter condition, but must
 * always use it in combination with the `account` query parameter.
 */
class AccountPlanListPage
private constructor(
    private val accountPlansService: AccountPlanService,
    private val params: AccountPlanListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<AccountPlanResponse> = response().data()

    fun nextToken(): Optional<String> = response().nextToken()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountPlanListPage && accountPlansService == other.accountPlansService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountPlansService, params, response) /* spotless:on */

    override fun toString() =
        "AccountPlanListPage{accountPlansService=$accountPlansService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextToken().isPresent
    }

    fun getNextPageParams(): Optional<AccountPlanListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            AccountPlanListParams.builder()
                .from(params)
                .apply { nextToken().ifPresent { this.nextToken(it) } }
                .build()
        )
    }

    fun getNextPage(): Optional<AccountPlanListPage> {
        return getNextPageParams().map { accountPlansService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            accountPlansService: AccountPlanService,
            params: AccountPlanListParams,
            response: Response,
        ) = AccountPlanListPage(accountPlansService, params, response)
    }

    class Response(
        private val data: JsonField<List<AccountPlanResponse>>,
        private val nextToken: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data") data: JsonField<List<AccountPlanResponse>> = JsonMissing.of(),
            @JsonProperty("nextToken") nextToken: JsonField<String> = JsonMissing.of(),
        ) : this(data, nextToken, mutableMapOf())

        fun data(): List<AccountPlanResponse> = data.getOptional("data").getOrNull() ?: listOf()

        fun nextToken(): Optional<String> = nextToken.getOptional("nextToken")

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<AccountPlanResponse>>> = Optional.ofNullable(data)

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

            /** Returns a mutable builder for constructing an instance of [AccountPlanListPage]. */
            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<AccountPlanResponse>> = JsonMissing.of()
            private var nextToken: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.data = page.data
                this.nextToken = page.nextToken
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<AccountPlanResponse>) = data(JsonField.of(data))

            fun data(data: JsonField<List<AccountPlanResponse>>) = apply { this.data = data }

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

    class AutoPager(private val firstPage: AccountPlanListPage) : Iterable<AccountPlanResponse> {

        override fun iterator(): Iterator<AccountPlanResponse> = iterator {
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

        fun stream(): Stream<AccountPlanResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
