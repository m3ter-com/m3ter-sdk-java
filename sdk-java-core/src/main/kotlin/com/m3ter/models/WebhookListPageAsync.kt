// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.WebhookServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see WebhookServiceAsync.list */
class WebhookListPageAsync
private constructor(
    private val service: WebhookServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: WebhookListParams,
    private val response: WebhookListPageResponse,
) : PageAsync<Webhook> {

    /**
     * Delegates to [WebhookListPageResponse], but gracefully handles missing data.
     *
     * @see WebhookListPageResponse.data
     */
    fun data(): List<Webhook> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [WebhookListPageResponse], but gracefully handles missing data.
     *
     * @see WebhookListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<Webhook> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): WebhookListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<WebhookListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Webhook> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): WebhookListParams = params

    /** The response that this page was parsed from. */
    fun response(): WebhookListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WebhookListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebhookListPageAsync]. */
    class Builder internal constructor() {

        private var service: WebhookServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: WebhookListParams? = null
        private var response: WebhookListPageResponse? = null

        @JvmSynthetic
        internal fun from(webhookListPageAsync: WebhookListPageAsync) = apply {
            service = webhookListPageAsync.service
            streamHandlerExecutor = webhookListPageAsync.streamHandlerExecutor
            params = webhookListPageAsync.params
            response = webhookListPageAsync.response
        }

        fun service(service: WebhookServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: WebhookListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: WebhookListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [WebhookListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WebhookListPageAsync =
            WebhookListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WebhookListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "WebhookListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
