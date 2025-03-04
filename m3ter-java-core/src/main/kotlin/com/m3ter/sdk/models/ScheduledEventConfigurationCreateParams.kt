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

/** Create a new ScheduledEventConfiguration. */
class ScheduledEventConfigurationCreateParams
private constructor(
    private val orgId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    /**
     * The referenced configuration or billing entity for which the desired scheduled Event will
     * trigger.
     */
    fun entity(): String = body.entity()

    /**
     * A DateTime field for which the desired scheduled Event will trigger - this must be a DateTime
     * field on the referenced billing or configuration entity.
     */
    fun field(): String = body.field()

    /**
     * The name of the custom Scheduled Event Configuration.
     *
     * This must be in the format:
     * - scheduled._name of entity_._custom event name_
     *
     * For example:
     * - `scheduled.bill.endDateEvent`
     */
    fun name(): String = body.name()

    /**
     * The offset in days from the specified DateTime field on the referenced entity when the
     * scheduled Event will trigger.
     */
    fun offset(): Long = body.offset()

    /**
     * The version number of the scheduled event configuration:
     * - **Create entity**: Not valid for initial insertion - do not use for Create. On initial
     *   Create, version is set at 1 and listed in the response.
     * - **Update Entity**: On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     */
    fun version(): Optional<Long> = body.version()

    /**
     * The referenced configuration or billing entity for which the desired scheduled Event will
     * trigger.
     */
    fun _entity(): JsonField<String> = body._entity()

    /**
     * A DateTime field for which the desired scheduled Event will trigger - this must be a DateTime
     * field on the referenced billing or configuration entity.
     */
    fun _field(): JsonField<String> = body._field()

    /**
     * The name of the custom Scheduled Event Configuration.
     *
     * This must be in the format:
     * - scheduled._name of entity_._custom event name_
     *
     * For example:
     * - `scheduled.bill.endDateEvent`
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * The offset in days from the specified DateTime field on the referenced entity when the
     * scheduled Event will trigger.
     */
    fun _offset(): JsonField<Long> = body._offset()

    /**
     * The version number of the scheduled event configuration:
     * - **Create entity**: Not valid for initial insertion - do not use for Create. On initial
     *   Create, version is set at 1 and listed in the response.
     * - **Update Entity**: On Update, version is required and must match the existing version
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

    /** Request containing a ScheduledEventConfiguration entity */
    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("entity")
        @ExcludeMissing
        private val entity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("field")
        @ExcludeMissing
        private val field: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("offset")
        @ExcludeMissing
        private val offset: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("version")
        @ExcludeMissing
        private val version: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The referenced configuration or billing entity for which the desired scheduled Event will
         * trigger.
         */
        fun entity(): String = entity.getRequired("entity")

        /**
         * A DateTime field for which the desired scheduled Event will trigger - this must be a
         * DateTime field on the referenced billing or configuration entity.
         */
        fun field(): String = field.getRequired("field")

        /**
         * The name of the custom Scheduled Event Configuration.
         *
         * This must be in the format:
         * - scheduled._name of entity_._custom event name_
         *
         * For example:
         * - `scheduled.bill.endDateEvent`
         */
        fun name(): String = name.getRequired("name")

        /**
         * The offset in days from the specified DateTime field on the referenced entity when the
         * scheduled Event will trigger.
         */
        fun offset(): Long = offset.getRequired("offset")

        /**
         * The version number of the scheduled event configuration:
         * - **Create entity**: Not valid for initial insertion - do not use for Create. On initial
         *   Create, version is set at 1 and listed in the response.
         * - **Update Entity**: On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

        /**
         * The referenced configuration or billing entity for which the desired scheduled Event will
         * trigger.
         */
        @JsonProperty("entity") @ExcludeMissing fun _entity(): JsonField<String> = entity

        /**
         * A DateTime field for which the desired scheduled Event will trigger - this must be a
         * DateTime field on the referenced billing or configuration entity.
         */
        @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<String> = field

        /**
         * The name of the custom Scheduled Event Configuration.
         *
         * This must be in the format:
         * - scheduled._name of entity_._custom event name_
         *
         * For example:
         * - `scheduled.bill.endDateEvent`
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * The offset in days from the specified DateTime field on the referenced entity when the
         * scheduled Event will trigger.
         */
        @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Long> = offset

        /**
         * The version number of the scheduled event configuration:
         * - **Create entity**: Not valid for initial insertion - do not use for Create. On initial
         *   Create, version is set at 1 and listed in the response.
         * - **Update Entity**: On Update, version is required and must match the existing version
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

            entity()
            field()
            name()
            offset()
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
             * .entity()
             * .field()
             * .name()
             * .offset()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var entity: JsonField<String>? = null
            private var field: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var offset: JsonField<Long>? = null
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                entity = body.entity
                field = body.field
                name = body.name
                offset = body.offset
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The referenced configuration or billing entity for which the desired scheduled Event
             * will trigger.
             */
            fun entity(entity: String) = entity(JsonField.of(entity))

            /**
             * The referenced configuration or billing entity for which the desired scheduled Event
             * will trigger.
             */
            fun entity(entity: JsonField<String>) = apply { this.entity = entity }

            /**
             * A DateTime field for which the desired scheduled Event will trigger - this must be a
             * DateTime field on the referenced billing or configuration entity.
             */
            fun field(field: String) = field(JsonField.of(field))

            /**
             * A DateTime field for which the desired scheduled Event will trigger - this must be a
             * DateTime field on the referenced billing or configuration entity.
             */
            fun field(field: JsonField<String>) = apply { this.field = field }

            /**
             * The name of the custom Scheduled Event Configuration.
             *
             * This must be in the format:
             * - scheduled._name of entity_._custom event name_
             *
             * For example:
             * - `scheduled.bill.endDateEvent`
             */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * The name of the custom Scheduled Event Configuration.
             *
             * This must be in the format:
             * - scheduled._name of entity_._custom event name_
             *
             * For example:
             * - `scheduled.bill.endDateEvent`
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * The offset in days from the specified DateTime field on the referenced entity when
             * the scheduled Event will trigger.
             */
            fun offset(offset: Long) = offset(JsonField.of(offset))

            /**
             * The offset in days from the specified DateTime field on the referenced entity when
             * the scheduled Event will trigger.
             */
            fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

            /**
             * The version number of the scheduled event configuration:
             * - **Create entity**: Not valid for initial insertion - do not use for Create. On
             *   initial Create, version is set at 1 and listed in the response.
             * - **Update Entity**: On Update, version is required and must match the existing
             *   version because a check is performed to ensure sequential versioning is preserved.
             *   Version is incremented by 1 and listed in the response.
             */
            fun version(version: Long) = version(JsonField.of(version))

            /**
             * The version number of the scheduled event configuration:
             * - **Create entity**: Not valid for initial insertion - do not use for Create. On
             *   initial Create, version is set at 1 and listed in the response.
             * - **Update Entity**: On Update, version is required and must match the existing
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
                    checkRequired("entity", entity),
                    checkRequired("field", field),
                    checkRequired("name", name),
                    checkRequired("offset", offset),
                    version,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && entity == other.entity && field == other.field && name == other.name && offset == other.offset && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(entity, field, name, offset, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{entity=$entity, field=$field, name=$name, offset=$offset, version=$version, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ScheduledEventConfigurationCreateParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .entity()
         * .field()
         * .name()
         * .offset()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScheduledEventConfigurationCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            scheduledEventConfigurationCreateParams: ScheduledEventConfigurationCreateParams
        ) = apply {
            orgId = scheduledEventConfigurationCreateParams.orgId
            body = scheduledEventConfigurationCreateParams.body.toBuilder()
            additionalHeaders =
                scheduledEventConfigurationCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                scheduledEventConfigurationCreateParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /**
         * The referenced configuration or billing entity for which the desired scheduled Event will
         * trigger.
         */
        fun entity(entity: String) = apply { body.entity(entity) }

        /**
         * The referenced configuration or billing entity for which the desired scheduled Event will
         * trigger.
         */
        fun entity(entity: JsonField<String>) = apply { body.entity(entity) }

        /**
         * A DateTime field for which the desired scheduled Event will trigger - this must be a
         * DateTime field on the referenced billing or configuration entity.
         */
        fun field(field: String) = apply { body.field(field) }

        /**
         * A DateTime field for which the desired scheduled Event will trigger - this must be a
         * DateTime field on the referenced billing or configuration entity.
         */
        fun field(field: JsonField<String>) = apply { body.field(field) }

        /**
         * The name of the custom Scheduled Event Configuration.
         *
         * This must be in the format:
         * - scheduled._name of entity_._custom event name_
         *
         * For example:
         * - `scheduled.bill.endDateEvent`
         */
        fun name(name: String) = apply { body.name(name) }

        /**
         * The name of the custom Scheduled Event Configuration.
         *
         * This must be in the format:
         * - scheduled._name of entity_._custom event name_
         *
         * For example:
         * - `scheduled.bill.endDateEvent`
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * The offset in days from the specified DateTime field on the referenced entity when the
         * scheduled Event will trigger.
         */
        fun offset(offset: Long) = apply { body.offset(offset) }

        /**
         * The offset in days from the specified DateTime field on the referenced entity when the
         * scheduled Event will trigger.
         */
        fun offset(offset: JsonField<Long>) = apply { body.offset(offset) }

        /**
         * The version number of the scheduled event configuration:
         * - **Create entity**: Not valid for initial insertion - do not use for Create. On initial
         *   Create, version is set at 1 and listed in the response.
         * - **Update Entity**: On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        fun version(version: Long) = apply { body.version(version) }

        /**
         * The version number of the scheduled event configuration:
         * - **Create entity**: Not valid for initial insertion - do not use for Create. On initial
         *   Create, version is set at 1 and listed in the response.
         * - **Update Entity**: On Update, version is required and must match the existing version
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

        fun build(): ScheduledEventConfigurationCreateParams =
            ScheduledEventConfigurationCreateParams(
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

        return /* spotless:off */ other is ScheduledEventConfigurationCreateParams && orgId == other.orgId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ScheduledEventConfigurationCreateParams{orgId=$orgId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
