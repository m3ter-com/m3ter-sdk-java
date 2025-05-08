// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.ExternalMappingServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [ExternalMappingServiceAsync.listByExternalEntity] */
class ExternalMappingListByExternalEntityPageAsync
private constructor(
    private val service: ExternalMappingServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ExternalMappingListByExternalEntityParams,
    private val response: ExternalMappingListByExternalEntityPageResponse,
) : PageAsync<ExternalMappingResponse> {

    /**
     * Delegates to [ExternalMappingListByExternalEntityPageResponse], but gracefully handles
     * missing data.
     *
     * @see [ExternalMappingListByExternalEntityPageResponse.data]
     */
    fun data(): List<ExternalMappingResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExternalMappingListByExternalEntityPageResponse], but gracefully handles
     * missing data.
     *
     * @see [ExternalMappingListByExternalEntityPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<ExternalMappingResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): ExternalMappingListByExternalEntityParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ExternalMappingListByExternalEntityPageAsync> =
        service.listByExternalEntity(nextPageParams())

    fun autoPager(): AutoPagerAsync<ExternalMappingResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ExternalMappingListByExternalEntityParams = params

    /** The response that this page was parsed from. */
    fun response(): ExternalMappingListByExternalEntityPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ExternalMappingListByExternalEntityPageAsync].
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

    /** A builder for [ExternalMappingListByExternalEntityPageAsync]. */
    class Builder internal constructor() {

        private var service: ExternalMappingServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ExternalMappingListByExternalEntityParams? = null
        private var response: ExternalMappingListByExternalEntityPageResponse? = null

        @JvmSynthetic
        internal fun from(
            externalMappingListByExternalEntityPageAsync:
                ExternalMappingListByExternalEntityPageAsync
        ) = apply {
            service = externalMappingListByExternalEntityPageAsync.service
            streamHandlerExecutor =
                externalMappingListByExternalEntityPageAsync.streamHandlerExecutor
            params = externalMappingListByExternalEntityPageAsync.params
            response = externalMappingListByExternalEntityPageAsync.response
        }

        fun service(service: ExternalMappingServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ExternalMappingListByExternalEntityParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: ExternalMappingListByExternalEntityPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ExternalMappingListByExternalEntityPageAsync].
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
        fun build(): ExternalMappingListByExternalEntityPageAsync =
            ExternalMappingListByExternalEntityPageAsync(
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

        return /* spotless:off */ other is ExternalMappingListByExternalEntityPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "ExternalMappingListByExternalEntityPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
