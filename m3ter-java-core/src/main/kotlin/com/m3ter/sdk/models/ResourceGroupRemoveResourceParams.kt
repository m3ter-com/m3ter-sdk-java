// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.m3ter.sdk.core.Enum
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
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.util.Objects
import java.util.Optional

/** Remove an item from a ResourceGroup. */
class ResourceGroupRemoveResourceParams
private constructor(
    private val orgId: String,
    private val type: String,
    private val resourceGroupId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    fun type(): String = type

    fun resourceGroupId(): String = resourceGroupId

    /**
     * The id of the item or group you want to:
     * - _Add Item_ call: add to a Resource Group.
     * - _Remove Item_ call: remove from the Resource Group.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun targetId(): String = body.targetId()

    /**
     * When adding to or removing from a Resource Group, specify whether a single item or group:
     * - `item`
     *     - _Add Item_ call: use to add a single meter to a Resource Group
     *     - _Remove Item_ call: use to remove a single from a Resource Group.
     * - `group`
     *     - _Add Item_ call: use to add a Resource Group to another Resource Group and form a
     *       nested Resource Group
     *     - _Remove Item_ call: use remove a nested Resource Group from a Resource Group.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun targetType(): TargetType = body.targetType()

    /**
     * The version number of the group.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun version(): Optional<Long> = body.version()

    /**
     * Returns the raw JSON value of [targetId].
     *
     * Unlike [targetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _targetId(): JsonField<String> = body._targetId()

    /**
     * Returns the raw JSON value of [targetType].
     *
     * Unlike [targetType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _targetType(): JsonField<TargetType> = body._targetType()

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _version(): JsonField<Long> = body._version()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId
            1 -> type
            2 -> resourceGroupId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("targetId")
        @ExcludeMissing
        private val targetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("targetType")
        @ExcludeMissing
        private val targetType: JsonField<TargetType> = JsonMissing.of(),
        @JsonProperty("version")
        @ExcludeMissing
        private val version: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The id of the item or group you want to:
         * - _Add Item_ call: add to a Resource Group.
         * - _Remove Item_ call: remove from the Resource Group.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun targetId(): String = targetId.getRequired("targetId")

        /**
         * When adding to or removing from a Resource Group, specify whether a single item or group:
         * - `item`
         *     - _Add Item_ call: use to add a single meter to a Resource Group
         *     - _Remove Item_ call: use to remove a single from a Resource Group.
         * - `group`
         *     - _Add Item_ call: use to add a Resource Group to another Resource Group and form a
         *       nested Resource Group
         *     - _Remove Item_ call: use remove a nested Resource Group from a Resource Group.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun targetType(): TargetType = targetType.getRequired("targetType")

        /**
         * The version number of the group.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

        /**
         * Returns the raw JSON value of [targetId].
         *
         * Unlike [targetId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("targetId") @ExcludeMissing fun _targetId(): JsonField<String> = targetId

        /**
         * Returns the raw JSON value of [targetType].
         *
         * Unlike [targetType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("targetType")
        @ExcludeMissing
        fun _targetType(): JsonField<TargetType> = targetType

        /**
         * Returns the raw JSON value of [version].
         *
         * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
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

            targetId()
            targetType()
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
             * .targetId()
             * .targetType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var targetId: JsonField<String>? = null
            private var targetType: JsonField<TargetType>? = null
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                targetId = body.targetId
                targetType = body.targetType
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The id of the item or group you want to:
             * - _Add Item_ call: add to a Resource Group.
             * - _Remove Item_ call: remove from the Resource Group.
             */
            fun targetId(targetId: String) = targetId(JsonField.of(targetId))

            /**
             * Sets [Builder.targetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetId(targetId: JsonField<String>) = apply { this.targetId = targetId }

            /**
             * When adding to or removing from a Resource Group, specify whether a single item or
             * group:
             * - `item`
             *     - _Add Item_ call: use to add a single meter to a Resource Group
             *     - _Remove Item_ call: use to remove a single from a Resource Group.
             * - `group`
             *     - _Add Item_ call: use to add a Resource Group to another Resource Group and form
             *       a nested Resource Group
             *     - _Remove Item_ call: use remove a nested Resource Group from a Resource Group.
             */
            fun targetType(targetType: TargetType) = targetType(JsonField.of(targetType))

            /**
             * Sets [Builder.targetType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetType] with a well-typed [TargetType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetType(targetType: JsonField<TargetType>) = apply {
                this.targetType = targetType
            }

            /** The version number of the group. */
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
             * .targetId()
             * .targetType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("targetId", targetId),
                    checkRequired("targetType", targetType),
                    version,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && targetId == other.targetId && targetType == other.targetType && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(targetId, targetType, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{targetId=$targetId, targetType=$targetType, version=$version, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ResourceGroupRemoveResourceParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .type()
         * .resourceGroupId()
         * .targetId()
         * .targetType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ResourceGroupRemoveResourceParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var type: String? = null
        private var resourceGroupId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(resourceGroupRemoveResourceParams: ResourceGroupRemoveResourceParams) =
            apply {
                orgId = resourceGroupRemoveResourceParams.orgId
                type = resourceGroupRemoveResourceParams.type
                resourceGroupId = resourceGroupRemoveResourceParams.resourceGroupId
                body = resourceGroupRemoveResourceParams.body.toBuilder()
                additionalHeaders = resourceGroupRemoveResourceParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    resourceGroupRemoveResourceParams.additionalQueryParams.toBuilder()
            }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        fun type(type: String) = apply { this.type = type }

        fun resourceGroupId(resourceGroupId: String) = apply {
            this.resourceGroupId = resourceGroupId
        }

        /**
         * The id of the item or group you want to:
         * - _Add Item_ call: add to a Resource Group.
         * - _Remove Item_ call: remove from the Resource Group.
         */
        fun targetId(targetId: String) = apply { body.targetId(targetId) }

        /**
         * Sets [Builder.targetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun targetId(targetId: JsonField<String>) = apply { body.targetId(targetId) }

        /**
         * When adding to or removing from a Resource Group, specify whether a single item or group:
         * - `item`
         *     - _Add Item_ call: use to add a single meter to a Resource Group
         *     - _Remove Item_ call: use to remove a single from a Resource Group.
         * - `group`
         *     - _Add Item_ call: use to add a Resource Group to another Resource Group and form a
         *       nested Resource Group
         *     - _Remove Item_ call: use remove a nested Resource Group from a Resource Group.
         */
        fun targetType(targetType: TargetType) = apply { body.targetType(targetType) }

        /**
         * Sets [Builder.targetType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetType] with a well-typed [TargetType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun targetType(targetType: JsonField<TargetType>) = apply { body.targetType(targetType) }

        /** The version number of the group. */
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
         * Returns an immutable instance of [ResourceGroupRemoveResourceParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .type()
         * .resourceGroupId()
         * .targetId()
         * .targetType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ResourceGroupRemoveResourceParams =
            ResourceGroupRemoveResourceParams(
                checkRequired("orgId", orgId),
                checkRequired("type", type),
                checkRequired("resourceGroupId", resourceGroupId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * When adding to or removing from a Resource Group, specify whether a single item or group:
     * - `item`
     *     - _Add Item_ call: use to add a single meter to a Resource Group
     *     - _Remove Item_ call: use to remove a single from a Resource Group.
     * - `group`
     *     - _Add Item_ call: use to add a Resource Group to another Resource Group and form a
     *       nested Resource Group
     *     - _Remove Item_ call: use remove a nested Resource Group from a Resource Group.
     */
    class TargetType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ITEM = of("ITEM")

            @JvmField val GROUP = of("GROUP")

            @JvmStatic fun of(value: String) = TargetType(JsonField.of(value))
        }

        /** An enum containing [TargetType]'s known values. */
        enum class Known {
            ITEM,
            GROUP,
        }

        /**
         * An enum containing [TargetType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TargetType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ITEM,
            GROUP,
            /**
             * An enum member indicating that [TargetType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ITEM -> Value.ITEM
                GROUP -> Value.GROUP
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws M3terInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                ITEM -> Known.ITEM
                GROUP -> Known.GROUP
                else -> throw M3terInvalidDataException("Unknown TargetType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws M3terInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { M3terInvalidDataException("Value is not a String") }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TargetType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResourceGroupRemoveResourceParams && orgId == other.orgId && type == other.type && resourceGroupId == other.resourceGroupId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, type, resourceGroupId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ResourceGroupRemoveResourceParams{orgId=$orgId, type=$type, resourceGroupId=$resourceGroupId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
