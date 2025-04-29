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
 * Create a new Notification for an Event.
 *
 * This endpoint enables you to create a new Event Notification for the specified Organization. You
 * need to supply a request body with the details of the new Notification.
 */
class NotificationConfigurationCreateParams
private constructor(
    private val orgId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    /**
     * The short code for the Notification.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun code(): String = body.code()

    /**
     * The description for the Notification providing a brief overview of its purpose and
     * functionality.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = body.description()

    /**
     * The name of the _Event type_ that the Notification is based on. When an Event of this type
     * occurs and any calculation built into the Notification evaluates to `True`, the Notification
     * is triggered.
     *
     * **Note:** If the Notification is set to always fire, then the Notification will always be
     * sent when the Event of the type it is based on occurs, and without any other conditions
     * defined by a calculation having to be met.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventName(): String = body.eventName()

    /**
     * The name of the Notification.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * Boolean flag that sets the Notification as active or inactive. Only active Notifications are
     * sent when triggered by the Event they are based on:
     * - **TRUE** - set Notification as active.
     * - **FALSE** - set Notification as inactive.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun active(): Optional<Boolean> = body.active()

    /**
     * A Boolean flag indicating whether the Notification is always triggered, regardless of other
     * conditions and omitting reference to any calculation. This means the Notification will be
     * triggered simply by the Event it is based on occurring and with no further conditions having
     * to be met.
     * - **TRUE** - the Notification is always triggered and omits any reference to the calculation
     *   to check for other conditions being true before triggering the Notification.
     * - **FALSE** - the Notification is only triggered when the Event it is based on occurs and any
     *   calculation is checked and all conditions defined by the calculation are met.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun alwaysFireEvent(): Optional<Boolean> = body.alwaysFireEvent()

    /**
     * A logical expression that that is evaluated to a Boolean. If it evaluates as `True`, a
     * Notification for the Event is created and sent to the configured destination. Calculations
     * can reference numeric, string, and boolean Event fields.
     *
     * See
     * [Creating Calculations](https://www.m3ter.com/docs/guides/utilizing-events-and-notifications/key-concepts-and-relationships#creating-calculations)
     * in the m3ter documentation for more information.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun calculation(): Optional<String> = body.calculation()

    /**
     * The version number for the Notification:
     * - **Create:** Not valid for initial insertion of new entity - _do not use for Create_. On
     *   initial Create, version is set at 1 and listed in the response.
     * - **Update:** On Update, version is required and must match the existing version because a
     *   check is performed to ensure sequential versioning is preserved. Version is incremented by
     *   1 and listed in the response.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun version(): Optional<Long> = body.version()

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _code(): JsonField<String> = body._code()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [eventName].
     *
     * Unlike [eventName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _eventName(): JsonField<String> = body._eventName()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [active].
     *
     * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _active(): JsonField<Boolean> = body._active()

    /**
     * Returns the raw JSON value of [alwaysFireEvent].
     *
     * Unlike [alwaysFireEvent], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _alwaysFireEvent(): JsonField<Boolean> = body._alwaysFireEvent()

    /**
     * Returns the raw JSON value of [calculation].
     *
     * Unlike [calculation], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _calculation(): JsonField<String> = body._calculation()

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
         * [NotificationConfigurationCreateParams].
         *
         * The following fields are required:
         * ```java
         * .code()
         * .description()
         * .eventName()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NotificationConfigurationCreateParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            notificationConfigurationCreateParams: NotificationConfigurationCreateParams
        ) = apply {
            orgId = notificationConfigurationCreateParams.orgId
            body = notificationConfigurationCreateParams.body.toBuilder()
            additionalHeaders = notificationConfigurationCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                notificationConfigurationCreateParams.additionalQueryParams.toBuilder()
        }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [code]
         * - [description]
         * - [eventName]
         * - [name]
         * - [active]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The short code for the Notification. */
        fun code(code: String) = apply { body.code(code) }

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { body.code(code) }

        /**
         * The description for the Notification providing a brief overview of its purpose and
         * functionality.
         */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * The name of the _Event type_ that the Notification is based on. When an Event of this
         * type occurs and any calculation built into the Notification evaluates to `True`, the
         * Notification is triggered.
         *
         * **Note:** If the Notification is set to always fire, then the Notification will always be
         * sent when the Event of the type it is based on occurs, and without any other conditions
         * defined by a calculation having to be met.
         */
        fun eventName(eventName: String) = apply { body.eventName(eventName) }

        /**
         * Sets [Builder.eventName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventName(eventName: JsonField<String>) = apply { body.eventName(eventName) }

        /** The name of the Notification. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * Boolean flag that sets the Notification as active or inactive. Only active Notifications
         * are sent when triggered by the Event they are based on:
         * - **TRUE** - set Notification as active.
         * - **FALSE** - set Notification as inactive.
         */
        fun active(active: Boolean) = apply { body.active(active) }

        /**
         * Sets [Builder.active] to an arbitrary JSON value.
         *
         * You should usually call [Builder.active] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun active(active: JsonField<Boolean>) = apply { body.active(active) }

        /**
         * A Boolean flag indicating whether the Notification is always triggered, regardless of
         * other conditions and omitting reference to any calculation. This means the Notification
         * will be triggered simply by the Event it is based on occurring and with no further
         * conditions having to be met.
         * - **TRUE** - the Notification is always triggered and omits any reference to the
         *   calculation to check for other conditions being true before triggering the
         *   Notification.
         * - **FALSE** - the Notification is only triggered when the Event it is based on occurs and
         *   any calculation is checked and all conditions defined by the calculation are met.
         */
        fun alwaysFireEvent(alwaysFireEvent: Boolean) = apply {
            body.alwaysFireEvent(alwaysFireEvent)
        }

        /**
         * Sets [Builder.alwaysFireEvent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alwaysFireEvent] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun alwaysFireEvent(alwaysFireEvent: JsonField<Boolean>) = apply {
            body.alwaysFireEvent(alwaysFireEvent)
        }

        /**
         * A logical expression that that is evaluated to a Boolean. If it evaluates as `True`, a
         * Notification for the Event is created and sent to the configured destination.
         * Calculations can reference numeric, string, and boolean Event fields.
         *
         * See
         * [Creating Calculations](https://www.m3ter.com/docs/guides/utilizing-events-and-notifications/key-concepts-and-relationships#creating-calculations)
         * in the m3ter documentation for more information.
         */
        fun calculation(calculation: String) = apply { body.calculation(calculation) }

        /**
         * Sets [Builder.calculation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.calculation] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun calculation(calculation: JsonField<String>) = apply { body.calculation(calculation) }

        /**
         * The version number for the Notification:
         * - **Create:** Not valid for initial insertion of new entity - _do not use for Create_. On
         *   initial Create, version is set at 1 and listed in the response.
         * - **Update:** On Update, version is required and must match the existing version because
         *   a check is performed to ensure sequential versioning is preserved. Version is
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
         * Returns an immutable instance of [NotificationConfigurationCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .code()
         * .description()
         * .eventName()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NotificationConfigurationCreateParams =
            NotificationConfigurationCreateParams(
                orgId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request containing a Notification entity. */
    class Body
    private constructor(
        private val code: JsonField<String>,
        private val description: JsonField<String>,
        private val eventName: JsonField<String>,
        private val name: JsonField<String>,
        private val active: JsonField<Boolean>,
        private val alwaysFireEvent: JsonField<Boolean>,
        private val calculation: JsonField<String>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("eventName")
            @ExcludeMissing
            eventName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("alwaysFireEvent")
            @ExcludeMissing
            alwaysFireEvent: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("calculation")
            @ExcludeMissing
            calculation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(
            code,
            description,
            eventName,
            name,
            active,
            alwaysFireEvent,
            calculation,
            version,
            mutableMapOf(),
        )

        /**
         * The short code for the Notification.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun code(): String = code.getRequired("code")

        /**
         * The description for the Notification providing a brief overview of its purpose and
         * functionality.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun description(): String = description.getRequired("description")

        /**
         * The name of the _Event type_ that the Notification is based on. When an Event of this
         * type occurs and any calculation built into the Notification evaluates to `True`, the
         * Notification is triggered.
         *
         * **Note:** If the Notification is set to always fire, then the Notification will always be
         * sent when the Event of the type it is based on occurs, and without any other conditions
         * defined by a calculation having to be met.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun eventName(): String = eventName.getRequired("eventName")

        /**
         * The name of the Notification.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Boolean flag that sets the Notification as active or inactive. Only active Notifications
         * are sent when triggered by the Event they are based on:
         * - **TRUE** - set Notification as active.
         * - **FALSE** - set Notification as inactive.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun active(): Optional<Boolean> = active.getOptional("active")

        /**
         * A Boolean flag indicating whether the Notification is always triggered, regardless of
         * other conditions and omitting reference to any calculation. This means the Notification
         * will be triggered simply by the Event it is based on occurring and with no further
         * conditions having to be met.
         * - **TRUE** - the Notification is always triggered and omits any reference to the
         *   calculation to check for other conditions being true before triggering the
         *   Notification.
         * - **FALSE** - the Notification is only triggered when the Event it is based on occurs and
         *   any calculation is checked and all conditions defined by the calculation are met.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun alwaysFireEvent(): Optional<Boolean> = alwaysFireEvent.getOptional("alwaysFireEvent")

        /**
         * A logical expression that that is evaluated to a Boolean. If it evaluates as `True`, a
         * Notification for the Event is created and sent to the configured destination.
         * Calculations can reference numeric, string, and boolean Event fields.
         *
         * See
         * [Creating Calculations](https://www.m3ter.com/docs/guides/utilizing-events-and-notifications/key-concepts-and-relationships#creating-calculations)
         * in the m3ter documentation for more information.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun calculation(): Optional<String> = calculation.getOptional("calculation")

        /**
         * The version number for the Notification:
         * - **Create:** Not valid for initial insertion of new entity - _do not use for Create_. On
         *   initial Create, version is set at 1 and listed in the response.
         * - **Update:** On Update, version is required and must match the existing version because
         *   a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun version(): Optional<Long> = version.getOptional("version")

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [eventName].
         *
         * Unlike [eventName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("eventName") @ExcludeMissing fun _eventName(): JsonField<String> = eventName

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [active].
         *
         * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

        /**
         * Returns the raw JSON value of [alwaysFireEvent].
         *
         * Unlike [alwaysFireEvent], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("alwaysFireEvent")
        @ExcludeMissing
        fun _alwaysFireEvent(): JsonField<Boolean> = alwaysFireEvent

        /**
         * Returns the raw JSON value of [calculation].
         *
         * Unlike [calculation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("calculation")
        @ExcludeMissing
        fun _calculation(): JsonField<String> = calculation

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
             * .code()
             * .description()
             * .eventName()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var code: JsonField<String>? = null
            private var description: JsonField<String>? = null
            private var eventName: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var active: JsonField<Boolean> = JsonMissing.of()
            private var alwaysFireEvent: JsonField<Boolean> = JsonMissing.of()
            private var calculation: JsonField<String> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                code = body.code
                description = body.description
                eventName = body.eventName
                name = body.name
                active = body.active
                alwaysFireEvent = body.alwaysFireEvent
                calculation = body.calculation
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The short code for the Notification. */
            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /**
             * The description for the Notification providing a brief overview of its purpose and
             * functionality.
             */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * The name of the _Event type_ that the Notification is based on. When an Event of this
             * type occurs and any calculation built into the Notification evaluates to `True`, the
             * Notification is triggered.
             *
             * **Note:** If the Notification is set to always fire, then the Notification will
             * always be sent when the Event of the type it is based on occurs, and without any
             * other conditions defined by a calculation having to be met.
             */
            fun eventName(eventName: String) = eventName(JsonField.of(eventName))

            /**
             * Sets [Builder.eventName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventName(eventName: JsonField<String>) = apply { this.eventName = eventName }

            /** The name of the Notification. */
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
             * Boolean flag that sets the Notification as active or inactive. Only active
             * Notifications are sent when triggered by the Event they are based on:
             * - **TRUE** - set Notification as active.
             * - **FALSE** - set Notification as inactive.
             */
            fun active(active: Boolean) = active(JsonField.of(active))

            /**
             * Sets [Builder.active] to an arbitrary JSON value.
             *
             * You should usually call [Builder.active] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun active(active: JsonField<Boolean>) = apply { this.active = active }

            /**
             * A Boolean flag indicating whether the Notification is always triggered, regardless of
             * other conditions and omitting reference to any calculation. This means the
             * Notification will be triggered simply by the Event it is based on occurring and with
             * no further conditions having to be met.
             * - **TRUE** - the Notification is always triggered and omits any reference to the
             *   calculation to check for other conditions being true before triggering the
             *   Notification.
             * - **FALSE** - the Notification is only triggered when the Event it is based on occurs
             *   and any calculation is checked and all conditions defined by the calculation are
             *   met.
             */
            fun alwaysFireEvent(alwaysFireEvent: Boolean) =
                alwaysFireEvent(JsonField.of(alwaysFireEvent))

            /**
             * Sets [Builder.alwaysFireEvent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alwaysFireEvent] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun alwaysFireEvent(alwaysFireEvent: JsonField<Boolean>) = apply {
                this.alwaysFireEvent = alwaysFireEvent
            }

            /**
             * A logical expression that that is evaluated to a Boolean. If it evaluates as `True`,
             * a Notification for the Event is created and sent to the configured destination.
             * Calculations can reference numeric, string, and boolean Event fields.
             *
             * See
             * [Creating Calculations](https://www.m3ter.com/docs/guides/utilizing-events-and-notifications/key-concepts-and-relationships#creating-calculations)
             * in the m3ter documentation for more information.
             */
            fun calculation(calculation: String) = calculation(JsonField.of(calculation))

            /**
             * Sets [Builder.calculation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.calculation] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun calculation(calculation: JsonField<String>) = apply {
                this.calculation = calculation
            }

            /**
             * The version number for the Notification:
             * - **Create:** Not valid for initial insertion of new entity - _do not use for
             *   Create_. On initial Create, version is set at 1 and listed in the response.
             * - **Update:** On Update, version is required and must match the existing version
             *   because a check is performed to ensure sequential versioning is preserved. Version
             *   is incremented by 1 and listed in the response.
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
             * .code()
             * .description()
             * .eventName()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("code", code),
                    checkRequired("description", description),
                    checkRequired("eventName", eventName),
                    checkRequired("name", name),
                    active,
                    alwaysFireEvent,
                    calculation,
                    version,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            code()
            description()
            eventName()
            name()
            active()
            alwaysFireEvent()
            calculation()
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
            (if (code.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (eventName.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (active.asKnown().isPresent) 1 else 0) +
                (if (alwaysFireEvent.asKnown().isPresent) 1 else 0) +
                (if (calculation.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && code == other.code && description == other.description && eventName == other.eventName && name == other.name && active == other.active && alwaysFireEvent == other.alwaysFireEvent && calculation == other.calculation && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(code, description, eventName, name, active, alwaysFireEvent, calculation, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{code=$code, description=$description, eventName=$eventName, name=$name, active=$active, alwaysFireEvent=$alwaysFireEvent, calculation=$calculation, version=$version, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is NotificationConfigurationCreateParams && orgId == other.orgId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "NotificationConfigurationCreateParams{orgId=$orgId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
