// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.WebhookServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of all Destinations created in the Organization. */
class WebhookListPageAsync
private constructor(
    private val webhooksService: WebhookServiceAsync,
    private val params: WebhookListParams,
    private val response: WebhookListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): WebhookListPageResponse = response

    /**
     * Delegates to [WebhookListPageResponse], but gracefully handles missing data.
     *
     * @see [WebhookListPageResponse.data]
     */
    fun data(): List<Webhook> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [WebhookListPageResponse], but gracefully handles missing data.
     *
     * @see [WebhookListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WebhookListPageAsync && webhooksService == other.webhooksService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(webhooksService, params, response) /* spotless:on */

    override fun toString() =
        "WebhookListPageAsync{webhooksService=$webhooksService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<WebhookListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<WebhookListPageAsync>> {
        return getNextPageParams()
            .map { webhooksService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            webhooksService: WebhookServiceAsync,
            params: WebhookListParams,
            response: WebhookListPageResponse,
        ) = WebhookListPageAsync(webhooksService, params, response)
    }

    class AutoPager(private val firstPage: WebhookListPageAsync) {

        fun forEach(action: Predicate<Webhook>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<WebhookListPageAsync>>.forEach(
                action: (Webhook) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Webhook>> {
            val values = mutableListOf<Webhook>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
