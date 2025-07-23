// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.m3ter.core.Enum
import com.m3ter.core.ExcludeMissing
import com.m3ter.core.JsonField
import com.m3ter.core.JsonMissing
import com.m3ter.core.JsonValue
import com.m3ter.core.Params
import com.m3ter.core.checkRequired
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update the integration configuration for the given UUID.
 *
 * This endpoint allows you to update the configuration of a specific integration within your
 * organization. It is used to modify settings or parameters of an existing integration.
 */
class IntegrationConfigurationUpdateParams
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
     * A flexible object to include any additional configuration data specific to the integration.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun configData(): ConfigData = body.configData()

    /**
     * Base model for defining integration credentials across different types of integrations.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun credentials(): Credentials = body.credentials()

    /**
     * Denotes the integration destination. This field identifies the target platform or service for
     * the integration.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun destination(): String = body.destination()

    /**
     * The unique identifier (UUID) for the integration destination.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun destinationId(): String = body.destinationId()

    /**
     * The unique identifier (UUID) of the entity. This field is used to specify which entity's
     * integration configuration you're updating.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entityId(): String = body.entityId()

    /**
     * Specifies the type of entity for which the integration configuration is being updated. Must
     * be a valid alphanumeric string.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entityType(): String = body.entityType()

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun integrationCredentialsId(): String = body.integrationCredentialsId()

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

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
     * Returns the raw JSON value of [configData].
     *
     * Unlike [configData], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _configData(): JsonField<ConfigData> = body._configData()

    /**
     * Returns the raw JSON value of [credentials].
     *
     * Unlike [credentials], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _credentials(): JsonField<Credentials> = body._credentials()

    /**
     * Returns the raw JSON value of [destination].
     *
     * Unlike [destination], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _destination(): JsonField<String> = body._destination()

    /**
     * Returns the raw JSON value of [destinationId].
     *
     * Unlike [destinationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _destinationId(): JsonField<String> = body._destinationId()

    /**
     * Returns the raw JSON value of [entityId].
     *
     * Unlike [entityId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _entityId(): JsonField<String> = body._entityId()

    /**
     * Returns the raw JSON value of [entityType].
     *
     * Unlike [entityType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _entityType(): JsonField<String> = body._entityType()

    /**
     * Returns the raw JSON value of [integrationCredentialsId].
     *
     * Unlike [integrationCredentialsId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _integrationCredentialsId(): JsonField<String> = body._integrationCredentialsId()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

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
         * Returns a mutable builder for constructing an instance of
         * [IntegrationConfigurationUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .configData()
         * .credentials()
         * .destination()
         * .destinationId()
         * .entityId()
         * .entityType()
         * .integrationCredentialsId()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IntegrationConfigurationUpdateParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            integrationConfigurationUpdateParams: IntegrationConfigurationUpdateParams
        ) = apply {
            orgId = integrationConfigurationUpdateParams.orgId
            id = integrationConfigurationUpdateParams.id
            body = integrationConfigurationUpdateParams.body.toBuilder()
            additionalHeaders = integrationConfigurationUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                integrationConfigurationUpdateParams.additionalQueryParams.toBuilder()
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
         * - [configData]
         * - [credentials]
         * - [destination]
         * - [destinationId]
         * - [entityId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * A flexible object to include any additional configuration data specific to the
         * integration.
         */
        fun configData(configData: ConfigData) = apply { body.configData(configData) }

        /**
         * Sets [Builder.configData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.configData] with a well-typed [ConfigData] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun configData(configData: JsonField<ConfigData>) = apply { body.configData(configData) }

        /**
         * Base model for defining integration credentials across different types of integrations.
         */
        fun credentials(credentials: Credentials) = apply { body.credentials(credentials) }

        /**
         * Sets [Builder.credentials] to an arbitrary JSON value.
         *
         * You should usually call [Builder.credentials] with a well-typed [Credentials] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun credentials(credentials: JsonField<Credentials>) = apply {
            body.credentials(credentials)
        }

        /**
         * Denotes the integration destination. This field identifies the target platform or service
         * for the integration.
         */
        fun destination(destination: String) = apply { body.destination(destination) }

        /**
         * Sets [Builder.destination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destination] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun destination(destination: JsonField<String>) = apply { body.destination(destination) }

        /** The unique identifier (UUID) for the integration destination. */
        fun destinationId(destinationId: String) = apply { body.destinationId(destinationId) }

        /**
         * Sets [Builder.destinationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destinationId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun destinationId(destinationId: JsonField<String>) = apply {
            body.destinationId(destinationId)
        }

        /**
         * The unique identifier (UUID) of the entity. This field is used to specify which entity's
         * integration configuration you're updating.
         */
        fun entityId(entityId: String) = apply { body.entityId(entityId) }

        /**
         * Sets [Builder.entityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun entityId(entityId: JsonField<String>) = apply { body.entityId(entityId) }

        /**
         * Specifies the type of entity for which the integration configuration is being updated.
         * Must be a valid alphanumeric string.
         */
        fun entityType(entityType: String) = apply { body.entityType(entityType) }

        /**
         * Sets [Builder.entityType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun entityType(entityType: JsonField<String>) = apply { body.entityType(entityType) }

        fun integrationCredentialsId(integrationCredentialsId: String) = apply {
            body.integrationCredentialsId(integrationCredentialsId)
        }

        /**
         * Sets [Builder.integrationCredentialsId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.integrationCredentialsId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun integrationCredentialsId(integrationCredentialsId: JsonField<String>) = apply {
            body.integrationCredentialsId(integrationCredentialsId)
        }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

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
         * Returns an immutable instance of [IntegrationConfigurationUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .configData()
         * .credentials()
         * .destination()
         * .destinationId()
         * .entityId()
         * .entityType()
         * .integrationCredentialsId()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IntegrationConfigurationUpdateParams =
            IntegrationConfigurationUpdateParams(
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

    class Body
    private constructor(
        private val configData: JsonField<ConfigData>,
        private val credentials: JsonField<Credentials>,
        private val destination: JsonField<String>,
        private val destinationId: JsonField<String>,
        private val entityId: JsonField<String>,
        private val entityType: JsonField<String>,
        private val integrationCredentialsId: JsonField<String>,
        private val name: JsonField<String>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("configData")
            @ExcludeMissing
            configData: JsonField<ConfigData> = JsonMissing.of(),
            @JsonProperty("credentials")
            @ExcludeMissing
            credentials: JsonField<Credentials> = JsonMissing.of(),
            @JsonProperty("destination")
            @ExcludeMissing
            destination: JsonField<String> = JsonMissing.of(),
            @JsonProperty("destinationId")
            @ExcludeMissing
            destinationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("entityId")
            @ExcludeMissing
            entityId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("entityType")
            @ExcludeMissing
            entityType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("integrationCredentialsId")
            @ExcludeMissing
            integrationCredentialsId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(
            configData,
            credentials,
            destination,
            destinationId,
            entityId,
            entityType,
            integrationCredentialsId,
            name,
            version,
            mutableMapOf(),
        )

        /**
         * A flexible object to include any additional configuration data specific to the
         * integration.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun configData(): ConfigData = configData.getRequired("configData")

        /**
         * Base model for defining integration credentials across different types of integrations.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun credentials(): Credentials = credentials.getRequired("credentials")

        /**
         * Denotes the integration destination. This field identifies the target platform or service
         * for the integration.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun destination(): String = destination.getRequired("destination")

        /**
         * The unique identifier (UUID) for the integration destination.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun destinationId(): String = destinationId.getRequired("destinationId")

        /**
         * The unique identifier (UUID) of the entity. This field is used to specify which entity's
         * integration configuration you're updating.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entityId(): String = entityId.getRequired("entityId")

        /**
         * Specifies the type of entity for which the integration configuration is being updated.
         * Must be a valid alphanumeric string.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entityType(): String = entityType.getRequired("entityType")

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun integrationCredentialsId(): String =
            integrationCredentialsId.getRequired("integrationCredentialsId")

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

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
         * Returns the raw JSON value of [configData].
         *
         * Unlike [configData], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("configData")
        @ExcludeMissing
        fun _configData(): JsonField<ConfigData> = configData

        /**
         * Returns the raw JSON value of [credentials].
         *
         * Unlike [credentials], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credentials")
        @ExcludeMissing
        fun _credentials(): JsonField<Credentials> = credentials

        /**
         * Returns the raw JSON value of [destination].
         *
         * Unlike [destination], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("destination")
        @ExcludeMissing
        fun _destination(): JsonField<String> = destination

        /**
         * Returns the raw JSON value of [destinationId].
         *
         * Unlike [destinationId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("destinationId")
        @ExcludeMissing
        fun _destinationId(): JsonField<String> = destinationId

        /**
         * Returns the raw JSON value of [entityId].
         *
         * Unlike [entityId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entityId") @ExcludeMissing fun _entityId(): JsonField<String> = entityId

        /**
         * Returns the raw JSON value of [entityType].
         *
         * Unlike [entityType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entityType")
        @ExcludeMissing
        fun _entityType(): JsonField<String> = entityType

        /**
         * Returns the raw JSON value of [integrationCredentialsId].
         *
         * Unlike [integrationCredentialsId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("integrationCredentialsId")
        @ExcludeMissing
        fun _integrationCredentialsId(): JsonField<String> = integrationCredentialsId

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * .configData()
             * .credentials()
             * .destination()
             * .destinationId()
             * .entityId()
             * .entityType()
             * .integrationCredentialsId()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var configData: JsonField<ConfigData>? = null
            private var credentials: JsonField<Credentials>? = null
            private var destination: JsonField<String>? = null
            private var destinationId: JsonField<String>? = null
            private var entityId: JsonField<String>? = null
            private var entityType: JsonField<String>? = null
            private var integrationCredentialsId: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                configData = body.configData
                credentials = body.credentials
                destination = body.destination
                destinationId = body.destinationId
                entityId = body.entityId
                entityType = body.entityType
                integrationCredentialsId = body.integrationCredentialsId
                name = body.name
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * A flexible object to include any additional configuration data specific to the
             * integration.
             */
            fun configData(configData: ConfigData) = configData(JsonField.of(configData))

            /**
             * Sets [Builder.configData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.configData] with a well-typed [ConfigData] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun configData(configData: JsonField<ConfigData>) = apply {
                this.configData = configData
            }

            /**
             * Base model for defining integration credentials across different types of
             * integrations.
             */
            fun credentials(credentials: Credentials) = credentials(JsonField.of(credentials))

            /**
             * Sets [Builder.credentials] to an arbitrary JSON value.
             *
             * You should usually call [Builder.credentials] with a well-typed [Credentials] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun credentials(credentials: JsonField<Credentials>) = apply {
                this.credentials = credentials
            }

            /**
             * Denotes the integration destination. This field identifies the target platform or
             * service for the integration.
             */
            fun destination(destination: String) = destination(JsonField.of(destination))

            /**
             * Sets [Builder.destination] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destination] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun destination(destination: JsonField<String>) = apply {
                this.destination = destination
            }

            /** The unique identifier (UUID) for the integration destination. */
            fun destinationId(destinationId: String) = destinationId(JsonField.of(destinationId))

            /**
             * Sets [Builder.destinationId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destinationId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun destinationId(destinationId: JsonField<String>) = apply {
                this.destinationId = destinationId
            }

            /**
             * The unique identifier (UUID) of the entity. This field is used to specify which
             * entity's integration configuration you're updating.
             */
            fun entityId(entityId: String) = entityId(JsonField.of(entityId))

            /**
             * Sets [Builder.entityId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entityId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

            /**
             * Specifies the type of entity for which the integration configuration is being
             * updated. Must be a valid alphanumeric string.
             */
            fun entityType(entityType: String) = entityType(JsonField.of(entityType))

            /**
             * Sets [Builder.entityType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entityType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entityType(entityType: JsonField<String>) = apply { this.entityType = entityType }

            fun integrationCredentialsId(integrationCredentialsId: String) =
                integrationCredentialsId(JsonField.of(integrationCredentialsId))

            /**
             * Sets [Builder.integrationCredentialsId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.integrationCredentialsId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun integrationCredentialsId(integrationCredentialsId: JsonField<String>) = apply {
                this.integrationCredentialsId = integrationCredentialsId
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * .configData()
             * .credentials()
             * .destination()
             * .destinationId()
             * .entityId()
             * .entityType()
             * .integrationCredentialsId()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("configData", configData),
                    checkRequired("credentials", credentials),
                    checkRequired("destination", destination),
                    checkRequired("destinationId", destinationId),
                    checkRequired("entityId", entityId),
                    checkRequired("entityType", entityType),
                    checkRequired("integrationCredentialsId", integrationCredentialsId),
                    checkRequired("name", name),
                    version,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            configData().validate()
            credentials().validate()
            destination()
            destinationId()
            entityId()
            entityType()
            integrationCredentialsId()
            name()
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
            (configData.asKnown().getOrNull()?.validity() ?: 0) +
                (credentials.asKnown().getOrNull()?.validity() ?: 0) +
                (if (destination.asKnown().isPresent) 1 else 0) +
                (if (destinationId.asKnown().isPresent) 1 else 0) +
                (if (entityId.asKnown().isPresent) 1 else 0) +
                (if (entityType.asKnown().isPresent) 1 else 0) +
                (if (integrationCredentialsId.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && configData == other.configData && credentials == other.credentials && destination == other.destination && destinationId == other.destinationId && entityId == other.entityId && entityType == other.entityType && integrationCredentialsId == other.integrationCredentialsId && name == other.name && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(configData, credentials, destination, destinationId, entityId, entityType, integrationCredentialsId, name, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{configData=$configData, credentials=$credentials, destination=$destination, destinationId=$destinationId, entityId=$entityId, entityType=$entityType, integrationCredentialsId=$integrationCredentialsId, name=$name, version=$version, additionalProperties=$additionalProperties}"
    }

    /**
     * A flexible object to include any additional configuration data specific to the integration.
     */
    class ConfigData
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ConfigData]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ConfigData]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(configData: ConfigData) = apply {
                additionalProperties = configData.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [ConfigData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ConfigData = ConfigData(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ConfigData = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ConfigData && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "ConfigData{additionalProperties=$additionalProperties}"
    }

    /** Base model for defining integration credentials across different types of integrations. */
    class Credentials
    private constructor(
        private val type: JsonField<Type>,
        private val destination: JsonField<Destination>,
        private val empty: JsonField<Boolean>,
        private val name: JsonField<String>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("destination")
            @ExcludeMissing
            destination: JsonField<Destination> = JsonMissing.of(),
            @JsonProperty("empty") @ExcludeMissing empty: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(type, destination, empty, name, version, mutableMapOf())

        /**
         * Specifies the type of authorization required for the integration.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun destination(): Optional<Destination> = destination.getOptional("destination")

        /**
         * A flag to indicate whether the credentials are empty.
         * - TRUE - empty credentials.
         * - FALSE - credential details required.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun empty(): Optional<Boolean> = empty.getOptional("empty")

        /**
         * The name of the credentials
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

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
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [destination].
         *
         * Unlike [destination], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("destination")
        @ExcludeMissing
        fun _destination(): JsonField<Destination> = destination

        /**
         * Returns the raw JSON value of [empty].
         *
         * Unlike [empty], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("empty") @ExcludeMissing fun _empty(): JsonField<Boolean> = empty

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns a mutable builder for constructing an instance of [Credentials].
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Credentials]. */
        class Builder internal constructor() {

            private var type: JsonField<Type>? = null
            private var destination: JsonField<Destination> = JsonMissing.of()
            private var empty: JsonField<Boolean> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(credentials: Credentials) = apply {
                type = credentials.type
                destination = credentials.destination
                empty = credentials.empty
                name = credentials.name
                version = credentials.version
                additionalProperties = credentials.additionalProperties.toMutableMap()
            }

            /** Specifies the type of authorization required for the integration. */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun destination(destination: Destination) = destination(JsonField.of(destination))

            /**
             * Sets [Builder.destination] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destination] with a well-typed [Destination] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun destination(destination: JsonField<Destination>) = apply {
                this.destination = destination
            }

            /**
             * A flag to indicate whether the credentials are empty.
             * - TRUE - empty credentials.
             * - FALSE - credential details required.
             */
            fun empty(empty: Boolean) = empty(JsonField.of(empty))

            /**
             * Sets [Builder.empty] to an arbitrary JSON value.
             *
             * You should usually call [Builder.empty] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun empty(empty: JsonField<Boolean>) = apply { this.empty = empty }

            /** The name of the credentials */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [Credentials].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Credentials =
                Credentials(
                    checkRequired("type", type),
                    destination,
                    empty,
                    name,
                    version,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Credentials = apply {
            if (validated) {
                return@apply
            }

            type().validate()
            destination().ifPresent { it.validate() }
            empty()
            name()
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
            (type.asKnown().getOrNull()?.validity() ?: 0) +
                (destination.asKnown().getOrNull()?.validity() ?: 0) +
                (if (empty.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        /** Specifies the type of authorization required for the integration. */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val HTTP_BASIC = of("HTTP_BASIC")

                @JvmField val OAUTH_CLIENT_CREDENTIALS = of("OAUTH_CLIENT_CREDENTIALS")

                @JvmField val M3TER_SIGNED_REQUEST = of("M3TER_SIGNED_REQUEST")

                @JvmField val AWS_INTEGRATION = of("AWS_INTEGRATION")

                @JvmField val PADDLE_AUTH = of("PADDLE_AUTH")

                @JvmField val NETSUITE_AUTH = of("NETSUITE_AUTH")

                @JvmField val CHARGEBEE_AUTH = of("CHARGEBEE_AUTH")

                @JvmField val M3TER_SERVICE_USER = of("M3TER_SERVICE_USER")

                @JvmField val STRIPE_SIGNED_REQUEST = of("STRIPE_SIGNED_REQUEST")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                HTTP_BASIC,
                OAUTH_CLIENT_CREDENTIALS,
                M3TER_SIGNED_REQUEST,
                AWS_INTEGRATION,
                PADDLE_AUTH,
                NETSUITE_AUTH,
                CHARGEBEE_AUTH,
                M3TER_SERVICE_USER,
                STRIPE_SIGNED_REQUEST,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                HTTP_BASIC,
                OAUTH_CLIENT_CREDENTIALS,
                M3TER_SIGNED_REQUEST,
                AWS_INTEGRATION,
                PADDLE_AUTH,
                NETSUITE_AUTH,
                CHARGEBEE_AUTH,
                M3TER_SERVICE_USER,
                STRIPE_SIGNED_REQUEST,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    HTTP_BASIC -> Value.HTTP_BASIC
                    OAUTH_CLIENT_CREDENTIALS -> Value.OAUTH_CLIENT_CREDENTIALS
                    M3TER_SIGNED_REQUEST -> Value.M3TER_SIGNED_REQUEST
                    AWS_INTEGRATION -> Value.AWS_INTEGRATION
                    PADDLE_AUTH -> Value.PADDLE_AUTH
                    NETSUITE_AUTH -> Value.NETSUITE_AUTH
                    CHARGEBEE_AUTH -> Value.CHARGEBEE_AUTH
                    M3TER_SERVICE_USER -> Value.M3TER_SERVICE_USER
                    STRIPE_SIGNED_REQUEST -> Value.STRIPE_SIGNED_REQUEST
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws M3terInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    HTTP_BASIC -> Known.HTTP_BASIC
                    OAUTH_CLIENT_CREDENTIALS -> Known.OAUTH_CLIENT_CREDENTIALS
                    M3TER_SIGNED_REQUEST -> Known.M3TER_SIGNED_REQUEST
                    AWS_INTEGRATION -> Known.AWS_INTEGRATION
                    PADDLE_AUTH -> Known.PADDLE_AUTH
                    NETSUITE_AUTH -> Known.NETSUITE_AUTH
                    CHARGEBEE_AUTH -> Known.CHARGEBEE_AUTH
                    M3TER_SERVICE_USER -> Known.M3TER_SERVICE_USER
                    STRIPE_SIGNED_REQUEST -> Known.STRIPE_SIGNED_REQUEST
                    else -> throw M3terInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws M3terInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    M3terInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Type = apply {
                if (validated) {
                    return@apply
                }

                known()
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
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Destination @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val WEBHOOK = of("WEBHOOK")

                @JvmField val NETSUITE = of("NETSUITE")

                @JvmField val STRIPE = of("STRIPE")

                @JvmField val STRIPE_TEST = of("STRIPE_TEST")

                @JvmField val AWS = of("AWS")

                @JvmField val PADDLE = of("PADDLE")

                @JvmField val PADDLE_SANDBOX = of("PADDLE_SANDBOX")

                @JvmField val SALESFORCE = of("SALESFORCE")

                @JvmField val XERO = of("XERO")

                @JvmField val CHARGEBEE = of("CHARGEBEE")

                @JvmField val QUICKBOOKS = of("QUICKBOOKS")

                @JvmField val QUICKBOOKS_SANDBOX = of("QUICKBOOKS_SANDBOX")

                @JvmField val M3TER = of("M3TER")

                @JvmStatic fun of(value: String) = Destination(JsonField.of(value))
            }

            /** An enum containing [Destination]'s known values. */
            enum class Known {
                WEBHOOK,
                NETSUITE,
                STRIPE,
                STRIPE_TEST,
                AWS,
                PADDLE,
                PADDLE_SANDBOX,
                SALESFORCE,
                XERO,
                CHARGEBEE,
                QUICKBOOKS,
                QUICKBOOKS_SANDBOX,
                M3TER,
            }

            /**
             * An enum containing [Destination]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Destination] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                WEBHOOK,
                NETSUITE,
                STRIPE,
                STRIPE_TEST,
                AWS,
                PADDLE,
                PADDLE_SANDBOX,
                SALESFORCE,
                XERO,
                CHARGEBEE,
                QUICKBOOKS,
                QUICKBOOKS_SANDBOX,
                M3TER,
                /**
                 * An enum member indicating that [Destination] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    WEBHOOK -> Value.WEBHOOK
                    NETSUITE -> Value.NETSUITE
                    STRIPE -> Value.STRIPE
                    STRIPE_TEST -> Value.STRIPE_TEST
                    AWS -> Value.AWS
                    PADDLE -> Value.PADDLE
                    PADDLE_SANDBOX -> Value.PADDLE_SANDBOX
                    SALESFORCE -> Value.SALESFORCE
                    XERO -> Value.XERO
                    CHARGEBEE -> Value.CHARGEBEE
                    QUICKBOOKS -> Value.QUICKBOOKS
                    QUICKBOOKS_SANDBOX -> Value.QUICKBOOKS_SANDBOX
                    M3TER -> Value.M3TER
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws M3terInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    WEBHOOK -> Known.WEBHOOK
                    NETSUITE -> Known.NETSUITE
                    STRIPE -> Known.STRIPE
                    STRIPE_TEST -> Known.STRIPE_TEST
                    AWS -> Known.AWS
                    PADDLE -> Known.PADDLE
                    PADDLE_SANDBOX -> Known.PADDLE_SANDBOX
                    SALESFORCE -> Known.SALESFORCE
                    XERO -> Known.XERO
                    CHARGEBEE -> Known.CHARGEBEE
                    QUICKBOOKS -> Known.QUICKBOOKS
                    QUICKBOOKS_SANDBOX -> Known.QUICKBOOKS_SANDBOX
                    M3TER -> Known.M3TER
                    else -> throw M3terInvalidDataException("Unknown Destination: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws M3terInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    M3terInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Destination = apply {
                if (validated) {
                    return@apply
                }

                known()
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
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Destination && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Credentials && type == other.type && destination == other.destination && empty == other.empty && name == other.name && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, destination, empty, name, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Credentials{type=$type, destination=$destination, empty=$empty, name=$name, version=$version, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IntegrationConfigurationUpdateParams && orgId == other.orgId && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "IntegrationConfigurationUpdateParams{orgId=$orgId, id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
