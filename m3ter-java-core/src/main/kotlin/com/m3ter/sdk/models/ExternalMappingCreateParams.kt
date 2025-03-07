// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.m3ter.sdk.core.ExcludeMissing
import com.m3ter.sdk.core.JsonField
import com.m3ter.sdk.core.JsonMissing
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.core.NoAutoDetect
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import java.util.Objects
import java.util.Optional

/**
 * Creates a new External Mapping.
 *
 * This endpoint enables you to create a new External Mapping for the specified Organization. You
 * need to supply a request body with the details of the new External Mapping.
 */
class ExternalMappingCreateParams
private constructor(
    private val orgId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    /**
     * The unique identifier (UUID) of the entity in the external system. This UUID should already
     * exist in the external system.
     */
    fun externalId(): String = body.externalId()

    /** The name of the external system where the entity you are mapping resides. */
    fun externalSystem(): String = body.externalSystem()

    /** The name of the table in ther external system where the entity resides. */
    fun externalTable(): String = body.externalTable()

    /**
     * The name of the m3ter entity that you are creating or modifying an External Mapping for. As
     * an example, this could be an "Account".
     */
    fun m3terEntity(): String = body.m3terEntity()

    /** The unique identifier (UUID) of the m3ter entity. */
    fun m3terId(): String = body.m3terId()

    /** UUID of the integration config to link this mapping to */
    fun integrationConfigId(): Optional<String> = body.integrationConfigId()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     */
    fun version(): Optional<Long> = body.version()

    /**
     * The unique identifier (UUID) of the entity in the external system. This UUID should already
     * exist in the external system.
     */
    fun _externalId(): JsonField<String> = body._externalId()

    /** The name of the external system where the entity you are mapping resides. */
    fun _externalSystem(): JsonField<String> = body._externalSystem()

    /** The name of the table in ther external system where the entity resides. */
    fun _externalTable(): JsonField<String> = body._externalTable()

    /**
     * The name of the m3ter entity that you are creating or modifying an External Mapping for. As
     * an example, this could be an "Account".
     */
    fun _m3terEntity(): JsonField<String> = body._m3terEntity()

    /** The unique identifier (UUID) of the m3ter entity. */
    fun _m3terId(): JsonField<String> = body._m3terId()

    /** UUID of the integration config to link this mapping to */
    fun _integrationConfigId(): JsonField<String> = body._integrationConfigId()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     */
    fun _version(): JsonField<Long> = body._version()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> orgId
            else -> ""
        }
    }

    /** Request containing an External Mapping entity. */
    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("externalId")
        @ExcludeMissing
        private val externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("externalSystem")
        @ExcludeMissing
        private val externalSystem: JsonField<String> = JsonMissing.of(),
        @JsonProperty("externalTable")
        @ExcludeMissing
        private val externalTable: JsonField<String> = JsonMissing.of(),
        @JsonProperty("m3terEntity")
        @ExcludeMissing
        private val m3terEntity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("m3terId")
        @ExcludeMissing
        private val m3terId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("integrationConfigId")
        @ExcludeMissing
        private val integrationConfigId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version")
        @ExcludeMissing
        private val version: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The unique identifier (UUID) of the entity in the external system. This UUID should
         * already exist in the external system.
         */
        fun externalId(): String = externalId.getRequired("externalId")

        /** The name of the external system where the entity you are mapping resides. */
        fun externalSystem(): String = externalSystem.getRequired("externalSystem")

        /** The name of the table in ther external system where the entity resides. */
        fun externalTable(): String = externalTable.getRequired("externalTable")

        /**
         * The name of the m3ter entity that you are creating or modifying an External Mapping for.
         * As an example, this could be an "Account".
         */
        fun m3terEntity(): String = m3terEntity.getRequired("m3terEntity")

        /** The unique identifier (UUID) of the m3ter entity. */
        fun m3terId(): String = m3terId.getRequired("m3terId")

        /** UUID of the integration config to link this mapping to */
        fun integrationConfigId(): Optional<String> =
            Optional.ofNullable(integrationConfigId.getNullable("integrationConfigId"))

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

        /**
         * The unique identifier (UUID) of the entity in the external system. This UUID should
         * already exist in the external system.
         */
        @JsonProperty("externalId")
        @ExcludeMissing
        fun _externalId(): JsonField<String> = externalId

        /** The name of the external system where the entity you are mapping resides. */
        @JsonProperty("externalSystem")
        @ExcludeMissing
        fun _externalSystem(): JsonField<String> = externalSystem

        /** The name of the table in ther external system where the entity resides. */
        @JsonProperty("externalTable")
        @ExcludeMissing
        fun _externalTable(): JsonField<String> = externalTable

        /**
         * The name of the m3ter entity that you are creating or modifying an External Mapping for.
         * As an example, this could be an "Account".
         */
        @JsonProperty("m3terEntity")
        @ExcludeMissing
        fun _m3terEntity(): JsonField<String> = m3terEntity

        /** The unique identifier (UUID) of the m3ter entity. */
        @JsonProperty("m3terId") @ExcludeMissing fun _m3terId(): JsonField<String> = m3terId

        /** UUID of the integration config to link this mapping to */
        @JsonProperty("integrationConfigId")
        @ExcludeMissing
        fun _integrationConfigId(): JsonField<String> = integrationConfigId

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            externalId()
            externalSystem()
            externalTable()
            m3terEntity()
            m3terId()
            integrationConfigId()
            version()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .externalId()
             * .externalSystem()
             * .externalTable()
             * .m3terEntity()
             * .m3terId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var externalId: JsonField<String>? = null
            private var externalSystem: JsonField<String>? = null
            private var externalTable: JsonField<String>? = null
            private var m3terEntity: JsonField<String>? = null
            private var m3terId: JsonField<String>? = null
            private var integrationConfigId: JsonField<String> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                externalId = body.externalId
                externalSystem = body.externalSystem
                externalTable = body.externalTable
                m3terEntity = body.m3terEntity
                m3terId = body.m3terId
                integrationConfigId = body.integrationConfigId
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The unique identifier (UUID) of the entity in the external system. This UUID should
             * already exist in the external system.
             */
            fun externalId(externalId: String) = externalId(JsonField.of(externalId))

            /**
             * The unique identifier (UUID) of the entity in the external system. This UUID should
             * already exist in the external system.
             */
            fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

            /** The name of the external system where the entity you are mapping resides. */
            fun externalSystem(externalSystem: String) =
                externalSystem(JsonField.of(externalSystem))

            /** The name of the external system where the entity you are mapping resides. */
            fun externalSystem(externalSystem: JsonField<String>) = apply {
                this.externalSystem = externalSystem
            }

            /** The name of the table in ther external system where the entity resides. */
            fun externalTable(externalTable: String) = externalTable(JsonField.of(externalTable))

            /** The name of the table in ther external system where the entity resides. */
            fun externalTable(externalTable: JsonField<String>) = apply {
                this.externalTable = externalTable
            }

            /**
             * The name of the m3ter entity that you are creating or modifying an External Mapping
             * for. As an example, this could be an "Account".
             */
            fun m3terEntity(m3terEntity: String) = m3terEntity(JsonField.of(m3terEntity))

            /**
             * The name of the m3ter entity that you are creating or modifying an External Mapping
             * for. As an example, this could be an "Account".
             */
            fun m3terEntity(m3terEntity: JsonField<String>) = apply {
                this.m3terEntity = m3terEntity
            }

            /** The unique identifier (UUID) of the m3ter entity. */
            fun m3terId(m3terId: String) = m3terId(JsonField.of(m3terId))

            /** The unique identifier (UUID) of the m3ter entity. */
            fun m3terId(m3terId: JsonField<String>) = apply { this.m3terId = m3terId }

            /** UUID of the integration config to link this mapping to */
            fun integrationConfigId(integrationConfigId: String) =
                integrationConfigId(JsonField.of(integrationConfigId))

            /** UUID of the integration config to link this mapping to */
            fun integrationConfigId(integrationConfigId: JsonField<String>) = apply {
                this.integrationConfigId = integrationConfigId
            }

            /**
             * The version number of the entity:
             * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
             *   Create_. On initial Create, version is set at 1 and listed in the response.
             * - **Update Entity:** On Update, version is required and must match the existing
             *   version because a check is performed to ensure sequential versioning is preserved.
             *   Version is incremented by 1 and listed in the response.
             */
            fun version(version: Long) = version(JsonField.of(version))

            /**
             * The version number of the entity:
             * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
             *   Create_. On initial Create, version is set at 1 and listed in the response.
             * - **Update Entity:** On Update, version is required and must match the existing
             *   version because a check is performed to ensure sequential versioning is preserved.
             *   Version is incremented by 1 and listed in the response.
             */
            fun version(version: JsonField<Long>) = apply { this.version = version }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Body =
                Body(
                    checkRequired("externalId", externalId),
                    checkRequired("externalSystem", externalSystem),
                    checkRequired("externalTable", externalTable),
                    checkRequired("m3terEntity", m3terEntity),
                    checkRequired("m3terId", m3terId),
                    integrationConfigId,
                    version,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && externalId == other.externalId && externalSystem == other.externalSystem && externalTable == other.externalTable && m3terEntity == other.m3terEntity && m3terId == other.m3terId && integrationConfigId == other.integrationConfigId && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(externalId, externalSystem, externalTable, m3terEntity, m3terId, integrationConfigId, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{externalId=$externalId, externalSystem=$externalSystem, externalTable=$externalTable, m3terEntity=$m3terEntity, m3terId=$m3terId, integrationConfigId=$integrationConfigId, version=$version, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExternalMappingCreateParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .externalId()
         * .externalSystem()
         * .externalTable()
         * .m3terEntity()
         * .m3terId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalMappingCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(externalMappingCreateParams: ExternalMappingCreateParams) = apply {
            orgId = externalMappingCreateParams.orgId
            body = externalMappingCreateParams.body.toBuilder()
            additionalHeaders = externalMappingCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = externalMappingCreateParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /**
         * The unique identifier (UUID) of the entity in the external system. This UUID should
         * already exist in the external system.
         */
        fun externalId(externalId: String) = apply { body.externalId(externalId) }

        /**
         * The unique identifier (UUID) of the entity in the external system. This UUID should
         * already exist in the external system.
         */
        fun externalId(externalId: JsonField<String>) = apply { body.externalId(externalId) }

        /** The name of the external system where the entity you are mapping resides. */
        fun externalSystem(externalSystem: String) = apply { body.externalSystem(externalSystem) }

        /** The name of the external system where the entity you are mapping resides. */
        fun externalSystem(externalSystem: JsonField<String>) = apply {
            body.externalSystem(externalSystem)
        }

        /** The name of the table in ther external system where the entity resides. */
        fun externalTable(externalTable: String) = apply { body.externalTable(externalTable) }

        /** The name of the table in ther external system where the entity resides. */
        fun externalTable(externalTable: JsonField<String>) = apply {
            body.externalTable(externalTable)
        }

        /**
         * The name of the m3ter entity that you are creating or modifying an External Mapping for.
         * As an example, this could be an "Account".
         */
        fun m3terEntity(m3terEntity: String) = apply { body.m3terEntity(m3terEntity) }

        /**
         * The name of the m3ter entity that you are creating or modifying an External Mapping for.
         * As an example, this could be an "Account".
         */
        fun m3terEntity(m3terEntity: JsonField<String>) = apply { body.m3terEntity(m3terEntity) }

        /** The unique identifier (UUID) of the m3ter entity. */
        fun m3terId(m3terId: String) = apply { body.m3terId(m3terId) }

        /** The unique identifier (UUID) of the m3ter entity. */
        fun m3terId(m3terId: JsonField<String>) = apply { body.m3terId(m3terId) }

        /** UUID of the integration config to link this mapping to */
        fun integrationConfigId(integrationConfigId: String) = apply {
            body.integrationConfigId(integrationConfigId)
        }

        /** UUID of the integration config to link this mapping to */
        fun integrationConfigId(integrationConfigId: JsonField<String>) = apply {
            body.integrationConfigId(integrationConfigId)
        }

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        fun version(version: Long) = apply { body.version(version) }

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        fun version(version: JsonField<Long>) = apply { body.version(version) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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

        fun build(): ExternalMappingCreateParams =
            ExternalMappingCreateParams(
                checkRequired("orgId", orgId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalMappingCreateParams && orgId == other.orgId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ExternalMappingCreateParams{orgId=$orgId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
