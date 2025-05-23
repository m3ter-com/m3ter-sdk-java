// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.m3ter.core.ExcludeMissing
import com.m3ter.core.JsonField
import com.m3ter.core.JsonMissing
import com.m3ter.core.JsonValue
import com.m3ter.core.Params
import com.m3ter.core.checkRequired
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import com.m3ter.errors.M3terInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Updates an External Mapping with the given UUID.
 *
 * This endpoint enables you to update an existing External Mapping entity, identified by its UUID.
 * You must supply a request body with the new details for the External Mapping.
 */
class ExternalMappingUpdateParams
private constructor(
    private val orgId: String?,
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * The unique identifier (UUID) of the entity in the external system. This UUID should already
     * exist in the external system.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun externalId(): String = body.externalId()

    /**
     * The name of the external system where the entity you are mapping resides.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun externalSystem(): String = body.externalSystem()

    /**
     * The name of the table in ther external system where the entity resides.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun externalTable(): String = body.externalTable()

    /**
     * The name of the m3ter entity that you are creating or modifying an External Mapping for. As
     * an example, this could be an "Account".
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun m3terEntity(): String = body.m3terEntity()

    /**
     * The unique identifier (UUID) of the m3ter entity.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun m3terId(): String = body.m3terId()

    /**
     * UUID of the integration config to link this mapping to
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun integrationConfigId(): Optional<String> = body.integrationConfigId()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun version(): Optional<Long> = body.version()

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _externalId(): JsonField<String> = body._externalId()

    /**
     * Returns the raw JSON value of [externalSystem].
     *
     * Unlike [externalSystem], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _externalSystem(): JsonField<String> = body._externalSystem()

    /**
     * Returns the raw JSON value of [externalTable].
     *
     * Unlike [externalTable], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _externalTable(): JsonField<String> = body._externalTable()

    /**
     * Returns the raw JSON value of [m3terEntity].
     *
     * Unlike [m3terEntity], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _m3terEntity(): JsonField<String> = body._m3terEntity()

    /**
     * Returns the raw JSON value of [m3terId].
     *
     * Unlike [m3terId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _m3terId(): JsonField<String> = body._m3terId()

    /**
     * Returns the raw JSON value of [integrationConfigId].
     *
     * Unlike [integrationConfigId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _integrationConfigId(): JsonField<String> = body._integrationConfigId()

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _version(): JsonField<Long> = body._version()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExternalMappingUpdateParams].
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

    /** A builder for [ExternalMappingUpdateParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(externalMappingUpdateParams: ExternalMappingUpdateParams) = apply {
            orgId = externalMappingUpdateParams.orgId
            id = externalMappingUpdateParams.id
            body = externalMappingUpdateParams.body.toBuilder()
            additionalHeaders = externalMappingUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = externalMappingUpdateParams.additionalQueryParams.toBuilder()
        }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [externalId]
         * - [externalSystem]
         * - [externalTable]
         * - [m3terEntity]
         * - [m3terId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The unique identifier (UUID) of the entity in the external system. This UUID should
         * already exist in the external system.
         */
        fun externalId(externalId: String) = apply { body.externalId(externalId) }

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalId(externalId: JsonField<String>) = apply { body.externalId(externalId) }

        /** The name of the external system where the entity you are mapping resides. */
        fun externalSystem(externalSystem: String) = apply { body.externalSystem(externalSystem) }

        /**
         * Sets [Builder.externalSystem] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalSystem] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalSystem(externalSystem: JsonField<String>) = apply {
            body.externalSystem(externalSystem)
        }

        /** The name of the table in ther external system where the entity resides. */
        fun externalTable(externalTable: String) = apply { body.externalTable(externalTable) }

        /**
         * Sets [Builder.externalTable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalTable] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalTable(externalTable: JsonField<String>) = apply {
            body.externalTable(externalTable)
        }

        /**
         * The name of the m3ter entity that you are creating or modifying an External Mapping for.
         * As an example, this could be an "Account".
         */
        fun m3terEntity(m3terEntity: String) = apply { body.m3terEntity(m3terEntity) }

        /**
         * Sets [Builder.m3terEntity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.m3terEntity] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun m3terEntity(m3terEntity: JsonField<String>) = apply { body.m3terEntity(m3terEntity) }

        /** The unique identifier (UUID) of the m3ter entity. */
        fun m3terId(m3terId: String) = apply { body.m3terId(m3terId) }

        /**
         * Sets [Builder.m3terId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.m3terId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun m3terId(m3terId: JsonField<String>) = apply { body.m3terId(m3terId) }

        /** UUID of the integration config to link this mapping to */
        fun integrationConfigId(integrationConfigId: String) = apply {
            body.integrationConfigId(integrationConfigId)
        }

        /**
         * Sets [Builder.integrationConfigId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.integrationConfigId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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

        /**
         * Returns an immutable instance of [ExternalMappingUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .externalId()
         * .externalSystem()
         * .externalTable()
         * .m3terEntity()
         * .m3terId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalMappingUpdateParams =
            ExternalMappingUpdateParams(
                orgId,
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId ?: ""
            1 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request containing an External Mapping entity. */
    class Body
    private constructor(
        private val externalId: JsonField<String>,
        private val externalSystem: JsonField<String>,
        private val externalTable: JsonField<String>,
        private val m3terEntity: JsonField<String>,
        private val m3terId: JsonField<String>,
        private val integrationConfigId: JsonField<String>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("externalId")
            @ExcludeMissing
            externalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("externalSystem")
            @ExcludeMissing
            externalSystem: JsonField<String> = JsonMissing.of(),
            @JsonProperty("externalTable")
            @ExcludeMissing
            externalTable: JsonField<String> = JsonMissing.of(),
            @JsonProperty("m3terEntity")
            @ExcludeMissing
            m3terEntity: JsonField<String> = JsonMissing.of(),
            @JsonProperty("m3terId") @ExcludeMissing m3terId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("integrationConfigId")
            @ExcludeMissing
            integrationConfigId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(
            externalId,
            externalSystem,
            externalTable,
            m3terEntity,
            m3terId,
            integrationConfigId,
            version,
            mutableMapOf(),
        )

        /**
         * The unique identifier (UUID) of the entity in the external system. This UUID should
         * already exist in the external system.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun externalId(): String = externalId.getRequired("externalId")

        /**
         * The name of the external system where the entity you are mapping resides.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun externalSystem(): String = externalSystem.getRequired("externalSystem")

        /**
         * The name of the table in ther external system where the entity resides.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun externalTable(): String = externalTable.getRequired("externalTable")

        /**
         * The name of the m3ter entity that you are creating or modifying an External Mapping for.
         * As an example, this could be an "Account".
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun m3terEntity(): String = m3terEntity.getRequired("m3terEntity")

        /**
         * The unique identifier (UUID) of the m3ter entity.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun m3terId(): String = m3terId.getRequired("m3terId")

        /**
         * UUID of the integration config to link this mapping to
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun integrationConfigId(): Optional<String> =
            integrationConfigId.getOptional("integrationConfigId")

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun version(): Optional<Long> = version.getOptional("version")

        /**
         * Returns the raw JSON value of [externalId].
         *
         * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("externalId")
        @ExcludeMissing
        fun _externalId(): JsonField<String> = externalId

        /**
         * Returns the raw JSON value of [externalSystem].
         *
         * Unlike [externalSystem], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("externalSystem")
        @ExcludeMissing
        fun _externalSystem(): JsonField<String> = externalSystem

        /**
         * Returns the raw JSON value of [externalTable].
         *
         * Unlike [externalTable], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("externalTable")
        @ExcludeMissing
        fun _externalTable(): JsonField<String> = externalTable

        /**
         * Returns the raw JSON value of [m3terEntity].
         *
         * Unlike [m3terEntity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("m3terEntity")
        @ExcludeMissing
        fun _m3terEntity(): JsonField<String> = m3terEntity

        /**
         * Returns the raw JSON value of [m3terId].
         *
         * Unlike [m3terId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("m3terId") @ExcludeMissing fun _m3terId(): JsonField<String> = m3terId

        /**
         * Returns the raw JSON value of [integrationConfigId].
         *
         * Unlike [integrationConfigId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("integrationConfigId")
        @ExcludeMissing
        fun _integrationConfigId(): JsonField<String> = integrationConfigId

        /**
         * Returns the raw JSON value of [version].
         *
         * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

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
             * Sets [Builder.externalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

            /** The name of the external system where the entity you are mapping resides. */
            fun externalSystem(externalSystem: String) =
                externalSystem(JsonField.of(externalSystem))

            /**
             * Sets [Builder.externalSystem] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalSystem] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalSystem(externalSystem: JsonField<String>) = apply {
                this.externalSystem = externalSystem
            }

            /** The name of the table in ther external system where the entity resides. */
            fun externalTable(externalTable: String) = externalTable(JsonField.of(externalTable))

            /**
             * Sets [Builder.externalTable] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalTable] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalTable(externalTable: JsonField<String>) = apply {
                this.externalTable = externalTable
            }

            /**
             * The name of the m3ter entity that you are creating or modifying an External Mapping
             * for. As an example, this could be an "Account".
             */
            fun m3terEntity(m3terEntity: String) = m3terEntity(JsonField.of(m3terEntity))

            /**
             * Sets [Builder.m3terEntity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.m3terEntity] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun m3terEntity(m3terEntity: JsonField<String>) = apply {
                this.m3terEntity = m3terEntity
            }

            /** The unique identifier (UUID) of the m3ter entity. */
            fun m3terId(m3terId: String) = m3terId(JsonField.of(m3terId))

            /**
             * Sets [Builder.m3terId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.m3terId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun m3terId(m3terId: JsonField<String>) = apply { this.m3terId = m3terId }

            /** UUID of the integration config to link this mapping to */
            fun integrationConfigId(integrationConfigId: String) =
                integrationConfigId(JsonField.of(integrationConfigId))

            /**
             * Sets [Builder.integrationConfigId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.integrationConfigId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
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
             * Sets [Builder.version] to an arbitrary JSON value.
             *
             * You should usually call [Builder.version] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .externalId()
             * .externalSystem()
             * .externalTable()
             * .m3terEntity()
             * .m3terId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("externalId", externalId),
                    checkRequired("externalSystem", externalSystem),
                    checkRequired("externalTable", externalTable),
                    checkRequired("m3terEntity", m3terEntity),
                    checkRequired("m3terId", m3terId),
                    integrationConfigId,
                    version,
                    additionalProperties.toMutableMap(),
                )
        }

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

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: M3terInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (externalId.asKnown().isPresent) 1 else 0) +
                (if (externalSystem.asKnown().isPresent) 1 else 0) +
                (if (externalTable.asKnown().isPresent) 1 else 0) +
                (if (m3terEntity.asKnown().isPresent) 1 else 0) +
                (if (m3terId.asKnown().isPresent) 1 else 0) +
                (if (integrationConfigId.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0)

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalMappingUpdateParams && orgId == other.orgId && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ExternalMappingUpdateParams{orgId=$orgId, id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
