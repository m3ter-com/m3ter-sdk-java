// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.WebhookService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of all Destinations created in the Organization. */
class WebhookListPage
private constructor(
    private val webhooksService: WebhookService,
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

        return /* spotless:off */ other is WebhookListPage && webhooksService == other.webhooksService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(webhooksService, params, response) /* spotless:on */

    override fun toString() =
        "WebhookListPage{webhooksService=$webhooksService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<WebhookListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<WebhookListPage> {
        return getNextPageParams().map { webhooksService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            webhooksService: WebhookService,
            params: WebhookListParams,
            response: WebhookListPageResponse,
        ) = WebhookListPage(webhooksService, params, response)
    }

    class AutoPager(private val firstPage: WebhookListPage) : Iterable<Webhook> {

        override fun iterator(): Iterator<Webhook> = iterator {
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

        fun stream(): Stream<Webhook> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
