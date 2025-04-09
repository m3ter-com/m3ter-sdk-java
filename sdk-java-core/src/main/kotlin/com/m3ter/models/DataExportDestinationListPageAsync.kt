// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.dataExports.DestinationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [DestinationServiceAsync.list] */
class DataExportDestinationListPageAsync
private constructor(
    private val service: DestinationServiceAsync,
    private val params: DataExportDestinationListParams,
    private val response: DataExportDestinationListPageResponse,
) {

    /**
     * Delegates to [DataExportDestinationListPageResponse], but gracefully handles missing data.
     *
     * @see [DataExportDestinationListPageResponse.data]
     */
    fun data(): List<DataExportDestinationResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DataExportDestinationListPageResponse], but gracefully handles missing data.
     *
     * @see [DataExportDestinationListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<DataExportDestinationListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<DataExportDestinationListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): DataExportDestinationListParams = params

    /** The response that this page was parsed from. */
    fun response(): DataExportDestinationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DataExportDestinationListPageAsync].
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

    /** A builder for [DataExportDestinationListPageAsync]. */
    class Builder internal constructor() {

        private var service: DestinationServiceAsync? = null
        private var params: DataExportDestinationListParams? = null
        private var response: DataExportDestinationListPageResponse? = null

        @JvmSynthetic
        internal fun from(dataExportDestinationListPageAsync: DataExportDestinationListPageAsync) =
            apply {
                service = dataExportDestinationListPageAsync.service
                params = dataExportDestinationListPageAsync.params
                response = dataExportDestinationListPageAsync.response
            }

        fun service(service: DestinationServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DataExportDestinationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DataExportDestinationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [DataExportDestinationListPageAsync].
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
        fun build(): DataExportDestinationListPageAsync =
            DataExportDestinationListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: DataExportDestinationListPageAsync) {

        fun forEach(
            action: Predicate<DataExportDestinationResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<DataExportDestinationListPageAsync>>.forEach(
                action: (DataExportDestinationResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<DataExportDestinationResponse>> {
            val values = mutableListOf<DataExportDestinationResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DataExportDestinationListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "DataExportDestinationListPageAsync{service=$service, params=$params, response=$response}"
}
