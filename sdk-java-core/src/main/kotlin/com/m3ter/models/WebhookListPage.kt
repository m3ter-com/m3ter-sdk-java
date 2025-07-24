// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.WebhookService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see WebhookService.list */
class WebhookListPage
private constructor(
    private val service: WebhookService,
    private val params: WebhookListParams,
    private val response: WebhookListPageResponse,
) : Page<Webhook> {

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

    override fun nextPage(): WebhookListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Webhook> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): WebhookListParams = params

    /** The response that this page was parsed from. */
    fun response(): WebhookListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WebhookListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebhookListPage]. */
    class Builder internal constructor() {

        private var service: WebhookService? = null
        private var params: WebhookListParams? = null
        private var response: WebhookListPageResponse? = null

        @JvmSynthetic
        internal fun from(webhookListPage: WebhookListPage) = apply {
            service = webhookListPage.service
            params = webhookListPage.params
            response = webhookListPage.response
        }

        fun service(service: WebhookService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: WebhookListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: WebhookListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [WebhookListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WebhookListPage =
            WebhookListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WebhookListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "WebhookListPage{service=$service, params=$params, response=$response}"
}
