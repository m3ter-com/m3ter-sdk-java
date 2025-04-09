// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.ExternalMappingServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [ExternalMappingServiceAsync.listByM3terEntity] */
class ExternalMappingListByM3terEntityPageAsync
private constructor(
    private val service: ExternalMappingServiceAsync,
    private val params: ExternalMappingListByM3terEntityParams,
    private val response: ExternalMappingListByM3terEntityPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<ExternalMappingListByM3terEntityParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<ExternalMappingListByM3terEntityPageAsync>> =
        getNextPageParams()
            .map { service.listByM3terEntity(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

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
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalMappingListByM3terEntityPageAsync]. */
    class Builder internal constructor() {

        private var service: ExternalMappingServiceAsync? = null
        private var params: ExternalMappingListByM3terEntityParams? = null
        private var response: ExternalMappingListByM3terEntityPageResponse? = null

        @JvmSynthetic
        internal fun from(
            externalMappingListByM3terEntityPageAsync: ExternalMappingListByM3terEntityPageAsync
        ) = apply {
            service = externalMappingListByM3terEntityPageAsync.service
            params = externalMappingListByM3terEntityPageAsync.params
            response = externalMappingListByM3terEntityPageAsync.response
        }

        fun service(service: ExternalMappingServiceAsync) = apply { this.service = service }

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
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalMappingListByM3terEntityPageAsync =
            ExternalMappingListByM3terEntityPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: ExternalMappingListByM3terEntityPageAsync) {

        fun forEach(
            action: Predicate<ExternalMappingResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ExternalMappingListByM3terEntityPageAsync>>.forEach(
                action: (ExternalMappingResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<ExternalMappingResponse>> {
            val values = mutableListOf<ExternalMappingResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalMappingListByM3terEntityPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ExternalMappingListByM3terEntityPageAsync{service=$service, params=$params, response=$response}"
}
