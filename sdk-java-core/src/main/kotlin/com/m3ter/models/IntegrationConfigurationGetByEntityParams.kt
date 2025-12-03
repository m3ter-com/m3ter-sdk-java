// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.Params
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieve the integration configuration for the entity */
class IntegrationConfigurationGetByEntityParams
private constructor(
    private val orgId: String?,
    private val entityType: String?,
    private val destination: String?,
    private val destinationId: String?,
    private val entityId: String?,
    private val nextToken: String?,
    private val pageSize: Int?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    fun entityType(): Optional<String> = Optional.ofNullable(entityType)

    /** Destination type to retrieve IntegrationConfigs for */
    fun destination(): Optional<String> = Optional.ofNullable(destination)

    /** UUID of the destination to retrieve IntegrationConfigs for */
    fun destinationId(): Optional<String> = Optional.ofNullable(destinationId)

    /** UUID of the entity to retrieve IntegrationConfigs for */
    fun entityId(): Optional<String> = Optional.ofNullable(entityId)

    /** nextToken for multi page retrievals */
    fun nextToken(): Optional<String> = Optional.ofNullable(nextToken)

    /** Number of configs to retrieve per page */
    fun pageSize(): Optional<Int> = Optional.ofNullable(pageSize)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): IntegrationConfigurationGetByEntityParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [IntegrationConfigurationGetByEntityParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IntegrationConfigurationGetByEntityParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var entityType: String? = null
        private var destination: String? = null
        private var destinationId: String? = null
        private var entityId: String? = null
        private var nextToken: String? = null
        private var pageSize: Int? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            integrationConfigurationGetByEntityParams: IntegrationConfigurationGetByEntityParams
        ) = apply {
            orgId = integrationConfigurationGetByEntityParams.orgId
            entityType = integrationConfigurationGetByEntityParams.entityType
            destination = integrationConfigurationGetByEntityParams.destination
            destinationId = integrationConfigurationGetByEntityParams.destinationId
            entityId = integrationConfigurationGetByEntityParams.entityId
            nextToken = integrationConfigurationGetByEntityParams.nextToken
            pageSize = integrationConfigurationGetByEntityParams.pageSize
            additionalHeaders =
                integrationConfigurationGetByEntityParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                integrationConfigurationGetByEntityParams.additionalQueryParams.toBuilder()
        }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        fun entityType(entityType: String?) = apply { this.entityType = entityType }

        /** Alias for calling [Builder.entityType] with `entityType.orElse(null)`. */
        fun entityType(entityType: Optional<String>) = entityType(entityType.getOrNull())

        /** Destination type to retrieve IntegrationConfigs for */
        fun destination(destination: String?) = apply { this.destination = destination }

        /** Alias for calling [Builder.destination] with `destination.orElse(null)`. */
        fun destination(destination: Optional<String>) = destination(destination.getOrNull())

        /** UUID of the destination to retrieve IntegrationConfigs for */
        fun destinationId(destinationId: String?) = apply { this.destinationId = destinationId }

        /** Alias for calling [Builder.destinationId] with `destinationId.orElse(null)`. */
        fun destinationId(destinationId: Optional<String>) =
            destinationId(destinationId.getOrNull())

        /** UUID of the entity to retrieve IntegrationConfigs for */
        fun entityId(entityId: String?) = apply { this.entityId = entityId }

        /** Alias for calling [Builder.entityId] with `entityId.orElse(null)`. */
        fun entityId(entityId: Optional<String>) = entityId(entityId.getOrNull())

        /** nextToken for multi page retrievals */
        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /** Alias for calling [Builder.nextToken] with `nextToken.orElse(null)`. */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.getOrNull())

        /** Number of configs to retrieve per page */
        fun pageSize(pageSize: Int?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Int) = pageSize(pageSize as Int?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Int>) = pageSize(pageSize.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [IntegrationConfigurationGetByEntityParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): IntegrationConfigurationGetByEntityParams =
            IntegrationConfigurationGetByEntityParams(
                orgId,
                entityType,
                destination,
                destinationId,
                entityId,
                nextToken,
                pageSize,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId ?: ""
            1 -> entityType ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                destination?.let { put("destination", it) }
                destinationId?.let { put("destinationId", it) }
                entityId?.let { put("entityId", it) }
                nextToken?.let { put("nextToken", it) }
                pageSize?.let { put("pageSize", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IntegrationConfigurationGetByEntityParams &&
            orgId == other.orgId &&
            entityType == other.entityType &&
            destination == other.destination &&
            destinationId == other.destinationId &&
            entityId == other.entityId &&
            nextToken == other.nextToken &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            orgId,
            entityType,
            destination,
            destinationId,
            entityId,
            nextToken,
            pageSize,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "IntegrationConfigurationGetByEntityParams{orgId=$orgId, entityType=$entityType, destination=$destination, destinationId=$destinationId, entityId=$entityId, nextToken=$nextToken, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
