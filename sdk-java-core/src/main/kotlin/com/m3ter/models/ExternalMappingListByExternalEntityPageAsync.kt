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

/** @see [ExternalMappingServiceAsync.listByExternalEntity] */
class ExternalMappingListByExternalEntityPageAsync
private constructor(
    private val service: ExternalMappingServiceAsync,
    private val params: ExternalMappingListByExternalEntityParams,
    private val response: ExternalMappingListByExternalEntityPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<ExternalMappingListByExternalEntityParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<ExternalMappingListByExternalEntityPageAsync>> =
        getNextPageParams()
            .map { service.listByExternalEntity(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

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
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalMappingListByExternalEntityPageAsync]. */
    class Builder internal constructor() {

        private var service: ExternalMappingServiceAsync? = null
        private var params: ExternalMappingListByExternalEntityParams? = null
        private var response: ExternalMappingListByExternalEntityPageResponse? = null

        @JvmSynthetic
        internal fun from(
            externalMappingListByExternalEntityPageAsync:
                ExternalMappingListByExternalEntityPageAsync
        ) = apply {
            service = externalMappingListByExternalEntityPageAsync.service
            params = externalMappingListByExternalEntityPageAsync.params
            response = externalMappingListByExternalEntityPageAsync.response
        }

        fun service(service: ExternalMappingServiceAsync) = apply { this.service = service }

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
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalMappingListByExternalEntityPageAsync =
            ExternalMappingListByExternalEntityPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: ExternalMappingListByExternalEntityPageAsync) {

        fun forEach(
            action: Predicate<ExternalMappingResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ExternalMappingListByExternalEntityPageAsync>>.forEach(
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

        return /* spotless:off */ other is ExternalMappingListByExternalEntityPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ExternalMappingListByExternalEntityPageAsync{service=$service, params=$params, response=$response}"
}
