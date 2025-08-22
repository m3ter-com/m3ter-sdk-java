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

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceadditional_headers(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeadditional_headers(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAlladditional_headers(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAlladditional_query_params(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceadditional_query_params(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAlladditional_query_params(
            additionalQueryParams: Map<String, Iterable<String>>
        ) = apply { this.additionalQueryParams.replaceAll(additionalQueryParams) }

        fun removeadditional_query_params(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAlladditional_query_params(keys: Set<String>) = apply {
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
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "IntegrationConfigurationGetByEntityParams{orgId=$orgId, entityType=$entityType, destination=$destination, destinationId=$destinationId, entityId=$entityId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
