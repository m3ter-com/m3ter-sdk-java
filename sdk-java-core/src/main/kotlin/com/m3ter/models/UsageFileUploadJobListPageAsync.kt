// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.usage.fileUploads.JobServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [JobServiceAsync.list] */
class UsageFileUploadJobListPageAsync
private constructor(
    private val service: JobServiceAsync,
    private val params: UsageFileUploadJobListParams,
    private val response: UsageFileUploadJobListPageResponse,
) {

    /**
     * Delegates to [UsageFileUploadJobListPageResponse], but gracefully handles missing data.
     *
     * @see [UsageFileUploadJobListPageResponse.data]
     */
    fun data(): List<FileUploadJobResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [UsageFileUploadJobListPageResponse], but gracefully handles missing data.
     *
     * @see [UsageFileUploadJobListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<UsageFileUploadJobListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<UsageFileUploadJobListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): UsageFileUploadJobListParams = params

    /** The response that this page was parsed from. */
    fun response(): UsageFileUploadJobListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [UsageFileUploadJobListPageAsync].
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

    /** A builder for [UsageFileUploadJobListPageAsync]. */
    class Builder internal constructor() {

        private var service: JobServiceAsync? = null
        private var params: UsageFileUploadJobListParams? = null
        private var response: UsageFileUploadJobListPageResponse? = null

        @JvmSynthetic
        internal fun from(usageFileUploadJobListPageAsync: UsageFileUploadJobListPageAsync) =
            apply {
                service = usageFileUploadJobListPageAsync.service
                params = usageFileUploadJobListPageAsync.params
                response = usageFileUploadJobListPageAsync.response
            }

        fun service(service: JobServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: UsageFileUploadJobListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: UsageFileUploadJobListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [UsageFileUploadJobListPageAsync].
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
        fun build(): UsageFileUploadJobListPageAsync =
            UsageFileUploadJobListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: UsageFileUploadJobListPageAsync) {

        fun forEach(
            action: Predicate<FileUploadJobResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<UsageFileUploadJobListPageAsync>>.forEach(
                action: (FileUploadJobResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<FileUploadJobResponse>> {
            val values = mutableListOf<FileUploadJobResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UsageFileUploadJobListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "UsageFileUploadJobListPageAsync{service=$service, params=$params, response=$response}"
}
