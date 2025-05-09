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

/** @see [ExternalMappingServiceAsync.listByM3terEntity] */
class ExternalMappingListByM3terEntityPageAsync
private constructor(
    private val service: ExternalMappingServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ExternalMappingListByM3terEntityParams,
    private val response: ExternalMappingListByM3terEntityPageResponse,
) : PageAsync<ExternalMappingResponse> {

    /**
     * Delegates to [ExternalMappingListByM3terEntityPageResponse], but gracefully handles missing
     * data.
     *
     * @see [ExternalMappingListByM3terEntityPageResponse.data]
     */
    fun data(): List<ExternalMappingResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExternalMappingListByM3terEntityPageResponse], but gracefully handles missing
     * data.
     *
     * @see [ExternalMappingListByM3terEntityPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<ExternalMappingResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): ExternalMappingListByM3terEntityParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ExternalMappingListByM3terEntityPageAsync> =
        service.listByM3terEntity(nextPageParams())

    fun autoPager(): AutoPagerAsync<ExternalMappingResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ExternalMappingListByM3terEntityParams = params

    /** The response that this page was parsed from. */
    fun response(): ExternalMappingListByM3terEntityPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ExternalMappingListByM3terEntityPageAsync].
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

    /** A builder for [ExternalMappingListByM3terEntityPageAsync]. */
    class Builder internal constructor() {

        private var service: ExternalMappingServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ExternalMappingListByM3terEntityParams? = null
        private var response: ExternalMappingListByM3terEntityPageResponse? = null

        @JvmSynthetic
        internal fun from(
            externalMappingListByM3terEntityPageAsync: ExternalMappingListByM3terEntityPageAsync
        ) = apply {
            service = externalMappingListByM3terEntityPageAsync.service
            streamHandlerExecutor = externalMappingListByM3terEntityPageAsync.streamHandlerExecutor
            params = externalMappingListByM3terEntityPageAsync.params
            response = externalMappingListByM3terEntityPageAsync.response
        }

        fun service(service: ExternalMappingServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ExternalMappingListByM3terEntityParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExternalMappingListByM3terEntityPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ExternalMappingListByM3terEntityPageAsync].
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
        fun build(): ExternalMappingListByM3terEntityPageAsync =
            ExternalMappingListByM3terEntityPageAsync(
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

        return /* spotless:off */ other is ExternalMappingListByM3terEntityPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "ExternalMappingListByM3terEntityPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
