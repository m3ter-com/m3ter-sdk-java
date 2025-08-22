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
import com.m3ter.core.checkKnown
import com.m3ter.core.checkRequired
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PermissionStatementResponse
private constructor(
    private val action: JsonField<List<Action>>,
    private val effect: JsonField<Effect>,
    private val resource: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("action") @ExcludeMissing action: JsonField<List<Action>> = JsonMissing.of(),
        @JsonProperty("effect") @ExcludeMissing effect: JsonField<Effect> = JsonMissing.of(),
        @JsonProperty("resource")
        @ExcludeMissing
        resource: JsonField<List<String>> = JsonMissing.of(),
    ) : this(action, effect, resource, mutableMapOf())

    /**
     * The actions available to users who are assigned the Permission Policy - what they can do or
     * cannot do with respect to the specified resource.
     *
     * **NOTE:** Use lower case and a colon-separated format, for example, if you want to confer
     * full CRUD, use:
     * ```
     * "config:create",
     * "config:delete",
     * "config:retrieve",
     * "config:update"
     * ```
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun action(): List<Action> = action.getRequired("action")

    /**
     * Specifies whether or not the user is allowed to perform the action on the resource.
     *
     * **NOTE:** Use lower case, for example: `"allow"`. If you use upper case, you'll receive an
     * error.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun effect(): Effect = effect.getRequired("effect")

    /**
     * See
     * [Statements - Available Resources](https://www.m3ter.com/docs/guides/managing-organization-and-users/creating-and-managing-permissions#statements---available-resources)
     * for a listing of available resources for Permission Policy statements.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun resource(): List<String> = resource.getRequired("resource")

    /**
     * Returns the raw JSON value of [action].
     *
     * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<List<Action>> = action

    /**
     * Returns the raw JSON value of [effect].
     *
     * Unlike [effect], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("effect") @ExcludeMissing fun _effect(): JsonField<Effect> = effect

    /**
     * Returns the raw JSON value of [resource].
     *
     * Unlike [resource], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resource") @ExcludeMissing fun _resource(): JsonField<List<String>> = resource

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
         * Returns a mutable builder for constructing an instance of [PermissionStatementResponse].
         *
         * The following fields are required:
         * ```java
         * .action()
         * .effect()
         * .resource()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PermissionStatementResponse]. */
    class Builder internal constructor() {

        private var action: JsonField<MutableList<Action>>? = null
        private var effect: JsonField<Effect>? = null
        private var resource: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(permissionStatementResponse: PermissionStatementResponse) = apply {
            action = permissionStatementResponse.action.map { it.toMutableList() }
            effect = permissionStatementResponse.effect
            resource = permissionStatementResponse.resource.map { it.toMutableList() }
            additionalProperties = permissionStatementResponse.additionalProperties.toMutableMap()
        }

        /**
         * The actions available to users who are assigned the Permission Policy - what they can do
         * or cannot do with respect to the specified resource.
         *
         * **NOTE:** Use lower case and a colon-separated format, for example, if you want to confer
         * full CRUD, use:
         * ```
         * "config:create",
         * "config:delete",
         * "config:retrieve",
         * "config:update"
         * ```
         */
        fun action(action: List<Action>) = action(JsonField.of(action))

        /**
         * Sets [Builder.action] to an arbitrary JSON value.
         *
         * You should usually call [Builder.action] with a well-typed `List<Action>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun action(action: JsonField<List<Action>>) = apply {
            this.action = action.map { it.toMutableList() }
        }

        /**
         * Adds a single [Action] to [Builder.action].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAction(action: Action) = apply {
            this.action =
                (this.action ?: JsonField.of(mutableListOf())).also {
                    checkKnown("action", it).add(action)
                }
        }

        /**
         * Specifies whether or not the user is allowed to perform the action on the resource.
         *
         * **NOTE:** Use lower case, for example: `"allow"`. If you use upper case, you'll receive
         * an error.
         */
        fun effect(effect: Effect) = effect(JsonField.of(effect))

        /**
         * Sets [Builder.effect] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effect] with a well-typed [Effect] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun effect(effect: JsonField<Effect>) = apply { this.effect = effect }

        /**
         * See
         * [Statements - Available Resources](https://www.m3ter.com/docs/guides/managing-organization-and-users/creating-and-managing-permissions#statements---available-resources)
         * for a listing of available resources for Permission Policy statements.
         */
        fun resource(resource: List<String>) = resource(JsonField.of(resource))

        /**
         * Sets [Builder.resource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resource] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resource(resource: JsonField<List<String>>) = apply {
            this.resource = resource.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.resource].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResource(resource: String) = apply {
            this.resource =
                (this.resource ?: JsonField.of(mutableListOf())).also {
                    checkKnown("resource", it).add(resource)
                }
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAlladditional_properties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAlladditional_properties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [PermissionStatementResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .action()
         * .effect()
         * .resource()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PermissionStatementResponse =
            PermissionStatementResponse(
                checkRequired("action", action).map { it.toImmutable() },
                checkRequired("effect", effect),
                checkRequired("resource", resource).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PermissionStatementResponse = apply {
        if (validated) {
            return@apply
        }

        action().forEach { it.validate() }
        effect().validate()
        resource()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (action.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (effect.asKnown().getOrNull()?.validity() ?: 0) +
            (resource.asKnown().getOrNull()?.size ?: 0)

    class Action @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ALL = of("ALL")

            @JvmField val CONFIG_CREATE = of("CONFIG_CREATE")

            @JvmField val CONFIG_RETRIEVE = of("CONFIG_RETRIEVE")

            @JvmField val CONFIG_UPDATE = of("CONFIG_UPDATE")

            @JvmField val CONFIG_DELETE = of("CONFIG_DELETE")

            @JvmField val CONFIG_EXPORT = of("CONFIG_EXPORT")

            @JvmField val ANALYTICS_QUERY = of("ANALYTICS_QUERY")

            @JvmField val MEASUREMENTS_UPLOAD = of("MEASUREMENTS_UPLOAD")

            @JvmField val MEASUREMENTS_FILEUPLOAD = of("MEASUREMENTS_FILEUPLOAD")

            @JvmField val MEASUREMENTS_RETRIEVE = of("MEASUREMENTS_RETRIEVE")

            @JvmField val MEASUREMENTS_EXPORT = of("MEASUREMENTS_EXPORT")

            @JvmField val FORECAST_RETRIEVE = of("FORECAST_RETRIEVE")

            @JvmField val HEALTHSCORES_RETRIEVE = of("HEALTHSCORES_RETRIEVE")

            @JvmField val ANOMALIES_RETRIEVE = of("ANOMALIES_RETRIEVE")

            @JvmField val EXPORTS_DOWNLOAD = of("EXPORTS_DOWNLOAD")

            @JvmField val MARKETPLACE_USAGE_CREATE = of("MARKETPLACE_USAGE_CREATE")

            @JvmField val MARKETPLACE_USAGE_RETRIEVE = of("MARKETPLACE_USAGE_RETRIEVE")

            @JvmStatic fun of(value: String) = Action(JsonField.of(value))
        }

        /** An enum containing [Action]'s known values. */
        enum class Known {
            ALL,
            CONFIG_CREATE,
            CONFIG_RETRIEVE,
            CONFIG_UPDATE,
            CONFIG_DELETE,
            CONFIG_EXPORT,
            ANALYTICS_QUERY,
            MEASUREMENTS_UPLOAD,
            MEASUREMENTS_FILEUPLOAD,
            MEASUREMENTS_RETRIEVE,
            MEASUREMENTS_EXPORT,
            FORECAST_RETRIEVE,
            HEALTHSCORES_RETRIEVE,
            ANOMALIES_RETRIEVE,
            EXPORTS_DOWNLOAD,
            MARKETPLACE_USAGE_CREATE,
            MARKETPLACE_USAGE_RETRIEVE,
        }

        /**
         * An enum containing [Action]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Action] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALL,
            CONFIG_CREATE,
            CONFIG_RETRIEVE,
            CONFIG_UPDATE,
            CONFIG_DELETE,
            CONFIG_EXPORT,
            ANALYTICS_QUERY,
            MEASUREMENTS_UPLOAD,
            MEASUREMENTS_FILEUPLOAD,
            MEASUREMENTS_RETRIEVE,
            MEASUREMENTS_EXPORT,
            FORECAST_RETRIEVE,
            HEALTHSCORES_RETRIEVE,
            ANOMALIES_RETRIEVE,
            EXPORTS_DOWNLOAD,
            MARKETPLACE_USAGE_CREATE,
            MARKETPLACE_USAGE_RETRIEVE,
            /** An enum member indicating that [Action] was instantiated with an unknown value. */
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
                ALL -> Value.ALL
                CONFIG_CREATE -> Value.CONFIG_CREATE
                CONFIG_RETRIEVE -> Value.CONFIG_RETRIEVE
                CONFIG_UPDATE -> Value.CONFIG_UPDATE
                CONFIG_DELETE -> Value.CONFIG_DELETE
                CONFIG_EXPORT -> Value.CONFIG_EXPORT
                ANALYTICS_QUERY -> Value.ANALYTICS_QUERY
                MEASUREMENTS_UPLOAD -> Value.MEASUREMENTS_UPLOAD
                MEASUREMENTS_FILEUPLOAD -> Value.MEASUREMENTS_FILEUPLOAD
                MEASUREMENTS_RETRIEVE -> Value.MEASUREMENTS_RETRIEVE
                MEASUREMENTS_EXPORT -> Value.MEASUREMENTS_EXPORT
                FORECAST_RETRIEVE -> Value.FORECAST_RETRIEVE
                HEALTHSCORES_RETRIEVE -> Value.HEALTHSCORES_RETRIEVE
                ANOMALIES_RETRIEVE -> Value.ANOMALIES_RETRIEVE
                EXPORTS_DOWNLOAD -> Value.EXPORTS_DOWNLOAD
                MARKETPLACE_USAGE_CREATE -> Value.MARKETPLACE_USAGE_CREATE
                MARKETPLACE_USAGE_RETRIEVE -> Value.MARKETPLACE_USAGE_RETRIEVE
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
                ALL -> Known.ALL
                CONFIG_CREATE -> Known.CONFIG_CREATE
                CONFIG_RETRIEVE -> Known.CONFIG_RETRIEVE
                CONFIG_UPDATE -> Known.CONFIG_UPDATE
                CONFIG_DELETE -> Known.CONFIG_DELETE
                CONFIG_EXPORT -> Known.CONFIG_EXPORT
                ANALYTICS_QUERY -> Known.ANALYTICS_QUERY
                MEASUREMENTS_UPLOAD -> Known.MEASUREMENTS_UPLOAD
                MEASUREMENTS_FILEUPLOAD -> Known.MEASUREMENTS_FILEUPLOAD
                MEASUREMENTS_RETRIEVE -> Known.MEASUREMENTS_RETRIEVE
                MEASUREMENTS_EXPORT -> Known.MEASUREMENTS_EXPORT
                FORECAST_RETRIEVE -> Known.FORECAST_RETRIEVE
                HEALTHSCORES_RETRIEVE -> Known.HEALTHSCORES_RETRIEVE
                ANOMALIES_RETRIEVE -> Known.ANOMALIES_RETRIEVE
                EXPORTS_DOWNLOAD -> Known.EXPORTS_DOWNLOAD
                MARKETPLACE_USAGE_CREATE -> Known.MARKETPLACE_USAGE_CREATE
                MARKETPLACE_USAGE_RETRIEVE -> Known.MARKETPLACE_USAGE_RETRIEVE
                else -> throw M3terInvalidDataException("Unknown Action: $value")
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

        private var validated: Boolean = false

        fun validate(): Action = apply {
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

            return other is Action && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Specifies whether or not the user is allowed to perform the action on the resource.
     *
     * **NOTE:** Use lower case, for example: `"allow"`. If you use upper case, you'll receive an
     * error.
     */
    class Effect @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ALLOW = of("ALLOW")

            @JvmField val DENY = of("DENY")

            @JvmStatic fun of(value: String) = Effect(JsonField.of(value))
        }

        /** An enum containing [Effect]'s known values. */
        enum class Known {
            ALLOW,
            DENY,
        }

        /**
         * An enum containing [Effect]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Effect] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALLOW,
            DENY,
            /** An enum member indicating that [Effect] was instantiated with an unknown value. */
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
                ALLOW -> Value.ALLOW
                DENY -> Value.DENY
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
                ALLOW -> Known.ALLOW
                DENY -> Known.DENY
                else -> throw M3terInvalidDataException("Unknown Effect: $value")
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

        private var validated: Boolean = false

        fun validate(): Effect = apply {
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

            return other is Effect && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PermissionStatementResponse &&
            action == other.action &&
            effect == other.effect &&
            resource == other.resource &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(action, effect, resource, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PermissionStatementResponse{action=$action, effect=$effect, resource=$resource, additionalProperties=$additionalProperties}"
}
